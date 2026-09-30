package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import o.jni_YGNodeSetHasBaselineFuncJNI;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeSetHasBaselineFuncJNI {
    private final long onWarmupCompleted;

    public jni_YGNodeSetHasBaselineFuncJNI(long j) {
        this.onWarmupCompleted = j;
    }

    final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements getBacktraceNote<jni_YGNodeSetHasBaselineFuncJNI, jni_YGNodeStyleGetBorderJNI<?>, Object, Unit> {
        public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(3, jni_YGNodeSetHasBaselineFuncJNI.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // o.getBacktraceNote
        public /* synthetic */ Unit invoke(jni_YGNodeSetHasBaselineFuncJNI jni_ygnodesethasbaselinefuncjni, jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
            onNavigationEvent(jni_ygnodesethasbaselinefuncjni, jni_ygnodestylegetborderjni, obj);
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(jni_YGNodeSetHasBaselineFuncJNI jni_ygnodesethasbaselinefuncjni, jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
            jni_ygnodesethasbaselinefuncjni.IAuthTabCallback(jni_ygnodestylegetborderjni, obj);
        }
    }

    public final jni_YGNodeStyleGetAlignContentJNI onWarmupCompleted() {
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.onNavigationEvent;
        Intrinsics.checkNotNull(onextracallbackwithresult, "");
        return new jni_YGNodeSetHasMeasureFuncJNI(this, (getBacktraceNote) TypeIntrinsics.beforeCheckcastToFunctionOfArity(onextracallbackwithresult, 3), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IAuthTabCallback(final jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
        if (this.onWarmupCompleted <= 0) {
            jni_ygnodestylegetborderjni.onExtraCallback(Unit.INSTANCE);
            return;
        }
        Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.selects.OnTimeout$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                jni_YGNodeSetHasBaselineFuncJNI.onExtraCallback(jni_ygnodestylegetborderjni, this);
            }
        };
        Intrinsics.checkNotNull(jni_ygnodestylegetborderjni, "");
        jni_YGNodeStyleGetDirectionJNI jni_ygnodestylegetdirectionjni = (jni_YGNodeStyleGetDirectionJNI) jni_ygnodestylegetborderjni;
        CoroutineContext coroutineContextOnExtraCallbackWithResult = jni_ygnodestylegetdirectionjni.onExtraCallbackWithResult();
        jni_ygnodestylegetdirectionjni.onExtraCallbackWithResult(formatMsgs.onExtraCallback(coroutineContextOnExtraCallbackWithResult).onWarmupCompleted(this.onWarmupCompleted, runnable, coroutineContextOnExtraCallbackWithResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(jni_YGNodeStyleGetBorderJNI jni_ygnodestylegetborderjni, jni_YGNodeSetHasBaselineFuncJNI jni_ygnodesethasbaselinefuncjni) {
        jni_ygnodestylegetborderjni.onExtraCallbackWithResult(jni_ygnodesethasbaselinefuncjni, Unit.INSTANCE);
    }
}
