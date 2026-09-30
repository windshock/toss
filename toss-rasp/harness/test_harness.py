#!/usr/bin/env python3
"""Offline regression tests; never starts the emulator or clears device logs."""

import json
import os
from pathlib import Path
import shutil
import tempfile
import unittest
from contextlib import redirect_stdout
from io import StringIO
from unittest.mock import patch

import hns
import parse_run


def event(name, value=None, params=None):
    return {"log_name": name, "value": value, "params": params or {}}


class HarnessTests(unittest.TestCase):
    def setUp(self):
        self.tmp = tempfile.TemporaryDirectory()
        self.addCleanup(self.tmp.cleanup)
        self.rd = Path(self.tmp.name) / "20260927-010101-test"
        (self.rd / "stacks").mkdir(parents=True)
        (self.rd / "logstore_snapshots").mkdir()
        (self.rd / "lkm_params.txt").write_text("maps_filter=1\ntarget_uids=10178\ngd_calls=9\n")
        (self.rd / "timeline.txt").write_text(
            "t+1s pid=123 top=viva.republica.toss/.splash.SplashActivity exits=0\n"
        )
        (self.rd / "logcat.txt").write_text(
            "09-27 01:01:01.000 I/ActivityManager( 549): "
            "Start proc 123:viva.republica.toss/u0a178 for next-top-activity\n"
        )

    def observations(self, rows):
        self.rd.joinpath("process_observations.tsv").write_text(
            "poll\tepoch\tpid\tstarttime_ticks\n" +
            "".join(f"{poll}\t{epoch}\t{pid}\t{ticks}\n" for poll, epoch, pid, ticks in rows)
        )

    def snapshots(self, *snapshots):
        self.rd.joinpath("snapshot_status.tsv").write_text(
            "poll\tepoch\tstatus\tfile\n" +
            "".join(f"{i}\t{1000+i}\tok\tt{i:04d}.txt\n" for i in range(1, len(snapshots)+1))
        )
        for i, items in enumerate(snapshots, 1):
            self.rd.joinpath("logstore_snapshots", f"t{i:04d}.txt").write_text(
                "".join(json.dumps(x) + "\n" for x in items)
            )

    def parse(self, win=2, params=""):
        with patch.dict(os.environ, {"HNS_OFFLINE": "1"}):
            return parse_run.parse_run(
                self.rd, 1000.0, 1003.0, "test", params,
                win=win, stacks_requested=1, reboot=False, fresh=False,
                app_uid="10178", launch_ok=True,
            )

    def test_positive_uses_later_original_snapshot_and_incarnation(self):
        self.observations([(1, 1001, "123", "918282"), (2, 1002, "123", "918282")])
        created = event("process_created", "viva.republica.toss (123)")
        callback = event("fds_debug", "raspEmulatorCallback detected", {"debugInfo": "34359738558"})
        self.snapshots(
            [created, callback],
            [created, event("fds_debug", "postRaspResult", {"detected": "emulator", "guardLevel": "LOW"})],
        )
        (self.rd / "maps.txt").write_text("mapping\n")
        (self.rd / "maps_identity.tsv").write_text("123\t918282\n")
        (self.rd / "stacks" / "t2s_pid123_start918282.txt").write_text(
            '"Thread-A" daemon prio=5 tid=1 Native\n  | sysTid=456\n'
            '  native: #03 pc 00000000000aa6a4 /x/libea56.so\n'
            '  native: #04 pc 00000000000b02c4 /x/libea56.so\n'
            '"Thread-B" daemon prio=5 tid=2 Native\n  | sysTid=789\n'
            '  native: #02 pc 000000000013a4bc /x/libea56.so\n'
        )
        meta, verdict = self.parse()
        self.assertEqual(meta["launch_pid"], "123")
        self.assertEqual(meta["process_sessions"][0]["starttime_ticks"], "918282")
        self.assertEqual(verdict["verdict_state"], "DETECTED")
        self.assertEqual(verdict["guardLevel"], "LOW")
        self.assertEqual(verdict["raspEmulatorCallback"], "34359738558")
        self.assertEqual(verdict["capture_quality"]["logstore_snapshot_count"], 2)
        self.assertEqual(verdict["capture_quality"]["maps_pid_matches_session"], True)
        self.assertEqual(verdict["capture_quality"]["stack_samples_launched"], 1)
        self.assertEqual(verdict["capture_quality"]["stack_samples_completed"], 1)
        self.assertTrue(verdict["capture_quality"]["stack_sampling_complete"])
        self.assertEqual(len(verdict["libea56_thread_frame_groups"]), 2)
        self.assertEqual(verdict["libea56_thread_frame_groups"][0]["frames"], ["0xaa6a4", "0xb02c4"])
        self.assertEqual(verdict["top_activities"], ["viva.republica.toss/.splash.SplashActivity"])

    def test_missing_capture_is_inconclusive_not_negative(self):
        self.observations([(1, 1001, "123", "918282"), (2, 1002, "123", "918282")])
        self.snapshots([], [])
        _, verdict = self.parse()
        self.assertEqual(verdict["verdict_state"], "INCONCLUSIVE")
        self.assertIsNone(verdict["emulator_detected"])
        self.assertFalse(verdict["capture_quality"]["logstore_captured"])
        self.assertFalse(verdict["capture_quality"]["stack_sampling_complete"])

    def test_restart_never_relabels_second_process_as_launch(self):
        self.rd.joinpath("logcat.txt").write_text(
            self.rd.joinpath("logcat.txt").read_text() +
            "09-27 01:01:03.000 I/ActivityManager( 549): "
            "Start proc 456:viva.republica.toss/u0a178 for next-top-activity\n"
        )
        self.observations([(1, 1001, "123", "918282"), (2, 1002, "456", "919103")])
        self.snapshots(
            [event("process_created", "viva.republica.toss (123)"),
             event("fds_debug", "raspEmulatorCallback detected", {"debugInfo": "34359738558"})],
            [event("process_created", "viva.republica.toss (456)")],
        )
        meta, verdict = self.parse()
        self.assertEqual(meta["launch_pid"], "123")
        self.assertEqual(len(meta["process_sessions"]), 2)
        self.assertEqual(verdict["capture_quality"]["restart_count"], 1)
        self.assertEqual(verdict["verdict_state"], "CONTAMINATED")
        self.assertTrue(verdict["emulator_observed"])
        self.assertIsNone(verdict["emulator_detected"])

    def test_full_observed_window_can_be_negative(self):
        self.observations([(1, 1001, "123", "918282"), (2, 1002, "123", "918282")])
        created = event("process_created", "viva.republica.toss (123)")
        negative = event("fds_debug", "postRaspResult", {"detected": "none"})
        self.snapshots([created], [created, negative])
        _, verdict = self.parse()
        self.assertEqual(verdict["verdict_state"], "NOT_DETECTED")
        self.assertIs(verdict["emulator_detected"], False)

    def test_absence_of_callback_even_with_complete_samples_is_inconclusive(self):
        self.observations([(1, 1001, "123", "918282"), (2, 1002, "123", "918282")])
        created = event("process_created", "viva.republica.toss (123)")
        self.snapshots([created], [created])
        _, verdict = self.parse()
        self.assertEqual(verdict["verdict_state"], "INCONCLUSIVE")

    def test_later_positive_fds_event_overrides_earlier_non_emulator_event(self):
        self.observations([(1, 1001, "123", "918282"), (2, 1002, "123", "918282")])
        created = event("process_created", "viva.republica.toss (123)")
        negative = event("fds_detected", None, {"result": "[]"})
        positive = event("fds_detected", None, {"result": "[EMULATOR]"})
        self.snapshots([created, negative], [created, negative, positive])
        _, verdict = self.parse()
        self.assertEqual(verdict["verdict_state"], "DETECTED")
        self.assertEqual(verdict["fds_results"], ["[]", "[EMULATOR]"])
        self.assertEqual(verdict["fds_result"], "[EMULATOR]")

    def test_hypotheses_excludes_invalid_and_distinguishes_mixed(self):
        runs = Path(self.tmp.name) / "runs"
        runs.mkdir()
        cases = [
            ("baseline", "DETECTED"),
            ("maps_filter=0", "DETECTED"),
            ("maps_filter=0", "NOT_DETECTED"),
            ("mrs_spoof=1", "INCONCLUSIVE"),
            ("ioctl_log=1", "CONTAMINATED"),
            ("segv_recover=0", "DETECTED"),
            ("mrs_spoof=0", "NOT_DETECTED"),
            ("maps_off=1", "NOT_DETECTED"),
            ("maps_off=1", "INCONCLUSIVE"),
        ]
        for i, (params, state) in enumerate(cases):
            rd = runs / f"20260927-01010{i}-test"
            rd.mkdir()
            rd.joinpath("meta.json").write_text(json.dumps({"params": "" if params == "baseline" else params}))
            rd.joinpath("verdict.json").write_text(json.dumps({
                "verdict_state": state,
                "capture_quality": {"evidence_valid": state in ("DETECTED", "NOT_DETECTED")},
            }))
        with patch.object(hns, "RUNS", str(runs)):
            results = {key: status for key, status, _ in hns.hypothesis_rows()}
        self.assertEqual(results["baseline"], "BASELINE")
        self.assertEqual(results["maps_filter=0"], "MIXED")
        self.assertEqual(results["mrs_spoof=1"], "INCONCLUSIVE")
        self.assertEqual(results["ioctl_log=1"], "CONFOUNDED")
        self.assertEqual(results["segv_recover=0"], "REFUTED")
        self.assertEqual(results["mrs_spoof=0"], "SUPPORTED (in observed window)")
        self.assertEqual(results["maps_off=1"], "INCONCLUSIVE")

    def test_existing_legacy_run_keeps_observation_but_not_valid_verdict(self):
        legacy = Path(__file__).resolve().parent.parent / "runs/20260927-164114-baseline"
        if not legacy.is_dir():
            self.skipTest("saved 2026-09-27 run is not present")
        for name in ("logcat.txt", "logstore_raw.txt", "timeline.txt", "lkm_params.txt", "maps.txt"):
            shutil.copy2(legacy / name, self.rd / name)
        with patch.dict(os.environ, {"HNS_OFFLINE": "1"}):
            meta, verdict = parse_run.parse_run(self.rd, 1000, 1016, "legacy", "")
        self.assertEqual(meta["launch_pid"], "11808")
        self.assertTrue(verdict["emulator_observed"])
        self.assertEqual(verdict["verdict_state"], "INCONCLUSIVE")
        self.assertIsNone(verdict["emulator_detected"])

    def test_compare_separates_declared_intervention_from_parameter_drift(self):
        runs = Path(self.tmp.name) / "runs"
        runs.mkdir()
        common_verdict = {"verdict_state": "DETECTED", "capture_quality": {"evidence_valid": True}}
        for name, params, lkm in (
            ("20260927-010101-control", "", {"maps_filter": "1", "mrs_spoof": "0"}),
            ("20260927-010102-treatment", "maps_filter=0", {"maps_filter": "0", "mrs_spoof": "0"}),
        ):
            run = runs / name
            run.mkdir()
            (run / "meta.json").write_text(json.dumps({"params": params, "lkm_params": lkm}))
            (run / "verdict.json").write_text(json.dumps(common_verdict))
        with patch.object(hns, "RUNS", str(runs)), redirect_stdout(StringIO()) as output:
            hns.cmd_compare("control", "treatment")
        self.assertIn("declared intervention keys: maps_filter", output.getvalue())
        self.assertNotIn("undeclared LKM drift", output.getvalue())


if __name__ == "__main__":
    unittest.main()
