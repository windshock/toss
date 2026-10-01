package o;

import im.toss.core.webkit.WebViewContentOwner;
import kotlin.jvm.functions.Function0;
import o.setTopGuideTextColor;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setTopGuideTextColor {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static final accessisMonitoringp<WebViewContentOwner> onExtraCallbackWithResult = setPostviewFormatSelector.IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda0) null, new Function0() { // from class: im.toss.core.webkit.WebViewContentOwnerKt$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return setTopGuideTextColor.onExtraCallback();
            }
            setTopGuideTextColor.onExtraCallback();
            throw null;
        }
    }, 1, (Object) null);
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ WebViewContentOwner onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        throw null;
    }

    static {
        int i = onExtraCallback + 97;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final accessisMonitoringp<WebViewContentOwner> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final WebViewContentOwner onNavigationEvent() {
        int i = 2 % 2;
        throw new IllegalStateException("WebViewContentOwner is not provided");
    }
}
