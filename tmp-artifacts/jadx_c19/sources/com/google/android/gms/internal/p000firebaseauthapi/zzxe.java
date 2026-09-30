package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzxe implements zzwz<KeyFactory> {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzwz
    public final /* synthetic */ KeyFactory zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
