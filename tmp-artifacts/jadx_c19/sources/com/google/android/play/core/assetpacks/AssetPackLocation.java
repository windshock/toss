package com.google.android.play.core.assetpacks;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class AssetPackLocation {
    private static final AssetPackLocation a = new bm(1, null, null);

    static AssetPackLocation a() {
        return a;
    }

    public abstract String assetsPath();

    public abstract int packStorageMethod();

    public abstract String path();
}
