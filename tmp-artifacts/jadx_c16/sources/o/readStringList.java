package o;

import im.toss.features.home.core.ui.compose.dst.ComposableSingletons$CashflowLineChartKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class readStringList {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final readStringList onExtraCallbackWithResult = new readStringList();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-2094217422, false, new ComposableSingletons$CashflowLineChartKt$.ExternalSyntheticLambda0());

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 9 / 0;
        }
        return unitOnExtraCallback;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback;
        }
        throw null;
    }

    static {
        int i = onNavigationEvent + 57;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean z = false;
        if ((i & 3) != 2) {
            int i5 = onExtraCallback + 57;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2094217422, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$CashflowLineChartKt.lambda$-2094217422.<anonymous> (CashflowLineChart.kt:134)");
            }
            List listListOf = CollectionsKt.listOf(new Integer[]{0, 30, 45, 70, 90, 100});
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
            Iterator it = listListOf.iterator();
            int i7 = onExtraCallback + 85;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            while (it.hasNext()) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(((Number) it.next()).intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
                arrayList.add(bigDecimalValueOf);
            }
            List listListOf2 = CollectionsKt.listOf(new Integer[]{0, 20, 60, 80});
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf2, 10));
            Iterator it2 = listListOf2.iterator();
            int i9 = onExtraCallback + 125;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            while (!(!it2.hasNext())) {
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(((Number) it2.next()).intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "");
                arrayList2.add(bigDecimalValueOf2);
            }
            writeDouble.onNavigationEvent(arrayList, arrayList2, ByteOrderedDataOutputStream.onNavigationEvent(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue()), -1031086, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(103.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(52.0f)), 0.0f, 0.0f, 0.0f, 0.0f, (Integer) null, (String) null, true, cameraCaptureResultEmptyCameraCaptureResult, 24576, 48, 2016);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i11 = onExtraCallback + 115;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }
}
