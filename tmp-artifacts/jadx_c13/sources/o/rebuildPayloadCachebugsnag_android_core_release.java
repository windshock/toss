package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class rebuildPayloadCachebugsnag_android_core_release {
    private static final Logger onExtraCallback = Logger.getLogger(rebuildPayloadCachebugsnag_android_core_release.class.getName());
    private static final updateSeverityReasonInternalbugsnag_android_core_release onNavigationEvent;

    static updateSeverityReasonInternalbugsnag_android_core_release onExtraCallback() {
        return onNavigationEvent;
    }

    static {
        AtomicReference atomicReference = new AtomicReference();
        updateSeverityReasonInternalbugsnag_android_core_release updateseverityreasoninternalbugsnag_android_core_releaseOnExtraCallback = onExtraCallback(atomicReference);
        if (Boolean.getBoolean("io.opentelemetry.context.enableStrictContext")) {
            updateseverityreasoninternalbugsnag_android_core_releaseOnExtraCallback = EventPayloadCompanion.onExtraCallbackWithResult(updateseverityreasoninternalbugsnag_android_core_releaseOnExtraCallback);
        }
        Iterator<Function<? super updateSeverityReasonInternalbugsnag_android_core_release, ? extends updateSeverityReasonInternalbugsnag_android_core_release>> it = getEventFilebugsnag_android_core_release.IAuthTabCallback().iterator();
        while (it.hasNext()) {
            updateseverityreasoninternalbugsnag_android_core_releaseOnExtraCallback = it.next().apply(updateseverityreasoninternalbugsnag_android_core_releaseOnExtraCallback);
        }
        onNavigationEvent = updateseverityreasoninternalbugsnag_android_core_releaseOnExtraCallback;
        getEventFilebugsnag_android_core_release.onExtraCallbackWithResult();
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            onExtraCallback.log(Level.WARNING, "ContextStorageProvider initialized failed. Using default", th);
        }
    }

    static updateSeverityReasonInternalbugsnag_android_core_release onExtraCallback(AtomicReference<Throwable> atomicReference) {
        String property = System.getProperty("io.opentelemetry.context.contextStorageProvider", _UrlKt.FRAGMENT_ENCODE_SET);
        if ("default".equals(property)) {
            return updateSeverityReasonInternalbugsnag_android_core_release.onExtraCallback();
        }
        ArrayList<getNotifierbugsnag_android_core_release> arrayList = new ArrayList();
        Iterator it = ServiceLoader.load(getNotifierbugsnag_android_core_release.class).iterator();
        while (it.hasNext()) {
            getNotifierbugsnag_android_core_release getnotifierbugsnag_android_core_release = (getNotifierbugsnag_android_core_release) it.next();
            if (getnotifierbugsnag_android_core_release.getClass().getName().equals("io.opentelemetry.sdk.testing.context.SettableContextStorageProvider")) {
                return getnotifierbugsnag_android_core_release.onNavigationEvent();
            }
            arrayList.add(getnotifierbugsnag_android_core_release);
        }
        if (arrayList.isEmpty()) {
            return updateSeverityReasonInternalbugsnag_android_core_release.onExtraCallback();
        }
        if (property.isEmpty()) {
            if (arrayList.size() == 1) {
                return ((getNotifierbugsnag_android_core_release) arrayList.get(0)).onNavigationEvent();
            }
            atomicReference.set(new IllegalStateException("Found multiple ContextStorageProvider. Set the io.opentelemetry.context.ContextStorageProvider property to the fully qualified class name of the provider to use. Falling back to default ContextStorage. Found providers: " + arrayList));
            return updateSeverityReasonInternalbugsnag_android_core_release.onExtraCallback();
        }
        for (getNotifierbugsnag_android_core_release getnotifierbugsnag_android_core_release2 : arrayList) {
            if (getnotifierbugsnag_android_core_release2.getClass().getName().equals(property)) {
                return getnotifierbugsnag_android_core_release2.onNavigationEvent();
            }
        }
        atomicReference.set(new IllegalStateException("io.opentelemetry.context.ContextStorageProvider property set but no matching class could be found, requested: " + property + " but found providers: " + arrayList));
        return updateSeverityReasonInternalbugsnag_android_core_release.onExtraCallback();
    }

    private rebuildPayloadCachebugsnag_android_core_release() {
    }
}
