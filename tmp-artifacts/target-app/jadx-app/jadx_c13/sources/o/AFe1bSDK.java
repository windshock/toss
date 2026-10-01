package o;

import im.toss.tosssecurities.tracker.v1.SecuritiesLogV1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AFe1bSDK;
import o.AppSetIdAndScope1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1bSDK {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    public static final AFe1bSDK onWarmupCompleted = new AFe1bSDK();
    private static final Lazy onExtraCallbackWithResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.tosssecurities.tracker.v1.SecuritiesTrackerV1$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                AFe1bSDK.onNavigationEvent();
                throw null;
            }
            AppSetIdAndScope1 appSetIdAndScope1OnNavigationEvent = AFe1bSDK.onNavigationEvent();
            int i3 = IAuthTabCallback + 83;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return appSetIdAndScope1OnNavigationEvent;
            }
            throw null;
        }
    });
    private static final AtomicBoolean onNavigationEvent = new AtomicBoolean(false);
    public static final int onExtraCallback = 8;

    public static /* synthetic */ AppSetIdAndScope1 onNavigationEvent() {
        AppSetIdAndScope1 appSetIdAndScope1IAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            appSetIdAndScope1IAuthTabCallback = IAuthTabCallback();
            int i3 = 29 / 0;
        } else {
            appSetIdAndScope1IAuthTabCallback = IAuthTabCallback();
        }
        int i4 = IAuthTabCallback + 83;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return appSetIdAndScope1IAuthTabCallback;
        }
        throw null;
    }

    private AFe1bSDK() {
    }

    static {
        int i = IAuthTabCallbackStub + 111;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 57 / 0;
        }
    }

    private static final AppSetIdAndScope1 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult("SecuritiesTrackerV1");
        int i4 = IAuthTabCallback + 119;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return appSetIdAndScope1OnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final AppSetIdAndScope1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = (AppSetIdAndScope1) onExtraCallbackWithResult.getValue();
        int i4 = IAuthTabCallbackDefault + 59;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return appSetIdAndScope1;
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (onNavigationEvent.compareAndSet(false, true)) {
            onExtraCallback();
            int i4 = IAuthTabCallbackDefault + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void onExtraCallback(@NotNull SecuritiesLogV1 securitiesLogV1, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(securitiesLogV1, "");
        onWarmupCompleted();
        onExtraCallback();
        securitiesLogV1.IAuthTabCallbackStubProxy();
        GetFeatureExtension.onWarmupCompleted.onWarmupCompleted(securitiesLogV1, z);
        int i2 = IAuthTabCallback + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }
}
