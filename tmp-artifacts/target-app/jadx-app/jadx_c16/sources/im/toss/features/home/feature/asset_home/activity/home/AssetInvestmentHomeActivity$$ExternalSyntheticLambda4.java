package im.toss.features.home.feature.asset_home.activity.home;

import android.content.Context;
import androidx.fragment.app.FragmentContainerView;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        FragmentContainerView fragmentContainerViewOnNavigationEvent = AssetInvestmentHomeActivity.onNavigationEvent((Context) obj);
        int i4 = onExtraCallback + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentContainerViewOnNavigationEvent;
        }
        throw null;
    }
}
