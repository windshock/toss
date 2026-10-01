package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface L_ extends AFj1oSDKAFa1ySDK {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onExtraCallback;

    default String getReferrerParam() {
        int i = 2 % 2;
        return null;
    }

    @Override // o.AFj1oSDKAFa1ySDK
    default Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        return null;
    }

    default void onPrepareTrackViewParams(@NotNull Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        static final /* synthetic */ IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static int onExtraCallbackWithResult = 1;

        static {
            int i = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private IAuthTabCallback() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    default AFj1nSDK4 getLogVersion() {
        boolean z;
        int i = 2 % 2;
        if (this instanceof openNativeCrashMonitor) {
            initMiniApp initminiapp = this instanceof initMiniApp ? (initMiniApp) this : null;
            if (initminiapp != null && initminiapp.access200() == -1) {
                z = true;
            }
        } else {
            z = false;
        }
        return getScreenName().length() > 0 ? AFj1nSDK4.V1 : (!(this instanceof initMiniApp) || z) ? getScreenId() != -1 ? AFj1nSDK4.V2 : AFj1nSDK4.UNDEFINED : AFj1nSDK4.V3;
    }

    default boolean onTrackView() {
        int i = 2 % 2;
        return onTrackView(false);
    }

    default boolean onTrackBottomSheetView() {
        int i = 2 % 2;
        return onTrackViewInternal(true, false);
    }

    default boolean onTrackView(boolean z) {
        int i = 2 % 2;
        return onNavigationEvent(this, z, false, 2, null);
    }

    static /* synthetic */ boolean onNavigationEvent(L_ l_, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTrackViewInternal");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return l_.onTrackViewInternal(z, z2);
    }

    default boolean onTrackViewInternal(boolean z, boolean z2) {
        int i = 2 % 2;
        if (!z) {
            K_.onWarmupCompleted.onExtraCallbackWithResult();
        }
        Map<String, Object> screenParams = getScreenParams();
        if (screenParams == null) {
            screenParams = new LinkedHashMap<>();
        }
        Map<String, Object> map = screenParams;
        onPrepareTrackViewParams(map);
        if (z2) {
            map.put("action_type", "screen");
        }
        if (getLogVersion() == AFj1nSDK4.V3) {
            return false;
        }
        if (getScreenId() != -1) {
            return ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, getScreenId(), false, (String) null, map, (Function1) null, 22, (Object) null);
        }
        if (getScreenName().length() > 0) {
            return ConvertFloatArrayToByteArray.onExtraCallbackWithResult(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, getScreenName(), map, (Function1) null, 4, (Object) null);
        }
        if (z) {
            map.put("screen_name", getScreenName());
            return ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "dialog_open", false, (String) null, (List) null, map, (Function1) null, 46, (Object) null);
        }
        getClass().getSimpleName();
        Objects.toString(map);
        return false;
    }

    @Override // o.AFj1oSDKAFa1ySDK
    default String getScreenHash() {
        int i = 2 % 2;
        return getClass().getSimpleName() + "#" + hashCode();
    }

    @Override // o.AFj1oSDKAFa1ySDK
    default String getScreenName() {
        int i = 2 % 2;
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }
}
