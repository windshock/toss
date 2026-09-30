package im.toss.features.home.core.ui.recyclerview.decoration;

import kotlin.jvm.functions.Function0;
import o.DefaultAppLoggerImpl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardItemDecoration$$ExternalSyntheticLambda2 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ DefaultAppLoggerImpl f$0;

    public final Object invoke() {
        DefaultAppLoggerImpl.onExtraCallback onextracallbackOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onextracallbackOnNavigationEvent = DefaultAppLoggerImpl.onNavigationEvent(this.f$0);
            int i3 = 87 / 0;
        } else {
            onextracallbackOnNavigationEvent = DefaultAppLoggerImpl.onNavigationEvent(this.f$0);
        }
        int i4 = IAuthTabCallback + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return onextracallbackOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
