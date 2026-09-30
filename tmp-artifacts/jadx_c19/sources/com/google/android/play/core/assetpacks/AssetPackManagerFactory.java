package com.google.android.play.core.assetpacks;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AssetPackManagerFactory {
    private AssetPackManagerFactory() {
    }

    public static AssetPackManager getInstance(@NonNull Context context) {
        AssetPackManager assetPackManagerA;
        synchronized (AssetPackManagerFactory.class) {
            assetPackManagerA = d.a(context).a();
        }
        return assetPackManagerA;
    }
}
