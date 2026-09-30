package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzlr implements PrivilegedExceptionAction {
    zzlr() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Object run() throws Exception {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}
