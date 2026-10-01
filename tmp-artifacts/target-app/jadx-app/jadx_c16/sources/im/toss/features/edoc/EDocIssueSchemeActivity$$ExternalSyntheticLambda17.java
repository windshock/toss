package im.toss.features.edoc;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocIssueSchemeActivity$$ExternalSyntheticLambda17 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ EDocIssueSchemeActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            EDocIssueSchemeActivity.onExtraCallbackWithResult(this.f$0, (DialogInterface) obj);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = EDocIssueSchemeActivity.onExtraCallbackWithResult(this.f$0, (DialogInterface) obj);
        int i3 = onExtraCallback + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
