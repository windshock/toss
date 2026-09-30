package viva.republica.toss.dev.screencapture;

import android.content.res.Configuration;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.readIntokhttp;

/* loaded from: classes.dex */
public final class ScreenCaptureAlertDialog$onExtraCallbackWithResult implements getAdService {
    static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(ScreenCaptureAlertDialog$onExtraCallbackWithResult.class);
    final /* synthetic */ Configuration IAuthTabCallback;

    public ScreenCaptureAlertDialog$onExtraCallbackWithResult(Configuration configuration) {
        this.IAuthTabCallback = configuration;
    }

    public final getSpecialFeatureOptInStatus onExtraCallback() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1443);
        if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4290);
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3328);
            return getspecialfeatureoptinstatus;
        }
        getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2171);
        int i3 = i2 & iOnWarmupCompleted;
        if ((1 & ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 12)) != 0) {
            return getspecialfeatureoptinstatus2;
        }
        throw null;
    }
}
