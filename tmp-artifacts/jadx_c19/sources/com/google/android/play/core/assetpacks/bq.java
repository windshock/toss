package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class bq extends es {
    private final String a;
    private final long b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final byte[] f;

    bq(@Nullable String str, long j, int i2, boolean z, boolean z2, @Nullable byte[] bArr) {
        this.a = str;
        this.b = j;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = bArr;
    }

    @Override // com.google.android.play.core.assetpacks.es
    final int a() {
        return this.c;
    }

    @Override // com.google.android.play.core.assetpacks.es
    final long b() {
        return this.b;
    }

    @Override // com.google.android.play.core.assetpacks.es
    final String c() {
        return this.a;
    }

    @Override // com.google.android.play.core.assetpacks.es
    final boolean d() {
        return this.e;
    }

    @Override // com.google.android.play.core.assetpacks.es
    final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof es)) {
            return false;
        }
        es esVar = (es) obj;
        String str = this.a;
        if (str == null) {
            if (esVar.c() != null) {
                return false;
            }
        } else if (!str.equals(esVar.c())) {
            return false;
        }
        if (this.b == esVar.b() && this.c == esVar.a() && this.d == esVar.e() && this.e == esVar.d()) {
            return Arrays.equals(this.f, esVar instanceof bq ? ((bq) esVar).f : esVar.f());
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.es
    final byte[] f() {
        return this.f;
    }

    public final String toString() {
        return "ZipEntry{name=" + this.a + ", size=" + this.b + ", compressionMethod=" + this.c + ", isPartial=" + this.d + ", isEndOfArchive=" + this.e + ", headerBytes=" + Arrays.toString(this.f) + "}";
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i2 = this.c;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i2) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f);
    }
}
