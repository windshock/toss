package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzxd implements zzwz<KeyPairGenerator> {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzwz
    public final /* synthetic */ KeyPairGenerator zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
