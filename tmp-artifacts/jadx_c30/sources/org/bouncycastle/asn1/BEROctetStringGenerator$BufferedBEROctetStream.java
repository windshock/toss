package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class BEROctetStringGenerator$BufferedBEROctetStream extends OutputStream {
    private byte[] _buf;
    private DEROutputStream _derOut;
    private int _off = 0;
    final /* synthetic */ BEROctetStringGenerator this$0;

    BEROctetStringGenerator$BufferedBEROctetStream(BEROctetStringGenerator bEROctetStringGenerator, byte[] bArr) {
        this.this$0 = bEROctetStringGenerator;
        this._buf = bArr;
        this._derOut = new DEROutputStream(((ASN1Generator) bEROctetStringGenerator)._out);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = this._off;
        if (i != 0) {
            DEROctetString.encode(this._derOut, true, this._buf, 0, i);
        }
        this._derOut.flushInternal();
        this.this$0.writeBEREnd();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this._buf;
        int i2 = this._off;
        int i3 = i2 + 1;
        this._off = i3;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            DEROctetString.encode(this._derOut, true, bArr, 0, bArr.length);
            this._off = 0;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this._buf;
        int length = bArr2.length;
        int i3 = this._off;
        int i4 = length - i3;
        if (i2 < i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this._off += i2;
            return;
        }
        if (i3 > 0) {
            System.arraycopy(bArr, i, bArr2, i3, i4);
            DEROctetString.encode(this._derOut, true, this._buf, 0, length);
        } else {
            i4 = 0;
        }
        while (true) {
            int i5 = i2 - i4;
            if (i5 < length) {
                System.arraycopy(bArr, i + i4, this._buf, 0, i5);
                this._off = i5;
                return;
            } else {
                DEROctetString.encode(this._derOut, true, bArr, i + i4, length);
                i4 += length;
            }
        }
    }
}
