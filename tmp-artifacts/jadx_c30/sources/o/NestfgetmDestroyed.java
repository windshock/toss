package o;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NestfgetmDestroyed {
    private final isQueryRefinementEnabled<Float, onSuggestionsKey> IAuthTabCallback;
    private final getSupportedHighSpeedResolutions IAuthTabCallbackStub;
    private final float asInterface;
    private final Function0<Unit> onExtraCallback;
    private final isQueryRefinementEnabled<Float, onSuggestionsKey> onExtraCallbackWithResult;
    private final Function0<Unit> onNavigationEvent;
    private final findResAndMsg onWarmupCompleted;

    public NestfgetmDestroyed(@NotNull findResAndMsg findresandmsg, float f, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(findresandmsg, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function0, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function02, BuildConfig.FLAVOR);
        this.onWarmupCompleted = findresandmsg;
        this.asInterface = f;
        this.onExtraCallback = function0;
        this.onNavigationEvent = function02;
        this.onExtraCallbackWithResult = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
        this.IAuthTabCallback = isIconified.onWarmupCompleted(1.0f, 0.0f, 2, (Object) null);
        this.IAuthTabCallbackStub = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
    }

    public final float asInterface() {
        return this.asInterface;
    }

    public final float IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackStub.onNavigationEvent();
    }

    public final void onNavigationEvent(float f) {
        this.IAuthTabCallbackStub.onNavigationEvent(f);
    }

    public final float onTransact() {
        return ((Number) this.onExtraCallbackWithResult.IAuthTabCallback()).floatValue();
    }

    public final float onWarmupCompleted() {
        return ((Number) this.IAuthTabCallback.IAuthTabCallback()).floatValue();
    }

    public final boolean IAuthTabCallbackStub() {
        return ((Number) this.onExtraCallbackWithResult.IAuthTabCallback()).floatValue() > 0.0f;
    }

    private final float asBinder() {
        float fIAuthTabCallbackDefault = IAuthTabCallbackDefault() / 2.0f;
        if (fIAuthTabCallbackDefault > 0.0f) {
            return RangesKt.coerceIn(((Number) this.onExtraCallbackWithResult.IAuthTabCallback()).floatValue() / fIAuthTabCallbackDefault, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public final float onExtraCallback() {
        return 1.0f - (asBinder() * 0.2f);
    }

    public final float onExtraCallbackWithResult() {
        return 1.0f - (asBinder() * 0.5f);
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ float $offset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(float f, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$offset = f;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return NestfgetmDestroyed.this.new onWarmupCompleted(this.$offset, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                isQueryRefinementEnabled isqueryrefinementenabled = NestfgetmDestroyed.this.onExtraCallbackWithResult;
                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$offset);
                this.label = 1;
                if (isqueryrefinementenabled.onWarmupCompleted(fOnExtraCallbackWithResult, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void IAuthTabCallback(float f) {
        maybeUpdateAnimatable.onNavigationEvent(this.onWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(f, null), 3, (Object) null);
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onExtraCallback onextracallback = NestfgetmDestroyed.this.new onExtraCallback(access13800Var);
            onextracallback.L$0 = obj;
            return onextracallback;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                List listListOf = CollectionsKt.listOf(new getPackageType[]{maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass1(NestfgetmDestroyed.this, null), 3, (Object) null), maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass3(NestfgetmDestroyed.this, null), 3, (Object) null)});
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.label = 1;
                if (ResourceCallback.onExtraCallbackWithResult(listListOf, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            NestfgetmDestroyed.this.onExtraCallback.invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: o.NestfgetmDestroyed$onExtraCallback$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            int label;
            final /* synthetic */ NestfgetmDestroyed this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(NestfgetmDestroyed nestfgetmDestroyed, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.this$0 = nestfgetmDestroyed;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new AnonymousClass1(this.this$0, access13800Var);
            }

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    isQueryRefinementEnabled isqueryrefinementenabled = this.this$0.onExtraCallbackWithResult;
                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.this$0.IAuthTabCallbackDefault() / 2.0f);
                    getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder(), 0, 2, (Object) null);
                    this.label = 1;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallback, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: o.NestfgetmDestroyed$onExtraCallback$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            int label;
            final /* synthetic */ NestfgetmDestroyed this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(NestfgetmDestroyed nestfgetmDestroyed, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.this$0 = nestfgetmDestroyed;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new AnonymousClass3(this.this$0, access13800Var);
            }

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    isQueryRefinementEnabled isqueryrefinementenabled = this.this$0.IAuthTabCallback;
                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(0.0f);
                    getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder(), 0, 2, (Object) null);
                    this.label = 1;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallback, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void onNavigationEvent() {
        this.onNavigationEvent.invoke();
        maybeUpdateAnimatable.onNavigationEvent(this.onWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(null), 3, (Object) null);
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return NestfgetmDestroyed.this.new IAuthTabCallback(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                isQueryRefinementEnabled isqueryrefinementenabled = NestfgetmDestroyed.this.onExtraCallbackWithResult;
                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(0.0f);
                getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder(), 0, 2, (Object) null);
                this.label = 1;
                if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallback, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void IAuthTabCallback() {
        maybeUpdateAnimatable.onNavigationEvent(this.onWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(null), 3, (Object) null);
    }
}
