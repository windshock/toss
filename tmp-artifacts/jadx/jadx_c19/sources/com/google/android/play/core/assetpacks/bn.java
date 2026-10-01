package com.google.android.play.core.assetpacks;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class bn extends AssetPackState {
    private final String a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final int f;
    private final int g;
    private final String h;

    /* renamed from: i, reason: collision with root package name */
    private final String f10i;

    bn(String str, int i2, int i3, long j, long j2, int i4, int i5, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = i4;
        this.g = i5;
        if (str2 == null) {
            throw new NullPointerException("Null availableVersionTag");
        }
        this.h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null installedVersionTag");
        }
        this.f10i = str3;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String availableVersionTag() {
        return this.h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long bytesDownloaded() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AssetPackState)) {
            return false;
        }
        AssetPackState assetPackState = (AssetPackState) obj;
        return this.a.equals(assetPackState.name()) && this.b == assetPackState.status() && this.c == assetPackState.errorCode() && this.d == assetPackState.bytesDownloaded() && this.e == assetPackState.totalBytesToDownload() && this.f == assetPackState.transferProgressPercentage() && this.g == assetPackState.updateAvailability() && this.h.equals(assetPackState.availableVersionTag()) && this.f10i.equals(assetPackState.installedVersionTag());
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int errorCode() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        long j = this.e;
        String str = this.h;
        long j2 = this.d;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = (int) (j ^ (j >>> 32));
        int i5 = this.f;
        int i6 = this.g;
        return ((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ str.hashCode()) * 1000003) ^ this.f10i.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String installedVersionTag() {
        return this.f10i;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String name() {
        return this.a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int status() {
        return this.b;
    }

    public final String toString() {
        return "AssetPackState{name=" + this.a + ", status=" + this.b + ", errorCode=" + this.c + ", bytesDownloaded=" + this.d + ", totalBytesToDownload=" + this.e + ", transferProgressPercentage=" + this.f + ", updateAvailability=" + this.g + ", availableVersionTag=" + this.h + ", installedVersionTag=" + this.f10i + "}";
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long totalBytesToDownload() {
        return this.e;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int transferProgressPercentage() {
        return this.f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int updateAvailability() {
        return this.g;
    }
}
