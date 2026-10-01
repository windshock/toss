package o;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getAlignItems<T> implements setRipple<T> {
    private final lt<T> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public getAlignItems(@NotNull lt<? super T> ltVar) {
        this.onWarmupCompleted = ltVar;
    }

    @Override // o.setRipple
    public Object emit(T t, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallback = this.onWarmupCompleted.onExtraCallback(t, access13800Var);
        return objOnExtraCallback == access14100.onExtraCallback() ? objOnExtraCallback : Unit.INSTANCE;
    }
}
