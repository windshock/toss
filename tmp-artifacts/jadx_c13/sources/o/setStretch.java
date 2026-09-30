package o;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setStretch implements setRipple<Object> {
    public final Throwable IAuthTabCallback;

    public setStretch(@NotNull Throwable th) {
        this.IAuthTabCallback = th;
    }

    @Override // o.setRipple
    public Object emit(@Nullable Object obj, @NotNull access13800<? super Unit> access13800Var) throws Throwable {
        throw this.IAuthTabCallback;
    }
}
