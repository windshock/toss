package kotlinx.coroutines.reactive;

import java.util.ServiceLoader;
import kotlin.coroutines.CoroutineContext;
import o.IAnimation;
import o.YogaLogger;
import o.YogaNative;
import o.clearSelinuxLabel;
import o.ensureCausesIsMutable;
import o.putChannelInfo;
import o.r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk;
import o.setUnSelectedColor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReactiveFlowKt {
    private static final setUnSelectedColor[] onNavigationEvent = (setUnSelectedColor[]) ensureCausesIsMutable.onRelationshipValidationResult(clearSelinuxLabel.onExtraCallbackWithResult(ServiceLoader.load(setUnSelectedColor.class, setUnSelectedColor.class.getClassLoader()).iterator())).toArray(new setUnSelectedColor[0]);

    public static final <T> IAnimation<T> onWarmupCompleted(@NotNull r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk) {
        return new YogaLogger(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, null, 0, null, 14, null);
    }

    public static final <T> r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull CoroutineContext coroutineContext) {
        return new YogaNative(iAnimation, putChannelInfo.onExtraCallbackWithResult().plus(coroutineContext));
    }

    public static final <T> r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> onExtraCallbackWithResult(@NotNull r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, @NotNull CoroutineContext coroutineContext) {
        for (setUnSelectedColor setunselectedcolor : onNavigationEvent) {
            r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = setunselectedcolor.onWarmupCompleted(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, coroutineContext);
        }
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }
}
