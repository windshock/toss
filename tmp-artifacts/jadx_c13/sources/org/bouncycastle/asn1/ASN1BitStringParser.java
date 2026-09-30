package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface ASN1BitStringParser extends ASN1Encodable, InMemoryRepresentable {
    InputStream getBitStream() throws IOException;

    InputStream getOctetStream() throws IOException;

    int getPadBits();
}
