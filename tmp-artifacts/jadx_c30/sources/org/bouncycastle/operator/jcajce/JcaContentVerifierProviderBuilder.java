package org.bouncycastle.operator.jcajce;

import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.RawContentVerifier;
import org.bouncycastle.operator.RuntimeOperatorException;
import org.bouncycastle.util.io.TeeOutputStream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JcaContentVerifierProviderBuilder {
    private OperatorHelper helper = new OperatorHelper(new DefaultJcaJceHelper());

    class CompositeVerifier implements ContentVerifier {
        private Signature[] sigs;
        private OutputStream stream;

        /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.operator.OperatorCreationException */
        public CompositeVerifier(Signature[] signatureArr) throws OperatorCreationException {
            this.sigs = signatureArr;
            int i = 0;
            while (i < signatureArr.length && signatureArr[i] == null) {
                i++;
            }
            if (i == signatureArr.length) {
                throw new OperatorCreationException("no matching signature found in composite");
            }
            TeeOutputStream teeOutputStreamCreateStream = OutputStreamFactory.createStream(signatureArr[i]);
            while (true) {
                this.stream = teeOutputStreamCreateStream;
                do {
                    i++;
                    if (i == signatureArr.length) {
                        return;
                    }
                } while (signatureArr[i] == null);
                teeOutputStreamCreateStream = new TeeOutputStream(this.stream, OutputStreamFactory.createStream(signatureArr[i]));
            }
        }

        public AlgorithmIdentifier getAlgorithmIdentifier() {
            return new AlgorithmIdentifier(MiscObjectIdentifiers.id_alg_composite);
        }

        public OutputStream getOutputStream() {
            return this.stream;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.operator.RuntimeOperatorException */
        public boolean verify(byte[] bArr) throws RuntimeOperatorException {
            try {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
                boolean z = false;
                for (int i = 0; i != aSN1Sequence.size(); i++) {
                    Signature signature = this.sigs[i];
                    if (signature != null && !signature.verify(DERBitString.getInstance(aSN1Sequence.getObjectAt(i)).getBytes())) {
                        z = true;
                    }
                }
                return !z;
            } catch (SignatureException e) {
                throw new RuntimeOperatorException("exception obtaining signature: " + e.getMessage(), e);
            }
        }
    }

    class RawSigVerifier extends SigVerifier implements RawContentVerifier {
        private Signature rawSignature;

        RawSigVerifier(AlgorithmIdentifier algorithmIdentifier, Signature signature, Signature signature2) {
            super(algorithmIdentifier, signature);
            this.rawSignature = signature2;
        }

        @Override // org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.SigVerifier
        public boolean verify(byte[] bArr) throws SignatureException {
            try {
                return super.verify(bArr);
            } finally {
                try {
                    this.rawSignature.verify(bArr);
                } catch (Exception unused) {
                }
            }
        }

        public boolean verify(byte[] bArr, byte[] bArr2) throws SignatureException {
            try {
                try {
                    this.rawSignature.update(bArr);
                    return this.rawSignature.verify(bArr2);
                } finally {
                    try {
                        this.rawSignature.verify(bArr2);
                    } catch (Exception unused) {
                    }
                }
            } catch (SignatureException e) {
                throw new RuntimeOperatorException("exception obtaining raw signature: " + e.getMessage(), e);
            }
        }
    }

    class SigVerifier implements ContentVerifier {
        private final AlgorithmIdentifier algorithm;
        private final Signature signature;
        protected final OutputStream stream;

        SigVerifier(AlgorithmIdentifier algorithmIdentifier, Signature signature) {
            this.algorithm = algorithmIdentifier;
            this.signature = signature;
            this.stream = OutputStreamFactory.createStream(signature);
        }

        public AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.algorithm;
        }

        public OutputStream getOutputStream() {
            OutputStream outputStream = this.stream;
            if (outputStream != null) {
                return outputStream;
            }
            throw new IllegalStateException("verifier not initialised");
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.operator.RuntimeOperatorException */
        public boolean verify(byte[] bArr) throws RuntimeOperatorException {
            try {
                return this.signature.verify(bArr);
            } catch (SignatureException e) {
                throw new RuntimeOperatorException("exception obtaining signature: " + e.getMessage(), e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ContentVerifier createCompositeVerifier(AlgorithmIdentifier algorithmIdentifier, PublicKey publicKey) throws OperatorCreationException {
        int i = 0;
        if (!(publicKey instanceof CompositePublicKey)) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(algorithmIdentifier.getParameters());
            Signature[] signatureArr = new Signature[aSN1Sequence.size()];
            while (i != aSN1Sequence.size()) {
                try {
                    signatureArr[i] = createSignature(AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i)), publicKey);
                } catch (Exception unused) {
                    signatureArr[i] = null;
                }
                i++;
            }
            return new CompositeVerifier(signatureArr);
        }
        List publicKeys = ((CompositePublicKey) publicKey).getPublicKeys();
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(algorithmIdentifier.getParameters());
        Signature[] signatureArr2 = new Signature[aSN1Sequence2.size()];
        while (i != aSN1Sequence2.size()) {
            AlgorithmIdentifier algorithmIdentifier2 = AlgorithmIdentifier.getInstance(aSN1Sequence2.getObjectAt(i));
            if (publicKeys.get(i) != null) {
                signatureArr2[i] = createSignature(algorithmIdentifier2, (PublicKey) publicKeys.get(i));
            } else {
                signatureArr2[i] = null;
            }
            i++;
        }
        return new CompositeVerifier(signatureArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Signature createRawSig(AlgorithmIdentifier algorithmIdentifier, PublicKey publicKey) throws InvalidKeyException {
        try {
            Signature signatureCreateRawSignature = this.helper.createRawSignature(algorithmIdentifier);
            if (signatureCreateRawSignature != null) {
                signatureCreateRawSignature.initVerify(publicKey);
            }
            return signatureCreateRawSignature;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.operator.OperatorCreationException */
    public Signature createSignature(AlgorithmIdentifier algorithmIdentifier, PublicKey publicKey) throws OperatorCreationException, InvalidKeyException {
        try {
            Signature signatureCreateSignature = this.helper.createSignature(algorithmIdentifier);
            signatureCreateSignature.initVerify(publicKey);
            return signatureCreateSignature;
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException("exception on setup: " + e, e);
        }
    }

    public ContentVerifierProvider build(final PublicKey publicKey) throws OperatorCreationException {
        return new ContentVerifierProvider() { // from class: org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.2
            /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.operator.OperatorCreationException */
            public ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException, InvalidKeyException {
                if (algorithmIdentifier.getAlgorithm().equals(MiscObjectIdentifiers.id_alg_composite)) {
                    return JcaContentVerifierProviderBuilder.this.createCompositeVerifier(algorithmIdentifier, publicKey);
                }
                CompositePublicKey compositePublicKey = publicKey;
                if (!(compositePublicKey instanceof CompositePublicKey)) {
                    Signature signatureCreateSignature = JcaContentVerifierProviderBuilder.this.createSignature(algorithmIdentifier, compositePublicKey);
                    Signature signatureCreateRawSig = JcaContentVerifierProviderBuilder.this.createRawSig(algorithmIdentifier, publicKey);
                    return signatureCreateRawSig != null ? JcaContentVerifierProviderBuilder.this.new RawSigVerifier(algorithmIdentifier, signatureCreateSignature, signatureCreateRawSig) : JcaContentVerifierProviderBuilder.this.new SigVerifier(algorithmIdentifier, signatureCreateSignature);
                }
                List publicKeys = compositePublicKey.getPublicKeys();
                for (int i = 0; i != publicKeys.size(); i++) {
                    try {
                        Signature signatureCreateSignature2 = JcaContentVerifierProviderBuilder.this.createSignature(algorithmIdentifier, (PublicKey) publicKeys.get(i));
                        Signature signatureCreateRawSig2 = JcaContentVerifierProviderBuilder.this.createRawSig(algorithmIdentifier, (PublicKey) publicKeys.get(i));
                        return signatureCreateRawSig2 != null ? JcaContentVerifierProviderBuilder.this.new RawSigVerifier(algorithmIdentifier, signatureCreateSignature2, signatureCreateRawSig2) : JcaContentVerifierProviderBuilder.this.new SigVerifier(algorithmIdentifier, signatureCreateSignature2);
                    } catch (OperatorCreationException unused) {
                    }
                }
                throw new OperatorCreationException("no matching algorithm found for key");
            }

            public X509CertificateHolder getAssociatedCertificate() {
                return null;
            }

            public boolean hasAssociatedCertificate() {
                return false;
            }
        };
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.operator.OperatorCreationException */
    public ContentVerifierProvider build(final X509Certificate x509Certificate) throws OperatorCreationException {
        try {
            final JcaX509CertificateHolder jcaX509CertificateHolder = new JcaX509CertificateHolder(x509Certificate);
            return new ContentVerifierProvider() { // from class: org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.1
                /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.operator.OperatorCreationException */
                public ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException, InvalidKeyException {
                    if (algorithmIdentifier.getAlgorithm().equals(MiscObjectIdentifiers.id_alg_composite)) {
                        return JcaContentVerifierProviderBuilder.this.createCompositeVerifier(algorithmIdentifier, x509Certificate.getPublicKey());
                    }
                    try {
                        Signature signatureCreateSignature = JcaContentVerifierProviderBuilder.this.helper.createSignature(algorithmIdentifier);
                        signatureCreateSignature.initVerify(x509Certificate.getPublicKey());
                        Signature signatureCreateRawSig = JcaContentVerifierProviderBuilder.this.createRawSig(algorithmIdentifier, x509Certificate.getPublicKey());
                        return signatureCreateRawSig != null ? JcaContentVerifierProviderBuilder.this.new RawSigVerifier(algorithmIdentifier, signatureCreateSignature, signatureCreateRawSig) : JcaContentVerifierProviderBuilder.this.new SigVerifier(algorithmIdentifier, signatureCreateSignature);
                    } catch (GeneralSecurityException e) {
                        throw new OperatorCreationException("exception on setup: " + e, e);
                    }
                }

                public X509CertificateHolder getAssociatedCertificate() {
                    return jcaX509CertificateHolder;
                }

                public boolean hasAssociatedCertificate() {
                    return true;
                }
            };
        } catch (CertificateEncodingException e) {
            throw new OperatorCreationException("cannot process certificate: " + e.getMessage(), e);
        }
    }

    public ContentVerifierProvider build(SubjectPublicKeyInfo subjectPublicKeyInfo) throws OperatorCreationException {
        return build(this.helper.convertPublicKey(subjectPublicKeyInfo));
    }

    public ContentVerifierProvider build(X509CertificateHolder x509CertificateHolder) throws OperatorCreationException, CertificateException {
        return build(this.helper.convertCertificate(x509CertificateHolder));
    }

    public JcaContentVerifierProviderBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JcaContentVerifierProviderBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }
}
