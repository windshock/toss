package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface ASN1ApplicationSpecificParser extends ASN1TaggedObjectParser {
    ASN1Encodable readObject() throws IOException;
}
