package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzakk;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzna<KeyFormatProtoT extends zzakk, KeyProtoT extends zzakk> {
    private final Class<KeyFormatProtoT> zza;

    public zzna(Class<KeyFormatProtoT> cls) {
        this.zza = cls;
    }

    public abstract KeyFormatProtoT zza(zzahm zzahmVar) throws zzajj;

    public abstract KeyProtoT zza(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract void zzb(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
}
