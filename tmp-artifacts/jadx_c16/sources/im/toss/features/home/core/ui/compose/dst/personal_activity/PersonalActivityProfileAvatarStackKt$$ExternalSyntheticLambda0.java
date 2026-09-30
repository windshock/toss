package im.toss.features.home.core.ui.compose.dst.personal_activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExtensionPointProxyGenerator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PersonalActivityProfileAvatarStackKt$$ExternalSyntheticLambda0 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = ExtensionPointProxyGenerator.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return unitIAuthTabCallback;
    }
}
