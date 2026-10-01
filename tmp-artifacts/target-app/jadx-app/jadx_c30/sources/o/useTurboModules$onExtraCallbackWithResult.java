package o;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class useTurboModules$onExtraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
    final /* synthetic */ MapConverter IAuthTabCallback;
    final /* synthetic */ MapConverter onExtraCallbackWithResult;

    public useTurboModules$onExtraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
        this.IAuthTabCallback = mapConverter;
        this.onExtraCallbackWithResult = mapConverter2;
    }

    public final deserializeIp<getReactApplicationContext> apply(writeRaw<BaseApiResponse<getReactApplicationContext>> writeraw) {
        Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
        writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(new Function1<BaseApiResponse<getReactApplicationContext>, deserializeIp<? extends getReactApplicationContext>>() { // from class: o.useTurboModules$onExtraCallbackWithResult.3
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final deserializeIp<? extends getReactApplicationContext> invoke(BaseApiResponse<getReactApplicationContext> baseApiResponse) throws IllegalAccessException, InstantiationException {
                Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        objOnTransact = getReactApplicationContext.class.newInstance();
                    }
                    return writeRaw.onExtraCallback(objOnTransact);
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
            }
        }) { // from class: o.UtilsKtExternalSyntheticLambda17.Rid
            private final /* synthetic */ Function1 onNavigationEvent;

            public Rid(Function1 function1) {
                Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
                this.onNavigationEvent = function1;
            }

            public final /* synthetic */ Object apply(Object obj) {
                return this.onNavigationEvent.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
        MapConverter mapConverter = this.IAuthTabCallback;
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
