package o;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomePersonalActivityRowKt$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.QuirksExternalSyntheticBackport0;
import o.toPreviewOnlyRange;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PoolPoolable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = null;
    public static final PoolPoolable onExtraCallbackWithResult;
    private static long onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 1;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 119;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallback;
        int i4 = i2 + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 99;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 15;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 84 - (ViewConfiguration.getFadingEdgeLength() >> 16), 21233 - TextUtils.indexOf("", ""), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14184), View.getDefaultSize(0, 0) + 19, View.MeasureSpec.getMode(0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static {
        onWarmupCompleted();
        onExtraCallbackWithResult = new PoolPoolable();
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1250215444, false, new ComposableSingletons$HomePersonalActivityRowKt$.ExternalSyntheticLambda0());
        int i = IAuthTabCallbackDefault + 27;
        asBinder = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 23;
            onWarmupCompleted = i3 % 128;
            z = i3 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onWarmupCompleted + 19;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1250215444, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomePersonalActivityRowKt.lambda$-1250215444.<anonymous> (HomePersonalActivityRow.kt:279)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i6 = IAuthTabCallback + 115;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                int i8 = onWarmupCompleted + 51;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 4 % 3;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            Object[] objArr = new Object[1];
            a(new char[]{20371, 20475, 9269, 43332, 40412, 32328, 31732, 58646, 34722, 51603, 55607, 571, 10206, 53600, 1521, 54893, 54239, 3352, 12673, 39506, 40864, 30991, 28053, 44615, 19350, 46450, 39356, 29226, 30604}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{24636, 24660, 52482, 16499, 10514, 18068, 21595, 3105, 13164, 32093, 57835, 15079, 2161, 14423, 45375, 61105, 64624, 58415, 34127, 41614, 45071, 36920, 55643, 38555, 25658, 23621, 11634, 19190, 22563}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
            releaseBuffer releasebufferIAuthTabCallback = clearAllMethodInvokeOptimizer.IAuthTabCallback("정산 요청", "토요일 저녁 모임", CollectionsKt.listOf(new String[]{strIntern, ((String) objArr2[0]).intern()}), 4, (String) null, false, 48, (Object) null);
            createInvocationHandler createinvocationhandler = createInvocationHandler.onExtraCallbackWithResult;
            clearAllMethodInvokeOptimizer.onNavigationEvent(releasebufferIAuthTabCallback, createinvocationhandler, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
            clearAllMethodInvokeOptimizer.onNavigationEvent(clearAllMethodInvokeOptimizer.IAuthTabCallback("<font color=\"adaptive-blue-500\">D-DAY</font> | 건강", "건강검진 예약 확인", CollectionsKt.emptyList(), 0, (String) null, false, 48, (Object) null), createinvocationhandler, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
            clearAllMethodInvokeOptimizer.onNavigationEvent(clearAllMethodInvokeOptimizer.IAuthTabCallback("<font color=\"adaptive-red-700\">지난 약속</font> | 공과금", "전기요금 납부 (5일 지남)", CollectionsKt.emptyList(), 0, (String) null, false, 48, (Object) null), createinvocationhandler, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
            clearAllMethodInvokeOptimizer.onNavigationEvent(clearAllMethodInvokeOptimizer.onExtraCallbackWithResult("자동차 보험 만기", "자동차 보험 갱신", CollectionsKt.emptyList(), 0, "<font color=\"adaptive-red-600\">1일 지남</font>", true), createinvocationhandler, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
            clearAllMethodInvokeOptimizer.onNavigationEvent(clearAllMethodInvokeOptimizer.IAuthTabCallback("중요", "어드민 중요", CollectionsKt.emptyList(), 0, "<font color=\"adaptive-grey-900\">6일 뒤</font>", false, 32, (Object) null), createinvocationhandler, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
            clearAllMethodInvokeOptimizer.onNavigationEvent(clearAllMethodInvokeOptimizer.IAuthTabCallback("아주 길어서 두 줄로 꺾이는 서브타이틀 안내 문구 케이스", "어드민 중요", CollectionsKt.emptyList(), 0, "<font color=\"adaptive-grey-900\">6일 뒤</font>", false, 32, (Object) null), createinvocationhandler, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = IAuthTabCallback + 105;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }

    static void onWarmupCompleted() {
        onNavigationEvent = -8623923551920392695L;
    }
}
