package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface ASN1SetParser extends ASN1Encodable, InMemoryRepresentable {
    ASN1Encodable readObject() throws IOException;
}
