package o;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.verify.response.AutoVerifyAvailableBankAccountResp;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getNotBefore$onExtraCallback<Upstream, Downstream> implements deserializeUri {
    final /* synthetic */ MapConverter onExtraCallback;
    final /* synthetic */ MapConverter onWarmupCompleted;

    public getNotBefore$onExtraCallback(MapConverter mapConverter, MapConverter mapConverter2) {
        this.onWarmupCompleted = mapConverter;
        this.onExtraCallback = mapConverter2;
    }

    public final deserializeIp<AutoVerifyAvailableBankAccountResp> apply(writeRaw<BaseApiResponse<AutoVerifyAvailableBankAccountResp>> writeraw) {
        Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
        writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(new Function1<BaseApiResponse<AutoVerifyAvailableBankAccountResp>, deserializeIp<? extends AutoVerifyAvailableBankAccountResp>>() { // from class: o.getNotBefore$onExtraCallback.2
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final deserializeIp<? extends AutoVerifyAvailableBankAccountResp> invoke(BaseApiResponse<AutoVerifyAvailableBankAccountResp> baseApiResponse) throws IllegalAccessException, InstantiationException {
                Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        objOnTransact = AutoVerifyAvailableBankAccountResp.class.newInstance();
                    }
                    return writeRaw.onExtraCallback(objOnTransact);
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
            }
        }) { // from class: o.UtilsKtExternalSyntheticLambda17.removeOnTrimMemoryListener
            private final /* synthetic */ Function1 onWarmupCompleted;

            public removeOnTrimMemoryListener(Function1 function1) {
                Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
                this.onWarmupCompleted = function1;
            }

            public final /* synthetic */ Object apply(Object obj) {
                return this.onWarmupCompleted.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
        MapConverter mapConverter = this.onWarmupCompleted;
        if (mapConverter != null) {
            writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
        }
        MapConverter mapConverter2 = this.onExtraCallback;
        if (mapConverter2 == null) {
            return writerawOnExtraCallbackWithResult;
        }
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
        return writerawIAuthTabCallback;
    }
}
