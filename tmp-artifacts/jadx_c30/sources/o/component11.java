package o;

import io.opentelemetry.sdk.trace.ReadWriteSpan;
import io.opentelemetry.sdk.trace.ReadableSpan;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.logging.Logger;
import o.EventStorageModule;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class component11 implements calcWeakHashAndCopyName {
    private static final Logger onNavigationEvent = Logger.getLogger(component11.class.getName());
    private final onWarmupCompleted IAuthTabCallback;

    public boolean IAuthTabCallback() {
        return true;
    }

    public boolean onNavigationEvent() {
        return true;
    }

    public void onNavigationEvent(trimMetadataStringsTo trimmetadatastringsto, ReadWriteSpan readWriteSpan) {
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(readWriteSpan);
        StackTraceElement[] stackTrace = onextracallbackwithresult.getStackTrace();
        onextracallbackwithresult.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, Math.min(3, stackTrace.length), stackTrace.length));
        this.IAuthTabCallback.onExtraCallbackWithResult(readWriteSpan, onextracallbackwithresult);
    }

    public void onExtraCallbackWithResult(ReadableSpan readableSpan) {
        ((onExtraCallbackWithResult) this.IAuthTabCallback.IAuthTabCallback(readableSpan)).ended = true;
    }

    static class onWarmupCompleted extends EventStorageModulespecialinlinedprovider1<ReadableSpan, onExtraCallbackWithResult> {
        private final ConcurrentHashMap<EventStorageModule.onWarmupCompleted<ReadableSpan>, onExtraCallbackWithResult> IAuthTabCallback;
        private final BiConsumer<String, Throwable> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public void run() throws InterruptedException {
            while (!Thread.interrupted()) {
                try {
                    onExtraCallbackWithResult onextracallbackwithresultRemove = this.IAuthTabCallback.remove(remove());
                    if (onextracallbackwithresultRemove != null && !onextracallbackwithresultRemove.ended) {
                        this.onWarmupCompleted.accept("Span garbage collected before being ended.", component11.IAuthTabCallback(onextracallbackwithresultRemove));
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    static class onExtraCallbackWithResult extends Throwable {
        private static final long serialVersionUID = 1234567896;
        volatile boolean ended;
        final String spanInformation;
        final String threadName;

        onExtraCallbackWithResult(ReadableSpan readableSpan) {
            super("Thread [" + Thread.currentThread().getName() + "] started span : " + readableSpan + " here:");
            this.threadName = Thread.currentThread().getName();
            this.spanInformation = readableSpan.bD_() + " [" + readableSpan.onExtraCallback() + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AssertionError IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult) {
        AssertionError assertionError = new AssertionError("Span garbage collected before being ended. Thread: [" + onextracallbackwithresult.threadName + "] started span : " + onextracallbackwithresult.spanInformation + " here:");
        assertionError.setStackTrace(onextracallbackwithresult.getStackTrace());
        return assertionError;
    }
}
