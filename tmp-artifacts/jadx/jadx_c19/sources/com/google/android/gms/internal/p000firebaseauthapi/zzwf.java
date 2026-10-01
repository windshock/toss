package com.google.android.gms.internal.p000firebaseauthapi;

import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzwf implements zzbq {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;
    private static final zzic.zza zza;
    private static final Collection<Integer> zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final zzxj zze;
    private final byte[] zzf;
    private final byte[] zzg;

    public static zzbq zza(zzij zzijVar) throws GeneralSecurityException {
        int i2 = 2 % 2;
        zzwf zzwfVar = new zzwf(zzijVar.zze().zza(zzbr.zza()), zzijVar.zzd());
        int i3 = asInterface + 51;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return zzwfVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent();
        zza = zzic.zza.zza;
        zzb = Arrays.asList(64);
        zzc = new byte[16];
        zzd = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int i2 = IAuthTabCallbackStub + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
    }

    private zzwf(byte[] bArr, zzxr zzxrVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!zzb.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.zzf = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.zze = new zzxj(bArrCopyOfRange);
        this.zzg = zzxrVar.zzb();
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzbq
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws Throwable {
        byte[] bArrZza;
        int i2 = 2 % 2;
        int length = bArr.length;
        byte[] bArr3 = this.zzg;
        if (length < bArr3.length + 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        int i3 = asInterface + 27;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            zzpg.zza(bArr3, bArr);
            obj.hashCode();
            throw null;
        }
        if (!zzpg.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        zzwr<zzxc, Cipher> zzwrVar = zzwr.zza;
        Object[] objArr = new Object[1];
        a(new char[]{51344, 23626, 53905, 23249, 51857, 39125, 60786, 62780, 41304, 44423, 44430, 17123, 44834, 61767, 15239, 21937, 5840, 50371}, (Process.myPid() >> 22) + 17, objArr);
        Cipher cipherZza = zzwrVar.zza(((String) objArr[0]).intern());
        byte[] bArr4 = this.zzg;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr4.length + 16);
        byte[] bArr5 = (byte[]) bArrCopyOfRange.clone();
        bArr5[8] = (byte) (bArr5[8] & Byte.MAX_VALUE);
        bArr5[12] = (byte) (bArr5[12] & Byte.MAX_VALUE);
        byte[] bArr6 = this.zzf;
        Object[] objArr2 = new Object[1];
        a(new char[]{51344, 23626, 59930, 12318}, 3 - TextUtils.indexOf("", "", 0, 0), objArr2);
        cipherZza.init(2, new SecretKeySpec(bArr6, ((String) objArr2[0]).intern()), new IvParameterSpec(bArr5));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.zzg.length + 16, bArr.length);
        byte[] bArrDoFinal = cipherZza.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null) {
            int i4 = asInterface + 125;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                zzxn.zza();
                throw null;
            }
            if (zzxn.zza()) {
                bArrDoFinal = new byte[0];
            }
        }
        byte[][] bArr7 = {bArr2, bArrDoFinal};
        byte[] bArrZza2 = this.zze.zza(zzc, 16);
        for (int i5 = 0; i5 <= 0; i5++) {
            byte[] bArr8 = bArr7[i5];
            if (bArr8 == null) {
                bArr8 = new byte[0];
            }
            bArrZza2 = zzwi.zza(zzrb.zzb(bArrZza2), this.zze.zza(bArr8, 16));
        }
        byte[] bArr9 = bArr7[1];
        if (bArr9.length < 16) {
            bArrZza = zzwi.zza(zzrb.zza(bArr9), zzrb.zzb(bArrZza2));
        } else {
            if (bArr9.length < bArrZza2.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr9.length;
            int length3 = bArrZza2.length;
            bArrZza = Arrays.copyOf(bArr9, bArr9.length);
            for (int i6 = 0; i6 < bArrZza2.length; i6++) {
                int i7 = (length2 - length3) + i6;
                bArrZza[i7] = (byte) (bArrZza[i7] ^ bArrZza2[i6]);
            }
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, this.zze.zza(bArrZza, 16))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i5 = $11 + 97;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i7 = $11 + 73;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent % i4];
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i8 = 58224;
            int i9 = i4;
            while (i9 < 16) {
                int i10 = $10 + 85;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", i4, i4);
                        int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0');
                        int deadChar = KeyEvent.getDeadChar(i4, i4) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(capsMode, iIndexOf, deadChar, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), 10 - (Process.myPid() >> 22), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - TextUtils.getCapsMode("", 0, 0)), TextUtils.lastIndexOf("", '0', 0) + 15, 19901 - (ViewConfiguration.getEdgeSlop() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void onNavigationEvent() {
        onWarmupCompleted = (char) 56818;
        IAuthTabCallback = (char) 27407;
        onExtraCallback = (char) 3735;
        onNavigationEvent = (char) 46133;
    }
}
