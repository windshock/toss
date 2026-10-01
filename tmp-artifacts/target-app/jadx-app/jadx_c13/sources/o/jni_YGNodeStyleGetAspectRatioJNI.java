package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleGetAspectRatioJNI {
    private static final getBacktraceNote<Object, Object, Object, Object> onNavigationEvent = onNavigationEvent.onWarmupCompleted;
    private static final djExternalSyntheticApiModelOutline0 onTransact = new djExternalSyntheticApiModelOutline0("STATE_REG");
    private static final djExternalSyntheticApiModelOutline0 IAuthTabCallback = new djExternalSyntheticApiModelOutline0("STATE_COMPLETED");
    private static final djExternalSyntheticApiModelOutline0 onExtraCallbackWithResult = new djExternalSyntheticApiModelOutline0("STATE_CANCELLED");
    private static final djExternalSyntheticApiModelOutline0 onWarmupCompleted = new djExternalSyntheticApiModelOutline0("NO_RESULT");
    private static final djExternalSyntheticApiModelOutline0 onExtraCallback = new djExternalSyntheticApiModelOutline0("PARAM_CLAUSE_0");

    static final class onNavigationEvent implements getBacktraceNote {
        public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

        onNavigationEvent() {
        }

        @Override // o.getBacktraceNote
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onNavigationEvent(maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener, getBacktraceNote<? super Throwable, Object, ? super CoroutineContext, Unit> getbacktracenote) {
        Object objOnWarmupCompleted = mayberemoveattachstatelistener.onWarmupCompleted(Unit.INSTANCE, null, getbacktracenote);
        if (objOnWarmupCompleted == null) {
            return false;
        }
        mayberemoveattachstatelistener.onExtraCallback(objOnWarmupCompleted);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jni_YGNodeStyleGetDisplayJNI onExtraCallbackWithResult(int i) {
        if (i == 0) {
            return jni_YGNodeStyleGetDisplayJNI.SUCCESSFUL;
        }
        if (i == 1) {
            return jni_YGNodeStyleGetDisplayJNI.REREGISTER;
        }
        if (i == 2) {
            return jni_YGNodeStyleGetDisplayJNI.CANCELLED;
        }
        if (i == 3) {
            return jni_YGNodeStyleGetDisplayJNI.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i).toString());
    }

    public static final djExternalSyntheticApiModelOutline0 onTransact() {
        return onExtraCallback;
    }
}
