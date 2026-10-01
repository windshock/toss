package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaik implements zzanb {
    private final zzaii zza;

    public static zzaik zza(zzaii zzaiiVar) {
        zzaik zzaikVar = zzaiiVar.zza;
        return zzaikVar != null ? zzaikVar : new zzaik(zzaiiVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final int zza() {
        return zzana.zza;
    }

    private zzaik(zzaii zzaiiVar) {
        zzaii zzaiiVar2 = (zzaii) zzajc.zza(zzaiiVar, "output");
        this.zza = zzaiiVar2;
        zzaiiVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zza(int i2, boolean z) throws IOException {
        this.zza.zzb(i2, z);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zza(int i2, List<Boolean> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.zza.zzj(i2, 2);
            int iZza = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZza += zzaii.zza(list.get(i4).booleanValue());
            }
            this.zza.zzl(iZza);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzb(i2, list.get(i3).booleanValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zza(int i2, zzahm zzahmVar) throws IOException {
        this.zza.zzc(i2, zzahmVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zza(int i2, List<zzahm> list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zzc(i2, list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zza(int i2, double d) throws IOException {
        this.zza.zzb(i2, d);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzb(int i2, List<Double> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.zza.zzj(i2, 2);
            int iZza = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZza += zzaii.zza(list.get(i4).doubleValue());
            }
            this.zza.zzl(iZza);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzb(i2, list.get(i3).doubleValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    @Deprecated
    public final void zza(int i2) throws IOException {
        this.zza.zzj(i2, 4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zza(int i2, int i3) throws IOException {
        this.zza.zzh(i2, i3);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzc(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.zza.zzj(i2, 2);
            int iZza = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZza += zzaii.zza(list.get(i4).intValue());
            }
            this.zza.zzl(iZza);
            while (i3 < list.size()) {
                this.zza.zzj(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzh(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzb(int i2, int i3) throws IOException {
        this.zza.zzg(i2, i3);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzd(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.zza.zzj(i2, 2);
            int iZzb = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzb += zzaii.zzb(list.get(i4).intValue());
            }
            this.zza.zzl(iZzb);
            while (i3 < list.size()) {
                this.zza.zzi(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzg(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zza(int i2, long j) throws IOException {
        this.zza.zzf(i2, j);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zze(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.zza.zzj(i2, 2);
            int iZza = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZza += zzaii.zza(list.get(i4).longValue());
            }
            this.zza.zzl(iZza);
            while (i3 < list.size()) {
                this.zza.zzf(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzf(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zza(int i2, float f) throws IOException {
        this.zza.zzb(i2, f);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzf(int i2, List<Float> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.zza.zzj(i2, 2);
            int iZza = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZza += zzaii.zza(list.get(i4).floatValue());
            }
            this.zza.zzl(iZza);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzb(i2, list.get(i3).floatValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zza(int i2, Object obj, zzalc zzalcVar) throws IOException {
        zzaii zzaiiVar = this.zza;
        zzaiiVar.zzj(i2, 3);
        zzalcVar.zza((zzalc) obj, (zzanb) zzaiiVar.zza);
        zzaiiVar.zzj(i2, 4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zza(int i2, List<?> list, zzalc zzalcVar) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            zza(i2, list.get(i3), zzalcVar);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzc(int i2, int i3) throws IOException {
        this.zza.zzh(i2, i3);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzg(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.zza.zzj(i2, 2);
            int iZzc = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzc += zzaii.zzc(list.get(i4).intValue());
            }
            this.zza.zzl(iZzc);
            while (i3 < list.size()) {
                this.zza.zzj(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzh(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzb(int i2, long j) throws IOException {
        this.zza.zzh(i2, j);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzh(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.zza.zzj(i2, 2);
            int iZzb = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzb += zzaii.zzb(list.get(i4).longValue());
            }
            this.zza.zzl(iZzb);
            while (i3 < list.size()) {
                this.zza.zzh(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzh(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final <K, V> void zza(int i2, zzakf<K, V> zzakfVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzj(i2, 2);
            this.zza.zzl(zzakc.zza(zzakfVar, entry.getKey(), entry.getValue()));
            zzakc.zza(this.zza, zzakfVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzb(int i2, Object obj, zzalc zzalcVar) throws IOException {
        this.zza.zzc(i2, (zzakk) obj, zzalcVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzb(int i2, List<?> list, zzalc zzalcVar) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzb(i2, list.get(i3), zzalcVar);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zza(int i2, Object obj) throws IOException {
        if (obj instanceof zzahm) {
            this.zza.zzd(i2, (zzahm) obj);
        } else {
            this.zza.zzb(i2, (zzakk) obj);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzd(int i2, int i3) throws IOException {
        this.zza.zzg(i2, i3);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzi(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.zza.zzj(i2, 2);
            int iZze = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZze += zzaii.zze(list.get(i4).intValue());
            }
            this.zza.zzl(iZze);
            while (i3 < list.size()) {
                this.zza.zzi(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzg(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzc(int i2, long j) throws IOException {
        this.zza.zzf(i2, j);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzj(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.zza.zzj(i2, 2);
            int iZzc = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzc += zzaii.zzc(list.get(i4).longValue());
            }
            this.zza.zzl(iZzc);
            while (i3 < list.size()) {
                this.zza.zzf(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzf(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zze(int i2, int i3) throws IOException {
        this.zza.zzi(i2, i3);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzk(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.zza.zzj(i2, 2);
            int iZzf = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzf += zzaii.zzf(list.get(i4).intValue());
            }
            this.zza.zzl(iZzf);
            while (i3 < list.size()) {
                this.zza.zzk(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzi(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzd(int i2, long j) throws IOException {
        this.zza.zzg(i2, j);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzl(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.zza.zzj(i2, 2);
            int iZzd = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzd += zzaii.zzd(list.get(i4).longValue());
            }
            this.zza.zzl(iZzd);
            while (i3 < list.size()) {
                this.zza.zzg(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzg(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    @Deprecated
    public final void zzb(int i2) throws IOException {
        this.zza.zzj(i2, 3);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zza(int i2, String str) throws IOException {
        this.zza.zzb(i2, str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzb(int i2, List<String> list) throws IOException {
        int i3 = 0;
        if (list instanceof zzajq) {
            zzajq zzajqVar = (zzajq) list;
            while (i3 < list.size()) {
                Object objZzb = zzajqVar.zzb(i3);
                if (objZzb instanceof String) {
                    this.zza.zzb(i2, (String) objZzb);
                } else {
                    this.zza.zzc(i2, (zzahm) objZzb);
                }
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzb(i2, list.get(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzf(int i2, int i3) throws IOException {
        this.zza.zzk(i2, i3);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzm(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.zza.zzj(i2, 2);
            int iZzh = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzh += zzaii.zzh(list.get(i4).intValue());
            }
            this.zza.zzl(iZzh);
            while (i3 < list.size()) {
                this.zza.zzl(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzk(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zze(int i2, long j) throws IOException {
        this.zza.zzh(i2, j);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzanb
    public final void zzn(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.zza.zzj(i2, 2);
            int iZze = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZze += zzaii.zze(list.get(i4).longValue());
            }
            this.zza.zzl(iZze);
            while (i3 < list.size()) {
                this.zza.zzh(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzh(i2, list.get(i3).longValue());
            i3++;
        }
    }
}
