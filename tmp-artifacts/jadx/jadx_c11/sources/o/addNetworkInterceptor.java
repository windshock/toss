package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class addNetworkInterceptor {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor<Function0<Unit>> IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);

    public getSupportedHighSpeedResolutionsFor<Function0<Unit>> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 11;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        getSupportedHighSpeedResolutionsFor<Function0<Unit>> getsupportedhighspeedresolutionsfor = this.IAuthTabCallback;
        int i5 = i2 + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return getsupportedhighspeedresolutionsfor;
        }
        throw null;
    }

    public void onExtraCallback(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult().IAuthTabCallback(function0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onExtraCallbackWithResult().IAuthTabCallback(function0);
        int i3 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }
}
