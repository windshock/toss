package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinNativeAdImplc;
import o.AppLovinPostbackService;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DynamicLoader;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.IPostMessageServiceStubProxy;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RippleNode;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.ZslRingBuffer;
import o.addFixedPosition;
import o.component5;
import o.createCameraCaptureCallback;
import o.extraCommand;
import o.getAwbState;
import o.getBacktraceNote;
import o.getDigestAlgorithms;
import o.getSubject;
import o.immediateFailedFuture;
import o.isRepeatingEnabled;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setAdvertiser;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.verifyDrawable;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda3;
import o.y1ExternalSyntheticLambda4;
import o.y1ExternalSyntheticLambda6;
import o.y1a;
import o.y1hExternalSyntheticLambda0;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueFailedBannerFragment extends CardIssueBaseFragment<getSubject> {
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ComposeView composeView = new ComposeView(contextRequireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(588475049, true, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2) {
                return CardIssueFailedBannerFragment.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            }
        })));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(final CardIssueFailedBannerFragment cardIssueFailedBannerFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(588475049, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment.onCreateView.<anonymous>.<anonymous> (CardIssueFailedBannerFragment.kt:43)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1187068927, true, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment$$ExternalSyntheticLambda7
                public final Object invoke(Object obj, Object obj2) {
                    return CardIssueFailedBannerFragment.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(CardIssueFailedBannerFragment cardIssueFailedBannerFragment, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-436512697, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueFailedBannerFragment.kt:48)");
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, cardIssueFailedBannerFragment.readTypedObject().asInterface(), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 24576), 10}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CardIssueFailedBannerFragment cardIssueFailedBannerFragment, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1518675462, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueFailedBannerFragment.kt:56)");
            }
            String strIAuthTabCallbackStub = cardIssueFailedBannerFragment.readTypedObject().IAuthTabCallbackStub();
            if (strIAuthTabCallbackStub != null && !StringsKt.isBlank(strIAuthTabCallbackStub)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-324718402);
                String strIAuthTabCallbackStub2 = cardIssueFailedBannerFragment.readTypedObject().IAuthTabCallbackStub();
                String str = strIAuthTabCallbackStub2 != null ? strIAuthTabCallbackStub2 : "";
                Object[] objArr = {y1externalsyntheticlambda3, str, null, 0L, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), isRepeatingEnabled.onExtraCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 24576), 6};
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-324382052);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit onExtraCallbackWithResult(final viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment r18, o.y1ExternalSyntheticLambda4 r19, o.CameraCaptureResultEmptyCameraCaptureResult r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r15 = r20
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = r21 & 6
            if (r2 != 0) goto L1b
            boolean r2 = r15.onNavigationEvent(r1)
            if (r2 == 0) goto L17
            r2 = 4
            goto L18
        L17:
            r2 = 2
        L18:
            r2 = r21 | r2
            goto L1d
        L1b:
            r2 = r21
        L1d:
            r3 = r2 & 19
            r4 = 18
            if (r3 == r4) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            r4 = r2 & 1
            boolean r3 = r15.onWarmupCompleted(r3, r4)
            if (r3 == 0) goto Lb9
            boolean r3 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r3 == 0) goto L3d
            r3 = -1
            java.lang.String r4 = "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueFailedBannerFragment.kt:66)"
            r5 = -876682581(0xffffffffcbbee2ab, float:-2.5019734E7)
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r5, r2, r3, r4)
        L3d:
            o.getEncryptedData r3 = r18.readTypedObject()
            o.getSubject r3 = (o.getSubject) r3
            o.DynamicLoader r3 = r3.onExtraCallbackWithResult()
            if (r3 != 0) goto L53
            r0 = 445442059(0x1a8ce80b, float:5.827753E-23)
            r15.onExtraCallbackWithResult(r0)
            r20.IAuthTabCallbackDefault()
            goto Laf
        L53:
            r4 = 445442060(0x1a8ce80c, float:5.8277535E-23)
            r15.onExtraCallbackWithResult(r4)
            java.lang.String r4 = r3.onNavigationEvent()
            o.setCallToAction$IAuthTabCallback$onExtraCallbackWithResult r5 = o.setCallToAction.IAuthTabCallback.Companion
            o.setCallToAction$IAuthTabCallback r5 = r5.onNavigationEvent()
            o.setCallToAction$onExtraCallback r7 = o.setCallToAction.onExtraCallback.Weak
            o.setCallToAction$onNavigationEvent r8 = o.setCallToAction.onNavigationEvent.Inline
            boolean r6 = r15.onExtraCallback(r0)
            boolean r9 = r15.onExtraCallback(r3)
            java.lang.Object r10 = r20.onMinimized()
            r6 = r6 | r9
            if (r6 != 0) goto L7e
            o.CameraCaptureResultEmptyCameraCaptureResult$onWarmupCompleted r6 = o.CameraCaptureResultEmptyCameraCaptureResult.Companion
            java.lang.Object r6 = r6.onExtraCallback()
            if (r10 != r6) goto L86
        L7e:
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment$$ExternalSyntheticLambda6 r10 = new viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment$$ExternalSyntheticLambda6
            r10.<init>()
            r15.onWarmupCompleted(r10)
        L86:
            r6 = r10
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r3 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 14180352(0xd86000, float:1.9870905E-38)
            int r0 = r2 << 3
            r16 = r0 & 112(0x70, float:1.57E-43)
            r17 = 1830(0x726, float:2.564E-42)
            r0 = r19
            r1 = r4
            r2 = r3
            r3 = r9
            r4 = r6
            r6 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r20
            r13 = r14
            r14 = r16
            r15 = r17
            r0.onNavigationEvent(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r20.IAuthTabCallbackDefault()
        Laf:
            boolean r0 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r0 == 0) goto Lbc
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            goto Lbc
        Lb9:
            r20.ICustomTabsCallbackStubProxy()
        Lbc:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment.onExtraCallbackWithResult(viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment, o.y1ExternalSyntheticLambda4, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CardIssueFailedBannerFragment cardIssueFailedBannerFragment, DynamicLoader dynamicLoader) {
        cardIssueFailedBannerFragment.IAuthTabCallback(dynamicLoader);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(final CardIssueFailedBannerFragment cardIssueFailedBannerFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1187068927, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CardIssueFailedBannerFragment.kt:44)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-436512697, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CardIssueFailedBannerFragment.onWarmupCompleted(this.f$0, (y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), (QuirksExternalSyntheticBackport0) null, y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback(), (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(1518675462, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CardIssueFailedBannerFragment.onNavigationEvent(this.f$0, (y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallback(), (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallback(-876682581, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CardIssueFailedBannerFragment.onExtraCallbackWithResult(this.f$0, (y1ExternalSyntheticLambda4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), (Function0) null, cameraCaptureResultEmptyCameraCaptureResult, 1769862, 390, 11162);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnNavigationEvent2, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onActivityLayout(), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)));
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 48);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            AppLovinNativeAdImplc.onExtraCallbackWithResult(cardIssueFailedBannerFragment.readTypedObject().onWarmupCompleted().onExtraCallback().onExtraCallback(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(cardIssueFailedBannerFragment.readTypedObject().onWarmupCompleted().onExtraCallback().onWarmupCompleted())), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(cardIssueFailedBannerFragment.readTypedObject().onWarmupCompleted().onExtraCallback().IAuthTabCallback())), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), 0.0f, 0.0f, 13, (Object) null), 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 508);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 8, (Object) null);
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{cardIssueFailedBannerFragment.readTypedObject().onWarmupCompleted().onWarmupCompleted(), quirksExternalSyntheticBackport0OnExtraCallback, AppLovinPostbackService.onExtraCallbackWithResult.access100(), Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98032}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
            String strOnNavigationEvent = cardIssueFailedBannerFragment.readTypedObject().onWarmupCompleted().IAuthTabCallback().onNavigationEvent();
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onExtraCallback onextracallback2 = setCallToAction.onExtraCallback.Fill;
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Block;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(cardIssueFailedBannerFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment$$ExternalSyntheticLambda4
                    public final Object invoke() {
                        return CardIssueFailedBannerFragment.onNavigationEvent(this.f$0);
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            setAdvertiser.onExtraCallbackWithResult(strOnNavigationEvent, quirksExternalSyntheticBackport0OnWarmupCompleted3, iAuthTabCallbackOnExtraCallbackWithResult, onwarmupcompleted, onextracallback2, onnavigationevent, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) null, (Function0) objOnMinimized, false, false, cameraCaptureResultEmptyCameraCaptureResult, 224640, 0, 1728);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CardIssueFailedBannerFragment cardIssueFailedBannerFragment) {
        cardIssueFailedBannerFragment.IAuthTabCallback(cardIssueFailedBannerFragment.readTypedObject().onWarmupCompleted().IAuthTabCallback());
        return Unit.INSTANCE;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        IPostMessageServiceStubProxy supportActionBar = requireBaseActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        extraCommand.IAuthTabCallback(requireBaseActivity().getOnBackPressedDispatcher(), this, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return CardIssueFailedBannerFragment.onWarmupCompleted(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(CardIssueFailedBannerFragment cardIssueFailedBannerFragment, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        cardIssueFailedBannerFragment.requireBaseActivity().finish();
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(DynamicLoader dynamicLoader) {
        getDigestAlgorithms.onExtraCallbackWithResult(writeTypedObject(), RippleNode.onNavigationEvent(this), dynamicLoader.onWarmupCompleted(), extraCallback(), dynamicLoader.onNavigationEvent(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
    }
}
