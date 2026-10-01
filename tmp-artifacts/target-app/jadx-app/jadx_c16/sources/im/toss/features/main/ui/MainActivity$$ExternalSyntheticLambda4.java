package im.toss.features.main.ui;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ MainActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        MainActivity mainActivity = this.f$0;
        Integer num = (Integer) obj;
        if (i3 != 0) {
            return MainActivity.onExtraCallbackWithResult(mainActivity, num.intValue());
        }
        MainActivity.onExtraCallbackWithResult(mainActivity, num.intValue());
        throw null;
    }
}
