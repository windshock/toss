package o;

import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5 {
    static {
        StringFog.decrypt("pNZSodgG9IiOwR2O7zj0m4HNSbY=\n", "7aQ9z4tpgfo=\n");
    }

    public static boolean onExtraCallbackWithResult() {
        boolean z;
        MediaControllerImplBaseExternalSyntheticLambda73 mediaControllerImplBaseExternalSyntheticLambda73OnExtraCallbackWithResult = MediaControllerImplBaseExternalSyntheticLambda73.onExtraCallbackWithResult();
        synchronized (mediaControllerImplBaseExternalSyntheticLambda73OnExtraCallbackWithResult) {
            z = mediaControllerImplBaseExternalSyntheticLambda73OnExtraCallbackWithResult.extraCallbackWithResult;
        }
        return z;
    }

    public static ISAdQualityLogLevel onNavigationEvent() {
        ISAdQualityLogLevel iSAdQualityLogLevel;
        MediaControllerImplBaseExternalSyntheticLambda73 mediaControllerImplBaseExternalSyntheticLambda73OnExtraCallbackWithResult = MediaControllerImplBaseExternalSyntheticLambda73.onExtraCallbackWithResult();
        synchronized (mediaControllerImplBaseExternalSyntheticLambda73OnExtraCallbackWithResult) {
            iSAdQualityLogLevel = mediaControllerImplBaseExternalSyntheticLambda73OnExtraCallbackWithResult.getInterfaceDescriptor;
        }
        return iSAdQualityLogLevel;
    }

    public static void onNavigationEvent(String str, String str2) {
        onExtraCallback(str, str, str2, null, null, false);
    }

    public static void onWarmupCompleted(String str, String str2) {
        onWarmupCompleted(str, str, str2, null, false);
    }

    public static void onExtraCallback(String str, String str2) {
        onExtraCallback(str, str, str2, null, null, true);
    }

    public static void onNavigationEvent(String str, String str2, boolean z) {
        onExtraCallback(str, str, str2, null, null, z);
    }

    public static void onExtraCallback(String str, String str2, String str3, Throwable th, NavDisplayKt__NavDisplayKtExternalSyntheticLambda8 navDisplayKt__NavDisplayKtExternalSyntheticLambda8, boolean z) {
        if (onExtraCallbackWithResult()) {
            onExtraCallback(str);
            if (navDisplayKt__NavDisplayKtExternalSyntheticLambda8 != null) {
                Objects.toString(navDisplayKt__NavDisplayKtExternalSyntheticLambda8);
                return;
            }
            return;
        }
        if (z && onNavigationEvent().shouldPrintLog(ISAdQualityLogLevel.ERROR)) {
            onExtraCallback(str2);
            if (navDisplayKt__NavDisplayKtExternalSyntheticLambda8 != null) {
                Objects.toString(navDisplayKt__NavDisplayKtExternalSyntheticLambda8);
            }
        }
    }

    public static void onExtraCallbackWithResult(String str, String str2, String str3, boolean z) {
        if (onExtraCallbackWithResult()) {
            onExtraCallback(str);
        } else if (z && onNavigationEvent().shouldPrintLog(ISAdQualityLogLevel.VERBOSE)) {
            onExtraCallback(str2);
        }
    }

    public static void IAuthTabCallback(String str, String str2, String str3, boolean z) {
        if (onExtraCallbackWithResult()) {
            onExtraCallback(str);
        } else if (z && onNavigationEvent().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
            onExtraCallback(str2);
        }
    }

    public static void IAuthTabCallback(String str, String str2) {
        onWarmupCompleted(str, str, str2, null, true);
    }

    public static void onWarmupCompleted(String str, String str2, String str3, Object obj, boolean z) {
        if (obj != null) {
            obj.toString();
        }
        if (onExtraCallbackWithResult()) {
            onExtraCallback(str);
        } else if (z && onNavigationEvent().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
            onExtraCallback(str2);
        }
    }

    public static String onExtraCallback(String str) {
        return TagPayloadReaderUnsupportedFormatException.onWarmupCompleted("C8kQDgtq9y4h3l8hPFT3PS7SCxliJQ==\n", "Qrt/YFgFglw=\n", new StringBuilder(), str);
    }
}
