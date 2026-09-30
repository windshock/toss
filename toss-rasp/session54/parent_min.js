'use strict';
Java.perform(function () {
    try {
        Java.use("java.lang.System").exit.implementation = function (c) { send("[EXIT] System.exit(" + c + ")"); return; };
        Java.use("java.lang.Runtime").exit.overload("int").implementation = function (c) { send("[EXIT] Runtime.exit(" + c + ")"); return; };
        send("[+] exit traps armed (min)");
    } catch (e) { send("[ef] " + e); }
});
