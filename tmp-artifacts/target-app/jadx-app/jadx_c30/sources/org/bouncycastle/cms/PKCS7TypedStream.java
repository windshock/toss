package org.bouncycastle.cms;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PKCS7TypedStream extends CMSTypedStream {
    private final ASN1Encodable content;

    public PKCS7TypedStream(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1ObjectIdentifier);
        this.content = aSN1Encodable;
    }

    private InputStream getContentStream(ASN1Encodable aSN1Encodable) throws IOException {
        byte b;
        byte[] encoded = aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER);
        int i = 1;
        if ((encoded[0] & 31) == 31) {
            int i2 = 1;
            do {
                b = encoded[i2];
                i2++;
            } while ((b & ISOFileInfo.DATA_BYTES1) != 0);
            i = i2;
        }
        int i3 = i + 1;
        byte b2 = encoded[i];
        if ((b2 & ISOFileInfo.DATA_BYTES1) != 0) {
            i3 += b2 & Byte.MAX_VALUE;
        }
        return new ByteArrayInputStream(encoded, i3, encoded.length - i3);
    }

    @Override // org.bouncycastle.cms.CMSTypedStream
    public void drain() throws IOException {
        this.content.toASN1Primitive();
    }

    public ASN1Encodable getContent() {
        return this.content;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSRuntimeException */
    @Override // org.bouncycastle.cms.CMSTypedStream
    public InputStream getContentStream() throws CMSRuntimeException {
        try {
            return getContentStream(this.content);
        } catch (IOException e) {
            throw new CMSRuntimeException("unable to convert content to stream: " + e.getMessage(), e);
        }
    }
}
