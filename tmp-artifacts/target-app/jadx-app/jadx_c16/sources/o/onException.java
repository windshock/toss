package o;

import im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeResultKt$;
import im.toss.features.home.core.ui.model.dst.element.ResultModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class onException {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final onException onWarmupCompleted = new onException();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-385111693, false, new ComposableSingletons$HomeResultKt$.ExternalSyntheticLambda0());

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallback;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return function2;
    }

    static {
        int i = onNavigationEvent + 3;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i3 % 128;
            z = i3 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-385111693, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeResultKt.lambda$-385111693.<anonymous> (HomeResult.kt:228)");
            }
            ExtensionFilter.onExtraCallbackWithResult(new ResultModel("preview", (ExecutorHelper) null, getThis.Companion.onNavigationEvent(), CollectionsKt.emptyList(), (setHasJSAPIError) null, ResultModel.ImageSizeMode.ABSOLUTE, asyncInterceptJsapi.IAuthTabCallback("결과가 없어요", false, 1, (Object) null), (String) null, (String) null, asyncInterceptJsapi.IAuthTabCallback("다른 조건으로 검색해보세요", false, 1, (Object) null), (String) null, (String) null, (getIgnoreErrorResourceHostList) null, 44.0d, 44.0d, 24.0d, 24.0d, (trim) null, (ImmutableCollection1) null, (String) null, (buildBaseLogContent) null), (Function1) null, (Function1) null, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 432, 8);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 2;
            }
        }
        return Unit.INSTANCE;
    }
}
