package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class jwzb<T> implements lt5<T> {
    private final List<lt5<T>> IAuthTabCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public jwzb(@NotNull List<? extends lt5<? super T>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallback = list;
    }

    @Override // o.lt5
    public boolean onExtraCallbackWithResult(T t) {
        List<lt5<T>> list = this.IAuthTabCallback;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((lt5) it.next()).onExtraCallbackWithResult(t)) {
                return false;
            }
        }
        return true;
    }
}
