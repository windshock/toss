package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.kernel.RVParams;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzwn {
    private static short[] onNavigationEvent;
    private static final byte[] $$a = {108, -1, -36, 99};
    private static final int $$b = 236;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallback = 1133273199;
    private static int onExtraCallback = -1538795495;
    private static int onWarmupCompleted = -1569629981;
    private static byte[] onExtraCallbackWithResult = {-115, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, short s, int i3) {
        int i4;
        int i5;
        byte[] bArr = $$a;
        int i6 = 3 - (s * 3);
        int i7 = (i2 * 3) + 115;
        int i8 = (i3 * 4) + 1;
        byte[] bArr2 = new byte[i8];
        if (bArr == null) {
            int i9 = i6;
            i7 = i8;
            i5 = 0;
            i7 += -i6;
            i6 = i9;
            i4 = i5;
            int i10 = i6 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i7;
            if (i5 == i8) {
                return new String(bArr2, 0);
            }
            i9 = i10;
            i6 = bArr[i10];
            i7 += -i6;
            i6 = i9;
            i4 = i5;
            int i102 = i6 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i7;
            if (i5 == i8) {
            }
        } else {
            i4 = 0;
            int i1022 = i6 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i7;
            if (i5 == i8) {
            }
        }
    }

    public static int zza(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = onTransact + 45;
        IAuthTabCallbackDefault = i3 % 128;
        int iBitLength = i3 % 2 != 0 ? zzmd.zza(ellipticCurve).subtract(BigInteger.ONE).bitLength() << RVParams.WEBVIEW_FONT_SIZE_LARGEST : (zzmd.zza(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        int i4 = IAuthTabCallbackDefault + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iBitLength;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0067, code lost:
    
        if (r11.equals(r13) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        if (r1.testBit(0) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (r1.testBit(1) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        r13 = r11.modPow(r1.add(java.math.BigInteger.ONE).shiftRight(2), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (r1.testBit(0) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        r13 = com.google.android.gms.internal.p000firebaseauthapi.zzwn.IAuthTabCallbackDefault + 19;
        com.google.android.gms.internal.p000firebaseauthapi.zzwn.onTransact = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        if (r1.testBit(1) == true) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        r13 = java.math.BigInteger.ONE;
        r5 = r1.subtract(r13).shiftRight(1);
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        r7 = r13.multiply(r13).subtract(r11).mod(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        if (r7.equals(java.math.BigInteger.ZERO) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        r8 = r7.modPow(r5, r1);
        r9 = java.math.BigInteger.ONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        if (r8.add(r9).equals(r1) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ce, code lost:
    
        r7 = com.google.android.gms.internal.p000firebaseauthapi.zzwn.IAuthTabCallbackDefault + 33;
        com.google.android.gms.internal.p000firebaseauthapi.zzwn.onTransact = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
    
        if ((r7 % 2) == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
    
        if (r8.equals(r9) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e1, code lost:
    
        r13 = r13.add(r9);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e8, code lost:
    
        if (r6 != 128) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        if ((!r1.isProbablePrime(80)) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f9, code lost:
    
        throw new java.security.InvalidAlgorithmParameterException("p is not prime");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        throw new java.security.InvalidAlgorithmParameterException("p is not prime");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0100, code lost:
    
        r8.equals(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0103, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0104, code lost:
    
        r2 = r1.add(r9).shiftRight(1);
        r3 = r2.bitLength() - 2;
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0112, code lost:
    
        if (r3 < 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0114, code lost:
    
        r6 = r5.multiply(r9);
        r5 = r5.multiply(r5).add(r9.multiply(r9).mod(r1).multiply(r7)).mod(r1);
        r6 = r6.add(r6).mod(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013c, code lost:
    
        if (r2.testBit(r3) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013e, code lost:
    
        r8 = com.google.android.gms.internal.p000firebaseauthapi.zzwn.onTransact + 25;
        com.google.android.gms.internal.p000firebaseauthapi.zzwn.IAuthTabCallbackDefault = r8 % 128;
        r8 = r8 % 2;
        r8 = r5.multiply(r13).add(r6.multiply(r7)).mod(r1);
        r9 = r13.multiply(r6).add(r5).mod(r1);
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0166, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0167, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016a, code lost:
    
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016c, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016d, code lost:
    
        if (r13 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017b, code lost:
    
        if (r13.multiply(r13).mod(r1).compareTo(r11) != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017d, code lost:
    
        r11 = com.google.android.gms.internal.p000firebaseauthapi.zzwn.onTransact + 43;
        com.google.android.gms.internal.p000firebaseauthapi.zzwn.IAuthTabCallbackDefault = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0186, code lost:
    
        if ((r11 % 2) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0188, code lost:
    
        r11 = 4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0192, code lost:
    
        throw new java.security.GeneralSecurityException("Could not find a modular square root");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if (r1.signum() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0197, code lost:
    
        if (r12 == r13.testBit(0)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a1, code lost:
    
        return r1.subtract(r13).mod(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a2, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01aa, code lost:
    
        throw new java.security.InvalidAlgorithmParameterException("p must be positive");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005a, code lost:
    
        if (r1.signum() == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005c, code lost:
    
        r11 = r11.mod(r1);
        r13 = java.math.BigInteger.ZERO;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static BigInteger zza(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerZza;
        BigInteger bigIntegerMod;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 99;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            bigIntegerZza = zzmd.zza(ellipticCurve);
            bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerZza);
        } else {
            bigIntegerZza = zzmd.zza(ellipticCurve);
            bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerZza);
        }
    }

    public static ECPrivateKey zza(zzwq zzwqVar, byte[] bArr) throws Throwable {
        int i2 = 2 % 2;
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(zzmb.zza(bArr), zza(zzwqVar));
        zzwr<zzxe, KeyFactory> zzwrVar = zzwr.zze;
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 112), (byte) (8 - View.combineMeasuredStates(0, 0)), 406079384 - TextUtils.lastIndexOf("", '0'), TextUtils.indexOf((CharSequence) "", '0', 0) - 104235173, (-16) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        ECPrivateKey eCPrivateKey = (ECPrivateKey) zzwrVar.zza(((String) objArr[0]).intern()).generatePrivate(eCPrivateKeySpec);
        int i3 = IAuthTabCallbackDefault + 11;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return eCPrivateKey;
    }

    public static ECPublicKey zza(zzwq zzwqVar, zzwp zzwpVar, byte[] bArr) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 93;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        ECParameterSpec eCParameterSpecZza = zza(zzwqVar);
        if (i4 == 0) {
            zza(eCParameterSpecZza, zzwpVar, bArr);
            throw null;
        }
        ECPublicKey eCPublicKeyZza = zza(eCParameterSpecZza, zzwpVar, bArr);
        int i5 = IAuthTabCallbackDefault + 13;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return eCPublicKeyZza;
    }

    public static ECPublicKey zza(ECParameterSpec eCParameterSpec, zzwp zzwpVar, byte[] bArr) throws Throwable {
        int i2 = 2 % 2;
        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(zza(eCParameterSpec.getCurve(), zzwpVar, bArr), eCParameterSpec);
        zzwr<zzxe, KeyFactory> zzwrVar = zzwr.zze;
        Object[] objArr = new Object[1];
        a((short) (113 - TextUtils.getOffsetAfter("", 0)), (byte) (8 - View.combineMeasuredStates(0, 0)), 406079386 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) - 104235173, Color.blue(0) - 15, objArr);
        ECPublicKey eCPublicKey = (ECPublicKey) zzwrVar.zza(((String) objArr[0]).intern()).generatePublic(eCPublicKeySpec);
        int i3 = onTransact + 3;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return eCPublicKey;
        }
        throw null;
    }

    public static ECParameterSpec zza(zzwq zzwqVar) throws NoSuchAlgorithmException {
        int i2 = 2 % 2;
        int iOrdinal = zzwqVar.ordinal();
        if (iOrdinal != 0) {
            int i3 = IAuthTabCallbackDefault;
            int i4 = i3 + 1;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (iOrdinal == 1) {
                return zzmd.zzb;
            }
            int i6 = i3 + 45;
            onTransact = i6 % 128;
            if (i6 % 2 != 0 ? iOrdinal == 2 : iOrdinal == 3) {
                return zzmd.zzc;
            }
            throw new NoSuchAlgorithmException("curve not implemented:" + String.valueOf(zzwqVar));
        }
        ECParameterSpec eCParameterSpec = zzmd.zza;
        int i7 = IAuthTabCallbackDefault + 15;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return eCParameterSpec;
    }

    public static ECPoint zza(EllipticCurve ellipticCurve, zzwp zzwpVar, byte[] bArr) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int iZza = zza(ellipticCurve);
        int iOrdinal = zzwpVar.ordinal();
        if (iOrdinal == 0) {
            if (bArr.length != (iZza * 2) + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i3 = iZza + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i3)), new BigInteger(1, Arrays.copyOfRange(bArr, i3, bArr.length)));
            zzmd.zza(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new GeneralSecurityException("invalid format:" + String.valueOf(zzwpVar));
            }
            int i4 = onTransact + 9;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (bArr.length != iZza * 2) {
                throw new GeneralSecurityException("invalid point size");
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, iZza)), new BigInteger(1, Arrays.copyOfRange(bArr, iZza, bArr.length)));
            zzmd.zza(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        BigInteger bigIntegerZza = zzmd.zza(ellipticCurve);
        if (bArr.length != iZza + 1) {
            throw new GeneralSecurityException("compressed point has wrong length");
        }
        byte b = bArr[0];
        if (b != 2) {
            if (b != 3) {
                throw new GeneralSecurityException("invalid format");
            }
            int i6 = onTransact;
            int i7 = i6 + 79;
            IAuthTabCallbackDefault = i7 % 128;
            z = i7 % 2 == 0;
            int i8 = i6 + 117;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
        if (bigInteger.signum() != -1) {
            int i10 = onTransact + 43;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
            if (bigInteger.compareTo(bigIntegerZza) < 0) {
                ECPoint eCPoint3 = new ECPoint(bigInteger, zza(bigInteger, z, ellipticCurve));
                int i12 = onTransact + 49;
                IAuthTabCallbackDefault = i12 % 128;
                if (i12 % 2 == 0) {
                    return eCPoint3;
                }
                throw null;
            }
        }
        throw new GeneralSecurityException("x is out of range");
    }

    public static void zza(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 123;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        zzb(eCPublicKey, eCPrivateKey);
        zzmd.zza(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
        int i5 = IAuthTabCallbackDefault + 101;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
    }

    private static void zzb(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = onTransact + 83;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (!zzmd.zza(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            int i5 = IAuthTabCallbackDefault + 45;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static byte[] zza(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws Throwable {
        byte[] bArrZza;
        int i2 = 2 % 2;
        int i3 = onTransact + 123;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            zzb(eCPublicKey, eCPrivateKey);
            bArrZza = zza(eCPrivateKey, eCPublicKey.getW());
            int i4 = 94 / 0;
        } else {
            zzb(eCPublicKey, eCPrivateKey);
            bArrZza = zza(eCPrivateKey, eCPublicKey.getW());
        }
        int i5 = onTransact + 123;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return bArrZza;
    }

    private static byte[] zza(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws Throwable {
        int i2 = 2 % 2;
        zzmd.zza(eCPoint, eCPrivateKey.getParams().getCurve());
        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams());
        zzwr<zzxe, KeyFactory> zzwrVar = zzwr.zze;
        Object[] objArr = new Object[1];
        a((short) (113 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8), 406079385 - TextUtils.indexOf("", "", 0, 0), (-104235174) - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.lastIndexOf("", '0') - 14, objArr);
        PublicKey publicKeyGeneratePublic = zzwrVar.zza(((String) objArr[0]).intern()).generatePublic(eCPublicKeySpec);
        KeyAgreement keyAgreementZza = zzwr.zzc.zza("ECDH");
        keyAgreementZza.init(eCPrivateKey);
        try {
            keyAgreementZza.doPhase(publicKeyGeneratePublic, true);
            byte[] bArrGenerateSecret = keyAgreementZza.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
            if (bigInteger.signum() != -1) {
                int i3 = onTransact + 19;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                if (bigInteger.compareTo(zzmd.zza(curve)) < 0) {
                    int i5 = IAuthTabCallbackDefault + 65;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    zza(bigInteger, true, curve);
                    return bArrGenerateSecret;
                }
            }
            throw new GeneralSecurityException("shared secret is out of range");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }

    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        boolean z;
        int i5;
        int length;
        byte[] bArr;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 41, MotionEvent.axisFromString("") + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                z = true;
            } else {
                int i8 = $11 + 35;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                z = false;
            }
            if (z) {
                int i10 = $11 + 69;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                byte[] bArr2 = onExtraCallbackWithResult;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        int i12 = $10 + 75;
                        $11 = i12 % 128;
                        if (i12 % i6 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i11])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char cIndexOf = (char) (12843 - TextUtils.indexOf("", "", 0));
                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 55;
                                int iRgb = Color.rgb(0, 0, 0) + 16779383;
                                byte b2 = (byte) ($$a[1] + 1);
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, jumpTapTimeout, iRgb, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr3[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).byteValue();
                            i11 >>>= 1;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i11])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                char c = (char) (12843 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                int defaultSize = 55 - View.getDefaultSize(0, 0);
                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2167;
                                byte b4 = (byte) ($$a[1] + 1);
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c, defaultSize, touchSlop, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr3[i11] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i11++;
                        }
                        i6 = 2;
                        obj = null;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = onExtraCallbackWithResult;
                    Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 43425), 42 - Color.red(0), View.resolveSizeAndState(0, 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onNavigationEvent[i2 + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i13 = $10 + 93;
                int i14 = i13 % 128;
                $11 = i14;
                int i15 = i13 % 2;
                int i16 = ((i2 + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                if (z) {
                    int i17 = i14 + 33;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i16 + i5;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), View.MeasureSpec.getMode(0) + 86, View.resolveSize(0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallbackWithResult;
                if (bArr5 != null) {
                    int i19 = $10 + 29;
                    $11 = i19 % 128;
                    if (i19 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i20 = 0; i20 < length; i20++) {
                        bArr[i20] = (byte) (bArr5[i20] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr;
                }
                boolean z2 = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!z2) {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
