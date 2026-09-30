package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class nTryLock {
    private static final sya<Object> IAuthTabCallbackStubProxy = new sya<>(-1, null, null, 0);
    public static final int onNavigationEvent = djExternalSyntheticApiModelOutline3.onExtraCallbackWithResult("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
    private static final int asBinder = djExternalSyntheticApiModelOutline3.onExtraCallbackWithResult("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
    public static final djExternalSyntheticApiModelOutline0 onExtraCallbackWithResult = new djExternalSyntheticApiModelOutline0("BUFFERED");
    private static final djExternalSyntheticApiModelOutline0 access100 = new djExternalSyntheticApiModelOutline0("SHOULD_BUFFER");
    private static final djExternalSyntheticApiModelOutline0 writeTypedObject = new djExternalSyntheticApiModelOutline0("S_RESUMING_BY_RCV");
    private static final djExternalSyntheticApiModelOutline0 extraCallback = new djExternalSyntheticApiModelOutline0("RESUMING_BY_EB");
    private static final djExternalSyntheticApiModelOutline0 IAuthTabCallback_Parcel = new djExternalSyntheticApiModelOutline0("POISONED");
    private static final djExternalSyntheticApiModelOutline0 asInterface = new djExternalSyntheticApiModelOutline0("DONE_RCV");
    private static final djExternalSyntheticApiModelOutline0 onTransact = new djExternalSyntheticApiModelOutline0("INTERRUPTED_SEND");
    private static final djExternalSyntheticApiModelOutline0 IAuthTabCallbackStub = new djExternalSyntheticApiModelOutline0("INTERRUPTED_RCV");
    private static final djExternalSyntheticApiModelOutline0 onWarmupCompleted = new djExternalSyntheticApiModelOutline0("CHANNEL_CLOSED");
    private static final djExternalSyntheticApiModelOutline0 extraCallbackWithResult = new djExternalSyntheticApiModelOutline0("SUSPEND");
    private static final djExternalSyntheticApiModelOutline0 ICustomTabsCallback = new djExternalSyntheticApiModelOutline0("SUSPEND_NO_WAITER");
    private static final djExternalSyntheticApiModelOutline0 IAuthTabCallbackDefault = new djExternalSyntheticApiModelOutline0("FAILED");
    private static final djExternalSyntheticApiModelOutline0 getInterfaceDescriptor = new djExternalSyntheticApiModelOutline0("NO_RECEIVE_RESULT");
    private static final djExternalSyntheticApiModelOutline0 IAuthTabCallback = new djExternalSyntheticApiModelOutline0("CLOSE_HANDLER_CLOSED");
    private static final djExternalSyntheticApiModelOutline0 onExtraCallback = new djExternalSyntheticApiModelOutline0("CLOSE_HANDLER_INVOKED");
    private static final djExternalSyntheticApiModelOutline0 access000 = new djExternalSyntheticApiModelOutline0("NO_CLOSE_CAUSE");

    /* JADX INFO: Access modifiers changed from: private */
    public static final long IAuthTabCallback(int i) {
        if (i != 0) {
            return i != Integer.MAX_VALUE ? i : LongCompanionObject.MAX_VALUE;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long onExtraCallback(long j, int i) {
        return (i << 60) + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long onWarmupCompleted(long j, boolean z) {
        return (z ? 4611686018427387904L : 0L) + j;
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    final /* synthetic */ class IAuthTabCallback<E> extends FunctionReferenceImpl implements Function2<Long, sya<E>, sya<E>> {
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        IAuthTabCallback() {
            super(2, nTryLock.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final sya<E> IAuthTabCallback(long j, sya<E> syaVar) {
            return nTryLock.onNavigationEvent(j, syaVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Long l, Object obj) {
            return IAuthTabCallback(l.longValue(), (sya) obj);
        }
    }

    public static final <E> access5300<sya<E>> extraCallbackWithResult() {
        return IAuthTabCallback.onWarmupCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> sya<E> onNavigationEvent(long j, sya<E> syaVar) {
        return new sya<>(j, syaVar, syaVar.onExtraCallback(), 0);
    }

    static /* synthetic */ boolean IAuthTabCallback(maybeRemoveAttachStateListener mayberemoveattachstatelistener, Object obj, getBacktraceNote getbacktracenote, int i, Object obj2) {
        if ((i & 2) != 0) {
            getbacktracenote = null;
        }
        return onExtraCallbackWithResult(mayberemoveattachstatelistener, obj, getbacktracenote);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean onExtraCallbackWithResult(maybeRemoveAttachStateListener<? super T> mayberemoveattachstatelistener, T t, getBacktraceNote<? super Throwable, ? super T, ? super CoroutineContext, Unit> getbacktracenote) {
        Object objOnWarmupCompleted = mayberemoveattachstatelistener.onWarmupCompleted(t, null, getbacktracenote);
        if (objOnWarmupCompleted == null) {
            return false;
        }
        mayberemoveattachstatelistener.onExtraCallback(objOnWarmupCompleted);
        return true;
    }

    public static final djExternalSyntheticApiModelOutline0 extraCallback() {
        return onWarmupCompleted;
    }
}
