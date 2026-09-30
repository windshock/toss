package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class AssetPackStates {
    public static AssetPackStates a(Bundle bundle, co coVar, ea eaVar, be beVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap map = new HashMap();
        int size = stringArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = stringArrayList.get(i2);
            map.put(str, AssetPackState.b(bundle, str, coVar, eaVar, beVar));
        }
        return new bo(bundle.getLong("total_bytes_to_download"), map);
    }

    public abstract Map<String, AssetPackState> packStates();

    public abstract long totalBytes();
}
