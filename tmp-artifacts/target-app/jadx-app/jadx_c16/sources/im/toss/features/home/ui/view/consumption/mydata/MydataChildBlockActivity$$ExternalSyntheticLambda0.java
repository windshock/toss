package im.toss.features.home.ui.view.consumption.mydata;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MydataChildBlockActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ MydataChildBlockActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ MydataChildBlockActivity$$ExternalSyntheticLambda0(MydataChildBlockActivity mydataChildBlockActivity, String str, String str2) {
        this.f$0 = mydataChildBlockActivity;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        MydataChildBlockActivity mydataChildBlockActivity = this.f$0;
        if (i3 != 0) {
            return MydataChildBlockActivity.onWarmupCompleted(mydataChildBlockActivity, this.f$1, this.f$2, (View) obj);
        }
        MydataChildBlockActivity.onWarmupCompleted(mydataChildBlockActivity, this.f$1, this.f$2, (View) obj);
        throw null;
    }
}
