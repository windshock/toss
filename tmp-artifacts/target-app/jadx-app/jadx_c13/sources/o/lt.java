package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface lt<E> {
    Object IAuthTabCallback(E e);

    boolean IAuthTabCallback();

    Object onExtraCallback(E e, @NotNull access13800<? super Unit> access13800Var);

    boolean onExtraCallback(@Nullable Throwable th);

    void onExtraCallbackWithResult(@NotNull Function1<? super Throwable, Unit> function1);

    public static final class onWarmupCompleted {
        public static /* synthetic */ boolean onExtraCallbackWithResult(lt ltVar, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return ltVar.onExtraCallback(th);
        }
    }
}
