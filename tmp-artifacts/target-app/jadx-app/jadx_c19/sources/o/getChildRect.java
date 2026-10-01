package o;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.internal.mayLaunchUrl;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getChildRect {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static volatile getChildRect IAuthTabCallback;
    private final LocalBroadcastManager onExtraCallback;
    private final drawChild onExtraCallbackWithResult;
    private dispatchDependentViewsChanged onWarmupCompleted;

    @JvmStatic
    public static final getChildRect onNavigationEvent() {
        return Companion.onNavigationEvent();
    }

    public getChildRect(@NotNull LocalBroadcastManager localBroadcastManager, @NotNull drawChild drawchild) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "");
        Intrinsics.checkNotNullParameter(drawchild, "");
        this.onExtraCallback = localBroadcastManager;
        this.onExtraCallbackWithResult = drawchild;
    }

    public final dispatchDependentViewsChanged IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public final void onNavigationEvent(@Nullable dispatchDependentViewsChanged dispatchdependentviewschanged) {
        onExtraCallback(dispatchdependentviewschanged, true);
    }

    public final boolean onExtraCallback() {
        dispatchDependentViewsChanged dispatchdependentviewschangedOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback();
        if (dispatchdependentviewschangedOnExtraCallback == null) {
            return false;
        }
        onExtraCallback(dispatchdependentviewschangedOnExtraCallback, false);
        return true;
    }

    private final void onExtraCallback(dispatchDependentViewsChanged dispatchdependentviewschanged, boolean z) {
        dispatchDependentViewsChanged dispatchdependentviewschanged2 = this.onWarmupCompleted;
        this.onWarmupCompleted = dispatchdependentviewschanged;
        if (z) {
            if (dispatchdependentviewschanged != null) {
                this.onExtraCallbackWithResult.onNavigationEvent(dispatchdependentviewschanged);
            } else {
                this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            }
        }
        if (mayLaunchUrl.onNavigationEvent(dispatchdependentviewschanged2, dispatchdependentviewschanged)) {
            return;
        }
        onNavigationEvent(dispatchdependentviewschanged2, dispatchdependentviewschanged);
    }

    private final void onNavigationEvent(dispatchDependentViewsChanged dispatchdependentviewschanged, dispatchDependentViewsChanged dispatchdependentviewschanged2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", dispatchdependentviewschanged);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", dispatchdependentviewschanged2);
        this.onExtraCallback.sendBroadcast(intent);
    }

    public static final class onExtraCallbackWithResult {
        private onExtraCallbackWithResult() {
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final getChildRect onNavigationEvent() {
            if (getChildRect.IAuthTabCallback == null) {
                synchronized (this) {
                    if (getChildRect.IAuthTabCallback == null) {
                        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(performIntercept.onExtraCallbackWithResult());
                        Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "");
                        getChildRect.IAuthTabCallback = new getChildRect(localBroadcastManager, new drawChild());
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            getChildRect getchildrect = getChildRect.IAuthTabCallback;
            if (getchildrect != null) {
                return getchildrect;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
