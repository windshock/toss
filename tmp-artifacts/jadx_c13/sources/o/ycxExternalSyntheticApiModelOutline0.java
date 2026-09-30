package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import o.wwx1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ycxExternalSyntheticApiModelOutline0<Receiver> extends done<Receiver> {
    private final Integer IAuthTabCallback;
    private final boolean onExtraCallback;
    private final Integer onExtraCallbackWithResult;
    private final removePauseListener<Receiver, Integer> onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ycxExternalSyntheticApiModelOutline0(@Nullable Integer num, @Nullable Integer num2, @NotNull removePauseListener<? super Receiver, Integer> removepauselistener, @NotNull String str, boolean z) {
        super(Intrinsics.areEqual(num, num2) ? num : null, str, null);
        Intrinsics.checkNotNullParameter(removepauselistener, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = num;
        this.onExtraCallbackWithResult = num2;
        this.onWarmupCompleted = removepauselistener;
        this.onExtraCallback = z;
        if (onNavigationEvent() == null || new IntRange(1, 9).contains(onNavigationEvent().intValue())) {
            return;
        }
        throw new IllegalArgumentException(("Invalid length for field " + onExtraCallbackWithResult() + ": " + onNavigationEvent()).toString());
    }

    @Override // o.done
    public wwx1 onWarmupCompleted(Receiver receiver, @NotNull CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Integer num = this.onExtraCallbackWithResult;
        if (num != null && i2 - i > num.intValue()) {
            return new wwx1.onExtraCallbackWithResult(this.onExtraCallbackWithResult.intValue());
        }
        Integer num2 = this.IAuthTabCallback;
        if (num2 != null && i2 - i < num2.intValue()) {
            return new wwx1.onNavigationEvent(this.IAuthTabCallback.intValue());
        }
        Integer numIAuthTabCallback = ry1.IAuthTabCallback(charSequence, i, i2);
        if (numIAuthTabCallback == null) {
            return wwx1.onExtraCallback.onWarmupCompleted;
        }
        removePauseListener<Receiver, Integer> removepauselistener = this.onWarmupCompleted;
        boolean z = this.onExtraCallback;
        int iIntValue = numIAuthTabCallback.intValue();
        if (z) {
            iIntValue = -iIntValue;
        }
        return ry1.IAuthTabCallback((removePauseListener<? super Receiver, Integer>) ((removePauseListener<? super Object, Object>) removepauselistener), receiver, Integer.valueOf(iIntValue));
    }
}
