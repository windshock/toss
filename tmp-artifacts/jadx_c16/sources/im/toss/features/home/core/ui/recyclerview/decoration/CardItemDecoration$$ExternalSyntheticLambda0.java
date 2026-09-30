package im.toss.features.home.core.ui.recyclerview.decoration;

import java.util.List;
import kotlin.jvm.functions.Function0;
import o.DefaultAppLoggerImpl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardItemDecoration$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ DefaultAppLoggerImpl f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List listOnExtraCallback = DefaultAppLoggerImpl.onExtraCallback(this.f$0);
        int i4 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return listOnExtraCallback;
    }
}
