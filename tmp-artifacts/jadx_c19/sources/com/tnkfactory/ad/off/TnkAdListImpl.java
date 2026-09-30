package com.tnkfactory.ad.off;

import android.view.ViewGroup;
import com.tnkfactory.ad.AdListViewImpl;
import com.tnkfactory.ad.TnkAdList;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.rwd.Settings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListImpl implements TnkAdList {
    public final TnkContext a;

    public TnkAdListImpl(@NotNull TnkContext tnkContext) {
        Intrinsics.checkNotNullParameter(tnkContext, "");
        this.a = tnkContext;
    }

    public final TnkContext getTnkContext() {
        return this.a;
    }

    @Override // com.tnkfactory.ad.TnkAdList
    public ViewGroup showListview() {
        return new AdListViewImpl(this.a);
    }

    @Override // com.tnkfactory.ad.TnkAdList
    public ViewGroup showListview(long j) {
        Settings.INSTANCE.setReceiveAppId(this.a.getActivity(), j);
        return new AdListViewImpl(this.a);
    }
}
