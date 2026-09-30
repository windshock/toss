package o;

import im.toss.securities.core.router.spec.TossSecRoute;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.pExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class pExternalSyntheticLambda2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static final accessisMonitoringp<pExternalSyntheticLambda1> onWarmupCompleted = setPostviewFormatSelector.IAuthTabCallback(new Function0() { // from class: im.toss.securities.core.exposure.ScreenTrackerKt$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return pExternalSyntheticLambda2.onNavigationEvent();
            }
            pExternalSyntheticLambda2.onNavigationEvent();
            throw null;
        }
    });

    public static final /* synthetic */ class IAuthTabCallback implements Predicate {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onWarmupCompleted;

        public IAuthTabCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        @Override // java.util.function.Predicate
        public final /* synthetic */ boolean test(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = ((Boolean) this.onWarmupCompleted.invoke(obj)).booleanValue();
            if (i3 != 0) {
                int i4 = 27 / 0;
            }
            return zBooleanValue;
        }
    }

    public static final /* synthetic */ class onExtraCallback implements Predicate {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public onExtraCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallbackWithResult = function1;
        }

        @Override // java.util.function.Predicate
        public final /* synthetic */ boolean test(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = ((Boolean) this.onExtraCallbackWithResult.invoke(obj)).booleanValue();
            int i4 = IAuthTabCallback + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return zBooleanValue;
        }
    }

    public static /* synthetic */ pExternalSyntheticLambda1 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        pExternalSyntheticLambda1 pexternalsyntheticlambda1IAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return pexternalsyntheticlambda1IAuthTabCallback;
        }
        throw null;
    }

    static {
        int i = onExtraCallback + 5;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 79 / 0;
        }
    }

    public static final accessisMonitoringp<pExternalSyntheticLambda1> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        accessisMonitoringp<pExternalSyntheticLambda1> accessismonitoringp = onWarmupCompleted;
        int i4 = i3 + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return accessismonitoringp;
    }

    private static final pExternalSyntheticLambda1 IAuthTabCallback() {
        int i = 2 % 2;
        AFd1mSDK.onNavigationEvent("ScreenTracker", (Throwable) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("content", "LocalScreenTracker not provided")), false, (Function1) null, 26, (Object) null);
        pExternalSyntheticLambda1 pexternalsyntheticlambda1 = new pExternalSyntheticLambda1(TossSecRoute.Main.PATH, null, null, null, null, 30, null);
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return pexternalsyntheticlambda1;
    }
}
