package im.toss.features.edoc;

import android.content.Context;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocAuthActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ EDocAuthActivity$$ExternalSyntheticLambda0(String str, int i) {
        this.f$0 = str;
        this.f$1 = i;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ImageView imageViewOnExtraCallbackWithResult = EDocAuthActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (Context) obj);
        int i4 = onWarmupCompleted + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return imageViewOnExtraCallbackWithResult;
    }
}
