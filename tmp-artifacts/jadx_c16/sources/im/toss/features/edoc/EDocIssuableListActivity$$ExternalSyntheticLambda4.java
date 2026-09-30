package im.toss.features.edoc;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraPresenceProviderExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocIssuableListActivity$$ExternalSyntheticLambda4 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ EDocIssuableListActivity f$0;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$1;

    public /* synthetic */ EDocIssuableListActivity$$ExternalSyntheticLambda4(EDocIssuableListActivity eDocIssuableListActivity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        this.f$0 = eDocIssuableListActivity;
        this.f$1 = cameraPresenceProviderExternalSyntheticLambda6;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = EDocIssuableListActivity.onNavigationEvent(this.f$0, this.f$1, ((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
        int i4 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
