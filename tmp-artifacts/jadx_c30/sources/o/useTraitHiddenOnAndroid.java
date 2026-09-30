package o;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.UtilsKtExternalSyntheticLambda17;
import o._string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.BankAccountHolderRequestWithSessionInfo;
import viva.republica.toss.network.model.verify.BankAccountHolderResponse;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class useTraitHiddenOnAndroid {
    private final String IAuthTabCallback;
    private final shouldAutoplay onExtraCallback;
    private String onExtraCallbackWithResult;
    private final long onWarmupCompleted;

    public useTraitHiddenOnAndroid(@NotNull String str, long j, @NotNull shouldAutoplay shouldautoplay) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(shouldautoplay, BuildConfig.FLAVOR);
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = j;
        this.onExtraCallback = shouldautoplay;
    }

    public final writeRaw<BankAccountHolderResponse> onWarmupCompleted(long j, long j2, @NotNull String str, @NotNull String str2, long j3) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        if (addExtra.onExtraCallback(PlayerErrorCode.onWarmupCompleted)) {
            shouldAutoplay shouldautoplay = this.onExtraCallback;
            BankAccountHolderRequestWithSessionInfo bankAccountHolderRequestWithSessionInfo = new BankAccountHolderRequestWithSessionInfo(j2, str, Long.valueOf(j), PlayerErrorCode.onPostMessage(), str2, j3);
            bankAccountHolderRequestWithSessionInfo.onExtraCallbackWithResult(this.IAuthTabCallback, this.onWarmupCompleted);
            writeRaw writerawOnWarmupCompleted = shouldautoplay.onWarmupCompleted(bankAccountHolderRequestWithSessionInfo);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, BuildConfig.FLAVOR);
            writeRaw<BankAccountHolderResponse> writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
            return writerawIAuthTabCallback;
        }
        getCatalystInstance getcatalystinstance = new getCatalystInstance(j2, str, Long.valueOf(j));
        getcatalystinstance.onExtraCallbackWithResult(this.IAuthTabCallback, this.onWarmupCompleted);
        writeRaw writerawOnNavigationEvent = this.onExtraCallback.onNavigationEvent(getcatalystinstance);
        MapConverter mapConverterOnExtraCallback2 = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback2, BuildConfig.FLAVOR);
        writeRaw<BankAccountHolderResponse> writerawIAuthTabCallback2 = writerawOnNavigationEvent.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback2, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, BuildConfig.FLAVOR);
        return writerawIAuthTabCallback2;
    }

    public static final class onExtraCallback<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onNavigationEvent;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onExtraCallback(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        public final deserializeIp<BankAccountHolderResponse> apply(writeRaw<BaseApiResponse<BankAccountHolderResponse>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0(new Function1<BaseApiResponse<BankAccountHolderResponse>, deserializeIp<? extends BankAccountHolderResponse>>() { // from class: o.useTraitHiddenOnAndroid.onExtraCallback.1
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends BankAccountHolderResponse> invoke(BaseApiResponse<BankAccountHolderResponse> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = BankAccountHolderResponse.class.newInstance();
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

    public static final class onExtraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public onExtraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallback = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        public final deserializeIp<BridgeReactContext> apply(writeRaw<BaseApiResponse<BridgeReactContext>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0(new Function1<BaseApiResponse<BridgeReactContext>, deserializeIp<? extends BridgeReactContext>>() { // from class: o.useTraitHiddenOnAndroid.onExtraCallbackWithResult.2
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends BridgeReactContext> invoke(BaseApiResponse<BridgeReactContext> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = BridgeReactContext.class.newInstance();
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
            MapConverter mapConverter = this.onExtraCallback;
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

    public static final class onNavigationEvent<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public onNavigationEvent(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<getFabricUIManager> apply(writeRaw<BaseApiResponse<getFabricUIManager>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0(new Function1<BaseApiResponse<getFabricUIManager>, deserializeIp<? extends getFabricUIManager>>() { // from class: o.useTraitHiddenOnAndroid.onNavigationEvent.4
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends getFabricUIManager> invoke(BaseApiResponse<getFabricUIManager> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = getFabricUIManager.class.newInstance();
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
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
            return writerawIAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onNavigationEvent;

        public onWarmupCompleted(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onNavigationEvent = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<BankAccountHolderResponse> apply(writeRaw<BaseApiResponse<BankAccountHolderResponse>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0(new Function1<BaseApiResponse<BankAccountHolderResponse>, deserializeIp<? extends BankAccountHolderResponse>>() { // from class: o.useTraitHiddenOnAndroid.onWarmupCompleted.2
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends BankAccountHolderResponse> invoke(BaseApiResponse<BankAccountHolderResponse> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = BankAccountHolderResponse.class.newInstance();
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
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
            return writerawIAuthTabCallback;
        }
    }

    public final writeRaw<getFabricUIManager> onExtraCallback(long j, long j2, @NotNull String str, long j3) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Object[] objArr = {CommonModule_closeView.onWarmupCompleted};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        this.onExtraCallbackWithResult = ((IdGeneratorExternalSyntheticLambda1) CommonModule_closeView.onExtraCallbackWithResult(1967451170, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, -1967451168, _string.onNavigationEvent.IAuthTabCallback(), objArr, _string.onNavigationEvent.IAuthTabCallback())).format(zzaj.onWarmupCompleted().asBinder());
        raiseCatalystInstanceMissingException raisecatalystinstancemissingexception = new raiseCatalystInstanceMissingException(j3, j2, str, Long.valueOf(j));
        raisecatalystinstancemissingexception.onExtraCallbackWithResult(this.IAuthTabCallback, this.onWarmupCompleted);
        writeRaw writerawIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(raisecatalystinstancemissingexception);
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, BuildConfig.FLAVOR);
        writeRaw<getFabricUIManager> writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, BuildConfig.FLAVOR);
        return writerawIAuthTabCallback2;
    }

    public final writeRaw<useShadowNodeStateOnClone> onExtraCallbackWithResult(long j, @Nullable Long l) {
        return new useTurboModules(j, this.onExtraCallbackWithResult, "토스", 3, NestmincrementPendingJSCalls.TOSS_CORE, l).onExtraCallbackWithResult();
    }

    public final writeRaw<BridgeReactContext> onExtraCallback(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        writeRaw writerawIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(new getJSCallInvokerHolder(j, str));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, BuildConfig.FLAVOR);
        writeRaw<BridgeReactContext> writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, BuildConfig.FLAVOR);
        return writerawIAuthTabCallback2;
    }
}
