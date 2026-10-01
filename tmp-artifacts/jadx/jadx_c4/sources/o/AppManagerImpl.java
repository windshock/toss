package o;

import im.toss.core.webkit.TossCoreWebView;
import kotlin.jvm.internal.Intrinsics;
import o.setByType;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppManagerImpl implements surfaceChanged {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String IAuthTabCallback;
    private final Object onWarmupCompleted;

    public AppManagerImpl(@NotNull Object obj, @NotNull String str) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = obj;
        this.IAuthTabCallback = str;
    }

    @Override // o.surfaceChanged
    public /* bridge */ void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.surfaceChanged
    public /* bridge */ void onExtraCallbackWithResult(@NotNull setLensFacing setlensfacing) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallbackWithResult(setlensfacing);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        int i5 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.surfaceChanged
    public /* bridge */ Object onNavigationEvent(@NotNull setByType setbytype, @NotNull access13800<? super setByType.onWarmupCompleted> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = super.onNavigationEvent(setbytype, access13800Var);
        int i4 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    @Override // o.surfaceChanged
    public /* bridge */ void onWarmupCompleted(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super.onWarmupCompleted(tossCoreWebView);
        int i4 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    @Override // o.surfaceChanged
    public void IAuthTabCallback(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tossCoreWebView, "");
            tossCoreWebView.addJavascriptInterface(this.onWarmupCompleted, this.IAuthTabCallback);
            int i3 = 73 / 0;
        } else {
            Intrinsics.checkNotNullParameter(tossCoreWebView, "");
            tossCoreWebView.addJavascriptInterface(this.onWarmupCompleted, this.IAuthTabCallback);
        }
        int i4 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
