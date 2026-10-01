package o;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getAllProfileNames {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private onExtraCallback IAuthTabCallback;

    public final void onExtraCallbackWithResult(@NotNull Window window) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(window, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(window, "");
        if (this.IAuthTabCallback == null) {
            this.IAuthTabCallback = new onExtraCallback(window.getAttributes().flags, window.getDecorView().getSystemUiVisibility(), window.getStatusBarColor(), window.getNavigationBarColor());
        }
        RepeatableSpec.onExtraCallbackWithResult(window, false);
        window.addFlags(512);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        if (Build.VERSION.SDK_INT < 30) {
            int i3 = onExtraCallback + 11;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            View decorView = window.getDecorView();
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            decorView.setSystemUiVisibility(i4 == 0 ? systemUiVisibility | 26852 : systemUiVisibility | 1792);
        }
    }

    public final void IAuthTabCallback(@NotNull Window window) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(window, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(window, "");
        onExtraCallback onextracallback = this.IAuthTabCallback;
        if (onextracallback == null) {
            return;
        }
        this.IAuthTabCallback = null;
        RepeatableSpec.onExtraCallbackWithResult(window, true);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.flags = onextracallback.onNavigationEvent();
        window.setAttributes(attributes);
        window.setStatusBarColor(onextracallback.IAuthTabCallback());
        window.setNavigationBarColor(onextracallback.onExtraCallback());
        window.getDecorView().setSystemUiVisibility(onextracallback.onWarmupCompleted());
        int i3 = onNavigationEvent + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
