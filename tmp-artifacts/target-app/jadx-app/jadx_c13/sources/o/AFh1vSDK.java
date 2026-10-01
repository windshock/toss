package o;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1vSDK implements AFh1ySDK {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final setRubIn<w_> IAuthTabCallback;
    private final getCornerRadius<w_> onExtraCallback;

    @Inject
    public AFh1vSDK() {
        getCornerRadius<w_> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(null);
        this.onExtraCallback = getcornerradiusOnNavigationEvent;
        this.IAuthTabCallback = ycxycx.onExtraCallback((getCornerRadius) getcornerradiusOnNavigationEvent);
    }

    @Override // o.AFh1ySDK
    public setRubIn<w_> onExtraCallbackWithResult() {
        setRubIn<w_> setrubin;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            setrubin = this.IAuthTabCallback;
            int i4 = 58 / 0;
        } else {
            setrubin = this.IAuthTabCallback;
        }
        int i5 = i3 + 13;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return setrubin;
        }
        throw null;
    }

    @Override // o.AFh1ySDK
    public void onExtraCallbackWithResult(@NotNull w_ w_Var) {
        getCornerRadius<w_> getcornerradius;
        w_ w_VarIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w_Var, "");
            getcornerradius = this.onExtraCallback;
            int i3 = 57 / 0;
        } else {
            Intrinsics.checkNotNullParameter(w_Var, "");
            getcornerradius = this.onExtraCallback;
        }
        do {
            w_VarIAuthTabCallback = getcornerradius.IAuthTabCallback();
            w_ w_Var2 = w_VarIAuthTabCallback;
            if (w_Var2 != null) {
                int i4 = onWarmupCompleted + 119;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                w_Var2.onExtraCallback();
            }
        } while (!getcornerradius.onWarmupCompleted(w_VarIAuthTabCallback, w_Var));
        int i6 = onNavigationEvent + 95;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }
}
