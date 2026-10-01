package o;

import androidx.lifecycle.LifecycleEventObserver;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.getErrorView;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getErrorView {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_RESUME.ordinal()] = 3;
                int i = onExtraCallback + 25;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_PAUSE.ordinal()] = 4;
                int i4 = onExtraCallback + 55;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP.ordinal()] = 5;
                int i6 = onExtraCallback + 49;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<ok<? super TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult>, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ TextFieldKeyInputExternalSyntheticLambda9 $this_eventFlow;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$this_eventFlow = textFieldKeyInputExternalSyntheticLambda9;
        }

        public static /* synthetic */ void onExtraCallbackWithResult(ok okVar, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(okVar, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
            int i4 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
        }

        public static /* synthetic */ Unit onNavigationEvent(TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9, LifecycleEventObserver lifecycleEventObserver) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(textFieldKeyInputExternalSyntheticLambda9, lifecycleEventObserver);
                throw null;
            }
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldKeyInputExternalSyntheticLambda9, lifecycleEventObserver);
            int i3 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return unitOnExtraCallbackWithResult;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$this_eventFlow, access13800Var);
            onextracallbackwithresult.L$0 = obj;
            int i2 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            ok<? super TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult> okVar = (ok) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallback(okVar, access13800Var);
            }
            Object objOnExtraCallback = onExtraCallback(okVar, access13800Var);
            int i3 = 63 / 0;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(ok<? super TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult> okVar, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static final void onExtraCallback(ok okVar, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            okVar.IAuthTabCallback(onextracallbackwithresult);
            int i4 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 99 / 0;
            }
        }

        private static final Unit onExtraCallbackWithResult(TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9, LifecycleEventObserver lifecycleEventObserver) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            textFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult(lifecycleEventObserver);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            final ok okVar = (ok) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback + 35;
                int i6 = i5 % 128;
                onExtraCallbackWithResult = i6;
                int i7 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 7;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: im.toss.extensions.LifecyclesKt$eventFlow$1$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
                        int i10 = 2 % 2;
                        int i11 = onWarmupCompleted + 7;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                        getErrorView.onExtraCallbackWithResult.onExtraCallbackWithResult(okVar, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
                        if (i12 == 0) {
                            throw null;
                        }
                    }
                };
                this.$this_eventFlow.IAuthTabCallback(lifecycleEventObserver);
                final TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9 = this.$this_eventFlow;
                Function0 function0 = new Function0() { // from class: im.toss.extensions.LifecyclesKt$eventFlow$1$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i10 = 2 % 2;
                        int i11 = IAuthTabCallback + 43;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda92 = textFieldKeyInputExternalSyntheticLambda9;
                        if (i12 == 0) {
                            return getErrorView.onExtraCallbackWithResult.onNavigationEvent(textFieldKeyInputExternalSyntheticLambda92, lifecycleEventObserver);
                        }
                        getErrorView.onExtraCallbackWithResult.onNavigationEvent(textFieldKeyInputExternalSyntheticLambda92, lifecycleEventObserver);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                this.L$0 = access15400.onNavigationEvent(okVar);
                this.L$1 = access15400.onNavigationEvent(lifecycleEventObserver);
                this.label = 1;
                if (jw.onWarmupCompleted(okVar, function0, this) == objOnWarmupCompleted) {
                    int i10 = onExtraCallbackWithResult + 125;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 40 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final IAnimation<TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult> onExtraCallback(@NotNull TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldKeyInputExternalSyntheticLambda9, "");
        IAnimation<TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult> iAnimationIAuthTabCallback = ycxycx.IAuthTabCallback(ycxycx.onNavigationEvent(new onExtraCallbackWithResult(textFieldKeyInputExternalSyntheticLambda9, null)), putChannelInfo.onExtraCallback().onExtraCallback());
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 69 / 0;
        }
        return iAnimationIAuthTabCallback;
    }

    public static final IAnimation<TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback> onWarmupCompleted(@NotNull TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldKeyInputExternalSyntheticLambda9, "");
        IAnimation<TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback> iAnimationIAuthTabCallback = ycxycx.IAuthTabCallback(ycxycx.onNavigationEvent(new onExtraCallback(onExtraCallback(textFieldKeyInputExternalSyntheticLambda9), textFieldKeyInputExternalSyntheticLambda9)), putChannelInfo.onExtraCallback().onExtraCallback());
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return iAnimationIAuthTabCallback;
    }

    public static final class onExtraCallback implements IAnimation<TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ IAnimation onExtraCallbackWithResult;
        final /* synthetic */ TextFieldKeyInputExternalSyntheticLambda9 onWarmupCompleted;

        /* renamed from: o.getErrorView$onExtraCallback$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements setRipple {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ TextFieldKeyInputExternalSyntheticLambda9 IAuthTabCallback;
            final /* synthetic */ setRipple onWarmupCompleted;

            /* renamed from: o.getErrorView$onExtraCallback$2$4, reason: invalid class name */
            public static final class AnonymousClass4 extends ContinuationImpl {
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass4(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 21;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                    if (i3 == 0) {
                        anonymousClass2.emit(null, this);
                        throw null;
                    }
                    Object objEmit = anonymousClass2.emit(null, this);
                    int i4 = onExtraCallbackWithResult + 93;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objEmit;
                    }
                    throw null;
                }
            }

            public AnonymousClass2(setRipple setripple, TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9) {
                this.onWarmupCompleted = setripple;
                this.IAuthTabCallback = textFieldKeyInputExternalSyntheticLambda9;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                AnonymousClass4 anonymousClass4;
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallbackIAuthTabCallback;
                int i = 2 % 2;
                if (!(access13800Var instanceof AnonymousClass4)) {
                    anonymousClass4 = new AnonymousClass4(access13800Var);
                } else {
                    int i2 = onExtraCallbackWithResult + 125;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    anonymousClass4 = (AnonymousClass4) access13800Var;
                    int i4 = anonymousClass4.label;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        anonymousClass4.label = i4 - 2147483648;
                    }
                }
                Object obj2 = anonymousClass4.result;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i5 = anonymousClass4.label;
                if (i5 != 0) {
                    int i6 = onExtraCallbackWithResult;
                    int i7 = i6 + 123;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i9 = i6 + 117;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj2);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj2);
                } else {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple = this.onWarmupCompleted;
                    switch (onNavigationEvent.onExtraCallbackWithResult[((TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult) obj).ordinal()]) {
                        case 1:
                            onextracallbackIAuthTabCallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED;
                            break;
                        case 2:
                            onextracallbackIAuthTabCallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
                            break;
                        case 3:
                            onextracallbackIAuthTabCallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED;
                            break;
                        case 4:
                            onextracallbackIAuthTabCallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
                            break;
                        case 5:
                            onextracallbackIAuthTabCallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED;
                            break;
                        case 6:
                            onextracallbackIAuthTabCallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED;
                            int i10 = onExtraCallback + 55;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                            break;
                        default:
                            onextracallbackIAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback();
                            break;
                    }
                    anonymousClass4.L$0 = access15400.onNavigationEvent(obj);
                    anonymousClass4.L$1 = access15400.onNavigationEvent(anonymousClass4);
                    anonymousClass4.L$2 = access15400.onNavigationEvent(obj);
                    anonymousClass4.L$3 = access15400.onNavigationEvent(setripple);
                    anonymousClass4.I$0 = 0;
                    anonymousClass4.label = 1;
                    if (setripple.emit(onextracallbackIAuthTabCallback, anonymousClass4) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public onExtraCallback(IAnimation iAnimation, TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9) {
            this.onExtraCallbackWithResult = iAnimation;
            this.onWarmupCompleted = textFieldKeyInputExternalSyntheticLambda9;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            int i = 2 % 2;
            Object objCollect = this.onExtraCallbackWithResult.collect(new AnonymousClass2(setripple, this.onWarmupCompleted), access13800Var);
            if (objCollect != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i2 = onExtraCallback;
            int i3 = i2 + 31;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 101;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return objCollect;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
