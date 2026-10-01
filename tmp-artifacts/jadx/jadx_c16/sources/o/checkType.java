package o;

import im.toss.features.credit.ui.plus.component.CreditPlusComponent$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface checkType {
    static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        return IAuthTabCallback();
    }

    void IAuthTabCallback(boolean z, @NotNull Function0<Unit> function0);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onExtraCallbackWithResult(checkType checktype, boolean z, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i & 2) != 0) {
            function0 = new CreditPlusComponent$.ExternalSyntheticLambda0();
        }
        checktype.IAuthTabCallback(z, function0);
    }

    private static Unit IAuthTabCallback() {
        int i = 2 % 2;
        return Unit.INSTANCE;
    }
}
