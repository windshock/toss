package viva.republica.toss.guest.certify;

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
import o.writeRaw;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CertifyGuestViewModel$extraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
    final /* synthetic */ MapConverter onExtraCallbackWithResult;
    final /* synthetic */ MapConverter onWarmupCompleted;

    public CertifyGuestViewModel$extraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
        this.onExtraCallbackWithResult = mapConverter;
        this.onWarmupCompleted = mapConverter2;
    }

    public final deserializeIp<Object> apply(writeRaw<BaseApiResponse<Object>> writeraw) {
        Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
        writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17.invoke(new Function1<BaseApiResponse<Object>, deserializeIp<? extends Object>>() { // from class: viva.republica.toss.guest.certify.CertifyGuestViewModel$extraCallbackWithResult.2
            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final deserializeIp<? extends Object> invoke(BaseApiResponse<Object> baseApiResponse) throws IllegalAccessException, InstantiationException {
                Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        objOnTransact = Object.class.newInstance();
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
        MapConverter mapConverter = this.onExtraCallbackWithResult;
        if (mapConverter != null) {
            writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
        }
        MapConverter mapConverter2 = this.onWarmupCompleted;
        if (mapConverter2 == null) {
            return writerawOnExtraCallbackWithResult;
        }
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
        return writerawIAuthTabCallback;
    }
}
