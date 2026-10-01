package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class bm extends AssetPackLocation {
    private final int a;
    private final String b;
    private final String c;

    bm(int i2, @Nullable String str, @Nullable String str2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final String assetsPath() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AssetPackLocation)) {
            return false;
        }
        AssetPackLocation assetPackLocation = (AssetPackLocation) obj;
        if (this.a != assetPackLocation.packStorageMethod()) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (assetPackLocation.path() != null) {
                return false;
            }
        } else if (!str.equals(assetPackLocation.path())) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null) {
            if (assetPackLocation.assetsPath() != null) {
                return false;
            }
        } else if (!str2.equals(assetPackLocation.assetsPath())) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final int packStorageMethod() {
        return this.a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final String path() {
        return this.b;
    }

    public final String toString() {
        return "AssetPackLocation{packStorageMethod=" + this.a + ", path=" + this.b + ", assetsPath=" + this.c + "}";
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i2 = this.a;
        String str2 = this.c;
        return ((iHashCode ^ ((i2 ^ 1000003) * 1000003)) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
