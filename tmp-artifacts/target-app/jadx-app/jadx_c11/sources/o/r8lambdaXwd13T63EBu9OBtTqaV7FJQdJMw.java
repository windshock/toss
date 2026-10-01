package o;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceIdCache;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaXwd13T63EBu9OBtTqaV7FJQdJMw {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public static final r8lambdaXwd13T63EBu9OBtTqaV7FJQdJMw onNavigationEvent = new r8lambdaXwd13T63EBu9OBtTqaV7FJQdJMw();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 5;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private r8lambdaXwd13T63EBu9OBtTqaV7FJQdJMw() {
    }

    public final void onExtraCallbackWithResult(@NotNull AppLovinPostbackListener appLovinPostbackListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appLovinPostbackListener, "");
        getTcfVendorConsentStatus.Companion.onNavigationEvent(appLovinPostbackListener);
        int i4 = IAuthTabCallback + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final TypedValue onExtraCallback(int i, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 43;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onWarmupCompleted + 51;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(979129245, i2, -1, "im.toss.tds.compose.TdsCompose.resolveResourcePath (TdsCompose.kt:23)");
        }
        TypedValue typedValueOnNavigationEvent = ((ResourceIdCache) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onNavigationEvent())).onNavigationEvent((Resources) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback()), i);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = IAuthTabCallback + 35;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i9 != 0) {
                int i10 = 9 / 0;
            }
        }
        int i11 = onWarmupCompleted + 37;
        IAuthTabCallback = i11 % 128;
        int i12 = i11 % 2;
        return typedValueOnNavigationEvent;
    }
}
