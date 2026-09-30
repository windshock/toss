package im.toss.devtool.action.presentation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DevToolActionListViewModel$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ DevToolActionListViewModel f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ DevToolActionListViewModel$$ExternalSyntheticLambda0(DevToolActionListViewModel devToolActionListViewModel, String str) {
        this.f$0 = devToolActionListViewModel;
        this.f$1 = str;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 ^ 109;
        int i4 = (i2 & 109) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        onExtraCallback = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            DevToolActionListViewModel.onExtraCallback(this.f$0, this.f$1);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = DevToolActionListViewModel.onExtraCallback(this.f$0, this.f$1);
        int i6 = onWarmupCompleted + 23;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }
}
