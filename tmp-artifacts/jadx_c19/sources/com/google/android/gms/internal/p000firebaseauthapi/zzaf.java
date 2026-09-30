package com.google.android.gms.internal.p000firebaseauthapi;

import javax.annotation.CheckForNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class zzaf extends zzi<String> {
    final CharSequence zza;
    private final zzj zzb;
    private int zze;
    private int zzd = 0;
    private final boolean zzc = false;

    abstract int zza(int i2);

    abstract int zzb(int i2);

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzi
    @CheckForNull
    protected final /* synthetic */ String zza() {
        int i2 = this.zzd;
        while (true) {
            int i3 = this.zzd;
            if (i3 == -1) {
                zzb();
                return null;
            }
            int iZzb = zzb(i3);
            if (iZzb == -1) {
                iZzb = this.zza.length();
                this.zzd = -1;
            } else {
                this.zzd = zza(iZzb);
            }
            int i4 = this.zzd;
            if (i4 != i2) {
                while (i2 < iZzb && this.zzb.zza(this.zza.charAt(i2))) {
                    i2++;
                }
                while (iZzb > i2 && this.zzb.zza(this.zza.charAt(iZzb - 1))) {
                    iZzb--;
                }
                int i5 = this.zze;
                if (i5 == 1) {
                    iZzb = this.zza.length();
                    this.zzd = -1;
                    while (iZzb > i2 && this.zzb.zza(this.zza.charAt(iZzb - 1))) {
                        iZzb--;
                    }
                } else {
                    this.zze = i5 - 1;
                }
                return this.zza.subSequence(i2, iZzb).toString();
            }
            int i6 = i4 + 1;
            this.zzd = i6;
            if (i6 > this.zza.length()) {
                this.zzd = -1;
            }
        }
    }

    protected zzaf(zzac zzacVar, CharSequence charSequence) {
        this.zzb = zzacVar.zza;
        this.zze = zzacVar.zzd;
        this.zza = charSequence;
    }
}
