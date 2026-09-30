package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.SecureRandom;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzou extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SecureRandom initialValue() {
        return zzov.zza();
    }

    zzou() {
    }
}
