package im.toss.features.ble.web;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RequestBleLocationTurnOnHandler$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ FragmentActivity f$0;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$1;
    public final /* synthetic */ RequestBleLocationTurnOnHandler f$2;

    public /* synthetic */ RequestBleLocationTurnOnHandler$$ExternalSyntheticLambda2(FragmentActivity fragmentActivity, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, RequestBleLocationTurnOnHandler requestBleLocationTurnOnHandler) {
        this.f$0 = fragmentActivity;
        this.f$1 = setonoutofmemeryerrorcallback;
        this.f$2 = requestBleLocationTurnOnHandler;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            RequestBleLocationTurnOnHandler.onExtraCallback(this.f$0, this.f$1, this.f$2, ((Boolean) obj).booleanValue());
            throw null;
        }
        Unit unitOnExtraCallback = RequestBleLocationTurnOnHandler.onExtraCallback(this.f$0, this.f$1, this.f$2, ((Boolean) obj).booleanValue());
        int i3 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
