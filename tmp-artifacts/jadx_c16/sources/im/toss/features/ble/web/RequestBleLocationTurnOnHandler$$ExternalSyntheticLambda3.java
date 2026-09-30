package im.toss.features.ble.web;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import im.toss.observability.instrumentation.memory.PssReader$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RequestBleLocationTurnOnHandler$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$0;
    public final /* synthetic */ RequestBleLocationTurnOnHandler f$1;
    public final /* synthetic */ FragmentActivity f$2;

    public /* synthetic */ RequestBleLocationTurnOnHandler$$ExternalSyntheticLambda3(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, RequestBleLocationTurnOnHandler requestBleLocationTurnOnHandler, FragmentActivity fragmentActivity) {
        this.f$0 = setonoutofmemeryerrorcallback;
        this.f$1 = requestBleLocationTurnOnHandler;
        this.f$2 = fragmentActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) RequestBleLocationTurnOnHandler.IAuthTabCallback(new Object[]{this.f$0, this.f$1, this.f$2, (DialogInterface) obj}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 683805979, -683805978);
        int i4 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return unit;
    }
}
