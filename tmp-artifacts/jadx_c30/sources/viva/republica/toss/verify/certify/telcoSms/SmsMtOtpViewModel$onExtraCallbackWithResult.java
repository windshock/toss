package viva.republica.toss.verify.certify.telcoSms;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.verify.oneclicklogin.model.network.request.SmsPossessionVerifyRequest;
import im.toss.features.verify.oneclicklogin.model.network.response.SmsPossessionVerifyResponse;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import net.sf.scuba.smartcards.BuildConfig;
import o.GeckoHubImp;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.r8lambda4Oc4sno_nDNjTmEctIjSE6u7s;
import o.setOriginText;
import o.shouldAutoplay;
import o.writeRaw;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class SmsMtOtpViewModel$onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ long $sessionId;
    final /* synthetic */ String $verificationCode;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SmsMtOtpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SmsMtOtpViewModel$onExtraCallbackWithResult(SmsMtOtpViewModel smsMtOtpViewModel, String str, long j, access13800<? super SmsMtOtpViewModel$onExtraCallbackWithResult> access13800Var) {
        super(2, access13800Var);
        this.this$0 = smsMtOtpViewModel;
        this.$verificationCode = str;
        this.$sessionId = j;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new SmsMtOtpViewModel$onExtraCallbackWithResult(this.this$0, this.$verificationCode, this.$sessionId, access13800Var);
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
        Object obj2;
        Throwable th;
        long j;
        int i;
        Object objOnExtraCallbackWithResult;
        SmsMtOtpViewModel smsMtOtpViewModel;
        SmsMtOtpViewModel$onExtraCallbackWithResult smsMtOtpViewModel$onExtraCallbackWithResult;
        int i2;
        SmsMtOtpViewModel smsMtOtpViewModel2;
        Object objOnTransact;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
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
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            SmsMtOtpViewModel smsMtOtpViewModel3 = this.this$0;
            String str = this.$verificationCode;
            j = this.$sessionId;
            Result.Companion companion3 = Result.Companion;
            shouldAutoplay shouldautoplayOnNavigationEvent = SmsMtOtpViewModel.onNavigationEvent(smsMtOtpViewModel3);
            SmsPossessionVerifyRequest smsPossessionVerifyRequest = new SmsPossessionVerifyRequest((String) null, SmsMtOtpViewModel.onExtraCallback(smsMtOtpViewModel3), str, 1, (DefaultConstructorMarker) null);
            this.L$0 = smsMtOtpViewModel3;
            this.L$1 = access15400.onNavigationEvent(this);
            this.J$0 = j;
            i = 0;
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 1;
            objOnExtraCallbackWithResult = shouldautoplayOnNavigationEvent.onExtraCallbackWithResult(smsPossessionVerifyRequest, this);
            if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                smsMtOtpViewModel = smsMtOtpViewModel3;
                smsMtOtpViewModel$onExtraCallbackWithResult = this;
                i2 = 0;
            }
            return objOnWarmupCompleted;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            smsMtOtpViewModel2 = (SmsMtOtpViewModel) this.L$0;
            ResultKt.onNavigationEvent(obj);
            smsMtOtpViewModel2.onWarmupCompleted().setValue(access14000.onExtraCallback(SmsMtOtpViewModel.onExtraCallback(smsMtOtpViewModel2)));
            obj2 = Result.constructor-impl(Unit.INSTANCE);
            SmsMtOtpViewModel smsMtOtpViewModel4 = this.this$0;
            th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                smsMtOtpViewModel4.IAuthTabCallback().setValue(th);
            }
            return Unit.INSTANCE;
        }
        int i4 = this.I$1;
        int i5 = this.I$0;
        long j2 = this.J$0;
        smsMtOtpViewModel$onExtraCallbackWithResult = (access13800) this.L$1;
        smsMtOtpViewModel = (SmsMtOtpViewModel) this.L$0;
        ResultKt.onNavigationEvent(obj);
        j = j2;
        i = i4;
        i2 = i5;
        objOnExtraCallbackWithResult = obj;
        BaseApiResponse baseApiResponse = (BaseApiResponse) objOnExtraCallbackWithResult;
        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
            try {
                objOnTransact = baseApiResponse.onTransact();
            } catch (NullPointerException e4) {
                if (!Intrinsics.areEqual(SmsPossessionVerifyResponse.class, Object.class) && !Intrinsics.areEqual(SmsPossessionVerifyResponse.class, Unit.class)) {
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e4);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
                SmsPossessionVerifyResponse smsPossessionVerifyResponse = Unit.INSTANCE;
            }
            if (objOnTransact == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.features.verify.oneclicklogin.model.network.response.SmsPossessionVerifyResponse");
            }
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(smsMtOtpViewModel, j, null);
            this.L$0 = smsMtOtpViewModel;
            this.L$1 = access15400.onNavigationEvent(smsMtOtpViewModel$onExtraCallbackWithResult);
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 2;
            if (maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, iAuthTabCallback, this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            smsMtOtpViewModel2 = smsMtOtpViewModel;
            smsMtOtpViewModel2.onWarmupCompleted().setValue(access14000.onExtraCallback(SmsMtOtpViewModel.onExtraCallback(smsMtOtpViewModel2)));
            obj2 = Result.constructor-impl(Unit.INSTANCE);
            SmsMtOtpViewModel smsMtOtpViewModel42 = this.this$0;
            th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
            }
            return Unit.INSTANCE;
        }
        TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
        if (apiErrorExtraCallbackWithResult == null) {
            throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
        }
        throw apiErrorExtraCallbackWithResult;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        final /* synthetic */ long $sessionId;
        int label;
        final /* synthetic */ SmsMtOtpViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(SmsMtOtpViewModel smsMtOtpViewModel, long j, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.this$0 = smsMtOtpViewModel;
            this.$sessionId = j;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallback(this.this$0, this.$sessionId, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                writeRaw writerawOnNavigationEvent = SmsMtOtpViewModel.onNavigationEvent(this.this$0).onNavigationEvent(new r8lambda4Oc4sno_nDNjTmEctIjSE6u7s(this.$sessionId, setOriginText.SMS_MT, access14000.onExtraCallback(SmsMtOtpViewModel.onExtraCallback(this.this$0))));
                this.label = 1;
                obj = RxAwaitKt.onWarmupCompleted(writerawOnNavigationEvent, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Intrinsics.checkNotNullExpressionValue(obj, BuildConfig.FLAVOR);
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (Boolean) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(Boolean.class, Object.class) || Intrinsics.areEqual(Boolean.class, Unit.class)) {
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
}
