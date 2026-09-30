package im.toss.features.edoc;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocOpenSchemeActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ EDocOpenSchemeActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        EDocOpenSchemeActivity eDocOpenSchemeActivity = this.f$0;
        DialogInterface dialogInterface = (DialogInterface) obj;
        if (i3 == 0) {
            return EDocOpenSchemeActivity.onExtraCallback(eDocOpenSchemeActivity, dialogInterface);
        }
        Unit unitOnExtraCallback = EDocOpenSchemeActivity.onExtraCallback(eDocOpenSchemeActivity, dialogInterface);
        int i4 = 74 / 0;
        return unitOnExtraCallback;
    }
}
