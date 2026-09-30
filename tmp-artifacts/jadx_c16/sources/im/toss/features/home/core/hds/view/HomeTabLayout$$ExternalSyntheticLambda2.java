package im.toss.features.home.core.hds.view;

import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeTabLayout$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Ref.BooleanRef f$0;
    public final /* synthetic */ HomeTabLayout f$1;

    public /* synthetic */ HomeTabLayout$$ExternalSyntheticLambda2(Ref.BooleanRef booleanRef, HomeTabLayout homeTabLayout) {
        this.f$0 = booleanRef;
        this.f$1 = homeTabLayout;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = HomeTabLayout.onNavigationEvent(this.f$0, this.f$1, (TabLayout.Tab) obj);
        int i4 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
