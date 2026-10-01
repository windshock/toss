package im.toss.features.cardissue.event.ui.eligibility;

import im.toss.features.cardissue.event.model.eligibility.EligibilityResultModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.initScreenWidth;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EligibilityLogEvent$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ EligibilityResultModel f$2;

    public /* synthetic */ EligibilityLogEvent$$ExternalSyntheticLambda2(String str, String str2, EligibilityResultModel eligibilityResultModel) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = eligibilityResultModel;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = initScreenWidth.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = onExtraCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
