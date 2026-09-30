package o;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.ads_sdk.ui.compose.RowImpressionProbe;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.Futures3;
import o.PageImplExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PageImplExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ float onExtraCallback(Futures3 futures3, View view, Rect rect) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = onNavigationEvent(futures3, view, rect);
        int i4 = IAuthTabCallback + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RowImpressionProbe rowImpressionProbe, View view, Function1 function1, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(rowImpressionProbe, view, function1, futures3);
        int i4 = IAuthTabCallback + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return unitOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Object obj, @NotNull final Function1<? super WebViewCompatExternalSyntheticLambda1, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1259458579, i, -1, "im.toss.ads_sdk.ui.compose.nativeAdsRowImpression (NativeAdsRowImpression.kt:45)");
        }
        final View view = (View) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            int i3 = IAuthTabCallback + 49;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new RowImpressionProbe();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i5 = onNavigationEvent + 105;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        final RowImpressionProbe rowImpressionProbe = (RowImpressionProbe) objOnMinimized;
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rowImpressionProbe);
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(view);
        boolean z = (((i & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1)) || (i & 384) == 256;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnExtraCallback | zOnExtraCallback2 | z) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRowImpressionKt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallback + 75;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnWarmupCompleted = PageImplExternalSyntheticLambda0.onWarmupCompleted(rowImpressionProbe, view, function1, (Futures3) obj2);
                    int i10 = onExtraCallback + 35;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return unitOnWarmupCompleted;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) objOnMinimized2);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i7 = IAuthTabCallback + 99;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    private static final Unit onNavigationEvent(RowImpressionProbe rowImpressionProbe, View view, Function1 function1, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        rowImpressionProbe.onNavigationEvent(futures3, view, function1);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final WebViewCompatExternalSyntheticLambda1 onExtraCallback(float f) {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        boolean z3 = true;
        if (f > 0.0f) {
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (f > 0.5f) {
            int i4 = IAuthTabCallback + 117;
            onNavigationEvent = i4 % 128;
            z2 = i4 % 2 != 0;
        }
        if (f > 0.98f) {
            int i5 = IAuthTabCallback + 69;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            z3 = false;
        }
        return new WebViewCompatExternalSyntheticLambda1(z, z2, z3);
    }

    private static final float onNavigationEvent(Futures3 futures3, View view, Rect rect) {
        int i = 2 % 2;
        if (!view.getGlobalVisibleRect(rect)) {
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return 0.0f;
        }
        float fOnExtraCallback = onExtraCallback(FuturesCallbackListener.onWarmupCompleted(futures3, false, 1, (Object) null), RectHelper_androidKt.onExtraCallback(rect), futures3.asBinder());
        int i4 = IAuthTabCallback + 1;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return fOnExtraCallback;
    }

    public static final float onExtraCallback(@NotNull androidx.compose.ui.geometry.Rect rect, @NotNull androidx.compose.ui.geometry.Rect rect2, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(rect2, "");
            rect.onMinimized();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(rect2, "");
        if (rect.onMinimized()) {
            return 0.0f;
        }
        androidx.compose.ui.geometry.Rect rectIAuthTabCallback = rect.IAuthTabCallback(rect2);
        if (rectIAuthTabCallback.IAuthTabCallback_Parcel() - rectIAuthTabCallback.IAuthTabCallbackStubProxy() > 0.0f && rectIAuthTabCallback.IAuthTabCallbackDefault() - rectIAuthTabCallback.extraCallback() > 0.0f) {
            float f = ((int) (j >> 32)) * ((int) j);
            if (f <= 0.0f) {
                return 0.0f;
            }
            return ((rectIAuthTabCallback.IAuthTabCallback_Parcel() - rectIAuthTabCallback.IAuthTabCallbackStubProxy()) * (rectIAuthTabCallback.IAuthTabCallbackDefault() - rectIAuthTabCallback.extraCallback())) / f;
        }
        int i3 = onNavigationEvent + 41;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return 0.0f;
        }
        throw null;
    }
}
