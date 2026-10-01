package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzalo implements Comparable<zzalo>, Map.Entry<Object, Object> {
    private final Object zza;
    private Object zzb;
    private final /* synthetic */ zzalh zzc;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzalo zzaloVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzaloVar.getKey());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.zza;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zzc.zzg();
        Object obj2 = this.zzb;
        this.zzb = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.zza) + "=" + String.valueOf(this.zzb);
    }

    zzalo(zzalh zzalhVar, Map.Entry<Object, Object> entry) {
        this(zzalhVar, (Comparable) entry.getKey(), entry.getValue());
    }

    zzalo(zzalh zzalhVar, Object obj, Object obj2) {
        this.zzc = zzalhVar;
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return zza(this.zza, entry.getKey()) && zza(this.zzb, entry.getValue());
    }

    private static boolean zza(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
