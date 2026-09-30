package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class jni_YGNodeCopyStyleJNI<T> extends nLockFile<T> implements writeQuoted<T>, ensureCapacity<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallbackWithResult = AtomicReferenceFieldUpdater.newUpdater(jni_YGNodeCopyStyleJNI.class, Object.class, "_subscription$volatile");
    private volatile /* synthetic */ Object _subscription$volatile;

    public jni_YGNodeCopyStyleJNI() {
        super(Integer.MAX_VALUE, (Function1) null, 2, (DefaultConstructorMarker) null);
    }

    public void extraCallback() {
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) onExtraCallbackWithResult.getAndSet(this, null);
        if (deserializeurinullablecollection != null) {
            deserializeurinullablecollection.dispose();
        }
    }

    public void IAuthTabCallback(@NotNull deserializeUriNullableCollection deserializeurinullablecollection) {
        onExtraCallbackWithResult.set(this, deserializeurinullablecollection);
    }

    public void onNavigationEvent(@NotNull T t) {
        IAuthTabCallback(t);
        onExtraCallback((Throwable) null);
    }

    public void onExtraCallback(@NotNull T t) {
        IAuthTabCallback(t);
    }

    public void onExtraCallback() {
        onExtraCallback((Throwable) null);
    }

    public void onExtraCallbackWithResult(@NotNull Throwable th) {
        onExtraCallback(th);
    }
}
