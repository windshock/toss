package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaic extends zzaib {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzaif zzm;
    private static final byte[] $$a = {119, -58, 7, 71};
    private static final int $$b = 19;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] onExtraCallback = {60861, 33126, 13340, 43829, 24272};
    private static long IAuthTabCallback = 4082565320637907208L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i2, int i3) {
        int i4;
        int i5 = 97 - (i2 * 4);
        byte[] bArr = $$a;
        int i6 = 4 - (s * 2);
        int i7 = i3 * 4;
        byte[] bArr2 = new byte[1 - i7];
        int i8 = 0 - i7;
        if (bArr == null) {
            i5 = i6;
            int i9 = i8;
            int i10 = 0;
            i6++;
            i5 += -i9;
            i4 = i10;
            bArr2[i4] = (byte) i5;
            i10 = i4 + 1;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i6];
            i6++;
            i5 += -i9;
            i4 = i10;
            bArr2[i4] = (byte) i5;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i5;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        }
    }

    private final byte zzv() throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this.zzi == this.zzg) {
            int i6 = i4 + 51;
            onExtraCallbackWithResult = i6 % 128;
            zzg(i6 % 2 == 0 ? 0 : 1);
        }
        byte[] bArr = this.zzf;
        int i7 = this.zzi;
        this.zzi = i7 + 1;
        return bArr[i7];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final double zza() throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        double dLongBitsToDouble = Double.longBitsToDouble(zzy());
        int i5 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return dLongBitsToDouble;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final float zzb() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iZzw = zzw();
        if (i4 != 0) {
            return Float.intBitsToFloat(iZzw);
        }
        Float.intBitsToFloat(iZzw);
        throw null;
    }

    private static int zza(InputStream inputStream) throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        try {
            int iAvailable = inputStream.available();
            int i5 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 66 / 0;
            }
            return iAvailable;
        } catch (zzajj e) {
            e.zzj();
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zzc() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2 == 0 ? this.zzk % this.zzi : this.zzk + this.zzi;
        int i6 = i3 + 99;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r1 = r1 + 83;
        com.google.android.gms.internal.p000firebaseauthapi.zzaic.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
        r4.zzl = r5;
        zzaa();
        r5 = com.google.android.gms.internal.p000firebaseauthapi.zzaic.onNavigationEvent + 43;
        com.google.android.gms.internal.p000firebaseauthapi.zzaic.onExtraCallbackWithResult = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if ((r5 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r5 = 87 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        throw com.google.android.gms.internal.p000firebaseauthapi.zzajj.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        throw com.google.android.gms.internal.p000firebaseauthapi.zzajj.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r5 = r5 + (r4.zzk + r4.zzi);
        r2 = r4.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r5 > r2) goto L14;
     */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(int i2) throws zzajj {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                return inputStream.read(bArr, i2, i3);
            }
            inputStream.read(bArr, i2, i3);
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (zzajj e) {
            e.zzj();
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zzd() throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iZzx = zzx();
        int i5 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return iZzx;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zze() throws IOException {
        int iZzw;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            iZzw = zzw();
            int i4 = 8 / 0;
        } else {
            iZzw = zzw();
        }
        int i5 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return iZzw;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zzf() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return zzx();
        }
        zzx();
        throw null;
    }

    private final int zzw() throws IOException {
        int i2 = 2 % 2;
        int i3 = this.zzi;
        if (this.zzg - i3 < 4) {
            zzg(4);
            i3 = this.zzi;
            int i4 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        byte[] bArr = this.zzf;
        this.zzi = i3 + 4;
        int i6 = ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        int i7 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    private final int zzx() throws IOException {
        int i2;
        int i3 = 2 % 2;
        int i4 = this.zzi;
        int i5 = this.zzg;
        if (i5 != i4) {
            int i6 = onExtraCallbackWithResult;
            int i7 = i6 + 11;
            int i8 = i7 % 128;
            onNavigationEvent = i8;
            int i9 = i7 % 2;
            byte[] bArr = this.zzf;
            int i10 = i4 + 1;
            byte b = bArr[i4];
            if (b >= 0) {
                this.zzi = i10;
                return b;
            }
            if (i5 - i10 >= 9) {
                int i11 = i4 + 2;
                int i12 = (bArr[i10] << 7) ^ b;
                if (i12 < 0) {
                    int i13 = i8 + 85;
                    onExtraCallbackWithResult = i13 % 128;
                    i2 = i13 % 2 == 0 ? i12 ^ 54 : i12 ^ (-128);
                } else {
                    int i14 = i4 + 3;
                    int i15 = (bArr[i11] << 14) ^ i12;
                    if (i15 >= 0) {
                        int i16 = i6 + 47;
                        onNavigationEvent = i16 % 128;
                        i2 = i16 % 2 != 0 ? i15 ^ 2029 : i15 ^ 16256;
                        i11 = i14;
                    } else {
                        int i17 = i4 + 4;
                        int i18 = i15 ^ (bArr[i14] << 21);
                        if (i18 < 0) {
                            int i19 = i6 + 51;
                            onNavigationEvent = i19 % 128;
                            if (i19 % 2 != 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            i2 = (-2080896) ^ i18;
                            i11 = i17;
                        } else {
                            int i20 = i4 + 5;
                            byte b2 = bArr[i17];
                            int i21 = (i18 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                int i22 = i4 + 6;
                                if (bArr[i20] < 0) {
                                    i20 = i4 + 7;
                                    if (bArr[i22] < 0) {
                                        i22 = i4 + 8;
                                        if (bArr[i20] < 0) {
                                            i20 = i4 + 9;
                                            if (bArr[i22] < 0) {
                                                if (bArr[i20] >= 0) {
                                                    i20 = i4 + 10;
                                                }
                                            }
                                        }
                                    }
                                    i11 = i20;
                                    i2 = i21;
                                }
                                i2 = i21;
                                i11 = i22;
                            } else {
                                i11 = i20;
                                i2 = i21;
                            }
                        }
                    }
                }
                this.zzi = i11;
                return i2;
            }
        }
        return (int) zzm();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zzg() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iZzw = zzw();
        int i5 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return iZzw;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zzh() throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iZzx = zzx();
        if (i4 == 0) {
            return zzaib.zze(iZzx);
        }
        zzaib.zze(iZzx);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r1 = zzx();
        r5.zzj = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if ((r1 >>> 3) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r3 = com.google.android.gms.internal.p000firebaseauthapi.zzaic.onExtraCallbackWithResult + 55;
        com.google.android.gms.internal.p000firebaseauthapi.zzaic.onNavigationEvent = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if ((r3 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        r0 = 63 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        throw com.google.android.gms.internal.p000firebaseauthapi.zzajj.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (zzt() != true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (zzt() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r5.zzj = 0;
     */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzi() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 0;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final int zzj() throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iZzx = zzx();
        int i5 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return iZzx;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final long zzk() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long jZzy = zzy();
        int i5 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return jZzy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final long zzl() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            zzz();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jZzz = zzz();
        int i4 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return jZzz;
    }

    private final long zzy() throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.zzi;
        if (this.zzg - i5 < 8) {
            zzg(8);
            i5 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i5 + 8;
        long j = bArr[i5];
        long j2 = bArr[i5 + 1];
        long j3 = bArr[i5 + 2];
        long j4 = bArr[i5 + 3];
        long j5 = bArr[i5 + 4];
        long j6 = (bArr[i5 + 6] & 255) << 48;
        long j7 = j6 | ((bArr[i5 + 5] & 255) << 40) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i5 + 7] & 255) << 56);
        int i6 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return j7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x031b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        float f;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            f = 0.0f;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i3) {
                break;
            }
            int i5 = $10 + 5;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallback[i2 << i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 17 - View.MeasureSpec.getSize(0), 10973 - TextUtils.getOffsetBefore("", 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Color.alpha(0)), 30 - TextUtils.lastIndexOf("", '0', 0, 0), 20219 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.resolveSizeAndState(0, 0, 0)), 44 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1493 - TextUtils.indexOf((CharSequence) "", '0', 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onExtraCallback[i2 + i7])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 17 - Color.alpha(0), 10973 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 46134), 31 - (ViewConfiguration.getPressedStateDuration() >> 16), 20221 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getOffsetAfter("", 0)), TextUtils.indexOf("", "", 0, 0) + 44, 1494 - ExpandableListView.getPackedPositionGroup(0L), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i8 = $10 + 111;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback7 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 49123), 43 - TextUtils.lastIndexOf("", '0', 0), Drawable.resolveOpacity(0, 0) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback7).invoke(null, objArr8);
                    int i9 = 14 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback8 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1))), (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 43, ((byte) KeyEvent.getModifierMetaStateMask()) + 1495, -1657859959, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback8).invoke(null, objArr9);
                f = 0.0f;
            }
        }
        String str = new String(cArr);
        int i10 = $10 + 79;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    private final long zzz() throws IOException {
        long j;
        long j2;
        long j3;
        int i2 = 2 % 2;
        int i3 = this.zzi;
        int i4 = this.zzg;
        if (i4 != i3) {
            byte[] bArr = this.zzf;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                int i6 = onNavigationEvent + 75;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    this.zzi = i5;
                    return b;
                }
                this.zzi = i5;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (i4 - i5 >= 9) {
                int i7 = i3 + 2;
                int i8 = (bArr[i5] << 7) ^ b;
                if (i8 < 0) {
                    int i9 = onExtraCallbackWithResult + 39;
                    onNavigationEvent = i9 % 128;
                    j = i9 % 2 != 0 ? i8 ^ 25 : i8 ^ (-128);
                } else {
                    int i10 = i3 + 3;
                    int i11 = (bArr[i7] << 14) ^ i8;
                    if (i11 >= 0) {
                        j = i11 ^ 16256;
                        i7 = i10;
                    } else {
                        int i12 = i3 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            int i14 = onNavigationEvent + 115;
                            onExtraCallbackWithResult = i14 % 128;
                            if (i14 % 2 == 0) {
                                j = (-2080896) ^ i13;
                                int i15 = 21 / 0;
                            } else {
                                j = (-2080896) ^ i13;
                            }
                            i7 = i12;
                        } else {
                            long j4 = i13;
                            i7 = i3 + 5;
                            long j5 = j4 ^ (bArr[i12] << 28);
                            if (j5 >= 0) {
                                int i16 = onNavigationEvent + 57;
                                onExtraCallbackWithResult = i16 % 128;
                                int i17 = i16 % 2;
                                j3 = 266354560;
                            } else {
                                int i18 = i3 + 6;
                                long j6 = j5 ^ (bArr[i7] << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i7 = i3 + 7;
                                    j5 = j6 ^ (bArr[i18] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i18 = i3 + 8;
                                        j6 = j5 ^ (bArr[i7] << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i7 = i3 + 9;
                                            long j7 = (j6 ^ (bArr[i18] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                int i19 = onExtraCallbackWithResult;
                                                int i20 = i19 + 33;
                                                onNavigationEvent = i20 % 128;
                                                int i21 = i20 % 2;
                                                if (bArr[i7] >= 0) {
                                                    int i22 = i19 + 83;
                                                    onNavigationEvent = i22 % 128;
                                                    int i23 = i22 % 2;
                                                    i7 = i3 + 10;
                                                }
                                            }
                                            j = j7;
                                        }
                                    }
                                }
                                i7 = i18;
                                j = j2 ^ j6;
                            }
                            int i24 = onExtraCallbackWithResult + 105;
                            onNavigationEvent = i24 % 128;
                            int i25 = i24 % 2;
                            j = j5 ^ j3;
                        }
                    }
                }
                this.zzi = i7;
                return j;
            }
        }
        return zzm();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    final long zzm() throws IOException {
        long j;
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            j = 1;
            i2 = 1;
        } else {
            j = 0;
            i2 = 0;
        }
        while (i2 < 64) {
            int i5 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            j |= (r4 & Byte.MAX_VALUE) << i2;
            if ((zzv() & 128) == 0) {
                return j;
            }
            i2 += 7;
        }
        throw zzajj.zze();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final long zzn() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long jZzy = zzy();
        int i5 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return jZzy;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final long zzo() throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            zzaib.zza(zzz());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jZza = zzaib.zza(zzz());
        int i4 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return jZza;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final long zzp() throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return zzz();
        }
        zzz();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static long zza(InputStream inputStream, long j) throws IOException {
        long jSkip;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                jSkip = inputStream.skip(j);
                int i4 = 37 / 0;
            } else {
                jSkip = inputStream.skip(j);
            }
            return jSkip;
        } catch (zzajj e) {
            e.zzj();
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final zzahm zzq() throws IOException {
        int i2 = 2 % 2;
        int iZzx = zzx();
        int i3 = this.zzg;
        int i4 = this.zzi;
        if (iZzx <= i3 - i4 && iZzx > 0) {
            int i5 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            zzahm zzahmVarZza = zzahm.zza(this.zzf, i4, iZzx);
            this.zzi += iZzx;
            return zzahmVarZza;
        }
        if (iZzx == 0) {
            int i7 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return zzahm.zza;
        }
        byte[] bArrZzj = zzj(iZzx);
        if (bArrZzj != null) {
            return zzahm.zza(bArrZzj);
        }
        int i9 = this.zzi;
        int i10 = this.zzg;
        int length = i10 - i9;
        this.zzk += i10;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzf = zzf(iZzx - length);
        byte[] bArr = new byte[iZzx];
        System.arraycopy(this.zzf, i9, bArr, 0, length);
        Iterator<byte[]> it = listZzf.iterator();
        while (it.hasNext()) {
            int i11 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 == 0) {
                byte[] next = it.next();
                System.arraycopy(next, 1, bArr, length, next.length);
                length -= next.length;
            } else {
                byte[] next2 = it.next();
                System.arraycopy(next2, 0, bArr, length, next2.length);
                length += next2.length;
            }
        }
        return zzahm.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final String zzr() throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iZzx = zzx();
        if (iZzx > 0) {
            int i5 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = this.zzg;
            int i8 = this.zzi;
            if (iZzx <= i7 - i8) {
                String str = new String(this.zzf, i8, iZzx, zzajc.zza);
                this.zzi += iZzx;
                return str;
            }
        }
        if (iZzx != 0) {
            if (iZzx > this.zzg) {
                return new String(zza(iZzx, false), zzajc.zza);
            }
            zzg(iZzx);
            String str2 = new String(this.zzf, this.zzi, iZzx, zzajc.zza);
            this.zzi += iZzx;
            return str2;
        }
        int i9 = onNavigationEvent;
        int i10 = i9 + 121;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 7;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 != 0) {
            return "";
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final String zzs() throws IOException {
        byte[] bArrZza;
        int i2 = 2 % 2;
        int iZzx = zzx();
        int i3 = this.zzi;
        int i4 = this.zzg;
        if (iZzx <= i4 - i3 && iZzx > 0) {
            int i5 = onExtraCallbackWithResult + 11;
            int i6 = i5 % 128;
            onNavigationEvent = i6;
            int i7 = i5 % 2;
            bArrZza = this.zzf;
            this.zzi = i3 + iZzx;
            int i8 = i6 + 73;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        } else {
            if (iZzx == 0) {
                int i10 = onNavigationEvent + 29;
                int i11 = i10 % 128;
                onExtraCallbackWithResult = i11;
                int i12 = i10 % 2;
                int i13 = i11 + 119;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                return "";
            }
            i3 = 0;
            if (iZzx <= i4) {
                int i15 = onExtraCallbackWithResult + 63;
                onNavigationEvent = i15 % 128;
                int i16 = i15 % 2;
                zzg(iZzx);
                bArrZza = this.zzf;
                this.zzi = iZzx;
            } else {
                bArrZza = zza(iZzx, false);
            }
        }
        String strZzb = zzaml.zzb(bArrZza, i3, iZzx);
        int i17 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i17 % 128;
        if (i17 % 2 == 0) {
            return strZzb;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final List<byte[]> zzf(int i2) throws IOException {
        int i3;
        int i4 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int i5 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int iMin = Math.min(i2, 4096);
            byte[] bArr = new byte[iMin];
            int i7 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 / 2;
            }
            int i9 = 0;
            while (i9 < iMin) {
                int i10 = onExtraCallbackWithResult + 103;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    i3 = this.zze.read(bArr, i9, iMin * i9);
                    if (i3 == -1) {
                        throw zzajj.zzi();
                    }
                    this.zzk += i3;
                    i9 += i3;
                } else {
                    i3 = this.zze.read(bArr, i9, iMin - i9);
                    if (i3 == -1) {
                        throw zzajj.zzi();
                    }
                    this.zzk += i3;
                    i9 += i3;
                }
            }
            i2 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private zzaic(InputStream inputStream, int i2) throws Throwable {
        super();
        this.zzl = Integer.MAX_VALUE;
        this.zzm = null;
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getMaximumFlingVelocity() >> 16, 5 - TextUtils.indexOf("", ""), (char) View.resolveSize(0, 0), objArr);
        zzajc.zza(inputStream, ((String) objArr[0]).intern());
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final void zzb(int i2) throws zzajj {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 43;
        int i5 = i4 % 128;
        onExtraCallbackWithResult = i5;
        if (i4 % 2 != 0) {
            if (this.zzj != i2) {
                throw zzajj.zzb();
            }
            int i6 = i5 + 13;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final void zzc(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            this.zzl = i2;
            zzaa();
            int i5 = 6 / 0;
        } else {
            this.zzl = i2;
            zzaa();
        }
    }

    private final void zzaa() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.zzg + this.zzh;
        this.zzg = i6;
        int i7 = this.zzk + i6;
        int i8 = this.zzl;
        if (i7 > i8) {
            int i9 = i3 + 29;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i7 - i8;
            this.zzh = i11;
            this.zzg = i6 - i11;
            return;
        }
        this.zzh = 0;
    }

    private final void zzg(int i2) throws IOException {
        int i3 = 2 % 2;
        if (zzi(i2)) {
            int i4 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } else {
            if (i2 > (this.zzc - this.zzk) - this.zzi) {
                int i6 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                throw zzajj.zzh();
            }
            throw zzajj.zzi();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r2 r3
      0x001f: PHI (r2v3 int) = (r2v2 int), (r2v14 int) binds: [B:8:0x001d, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]
      0x001f: PHI (r3v2 int) = (r3v1 int), (r3v15 int) binds: [B:8:0x001d, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzh(int i2) throws IOException {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = onNavigationEvent;
        int i7 = i6 + 25;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            i3 = this.zzg;
            i4 = this.zzi;
            if (i2 <= i3 - i4) {
                if (i2 >= 0) {
                    this.zzi = i4 + i2;
                    return;
                }
            }
        } else {
            i3 = this.zzg;
            i4 = this.zzi;
            if (i2 <= i3 - i4) {
            }
        }
        if (i2 < 0) {
            throw zzajj.zzf();
        }
        int i8 = i6 + 47;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        int i10 = this.zzk;
        int i11 = this.zzl;
        int i12 = i10 + i4;
        if (i12 + i2 > i11) {
            zzh((i11 - i10) - i4);
            throw zzajj.zzi();
        }
        this.zzk = i12;
        int i13 = i3 - i4;
        this.zzg = 0;
        this.zzi = 0;
        while (i13 < i2) {
            try {
                long j = i2 - i13;
                long jZza = zza(this.zze, j);
                if (jZza < 0 || jZza > j) {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jZza + "\nThe InputStream implementation is buggy.");
                }
                int i14 = onNavigationEvent + 81;
                int i15 = i14 % 128;
                onExtraCallbackWithResult = i15;
                if (i14 % 2 == 0) {
                    throw null;
                }
                if (jZza == 0) {
                    break;
                }
                int i16 = i15 + 49;
                onNavigationEvent = i16 % 128;
                i13 = i16 % 2 != 0 ? i13 / ((int) jZza) : i13 + ((int) jZza);
            } finally {
                this.zzk += i13;
                zzaa();
            }
        }
        if (i13 >= i2) {
            return;
        }
        int i17 = this.zzg;
        int i18 = i17 - this.zzi;
        this.zzi = i17;
        zzg(1);
        while (true) {
            int i19 = i2 - i18;
            int i20 = this.zzg;
            if (i19 <= i20) {
                this.zzi = i19;
                return;
            }
            int i21 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i21 % 128;
            int i22 = i21 % 2;
            i18 += i20;
            this.zzi = i20;
            zzg(1);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final boolean zzt() throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 119;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (this.zzi != this.zzg) {
            return false;
        }
        int i5 = i3 + 73;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return !zzi(1);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final boolean zzu() throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (zzz() == 0) {
            return false;
        }
        int i5 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaib
    public final boolean zzd(int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = i2 & 7;
        int i5 = 0;
        if (i4 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i5 < 10) {
                    if (zzv() < 0) {
                        i5++;
                    }
                }
                throw zzajj.zze();
            }
            while (i5 < 10) {
                int i6 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                byte[] bArr = this.zzf;
                int i8 = this.zzi;
                this.zzi = i8 + 1;
                if (bArr[i8] < 0) {
                    i5++;
                }
            }
            throw zzajj.zze();
            int i9 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i4 == 1) {
            zzh(8);
            return true;
        }
        int i10 = onExtraCallbackWithResult;
        int i11 = i10 + 125;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        if (i4 == 2) {
            zzh(zzx());
            return true;
        }
        if (i4 != 3) {
            int i13 = i10 + 105;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw zzajj.zza();
            }
            zzh(4);
            return true;
        }
        while (true) {
            int iZzi = zzi();
            if (iZzi == 0) {
                break;
            }
            int i15 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 52 / 0;
                if (!zzd(iZzi)) {
                    break;
                }
            } else if (!zzd(iZzi)) {
                break;
            }
        }
        zzb(((i2 >>> 3) << 3) | 4);
        int i17 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 17 / 0;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzi(int i2) throws IOException {
        int i3 = 2 % 2;
        do {
            int i4 = this.zzi;
            int i5 = this.zzg;
            if (i4 + i2 <= i5) {
                throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
            }
            int i6 = this.zzc;
            int i7 = this.zzk;
            if (i2 > (i6 - i7) - i4) {
                int i8 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (i7 + i4 + i2 > this.zzl) {
                int i10 = onNavigationEvent + 97;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (i4 > 0) {
                int i12 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (i5 > i4) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.zzk += i4;
                this.zzg -= i4;
                this.zzi = 0;
            }
            InputStream inputStream = this.zze;
            byte[] bArr2 = this.zzf;
            int i13 = this.zzg;
            int iZza = zza(inputStream, bArr2, i13, Math.min(bArr2.length - i13, (this.zzc - this.zzk) - i13));
            if (iZza != 0) {
                int i14 = onExtraCallbackWithResult + 1;
                int i15 = i14 % 128;
                onNavigationEvent = i15;
                if (i14 % 2 != 0) {
                    int i16 = 99 / 0;
                    if (iZza >= -1) {
                        if (iZza <= this.zzf.length) {
                            int i17 = i15 + 83;
                            onExtraCallbackWithResult = i17 % 128;
                            if (i17 % 2 == 0) {
                                int i18 = 21 / 0;
                                if (iZza <= 0) {
                                    return false;
                                }
                                this.zzg += iZza;
                                zzaa();
                            } else {
                                if (iZza <= 0) {
                                    return false;
                                }
                                this.zzg += iZza;
                                zzaa();
                            }
                        }
                    }
                } else if (iZza >= -1) {
                }
            }
            throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + iZza + "\nThe InputStream implementation is buggy.");
        } while (this.zzg < i2);
        return true;
    }

    private final byte[] zza(int i2, boolean z) throws IOException {
        int i3 = 2 % 2;
        byte[] bArrZzj = zzj(i2);
        if (bArrZzj != null) {
            int i4 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 82 / 0;
            }
            return bArrZzj;
        }
        int i6 = this.zzi;
        int i7 = this.zzg;
        int length = i7 - i6;
        this.zzk += i7;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzf = zzf(i2 - length);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzf, i6, bArr, 0, length);
        for (byte[] bArr2 : listZzf) {
            int i8 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    private final byte[] zzj(int i2) throws IOException {
        int i3 = 2 % 2;
        if (i2 == 0) {
            int i4 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return zzajc.zzb;
            }
            int i5 = 49 / 0;
            return zzajc.zzb;
        }
        if (i2 < 0) {
            throw zzajj.zzf();
        }
        int i6 = this.zzk;
        int i7 = this.zzi;
        int i8 = i6 + i7 + i2;
        if (i8 - this.zzc > 0) {
            throw zzajj.zzh();
        }
        int i9 = this.zzl;
        if (i8 > i9) {
            zzh((i9 - i6) - i7);
            throw zzajj.zzi();
        }
        int i10 = this.zzg - i7;
        int i11 = i2 - i10;
        if (i11 >= 4096 && i11 > zza(this.zze)) {
            return null;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i10);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i10 < i2) {
            int iZza = zza(this.zze, bArr, i10, i2 - i10);
            if (iZza != -1) {
                int i12 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 == 0) {
                    this.zzk /= iZza;
                    i10 /= iZza;
                } else {
                    this.zzk += iZza;
                    i10 += iZza;
                }
            } else {
                throw zzajj.zzi();
            }
        }
        return bArr;
    }
}
