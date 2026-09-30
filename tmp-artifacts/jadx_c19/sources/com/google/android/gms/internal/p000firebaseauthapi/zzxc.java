package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzxc implements zzwz<Cipher> {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzwz
    public final /* synthetic */ Cipher zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
