package viva.republica.toss.util;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.MapConverter;
import o.deserializeIp;
import o.deserializeUri;
import o.writeRaw;
import viva.republica.toss.util.RxUtils;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RxUtils$asSingleApiWorker$$inlined$asSingleApiWorker$default$2<Upstream, Downstream> implements deserializeUri {
    final /* synthetic */ MapConverter onNavigationEvent;
    final /* synthetic */ MapConverter onWarmupCompleted;

    public final deserializeIp<T> apply(writeRaw<BaseApiResponse<T>> writeraw) {
        Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
        Intrinsics.needClassReification();
        writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new RxUtils.sam.i.io_reactivex_functions_Function.0(new Function1<BaseApiResponse<T>, deserializeIp<? extends T>>() { // from class: viva.republica.toss.util.RxUtils$asSingleApiWorker$$inlined$asSingleApiWorker$default$2.1
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final deserializeIp<? extends T> invoke(BaseApiResponse<T> baseApiResponse) throws IllegalAccessException, InstantiationException {
                Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        Intrinsics.reifiedOperationMarker(4, "T");
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
        MapConverter mapConverter = this.onWarmupCompleted;
        if (mapConverter != null) {
            writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
        }
        MapConverter mapConverter2 = this.onNavigationEvent;
        if (mapConverter2 == null) {
            return writerawOnExtraCallbackWithResult;
        }
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
        return writerawIAuthTabCallback;
    }
}
