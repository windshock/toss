package o;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class zb1 extends CancellationException {
    public final transient Object onExtraCallback;

    public zb1(@NotNull Object obj) {
        super("Flow was aborted, no more elements needed");
        this.onExtraCallback = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
