package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzia implements zzbh {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static char onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private static final byte[] zza;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final ThreadLocal<Cipher> zzf;
    private final SecretKey zzg;
    private final byte[] zzh;

    static /* synthetic */ boolean zza(Cipher cipher) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 81;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            zzb(cipher);
            obj.hashCode();
            throw null;
        }
        boolean zZzb = zzb(cipher);
        int i4 = asBinder + 3;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zZzb;
        }
        throw null;
    }

    public static zzbh zza(zzet zzetVar) throws GeneralSecurityException {
        int i2 = 2 % 2;
        zzia zziaVar = new zzia(zzetVar.zze().zza(zzbr.zza()), zzetVar.zzd().zzb());
        int i3 = IAuthTabCallback + 67;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return zziaVar;
    }

    private static AlgorithmParameterSpec zza(byte[] bArr, int i2, int i3) throws GeneralSecurityException {
        int i4 = 2 % 2;
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, i3);
        int i5 = asBinder + 113;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return gCMParameterSpec;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static Cipher zza() throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 63;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Cipher cipher = zzf.get();
        if (cipher == null) {
            Object[] objArr = new Object[1];
            a(new char[]{4, 24, 5, 16, 18, 2, 0, 20, 7, 1, '\n', 20, 18, 6, 19, 3, '\f', '\t', 18, 5, 20, 18, 23, 11, 5, 19, 2, 1, 3, 6, 11, 2, 11, '\r', '\n', 19, '\f', '\b', 18, 5, 20, 18, 6, 23, 1, 2, '\r', 7, '\f', 21}, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 24), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 50, objArr);
            throw new GeneralSecurityException(((String) objArr[0]).intern());
        }
        int i5 = IAuthTabCallback + 29;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return cipher;
    }

    static {
        onExtraCallback();
        zza = zzxh.zza("7a806c");
        zzb = zzxh.zza("46bb91c3c5");
        zzc = zzxh.zza("36864200e0eaf5284d884a0e77d31646");
        zzd = zzxh.zza("bae8e37fc83441b16034566b");
        zze = zzxh.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
        zzf = new zzid();
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    private zzia(byte[] bArr, byte[] bArr2) throws Throwable {
        this.zzh = bArr2;
        zzxq.zza(bArr.length);
        Object[] objArr = new Object[1];
        a(new char[]{4, 24, 13848}, (byte) (KeyEvent.getDeadChar(0, 0) + 79), MotionEvent.axisFromString("") + 4, objArr);
        this.zzg = new SecretKeySpec(bArr, ((String) objArr[0]).intern());
    }

    private static boolean zzb(Cipher cipher) throws Throwable {
        int i2 = 2 % 2;
        try {
            byte[] bArr = zzd;
            AlgorithmParameterSpec algorithmParameterSpecZza = zza(bArr, 0, bArr.length);
            byte[] bArr2 = zzc;
            Object[] objArr = new Object[1];
            a(new char[]{4, 24, 13848}, (byte) (Color.argb(0, 0, 0, 0) + 79), View.resolveSize(0, 0) + 3, objArr);
            cipher.init(2, new SecretKeySpec(bArr2, ((String) objArr[0]).intern()), algorithmParameterSpecZza);
            cipher.updateAAD(zzb);
            byte[] bArr3 = zze;
            boolean zIsEqual = MessageDigest.isEqual(cipher.doFinal(bArr3, 0, bArr3.length), zza);
            int i3 = IAuthTabCallback + 71;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return zIsEqual;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws Throwable {
        int i2 = 2 % 2;
        byte[] bArr3 = this.zzh;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (!zzpg.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i3 = asBinder + 115;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            zzc(Arrays.copyOfRange(bArr, this.zzh.length, bArr.length), bArr2);
            obj.hashCode();
            throw null;
        }
        byte[] bArrZzc = zzc(Arrays.copyOfRange(bArr, this.zzh.length, bArr.length), bArr2);
        int i4 = asBinder + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return bArrZzc;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r13 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r2 = com.google.android.gms.internal.p000firebaseauthapi.zzia.IAuthTabCallback + 17;
        com.google.android.gms.internal.p000firebaseauthapi.zzia.asBinder = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if ((r2 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r13.length == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r5.updateAAD(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        r12 = r13.length;
        r12 = null;
        r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r13 = r5.doFinal(r12, 0, r12.length, r1, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r13 != (r12.length + 16)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        r12 = com.google.android.gms.internal.p000firebaseauthapi.zzia.asBinder + 43;
        com.google.android.gms.internal.p000firebaseauthapi.zzia.IAuthTabCallback = r12 % 128;
        r12 = r12 % 2;
        r12 = r11.zzh;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r12.length != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        r12 = com.google.android.gms.internal.p000firebaseauthapi.zzwi.zza(r12, r1);
        r13 = com.google.android.gms.internal.p000firebaseauthapi.zzia.IAuthTabCallback + 15;
        com.google.android.gms.internal.p000firebaseauthapi.zzia.asBinder = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        throw new java.security.GeneralSecurityException(java.lang.String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, java.lang.Integer.valueOf(r13 - r12.length)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        throw new java.security.GeneralSecurityException("plaintext too long");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r12.length <= 2147483619) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r12.length <= 2147483619) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r5 = r1;
        r1 = new byte[r12.length + 28];
        r4 = com.google.android.gms.internal.p000firebaseauthapi.zzov.zza(12);
        java.lang.System.arraycopy(r4, 0, r1, 0, 12);
        r5.init(1, r11.zzg, zza(r4, 0, r4.length));
     */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws Throwable {
        Cipher cipherZza;
        int i2 = 2 % 2;
        int i3 = asBinder + 81;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            cipherZza = zza();
            int i4 = 69 / 0;
        } else {
            cipherZza = zza();
        }
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws Throwable {
        int i2 = 2 % 2;
        Cipher cipherZza = zza();
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i3 = asBinder + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        cipherZza.init(2, this.zzg, zza(bArr, 0, 12));
        if (bArr2 != null) {
            int i5 = IAuthTabCallback + 13;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                if (bArr2.length != 0) {
                    cipherZza.updateAAD(bArr2);
                }
            } else {
                int length = bArr2.length;
                throw null;
            }
        }
        return cipherZza.doFinal(bArr, 12, bArr.length - 12);
    }

    private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
        int i3;
        Object obj;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        int i5 = -1310771303;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 71;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 26, 23139 - TextUtils.getCapsMode("", 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    i5 = -1310771303;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $10 + 81;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 26 - (ViewConfiguration.getTapTimeout() >> 16), (-16754077) - Color.rgb(0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                int i11 = $11 + 71;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    i3 = i2 + 34;
                    cArr4[i3] = (char) (cArr[i3] * b);
                } else {
                    i3 = i2 - 1;
                    cArr4[i3] = (char) (cArr[i3] - b);
                }
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                int i12 = $10 + 55;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24823 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 74, 8087 - ((byte) KeyEvent.getModifierMetaStateMask()), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i14 = $11 + 19;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 30, ((byte) KeyEvent.getModifierMetaStateMask()) + 19489, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                            } else {
                                int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i19];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i21 = 0; i21 < i2; i21++) {
                cArr4[i21] = (char) (cArr4[i21] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{64965, 64978, 65018, 65008, 64987, 64997, 64992, 64961, 64986, 64967, 64977, 64983, 64991, 64988, 64982, 64915, 64976, 65012, 64963, 65014, 65022, 64989, 64925, 64960, 65010};
        onExtraCallback = (char) 51244;
    }
}
