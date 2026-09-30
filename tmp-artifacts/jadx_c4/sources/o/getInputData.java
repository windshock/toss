package o;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getInputData {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ListenableWorker onExtraCallbackWithResult(@NotNull Activity activity) {
        ListenableWorker listenableWorker;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            if (Build.VERSION.SDK_INT >= 59) {
                Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds, "");
                listenableWorker = new ListenableWorker(bounds.width(), bounds.height());
                if (!IAuthTabCallback(listenableWorker)) {
                    listenableWorker = null;
                }
                if (listenableWorker == null) {
                    listenableWorker = IAuthTabCallback(activity);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(activity, "");
            if (Build.VERSION.SDK_INT >= 30) {
            }
        }
        ListenableWorker listenableWorker2 = new ListenableWorker(RangesKt.coerceAtLeast(listenableWorker.onWarmupCompleted(), 1), RangesKt.coerceAtLeast(listenableWorker.onNavigationEvent(), 1));
        int i3 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return listenableWorker2;
    }

    private static final ListenableWorker IAuthTabCallback(Activity activity) {
        int i = 2 % 2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        ListenableWorker listenableWorker = new ListenableWorker(displayMetrics.widthPixels, displayMetrics.heightPixels);
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return listenableWorker;
    }

    private static final boolean IAuthTabCallback(ListenableWorker listenableWorker) {
        int i = 2 % 2;
        if (listenableWorker.onWarmupCompleted() > 0) {
            int i2 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (listenableWorker.onNavigationEvent() > 0) {
                int i4 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        int i6 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
