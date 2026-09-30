package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1;
import o.flipHorizontally;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1 {
    public static final WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1 IAuthTabCallback = new WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallback {
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[onNavigationEvent.values().length];
            try {
                iArr[onNavigationEvent.DOWN.ordinal()] = 1;
                int i2 = onExtraCallback + 9;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 4 / 5;
                } else {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onNavigationEvent.UP.ordinal()] = 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onNavigationEvent.LEFT.ordinal()] = 3;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onNavigationEvent.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onNavigationEvent = iArr;
            int i7 = onExtraCallback + 23;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(isQueryRefinementEnabled isqueryrefinementenabled, isQueryRefinementEnabled isqueryrefinementenabled2, isQueryRefinementEnabled isqueryrefinementenabled3, flipHorizontally fliphorizontally) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 1;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(isqueryrefinementenabled, isqueryrefinementenabled2, isqueryrefinementenabled3, fliphorizontally);
        int i5 = onNavigationEvent + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(isQueryRefinementEnabled isqueryrefinementenabled, flipHorizontally fliphorizontally) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(isqueryrefinementenabled, fliphorizontally);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(isqueryrefinementenabled, fliphorizontally);
        int i4 = onNavigationEvent + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onNavigationEvent LEFT = new onNavigationEvent("LEFT", 0);
        public static final onNavigationEvent RIGHT = new onNavigationEvent("RIGHT", 1);
        public static final onNavigationEvent UP = new onNavigationEvent("UP", 2);
        public static final onNavigationEvent DOWN = new onNavigationEvent("DOWN", 3);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 45;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return new onNavigationEvent[]{LEFT, RIGHT, UP, DOWN};
            }
            onNavigationEvent onnavigationevent = LEFT;
            onNavigationEvent onnavigationevent2 = RIGHT;
            onNavigationEvent onnavigationevent3 = UP;
            onNavigationEvent onnavigationevent4 = DOWN;
            onNavigationEvent[] onnavigationeventArr = new onNavigationEvent[4];
            onnavigationeventArr[0] = onnavigationevent;
            onnavigationeventArr[1] = onnavigationevent2;
            onnavigationeventArr[4] = onnavigationevent3;
            onnavigationeventArr[2] = onnavigationevent4;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 91;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i4 + 15;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i5 = IAuthTabCallback + 75;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 47;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i5 = onExtraCallback + 45;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 25 / 0;
            }
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i2) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i2 = onNavigationEvent + 111;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $alphaAnim;
        final /* synthetic */ int $index;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translateXAnim;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translateYAnim;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(int i2, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled3, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$index = i2;
            this.$alphaAnim = isqueryrefinementenabled;
            this.$translateYAnim = isqueryrefinementenabled2;
            this.$translateXAnim = isqueryrefinementenabled3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$index, this.$alphaAnim, this.$translateYAnim, this.$translateXAnim, access13800Var);
            int i3 = onExtraCallback + 13;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 35;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            if (i4 != 0) {
                int i5 = 81 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 95;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = IAuthTabCallback + 113;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 25 / 0;
            }
            return objInvokeSuspend;
        }

        /* renamed from: o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1$onExtraCallbackWithResult$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $alphaAnim;
            final /* synthetic */ getThumbPosition<Float> $spec;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translateXAnim;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translateYAnim;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, getThumbPosition<Float> getthumbposition, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled3, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.$alphaAnim = isqueryrefinementenabled;
                this.$spec = getthumbposition;
                this.$translateYAnim = isqueryrefinementenabled2;
                this.$translateXAnim = isqueryrefinementenabled3;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i2 = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$alphaAnim, this.$spec, this.$translateYAnim, this.$translateXAnim, access13800Var);
                anonymousClass2.L$0 = obj;
                int i3 = onNavigationEvent + 91;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return anonymousClass2;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 105;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i5 = onWarmupCompleted + 101;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 7;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                AnonymousClass2 anonymousClass2Create = create(findresandmsg, access13800Var);
                if (i4 != 0) {
                    return anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
                }
                anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
                throw null;
            }

            /* renamed from: o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1$onExtraCallbackWithResult$2$4, reason: invalid class name */
            static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;
                final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $alphaAnim;
                final /* synthetic */ getThumbPosition<Float> $spec;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, getThumbPosition<Float> getthumbposition, access13800<? super AnonymousClass4> access13800Var) {
                    super(2, access13800Var);
                    this.$alphaAnim = isqueryrefinementenabled;
                    this.$spec = getthumbposition;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i2 = 2 % 2;
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$alphaAnim, this.$spec, access13800Var);
                    int i3 = onWarmupCompleted + 109;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 41 / 0;
                    }
                    return anonymousClass4;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 37;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                    int i5 = onWarmupCompleted + 21;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        return objOnExtraCallbackWithResult;
                    }
                    throw null;
                }

                public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 3;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i5 = onWarmupCompleted + 121;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 74 / 0;
                    }
                    return objInvokeSuspend;
                }

                public final Object invokeSuspend(Object obj) {
                    int i2 = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i3 = this.label;
                    if (i3 != 0) {
                        int i4 = onWarmupCompleted + 25;
                        int i5 = i4 % 128;
                        onExtraCallbackWithResult = i5;
                        int i6 = i4 % 2;
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i7 = i5 + 89;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        ResultKt.onNavigationEvent(obj);
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$alphaAnim;
                        Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(1.0f);
                        getThumbPosition<Float> getthumbposition = this.$spec;
                        this.label = 1;
                        if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbposition, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                            int i9 = onExtraCallbackWithResult + 51;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                            return objOnWarmupCompleted;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    int i11 = onExtraCallbackWithResult + 83;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    return unit;
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 1;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(this.$alphaAnim, this.$spec, null), 3, (Object) null);
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass1(this.$translateYAnim, this.$spec, null), 3, (Object) null);
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(this.$translateXAnim, this.$spec, null), 3, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i5 = onNavigationEvent + 17;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            /* renamed from: o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1$onExtraCallbackWithResult$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                final /* synthetic */ getThumbPosition<Float> $spec;
                final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translateYAnim;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, getThumbPosition<Float> getthumbposition, access13800<? super AnonymousClass1> access13800Var) {
                    super(2, access13800Var);
                    this.$translateYAnim = isqueryrefinementenabled;
                    this.$spec = getthumbposition;
                }

                public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 73;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    AnonymousClass1 anonymousClass1Create = create(findresandmsg, access13800Var);
                    if (i4 == 0) {
                        return anonymousClass1Create.invokeSuspend(Unit.INSTANCE);
                    }
                    anonymousClass1Create.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i2 = 2 % 2;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$translateYAnim, this.$spec, access13800Var);
                    int i3 = onExtraCallback + 61;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return anonymousClass1;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 59;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
                    int i5 = onExtraCallback + 93;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return objIAuthTabCallback;
                }

                public final Object invokeSuspend(Object obj) {
                    int i2 = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i3 = this.label;
                    if (i3 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$translateYAnim;
                        Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(0.0f);
                        getThumbPosition<Float> getthumbposition = this.$spec;
                        this.label = 1;
                        if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbposition, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                            int i4 = IAuthTabCallback + 85;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            return objOnWarmupCompleted;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                        int i6 = onExtraCallback + 37;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                    }
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1$onExtraCallbackWithResult$2$5, reason: invalid class name */
            static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;
                final /* synthetic */ getThumbPosition<Float> $spec;
                final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translateXAnim;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, getThumbPosition<Float> getthumbposition, access13800<? super AnonymousClass5> access13800Var) {
                    super(2, access13800Var);
                    this.$translateXAnim = isqueryrefinementenabled;
                    this.$spec = getthumbposition;
                }

                public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 85;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    AnonymousClass5 anonymousClass5Create = create(findresandmsg, access13800Var);
                    if (i4 == 0) {
                        return anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
                    }
                    anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i2 = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$translateXAnim, this.$spec, access13800Var);
                    int i3 = onWarmupCompleted + 69;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return anonymousClass5;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 125;
                    onNavigationEvent = i3 % 128;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super Unit> access13800Var = (access13800) obj2;
                    if (i3 % 2 == 0) {
                        return IAuthTabCallback(findresandmsg, access13800Var);
                    }
                    IAuthTabCallback(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[PHI: r1
                  0x0032: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
                  0x0024: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object objOnWarmupCompleted;
                    int i2;
                    int i3 = 2 % 2;
                    int i4 = onNavigationEvent + 123;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        objOnWarmupCompleted = access14300.onWarmupCompleted();
                        i2 = this.label;
                        int i5 = 71 / 0;
                        if (i2 == 0) {
                            ResultKt.onNavigationEvent(obj);
                            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$translateXAnim;
                            Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(0.0f);
                            getThumbPosition<Float> getthumbposition = this.$spec;
                            this.label = 1;
                            if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbposition, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                                int i6 = onWarmupCompleted + 45;
                                onNavigationEvent = i6 % 128;
                                int i7 = i6 % 2;
                                return objOnWarmupCompleted;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj);
                        }
                    } else {
                        objOnWarmupCompleted = access14300.onWarmupCompleted();
                        i2 = this.label;
                        if (i2 != 0) {
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    int i8 = onNavigationEvent + 15;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
        
            if (o.findRes.onExtraCallbackWithResult(r2, r11) == r1) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 117;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                long j = this.$index;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(j * 80, this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            int i6 = onExtraCallback + 41;
            int i7 = i6 % 128;
            IAuthTabCallback = i7;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 0) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i7 + 21;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
            int i9 = onExtraCallback + 123;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(600, 0, (setOnQueryTextListener) null, 6, (Object) null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$alphaAnim, getthumbpositionOnExtraCallbackWithResult, this.$translateYAnim, this.$translateXAnim, null);
            this.L$0 = access15400.onNavigationEvent(getthumbpositionOnExtraCallbackWithResult);
            this.label = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i2, @Nullable onNavigationEvent onnavigationevent, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3, int i4) {
        onNavigationEvent onnavigationevent2;
        float fOnExtraCallback;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        int i6 = (i4 & 1) != 0 ? 0 : i2;
        if ((i4 & 2) != 0) {
            int i7 = onWarmupCompleted + 75;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            onnavigationevent2 = onNavigationEvent.UP;
        } else {
            onnavigationevent2 = onnavigationevent;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onWarmupCompleted + 85;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-146331560, i3, -1, "im.toss.ads_sdk.ui.screen.NativeAdsAnimations.animateSlide (NativeAdsAnimations.kt:25)");
        }
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
        int[] iArr = onExtraCallback.onNavigationEvent;
        int i11 = iArr[onnavigationevent2.ordinal()];
        if (i11 != 1) {
            int i12 = onNavigationEvent + 15;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            fOnExtraCallback = i11 != 2 ? 0.0f : r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(80.0f));
        } else {
            fOnExtraCallback = -r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(80.0f));
        }
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
        int i14 = iArr[onnavigationevent2.ordinal()];
        float fOnExtraCallback2 = i14 != 3 ? i14 != 4 ? 0.0f : -r8lambdanm9dm2eewl4vrptnjmesfjqky42.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f)) : r8lambdanm9dm2eewl4vrptnjmesfjqky42.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f));
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            int i15 = onNavigationEvent + 97;
            onWarmupCompleted = i15 % 128;
            int i16 = i15 % 2;
        }
        final isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized2 = isIconified.onWarmupCompleted(fOnExtraCallback2, 0.0f, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        final isQueryRefinementEnabled isqueryrefinementenabled2 = (isQueryRefinementEnabled) objOnMinimized2;
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized3 = isIconified.onWarmupCompleted(fOnExtraCallback, 0.0f, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        final isQueryRefinementEnabled isqueryrefinementenabled3 = (isQueryRefinementEnabled) objOnMinimized3;
        Unit unit = Unit.INSTANCE;
        boolean z = (((i3 & 112) ^ 48) > 32 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i6)) || (i3 & 48) == 32;
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled);
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled3);
        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled2);
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnExtraCallback | z | zOnExtraCallback2 | zOnExtraCallback3) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(i6, isqueryrefinementenabled, isqueryrefinementenabled3, isqueryrefinementenabled2, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(onextracallbackwithresult);
            objOnMinimized4 = onextracallbackwithresult;
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 6);
        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled);
        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled2);
        boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled3);
        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback4 | zOnExtraCallback5 | zOnExtraCallback6)) {
            int i17 = onWarmupCompleted + 67;
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.screen.NativeAdsAnimations$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj) {
                        int i19 = 2 % 2;
                        int i20 = IAuthTabCallback + 49;
                        onExtraCallback = i20 % 128;
                        int i21 = i20 % 2;
                        Unit unitOnExtraCallbackWithResult = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(isqueryrefinementenabled, isqueryrefinementenabled2, isqueryrefinementenabled3, (flipHorizontally) obj);
                        int i22 = IAuthTabCallback + 85;
                        onExtraCallback = i22 % 128;
                        if (i22 % 2 == 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0, (Function1) objOnMinimized5);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    private static final Unit IAuthTabCallback(isQueryRefinementEnabled isqueryrefinementenabled, isQueryRefinementEnabled isqueryrefinementenabled2, isQueryRefinementEnabled isqueryrefinementenabled3, flipHorizontally fliphorizontally) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        fliphorizontally.IAuthTabCallback_Parcel(((Number) isqueryrefinementenabled2.IAuthTabCallback()).floatValue());
        fliphorizontally.access000(((Number) isqueryrefinementenabled3.IAuthTabCallback()).floatValue());
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 41;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return unit;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $alphaAnim;
        final /* synthetic */ int $index;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(int i2, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$index = i2;
            this.$alphaAnim = isqueryrefinementenabled;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$index, this.$alphaAnim, access13800Var);
            int i3 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i3 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i3 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                iAuthTabCallbackCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(unit);
            int i5 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1$IAuthTabCallback$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $alphaAnim;
            final /* synthetic */ getThumbPosition<Float> $spec;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, getThumbPosition<Float> getthumbposition, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$alphaAnim = isqueryrefinementenabled;
                this.$spec = getthumbposition;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i2 = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$alphaAnim, this.$spec, access13800Var);
                anonymousClass5.L$0 = obj;
                int i3 = IAuthTabCallback + 55;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 65;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                int i5 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 113;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i5 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            /* renamed from: o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1$IAuthTabCallback$5$5, reason: invalid class name and collision with other inner class name */
            static final class C00435 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;
                final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $alphaAnim;
                final /* synthetic */ getThumbPosition<Float> $spec;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00435(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, getThumbPosition<Float> getthumbposition, access13800<? super C00435> access13800Var) {
                    super(2, access13800Var);
                    this.$alphaAnim = isqueryrefinementenabled;
                    this.$spec = getthumbposition;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i2 = 2 % 2;
                    C00435 c00435 = new C00435(this.$alphaAnim, this.$spec, access13800Var);
                    int i3 = onNavigationEvent + 71;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 55 / 0;
                    }
                    return c00435;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 65;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                    int i5 = onWarmupCompleted + 117;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnNavigationEvent;
                }

                public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 31;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i5 = onNavigationEvent + 39;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }

                public final Object invokeSuspend(Object obj) {
                    int i2 = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i3 = this.label;
                    Object obj2 = null;
                    if (i3 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$alphaAnim;
                        Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(1.0f);
                        getThumbPosition<Float> getthumbposition = this.$spec;
                        this.label = 1;
                        if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbposition, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                            int i4 = onWarmupCompleted + 85;
                            int i5 = i4 % 128;
                            onNavigationEvent = i5;
                            int i6 = i4 % 2;
                            int i7 = i5 + 53;
                            onWarmupCompleted = i7 % 128;
                            if (i7 % 2 == 0) {
                                return objOnWarmupCompleted;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                        int i8 = onNavigationEvent + 13;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    Unit unit = Unit.INSTANCE;
                    int i10 = onWarmupCompleted + 81;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 19;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new C00435(this.$alphaAnim, this.$spec, null), 3, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i5 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
        
            if (o.findRes.onExtraCallbackWithResult(r2, r6) == r1) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                long j = this.$index;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(j * 80, this) != objOnWarmupCompleted) {
                }
                int i4 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }
            if (i3 != 1) {
                int i6 = onNavigationEvent + 93;
                int i7 = i6 % 128;
                onExtraCallbackWithResult = i7;
                int i8 = i6 % 2;
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = i7 + 45;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(600, 0, (setOnQueryTextListener) null, 6, (Object) null);
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$alphaAnim, getthumbpositionOnExtraCallbackWithResult, null);
            this.L$0 = access15400.onNavigationEvent(getthumbpositionOnExtraCallbackWithResult);
            this.label = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3, int i4) {
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        boolean z = true;
        if ((i4 & 1) != 0) {
            int i6 = onNavigationEvent;
            int i7 = i6 + 85;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 45;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            i2 = 0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-687245294, i3, -1, "im.toss.ads_sdk.ui.screen.NativeAdsAnimations.animateAlpha (NativeAdsAnimations.kt:63)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            int i11 = onWarmupCompleted + 87;
            onNavigationEvent = i11 % 128;
            float f = i11 % 2 == 0 ? 2.0f : 0.0f;
            objOnMinimized = isIconified.onWarmupCompleted(f, f, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized;
        Unit unit = Unit.INSTANCE;
        if ((((i3 & 112) ^ 48) <= 32 || !cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i2)) && (i3 & 48) != 32) {
            z = false;
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnExtraCallback | z) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized2 = new IAuthTabCallback(i2, isqueryrefinementenabled, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            int i12 = onNavigationEvent + 113;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 6);
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback2) {
            int i14 = onWarmupCompleted + 115;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new Function1() { // from class: im.toss.ads_sdk.ui.screen.NativeAdsAnimations$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        Unit unitOnWarmupCompleted;
                        int i16 = 2 % 2;
                        int i17 = IAuthTabCallback + 15;
                        onExtraCallbackWithResult = i17 % 128;
                        if (i17 % 2 != 0) {
                            unitOnWarmupCompleted = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onWarmupCompleted(isqueryrefinementenabled, (flipHorizontally) obj);
                            int i18 = 4 / 0;
                        } else {
                            unitOnWarmupCompleted = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onWarmupCompleted(isqueryrefinementenabled, (flipHorizontally) obj);
                        }
                        int i19 = onExtraCallbackWithResult + 45;
                        IAuthTabCallback = i19 % 128;
                        int i20 = i19 % 2;
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0, (Function1) objOnMinimized3);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(isQueryRefinementEnabled isqueryrefinementenabled, flipHorizontally fliphorizontally) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.IAuthTabCallbackStub(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        Unit unit2 = Unit.INSTANCE;
        int i4 = onNavigationEvent + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return unit2;
    }
}
