package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ParametersWithID implements CipherParameters {
    private byte[] id;
    private CipherParameters parameters;

    public ParametersWithID(CipherParameters cipherParameters, byte[] bArr) {
        this.parameters = cipherParameters;
        this.id = bArr;
    }

    public byte[] getID() {
        return this.id;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }
}
