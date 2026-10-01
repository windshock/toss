package im.toss.ads_sdk.playable;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.SetDetectableSize;
import o.infoForChild;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MraidBridge$$ExternalSyntheticLambda1 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ infoForChild f$0;
    public final /* synthetic */ JSONObject f$1;

    public /* synthetic */ MraidBridge$$ExternalSyntheticLambda1(infoForChild infoforchild, JSONObject jSONObject) {
        this.f$0 = infoforchild;
        this.f$1 = jSONObject;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) infoForChild.onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this.f$0, this.f$1, (SetDetectableSize) obj}, 1529662212, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1529662212, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i4 = onWarmupCompleted + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
