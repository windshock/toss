package viva.republica.toss.cardrecommend.issuev2.ui;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertFloatArrayToByteArray;
import o.DefaultMediaViewVideoRenderer;
import o.GeckoHubImp;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertResultRequest;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertResultResp;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class CardIssueFinCertSignActivity$IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ String $certSeqNum;
    final /* synthetic */ String $rValue;
    final /* synthetic */ String $rrn;
    final /* synthetic */ String $signedAt;
    final /* synthetic */ String $signedVal;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    int label;
    final /* synthetic */ CardIssueFinCertSignActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardIssueFinCertSignActivity$IAuthTabCallback(CardIssueFinCertSignActivity cardIssueFinCertSignActivity, String str, String str2, String str3, String str4, String str5, access13800<? super CardIssueFinCertSignActivity$IAuthTabCallback> access13800Var) {
        super(2, access13800Var);
        this.this$0 = cardIssueFinCertSignActivity;
        this.$signedVal = str;
        this.$certSeqNum = str2;
        this.$signedAt = str3;
        this.$rValue = str4;
        this.$rrn = str5;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new CardIssueFinCertSignActivity$IAuthTabCallback(this.this$0, this.$signedVal, this.$certSeqNum, this.$signedAt, this.$rValue, this.$rrn, access13800Var);
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CardIssueFinCertResultResp>, Object> {
        final /* synthetic */ String $certSeqNum$inlined;
        final /* synthetic */ String $rValue$inlined;
        final /* synthetic */ String $rrn$inlined;
        final /* synthetic */ String $signedAt$inlined;
        final /* synthetic */ String $signedVal$inlined;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ CardIssueFinCertSignActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(access13800 access13800Var, CardIssueFinCertSignActivity cardIssueFinCertSignActivity, String str, String str2, String str3, String str4, String str5) {
            super(2, access13800Var);
            this.this$0 = cardIssueFinCertSignActivity;
            this.$signedVal$inlined = str;
            this.$certSeqNum$inlined = str2;
            this.$signedAt$inlined = str3;
            this.$rValue$inlined = str4;
            this.$rrn$inlined = str5;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super CardIssueFinCertResultResp> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallbackWithResult(access13800Var, this.this$0, this.$signedVal$inlined, this.$certSeqNum$inlined, this.$signedAt$inlined, this.$rValue$inlined, this.$rrn$inlined);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                DefaultMediaViewVideoRenderer defaultMediaViewVideoRendererIAuthTabCallback = this.this$0.IAuthTabCallback();
                String strIAuthTabCallbackDefault = CardIssueFinCertSignActivity.IAuthTabCallbackDefault(this.this$0);
                String strOnWarmupCompleted = CardIssueFinCertSignActivity.onWarmupCompleted(this.this$0);
                long jOnExtraCallback = CardIssueFinCertSignActivity.onExtraCallback(this.this$0);
                String str = this.$signedVal$inlined;
                String str2 = this.$certSeqNum$inlined;
                Intrinsics.checkNotNull(this.$signedAt$inlined);
                CardIssueFinCertResultRequest cardIssueFinCertResultRequest = new CardIssueFinCertResultRequest(strIAuthTabCallbackDefault, strOnWarmupCompleted, jOnExtraCallback, str, str2, this.$signedAt$inlined, this.$rValue$inlined, this.$rrn$inlined);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = defaultMediaViewVideoRendererIAuthTabCallback.onExtraCallbackWithResult(cardIssueFinCertResultRequest, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (CardIssueFinCertResultResp) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertResultResp");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(CardIssueFinCertResultResp.class, Object.class) || Intrinsics.areEqual(CardIssueFinCertResultResp.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                CardIssueFinCertSignActivity cardIssueFinCertSignActivity = this.this$0;
                String str = this.$signedVal;
                String str2 = this.$certSeqNum;
                String str3 = this.$signedAt;
                String str4 = this.$rValue;
                String str5 = this.$rrn;
                Result.Companion companion = Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(null, cardIssueFinCertSignActivity, str, str2, str3, str4, str5);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.I$2 = 0;
                this.label = 1;
                obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            obj2 = Result.constructor-impl(obj);
        } catch (Exception e) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e));
        } catch (WebResourceResponseModel e2) {
            Result.Companion companion3 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (CancellationException e3) {
            throw e3;
        }
        CardIssueFinCertSignActivity cardIssueFinCertSignActivity2 = this.this$0;
        if (Result.onNavigationEvent(obj2)) {
            cardIssueFinCertSignActivity2.setResult(-1);
            cardIssueFinCertSignActivity2.finish();
        }
        CardIssueFinCertSignActivity cardIssueFinCertSignActivity3 = this.this$0;
        Throwable th = Result.exceptionOrNull-impl(obj2);
        if (th != null) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FinCertSign", "saveFinCertResult failed", th, (Map) null, 8, (Object) null);
            CardIssueFinCertSignActivity.onExtraCallbackWithResult(cardIssueFinCertSignActivity3);
        }
        return Unit.INSTANCE;
    }
}
