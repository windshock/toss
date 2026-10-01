package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TTBaseActivity;
import o.TTHistoryActivity41;
import okio.ForwardingSink;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class FaultHidingSink extends ForwardingSink {
    private boolean hasErrors;
    private final Function1<IOException, Unit> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(@NotNull TTHistoryActivity41 tTHistoryActivity41, @NotNull Function1<? super IOException, Unit> function1) {
        super(tTHistoryActivity41);
        Intrinsics.checkNotNullParameter(tTHistoryActivity41, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onException = function1;
    }

    public final Function1<IOException, Unit> getOnException() {
        return this.onException;
    }

    @Override // okio.ForwardingSink, o.TTHistoryActivity41
    public void write(@NotNull TTBaseActivity tTBaseActivity, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        if (this.hasErrors) {
            tTBaseActivity.IAuthTabCallbackDefault(j);
            return;
        }
        try {
            super.write(tTBaseActivity, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, o.TTHistoryActivity41, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, o.TTHistoryActivity41, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
