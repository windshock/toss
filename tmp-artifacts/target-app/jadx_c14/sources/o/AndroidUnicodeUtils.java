package o;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import o.AndroidUnicodeUtils;
import o.nativeFree;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AndroidUnicodeUtils {
    private static final Lazy initDataProvider$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.model.init.v2.InitDataProviderAccessorKt$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            nativeFree nativefreeOnNavigationEvent = AndroidUnicodeUtils.onNavigationEvent();
            int i4 = onNavigationEvent + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return nativefreeOnNavigationEvent;
            }
            throw null;
        }
    });
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ nativeFree onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        nativeFree nativefreeOnExtraCallback = onExtraCallback();
        int i4 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return nativefreeOnExtraCallback;
    }

    static {
        int i = onWarmupCompleted + 21;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static final nativeFree onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        nativeFree nativefree = (nativeFree) initDataProvider$delegate.getValue();
        int i4 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return nativefree;
    }

    private static final nativeFree onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        nativeFree nativefreeRequiresPermissionWrite = ((dateFormat) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), dateFormat.class)).RequiresPermissionWrite();
        int i4 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return nativefreeRequiresPermissionWrite;
    }
}
