package org.bouncycastle.operator.bc;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.operator.OperatorCreationException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class BcContentVerifierProviderBuilder {
    protected BcDigestProvider digestProvider = BcDefaultDigestProvider.INSTANCE;

    class SigVerifier implements ContentVerifier {
        private AlgorithmIdentifier algorithm;
        private BcSignerOutputStream stream;

        SigVerifier(AlgorithmIdentifier algorithmIdentifier, BcSignerOutputStream bcSignerOutputStream) {
            this.algorithm = algorithmIdentifier;
            this.stream = bcSignerOutputStream;
        }

        public AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.algorithm;
        }

        public OutputStream getOutputStream() {
            BcSignerOutputStream bcSignerOutputStream = this.stream;
            if (bcSignerOutputStream != null) {
                return bcSignerOutputStream;
            }
            throw new IllegalStateException("verifier not initialised");
        }

        public boolean verify(byte[] bArr) {
            return this.stream.verify(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BcSignerOutputStream createSignatureStream(AlgorithmIdentifier algorithmIdentifier, AsymmetricKeyParameter asymmetricKeyParameter) throws OperatorCreationException {
        Signer signerCreateSigner = createSigner(algorithmIdentifier);
        signerCreateSigner.init(false, asymmetricKeyParameter);
        return new BcSignerOutputStream(signerCreateSigner);
    }

    public ContentVerifierProvider build(final X509CertificateHolder x509CertificateHolder) throws OperatorCreationException {
        return new ContentVerifierProvider() { // from class: org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.1
            /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.operator.OperatorCreationException */
            public ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException {
                try {
                    return BcContentVerifierProviderBuilder.this.new SigVerifier(algorithmIdentifier, BcContentVerifierProviderBuilder.this.createSignatureStream(algorithmIdentifier, BcContentVerifierProviderBuilder.this.extractKeyParameters(x509CertificateHolder.getSubjectPublicKeyInfo())));
                } catch (IOException e) {
                    throw new OperatorCreationException("exception on setup: " + e, e);
                }
            }

            public X509CertificateHolder getAssociatedCertificate() {
                return x509CertificateHolder;
            }

            public boolean hasAssociatedCertificate() {
                return true;
            }
        };
    }

    public ContentVerifierProvider build(final AsymmetricKeyParameter asymmetricKeyParameter) throws OperatorCreationException {
        return new ContentVerifierProvider() { // from class: org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.2
            public ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException {
                return BcContentVerifierProviderBuilder.this.new SigVerifier(algorithmIdentifier, BcContentVerifierProviderBuilder.this.createSignatureStream(algorithmIdentifier, asymmetricKeyParameter));
            }

            public X509CertificateHolder getAssociatedCertificate() {
                return null;
            }

            public boolean hasAssociatedCertificate() {
                return false;
            }
        };
    }

    protected abstract Signer createSigner(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException;

    protected abstract AsymmetricKeyParameter extractKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException;
}
