package viva.republica.toss.cardrecommend.issuev2.ui.smsverify;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.MapConverter;
import o.UtilsKtExternalSyntheticLambda17;
import o.deserializeIp;
import o.deserializeUri;
import o.setNativeOption;
import o.writeRaw;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CardIssueSmsVerifyFragment$onExtraCallback<Upstream, Downstream> implements deserializeUri {
    final /* synthetic */ MapConverter onExtraCallbackWithResult;
    final /* synthetic */ MapConverter onNavigationEvent;

    public CardIssueSmsVerifyFragment$onExtraCallback(MapConverter mapConverter, MapConverter mapConverter2) {
        this.onNavigationEvent = mapConverter;
        this.onExtraCallbackWithResult = mapConverter2;
    }

    public final deserializeIp<setNativeOption> apply(writeRaw<BaseApiResponse<setNativeOption>> writeraw) {
        Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
        writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17.peekAvailableContext(new Function1<BaseApiResponse<setNativeOption>, deserializeIp<? extends setNativeOption>>() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyFragment$onExtraCallback.2
            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final deserializeIp<? extends setNativeOption> invoke(BaseApiResponse<setNativeOption> baseApiResponse) throws IllegalAccessException, InstantiationException {
                Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        objOnTransact = setNativeOption.class.newInstance();
                    }
                    return writeRaw.onExtraCallback(objOnTransact);
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
        MapConverter mapConverter = this.onNavigationEvent;
        if (mapConverter != null) {
            writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
        }
        MapConverter mapConverter2 = this.onExtraCallbackWithResult;
        if (mapConverter2 == null) {
            return writerawOnExtraCallbackWithResult;
        }
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
        return writerawIAuthTabCallback;
    }
}
