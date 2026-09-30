package o;

import kotlin.jvm.functions.Function0;
import o.AFi1sSDK;
import o.w_;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1sSDK {
    private static final accessisMonitoringp<w_> IAuthTabCallback = setPostviewFormatSelector.IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda0) null, new Function0() { // from class: im.toss.tosssecurities.webview.viewholder.TossSecWebViewHolderKt$$ExternalSyntheticLambda0
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                AFi1sSDK.onExtraCallbackWithResult();
                throw null;
            }
            w_ w_VarOnExtraCallbackWithResult = AFi1sSDK.onExtraCallbackWithResult();
            int i3 = onNavigationEvent + 87;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return w_VarOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }
    }, 1, (Object) null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ w_ onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        w_ w_VarOnExtraCallback = onExtraCallback();
        int i3 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return w_VarOnExtraCallback;
    }

    static {
        Object obj = null;
        int i = onExtraCallback + 107;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final accessisMonitoringp<w_> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        accessisMonitoringp<w_> accessismonitoringp = IAuthTabCallback;
        int i5 = i2 + 9;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return accessismonitoringp;
    }

    private static final w_ onExtraCallback() {
        int i = 2 % 2;
        throw new IllegalStateException();
    }
}
