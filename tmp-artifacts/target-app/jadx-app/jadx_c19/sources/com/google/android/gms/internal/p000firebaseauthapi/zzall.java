package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzall extends zzalt {
    private final /* synthetic */ zzalh zza;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<Object, Object>> iterator() {
        return new zzalj(this.zza);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzall(zzalh zzalhVar) {
        super(zzalhVar);
        this.zza = zzalhVar;
    }
}
