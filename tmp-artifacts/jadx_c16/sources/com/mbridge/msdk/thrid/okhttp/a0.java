package com.mbridge.msdk.thrid.okhttp;

import java.io.Closeable;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class a0 implements Closeable {
    final y a;
    final w b;
    final int c;
    final String d;

    @Nullable
    final q e;
    final r f;

    @Nullable
    final b0 g;

    @Nullable
    final a0 h;

    @Nullable
    final a0 i;

    @Nullable
    final a0 j;
    final long k;
    final long l;

    @Nullable
    private volatile c m;

    a0(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f.a();
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
    }

    @Nullable
    public String a(String str, @Nullable String str2) {
        String strB = this.f.b(str);
        return strB != null ? strB : str2;
    }

    @Nullable
    public String b(String str) {
        return a(str, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.g;
        if (b0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        b0Var.close();
    }

    @Nullable
    public b0 d() {
        return this.g;
    }

    public c h() {
        c cVar = this.m;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f);
        this.m = cVarA;
        return cVarA;
    }

    public int k() {
        return this.c;
    }

    @Nullable
    public q l() {
        return this.e;
    }

    public r m() {
        return this.f;
    }

    public boolean n() {
        int i = this.c;
        return i >= 200 && i < 300;
    }

    public String o() {
        return this.d;
    }

    public a p() {
        return new a(this);
    }

    @Nullable
    public a0 q() {
        return this.j;
    }

    public long r() {
        return this.l;
    }

    public y s() {
        return this.a;
    }

    public long t() {
        return this.k;
    }

    public String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.c + ", message=" + this.d + ", url=" + this.a.g() + '}';
    }
}
