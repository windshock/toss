package im.toss.devtool.action.presentation;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DevToolActionListViewModel$$ExternalSyntheticLambda2 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ DevToolActionListViewModel f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ DevToolActionListViewModel$$ExternalSyntheticLambda2(DevToolActionListViewModel devToolActionListViewModel, String str) {
        this.f$0 = devToolActionListViewModel;
        this.f$1 = str;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 | 3;
        int i4 = (i3 << 1) - ((~(i2 & 3)) & i3);
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        DevToolActionListViewModel devToolActionListViewModel = this.f$0;
        String str = this.f$1;
        if (i5 == 0) {
            return DevToolActionListViewModel.onNavigationEvent(devToolActionListViewModel, str);
        }
        DevToolActionListViewModel.onNavigationEvent(devToolActionListViewModel, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
