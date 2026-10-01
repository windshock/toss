package viva.republica.toss.dev.screencapture;

import android.content.res.Configuration;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.readIntokhttp;

/* loaded from: classes.dex */
public final class ScreenCaptureAlertDialog$IAuthTabCallbackStub implements getAdService {
    static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(ScreenCaptureAlertDialog$IAuthTabCallbackStub.class);
    final /* synthetic */ Configuration onExtraCallback;

    public ScreenCaptureAlertDialog$IAuthTabCallbackStub(Configuration configuration) {
        this.onExtraCallback = configuration;
    }

    public final getSpecialFeatureOptInStatus onExtraCallback() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4004);
        if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1654);
            return getspecialfeatureoptinstatus;
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(273);
        getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
        int i2 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(13);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 7) & 1) == 0) {
            return getspecialfeatureoptinstatus2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
