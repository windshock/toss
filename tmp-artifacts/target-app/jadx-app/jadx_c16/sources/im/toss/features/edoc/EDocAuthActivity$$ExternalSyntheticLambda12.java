package im.toss.features.edoc;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocAuthActivity$$ExternalSyntheticLambda12 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ EDocAuthActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            EDocAuthActivity.onNavigationEvent(this.f$0, (DialogInterface) obj);
            throw null;
        }
        Unit unitOnNavigationEvent = EDocAuthActivity.onNavigationEvent(this.f$0, (DialogInterface) obj);
        int i3 = IAuthTabCallback + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
