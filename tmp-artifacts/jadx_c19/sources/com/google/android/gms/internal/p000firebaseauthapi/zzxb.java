package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzxb implements zzwz<KeyAgreement> {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzwz
    public final /* synthetic */ KeyAgreement zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
