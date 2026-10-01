package org.bouncycastle.its.jcajce;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPrivateKey;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.operator.ITSContentSigner;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.bouncycastle.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JcaITSContentSigner implements ITSContentSigner {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static long onExtraCallback = 5397141413031779012L;
    private static int onNavigationEvent = 1;
    private final ASN1ObjectIdentifier curveID;
    private final DigestCalculator digest;
    private final AlgorithmIdentifier digestAlgo;
    private final JcaJceHelper helper;
    private final byte[] parentData;
    private final byte[] parentDigest;
    private final ECPrivateKey privateKey;
    private final String signer;
    private final ITSCertificate signerCert;

    public static class Builder {
        private JcaJceHelper helper = new DefaultJcaJceHelper();

        /* JADX WARN: Multi-variable type inference failed */
        public JcaITSContentSigner build(PrivateKey privateKey) {
            return new JcaITSContentSigner((ECPrivateKey) privateKey, null, this.helper);
        }

        public JcaITSContentSigner build(PrivateKey privateKey, ITSCertificate iTSCertificate) {
            return new JcaITSContentSigner((ECPrivateKey) privateKey, iTSCertificate, this.helper);
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private JcaITSContentSigner(ECPrivateKey eCPrivateKey, ITSCertificate iTSCertificate, JcaJceHelper jcaJceHelper) throws Throwable {
        int i;
        AlgorithmIdentifier algorithmIdentifier;
        this.privateKey = eCPrivateKey;
        this.signerCert = iTSCertificate;
        this.helper = jcaJceHelper;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(PrivateKeyInfo.getInstance(eCPrivateKey.getEncoded()).getPrivateKeyAlgorithm().getParameters());
        this.curveID = aSN1ObjectIdentifier;
        try {
            try {
                if (aSN1ObjectIdentifier.equals(SECObjectIdentifiers.secp256r1)) {
                    algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
                } else {
                    if (!aSN1ObjectIdentifier.equals(TeleTrusTObjectIdentifiers.brainpoolP256r1)) {
                        if (!aSN1ObjectIdentifier.equals(TeleTrusTObjectIdentifiers.brainpoolP384r1)) {
                            throw new IllegalArgumentException("unknown key type");
                        }
                        this.digestAlgo = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
                        this.signer = "SHA384withECDSA";
                        i = onNavigationEvent + 71;
                        IAuthTabCallback = i % 128;
                        int i2 = i % 2;
                        int i3 = 2 % 2;
                        DigestCalculator digestCalculator = new JcaDigestCalculatorProviderBuilder().setHelper(jcaJceHelper).build().get(this.digestAlgo);
                        this.digest = digestCalculator;
                        if (iTSCertificate != null) {
                            this.parentData = null;
                            this.parentDigest = digestCalculator.getDigest();
                            return;
                        }
                        try {
                            byte[] encoded = iTSCertificate.getEncoded();
                            this.parentData = encoded;
                            digestCalculator.getOutputStream().write(encoded, 0, encoded.length);
                            this.parentDigest = digestCalculator.getDigest();
                            return;
                        } catch (IOException e) {
                            throw new IllegalStateException("signer certificate encoding failed: " + e.getMessage());
                        }
                    }
                    algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
                    int i4 = 2 % 2;
                }
                DigestCalculator digestCalculator2 = new JcaDigestCalculatorProviderBuilder().setHelper(jcaJceHelper).build().get(this.digestAlgo);
                this.digest = digestCalculator2;
                if (iTSCertificate != null) {
                }
            } catch (OperatorCreationException e2) {
                throw new IllegalStateException("cannot recognise digest type: " + this.digestAlgo.getAlgorithm(), e2);
            }
        } catch (Exception e3) {
            throw new IllegalStateException(e3.getMessage(), e3);
        }
        this.digestAlgo = algorithmIdentifier;
        Object[] objArr = new Object[1];
        a(new char[]{16288, 21008, 31572, 16371, 39338, 13200, 47237, 48320, 47285, 47822, 12691, 13755, 12692, 8816, 43713, 43633, 43652, 42347, 9189}, Color.blue(0), objArr);
        this.signer = ((String) objArr[0]).intern();
        i = onNavigationEvent + 43;
        IAuthTabCallback = i % 128;
        int i22 = i % 2;
        int i32 = 2 % 2;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public ITSCertificate getAssociatedCertificate() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 17;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ITSCertificate iTSCertificate = this.signerCert;
        int i5 = i2 + 11;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return iTSCertificate;
        }
        throw null;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public byte[] getAssociatedCertificateDigest() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Arrays.clone(this.parentDigest);
            throw null;
        }
        byte[] bArrClone = Arrays.clone(this.parentDigest);
        int i3 = IAuthTabCallback + 63;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 50 / 0;
        }
        return bArrClone;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public AlgorithmIdentifier getDigestAlgorithm() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 15;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AlgorithmIdentifier algorithmIdentifier = this.digestAlgo;
        int i4 = i2 + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return algorithmIdentifier;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public OutputStream getOutputStream() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        OutputStream outputStream = this.digest.getOutputStream();
        int i4 = onNavigationEvent + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return outputStream;
        }
        throw null;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public byte[] getSignature() throws SignatureException, InvalidKeyException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        byte[] digest = this.digest.getDigest();
        try {
            Signature signatureCreateSignature = this.helper.createSignature(this.signer);
            signatureCreateSignature.initSign(this.privateKey);
            signatureCreateSignature.update(digest, 0, digest.length);
            signatureCreateSignature.update(this.digest.getDigest());
            byte[] bArrSign = signatureCreateSignature.sign();
            int i4 = IAuthTabCallback + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return bArrSign;
            }
            throw null;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public boolean isForSelfSigning() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this.parentData != null) {
            return false;
        }
        int i5 = i3 + 97;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 23;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 7;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45812), 84 - View.MeasureSpec.getMode(0), 21232 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14233 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getPressedStateDuration() >> 16) + 19, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }
}
