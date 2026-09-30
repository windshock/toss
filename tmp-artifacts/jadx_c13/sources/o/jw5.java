package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jw5<T> implements lt1<T> {
    private final setLottieClicklistener<T> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public jw5(@NotNull setLottieClicklistener<? super T> setlottieclicklistener) {
        Intrinsics.checkNotNullParameter(setlottieclicklistener, "");
        this.onNavigationEvent = setlottieclicklistener;
    }

    public final setLottieClicklistener<T> onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public String toString() {
        return "BasicFormatStructure(" + this.onNavigationEvent + ')';
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof jw5) && Intrinsics.areEqual(this.onNavigationEvent, ((jw5) obj).onNavigationEvent);
    }

    public int hashCode() {
        return this.onNavigationEvent.hashCode();
    }

    @Override // o.getPlayDelayedELExpressTimeS
    public ulsya<T> onExtraCallback() {
        return this.onNavigationEvent.onExtraCallback();
    }

    @Override // o.getPlayDelayedELExpressTimeS
    public ltlud<T> onExtraCallbackWithResult() {
        return this.onNavigationEvent.onWarmupCompleted();
    }
}
