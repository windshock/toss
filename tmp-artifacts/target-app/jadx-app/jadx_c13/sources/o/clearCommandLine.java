package o;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class clearCommandLine<T> {
    public abstract Object onExtraCallback(@NotNull Iterator<? extends T> it, @NotNull access13800<? super Unit> access13800Var);

    public abstract Object onNavigationEvent(T t, @NotNull access13800<? super Unit> access13800Var);

    public final Object onExtraCallbackWithResult(@NotNull Iterable<? extends T> iterable, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallback;
        return (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) && (objOnExtraCallback = onExtraCallback(iterable.iterator(), access13800Var)) == access14100.onExtraCallback()) ? objOnExtraCallback : Unit.INSTANCE;
    }

    public final Object IAuthTabCallback(@NotNull Sequence<? extends T> sequence, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallback = onExtraCallback(sequence.IAuthTabCallback(), access13800Var);
        return objOnExtraCallback == access14100.onExtraCallback() ? objOnExtraCallback : Unit.INSTANCE;
    }
}
