package o;

import java.lang.ref.Reference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import o.EventPayloadCompanion;
import o.EventStorageModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class EventPayloadCompanion implements updateSeverityReasonInternalbugsnag_android_core_release, AutoCloseable {
    private static final Logger onExtraCallback = Logger.getLogger(EventPayloadCompanion.class.getName());
    private final onExtraCallbackWithResult onExtraCallbackWithResult = onExtraCallbackWithResult.onExtraCallback();
    private final updateSeverityReasonInternalbugsnag_android_core_release onNavigationEvent;

    static EventPayloadCompanion onExtraCallbackWithResult(updateSeverityReasonInternalbugsnag_android_core_release updateseverityreasoninternalbugsnag_android_core_release) {
        return new EventPayloadCompanion(updateseverityreasoninternalbugsnag_android_core_release);
    }

    private EventPayloadCompanion(updateSeverityReasonInternalbugsnag_android_core_release updateseverityreasoninternalbugsnag_android_core_release) {
        this.onNavigationEvent = updateseverityreasoninternalbugsnag_android_core_release;
    }

    @Override // o.updateSeverityReasonInternalbugsnag_android_core_release
    public accessgetDelegatep attach(trimMetadataStringsTo trimmetadatastringsto) {
        int i;
        accessgetDelegatep accessgetdelegatepAttach = this.onNavigationEvent.attach(trimmetadatastringsto);
        onNavigationEvent onnavigationevent = new onNavigationEvent(trimmetadatastringsto);
        StackTraceElement[] stackTrace = onnavigationevent.getStackTrace();
        for (int i2 = 0; i2 < stackTrace.length; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            if (stackTraceElement.getClassName().equals(trimMetadataStringsTo.class.getName()) && stackTraceElement.getMethodName().equals("makeCurrent") && (i = i2 + 2) < stackTrace.length) {
                StackTraceElement stackTraceElement2 = stackTrace[i];
                if (stackTraceElement2.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement2.getMethodName().equals("resumeWith")) {
                    throw new AssertionError("Attempting to call Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                }
            }
        }
        int i3 = 1;
        while (i3 < stackTrace.length) {
            String className = stackTrace[i3].getClassName();
            if (!className.startsWith("io.opentelemetry.api.") && !className.startsWith("io.opentelemetry.sdk.testing.context.SettableContextStorageProvider") && !className.startsWith("io.opentelemetry.context.")) {
                break;
            }
            i3++;
        }
        onnavigationevent.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i3, stackTrace.length));
        return new IAuthTabCallback(accessgetdelegatepAttach, onnavigationevent);
    }

    @Override // o.updateSeverityReasonInternalbugsnag_android_core_release
    @Nullable
    public trimMetadataStringsTo current() {
        return this.onNavigationEvent.current();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        List<onNavigationEvent> listOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent();
        if (listOnNavigationEvent.isEmpty()) {
            return;
        }
        if (listOnNavigationEvent.size() > 1) {
            onExtraCallback.log(Level.SEVERE, "Multiple scopes leaked - first will be thrown as an error.");
            Iterator<onNavigationEvent> it = listOnNavigationEvent.iterator();
            while (it.hasNext()) {
                onExtraCallback.log(Level.SEVERE, "Scope leaked", (Throwable) onNavigationEvent(it.next()));
            }
        }
        throw onNavigationEvent(listOnNavigationEvent.get(0));
    }

    final class IAuthTabCallback implements accessgetDelegatep {
        final onNavigationEvent IAuthTabCallback;
        final accessgetDelegatep onExtraCallback;

        IAuthTabCallback(accessgetDelegatep accessgetdelegatep, onNavigationEvent onnavigationevent) {
            this.onExtraCallback = accessgetdelegatep;
            this.IAuthTabCallback = onnavigationevent;
            EventPayloadCompanion.this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, onnavigationevent);
        }

        @Override // o.accessgetDelegatep, java.lang.AutoCloseable
        public void close() {
            this.IAuthTabCallback.closed = true;
            EventPayloadCompanion.this.onExtraCallbackWithResult.IAuthTabCallback(this);
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            for (int i = 0; i < stackTrace.length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement.getClassName().equals(IAuthTabCallback.class.getName()) && stackTraceElement.getMethodName().equals("close")) {
                    int i2 = i + 2;
                    int i3 = i + 1;
                    if (i3 < stackTrace.length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i3];
                        if (stackTraceElement2.getClassName().equals("kotlin.jdk7.AutoCloseableKt") && stackTraceElement2.getMethodName().equals("closeFinally") && i2 < stackTrace.length) {
                            i2 = i + 3;
                        }
                    }
                    if (stackTrace[i2].getMethodName().equals("invokeSuspend")) {
                        i2++;
                    }
                    if (i2 < stackTrace.length) {
                        StackTraceElement stackTraceElement3 = stackTrace[i2];
                        if (stackTraceElement3.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement3.getMethodName().equals("resumeWith")) {
                            throw new AssertionError("Attempting to close a Scope created by Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (Thread.currentThread().getId() != this.IAuthTabCallback.threadId) {
                throw new IllegalStateException(String.format("Thread [%s] opened scope, but thread [%s] closed it", this.IAuthTabCallback.threadName, Thread.currentThread().getName()), this.IAuthTabCallback);
            }
            this.onExtraCallback.close();
        }

        public String toString() {
            String message = this.IAuthTabCallback.getMessage();
            return message != null ? message : super.toString();
        }
    }

    public static class onNavigationEvent extends Throwable {
        volatile boolean closed;
        final trimMetadataStringsTo context;
        final long threadId;
        final String threadName;

        onNavigationEvent(trimMetadataStringsTo trimmetadatastringsto) {
            super("Thread [" + Thread.currentThread().getName() + "] opened scope for " + trimmetadatastringsto + " here:");
            this.threadName = Thread.currentThread().getName();
            this.threadId = Thread.currentThread().getId();
            this.context = trimmetadatastringsto;
        }
    }

    public static class onExtraCallbackWithResult extends EventStorageModulespecialinlinedprovider1<accessgetDelegatep, onNavigationEvent> {
        private final ConcurrentHashMap<EventStorageModule.onWarmupCompleted<accessgetDelegatep>, onNavigationEvent> IAuthTabCallback;

        static onExtraCallbackWithResult onExtraCallback() {
            return new onExtraCallbackWithResult(new ConcurrentHashMap());
        }

        onExtraCallbackWithResult(ConcurrentHashMap<EventStorageModule.onWarmupCompleted<accessgetDelegatep>, onNavigationEvent> concurrentHashMap) {
            super(false, false, concurrentHashMap);
            this.IAuthTabCallback = concurrentHashMap;
            Thread thread = new Thread(this);
            thread.setName("weak-ref-cleaner-strictcontextstorage");
            thread.setPriority(1);
            thread.setDaemon(true);
            thread.start();
        }

        List<onNavigationEvent> onNavigationEvent() {
            List<onNavigationEvent> list = (List) this.IAuthTabCallback.values().stream().filter(new Predicate() { // from class: io.opentelemetry.context.StrictContextStorage$PendingScopes$$ExternalSyntheticLambda0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return EventPayloadCompanion.onExtraCallbackWithResult.onWarmupCompleted((EventPayloadCompanion.onNavigationEvent) obj);
                }
            }).collect(Collectors.toList());
            this.IAuthTabCallback.clear();
            return list;
        }

        public static /* synthetic */ boolean onWarmupCompleted(onNavigationEvent onnavigationevent) {
            return !onnavigationevent.closed;
        }

        @Override // o.EventStorageModulespecialinlinedprovider1, o.EventStorageModule, java.lang.Runnable
        public void run() throws InterruptedException {
            while (!Thread.interrupted()) {
                try {
                    Reference<? extends accessgetDelegatep> referenceRemove = remove();
                    onNavigationEvent onnavigationeventRemove = referenceRemove != null ? this.IAuthTabCallback.remove(referenceRemove) : null;
                    if (onnavigationeventRemove != null && !onnavigationeventRemove.closed) {
                        EventPayloadCompanion.onExtraCallback.log(Level.SEVERE, "Scope garbage collected before being closed.", (Throwable) EventPayloadCompanion.onNavigationEvent(onnavigationeventRemove));
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    static AssertionError onNavigationEvent(onNavigationEvent onnavigationevent) {
        AssertionError assertionError = new AssertionError("Thread [" + onnavigationevent.threadName + "] opened a scope of " + onnavigationevent.context + " here:");
        assertionError.setStackTrace(onnavigationevent.getStackTrace());
        return assertionError;
    }
}
