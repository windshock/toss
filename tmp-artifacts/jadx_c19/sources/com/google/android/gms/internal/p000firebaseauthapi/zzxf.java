package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzxf implements zzwz<MessageDigest> {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzwz
    public final /* synthetic */ MessageDigest zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, provider);
    }
}
