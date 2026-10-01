package com.initech.inibase.logger;

import com.initech.inibase.logger.helpers.Loader;
import com.initech.inibase.logger.helpers.ThreadLocalMap;
import java.util.Hashtable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class MDC {
    private static MDC a = new MDC();
    private boolean b;
    private ThreadLocalMap c;

    private MDC() {
        boolean zIsJava1 = Loader.isJava1();
        this.b = zIsJava1;
        if (zIsJava1) {
            return;
        }
        this.c = new ThreadLocalMap();
    }

    public static Object get(String str) {
        Hashtable hashtable;
        MDC mdc = a;
        if (mdc.b || (hashtable = (Hashtable) mdc.c.get()) == null || str == null) {
            return null;
        }
        return hashtable.get(str);
    }

    public static Hashtable getContext() {
        MDC mdc = a;
        if (mdc.b) {
            return null;
        }
        return (Hashtable) mdc.c.get();
    }

    public static void put(String str, Object obj) {
        MDC mdc = a;
        if (mdc.b) {
            return;
        }
        Hashtable hashtable = (Hashtable) mdc.c.get();
        if (hashtable == null) {
            hashtable = new Hashtable(7);
            mdc.c.set(hashtable);
        }
        hashtable.put(str, obj);
    }

    public static void remove(String str) {
        Hashtable hashtable;
        MDC mdc = a;
        if (mdc.b || (hashtable = (Hashtable) mdc.c.get()) == null) {
            return;
        }
        hashtable.remove(str);
    }
}
