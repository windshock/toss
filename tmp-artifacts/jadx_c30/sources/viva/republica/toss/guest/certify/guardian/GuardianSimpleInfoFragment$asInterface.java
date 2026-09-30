package viva.republica.toss.guest.certify.guardian;

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
import o.getTurboModuleRegistry;
import o.writeRaw;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GuardianSimpleInfoFragment$asInterface<Upstream, Downstream> implements deserializeUri {
    final /* synthetic */ MapConverter onNavigationEvent;
    final /* synthetic */ MapConverter onWarmupCompleted;

    public GuardianSimpleInfoFragment$asInterface(MapConverter mapConverter, MapConverter mapConverter2) {
        this.onWarmupCompleted = mapConverter;
        this.onNavigationEvent = mapConverter2;
    }

    public final deserializeIp<getTurboModuleRegistry> apply(writeRaw<BaseApiResponse<getTurboModuleRegistry>> writeraw) {
        Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
        writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17.onStateChanged(new Function1<BaseApiResponse<getTurboModuleRegistry>, deserializeIp<? extends getTurboModuleRegistry>>() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoFragment$asInterface.2
            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final deserializeIp<? extends getTurboModuleRegistry> invoke(BaseApiResponse<getTurboModuleRegistry> baseApiResponse) throws IllegalAccessException, InstantiationException {
                Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        objOnTransact = getTurboModuleRegistry.class.newInstance();
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
