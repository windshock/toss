package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class jni_YGNodeNewWithConfigJNI extends jni_YGNodeIsDirtyJNI {
    public final Runnable onExtraCallbackWithResult;

    public jni_YGNodeNewWithConfigJNI(@NotNull Runnable runnable, long j, boolean z) {
        super(j, z);
        this.onExtraCallbackWithResult = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.onExtraCallbackWithResult.run();
    }

    public String toString() {
        return "Task[" + getResCount.IAuthTabCallback(this.onExtraCallbackWithResult) + '@' + getResCount.onExtraCallbackWithResult(this.onExtraCallbackWithResult) + ", " + this.asInterface + ", " + jni_YGNodeRemoveAllChildrenJNI.IAuthTabCallback(this.onTransact) + ']';
    }
}
