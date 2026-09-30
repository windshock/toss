package com.tnkfactory.ad.rwd.data.view;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Filter {
    private int filterId;
    private String filterNm;
    private String filterUrl;

    public Filter(@NotNull String str, int i2, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.filterNm = str;
        this.filterId = i2;
        this.filterUrl = str2;
    }

    public final int getFilterId() {
        return this.filterId;
    }

    public final String getFilterNm() {
        return this.filterNm;
    }

    public final String getFilterUrl() {
        return this.filterUrl;
    }

    public final void setFilterId(int i2) {
        this.filterId = i2;
    }

    public final void setFilterNm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.filterNm = str;
    }

    public final void setFilterUrl(@Nullable String str) {
        this.filterUrl = str;
    }

    public /* synthetic */ Filter(String str, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i2, (i3 & 4) != 0 ? null : str2);
    }
}
