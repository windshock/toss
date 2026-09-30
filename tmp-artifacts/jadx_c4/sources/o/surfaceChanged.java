package o;

import im.toss.core.webkit.TossCoreWebView;
import kotlin.jvm.internal.Intrinsics;
import o.setByType;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface surfaceChanged {
    default void IAuthTabCallback() {
        int i = 2 % 2;
    }

    default void IAuthTabCallback(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossCoreWebView, "");
    }

    default void onExtraCallbackWithResult(@NotNull setLensFacing setlensfacing) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setlensfacing, "");
    }

    default Object onNavigationEvent(@NotNull setByType setbytype, @NotNull access13800<? super setByType.onWarmupCompleted> access13800Var) {
        int i = 2 % 2;
        return onExtraCallbackWithResult(this, setbytype, access13800Var);
    }

    default void onWarmupCompleted(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossCoreWebView, "");
    }

    static /* synthetic */ Object onExtraCallbackWithResult(surfaceChanged surfacechanged, setByType setbytype, access13800<? super setByType.onWarmupCompleted> access13800Var) {
        int i = 2 % 2;
        return setByType.onNavigationEvent(setbytype, null, null, 3, null);
    }
}
