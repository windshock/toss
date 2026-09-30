package org.bouncycastle.eac.operator;

import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface EACSignatureVerifier {
    OutputStream getOutputStream();

    ASN1ObjectIdentifier getUsageIdentifier();

    boolean verify(byte[] bArr);
}
