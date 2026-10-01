package org.bouncycastle.cert.crmf;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface EncryptedValuePadder {
    byte[] getPaddedData(byte[] bArr);

    byte[] getUnpaddedData(byte[] bArr);
}
