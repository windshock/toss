import sys, time, frida
PID = int(sys.argv[1]); SCRIPT = sys.argv[2]; SECS = int(sys.argv[3])
def on_message(m, d):
    if m["type"] == "send": print("[*] " + str(m["payload"]), flush=True)
    elif m["type"] == "error": print("[!] " + m.get("description",""), flush=True)
dev = frida.get_usb_device(timeout=10)
s = dev.attach(PID)
sc = s.create_script(open(SCRIPT).read()); sc.on("message", on_message); sc.load()
print("[*] loaded", flush=True)
deadline = time.time() + SECS
while time.time() < deadline:
    try:
        r = sc.exports_sync.scan()
        if r and (r["nullBase"] or r["patched"]):
            print("[scan] %s" % r, flush=True)
    except Exception as e:
        print("[scan err] %s" % e, flush=True); break
    time.sleep(0.7)
print("[*] done", flush=True)
