package viva.republica.toss.verify.unblock.manualselfie;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.tmoney.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.createJniSignature;
import o.getMidpointBetweenPoints;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class FdsManualSelfieVerifyRetryDescriptionView extends AbstractComposeView {
    public static final int onNavigationEvent = AbstractComposeView.onExtraCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FdsManualSelfieVerifyRetryDescriptionView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FdsManualSelfieVerifyRetryDescriptionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(FdsManualSelfieVerifyRetryDescriptionView fdsManualSelfieVerifyRetryDescriptionView, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        fdsManualSelfieVerifyRetryDescriptionView.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FdsManualSelfieVerifyRetryDescriptionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    public /* synthetic */ FdsManualSelfieVerifyRetryDescriptionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-220234632);
        int i2 = i & 1;
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i2 != 0, i2)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-220234632, i, -1, "viva.republica.toss.verify.unblock.manualselfie.FdsManualSelfieVerifyRetryDescriptionView.Content (FdsManualSelfieVerifyRetryDescriptionView.kt:18)");
            }
            getMidpointBetweenPoints.onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1636332776, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{null, 0L, 0L, null, null, createJniSignature.onExtraCallbackWithResult.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608, 31}, -1636332773);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.verify.unblock.manualselfie.FdsManualSelfieVerifyRetryDescriptionView$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return FdsManualSelfieVerifyRetryDescriptionView.onExtraCallback(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
