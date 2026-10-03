package viva.republica.toss.cardrecommend.issuev2.ui.select;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.ComposeView;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.R;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.Benchmark;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.EncoderProfilesProxyVideoProfileProxy;
import o.ForwardingCameraControl;
import o.LDSSecurityObject;
import o.NTTObjectIdentifiers;
import o.PrivateKeyInfo;
import o.PullRefreshStateKtExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RequestOptionConfigBuilderExternalSyntheticLambda0;
import o.SigPolicyQualifiers;
import o.TypographyKtExternalSyntheticLambda0;
import o.ZslRingBuffer;
import o.access13800;
import o.access8100;
import o.addFixedPosition;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.createAdSizeApi;
import o.createAudienceNetworkRemoteService;
import o.doCallInitialize;
import o.findResAndMsg;
import o.getBacktraceNote;
import o.getDigestAlgorithms;
import o.getSupportedHighSpeedResolutionsFor;
import o.getTimebase;
import o.getTypedExportedConstants;
import o.initMiniApp;
import o.logAndOpenStore;
import o.setAdVideoPlaybackListener;
import o.setCallToAction;
import o.setProxySelectorokhttp;
import o.t7ExternalSyntheticLambda0;
import o.u1;
import o.u2;
import o.u4;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda3;
import o.y1ExternalSyntheticLambda6;
import o.y1a;
import o.y1hExternalSyntheticLambda0;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueSelectOptionStepFragment extends Hilt_CardIssueSelectOptionStepFragment<PrivateKeyInfo> {
    private final Map<String, List<Benchmark.onExtraCallback>> onExtraCallback = new LinkedHashMap();

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[LDSSecurityObject.values().length];
            try {
                iArr[LDSSecurityObject.NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LDSSecurityObject.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LDSSecurityObject.RESET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(CardIssueSelectOptionStepFragment cardIssueSelectOptionStepFragment, Benchmark benchmark, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        cardIssueSelectOptionStepFragment.onExtraCallbackWithResult(benchmark, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(CardIssueSelectOptionStepFragment cardIssueSelectOptionStepFragment, boolean z, int i, boolean z2, Function1 function1, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        cardIssueSelectOptionStepFragment.onNavigationEvent(z, i, z2, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CardIssueSelectOptionStepFragment cardIssueSelectOptionStepFragment, Benchmark benchmark, List list, List list2, boolean z, int i, Function1 function1, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        cardIssueSelectOptionStepFragment.onExtraCallbackWithResult(benchmark, (List<Benchmark.onExtraCallback>) list, (List<Benchmark.onExtraCallback>) list2, z, i, (Function1<? super LDSSecurityObject, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();

        public final void onWarmupCompleted(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ComposeView composeView = new ComposeView(contextRequireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1971227375, true, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2) {
                return CardIssueSelectOptionStepFragment.onExtraCallback(this.f$0, composeView, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            }
        })));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(final CardIssueSelectOptionStepFragment cardIssueSelectOptionStepFragment, final ComposeView composeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1971227375, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment.onCreateView.<anonymous>.<anonymous> (CardIssueSelectOptionStepFragment.kt:52)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1539680617, true, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment$$ExternalSyntheticLambda8
                public final Object invoke(Object obj, Object obj2) {
                    return CardIssueSelectOptionStepFragment.onWarmupCompleted(this.f$0, composeView, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onWarmupCompleted(CardIssueSelectOptionStepFragment cardIssueSelectOptionStepFragment, ComposeView composeView, getTimebase gettimebase, LDSSecurityObject lDSSecurityObject) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(lDSSecurityObject, "");
        int i = onExtraCallback.onWarmupCompleted[lDSSecurityObject.ordinal()];
        if (i == 1) {
            onExtraCallbackWithResult(gettimebase, onExtraCallbackWithResult(gettimebase) + 1);
        } else if (i == 2) {
            getDigestAlgorithms<L> getdigestalgorithmsWriteTypedObject = cardIssueSelectOptionStepFragment.writeTypedObject();
            TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult = PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(composeView);
            createAdSizeApi createadsizeapiOnWarmupCompleted = ((PrivateKeyInfo) cardIssueSelectOptionStepFragment.readTypedObject()).onWarmupCompleted().onWarmupCompleted();
            CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = cardIssueSelectOptionStepFragment.extraCallback();
            createAudienceNetworkRemoteService createaudiencenetworkremoteservice = new createAudienceNetworkRemoteService();
            Map<String, List<Benchmark.onExtraCallback>> map = cardIssueSelectOptionStepFragment.onExtraCallback;
            LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Benchmark.onExtraCallback) it2.next()).onWarmupCompleted());
                }
                linkedHashMap.put(key, arrayList);
            }
            createaudiencenetworkremoteservice.put("valueMap", linkedHashMap);
            getdigestalgorithmsWriteTypedObject.onWarmupCompleted(typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult, createadsizeapiOnWarmupCompleted, cardIssueOverviewViewModelExtraCallback, ((PrivateKeyInfo) cardIssueSelectOptionStepFragment.readTypedObject()).onWarmupCompleted().onNavigationEvent(), createaudiencenetworkremoteservice);
            cardIssueSelectOptionStepFragment.onExtraCallback.clear();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            cardIssueSelectOptionStepFragment.onExtraCallback.clear();
            onExtraCallbackWithResult(gettimebase, 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CardIssueSelectOptionStepFragment cardIssueSelectOptionStepFragment, getTimebase gettimebase) {
        if (onExtraCallbackWithResult(gettimebase) == 0) {
            cardIssueSelectOptionStepFragment.onPostMessage();
        } else {
            cardIssueSelectOptionStepFragment.onExtraCallback.clear();
            onExtraCallbackWithResult(gettimebase, 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallbackWithResult(final o.Benchmark r31, final java.util.List<o.Benchmark.onExtraCallback> r32, final java.util.List<o.Benchmark.onExtraCallback> r33, final boolean r34, final int r35, final kotlin.jvm.functions.Function1<? super o.LDSSecurityObject, kotlin.Unit> r36, o.CameraCaptureResultEmptyCameraCaptureResult r37, final int r38) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment.onExtraCallbackWithResult(o.Benchmark, java.util.List, java.util.List, boolean, int, kotlin.jvm.functions.Function1, o.CameraCaptureResultEmptyCameraCaptureResult, int):void");
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ List<Benchmark.onExtraCallback> $initSelectOptions;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<List<Benchmark.onExtraCallback>> $selectOption$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(List<Benchmark.onExtraCallback> list, getSupportedHighSpeedResolutionsFor<List<Benchmark.onExtraCallback>> getsupportedhighspeedresolutionsfor, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$initSelectOptions = list;
            this.$selectOption$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallbackWithResult(this.$initSelectOptions, this.$selectOption$delegate, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ResultKt.onNavigationEvent(obj);
                CardIssueSelectOptionStepFragment.onExtraCallback(this.$selectOption$delegate, this.$initSelectOptions);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CardIssueSelectOptionStepFragment cardIssueSelectOptionStepFragment, Benchmark benchmark, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Benchmark.onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(onWarmupCompleted((getSupportedHighSpeedResolutionsFor<List<Benchmark.onExtraCallback>>) getsupportedhighspeedresolutionsfor));
        arrayList.add(onextracallback);
        if (arrayList.size() > benchmark.IAuthTabCallback()) {
            arrayList.remove(0);
        }
        onExtraCallback((getSupportedHighSpeedResolutionsFor<List<Benchmark.onExtraCallback>>) getsupportedhighspeedresolutionsfor, arrayList);
        Benchmark.onNavigationEvent onnavigationeventIAuthTabCallback = onextracallback.IAuthTabCallback();
        if (onnavigationeventIAuthTabCallback != null) {
            cardIssueSelectOptionStepFragment.IAuthTabCallback(onnavigationeventIAuthTabCallback);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(CardIssueSelectOptionStepFragment cardIssueSelectOptionStepFragment, Benchmark benchmark, Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, LDSSecurityObject lDSSecurityObject) {
        Intrinsics.checkNotNullParameter(lDSSecurityObject, "");
        Map<String, List<Benchmark.onExtraCallback>> map = cardIssueSelectOptionStepFragment.onExtraCallback;
        String strOnExtraCallback = benchmark.onExtraCallback();
        List<Benchmark.onExtraCallback> listOnWarmupCompleted = onWarmupCompleted((getSupportedHighSpeedResolutionsFor<List<Benchmark.onExtraCallback>>) getsupportedhighspeedresolutionsfor);
        Iterator<T> it = listOnWarmupCompleted.iterator();
        while (it.hasNext()) {
            Object[] objArr = {(Benchmark.onExtraCallback) it.next(), benchmark.onWarmupCompleted()};
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            Benchmark.onExtraCallback.onExtraCallbackWithResult(-363900303, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 363900304, objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        }
        map.put(strOnExtraCallback, listOnWarmupCompleted);
        function1.invoke(lDSSecurityObject);
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(final Benchmark benchmark, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-706217008);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(benchmark) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-706217008, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment.OptionSelectTop (CardIssueSelectOptionStepFragment.kt:147)");
            }
            final String strOnNavigationEvent = benchmark.onNavigationEvent();
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(1536189644, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CardIssueSelectOptionStepFragment.onNavigationEvent(benchmark, (y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            if (strOnNavigationEvent != null) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2134211963);
                encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1167375984, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return CardIssueSelectOptionStepFragment.onExtraCallback(strOnNavigationEvent, (y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2134424653);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                encoderProfilesProxyVideoProfileProxyOnExtraCallback = null;
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResult2, 6, 0, 16350);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2) {
                    return CardIssueSelectOptionStepFragment.onExtraCallbackWithResult(this.f$0, benchmark, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(Benchmark benchmark, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1536189644, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment.OptionSelectTop.<anonymous> (CardIssueSelectOptionStepFragment.kt:150)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{benchmark.asInterface(), null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(22)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 131046}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(String str, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1167375984, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment.OptionSelectTop.<anonymous> (CardIssueSelectOptionStepFragment.kt:157)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 131046}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent(final boolean z, final int i, final boolean z2, final Function1<? super LDSSecurityObject, Unit> function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) {
        int i3;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1299499839);
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 2048 : 1024;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) != 1170, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1299499839, i3, -1, "viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment.OptionSelectBottomCta (CardIssueSelectOptionStepFragment.kt:167)");
            }
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(16141908, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment$$ExternalSyntheticLambda4
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CardIssueSelectOptionStepFragment.onNavigationEvent(z, i, function1, z2, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            if (z && i > 1) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1436106191);
                encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(930315991, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment$$ExternalSyntheticLambda5
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return CardIssueSelectOptionStepFragment.IAuthTabCallback(function1, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1436376573);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                encoderProfilesProxyVideoProfileProxyOnExtraCallback = null;
            }
            u1.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (u2) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (setCallToAction.onExtraCallbackWithResult) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, true, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 805306752, 0, 3563);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment$$ExternalSyntheticLambda6
                public final Object invoke(Object obj, Object obj2) {
                    return CardIssueSelectOptionStepFragment.onExtraCallbackWithResult(this.f$0, z, i, z2, function1, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit onNavigationEvent(final boolean r17, int r18, final kotlin.jvm.functions.Function1 r19, boolean r20, o.u4 r21, o.CameraCaptureResultEmptyCameraCaptureResult r22, int r23) {
        /*
            r0 = r17
            r1 = r19
            r2 = r21
            r11 = r22
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = r23 & 6
            if (r3 != 0) goto L1d
            boolean r3 = r11.onNavigationEvent(r2)
            if (r3 == 0) goto L19
            r3 = 4
            goto L1a
        L19:
            r3 = 2
        L1a:
            r3 = r23 | r3
            goto L1f
        L1d:
            r3 = r23
        L1f:
            r4 = r3 & 19
            r5 = 18
            r6 = 0
            r7 = 1
            if (r4 == r5) goto L29
            r4 = r7
            goto L2a
        L29:
            r4 = r6
        L2a:
            r5 = r3 & 1
            boolean r4 = r11.onWarmupCompleted(r4, r5)
            if (r4 == 0) goto Lad
            boolean r4 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r4 == 0) goto L41
            r4 = -1
            java.lang.String r5 = "viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment.OptionSelectBottomCta.<anonymous> (CardIssueSelectOptionStepFragment.kt:170)"
            r8 = 16141908(0xf64e54, float:2.2619631E-38)
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r8, r3, r4, r5)
        L41:
            if (r0 == 0) goto L50
            r4 = r18
            if (r4 <= r7) goto L50
            r4 = -1667492801(0xffffffff9c9c143f, float:-1.0328448E-21)
            r11.onExtraCallbackWithResult(r4)
            int r4 = im.toss.uikit.R.string.uikit_confirm
            goto L58
        L50:
            r4 = -1667491247(0xffffffff9c9c1a51, float:-1.0330017E-21)
            r11.onExtraCallbackWithResult(r4)
            int r4 = viva.republica.toss.R.string.next
        L58:
            java.lang.String r4 = o.DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(r4, r11, r6)
            r22.IAuthTabCallbackDefault()
            boolean r5 = r11.onNavigationEvent(r1)
            boolean r6 = r11.onExtraCallback(r0)
            java.lang.Object r7 = r22.onMinimized()
            r5 = r5 | r6
            if (r5 != 0) goto L76
            o.CameraCaptureResultEmptyCameraCaptureResult$onWarmupCompleted r5 = o.CameraCaptureResultEmptyCameraCaptureResult.Companion
            java.lang.Object r5 = r5.onExtraCallback()
            if (r7 != r5) goto L7e
        L76:
            viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment$$ExternalSyntheticLambda9 r7 = new viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment$$ExternalSyntheticLambda9
            r7.<init>()
            r11.onWarmupCompleted(r7)
        L7e:
            r5 = r7
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = r3 & 14
            r16 = 758(0x2f6, float:1.062E-42)
            r0 = r21
            r1 = r4
            r2 = r6
            r3 = r7
            r4 = r5
            r5 = r8
            r6 = r9
            r7 = r10
            r8 = r12
            r9 = r20
            r10 = r13
            r11 = r22
            r12 = r14
            r13 = r15
            r14 = r16
            r0.onNavigationEvent(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r0 == 0) goto Lb0
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            goto Lb0
        Lad:
            r22.ICustomTabsCallbackStubProxy()
        Lb0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment.onNavigationEvent(boolean, int, kotlin.jvm.functions.Function1, boolean, o.u4, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Function1 function1, boolean z) {
        function1.invoke(z ? LDSSecurityObject.COMPLETE : LDSSecurityObject.NEXT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit IAuthTabCallback(final kotlin.jvm.functions.Function1 r17, o.u4 r18, o.CameraCaptureResultEmptyCameraCaptureResult r19, int r20) {
        /*
            r0 = r17
            r1 = r18
            r11 = r19
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = r20 & 6
            if (r2 != 0) goto L1b
            boolean r2 = r11.onNavigationEvent(r1)
            if (r2 == 0) goto L17
            r2 = 4
            goto L18
        L17:
            r2 = 2
        L18:
            r2 = r20 | r2
            goto L1d
        L1b:
            r2 = r20
        L1d:
            r3 = r2 & 19
            r4 = 18
            r5 = 0
            if (r3 == r4) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = r5
        L27:
            r4 = r2 & 1
            boolean r3 = r11.onWarmupCompleted(r3, r4)
            if (r3 == 0) goto L8c
            boolean r3 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r3 == 0) goto L3e
            r3 = -1
            java.lang.String r4 = "viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment.OptionSelectBottomCta.<anonymous> (CardIssueSelectOptionStepFragment.kt:178)"
            r6 = 930315991(0x37737ed7, float:1.4513461E-5)
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r6, r2, r3, r4)
        L3e:
            int r3 = viva.republica.toss.R.string.app_cardrecommend_issuev2_ui___94e15db13c
            java.lang.String r3 = o.DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(r3, r11, r5)
            boolean r4 = r11.onNavigationEvent(r0)
            java.lang.Object r5 = r19.onMinimized()
            if (r4 != 0) goto L56
            o.CameraCaptureResultEmptyCameraCaptureResult$onWarmupCompleted r4 = o.CameraCaptureResultEmptyCameraCaptureResult.Companion
            java.lang.Object r4 = r4.onExtraCallback()
            if (r5 != r4) goto L5e
        L56:
            viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment$$ExternalSyntheticLambda7 r5 = new viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment$$ExternalSyntheticLambda7
            r5.<init>()
            r11.onWarmupCompleted(r5)
        L5e:
            r4 = r5
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = r2 & 14
            r16 = 1014(0x3f6, float:1.421E-42)
            r0 = r18
            r1 = r3
            r2 = r5
            r3 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r12
            r10 = r13
            r11 = r19
            r12 = r14
            r13 = r15
            r14 = r16
            r0.onNavigationEvent(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r0 == 0) goto L8f
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            goto L8f
        L8c:
            r19.ICustomTabsCallbackStubProxy()
        L8f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment.IAuthTabCallback(kotlin.jvm.functions.Function1, o.u4, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(Function1 function1) {
        function1.invoke(LDSSecurityObject.RESET);
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(Benchmark.onNavigationEvent onnavigationevent) {
        Context context = getContext();
        if (context != null) {
            IAuthTabCallback iAuthTabCallback = IAuthTabCallback.onNavigationEvent;
            logAndOpenStore.IAuthTabCallback(context, (Long) null);
            final getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(context, 0, false, false, -1L, iAuthTabCallback, 14, (DefaultConstructorMarker) null);
            gettypedexportedconstants.IAuthTabCallback(true);
            Context context2 = gettypedexportedconstants.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            LinearLayout linearLayout = new LinearLayout(context2);
            linearLayout.setOrientation(1);
            Context context3 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            bottomSheetHeader.setTitle(onnavigationevent.onNavigationEvent());
            bottomSheetHeader.setShowCloseIcon(false);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
            Context context4 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            TdsScrollView tdsScrollView = new TdsScrollView(context4, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
            Class cls = Integer.TYPE;
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
            Intrinsics.checkNotNull(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = -1;
            layoutParams2.height = 0;
            layoutParams2.weight = 1.0f;
            tdsScrollView.setLayoutParams(layoutParams);
            Context context5 = tdsScrollView.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            LinearLayout linearLayout2 = new LinearLayout(context5);
            linearLayout2.setOrientation(1);
            List<doCallInitialize> listOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
            ArrayList<SigPolicyQualifiers> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
            Iterator<T> it = listOnWarmupCompleted.iterator();
            while (it.hasNext()) {
                arrayList.add(NTTObjectIdentifiers.onExtraCallback((doCallInitialize) it.next()));
            }
            for (SigPolicyQualifiers sigPolicyQualifiers : arrayList) {
                Context context6 = linearLayout2.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                linearLayout2.addView(sigPolicyQualifiers.onNavigationEvent(context6));
            }
            setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout2);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsScrollView);
            Context context7 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context7);
            tdsBottomCtaV1View.setGradientVisibility(8);
            String string = getString(R.string.uikit_confirm);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment$$ExternalSyntheticLambda10
                public final Object invoke(Object obj) {
                    return CardIssueSelectOptionStepFragment.onNavigationEvent(gettypedexportedconstants, (View) obj);
                }
            }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
            gettypedexportedconstants.setContentView(linearLayout);
            gettypedexportedconstants.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(getTypedExportedConstants gettypedexportedconstants, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        gettypedexportedconstants.dismiss();
        return Unit.INSTANCE;
    }

    private static final int onExtraCallbackWithResult(getTimebase gettimebase) {
        return gettimebase.onWarmupCompleted();
    }

    private static final void onExtraCallbackWithResult(getTimebase gettimebase, int i) {
        gettimebase.onExtraCallback(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit onWarmupCompleted(final viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment r16, final androidx.compose.ui.platform.ComposeView r17, o.CameraCaptureResultEmptyCameraCaptureResult r18, int r19) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment.onWarmupCompleted(viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment, androidx.compose.ui.platform.ComposeView, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private static final List<Benchmark.onExtraCallback> onWarmupCompleted(getSupportedHighSpeedResolutionsFor<List<Benchmark.onExtraCallback>> getsupportedhighspeedresolutionsfor) {
        return (List) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<List<Benchmark.onExtraCallback>> getsupportedhighspeedresolutionsfor, List<Benchmark.onExtraCallback> list) {
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(list);
    }
}
