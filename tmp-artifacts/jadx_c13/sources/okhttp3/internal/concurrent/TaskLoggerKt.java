package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TaskLoggerKt {
    public static final void taskLog(@NotNull Logger logger, @NotNull Task task, @NotNull TaskQueue taskQueue, @NotNull Function0<String> function0) {
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(task, "");
        Intrinsics.checkNotNullParameter(taskQueue, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (logger.isLoggable(Level.FINE)) {
            log(logger, task, taskQueue, function0.invoke());
        }
    }

    public static final <T> T logElapsed(@NotNull Logger logger, @NotNull Task task, @NotNull TaskQueue taskQueue, @NotNull Function0<? extends T> function0) {
        long jNanoTime;
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(task, "");
        Intrinsics.checkNotNullParameter(taskQueue, "");
        Intrinsics.checkNotNullParameter(function0, "");
        boolean zIsLoggable = logger.isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(logger, task, taskQueue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T tInvoke = function0.invoke();
            InlineMarker.finallyStart(1);
            if (zIsLoggable) {
                log(logger, task, taskQueue, "finished run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            if (zIsLoggable) {
                log(logger, task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Logger logger, Task task, TaskQueue taskQueue, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        sb.append(str2);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final String formatDuration(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }
}
