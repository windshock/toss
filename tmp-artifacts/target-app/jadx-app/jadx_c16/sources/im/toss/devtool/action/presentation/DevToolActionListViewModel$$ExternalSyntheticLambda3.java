package im.toss.devtool.action.presentation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DevToolActionListViewModel$$ExternalSyntheticLambda3 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ DevToolActionListViewModel f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ DevToolActionListViewModel$$ExternalSyntheticLambda3(DevToolActionListViewModel devToolActionListViewModel, String str) {
        this.f$0 = devToolActionListViewModel;
        this.f$1 = str;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = DevToolActionListViewModel.onWarmupCompleted(this.f$0, this.f$1);
        int i5 = onNavigationEvent + 7;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }
}
