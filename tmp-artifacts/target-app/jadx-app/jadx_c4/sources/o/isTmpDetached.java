package o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isTmpDetached {
    public static final DeviceEventManagerModule.RCTDeviceEventEmitter onExtraCallback(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "");
        DeviceEventManagerModule.RCTDeviceEventEmitter jSModule = reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        Intrinsics.checkNotNullExpressionValue(jSModule, "");
        return jSModule;
    }

    public static final UIManagerModule onExtraCallbackWithResult(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "");
        UIManagerModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        return nativeModule;
    }

    public static final boolean IAuthTabCallback(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "");
        return ((AccessibilityManager) systemService).isTouchExplorationEnabled();
    }

    public static final boolean onExtraCallbackWithResult(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return motionEvent.getAction() == 7 || motionEvent.getAction() == 9 || motionEvent.getAction() == 10;
    }
}
