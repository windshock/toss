package o;

import dagger.Lazy;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tracker.ObjectionConsentStatusResponse;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1kSDKAFa1uSDK implements AFj1mSDKExternalSyntheticLambda0 {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Lazy<AFj1mSDKExternalSyntheticLambda2> onWarmupCompleted;

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = AFj1kSDKAFa1uSDK.this.onExtraCallbackWithResult(null, this);
            int i4 = onNavigationEvent + 67;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static {
        int i = onExtraCallback + 57;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public AFj1kSDKAFa1uSDK(@NotNull Lazy<AFj1mSDKExternalSyntheticLambda2> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "");
        this.onWarmupCompleted = lazy;
    }

    private final String onExtraCallbackWithResult(onViewDraw onviewdraw) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted.onWarmupCompleted[onviewdraw.ordinal()];
        if (i2 != 1) {
            int i3 = onNavigationEvent;
            int i4 = i3 + 47;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0 ? i2 != 2 : i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = i3 + 47;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return "PRODUCT_ANALYTICS_IMPROVEMENT";
            }
            throw null;
        }
        return "PERSONALIZED_MARKETING_PROMOTIONS";
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // o.AFj1mSDKExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(@NotNull onViewDraw onviewdraw, @NotNull access13800<? super r8lambdaFdmIAA_UXINhmXHoAAx2CLnc4EQ> access13800Var) throws TossApiCallException.ApiError {
        onNavigationEvent onnavigationevent;
        ObjectionConsentStatusResponse objectionConsentStatusResponse;
        Object objOnTransact;
        int i = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onNavigationEvent + 25;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    onnavigationevent.label = i2 % Integer.MIN_VALUE;
                } else {
                    onnavigationevent.label = i2 - 2147483648;
                }
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object objOnExtraCallbackWithResult = onnavigationevent.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i4 = onnavigationevent.label;
        if (i4 != 0) {
            int i5 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            AFj1mSDKExternalSyntheticLambda2 aFj1mSDKExternalSyntheticLambda2 = (AFj1mSDKExternalSyntheticLambda2) this.onWarmupCompleted.get();
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult(onviewdraw);
            long termsId = onviewdraw.getTermsId();
            onnavigationevent.L$0 = access15400.onNavigationEvent(onviewdraw);
            onnavigationevent.label = 1;
            objOnExtraCallbackWithResult = aFj1mSDKExternalSyntheticLambda2.onExtraCallbackWithResult(strOnExtraCallbackWithResult, termsId, onnavigationevent);
            if (objOnExtraCallbackWithResult == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        }
        BaseApiResponse baseApiResponse = (BaseApiResponse) objOnExtraCallbackWithResult;
        if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
        try {
            objOnTransact = baseApiResponse.onTransact();
        } catch (NullPointerException e) {
            if (!Intrinsics.areEqual(ObjectionConsentStatusResponse.class, Object.class) && !Intrinsics.areEqual(ObjectionConsentStatusResponse.class, Unit.class)) {
                TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                throw apiErrorOnExtraCallbackWithResult;
            }
            objectionConsentStatusResponse = Unit.INSTANCE;
        }
        if (objOnTransact == null) {
            throw new NullPointerException("null cannot be cast to non-null type im.toss.tracker.ObjectionConsentStatusResponse");
        }
        objectionConsentStatusResponse = (ObjectionConsentStatusResponse) objOnTransact;
        int i6 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return new r8lambdaFdmIAA_UXINhmXHoAAx2CLnc4EQ(objectionConsentStatusResponse.onExtraCallbackWithResult(), objectionConsentStatusResponse.onWarmupCompleted());
    }
}
