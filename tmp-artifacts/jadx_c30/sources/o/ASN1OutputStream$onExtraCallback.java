package o;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.UtilsKtExternalSyntheticLambda17;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ASN1OutputStream$onExtraCallback<Upstream, Downstream> implements deserializeUri {
    final /* synthetic */ MapConverter onExtraCallbackWithResult;
    final /* synthetic */ MapConverter onWarmupCompleted;

    public ASN1OutputStream$onExtraCallback(MapConverter mapConverter, MapConverter mapConverter2) {
        this.onExtraCallbackWithResult = mapConverter;
        this.onWarmupCompleted = mapConverter2;
    }

    public final deserializeIp<Boolean> apply(writeRaw<BaseApiResponse<Boolean>> writeraw) {
        Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
        writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17.onConfigurationChanged(new Function1<BaseApiResponse<Boolean>, deserializeIp<? extends Boolean>>() { // from class: o.ASN1OutputStream$onExtraCallback.5
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final deserializeIp<? extends Boolean> invoke(BaseApiResponse<Boolean> baseApiResponse) throws IllegalAccessException, InstantiationException {
                Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        objOnTransact = Boolean.class.newInstance();
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
