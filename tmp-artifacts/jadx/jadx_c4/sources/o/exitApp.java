package o;

import im.toss.core.webkit.TossCoreWebView;
import kotlin.jvm.internal.Intrinsics;
import o.setByType;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class exitApp implements surfaceChanged {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String onWarmupCompleted;

    public exitApp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
    }

    @Override // o.surfaceChanged
    public /* bridge */ void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.surfaceChanged
    public /* bridge */ void IAuthTabCallback(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback(tossCoreWebView);
        int i4 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.surfaceChanged
    public /* bridge */ void onExtraCallbackWithResult(@NotNull setLensFacing setlensfacing) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallbackWithResult(setlensfacing);
        int i4 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.surfaceChanged
    public /* bridge */ Object onNavigationEvent(@NotNull setByType setbytype, @NotNull access13800<? super setByType.onWarmupCompleted> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.onNavigationEvent(setbytype, access13800Var);
        }
        super.onNavigationEvent(setbytype, access13800Var);
        throw null;
    }

    @Override // o.surfaceChanged
    public void onWarmupCompleted(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossCoreWebView, "");
        tossCoreWebView.setDownloadListener(new setBackgroundAlpha(tossCoreWebView, this.onWarmupCompleted));
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }
}
