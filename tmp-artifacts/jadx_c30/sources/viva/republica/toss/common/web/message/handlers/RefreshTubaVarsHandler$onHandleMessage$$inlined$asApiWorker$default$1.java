package viva.republica.toss.common.web.message.handlers;

import im.toss.core.tuba.VarsResult;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.MapConverter;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.writeRaw;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RefreshTubaVarsHandler$onHandleMessage$$inlined$asApiWorker$default$1<Upstream, Downstream> implements deserializeUri {
    final /* synthetic */ MapConverter IAuthTabCallback;
    final /* synthetic */ MapConverter onExtraCallbackWithResult;

    public RefreshTubaVarsHandler$onHandleMessage$$inlined$asApiWorker$default$1(MapConverter mapConverter, MapConverter mapConverter2) {
        this.onExtraCallbackWithResult = mapConverter;
        this.IAuthTabCallback = mapConverter2;
    }

    public final deserializeIp<VarsResult> apply(writeRaw<BaseApiResponse<VarsResult>> writeraw) {
        Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
        final AnonymousClass1 anonymousClass1 = new Function1<BaseApiResponse<VarsResult>, deserializeIp<? extends VarsResult>>() { // from class: viva.republica.toss.common.web.message.handlers.RefreshTubaVarsHandler$onHandleMessage$$inlined$asApiWorker$default$1.1
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final deserializeIp<? extends VarsResult> invoke(BaseApiResponse<VarsResult> baseApiResponse) throws IllegalAccessException, InstantiationException {
                Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        objOnTransact = VarsResult.class.newInstance();
                    }
                    return writeRaw.onExtraCallback(objOnTransact);
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
            }
        };
        writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass1) { // from class: viva.republica.toss.common.web.message.handlers.RefreshTubaVarsHandler$inlined$sam$i$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 onExtraCallbackWithResult;

            {
                Intrinsics.checkNotNullParameter(anonymousClass1, BuildConfig.FLAVOR);
                this.onExtraCallbackWithResult = anonymousClass1;
            }

            public final /* synthetic */ Object apply(Object obj) {
                return this.onExtraCallbackWithResult.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
        MapConverter mapConverter = this.onExtraCallbackWithResult;
        if (mapConverter != null) {
            writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
        }
        MapConverter mapConverter2 = this.IAuthTabCallback;
        if (mapConverter2 == null) {
            return writerawOnExtraCallbackWithResult;
        }
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
        return writerawIAuthTabCallback;
    }
}
