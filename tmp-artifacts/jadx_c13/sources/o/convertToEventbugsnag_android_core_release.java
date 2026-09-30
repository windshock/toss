package o;

import im.toss.core.webkit.TossCoreWebView;
import kotlin.jvm.internal.Intrinsics;
import o.setByType;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class convertToEventbugsnag_android_core_release implements surfaceChanged {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final getStartTimeMillis onExtraCallbackWithResult;

    public convertToEventbugsnag_android_core_release(@NotNull getStartTimeMillis getstarttimemillis) {
        Intrinsics.checkNotNullParameter(getstarttimemillis, "");
        this.onExtraCallbackWithResult = getstarttimemillis;
    }

    public /* bridge */ void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ void IAuthTabCallback(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback(tossCoreWebView);
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ Object onNavigationEvent(@NotNull setByType setbytype, @NotNull access13800<? super setByType.onWarmupCompleted> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = super.onNavigationEvent(setbytype, access13800Var);
        int i4 = onWarmupCompleted + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super.onWarmupCompleted(tossCoreWebView);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onExtraCallbackWithResult(@NotNull setLensFacing setlensfacing) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setlensfacing, "");
            setlensfacing.onWarmupCompleted("X-Toss-Locale", this.onExtraCallbackWithResult.onExtraCallback());
            throw null;
        }
        Intrinsics.checkNotNullParameter(setlensfacing, "");
        setlensfacing.onWarmupCompleted("X-Toss-Locale", this.onExtraCallbackWithResult.onExtraCallback());
        int i3 = onWarmupCompleted + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
