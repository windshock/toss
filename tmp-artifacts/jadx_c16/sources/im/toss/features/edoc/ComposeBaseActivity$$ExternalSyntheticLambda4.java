package im.toss.features.edoc;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxRewardedInterstitialAdapterListener;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ComposeBaseActivity$$ExternalSyntheticLambda4 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ ComposeBaseActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = ComposeBaseActivity.IAuthTabCallback(this.f$0, (MaxRewardedInterstitialAdapterListener) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i3 = 72 / 0;
        } else {
            unitIAuthTabCallback = ComposeBaseActivity.IAuthTabCallback(this.f$0, (MaxRewardedInterstitialAdapterListener) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        int i4 = onNavigationEvent + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
