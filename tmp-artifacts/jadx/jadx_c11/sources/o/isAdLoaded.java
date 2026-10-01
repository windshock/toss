package o;

import android.view.ViewConfiguration;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isAdLoaded implements AutoValue_DefaultSurfaceProcessor_PendingSnapshot {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final long onExtraCallbackWithResult;
    private final ViewConfiguration onNavigationEvent;
    private final long onWarmupCompleted;

    public /* synthetic */ isAdLoaded(ViewConfiguration viewConfiguration, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewConfiguration, j);
    }

    private isAdLoaded(ViewConfiguration viewConfiguration, long j) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "");
        this.onNavigationEvent = viewConfiguration;
        this.onExtraCallbackWithResult = j;
        this.onWarmupCompleted = 40L;
    }

    public long IAuthTabCallback() {
        long j;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 1;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.onWarmupCompleted;
            int i4 = 0 / 0;
        } else {
            j = this.onWarmupCompleted;
        }
        int i5 = i2 + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        long doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout();
        int i4 = onExtraCallback + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return doubleTapTimeout;
    }

    public long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int longPressTimeout = ViewConfiguration.getLongPressTimeout();
        if (i3 != 0) {
            return longPressTimeout;
        }
        int i4 = 83 / 0;
        return longPressTimeout;
    }

    public float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        float scaledTouchSlop = this.onNavigationEvent.getScaledTouchSlop();
        int i4 = onExtraCallback + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return scaledTouchSlop;
    }

    public long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 55;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i2 + 33;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
