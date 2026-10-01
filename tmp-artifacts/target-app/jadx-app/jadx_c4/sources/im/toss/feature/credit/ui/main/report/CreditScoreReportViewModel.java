package im.toss.feature.credit.ui.main.report;

import android.text.Html;
import androidx.lifecycle.ViewModel;
import im.toss.features.credit.data.remote.model.CardUsageReportResponse;
import im.toss.features.credit.data.remote.model.LoanUsageReportResponse;
import im.toss.features.credit.data.remote.model.ScoreReportResponse;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinCmpErrorCode;
import o.GeckoHubImp;
import o.GeckoHubImp1;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.addPermRequstCallback;
import o.addPolicy;
import o.createWifiConfiguration;
import o.findResAndMsg;
import o.getAppAlias;
import o.getCornerRadius;
import o.getTileModeY;
import o.isExecuted;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import o.setRipple;
import o.setRubIn;
import o.setShine;
import o.ycxycx;
import o.zzag;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditScoreReportViewModel extends ViewModel {
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private final zzag IAuthTabCallback;
    private final getCornerRadius<Result<addPermRequstCallback>> onExtraCallback;
    private final getAppAlias onExtraCallbackWithResult;
    private final setRubIn<String> onNavigationEvent;
    private final setRubIn<Result<addPermRequstCallback>> onWarmupCompleted;

    @Inject
    public CreditScoreReportViewModel(@NotNull getAppAlias getappalias, @NotNull zzag zzagVar) {
        Intrinsics.checkNotNullParameter(getappalias, "");
        Intrinsics.checkNotNullParameter(zzagVar, "");
        this.onExtraCallbackWithResult = getappalias;
        this.IAuthTabCallback = zzagVar;
        getCornerRadius<Result<addPermRequstCallback>> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent((Object) null);
        this.onExtraCallback = getcornerradiusOnNavigationEvent;
        this.onWarmupCompleted = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
        this.onNavigationEvent = ycxycx.IAuthTabCallback(ycxycx.onExtraCallbackWithResult(new onNavigationEvent(null)), ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), getTileModeY.Companion.onNavigationEvent(), "");
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new AnonymousClass3(null), 3, (Object) null);
    }

    public static final /* synthetic */ getAppAlias onExtraCallback(CreditScoreReportViewModel creditScoreReportViewModel) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getAppAlias getappalias = creditScoreReportViewModel.onExtraCallbackWithResult;
        if (i3 == 0) {
            return getappalias;
        }
        throw null;
    }

    public static final /* synthetic */ getCornerRadius onExtraCallbackWithResult(CreditScoreReportViewModel creditScoreReportViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        getCornerRadius<Result<addPermRequstCallback>> getcornerradius = creditScoreReportViewModel.onExtraCallback;
        int i5 = i3 + 89;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public final setRubIn<Result<addPermRequstCallback>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 41;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<Result<addPermRequstCallback>> setrubin = this.onWarmupCompleted;
        int i5 = i2 + 5;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    public final setRubIn<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 47;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<String> setrubin = this.onNavigationEvent;
        int i5 = i2 + 81;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return setrubin;
        }
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<setRipple<? super String>, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(setRipple<? super String> setripple, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(setripple, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = IAuthTabCallback + 95;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((setRipple) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 76 / 0;
            }
            return objIAuthTabCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        
            if (r3.emit(r9, r8) == r2) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            setRipple setripple;
            int i = 2 % 2;
            setRipple setripple2 = (setRipple) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                createWifiConfiguration.onExtraCallbackWithResult onextracallbackwithresult = createWifiConfiguration.onExtraCallbackWithResult.onExtraCallback;
                this.L$0 = access15400.onNavigationEvent(setripple2);
                this.L$1 = setripple2;
                this.label = 1;
                obj = onextracallbackwithresult.onExtraCallback(this);
                if (obj != objOnWarmupCompleted) {
                    int i3 = onNavigationEvent + 23;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    setripple = setripple2;
                }
                return objOnWarmupCompleted;
            }
            int i5 = IAuthTabCallback + 7;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                Unit unit = Unit.INSTANCE;
                int i7 = IAuthTabCallback + 5;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
            setripple = (setRipple) this.L$1;
            ResultKt.onNavigationEvent(obj);
            this.L$0 = access15400.onNavigationEvent(setripple2);
            this.L$1 = null;
            this.label = 2;
        }
    }

    /* renamed from: im.toss.feature.credit.ui.main.report.CreditScoreReportViewModel$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        AnonymousClass3(access13800<? super AnonymousClass3> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AnonymousClass3 anonymousClass3Create = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = anonymousClass3Create.invokeSuspend(Unit.INSTANCE);
                int i4 = 18 / 0;
            } else {
                objInvokeSuspend = anonymousClass3Create.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onWarmupCompleted + 27;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass3 anonymousClass3 = CreditScoreReportViewModel.this.new AnonymousClass3(access13800Var);
            anonymousClass3.L$0 = obj;
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return anonymousClass3;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        /* renamed from: im.toss.feature.credit.ui.main.report.CreditScoreReportViewModel$3$onWarmupCompleted */
        static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super ScoreReportResponse>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            int I$0;
            int I$1;
            int I$2;
            Object L$0;
            int label;
            final /* synthetic */ CreditScoreReportViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onWarmupCompleted(CreditScoreReportViewModel creditScoreReportViewModel, access13800<? super onWarmupCompleted> access13800Var) {
                super(2, access13800Var);
                this.this$0 = creditScoreReportViewModel;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.this$0, access13800Var);
                int i2 = onExtraCallback + 85;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return onwarmupcompleted;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 125;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallback + 85;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 93 / 0;
                }
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super ScoreReportResponse> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 105;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    return onwarmupcompletedCreate.invokeSuspend(unit);
                }
                onwarmupcompletedCreate.invokeSuspend(unit);
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0040 A[PHI: r1
              0x0040: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r5
              0x0025: PHI (r5v1 int) = (r5v0 int), (r5v3 int) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object objOnWarmupCompleted;
                int i;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 105;
                onExtraCallback = i3 % 128;
                try {
                    if (i3 % 2 != 0) {
                        objOnWarmupCompleted = access14300.onWarmupCompleted();
                        i = this.label;
                        int i4 = 68 / 0;
                        if (i == 0) {
                            ResultKt.onNavigationEvent(obj);
                            CreditScoreReportViewModel creditScoreReportViewModel = this.this$0;
                            Result.Companion companion = Result.Companion;
                            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(null, creditScoreReportViewModel);
                            this.L$0 = access15400.onNavigationEvent(this);
                            this.I$0 = 0;
                            this.I$1 = 0;
                            this.I$2 = 0;
                            this.label = 1;
                            obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, iAuthTabCallback, this);
                            if (obj == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i5 = IAuthTabCallback + 123;
                            onExtraCallback = i5 % 128;
                            int i6 = i5 % 2;
                            ResultKt.onNavigationEvent(obj);
                        }
                    } else {
                        objOnWarmupCompleted = access14300.onWarmupCompleted();
                        i = this.label;
                        if (i != 0) {
                        }
                    }
                    obj2 = Result.constructor-impl(obj);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                } catch (WebResourceResponseModel e3) {
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                }
                if (Result.onExtraCallback(obj2)) {
                    return null;
                }
                return obj2;
            }

            /* renamed from: im.toss.feature.credit.ui.main.report.CreditScoreReportViewModel$3$onWarmupCompleted$IAuthTabCallback */
            public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super ScoreReportResponse>, Object> {
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;
                int I$0;
                Object L$0;
                int label;
                final /* synthetic */ CreditScoreReportViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IAuthTabCallback(access13800 access13800Var, CreditScoreReportViewModel creditScoreReportViewModel) {
                    super(2, access13800Var);
                    this.this$0 = creditScoreReportViewModel;
                }

                public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super ScoreReportResponse> access13800Var) throws TossApiCallException.ApiError {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 121;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onWarmupCompleted + 91;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(access13800Var, this.this$0);
                    int i2 = onWarmupCompleted + 81;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 18 / 0;
                    }
                    return iAuthTabCallback;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 121;
                    IAuthTabCallback = i2 % 128;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super ScoreReportResponse> access13800Var = (access13800) obj2;
                    if (i2 % 2 == 0) {
                        return IAuthTabCallback(findresandmsg, access13800Var);
                    }
                    IAuthTabCallback(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
                public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 89;
                    onWarmupCompleted = i2 % 128;
                    Object obj2 = null;
                    if (i2 % 2 == 0) {
                        access14300.onWarmupCompleted();
                        throw null;
                    }
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i3 = this.label;
                    if (i3 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        getAppAlias getappaliasOnExtraCallback = CreditScoreReportViewModel.onExtraCallback(this.this$0);
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.label = 1;
                        obj = getappaliasOnExtraCallback.onUnminimized(this);
                        if (obj == objOnWarmupCompleted) {
                            int i4 = onWarmupCompleted + 23;
                            IAuthTabCallback = i4 % 128;
                            if (i4 % 2 == 0) {
                                return objOnWarmupCompleted;
                            }
                            throw null;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i5 = onWarmupCompleted + 85;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            ResultKt.onNavigationEvent(obj);
                            throw null;
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                    BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                    if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
                        TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                        if (apiErrorExtraCallbackWithResult == null) {
                            throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                        }
                        throw apiErrorExtraCallbackWithResult;
                    }
                    int i6 = onWarmupCompleted + 69;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            throw new NullPointerException("null cannot be cast to non-null type im.toss.features.credit.data.remote.model.ScoreReportResponse");
                        }
                        int i8 = IAuthTabCallback + 37;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        return (ScoreReportResponse) objOnTransact;
                    } catch (NullPointerException e) {
                        if (!(!Intrinsics.areEqual(ScoreReportResponse.class, Object.class)) || Intrinsics.areEqual(ScoreReportResponse.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        int i10 = onWarmupCompleted + 5;
                        IAuthTabCallback = i10 % 128;
                        if (i10 % 2 != 0) {
                            TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e).onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                            obj2.hashCode();
                            throw null;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
            }
        }

        /* renamed from: im.toss.feature.credit.ui.main.report.CreditScoreReportViewModel$3$IAuthTabCallback */
        static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CardUsageReportResponse>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            int I$0;
            int I$1;
            int I$2;
            Object L$0;
            int label;
            final /* synthetic */ CreditScoreReportViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(CreditScoreReportViewModel creditScoreReportViewModel, access13800<? super IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = creditScoreReportViewModel;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super CardUsageReportResponse> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 105;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 13;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, access13800Var);
                int i2 = onWarmupCompleted + 21;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 56 / 0;
                }
                return iAuthTabCallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 17;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = IAuthTabCallback + 119;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return objIAuthTabCallback;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 119;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                try {
                    if (i4 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        CreditScoreReportViewModel creditScoreReportViewModel = this.this$0;
                        Result.Companion companion = Result.Companion;
                        GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                        C0011IAuthTabCallback c0011IAuthTabCallback = new C0011IAuthTabCallback(null, creditScoreReportViewModel);
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.I$2 = 0;
                        this.label = 1;
                        obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, c0011IAuthTabCallback, this);
                        if (obj == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i5 = onWarmupCompleted + 83;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        if (i6 == 0) {
                            ResultKt.onNavigationEvent(obj);
                            throw null;
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                    obj2 = Result.constructor-impl(obj);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                } catch (WebResourceResponseModel e3) {
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                }
                if (Result.onExtraCallback(obj2)) {
                    return null;
                }
                return obj2;
            }

            /* renamed from: im.toss.feature.credit.ui.main.report.CreditScoreReportViewModel$3$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
            public static final class C0011IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CardUsageReportResponse>, Object> {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                int I$0;
                Object L$0;
                int label;
                final /* synthetic */ CreditScoreReportViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0011IAuthTabCallback(access13800 access13800Var, CreditScoreReportViewModel creditScoreReportViewModel) {
                    super(2, access13800Var);
                    this.this$0 = creditScoreReportViewModel;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    C0011IAuthTabCallback c0011IAuthTabCallback = new C0011IAuthTabCallback(access13800Var, this.this$0);
                    int i2 = onExtraCallback + 73;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 35 / 0;
                    }
                    return c0011IAuthTabCallback;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 35;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                    int i4 = IAuthTabCallback + 83;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnExtraCallbackWithResult;
                }

                public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super CardUsageReportResponse> access13800Var) throws TossApiCallException.ApiError {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 89;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                    if (i3 == 0) {
                        int i4 = 97 / 0;
                    }
                    return objInvokeSuspend;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
                public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 39;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i4 = this.label;
                    if (i4 != 0) {
                        int i5 = onExtraCallback + 125;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        getAppAlias getappaliasOnExtraCallback = CreditScoreReportViewModel.onExtraCallback(this.this$0);
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.label = 1;
                        obj = getappaliasOnExtraCallback.onExtraCallbackWithResult(this);
                        if (obj == objOnWarmupCompleted) {
                            int i7 = IAuthTabCallback + 111;
                            onExtraCallback = i7 % 128;
                            int i8 = i7 % 2;
                            return objOnWarmupCompleted;
                        }
                    }
                    BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                        if (apiErrorExtraCallbackWithResult != null) {
                            throw apiErrorExtraCallbackWithResult;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                        int i9 = IAuthTabCallback + 31;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return (CardUsageReportResponse) objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type im.toss.features.credit.data.remote.model.CardUsageReportResponse");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(CardUsageReportResponse.class, Object.class) || Intrinsics.areEqual(CardUsageReportResponse.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult2 = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult2.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult2;
                    }
                }
            }
        }

        /* renamed from: im.toss.feature.credit.ui.main.report.CreditScoreReportViewModel$3$onExtraCallback */
        static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super LoanUsageReportResponse>, Object> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            int I$0;
            int I$1;
            int I$2;
            Object L$0;
            int label;
            final /* synthetic */ CreditScoreReportViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallback(CreditScoreReportViewModel creditScoreReportViewModel, access13800<? super onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = creditScoreReportViewModel;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super LoanUsageReportResponse> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 31;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                }
                onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(this.this$0, access13800Var);
                int i2 = onExtraCallback + 115;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return onextracallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 93;
                onExtraCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super LoanUsageReportResponse> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    IAuthTabCallback(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = onExtraCallbackWithResult + 113;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return objIAuthTabCallback;
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                try {
                    if (i2 != 0) {
                        int i3 = onExtraCallback + 99;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        CreditScoreReportViewModel creditScoreReportViewModel = this.this$0;
                        Result.Companion companion = Result.Companion;
                        GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(null, creditScoreReportViewModel);
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.I$2 = 0;
                        this.label = 1;
                        obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, this);
                        if (obj == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                    obj2 = Result.constructor-impl(obj);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                } catch (WebResourceResponseModel e3) {
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                }
                if (!Result.onExtraCallback(obj2)) {
                    return obj2;
                }
                int i5 = onExtraCallback + 47;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return null;
            }

            /* renamed from: im.toss.feature.credit.ui.main.report.CreditScoreReportViewModel$3$onExtraCallback$onExtraCallbackWithResult */
            public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super LoanUsageReportResponse>, Object> {
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;
                int I$0;
                Object L$0;
                int label;
                final /* synthetic */ CreditScoreReportViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public onExtraCallbackWithResult(access13800 access13800Var, CreditScoreReportViewModel creditScoreReportViewModel) {
                    super(2, access13800Var);
                    this.this$0 = creditScoreReportViewModel;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var, this.this$0);
                    int i2 = onExtraCallbackWithResult + 83;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 63 / 0;
                    }
                    return onextracallbackwithresult;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 79;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                    int i4 = onNavigationEvent + 125;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }

                public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super LoanUsageReportResponse> access13800Var) throws TossApiCallException.ApiError {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 115;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onExtraCallbackWithResult + 47;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 65 / 0;
                    }
                    return objInvokeSuspend;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
                public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                    int i = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    if (i2 != 0) {
                        int i3 = onNavigationEvent + 99;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        getAppAlias getappaliasOnExtraCallback = CreditScoreReportViewModel.onExtraCallback(this.this$0);
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.label = 1;
                        obj = getappaliasOnExtraCallback.writeTypedObject(this);
                        if (obj == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                    BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    boolean zBooleanValue = ((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue();
                    Object obj2 = null;
                    if (!zBooleanValue) {
                        TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                        if (apiErrorExtraCallbackWithResult != null) {
                            throw apiErrorExtraCallbackWithResult;
                        }
                        int i5 = onNavigationEvent + 117;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 == 0) {
                            throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                        }
                        TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                        obj2.hashCode();
                        throw null;
                    }
                    int i6 = onExtraCallbackWithResult + 83;
                    onNavigationEvent = i6 % 128;
                    try {
                        if (i6 % 2 == 0) {
                            baseApiResponse.onTransact();
                            obj2.hashCode();
                            throw null;
                        }
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return (LoanUsageReportResponse) objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type im.toss.features.credit.data.remote.model.LoanUsageReportResponse");
                    } catch (NullPointerException e) {
                        if (!Intrinsics.areEqual(LoanUsageReportResponse.class, Object.class)) {
                            int i7 = onNavigationEvent + 9;
                            onExtraCallbackWithResult = i7 % 128;
                            if (i7 % 2 != 0) {
                                Intrinsics.areEqual(LoanUsageReportResponse.class, Unit.class);
                                throw null;
                            }
                            if (!Intrinsics.areEqual(LoanUsageReportResponse.class, Unit.class)) {
                                TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                                apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                                throw apiErrorOnExtraCallbackWithResult;
                            }
                        }
                        LoanUsageReportResponse loanUsageReportResponse = Unit.INSTANCE;
                        int i8 = onNavigationEvent + 65;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        return loanUsageReportResponse;
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0222  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Throwable th;
            GeckoHubImp1 geckoHubImp1OnExtraCallback;
            GeckoHubImp1 geckoHubImp1OnExtraCallback2;
            Object objIAuthTabCallback;
            GeckoHubImp1 geckoHubImp1;
            int i;
            int i2;
            CreditScoreReportViewModel creditScoreReportViewModel;
            AnonymousClass3 anonymousClass3;
            ArrayList arrayList;
            Object objIAuthTabCallback2;
            List list;
            int i3;
            ScoreReportResponse scoreReportResponse;
            GeckoHubImp1 geckoHubImp12;
            GeckoHubImp1 geckoHubImp13;
            getCornerRadius getcornerradius;
            ScoreReportResponse scoreReportResponse2;
            CardUsageReportResponse cardUsageReportResponse;
            Object objIAuthTabCallback3;
            List list2;
            int i4 = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            int i6 = 0;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                int i7 = onWarmupCompleted + 81;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                CreditScoreReportViewModel creditScoreReportViewModel2 = CreditScoreReportViewModel.this;
                Result.Companion companion3 = Result.Companion;
                geckoHubImp1OnExtraCallback = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(creditScoreReportViewModel2, null), 3, (Object) null);
                geckoHubImp1OnExtraCallback2 = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(creditScoreReportViewModel2, null), 3, (Object) null);
                GeckoHubImp1 geckoHubImp1OnExtraCallback3 = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(creditScoreReportViewModel2, null), 3, (Object) null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = creditScoreReportViewModel2;
                this.L$2 = access15400.onNavigationEvent(this);
                this.L$3 = access15400.onNavigationEvent(geckoHubImp1OnExtraCallback);
                this.L$4 = geckoHubImp1OnExtraCallback2;
                this.L$5 = geckoHubImp1OnExtraCallback3;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                objIAuthTabCallback = geckoHubImp1OnExtraCallback.IAuthTabCallback(this);
                if (objIAuthTabCallback != objOnWarmupCompleted) {
                    geckoHubImp1 = geckoHubImp1OnExtraCallback3;
                    i = 0;
                    i2 = 0;
                    creditScoreReportViewModel = creditScoreReportViewModel2;
                    anonymousClass3 = this;
                }
                return objOnWarmupCompleted;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CardUsageReportResponse cardUsageReportResponse2 = (CardUsageReportResponse) this.L$9;
                    scoreReportResponse = (ScoreReportResponse) this.L$8;
                    getcornerradius = (getCornerRadius) this.L$7;
                    list2 = (List) this.L$5;
                    ResultKt.onNavigationEvent(obj);
                    cardUsageReportResponse = cardUsageReportResponse2;
                    objIAuthTabCallback3 = obj;
                    getcornerradius.onWarmupCompleted(Result.IAuthTabCallback(Result.constructor-impl(new addPermRequstCallback(scoreReportResponse, cardUsageReportResponse, (LoanUsageReportResponse) objIAuthTabCallback3, list2))));
                    obj2 = Result.constructor-impl(Unit.INSTANCE);
                    CreditScoreReportViewModel creditScoreReportViewModel3 = CreditScoreReportViewModel.this;
                    th = Result.exceptionOrNull-impl(obj2);
                    if (th != null) {
                        int i9 = onWarmupCompleted + 9;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        getCornerRadius getcornerradiusOnExtraCallbackWithResult = CreditScoreReportViewModel.onExtraCallbackWithResult(creditScoreReportViewModel3);
                        Result.Companion companion4 = Result.Companion;
                        getcornerradiusOnExtraCallbackWithResult.onWarmupCompleted(Result.IAuthTabCallback(Result.constructor-impl(ResultKt.createFailure(th))));
                    }
                    return Unit.INSTANCE;
                }
                int i11 = this.I$1;
                int i12 = this.I$0;
                ScoreReportResponse scoreReportResponse3 = (ScoreReportResponse) this.L$8;
                getCornerRadius getcornerradius2 = (getCornerRadius) this.L$7;
                scoreReportResponse2 = (ScoreReportResponse) this.L$6;
                list = (List) this.L$5;
                GeckoHubImp1 geckoHubImp14 = (GeckoHubImp1) this.L$4;
                geckoHubImp12 = (GeckoHubImp1) this.L$3;
                geckoHubImp13 = (GeckoHubImp1) this.L$2;
                anonymousClass3 = (access13800) this.L$1;
                ResultKt.onNavigationEvent(obj);
                i3 = i11;
                scoreReportResponse = scoreReportResponse3;
                i2 = i12;
                getcornerradius = getcornerradius2;
                geckoHubImp1 = geckoHubImp14;
                objIAuthTabCallback2 = obj;
                cardUsageReportResponse = (CardUsageReportResponse) objIAuthTabCallback2;
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(anonymousClass3);
                this.L$2 = access15400.onNavigationEvent(geckoHubImp13);
                this.L$3 = access15400.onNavigationEvent(geckoHubImp12);
                this.L$4 = access15400.onNavigationEvent(geckoHubImp1);
                this.L$5 = list;
                this.L$6 = access15400.onNavigationEvent(scoreReportResponse2);
                this.L$7 = getcornerradius;
                this.L$8 = scoreReportResponse;
                this.L$9 = cardUsageReportResponse;
                this.I$0 = i2;
                this.I$1 = i3;
                this.label = 3;
                objIAuthTabCallback3 = geckoHubImp1.IAuthTabCallback(this);
                if (objIAuthTabCallback3 != objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                list2 = list;
                getcornerradius.onWarmupCompleted(Result.IAuthTabCallback(Result.constructor-impl(new addPermRequstCallback(scoreReportResponse, cardUsageReportResponse, (LoanUsageReportResponse) objIAuthTabCallback3, list2))));
                obj2 = Result.constructor-impl(Unit.INSTANCE);
                CreditScoreReportViewModel creditScoreReportViewModel32 = CreditScoreReportViewModel.this;
                th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                }
                return Unit.INSTANCE;
            }
            i = this.I$1;
            int i13 = this.I$0;
            GeckoHubImp1 geckoHubImp15 = (GeckoHubImp1) this.L$5;
            GeckoHubImp1 geckoHubImp16 = (GeckoHubImp1) this.L$4;
            GeckoHubImp1 geckoHubImp17 = (GeckoHubImp1) this.L$3;
            AnonymousClass3 anonymousClass32 = (access13800) this.L$2;
            CreditScoreReportViewModel creditScoreReportViewModel4 = (CreditScoreReportViewModel) this.L$1;
            ResultKt.onNavigationEvent(obj);
            geckoHubImp1OnExtraCallback2 = geckoHubImp16;
            geckoHubImp1OnExtraCallback = geckoHubImp17;
            creditScoreReportViewModel = creditScoreReportViewModel4;
            geckoHubImp1 = geckoHubImp15;
            anonymousClass3 = anonymousClass32;
            i2 = i13;
            objIAuthTabCallback = obj;
            ScoreReportResponse scoreReportResponse4 = (ScoreReportResponse) objIAuthTabCallback;
            if (scoreReportResponse4 == null) {
                throw new IllegalStateException("scoreReport is null");
            }
            List listOnNavigationEvent = scoreReportResponse4.onNavigationEvent();
            if (listOnNavigationEvent != null) {
                List list3 = listOnNavigationEvent;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                while (!(!it.hasNext())) {
                    arrayList.add(AppLovinCmpErrorCode.onExtraCallback(isExecuted.onWarmupCompleted(isExecuted.IAuthTabCallback, (String) it.next(), new Object[i6], (Html.TagHandler) null, false, false, 28, (Object) null), (Function1) null, 1, (Object) null));
                    i6 = 0;
                }
            } else {
                arrayList = null;
            }
            getCornerRadius getcornerradiusOnExtraCallbackWithResult2 = CreditScoreReportViewModel.onExtraCallbackWithResult(creditScoreReportViewModel);
            Result.Companion companion5 = Result.Companion;
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = access15400.onNavigationEvent(anonymousClass3);
            this.L$2 = access15400.onNavigationEvent(geckoHubImp1OnExtraCallback);
            this.L$3 = access15400.onNavigationEvent(geckoHubImp1OnExtraCallback2);
            this.L$4 = geckoHubImp1;
            this.L$5 = arrayList;
            this.L$6 = access15400.onNavigationEvent(scoreReportResponse4);
            this.L$7 = getcornerradiusOnExtraCallbackWithResult2;
            this.L$8 = scoreReportResponse4;
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 2;
            objIAuthTabCallback2 = geckoHubImp1OnExtraCallback2.IAuthTabCallback(this);
            if (objIAuthTabCallback2 != objOnWarmupCompleted) {
                int i14 = onWarmupCompleted + 27;
                onExtraCallback = i14 % 128;
                if (i14 % 2 == 0) {
                    throw null;
                }
                list = arrayList;
                i3 = i;
                scoreReportResponse = scoreReportResponse4;
                geckoHubImp12 = geckoHubImp1OnExtraCallback2;
                geckoHubImp13 = geckoHubImp1OnExtraCallback;
                getcornerradius = getcornerradiusOnExtraCallbackWithResult2;
                scoreReportResponse2 = scoreReportResponse;
                cardUsageReportResponse = (CardUsageReportResponse) objIAuthTabCallback2;
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(anonymousClass3);
                this.L$2 = access15400.onNavigationEvent(geckoHubImp13);
                this.L$3 = access15400.onNavigationEvent(geckoHubImp12);
                this.L$4 = access15400.onNavigationEvent(geckoHubImp1);
                this.L$5 = list;
                this.L$6 = access15400.onNavigationEvent(scoreReportResponse2);
                this.L$7 = getcornerradius;
                this.L$8 = scoreReportResponse;
                this.L$9 = cardUsageReportResponse;
                this.I$0 = i2;
                this.I$1 = i3;
                this.label = 3;
                objIAuthTabCallback3 = geckoHubImp1.IAuthTabCallback(this);
                if (objIAuthTabCallback3 != objOnWarmupCompleted) {
                }
            }
            return objOnWarmupCompleted;
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallbackDefault + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("PREF_SCORE_REPORT_LAST_VIEWED_AT", this.IAuthTabCallback.IAuthTabCallbackDefault());
        } else {
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("PREF_SCORE_REPORT_LAST_VIEWED_AT", this.IAuthTabCallback.IAuthTabCallbackDefault());
            int i3 = 25 / 0;
        }
    }
}
