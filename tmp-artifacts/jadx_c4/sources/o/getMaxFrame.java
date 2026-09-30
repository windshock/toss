package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.decrementVideoUsage;
import o.getMaxFrame;
import o.isInVideoUsage;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getMaxFrame {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ decrementVideoUsage onExtraCallback(View view, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(view, getsupportedhighspeedresolutionsfor, isinvideousage);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        decrementVideoUsage decrementvideousageOnWarmupCompleted = onWarmupCompleted(view, getsupportedhighspeedresolutionsfor, isinvideousage);
        int i3 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return decrementvideousageOnWarmupCompleted;
    }

    public static /* synthetic */ void onWarmupCompleted(View view, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(view, getsupportedhighspeedresolutionsfor);
        int i4 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CameraPresenceProviderExternalSyntheticLambda6<Boolean> onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Object obj = null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-359536259, i, -1, "im.toss.compose.extensions.keyboardOpenState (ComposeExtension.kt:12)");
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-359536259, i, -1, "im.toss.compose.extensions.keyboardOpenState (ComposeExtension.kt:12)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
        final View view = (View) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(view);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback) {
            int i4 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.compose.extensions.ComposeExtensionKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2) {
                        int i6 = 2 % 2;
                        int i7 = onNavigationEvent + 21;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            getMaxFrame.onExtraCallback(view, getsupportedhighspeedresolutionsfor, (isInVideoUsage) obj2);
                            throw null;
                        }
                        decrementVideoUsage decrementvideousageOnExtraCallback = getMaxFrame.onExtraCallback(view, getsupportedhighspeedresolutionsfor, (isInVideoUsage) obj2);
                        int i8 = onNavigationEvent + 89;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        return decrementvideousageOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
        }
        isZslDisabledByByUserCaseConfig.onExtraCallback(view, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i6 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        return getsupportedhighspeedresolutionsfor;
    }

    private static final void onNavigationEvent(View view, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        boolean z;
        int i = 2 % 2;
        view.getWindowVisibleDisplayFrame(new Rect());
        if (r7 - r1.bottom > view.getRootView().getHeight() * 0.15d) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 115;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 121;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
    }

    private static final decrementVideoUsage onWarmupCompleted(final View view, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: im.toss.compose.extensions.ComposeExtensionKt$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 81;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                getMaxFrame.onWarmupCompleted(view, getsupportedhighspeedresolutionsfor);
                int i5 = onExtraCallback + 95;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(view, onGlobalLayoutListener);
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 54 / 0;
        }
        return onextracallbackwithresult;
    }

    public static final class onExtraCallbackWithResult implements decrementVideoUsage {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener IAuthTabCallback;
        final /* synthetic */ View onNavigationEvent;

        public onExtraCallbackWithResult(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.onNavigationEvent = view;
            this.IAuthTabCallback = onGlobalLayoutListener;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewTreeObserver viewTreeObserver = this.onNavigationEvent.getViewTreeObserver();
            if (i3 == 0) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.IAuthTabCallback);
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(this.IAuthTabCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
