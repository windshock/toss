package com.google.android.play.core.assetpacks;

import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class bo extends AssetPackStates {
    private final long a;
    private final Map b;

    bo(long j, Map map) {
        this.a = j;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AssetPackStates)) {
            return false;
        }
        AssetPackStates assetPackStates = (AssetPackStates) obj;
        return this.a == assetPackStates.totalBytes() && this.b.equals(assetPackStates.packStates());
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackStates
    public final Map<String, AssetPackState> packStates() {
        return this.b;
    }

    public final String toString() {
        return "AssetPackStates{totalBytes=" + this.a + ", packStates=" + this.b.toString() + "}";
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackStates
    public final long totalBytes() {
        return this.a;
    }
}
