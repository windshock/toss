package com.google.android.gms.wearable;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.data.Freezable;
import java.util.Map;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface DataItem extends Freezable<DataItem> {
    Map<String, DataItemAsset> getAssets();

    @Pure
    byte[] getData();

    Uri getUri();

    DataItem setData(@Nullable byte[] bArr);
}
