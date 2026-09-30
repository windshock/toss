package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import im.toss.appsintoss.R;
import im.toss.appsintoss.data.remote.model.AnimationType;
import im.toss.appsintoss.data.remote.model.ProductDetailContent;
import im.toss.appsintoss.data.remote.model.ProductDetailDisclaimer;
import im.toss.appsintoss.data.remote.model.ProductDetailHeader;
import im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContentKt$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExtensionsManager1;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58;
import o.SpannedDataExternalSyntheticLambda0;
import o.getViewTypeCount;
import o.hasProvider;
import o.mExternalSyntheticApiModelOutline1;
import o.mc;
import o.roundUpToNearestHalfInt;
import o.toPreviewOnlyRange;
import o.w5a;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = {27191, 27318, 27312, 27314, 27317, 27310, 27376, 27383, 27285, 27315, 27322, 27322, 27318, 27326, 27292, 27285, 27317, 27317, 27315, 27284, 27291, 27323, 27286, 27292, 27324, 27316, 27317, 27318, 27323, 27317, 27317, 27317, 27315, 27285, 27378, 27279, 27376, 27292, 27299, 27296, 27323, 27316, 27325, 27327, 27288, 27287, 27319, 27322};
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Unit IAuthTabCallback(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return onNavigationEvent(i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onNavigationEvent(i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ProductDetailContent productDetailContent, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(productDetailContent, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 37 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ProductDetailContent productDetailContent, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(productDetailContent, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ProductDetailHeader productDetailHeader, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 2088879180, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{productDetailHeader, mcVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -2088879180);
        int i6 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 20 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(gettimebase, extensionsManager1);
        int i5 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        ProductDetailContent productDetailContent = (ProductDetailContent) objArr[0];
        RightPreset rightPreset = (RightPreset) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(productDetailContent, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i5 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return unitOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallback(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~i7;
        int i10 = (~((~i2) | i9)) | i8;
        int i11 = i3 | i9;
        int i12 = (~(i2 | i8 | i9)) | (~(i7 | i3));
        int i13 = i7 + i3 + i4 + (2049387148 * i5) + ((-609071723) * i6);
        int i14 = i13 * i13;
        int i15 = ((i7 * 335895516) - 1139737737) + (i3 * 335898315) + (i10 * 933) + (i11 * (-1866)) + (i12 * 933) + (335896449 * i4) + ((-616405876) * i5) + (126640917 * i6) + (i14 * 2020605952);
        switch (((1483459036 * i7) - 1284505600) + (2005429323 * i3) + (i10 * 1605645861) + (1083675574 * i11) + (1605645861 * i12) + ((-1205862400) * i4) + ((-243269632) * i5) + ((-895483904) * i6) + ((-1334837248) * i14) + (i15 * i15 * (-544210944))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            default:
                boolean z = false;
                ProductDetailHeader productDetailHeader = (ProductDetailHeader) objArr[0];
                mc mcVar = (mc) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i16 = 2 % 2;
                int i17 = onNavigationEvent + 25;
                onExtraCallbackWithResult = i17 % 128;
                if (i17 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(mcVar, "");
                    if ((iIntValue & 25) == 0) {
                        int i18 = onNavigationEvent + 103;
                        onExtraCallbackWithResult = i18 % 128;
                        int i19 = i18 % 2;
                        if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar)) {
                            int i20 = onExtraCallbackWithResult + 87;
                            onNavigationEvent = i20 % 128;
                            int i21 = i20 % 2 != 0 ? 2 : 4;
                            iIntValue |= i21;
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter(mcVar, "");
                    if ((iIntValue & 6) == 0) {
                    }
                }
                int i22 = iIntValue;
                if ((i22 & 19) != 18) {
                    int i23 = onExtraCallbackWithResult + 111;
                    onNavigationEvent = i23 % 128;
                    if (i23 % 2 == 0) {
                        z = true;
                    }
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i22 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-28832996, i22, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchasePreparationSduiContent.kt:95)");
                    }
                    String strOnExtraCallback = productDetailHeader.onExtraCallback();
                    if (strOnExtraCallback == null) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(29729212);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(29729213);
                        mcVar.onExtraCallbackWithResult(strOnExtraCallback, mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, 300, (getHumanReadableName) null, 0L, 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, (GraphicDeviceInfo) null, (mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, 3072, (i22 << 15) & 458752, 32756);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ProductDetailHeader productDetailHeader = (ProductDetailHeader) objArr[0];
        mc mcVar = (mc) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(productDetailHeader, mcVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i4 != 0) {
            int i5 = 40 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback();
        int i5 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallbackWithResult(i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(ProductDetailDisclaimer productDetailDisclaimer, Function0 function0, boolean z, roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            onExtraCallbackWithResult(productDetailDisclaimer, function0, z, rounduptonearesthalfint, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(productDetailDisclaimer, function0, z, rounduptonearesthalfint, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(gettimebase, extensionsManager1);
        int i5 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getTimebase gettimebase = (getTimebase) objArr[0];
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) objArr[1];
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -349526015, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{gettimebase, extensionsManager1}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 349526022);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 55 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        ProductDetailHeader productDetailHeader = (ProductDetailHeader) objArr[1];
        List list = (List) objArr[2];
        ProductDetailDisclaimer productDetailDisclaimer = (ProductDetailDisclaimer) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        Function0 function0 = (Function0) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        ((Number) objArr[9]).intValue();
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i3 % 128;
        IAuthTabCallback(quirksExternalSyntheticBackport0, productDetailHeader, list, productDetailDisclaimer, zBooleanValue, function0, cameraCaptureResultEmptyCameraCaptureResult, i3 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, ProductDetailHeader productDetailHeader, List list, ProductDetailDisclaimer productDetailDisclaimer, boolean z, Function0 function0, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Unit unit = (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -2086049022, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0, productDetailHeader, list, productDetailDisclaimer, Boolean.valueOf(z), function0, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 2086049025);
        int i8 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(ProductDetailContent productDetailContent, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(productDetailContent, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 682817654, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{function0}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -682817653);
        }
        int i4 = 18 / 0;
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 682817654, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{function0}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -682817653);
    }

    private static final Unit onExtraCallbackWithResult(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(gettimebase, (int) extensionsManager1.onExtraCallbackWithResult());
            return Unit.INSTANCE;
        }
        onExtraCallback(gettimebase, (int) extensionsManager1.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getTimebase gettimebase = (getTimebase) objArr[0];
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) objArr[1];
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(gettimebase, (int) extensionsManager1.onExtraCallbackWithResult());
            return Unit.INSTANCE;
        }
        onExtraCallbackWithResult(gettimebase, (int) extensionsManager1.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(ProductDetailHeader productDetailHeader, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i2 & 6) == 0) {
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            int i5 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 2;
            }
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(334381015, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchasePreparationSduiContent.kt:87)");
                    int i8 = 90 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(334381015, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchasePreparationSduiContent.kt:87)");
                }
                int i9 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 4 % 4;
                }
            }
            mcVar.IAuthTabCallback((List) ProductDetailHeader.onWarmupCompleted(920411578, new Object[]{productDetailHeader}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -920411577, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()), mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, 0, 0, 2000, false, (getHumanReadableName) null, 0L, 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, (GraphicDeviceInfo) null, (mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, 196608, (i3 << 24) & 234881024, 262108);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i11 % 128;
        if (i11 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onTransact(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1149558474, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{gettimebase, Integer.valueOf((int) extensionsManager1.onExtraCallbackWithResult())}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1149558476);
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(ProductDetailDisclaimer productDetailDisclaimer, final Function0 function0, boolean z, roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(rounduptonearesthalfint, "");
        if ((i2 & 6) == 0) {
            int i6 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rounduptonearesthalfint);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rounduptonearesthalfint)) {
                int i7 = onExtraCallbackWithResult + 121;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1654621945, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchasePreparationSduiContent.kt:142)");
            }
            hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
            int iOnNavigationEvent = iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65531, (DefaultConstructorMarker) null));
            try {
                iAuthTabCallback.IAuthTabCallback(productDetailDisclaimer.IAuthTabCallback());
                Unit unit = Unit.INSTANCE;
                iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
                int i9 = ((i3 << 24) & 234881024) | 12582912;
                rounduptonearesthalfint.IAuthTabCallbackStub(iAuthTabCallback.onExtraCallbackWithResult(), (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, (handshake) null, 0, 0.0f, getCombinedPathForAllStarsWithSide.onTransact(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 7, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, i9, 126);
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(953807089);
                Iterator<T> it = productDetailDisclaimer.onNavigationEvent().iterator();
                while (!(!it.hasNext())) {
                    int i10 = onExtraCallbackWithResult + 81;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    rounduptonearesthalfint.IAuthTabCallbackStub((String) it.next(), (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, (handshake) null, 0, 0.0f, getCombinedPathForAllStarsWithSide.onTransact(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 7, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, i9, 126);
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null);
                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_cta_purchase, cameraCaptureResultEmptyCameraCaptureResult, 0);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function02 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContentKt$$ExternalSyntheticLambda5
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke() {
                                int i12 = 2 % 2;
                                int i13 = onNavigationEvent + 19;
                                IAuthTabCallback = i13 % 128;
                                int i14 = i13 % 2;
                                Unit unitOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.onWarmupCompleted(function0);
                                if (i14 == 0) {
                                    int i15 = 97 / 0;
                                }
                                return unitOnWarmupCompleted;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                        obj = function02;
                    }
                    setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{strOnExtraCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, null, null, null, null, (Function0) obj, null, false, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, 48, 444}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i12 = onExtraCallbackWithResult + 23;
                        onNavigationEvent = i12 % 128;
                        if (i12 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i13 = 48 / 0;
                        } else {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            } catch (Throwable th) {
                iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
                throw th;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final ProductDetailHeader productDetailHeader, @NotNull final List<ProductDetailContent> list, @NotNull final ProductDetailDisclaimer productDetailDisclaimer, boolean z, @NotNull final Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        final boolean z2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(productDetailHeader, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(productDetailDisclaimer, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(113496100);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i2 & 6) == 0) {
            int i10 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i2;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i12 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(productDetailHeader);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(productDetailHeader) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list)) {
                int i13 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(productDetailDisclaimer)) {
                int i15 = onExtraCallbackWithResult + 27;
                onNavigationEvent = i15 % 128;
                i6 = i15 % 2 != 0 ? 16145 : 2048;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
        }
        int i16 = i3 & 16;
        if (i16 == 0) {
            if ((i2 & 24576) == 0) {
                int i17 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i17 % 128;
                int i18 = i17 % 2;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 16384 : 8192;
            }
            if ((i2 & 196608) == 0) {
                int i19 = onNavigationEvent + 99;
                onExtraCallbackWithResult = i19 % 128;
                int i20 = i19 % 2;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 131072 : 65536;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i4) == 74898, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                z2 = z;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i9 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                boolean z4 = i16 != 0 ? false : z;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(113496100, i4, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContent (InAppPurchasePreparationSduiContent.kt:54)");
                }
                setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    int i21 = onExtraCallbackWithResult + 27;
                    onNavigationEvent = i21 % 128;
                    objOnMinimized = i21 % 2 != 0 ? notifyPublicListeners.onWarmupCompleted(1) : notifyPublicListeners.onWarmupCompleted(0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                final getTimebase gettimebase = (getTimebase) objOnMinimized;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = notifyPublicListeners.onWarmupCompleted(0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                final getTimebase gettimebase2 = (getTimebase) objOnMinimized2;
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = notifyPublicListeners.onWarmupCompleted(0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                final getTimebase gettimebase3 = (getTimebase) objOnMinimized3;
                float fC_ = r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(Math.max((IAuthTabCallback(gettimebase) - onWarmupCompleted(gettimebase2)) - onNavigationEvent(gettimebase3), r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f))));
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContentKt$$ExternalSyntheticLambda8
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2) {
                            int i22 = 2 % 2;
                            int i23 = IAuthTabCallback + 27;
                            onNavigationEvent = i23 % 128;
                            int i24 = i23 % 2;
                            Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.IAuthTabCallback(gettimebase, (ExtensionsManager1) obj2);
                            int i25 = onNavigationEvent + 3;
                            IAuthTabCallback = i25 % 128;
                            int i26 = i25 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport05, (Function1) objOnMinimized4), setcontentinsetsrelativeIAuthTabCallback, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    z3 = z4;
                    int i22 = onNavigationEvent + 69;
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                    onExtraCallbackWithResult = i22 % 128;
                    if (i22 % 2 == 0) {
                        getAwbState.onExtraCallback();
                        int i23 = 39 / 0;
                    } else {
                        getAwbState.onExtraCallback();
                    }
                } else {
                    z3 = z4;
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized5 = new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContentKt$$ExternalSyntheticLambda9
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i24 = 2 % 2;
                            int i25 = onNavigationEvent + 33;
                            onExtraCallbackWithResult = i25 % 128;
                            if (i25 % 2 != 0) {
                                throw null;
                            }
                            Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -660850047, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{gettimebase2, (ExtensionsManager1) obj2}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 660850051);
                            int i26 = onNavigationEvent + 7;
                            onExtraCallbackWithResult = i26 % 128;
                            if (i26 % 2 != 0) {
                                int i27 = 29 / 0;
                            }
                            return unit;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = calculatePlaceholderForExtensions.onExtraCallbackWithResult(onextracallback, (Function1) objOnMinimized5);
                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                z2 = z3;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                AppLovinNativeAdImplc.onExtraCallbackWithResult(productDetailHeader.asBinder(), setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f), 0.0f, 0.0f, 12, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(64.0f)), androidx.compose.foundation.shape.RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f))), 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 508);
                if (productDetailHeader.onNavigationEvent() == AnimationType.RISING_TEXT) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(301536076);
                    r8lambda4JCsOS_fRrbU6o4wWMePlfE_iLw.onExtraCallback(ForwardingCameraControl.onExtraCallback(334381015, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContentKt$$ExternalSyntheticLambda10
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            Unit unit;
                            int i24 = 2 % 2;
                            int i25 = onExtraCallbackWithResult + 57;
                            onWarmupCompleted = i25 % 128;
                            if (i25 % 2 != 0) {
                                unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -730805735, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{productDetailHeader, (mc) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 730805740);
                                int i26 = 35 / 0;
                            } else {
                                unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -730805735, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{productDetailHeader, (mc) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 730805740);
                            }
                            int i27 = onExtraCallbackWithResult + 123;
                            onWarmupCompleted = i27 % 128;
                            int i28 = i27 % 2;
                            return unit;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(-28832996, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContentKt$$ExternalSyntheticLambda11
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i24 = 2 % 2;
                            int i25 = IAuthTabCallback + 13;
                            onWarmupCompleted = i25 % 128;
                            int i26 = i25 % 2;
                            ProductDetailHeader productDetailHeader2 = productDetailHeader;
                            mc mcVar = (mc) obj2;
                            if (i26 == 0) {
                                return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.IAuthTabCallback(productDetailHeader2, mcVar, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            }
                            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.IAuthTabCallback(productDetailHeader2, mcVar, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallback(), (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1769478, 0, 16286);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(302317152);
                    String strJoinToString$default = CollectionsKt.joinToString$default((List) ProductDetailHeader.onWarmupCompleted(920411578, new Object[]{productDetailHeader}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -920411577, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 8, (Object) null);
                    long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(28);
                    GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult();
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strJoinToString$default, quirksExternalSyntheticBackport0OnExtraCallback, null, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable()), Long.valueOf(jOnExtraCallback), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnExtraCallbackWithResult, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24624, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    String strOnExtraCallback = productDetailHeader.onExtraCallback();
                    if (strOnExtraCallback == null) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(302720461);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(302720462);
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 8, (Object) null), null, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(14)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24624, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        Unit unit = Unit.INSTANCE;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                if (!list.isEmpty()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(303141969);
                    i5 = 0;
                    component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                    Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        int i24 = onNavigationEvent + 77;
                        onExtraCallbackWithResult = i24 % 128;
                        int i25 = i24 % 2;
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent3, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-592114767);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        onNavigationEvent((ProductDetailContent) it.next(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    i5 = 0;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(303319754);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback2, fC_), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i5);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized6 = new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContentKt$$ExternalSyntheticLambda12
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i26 = 2 % 2;
                            int i27 = IAuthTabCallback + 19;
                            onNavigationEvent = i27 % 128;
                            int i28 = i27 % 2;
                            Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.onExtraCallback(gettimebase3, (ExtensionsManager1) obj2);
                            int i29 = IAuthTabCallback + 51;
                            onNavigationEvent = i29 % 128;
                            if (i29 % 2 == 0) {
                                int i30 = 36 / 0;
                            }
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = calculatePlaceholderForExtensions.onExtraCallbackWithResult(onextracallback2, (Function1) objOnMinimized6);
                component5 component5VarOnNavigationEvent4 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i5);
                int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i5));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback4 = onextracallbackwithresult3.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback4);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnNavigationEvent4, onextracallbackwithresult3.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult3.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult3.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult3.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult3.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                r8lambdaL3YVedIYrkax5fojVMcLJQJpM.onExtraCallback(1461071866, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{onextracallback2, 0L, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), null, ForwardingCameraControl.onExtraCallback(1654621945, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContentKt$$ExternalSyntheticLambda13
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i26 = 2 % 2;
                        int i27 = onWarmupCompleted + 109;
                        IAuthTabCallback = i27 % 128;
                        int i28 = i27 % 2;
                        Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.onExtraCallback(productDetailDisclaimer, function0, z2, (roundUpToNearestHalfInt) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i29 = IAuthTabCallback + 125;
                        onWarmupCompleted = i29 % 128;
                        if (i29 % 2 != 0) {
                            int i30 = 27 / 0;
                        }
                        return unitOnExtraCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24966, 10}, -1461071865, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final boolean z5 = z2;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContentKt$$ExternalSyntheticLambda14
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i26 = 2 % 2;
                        int i27 = onExtraCallbackWithResult + 21;
                        onNavigationEvent = i27 % 128;
                        if (i27 % 2 != 0) {
                            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.onNavigationEvent(quirksExternalSyntheticBackport03, productDetailHeader, list, productDetailDisclaimer, z5, function0, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.onNavigationEvent(quirksExternalSyntheticBackport03, productDetailHeader, list, productDetailDisclaimer, z5, function0, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        i4 |= 24576;
        int i26 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i26 % 128;
        int i27 = i26 % 2;
        if ((i2 & 196608) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i4) == 74898, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onExtraCallback(ProductDetailContent productDetailContent, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i5 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i5 % 128;
                i3 = i5 % 2 == 0 ? 3 : 4;
            } else {
                int i6 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                i3 = 2;
            }
            i2 |= i3;
            int i8 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i10 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-554846831, i2, -1, "im.toss.appsintoss.iap.screen.ContentItem.<anonymous> (InAppPurchasePreparationSduiContent.kt:183)");
            }
            w5aVar.onExtraCallbackWithResult(productDetailContent.onWarmupCompleted(), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 6) & 896, 2);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(ProductDetailContent productDetailContent, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            int i7 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-876688383, i3, -1, "im.toss.appsintoss.iap.screen.ContentItem.<anonymous> (InAppPurchasePreparationSduiContent.kt:188)");
            }
            rightPreset.IAuthTabCallback(productDetailContent.IAuthTabCallback(), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, 57344 & (i3 << 12), 12);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i9 = onNavigationEvent + 77;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[PHI: r1
      0x0033: PHI (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
      0x0028: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final ProductDetailContent productDetailContent, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(681929902);
            if ((i2 & 116) == 0) {
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(productDetailContent) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(681929902);
            if ((i2 & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 3) != 2, i3 & 1)) {
            int i6 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(681929902, i3, -1, "im.toss.appsintoss.iap.screen.ContentItem (InAppPurchasePreparationSduiContent.kt:180)");
            }
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-554846831, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContentKt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallbackWithResult + 79;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.IAuthTabCallback(productDetailContent, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i10 = onWarmupCompleted + 23;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-876688383, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContentKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 11;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1220316018, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{productDetailContent, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1220316024);
                    int i10 = onWarmupCompleted + 1;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.IAuthTabCallback(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 384, 126942);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 67;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 26 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiContentKt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 79;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    ProductDetailContent productDetailContent2 = productDetailContent;
                    if (i11 != 0) {
                        return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.IAuthTabCallback(productDetailContent2, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.IAuthTabCallback(productDetailContent2, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
            int i9 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallback;
        Throwable th = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 35283), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35, Color.red(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i8 = $10 + 23;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = $10 + 113;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getPressedStateDuration() >> 16) + 65, ImageFormat.getBitsPerPixel(0) + 16719, -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(th, objArr3)).charValue();
                            th.hashCode();
                            throw th;
                        } catch (Throwable th3) {
                            Throwable cause2 = th3.getCause();
                            if (cause2 == null) {
                                throw th3;
                            }
                            throw cause2;
                        }
                    }
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 10935), (Process.myTid() >> 22) + 65, 16718 - (ViewConfiguration.getTouchSlop() >> 8), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(th, objArr4)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 28 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 17657 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(th, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 49467), (ViewConfiguration.getScrollBarSize() >> 8) + 70, 12486 - (ViewConfiguration.getTapTimeout() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                th = null;
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i14 = $11 + 9;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i16, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $10 + 35;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static final Unit onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[PHI: r14
      0x0025: PHI (r14v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r14v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r14v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r14
      0x0023: PHI (r14v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r14v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r14v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-439876360);
            int i5 = 15 / 0;
            z = i2 != 0;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-439876360);
            if (i2 != 0) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i6 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-439876360, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiRisingTextContentPreview (InAppPurchasePreparationSduiContent.kt:199)");
                int i8 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            }
            AnimationType animationType = AnimationType.RISING_TEXT;
            List listListOf = CollectionsKt.listOf(new String[]{"골드상자를\n30일 동안 무료로 써볼까요?", "체험 기간이 끝나면\n월 9900원에 이용할 수 있어요"});
            Object[] objArr = new Object[1];
            a(new int[]{0, 48, 138, 0}, false, new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1}, objArr);
            ProductDetailHeader productDetailHeader = new ProductDetailHeader(animationType, ((String) objArr[0]).intern(), listListOf, "매월 자동 결제돼요");
            List listListOf2 = CollectionsKt.listOf(new ProductDetailContent[]{new ProductDetailContent("무료 체험 기간", "26. 01. 01~27. 01. 01"), new ProductDetailContent("체험 이후 구독료", "매월 9,900원"), new ProductDetailContent("결제 시작일", "27. 01. 02")});
            ProductDetailDisclaimer productDetailDisclaimer = new ProductDetailDisclaimer("안내사항", CollectionsKt.listOf(new String[]{"토스는 해당 서비스 제휴사이며, 결제는 구글 플레이스토어를 통해서 진행돼요.", "환불 신청은 구글 플레이스토어에서만 가능해요. 토스를 통한 환불 신청은 불가해요.", "구독을 취소하지 않으면 매월 자동으로 결제돼요."}));
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new InAppPurchasePreparationSduiContentKt$.ExternalSyntheticLambda3();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            IAuthTabCallback(null, productDetailHeader, listListOf2, productDetailDisclaimer, false, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 200112, 17);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new InAppPurchasePreparationSduiContentKt$.ExternalSyntheticLambda4(i2));
        }
    }

    private static final Unit IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        boolean z;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1586122217);
            obj.hashCode();
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1586122217);
        if (i2 != 0) {
            int i5 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1586122217, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiNoneAnimationContentPreview (InAppPurchasePreparationSduiContent.kt:238)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1586122217, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationSduiNoneAnimationContentPreview (InAppPurchasePreparationSduiContent.kt:238)");
            }
            AnimationType animationType = AnimationType.NONE;
            List listListOf = CollectionsKt.listOf(new String[]{"골드상자를\n30일 동안 무료로 써볼까요?", "체험 기간이 끝나면\n월 9900원에 이용할 수 있어요"});
            Object[] objArr = new Object[1];
            a(new int[]{0, 48, 138, 0}, false, new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1}, objArr);
            ProductDetailHeader productDetailHeader = new ProductDetailHeader(animationType, ((String) objArr[0]).intern(), listListOf, "매월 자동 결제돼요");
            List listListOf2 = CollectionsKt.listOf(new ProductDetailContent[]{new ProductDetailContent("무료 체험 기간", "26. 01. 01~27. 01. 01"), new ProductDetailContent("체험 이후 구독료", "매월 9,900원"), new ProductDetailContent("결제 시작일", "27. 01. 02")});
            ProductDetailDisclaimer productDetailDisclaimer = new ProductDetailDisclaimer("안내사항", CollectionsKt.listOf(new String[]{"토스는 해당 서비스 제휴사이며, 결제는 구글 플레이스토어를 통해서 진행돼요.", "환불 신청은 구글 플레이스토어에서만 가능해요. 토스를 통한 환불 신청은 불가해요.", "구독을 취소하지 않으면 매월 자동으로 결제돼요."}));
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new InAppPurchasePreparationSduiContentKt$.ExternalSyntheticLambda6();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            IAuthTabCallback(null, productDetailHeader, listListOf2, productDetailDisclaimer, false, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 200112, 17);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new InAppPurchasePreparationSduiContentKt$.ExternalSyntheticLambda7(i2));
        }
    }

    private static final int IAuthTabCallback(getTimebase gettimebase) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        int i5 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return iOnWarmupCompleted;
    }

    private static final void onExtraCallback(getTimebase gettimebase, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        gettimebase.onExtraCallback(i2);
        int i6 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final int onWarmupCompleted(getTimebase gettimebase) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        int i5 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return iOnWarmupCompleted;
    }

    private static final void onExtraCallbackWithResult(getTimebase gettimebase, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        gettimebase.onExtraCallback(i2);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 44 / 0;
        }
    }

    private static final int onNavigationEvent(getTimebase gettimebase) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        if (i4 == 0) {
            int i5 = 75 / 0;
        }
        int i6 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return iOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getTimebase gettimebase = (getTimebase) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(iIntValue);
        int i5 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ProductDetailContent productDetailContent, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1220316018, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{productDetailContent, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1220316024);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ProductDetailHeader productDetailHeader, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -730805735, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{productDetailHeader, mcVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 730805740);
    }

    public static /* synthetic */ Unit onNavigationEvent(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -660850047, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{gettimebase, extensionsManager1}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 660850051);
    }

    private static final Unit onWarmupCompleted(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -349526015, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{gettimebase, extensionsManager1}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 349526022);
    }

    private static final Unit onWarmupCompleted(ProductDetailHeader productDetailHeader, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 2088879180, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{productDetailHeader, mcVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -2088879180);
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0) {
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 682817654, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{function0}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -682817653);
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, ProductDetailHeader productDetailHeader, List list, ProductDetailDisclaimer productDetailDisclaimer, boolean z, Function0 function0, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -2086049022, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0, productDetailHeader, list, productDetailDisclaimer, Boolean.valueOf(z), function0, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 2086049025);
    }

    private static final void IAuthTabCallback(getTimebase gettimebase, int i2) {
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1149558474, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{gettimebase, Integer.valueOf(i2)}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1149558476);
    }
}
