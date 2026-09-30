package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class AuthenticatedDataParser {
    private ASN1Encodable nextObject;
    private boolean originatorInfoCalled;
    private ASN1SequenceParser seq;
    private ASN1Integer version;

    public AuthenticatedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
        this.seq = aSN1SequenceParser;
        this.version = ASN1Integer.getInstance(aSN1SequenceParser.readObject());
    }

    public ASN1SetParser getAuthAttrs() throws IOException {
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1TaggedObjectParser aSN1TaggedObjectParser = this.nextObject;
        if (!(aSN1TaggedObjectParser instanceof ASN1TaggedObjectParser)) {
            return null;
        }
        this.nextObject = null;
        return ASN1Util.parseContextBaseUniversal(aSN1TaggedObjectParser, 2, false, 17);
    }

    public AlgorithmIdentifier getDigestAlgorithm() throws IOException {
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1Encodable aSN1Encodable = this.nextObject;
        if (!(aSN1Encodable instanceof ASN1TaggedObjectParser)) {
            return null;
        }
        AlgorithmIdentifier algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1Encodable.toASN1Primitive(), false);
        this.nextObject = null;
        return algorithmIdentifier;
    }

    public ContentInfoParser getEncapsulatedContentInfo() throws IOException {
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1SequenceParser aSN1SequenceParser = this.nextObject;
        if (aSN1SequenceParser == null) {
            return null;
        }
        this.nextObject = null;
        return new ContentInfoParser(aSN1SequenceParser);
    }

    public ASN1OctetString getMac() throws IOException {
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1Encodable aSN1Encodable = this.nextObject;
        this.nextObject = null;
        return ASN1OctetString.getInstance(aSN1Encodable.toASN1Primitive());
    }

    public AlgorithmIdentifier getMacAlgorithm() throws IOException {
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1SequenceParser aSN1SequenceParser = this.nextObject;
        if (aSN1SequenceParser == null) {
            return null;
        }
        this.nextObject = null;
        return AlgorithmIdentifier.getInstance(aSN1SequenceParser.toASN1Primitive());
    }

    public OriginatorInfo getOriginatorInfo() throws IOException {
        this.originatorInfoCalled = true;
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1TaggedObjectParser aSN1TaggedObjectParser = this.nextObject;
        if (aSN1TaggedObjectParser instanceof ASN1TaggedObjectParser) {
            ASN1TaggedObjectParser aSN1TaggedObjectParser2 = aSN1TaggedObjectParser;
            if (aSN1TaggedObjectParser2.hasContextTag(0)) {
                ASN1SequenceParser baseUniversal = aSN1TaggedObjectParser2.parseBaseUniversal(false, 16);
                this.nextObject = null;
                return OriginatorInfo.getInstance(baseUniversal.getLoadedObject());
            }
        }
        return null;
    }

    public ASN1SetParser getRecipientInfos() throws IOException {
        if (!this.originatorInfoCalled) {
            getOriginatorInfo();
        }
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1SetParser aSN1SetParser = this.nextObject;
        this.nextObject = null;
        return aSN1SetParser;
    }

    public ASN1SetParser getUnauthAttrs() throws IOException {
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1TaggedObject aSN1TaggedObject = this.nextObject;
        if (aSN1TaggedObject == null) {
            return null;
        }
        this.nextObject = null;
        return ASN1Util.parseContextBaseUniversal(aSN1TaggedObject, 3, false, 17);
    }

    public ASN1Integer getVersion() {
        return this.version;
    }
}
