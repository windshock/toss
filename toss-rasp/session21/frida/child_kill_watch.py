#!/usr/bin/env python3
"""21차: child gating으로 fork 자식 계측 — kill(parent) 발신자 포착"""
import sys, time
import frida

PACKAGE = "viva.republica.toss"
SECS = int(sys.argv[1]) if len(sys.argv) > 1 else 180

CHILD_JS = r"""
'use strict';
var libc = "libc.so";
["kill", "tgkill", "exit_group"].forEach(function(fn) {});
try {
    Interceptor.attach(Module.getExportByName(libc, "kill"), {
        onEnter: function(args) {
            send("[CHILD kill] target=" + args[0] + " sig=" + args[1] +
                 " mypid=" + Process.id +
                 " bt=" + Thread.backtrace(this.context, Backtracer.FUZZY)
                    .map(DebugSymbol.fromAddress).join(" | "));
        }
    });
    Interceptor.attach(Module.getExportByName(libc, "tgkill"), {
        onEnter: function(args) {
            send("[CHILD tgkill] tgid=" + args[0] + " tid=" + args[1] + " sig=" + args[2]);
        }
    });
} catch (e) { send("[!] hook fail " + e); }
send("[CHILD armed] pid=" + Process.id);
"""

MAIN_JS = r"""
'use strict';
send("[MAIN armed] pid=" + Process.id);
// 메인이 자식을 만들 때 알림
var libc = "libc.so";
try {
    Interceptor.attach(Module.getExportByName(libc, "kill"), {
        onEnter: function(args) {
            send("[MAIN kill] target=" + args[0] + " sig=" + args[1]);
        }
    });
} catch (e) {}
"""

def on_message(msg, data):
    if msg["type"] == "send":
        print("[*] " + str(msg["payload"]), flush=True)
    elif msg["type"] == "error":
        print("[!] " + str(msg.get("description", msg)), flush=True)

def instrument(device, pid, label):
    try:
        session = device.attach(pid)
    except Exception as e:
        print(f"[!] attach {label} {pid} fail: {e}", flush=True)
        return
    try:
        session.enable_child_gating()
    except Exception as e:
        print(f"[!] child gating {pid} fail: {e}", flush=True)
    sc = session.create_script(CHILD_JS if label == "child" else MAIN_JS)
    sc.on("message", on_message)
    sc.load()
    sessions.append(session)

sessions = []
device = frida.get_usb_device(timeout=10)

def on_child_added(child):
    print(f"[child-added] pid={child.pid} path={getattr(child, 'path', '?')}", flush=True)
    instrument(device, child.pid, "child")
    try:
        device.resume(child.pid)
        print(f"[child-resumed] {child.pid}", flush=True)
    except Exception as e:
        print(f"[!] resume {child.pid} fail: {e}", flush=True)

device.on("child-added", on_child_added)

pid = device.spawn([PACKAGE])
print(f"[*] spawned pid={pid}", flush=True)
instrument(device, pid, "main")
device.resume(pid)
print("[*] resumed", flush=True)

deadline = time.time() + SECS
while time.time() < deadline:
    time.sleep(1)
    try:
        device.get_process(PACKAGE)
    except Exception:
        print("[*] process gone", flush=True)
        break
print("[*] done", flush=True)
