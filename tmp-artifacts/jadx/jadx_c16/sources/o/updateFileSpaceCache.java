package o;

import im.toss.features.credit.ui.plus.intro.component.CreditPlusIntroComponent$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface updateFileSpaceCache {
    static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        return IAuthTabCallback();
    }

    void onNavigationEvent(int i, int i2, @NotNull Function0<Unit> function0);

    default void onWarmupCompleted() {
        int i = 2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onNavigationEvent(updateFileSpaceCache updatefilespacecache, int i, int i2, Function0 function0, int i3, Object obj) {
        int i4 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            function0 = new CreditPlusIntroComponent$.ExternalSyntheticLambda0();
        }
        updatefilespacecache.onNavigationEvent(i, i2, function0);
    }

    private static Unit IAuthTabCallback() {
        int i = 2 % 2;
        return Unit.INSTANCE;
    }
}
