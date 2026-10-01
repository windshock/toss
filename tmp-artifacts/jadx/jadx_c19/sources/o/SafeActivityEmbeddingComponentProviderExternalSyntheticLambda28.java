package o;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.appsintoss.iap.model.AppsInTossCashReceipt;
import j$.time.LocalDateTime;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o.FaceSDK;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda28 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 onExtraCallbackWithResult(@NotNull AppsInTossCashReceipt appsInTossCashReceipt, @NotNull String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(appsInTossCashReceipt, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2072761813, i2, -1, "im.toss.appsintoss.iap.mapper.toUiState (AppsInTossCashReceiptMapper.kt:10)");
            int i4 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        String strAsInterface = appsInTossCashReceipt.asInterface();
        String strOnWarmupCompleted = appsInTossCashReceipt.onWarmupCompleted();
        if (strOnWarmupCompleted == null) {
            int i6 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(940729431);
            FaceSDK.onWarmupCompleted onwarmupcompleted = FaceSDK.onWarmupCompleted.onWarmupCompleted;
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            int iOnExtraCallbackWithResult = appsInTossCashReceipt.onExtraCallbackWithResult();
            strOnWarmupCompleted = FaceSDK.onWarmupCompleted.onExtraCallbackWithResult(onwarmupcompleted, context, Integer.valueOf(iOnExtraCallbackWithResult), FaceSDK.onWarmupCompleted.onExtraCallback.KRW, (Locale) null, 8, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(940728222);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37(str, strAsInterface, strOnWarmupCompleted, onExtraCallback(appsInTossCashReceipt.asBinder()), onExtraCallback(appsInTossCashReceipt.IAuthTabCallbackStub()), appsInTossCashReceipt.IAuthTabCallback(), appsInTossCashReceipt.onNavigationEvent(), appsInTossCashReceipt.onExtraCallback());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i9 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda37;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final LocalDateTime onExtraCallback(String str) {
        LocalDateTime localDateTime;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            try {
                Result.Companion companion = Result.Companion;
                localDateTime = Result.constructor-impl(LocalDateTime.parse(str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                localDateTime = Result.constructor-impl(ResultKt.createFailure(th));
            }
            localDateTime = Result.onExtraCallback(localDateTime) ? null : localDateTime;
        }
        int i4 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return localDateTime;
    }
}
