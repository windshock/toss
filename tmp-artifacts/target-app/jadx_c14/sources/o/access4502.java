package o;

import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.ktx.AppUpdateManagerKtxKt;
import com.google.android.play.core.ktx.AppUpdateResult;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.withOnAnimationEventListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class access4502 implements withOrigin {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int IAuthTabCallback = 8;
    private final setRubIn<withOnAnimationEventListener> onExtraCallback;
    private final getCornerRadius<withOnAnimationEventListener> onNavigationEvent;

    protected abstract AppUpdateManager onExtraCallback();

    @Override // o.withOrigin
    public Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var) {
        return onExtraCallbackWithResult(this, access13800Var);
    }

    @Override // o.withOrigin
    public Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var) {
        return onExtraCallback(this, access13800Var);
    }

    public access4502() {
        getCornerRadius<withOnAnimationEventListener> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(withOnAnimationEventListener.asInterface.onNavigationEvent);
        this.onNavigationEvent = getcornerradiusOnNavigationEvent;
        this.onExtraCallback = getcornerradiusOnNavigationEvent;
    }

    @Override // o.withOrigin
    public setRubIn<withOnAnimationEventListener> onWarmupCompleted() {
        return this.onExtraCallback;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends getPackageType>>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onExtraCallback onextracallback = access4502.this.new onExtraCallback(access13800Var);
            onextracallback.L$0 = obj;
            return onextracallback;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Result<? extends getPackageType>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            access4502 access4502Var;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                access4502Var = access4502.this;
                Result.Companion companion3 = Result.Companion;
                getCornerRadius getcornerradius = access4502Var.onNavigationEvent;
                withOnAnimationEventListener.onTransact ontransact = withOnAnimationEventListener.onTransact.onNavigationEvent;
                this.L$0 = findresandmsg;
                this.L$1 = access4502Var;
                this.L$2 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                if (getcornerradius.emit(ontransact, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    obj2 = obj3;
                    return Result.IAuthTabCallback(obj2);
                }
                access4502Var = (access4502) this.L$1;
                ResultKt.onNavigationEvent(obj);
            }
            obj2 = Result.constructor-impl(ycxycx.onWarmupCompleted(ycxycx.IAuthTabCallback(ycxycx.onWarmupCompleted(AppUpdateManagerKtxKt.requestUpdateFlow(access4502Var.onExtraCallback()), new onExtraCallbackWithResult(access4502Var, null)), new C0007onExtraCallback(access4502Var, null)), findresandmsg));
            access4502 access4502Var2 = access4502.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AbsInAppUpdateManager::checkAppUpdate", th);
                getCornerRadius getcornerradius2 = access4502Var2.onNavigationEvent;
                withOnAnimationEventListener.IAuthTabCallback iAuthTabCallback = withOnAnimationEventListener.IAuthTabCallback.IAuthTabCallback;
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = obj2;
                this.L$2 = access15400.onNavigationEvent(th);
                this.I$0 = 0;
                this.label = 2;
                if (getcornerradius2.emit(iAuthTabCallback, this) != objOnWarmupCompleted) {
                    obj3 = obj2;
                    obj2 = obj3;
                }
                return objOnWarmupCompleted;
            }
            return Result.IAuthTabCallback(obj2);
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements getBacktraceNote<setRipple<? super AppUpdateResult>, Throwable, access13800<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ access4502 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(access4502 access4502Var, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(3, access13800Var);
                this.this$0 = access4502Var;
            }

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(setRipple<? super AppUpdateResult> setripple, Throwable th, access13800<? super Unit> access13800Var) {
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.this$0, access13800Var);
                onextracallbackwithresult.L$0 = th;
                return onextracallbackwithresult.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Throwable th = (Throwable) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AbsInAppUpdateManager::checkAppUpdate", th);
                    getCornerRadius getcornerradius = this.this$0.onNavigationEvent;
                    withOnAnimationEventListener.IAuthTabCallback iAuthTabCallback = withOnAnimationEventListener.IAuthTabCallback.IAuthTabCallback;
                    this.L$0 = access15400.onNavigationEvent(th);
                    this.label = 1;
                    if (getcornerradius.emit(iAuthTabCallback, this) == objOnWarmupCompleted) {
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

        /* renamed from: o.access4502$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        static final class C0007onExtraCallback extends SuspendLambda implements Function2<AppUpdateResult, access13800<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ access4502 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0007onExtraCallback(access4502 access4502Var, access13800<? super C0007onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = access4502Var;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                C0007onExtraCallback c0007onExtraCallback = new C0007onExtraCallback(this.this$0, access13800Var);
                c0007onExtraCallback.L$0 = obj;
                return c0007onExtraCallback;
            }

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AppUpdateResult appUpdateResult, access13800<? super Unit> access13800Var) {
                return create(appUpdateResult, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                Object iAuthTabCallbackStub;
                withOnAnimationEventListener.onExtraCallbackWithResult onextracallbackwithresult;
                AppUpdateResult.Available available = (AppUpdateResult) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (available instanceof AppUpdateResult.Available) {
                        iAuthTabCallbackStub = new withOnAnimationEventListener.IAuthTabCallbackStub(available);
                    } else if (available instanceof AppUpdateResult.Downloaded) {
                        iAuthTabCallbackStub = withOnAnimationEventListener.onWarmupCompleted.onNavigationEvent;
                    } else if (available instanceof AppUpdateResult.InProgress) {
                        AppUpdateResult.InProgress inProgress = (AppUpdateResult.InProgress) available;
                        int iInstallStatus = inProgress.getInstallState().installStatus();
                        if (iInstallStatus != 1) {
                            if (iInstallStatus == 2) {
                                onextracallbackwithresult = new withOnAnimationEventListener.onExtraCallbackWithResult(inProgress.getInstallState());
                            } else if (iInstallStatus == 5) {
                                iAuthTabCallbackStub = withOnAnimationEventListener.IAuthTabCallbackDefault.onExtraCallbackWithResult;
                            } else if (iInstallStatus == 6) {
                                iAuthTabCallbackStub = withOnAnimationEventListener.onNavigationEvent.IAuthTabCallback;
                            } else if (iInstallStatus == 11) {
                                iAuthTabCallbackStub = withOnAnimationEventListener.onWarmupCompleted.onNavigationEvent;
                            } else {
                                onextracallbackwithresult = new withOnAnimationEventListener.onExtraCallbackWithResult(inProgress.getInstallState());
                            }
                            iAuthTabCallbackStub = onextracallbackwithresult;
                        } else {
                            iAuthTabCallbackStub = withOnAnimationEventListener.onExtraCallback.onExtraCallback;
                        }
                    } else {
                        if (!Intrinsics.areEqual(available, AppUpdateResult.NotAvailable.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iAuthTabCallbackStub = withOnAnimationEventListener.asBinder.onExtraCallback;
                    }
                    getCornerRadius getcornerradius = this.this$0.onNavigationEvent;
                    this.L$0 = access15400.onNavigationEvent(available);
                    this.L$1 = access15400.onNavigationEvent(iAuthTabCallbackStub);
                    this.label = 1;
                    if (getcornerradius.emit(iAuthTabCallbackStub, this) == objOnWarmupCompleted) {
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

    static /* synthetic */ Object onExtraCallbackWithResult(access4502 access4502Var, access13800<? super Unit> access13800Var) {
        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(access4502Var.new onExtraCallback(null), access13800Var);
        return objOnExtraCallbackWithResult == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
    }

    static /* synthetic */ Object onExtraCallback(access4502 access4502Var, access13800<? super Unit> access13800Var) {
        Object objEmit = access4502Var.onNavigationEvent.emit(withOnAnimationEventListener.onNavigationEvent.IAuthTabCallback, access13800Var);
        return objEmit == access14300.onWarmupCompleted() ? objEmit : Unit.INSTANCE;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
