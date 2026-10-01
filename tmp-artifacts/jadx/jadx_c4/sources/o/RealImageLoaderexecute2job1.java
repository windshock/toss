package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.RealImageLoaderexecute2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealImageLoaderexecute2job1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public static final int onWarmupCompleted = 0;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private final Function1<RealImageLoaderexecute2.onExtraCallback, Unit> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public RealImageLoaderexecute2job1(@NotNull Function1<? super RealImageLoaderexecute2.onExtraCallback, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = function1;
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(RealImageLoaderexecute2.onExtraCallback.NONE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    public final Function1<RealImageLoaderexecute2.onExtraCallback, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Function1<RealImageLoaderexecute2.onExtraCallback, Unit> function1 = this.onNavigationEvent;
        int i5 = i2 + 7;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return function1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RealImageLoaderexecute2.onExtraCallback onExtraCallback2 = onExtraCallback();
        RealImageLoaderexecute2.onExtraCallback onextracallback = RealImageLoaderexecute2.onExtraCallback.SHOW;
        if (onExtraCallback2 != onextracallback) {
            onNavigationEvent(onextracallback);
            int i4 = IAuthTabCallback + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        RealImageLoaderexecute2.onExtraCallback onExtraCallback2 = onExtraCallback();
        RealImageLoaderexecute2.onExtraCallback onextracallback = RealImageLoaderexecute2.onExtraCallback.HIDE;
        if (onExtraCallback2 != onextracallback) {
            int i2 = onExtraCallback + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(onextracallback);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onExtraCallback + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final RealImageLoaderexecute2.onExtraCallback onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return (RealImageLoaderexecute2.onExtraCallback) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        }
        throw null;
    }

    public final void onNavigationEvent(@NotNull RealImageLoaderexecute2.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onExtraCallbackWithResult.IAuthTabCallback(onextracallback);
        int i4 = IAuthTabCallback + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
