package org.bouncycastle.crypto.parsers;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.util.io.Streams;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ECIESPublicKeyParser implements KeyParser {
    private ECDomainParameters ecParams;

    public ECIESPublicKeyParser(ECDomainParameters eCDomainParameters) {
        this.ecParams = eCDomainParameters;
    }

    @Override // org.bouncycastle.crypto.KeyParser
    public AsymmetricKeyParameter readKey(InputStream inputStream) throws IOException {
        int fieldSize;
        int i = inputStream.read();
        if (i == 0) {
            throw new IOException("Sender's public key invalid.");
        }
        if (i == 2 || i == 3) {
            fieldSize = (this.ecParams.getCurve().getFieldSize() + 7) / 8;
        } else {
            if (i != 4 && i != 6 && i != 7) {
                throw new IOException("Sender's public key has invalid point encoding 0x" + Integer.toString(i, 16));
            }
            fieldSize = ((this.ecParams.getCurve().getFieldSize() + 7) / 8) << 1;
        }
        byte[] bArr = new byte[fieldSize + 1];
        bArr[0] = (byte) i;
        Streams.readFully(inputStream, bArr, 1, bArr.length - 1);
        return new ECPublicKeyParameters(this.ecParams.getCurve().decodePoint(bArr), this.ecParams);
    }
}
