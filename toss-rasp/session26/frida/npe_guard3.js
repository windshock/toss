'use strict';
var DIRP = "/data/data/viva.republica.toss/";
function mark(n, e) { try { var f = new File(DIRP+n,"w"); f.write(""+Date.now()+" "+(e||"")+"\n"); f.close(); } catch(x){} }
Java.perform(function () {
    send("[+] npe_guard3 VM");
    var Exc = Java.use("java.lang.Exception");
    function stack(tag) {
        try {
            var st = Exc.$new().getStackTrace();
            var L = []; for (var i=0;i<st.length && i<14;i++) L.push("    "+st[i].toString());
            send(tag+"\n"+L.join("\n"));
        } catch(e){ send(tag+" [sf]"); }
    }
    var CW = Java.use("android.content.ContextWrapper");
    CW.isRestricted.implementation = function () {
        var b = this.mBase.value;
        if (b === null || b === undefined) {
            send("[HIT] isRestricted mBase=null → false(NPE 차단)");
            stack("[caller]");
            mark(".ng3_hit");
            return false;
        }
        return b.isRestricted();
    };
    send("[OK] isRestricted 후크 장착");
    try {
        var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function(c){ send("[EXIT] System.exit("+c+") BLOCKED"); return; };
        var Rt = Java.use("java.lang.Runtime");
        Rt.exit.overload("int").implementation = function(c){ send("[EXIT] Runtime.exit("+c+") BLOCKED"); return; };
        send("[OK] exit 차단");
    } catch(e){ send("[exit fail] "+e); }
    mark(".ng3_load");
    send("[+] armed");
});
