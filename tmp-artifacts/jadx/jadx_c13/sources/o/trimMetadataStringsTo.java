package o;

import io.opentelemetry.context.Context$;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface trimMetadataStringsTo {
    @Nullable
    <V> V IAuthTabCallback(decodedEvent<V> decodedevent);

    <V> trimMetadataStringsTo onExtraCallbackWithResult(decodedEvent<V> decodedevent, V v);

    static trimMetadataStringsTo onExtraCallback() {
        trimMetadataStringsTo trimmetadatastringstoCurrent = updateSeverityReasonInternalbugsnag_android_core_release.onExtraCallbackWithResult().current();
        return trimmetadatastringstoCurrent != null ? trimmetadatastringstoCurrent : onExtraCallbackWithResult();
    }

    static trimMetadataStringsTo onExtraCallbackWithResult() {
        return updateSeverityReasonInternalbugsnag_android_core_release.onExtraCallbackWithResult().onWarmupCompleted();
    }

    default trimMetadataStringsTo IAuthTabCallback(getErrorTypesbugsnag_android_core_release geterrortypesbugsnag_android_core_release) {
        return geterrortypesbugsnag_android_core_release.onExtraCallbackWithResult(this);
    }

    default accessgetDelegatep onWarmupCompleted() {
        return updateSeverityReasonInternalbugsnag_android_core_release.onExtraCallbackWithResult().attach(this);
    }

    default Runnable onExtraCallbackWithResult(Runnable runnable) {
        return new Context$.ExternalSyntheticLambda5(this, runnable);
    }

    static /* synthetic */ void onExtraCallbackWithResult(trimMetadataStringsTo trimmetadatastringsto, Runnable runnable) {
        accessgetDelegatep accessgetdelegatepOnWarmupCompleted = trimmetadatastringsto.onWarmupCompleted();
        try {
            runnable.run();
            if (accessgetdelegatepOnWarmupCompleted != null) {
                accessgetdelegatepOnWarmupCompleted.close();
            }
        } catch (Throwable th) {
            if (accessgetdelegatepOnWarmupCompleted != null) {
                try {
                    accessgetdelegatepOnWarmupCompleted.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static /* synthetic */ Object onExtraCallback(trimMetadataStringsTo trimmetadatastringsto, Callable callable) {
        accessgetDelegatep accessgetdelegatepOnWarmupCompleted = trimmetadatastringsto.onWarmupCompleted();
        try {
            Object objCall = callable.call();
            if (accessgetdelegatepOnWarmupCompleted != null) {
                accessgetdelegatepOnWarmupCompleted.close();
            }
            return objCall;
        } catch (Throwable th) {
            if (accessgetdelegatepOnWarmupCompleted != null) {
                try {
                    accessgetdelegatepOnWarmupCompleted.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static /* synthetic */ Object onWarmupCompleted(trimMetadataStringsTo trimmetadatastringsto, Function function, Object obj) {
        accessgetDelegatep accessgetdelegatepOnWarmupCompleted = trimmetadatastringsto.onWarmupCompleted();
        try {
            Object objApply = function.apply(obj);
            if (accessgetdelegatepOnWarmupCompleted != null) {
                accessgetdelegatepOnWarmupCompleted.close();
            }
            return objApply;
        } catch (Throwable th) {
            if (accessgetdelegatepOnWarmupCompleted != null) {
                try {
                    accessgetdelegatepOnWarmupCompleted.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static /* synthetic */ Object onExtraCallback(trimMetadataStringsTo trimmetadatastringsto, BiFunction biFunction, Object obj, Object obj2) {
        accessgetDelegatep accessgetdelegatepOnWarmupCompleted = trimmetadatastringsto.onWarmupCompleted();
        try {
            Object objApply = biFunction.apply(obj, obj2);
            if (accessgetdelegatepOnWarmupCompleted != null) {
                accessgetdelegatepOnWarmupCompleted.close();
            }
            return objApply;
        } catch (Throwable th) {
            if (accessgetdelegatepOnWarmupCompleted != null) {
                try {
                    accessgetdelegatepOnWarmupCompleted.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static /* synthetic */ void onNavigationEvent(trimMetadataStringsTo trimmetadatastringsto, Consumer consumer, Object obj) {
        accessgetDelegatep accessgetdelegatepOnWarmupCompleted = trimmetadatastringsto.onWarmupCompleted();
        try {
            consumer.accept(obj);
            if (accessgetdelegatepOnWarmupCompleted != null) {
                accessgetdelegatepOnWarmupCompleted.close();
            }
        } catch (Throwable th) {
            if (accessgetdelegatepOnWarmupCompleted != null) {
                try {
                    accessgetdelegatepOnWarmupCompleted.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static /* synthetic */ void IAuthTabCallback(trimMetadataStringsTo trimmetadatastringsto, BiConsumer biConsumer, Object obj, Object obj2) {
        accessgetDelegatep accessgetdelegatepOnWarmupCompleted = trimmetadatastringsto.onWarmupCompleted();
        try {
            biConsumer.accept(obj, obj2);
            if (accessgetdelegatepOnWarmupCompleted != null) {
                accessgetdelegatepOnWarmupCompleted.close();
            }
        } catch (Throwable th) {
            if (accessgetdelegatepOnWarmupCompleted != null) {
                try {
                    accessgetdelegatepOnWarmupCompleted.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static /* synthetic */ Object onWarmupCompleted(trimMetadataStringsTo trimmetadatastringsto, Supplier supplier) {
        accessgetDelegatep accessgetdelegatepOnWarmupCompleted = trimmetadatastringsto.onWarmupCompleted();
        try {
            Object obj = supplier.get();
            if (accessgetdelegatepOnWarmupCompleted != null) {
                accessgetdelegatepOnWarmupCompleted.close();
            }
            return obj;
        } catch (Throwable th) {
            if (accessgetdelegatepOnWarmupCompleted != null) {
                try {
                    accessgetdelegatepOnWarmupCompleted.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
