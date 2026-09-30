package org.bouncycastle.eac.jcajce;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.eac.ECDSAPublicKey;
import org.bouncycastle.asn1.eac.PublicKeyDataObject;
import org.bouncycastle.asn1.eac.RSAPublicKey;
import org.bouncycastle.eac.EACException;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.Polynomial;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JcaPublicKeyConverter {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallback = 808681530511118698L;
    private static int onWarmupCompleted;
    private EACHelper helper = new DefaultEACHelper();

    private static EllipticCurve convertCurve(ECCurve eCCurve) {
        int i = 2 % 2;
        EllipticCurve ellipticCurve = new EllipticCurve(convertField(eCCurve.getField()), eCCurve.getA().toBigInteger(), eCCurve.getB().toBigInteger(), null);
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return ellipticCurve;
    }

    private static ECCurve convertCurve(EllipticCurve ellipticCurve, BigInteger bigInteger, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 75;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            ECField field = ellipticCurve.getField();
            ellipticCurve.getA();
            ellipticCurve.getB();
            boolean z = field instanceof ECFieldFp;
            throw null;
        }
        ECField field2 = ellipticCurve.getField();
        BigInteger a = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (!(field2 instanceof ECFieldFp)) {
            throw new IllegalStateException("not implemented yet!!!");
        }
        ECCurve.Fp fp = new ECCurve.Fp(((ECFieldFp) field2).getP(), a, b, bigInteger, BigInteger.valueOf(i));
        int i4 = IAuthTabCallback + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return fp;
    }

    private static ECField convertField(FiniteField finiteField) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ECAlgorithms.isFpField(finiteField);
            throw null;
        }
        if (ECAlgorithms.isFpField(finiteField)) {
            ECFieldFp eCFieldFp = new ECFieldFp(finiteField.getCharacteristic());
            int i3 = onWarmupCompleted + 27;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return eCFieldFp;
        }
        Polynomial minimalPolynomial = ((PolynomialExtensionField) finiteField).getMinimalPolynomial();
        int[] exponentsPresent = minimalPolynomial.getExponentsPresent();
        ECFieldF2m eCFieldF2m = new ECFieldF2m(minimalPolynomial.getDegree(), Arrays.reverseInPlace(Arrays.copyOfRange(exponentsPresent, 1, exponentsPresent.length - 1)));
        int i5 = IAuthTabCallback + 47;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return eCFieldF2m;
    }

    private static ECPoint convertPoint(ECCurve eCCurve, java.security.spec.ECPoint eCPoint) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (i3 != 0) {
            return eCCurve.createPoint(affineX, affineY);
        }
        eCCurve.createPoint(affineX, affineY);
        throw null;
    }

    private PublicKey getECPublicKeyPublicKey(ECDSAPublicKey eCDSAPublicKey) throws EACException, InvalidKeySpecException {
        int i = 2 % 2;
        try {
            PublicKey publicKeyGeneratePublic = this.helper.createKeyFactory("ECDSA").generatePublic(new ECPublicKeySpec(getPublicPoint(eCDSAPublicKey), getParams(eCDSAPublicKey)));
            int i2 = IAuthTabCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return publicKeyGeneratePublic;
        } catch (NoSuchAlgorithmException e) {
            throw new EACException("cannot find algorithm ECDSA: " + e.getMessage(), e);
        } catch (NoSuchProviderException e2) {
            throw new EACException("cannot find provider: " + e2.getMessage(), e2);
        }
    }

    private ECParameterSpec getParams(ECDSAPublicKey eCDSAPublicKey) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!eCDSAPublicKey.hasParameters()) {
            throw new IllegalArgumentException("Public key does not contains EC Params");
        }
        ECCurve.Fp fp = new ECCurve.Fp(eCDSAPublicKey.getPrimeModulusP(), eCDSAPublicKey.getFirstCoefA(), eCDSAPublicKey.getSecondCoefB(), eCDSAPublicKey.getOrderOfBasePointR(), eCDSAPublicKey.getCofactorF());
        ECPoint eCPointDecodePoint = fp.decodePoint(eCDSAPublicKey.getBasePointG());
        ECParameterSpec eCParameterSpec = new ECParameterSpec(convertCurve(fp), new java.security.spec.ECPoint(eCPointDecodePoint.getAffineXCoord().toBigInteger(), eCPointDecodePoint.getAffineYCoord().toBigInteger()), eCDSAPublicKey.getOrderOfBasePointR(), eCDSAPublicKey.getCofactorF().intValue());
        int i4 = onWarmupCompleted + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return eCParameterSpec;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private java.security.spec.ECPoint getPublicPoint(ECDSAPublicKey eCDSAPublicKey) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (!eCDSAPublicKey.hasParameters()) {
            throw new IllegalArgumentException("Public key does not contains EC Params");
        }
        ECPoint.Fp fpDecodePoint = new ECCurve.Fp(eCDSAPublicKey.getPrimeModulusP(), eCDSAPublicKey.getFirstCoefA(), eCDSAPublicKey.getSecondCoefB(), eCDSAPublicKey.getOrderOfBasePointR(), eCDSAPublicKey.getCofactorF()).decodePoint(eCDSAPublicKey.getPublicPointY());
        java.security.spec.ECPoint eCPoint = new java.security.spec.ECPoint(fpDecodePoint.getAffineXCoord().toBigInteger(), fpDecodePoint.getAffineYCoord().toBigInteger());
        int i4 = IAuthTabCallback + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return eCPoint;
    }

    public PublicKey getKey(PublicKeyDataObject publicKeyDataObject) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            publicKeyDataObject.getUsage().on(EACObjectIdentifiers.id_TA_ECDSA);
            throw null;
        }
        if (publicKeyDataObject.getUsage().on(EACObjectIdentifiers.id_TA_ECDSA)) {
            PublicKey eCPublicKeyPublicKey = getECPublicKeyPublicKey((ECDSAPublicKey) publicKeyDataObject);
            int i3 = IAuthTabCallback + 57;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 69 / 0;
            }
            return eCPublicKeyPublicKey;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKeyDataObject;
        RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        try {
            EACHelper eACHelper = this.helper;
            Object[] objArr = new Object[1];
            a(new char[]{44958, 45004, 26769, 49828, 5912, 17301, 42692}, 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            PublicKey publicKeyGeneratePublic = eACHelper.createKeyFactory(((String) objArr[0]).intern()).generatePublic(rSAPublicKeySpec);
            int i5 = onWarmupCompleted + 77;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return publicKeyGeneratePublic;
        } catch (NoSuchAlgorithmException e) {
            throw new EACException("cannot find algorithm ECDSA: " + e.getMessage(), e);
        } catch (NoSuchProviderException e2) {
            throw new EACException("cannot find provider: " + e2.getMessage(), e2);
        }
    }

    public PublicKeyDataObject getPublicKeyDataObject(ASN1ObjectIdentifier aSN1ObjectIdentifier, PublicKey publicKey) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (publicKey instanceof java.security.interfaces.RSAPublicKey) {
            java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) publicKey;
            RSAPublicKey rSAPublicKey2 = new RSAPublicKey(aSN1ObjectIdentifier, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
            int i4 = IAuthTabCallback + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return rSAPublicKey2;
        }
        ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
        ECParameterSpec params = eCPublicKey.getParams();
        EllipticCurve curve = params.getCurve();
        ECCurve eCCurveConvertCurve = convertCurve(curve, params.getOrder(), params.getCofactor());
        return new ECDSAPublicKey(aSN1ObjectIdentifier, ((ECFieldFp) curve.getField()).getP(), curve.getA(), curve.getB(), convertPoint(eCCurveConvertCurve, params.getGenerator()).getEncoded(false), params.getOrder(), convertPoint(eCCurveConvertCurve, eCPublicKey.getW()).getEncoded(false), params.getCofactor());
    }

    public JcaPublicKeyConverter setProvider(String str) {
        int i = 2 % 2;
        this.helper = new NamedEACHelper(str);
        int i2 = onWarmupCompleted + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return this;
    }

    public JcaPublicKeyConverter setProvider(Provider provider) {
        int i = 2 % 2;
        this.helper = new ProviderEACHelper(provider);
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 67;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 77;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 45812), 85 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 21233 - View.MeasureSpec.getSize(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - ImageFormat.getBitsPerPixel(0)), Color.rgb(0, 0, 0) + 16777235, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }
}
