package org.bouncycastle.eac.operator;

import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface EACSigner {
    OutputStream getOutputStream();

    byte[] getSignature();

    ASN1ObjectIdentifier getUsageIdentifier();
}
