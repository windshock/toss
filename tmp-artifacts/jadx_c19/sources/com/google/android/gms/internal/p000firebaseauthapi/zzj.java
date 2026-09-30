package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzj {
    public int zza(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        zzz.zza(i2, length, "index");
        while (i2 < length) {
            if (zza(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public abstract boolean zza(char c);

    protected zzj() {
    }
}
