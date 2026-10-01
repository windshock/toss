package org.bouncycastle.util.encoders;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class UrlBase64Encoder extends Base64Encoder {
    public UrlBase64Encoder() {
        byte[] bArr = ((Base64Encoder) this).encodingTable;
        bArr[bArr.length - 2] = 45;
        bArr[bArr.length - 1] = 95;
        ((Base64Encoder) this).padding = (byte) 46;
        initialiseDecodingTable();
    }
}
