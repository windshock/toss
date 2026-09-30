package org.bouncycastle.jcajce.spec;

import java.security.spec.EncodedKeySpec;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RawEncodedKeySpec extends EncodedKeySpec {
    public RawEncodedKeySpec(byte[] bArr) {
        super(bArr);
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return "RAW";
    }
}
