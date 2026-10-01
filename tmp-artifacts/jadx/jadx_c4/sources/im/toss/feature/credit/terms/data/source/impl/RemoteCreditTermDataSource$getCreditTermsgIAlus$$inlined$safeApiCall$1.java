package im.toss.feature.credit.terms.data.source.impl;

import im.toss.feature.credit.terms.network.response.IntegrationTermsResponse;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CrashOptimizeSwitch;
import o.access13800;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.getQuestionnaireOptSwitch;

/* renamed from: im.toss.feature.credit.terms.data.source.impl.RemoteCreditTermDataSource$getCreditTerms-gIAlu-s$$inlined$safeApiCall$1, reason: invalid class name */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RemoteCreditTermDataSource$getCreditTermsgIAlus$$inlined$safeApiCall$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super IntegrationTermsResponse>, Object> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ CrashOptimizeSwitch $termsType$inlined;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ RemoteCreditTermDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCreditTermDataSource$getCreditTermsgIAlus$$inlined$safeApiCall$1(access13800 access13800Var, RemoteCreditTermDataSource remoteCreditTermDataSource, CrashOptimizeSwitch crashOptimizeSwitch) {
        super(2, access13800Var);
        this.this$0 = remoteCreditTermDataSource;
        this.$termsType$inlined = crashOptimizeSwitch;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super IntegrationTermsResponse> access13800Var) throws TossApiCallException.ApiError {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        RemoteCreditTermDataSource$getCreditTermsgIAlus$$inlined$safeApiCall$1 remoteCreditTermDataSource$getCreditTermsgIAlus$$inlined$safeApiCall$1Create = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            remoteCreditTermDataSource$getCreditTermsgIAlus$$inlined$safeApiCall$1Create.invokeSuspend(unit);
            throw null;
        }
        Object objInvokeSuspend = remoteCreditTermDataSource$getCreditTermsgIAlus$$inlined$safeApiCall$1Create.invokeSuspend(unit);
        int i4 = onNavigationEvent + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        obj.hashCode();
        throw null;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RemoteCreditTermDataSource$getCreditTermsgIAlus$$inlined$safeApiCall$1 remoteCreditTermDataSource$getCreditTermsgIAlus$$inlined$safeApiCall$1 = new RemoteCreditTermDataSource$getCreditTermsgIAlus$$inlined$safeApiCall$1(access13800Var, this.this$0, this.$termsType$inlined);
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return remoteCreditTermDataSource$getCreditTermsgIAlus$$inlined$safeApiCall$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = onWarmupCompleted + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return objIAuthTabCallback;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            getQuestionnaireOptSwitch getquestionnaireoptswitchOnNavigationEvent = RemoteCreditTermDataSource.onNavigationEvent(this.this$0);
            String strName = this.$termsType$inlined.name();
            this.L$0 = access15400.onNavigationEvent(this);
            this.I$0 = 0;
            this.label = 1;
            obj = getquestionnaireoptswitchOnNavigationEvent.onNavigationEvent(strName, this);
            if (obj == objOnWarmupCompleted) {
                int i3 = onWarmupCompleted + 67;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = onWarmupCompleted + 103;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
        }
        BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult != null) {
                throw apiErrorExtraCallbackWithResult;
            }
            int i7 = onWarmupCompleted + 29;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            TossApiCallException.ApiError.onExtraCallback onextracallback = TossApiCallException.ApiError.Companion;
            if (i8 != 0) {
                throw onextracallback.onExtraCallbackWithResult(baseApiResponse);
            }
            onextracallback.onExtraCallbackWithResult(baseApiResponse);
            throw null;
        }
        int i9 = onNavigationEvent + 87;
        onWarmupCompleted = i9 % 128;
        try {
            if (i9 % 2 != 0) {
                baseApiResponse.onTransact();
                throw null;
            }
            Object objOnTransact = baseApiResponse.onTransact();
            if (objOnTransact != null) {
                return (IntegrationTermsResponse) objOnTransact;
            }
            throw new NullPointerException("null cannot be cast to non-null type im.toss.feature.credit.terms.network.response.IntegrationTermsResponse");
        } catch (NullPointerException e) {
            if (!Intrinsics.areEqual(IntegrationTermsResponse.class, Object.class) && !Intrinsics.areEqual(IntegrationTermsResponse.class, Unit.class)) {
                TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                throw apiErrorOnExtraCallbackWithResult;
            }
            IntegrationTermsResponse integrationTermsResponse = Unit.INSTANCE;
            int i10 = onWarmupCompleted + 89;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                return integrationTermsResponse;
            }
            throw null;
        }
    }
}
