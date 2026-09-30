package o;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setBorderWidth implements getTileModeY {
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;

    public setBorderWidth(long j, long j2) {
        this.onExtraCallback = j;
        this.onExtraCallbackWithResult = j2;
        if (j < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
        }
        if (j2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
    }

    static final class onNavigationEvent extends SuspendLambda implements getBacktraceNote<setRipple<? super getStretch>, Integer, access13800<? super Unit>, Object> {
        /* synthetic */ int I$0;
        private /* synthetic */ Object L$0;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(3, access13800Var);
        }

        @Override // o.getBacktraceNote
        public /* synthetic */ Object invoke(setRipple<? super getStretch> setripple, Integer num, access13800<? super Unit> access13800Var) {
            return onWarmupCompleted(setripple, num.intValue(), access13800Var);
        }

        public final Object onWarmupCompleted(setRipple<? super getStretch> setripple, int i, access13800<? super Unit> access13800Var) {
            onNavigationEvent onnavigationevent = setBorderWidth.this.new onNavigationEvent(access13800Var);
            onnavigationevent.L$0 = setripple;
            onnavigationevent.I$0 = i;
            return onnavigationevent.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        
            if (r10.emit(r1, r9) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
        
            if (r1.emit(r10, r9) != r0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008b A[PHI: r1
          0x008b: PHI (r1v8 o.setRipple) = (r1v6 o.setRipple), (r1v7 o.setRipple), (r1v14 o.setRipple) binds: [B:25:0x006d, B:29:0x0089, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            setRipple setripple;
            long j;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setRipple setripple2 = (setRipple) this.L$0;
                if (this.I$0 <= 0) {
                    long j2 = setBorderWidth.this.onExtraCallback;
                    this.L$0 = setripple2;
                    this.label = 2;
                    if (formatMsgs.onWarmupCompleted(j2, this) != objOnExtraCallback) {
                        setripple = setripple2;
                        if (setBorderWidth.this.onExtraCallbackWithResult <= 0) {
                        }
                    }
                } else {
                    getStretch getstretch = getStretch.START;
                    this.label = 1;
                }
                return objOnExtraCallback;
            }
            if (i != 1) {
                if (i == 2) {
                    setripple = (setRipple) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    if (setBorderWidth.this.onExtraCallbackWithResult <= 0) {
                        getStretch getstretch2 = getStretch.STOP;
                        this.L$0 = setripple;
                        this.label = 3;
                        if (setripple.emit(getstretch2, this) != objOnExtraCallback) {
                            j = setBorderWidth.this.onExtraCallbackWithResult;
                            this.L$0 = setripple;
                            this.label = 4;
                            if (formatMsgs.onWarmupCompleted(j, this) != objOnExtraCallback) {
                            }
                        }
                    }
                    return objOnExtraCallback;
                }
                if (i == 3) {
                    setripple = (setRipple) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    j = setBorderWidth.this.onExtraCallbackWithResult;
                    this.L$0 = setripple;
                    this.label = 4;
                    if (formatMsgs.onWarmupCompleted(j, this) != objOnExtraCallback) {
                        getStretch getstretch3 = getStretch.STOP_AND_RESET_REPLAY_CACHE;
                        this.L$0 = null;
                        this.label = 5;
                    }
                    return objOnExtraCallback;
                }
                if (i == 4) {
                    setripple = (setRipple) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    getStretch getstretch32 = getStretch.STOP_AND_RESET_REPLAY_CACHE;
                    this.L$0 = null;
                    this.label = 5;
                } else if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.onNavigationEvent(obj);
            return Unit.INSTANCE;
        }
    }

    @Override // o.getTileModeY
    public IAnimation<getStretch> onExtraCallbackWithResult(@NotNull setRubIn<Integer> setrubin) {
        return ycxycx.onNavigationEvent(ycxycx.onExtraCallback(ycxycx.onNavigationEvent((IAnimation) setrubin, (getBacktraceNote) new onNavigationEvent(null)), (Function2) new onExtraCallbackWithResult(null)));
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<getStretch, access13800<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            onextracallbackwithresult.L$0 = obj;
            return onextracallbackwithresult;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getStretch getstretch, access13800<? super Boolean> access13800Var) {
            return ((onExtraCallbackWithResult) create(getstretch, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return access14000.onNavigationEvent(((getStretch) this.L$0) != getStretch.START);
        }
    }

    public String toString() {
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder(2);
        if (this.onExtraCallback > 0) {
            listCreateListBuilder.add("stopTimeout=" + this.onExtraCallback + "ms");
        }
        if (this.onExtraCallbackWithResult < LongCompanionObject.MAX_VALUE) {
            listCreateListBuilder.add("replayExpiration=" + this.onExtraCallbackWithResult + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder), null, null, null, 0, null, null, 63, null) + ')';
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof setBorderWidth)) {
            return false;
        }
        setBorderWidth setborderwidth = (setBorderWidth) obj;
        return this.onExtraCallback == setborderwidth.onExtraCallback && this.onExtraCallbackWithResult == setborderwidth.onExtraCallbackWithResult;
    }

    public int hashCode() {
        return (Long.hashCode(this.onExtraCallback) * 31) + Long.hashCode(this.onExtraCallbackWithResult);
    }
}
