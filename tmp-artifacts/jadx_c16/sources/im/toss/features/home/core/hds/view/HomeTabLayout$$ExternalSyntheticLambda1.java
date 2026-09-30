package im.toss.features.home.core.hds.view;

import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeTabLayout$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ HomeTabLayout f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = HomeTabLayout.IAuthTabCallback(this.f$0, (TabLayout.Tab) obj);
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return unitIAuthTabCallback;
    }
}
