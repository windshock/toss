package o;

import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.rx2.RxConvertKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1iSDK {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final AFh1iSDK onExtraCallback = new AFh1iSDK();
    private static final IAnimation<Boolean> onExtraCallbackWithResult = ycxycx.onNavigationEvent(new IAuthTabCallback(null));
    public static final int IAuthTabCallback = 8;

    private AFh1iSDK() {
    }

    static {
        Object obj = null;
        int i = onWarmupCompleted + 25;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final IAnimation<Boolean> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 91;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        IAnimation<Boolean> iAnimation = onExtraCallbackWithResult;
        int i4 = i2 + 19;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return iAnimation;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<ok<? super Boolean>, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(access13800Var);
            iAuthTabCallback.L$0 = obj;
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(ok<? super Boolean> okVar, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(okVar, access13800Var);
            int i4 = IAuthTabCallback + 111;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 16 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(ok<? super Boolean> okVar, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) create(okVar, access13800Var);
            if (i3 != 0) {
                iAuthTabCallback.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallback.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.AFh1iSDK$IAuthTabCallback$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements getBacktraceNote<Boolean, TextRoundCornerProgressBar, access13800<? super Object>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ ok<Boolean> $$this$callbackFlow;
            final /* synthetic */ Ref.ObjectRef<TextRoundCornerProgressBar> $lastEvent;
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            Object L$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(Ref.ObjectRef<TextRoundCornerProgressBar> objectRef, ok<? super Boolean> okVar, access13800<? super AnonymousClass3> access13800Var) {
                super(3, access13800Var);
                this.$lastEvent = objectRef;
                this.$$this$callbackFlow = okVar;
            }

            @Override // o.getBacktraceNote
            public /* synthetic */ Object invoke(Boolean bool, TextRoundCornerProgressBar textRoundCornerProgressBar, access13800<? super Object> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i2 % 128;
                Boolean bool2 = bool;
                TextRoundCornerProgressBar textRoundCornerProgressBar2 = textRoundCornerProgressBar;
                if (i2 % 2 == 0) {
                    return onNavigationEvent(bool2, textRoundCornerProgressBar2, access13800Var);
                }
                onNavigationEvent(bool2, textRoundCornerProgressBar2, access13800Var);
                throw null;
            }

            public final Object onNavigationEvent(Boolean bool, TextRoundCornerProgressBar textRoundCornerProgressBar, access13800<Object> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$lastEvent, this.$$this$callbackFlow, access13800Var);
                anonymousClass3.L$0 = bool;
                anonymousClass3.L$1 = textRoundCornerProgressBar;
                Object objInvokeSuspend = anonymousClass3.invokeSuspend(Unit.INSTANCE);
                int i2 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return objInvokeSuspend;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, o.TextRoundCornerProgressBar] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objIAuthTabCallback;
                int i = 2 % 2;
                Boolean bool = (Boolean) this.L$0;
                ?? r2 = (TextRoundCornerProgressBar) this.L$1;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (!(r2 instanceof RoundCornerTextView)) {
                        if (!(r2 instanceof RoundCornerTextViewOnSizeChangedListener)) {
                            ok<Boolean> okVar = this.$$this$callbackFlow;
                            Intrinsics.checkNotNull(bool);
                            return lud.onExtraCallback(okVar.IAuthTabCallback(bool));
                        }
                        int i3 = onExtraCallbackWithResult + 15;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        this.$$this$callbackFlow.IAuthTabCallback(access14000.onNavigationEvent(false));
                        this.$lastEvent.element = r2;
                        return Unit.INSTANCE;
                    }
                    int i5 = onExtraCallbackWithResult + 17;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        boolean z = this.$lastEvent.element instanceof RoundCornerTextView;
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    RoundCornerTextView roundCornerTextView = (TextRoundCornerProgressBar) this.$lastEvent.element;
                    if (!(roundCornerTextView instanceof RoundCornerTextView)) {
                        if (!(!(roundCornerTextView instanceof RoundCornerTextViewOnSizeChangedListener))) {
                            int i6 = IAuthTabCallback + 59;
                            onExtraCallbackWithResult = i6 % 128;
                            int i7 = i6 % 2;
                            lud.onExtraCallback(this.$$this$callbackFlow.IAuthTabCallback(access14000.onNavigationEvent(true)));
                        } else {
                            Unit unit = Unit.INSTANCE;
                        }
                        this.$lastEvent.element = r2;
                        return Unit.INSTANCE;
                    }
                    if (Intrinsics.areEqual(roundCornerTextView.onExtraCallbackWithResult(), ((RoundCornerTextView) r2).onExtraCallbackWithResult())) {
                        objIAuthTabCallback = this.$$this$callbackFlow.IAuthTabCallback(access14000.onNavigationEvent(true));
                        lud.onExtraCallback(objIAuthTabCallback);
                        this.$lastEvent.element = r2;
                        return Unit.INSTANCE;
                    }
                    int i8 = IAuthTabCallback + 123;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    this.$$this$callbackFlow.IAuthTabCallback(access14000.onNavigationEvent(false));
                    this.L$0 = access15400.onNavigationEvent(bool);
                    this.L$1 = r2;
                    this.L$2 = access15400.onNavigationEvent(roundCornerTextView);
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(3000L, this) == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                objIAuthTabCallback = this.$$this$callbackFlow.IAuthTabCallback(access14000.onNavigationEvent(true));
                lud.onExtraCallback(objIAuthTabCallback);
                this.$lastEvent.element = r2;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00fa, code lost:
        
            if (o.jw.IAuthTabCallback(r2, null, r17, 1, null) == r4) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            IAnimation iAnimationIAuthTabCallback;
            IAnimation iAnimationIAuthTabCallback2;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                access14100.onExtraCallback();
                obj2.hashCode();
                throw null;
            }
            ok okVar = (ok) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                objectRef = new Ref.ObjectRef();
                onTextViewSizeChanged ontextviewsizechanged = onTextViewSizeChanged.onExtraCallbackWithResult;
                int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
                getByteBuffer getbytebufferOnExtraCallbackWithResult = ((getByteBuffer) onTextViewSizeChanged.IAuthTabCallback(iOnExtraCallback, 773290631, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{ontextviewsizechanged, false, 1, null}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -773290631)).onExtraCallbackWithResult(clearTid.onExtraCallback());
                Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallbackWithResult, "");
                iAnimationIAuthTabCallback = RxConvertKt.IAuthTabCallback(getbytebufferOnExtraCallbackWithResult);
                getByteBuffer getbytebufferOnExtraCallbackWithResult2 = ontextviewsizechanged.onNavigationEvent().onExtraCallbackWithResult(clearTid.onExtraCallback());
                Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallbackWithResult2, "");
                iAnimationIAuthTabCallback2 = RxConvertKt.IAuthTabCallback(getbytebufferOnExtraCallbackWithResult2);
                IAnimation iAnimationOnWarmupCompleted = ycxycx.onWarmupCompleted(iAnimationIAuthTabCallback, iAnimationIAuthTabCallback2, new AnonymousClass3(objectRef, okVar, null));
                Object obj3 = new setRipple() { // from class: o.AFh1iSDK.IAuthTabCallback.1
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    static {
                        int i4 = IAuthTabCallback + 123;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 != 0) {
                            return;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }

                    @Override // o.setRipple
                    public final Object emit(Object obj4, access13800<? super Unit> access13800Var) {
                        int i4 = 2 % 2;
                        int i5 = onNavigationEvent + 115;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unit = Unit.INSTANCE;
                        if (i6 != 0) {
                            return unit;
                        }
                        throw null;
                    }
                };
                this.L$0 = okVar;
                this.L$1 = access15400.onNavigationEvent(objectRef);
                this.L$2 = access15400.onNavigationEvent(iAnimationIAuthTabCallback);
                this.L$3 = access15400.onNavigationEvent(iAnimationIAuthTabCallback2);
                this.label = 1;
                if (iAnimationOnWarmupCompleted.collect(obj3, this) != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = IAuthTabCallback + 89;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return Unit.INSTANCE;
            }
            iAnimationIAuthTabCallback2 = (IAnimation) this.L$3;
            iAnimationIAuthTabCallback = (IAnimation) this.L$2;
            objectRef = (Ref.ObjectRef) this.L$1;
            ResultKt.onNavigationEvent(obj);
            int i6 = IAuthTabCallback + 7;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            this.L$0 = access15400.onNavigationEvent(okVar);
            this.L$1 = access15400.onNavigationEvent(objectRef);
            this.L$2 = access15400.onNavigationEvent(iAnimationIAuthTabCallback);
            this.L$3 = access15400.onNavigationEvent(iAnimationIAuthTabCallback2);
            this.label = 2;
        }
    }
}
