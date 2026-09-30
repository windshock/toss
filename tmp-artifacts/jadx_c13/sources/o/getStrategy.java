package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getStrategy extends isPatchUpdate {
    private final Function1<Throwable, Unit> onExtraCallback;

    @Override // o.isPatchUpdate
    public boolean onExtraCallback() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getStrategy(@NotNull Function1<? super Throwable, Unit> function1) {
        this.onExtraCallback = function1;
    }

    @Override // o.isPatchUpdate
    public void onWarmupCompleted(@Nullable Throwable th) {
        this.onExtraCallback.invoke(th);
    }
}
