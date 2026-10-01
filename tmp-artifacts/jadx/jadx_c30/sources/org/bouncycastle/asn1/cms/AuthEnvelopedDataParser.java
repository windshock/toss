package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.ASN1Util;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class AuthEnvelopedDataParser {
    private boolean isData;
    private ASN1Encodable nextObject;
    private boolean originatorInfoCalled;
    private ASN1SequenceParser seq;
    private ASN1Integer version;

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.asn1.ASN1ParsingException */
    public AuthEnvelopedDataParser(ASN1SequenceParser aSN1SequenceParser) throws ASN1ParsingException, IOException {
        this.seq = aSN1SequenceParser;
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1SequenceParser.readObject());
        this.version = aSN1Integer;
        if (!aSN1Integer.hasValue(0)) {
            throw new ASN1ParsingException("AuthEnvelopedData version number must be 0");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.asn1.ASN1ParsingException */
    public ASN1SetParser getAuthAttrs() throws ASN1ParsingException, IOException {
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1TaggedObjectParser aSN1TaggedObjectParser = this.nextObject;
        if (aSN1TaggedObjectParser instanceof ASN1TaggedObjectParser) {
            this.nextObject = null;
            return ASN1Util.parseContextBaseUniversal(aSN1TaggedObjectParser, 1, false, 17);
        }
        if (this.isData) {
            return null;
        }
        throw new ASN1ParsingException("authAttrs must be present with non-data content");
    }

    public EncryptedContentInfoParser getAuthEncryptedContentInfo() throws IOException {
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1SequenceParser aSN1SequenceParser = this.nextObject;
        if (aSN1SequenceParser == null) {
            return null;
        }
        this.nextObject = null;
        EncryptedContentInfoParser encryptedContentInfoParser = new EncryptedContentInfoParser(aSN1SequenceParser);
        this.isData = CMSObjectIdentifiers.data.equals(encryptedContentInfoParser.getContentType());
        return encryptedContentInfoParser;
    }

    public ASN1OctetString getMac() throws IOException {
        if (this.nextObject == null) {
            this.nextObject = this.seq.readObject();
        }
        ASN1Encodable aSN1Encodable = this.nextObject;
        this.nextObject = null;
        return ASN1OctetString.getInstance(aSN1Encodable.toASN1Primitive());
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
        ASN1TaggedObjectParser aSN1TaggedObjectParser = this.nextObject;
        if (aSN1TaggedObjectParser == null) {
            return null;
        }
        this.nextObject = null;
        return ASN1Util.parseContextBaseUniversal(aSN1TaggedObjectParser, 2, false, 17);
    }

    public ASN1Integer getVersion() {
        return this.version;
    }
}
