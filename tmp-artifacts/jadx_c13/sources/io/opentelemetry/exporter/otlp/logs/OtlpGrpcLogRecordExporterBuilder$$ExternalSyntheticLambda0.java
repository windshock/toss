package io.opentelemetry.exporter.otlp.logs;

import android.os.Process;
import java.util.function.Supplier;
import o.findPlugin;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class OtlpGrpcLogRecordExporterBuilder$$ExternalSyntheticLambda0 implements Supplier {
    public static int onExtraCallbackWithResult;
    public static int onNavigationEvent;

    public static int onWarmupCompleted() {
        int i = onExtraCallbackWithResult;
        int i2 = i % 6289126;
        onExtraCallbackWithResult = i + 1;
        if (i2 != 0) {
            return onNavigationEvent;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        onNavigationEvent = elapsedCpuTime;
        return elapsedCpuTime;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return findPlugin.onExtraCallbackWithResult();
    }
}
