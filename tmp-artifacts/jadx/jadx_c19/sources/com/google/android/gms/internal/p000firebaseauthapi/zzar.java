package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;
import javax.annotation.CheckForNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzar extends zzaq<Object> {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzaq zzc;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal
    final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal
    final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal
    final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaq
    /* renamed from: zza */
    public final zzaq<Object> subList(int i2, int i3) {
        zzz.zza(i2, i3, this.zzb);
        zzaq zzaqVar = this.zzc;
        int i4 = this.zza;
        return (zzaq) zzaqVar.subList(i2 + i4, i3 + i4);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzz.zza(i2, this.zzb);
        return this.zzc.get(i2 + this.zza);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaq, java.util.List
    public final /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }

    zzar(zzaq zzaqVar, int i2, int i3) {
        this.zzc = zzaqVar;
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzal
    @CheckForNull
    final Object[] zzf() {
        return this.zzc.zzf();
    }
}
