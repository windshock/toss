package im.toss.features.edoc;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocIssuableListActivity$$ExternalSyntheticLambda5 implements Function0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ EDocIssuableListActivity f$0;
    public final /* synthetic */ Map f$1;

    public /* synthetic */ EDocIssuableListActivity$$ExternalSyntheticLambda5(EDocIssuableListActivity eDocIssuableListActivity, Map map) {
        this.f$0 = eDocIssuableListActivity;
        this.f$1 = map;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        EDocIssuableListActivity eDocIssuableListActivity = this.f$0;
        if (i3 != 0) {
            return EDocIssuableListActivity.onExtraCallback(eDocIssuableListActivity, this.f$1);
        }
        EDocIssuableListActivity.onExtraCallback(eDocIssuableListActivity, this.f$1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
