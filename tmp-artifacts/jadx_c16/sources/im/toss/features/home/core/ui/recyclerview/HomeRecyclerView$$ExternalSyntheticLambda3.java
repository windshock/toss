package im.toss.features.home.core.ui.recyclerview;

import o.ErrorNoLog1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeRecyclerView$$ExternalSyntheticLambda3 implements ErrorNoLog1.onExtraCallback {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ HomeRecyclerView f$0;

    public final Integer getItemPositionById(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Integer numIAuthTabCallback = HomeRecyclerView.IAuthTabCallback(this.f$0, str);
        int i4 = onExtraCallback + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return numIAuthTabCallback;
    }
}
