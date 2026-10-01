package o;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
enum setEventbugsnag_android_core_release implements updateSeverityReasonInternalbugsnag_android_core_release {
    INSTANCE;

    private static final Logger logger = Logger.getLogger(setEventbugsnag_android_core_release.class.getName());
    private static final ThreadLocal<trimMetadataStringsTo> THREAD_LOCAL_STORAGE = new ThreadLocal<>();

    enum onWarmupCompleted implements accessgetDelegatep {
        INSTANCE;

        @Override // o.accessgetDelegatep, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // o.updateSeverityReasonInternalbugsnag_android_core_release
    public accessgetDelegatep attach(trimMetadataStringsTo trimmetadatastringsto) {
        if (trimmetadatastringsto == null) {
            return onWarmupCompleted.INSTANCE;
        }
        trimMetadataStringsTo trimmetadatastringstoCurrent = current();
        if (trimmetadatastringsto == trimmetadatastringstoCurrent) {
            return onWarmupCompleted.INSTANCE;
        }
        THREAD_LOCAL_STORAGE.set(trimmetadatastringsto);
        return new onExtraCallbackWithResult(trimmetadatastringstoCurrent, trimmetadatastringsto);
    }

    class onExtraCallbackWithResult implements accessgetDelegatep {
        private boolean IAuthTabCallback;
        private final trimMetadataStringsTo onExtraCallback;

        @Nullable
        private final trimMetadataStringsTo onNavigationEvent;

        private onExtraCallbackWithResult(@Nullable trimMetadataStringsTo trimmetadatastringsto, trimMetadataStringsTo trimmetadatastringsto2) {
            this.onNavigationEvent = trimmetadatastringsto;
            this.onExtraCallback = trimmetadatastringsto2;
        }

        @Override // o.accessgetDelegatep, java.lang.AutoCloseable
        public void close() {
            if (this.IAuthTabCallback || setEventbugsnag_android_core_release.this.current() != this.onExtraCallback) {
                setEventbugsnag_android_core_release.logger.log(Level.FINE, " Trying to close scope which does not represent current context. Ignoring the call.");
            } else {
                this.IAuthTabCallback = true;
                setEventbugsnag_android_core_release.THREAD_LOCAL_STORAGE.set(this.onNavigationEvent);
            }
        }
    }

    @Override // o.updateSeverityReasonInternalbugsnag_android_core_release
    @Nullable
    public trimMetadataStringsTo current() {
        return THREAD_LOCAL_STORAGE.get();
    }
}
