package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class done<Receiver> {
    private final String onNavigationEvent;
    private final Integer onWarmupCompleted;

    public /* synthetic */ done(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str);
    }

    public abstract wwx1 onWarmupCompleted(Receiver receiver, @NotNull CharSequence charSequence, int i, int i2);

    private done(Integer num, String str) {
        this.onWarmupCompleted = num;
        this.onNavigationEvent = str;
    }

    public Integer onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }
}
