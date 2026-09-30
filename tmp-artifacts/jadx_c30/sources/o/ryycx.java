package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.wwx1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ryycx<Receiver> extends done<Receiver> {
    private final removePauseListener<Receiver, invalidateSelf> onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ryycx(int i, int i2, @NotNull removePauseListener<? super Receiver, invalidateSelf> removepauselistener, @NotNull String str) {
        super(i == i2 ? Integer.valueOf(i) : null, str, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(removepauselistener, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult = i;
        this.onNavigationEvent = i2;
        this.onExtraCallback = removepauselistener;
        if (i <= 0 || i >= 10) {
            throw new IllegalArgumentException(("Invalid minimum length " + i + " for field " + onExtraCallbackWithResult() + ": expected 1..9").toString());
        }
        if (i > i2 || i2 >= 10) {
            throw new IllegalArgumentException(("Invalid maximum length " + i2 + " for field " + onExtraCallbackWithResult() + ": expected " + i + "..9").toString());
        }
    }

    public wwx1 onWarmupCompleted(Receiver receiver, @NotNull CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, BuildConfig.FLAVOR);
        int i3 = i2 - i;
        int i4 = this.onExtraCallbackWithResult;
        if (i3 < i4) {
            return new wwx1.onNavigationEvent(i4);
        }
        int i5 = this.onNavigationEvent;
        return i3 > i5 ? new wwx1.onExtraCallbackWithResult(i5) : ry1.onExtraCallback(this.onExtraCallback, receiver, new invalidateSelf(ry1.onNavigationEvent(charSequence, i, i2), i3));
    }
}
