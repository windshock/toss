package im.toss.ads_sdk.playable;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.infoForChild;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MraidBridge$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ infoForChild f$1;
    public final /* synthetic */ JSONObject f$2;

    public /* synthetic */ MraidBridge$$ExternalSyntheticLambda2(String str, infoForChild infoforchild, JSONObject jSONObject) {
        this.f$0 = str;
        this.f$1 = infoforchild;
        this.f$2 = jSONObject;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = infoForChild.onNavigationEvent(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
