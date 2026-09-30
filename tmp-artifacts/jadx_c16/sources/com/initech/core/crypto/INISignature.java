package com.initech.core.crypto;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.initech.asn1.ASN1Exception;
import com.initech.core.INISAFECore;
import com.initech.core.util.LogUtil;
import com.initech.cryptox.Signature;
import com.initech.pki.util.Hex;
import com.initech.pkix.cmp.client.CMPException;
import com.initech.provider.crypto.InitechProvider;
import com.initech.provider.crypto.kcdsa.KCDSAPublicKeyImpl;
import com.initech.provider.crypto.kcdsa.KCDSASignedData;
import com.initech.provider.crypto.kcdsa.SHA1withKCDSA;
import com.initech.provider.crypto.rsa.RSAAutoSignature;
import com.initech.provider.crypto.rsa.RSAPKCS1v15Signature;
import com.initech.provider.crypto.rsa.RSAPSSSignature;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class INISignature extends CryptoVerification {
    private static final byte[] $$a = {104, -2, 24, -74};
    private static final int $$b = 219;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = 7798559133331975163L;
    private static int onNavigationEvent = -1776194565;
    private static char IAuthTabCallback = 15770;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = (s2 * 2) + 4;
        int i5 = i * 4;
        int i6 = s + CMPException.METHOD_checkPKIStatusInfo;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i4;
            int i9 = 0;
            i4 += -i6;
            i3 = i8 + 1;
            i2 = i9;
            bArr2[i2] = (byte) i4;
            if (i2 == i7) {
                return new String(bArr2, 0);
            }
            int i10 = i2 + 1;
            i8 = i3;
            i6 = bArr[i3];
            i9 = i10;
            i4 += -i6;
            i3 = i8 + 1;
            i2 = i9;
            bArr2[i2] = (byte) i4;
            if (i2 == i7) {
            }
        } else {
            i2 = 0;
            i4 = i6;
            i3 = i4;
            bArr2[i2] = (byte) i4;
            if (i2 == i7) {
            }
        }
    }

    public byte[] KCDSASign(PrivateKey privateKey, byte[] bArr) throws Exception {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrDoSign = doSign(privateKey, bArr, "HAS160withKCDSA", InitechProvider.NAME);
        int i4 = onWarmupCompleted + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return bArrDoSign;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean KCDSASignVerify(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, byte[] bArr, byte[] bArr2) throws SignatureException, InvalidKeyException {
        int i = 2 % 2;
        try {
            PublicKey kCDSAPublicKeyImpl = new KCDSAPublicKeyImpl(bigInteger, bigInteger2, bigInteger3, bigInteger4);
            SHA1withKCDSA sHA1withKCDSA = new SHA1withKCDSA();
            sHA1withKCDSA.initVerify(kCDSAPublicKeyImpl);
            sHA1withKCDSA.update(bArr);
            return sHA1withKCDSA.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException unused) {
            int i2 = onWarmupCompleted + 105;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 91 / 0;
            }
            return false;
        }
    }

    public boolean KCDSASignVerify(PublicKey publicKey, byte[] bArr, byte[] bArr2) throws Exception {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zDoVerify = doVerify(publicKey, bArr, "HAS160withKCDSA", bArr2);
        int i4 = onWarmupCompleted + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return zDoVerify;
    }

    public byte[] RSAPKCS1v15Sign(PrivateKey privateKey, String str, byte[] bArr) throws Exception {
        int i = 2 % 2;
        try {
            Signature rSAPKCS1v15Signature = new RSAPKCS1v15Signature(str);
            rSAPKCS1v15Signature.initSign(privateKey);
            rSAPKCS1v15Signature.update(bArr);
            byte[] bArrSign = rSAPKCS1v15Signature.sign();
            int i2 = onWarmupCompleted + 11;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return bArrSign;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (NoSuchAlgorithmException e) {
            INISAFECore.CoreLogger(1, "지원하지 않는 알고리즘 입니다. (알고리즘: " + str + ")");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e);
            throw new NoSuchAlgorithmException("No such Algorithm: " + str);
        } catch (Exception e2) {
            Object[] objArr = new Object[1];
            b((char) (59849 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-1729979773) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{60854, 53970, 24440, 63732, 58769, 55610, 41262, 38345, 64080, 51182, 12681, 28540, 11894, 11371, 57628, 29541, 13958, 63367, 55004, 56991, 13191, 37891, 39445, 60643, 2517, 42166, 8740, 31949, 1829, 12299, 45508, 61516, 265, 33378, 23206, 52580, 6124, 24795, 2242, 7693, 26450}, new char[]{0, 0, 0, 0}, new char[]{33338, 58010, 51864, 44009}, objArr);
            INISAFECore.CoreLogger(1, ((String) objArr[0]).intern() + Hex.dumpHex(privateKey.getEncoded()) + "],alg=[" + str + "], msg=[" + Hex.dumpHex(bArr) + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e2);
            throw new Exception();
        }
    }

    public byte[] RSAPKCS1v15Sign(PrivateKey privateKey, byte[] bArr) throws Exception {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrRSAPKCS1v15Sign = RSAPKCS1v15Sign(privateKey, "SHA1", bArr);
        int i4 = onExtraCallback + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return bArrRSAPKCS1v15Sign;
    }

    public boolean RSAPKCS1v15SignVerify(PublicKey publicKey, byte[] bArr, String str, byte[] bArr2) throws Exception {
        int i = 2 % 2;
        try {
            Signature rSAPKCS1v15Signature = new RSAPKCS1v15Signature(str);
            rSAPKCS1v15Signature.initVerify(publicKey);
            rSAPKCS1v15Signature.update(bArr);
            boolean zVerify = rSAPKCS1v15Signature.verify(bArr2);
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return zVerify;
        } catch (NoSuchAlgorithmException e) {
            INISAFECore.CoreLogger(1, "지원하지 않는 알고리즘 입니다. (알고리즘: " + str + ")");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e);
            throw new NoSuchAlgorithmException("No such Algorithm: " + str);
        } catch (Exception e2) {
            Object[] objArr = new Object[1];
            b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 51334), View.MeasureSpec.getSize(0) + 893771458, new char[]{3557, 45811, 51191, 14047, 53672, 11400, 57902, 17157, 11837, 9814, 31850, 50817, 19172, 65022, 27898, 16695, 26181, 50476, 10740, 1437, 52307, 56634, 59617, 55946, 5186, 3209, 56437, 51976, 4165, 59063, 38319, 34216, 38206, 52292, 53601, 29187, 50493, 26087, 580, 6847, 57142, 43524, 38282}, new char[]{0, 0, 0, 0}, new char[]{49889, 17886, 34357, 52936}, objArr);
            INISAFECore.CoreLogger(1, ((String) objArr[0]).intern() + Hex.dumpHex(publicKey.getEncoded()) + "], msg=[" + Hex.dumpHex(bArr) + "], alg=[" + str + "], signature=[" + Hex.dumpHex(bArr2) + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e2);
            throw new Exception();
        }
    }

    public boolean RSAPKCS1v15SignVerify(PublicKey publicKey, byte[] bArr, byte[] bArr2) throws Exception {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zRSAPKCS1v15SignVerify = RSAPKCS1v15SignVerify(publicKey, bArr, "SHA1", bArr2);
        int i4 = onExtraCallback + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zRSAPKCS1v15SignVerify;
    }

    public byte[] RSAPSSSign(PrivateKey privateKey, String str, byte[] bArr) throws Exception {
        int i = 2 % 2;
        try {
            MessageDigest.getInstance(str);
            RSAPSSSignature rSAPSSSignature = new RSAPSSSignature(str);
            rSAPSSSignature.initSign(privateKey);
            rSAPSSSignature.update(bArr);
            byte[] bArrSign = rSAPSSSignature.sign();
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return bArrSign;
        } catch (NoSuchAlgorithmException e) {
            INISAFECore.CoreLogger(1, "지원하지 않는 알고리즘 입니다. (알고리즘: " + str + ")");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e);
            throw new NoSuchAlgorithmException("No such Algorithm");
        } catch (Exception e2) {
            Object[] objArr = new Object[1];
            b((char) TextUtils.getOffsetAfter("", 0), Color.blue(0), new char[]{34807, 36837, 40007, 9015, 15034, 37781, 23420, 33871, 54330, 56486, 62409, 15026, 63850, 50521, 50363, 27630, 36166, 7256, 1373, 1066, 15186, 16274, 12328, 54905, 8654, 32176, 13890, 23613, 6477, 51452, 18697, 3449, 7742, 61617}, new char[]{0, 0, 0, 0}, new char[]{45915, 2349, 6036, 16435}, objArr);
            INISAFECore.CoreLogger(1, ((String) objArr[0]).intern() + Hex.dumpHex(privateKey.getEncoded()) + "], msg=[" + Hex.dumpHex(bArr) + "], alg=sha1");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e2);
            throw new Exception();
        }
    }

    public boolean RSAPSSSignVerify(PublicKey publicKey, byte[] bArr, String str, byte[] bArr2) throws Exception {
        int i = 2 % 2;
        try {
            MessageDigest.getInstance(str);
            RSAPSSSignature rSAPSSSignature = new RSAPSSSignature(str);
            rSAPSSSignature.initVerify(publicKey);
            rSAPSSSignature.update(bArr);
            boolean zVerify = rSAPSSSignature.verify(bArr2);
            int i2 = onWarmupCompleted + 109;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return zVerify;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (NoSuchAlgorithmException e) {
            INISAFECore.CoreLogger(1, "지원하지 않는 알고리즘 입니다. (알고리즘: " + str + ")");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e);
            throw new NoSuchAlgorithmException("No such Algorithm: " + str);
        } catch (Exception e2) {
            Object[] objArr = new Object[1];
            b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{61608, 22270, 21867, 2728, 26161, 26142, 52991, 44667, 12618, 55644, 60345, 61709, 42497, 35669, 1413, 1116, 15630, 48922, 45405, 61051, 52262, 15157, 53074, 2593, 42961, 11407, 27281, 32503, 60618, 2394, 714, 43586, 29345, 11957, 12574, 49887, 62130, 29845}, new char[]{0, 0, 0, 0}, new char[]{50772, 10099, 44847, 17212}, objArr);
            INISAFECore.CoreLogger(1, ((String) objArr[0]).intern() + Hex.dumpHex(publicKey.getEncoded()) + "], msg=[" + Hex.dumpHex(bArr) + "],alg=[" + str + "], signature=[" + Hex.dumpHex(bArr2) + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e2);
            throw new Exception();
        }
    }

    public boolean RSAPSSSignVerify(PublicKey publicKey, byte[] bArr, byte[] bArr2) throws Exception {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zRSAPSSSignVerify = RSAPSSSignVerify(publicKey, bArr, "SHA1", bArr2);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        return zRSAPSSSignVerify;
    }

    public byte[] doSign(PrivateKey privateKey, String str, byte[] bArr, String str2) throws Exception {
        String str3;
        int i = 2 % 2;
        try {
            if (str.equalsIgnoreCase("kcdsa1")) {
                if (str2.equalsIgnoreCase("HAS160")) {
                    str3 = "HAS160withKCDSA";
                } else {
                    if (!str2.equalsIgnoreCase("SHA256")) {
                        return null;
                    }
                    int i2 = onWarmupCompleted + 105;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    str3 = "SHA256withKCDSA";
                }
                return doSign(privateKey, bArr, str3);
            }
            b((char) (59856 - TextUtils.indexOf("", "", 0, 0)), KeyEvent.getDeadChar(0, 0) - 1749326078, new char[]{15876, 14439, 63036, 57480, 50378}, new char[]{0, 0, 0, 0}, new char[]{665, 47975, 53399, 21993}, new Object[1]);
            if (!(!str.equalsIgnoreCase(((String) r0[0]).intern()))) {
                int i4 = onWarmupCompleted + 87;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return RSAPKCS1v15Sign(privateKey, str2, bArr);
                }
                int i5 = 60 / 0;
                return RSAPKCS1v15Sign(privateKey, str2, bArr);
            }
            if (str.equalsIgnoreCase("PSS")) {
                int i6 = onWarmupCompleted + 113;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return RSAPSSSign(privateKey, str2, bArr);
            }
            java.security.Signature signature = java.security.Signature.getInstance(str, "Initech");
            signature.initSign(privateKey);
            signature.update(bArr);
            byte[] bArrSign = signature.sign();
            int i8 = onWarmupCompleted + 61;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return bArrSign;
        } catch (NoSuchAlgorithmException e) {
            INISAFECore.CoreLogger(1, "지원하지 않는 알고리즘 입니다. (알고리즘: " + str + ")");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e);
            throw new NoSuchAlgorithmException("No such Algorithm: " + str);
        } catch (Exception e2) {
            INISAFECore.CoreLogger(1, "전자서명 수행 중 오류가 발생했습니다. privateKey=[" + Hex.dumpHex(privateKey.getEncoded()) + "], msg=[" + Hex.dumpHex(bArr) + "], alg=[" + str + "], hashalg=[" + str2 + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e2);
            throw new Exception(e2);
        }
    }

    public byte[] doSign(PrivateKey privateKey, byte[] bArr, String str) throws Exception {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            doSign(privateKey, bArr, str, InitechProvider.NAME);
            throw null;
        }
        byte[] bArrDoSign = doSign(privateKey, bArr, str, InitechProvider.NAME);
        int i3 = onWarmupCompleted + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 60 / 0;
        }
        return bArrDoSign;
    }

    public byte[] doSign(PrivateKey privateKey, byte[] bArr, String str, String str2) throws Exception {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onWarmupCompleted = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                java.security.Signature signature = java.security.Signature.getInstance(str, str2);
                signature.initSign(privateKey);
                signature.update(bArr);
                return signature.sign();
            }
            java.security.Signature signature2 = java.security.Signature.getInstance(str, str2);
            signature2.initSign(privateKey);
            signature2.update(bArr);
            signature2.sign();
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (NoSuchAlgorithmException e) {
            INISAFECore.CoreLogger(1, "지원하지 않는 알고리즘 입니다. (알고리즘: " + str + ")");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e);
            throw new NoSuchAlgorithmException("No such Algorithm: " + str);
        } catch (NoSuchProviderException e2) {
            INISAFECore.CoreLogger(1, "provider를 찾을 수 없습니다. (provider: " + str2 + ")");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e2);
            throw new NoSuchProviderException("No such Provider: " + str2);
        } catch (Exception e3) {
            INISAFECore.CoreLogger(1, "전자서명 수행 중 오류가 발생했습니다. privateKey=[" + Hex.dumpHex(privateKey.getEncoded()) + "], msg=[" + Hex.dumpHex(bArr) + "], alg=[" + str + "], provider=[" + str2 + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e3);
            throw new Exception(e3);
        }
    }

    public boolean doVerify(PublicKey publicKey, String str, byte[] bArr, String str2, String str3, byte[] bArr2) throws Exception {
        int i = 2 % 2;
        try {
            Object[] objArr = new Object[1];
            b((char) (ExpandableListView.getPackedPositionChild(0L) + 59857), (-1749326078) - Color.argb(0, 0, 0, 0), new char[]{15876, 14439, 63036, 57480, 50378}, new char[]{0, 0, 0, 0}, new char[]{665, 47975, 53399, 21993}, objArr);
            if (str2.equalsIgnoreCase(((String) objArr[0]).intern())) {
                return RSAPKCS1v15SignVerify(publicKey, bArr, str, bArr2);
            }
            if (!str2.equalsIgnoreCase("PSS")) {
                java.security.Signature signature = java.security.Signature.getInstance(str2, str3);
                signature.initVerify(publicKey);
                signature.update(bArr);
                return signature.verify(bArr2);
            }
            int i2 = onExtraCallback + 73;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                RSAPSSSignVerify(publicKey, bArr, str, bArr2);
                throw null;
            }
            boolean zRSAPSSSignVerify = RSAPSSSignVerify(publicKey, bArr, str, bArr2);
            int i3 = onWarmupCompleted + 13;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return zRSAPSSSignVerify;
            }
            throw null;
        } catch (NoSuchAlgorithmException e) {
            INISAFECore.CoreLogger(1, "지원하지 않는 알고리즘 입니다. (알고리즘: " + str2 + ")");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e);
            throw new NoSuchAlgorithmException("No such Algorithm: " + str2);
        } catch (Exception e2) {
            INISAFECore.CoreLogger(1, "전자서명 검증 중 오류가 발생했습니다. publickey=[" + Hex.dumpHex(publicKey.getEncoded()) + "], msg=[" + Hex.dumpHex(bArr) + "], alg=[" + str2 + "], provider=[" + str3 + "], signature=[" + Hex.dumpHex(bArr2) + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e2);
            throw new Exception();
        }
    }

    public boolean doVerify(PublicKey publicKey, String str, byte[] bArr, String str2, byte[] bArr2) throws Exception {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return doVerify(publicKey, str, bArr, str2, InitechProvider.NAME, bArr2);
        }
        doVerify(publicKey, str, bArr, str2, InitechProvider.NAME, bArr2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.security.Key] */
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    public boolean doVerify(PublicKey publicKey, byte[] bArr, String str, String str2, byte[] bArr2) throws Exception {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                java.security.Signature signature = java.security.Signature.getInstance(str, str2);
                signature.initVerify((PublicKey) publicKey);
                signature.update(bArr);
                publicKey = signature.verify(bArr2);
                bArr = 3 / 0;
            } else {
                java.security.Signature signature2 = java.security.Signature.getInstance(str, str2);
                signature2.initVerify((PublicKey) publicKey);
                signature2.update(bArr);
                publicKey = signature2.verify(bArr2);
                bArr = bArr;
            }
            return publicKey;
        } catch (NoSuchAlgorithmException e) {
            INISAFECore.CoreLogger(1, "지원하지 않는 알고리즘 입니다. (알고리즘: " + str + ")");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e);
            throw new NoSuchAlgorithmException("No such Algorithm: " + str);
        } catch (Exception e2) {
            INISAFECore.CoreLogger(1, "전자서명 검증 중 오류가 발생했습니다. publickey=[" + Hex.dumpHex(publicKey.getEncoded()) + "], msg=[" + Hex.dumpHex(bArr) + "], alg=[" + str + "], provider=[" + str2 + "], signature=[" + Hex.dumpHex(bArr2) + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e2);
            throw new Exception();
        }
    }

    public boolean doVerify(PublicKey publicKey, byte[] bArr, String str, byte[] bArr2) throws Exception {
        boolean zDoVerify;
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            zDoVerify = doVerify(publicKey, bArr, str, InitechProvider.NAME, bArr2);
            int i3 = 48 / 0;
        } else {
            zDoVerify = doVerify(publicKey, bArr, str, InitechProvider.NAME, bArr2);
        }
        int i4 = onWarmupCompleted + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zDoVerify;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[Catch: Exception -> 0x001b, PHI: r1
      0x0023: PHI (r1v6 int) = (r1v5 int), (r1v11 int) binds: [B:11:0x0021, B:6:0x0018] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x001b, blocks: (B:4:0x0011, B:14:0x0030, B:12:0x0023, B:10:0x001d), top: B:19:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean doVerify(PublicKey publicKey, byte[] bArr, byte[] bArr2, String str) {
        int iIndexOf;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallback = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                iIndexOf = str.indexOf("with");
                int i3 = 75 / 0;
                if (iIndexOf >= 0) {
                    str = str.substring(0, iIndexOf);
                    int i4 = onWarmupCompleted + 77;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                iIndexOf = str.indexOf("with");
                if (iIndexOf >= 0) {
                }
            }
            boolean zVerify = new RSAAutoSignature(publicKey, bArr, bArr2, str).verify();
            int i6 = onExtraCallback + 13;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return zVerify;
        } catch (Exception e) {
            INISAFECore.CoreLogger(1, "전자서명 검증 중 오류가 발생했습니다. publickey=[" + Hex.dumpHex(publicKey.getEncoded()) + "], msg=[" + Hex.dumpHex(bArr) + "], signature=[" + Hex.dumpHex(bArr2) + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e);
            return false;
        }
    }

    public byte[] getR(byte[] bArr) throws Exception {
        int i = 2 % 2;
        try {
            byte[] r = new KCDSASignedData(bArr).getR();
            int i2 = onExtraCallback + 91;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 76 / 0;
            }
            return r;
        } catch (ASN1Exception e) {
            INISAFECore.CoreLogger(1, "잘못된 KCDSA 서명 데이터 입니다. signature=[" + Hex.dumpHex(bArr) + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e);
            throw new Exception();
        }
    }

    public byte[] getS(byte[] bArr) throws Exception {
        int i = 2 % 2;
        try {
            byte[] byteArray = new KCDSASignedData(bArr).getS().toByteArray();
            int i2 = onExtraCallback + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return byteArray;
            }
            throw null;
        } catch (ASN1Exception e) {
            INISAFECore.CoreLogger(1, "잘못된 KCDSA 서명 데이터 입니다. signature=[" + Hex.dumpHex(bArr) + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e);
            throw new Exception();
        }
    }

    private static void b(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $11 + 17;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $10 + 3;
            $11 = i7 % 128;
            int i8 = i7 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iRgb = 16777259 + Color.rgb(i4, i4, i4);
                    int iIndexOf = TextUtils.indexOf("", "", i4, i4) + 1451;
                    byte b = (byte) ($$b & 5);
                    byte b2 = (byte) (b - 1);
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, iRgb, iIndexOf, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cNormalizeMetaState = (char) (49123 - KeyEvent.normalizeMetaState(i4));
                    int i9 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
                    int jumpTapTimeout2 = 1494 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte b3 = (byte) i4;
                    byte b4 = b3;
                    String str$$c2 = $$c(b3, b4, b4);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cNormalizeMetaState, i9, jumpTapTimeout2, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i10 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i10);
                objArr4[i4] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 23973);
                    int iMyTid = (Process.myTid() >> 22) + 50;
                    int i11 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22938;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i4] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(modifierMetaStateMask, iMyTid, i11, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i12 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i4] = Integer.valueOf(i12);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char absoluteGravity = (char) (Gravity.getAbsoluteGravity(i4, i4) + 45848);
                    int pressedStateDuration = 29 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int scrollBarSize = 12577 - (ViewConfiguration.getScrollBarSize() >> 8);
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i4] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(absoluteGravity, pressedStateDuration, scrollBarSize, 1401536470, false, "l", clsArr4);
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onNavigationEvent ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i13 = $10 + 9;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
