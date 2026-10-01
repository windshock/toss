package o;

import android.content.res.Resources;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BasicSecureTextFieldKtExternalSyntheticLambda0 {
    public static final RulerAlignmentKtExternalSyntheticLambda5 IAuthTabCallback(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, float f, float f2, float f3, float f4) {
        return rulerAlignmentKtExternalSyntheticLambda5.onExtraCallback(new AnnotatedStringResolveInlineContentKtInlineChildren121ExternalSyntheticLambda0(null, onNavigationEvent(f), onNavigationEvent(f2), null, onNavigationEvent(f3), onNavigationEvent(f4), 9, null));
    }

    public static final RulerAlignmentKtExternalSyntheticLambda5 onExtraCallbackWithResult(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, float f, float f2) {
        return rulerAlignmentKtExternalSyntheticLambda5.onExtraCallback(new AnnotatedStringResolveInlineContentKtInlineChildren121ExternalSyntheticLambda0(null, onNavigationEvent(f), onNavigationEvent(f2), null, onNavigationEvent(f), onNavigationEvent(f2), 9, null));
    }

    public static final RulerAlignmentKtExternalSyntheticLambda5 onNavigationEvent(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, float f) {
        AndroidCursorHandle_androidKtExternalSyntheticLambda5 androidCursorHandle_androidKtExternalSyntheticLambda5OnNavigationEvent = onNavigationEvent(f);
        return rulerAlignmentKtExternalSyntheticLambda5.onExtraCallback(new AnnotatedStringResolveInlineContentKtInlineChildren121ExternalSyntheticLambda0(null, androidCursorHandle_androidKtExternalSyntheticLambda5OnNavigationEvent, androidCursorHandle_androidKtExternalSyntheticLambda5OnNavigationEvent, null, androidCursorHandle_androidKtExternalSyntheticLambda5OnNavigationEvent, androidCursorHandle_androidKtExternalSyntheticLambda5OnNavigationEvent, 9, null));
    }

    private static final AndroidCursorHandle_androidKtExternalSyntheticLambda5 onNavigationEvent(float f) {
        return new AndroidCursorHandle_androidKtExternalSyntheticLambda5(f, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float onWarmupCompleted(List<Integer> list, Resources resources) {
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fIAuthTabCallback + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density));
        }
        return fIAuthTabCallback;
    }

    public static /* synthetic */ RulerAlignmentKtExternalSyntheticLambda5 onNavigationEvent(RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        if ((i2 & 2) != 0) {
            f2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        if ((i2 & 4) != 0) {
            f3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        if ((i2 & 8) != 0) {
            f4 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        return IAuthTabCallback(rulerAlignmentKtExternalSyntheticLambda5, f, f2, f3, f4);
    }

    public static /* synthetic */ RulerAlignmentKtExternalSyntheticLambda5 IAuthTabCallback(RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        if ((i2 & 2) != 0) {
            f2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        return onExtraCallbackWithResult(rulerAlignmentKtExternalSyntheticLambda5, f, f2);
    }
}
