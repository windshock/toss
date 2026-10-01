package ua.naiksoftware.stomp;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxConvertKt;
import o.IAnimation;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access15400;
import o.findResAndMsg;
import o.getByteBuffer;
import o.getTileModeX;
import o.getTileModeY;
import o.maybeRemoveAttachStateListener;
import o.onLoadStarted;
import o.setCommandLine;
import o.setLogBuffers;
import o.setRevision;
import o.setRipple;
import o.setWrite;
import o.ycxycx;
import ua.naiksoftware.stomp.dto.StompMessage;
import ua.naiksoftware.stomp.dto.StompMessageParser;
import ua.naiksoftware.stomp.exception.StompSocketBrokenException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class StompClientImpl$connect$2$1$3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ maybeRemoveAttachStateListener<Boolean> $cont;
    final /* synthetic */ AtomicBoolean $resumed;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StompClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StompClientImpl$connect$2$1$3(StompClientImpl stompClientImpl, AtomicBoolean atomicBoolean, maybeRemoveAttachStateListener<? super Boolean> mayberemoveattachstatelistener, access13800<? super StompClientImpl$connect$2$1$3> access13800Var) {
        super(2, access13800Var);
        this.this$0 = stompClientImpl;
        this.$resumed = atomicBoolean;
        this.$cont = mayberemoveattachstatelistener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        StompClientImpl$connect$2$1$3 stompClientImpl$connect$2$1$3 = new StompClientImpl$connect$2$1$3(this.this$0, this.$resumed, this.$cont, access13800Var);
        stompClientImpl$connect$2$1$3.L$0 = obj;
        return stompClientImpl$connect$2$1$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return ((StompClientImpl$connect$2$1$3) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
        if (this.label == 0) {
            ResultKt.onNavigationEvent(obj);
            getByteBuffer<String> getbytebufferMessages = this.this$0.connectionProvider.messages();
            Intrinsics.checkNotNullExpressionValue(getbytebufferMessages, "");
            final IAnimation iAnimationIAuthTabCallback = RxConvertKt.IAuthTabCallback(getbytebufferMessages);
            final IAnimation<StompMessage> iAnimation = new IAnimation<StompMessage>() { // from class: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$3$invokeSuspend$$inlined$map$1
                @Override // o.IAnimation
                public Object collect(setRipple<? super StompMessage> setripple, access13800 access13800Var) {
                    Object objCollect = iAnimationIAuthTabCallback.collect(new AnonymousClass2(setripple), access13800Var);
                    return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
                }

                /* renamed from: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements setRipple {
                    final /* synthetic */ setRipple $this_unsafeFlow;

                    /* renamed from: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(access13800 access13800Var) {
                            super(access13800Var);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(setRipple setripple) {
                        this.$this_unsafeFlow = setripple;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // o.setRipple
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, access13800 access13800Var) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (access13800Var instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) access13800Var;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - 2147483648;
                            } else {
                                anonymousClass1 = new AnonymousClass1(access13800Var);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object objOnExtraCallback = access14100.onExtraCallback();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.onNavigationEvent(obj2);
                            setRipple setripple = this.$this_unsafeFlow;
                            StompMessage stompMessageFrom = StompMessageParser.INSTANCE.from((String) obj);
                            anonymousClass1.L$0 = access15400.onNavigationEvent(obj);
                            anonymousClass1.L$1 = access15400.onNavigationEvent(anonymousClass1);
                            anonymousClass1.L$2 = access15400.onNavigationEvent(obj);
                            anonymousClass1.L$3 = access15400.onNavigationEvent(setripple);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (setripple.emit(stompMessageFrom, anonymousClass1) == objOnExtraCallback) {
                                return objOnExtraCallback;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            final StompClientImpl stompClientImpl = this.this$0;
            getTileModeX gettilemodexOnExtraCallback = ycxycx.onExtraCallback(new IAnimation<StompMessage>() { // from class: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$3$invokeSuspend$$inlined$filter$1
                @Override // o.IAnimation
                public Object collect(setRipple<? super StompMessage> setripple, access13800 access13800Var) {
                    Object objCollect = iAnimation.collect(new AnonymousClass2(setripple, stompClientImpl), access13800Var);
                    return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
                }

                /* renamed from: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements setRipple {
                    final /* synthetic */ setRipple $this_unsafeFlow;
                    final /* synthetic */ StompClientImpl this$0;

                    /* renamed from: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(access13800 access13800Var) {
                            super(access13800Var);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(setRipple setripple, StompClientImpl stompClientImpl) {
                        this.$this_unsafeFlow = setripple;
                        this.this$0 = stompClientImpl;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // o.setRipple
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, access13800 access13800Var) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (access13800Var instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) access13800Var;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - 2147483648;
                            } else {
                                anonymousClass1 = new AnonymousClass1(access13800Var);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object objOnExtraCallback = access14100.onExtraCallback();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.onNavigationEvent(obj2);
                            setRipple setripple = this.$this_unsafeFlow;
                            StompMessage stompMessage = (StompMessage) obj;
                            HeartBeatTask heartBeatTask = this.this$0.heartBeatTask;
                            if (heartBeatTask != null) {
                                boolean zConsumeHeartBeat = heartBeatTask.consumeHeartBeat(stompMessage);
                                if (!zConsumeHeartBeat) {
                                    this.this$0.sendToFlipper("receive", "HEARTBEAT", "<<< pong");
                                } else if (stompMessage != null) {
                                    this.this$0.sendToFlipper("receive", stompMessage);
                                }
                                if (zConsumeHeartBeat) {
                                    anonymousClass1.L$0 = access15400.onNavigationEvent(obj);
                                    anonymousClass1.L$1 = access15400.onNavigationEvent(anonymousClass1);
                                    anonymousClass1.L$2 = access15400.onNavigationEvent(obj);
                                    anonymousClass1.L$3 = access15400.onNavigationEvent(setripple);
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    if (setripple.emit(obj, anonymousClass1) == objOnExtraCallback) {
                                        return objOnExtraCallback;
                                    }
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, findresandmsg, getTileModeY.onWarmupCompleted.onExtraCallback(getTileModeY.Companion, 0L, 0L, 3, null), 1);
            onLoadStarted.onExtraCallback(findresandmsg, null, null, new AnonymousClass1(gettilemodexOnExtraCallback, this.this$0, null), 3, null);
            onLoadStarted.onExtraCallback(findresandmsg, null, null, new AnonymousClass2(gettilemodexOnExtraCallback, this.$resumed, this.$cont, this.this$0, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ getTileModeX<StompMessage> $messageFlow;
        int label;
        final /* synthetic */ StompClientImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(getTileModeX<? extends StompMessage> gettilemodex, StompClientImpl stompClientImpl, access13800<? super AnonymousClass1> access13800Var) {
            super(2, access13800Var);
            this.$messageFlow = gettilemodex;
            this.this$0 = stompClientImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new AnonymousClass1(this.$messageFlow, this.this$0, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((AnonymousClass1) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                getTileModeX<StompMessage> gettilemodex = this.$messageFlow;
                final StompClientImpl stompClientImpl = this.this$0;
                setRipple<? super StompMessage> setripple = new setRipple() { // from class: ua.naiksoftware.stomp.StompClientImpl.connect.2.1.3.1.1
                    @Override // o.setRipple
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                        return emit((StompMessage) obj2, (access13800<? super Unit>) access13800Var);
                    }

                    public final Object emit(StompMessage stompMessage, access13800<? super Unit> access13800Var) {
                        Object objEmit = stompClientImpl._messageStream.emit(stompMessage, access13800Var);
                        return objEmit == access14100.onExtraCallback() ? objEmit : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (gettilemodex.collect(setripple, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            throw new setWrite();
        }
    }

    /* renamed from: ua.naiksoftware.stomp.StompClientImpl$connect$2$1$3$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ maybeRemoveAttachStateListener<Boolean> $cont;
        final /* synthetic */ getTileModeX<StompMessage> $messageFlow;
        final /* synthetic */ AtomicBoolean $resumed;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        final /* synthetic */ StompClientImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(getTileModeX<? extends StompMessage> gettilemodex, AtomicBoolean atomicBoolean, maybeRemoveAttachStateListener<? super Boolean> mayberemoveattachstatelistener, StompClientImpl stompClientImpl, access13800<? super AnonymousClass2> access13800Var) {
            super(2, access13800Var);
            this.$messageFlow = gettilemodex;
            this.$resumed = atomicBoolean;
            this.$cont = mayberemoveattachstatelistener;
            this.this$0 = stompClientImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new AnonymousClass2(this.$messageFlow, this.$resumed, this.$cont, this.this$0, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((AnonymousClass2) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM31constructorimpl;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getTileModeX<StompMessage> gettilemodex = this.$messageFlow;
                    Result.Companion companion = Result.Companion;
                    setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                    IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(gettilemodex, setCommandLine.onWarmupCompleted(3000, setRevision.MILLISECONDS));
                    StompClientImpl$connect$2$1$3$2$1$1 stompClientImpl$connect$2$1$3$2$1$1 = new StompClientImpl$connect$2$1$3$2$1$1(null);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = ycxycx.onExtraCallbackWithResult(iAnimationOnNavigationEvent, stompClientImpl$connect$2$1$3$2$1$1, this);
                    if (obj == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                objM31constructorimpl = Result.m31constructorimpl(obj);
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
            }
            AtomicBoolean atomicBoolean = this.$resumed;
            maybeRemoveAttachStateListener<Boolean> mayberemoveattachstatelistener = this.$cont;
            Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl != null && atomicBoolean.compareAndSet(false, true)) {
                Result.Companion companion4 = Result.Companion;
                mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(new StompSocketBrokenException("Failed to connect " + thM32exceptionOrNullimpl))));
            }
            AtomicBoolean atomicBoolean2 = this.$resumed;
            StompClientImpl stompClientImpl = this.this$0;
            maybeRemoveAttachStateListener<Boolean> mayberemoveattachstatelistener2 = this.$cont;
            if (Result.onNavigationEvent(objM31constructorimpl)) {
                if (atomicBoolean2.compareAndSet(false, true)) {
                    stompClientImpl._isConnected.onNavigationEvent(access14000.onNavigationEvent(true));
                    Result.Companion companion5 = Result.Companion;
                    mayberemoveattachstatelistener2.resumeWith(Result.m31constructorimpl(access14000.onNavigationEvent(true)));
                }
            }
            return Unit.INSTANCE;
        }
    }
}
