// hook_hdr.js — §188: X-Toss-Tsn 헤더 생성 시점 + 호출 스택 캡처 (파생 클래스 특정)
'use strict';
Java.perform(function () {
    try { var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function (code) { send("[EXIT] System.exit(" + code + ") BLOCKED"); return; };
    } catch(e) {}

    setTimeout(function(){ Java.perform(function(){
        Java.enumerateClassLoaders({
            onMatch: function(loader){
                try {
                    loader.findClass("okhttp3.Request$Builder");
                    var CF = Java.ClassFactory.get(loader);
                    var B = CF.use("okhttp3.Request$Builder");
                    ["header", "addHeader"].forEach(function (m) {
                        B[m].overload("java.lang.String", "java.lang.String").implementation = function (name, value) {
                            try {
                                if (name !== null && name.indexOf("X-Toss-T") === 0) {
                                    var stack = Java.use("java.lang.Thread").currentThread().getStackTrace();
                                    var frames = "";
                                    for (var i = 2; i < Math.min(stack.length, 14); i++) {
                                        var f = stack[i];
                                        frames += f.getClassName() + "." + f.getMethodName() + "(" + f.getLineNumber() + ") <- ";
                                    }
                                    send("[HDR] " + name + " = " + value + "\n    stack: " + frames);
                                }
                            } catch(e) { send("[HDR-ERR] " + e); }
                            return this[m](name, value);
                        };
                    });
                    send("[+] header builder armed");
                } catch(e) { send("[!] " + e); }
            },
            onComplete: function(){ send("[+] loader enumeration done"); }
        });
    });}, 1200);
});
