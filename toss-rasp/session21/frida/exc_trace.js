// exc_trace.js — 21차: 모든 SIGSEGV의 PC/FAR/모듈 실시간 매핑
'use strict';

Process.setExceptionHandler(function(details) {
    var line = "[EXC] type=" + details.type + " addr=" + details.address;
    try {
        var m = Process.findModuleByAddress(details.address);
        if (m) line += " (FAR in " + m.name + "+" + (details.address - m.base).toString(16) + ")";
    } catch (e) {}
    send(line);
    try {
        var c = details.context;
        var pc = c.pc;
        var m2 = Process.findModuleByAddress(pc);
        var pcs = m2 ? (m2.name + "+0x" + (pc - m2.base).toString(16)) : ("0x" + pc.toString(16));
        var lr = c.lr ? ("0x" + c.lr.toString(16)) : "?";
        var m3 = Process.findModuleByAddress(c.lr);
        var lrs = m3 ? (m3.name + "+0x" + (c.lr - m3.base).toString(16)) : lr;
        send("    pc=" + pcs + " lr=" + lrs + " sp=0x" + c.sp.toString(16));
        send("    x0=0x" + c.x0.toString(16) + " x1=0x" + c.x1.toString(16) +
             " x2=0x" + c.x2.toString(16) + " x16=0x" + c.x16.toString(16) +
             " x17=0x" + c.x17.toString(16));
    } catch (e) { send("[!] ctx dump fail: " + e); }
    return false;  // 통과 — 앱 핸들러(Bugsnag)가 평소대로 처리
});
send("[+] exception tracer armed");
