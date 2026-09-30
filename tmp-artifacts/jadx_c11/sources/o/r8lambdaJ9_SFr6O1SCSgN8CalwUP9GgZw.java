package o;

import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.r8lambdaJ9_SFr6O1SCSgN8CalwUP9GgZw;
import o.toPreviewOnlyRange;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaJ9_SFr6O1SCSgN8CalwUP9GgZw {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback;
    private static int onNavigationEvent;
    public static final r8lambdaJ9_SFr6O1SCSgN8CalwUP9GgZw onExtraCallbackWithResult = new r8lambdaJ9_SFr6O1SCSgN8CalwUP9GgZw();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(303194307, false, new Function2() { // from class: im.toss.tds.compose.compat.component.atom.post.ComposableSingletons$TdsPostV2Kt$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = r8lambdaJ9_SFr6O1SCSgN8CalwUP9GgZw.onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            if (i3 == 0) {
                int i4 = 29 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }
    });

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = IAuthTabCallbackStub + 113;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 60 / 0;
        }
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = IAuthTabCallback + 125;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 5;
            }
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(303194307, i, -1, "im.toss.tds.compose.compat.component.atom.post.ComposableSingletons$TdsPostV2Kt.lambda$303194307.<anonymous> (TdsPostV2.kt:110)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(onextracallback, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i5 = IAuthTabCallback + 111;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i7 = IAuthTabCallback + 75;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            getDistanceBetweenPoints getdistancebetweenpoints = getDistanceBetweenPoints.IAuthTabCallback;
            r8lambdaFhMDyMgWKKGTW4KvNSyM6l9TjEI.onWarmupCompleted(getdistancebetweenpoints, "<div><p><span style=\"color:rgb(78,89,104);background-color:rgba(0,0,0,0);font-weight:400\" data-style-dark=\"color:rgb(240,240,245);background-color:rgba(0,0,0,0);font-weight:400\">토스증권에서 계좌에 총자산 1천만원 이상, 최근 60일 동안 수익 100만원 이상을 낸 투자자들의 투자현황을 보여드려요.</span></p><h3><span style=\"color:rgb(51,61,75);background-color:rgba(0,0,0,0);font-weight:700\" data-style-dark=\"color:rgb(255,255,255);background-color:rgba(0,0,0,0);font-weight:700\">데이터 집계 기준</span></h3><ul><li><span style=\"color:rgb(78,89,104);background-color:rgba(0,0,0,0);font-weight:400\" data-style-dark=\"color:rgb(240,240,245);background-color:rgba(0,0,0,0);font-weight:400\">최근 7시간 동안의 투자자 매매내역을 모아 5분 단위로 업데이트해요</span></li></ul><ul><li><span style=\"color:rgb(78,89,104);background-color:rgba(0,0,0,0);font-weight:400\" data-style-dark=\"color:rgb(240,240,245);background-color:rgba(0,0,0,0);font-weight:400\">실시간 집계는 아니며, 10분 전 데이터를 기준으로 제공해요.</span></li></ul><ul><li><span style=\"color:rgb(78,89,104);background-color:rgba(0,0,0,0);font-weight:400\" data-style-dark=\"color:rgb(240,240,245);background-color:rgba(0,0,0,0);font-weight:400\">투자자들의 거래가 없거나 휴장일이면 데이터를 제공하지 않아요.</span></li></ul><p><span style=\"color:rgb(139,149,161);background-color:rgba(0,0,0,0);font-weight:400\" data-style-dark=\"color:rgb(230,230,235);background-color:rgba(0,0,0,0);font-weight:400\">토스증권에서 제공하는 투자정보는 고객의 투자 판단을 위한 단순 참고용으로 투자 제안이나 권유, 종목 추천이 아니에요.</span></p><p><span style=\"color:rgb(78,89,104);text-decoration:underline;font-weight:400\" data-style-dark=\"color:rgb(240,240,245);text-decoration:underline;font-weight:400\">이 문장은 밑줄이 그어져 있습니다.</span></p></div>", null, null, null, false, false, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult, 6, 254);
            r8lambdaFhMDyMgWKKGTW4KvNSyM6l9TjEI.onWarmupCompleted(getdistancebetweenpoints, "<p>투자정보는 고객의 투자 판단을 위한 단순 참고용이에요.</p>\n<p>커스텀 텍스트 색상이 잘 보이는지 확인하는 프리뷰예요.</p>", null, null, null, false, false, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), 0L, cameraCaptureResultEmptyCameraCaptureResult, 6, 190);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallback + 39;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
