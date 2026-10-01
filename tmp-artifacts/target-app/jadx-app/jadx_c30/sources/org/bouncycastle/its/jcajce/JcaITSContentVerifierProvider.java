package org.bouncycastle.its.jcajce;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.operator.ITSContentVerifierProvider;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.oer.OEREncoder;
import org.bouncycastle.oer.its.PublicVerificationKey;
import org.bouncycastle.oer.its.VerificationKeyIndicator;
import org.bouncycastle.oer.its.template.IEEE1609dot2;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.bouncycastle.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JcaITSContentVerifierProvider implements ITSContentVerifierProvider {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 8571963817311849268L;
    private static int onNavigationEvent = 1;
    private final AlgorithmIdentifier digestAlgo;
    private JcaJceHelper helper;
    private final ITSCertificate issuer;
    private final byte[] parentData;
    private final ECPublicKey pubParams;
    private final int sigChoice;

    public static class Builder {
        private JcaJceHelper helper = new DefaultJcaJceHelper();

        public JcaITSContentVerifierProvider build(ITSCertificate iTSCertificate) {
            return new JcaITSContentVerifierProvider(iTSCertificate, this.helper);
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

    private JcaITSContentVerifierProvider(ITSCertificate iTSCertificate, JcaJceHelper jcaJceHelper) {
        AlgorithmIdentifier algorithmIdentifier;
        this.issuer = iTSCertificate;
        this.helper = jcaJceHelper;
        try {
            this.parentData = iTSCertificate.getEncoded();
            VerificationKeyIndicator verificationKeyIndicator = iTSCertificate.toASN1Structure().getCertificateBase().getToBeSignedCertificate().getVerificationKeyIndicator();
            if (!(verificationKeyIndicator.getObject() instanceof PublicVerificationKey)) {
                throw new IllegalArgumentException("not public verification key");
            }
            PublicVerificationKey publicVerificationKey = PublicVerificationKey.getInstance(verificationKeyIndicator.getObject());
            this.sigChoice = publicVerificationKey.getChoice();
            int choice = publicVerificationKey.getChoice();
            if (choice != 0) {
                int i = onExtraCallback + 105;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                if (choice == 1) {
                    algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
                } else {
                    if (choice != 3) {
                        throw new IllegalArgumentException("unknown key type");
                    }
                    algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
                }
            } else {
                algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
            }
            int i3 = 2 % 2;
            this.digestAlgo = algorithmIdentifier;
            this.pubParams = (ECPublicKey) new JcaITSPublicVerificationKey(publicVerificationKey, jcaJceHelper).getKey();
            int i4 = onNavigationEvent + 91;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } catch (IOException e) {
            throw new IllegalStateException("unable to extract parent data: " + e.getMessage());
        }
    }

    static /* synthetic */ ECPublicKey access$100(JcaITSContentVerifierProvider jcaITSContentVerifierProvider) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ECPublicKey eCPublicKey = jcaITSContentVerifierProvider.pubParams;
        if (i3 != 0) {
            return eCPublicKey;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.operator.OperatorCreationException */
    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    public ContentVerifier get(int i) throws Throwable {
        byte[] digest;
        JcaJceHelper jcaJceHelper;
        String strIntern;
        int i2 = 2 % 2;
        if (this.sigChoice != i) {
            throw new OperatorCreationException("wrong verifier for algorithm: " + i);
        }
        try {
            final DigestCalculator digestCalculator = new JcaDigestCalculatorProviderBuilder().setHelper(this.helper).build().get(this.digestAlgo);
            try {
                final OutputStream outputStream = digestCalculator.getOutputStream();
                byte[] bArr = this.parentData;
                outputStream.write(bArr, 0, bArr.length);
                final byte[] digest2 = digestCalculator.getDigest();
                if (this.issuer.getIssuer().isSelf()) {
                    byte[] byteArray = OEREncoder.toByteArray(this.issuer.toASN1Structure().getCertificateBase().getToBeSignedCertificate(), IEEE1609dot2.tbsCertificate);
                    outputStream.write(byteArray, 0, byteArray.length);
                    digest = digestCalculator.getDigest();
                } else {
                    digest = null;
                }
                final byte[] bArr2 = digest;
                int i3 = this.sigChoice;
                if (i3 == 0 || i3 == 1) {
                    jcaJceHelper = this.helper;
                    Object[] objArr = new Object[1];
                    a(new char[]{58355, 3271, 62647, 58272, 48311, 38022, 38664, 34706, 8998, 32233, 54672, 18153, 25159, 15703, 5826, 1315, 41239, 65100, 22502}, Color.green(0), objArr);
                    strIntern = ((String) objArr[0]).intern();
                } else {
                    int i4 = onExtraCallback + 25;
                    int i5 = i4 % 128;
                    onNavigationEvent = i5;
                    int i6 = i4 % 2;
                    if (i3 != 3) {
                        throw new IllegalArgumentException("choice " + this.sigChoice + " not supported");
                    }
                    int i7 = i5 + 17;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    jcaJceHelper = this.helper;
                    strIntern = "SHA384withECDSA";
                }
                final Signature signatureCreateSignature = jcaJceHelper.createSignature(strIntern);
                return new ContentVerifier() { // from class: org.bouncycastle.its.jcajce.JcaITSContentVerifierProvider.1
                    public AlgorithmIdentifier getAlgorithmIdentifier() {
                        return null;
                    }

                    public OutputStream getOutputStream() {
                        return outputStream;
                    }

                    public boolean verify(byte[] bArr3) throws SignatureException, InvalidKeyException {
                        byte[] digest3 = digestCalculator.getDigest();
                        try {
                            signatureCreateSignature.initVerify(JcaITSContentVerifierProvider.access$100(JcaITSContentVerifierProvider.this));
                            signatureCreateSignature.update(digest3);
                            byte[] bArr4 = bArr2;
                            if (bArr4 == null || !Arrays.areEqual(digest3, bArr4)) {
                                signatureCreateSignature.update(digest2);
                            } else {
                                signatureCreateSignature.update(digestCalculator.getDigest());
                            }
                            return signatureCreateSignature.verify(bArr3);
                        } catch (Exception e) {
                            throw new RuntimeException(e.getMessage(), e);
                        }
                    }
                };
            } catch (Exception e) {
                throw new IllegalStateException(e.getMessage(), e);
            }
        } catch (Exception e2) {
            throw new IllegalStateException(e2.getMessage(), e2);
        }
    }

    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    public ITSCertificate getAssociatedCertificate() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 65;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ITSCertificate iTSCertificate = this.issuer;
        int i5 = i2 + 99;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return iTSCertificate;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r5.issuer != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r5.issuer != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 115;
        org.bouncycastle.its.jcajce.JcaITSContentVerifierProvider.onExtraCallback = r2 % 128;
        r2 = r2 % 2;
     */
    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean hasAssociatedCertificate() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            int i4 = 56 / 0;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 85;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 45812), (ViewConfiguration.getPressedStateDuration() >> 16) + 84, MotionEvent.axisFromString(BuildConfig.FLAVOR) + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14185), 19 - ((Process.getThreadPriority(0) + 20) >> 6), 8808 - View.resolveSizeAndState(0, 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 3;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }
}
