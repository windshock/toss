package im.toss.features.ble.web;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.functions.Function1;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CheckBLEPermissionMessageHandler$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$0;
    public final /* synthetic */ FragmentActivity f$1;

    public /* synthetic */ CheckBLEPermissionMessageHandler$$ExternalSyntheticLambda0(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, FragmentActivity fragmentActivity) {
        this.f$0 = setonoutofmemeryerrorcallback;
        this.f$1 = fragmentActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.f$0;
        if (i3 != 0) {
            return CheckBLEPermissionMessageHandler.onNavigationEvent(setonoutofmemeryerrorcallback, this.f$1, ((Boolean) obj).booleanValue());
        }
        CheckBLEPermissionMessageHandler.onNavigationEvent(setonoutofmemeryerrorcallback, this.f$1, ((Boolean) obj).booleanValue());
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
