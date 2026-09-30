package o;

import im.toss.core.webkit.TossCoreWebView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setByType;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class findAppByAppId implements surfaceChanged {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String IAuthTabCallback;
    private final boolean onExtraCallback;

    public findAppByAppId(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = z;
        this.IAuthTabCallback = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ findAppByAppId(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 79;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 71;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str = "X-Toss-Color-Preference";
        }
        this(z, str);
    }

    @Override // o.surfaceChanged
    public /* bridge */ void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback();
        int i4 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.surfaceChanged
    public /* bridge */ void IAuthTabCallback(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback(tossCoreWebView);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.surfaceChanged
    public /* bridge */ Object onNavigationEvent(@NotNull setByType setbytype, @NotNull access13800<? super setByType.onWarmupCompleted> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = super.onNavigationEvent(setbytype, access13800Var);
        int i4 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    @Override // o.surfaceChanged
    public /* bridge */ void onWarmupCompleted(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onWarmupCompleted(tossCoreWebView);
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
    }

    @Override // o.surfaceChanged
    public void onExtraCallbackWithResult(@NotNull setLensFacing setlensfacing) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setlensfacing, "");
        if (!this.onExtraCallback) {
            return;
        }
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setlensfacing.onWarmupCompleted(this.IAuthTabCallback, "dark");
        int i4 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
