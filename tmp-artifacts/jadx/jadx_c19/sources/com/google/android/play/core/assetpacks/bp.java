package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class bp extends el {
    private final int a;
    private final String b;
    private final long c;
    private final long d;
    private final int e;

    bp(int i2, @Nullable String str, long j, long j2, int i3) {
        this.a = i2;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = i3;
    }

    @Override // com.google.android.play.core.assetpacks.el
    final int a() {
        return this.a;
    }

    @Override // com.google.android.play.core.assetpacks.el
    final int b() {
        return this.e;
    }

    @Override // com.google.android.play.core.assetpacks.el
    final long c() {
        return this.c;
    }

    @Override // com.google.android.play.core.assetpacks.el
    final long d() {
        return this.d;
    }

    @Override // com.google.android.play.core.assetpacks.el
    final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof el)) {
            return false;
        }
        el elVar = (el) obj;
        if (this.a != elVar.a()) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (elVar.e() != null) {
                return false;
            }
        } else if (!str.equals(elVar.e())) {
            return false;
        }
        return this.c == elVar.c() && this.d == elVar.d() && this.e == elVar.b();
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i2 = this.a;
        long j = this.c;
        long j2 = this.d;
        return ((((((iHashCode ^ ((i2 ^ 1000003) * 1000003)) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "SliceCheckpoint{fileExtractionStatus=" + this.a + ", filePath=" + this.b + ", fileOffset=" + this.c + ", remainingBytes=" + this.d + ", previousChunk=" + this.e + "}";
    }
}
