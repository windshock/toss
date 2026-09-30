package im.toss.features.benefit.ui;

import android.content.Context;
import android.view.View;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import kotlin.jvm.functions.Function1;
import o.getNameByImsi;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseBenefitItemAdapter$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        View view = (View) getNameByImsi.onExtraCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1489591750, 1489591750, new Object[]{(Context) obj}, iOnExtraCallback, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback2);
        int i4 = onWarmupCompleted + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }
}
