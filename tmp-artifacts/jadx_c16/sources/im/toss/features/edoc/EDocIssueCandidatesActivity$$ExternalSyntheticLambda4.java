package im.toss.features.edoc;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocIssueCandidatesActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$0;
    public final /* synthetic */ EDocIssueCandidatesActivity f$1;

    public /* synthetic */ EDocIssueCandidatesActivity$$ExternalSyntheticLambda4(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, EDocIssueCandidatesActivity eDocIssueCandidatesActivity) {
        this.f$0 = cameraPresenceProviderExternalSyntheticLambda6;
        this.f$1 = eDocIssueCandidatesActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = EDocIssueCandidatesActivity.onNavigationEvent(this.f$0, this.f$1, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj);
        int i4 = onExtraCallback + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
