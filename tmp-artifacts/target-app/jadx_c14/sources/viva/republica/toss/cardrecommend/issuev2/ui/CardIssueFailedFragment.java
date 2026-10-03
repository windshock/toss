package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinNativeAdImplExternalSyntheticLambda1;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CertificationRequestInfo;
import o.DexLoadErrorReporter;
import o.DynamicLoader;
import o.ExifSpeedConverter;
import o.ForwardingCameraControl;
import o.GraphicDeviceInfo;
import o.IPostMessageServiceStubProxy;
import o.PullRefreshStateKtExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.TypographyKtExternalSyntheticLambda0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.ZslRingBuffer;
import o.addCameraErrorListener;
import o.addFixedPosition;
import o.bindChildren;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.delete;
import o.extraCommand;
import o.getBacktraceNote;
import o.getChildPreviewOutConfig;
import o.getDigestAlgorithms;
import o.getHighestSurfacePriority;
import o.getHumanReadableName;
import o.getParentMetadataCallback;
import o.getPrivacyDestinationUri;
import o.getSubtitle;
import o.getSurfaceSize;
import o.getViewTypeCount;
import o.hasMoreElements;
import o.immediateFailedFuture;
import o.isRepeatingEnabled;
import o.mergeChildrenConfigs;
import o.notifySessionStop;
import o.r8lambdak6CWcefLe9tXuLSlGJo2BURuBM;
import o.setAdVideoPlaybackListener;
import o.setByteOrder;
import o.use;
import o.w4;
import o.w5a;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda3;
import o.y1ExternalSyntheticLambda6;
import o.y1a;
import o.y1b;
import o.y1hExternalSyntheticLambda0;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueFailedFragment extends CardIssueBaseFragment<CertificationRequestInfo> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(CardIssueFailedFragment cardIssueFailedFragment, DexLoadErrorReporter dexLoadErrorReporter, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        cardIssueFailedFragment.IAuthTabCallback(dexLoadErrorReporter, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ComposeView composeView = new ComposeView(contextRequireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(699787649, true, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment$$ExternalSyntheticLambda7
            public final Object invoke(Object obj, Object obj2) {
                return CardIssueFailedFragment.onWarmupCompleted(this.f$0, composeView, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            }
        })));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(final CardIssueFailedFragment cardIssueFailedFragment, final ComposeView composeView, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(699787649, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment.onCreateView.<anonymous>.<anonymous> (CardIssueFailedFragment.kt:36)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(2111473369, true, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return CardIssueFailedFragment.onExtraCallback(this.f$0, composeView, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit onExtraCallback(final viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment r19, final androidx.compose.ui.platform.ComposeView r20, o.CameraCaptureResultEmptyCameraCaptureResult r21, int r22) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment.onExtraCallback(viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment, androidx.compose.ui.platform.ComposeView, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(final CardIssueFailedFragment cardIssueFailedFragment, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(1632471022, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment$$ExternalSyntheticLambda13
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CardIssueFailedFragment.onWarmupCompleted(this.f$0, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(final CardIssueFailedFragment cardIssueFailedFragment, y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(y1bVar, "");
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(318991415, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueFailedFragment.kt:47)");
            }
            y1bVar.onExtraCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), (Function0) null, ForwardingCameraControl.onExtraCallback(-1563277247, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment$$ExternalSyntheticLambda14
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CardIssueFailedFragment.onExtraCallbackWithResult(this.f$0, (AppLovinNativeAdImplExternalSyntheticLambda1) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 199686, 22);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(CardIssueFailedFragment cardIssueFailedFragment, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1563277247, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueFailedFragment.kt:51)");
            }
            appLovinNativeAdImplExternalSyntheticLambda1.IAuthTabCallback(cardIssueFailedFragment.readTypedObject().asInterface(), (QuirksExternalSyntheticBackport0) null, 0L, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 18) & 3670016, 62);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CardIssueFailedFragment cardIssueFailedFragment, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
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
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-70846742, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueFailedFragment.kt:56)");
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, cardIssueFailedFragment.readTypedObject().IAuthTabCallbackStub(), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 24576), 10}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(CardIssueFailedFragment cardIssueFailedFragment, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
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
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1369775337, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueFailedFragment.kt:64)");
            }
            if (!StringsKt.isBlank(cardIssueFailedFragment.readTypedObject().onTransact())) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(492879761);
                Object[] objArr = {y1externalsyntheticlambda3, cardIssueFailedFragment.readTypedObject().onTransact(), null, 0L, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), isRepeatingEnabled.onExtraCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 24576), 6};
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(493256473);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit onExtraCallback(final viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment r18, final androidx.compose.ui.platform.ComposeView r19, o.u4 r20, o.CameraCaptureResultEmptyCameraCaptureResult r21, int r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r11 = r21
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = r22 & 6
            if (r3 != 0) goto L1d
            boolean r3 = r11.onNavigationEvent(r2)
            if (r3 == 0) goto L19
            r3 = 4
            goto L1a
        L19:
            r3 = 2
        L1a:
            r3 = r22 | r3
            goto L1f
        L1d:
            r3 = r22
        L1f:
            r4 = r3 & 19
            r5 = 18
            if (r4 == r5) goto L27
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            r5 = r3 & 1
            boolean r4 = r11.onWarmupCompleted(r4, r5)
            if (r4 == 0) goto La0
            boolean r4 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r4 == 0) goto L3f
            r4 = -1
            java.lang.String r5 = "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueFailedFragment.kt:83)"
            r6 = -403408202(0xffffffffe7f47ab6, float:-2.3090421E24)
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r6, r3, r4, r5)
        L3f:
            o.getEncryptedData r4 = r18.readTypedObject()
            o.CertificationRequestInfo r4 = (o.CertificationRequestInfo) r4
            o.reportDexLoadingIssue r4 = r4.onExtraCallbackWithResult()
            o.DynamicLoader r4 = r4.onExtraCallback()
            java.lang.String r4 = r4.onNavigationEvent()
            boolean r5 = r11.onExtraCallback(r0)
            boolean r6 = r11.onExtraCallback(r1)
            java.lang.Object r7 = r21.onMinimized()
            r5 = r5 | r6
            if (r5 != 0) goto L68
            o.CameraCaptureResultEmptyCameraCaptureResult$onWarmupCompleted r5 = o.CameraCaptureResultEmptyCameraCaptureResult.Companion
            java.lang.Object r5 = r5.onExtraCallback()
            if (r7 != r5) goto L70
        L68:
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment$$ExternalSyntheticLambda6 r7 = new viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment$$ExternalSyntheticLambda6
            r7.<init>()
            r11.onWarmupCompleted(r7)
        L70:
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
            r15 = 0
            r16 = r3 & 14
            r17 = 1014(0x3f6, float:1.421E-42)
            r0 = r20
            r1 = r4
            r2 = r6
            r3 = r7
            r4 = r5
            r5 = r8
            r6 = r9
            r7 = r10
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r21
            r12 = r15
            r13 = r16
            r14 = r17
            r0.onNavigationEvent(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r0 == 0) goto La3
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            goto La3
        La0:
            r21.ICustomTabsCallbackStubProxy()
        La3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment.onExtraCallback(viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment, androidx.compose.ui.platform.ComposeView, o.u4, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(CardIssueFailedFragment cardIssueFailedFragment, ComposeView composeView) {
        getDigestAlgorithms.onExtraCallbackWithResult(cardIssueFailedFragment.writeTypedObject(), PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(composeView), cardIssueFailedFragment.readTypedObject().onExtraCallbackWithResult().onExtraCallback().onWarmupCompleted(), cardIssueFailedFragment.extraCallback(), cardIssueFailedFragment.readTypedObject().onExtraCallbackWithResult().onExtraCallback().onNavigationEvent(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit onExtraCallbackWithResult(final viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment r18, final androidx.compose.ui.platform.ComposeView r19, o.u4 r20, o.CameraCaptureResultEmptyCameraCaptureResult r21, int r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r15 = r21
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = r22 & 6
            if (r3 != 0) goto L1d
            boolean r3 = r15.onNavigationEvent(r2)
            if (r3 == 0) goto L19
            r3 = 4
            goto L1a
        L19:
            r3 = 2
        L1a:
            r3 = r22 | r3
            goto L1f
        L1d:
            r3 = r22
        L1f:
            r4 = r3 & 19
            r5 = 18
            if (r4 == r5) goto L27
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            r5 = r3 & 1
            boolean r4 = r15.onWarmupCompleted(r4, r5)
            if (r4 == 0) goto Lbd
            boolean r4 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r4 == 0) goto L3f
            r4 = -1
            java.lang.String r5 = "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueFailedFragment.kt:97)"
            r6 = 1553288052(0x5c954b74, float:3.3618186E17)
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r6, r3, r4, r5)
        L3f:
            o.getEncryptedData r4 = r18.readTypedObject()
            o.CertificationRequestInfo r4 = (o.CertificationRequestInfo) r4
            o.reportDexLoadingIssue r4 = r4.onExtraCallbackWithResult()
            o.DynamicLoader r4 = r4.onNavigationEvent()
            if (r4 != 0) goto L59
            r0 = 26794659(0x198daa3, float:5.614971E-38)
            r15.onExtraCallbackWithResult(r0)
            r21.IAuthTabCallbackDefault()
            goto Lb3
        L59:
            r5 = 26794660(0x198daa4, float:5.6149716E-38)
            r15.onExtraCallbackWithResult(r5)
            java.lang.String r5 = r4.onNavigationEvent()
            o.setCallToAction$onExtraCallback r6 = o.setCallToAction.onExtraCallback.Weak
            o.setCallToAction$onWarmupCompleted r7 = o.setCallToAction.onWarmupCompleted.Dark
            boolean r8 = r15.onExtraCallback(r0)
            boolean r9 = r15.onExtraCallback(r1)
            boolean r10 = r15.onExtraCallback(r4)
            java.lang.Object r11 = r21.onMinimized()
            r8 = r8 | r9
            r8 = r8 | r10
            if (r8 != 0) goto L83
            o.CameraCaptureResultEmptyCameraCaptureResult$onWarmupCompleted r8 = o.CameraCaptureResultEmptyCameraCaptureResult.Companion
            java.lang.Object r8 = r8.onExtraCallback()
            if (r11 != r8) goto L8b
        L83:
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment$$ExternalSyntheticLambda11 r11 = new viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment$$ExternalSyntheticLambda11
            r11.<init>()
            r15.onWarmupCompleted(r11)
        L8b:
            r4 = r11
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 221184(0x36000, float:3.09945E-40)
            r16 = r3 & 14
            r17 = 966(0x3c6, float:1.354E-42)
            r0 = r20
            r1 = r5
            r2 = r8
            r3 = r9
            r5 = r6
            r6 = r7
            r7 = r10
            r8 = r11
            r9 = r12
            r10 = r13
            r11 = r21
            r12 = r14
            r13 = r16
            r14 = r17
            r0.onNavigationEvent(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r21.IAuthTabCallbackDefault()
        Lb3:
            boolean r0 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r0 == 0) goto Lc0
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            goto Lc0
        Lbd:
            r21.ICustomTabsCallbackStubProxy()
        Lc0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment.onExtraCallbackWithResult(viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment, androidx.compose.ui.platform.ComposeView, o.u4, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CardIssueFailedFragment cardIssueFailedFragment, ComposeView composeView, DynamicLoader dynamicLoader) {
        getDigestAlgorithms<CertificationRequestInfo> getdigestalgorithmsWriteTypedObject = cardIssueFailedFragment.writeTypedObject();
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult = PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(composeView);
        DynamicLoader dynamicLoaderOnNavigationEvent = cardIssueFailedFragment.readTypedObject().onExtraCallbackWithResult().onNavigationEvent();
        getDigestAlgorithms.onExtraCallbackWithResult(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult, dynamicLoaderOnNavigationEvent != null ? dynamicLoaderOnNavigationEvent.onWarmupCompleted() : null, cardIssueFailedFragment.extraCallback(), dynamicLoader.onNavigationEvent(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        return Unit.INSTANCE;
    }

    public final void IAuthTabCallback(@NotNull final DexLoadErrorReporter dexLoadErrorReporter, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Intrinsics.checkNotNullParameter(dexLoadErrorReporter, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(912581398);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(dexLoadErrorReporter) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(912581398, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment.FailedContentRow (CardIssueFailedFragment.kt:121)");
            }
            getViewTypeCount.onExtraCallback.onNavigationEvent onnavigationevent = getViewTypeCount.onExtraCallback.Companion;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(265871353, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CardIssueFailedFragment.onExtraCallback(dexLoadErrorReporter, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, onnavigationevent.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, onnavigationevent.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 1575942, 384, 126902);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return CardIssueFailedFragment.onExtraCallback(this.f$0, dexLoadErrorReporter, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(DexLoadErrorReporter dexLoadErrorReporter, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(265871353, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment.FailedContentRow.<anonymous> (CardIssueFailedFragment.kt:125)");
            }
            String strOnExtraCallbackWithResult = dexLoadErrorReporter.onExtraCallbackWithResult();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            w5a.onExtraCallback(new Object[]{w5aVar, strOnExtraCallbackWithResult, dexLoadErrorReporter.onWarmupCompleted(), new getHumanReadableName(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (DefaultConstructorMarker) null), new getHumanReadableName(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 << 12) & 57344), 0}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
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
        extraCommand.IAuthTabCallback(requireBaseActivity().getOnBackPressedDispatcher(), this, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment$$ExternalSyntheticLambda12
            public final Object invoke(Object obj) {
                return CardIssueFailedFragment.IAuthTabCallback(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CardIssueFailedFragment cardIssueFailedFragment, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        cardIssueFailedFragment.requireBaseActivity().finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(final CardIssueFailedFragment cardIssueFailedFragment, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1632471022, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueFailedFragment.kt:44)");
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-70846742, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment$$ExternalSyntheticLambda8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CardIssueFailedFragment.onNavigationEvent(this.f$0, (y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), (QuirksExternalSyntheticBackport0) null, y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback(), (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(1369775337, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment$$ExternalSyntheticLambda9
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CardIssueFailedFragment.onExtraCallback(this.f$0, (y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallback(), (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, ForwardingCameraControl.onExtraCallback(318991415, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment$$ExternalSyntheticLambda10
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CardIssueFailedFragment.IAuthTabCallback(this.f$0, (y1b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote) null, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), (Function0) null, cameraCaptureResultEmptyCameraCaptureResult, 807076230, 432, 9626);
            List<DexLoadErrorReporter> listOnWarmupCompleted = cardIssueFailedFragment.readTypedObject().onWarmupCompleted();
            if (listOnWarmupCompleted == null) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1031350191);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1031350192);
                Iterator<T> it = listOnWarmupCompleted.iterator();
                while (it.hasNext()) {
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                    cardIssueFailedFragment.IAuthTabCallback((DexLoadErrorReporter) it.next(), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }
}
