package im.toss.features.home.core.hds.view;

import android.content.Context;
import java.text.SimpleDateFormat;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeYearMonthSelectView$$ExternalSyntheticLambda3 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Context f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            HomeYearMonthSelectView.IAuthTabCallback(this.f$0);
            throw null;
        }
        SimpleDateFormat simpleDateFormatIAuthTabCallback = HomeYearMonthSelectView.IAuthTabCallback(this.f$0);
        int i3 = IAuthTabCallback + 121;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 23 / 0;
        }
        return simpleDateFormatIAuthTabCallback;
    }
}
