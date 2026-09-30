package org.bouncycastle.crypto.util;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class OpenSSHPublicKeyUtil {
    private static final String DSS = "ssh-dss";
    private static final String ECDSA = "ecdsa";
    private static final String ED_25519 = "ssh-ed25519";
    private static short[] IAuthTabCallback = null;
    private static final String RSA = "ssh-rsa";
    private static final byte[] $$a = {ISO7816.INS_DECREASE, 86, 58, 71};
    private static final int $$b = 116;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent = 132872977;
    private static int onExtraCallback = -1538795399;
    private static int onWarmupCompleted = -829021024;
    private static byte[] onExtraCallbackWithResult = {-70, -108, -99, -82, -97, -84, -100, -124, -82, -102, 94, -27, -112, -102, 93, -26, ISOFileInfo.DATA_BYTES2, -71, 76, -26, -110, -122, -94, ISOFileInfo.DATA_BYTES1, -81, ISOFileInfo.FCI_EXT, -92, -126, -126, -52, -113, -119, -103, ISOFileInfo.A5, -110};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i;
        int i2 = s * 2;
        int i3 = 115 - (s2 * 3);
        byte[] bArr = $$a;
        int i4 = 3 - (s3 * 2);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i5;
            int i7 = i4;
            int i8 = 0;
            int i9 = i4 + (-i6);
            i = i8;
            i4 = i7;
            i3 = i9;
            bArr2[i] = (byte) i3;
            int i10 = i4 + 1;
            i8 = i + 1;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i10];
            i4 = i3;
            i7 = i10;
            int i92 = i4 + (-i6);
            i = i8;
            i4 = i7;
            i3 = i92;
            bArr2[i] = (byte) i3;
            int i102 = i4 + 1;
            i8 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            int i1022 = i4 + 1;
            i8 = i + 1;
            if (i == i5) {
            }
        }
    }

    private OpenSSHPublicKeyUtil() {
    }

    public static byte[] encodePublicKey(AsymmetricKeyParameter asymmetricKeyParameter) throws Throwable {
        SSHBuilder sSHBuilder;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 63;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (asymmetricKeyParameter == null) {
            throw new IllegalArgumentException("cipherParameters was null.");
        }
        int i4 = i2 + 85;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            boolean z = asymmetricKeyParameter instanceof RSAKeyParameters;
            obj.hashCode();
            throw null;
        }
        if (asymmetricKeyParameter instanceof RSAKeyParameters) {
            if (asymmetricKeyParameter.isPrivate()) {
                Object[] objArr = new Object[1];
                a((short) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) - 28), (byte) (126 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1548967142, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1792146519, (ViewConfiguration.getScrollDefaultDelay() >> 16) - 114, objArr);
                throw new IllegalArgumentException(((String) objArr[0]).intern());
            }
            RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) asymmetricKeyParameter;
            SSHBuilder sSHBuilder2 = new SSHBuilder();
            sSHBuilder2.writeString(RSA);
            sSHBuilder2.writeBigNum(rSAKeyParameters.getExponent());
            sSHBuilder2.writeBigNum(rSAKeyParameters.getModulus());
            byte[] bytes = sSHBuilder2.getBytes();
            int i5 = IAuthTabCallbackDefault + 111;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return bytes;
        }
        if (asymmetricKeyParameter instanceof ECPublicKeyParameters) {
            sSHBuilder = new SSHBuilder();
            ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) asymmetricKeyParameter;
            String nameForParameters = SSHNamedCurves.getNameForParameters(eCPublicKeyParameters.getParameters());
            if (nameForParameters == null) {
                throw new IllegalArgumentException("unable to derive ssh curve name for " + eCPublicKeyParameters.getParameters().getCurve().getClass().getName());
            }
            sSHBuilder.writeString("ecdsa-sha2-" + nameForParameters);
            sSHBuilder.writeString(nameForParameters);
            sSHBuilder.writeBlock(eCPublicKeyParameters.getQ().getEncoded(false));
        } else {
            if (asymmetricKeyParameter instanceof DSAPublicKeyParameters) {
                DSAPublicKeyParameters dSAPublicKeyParameters = (DSAPublicKeyParameters) asymmetricKeyParameter;
                DSAParameters parameters = dSAPublicKeyParameters.getParameters();
                SSHBuilder sSHBuilder3 = new SSHBuilder();
                sSHBuilder3.writeString(DSS);
                sSHBuilder3.writeBigNum(parameters.getP());
                sSHBuilder3.writeBigNum(parameters.getQ());
                sSHBuilder3.writeBigNum(parameters.getG());
                sSHBuilder3.writeBigNum(dSAPublicKeyParameters.getY());
                return sSHBuilder3.getBytes();
            }
            if (!(asymmetricKeyParameter instanceof Ed25519PublicKeyParameters)) {
                throw new IllegalArgumentException("unable to convert " + asymmetricKeyParameter.getClass().getName() + " to private key");
            }
            sSHBuilder = new SSHBuilder();
            sSHBuilder.writeString(ED_25519);
            sSHBuilder.writeBlock(((Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded());
        }
        return sSHBuilder.getBytes();
    }

    public static AsymmetricKeyParameter parsePublicKey(SSHBuffer sSHBuffer) {
        AsymmetricKeyParameter eCPublicKeyParameters;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String string = sSHBuffer.readString();
        Object obj = null;
        if (RSA.equals(string)) {
            eCPublicKeyParameters = new RSAKeyParameters(false, sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive());
        } else if (DSS.equals(string)) {
            eCPublicKeyParameters = new DSAPublicKeyParameters(sSHBuffer.readBigNumPositive(), new DSAParameters(sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive()));
        } else if (!(!string.startsWith(ECDSA))) {
            String string2 = sSHBuffer.readString();
            ASN1ObjectIdentifier byName = SSHNamedCurves.getByName(string2);
            X9ECParameters parameters = SSHNamedCurves.getParameters(byName);
            if (parameters == null) {
                throw new IllegalStateException("unable to find curve for " + string + " using curve name " + string2);
            }
            eCPublicKeyParameters = new ECPublicKeyParameters(parameters.getCurve().decodePoint(sSHBuffer.readBlock()), new ECNamedDomainParameters(byName, parameters));
        } else if (ED_25519.equals(string)) {
            byte[] block = sSHBuffer.readBlock();
            if (block.length != 32) {
                throw new IllegalStateException("public key value of wrong length");
            }
            eCPublicKeyParameters = new Ed25519PublicKeyParameters(block, 0);
        } else {
            int i4 = IAuthTabCallbackDefault + 121;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 4;
            }
            eCPublicKeyParameters = null;
        }
        if (eCPublicKeyParameters == null) {
            throw new IllegalArgumentException("unable to parse key");
        }
        int i6 = IAuthTabCallbackDefault + 7;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        if (!(!sSHBuffer.hasRemaining())) {
            throw new IllegalArgumentException("decoded key has trailing data");
        }
        int i8 = IAuthTabCallbackDefault + 89;
        asInterface = i8 % 128;
        if (i8 % 2 != 0) {
            return eCPublicKeyParameters;
        }
        obj.hashCode();
        throw null;
    }

    public static AsymmetricKeyParameter parsePublicKey(byte[] bArr) {
        int i = 2 % 2;
        AsymmetricKeyParameter publicKey = parsePublicKey(new SSHBuffer(bArr));
        int i2 = IAuthTabCallbackDefault + 121;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return publicKey;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[PHI: r12
      0x0085: PHI (r12v4 byte[] A[IMMUTABLE_TYPE]) = (r12v3 byte[]), (r12v7 byte[]) binds: [B:18:0x0083, B:15:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ac A[PHI: r0
      0x01ac: PHI (r0v9 int) = (r0v8 int), (r0v44 int) binds: [B:43:0x01aa, B:40:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ae A[PHI: r0
      0x01ae: PHI (r0v41 int) = (r0v8 int), (r0v44 int) binds: [B:43:0x01aa, B:40:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        byte[] bArr;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - ((Process.getThreadPriority(0) + 20) >> 6)), 42 - View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollBarSize() >> 8) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                int i7 = $10;
                int i8 = i7 + 35;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    bArr = onExtraCallbackWithResult;
                    int i9 = 31 / 0;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i10 = i7 + 81;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        for (int i12 = 0; i12 < length; i12++) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12842), 55 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), View.MeasureSpec.getSize(0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr == null) {
                        byte[] bArr3 = onExtraCallbackWithResult;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - MotionEvent.axisFromString(BuildConfig.FLAVOR)), (ViewConfiguration.getEdgeSlop() >> 16) + 42, 22439 - KeyEvent.getDeadChar(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    }
                } else {
                    bArr = onExtraCallbackWithResult;
                    if (bArr != null) {
                    }
                    if (bArr == null) {
                    }
                }
            }
            if (iIntValue > 0) {
                int i13 = $10 + 35;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    i4 = ((i + iIntValue) % 5) - ((int) (onNavigationEvent - (-4629411779493505016L)));
                    i5 = z ? 1 : 0;
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                    if (z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                try {
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 86 - KeyEvent.normalizeMetaState(0), 9567 - Color.blue(0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallbackWithResult;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i14 = 0;
                        while (i14 < length2) {
                            int i15 = $11 + 19;
                            $10 = i15 % 128;
                            if (i15 % 2 != 0) {
                                bArr5[i14] = (byte) (bArr4[i14] * (-4629411779493505016L));
                                i14 >>= 1;
                            } else {
                                bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                                i14++;
                            }
                        }
                        int i16 = $11 + 33;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            byte[] bArr6 = onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
