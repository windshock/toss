package com.tnkfactory.ad.basic;

import android.app.Activity;
import android.view.ViewGroup;
import com.tnkfactory.ad.PlacementEventListener;
import com.tnkfactory.ad.off.data.PlacementPubInfo;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import com.xwray.groupie.GroupieAdapter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class PlacementViewLayout {
    public final GroupieAdapter a;
    public PlacementEventListener b;
    public PlacementPubInfo c;
    public int d;
    public int e;

    public PlacementViewLayout(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.a = new GroupieAdapter();
        this.d = 1;
        this.e = 1;
    }

    public final GroupieAdapter getAdapter() {
        return this.a;
    }

    public final int getPageRowCount() {
        return this.e;
    }

    public final PlacementEventListener getPlacementEventListener() {
        return this.b;
    }

    public final PlacementPubInfo getPubInfo() {
        return this.c;
    }

    public final int getSpanCount() {
        return this.d;
    }

    public abstract ViewGroup initView(@NotNull ViewGroup viewGroup);

    public final void setPageRowCount(int i2) {
        this.e = i2;
    }

    public final void setPlacementEventListener(@Nullable PlacementEventListener placementEventListener) {
        this.b = placementEventListener;
    }

    public final void setPubInfo(@Nullable PlacementPubInfo placementPubInfo) {
        this.c = placementPubInfo;
    }

    public final void setSpanCount(int i2) {
        this.d = i2;
    }

    public abstract void update(@NotNull List<? extends ITnkOffAdItem> list);
}
