package im.toss.features.edoc;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocIssueSchemeActivity$$ExternalSyntheticLambda12 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ EDocIssueSchemeActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            EDocIssueSchemeActivity.onExtraCallback(this.f$0, (DialogInterface) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = EDocIssueSchemeActivity.onExtraCallback(this.f$0, (DialogInterface) obj);
        int i3 = onNavigationEvent + 91;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
