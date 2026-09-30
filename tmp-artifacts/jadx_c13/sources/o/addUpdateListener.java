package o;

import kotlin.jvm.internal.Intrinsics;
import o.wwx1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addUpdateListener<Receiver> extends done<Receiver> {
    private final String onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addUpdateListener(@NotNull String str) {
        super(Integer.valueOf(str.length()), "the predefined string " + str, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = str;
    }

    @Override // o.done
    public wwx1 onWarmupCompleted(Receiver receiver, @NotNull CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (Intrinsics.areEqual(charSequence.subSequence(i, i2).toString(), this.onNavigationEvent)) {
            return null;
        }
        return new wwx1.onWarmupCompleted(this.onNavigationEvent);
    }
}
