package o;

import android.os.Build;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getLoadingView {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final getLoadingView IAuthTabCallback = new getLoadingView();
    private static final int onNavigationEvent = forceInnerPermissionCheck.onExtraCallbackWithResult.onNavigationEvent() & (~WindowInsetsCompat.onTransact.IAuthTabCallback());

    private getLoadingView() {
    }

    static {
        int i = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
    }

    public final int onExtraCallback(@NotNull WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
            return windowInsetsCompat.onWarmupCompleted(onNavigationEvent).onExtraCallback;
        }
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int i3 = 24 / 0;
        return windowInsetsCompat.onWarmupCompleted(onNavigationEvent).onExtraCallback;
    }

    public final boolean onExtraCallbackWithResult(@NotNull WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        if (!forceDomainCheck.onExtraCallbackWithResult(windowInsetsCompat)) {
            return false;
        }
        int i2 = onExtraCallback + 31;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        int i4 = IAuthTabCallbackDefault + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final WindowInsetsCompat IAuthTabCallback(@NotNull View view, @NotNull WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int i2 = onNavigationEvent;
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(i2);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        view.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, view.getPaddingTop(), cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, 0);
        WindowInsetsCompat.onWarmupCompleted onwarmupcompleted = new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompat);
        while (i2 != 0) {
            int i3 = IAuthTabCallbackDefault + 7;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = (-i2) & i2;
            CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted2 = windowInsetsCompat.onWarmupCompleted(i5);
            Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted2, "");
            CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnNavigationEvent = CameraControllerExternalSyntheticLambda0.onNavigationEvent(0, cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onWarmupCompleted, 0, cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onExtraCallback);
            Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnNavigationEvent, "");
            onwarmupcompleted.onNavigationEvent(i5, cameraControllerExternalSyntheticLambda0OnNavigationEvent);
            i2 ^= i5;
            int i6 = IAuthTabCallbackDefault + 121;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnExtraCallbackWithResult, "");
        int i8 = onExtraCallback + 69;
        IAuthTabCallbackDefault = i8 % 128;
        if (i8 % 2 != 0) {
            return windowInsetsCompatOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final WindowInsetsCompat onExtraCallback(@NotNull View view, @NotNull WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int i2 = onNavigationEvent;
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(i2);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted2 = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.IAuthTabCallback());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted2, "");
        WindowInsetsCompat.onWarmupCompleted onwarmupcompleted = new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompat);
        while (i2 != 0) {
            int i3 = onExtraCallback + 33;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = (-i2) & i2;
            CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted3 = windowInsetsCompat.onWarmupCompleted(i5);
            Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted3, "");
            CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnNavigationEvent = CameraControllerExternalSyntheticLambda0.onNavigationEvent(0, cameraControllerExternalSyntheticLambda0OnWarmupCompleted3.onWarmupCompleted, 0, 0);
            Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnNavigationEvent, "");
            onwarmupcompleted.onNavigationEvent(i5, cameraControllerExternalSyntheticLambda0OnNavigationEvent);
            i2 ^= i5;
        }
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnExtraCallbackWithResult, "");
        if (Build.VERSION.SDK_INT < 30) {
            view.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, view.getPaddingTop(), cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, RangesKt.coerceAtLeast(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback - cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onExtraCallback, 0));
            return windowInsetsCompatOnExtraCallbackWithResult;
        }
        view.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, view.getPaddingTop(), cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnNavigationEvent2 = CameraControllerExternalSyntheticLambda0.onNavigationEvent(cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.IAuthTabCallback, cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onWarmupCompleted, cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onExtraCallbackWithResult, RangesKt.coerceAtLeast(cameraControllerExternalSyntheticLambda0OnWarmupCompleted2.onExtraCallback - cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback, 0));
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnNavigationEvent2, "");
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult2 = new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompatOnExtraCallbackWithResult).onNavigationEvent(WindowInsetsCompat.onTransact.IAuthTabCallback(), cameraControllerExternalSyntheticLambda0OnNavigationEvent2).onExtraCallbackWithResult();
        Intrinsics.checkNotNull(windowInsetsCompatOnExtraCallbackWithResult2);
        int i6 = IAuthTabCallbackDefault + 17;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 66 / 0;
        }
        return windowInsetsCompatOnExtraCallbackWithResult2;
    }
}
