import frida, sys, time
REMOTE="127.0.0.1:27045"; PKG="viva.republica.toss"
SCRIPT=open("/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts/hook_proptrace.js").read()
KEEP=int(sys.argv[1]) if len(sys.argv)>1 else 90
import base64 as _b64
def om(m,d):
    if m.get("type")=="send":
        p=m["payload"]
        if p.get("ev")=="dexchunk" and d is not None:
            print("[DEXC] %s %d/%d b64=%s" % (p["tag"], p["off"], p["total"], _b64.b64encode(d).decode()), flush=True)
        else:
            print("[*]",p,flush=True)
    elif m.get("type")=="error": print("[!]",m.get("description"),flush=True)
dev=frida.get_device_manager().add_remote_device(REMOTE)
pid=dev.spawn([PKG])
print("[+] spawned pid=%d"%pid,flush=True)
s=dev.attach(pid)
sc=s.create_script(SCRIPT); sc.on("message",om); sc.load()
print("[+] script loaded, resuming",flush=True)
dev.resume(pid)
def on_detached(reason, crash):
    print("[!!!] session detached: reason=%s crash=%s"%(reason,crash),flush=True)
s.on("detached", on_detached)
t0=time.time()
while time.time()-t0<KEEP:
    time.sleep(0.5)
print("[+] %ds elapsed, detaching"%KEEP)
