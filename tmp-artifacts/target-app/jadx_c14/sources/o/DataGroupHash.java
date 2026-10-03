package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.Benchmark;
import o.getViewTypeCount;
import o.setClickTrackingUrls;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DataGroupHash {

    public static final /* synthetic */ class IAuthTabCallbackStub {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[Benchmark.onExtraCallbackWithResult.IAuthTabCallback.values().length];
            try {
                iArr[Benchmark.onExtraCallbackWithResult.IAuthTabCallback.BLUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Benchmark.onExtraCallbackWithResult.IAuthTabCallback.TEAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Benchmark.onExtraCallbackWithResult.IAuthTabCallback.GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Benchmark.onExtraCallbackWithResult.IAuthTabCallback.RED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Benchmark.onExtraCallbackWithResult.IAuthTabCallback.YELLOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Benchmark.onExtraCallbackWithResult.IAuthTabCallback.ELEPHANT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public static final class asBinder implements Function1 {
        public static final asBinder onExtraCallbackWithResult = new asBinder();

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Benchmark.onExtraCallback onextracallback) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, boolean z, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        onExtraCallback(quirksExternalSyntheticBackport0, list, z, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onExtraCallback(@org.jetbrains.annotations.NotNull final o.QuirksExternalSyntheticBackport0 r19, @org.jetbrains.annotations.NotNull final java.util.List<o.Benchmark.onExtraCallback> r20, final boolean r21, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super o.Benchmark.onExtraCallback, kotlin.Unit> r22, @org.jetbrains.annotations.Nullable o.CameraCaptureResultEmptyCameraCaptureResult r23, final int r24) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DataGroupHash.onExtraCallback(o.QuirksExternalSyntheticBackport0, java.util.List, boolean, kotlin.jvm.functions.Function1, o.CameraCaptureResultEmptyCameraCaptureResult, int):void");
    }

    static final class onNavigationEvent implements getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        final /* synthetic */ Benchmark.onExtraCallback onNavigationEvent;

        onNavigationEvent(Benchmark.onExtraCallback onextracallback) {
            this.onNavigationEvent = onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            onExtraCallback((w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((i & 6) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2);
            } else {
                i2 = i;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1539415852, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.select.OptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionListView.kt:25)");
            }
            w3bVar.onExtraCallbackWithResult(this.onNavigationEvent.onExtraCallback(), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, 29360128 & (i2 << 21), 126);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
    }

    static final class onExtraCallback implements getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        final /* synthetic */ Benchmark.onExtraCallback onWarmupCompleted;

        onExtraCallback(Benchmark.onExtraCallback onextracallback) {
            this.onWarmupCompleted = onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            onExtraCallbackWithResult((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1684375584, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.select.OptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionListView.kt:28)");
            }
            final Benchmark.onExtraCallback onextracallback = this.onWarmupCompleted;
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1407675530, true, new getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>() { // from class: o.DataGroupHash.onExtraCallback.3
                public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    IAuthTabCallback((RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public final void IAuthTabCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2, int i2) {
                    Intrinsics.checkNotNullParameter(rowScope, "");
                    if (!cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i2 & 17) != 16, i2 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        return;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1407675530, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.select.OptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionListView.kt:29)");
                    }
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{onextracallback.asBinder(), null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            final Benchmark.onExtraCallback onextracallback2 = this.onWarmupCompleted;
            w5a.onExtraCallback(new Object[]{w5aVar, encoderProfilesProxyVideoProfileProxyOnExtraCallback, ForwardingCameraControl.onExtraCallback(-785463221, true, new getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>() { // from class: o.DataGroupHash.onExtraCallback.4
                public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    onExtraCallbackWithResult((RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public final void onExtraCallbackWithResult(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2, int i2) {
                    long jLongValue;
                    Intrinsics.checkNotNullParameter(rowScope, "");
                    if (!cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i2 & 17) != 16, i2 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        return;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-785463221, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.select.OptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionListView.kt:34)");
                    }
                    String strOnNavigationEvent = onextracallback2.onNavigationEvent();
                    if (strOnNavigationEvent != null) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-752869161);
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1084098258);
                            jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ICustomTabsService();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1084099218);
                            jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnNavigationEvent, null, null, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-752592393);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
    }

    static final class onWarmupCompleted implements getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        final /* synthetic */ Benchmark.onExtraCallback onWarmupCompleted;

        onWarmupCompleted(Benchmark.onExtraCallback onextracallback) {
            this.onWarmupCompleted = onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            onExtraCallback((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted;
            String strOnExtraCallback;
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1770579429, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.select.OptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionListView.kt:45)");
            }
            Benchmark.onExtraCallbackWithResult onextracallbackwithresult = (Benchmark.onExtraCallbackWithResult) Benchmark.onExtraCallback.onExtraCallbackWithResult(1610830963, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1610830963, new Object[]{this.onWarmupCompleted}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
            String str = (onextracallbackwithresult == null || (strOnExtraCallback = onextracallbackwithresult.onExtraCallback()) == null) ? "" : strOnExtraCallback;
            AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent = AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent.Small;
            Benchmark.onExtraCallbackWithResult onextracallbackwithresult2 = (Benchmark.onExtraCallbackWithResult) Benchmark.onExtraCallback.onExtraCallbackWithResult(1610830963, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1610830963, new Object[]{this.onWarmupCompleted}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
            if (onextracallbackwithresult2 == null || (onextracallbackwithresultOnWarmupCompleted = DataGroupHash.onWarmupCompleted(onextracallbackwithresult2)) == null) {
                onextracallbackwithresultOnWarmupCompleted = AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Blue;
            }
            AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback(str, (QuirksExternalSyntheticBackport0) null, onnavigationevent, onextracallbackwithresultOnWarmupCompleted, AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted.Weak, cameraCaptureResultEmptyCameraCaptureResult, 24960, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
    }

    static final class onExtraCallbackWithResult implements getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        final /* synthetic */ Benchmark.onExtraCallback onWarmupCompleted;

        onExtraCallbackWithResult(Benchmark.onExtraCallback onextracallback) {
            this.onWarmupCompleted = onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            onNavigationEvent((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1350190396, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.select.OptionListView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionListView.kt:54)");
            }
            setStarRating.onExtraCallbackWithResult(new Object[]{true, ImageLoaderBuilderExternalSyntheticLambda2.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, !this.onWarmupCompleted.IAuthTabCallbackStub()), false, setClickTrackingUrls.IAuthTabCallback.Line, setClickTrackingUrls.onNavigationEvent.Large, null, cameraCaptureResultEmptyCameraCaptureResult, 27654, 36}, -471264704, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 471264710);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
    }

    static final class IAuthTabCallback implements Function0<Unit> {
        final /* synthetic */ Function1<Benchmark.onExtraCallback, Unit> onExtraCallbackWithResult;
        final /* synthetic */ Benchmark.onExtraCallback onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(Function1<? super Benchmark.onExtraCallback, Unit> function1, Benchmark.onExtraCallback onextracallback) {
            this.onExtraCallbackWithResult = function1;
            this.onNavigationEvent = onextracallback;
        }

        public /* synthetic */ Object invoke() {
            onNavigationEvent();
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent() {
            this.onExtraCallbackWithResult.invoke(this.onNavigationEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onWarmupCompleted(Benchmark.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
        switch (IAuthTabCallbackStub.onExtraCallbackWithResult[onextracallbackwithresult.IAuthTabCallback().ordinal()]) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Blue;
            case 2:
                return AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Teal;
            case 3:
                return AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Green;
            case 4:
                return AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Red;
            case 5:
                return AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Yellow;
            case 6:
                return AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Elephant;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(List list, boolean z, Function1 function1, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        audioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback(list.size(), (Function1) null, new asInterface(asBinder.onExtraCallbackWithResult, list), ForwardingCameraControl.onExtraCallbackWithResult(802480018, true, new onTransact(list, z, function1)));
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "space", (Object) null, GNUObjectIdentifiers.IAuthTabCallback.onWarmupCompleted(), 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final class asInterface implements Function1<Integer, Object> {
        final /* synthetic */ List onExtraCallbackWithResult;
        final /* synthetic */ Function1 onNavigationEvent;

        public asInterface(Function1 function1, List list) {
            this.onNavigationEvent = function1;
            this.onExtraCallbackWithResult = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            return onNavigationEvent(((Number) obj).intValue());
        }

        public final Object onNavigationEvent(int i) {
            return this.onNavigationEvent.invoke(this.onExtraCallbackWithResult.get(i));
        }
    }

    public static final class onTransact implements setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        final /* synthetic */ List onExtraCallback;
        final /* synthetic */ Function1 onExtraCallbackWithResult;
        final /* synthetic */ boolean onNavigationEvent;

        public onTransact(List list, boolean z, Function1 function1) {
            this.onExtraCallback = list;
            this.onNavigationEvent = z;
            this.onExtraCallbackWithResult = function1;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            onExtraCallback((RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Number) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3;
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback;
            Function0 function0;
            if ((i2 & 6) == 0) {
                i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i) ? 32 : 16;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            Benchmark.onExtraCallback onextracallback = (Benchmark.onExtraCallback) this.onExtraCallback.get(i);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1584705688);
            if (this.onNavigationEvent) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1585562186);
                encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1770579429, true, new onWarmupCompleted(onextracallback), cameraCaptureResultEmptyCameraCaptureResult, 54);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1586006819);
                encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1350190396, true, new onExtraCallbackWithResult(onextracallback), cameraCaptureResultEmptyCameraCaptureResult, 54);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxy = encoderProfilesProxyVideoProfileProxyOnExtraCallback;
            if (!onextracallback.IAuthTabCallbackStub() && !this.onNavigationEvent) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1586483103);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.onExtraCallbackWithResult);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onextracallback);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent | zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new IAuthTabCallback(this.onExtraCallbackWithResult, onextracallback);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                function0 = (Function0) objOnMinimized;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1586557937);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                function0 = null;
            }
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(1684375584, true, new onExtraCallback(onextracallback), cameraCaptureResultEmptyCameraCaptureResult, 54), (QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(-1539415852, true, new onNavigationEvent(onextracallback), cameraCaptureResultEmptyCameraCaptureResult, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, encoderProfilesProxyVideoProfileProxy, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, function0, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 114650);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
    }
}
