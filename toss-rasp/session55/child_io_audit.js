'use strict';
// Count libc entry points only. /proc/PID/io is sampled separately by the host.
const count = { write: 0, writev: 0, write_chk: 0, syscall_write: 0 };
function watch(name, key, fdArg, syscallNumber) {
    const p = Module.findExportByName(null, name);
    if (!p) { send('[missing] ' + name); return; }
    Interceptor.attach(p, {
        onEnter(args) {
            if (syscallNumber && args[0].toInt32() !== 64) return;
            if (args[fdArg].toInt32() === 1) count[key]++;
        }
    });
    send('[armed] ' + name + '=' + p);
}
watch('write', 'write', 0, false);
watch('writev', 'writev', 0, false);
watch('__write_chk', 'write_chk', 0, false);
watch('syscall', 'syscall_write', 1, true);
send('[child] pid=' + Process.id);
setInterval(function () { send('[counts] ' + JSON.stringify(count)); }, 1000);
