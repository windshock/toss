package im.toss.features.edoc;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocIssueSchemeActivity$$ExternalSyntheticLambda13 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ EDocIssueSchemeActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            EDocIssueSchemeActivity.onWarmupCompleted(this.f$0, (DialogInterface) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = EDocIssueSchemeActivity.onWarmupCompleted(this.f$0, (DialogInterface) obj);
        int i3 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
