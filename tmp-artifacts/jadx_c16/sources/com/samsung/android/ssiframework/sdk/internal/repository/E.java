package com.samsung.android.ssiframework.sdk.internal.repository;

import com.samsung.android.ssiframework.sdk.config.SsiServerLevel;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract /* synthetic */ class E {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SsiServerLevel.values().length];
        try {
            iArr[SsiServerLevel.STG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SsiServerLevel.PRD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
