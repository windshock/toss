package im.toss.components.identifier.unique;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.addAllCommandLine;
import o.getWrite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Remembered<V> {
    private final Function0<Object>[] onExtraCallback;
    private Pair<? extends List<? extends Object>, ? extends V> onNavigationEvent;
    private final Function0<V> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public Remembered(@NotNull Function0<? extends Object>[] function0Arr, @NotNull Function0<? extends V> function0) {
        Intrinsics.checkNotNullParameter(function0Arr, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallback = function0Arr;
        this.onWarmupCompleted = function0;
    }

    public final V IAuthTabCallback(@Nullable Object obj, @NotNull addAllCommandLine<?> addallcommandline) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(addallcommandline, "");
            Function0<Object>[] function0Arr = this.onExtraCallback;
            ArrayList arrayList = new ArrayList(function0Arr.length);
            for (Function0<Object> function0 : function0Arr) {
                arrayList.add(function0.invoke());
            }
            Pair<? extends List<? extends Object>, ? extends V> pair = this.onNavigationEvent;
            if (pair != null && Intrinsics.areEqual(pair.getFirst(), arrayList)) {
                return (V) pair.getSecond();
            }
            V v = (V) this.onWarmupCompleted.invoke();
            this.onNavigationEvent = getWrite.IAuthTabCallback(arrayList, v);
            return v;
        }
    }
}
