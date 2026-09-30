package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class jni_YGNodeStyleGetDirectionJNI<R> implements BitmapImageViewTarget, jni_YGNodeSetIsReferenceBaselineJNI<R>, jni_YGNodeStyleGetBoxSizingJNI<R> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallback = AtomicReferenceFieldUpdater.newUpdater(jni_YGNodeStyleGetDirectionJNI.class, Object.class, "state$volatile");
    private Object IAuthTabCallback;
    private final CoroutineContext onWarmupCompleted;
    private volatile /* synthetic */ Object state$volatile = jni_YGNodeStyleGetAspectRatioJNI.onTransact;
    private List<jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback> onNavigationEvent = new ArrayList(2);
    private int onExtraCallbackWithResult = -1;
    private Object asBinder = jni_YGNodeStyleGetAspectRatioJNI.onWarmupCompleted;

    static final class onWarmupCompleted extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ jni_YGNodeStyleGetDirectionJNI<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(jni_YGNodeStyleGetDirectionJNI<R> jni_ygnodestylegetdirectionjni, access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
            this.this$0 = jni_ygnodestylegetdirectionjni;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onNavigationEvent((access13800) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater onWarmupCompleted() {
        return onExtraCallback;
    }

    public Object onExtraCallback(@NotNull access13800<? super R> access13800Var) {
        return onWarmupCompleted(this, access13800Var);
    }

    public jni_YGNodeStyleGetDirectionJNI(@NotNull CoroutineContext coroutineContext) {
        this.onWarmupCompleted = coroutineContext;
    }

    @Override // o.jni_YGNodeStyleGetBorderJNI
    public CoroutineContext onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    private final boolean IAuthTabCallback() {
        return onExtraCallback.get(this) instanceof onExtraCallback;
    }

    static /* synthetic */ <R> Object onWarmupCompleted(jni_YGNodeStyleGetDirectionJNI<R> jni_ygnodestylegetdirectionjni, access13800<? super R> access13800Var) {
        return jni_ygnodestylegetdirectionjni.IAuthTabCallback() ? jni_ygnodestylegetdirectionjni.onExtraCallbackWithResult((access13800) access13800Var) : jni_ygnodestylegetdirectionjni.onNavigationEvent((access13800) access13800Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(access13800<? super R> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        jni_YGNodeStyleGetDirectionJNI<R> jni_ygnodestylegetdirectionjni;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i = onwarmupcompleted.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(this, access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onwarmupcompleted.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            onwarmupcompleted.L$0 = this;
            onwarmupcompleted.label = 1;
            if (IAuthTabCallback(onwarmupcompleted) != objOnExtraCallback) {
                jni_ygnodestylegetdirectionjni = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return obj;
        }
        jni_ygnodestylegetdirectionjni = (jni_YGNodeStyleGetDirectionJNI) onwarmupcompleted.L$0;
        ResultKt.onNavigationEvent(obj);
        onwarmupcompleted.L$0 = null;
        onwarmupcompleted.label = 2;
        Object objOnExtraCallbackWithResult = jni_ygnodestylegetdirectionjni.onExtraCallbackWithResult((access13800) onwarmupcompleted);
        return objOnExtraCallbackWithResult == objOnExtraCallback ? objOnExtraCallback : objOnExtraCallbackWithResult;
    }

    @Override // o.jni_YGNodeSetIsReferenceBaselineJNI
    public void IAuthTabCallback(@NotNull jni_YGNodeStyleGetAlignContentJNI jni_ygnodestylegetaligncontentjni, @NotNull Function1<? super access13800<? super R>, ? extends Object> function1) {
        onNavigationEvent(this, new onExtraCallback(jni_ygnodestylegetaligncontentjni.IAuthTabCallback(), jni_ygnodestylegetaligncontentjni.onNavigationEvent(), jni_ygnodestylegetaligncontentjni.onWarmupCompleted(), jni_YGNodeStyleGetAspectRatioJNI.onTransact(), function1, jni_ygnodestylegetaligncontentjni.onExtraCallback()), false, 1, null);
    }

    @Override // o.jni_YGNodeSetIsReferenceBaselineJNI
    public <Q> void onExtraCallbackWithResult(@NotNull jni_YGNodeStyleGetAlignItemsJNI<? extends Q> jni_ygnodestylegetalignitemsjni, @NotNull Function2<? super Q, ? super access13800<? super R>, ? extends Object> function2) {
        onNavigationEvent(this, new onExtraCallback(jni_ygnodestylegetalignitemsjni.IAuthTabCallback(), jni_ygnodestylegetalignitemsjni.onNavigationEvent(), jni_ygnodestylegetalignitemsjni.onWarmupCompleted(), null, function2, jni_ygnodestylegetalignitemsjni.onExtraCallback()), false, 1, null);
    }

    public static /* synthetic */ void onNavigationEvent(jni_YGNodeStyleGetDirectionJNI jni_ygnodestylegetdirectionjni, onExtraCallback onextracallback, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        jni_ygnodestylegetdirectionjni.onExtraCallbackWithResult(onextracallback, z);
    }

    public final void onExtraCallbackWithResult(@NotNull jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback onextracallback, boolean z) {
        if (onExtraCallback.get(this) instanceof onExtraCallback) {
            return;
        }
        if (!z) {
            onExtraCallbackWithResult(onextracallback.onExtraCallback);
        }
        if (onextracallback.onWarmupCompleted(this)) {
            if (!z) {
                List<jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback> list = this.onNavigationEvent;
                Intrinsics.checkNotNull(list);
                list.add(onextracallback);
            }
            onextracallback.IAuthTabCallback = this.IAuthTabCallback;
            onextracallback.onExtraCallbackWithResult = this.onExtraCallbackWithResult;
            this.IAuthTabCallback = null;
            this.onExtraCallbackWithResult = -1;
            return;
        }
        onExtraCallback.set(this, onextracallback);
    }

    private final void onExtraCallbackWithResult(Object obj) {
        List<jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback> list = this.onNavigationEvent;
        Intrinsics.checkNotNull(list);
        List<jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((onExtraCallback) it.next()).onExtraCallback == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    @Override // o.jni_YGNodeStyleGetBorderJNI
    public void onExtraCallbackWithResult(@NotNull setDeployments setdeployments) {
        this.IAuthTabCallback = setdeployments;
    }

    @Override // o.syncDoGet
    public void IAuthTabCallback(@NotNull ycx5<?> ycx5Var, int i) {
        this.IAuthTabCallback = ycx5Var;
        this.onExtraCallbackWithResult = i;
    }

    @Override // o.jni_YGNodeStyleGetBorderJNI
    public void onExtraCallback(@Nullable Object obj) {
        this.asBinder = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNavigationEvent(Object obj) {
        jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback onextracallbackOnWarmupCompleted = onWarmupCompleted(obj);
        Intrinsics.checkNotNull(onextracallbackOnWarmupCompleted);
        onextracallbackOnWarmupCompleted.IAuthTabCallback = null;
        onextracallbackOnWarmupCompleted.onExtraCallbackWithResult = -1;
        onExtraCallbackWithResult((onExtraCallback) onextracallbackOnWarmupCompleted, true);
    }

    @Override // o.jni_YGNodeStyleGetBorderJNI
    public boolean onExtraCallbackWithResult(@NotNull Object obj, @Nullable Object obj2) {
        return onExtraCallback(obj, obj2) == 0;
    }

    public final jni_YGNodeStyleGetDisplayJNI IAuthTabCallback(@NotNull Object obj, @Nullable Object obj2) {
        return jni_YGNodeStyleGetAspectRatioJNI.onExtraCallbackWithResult(onExtraCallback(obj, obj2));
    }

    private final int onExtraCallback(Object obj, Object obj2) {
        while (true) {
            Object obj3 = onExtraCallback.get(this);
            if (!(obj3 instanceof maybeRemoveAttachStateListener)) {
                if (Intrinsics.areEqual(obj3, jni_YGNodeStyleGetAspectRatioJNI.IAuthTabCallback) || (obj3 instanceof onExtraCallback)) {
                    return 3;
                }
                if (Intrinsics.areEqual(obj3, jni_YGNodeStyleGetAspectRatioJNI.onExtraCallbackWithResult)) {
                    return 2;
                }
                if (Intrinsics.areEqual(obj3, jni_YGNodeStyleGetAspectRatioJNI.onTransact)) {
                    if (RequestBuilder.onWarmupCompleted(onExtraCallback, this, obj3, CollectionsKt__CollectionsJVMKt.listOf(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (RequestBuilder.onWarmupCompleted(onExtraCallback, this, obj3, CollectionsKt___CollectionsKt.plus((Collection<? extends Object>) obj3, obj))) {
                        return 1;
                    }
                }
            } else {
                jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback onextracallbackOnWarmupCompleted = onWarmupCompleted(obj);
                if (onextracallbackOnWarmupCompleted != null) {
                    getBacktraceNote<Throwable, Object, CoroutineContext, Unit> getbacktracenoteOnNavigationEvent = onextracallbackOnWarmupCompleted.onNavigationEvent(this, obj2);
                    if (RequestBuilder.onWarmupCompleted(onExtraCallback, this, obj3, onextracallbackOnWarmupCompleted)) {
                        this.asBinder = obj2;
                        if (jni_YGNodeStyleGetAspectRatioJNI.onNavigationEvent((maybeRemoveAttachStateListener) obj3, getbacktracenoteOnNavigationEvent)) {
                            return 0;
                        }
                        this.asBinder = jni_YGNodeStyleGetAspectRatioJNI.onWarmupCompleted;
                        return 2;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private final jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback onWarmupCompleted(Object obj) {
        List<jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback> list = this.onNavigationEvent;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((onExtraCallback) next).onExtraCallback == obj) {
                obj2 = next;
                break;
            }
        }
        jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback onextracallback = (onExtraCallback) obj2;
        if (onextracallback != null) {
            return onextracallback;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final Object onExtraCallbackWithResult(access13800<? super R> access13800Var) {
        Object obj = onExtraCallback.get(this);
        Intrinsics.checkNotNull(obj, "");
        jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback onextracallback = (onExtraCallback) obj;
        Object obj2 = this.asBinder;
        onExtraCallback((onExtraCallback) onextracallback);
        return onextracallback.IAuthTabCallback(onextracallback.IAuthTabCallback(obj2), access13800Var);
    }

    private final void onExtraCallback(jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback onextracallback) {
        List<jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback> list = this.onNavigationEvent;
        if (list == null) {
            return;
        }
        for (jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback onextracallback2 : list) {
            if (onextracallback2 != onextracallback) {
                onextracallback2.onExtraCallback();
            }
        }
        onExtraCallback.set(this, jni_YGNodeStyleGetAspectRatioJNI.IAuthTabCallback);
        this.asBinder = jni_YGNodeStyleGetAspectRatioJNI.onWarmupCompleted;
        this.onNavigationEvent = null;
    }

    @Override // o.BitmapImageViewTarget
    public void onExtraCallbackWithResult(@Nullable Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onExtraCallback;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == jni_YGNodeStyleGetAspectRatioJNI.IAuthTabCallback) {
                return;
            }
        } while (!RequestBuilder.onWarmupCompleted(atomicReferenceFieldUpdater, this, obj, jni_YGNodeStyleGetAspectRatioJNI.onExtraCallbackWithResult));
        List<jni_YGNodeStyleGetDirectionJNI<R>.onExtraCallback> list = this.onNavigationEvent;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((onExtraCallback) it.next()).onExtraCallback();
        }
        this.asBinder = jni_YGNodeStyleGetAspectRatioJNI.onWarmupCompleted;
        this.onNavigationEvent = null;
    }

    public final class onExtraCallback {
        public Object IAuthTabCallback;
        private final getBacktraceNote<Object, jni_YGNodeStyleGetBorderJNI<?>, Object, Unit> IAuthTabCallbackDefault;
        private final getBacktraceNote<Object, Object, Object, Object> IAuthTabCallbackStub;
        private final Object asBinder;
        public final Object onExtraCallback;
        public int onExtraCallbackWithResult = -1;
        private final Object onTransact;
        public final getBacktraceNote<jni_YGNodeStyleGetBorderJNI<?>, Object, Object, getBacktraceNote<Throwable, Object, CoroutineContext, Unit>> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public onExtraCallback(@NotNull Object obj, @NotNull getBacktraceNote<Object, ? super jni_YGNodeStyleGetBorderJNI<?>, Object, Unit> getbacktracenote, @NotNull getBacktraceNote<Object, Object, Object, ? extends Object> getbacktracenote2, @Nullable Object obj2, @NotNull Object obj3, @Nullable getBacktraceNote<? super jni_YGNodeStyleGetBorderJNI<?>, Object, Object, ? extends getBacktraceNote<? super Throwable, Object, ? super CoroutineContext, Unit>> getbacktracenote3) {
            this.onExtraCallback = obj;
            this.IAuthTabCallbackDefault = getbacktracenote;
            this.IAuthTabCallbackStub = getbacktracenote2;
            this.asBinder = obj2;
            this.onTransact = obj3;
            this.onWarmupCompleted = getbacktracenote3;
        }

        public final boolean onWarmupCompleted(@NotNull jni_YGNodeStyleGetDirectionJNI<R> jni_ygnodestylegetdirectionjni) {
            this.IAuthTabCallbackDefault.invoke(this.onExtraCallback, jni_ygnodestylegetdirectionjni, this.asBinder);
            return ((jni_YGNodeStyleGetDirectionJNI) jni_ygnodestylegetdirectionjni).asBinder == jni_YGNodeStyleGetAspectRatioJNI.onWarmupCompleted;
        }

        public final Object IAuthTabCallback(@Nullable Object obj) {
            return this.IAuthTabCallbackStub.invoke(this.onExtraCallback, this.asBinder, obj);
        }

        public final Object IAuthTabCallback(@Nullable Object obj, @NotNull access13800<? super R> access13800Var) {
            Object obj2 = this.onTransact;
            if (this.asBinder == jni_YGNodeStyleGetAspectRatioJNI.onTransact()) {
                Intrinsics.checkNotNull(obj2, "");
                return ((Function1) obj2).invoke(access13800Var);
            }
            Intrinsics.checkNotNull(obj2, "");
            return ((Function2) obj2).invoke(obj, access13800Var);
        }

        public final void onExtraCallback() {
            Object obj = this.IAuthTabCallback;
            jni_YGNodeStyleGetDirectionJNI<R> jni_ygnodestylegetdirectionjni = jni_YGNodeStyleGetDirectionJNI.this;
            if (obj instanceof ycx5) {
                ((ycx5) obj).onNavigationEvent(this.onExtraCallbackWithResult, null, jni_ygnodestylegetdirectionjni.onExtraCallbackWithResult());
                return;
            }
            setDeployments setdeployments = obj instanceof setDeployments ? (setDeployments) obj : null;
            if (setdeployments != null) {
                setdeployments.dispose();
            }
        }

        public final getBacktraceNote<Throwable, Object, CoroutineContext, Unit> onNavigationEvent(@NotNull jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, @Nullable Object obj) {
            getBacktraceNote<jni_YGNodeStyleGetBorderJNI<?>, Object, Object, getBacktraceNote<Throwable, Object, CoroutineContext, Unit>> getbacktracenote = this.onWarmupCompleted;
            if (getbacktracenote != null) {
                return getbacktracenote.invoke(jni_ygnodestylegetborderjni, this.asBinder, obj);
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r0 = r0.IAuthTabCallbackDefault();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r0 != o.access14100.onExtraCallback()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        o.access14600.IAuthTabCallback(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r0 != o.access14100.onExtraCallback()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterOnWarmupCompleted = onWarmupCompleted();
        while (true) {
            Object obj = atomicReferenceFieldUpdaterOnWarmupCompleted.get(this);
            if (obj == jni_YGNodeStyleGetAspectRatioJNI.onTransact) {
                if (RequestBuilder.onWarmupCompleted(onWarmupCompleted(), this, obj, setresourceinternal)) {
                    maybeAddAttachStateListener.IAuthTabCallback(setresourceinternal, this);
                    break;
                }
            } else if (obj instanceof List) {
                if (RequestBuilder.onWarmupCompleted(onWarmupCompleted(), this, obj, jni_YGNodeStyleGetAspectRatioJNI.onTransact)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        onNavigationEvent(it.next());
                    }
                }
            } else if (obj instanceof onExtraCallback) {
                setresourceinternal.IAuthTabCallback((setResourceInternal) Unit.INSTANCE, (getBacktraceNote<? super Throwable, ? super setResourceInternal, ? super CoroutineContext, Unit>) ((onExtraCallback) obj).onNavigationEvent(this, this.asBinder));
            } else {
                throw new IllegalStateException(("unexpected state: " + obj).toString());
            }
        }
    }
}
