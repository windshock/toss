package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isZoomEnabled {
    private static boolean IAuthTabCallback;
    private static int asInterface;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    public static final isZoomEnabled onExtraCallback = new isZoomEnabled();
    public static final int onWarmupCompleted = 8;

    private isZoomEnabled() {
    }

    public final int onWarmupCompleted() {
        return asInterface;
    }

    public final int onNavigationEvent() {
        return onExtraCallbackWithResult;
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        FaceDetectCallBack faceDetectCallBack = FaceDetectCallBack.onExtraCallbackWithResult;
        int iIAuthTabCallback = (faceDetectCallBack.IAuthTabCallback(str2) + faceDetectCallBack.IAuthTabCallback(str4)) - (faceDetectCallBack.IAuthTabCallback(str) + faceDetectCallBack.IAuthTabCallback(str3));
        if (iIAuthTabCallback > 3) {
            asInterface++;
            return;
        }
        if (iIAuthTabCallback > 0 && iIAuthTabCallback < 4) {
            asInterface++;
            return;
        }
        if (-3 <= iIAuthTabCallback && iIAuthTabCallback < 0) {
            onExtraCallbackWithResult++;
        } else if (iIAuthTabCallback != 0) {
            onExtraCallbackWithResult++;
        }
    }

    public final int onExtraCallback() {
        return onTransact;
    }

    public final int IAuthTabCallback() {
        return onNavigationEvent;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int length = str2.length() - str.length();
        if (length > 1) {
            IAuthTabCallback = true;
            onTransact++;
        } else if (length == 1) {
            onTransact++;
        } else if (length == -1) {
            onNavigationEvent++;
        } else if (length != 0) {
            onNavigationEvent++;
        }
    }

    public final void onExtraCallbackWithResult() {
        asInterface = 0;
        onExtraCallbackWithResult = 0;
        onTransact = 0;
        onNavigationEvent = 0;
        IAuthTabCallback = false;
    }
}
