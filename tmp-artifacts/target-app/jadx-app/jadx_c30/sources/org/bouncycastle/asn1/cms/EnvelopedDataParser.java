package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.ASN1Util;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class EnvelopedDataParser {
    private ASN1Encodable _nextObject;
    private boolean _originatorInfoCalled;
    private ASN1SequenceParser _seq;
    private ASN1Integer _version;

    public EnvelopedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
        this._seq = aSN1SequenceParser;
        this._version = ASN1Integer.getInstance(aSN1SequenceParser.readObject());
    }

    public EncryptedContentInfoParser getEncryptedContentInfo() throws IOException {
        if (this._nextObject == null) {
            this._nextObject = this._seq.readObject();
        }
        ASN1SequenceParser aSN1SequenceParser = this._nextObject;
        if (aSN1SequenceParser == null) {
            return null;
        }
        this._nextObject = null;
        return new EncryptedContentInfoParser(aSN1SequenceParser);
    }

    public OriginatorInfo getOriginatorInfo() throws IOException {
        this._originatorInfoCalled = true;
        if (this._nextObject == null) {
            this._nextObject = this._seq.readObject();
        }
        ASN1TaggedObjectParser aSN1TaggedObjectParser = this._nextObject;
        if (aSN1TaggedObjectParser instanceof ASN1TaggedObjectParser) {
            ASN1TaggedObjectParser aSN1TaggedObjectParser2 = aSN1TaggedObjectParser;
            if (aSN1TaggedObjectParser2.hasContextTag(0)) {
                ASN1SequenceParser baseUniversal = aSN1TaggedObjectParser2.parseBaseUniversal(false, 16);
                this._nextObject = null;
                return OriginatorInfo.getInstance(baseUniversal.getLoadedObject());
            }
        }
        return null;
    }

    public ASN1SetParser getRecipientInfos() throws IOException {
        if (!this._originatorInfoCalled) {
            getOriginatorInfo();
        }
        if (this._nextObject == null) {
            this._nextObject = this._seq.readObject();
        }
        ASN1SetParser aSN1SetParser = this._nextObject;
        this._nextObject = null;
        return aSN1SetParser;
    }

    public ASN1SetParser getUnprotectedAttrs() throws IOException {
        if (this._nextObject == null) {
            this._nextObject = this._seq.readObject();
        }
        ASN1TaggedObjectParser aSN1TaggedObjectParser = this._nextObject;
        if (aSN1TaggedObjectParser == null) {
            return null;
        }
        this._nextObject = null;
        return ASN1Util.parseContextBaseUniversal(aSN1TaggedObjectParser, 1, false, 17);
    }

    public ASN1Integer getVersion() {
        return this._version;
    }
}
