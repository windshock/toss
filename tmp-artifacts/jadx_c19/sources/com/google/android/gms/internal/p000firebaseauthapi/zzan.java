package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zzan<E> {
    static int zza(int i2, int i3) {
        if (i3 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i2 + (i2 >> 1) + 1;
        if (iHighestOneBit < i3) {
            iHighestOneBit = Integer.highestOneBit(i3 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    zzan() {
    }
}
