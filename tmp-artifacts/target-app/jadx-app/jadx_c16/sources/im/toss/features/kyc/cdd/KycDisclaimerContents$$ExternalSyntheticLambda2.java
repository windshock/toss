package im.toss.features.kyc.cdd;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getExtendInfos;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycDisclaimerContents$$ExternalSyntheticLambda2 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ getExtendInfos f$1;

    public /* synthetic */ KycDisclaimerContents$$ExternalSyntheticLambda2(Context context, getExtendInfos getextendinfos) {
        this.f$0 = context;
        this.f$1 = getextendinfos;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getExtendInfos.IAuthTabCallback(this.f$0, this.f$1);
            throw null;
        }
        Unit unitIAuthTabCallback = getExtendInfos.IAuthTabCallback(this.f$0, this.f$1);
        int i3 = onExtraCallback + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
