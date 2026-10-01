package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class cn extends OutputStream {
    private final ds a = new ds();
    private final File b;
    private final em c;
    private long d;
    private long e;
    private FileOutputStream f;
    private es g;

    cn(File file, em emVar) {
        this.b = file;
        this.c = emVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        write(new byte[]{(byte) i2}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        int iMin;
        while (i3 > 0) {
            if (this.d == 0 && this.e == 0) {
                int iB = this.a.b(bArr, i2, i3);
                if (iB == -1) {
                    return;
                }
                i2 += iB;
                i3 -= iB;
                es esVarC = this.a.c();
                this.g = esVarC;
                if (esVarC.d()) {
                    this.d = 0L;
                    this.c.l(this.g.f(), 0, this.g.f().length);
                    this.e = this.g.f().length;
                } else if (!this.g.h() || this.g.g()) {
                    byte[] bArrF = this.g.f();
                    this.c.l(bArrF, 0, bArrF.length);
                    this.d = this.g.b();
                } else {
                    this.c.j(this.g.f());
                    File file = new File(this.b, this.g.c());
                    file.getParentFile().mkdirs();
                    this.d = this.g.b();
                    this.f = new FileOutputStream(file);
                }
            }
            if (!this.g.g()) {
                long j = i3;
                if (this.g.d()) {
                    this.c.e(this.e, bArr, i2, i3);
                    this.e += j;
                    iMin = i3;
                } else if (!this.g.h()) {
                    iMin = (int) Math.min(j, this.d);
                    this.c.e((this.g.f().length + this.g.b()) - this.d, bArr, i2, iMin);
                    this.d -= iMin;
                } else {
                    iMin = (int) Math.min(j, this.d);
                    this.f.write(bArr, i2, iMin);
                    long j2 = this.d - iMin;
                    this.d = j2;
                    if (j2 == 0) {
                        this.f.close();
                    }
                }
                i2 += iMin;
                i3 -= iMin;
            }
        }
    }
}
