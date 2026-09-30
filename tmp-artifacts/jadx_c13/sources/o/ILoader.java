package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ILoader {
    private static final /* synthetic */ AtomicIntegerFieldUpdater onNavigationEvent = AtomicIntegerFieldUpdater.newUpdater(ILoader.class, "_handled$volatile");
    public final Throwable IAuthTabCallback;
    private volatile /* synthetic */ int _handled$volatile;

    public ILoader(@NotNull Throwable th, boolean z) {
        this.IAuthTabCallback = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public /* synthetic */ ILoader(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }

    public final boolean onExtraCallbackWithResult() {
        return onNavigationEvent.get(this) == 1;
    }

    public final boolean onNavigationEvent() {
        return onNavigationEvent.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return getResCount.IAuthTabCallback(this) + '[' + this.IAuthTabCallback + ']';
    }
}
