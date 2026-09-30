package o;

import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class processDeepLink {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final void onNavigationEvent(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        view.setCameraDistance(9.223372E18f);
        int i4 = onExtraCallbackWithResult + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onWarmupCompleted(@NotNull View view, @NotNull getVersionCode getversioncode) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(getversioncode, "");
        onNavigationEvent(view, getversioncode.getValue());
        int i4 = onExtraCallbackWithResult + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
    }

    public static final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT <= 29) {
            return true;
        }
        int i4 = onExtraCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public static final void onNavigationEvent(@NotNull View view, float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if ((!view.isLaidOut()) || !(!view.isLayoutRequested())) {
            view.addOnLayoutChangeListener(new IAuthTabCallback(f));
            return;
        }
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0 ? f <= 0.0f : f <= 1.0f) {
            onNavigationEvent(view);
            return;
        }
        view.setCameraDistance((long) (view.getMeasuredWidth() * f));
        int i3 = onExtraCallback + 107;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 42 / 0;
        }
    }

    public static final class IAuthTabCallback implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ float IAuthTabCallback;

        public IAuthTabCallback(float f) {
            this.IAuthTabCallback = f;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            view.removeOnLayoutChangeListener(this);
            if (this.IAuthTabCallback > 0.0f) {
                int i10 = onExtraCallback + 25;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    view.setCameraDistance((long) (view.getMeasuredWidth() - this.IAuthTabCallback));
                    return;
                } else {
                    view.setCameraDistance((long) (view.getMeasuredWidth() * this.IAuthTabCallback));
                    return;
                }
            }
            processDeepLink.onNavigationEvent(view);
            int i11 = onExtraCallback + 103;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
        }
    }
}
