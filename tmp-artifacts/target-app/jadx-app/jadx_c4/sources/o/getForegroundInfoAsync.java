package o;

import javax.inject.Inject;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getForegroundInfoAsync implements SidecarWindowBackendWindowLayoutChangeCallbackWrapperExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final AppLovinExceptionHandler onExtraCallback;

    @Inject
    public getForegroundInfoAsync(@Nullable AppLovinExceptionHandler appLovinExceptionHandler) {
        this.onExtraCallback = appLovinExceptionHandler;
    }

    @Override // o.SidecarWindowBackendWindowLayoutChangeCallbackWrapperExternalSyntheticLambda0
    public void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 67;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        AppLovinExceptionHandler appLovinExceptionHandler = this.onExtraCallback;
        if (appLovinExceptionHandler != null) {
            int i5 = i2 + 53;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            appLovinExceptionHandler.onExtraCallbackWithResult();
            if (i6 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // o.SidecarWindowBackendWindowLayoutChangeCallbackWrapperExternalSyntheticLambda0
    public void IAuthTabCallback() {
        int i = 2 % 2;
        AppLovinExceptionHandler appLovinExceptionHandler = this.onExtraCallback;
        if (appLovinExceptionHandler != null) {
            int i2 = IAuthTabCallback + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            appLovinExceptionHandler.onExtraCallback();
        }
        int i4 = IAuthTabCallback + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.SidecarWindowBackendWindowLayoutChangeCallbackWrapperExternalSyntheticLambda0
    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        AppLovinExceptionHandler appLovinExceptionHandler = this.onExtraCallback;
        if (appLovinExceptionHandler != null) {
            int i2 = onNavigationEvent + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            appLovinExceptionHandler.onWarmupCompleted();
            int i4 = IAuthTabCallback + 99;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
