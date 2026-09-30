package o;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.lt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class syadj {

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Function0<T[]> $arrayFactory;
        final /* synthetic */ IAnimation<T>[] $flows;
        final /* synthetic */ setRipple<R> $this_combineInternal;
        final /* synthetic */ getBacktraceNote<setRipple<? super R>, T[], access13800<? super Unit>, Object> $transform;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(IAnimation<? extends T>[] iAnimationArr, Function0<T[]> function0, getBacktraceNote<? super setRipple<? super R>, ? super T[], ? super access13800<? super Unit>, ? extends Object> getbacktracenote, setRipple<? super R> setripple, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$flows = iAnimationArr;
            this.$arrayFactory = function0;
            this.$transform = getbacktracenote;
            this.$this_combineInternal = setripple;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((onExtraCallbackWithResult) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, access13800Var);
            onextracallbackwithresult.L$0 = obj;
            return onextracallbackwithresult;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
        
            if (r9.invoke(r10, r15, r23) == r1) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x013a, code lost:
        
            if (r9.invoke(r10, r14, r23) == r1) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0143, code lost:
        
            r21 = r2;
            r13 = r5;
            r2 = r7;
            r7 = r8;
         */
        /* JADX WARN: Path cross not found for [B:43:0x013d, B:35:0x00f2], limit reached: 49 */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[LOOP:0: B:27:0x00cb->B:50:?, LOOP_START, PHI: r6 r9
          0x00cb: PHI (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:24:0x00c6, B:50:?] A[DONT_GENERATE, DONT_INLINE]
          0x00cb: PHI (r9v4 kotlin.collections.IndexedValue) = (r9v3 kotlin.collections.IndexedValue), (r9v17 kotlin.collections.IndexedValue) binds: [B:24:0x00c6, B:50:?] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object[] objArr;
            int i;
            byte[] bArr;
            int i2;
            nLockFileSegment nlockfilesegment;
            Object[] objArr2;
            Object objIAuthTabCallback;
            nLockFileSegment nlockfilesegment2;
            byte[] bArr2;
            int i3;
            IndexedValue indexedValue;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            int i5 = 2;
            int i6 = 1;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                int length = this.$flows.length;
                if (length == 0) {
                    return Unit.INSTANCE;
                }
                objArr = new Object[length];
                ArraysKt___ArraysJvmKt.fill$default(objArr, syazb.onWarmupCompleted, 0, 0, 6, (Object) null);
                nLockFileSegment nlockfilesegmentOnExtraCallbackWithResult = zb.onExtraCallbackWithResult(length, null, null, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                i = 0;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7;
                    onLoadStarted.onExtraCallback(findresandmsg, null, null, new AnonymousClass2(this.$flows, i8, atomicInteger, nlockfilesegmentOnExtraCallbackWithResult, null), 3, null);
                    i7 = i8 + 1;
                    atomicInteger = atomicInteger;
                }
                bArr = new byte[length];
                i2 = length;
                nlockfilesegment = nlockfilesegmentOnExtraCallbackWithResult;
                byte b = (byte) (i + 1);
                this.L$0 = objArr;
                this.L$1 = nlockfilesegment;
                this.L$2 = bArr;
                this.I$0 = i2;
                this.I$1 = b;
                this.label = i6;
                objIAuthTabCallback = nlockfilesegment.IAuthTabCallback((access13800) this);
                if (objIAuthTabCallback != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            if (i4 != 1) {
                if (i4 != 2 && i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = this.I$1;
                i2 = this.I$0;
                byte[] bArr3 = (byte[]) this.L$2;
                nLockFileSegment nlockfilesegment3 = (nLockFileSegment) this.L$1;
                Object[] objArr3 = (Object[]) this.L$0;
                ResultKt.onNavigationEvent(obj);
                i = i9;
                bArr = bArr3;
                nlockfilesegment = nlockfilesegment3;
                objArr = objArr3;
                i5 = 2;
                i6 = 1;
                byte b2 = (byte) (i + 1);
                this.L$0 = objArr;
                this.L$1 = nlockfilesegment;
                this.L$2 = bArr;
                this.I$0 = i2;
                this.I$1 = b2;
                this.label = i6;
                objIAuthTabCallback = nlockfilesegment.IAuthTabCallback((access13800) this);
                if (objIAuthTabCallback != objOnExtraCallback) {
                    objArr2 = objArr;
                    nLockFileSegment nlockfilesegment4 = nlockfilesegment;
                    bArr2 = bArr;
                    i3 = b2;
                    nlockfilesegment2 = nlockfilesegment4;
                    indexedValue = (IndexedValue) lud.onExtraCallbackWithResult(objIAuthTabCallback);
                    if (indexedValue == null) {
                        do {
                            int iOnNavigationEvent = indexedValue.onNavigationEvent();
                            Object obj2 = objArr2[iOnNavigationEvent];
                            objArr2[iOnNavigationEvent] = indexedValue.onExtraCallback();
                            if (obj2 == syazb.onWarmupCompleted) {
                                i2--;
                            }
                            if (bArr2[iOnNavigationEvent] == i3) {
                                break;
                            }
                            bArr2[iOnNavigationEvent] = (byte) i3;
                            indexedValue = (IndexedValue) lud.onExtraCallbackWithResult(nlockfilesegment2.onMinimized());
                        } while (indexedValue != null);
                        if (i2 == 0) {
                            Object[] objArr4 = (Object[]) this.$arrayFactory.invoke();
                            if (objArr4 == null) {
                                getBacktraceNote<setRipple<? super R>, T[], access13800<? super Unit>, Object> getbacktracenote = this.$transform;
                                Object obj3 = this.$this_combineInternal;
                                this.L$0 = objArr2;
                                this.L$1 = nlockfilesegment2;
                                this.L$2 = bArr2;
                                this.I$0 = i2;
                                this.I$1 = i3;
                                this.label = i5;
                            } else {
                                Object[] objArr5 = objArr2;
                                ArraysKt___ArraysJvmKt.copyInto$default(objArr2, objArr4, 0, 0, 0, 14, (Object) null);
                                getBacktraceNote<setRipple<? super R>, T[], access13800<? super Unit>, Object> getbacktracenote2 = this.$transform;
                                Object obj4 = this.$this_combineInternal;
                                this.L$0 = objArr5;
                                this.L$1 = nlockfilesegment2;
                                this.L$2 = bArr2;
                                this.I$0 = i2;
                                this.I$1 = i3;
                                this.label = 3;
                            }
                        }
                        i = i3;
                        objArr = objArr2;
                        bArr = bArr2;
                        nlockfilesegment = nlockfilesegment2;
                        i5 = 2;
                        i6 = 1;
                        byte b22 = (byte) (i + 1);
                        this.L$0 = objArr;
                        this.L$1 = nlockfilesegment;
                        this.L$2 = bArr;
                        this.I$0 = i2;
                        this.I$1 = b22;
                        this.label = i6;
                        objIAuthTabCallback = nlockfilesegment.IAuthTabCallback((access13800) this);
                        if (objIAuthTabCallback != objOnExtraCallback) {
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
                return objOnExtraCallback;
            }
            i3 = this.I$1;
            i2 = this.I$0;
            bArr2 = (byte[]) this.L$2;
            nlockfilesegment2 = (nLockFileSegment) this.L$1;
            Object[] objArr6 = (Object[]) this.L$0;
            ResultKt.onNavigationEvent(obj);
            objIAuthTabCallback = ((lud) obj).onExtraCallback();
            objArr2 = objArr6;
            indexedValue = (IndexedValue) lud.onExtraCallbackWithResult(objIAuthTabCallback);
            if (indexedValue == null) {
            }
        }

        /* renamed from: o.syadj$onExtraCallbackWithResult$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            final /* synthetic */ IAnimation<T>[] $flows;
            final /* synthetic */ int $i;
            final /* synthetic */ AtomicInteger $nonClosed;
            final /* synthetic */ nLockFileSegment<IndexedValue<Object>> $resultChannel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(IAnimation<? extends T>[] iAnimationArr, int i, AtomicInteger atomicInteger, nLockFileSegment<IndexedValue<Object>> nlockfilesegment, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.$flows = iAnimationArr;
                this.$i = i;
                this.$nonClosed = atomicInteger;
                this.$resultChannel = nlockfilesegment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new AnonymousClass2(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, access13800Var);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return ((AnonymousClass2) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        IAnimation[] iAnimationArr = this.$flows;
                        int i2 = this.$i;
                        IAnimation iAnimation = iAnimationArr[i2];
                        C00432 c00432 = new C00432(this.$resultChannel, i2);
                        this.label = 1;
                        if (iAnimation.collect(c00432, this) == objOnExtraCallback) {
                            return objOnExtraCallback;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        lt.onWarmupCompleted.onExtraCallbackWithResult(this.$resultChannel, null, 1, null);
                    }
                    return Unit.INSTANCE;
                } finally {
                    if (this.$nonClosed.decrementAndGet() == 0) {
                        lt.onWarmupCompleted.onExtraCallbackWithResult(this.$resultChannel, null, 1, null);
                    }
                }
            }

            /* renamed from: o.syadj$onExtraCallbackWithResult$2$2, reason: invalid class name and collision with other inner class name */
            static final class C00432<T> implements setRipple {
                final /* synthetic */ nLockFileSegment<IndexedValue<Object>> onNavigationEvent;
                final /* synthetic */ int onWarmupCompleted;

                /* renamed from: o.syadj$onExtraCallbackWithResult$2$2$onNavigationEvent */
                static final class onNavigationEvent extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C00432<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    onNavigationEvent(C00432<? super T> c00432, access13800<? super onNavigationEvent> access13800Var) {
                        super(access13800Var);
                        this.this$0 = c00432;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                C00432(nLockFileSegment<IndexedValue<Object>> nlockfilesegment, int i) {
                    this.onNavigationEvent = nlockfilesegment;
                    this.onWarmupCompleted = i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
                
                    if (o.b10.IAuthTabCallback(r0) == r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o.setRipple
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(T t, access13800<? super Unit> access13800Var) {
                    onNavigationEvent onnavigationevent;
                    if (access13800Var instanceof onNavigationEvent) {
                        onnavigationevent = (onNavigationEvent) access13800Var;
                        int i = onnavigationevent.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            onnavigationevent.label = i - 2147483648;
                        } else {
                            onnavigationevent = new onNavigationEvent(this, access13800Var);
                        }
                    }
                    Object obj = onnavigationevent.result;
                    Object objOnExtraCallback = access14100.onExtraCallback();
                    int i2 = onnavigationevent.label;
                    if (i2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        nLockFileSegment<IndexedValue<Object>> nlockfilesegment = this.onNavigationEvent;
                        IndexedValue<Object> indexedValue = new IndexedValue<>(this.onWarmupCompleted, t);
                        onnavigationevent.label = 1;
                        if (nlockfilesegment.onExtraCallback(indexedValue, onnavigationevent) != objOnExtraCallback) {
                        }
                        return objOnExtraCallback;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.onNavigationEvent(obj);
                    onnavigationevent.label = 2;
                }
            }
        }
    }

    public static final <R, T> Object onWarmupCompleted(@NotNull setRipple<? super R> setripple, @NotNull IAnimation<? extends T>[] iAnimationArr, @NotNull Function0<T[]> function0, @NotNull getBacktraceNote<? super setRipple<? super R>, ? super T[], ? super access13800<? super Unit>, ? extends Object> getbacktracenote, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallback = syaul.onExtraCallback(new onExtraCallbackWithResult(iAnimationArr, function0, getbacktracenote, setripple, null), access13800Var);
        return objOnExtraCallback == access14100.onExtraCallback() ? objOnExtraCallback : Unit.INSTANCE;
    }
}
