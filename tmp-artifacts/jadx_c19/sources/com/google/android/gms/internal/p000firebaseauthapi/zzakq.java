package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzakq<T> implements zzalc<T> {
    private final zzakk zza;
    private final zzamb<?, ?> zzb;
    private final boolean zzc;
    private final zzair<?> zzd;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    public final int zza(T t) {
        zzamb<?, ?> zzambVar = this.zzb;
        int iZzb = zzambVar.zzb(zzambVar.zzd(t));
        return this.zzc ? iZzb + this.zzd.zza(t).zza() : iZzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    public final int zzb(T t) {
        int iHashCode = this.zzb.zzd(t).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t).hashCode() : iHashCode;
    }

    static <T> zzakq<T> zza(zzamb<?, ?> zzambVar, zzair<?> zzairVar, zzakk zzakkVar) {
        return new zzakq<>(zzambVar, zzairVar, zzakkVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    public final T zza() {
        zzakk zzakkVar = this.zza;
        if (zzakkVar instanceof zzaja) {
            return (T) ((zzaja) zzakkVar).zzn();
        }
        return (T) zzakkVar.zzp().zzg();
    }

    private zzakq(zzamb<?, ?> zzambVar, zzair<?> zzairVar, zzakk zzakkVar) {
        this.zzb = zzambVar;
        this.zzc = zzairVar.zza(zzakkVar);
        this.zzd = zzairVar;
        this.zza = zzakkVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    public final void zzc(T t) {
        this.zzb.zzf(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    public final void zza(T t, T t2) {
        zzale.zza(this.zzb, t, t2);
        if (this.zzc) {
            zzale.zza(this.zzd, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    public final void zza(T t, zzald zzaldVar, zzaip zzaipVar) throws IOException {
        boolean zZzt;
        zzamb<?, ?> zzambVar = this.zzb;
        zzair<?> zzairVar = this.zzd;
        Object objZzc = zzambVar.zzc(t);
        zzais<T> zzaisVarZzb = zzairVar.zzb(t);
        while (zzaldVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzaldVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZza = zzairVar.zza(zzaipVar, this.zza, iZzd >>> 3);
                        if (objZza != null) {
                            zzairVar.zza(zzaldVar, objZza, zzaipVar, zzaisVarZzb);
                        } else {
                            zZzt = zzambVar.zza((zzamb<?, ?>) objZzc, zzaldVar);
                        }
                    } else {
                        zZzt = zzaldVar.zzt();
                    }
                    if (!zZzt) {
                        return;
                    }
                } else {
                    Object objZza2 = null;
                    int iZzj = 0;
                    zzahm zzahmVarZzp = null;
                    while (zzaldVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzaldVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzaldVar.zzj();
                            objZza2 = zzairVar.zza(zzaipVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZza2 != null) {
                                zzairVar.zza(zzaldVar, objZza2, zzaipVar, zzaisVarZzb);
                            } else {
                                zzahmVarZzp = zzaldVar.zzp();
                            }
                        } else if (!zzaldVar.zzt()) {
                            break;
                        }
                    }
                    if (zzaldVar.zzd() != 12) {
                        throw zzajj.zzb();
                    }
                    if (zzahmVarZzp != null) {
                        if (objZza2 != null) {
                            zzairVar.zza(zzahmVarZzp, objZza2, zzaipVar, zzaisVarZzb);
                        } else {
                            zzambVar.zza((zzamb<?, ?>) objZzc, iZzj, zzahmVarZzp);
                        }
                    }
                }
            } finally {
                zzambVar.zzb((Object) t, (T) objZzc);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i2, int i3, zzahl zzahlVar) throws IOException {
        zzaja zzajaVar = (zzaja) t;
        zzame zzameVarZzd = zzajaVar.zzb;
        if (zzameVarZzd == zzame.zzc()) {
            zzameVarZzd = zzame.zzd();
            zzajaVar.zzb = zzameVarZzd;
        }
        ((zzaja.zzd) t).zza();
        zzaja.zzf zzfVar = null;
        while (i2 < i3) {
            int iZzc = zzahi.zzc(bArr, i2, zzahlVar);
            int i4 = zzahlVar.zza;
            if (i4 == 11) {
                int i5 = 0;
                zzahm zzahmVar = null;
                while (iZzc < i3) {
                    iZzc = zzahi.zzc(bArr, iZzc, zzahlVar);
                    int i6 = zzahlVar.zza;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (zzfVar != null) {
                                zzaky.zza();
                                throw new NoSuchMethodError();
                            }
                            if (i8 == 2) {
                                iZzc = zzahi.zza(bArr, iZzc, zzahlVar);
                                zzahmVar = (zzahm) zzahlVar.zzc;
                            }
                        }
                        if (i6 != 12) {
                            break;
                        } else {
                            iZzc = zzahi.zza(i6, bArr, iZzc, i3, zzahlVar);
                        }
                    } else if (i8 == 0) {
                        iZzc = zzahi.zzc(bArr, iZzc, zzahlVar);
                        i5 = zzahlVar.zza;
                        zzfVar = (zzaja.zzf) this.zzd.zza(zzahlVar.zzd, this.zza, i5);
                    } else if (i6 != 12) {
                    }
                }
                if (zzahmVar != null) {
                    zzameVarZzd.zza((i5 << 3) | 2, zzahmVar);
                }
                i2 = iZzc;
            } else if ((i4 & 7) == 2) {
                zzfVar = (zzaja.zzf) this.zzd.zza(zzahlVar.zzd, this.zza, i4 >>> 3);
                if (zzfVar != null) {
                    zzaky.zza();
                    throw new NoSuchMethodError();
                }
                i2 = zzahi.zza(i4, bArr, iZzc, i3, zzameVarZzd, zzahlVar);
            } else {
                i2 = zzahi.zza(i4, bArr, iZzc, i3, zzahlVar);
            }
        }
        if (i2 != i3) {
            throw zzajj.zzg();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    public final void zza(T t, zzanb zzanbVar) throws IOException {
        Iterator itZzd = this.zzd.zza(t).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zzaiu zzaiuVar = (zzaiu) entry.getKey();
            if (zzaiuVar.zzc() != zzamy.MESSAGE || zzaiuVar.zze() || zzaiuVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzajn) {
                zzanbVar.zza(zzaiuVar.zza(), (Object) ((zzajn) entry).zza().zzc());
            } else {
                zzanbVar.zza(zzaiuVar.zza(), entry.getValue());
            }
        }
        zzamb<?, ?> zzambVar = this.zzb;
        zzambVar.zza((zzamb<?, ?>) zzambVar.zzd(t), zzanbVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    public final boolean zzb(T t, T t2) {
        if (!this.zzb.zzd(t).equals(this.zzb.zzd(t2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t).equals(this.zzd.zza(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalc
    public final boolean zzd(T t) {
        return this.zzd.zza(t).zzg();
    }
}
