package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1kSDK {
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 0;
    private static final getCornerRadius<Boolean> onExtraCallback;
    private static final setRubIn<Boolean> onExtraCallbackWithResult;
    private static int onTransact = 1;
    public static final AFh1kSDK onWarmupCompleted = new AFh1kSDK();
    private static final ConcurrentHashMap.KeySetView<String, Boolean> onNavigationEvent = ConcurrentHashMap.newKeySet();

    private AFh1kSDK() {
    }

    static {
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(Boolean.FALSE);
        onExtraCallback = getcornerradiusOnNavigationEvent;
        onExtraCallbackWithResult = ycxycx.onExtraCallback((getCornerRadius) getcornerradiusOnNavigationEvent);
        IAuthTabCallback = 8;
        int i = onTransact + 113;
        asInterface = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setRubIn<Boolean> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setRubIn<Boolean> setrubin = onExtraCallbackWithResult;
        int i4 = i3 + 13;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return setrubin;
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConcurrentHashMap.KeySetView<String, Boolean> keySetView = onNavigationEvent;
        if (keySetView.add(str)) {
            int i2 = IAuthTabCallbackStub + 65;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            getCornerRadius<Boolean> getcornerradius = onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(keySetView, "");
            getcornerradius.onWarmupCompleted(Boolean.valueOf(!keySetView.isEmpty()));
        }
        int i4 = IAuthTabCallbackStub + 43;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConcurrentHashMap.KeySetView<String, Boolean> keySetView = onNavigationEvent;
        if (keySetView.remove(str)) {
            getCornerRadius<Boolean> getcornerradius = onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(keySetView, "");
            getcornerradius.onWarmupCompleted(Boolean.valueOf(!keySetView.isEmpty()));
            int i4 = IAuthTabCallbackStub + 13;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
