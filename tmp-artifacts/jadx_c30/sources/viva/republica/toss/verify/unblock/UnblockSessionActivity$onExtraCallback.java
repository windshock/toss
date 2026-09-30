package viva.republica.toss.verify.unblock;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.MapConverter;
import o.announceForAccessibility;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.writeRaw;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UnblockSessionActivity$onExtraCallback<Upstream, Downstream> implements deserializeUri {
    final /* synthetic */ MapConverter onExtraCallbackWithResult;
    final /* synthetic */ MapConverter onNavigationEvent;

    public UnblockSessionActivity$onExtraCallback(MapConverter mapConverter, MapConverter mapConverter2) {
        this.onNavigationEvent = mapConverter;
        this.onExtraCallbackWithResult = mapConverter2;
    }

    public final deserializeIp<announceForAccessibility> apply(writeRaw<BaseApiResponse<announceForAccessibility>> writeraw) {
        Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
        writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(new Function1<BaseApiResponse<announceForAccessibility>, deserializeIp<? extends announceForAccessibility>>() { // from class: viva.republica.toss.verify.unblock.UnblockSessionActivity$onExtraCallback.5
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final deserializeIp<? extends announceForAccessibility> invoke(BaseApiResponse<announceForAccessibility> baseApiResponse) throws IllegalAccessException, InstantiationException {
                Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        objOnTransact = announceForAccessibility.class.newInstance();
                    }
                    return writeRaw.onExtraCallback(objOnTransact);
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
            }
        }) { // from class: o.UtilsKtExternalSyntheticLambda17.BackHandlerKtExternalSyntheticLambda0
            private final /* synthetic */ Function1 onWarmupCompleted;

            public BackHandlerKtExternalSyntheticLambda0(Function1 function1) {
                Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
                this.onWarmupCompleted = function1;
            }

            public final /* synthetic */ Object apply(Object obj) {
                return this.onWarmupCompleted.invoke(obj);
            }
        });
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
