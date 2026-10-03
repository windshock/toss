package o;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.JSBundleLoaderDelegate;
import o.WebResourceResponseModel;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JSBundleLoaderDelegate {
    private final long IAuthTabCallback;
    private final GeckoHubImp onExtraCallback;
    private final Function1<WebResourceResponseModel, Unit> onExtraCallbackWithResult;
    private final findResAndMsg onWarmupCompleted;

    public /* synthetic */ JSBundleLoaderDelegate(findResAndMsg findresandmsg, GeckoHubImp geckoHubImp, long j, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(findresandmsg, geckoHubImp, j, function1);
    }

    private JSBundleLoaderDelegate(findResAndMsg findresandmsg, GeckoHubImp geckoHubImp, long j, Function1<? super WebResourceResponseModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(geckoHubImp, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted = findresandmsg;
        this.IAuthTabCallback = j;
        this.onExtraCallbackWithResult = function1;
        this.onExtraCallback = GeckoHubImp.onNavigationEvent(geckoHubImp, 1, (String) null, 2, (Object) null);
    }

    public /* synthetic */ JSBundleLoaderDelegate(findResAndMsg findresandmsg, GeckoHubImp geckoHubImp, long j, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(findresandmsg, (i & 2) != 0 ? putChannelInfo.IAuthTabCallback() : geckoHubImp, (i & 4) != 0 ? setLogBuffers.Companion.onExtraCallbackWithResult() : j, (i & 8) != 0 ? new Function1() { // from class: viva.republica.toss.pedometer.SequentialCoroutineExecutor$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return JSBundleLoaderDelegate.onNavigationEvent((WebResourceResponseModel) obj);
            }
        } : function1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(WebResourceResponseModel webResourceResponseModel) {
        Intrinsics.checkNotNullParameter(webResourceResponseModel, "");
        return Unit.INSTANCE;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Function2<findResAndMsg, access13800<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Function2<? super findResAndMsg, ? super access13800<? super Unit>, ? extends Object> function2, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$block = function2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return JSBundleLoaderDelegate.this.new onExtraCallback(this.$block, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    JSBundleLoaderDelegate jSBundleLoaderDelegate = JSBundleLoaderDelegate.this;
                    Function2<findResAndMsg, access13800<? super Unit>, Object> function2 = this.$block;
                    long j = jSBundleLoaderDelegate.IAuthTabCallback;
                    this.label = 1;
                    if (jSBundleLoaderDelegate.onExtraCallback(function2, j, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
            } catch (WebResourceResponseModel e) {
                JSBundleLoaderDelegate.this.onExtraCallbackWithResult.invoke(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final getPackageType onExtraCallback(@NotNull Function2<? super findResAndMsg, ? super access13800<? super Unit>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return maybeUpdateAnimatable.onNavigationEvent(this.onWarmupCompleted, this.onExtraCallback, (setRandomHost) null, new onExtraCallback(function2, null), 2, (Object) null);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class onExtraCallbackWithResult<T> extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends T>>, Object> {
        final /* synthetic */ Function2<findResAndMsg, access13800<? super Result<? extends T>>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Function2<? super findResAndMsg, ? super access13800<? super Result<? extends T>>, ? extends Object> function2, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$block = function2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return JSBundleLoaderDelegate.this.new onExtraCallbackWithResult(this.$block, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Result<? extends T>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    JSBundleLoaderDelegate jSBundleLoaderDelegate = JSBundleLoaderDelegate.this;
                    Function2<findResAndMsg, access13800<? super Result<? extends T>>, Object> function2 = this.$block;
                    long j = jSBundleLoaderDelegate.IAuthTabCallback;
                    this.label = 1;
                    obj = jSBundleLoaderDelegate.onExtraCallback(function2, j, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            } catch (WebResourceResponseModel e) {
                JSBundleLoaderDelegate.this.onExtraCallbackWithResult.invoke(e);
                Result.Companion companion = Result.Companion;
                objOnNavigationEvent = Result.constructor-impl(ResultKt.createFailure(e));
            }
            return Result.IAuthTabCallback(objOnNavigationEvent);
        }
    }

    public final <T> GeckoHubImp1<Result<T>> onWarmupCompleted(@NotNull Function2<? super findResAndMsg, ? super access13800<? super Result<? extends T>>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return maybeUpdateAnimatable.onExtraCallback(this.onWarmupCompleted, this.onExtraCallback, (setRandomHost) null, new onExtraCallbackWithResult(function2, null), 2, (Object) null);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class onNavigationEvent<T> extends SuspendLambda implements Function2<findResAndMsg, access13800<? super T>, Object> {
        final /* synthetic */ Function2<findResAndMsg, access13800<? super T>, Object> $this_executeSequentially;
        final /* synthetic */ long $timeout;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(long j, Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$timeout = j;
            this.$this_executeSequentially = function2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(this.$timeout, this.$this_executeSequentially, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super T> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: o.JSBundleLoaderDelegate$onNavigationEvent$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super T>, Object> {
            final /* synthetic */ Function2<findResAndMsg, access13800<? super T>, Object> $this_executeSequentially;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$this_executeSequentially = function2;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_executeSequentially, access13800Var);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super T> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                Function2<findResAndMsg, access13800<? super T>, Object> function2 = this.$this_executeSequentially;
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.label = 1;
                Object objInvoke = function2.invoke(findresandmsg, this);
                return objInvoke == objOnWarmupCompleted ? objOnWarmupCompleted : objInvoke;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            long j = this.$timeout;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_executeSequentially, null);
            this.label = 1;
            Object objOnExtraCallbackWithResult = doGet.onExtraCallbackWithResult(j, anonymousClass1, this);
            return objOnExtraCallbackWithResult == objOnWarmupCompleted ? objOnWarmupCompleted : objOnExtraCallbackWithResult;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object onExtraCallback(Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2, long j, access13800<? super T> access13800Var) {
        return maybeUpdateAnimatable.onWarmupCompleted((CoroutineContext) null, new onNavigationEvent(j, function2, null), 1, (Object) null);
    }
}
