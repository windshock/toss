package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzhi implements zzmd {
    private final zzhh zza;

    private zzhi(zzhh zzhhVar) {
        this.zza = zzhhVar;
        zzhhVar.zza = this;
    }

    public static zzhi zza(zzhh zzhhVar) {
        zzhi zzhiVar = zzhhVar.zza;
        return zzhiVar != null ? zzhiVar : new zzhi(zzhhVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzB(int i2, int i3) throws IOException {
        this.zza.zzp(i2, (i3 + i3) ^ (i3 >> 31));
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzD(int i2, long j) throws IOException {
        this.zza.zzr(i2, (j + j) ^ (j >> 63));
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    @Deprecated
    public final void zzF(int i2) throws IOException {
        this.zza.zzo(i2, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzG(int i2, String str) throws IOException {
        this.zza.zzm(i2, str);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzI(int i2, int i3) throws IOException {
        this.zza.zzp(i2, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzK(int i2, long j) throws IOException {
        this.zza.zzr(i2, j);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzb(int i2, boolean z) throws IOException {
        this.zza.zzd(i2, z);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzd(int i2, zzgw zzgwVar) throws IOException {
        this.zza.zze(i2, zzgwVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zze(int i2, List list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zze(i2, (zzgw) list.get(i3));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzf(int i2, double d) throws IOException {
        this.zza.zzh(i2, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    @Deprecated
    public final void zzh(int i2) throws IOException {
        this.zza.zzo(i2, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzi(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzk(int i2, int i3) throws IOException {
        this.zza.zzf(i2, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzm(int i2, long j) throws IOException {
        this.zza.zzh(i2, j);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzo(int i2, float f) throws IOException {
        this.zza.zzf(i2, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzq(int i2, Object obj, zzkr zzkrVar) throws IOException {
        zzhh zzhhVar = this.zza;
        zzhhVar.zzo(i2, 3);
        zzkrVar.zzj((zzke) obj, zzhhVar.zza);
        zzhhVar.zzo(i2, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzr(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzt(int i2, long j) throws IOException {
        this.zza.zzr(i2, j);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzv(int i2, Object obj, zzkr zzkrVar) throws IOException {
        zzke zzkeVar = (zzke) obj;
        zzhe zzheVar = (zzhe) this.zza;
        zzheVar.zzq((i2 << 3) | 2);
        zzheVar.zzq(((zzgf) zzkeVar).zza(zzkrVar));
        zzkrVar.zzj(zzkeVar, zzheVar.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzw(int i2, Object obj) throws IOException {
        if (obj instanceof zzgw) {
            zzhe zzheVar = (zzhe) this.zza;
            zzheVar.zzq(11);
            zzheVar.zzp(2, i2);
            zzheVar.zze(3, (zzgw) obj);
            zzheVar.zzq(12);
            return;
        }
        zzhh zzhhVar = this.zza;
        zzke zzkeVar = (zzke) obj;
        zzhe zzheVar2 = (zzhe) zzhhVar;
        zzheVar2.zzq(11);
        zzheVar2.zzp(2, i2);
        zzheVar2.zzq(26);
        zzheVar2.zzq(zzkeVar.zzn());
        zzkeVar.zze(zzhhVar);
        zzheVar2.zzq(12);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzx(int i2, int i3) throws IOException {
        this.zza.zzf(i2, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzz(int i2, long j) throws IOException {
        this.zza.zzh(i2, j);
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzH(int i2, List list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjm)) {
            while (i3 < list.size()) {
                this.zza.zzm(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zzjm zzjmVar = (zzjm) list;
        while (i3 < list.size()) {
            Object objZzf = zzjmVar.zzf(i3);
            if (objZzf instanceof String) {
                this.zza.zzm(i2, (String) objZzf);
            } else {
                this.zza.zze(i2, (zzgw) objZzf);
            }
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzJ(int i2, List list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzp(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int iZzy = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzy += zzhh.zzy(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzq(iZzy);
        while (i3 < list.size()) {
            this.zza.zzq(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzL(int i2, List list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzr(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int iZzz = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzz += zzhh.zzz(((Long) list.get(i4)).longValue());
        }
        this.zza.zzq(iZzz);
        while (i3 < list.size()) {
            this.zza.zzs(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzc(int i2, List list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzd(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4++;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzl(int i2, List list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzf(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += 4;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzg(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzn(int i2, List list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += 8;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzi(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzs(int i2, List list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzj(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int iZzu = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzu += zzhh.zzu(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzq(iZzu);
        while (i3 < list.size()) {
            this.zza.zzk(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzA(int i2, List list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += 8;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzi(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzC(int i2, List list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzhh zzhhVar = this.zza;
                int iIntValue = ((Integer) list.get(i3)).intValue();
                zzhhVar.zzp(i2, (iIntValue + iIntValue) ^ (iIntValue >> 31));
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int iZzy = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            iZzy += zzhh.zzy((iIntValue2 + iIntValue2) ^ (iIntValue2 >> 31));
        }
        this.zza.zzq(iZzy);
        while (i3 < list.size()) {
            zzhh zzhhVar2 = this.zza;
            int iIntValue3 = ((Integer) list.get(i3)).intValue();
            zzhhVar2.zzq((iIntValue3 + iIntValue3) ^ (iIntValue3 >> 31));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzE(int i2, List list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzhh zzhhVar = this.zza;
                long jLongValue = ((Long) list.get(i3)).longValue();
                zzhhVar.zzr(i2, (jLongValue + jLongValue) ^ (jLongValue >> 63));
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int iZzz = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue2 = ((Long) list.get(i4)).longValue();
            iZzz += zzhh.zzz((jLongValue2 + jLongValue2) ^ (jLongValue2 >> 63));
        }
        this.zza.zzq(iZzz);
        while (i3 < list.size()) {
            zzhh zzhhVar2 = this.zza;
            long jLongValue3 = ((Long) list.get(i3)).longValue();
            zzhhVar2.zzs((jLongValue3 + jLongValue3) ^ (jLongValue3 >> 63));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzg(int i2, List list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += 8;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzj(int i2, List list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzj(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int iZzu = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzu += zzhh.zzu(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzq(iZzu);
        while (i3 < list.size()) {
            this.zza.zzk(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzp(int i2, List list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzf(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += 4;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzu(int i2, List list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzr(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int iZzz = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzz += zzhh.zzz(((Long) list.get(i4)).longValue());
        }
        this.zza.zzq(iZzz);
        while (i3 < list.size()) {
            this.zza.zzs(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmd
    public final void zzy(int i2, List list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.zza.zzf(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzo(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += 4;
        }
        this.zza.zzq(i4);
        while (i3 < list.size()) {
            this.zza.zzg(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }
}
