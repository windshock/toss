package com.google.android.gms.wearable;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.EntityBuffer;
import com.google.android.gms.wearable.internal.zzdj;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DataEventBuffer extends EntityBuffer<DataEvent> implements Result {
    private final Status zza;

    public DataEventBuffer(@NonNull DataHolder dataHolder) {
        super(dataHolder);
        this.zza = new Status(dataHolder.getStatusCode());
    }

    public final /* synthetic */ Object getEntry(int i2, int i3) {
        return new zzdj(((AbstractDataBuffer) this).mDataHolder, i2, i3);
    }

    public final String getPrimaryDataMarkerColumn() {
        return "path";
    }

    public Status getStatus() {
        return this.zza;
    }
}
