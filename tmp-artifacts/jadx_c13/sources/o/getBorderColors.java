package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getBorderColors<T> extends aeu<T> {
    private final Function2<setRipple<? super T>, access13800<? super Unit>, Object> onExtraCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public getBorderColors(@NotNull Function2<? super setRipple<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        this.onExtraCallback = function2;
    }

    @Override // o.aeu
    public Object onWarmupCompleted(@NotNull setRipple<? super T> setripple, @NotNull access13800<? super Unit> access13800Var) {
        Object objInvoke = this.onExtraCallback.invoke(setripple, access13800Var);
        return objInvoke == access14100.onExtraCallback() ? objInvoke : Unit.INSTANCE;
    }
}
