'use strict';

send('[inventory] loaded pid=' + Process.id);
Java.perform(function () {
    var names = [
        'im.toss.selfprotect.DexguardRasp',
        'im.toss.selfprotect.DexguardWrapper',
        'im.toss.selfprotect.DetectType',
        'im.toss.core.guard.AbsAppGuard'
    ];
    names.forEach(function (name) {
        try {
            var cls = Java.use(name);
            var methods = cls.class.getDeclaredMethods();
            send('[class] ' + name + ' methods=' + methods.length);
            for (var i = 0; i < methods.length; i++) {
                send('[method] ' + name + ' ' + methods[i].toString());
            }
        } catch (e) {
            send('[missing] ' + name + ' ' + e);
        }
    });
    send('[inventory] complete');
});
