package org.bouncycastle.its.jcajce;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.its.ITSPublicVerificationKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.oer.its.EccCurvePoint;
import org.bouncycastle.oer.its.EccP256CurvePoint;
import org.bouncycastle.oer.its.EccP384CurvePoint;
import org.bouncycastle.oer.its.PublicVerificationKey;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JcaITSPublicVerificationKey extends ITSPublicVerificationKey {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int onNavigationEvent;
    private final JcaJceHelper helper;
    private static char[] onExtraCallback = {32634, 32580};
    private static int onWarmupCompleted = -1184334073;
    private static boolean IAuthTabCallback = true;
    private static boolean onExtraCallbackWithResult = true;

    public static class Builder {
        private JcaJceHelper helper = new DefaultJcaJceHelper();

        public JcaITSPublicVerificationKey build(PublicKey publicKey) {
            return new JcaITSPublicVerificationKey(publicKey, this.helper);
        }

        public JcaITSPublicVerificationKey build(PublicVerificationKey publicVerificationKey) {
            return new JcaITSPublicVerificationKey(publicVerificationKey, this.helper);
        }

        public Builder setProvider(String str) {
            this.helper = new NamedJcaJceHelper(str);
            return this;
        }

        public Builder setProvider(Provider provider) {
            this.helper = new ProviderJcaJceHelper(provider);
            return this;
        }
    }

    JcaITSPublicVerificationKey(PublicKey publicKey, JcaJceHelper jcaJceHelper) {
        super(fromKeyParameters((ECPublicKey) publicKey));
        this.helper = jcaJceHelper;
    }

    JcaITSPublicVerificationKey(PublicVerificationKey publicVerificationKey, JcaJceHelper jcaJceHelper) {
        super(publicVerificationKey);
        this.helper = jcaJceHelper;
    }

    static PublicVerificationKey fromKeyParameters(ECPublicKey eCPublicKey) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(SubjectPublicKeyInfo.getInstance(eCPublicKey.getEncoded()).getAlgorithm().getParameters());
        if (!aSN1ObjectIdentifier.equals(SECObjectIdentifiers.secp256r1)) {
            if (aSN1ObjectIdentifier.equals(TeleTrusTObjectIdentifiers.brainpoolP256r1)) {
                return new PublicVerificationKey(1, EccP256CurvePoint.builder().createUncompressedP256(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY()));
            }
            if (aSN1ObjectIdentifier.equals(TeleTrusTObjectIdentifiers.brainpoolP384r1)) {
                return new PublicVerificationKey(3, EccP384CurvePoint.builder().createUncompressedP384(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY()));
            }
            throw new IllegalArgumentException("unknown curve in public encryption key");
        }
        PublicVerificationKey publicVerificationKey = new PublicVerificationKey(0, EccP256CurvePoint.builder().createUncompressedP256(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY()));
        int i4 = onNavigationEvent + 95;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return publicVerificationKey;
        }
        throw null;
    }

    public PublicKey getKey() throws Throwable {
        X9ECParameters byOID;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.verificationKey.getChoice();
            obj.hashCode();
            throw null;
        }
        int choice = this.verificationKey.getChoice();
        if (choice != 0) {
            int i3 = asInterface;
            int i4 = i3 + 9;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (choice != 1) {
                int i6 = i3 + 19;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0 ? choice != 3 : choice != 5) {
                    throw new IllegalStateException("unknown key type");
                }
                aSN1ObjectIdentifier = TeleTrusTObjectIdentifiers.brainpoolP384r1;
            } else {
                aSN1ObjectIdentifier = TeleTrusTObjectIdentifiers.brainpoolP256r1;
            }
            byOID = TeleTrusTNamedCurves.getByOID(aSN1ObjectIdentifier);
        } else {
            byOID = NISTNamedCurves.getByOID(SECObjectIdentifiers.secp256r1);
        }
        ECCurve curve = byOID.getCurve();
        if (!(this.verificationKey.getCurvePoint() instanceof EccCurvePoint)) {
            throw new IllegalStateException("extension to public verification key not supported");
        }
        EccCurvePoint curvePoint = this.verificationKey.getCurvePoint();
        if (!(curvePoint instanceof EccP256CurvePoint) && !(curvePoint instanceof EccP384CurvePoint)) {
            throw new IllegalStateException("unknown key type");
        }
        ECPoint eCPointNormalize = curve.decodePoint(curvePoint.getEncodedPoint()).normalize();
        try {
            JcaJceHelper jcaJceHelper = this.helper;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-126, ISOFileInfo.DATA_BYTES2}, KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + CertificateBody.profileType, objArr);
            return jcaJceHelper.createKeyFactory(((String) objArr[0]).intern()).generatePublic(new ECPublicKeySpec(EC5Util.convertPoint(eCPointNormalize), EC5Util.convertToSpec(byOID)));
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 35;
                $11 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 76, Color.argb(0, 0, 0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
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
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        long j = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), Color.red(0) + 75, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 63, 12214 - View.getDefaultSize(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = $10 + 45;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                j = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i9 = $10 + 49;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 63, View.MeasureSpec.getSize(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName(BuildConfig.FLAVOR) + 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 63, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }
}
