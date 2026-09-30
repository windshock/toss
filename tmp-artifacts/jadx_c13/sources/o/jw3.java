package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jw3<T> {
    private final List<lt1<T>> onExtraCallback = new ArrayList();

    public final jw6<T> onExtraCallback() {
        return new jw6<>(this.onExtraCallback);
    }

    public final void onExtraCallbackWithResult(@NotNull getPlayDelayedELExpressTimeS<? super T> getplaydelayedelexpresstimes) {
        Intrinsics.checkNotNullParameter(getplaydelayedelexpresstimes, "");
        if (getplaydelayedelexpresstimes instanceof lt1) {
            this.onExtraCallback.add(getplaydelayedelexpresstimes);
        } else {
            if (!(getplaydelayedelexpresstimes instanceof jw6)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = ((jw6) getplaydelayedelexpresstimes).onWarmupCompleted().iterator();
            while (it.hasNext()) {
                this.onExtraCallback.add((lt1) it.next());
            }
        }
    }
}
