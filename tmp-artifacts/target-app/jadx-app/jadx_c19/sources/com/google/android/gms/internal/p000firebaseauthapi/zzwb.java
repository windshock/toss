package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzwb implements zzbh {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private static final zzic.zza zza;
    private static final ThreadLocal<Cipher> zzb;
    private static final ThreadLocal<Cipher> zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final SecretKeySpec zzg;
    private final int zzh;

    public static zzbh zza(zzdv zzdvVar) throws GeneralSecurityException {
        int i2 = 2 % 2;
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        int i3 = onNavigationEvent + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (zzdvVar.zzc().zzd() != 16) {
            throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + zzdvVar.zzc().zzd());
        }
        zzwb zzwbVar = new zzwb(zzdvVar.zze().zza(zzbr.zza()), zzdvVar.zzc().zzb(), zzdvVar.zzd().zzb());
        int i5 = onWarmupCompleted + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return zzwbVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback();
        zza = zzic.zza.zza;
        zzb = new zzwe();
        zzc = new zzwd();
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private zzwb(byte[] bArr, int i2, byte[] bArr2) throws Throwable {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i2 != 12) {
            int i3 = onWarmupCompleted + 43;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (i2 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            int i5 = 2 % 2;
        }
        this.zzh = i2;
        zzxq.zza(bArr.length);
        Object[] objArr = new Object[1];
        a(new int[]{0, 3, 179, 0}, true, new byte[]{0, 0, 0}, objArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, ((String) objArr[0]).intern());
        this.zzg = secretKeySpec;
        Cipher cipher = zzb.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrZza = zza(cipher.doFinal(new byte[16]));
        this.zzd = bArrZza;
        this.zze = zza(bArrZza);
        this.zzf = bArr2;
        int i6 = onNavigationEvent + 75;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr3 = this.zzf;
        if (bArr3.length == 0) {
            byte[] bArrZzc = zzc(bArr, bArr2);
            int i5 = onWarmupCompleted + 115;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return bArrZzc;
            }
            throw null;
        }
        if (!zzpg.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        return zzc(Arrays.copyOfRange(bArr, this.zzf.length, bArr.length), bArr2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbh
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int i2 = 2 % 2;
        int length = bArr.length;
        int i3 = this.zzh;
        if (length > 2147483631 - i3) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i4 = onNavigationEvent + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr4 = new byte[bArr.length + i3 + 16];
        byte[] bArrZza = zzov.zza(i3);
        System.arraycopy(bArrZza, 0, bArr4, 0, this.zzh);
        Cipher cipher = zzb.get();
        cipher.init(1, this.zzg);
        byte[] bArrZza2 = zza(cipher, 0, bArrZza, 0, bArrZza.length);
        if (bArr2 == null) {
            int i6 = onWarmupCompleted + 19;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            bArr3 = new byte[0];
        } else {
            bArr3 = bArr2;
        }
        byte[] bArrZza3 = zza(cipher, 1, bArr3, 0, bArr3.length);
        Cipher cipher2 = zzc.get();
        cipher2.init(1, this.zzg, new IvParameterSpec(bArrZza2));
        cipher2.doFinal(bArr, 0, bArr.length, bArr4, this.zzh);
        byte[] bArrZza4 = zza(cipher, 2, bArr4, this.zzh, bArr.length);
        int length2 = bArr.length;
        int i8 = this.zzh;
        int i9 = 0;
        while (i9 < 16) {
            bArr4[length2 + i8 + i9] = (byte) ((bArrZza3[i9] ^ bArrZza2[i9]) ^ bArrZza4[i9]);
            i9++;
            int i10 = onWarmupCompleted + 1;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
        }
        byte[] bArr5 = this.zzf;
        if (bArr5.length != 0) {
            return zzwi.zza(bArr5, bArr4);
        }
        int i12 = onNavigationEvent + 55;
        onWarmupCompleted = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 82 / 0;
        }
        return bArr4;
    }

    private static byte[] zza(byte[] bArr) {
        byte[] bArr2;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 113;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            bArr2 = new byte[110];
            i2 = 1;
        } else {
            bArr2 = new byte[16];
            i2 = 0;
        }
        while (i2 < 15) {
            int i6 = onWarmupCompleted + 63;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                i3 = i2 / 0;
                bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i3] & 19113) << 59));
            } else {
                i3 = i2 + 1;
                bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7));
            }
            i2 = i3;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        int i7 = onWarmupCompleted + 33;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 4 / 0;
        }
        return bArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        return r9.doFinal(zzd(r1, r8.zzd));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r10 = r9.doFinal(r1);
        r1 = com.google.android.gms.internal.p000firebaseauthapi.zzwb.onWarmupCompleted + 43;
        com.google.android.gms.internal.p000firebaseauthapi.zzwb.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
        r1 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if ((r13 - r4) <= 16) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        r5 = com.google.android.gms.internal.p000firebaseauthapi.zzwb.onWarmupCompleted + 7;
        com.google.android.gms.internal.p000firebaseauthapi.zzwb.onNavigationEvent = r5 % 128;
        r5 = r5 % 2;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r5 >= 16) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        r10[r5] = (byte) (r10[r5] ^ r11[(r12 + r4) + r5]);
        r5 = r5 + 1;
        r6 = com.google.android.gms.internal.p000firebaseauthapi.zzwb.onNavigationEvent + 19;
        com.google.android.gms.internal.p000firebaseauthapi.zzwb.onWarmupCompleted = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if ((r6 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        r6 = 5 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r10 = r9.doFinal(r10);
        r4 = r4 + 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        r11 = java.util.Arrays.copyOfRange(r11, r4 + r12, r12 + r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r11.length != 16) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        r11 = zzd(r11, r8.zzd);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        r12 = java.util.Arrays.copyOf(r8.zze, 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        if (r1 >= r11.length) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        r12[r1] = (byte) (r12[r1] ^ r11[r1]);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        r12[r11.length] = (byte) (r12[r11.length] ^ 128);
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        return r9.doFinal(zzd(r10, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r13 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r13 == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final byte[] zza(Cipher cipher, int i2, byte[] bArr, int i3, int i4) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArr2;
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 55;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            bArr2 = new byte[85];
            bArr2[7] = (byte) i2;
        } else {
            bArr2 = new byte[16];
            bArr2[15] = (byte) i2;
        }
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length;
        byte[] bArr3;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0 ? (length = (bArr.length - this.zzh) - 16) < 0 : (length = (bArr.length % this.zzh) << 16) < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i4 = length;
        Cipher cipher = zzb.get();
        cipher.init(1, this.zzg);
        byte[] bArrZza = zza(cipher, 0, bArr, 0, this.zzh);
        int i5 = 0;
        if (bArr2 == null) {
            int i6 = onNavigationEvent + 47;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            bArr3 = new byte[0];
        } else {
            bArr3 = bArr2;
        }
        byte[] bArrZza2 = zza(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrZza3 = zza(cipher, 2, bArr, this.zzh, i4);
        int length2 = bArr.length;
        byte b = 0;
        while (i5 < 16) {
            int i8 = onWarmupCompleted + 41;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                b = (byte) (b | (((bArr[(length2 % 61) + i5] ^ bArrZza2[i5]) ^ bArrZza[i5]) ^ bArrZza3[i5]));
                i5 += 37;
            } else {
                b = (byte) (b | (((bArr[(length2 - 16) + i5] ^ bArrZza2[i5]) ^ bArrZza[i5]) ^ bArrZza3[i5]));
                i5++;
            }
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = zzc.get();
        cipher2.init(1, this.zzg, new IvParameterSpec(bArrZza));
        return cipher2.doFinal(bArr, this.zzh, i4);
    }

    private static byte[] zzd(byte[] bArr, byte[] bArr2) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        int i5 = 0;
        while (i5 < length) {
            int i6 = onWarmupCompleted + 121;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                bArr3[i5] = (byte) (bArr[i5] ^ bArr2[i5]);
                i5 += 33;
            } else {
                bArr3[i5] = (byte) (bArr[i5] ^ bArr2[i5]);
                i5++;
            }
        }
        return bArr3;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallback;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 35283), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 35, (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $11 + 119;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 4;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - Process.getGidForName("")), 64 - TextUtils.indexOf((CharSequence) "", '0'), 16718 - (ViewConfiguration.getTapTimeout() >> 16), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (Process.myTid() >> 22) + 29, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        int i12 = $11 + 75;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - ExpandableListView.getPackedPositionType(0L)), 70 - Color.green(0), 12486 - TextUtils.indexOf("", "", 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
        }
        if (z) {
            int i15 = $10 + 27;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i17 = $11 + 3;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i19 = $10 + 43;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{27341, 27313, 27320};
    }
}
