package o;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class YogaNative<T> implements r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> {
    private final IAnimation<T> IAuthTabCallback;
    private final CoroutineContext onExtraCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public YogaNative(@NotNull IAnimation<? extends T> iAnimation, @NotNull CoroutineContext coroutineContext) {
        this.IAuthTabCallback = iAnimation;
        this.onExtraCallback = coroutineContext;
    }

    @Override // o.r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk
    public void subscribe(@Nullable ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        ycxexternalsyntheticlambda0.onExtraCallback(new jni_YGConfigNewJNI(this.IAuthTabCallback, ycxexternalsyntheticlambda0, this.onExtraCallback));
    }
}
