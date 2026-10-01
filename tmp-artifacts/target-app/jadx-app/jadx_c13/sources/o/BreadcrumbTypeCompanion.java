package o;

import android.content.DialogInterface;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BreadcrumbTypeCompanion {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Object onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ BreadcrumbTypeCompanion(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }

    private BreadcrumbTypeCompanion(Object obj) {
        this.onWarmupCompleted = obj;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Object obj = this.onWarmupCompleted;
        if (obj instanceof DialogInterface) {
            int i5 = i3 + 63;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ((DialogInterface) obj).dismiss();
            return;
        }
        if (obj instanceof View) {
            ((View) obj).setVisibility(8);
            int i7 = onNavigationEvent + 119;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final BreadcrumbTypeCompanion onExtraCallbackWithResult(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!(obj instanceof DialogInterface) && !(obj instanceof View)) {
                int i5 = i3 + 67;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return null;
            }
            return new BreadcrumbTypeCompanion(obj, defaultConstructorMarker);
        }
    }
}
