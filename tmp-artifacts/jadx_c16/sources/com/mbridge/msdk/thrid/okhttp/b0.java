package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okio.c;
import com.mbridge.msdk.thrid.okio.e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class b0 implements Closeable {

    static final class a extends b0 {
        final /* synthetic */ u a;
        final /* synthetic */ long b;
        final /* synthetic */ e c;

        a(u uVar, long j, e eVar) {
            this.a = uVar;
            this.b = j;
            this.c = eVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public long k() {
            return this.b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        @Nullable
        public u l() {
            return this.a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public e m() {
            return this.c;
        }
    }

    public static b0 a(@Nullable u uVar, byte[] bArr) {
        return a(uVar, bArr.length, new c().a(bArr));
    }

    private Charset h() {
        u uVarL = l();
        return uVarL != null ? uVarL.a(com.mbridge.msdk.thrid.okhttp.internal.c.j) : com.mbridge.msdk.thrid.okhttp.internal.c.j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(m());
    }

    public final InputStream d() {
        return m().j();
    }

    public abstract long k();

    @Nullable
    public abstract u l();

    public abstract e m();

    public final String n() throws IOException {
        e eVarM = m();
        try {
            return eVarM.a(com.mbridge.msdk.thrid.okhttp.internal.c.a(eVarM, h()));
        } finally {
            com.mbridge.msdk.thrid.okhttp.internal.c.a(eVarM);
        }
    }

    public static b0 a(@Nullable u uVar, long j, e eVar) {
        if (eVar != null) {
            return new a(uVar, j, eVar);
        }
        throw new NullPointerException("source == null");
    }
}
