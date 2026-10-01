package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleGetAlignSelfJNI<Q> implements jni_YGNodeStyleGetAlignItemsJNI<Q> {
    private final getBacktraceNote<Object, Object, Object, Object> onExtraCallback;
    private final Object onExtraCallbackWithResult;
    private final getBacktraceNote<Object, jni_YGNodeStyleGetBorderJNI<?>, Object, Unit> onNavigationEvent;
    private final getBacktraceNote<jni_YGNodeStyleGetBorderJNI<?>, Object, Object, getBacktraceNote<Throwable, Object, CoroutineContext, Unit>> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public jni_YGNodeStyleGetAlignSelfJNI(@NotNull Object obj, @NotNull getBacktraceNote<Object, ? super jni_YGNodeStyleGetBorderJNI<?>, Object, Unit> getbacktracenote, @NotNull getBacktraceNote<Object, Object, Object, ? extends Object> getbacktracenote2, @Nullable getBacktraceNote<? super jni_YGNodeStyleGetBorderJNI<?>, Object, Object, ? extends getBacktraceNote<? super Throwable, Object, ? super CoroutineContext, Unit>> getbacktracenote3) {
        this.onExtraCallbackWithResult = obj;
        this.onNavigationEvent = getbacktracenote;
        this.onExtraCallback = getbacktracenote2;
        this.onWarmupCompleted = getbacktracenote3;
    }

    public /* synthetic */ jni_YGNodeStyleGetAlignSelfJNI(Object obj, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, getbacktracenote, getbacktracenote2, (i & 8) != 0 ? null : getbacktracenote3);
    }

    @Override // o.jni_YGNodeSetStyleInputsJNI
    public Object IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.jni_YGNodeSetStyleInputsJNI
    public getBacktraceNote<Object, jni_YGNodeStyleGetBorderJNI<?>, Object, Unit> onNavigationEvent() {
        return this.onNavigationEvent;
    }

    @Override // o.jni_YGNodeSetStyleInputsJNI
    public getBacktraceNote<Object, Object, Object, Object> onWarmupCompleted() {
        return this.onExtraCallback;
    }

    @Override // o.jni_YGNodeSetStyleInputsJNI
    public getBacktraceNote<jni_YGNodeStyleGetBorderJNI<?>, Object, Object, getBacktraceNote<Throwable, Object, CoroutineContext, Unit>> onExtraCallback() {
        return this.onWarmupCompleted;
    }
}
