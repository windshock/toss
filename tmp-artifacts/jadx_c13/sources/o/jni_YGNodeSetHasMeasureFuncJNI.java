package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeSetHasMeasureFuncJNI implements jni_YGNodeStyleGetAlignContentJNI {
    private final getBacktraceNote<Object, jni_YGNodeStyleGetBorderJNI<?>, Object, Unit> IAuthTabCallback;
    private final getBacktraceNote<jni_YGNodeStyleGetBorderJNI<?>, Object, Object, getBacktraceNote<Throwable, Object, CoroutineContext, Unit>> onExtraCallback;
    private final getBacktraceNote<Object, Object, Object, Object> onNavigationEvent;
    private final Object onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public jni_YGNodeSetHasMeasureFuncJNI(@NotNull Object obj, @NotNull getBacktraceNote<Object, ? super jni_YGNodeStyleGetBorderJNI<?>, Object, Unit> getbacktracenote, @Nullable getBacktraceNote<? super jni_YGNodeStyleGetBorderJNI<?>, Object, Object, ? extends getBacktraceNote<? super Throwable, Object, ? super CoroutineContext, Unit>> getbacktracenote2) {
        this.onWarmupCompleted = obj;
        this.IAuthTabCallback = getbacktracenote;
        this.onExtraCallback = getbacktracenote2;
        this.onNavigationEvent = jni_YGNodeStyleGetAspectRatioJNI.onNavigationEvent;
    }

    public /* synthetic */ jni_YGNodeSetHasMeasureFuncJNI(Object obj, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, getbacktracenote, (i & 4) != 0 ? null : getbacktracenote2);
    }

    @Override // o.jni_YGNodeSetStyleInputsJNI
    public Object IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.jni_YGNodeSetStyleInputsJNI
    public getBacktraceNote<Object, jni_YGNodeStyleGetBorderJNI<?>, Object, Unit> onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    @Override // o.jni_YGNodeSetStyleInputsJNI
    public getBacktraceNote<jni_YGNodeStyleGetBorderJNI<?>, Object, Object, getBacktraceNote<Throwable, Object, CoroutineContext, Unit>> onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.jni_YGNodeSetStyleInputsJNI
    public getBacktraceNote<Object, Object, Object, Object> onWarmupCompleted() {
        return this.onNavigationEvent;
    }
}
