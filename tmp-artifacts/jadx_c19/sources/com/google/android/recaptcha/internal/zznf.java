package com.google.android.recaptcha.internal;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.material.button.MaterialButton;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zznf extends zzit implements zzkf {
    private static final zznf zzb;
    private int zzd;
    private Object zzf;
    private int zzg;
    private long zzl;
    private zzib zzm;
    private int zzn;
    private zzmr zzo;
    private zznr zzp;
    private zzlj zzr;
    private zzib zzs;
    private int zze = 0;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzq = "";

    static {
        zznf zznfVar = new zznf();
        zzb = zznfVar;
        zzit.zzD(zznf.class, zznfVar);
    }

    private zznf() {
    }

    public static zznf zzH() {
        return zzb;
    }

    public static zznf zzI(byte[] bArr) throws zzje {
        return (zznf) zzit.zzu(zzb, bArr);
    }

    static /* synthetic */ void zzN(zznf zznfVar, zzmr zzmrVar) {
        zznfVar.zzo = zzmrVar;
        zznfVar.zzd |= 2;
    }

    static /* synthetic */ void zzO(zznf zznfVar, zznr zznrVar) {
        zznfVar.zzp = zznrVar;
        zznfVar.zzd |= 4;
    }

    public static zznc zzi() {
        return (zznc) zzb.zzp();
    }

    public final String zzJ() {
        return this.zzi;
    }

    public final String zzK() {
        return this.zzj;
    }

    public final boolean zzT() {
        return (this.zzd & 2) != 0;
    }

    public final int zzU() {
        int i2 = this.zzn;
        int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? 0 : 4 : 3 : 2;
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    @Deprecated
    public final long zzf() {
        return this.zzl;
    }

    public final zzmr zzg() {
        zzmr zzmrVar = this.zzo;
        return zzmrVar == null ? zzmr.zzj() : zzmrVar;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    protected final Object zzh(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzit.zzA(zzb, "\u0000\u000e\u0001\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzi", "zzl", "zzn", "zzo", "zzp", "zzq", "zzj", "zzk", "zzm", "zzr", "zzs", "zzh", zzml.class});
        }
        if (i3 == 3) {
            return new zznf();
        }
        zznb zznbVar = null;
        if (i3 == 4) {
            return new zznc(zznbVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzne zzj() {
        int i2 = this.zzg;
        zzne zzneVar = zzne.zza;
        switch (i2) {
            case 0:
                break;
            case 1:
                zzneVar = zzne.zzb;
                break;
            case 2:
                zzneVar = zzne.zzc;
                break;
            case 3:
                zzneVar = zzne.zzf;
                break;
            case 4:
                zzneVar = zzne.zzg;
                break;
            case 5:
                zzneVar = zzne.zzm;
                break;
            case 6:
                zzneVar = zzne.zzn;
                break;
            case 7:
                zzneVar = zzne.zzo;
                break;
            case 8:
                zzneVar = zzne.zzs;
                break;
            case 9:
                zzneVar = zzne.zzt;
                break;
            case 10:
                zzneVar = zzne.zzu;
                break;
            case 11:
                zzneVar = zzne.zzv;
                break;
            case 12:
                zzneVar = zzne.zzw;
                break;
            case 13:
                zzneVar = zzne.zzx;
                break;
            case 14:
                zzneVar = zzne.zzy;
                break;
            case 15:
                zzneVar = zzne.zzz;
                break;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                zzneVar = zzne.zzA;
                break;
            case 17:
                zzneVar = zzne.zzB;
                break;
            case 18:
                zzneVar = zzne.zzd;
                break;
            case 19:
                zzneVar = zzne.zze;
                break;
            case 20:
                zzneVar = zzne.zzh;
                break;
            case 21:
                zzneVar = zzne.zzi;
                break;
            case 22:
                zzneVar = zzne.zzj;
                break;
            case 23:
                zzneVar = zzne.zzk;
                break;
            case 24:
                zzneVar = zzne.zzl;
                break;
            case 25:
                zzneVar = zzne.zzp;
                break;
            case 26:
                zzneVar = zzne.zzq;
                break;
            case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                zzneVar = zzne.zzr;
                break;
            default:
                zzneVar = null;
                break;
        }
        return zzneVar == null ? zzne.zzC : zzneVar;
    }
}
