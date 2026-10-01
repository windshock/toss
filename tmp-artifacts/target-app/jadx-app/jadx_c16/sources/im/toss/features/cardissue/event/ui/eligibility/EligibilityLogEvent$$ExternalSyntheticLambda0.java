package im.toss.features.cardissue.event.ui.eligibility;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.initScreenWidth;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EligibilityLogEvent$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ EligibilityLogEvent$$ExternalSyntheticLambda0(String str, int i, String str2, String str3) {
        this.f$0 = str;
        this.f$1 = i;
        this.f$2 = str2;
        this.f$3 = str3;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            initScreenWidth.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, (SetDetectableSize) obj);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = initScreenWidth.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, (SetDetectableSize) obj);
        int i3 = onExtraCallbackWithResult + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
