package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.material.button.MaterialButton;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaig implements zzald {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final zzaib zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private static char[] onExtraCallback = {64986, 64977, 64963, 64991, 64988, 64966, 64989, 64967, 64990};
    private static char IAuthTabCallback = 51242;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final double zza() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        zzb(1);
        double dZza = this.zza.zza();
        int i5 = onWarmupCompleted + 105;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return dZza;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final float zzb() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        zzb(5);
        float fZzb = this.zza.zzb();
        int i5 = onWarmupCompleted + 41;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return fZzb;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final int zzc() throws IOException {
        int i2 = 2 % 2;
        int i3 = this.zzd;
        if (i3 != 0) {
            this.zzb = i3;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i4 = this.zzb;
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        int i5 = onWarmupCompleted + 105;
        int i6 = i5 % 128;
        onNavigationEvent = i6;
        if (i5 % 2 != 0) {
            int i7 = 71 / 0;
            if (i4 == this.zzc) {
                return Integer.MAX_VALUE;
            }
        } else if (i4 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        int i8 = i4 >>> 3;
        int i9 = i6 + 95;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final int zzd() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.zzb;
        int i7 = i3 + 47;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 15 / 0;
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final int zze() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 23;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            zzb(1);
        } else {
            zzb(0);
        }
        int iZzd = this.zza.zzd();
        int i4 = onNavigationEvent + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return iZzd;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final int zzf() throws IOException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        zzb(5);
        int iZze = this.zza.zze();
        int i5 = onWarmupCompleted + 3;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return iZze;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final int zzg() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        onWarmupCompleted = i3 % 128;
        zzb(i3 % 2 == 0 ? 1 : 0);
        int iZzf = this.zza.zzf();
        int i4 = onNavigationEvent + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iZzf;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final int zzh() throws IOException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 109;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        zzb(5);
        int iZzg = this.zza.zzg();
        int i5 = onNavigationEvent + 109;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return iZzg;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final int zzi() throws IOException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        zzb(0);
        int iZzh = this.zza.zzh();
        int i5 = onWarmupCompleted + 73;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return iZzh;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final int zzj() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 37;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        zzb(0);
        int iZzj = this.zza.zzj();
        int i5 = onWarmupCompleted + 123;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return iZzj;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final long zzk() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 17;
        onWarmupCompleted = i3 % 128;
        zzb(i3 % 2 == 0 ? 0 : 1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final long zzl() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        onWarmupCompleted = i3 % 128;
        zzb(i3 % 2 == 0 ? 1 : 0);
        long jZzl = this.zza.zzl();
        int i4 = onNavigationEvent + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return jZzl;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final long zzm() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        zzb(1);
        long jZzn = this.zza.zzn();
        int i5 = onWarmupCompleted + 47;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return jZzn;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final long zzn() throws IOException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        zzb(0);
        long jZzo = this.zza.zzo();
        int i5 = onWarmupCompleted + 25;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return jZzo;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final long zzo() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        zzb(0);
        long jZzp = this.zza.zzp();
        int i5 = onNavigationEvent + 111;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return jZzp;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final zzahm zzp() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 1;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        zzb(2);
        zzahm zzahmVarZzq = this.zza.zzq();
        int i5 = onNavigationEvent + 79;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return zzahmVarZzq;
        }
        throw null;
    }

    public static zzaig zza(zzaib zzaibVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        zzaig zzaigVar = zzaibVar.zzd;
        if (zzaigVar != null) {
            int i5 = onNavigationEvent + 69;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return zzaigVar;
        }
        zzaig zzaigVar2 = new zzaig(zzaibVar);
        int i7 = onWarmupCompleted + 99;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return zzaigVar2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object zza(zzamo zzamoVar, Class<?> cls, zzaip zzaipVar) throws IOException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 33;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
            switch (zzaij.zza[zzamoVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(zzs());
                case 2:
                    return zzp();
                case 3:
                    Double dValueOf = Double.valueOf(zza());
                    int i5 = onWarmupCompleted + 83;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        return dValueOf;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                case 4:
                    return Integer.valueOf(zze());
                case 5:
                    return Integer.valueOf(zzf());
                case 6:
                    return Long.valueOf(zzk());
                case 7:
                    return Float.valueOf(zzb());
                case 8:
                    return Integer.valueOf(zzg());
                case 9:
                    Long lValueOf = Long.valueOf(zzl());
                    int i6 = onNavigationEvent + 7;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    return lValueOf;
                case 10:
                    zzb(2);
                    return zzb(zzaky.zza().zza((Class) cls), zzaipVar);
                case 11:
                    Integer numValueOf = Integer.valueOf(zzh());
                    int i8 = onWarmupCompleted + 67;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    return numValueOf;
                case 12:
                    return Long.valueOf(zzm());
                case 13:
                    return Integer.valueOf(zzi());
                case 14:
                    return Long.valueOf(zzn());
                case 15:
                    return zzr();
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    return Integer.valueOf(zzj());
                case 17:
                    return Long.valueOf(zzo());
                default:
                    throw new IllegalArgumentException("unsupported field type.");
            }
        }
        switch (zzaij.zza[zzamoVar.ordinal()]) {
        }
    }

    private final <T> T zza(zzalc<T> zzalcVar, zzaip zzaipVar) throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            T tZza = zzalcVar.zza();
            zzc(tZza, zzalcVar, zzaipVar);
            zzalcVar.zzc(tZza);
            return tZza;
        }
        T tZza2 = zzalcVar.zza();
        zzc(tZza2, zzalcVar, zzaipVar);
        zzalcVar.zzc(tZza2);
        throw null;
    }

    private final <T> T zzb(zzalc<T> zzalcVar, zzaip zzaipVar) throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 117;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            T tZza = zzalcVar.zza();
            zzd(tZza, zzalcVar, zzaipVar);
            zzalcVar.zzc(tZza);
            int i4 = onNavigationEvent + 1;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 6 / 0;
            }
            return tZza;
        }
        T tZza2 = zzalcVar.zza();
        zzd(tZza2, zzalcVar, zzaipVar);
        zzalcVar.zzc(tZza2);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final String zzq() throws IOException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            zzb(4);
        } else {
            zzb(2);
        }
        String strZzr = this.zza.zzr();
        int i4 = onWarmupCompleted + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return strZzr;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final String zzr() throws IOException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        zzb(2);
        String strZzs = this.zza.zzs();
        int i5 = onNavigationEvent + 41;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return strZzs;
    }

    private zzaig(zzaib zzaibVar) throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{3, 0, 5, '\b', 13859}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 53), 5 - KeyEvent.keyCodeFromString(""), objArr);
        zzaib zzaibVar2 = (zzaib) zzajc.zza(zzaibVar, ((String) objArr[0]).intern());
        this.zza = zzaibVar2;
        zzaibVar2.zzd = this;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final <T> void zza(T t, zzalc<T> zzalcVar, zzaip zzaipVar) throws IOException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 109;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        zzb(3);
        zzc(t, zzalcVar, zzaipVar);
        int i5 = onWarmupCompleted + 33;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r3.zzb == r3.zzc) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r3.zzc = r1;
        r4 = com.google.android.gms.internal.p000firebaseauthapi.zzaig.onWarmupCompleted + 95;
        com.google.android.gms.internal.p000firebaseauthapi.zzaig.onNavigationEvent = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if ((r4 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        r4 = 37 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        throw com.google.android.gms.internal.p000firebaseauthapi.zzajj.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r3.zzb == r3.zzc) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> void zzc(T t, zzalc<T> zzalcVar, zzaip zzaipVar) throws IOException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 105;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (i4 != 0) {
                i4 = this.zzc;
                this.zzc = ((this.zzb >>> 3) - 5) | 3;
                zzalcVar.zza(t, this, zzaipVar);
            } else {
                i4 = this.zzc;
                this.zzc = ((this.zzb >>> 3) << 3) | 4;
                zzalcVar.zza(t, this, zzaipVar);
            }
        } catch (Throwable th) {
            this.zzc = i4;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final <T> void zzb(T t, zzalc<T> zzalcVar, zzaip zzaipVar) throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 47;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        zzb(2);
        zzd(t, zzalcVar, zzaipVar);
        int i5 = onNavigationEvent + 57;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        throw new com.google.android.gms.internal.p000firebaseauthapi.zzajj("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r3.zza < r3.zzb) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r3.zza < r3.zzb) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r4 = com.google.android.gms.internal.p000firebaseauthapi.zzaig.onWarmupCompleted + 31;
        com.google.android.gms.internal.p000firebaseauthapi.zzaig.onNavigationEvent = r4 % 128;
        r4 = r4 % 2;
        r0 = r3.zza(r1);
        r7.zza.zza++;
        r9.zza(r8, r7, r10);
        r7.zza.zzb(0);
        r8.zza--;
        r7.zza.zzc(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> void zzd(T t, zzalc<T> zzalcVar, zzaip zzaipVar) throws IOException {
        int iZzj;
        zzaib zzaibVar;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            iZzj = this.zza.zzj();
            zzaibVar = this.zza;
            int i4 = 15 / 0;
        } else {
            iZzj = this.zza.zzj();
            zzaibVar = this.zza;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final void zza(List<Boolean> list) throws IOException {
        int iZzi;
        int iZzi2;
        int i2 = 2 % 2;
        if (list instanceof zzahk) {
            zzahk zzahkVar = (zzahk) list;
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzajj.zza();
                }
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzahkVar.zza(this.zza.zzu());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            do {
                zzahkVar.zza(this.zza.zzu());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            int i4 = onWarmupCompleted + 69;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 == 0) {
            do {
                list.add(Boolean.valueOf(this.zza.zzu()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        int i6 = onWarmupCompleted;
        int i7 = i6 + 25;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        if (i5 != 2) {
            throw zzajj.zza();
        }
        int i9 = i6 + 105;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            list.add(Boolean.valueOf(this.zza.zzu()));
        } while (this.zza.zzc() < iZzc2);
        int i11 = onWarmupCompleted + 23;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final void zzb(List<zzahm> list) throws IOException {
        int iZzi;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if ((this.zzb & 7) != 2) {
            throw zzajj.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi = this.zza.zzi();
            }
        } while (iZzi == this.zzb);
        this.zzd = iZzi;
        int i5 = onNavigationEvent + 99;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final void zzc(List<Double> list) throws IOException {
        int iZzi;
        int iZzi2;
        int i2 = 2 % 2;
        if (list instanceof zzain) {
            zzain zzainVar = (zzain) list;
            int i3 = this.zzb & 7;
            if (i3 == 1) {
                do {
                    zzainVar.zza(this.zza.zza());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                int i4 = onWarmupCompleted + 101;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    this.zzd = iZzi2;
                    return;
                } else {
                    this.zzd = iZzi2;
                    int i5 = 74 / 0;
                    return;
                }
            }
            if (i3 == 2) {
                int i6 = onWarmupCompleted + 85;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    int iZzj = this.zza.zzj();
                    zzd(iZzj);
                    int iZzc = this.zza.zzc();
                    do {
                        zzainVar.zza(this.zza.zza());
                    } while (this.zza.zzc() < iZzc + iZzj);
                    return;
                }
                zzd(this.zza.zzj());
                this.zza.zzc();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            throw zzajj.zza();
        }
        int i7 = this.zzb & 7;
        if (i7 == 1) {
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i7 == 2) {
            int i8 = onWarmupCompleted + 65;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc();
            do {
                list.add(Double.valueOf(this.zza.zza()));
            } while (this.zza.zzc() < iZzc2 + iZzj2);
            return;
        }
        throw zzajj.zza();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final void zzd(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        int iZzc;
        int i2 = 2 % 2;
        if (!(!(list instanceof zzajd))) {
            zzajd zzajdVar = (zzajd) list;
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzajdVar.zzc(this.zza.zzd());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i3 != 2) {
                throw zzajj.zza();
            }
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajdVar.zzc(this.zza.zzd());
            } while (this.zza.zzc() < iZzc2);
            int i4 = onNavigationEvent + 11;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            zza(iZzc2);
            return;
        }
        int i6 = this.zzb & 7;
        if (i6 != 0) {
            if (i6 != 2) {
                throw zzajj.zza();
            }
            int i7 = onNavigationEvent + 19;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                iZzc = this.zza.zzc() % this.zza.zzj();
            } else {
                iZzc = this.zza.zzc() + this.zza.zzj();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        do {
            list.add(Integer.valueOf(this.zza.zzd()));
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        int i8 = onWarmupCompleted + 73;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        this.zzd = iZzi2;
        if (i9 != 0) {
            int i10 = 44 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r1 != 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r4 = r4 + 77;
        com.google.android.gms.internal.p000firebaseauthapi.zzaig.onNavigationEvent = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if ((r4 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r1 != 4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r1 != 5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r7.zzc(r6.zza.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r6.zza.zzt() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r0 = r6.zza.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r0 == r6.zzb) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        r6.zzd = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        throw com.google.android.gms.internal.p000firebaseauthapi.zzajj.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r1 = r7;
        r4 = r6.zza.zzj();
        zzc(r4);
        r5 = r6.zza.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        r1.zzc(r6.zza.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r6.zza.zzc() < (r5 + r4)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r1 != 3) goto L11;
     */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(List<Integer> list) throws IOException {
        int iZzi;
        zzajd zzajdVar;
        int i2;
        int i3 = 2 % 2;
        if (!(list instanceof zzajd)) {
            int i4 = this.zzb & 7;
            if (i4 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc();
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < iZzc + iZzj);
                return;
            }
            if (i4 != 5) {
                throw zzajj.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    int i5 = onWarmupCompleted + 125;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 2 % 4;
                        return;
                    }
                    return;
                }
                iZzi = this.zza.zzi();
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        int i7 = onNavigationEvent + 35;
        int i8 = i7 % 128;
        onWarmupCompleted = i8;
        if (i7 % 2 == 0) {
            zzajdVar = (zzajd) list;
            i2 = this.zzb & 69;
        } else {
            zzajdVar = (zzajd) list;
            i2 = this.zzb & 7;
        }
    }

    private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
        int i3;
        float f;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 49;
                $10 = i8 % 128;
                int i9 = i8 % i5;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 26 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i5 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        float f2 = 0.0f;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26, 23140 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    f = f2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > f2 ? 1 : (AudioTrack.getMinVolume() == f2 ? 0 : -1)) + 24824), Color.alpha(0) + 74, 8088 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i10 = $11 + 123;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            f = 0.0f;
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getTapTimeout() >> 16) + 30, 19488 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            f = 0.0f;
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        int i13 = $10 + 23;
                        $11 = i13 % 128;
                        i4 = 2;
                        if (i13 % 2 == 0) {
                            int i14 = 2 / 2;
                        }
                    } else {
                        f = 0.0f;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        } else {
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                            int i19 = $11 + 67;
                            $10 = i19 % 128;
                            i4 = 2;
                            if (i19 % 2 != 0) {
                                int i20 = 3 % 4;
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += i4;
                    f2 = f;
                }
                i4 = 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += i4;
                f2 = f;
            }
        }
        for (int i21 = 0; i21 < i2; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        String str = new String(cArr4);
        int i22 = $10 + 17;
        $11 = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final void zzf(List<Long> list) throws IOException {
        int iZzi;
        int iZzi2;
        int i2 = 2 % 2;
        if (!(list instanceof zzajz)) {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzajj.zza();
                }
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < iZzc + iZzj);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzk()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            int i4 = onNavigationEvent + 17;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 52 / 0;
                return;
            }
            return;
        }
        int i6 = onWarmupCompleted + 5;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        zzajz zzajzVar = (zzajz) list;
        int i8 = this.zzb & 7;
        if (i8 == 1) {
            do {
                zzajzVar.zza(this.zza.zzk());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i8 != 2) {
            throw zzajj.zza();
        }
        int iZzj2 = this.zza.zzj();
        zzd(iZzj2);
        int iZzc2 = this.zza.zzc();
        do {
            zzajzVar.zza(this.zza.zzk());
        } while (this.zza.zzc() < iZzc2 + iZzj2);
        int i9 = onWarmupCompleted + 77;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final void zzg(List<Float> list) throws IOException {
        int iZzi;
        int iZzi2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 9;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 == 0) {
            boolean z = list instanceof zzaiy;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(list instanceof zzaiy)) {
            int i5 = this.zzb & 7;
            if (i5 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc();
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < iZzc + iZzj);
                return;
            }
            if (i5 != 5) {
                throw zzajj.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzaiy zzaiyVar = (zzaiy) list;
        int i6 = this.zzb & 7;
        if (i6 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc();
            do {
                zzaiyVar.zza(this.zza.zzb());
            } while (this.zza.zzc() < iZzc2 + iZzj2);
            return;
        }
        int i7 = i4 + 47;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0 ? i6 != 5 : i6 != 3) {
            throw zzajj.zza();
        }
        do {
            zzaiyVar.zza(this.zza.zzb());
            if (this.zza.zzt()) {
                int i8 = onWarmupCompleted + 107;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
            iZzi2 = this.zza.zzi();
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v6 int, still in use, count: 2, list:
          (r1v6 int) from 0x0011: ARITH (r1v6 int) & (85 int) A[WRAPPED]
          (r1v6 int) from PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:8:0x001a, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    @java.lang.Deprecated
    public final <T> void zza(java.util.List<T> r5, com.google.android.gms.internal.p000firebaseauthapi.zzalc<T> r6, com.google.android.gms.internal.p000firebaseauthapi.zzaip r7) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.p000firebaseauthapi.zzaig.onWarmupCompleted
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.google.android.gms.internal.p000firebaseauthapi.zzaig.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 3
            if (r1 == 0) goto L16
            int r1 = r4.zzb
            r3 = r1 & 85
            if (r3 != r2) goto L5a
            goto L1c
        L16:
            int r1 = r4.zzb
            r3 = r1 & 7
            if (r3 != r2) goto L5a
        L1c:
            java.lang.Object r2 = r4.zza(r6, r7)
            r5.add(r2)
            com.google.android.gms.internal.firebase-auth-api.zzaib r2 = r4.zza
            boolean r2 = r2.zzt()
            r3 = 0
            if (r2 != 0) goto L4d
            int r2 = r4.zzd
            if (r2 == 0) goto L31
            goto L4d
        L31:
            com.google.android.gms.internal.firebase-auth-api.zzaib r2 = r4.zza
            int r2 = r2.zzi()
            if (r2 == r1) goto L1c
            int r5 = com.google.android.gms.internal.p000firebaseauthapi.zzaig.onNavigationEvent
            int r5 = r5 + 43
            int r6 = r5 % 128
            com.google.android.gms.internal.p000firebaseauthapi.zzaig.onWarmupCompleted = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L47
            r4.zzd = r2
            goto L4d
        L47:
            r4.zzd = r2
            r3.hashCode()
            throw r3
        L4d:
            int r5 = com.google.android.gms.internal.p000firebaseauthapi.zzaig.onNavigationEvent
            int r5 = r5 + 39
            int r6 = r5 % 128
            com.google.android.gms.internal.p000firebaseauthapi.zzaig.onWarmupCompleted = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L59
            return
        L59:
            throw r3
        L5a:
            com.google.android.gms.internal.firebase-auth-api.zzaji r5 = com.google.android.gms.internal.p000firebaseauthapi.zzajj.zza()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.zzaig.zza(java.util.List, com.google.android.gms.internal.firebase-auth-api.zzalc, com.google.android.gms.internal.firebase-auth-api.zzaip):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r2 != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r1 = r1 + 27;
        com.google.android.gms.internal.p000firebaseauthapi.zzaig.onWarmupCompleted = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r2 != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r2 = r4.zza.zzc() + r4.zza.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r5.zzc(r4.zza.zzf());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r4.zza.zzc() < r2) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        r5 = com.google.android.gms.internal.p000firebaseauthapi.zzaig.onNavigationEvent + 59;
        com.google.android.gms.internal.p000firebaseauthapi.zzaig.onWarmupCompleted = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if ((r5 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        zza(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        zza(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        throw com.google.android.gms.internal.p000firebaseauthapi.zzajj.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        r5.zzc(r4.zza.zzf());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r4.zza.zzt() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        r1 = r4.zza.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r1 == r4.zzb) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        r5 = com.google.android.gms.internal.p000firebaseauthapi.zzaig.onWarmupCompleted + 63;
        com.google.android.gms.internal.p000firebaseauthapi.zzaig.onNavigationEvent = r5 % 128;
        r5 = r5 % 2;
        r4.zzd = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r2 != 0) goto L11;
     */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(List<Integer> list) throws IOException {
        int iZzi;
        zzajd zzajdVar;
        int i2;
        int i3 = 2 % 2;
        if (!(list instanceof zzajd)) {
            int i4 = this.zzb & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i4 != 2) {
                throw zzajj.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            int i5 = onNavigationEvent + 11;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        int i7 = onNavigationEvent;
        int i8 = i7 + 63;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            zzajdVar = (zzajd) list;
            i2 = this.zzb & 123;
        } else {
            zzajdVar = (zzajd) list;
            i2 = this.zzb & 7;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final void zzi(List<Long> list) throws IOException {
        int iZzi;
        int iZzi2;
        int i2 = 2 % 2;
        if (!(list instanceof zzajz)) {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                    if (!this.zza.zzt()) {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i3 != 2) {
                throw zzajj.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzl()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        int i4 = this.zzb & 7;
        if (i4 == 0) {
            do {
                zzajzVar.zza(this.zza.zzl());
                if (this.zza.zzt()) {
                    int i5 = onNavigationEvent + 51;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            int i7 = onNavigationEvent + 83;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            this.zzd = iZzi2;
            return;
        }
        int i9 = onNavigationEvent + 69;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        if (i4 != 2) {
            throw zzajj.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzajzVar.zza(this.zza.zzl());
        } while (this.zza.zzc() < iZzc2);
        int i11 = onNavigationEvent + 43;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        zza(iZzc2);
        return;
        int i13 = onWarmupCompleted + 57;
        onNavigationEvent = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        r8.zza.zzc(r1);
        r9 = com.google.android.gms.internal.p000firebaseauthapi.zzaig.onNavigationEvent + 111;
        com.google.android.gms.internal.p000firebaseauthapi.zzaig.onWarmupCompleted = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if ((r9 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void zza(Map<K, V> map, zzakf<K, V> zzakfVar, zzaip zzaipVar) throws IOException {
        int i2 = 2 % 2;
        zzb(2);
        int iZza = this.zza.zza(this.zza.zzj());
        Object objZza = zzakfVar.zzb;
        Object objZza2 = zzakfVar.zzd;
        while (true) {
            try {
                int iZzc = zzc();
                if (iZzc == Integer.MAX_VALUE || this.zza.zzt()) {
                    break;
                }
                if (iZzc == 1) {
                    objZza = zza(zzakfVar.zza, (Class<?>) null, (zzaip) null);
                } else if (iZzc != 2) {
                    int i3 = onWarmupCompleted + 73;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        try {
                            int i4 = 67 / 0;
                            if (!zzt()) {
                                throw new zzajj("Unable to parse map entry.");
                            }
                        } catch (zzaji unused) {
                            if (!zzt()) {
                                throw new zzajj("Unable to parse map entry.");
                            }
                            int i5 = onNavigationEvent + 1;
                            onWarmupCompleted = i5 % 128;
                            int i6 = i5 % 2;
                        }
                    } else if (!zzt()) {
                        throw new zzajj("Unable to parse map entry.");
                    }
                } else {
                    objZza2 = zza(zzakfVar.zzc, zzakfVar.zzd.getClass(), zzaipVar);
                }
            } catch (Throwable th) {
                this.zza.zzc(iZza);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final <T> void zzb(List<T> list, zzalc<T> zzalcVar, zzaip zzaipVar) throws IOException {
        int iZzi;
        int i2 = 2 % 2;
        int i3 = this.zzb;
        if ((i3 & 7) == 2) {
            do {
                list.add(zzb(zzalcVar, zzaipVar));
                if (this.zza.zzt()) {
                    return;
                }
                int i4 = onWarmupCompleted + 79;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                if (this.zzd != 0) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == i3);
            int i6 = onWarmupCompleted + 3;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                this.zzd = iZzi;
                return;
            } else {
                this.zzd = iZzi;
                throw null;
            }
        }
        throw zzajj.zza();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final void zzj(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        int i2 = 2 % 2;
        if (!(list instanceof zzajd)) {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc();
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < iZzc + iZzj);
                return;
            }
            if (i3 != 5) {
                throw zzajj.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            int i4 = onNavigationEvent + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            this.zzd = iZzi;
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i6 = this.zzb & 7;
        if (i6 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc();
            do {
                zzajdVar.zzc(this.zza.zzg());
            } while (this.zza.zzc() < iZzc2 + iZzj2);
            return;
        }
        if (i6 != 5) {
            throw zzajj.zza();
        }
        do {
            zzajdVar.zzc(this.zza.zzg());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        int i7 = onWarmupCompleted + 85;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            this.zzd = iZzi2;
        } else {
            this.zzd = iZzi2;
            int i8 = 69 / 0;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final void zzk(List<Long> list) throws IOException {
        int iZzi;
        int iZzi2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            if (list instanceof zzajz) {
                zzajz zzajzVar = (zzajz) list;
                int i5 = this.zzb & 7;
                if (i5 == 1) {
                    do {
                        zzajzVar.zza(this.zza.zzn());
                        if (this.zza.zzt()) {
                            return;
                        } else {
                            iZzi2 = this.zza.zzi();
                        }
                    } while (iZzi2 == this.zzb);
                    this.zzd = iZzi2;
                    return;
                }
                if (i5 == 2) {
                    int i6 = i3 + 115;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    int iZzj = this.zza.zzj();
                    zzd(iZzj);
                    int iZzc = this.zza.zzc();
                    do {
                        zzajzVar.zza(this.zza.zzn());
                    } while (this.zza.zzc() < iZzc + iZzj);
                    return;
                }
                throw zzajj.zza();
            }
            int i8 = this.zzb & 7;
            if (i8 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i8 == 2) {
                int iZzj2 = this.zza.zzj();
                zzd(iZzj2);
                int iZzc2 = this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < iZzc2 + iZzj2);
                return;
            }
            throw zzajj.zza();
        }
        boolean z = list instanceof zzajz;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzl(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 35;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 == 0) {
            int i5 = 74 / 0;
            if (!(!(list instanceof zzajd))) {
                int i6 = i4 + 13;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                zzajd zzajdVar = (zzajd) list;
                int i8 = this.zzb & 7;
                if (i8 == 0) {
                    do {
                        zzajdVar.zzc(this.zza.zzh());
                        if (!this.zza.zzt()) {
                            iZzi2 = this.zza.zzi();
                        }
                    } while (iZzi2 == this.zzb);
                    this.zzd = iZzi2;
                    return;
                }
                if (i8 != 2) {
                    throw zzajj.zza();
                }
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajdVar.zzc(this.zza.zzh());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            int i9 = this.zzb & 7;
            if (i9 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (!this.zza.zzt()) {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            int i10 = i4 + 105;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            if (i9 != 2) {
                throw zzajj.zza();
            }
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            int i12 = onWarmupCompleted + 95;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (list instanceof zzajd) {
        }
        int i13 = onWarmupCompleted + 99;
        onNavigationEvent = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 67 / 0;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final void zzm(List<Long> list) throws IOException {
        int iZzi;
        int iZzi2;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i6 = this.zzb & 7;
            Object obj = null;
            if (i6 != 0) {
                if (i6 == 2) {
                    int iZzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzajzVar.zza(this.zza.zzo());
                    } while (this.zza.zzc() < iZzc);
                    int i7 = onNavigationEvent + 59;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        zza(iZzc);
                        return;
                    } else {
                        zza(iZzc);
                        throw null;
                    }
                }
                throw zzajj.zza();
            }
            do {
                zzajzVar.zza(this.zza.zzo());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            int i8 = onWarmupCompleted + 85;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                this.zzd = iZzi2;
                return;
            } else {
                this.zzd = iZzi2;
                obj.hashCode();
                throw null;
            }
        }
        int i9 = this.zzb & 7;
        if (i9 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            int i10 = onNavigationEvent + 7;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            this.zzd = iZzi;
            return;
        }
        if (i9 == 2) {
            int i12 = i3 + 85;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzajj.zza();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final void zzn(List<String> list) throws IOException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        zza(list, false);
        int i5 = onNavigationEvent + 91;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void zza(List<String> list, boolean z) throws IOException {
        String strZzq;
        int iZzi;
        int iZzi2;
        int i2 = 2 % 2;
        if ((this.zzb & 7) != 2) {
            throw zzajj.zza();
        }
        int i3 = onWarmupCompleted;
        int i4 = i3 + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if ((list instanceof zzajq) && !z) {
            zzajq zzajqVar = (zzajq) list;
            int i6 = i3 + 53;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            do {
                zzajqVar.zza(zzp());
                if (!this.zza.zzt()) {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        do {
            if (z) {
                strZzq = zzr();
            } else {
                strZzq = zzq();
                int i8 = onWarmupCompleted + 5;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
            list.add(strZzq);
            if (!this.zza.zzt()) {
                iZzi = this.zza.zzi();
            }
        } while (iZzi == this.zzb);
        this.zzd = iZzi;
        return;
        int i10 = onNavigationEvent + 43;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final void zzo(List<String> list) throws IOException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        onNavigationEvent = i3 % 128;
        zza(list, i3 % 2 == 0);
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final void zzp(List<Integer> list) throws IOException {
        int iZzi;
        int iZzi2;
        int i2 = 2 % 2;
        if (!(list instanceof zzajd)) {
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            int i4 = onWarmupCompleted + 27;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0 ? i3 != 2 : i3 != 4) {
                throw zzajj.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i5 = this.zzb & 7;
        if (i5 != 0) {
            int i6 = onNavigationEvent + 73;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0 ? i5 != 2 : i5 != 5) {
                throw zzajj.zza();
            }
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajdVar.zzc(this.zza.zzj());
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        do {
            zzajdVar.zzc(this.zza.zzj());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        int i7 = onNavigationEvent;
        int i8 = i7 + 23;
        onWarmupCompleted = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            this.zzd = iZzi2;
            obj.hashCode();
            throw null;
        }
        this.zzd = iZzi2;
        int i9 = i7 + 29;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final void zzq(List<Long> list) throws IOException {
        int iZzi;
        int iZzc;
        int iZzi2;
        int i2 = 2 % 2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzajzVar.zza(this.zza.zzp());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            int i4 = onNavigationEvent + 121;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0 ? i3 != 2 : i3 != 2) {
                throw zzajj.zza();
            }
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajzVar.zza(this.zza.zzp());
            } while (this.zza.zzc() < iZzc2);
            int i5 = onWarmupCompleted + 23;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            zza(iZzc2);
            return;
        }
        int i7 = this.zzb & 7;
        if (i7 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        int i8 = onNavigationEvent + 107;
        int i9 = i8 % 128;
        onWarmupCompleted = i9;
        int i10 = i8 % 2;
        if (i7 != 2) {
            throw zzajj.zza();
        }
        int i11 = i9 + 39;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 != 0) {
            iZzc = this.zza.zzc() / this.zza.zzj();
        } else {
            iZzc = this.zza.zzc() + this.zza.zzj();
        }
        do {
            list.add(Long.valueOf(this.zza.zzp()));
        } while (this.zza.zzc() < iZzc);
        int i12 = onWarmupCompleted + 105;
        onNavigationEvent = i12 % 128;
        int i13 = i12 % 2;
        zza(iZzc);
        int i14 = onNavigationEvent + 95;
        onWarmupCompleted = i14 % 128;
        int i15 = i14 % 2;
    }

    private final void zza(int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 11;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            if (this.zza.zzc() != i2) {
                throw zzajj.zzi();
            }
            int i5 = onNavigationEvent + 1;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.zza.zzc();
        obj.hashCode();
        throw null;
    }

    private final void zzb(int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 87;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        if ((this.zzb & 7) != i2) {
            throw zzajj.zza();
        }
        int i7 = i4 + 71;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static void zzc(int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 93;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        if (i4 % 2 == 0 ? (i2 & 3) != 0 : (i2 & 2) != 0) {
            throw zzajj.zzg();
        }
        int i6 = i5 + 113;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void zzd(int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 81;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        if ((i2 & 7) != 0) {
            throw zzajj.zzg();
        }
        int i7 = i5 + 31;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final boolean zzs() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        onWarmupCompleted = i3 % 128;
        zzb(i3 % 2 == 0 ? 1 : 0);
        boolean zZzu = this.zza.zzu();
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zZzu;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzald
    public final boolean zzt() throws IOException {
        int i2 = 2 % 2;
        if (!(!this.zza.zzt())) {
            return false;
        }
        int i3 = onNavigationEvent + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.zzb;
        if (i4 == this.zzc) {
            return false;
        }
        boolean zZzd = this.zza.zzd(i4);
        int i5 = onWarmupCompleted + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return zZzd;
    }
}
