package o;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class jni_YGNodeIsReferenceBaselineJNI extends ComponentModela {
    private final int IAuthTabCallbackDefault;
    private final long asInterface;
    private jni_YGNodeFinalizeJNI onExtraCallback;
    private final int onNavigationEvent;
    private final String onTransact;

    public jni_YGNodeIsReferenceBaselineJNI() {
        this(0, 0, 0L, null, 15, null);
    }

    public /* synthetic */ jni_YGNodeIsReferenceBaselineJNI(int i, int i2, long j, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? jni_YGNodeRemoveAllChildrenJNI.onExtraCallbackWithResult : i, (i3 & 2) != 0 ? jni_YGNodeRemoveAllChildrenJNI.IAuthTabCallback : i2, (i3 & 4) != 0 ? jni_YGNodeRemoveAllChildrenJNI.onExtraCallback : j, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public jni_YGNodeIsReferenceBaselineJNI(int i, int i2, long j, @NotNull String str) {
        this.onNavigationEvent = i;
        this.IAuthTabCallbackDefault = i2;
        this.asInterface = j;
        this.onTransact = str;
        this.onExtraCallback = IAuthTabCallback();
    }

    @Override // o.ComponentModela
    public Executor onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    private final jni_YGNodeFinalizeJNI IAuthTabCallback() {
        return new jni_YGNodeFinalizeJNI(this.onNavigationEvent, this.IAuthTabCallbackDefault, this.asInterface, this.onTransact);
    }

    @Override // o.GeckoHubImp
    public void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        jni_YGNodeFinalizeJNI.onExtraCallback(this.onExtraCallback, runnable, false, false, 6, null);
    }

    @Override // o.GeckoHubImp
    public void onExtraCallback(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        jni_YGNodeFinalizeJNI.onExtraCallback(this.onExtraCallback, runnable, false, true, 2, null);
    }

    public final void onNavigationEvent(@NotNull Runnable runnable, boolean z, boolean z2) {
        this.onExtraCallback.onExtraCallbackWithResult(runnable, z, z2);
    }

    @Override // o.ComponentModela, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.onExtraCallback.close();
    }
}
