# security-hypothesis-lab

Top-level experiment workflow for security validation work that is still ambiguous.

This repository is a Codex local skill. The skill entrypoint is [`SKILL.md`](./SKILL.md).

## Included

- explicit `fact / premise / hypothesis / conclusion` separation
- compact experiment-loop guidance
- lab-improvement rules for parser, smuggling, cache, race, and DAST work
- conclusion-strength guidance for `target-proven`, `lab-proven`, and `hypothesis-only` claims
- common failure patterns that catch overreach and lab artifacts early

## Release Notes

- See [CHANGELOG.md](./CHANGELOG.md) for the initial release notes.

## Related Skills

- For a concrete execution-layer skill that uses this experiment discipline for parser, smuggling, and visibility retest work, see [`waf-ips-ids-retest`](https://github.com/windshock/waf-ips-ids-retest).

## Use

Copy this folder into your local Codex skills directory as `security-hypothesis-lab`, then trigger it with:

```text
$security-hypothesis-lab
```

Use this skill before domain-specific security skills when the hard part is:

- deciding what is confirmed vs assumed
- choosing the next experiment
- deciding whether to rerun, improve the lab, or downgrade the claim

## Validate

If you have Codex skill tooling available, validate the skill with the standard validator for your environment.
