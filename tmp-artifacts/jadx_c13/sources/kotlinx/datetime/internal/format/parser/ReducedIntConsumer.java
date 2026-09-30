package kotlinx.datetime.internal.format.parser;

import kotlin.jvm.internal.Intrinsics;
import o.done;
import o.jcycx;
import o.removePauseListener;
import o.ry1;
import o.wwx1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReducedIntConsumer<Receiver> extends done<Receiver> {
    private final int IAuthTabCallback;
    private final removePauseListener<Receiver, Integer> IAuthTabCallbackDefault;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    @Override // o.done
    public Integer onNavigationEvent() {
        return Integer.valueOf(this.IAuthTabCallback);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReducedIntConsumer(int i, @NotNull removePauseListener<? super Receiver, Integer> removepauselistener, @NotNull String str, int i2) {
        super(Integer.valueOf(i), str, null);
        Intrinsics.checkNotNullParameter(removepauselistener, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = i;
        this.IAuthTabCallbackDefault = removepauselistener;
        this.onNavigationEvent = i2;
        int i3 = jcycx.onExtraCallbackWithResult()[onNavigationEvent().intValue()];
        this.onWarmupCompleted = i3;
        int i4 = i2 % i3;
        this.onExtraCallback = i4;
        this.onExtraCallbackWithResult = i2 - i4;
        int iIntValue = onNavigationEvent().intValue();
        if (iIntValue <= 0 || iIntValue >= 10) {
            throw new IllegalArgumentException(("Invalid length for field " + onExtraCallbackWithResult() + ": " + onNavigationEvent().intValue()).toString());
        }
    }

    @Override // o.done
    public wwx1 onWarmupCompleted(Receiver receiver, @NotNull CharSequence charSequence, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(charSequence, "");
        int iOnExtraCallback = ry1.onExtraCallback(charSequence, i, i2);
        removePauseListener<Receiver, Integer> removepauselistener = this.IAuthTabCallbackDefault;
        if (iOnExtraCallback >= this.onExtraCallback) {
            i3 = this.onExtraCallbackWithResult;
        } else {
            i3 = this.onExtraCallbackWithResult + this.onWarmupCompleted;
        }
        return ry1.IAuthTabCallback((removePauseListener<? super Receiver, Integer>) ((removePauseListener<? super Object, Object>) removepauselistener), receiver, Integer.valueOf(i3 + iOnExtraCallback));
    }
}
