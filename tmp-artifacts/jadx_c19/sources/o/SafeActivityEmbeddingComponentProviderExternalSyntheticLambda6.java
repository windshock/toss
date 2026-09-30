package o;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleEventObserver;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.tmoney.a;
import im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tds.compose.component.atom.image.ResourceSizeKt;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.areAllItemsEnabled;
import o.areCachedAdResourcesMissing;
import o.decrementVideoUsage;
import o.getCreativeId;
import o.getPrivacyDestinationUri;
import o.isInVideoUsage;
import o.oExternalSyntheticLambda0;
import o.roundUpToNearestHalfInt;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u3;
import o.u4;
import o.wa;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda3;
import o.y1a;
import o.y1b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long onExtraCallback = -3933690174926529762L;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i7;
        int i9 = ~i4;
        int i10 = (~i2) | i9;
        int i11 = ~(i2 | i9);
        int i12 = i4 + i7 + i6 + ((-714989572) * i3) + (1142003473 * i5);
        int i13 = i12 * i12;
        int i14 = (((-190873766) * i4) - 1983905792) + (1136689320 * i7) + (i8 * (-1483702105)) + (1483702105 * i10) + ((-1483702105) * i11) + ((-1674575872) * i6) + ((-1891631104) * i3) + ((-1355808768) * i5) + ((-1882259456) * i13);
        int i15 = (i4 * (-1158907614)) + 1427560840 + (i7 * (-1158905656)) + (i8 * 979) + (i10 * (-979)) + (i11 * 979) + (i6 * (-1158906635)) + (i3 * 1387703340) + (i5 * 1202573125) + (i13 * (-451215360));
        switch (i14 + (i15 * i15 * (-310837248))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27) objArr[3];
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33) objArr[4];
        getCreativeId getcreativeid = (getCreativeId) objArr[5];
        Function1 function1 = (Function1) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int iIntValue2 = ((Number) objArr[8]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue3 = ((Number) objArr[10]).intValue();
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, str, str2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, getcreativeid, function1, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i5 = onWarmupCompleted + 123;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 95;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Map map, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 37;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return asBinder(map, setDetectableSize);
        }
        asBinder(map, setDetectableSize);
        throw null;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, getCreativeId getcreativeid, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 59;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, str, str2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, getcreativeid, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 47;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getCreativeId getcreativeid, Function1 function1, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, Map map) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getcreativeid, function1, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, map);
        if (i4 != 0) {
            int i5 = 9 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getCreativeId getcreativeid = (getCreativeId) objArr[0];
        Map map = (Map) objArr[1];
        Map map2 = (Map) objArr[2];
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[3];
        TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult = (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult) objArr[4];
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        onNavigationEvent(getcreativeid, map, map2, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = onNavigationEvent + 109;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33) objArr[0];
        y1a y1aVar = (y1a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onNavigationEvent + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(Map map, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(map, setDetectableSize);
        int i5 = onNavigationEvent + 73;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 47;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback onextracallback = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback) objArr[0];
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(onextracallback);
        }
        IAuthTabCallback(onextracallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 89;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 0 / 0;
        }
        int i8 = onWarmupCompleted + 7;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, Function1 function1, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, function1, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 5;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, getCreativeId getcreativeid, Map map, Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, getcreativeid, map, function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 45;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Map map = (Map) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 77;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return asInterface(map, setDetectableSize);
        }
        asInterface(map, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Map map, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{map, setDetectableSize}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -421516469, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 421516474);
        int i5 = onNavigationEvent + 41;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{function1, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 799539611, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -799539609);
        int i5 = onNavigationEvent + 59;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 0 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, rounduptonearesthalfint, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 97;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(getCreativeId getcreativeid, Function1 function1, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, Map map) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 33;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            onWarmupCompleted(getcreativeid, function1, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, map);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(getcreativeid, function1, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, map);
        int i4 = onWarmupCompleted + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ decrementVideoUsage onNavigationEvent(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getCreativeId getcreativeid, Map map, Map map2, isInVideoUsage isinvideousage) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        decrementVideoUsage decrementvideousageIAuthTabCallback = IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda0, getcreativeid, map, map2, isinvideousage);
        int i5 = onNavigationEvent + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return decrementvideousageIAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33) objArr[0];
        y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i5 = onWarmupCompleted + 31;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, arecachedadresourcesmissing, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        Unit unit = (Unit) IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -507577370, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 507577377);
        int i6 = onWarmupCompleted + 119;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, getCreativeId getcreativeid, Map map, Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, getcreativeid, map, function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 63;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 109;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback onextracallback) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 125;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent implements decrementVideoUsage {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ LifecycleEventObserver onExtraCallback;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 onNavigationEvent;

        public onNavigationEvent(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LifecycleEventObserver lifecycleEventObserver) {
            this.onNavigationEvent = textFieldScrollKtExternalSyntheticLambda0;
            this.onExtraCallback = lifecycleEventObserver;
        }

        public void dispose() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            this.onNavigationEvent.getLifecycle().onExtraCallbackWithResult(this.onExtraCallback);
            int i5 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i4 = $10 + 95;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 45812), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 84, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 14185), 19 - TextUtils.indexOf("", ""), 8808 - View.resolveSize(0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $10 + 29;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 / 5;
                }
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

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Map map = (Map) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(map);
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 13;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(Map map, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 1;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(map);
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 51;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void onNavigationEvent(getCreativeId getcreativeid, final Map map, final Map map2, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult2 = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START;
            throw null;
        }
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onextracallbackwithresult == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START) {
            getCreativeId.onExtraCallback(getcreativeid, 1603495L, (Set) null, false, "appsintoss_app_visit__iap_purchase_error::impression__cta", false, new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    Unit unitOnNavigationEvent;
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 117;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onNavigationEvent(map2, (SetDetectableSize) obj);
                        int i6 = 38 / 0;
                    } else {
                        unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onNavigationEvent(map2, (SetDetectableSize) obj);
                    }
                    int i7 = onWarmupCompleted + 27;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        return unitOnNavigationEvent;
                    }
                    throw null;
                }
            }, 22, (Object) null);
            if (map != null) {
                getCreativeId.onExtraCallback(getcreativeid, 1603495L, (Set) null, false, "appsintoss_app_visit__iap_purchase_error::impression__cta", false, new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onWarmupCompleted + 81;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onExtraCallback(map, (SetDetectableSize) obj);
                        int i7 = IAuthTabCallback + 71;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        return unitOnExtraCallback;
                    }
                }, 22, (Object) null);
                int i4 = onWarmupCompleted + 39;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    private static final Unit onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 39;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1) ? 4 : 2) | i2;
            int i7 = onNavigationEvent + 3;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 / 5;
            }
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i9 = onNavigationEvent + 83;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onWarmupCompleted + 15;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1409876455, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppPurchasePreparationErrorContent.kt:94)");
                int i13 = onWarmupCompleted + 105;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
            }
            appLovinNativeAdImplExternalSyntheticLambda1.IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallbackWithResult(), (QuirksExternalSyntheticBackport0) null, 0L, (QuirkSettingsLoader) null, ResourceSizeKt.onNavigationEvent(immediateFailedFuture.Companion, 1.0f), (String) null, cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 18) & 3670016) | 24576, 46);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onWarmupCompleted + 71;
                onNavigationEvent = i15 % 128;
                if (i15 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i16 = 80 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1bVar, "");
        if ((i2 & 6) == 0) {
            int i6 = onNavigationEvent + 95;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar)) {
                int i8 = onWarmupCompleted + 125;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i10 = onWarmupCompleted + 45;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i12 = onWarmupCompleted + 125;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onNavigationEvent + 33;
                onWarmupCompleted = i13 % 128;
                if (i13 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(877044529, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchasePreparationErrorContent.kt:88)");
                    int i14 = 2 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(877044529, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchasePreparationErrorContent.kt:88)");
                }
            }
            y1bVar.onExtraCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.IAuthTabCallbackDefault(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(64.0f)), (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), (Function0) null, ForwardingCameraControl.onExtraCallback(1409876455, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda18
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i15 = 2 % 2;
                    int i16 = onExtraCallbackWithResult + 57;
                    onWarmupCompleted = i16 % 128;
                    if (i16 % 2 != 0) {
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, (AppLovinNativeAdImplExternalSyntheticLambda1) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, (AppLovinNativeAdImplExternalSyntheticLambda1) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i17 = onExtraCallbackWithResult + 105;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 18) & 3670016) | 199734, 20);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                int i6 = onWarmupCompleted + 61;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            int i8 = onWarmupCompleted + 35;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            int i10 = onWarmupCompleted + 107;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(280343582, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchasePreparationErrorContent.kt:102)");
                int i11 = onWarmupCompleted + 55;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onNavigationEvent(), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i3 << 15) & 458752) | 24576), 10}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i13 = onWarmupCompleted + 33;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2) | i2;
            int i5 = onWarmupCompleted + 13;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i7 = onWarmupCompleted + 109;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-527857601, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchasePreparationErrorContent.kt:110)");
            }
            String strOnWarmupCompleted = safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onWarmupCompleted();
            if (strOnWarmupCompleted == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1530468158);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1530468157);
                Object[] objArr = {y1externalsyntheticlambda3, strOnWarmupCompleted, null, 0L, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), isRepeatingEnabled.onExtraCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i3 << 15) & 458752) | 24576), 6};
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onNavigationEvent + 105;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i5 = onWarmupCompleted + 61;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onWarmupCompleted + 15;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1625396500, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchasePreparationErrorContent.kt:125)");
                    int i8 = 63 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1625396500, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchasePreparationErrorContent.kt:125)");
                }
            }
            areallitemsenabled.onWarmupCompleted(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback().IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 18) & 3670016) | 196608, 22);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[LOOP:0: B:27:0x0091->B:29:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        boolean z;
        Iterator<T> it;
        int i2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33) objArr[0];
        areCachedAdResourcesMissing arecachedadresourcesmissing = (areCachedAdResourcesMissing) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(arecachedadresourcesmissing, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(arecachedadresourcesmissing)) {
                i2 = 4;
            } else {
                int i4 = onWarmupCompleted + 33;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                i2 = 2;
            }
            iIntValue |= i2;
        }
        int i6 = iIntValue;
        if ((i6 & 19) != 18) {
            int i7 = onNavigationEvent + 9;
            onWarmupCompleted = i7 % 128;
            z = i7 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i6 & 1)) {
            int i8 = onNavigationEvent + 11;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 47 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1113156103, i6, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppPurchasePreparationErrorContent.kt:137)");
                }
                it = safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback().onExtraCallback().iterator();
                int i10 = onNavigationEvent + 31;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                while (it.hasNext()) {
                    int i12 = i6;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    arecachedadresourcesmissing.onWarmupCompleted((String) it.next(), (QuirksExternalSyntheticBackport0) null, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult2, 0, i12 & 14, 1018);
                    i6 = i12;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                it = safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback().onExtraCallback().iterator();
                int i102 = onNavigationEvent + 31;
                onWarmupCompleted = i102 % 128;
                int i112 = i102 % 2;
                while (it.hasNext()) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(rounduptonearesthalfint, "");
        if ((i2 & 6) == 0) {
            int i7 = onWarmupCompleted + 111;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rounduptonearesthalfint);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rounduptonearesthalfint) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i8 = onNavigationEvent + 17;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            int i10 = onNavigationEvent + 95;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(373471844, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchasePreparationErrorContent.kt:134)");
            }
            rounduptonearesthalfint.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, 0, 0.0f, 0L, (GraphicDeviceInfo) null, getCombinedPathForAllStarsWithSide.IAuthTabCallbackDefault(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 7, (Object) null), ForwardingCameraControl.onExtraCallback(1113156103, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda4
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i12 = 2 % 2;
                    int i13 = onExtraCallbackWithResult + 13;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onWarmupCompleted(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, (areCachedAdResourcesMissing) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i15 = onExtraCallbackWithResult + 111;
                    onExtraCallback = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 32 / 0;
                    }
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1769472 | ((i3 << 21) & 29360128), 31);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onNavigationEvent + 65;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(Map map, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 121;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(map);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(map);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getCreativeId getcreativeid, Function1 function1, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, final Map map) {
        int i2 = 2 % 2;
        getCreativeId.onExtraCallback(getcreativeid, 1603497L, (Set) null, false, "appsintoss_app_visit__iap_purchase_error::click__cta", false, new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda20
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i4 % 128;
                Object obj2 = null;
                if (i4 % 2 != 0) {
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.IAuthTabCallback(map, (SetDetectableSize) obj);
                    obj2.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.IAuthTabCallback(map, (SetDetectableSize) obj);
                int i5 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                obj2.hashCode();
                throw null;
            }
        }, 22, (Object) null);
        function1.invoke(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 117;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, final getCreativeId getcreativeid, final Map map, final Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        boolean zOnExtraCallback;
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        boolean zOnExtraCallback2;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i2 & 18) == 0) {
                i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
            } else {
                i3 = i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i2 & 6) == 0) {
            }
        }
        if ((i3 & 19) != 18) {
            int i6 = onWarmupCompleted;
            int i7 = i6 + 21;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 103;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            int i11 = onNavigationEvent + 67;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 80 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-415976847, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContent.<anonymous>.<anonymous> (InAppPurchasePreparationErrorContent.kt:152)");
                }
                String strOnWarmupCompleted = safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().onWarmupCompleted();
                setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
                setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
                setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
                setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Block;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getcreativeid);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(map);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback | zOnNavigationEvent | zOnNavigationEvent2 | zOnExtraCallback2) {
                    int i13 = onWarmupCompleted + 105;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function0 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallback;

                            public final Object invoke() {
                                int i15 = 2 % 2;
                                int i16 = onExtraCallback + 3;
                                IAuthTabCallback = i16 % 128;
                                int i17 = i16 % 2;
                                Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.IAuthTabCallback(getcreativeid, function1, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, map);
                                int i18 = onExtraCallback + 115;
                                IAuthTabCallback = i18 % 128;
                                if (i18 % 2 != 0) {
                                    return unitIAuthTabCallback;
                                }
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                        int i15 = onNavigationEvent + 99;
                        onWarmupCompleted = i15 % 128;
                        int i16 = i15 % 2;
                        obj = function0;
                    }
                    u4Var.onNavigationEvent(strOnWarmupCompleted, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i3 & 14, 774);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                String strOnWarmupCompleted2 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().onWarmupCompleted();
                setCallToAction.onWarmupCompleted onwarmupcompleted2 = setCallToAction.onWarmupCompleted.Primary;
                setCallToAction.onExtraCallback onextracallback2 = setCallToAction.onExtraCallback.Fill;
                setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult2 = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
                setCallToAction.onNavigationEvent onnavigationevent2 = setCallToAction.onNavigationEvent.Block;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getcreativeid);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(map);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback | zOnNavigationEvent | zOnNavigationEvent2 | zOnExtraCallback2) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(Map map, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(map);
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(getCreativeId getcreativeid, Function1 function1, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, final Map map) {
        int i2 = 2 % 2;
        getCreativeId.onExtraCallback(getcreativeid, 1603497L, (Set) null, false, "appsintoss_app_visit__iap_purchase_error::click__cta", false, new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda19
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 37;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    Object[] objArr = {map, (SetDetectableSize) obj};
                    throw null;
                }
                Object[] objArr2 = {map, (SetDetectableSize) obj};
                Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1037604933, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1037604933);
                int i5 = onExtraCallback + 117;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }, 22, (Object) null);
        function1.invoke(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().asBinder());
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 97;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 48 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, final getCreativeId getcreativeid, final Map map, final Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i2 & 6) == 0) {
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        boolean z = false;
        if ((i3 & 19) != 18) {
            int i5 = onWarmupCompleted + 101;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(852621171, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContent.<anonymous>.<anonymous> (InAppPurchasePreparationErrorContent.kt:166)");
            }
            if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().asInterface() != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(821654);
                String strAsInterface = safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().asInterface();
                setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
                setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
                setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
                setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Block;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getcreativeid);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(map);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnExtraCallback | zOnNavigationEvent | zOnNavigationEvent2) || zOnExtraCallback2) {
                    objOnMinimized = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda21
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i6 = 2 % 2;
                            int i7 = onWarmupCompleted + 125;
                            onExtraCallbackWithResult = i7 % 128;
                            int i8 = i7 % 2;
                            Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onNavigationEvent(getcreativeid, function1, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, map);
                            int i9 = onWarmupCompleted + 7;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            return unitOnNavigationEvent;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    int i6 = onNavigationEvent + 123;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    u4Var.onNavigationEvent(strAsInterface, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) objOnMinimized, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i3 & 14, 774);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    int i8 = onNavigationEvent + 43;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    u4Var.onNavigationEvent(strAsInterface, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) objOnMinimized, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i3 & 14, 774);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1478575);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onWarmupCompleted + 53;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = onWarmupCompleted + 13;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33) objArr[1];
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 33;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            function1.invoke(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().onExtraCallbackWithResult());
            int i4 = 98 / 0;
            return Unit.INSTANCE;
        }
        function1.invoke(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, final Function1 function1, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i2 & 6) == 0) {
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i5 = onWarmupCompleted + 57;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 4;
            }
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(198224888, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContent.<anonymous>.<anonymous> (InAppPurchasePreparationErrorContent.kt:184)");
            }
            if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().onNavigationEvent() != null) {
                int i7 = onWarmupCompleted + 107;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-262314199);
                    safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().onNavigationEvent();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-262314199);
                String strOnNavigationEvent = safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().onNavigationEvent();
                String str = strOnNavigationEvent != null ? strOnNavigationEvent : "";
                oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent();
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent || zOnExtraCallback) {
                    objOnMinimized = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda17
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i8 = 2 % 2;
                            int i9 = onNavigationEvent + 29;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onNavigationEvent(function1, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33);
                            int i11 = onNavigationEvent + 25;
                            onExtraCallbackWithResult = i11 % 128;
                            if (i11 % 2 != 0) {
                                return unitOnNavigationEvent;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    u3Var.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, onextracallbackwithresultOnNavigationEvent, 0L, false, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 21) & 29360128) | 3072, 54);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i8 = onNavigationEvent + 115;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    int i10 = onWarmupCompleted + 95;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    u3Var.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, onextracallbackwithresultOnNavigationEvent, 0L, false, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 21) & 29360128) | 3072, 54);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i82 = onNavigationEvent + 115;
                    onWarmupCompleted = i82 % 128;
                    int i92 = i82 % 2;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-261974966);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = onNavigationEvent + 33;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final String str, @Nullable final String str2, @NotNull final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, @NotNull final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, @NotNull final getCreativeId getcreativeid, @Nullable Function1<? super SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) throws Throwable {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        final Function1<? super SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback, Unit> function12;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        final Map mapIAuthTabCallback;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = onNavigationEvent + 73;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, "");
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, "");
        Intrinsics.checkNotNullParameter(getcreativeid, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-845714002);
        int i10 = i3 & 1;
        if (i10 != 0) {
            int i11 = onNavigationEvent + 85;
            onWarmupCompleted = i11 % 128;
            i4 = i11 % 2 != 0 ? i2 | 43 : i2 | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i2 & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i2;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i12 = onNavigationEvent + 97;
                onWarmupCompleted = i12 % 128;
                i6 = i12 % 2 != 0 ? 45 : 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i2 & 384) == 0) {
            i4 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 128 : 256;
            int i13 = onWarmupCompleted + 121;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
        }
        Object obj = null;
        if ((i2 & 3072) == 0) {
            int i15 = onNavigationEvent + 55;
            onWarmupCompleted = i15 % 128;
            if (i15 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27);
                obj.hashCode();
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33)) {
                int i16 = onNavigationEvent + 29;
                onWarmupCompleted = i16 % 128;
                i5 = i16 % 2 != 0 ? 20944 : 16384;
            } else {
                i5 = 8192;
            }
            i4 |= i5;
        }
        if ((i2 & 196608) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getcreativeid) ? 131072 : 65536;
        }
        int i17 = i3 & 64;
        if (i17 == 0) {
            if ((i2 & 1572864) == 0) {
                function12 = function1;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 1048576 : 524288;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i4) == 599186, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i10 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (i17 != 0) {
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda6
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2) {
                                int i18 = 2 % 2;
                                int i19 = onNavigationEvent + 53;
                                IAuthTabCallback = i19 % 128;
                                int i20 = i19 % 2;
                                Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback) obj2}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 218808785, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -218808782);
                                int i21 = IAuthTabCallback + 45;
                                onNavigationEvent = i21 % 128;
                                int i22 = i21 % 2;
                                return unit;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    function12 = (Function1) objOnMinimized;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-845714002, i4, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContent (InAppPurchasePreparationErrorContent.kt:42)");
                }
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("product_id", str);
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("service_name", str2);
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("error_type", safeActivityEmbeddingComponentProviderExternalSyntheticLambda27.onExtraCallback());
                final Function1<? super SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback, Unit> function13 = function12;
                Object[] objArr = new Object[1];
                a(new char[]{50886, 50852, 52234, 33365, 60525, 61402, 49669, 36760, 18145, 27710, 16998, 4048, 50751, 60636, 49805, 36729}, ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr);
                final Map mapIAuthTabCallback2 = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().onWarmupCompleted()), getWrite.IAuthTabCallback("button_type", safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().IAuthTabCallback())});
                if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().asInterface() != null) {
                    Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("product_id", str);
                    Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("service_name", str2);
                    Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("error_type", safeActivityEmbeddingComponentProviderExternalSyntheticLambda27.onExtraCallback());
                    Object[] objArr2 = new Object[1];
                    a(new char[]{50886, 50852, 52234, 33365, 60525, 61402, 49669, 36760, 18145, 27710, 16998, 4048, 50751, 60636, 49805, 36729}, KeyEvent.keyCodeFromString(""), objArr2);
                    mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().asInterface()), getWrite.IAuthTabCallback("button_type", safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback().IAuthTabCallbackDefault())});
                } else {
                    mapIAuthTabCallback = null;
                }
                final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getcreativeid);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mapIAuthTabCallback2);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mapIAuthTabCallback);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnExtraCallback | zOnNavigationEvent | zOnNavigationEvent2 | zOnExtraCallback2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda8
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            int i18 = 2 % 2;
                            int i19 = onWarmupCompleted + 115;
                            onExtraCallbackWithResult = i19 % 128;
                            int i20 = i19 % 2;
                            decrementVideoUsage decrementvideousageOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0, getcreativeid, mapIAuthTabCallback, mapIAuthTabCallback2, (isInVideoUsage) obj2);
                            int i21 = onExtraCallbackWithResult + 15;
                            onWarmupCompleted = i21 % 128;
                            if (i21 % 2 == 0) {
                                return decrementvideousageOnNavigationEvent;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
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
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted, quirksExternalSyntheticBackport04, 1.0f, false, 2, (Object) null), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
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
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(280343582, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda9
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i18 = 2 % 2;
                        int i19 = onWarmupCompleted + 83;
                        onNavigationEvent = i19 % 128;
                        int i20 = i19 % 2;
                        Object[] objArr3 = {safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, (y1a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                        Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr3, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1728865308, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1728865314);
                        int i21 = onWarmupCompleted + 119;
                        onNavigationEvent = i21 % 128;
                        int i22 = i21 % 2;
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback(), (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(-527857601, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda10
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i18 = 2 % 2;
                        int i19 = onExtraCallback + 87;
                        onExtraCallbackWithResult = i19 % 128;
                        int i20 = i19 % 2;
                        Object[] objArr3 = {safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, (y1ExternalSyntheticLambda3) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                        Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr3, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 601670916, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -601670912);
                        int i21 = onExtraCallback + 41;
                        onExtraCallbackWithResult = i21 % 128;
                        if (i21 % 2 == 0) {
                            int i22 = 72 / 0;
                        }
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallback(), (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, ForwardingCameraControl.onExtraCallback(877044529, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda11
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i18 = 2 % 2;
                        int i19 = onWarmupCompleted + 89;
                        onExtraCallback = i19 % 128;
                        int i20 = i19 % 2;
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda332 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda33;
                        y1b y1bVar = (y1b) obj2;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        if (i20 != 0) {
                            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onWarmupCompleted(safeActivityEmbeddingComponentProviderExternalSyntheticLambda332, y1bVar, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue);
                        }
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onWarmupCompleted(safeActivityEmbeddingComponentProviderExternalSyntheticLambda332, y1bVar, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue);
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), (Function0) null, cameraCaptureResultEmptyCameraCaptureResult2, 807076230, 432, 9626);
                if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback() != null) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1032509172);
                    w2.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1625396500, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda12
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i18 = 2 % 2;
                            int i19 = onExtraCallbackWithResult + 115;
                            onExtraCallback = i19 % 128;
                            int i20 = i19 % 2;
                            Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, (areAllItemsEnabled) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            if (i20 == 0) {
                                int i21 = 70 / 0;
                            }
                            return unitOnNavigationEvent;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), (QuirksExternalSyntheticBackport0) null, (wa.onTransact) null, wa.IAuthTabCallback.Companion.onExtraCallback(), 0.0f, (wa.onNavigationEvent) null, (getBacktraceNote) null, (wa.IAuthTabCallbackStub) null, (wa.onExtraCallback) null, (getBacktraceNote) null, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResult2, 3078, 0, 4086);
                    getMidpointBetweenPoints.onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1636332776, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{null, 0L, 0L, null, null, ForwardingCameraControl.onExtraCallback(373471844, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda13
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i18 = 2 % 2;
                            int i19 = onExtraCallbackWithResult + 95;
                            onNavigationEvent = i19 % 128;
                            int i20 = i19 % 2;
                            Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, (roundUpToNearestHalfInt) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i21 = onNavigationEvent + 85;
                            onExtraCallbackWithResult = i21 % 128;
                            int i22 = i21 % 2;
                            return unitOnNavigationEvent;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 196608, 31}, -1636332773);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1031621208);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                function12 = function13;
                u1.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (u2) null, ForwardingCameraControl.onExtraCallback(-415976847, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda14
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i18 = 2 % 2;
                        int i19 = IAuthTabCallback + 99;
                        onWarmupCompleted = i19 % 128;
                        if (i19 % 2 != 0) {
                            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onWarmupCompleted(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, getcreativeid, mapIAuthTabCallback2, function13, (u4) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        }
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onWarmupCompleted(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, getcreativeid, mapIAuthTabCallback2, function13, (u4) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), (setCallToAction.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(852621171, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda15
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i18 = 2 % 2;
                        int i19 = onExtraCallback + 75;
                        onNavigationEvent = i19 % 128;
                        int i20 = i19 % 2;
                        Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, getcreativeid, mapIAuthTabCallback2, function13, (u4) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i21 = onExtraCallback + 39;
                        onNavigationEvent = i21 % 128;
                        int i22 = i21 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallback(198224888, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda16
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i18 = 2 % 2;
                        int i19 = onNavigationEvent + 99;
                        onWarmupCompleted = i19 % 128;
                        int i20 = i19 % 2;
                        Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, function13, (u3) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i21 = onWarmupCompleted + 57;
                        onNavigationEvent = i21 % 128;
                        int i22 = i21 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult2, 12607872, 0, 3947);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda7
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i18 = 2 % 2;
                        int i19 = onExtraCallbackWithResult + 49;
                        onWarmupCompleted = i19 % 128;
                        int i20 = i19 % 2;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                        String str3 = str;
                        String str4 = str2;
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda272 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda332 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda33;
                        getCreativeId getcreativeid2 = getcreativeid;
                        Function1 function14 = function12;
                        int i21 = i2;
                        int i22 = i3;
                        int iIntValue = ((Integer) obj3).intValue();
                        Object[] objArr3 = {quirksExternalSyntheticBackport05, str3, str4, safeActivityEmbeddingComponentProviderExternalSyntheticLambda272, safeActivityEmbeddingComponentProviderExternalSyntheticLambda332, getcreativeid2, function14, Integer.valueOf(i21), Integer.valueOf(i22), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                        Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr3, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1973414588, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1973414587);
                        int i23 = onWarmupCompleted + 119;
                        onExtraCallbackWithResult = i23 % 128;
                        if (i23 % 2 == 0) {
                            return unit;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        int i18 = onNavigationEvent + 65;
        onWarmupCompleted = i18 % 128;
        if (i18 % 2 != 0) {
            i4 |= 1572864;
            int i19 = 98 / 0;
        } else {
            i4 |= 1572864;
        }
        function12 = function1;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i4) == 599186, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static final void onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        boolean z;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1524039153);
        if (i2 != 0) {
            int i4 = onNavigationEvent + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i6 = onWarmupCompleted + 3;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1524039153, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentPreview (InAppPurchasePreparationErrorContent.kt:200)");
            }
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33IAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda36.IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackDefault.onExtraCallback, "AppName", "Test Product", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432);
            if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda33IAuthTabCallback != null) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(551301894);
                IAuthTabCallback(null, "test_product_id", "Test Mini App", SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33IAuthTabCallback, new getCreativeId((Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()), "preview", ""), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 65);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(551712241);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new InAppPurchasePreparationErrorContentKt$.ExternalSyntheticLambda1(i2));
        }
    }

    private static final decrementVideoUsage IAuthTabCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, final getCreativeId getcreativeid, final Map map, final Map map2, isInVideoUsage isinvideousage) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationErrorContentKt$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 81;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    Object[] objArr = {getcreativeid, map, map2, textFieldScrollKtExternalSyntheticLambda02, onextracallbackwithresult};
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -208002608, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 208002616);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object[] objArr2 = {getcreativeid, map, map2, textFieldScrollKtExternalSyntheticLambda02, onextracallbackwithresult};
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -208002608, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 208002616);
                int i5 = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        };
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(lifecycleEventObserver);
        onNavigationEvent onnavigationevent = new onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0, lifecycleEventObserver);
        int i3 = onWarmupCompleted + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationevent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, getCreativeId getcreativeid, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {quirksExternalSyntheticBackport0, str, str2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, getcreativeid, function1, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        return (Unit) IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1973414588, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1973414587);
    }

    public static /* synthetic */ Unit onExtraCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1728865308, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1728865314);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 601670916, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -601670912);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Map map, SetDetectableSize setDetectableSize) {
        return (Unit) IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{map, setDetectableSize}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1037604933, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1037604933);
    }

    public static /* synthetic */ Unit onWarmupCompleted(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback onextracallback) {
        return (Unit) IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{onextracallback}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 218808785, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -218808782);
    }

    private static final Unit onWarmupCompleted(Map map, SetDetectableSize setDetectableSize) {
        return (Unit) IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{map, setDetectableSize}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -421516469, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 421516474);
    }

    private static final Unit onExtraCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {safeActivityEmbeddingComponentProviderExternalSyntheticLambda33, arecachedadresourcesmissing, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -507577370, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 507577377);
    }

    private static final Unit onWarmupCompleted(Function1 function1, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33) {
        return (Unit) IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{function1, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 799539611, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -799539609);
    }
}
