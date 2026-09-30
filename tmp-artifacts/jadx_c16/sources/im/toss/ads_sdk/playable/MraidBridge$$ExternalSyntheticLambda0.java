package im.toss.ads_sdk.playable;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.infoForChild;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MraidBridge$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ infoForChild f$0;
    public final /* synthetic */ JSONObject f$1;

    public /* synthetic */ MraidBridge$$ExternalSyntheticLambda0(infoForChild infoforchild, JSONObject jSONObject) {
        this.f$0 = infoforchild;
        this.f$1 = jSONObject;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            infoForChild.onExtraCallbackWithResult(this.f$0, this.f$1, (SetDetectableSize) obj);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = infoForChild.onExtraCallbackWithResult(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i3 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
