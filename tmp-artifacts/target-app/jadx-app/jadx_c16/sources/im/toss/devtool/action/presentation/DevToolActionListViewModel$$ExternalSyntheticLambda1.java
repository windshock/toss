package im.toss.devtool.action.presentation;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DevToolActionListViewModel$$ExternalSyntheticLambda1 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = ((i2 ^ 71) | (i2 & 71)) << 1;
        int i4 = -(((~i2) & 71) | (i2 & (-72)));
        int i5 = (i3 & i4) + (i4 | i3);
        onNavigationEvent = i5 % 128;
        Object obj2 = null;
        String str = (String) obj;
        if (i5 % 2 == 0) {
            DevToolActionListViewModel.onExtraCallback(str);
            obj2.hashCode();
            throw null;
        }
        CharSequence charSequenceOnExtraCallback = DevToolActionListViewModel.onExtraCallback(str);
        int i6 = onWarmupCompleted + 23;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return charSequenceOnExtraCallback;
        }
        obj2.hashCode();
        throw null;
    }
}
