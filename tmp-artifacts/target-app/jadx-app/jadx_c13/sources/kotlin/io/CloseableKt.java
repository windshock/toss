package kotlin.io;

import java.io.Closeable;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setExecute;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CloseableKt {
    private static final <T extends Closeable, R> R use(T t, Function1<? super T, ? extends R> function1) throws IOException {
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            R rInvoke = function1.invoke(t);
            InlineMarker.finallyStart(1);
            closeFinally(t, null);
            InlineMarker.finallyEnd(1);
            return rInvoke;
        } finally {
        }
    }

    public static final void closeFinally(@Nullable Closeable closeable, @Nullable Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                setExecute.onNavigationEvent(th, th2);
            }
        }
    }
}
