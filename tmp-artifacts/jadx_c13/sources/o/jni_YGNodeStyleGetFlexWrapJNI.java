package o;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class jni_YGNodeStyleGetFlexWrapJNI extends ycx5<jni_YGNodeStyleGetFlexWrapJNI> {
    private final /* synthetic */ AtomicReferenceArray onWarmupCompleted;

    public final /* synthetic */ AtomicReferenceArray onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public jni_YGNodeStyleGetFlexWrapJNI(long j, @Nullable jni_YGNodeStyleGetFlexWrapJNI jni_ygnodestylegetflexwrapjni, int i) {
        super(j, jni_ygnodestylegetflexwrapjni, i);
        this.onWarmupCompleted = new AtomicReferenceArray(jni_YGNodeStyleGetFlexShrinkJNI.IAuthTabCallback);
    }

    @Override // o.ycx5
    public int IAuthTabCallback() {
        return jni_YGNodeStyleGetFlexShrinkJNI.IAuthTabCallback;
    }

    @Override // o.ycx5
    public void onNavigationEvent(int i, @Nullable Throwable th, @NotNull CoroutineContext coroutineContext) {
        onExtraCallback().set(i, jni_YGNodeStyleGetFlexShrinkJNI.onExtraCallbackWithResult);
        access100();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.onExtraCallback + ", hashCode=" + hashCode() + ']';
    }
}
