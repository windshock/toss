package im.toss.features.home.core.hds.view;

import android.content.Context;
import java.text.SimpleDateFormat;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeYearMonthSelectView$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Context f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SimpleDateFormat simpleDateFormatOnExtraCallbackWithResult = HomeYearMonthSelectView.onExtraCallbackWithResult(this.f$0);
        int i4 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return simpleDateFormatOnExtraCallbackWithResult;
        }
        throw null;
    }
}
