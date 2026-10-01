package im.toss.rn.toss.core.common.wrapper;

import com.facebook.react.bridge.ReactContext;
import com.google.gson.JsonElement;
import im.toss.rn.spec.base.ReactNativeContentOwner;
import im.toss.rn.toss.core.TossModule;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertFloatArrayToByteArray;
import o.access8100;
import o.getJSON_KEY_ATTESTATIONcredentials_play_services_auth_release;
import o.getWrite;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface TossReactContentOwner extends ReactNativeContentOwner, getJSON_KEY_ATTESTATIONcredentials_play_services_auth_release {
    public static final /* synthetic */ IAuthTabCallback Companion = IAuthTabCallback.onNavigationEvent;

    ReactContext IEngagementSignalsCallback();

    TossModule IPostMessageServiceStub();

    default void IAuthTabCallback(@NotNull String str, @NotNull JsonElement jsonElement) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        TossModule tossModuleIPostMessageServiceStub = IPostMessageServiceStub();
        if (tossModuleIPostMessageServiceStub == null) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossReactContentOwner.emit", "tossmodule_unavailable", (Throwable) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("name", str)), 4, (Object) null);
        } else {
            tossModuleIPostMessageServiceStub.onNavigationEvent(str, jsonElement);
        }
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 0;
        static final /* synthetic */ IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 75;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback() {
        }
    }
}
