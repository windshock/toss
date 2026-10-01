package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemAsset;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdm extends DataBufferRef implements DataItemAsset {
    public zzdm(DataHolder dataHolder, int i2) {
        super(dataHolder, i2);
    }

    public final /* synthetic */ Object freeze() {
        return new zzdk(this);
    }

    public final String getDataItemKey() {
        return getString("asset_key");
    }

    public final String getId() {
        return getString("asset_id");
    }
}
