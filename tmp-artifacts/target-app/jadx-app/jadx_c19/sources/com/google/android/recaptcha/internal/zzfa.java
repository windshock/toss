package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.Map;
import kotlin.Pair;
import o.access8100;
import o.getWrite;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzfa {
    public static final zzfa zza = new zzfa();

    private zzfa() {
    }

    public static final Map zza() {
        Map mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(-4, zzl.zzz), getWrite.IAuthTabCallback(-12, zzl.zzA), getWrite.IAuthTabCallback(-6, zzl.zzv), getWrite.IAuthTabCallback(-11, zzl.zzx), getWrite.IAuthTabCallback(-13, zzl.zzB), getWrite.IAuthTabCallback(-14, zzl.zzC), getWrite.IAuthTabCallback(-2, zzl.zzw), getWrite.IAuthTabCallback(-7, zzl.zzD), getWrite.IAuthTabCallback(-5, zzl.zzE), getWrite.IAuthTabCallback(-9, zzl.zzF), getWrite.IAuthTabCallback(-8, zzl.zzP), getWrite.IAuthTabCallback(-15, zzl.zzy), getWrite.IAuthTabCallback(-1, zzl.zzG), getWrite.IAuthTabCallback(-3, zzl.zzI), getWrite.IAuthTabCallback(-10, zzl.zzJ)});
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            mapIAuthTabCallback.put(-16, zzl.zzH);
        }
        if (i2 >= 27) {
            mapIAuthTabCallback.put(1, zzl.zzL);
            mapIAuthTabCallback.put(2, zzl.zzM);
            mapIAuthTabCallback.put(0, zzl.zzN);
            mapIAuthTabCallback.put(3, zzl.zzO);
        }
        if (i2 >= 29) {
            mapIAuthTabCallback.put(4, zzl.zzK);
        }
        return mapIAuthTabCallback;
    }
}
