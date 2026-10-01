package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setCornerRadiusDimen implements getTileModeY {

    static final class onNavigationEvent extends SuspendLambda implements Function2<setRipple<? super getStretch>, access13800<? super Unit>, Object> {
        final /* synthetic */ setRubIn<Integer> $subscriptionCount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(setRubIn<Integer> setrubin, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$subscriptionCount = setrubin;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setRipple<? super getStretch> setripple, access13800<? super Unit> access13800Var) {
            return ((onNavigationEvent) create(setripple, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$subscriptionCount, access13800Var);
            onnavigationevent.L$0 = obj;
            return onnavigationevent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setRipple setripple = (setRipple) this.L$0;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                setRubIn<Integer> setrubin = this.$subscriptionCount;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(booleanRef, setripple);
                this.label = 1;
                if (setrubin.collect(anonymousClass4, this) == objOnExtraCallback) {
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

        /* renamed from: o.setCornerRadiusDimen$onNavigationEvent$4, reason: invalid class name */
        static final class AnonymousClass4<T> implements setRipple {
            final /* synthetic */ setRipple<getStretch> onExtraCallback;
            final /* synthetic */ Ref.BooleanRef onExtraCallbackWithResult;

            /* renamed from: o.setCornerRadiusDimen$onNavigationEvent$4$onExtraCallbackWithResult */
            static final class onExtraCallbackWithResult extends ContinuationImpl {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ AnonymousClass4<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                onExtraCallbackWithResult(AnonymousClass4<? super T> anonymousClass4, access13800<? super onExtraCallbackWithResult> access13800Var) {
                    super(access13800Var);
                    this.this$0 = anonymousClass4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.IAuthTabCallback(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(Ref.BooleanRef booleanRef, setRipple<? super getStretch> setripple) {
                this.onExtraCallbackWithResult = booleanRef;
                this.onExtraCallback = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object IAuthTabCallback(int i, access13800<? super Unit> access13800Var) {
                onExtraCallbackWithResult onextracallbackwithresult;
                if (access13800Var instanceof onExtraCallbackWithResult) {
                    onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
                    int i2 = onextracallbackwithresult.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        onextracallbackwithresult.label = i2 - 2147483648;
                    } else {
                        onextracallbackwithresult = new onExtraCallbackWithResult(this, access13800Var);
                    }
                }
                Object obj = onextracallbackwithresult.result;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i3 = onextracallbackwithresult.label;
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (i > 0) {
                        Ref.BooleanRef booleanRef = this.onExtraCallbackWithResult;
                        if (!booleanRef.element) {
                            booleanRef.element = true;
                            setRipple<getStretch> setripple = this.onExtraCallback;
                            getStretch getstretch = getStretch.START;
                            onextracallbackwithresult.label = 1;
                            if (setripple.emit(getstretch, onextracallbackwithresult) == objOnExtraCallback) {
                                return objOnExtraCallback;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }

            @Override // o.setRipple
            public /* synthetic */ Object emit(Object obj, access13800 access13800Var) {
                return IAuthTabCallback(((Number) obj).intValue(), access13800Var);
            }
        }
    }

    @Override // o.getTileModeY
    public IAnimation<getStretch> onExtraCallbackWithResult(@NotNull setRubIn<Integer> setrubin) {
        return ycxycx.onExtraCallbackWithResult(new onNavigationEvent(setrubin, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
