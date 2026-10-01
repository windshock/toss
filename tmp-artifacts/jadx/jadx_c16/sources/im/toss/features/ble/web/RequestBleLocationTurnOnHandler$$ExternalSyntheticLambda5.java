package im.toss.features.ble.web;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RequestBleLocationTurnOnHandler$$ExternalSyntheticLambda5 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$0;
    public final /* synthetic */ RequestBleLocationTurnOnHandler f$1;
    public final /* synthetic */ FragmentActivity f$2;

    public /* synthetic */ RequestBleLocationTurnOnHandler$$ExternalSyntheticLambda5(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, RequestBleLocationTurnOnHandler requestBleLocationTurnOnHandler, FragmentActivity fragmentActivity) {
        this.f$0 = setonoutofmemeryerrorcallback;
        this.f$1 = requestBleLocationTurnOnHandler;
        this.f$2 = fragmentActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            RequestBleLocationTurnOnHandler.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (CommonModule_setLeftEdgeTouchEnabled) obj);
            throw null;
        }
        Unit unitIAuthTabCallback = RequestBleLocationTurnOnHandler.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (CommonModule_setLeftEdgeTouchEnabled) obj);
        int i3 = onNavigationEvent + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
