package o;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.home.feature.asset_home.R;
import im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeEditScreenKt$;
import im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeEditScreenKt$AssetDepositHomeEditScreen$2$1$;
import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetDepositHomeEditViewModel;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import o._string;
import o.getDensity;
import o.getUserAvatar;
import o.readFully;
import o.setCallToAction;
import o.toJSONObject;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class extractAppIdFromUrl {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit IAuthTabCallback(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, toJSONObject.IAuthTabCallback iAuthTabCallback, toJSONObject tojsonobject) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface(assetDepositHomeEditViewModel, iAuthTabCallback, tojsonobject);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(assetDepositHomeEditViewModel, iAuthTabCallback, tojsonobject);
        int i3 = onExtraCallback + 39;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getDensity getdensity, toJSONObject.IAuthTabCallback iAuthTabCallback, getRpcProxy getrpcproxy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getdensity, iAuthTabCallback, getrpcproxy);
        int i4 = onWarmupCompleted + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getRpcProxy getrpcproxy, toJSONObject.IAuthTabCallback iAuthTabCallback, getDensity getdensity, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getrpcproxy, iAuthTabCallback, getdensity, i);
        if (i4 == 0) {
            int i5 = 25 / 0;
        }
        int i6 = onWarmupCompleted + 95;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, assetDepositHomeEditViewModel);
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static final /* synthetic */ void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        int i4 = onExtraCallback + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        AssetDepositHomeEditViewModel assetDepositHomeEditViewModel = (AssetDepositHomeEditViewModel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue3 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(getsupportedhighspeedresolutionsfor, assetDepositHomeEditViewModel, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        }
        int i3 = 62 / 0;
        return onExtraCallback(getsupportedhighspeedresolutionsfor, assetDepositHomeEditViewModel, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        AssetDepositHomeEditViewModel assetDepositHomeEditViewModel = (AssetDepositHomeEditViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(assetDepositHomeEditViewModel);
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        getDensity getdensity = (getDensity) objArr[0];
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[1];
        AssetDepositHomeEditViewModel assetDepositHomeEditViewModel = (AssetDepositHomeEditViewModel) objArr[2];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[3];
        RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        toJSONObject.IAuthTabCallback iAuthTabCallback = (toJSONObject.IAuthTabCallback) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue2 = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getdensity, getrpcproxy, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, iIntValue, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = onExtraCallback + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(jLongValue, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
        int i4 = onExtraCallback + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return extensionsInfoExternalSyntheticLambda0OnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, toJSONObject.IAuthTabCallback iAuthTabCallback, toJSONObject tojsonobject) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(assetDepositHomeEditViewModel, iAuthTabCallback, tojsonobject);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        int i5 = onExtraCallback + 109;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    private static final Unit onExtraCallback(getConfigJSONObject getconfigjsonobject, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted((getConfigJSONObject<toJSONObject.IAuthTabCallback>) getconfigjsonobject, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 49;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getDensity getdensity, boolean z, getRpcProxy getrpcproxy, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Context context, View view, Resources resources, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getdensity, z, getrpcproxy, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, context, view, resources, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 119;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 33 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(getRpcProxy getrpcproxy, toJSONObject.IAuthTabCallback iAuthTabCallback, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(getrpcproxy, iAuthTabCallback, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(getrpcproxy, iAuthTabCallback, i);
        int i4 = onWarmupCompleted + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 5;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, assetDepositHomeEditViewModel, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)}, setCurrentIndex.onNavigationEvent(), -369740549, setCurrentIndex.onNavigationEvent(), 369740557, setCurrentIndex.onNavigationEvent());
        } else {
            onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, assetDepositHomeEditViewModel, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, setCurrentIndex.onNavigationEvent(), -369740549, setCurrentIndex.onNavigationEvent(), 369740557, setCurrentIndex.onNavigationEvent());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2}, iOnNavigationEvent2, 823901950, setCurrentIndex.onNavigationEvent(), -823901946, iOnNavigationEvent);
        int i4 = onWarmupCompleted + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, getDensity getdensity, Resources resources, getRpcProxy getrpcproxy, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Context context, View view, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(z, getdensity, resources, getrpcproxy, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, context, view, audioRestrictionControllerImplExternalSyntheticLambda0);
        }
        onExtraCallbackWithResult(z, getdensity, resources, getrpcproxy, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, context, view, audioRestrictionControllerImplExternalSyntheticLambda0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = (~(i7 | i5)) | (~(i7 | i6)) | (~(i5 | i6));
        int i9 = (~(i3 | i6)) | i5;
        int i10 = (~(i6 | i3 | i5)) | (~(i7 | (~i5) | (~i6)));
        int i11 = i3 + i5 + i2 + (862446602 * i) + (395103901 * i4);
        int i12 = i11 * i11;
        int i13 = (((-1892237052) * i3) - 438566912) + ((-683246085) * i5) + (i8 * 402996989) + ((-805993978) * i9) + (402996989 * i10) + ((-1489240064) * i2) + ((-128450560) * i) + ((-674496512) * i4) + ((-1108934656) * i12);
        int i14 = (i3 * 1384179468) + 550727958 + (i5 * 1384180977) + (i8 * 503) + (i9 * (-1006)) + (i10 * 503) + (i2 * 1384179971) + (i * 1640285726) + (i4 * 120803543) + (i12 * 2025127936);
        switch (i13 + (i14 * i14 * (-275709952))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[2];
                int i15 = 2 % 2;
                int i16 = onExtraCallback + 49;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                Unit unit = (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor2}, setCurrentIndex.onNavigationEvent(), -278643226, setCurrentIndex.onNavigationEvent(), 278643233, iOnNavigationEvent);
                int i18 = onExtraCallback + 111;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                return unit;
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                getDensity getdensity = (getDensity) objArr[0];
                getRpcProxy getrpcproxy = (getRpcProxy) objArr[1];
                AssetDepositHomeEditViewModel assetDepositHomeEditViewModel = (AssetDepositHomeEditViewModel) objArr[2];
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[3];
                RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[4];
                int iIntValue = ((Number) objArr[5]).intValue();
                toJSONObject.IAuthTabCallback iAuthTabCallback = (toJSONObject.IAuthTabCallback) objArr[6];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
                int iIntValue2 = ((Number) objArr[8]).intValue();
                int i20 = 2 % 2;
                int i21 = onWarmupCompleted + 11;
                onExtraCallback = i21 % 128;
                int i22 = i21 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(getdensity, getrpcproxy, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor3, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, iIntValue, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
                int i23 = onWarmupCompleted + 31;
                onExtraCallback = i23 % 128;
                int i24 = i23 % 2;
                return unitIAuthTabCallback;
            case 7:
                return asBinder(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return asInterface(objArr);
            case 12:
                return IAuthTabCallback_Parcel(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            case 14:
                return access000(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(str, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        onNavigationEvent(str, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, toJSONObject.IAuthTabCallback iAuthTabCallback, toJSONObject tojsonobject) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(assetDepositHomeEditViewModel, iAuthTabCallback, tojsonobject);
        int i4 = onExtraCallback + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getConfigJSONObject getconfigjsonobject, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            onExtraCallback(getconfigjsonobject, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(getconfigjsonobject, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onWarmupCompleted + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getDensity getdensity, toJSONObject.IAuthTabCallback iAuthTabCallback, getRpcProxy getrpcproxy) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(getdensity, iAuthTabCallback, getrpcproxy);
        }
        onExtraCallback(getdensity, iAuthTabCallback, getrpcproxy);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getDensity getdensity, boolean z, getRpcProxy getrpcproxy, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Context context, View view, Resources resources, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getdensity, z, getrpcproxy, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, context, view, resources, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 29;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(getConfigWithProcessCache getconfigwithprocesscache, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda7) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(getconfigwithprocesscache, assetDepositHomeEditViewModel, camera2CameraControlExternalSyntheticLambda7);
        int i4 = onWarmupCompleted + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return zOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, toJSONObject.IAuthTabCallback iAuthTabCallback, toJSONObject tojsonobject) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(assetDepositHomeEditViewModel, iAuthTabCallback, tojsonobject);
        int i4 = onWarmupCompleted + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 121;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 7 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(getRpcProxy getrpcproxy, getDensity getdensity, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallback(getrpcproxy, getdensity, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallback(getrpcproxy, getdensity, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
            int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
            unit = (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2}, iOnNavigationEvent2, -2098112522, setCurrentIndex.onNavigationEvent(), 2098112522, iOnNavigationEvent);
            int i3 = 63 / 0;
        } else {
            int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
            int iOnNavigationEvent4 = setCurrentIndex.onNavigationEvent();
            unit = (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2}, iOnNavigationEvent4, -2098112522, setCurrentIndex.onNavigationEvent(), 2098112522, iOnNavigationEvent3);
        }
        int i4 = onWarmupCompleted + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(gettimebase, extensionsManager1);
        }
        onExtraCallbackWithResult(gettimebase, extensionsManager1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        readFully readfully = (readFully) objArr[0];
        setIso setiso = (setIso) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(readfully, setiso);
        int i4 = onWarmupCompleted + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(long j, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(j, fliphorizontally);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(j, fliphorizontally);
        int i3 = onWarmupCompleted + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getConfigWithProcessCache getconfigwithprocesscache, Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda7) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(assetDepositHomeEditViewModel, getconfigwithprocesscache, camera2CameraControlExternalSyntheticLambda7);
        int i4 = onWarmupCompleted + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, toJSONObject.IAuthTabCallback iAuthTabCallback, toJSONObject tojsonobject) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(assetDepositHomeEditViewModel, iAuthTabCallback, tojsonobject);
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getDensity getdensity, toJSONObject.IAuthTabCallback iAuthTabCallback, getRpcProxy getrpcproxy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(getdensity, iAuthTabCallback, getrpcproxy);
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        int i5 = onExtraCallback + 49;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(getsupportedhighspeedresolutionsfor, assetDepositHomeEditViewModel, cameraPresenceProviderExternalSyntheticLambda6, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(getsupportedhighspeedresolutionsfor, assetDepositHomeEditViewModel, cameraPresenceProviderExternalSyntheticLambda6, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 67;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ removeObserverLocked onWarmupCompleted(Pair[] pairArr, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedIAuthTabCallback = IAuthTabCallback(pairArr, sessionProcessorCaptureCallback);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        int i5 = onWarmupCompleted + 47;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
        return removeobserverlockedIAuthTabCallback;
    }

    public static final /* synthetic */ void onWarmupCompleted(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent4 = setCurrentIndex.onNavigationEvent();
        if (i3 == 0) {
            zBooleanValue = ((Boolean) onExtraCallbackWithResult(iOnNavigationEvent3, objArr, iOnNavigationEvent2, -245726195, iOnNavigationEvent4, 245726208, iOnNavigationEvent)).booleanValue();
            int i4 = 48 / 0;
        } else {
            zBooleanValue = ((Boolean) onExtraCallbackWithResult(iOnNavigationEvent3, objArr, iOnNavigationEvent2, -245726195, iOnNavigationEvent4, 245726208, iOnNavigationEvent)).booleanValue();
        }
        int i5 = onExtraCallback + 1;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $animateItemEnabled$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$animateItemEnabled$delegate = getsupportedhighspeedresolutionsfor;
        }

        public static /* synthetic */ Unit onNavigationEvent(long j) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallback(j);
            }
            onExtraCallback(j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$animateItemEnabled$delegate, access13800Var);
            int i2 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 12 / 0;
            }
            int i5 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        private static final Unit onExtraCallback(long j) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i3 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 78 / 0;
            }
            return unit2;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!extractAppIdFromUrl.onWarmupCompleted(this.$animateItemEnabled$delegate)) {
                    AssetDepositHomeEditScreenKt$AssetDepositHomeEditScreen$2$1$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new AssetDepositHomeEditScreenKt$AssetDepositHomeEditScreen$2$1$.ExternalSyntheticLambda0();
                    this.label = 1;
                    if (addSessionCaptureCallback.IAuthTabCallback(externalSyntheticLambda0, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i5 = onExtraCallbackWithResult + 1;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            ResultKt.onNavigationEvent(obj);
            extractAppIdFromUrl.IAuthTabCallback((getSupportedHighSpeedResolutionsFor) this.$animateItemEnabled$delegate, true);
            Unit unit2 = Unit.INSTANCE;
            int i52 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i52 % 128;
            int i62 = i52 % 2;
            return unit2;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        openUrl openurl = openUrl.Hide;
        RVRpcProxy.onExtraCallback(convertFloatArrayToByteArray, openurl.getLogValue());
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2, false);
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(openurl);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        openUrl openurl;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            openurl = openUrl.Order;
            RVRpcProxy.onExtraCallback(convertFloatArrayToByteArray, openurl.getLogValue());
            onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2, false);
        } else {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            openurl = openUrl.Order;
            RVRpcProxy.onExtraCallback(convertFloatArrayToByteArray2, openurl.getLogValue());
            onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2, false);
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(openurl);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 59;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(x2externalsyntheticlambda21, "");
        if ((i & 6) == 0) {
            int i7 = onExtraCallback + 123;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 26 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x2externalsyntheticlambda21)) {
                    int i9 = onExtraCallback + 67;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x2externalsyntheticlambda21)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i11 = onExtraCallback + 117;
            int i12 = i11 % 128;
            onWarmupCompleted = i12;
            z = i11 % 2 != 0;
            int i13 = i12 + 83;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onWarmupCompleted + 113;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(903336176, i2, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeEditScreen.<anonymous>.<anonymous> (AssetDepositHomeEditScreen.kt:147)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_category_segment_header_deposit_hide, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean z2 = getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult() == openUrl.Hide;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda14 externalSyntheticLambda14 = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda14(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda14);
                    obj = externalSyntheticLambda14;
                }
                int i17 = (i2 << 3) & 112;
                x2externalsyntheticlambda21.IAuthTabCallback(strOnExtraCallback, z2, (Function0) obj, (QuirksExternalSyntheticBackport0) null, false, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function2) null, cameraCaptureResultEmptyCameraCaptureResult, 0, i17, 2040);
                String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_category_segment_header_deposit_reordering, cameraCaptureResultEmptyCameraCaptureResult, 0);
                boolean z3 = getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult() == openUrl.Order;
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent2) {
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda15 externalSyntheticLambda15 = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda15(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda15);
                        obj2 = externalSyntheticLambda15;
                    }
                    x2externalsyntheticlambda21.IAuthTabCallback(strOnExtraCallback2, z3, (Function0) obj2, (QuirksExternalSyntheticBackport0) null, false, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function2) null, cameraCaptureResultEmptyCameraCaptureResult, 0, i17, 2040);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i18 = onWarmupCompleted + 99;
                        onExtraCallback = i18 % 128;
                        int i19 = i18 % 2;
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final removeObserverLocked IAuthTabCallback(Pair[] pairArr, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        removeObserverLocked removeobserverlockedIAuthTabCallback = sessionProcessorCaptureCallback.IAuthTabCallback(new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda28(readFully.onExtraCallback.IAuthTabCallback(readFully.Companion, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0.0f, sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), 0, 8, (Object) null)));
        int i2 = onWarmupCompleted + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return removeobserverlockedIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(readFully readfully, setIso setiso) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setiso, "");
            setiso.onWarmupCompleted();
            setOrientationDegrees.onExtraCallback(setiso, readfully, 0L, 1L, 2.0f, (hasMoreElements) null, (seek) null, 0, 109, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(setiso, "");
            setiso.onWarmupCompleted();
            setOrientationDegrees.onExtraCallback(setiso, readfully, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final boolean onExtraCallback(getConfigWithProcessCache getconfigwithprocesscache, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda7) {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        IndexedValue indexedValueOnExtraCallbackWithResult = null;
        if (i2 % 2 == 0) {
            indexedValueOnExtraCallbackWithResult.hashCode();
            throw null;
        }
        Object objOnExtraCallback = camera2CameraControlExternalSyntheticLambda7 != null ? camera2CameraControlExternalSyntheticLambda7.onExtraCallback() : null;
        if (!(objOnExtraCallback instanceof getUserAvatar.IAuthTabCallback)) {
            int i3 = onWarmupCompleted + 121;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            objOnExtraCallback = null;
        }
        getUserAvatar.IAuthTabCallback iAuthTabCallback = (getUserAvatar.IAuthTabCallback) objOnExtraCallback;
        if (iAuthTabCallback != null) {
            strOnExtraCallback = iAuthTabCallback.onExtraCallback();
            int i4 = onExtraCallback + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } else {
            strOnExtraCallback = null;
        }
        if (strOnExtraCallback != null) {
            indexedValueOnExtraCallbackWithResult = assetDepositHomeEditViewModel.onExtraCallbackWithResult(strOnExtraCallback);
            int i6 = onExtraCallback + 61;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        if (indexedValueOnExtraCallbackWithResult == null) {
            return false;
        }
        RVRpcProxy.onNavigationEvent(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) indexedValueOnExtraCallbackWithResult.onExtraCallback(), indexedValueOnExtraCallbackWithResult.onNavigationEvent() + 1, ((toJSONObject.IAuthTabCallback) indexedValueOnExtraCallbackWithResult.onExtraCallback()).IAuthTabCallbackStubProxy().onExtraCallback());
        getconfigwithprocesscache.onExtraCallback(indexedValueOnExtraCallbackWithResult.onExtraCallback());
        int i8 = onExtraCallback + 7;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    private static final Unit IAuthTabCallback(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getConfigWithProcessCache getconfigwithprocesscache, Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda7) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        IndexedValue indexedValueIAuthTabCallback = null;
        if (camera2CameraControlExternalSyntheticLambda7 != null) {
            int i2 = onWarmupCompleted + 105;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                camera2CameraControlExternalSyntheticLambda7.onExtraCallback();
                throw null;
            }
            objOnExtraCallback = camera2CameraControlExternalSyntheticLambda7.onExtraCallback();
        } else {
            objOnExtraCallback = null;
        }
        if (objOnExtraCallback instanceof getUserAvatar.IAuthTabCallback) {
            indexedValueIAuthTabCallback = assetDepositHomeEditViewModel.onExtraCallbackWithResult((toJSONObject.IAuthTabCallback) getconfigwithprocesscache.IAuthTabCallback(), ((getUserAvatar.IAuthTabCallback) objOnExtraCallback).onExtraCallback());
        } else if (objOnExtraCallback instanceof getUserAvatar.onWarmupCompleted) {
            if (Intrinsics.areEqual(((getUserAvatar.onWarmupCompleted) objOnExtraCallback).onExtraCallbackWithResult(), "Transaction")) {
                indexedValueIAuthTabCallback = assetDepositHomeEditViewModel.IAuthTabCallback((toJSONObject.IAuthTabCallback) getconfigwithprocesscache.IAuthTabCallback(), getDensity$onNavigationEvent$onExtraCallback.Transaction);
            } else if (!(!Intrinsics.areEqual(r10, "Saving"))) {
                indexedValueIAuthTabCallback = assetDepositHomeEditViewModel.IAuthTabCallback((toJSONObject.IAuthTabCallback) getconfigwithprocesscache.IAuthTabCallback(), getDensity$onNavigationEvent$onExtraCallback.Saving);
                int i3 = onExtraCallback + 39;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        if (indexedValueIAuthTabCallback != null) {
            RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1892811179, -1892811178, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) indexedValueIAuthTabCallback.onExtraCallback(), Integer.valueOf(indexedValueIAuthTabCallback.onNavigationEvent() + 1), ((toJSONObject.IAuthTabCallback) indexedValueIAuthTabCallback.onExtraCallback()).IAuthTabCallbackStubProxy().onExtraCallback()}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(getRpcProxy getrpcproxy, toJSONObject.IAuthTabCallback iAuthTabCallback, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        getrpcproxy.onWarmupCompleted(iAuthTabCallback, i + 1, "deposit", false);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 57;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r3
      0x0026: PHI (r3v2 kotlin.collections.IndexedValue) = (r3v1 kotlin.collections.IndexedValue), (r3v7 kotlin.collections.IndexedValue) binds: [B:8:0x0024, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, toJSONObject.IAuthTabCallback iAuthTabCallback, toJSONObject tojsonobject) {
        IndexedValue indexedValueOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tojsonobject, "");
            indexedValueOnWarmupCompleted = assetDepositHomeEditViewModel.onWarmupCompleted(iAuthTabCallback);
            int i3 = 7 / 0;
            if (indexedValueOnWarmupCompleted != null) {
                int i4 = onExtraCallback + 91;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                RVRpcProxy.onNavigationEvent(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) indexedValueOnWarmupCompleted.onExtraCallback(), indexedValueOnWarmupCompleted.onNavigationEvent() + 1, "deposit", true);
            }
        } else {
            Intrinsics.checkNotNullParameter(tojsonobject, "");
            indexedValueOnWarmupCompleted = assetDepositHomeEditViewModel.onWarmupCompleted(iAuthTabCallback);
            if (indexedValueOnWarmupCompleted != null) {
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 73;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c1  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(getDensity getdensity, boolean z, getRpcProxy getrpcproxy, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Context context, View view, Resources resources, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2;
        boolean z3;
        ?? r2;
        boolean zOnExtraCallback;
        int i5;
        int i6;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Object obj = null;
        if ((i2 & 6) == 0) {
            int i8 = onWarmupCompleted + 21;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0);
                obj.hashCode();
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ^ true ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i9 = onWarmupCompleted + 75;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                int i11 = onExtraCallback + 115;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if ((i2 & 512) == 0) {
                int i13 = onWarmupCompleted + 53;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback);
            } else {
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback);
            }
            if (!zOnExtraCallback) {
                int i15 = onExtraCallback + 107;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        int i17 = i3;
        if ((i17 & 1171) != 1170) {
            int i18 = onExtraCallback + 117;
            onWarmupCompleted = i18 % 128;
            int i19 = i18 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i17 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1188464145, i17, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDepositHomeEditScreen.kt:307)");
            }
            List listIAuthTabCallbackDefault = ((getDensity.onNavigationEvent) getdensity).IAuthTabCallbackDefault();
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_asset_deposit_category_section_header_saving, cameraCaptureResultEmptyCameraCaptureResult, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            if (((Boolean) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor}, setCurrentIndex.onNavigationEvent(), -245726195, setCurrentIndex.onNavigationEvent(), 245726208, setCurrentIndex.onNavigationEvent())).booleanValue()) {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                i4 = i17;
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0.onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, quirksExternalSyntheticBackport02, (updateFocusedState) null, (updateFocusedState) null, (updateFocusedState) null, 7, (Object) null));
            } else {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                i4 = i17;
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0;
            }
            if (z) {
                int i20 = onWarmupCompleted + 47;
                onExtraCallback = i20 % 128;
                int i21 = i20 % 2;
                if (onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback()) {
                    quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0OnExtraCallback;
                    z3 = true;
                    r2 = 0;
                } else {
                    z3 = true;
                    r2 = 0;
                    quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, new onExtraCallbackWithResult(context, i, listIAuthTabCallbackDefault, strOnExtraCallback, assetDepositHomeEditViewModel, iAuthTabCallback, view, resources), 1, (Object) null));
                }
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
                int i22 = i4;
                int i23 = i22 & 896;
                boolean z4 = (i23 == 256 || ((i22 & 512) != 0 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback))) ? z3 : r2;
                boolean z5 = (i22 & 112) == 32 ? z3 : r2;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback2 | z4 | z5)) {
                    Object obj2 = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda10(getrpcproxy, iAuthTabCallback, i);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda10);
                        obj2 = externalSyntheticLambda10;
                    }
                    Function0 function0 = (Function0) obj2;
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetDepositHomeEditViewModel);
                    if (i23 != 256) {
                        int i24 = onExtraCallback + 93;
                        onWarmupCompleted = i24 % 128;
                        int i25 = i24 % 2;
                        boolean z6 = ((i22 & 512) == 0 || (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback) ^ z3)) ? r2 : z3;
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnExtraCallback3 | z6)) {
                            Object obj3 = objOnMinimized2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda11(assetDepositHomeEditViewModel, iAuthTabCallback);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda11);
                                obj3 = externalSyntheticLambda11;
                            }
                            putConfigCache.onWarmupCompleted(854830388, _string.onNavigationEvent.IAuthTabCallback(), -854830385, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnExtraCallback2, iAuthTabCallback, Boolean.valueOf((boolean) r2), Boolean.valueOf(z), function0, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i22 >> 3) & 112) | 384), Integer.valueOf((int) r2)});
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(getDensity getdensity, toJSONObject.IAuthTabCallback iAuthTabCallback, getRpcProxy getrpcproxy) {
        int i = 2 % 2;
        IndexedValue indexedValueOnNavigationEvent = getdensity.onNavigationEvent(iAuthTabCallback.onTransact());
        if (indexedValueOnNavigationEvent != null) {
            int i2 = onWarmupCompleted + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                getrpcproxy.onWarmupCompleted(iAuthTabCallback, indexedValueOnNavigationEvent.onNavigationEvent(), "saving", true);
            } else {
                getrpcproxy.onWarmupCompleted(iAuthTabCallback, indexedValueOnNavigationEvent.onNavigationEvent() + 1, "saving", false);
            }
            int i3 = onExtraCallback + 53;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, toJSONObject.IAuthTabCallback iAuthTabCallback, toJSONObject tojsonobject) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        IndexedValue indexedValueOnWarmupCompleted = assetDepositHomeEditViewModel.onWarmupCompleted(iAuthTabCallback);
        if (indexedValueOnWarmupCompleted != null) {
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            RVRpcProxy.onNavigationEvent(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) indexedValueOnWarmupCompleted.onExtraCallback(), indexedValueOnWarmupCompleted.onNavigationEvent() + 1, "saving", true);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(getDensity getdensity, boolean z, getRpcProxy getrpcproxy, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Context context, View view, Resources resources, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        boolean z2;
        ?? r3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i7 = onWarmupCompleted + 5;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                int i8 = onWarmupCompleted + 97;
                onExtraCallback = i8 % 128;
                i5 = i8 % 2 != 0 ? 75 : 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            int i9 = onExtraCallback + 85;
            onWarmupCompleted = i9 % 128;
            i3 |= (i9 % 2 != 0 ? (i2 & 512) != 0 : (i2 & 17912) != 0) ? cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback) : cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback) ? 256 : 128;
        }
        int i10 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i10 & 1171) != 1170, i10 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(766852154, i10, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDepositHomeEditScreen.kt:413)");
                int i11 = onExtraCallback + 65;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
            }
            List listOnExtraCallback = ((getDensity.onNavigationEvent) getdensity).onExtraCallback();
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_asset_deposit_category_section_header_deposit, cameraCaptureResultEmptyCameraCaptureResult, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
            if (((Boolean) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor}, setCurrentIndex.onNavigationEvent(), -245726195, setCurrentIndex.onNavigationEvent(), 245726208, iOnNavigationEvent)).booleanValue()) {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                i4 = i10;
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0.onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, quirksExternalSyntheticBackport02, (updateFocusedState) null, (updateFocusedState) null, (updateFocusedState) null, 7, (Object) null));
            } else {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                i4 = i10;
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0;
            }
            if (!z || onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback()) {
                z2 = true;
                r3 = 0;
                int i13 = onWarmupCompleted + 11;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0OnExtraCallback;
            } else {
                z2 = true;
                r3 = 0;
                quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, new onNavigationEvent(context, i, listOnExtraCallback, strOnExtraCallback, assetDepositHomeEditViewModel, iAuthTabCallback, view, resources), 1, (Object) null));
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getdensity);
            int i15 = i4;
            int i16 = i15 & 896;
            boolean z3 = (i16 == 256 || ((i15 & 512) != 0 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback))) ? z2 : r3;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | z3 | zOnExtraCallback)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda29 externalSyntheticLambda29 = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda29(getdensity, iAuthTabCallback, getrpcproxy);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda29);
                    obj = externalSyntheticLambda29;
                }
                Function0 function0 = (Function0) obj;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetDepositHomeEditViewModel);
                boolean z4 = (i16 == 256 || ((i15 & 512) != 0 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback))) ? z2 : r3;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback2 | z4)) {
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda30 externalSyntheticLambda30 = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda30(assetDepositHomeEditViewModel, iAuthTabCallback);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda30);
                        obj2 = externalSyntheticLambda30;
                    }
                    putConfigCache.onWarmupCompleted(854830388, _string.onNavigationEvent.IAuthTabCallback(), -854830385, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnExtraCallback2, iAuthTabCallback, Boolean.valueOf((boolean) r3), Boolean.valueOf(z), function0, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i15 >> 3) & 112) | 384), Integer.valueOf((int) r3)});
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(getDensity getdensity, toJSONObject.IAuthTabCallback iAuthTabCallback, getRpcProxy getrpcproxy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            getdensity.onNavigationEvent(iAuthTabCallback.onTransact());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IndexedValue indexedValueOnNavigationEvent = getdensity.onNavigationEvent(iAuthTabCallback.onTransact());
        if (indexedValueOnNavigationEvent != null) {
            getrpcproxy.onWarmupCompleted((toJSONObject) indexedValueOnNavigationEvent.onExtraCallback(), indexedValueOnNavigationEvent.onNavigationEvent() + 1, "investment", false);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r3
      0x0027: PHI (r3v2 kotlin.collections.IndexedValue) = (r3v1 kotlin.collections.IndexedValue), (r3v9 kotlin.collections.IndexedValue) binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asBinder(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, toJSONObject.IAuthTabCallback iAuthTabCallback, toJSONObject tojsonobject) {
        IndexedValue indexedValueOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tojsonobject, "");
            indexedValueOnWarmupCompleted = assetDepositHomeEditViewModel.onWarmupCompleted(iAuthTabCallback);
            int i3 = 97 / 0;
            if (indexedValueOnWarmupCompleted != null) {
                RVRpcProxy.onNavigationEvent(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) indexedValueOnWarmupCompleted.onExtraCallback(), indexedValueOnWarmupCompleted.onNavigationEvent() + 1, "investment", true);
                int i4 = onWarmupCompleted + 67;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(tojsonobject, "");
            indexedValueOnWarmupCompleted = assetDepositHomeEditViewModel.onWarmupCompleted(iAuthTabCallback);
            if (indexedValueOnWarmupCompleted != null) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(getDensity getdensity, getRpcProxy getrpcproxy, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4;
        boolean z;
        boolean zOnNavigationEvent;
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 83;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            if ((i2 & 33) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0)) {
                    int i7 = onExtraCallback + 73;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i2;
            } else {
                i4 = i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            if ((i2 & 6) == 0) {
            }
        }
        if ((i2 & 384) == 0) {
            int i9 = onWarmupCompleted + 91;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0 ? (i2 & 512) != 0 : (i2 & 713) != 0) {
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback);
                int i10 = onExtraCallback + 57;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
            } else {
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback);
            }
            i4 |= zOnNavigationEvent ? 256 : 128;
        }
        int i12 = i4;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i12 & 1155) != 1154, i12 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1609116310, i12, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDepositHomeEditScreen.kt:519)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ((Boolean) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor}, setCurrentIndex.onNavigationEvent(), -245726195, setCurrentIndex.onNavigationEvent(), 245726208, setCurrentIndex.onNavigationEvent())).booleanValue() ? quirksExternalSyntheticBackport0.onExtraCallback(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0.onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, quirksExternalSyntheticBackport0, (updateFocusedState) null, (updateFocusedState) null, (updateFocusedState) null, 7, (Object) null)) : quirksExternalSyntheticBackport0;
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getdensity);
            int i13 = i12 & 896;
            if (i13 != 256) {
                int i14 = onExtraCallback + 125;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                if ((i12 & 512) == 0 || !cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback)) {
                    int i16 = onWarmupCompleted + 115;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    z = false;
                } else {
                    z = true;
                }
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent2 | z | zOnExtraCallback)) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda12 externalSyntheticLambda12 = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda12(getdensity, iAuthTabCallback, getrpcproxy);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda12);
                        obj = externalSyntheticLambda12;
                    }
                    Function0 function0 = (Function0) obj;
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetDepositHomeEditViewModel);
                    boolean z2 = i13 == 256 || ((i12 & 512) != 0 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback));
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnExtraCallback2 | z2)) {
                        Object obj2 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda13 externalSyntheticLambda13 = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda13(assetDepositHomeEditViewModel, iAuthTabCallback);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda13);
                            obj2 = externalSyntheticLambda13;
                        }
                        putConfigCache.onWarmupCompleted(854830388, _string.onNavigationEvent.IAuthTabCallback(), -854830385, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnExtraCallback, iAuthTabCallback, false, false, function0, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i12 >> 3) & 112) | 3456), 0});
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(getDensity getdensity, toJSONObject.IAuthTabCallback iAuthTabCallback, getRpcProxy getrpcproxy) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        IndexedValue indexedValueOnNavigationEvent = getdensity.onNavigationEvent(iAuthTabCallback.onTransact());
        if (indexedValueOnNavigationEvent != null) {
            getrpcproxy.onWarmupCompleted((toJSONObject) indexedValueOnNavigationEvent.onExtraCallback(), indexedValueOnNavigationEvent.onNavigationEvent() + 1, "pension", false);
            int i4 = onExtraCallback + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, toJSONObject.IAuthTabCallback iAuthTabCallback, toJSONObject tojsonobject) {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
        toJSONObject tojsonobject2;
        int iOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        IndexedValue indexedValueOnWarmupCompleted = assetDepositHomeEditViewModel.onWarmupCompleted(iAuthTabCallback);
        if (indexedValueOnWarmupCompleted != null) {
            int i4 = onExtraCallback + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                tojsonobject2 = (toJSONObject) indexedValueOnWarmupCompleted.onExtraCallback();
                iOnNavigationEvent = indexedValueOnWarmupCompleted.onNavigationEvent() >> 1;
            } else {
                convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                tojsonobject2 = (toJSONObject) indexedValueOnWarmupCompleted.onExtraCallback();
                iOnNavigationEvent = indexedValueOnWarmupCompleted.onNavigationEvent() + 1;
            }
            RVRpcProxy.onNavigationEvent(convertFloatArrayToByteArray, tojsonobject2, iOnNavigationEvent, "pension", true);
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 29;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(getDensity getdensity, getRpcProxy getrpcproxy, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        boolean z2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if ((i2 & 6) == 0) {
            int i5 = onWarmupCompleted + 9;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            int i7 = onWarmupCompleted + 51;
            onExtraCallback = i7 % 128;
            i3 |= (i7 % 2 == 0 ? (i2 & 512) != 0 : (i2 & 19332) != 0) ? cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback) : cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback) ? 256 : 128;
        }
        int i8 = i3;
        if ((i8 & 1155) != 1154) {
            int i9 = onExtraCallback + 57;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i8 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(956105087, i8, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDepositHomeEditScreen.kt:556)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            if (((Boolean) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor}, setCurrentIndex.onNavigationEvent(), -245726195, setCurrentIndex.onNavigationEvent(), 245726208, setCurrentIndex.onNavigationEvent())).booleanValue()) {
                int i11 = onWarmupCompleted + 27;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0.onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, quirksExternalSyntheticBackport0, (updateFocusedState) null, (updateFocusedState) null, (updateFocusedState) null, 7, (Object) null));
            } else {
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0;
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getdensity);
            int i13 = i8 & 896;
            boolean z3 = i13 == 256 || ((i8 & 512) != 0 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback));
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | z3 | zOnExtraCallback)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda16 externalSyntheticLambda16 = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda16(getdensity, iAuthTabCallback, getrpcproxy);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda16);
                    obj = externalSyntheticLambda16;
                }
                Function0 function0 = (Function0) obj;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetDepositHomeEditViewModel);
                if (i13 != 256) {
                    int i14 = onExtraCallback + 117;
                    onWarmupCompleted = i14 % 128;
                    if (i14 % 2 == 0) {
                        if ((i8 & 11389) != 0) {
                        }
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnExtraCallback2 | z2)) {
                            Object obj2 = objOnMinimized2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda17 externalSyntheticLambda17 = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda17(assetDepositHomeEditViewModel, iAuthTabCallback);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda17);
                                obj2 = externalSyntheticLambda17;
                            }
                            putConfigCache.onWarmupCompleted(854830388, _string.onNavigationEvent.IAuthTabCallback(), -854830385, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnExtraCallback, iAuthTabCallback, false, false, function0, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i8 >> 3) & 112) | 3456), 0});
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i15 = onWarmupCompleted + 91;
                                onExtraCallback = i15 % 128;
                                if (i15 % 2 != 0) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                    int i16 = 86 / 0;
                                } else {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                            }
                        }
                    } else {
                        if ((i8 & 512) != 0) {
                        }
                        Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnExtraCallback2 | z2)) {
                        }
                    }
                    z2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback);
                    Object objOnMinimized222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnExtraCallback2 | z2)) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getRpcProxy getrpcproxy, toJSONObject.IAuthTabCallback iAuthTabCallback, getDensity getdensity, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        getrpcproxy.onWarmupCompleted(iAuthTabCallback, ((getDensity.onNavigationEvent) getdensity).asInterface() + i + 1, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), true);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit asInterface(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, toJSONObject.IAuthTabCallback iAuthTabCallback, toJSONObject tojsonobject) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tojsonobject, "");
            assetDepositHomeEditViewModel.onNavigationEvent(iAuthTabCallback);
            throw null;
        }
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        IndexedValue indexedValueOnNavigationEvent = assetDepositHomeEditViewModel.onNavigationEvent(iAuthTabCallback);
        if (indexedValueOnNavigationEvent != null) {
            RVRpcProxy.onNavigationEvent(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) indexedValueOnNavigationEvent.onExtraCallback(), indexedValueOnNavigationEvent.onNavigationEvent() + 1, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), false);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 21;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(getRpcProxy getrpcproxy, getDensity getdensity, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        int i4;
        boolean z;
        boolean zOnNavigationEvent;
        boolean z2;
        boolean z3;
        Object obj;
        boolean zOnExtraCallback;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                int i7 = onWarmupCompleted + 65;
                onExtraCallback = i7 % 128;
                i5 = i7 % 2 != 0 ? 123 : 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            int i8 = onWarmupCompleted;
            int i9 = i8 + 85;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            if ((i2 & 512) == 0) {
                int i11 = i8 + 99;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback);
            } else {
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback);
            }
            i3 |= zOnExtraCallback ? 256 : 128;
        }
        int i13 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i13 & 1171) != 1170, i13 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onWarmupCompleted + 75;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1527334430, i13, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDepositHomeEditScreen.kt:590)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            if (((Boolean) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor}, setCurrentIndex.onNavigationEvent(), -245726195, setCurrentIndex.onNavigationEvent(), 245726208, setCurrentIndex.onNavigationEvent())).booleanValue()) {
                i4 = i13;
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0.onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, quirksExternalSyntheticBackport0, (updateFocusedState) null, (updateFocusedState) null, (updateFocusedState) null, 7, (Object) null));
            } else {
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0;
                i4 = i13;
            }
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i16 = i4 & 896;
            if (i16 != 256) {
                int i17 = onWarmupCompleted;
                int i18 = i17 + 5;
                onExtraCallback = i18 % 128;
                if (i18 % 2 == 0 ? (i4 & 512) != 0 : (i4 & 17030) != 0) {
                    int i19 = i17 + 51;
                    onExtraCallback = i19 % 128;
                    int i20 = i19 % 2;
                    if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback)) {
                        z = true;
                    }
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getdensity);
                    z2 = (i4 & 112) != 32;
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback2 | z | zOnNavigationEvent | z2) {
                        int i21 = onWarmupCompleted + 51;
                        onExtraCallback = i21 % 128;
                        int i22 = i21 % 2;
                        Object obj2 = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda21 externalSyntheticLambda21 = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda21(getrpcproxy, iAuthTabCallback, getdensity, i);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda21);
                            obj2 = externalSyntheticLambda21;
                        }
                        Function0 function0 = (Function0) obj2;
                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetDepositHomeEditViewModel);
                        if (i16 != 256) {
                            int i23 = onWarmupCompleted + 33;
                            onExtraCallback = i23 % 128;
                            if (i23 % 2 == 0 ? (i4 & 512) != 0 : (i4 & 12727) != 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback)) {
                                    z3 = true;
                                }
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (zOnExtraCallback3 | z3) {
                                    int i24 = onWarmupCompleted + 65;
                                    onExtraCallback = i24 % 128;
                                    if (i24 % 2 != 0) {
                                        int i25 = 75 / 0;
                                        obj = objOnMinimized2;
                                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda22 externalSyntheticLambda22 = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda22(assetDepositHomeEditViewModel, iAuthTabCallback);
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda22);
                                            obj = externalSyntheticLambda22;
                                        }
                                        putConfigCache.onWarmupCompleted(854830388, _string.onNavigationEvent.IAuthTabCallback(), -854830385, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnExtraCallback, iAuthTabCallback, true, false, function0, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i4 >> 3) & 112) | 3456), 0});
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            int i26 = onWarmupCompleted + 55;
                                            onExtraCallback = i26 % 128;
                                            int i27 = i26 % 2;
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                    } else {
                                        obj = objOnMinimized2;
                                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        }
                                        putConfigCache.onWarmupCompleted(854830388, _string.onNavigationEvent.IAuthTabCallback(), -854830385, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnExtraCallback, iAuthTabCallback, true, false, function0, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i4 >> 3) & 112) | 3456), 0});
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        }
                                    }
                                }
                            }
                            z3 = false;
                            Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (zOnExtraCallback3 | z3) {
                            }
                        }
                    }
                }
                z = false;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getdensity);
                if ((i4 & 112) != 32) {
                }
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback2 | z | zOnNavigationEvent | z2) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(boolean z, getDensity getdensity, Resources resources, getRpcProxy getrpcproxy, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Context context, View view, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) throws Resources.NotFoundException {
        List listIAuthTabCallbackDefault;
        List listAsBinder;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        getDensity.onNavigationEvent onnavigationevent = (getDensity.onNavigationEvent) getdensity;
        if (z) {
            listIAuthTabCallbackDefault = onnavigationevent.IAuthTabCallbackDefault();
        } else {
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            listIAuthTabCallbackDefault = (List) getDensity.onNavigationEvent.onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -641708251, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{onnavigationevent}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, 641708252);
        }
        List list = listIAuthTabCallbackDefault;
        String string = resources.getString(R.string.home_v2_feature_asset_home_edit_asset_deposit_category_section_header_deposit);
        Intrinsics.checkNotNullExpressionValue(string, "");
        getBacktraceNote getbacktracenoteIAuthTabCallback = null;
        RVConfigService.onWarmupCompleted(audioRestrictionControllerImplExternalSyntheticLambda0, "Transaction", list, string, z ? getLpid.onWarmupCompleted.onNavigationEvent() : null, ForwardingCameraControl.onExtraCallbackWithResult(1188464145, true, new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda23(getdensity, z, getrpcproxy, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, context, view, resources)));
        if (z) {
            int i2 = onExtraCallback + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            listAsBinder = onnavigationevent.onExtraCallback();
        } else {
            listAsBinder = onnavigationevent.asBinder();
        }
        List list2 = listAsBinder;
        String string2 = resources.getString(R.string.home_v2_feature_asset_home_edit_asset_deposit_category_section_header_saving);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        if (z) {
            int i4 = onWarmupCompleted + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                getLpid.onWarmupCompleted.IAuthTabCallback();
                getbacktracenoteIAuthTabCallback.hashCode();
                throw null;
            }
            getbacktracenoteIAuthTabCallback = getLpid.onWarmupCompleted.IAuthTabCallback();
        }
        RVConfigService.onWarmupCompleted(audioRestrictionControllerImplExternalSyntheticLambda0, "Saving", list2, string2, getbacktracenoteIAuthTabCallback, ForwardingCameraControl.onExtraCallbackWithResult(766852154, true, new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda24(getdensity, z, getrpcproxy, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, context, view, resources)));
        if (!z) {
            List listOnNavigationEvent = onnavigationevent.onNavigationEvent();
            String string3 = resources.getString(R.string.home_v2_feature_asset_home_edit_asset_deposit_category_section_header_investment);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "Investment", listOnNavigationEvent, string3, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(1609116310, true, new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda25(getdensity, getrpcproxy, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor)), 8, (Object) null);
            List listOnTransact = onnavigationevent.onTransact();
            String string4 = resources.getString(R.string.home_v2_feature_asset_home_edit_asset_deposit_category_section_header_pension);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "Pension", listOnTransact, string4, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(956105087, true, new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda26(getdensity, getrpcproxy, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor)), 8, (Object) null);
            List listOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
            String string5 = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_account_hidden);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listOnExtraCallbackWithResult, string5, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(1527334430, true, new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda27(getrpcproxy, getdensity, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor)), 9, (Object) null);
            int i5 = onExtraCallback + 47;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[2];
        int i = 2 % 2;
        if (onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6).onWarmupCompleted()) {
            int i2 = onWarmupCompleted + 125;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 82 / 0;
                if (!onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2)) {
                    onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2, true);
                    RVRpcProxy.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, ((openUrl) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).getLogValue());
                }
            } else if (!onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2)) {
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {gettimebase, Integer.valueOf((int) extensionsManager1.onExtraCallbackWithResult())};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), 1797330117, setCurrentIndex.onNavigationEvent(), -1797330106, iOnNavigationEvent);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            RVRpcProxy.IAuthTabCallbackDefault(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, ((openUrl) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).getLogValue());
            assetDepositHomeEditViewModel.onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        RVRpcProxy.IAuthTabCallbackDefault(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, ((openUrl) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).getLogValue());
        assetDepositHomeEditViewModel.onNavigationEvent();
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 47;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        boolean z = true;
        if ((i & 6) == 0) {
            int i5 = onExtraCallback + 19;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2;
            } else if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = onWarmupCompleted + 121;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            int i9 = onWarmupCompleted + 91;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i11 = onWarmupCompleted + 69;
            onExtraCallback = i11 % 128;
            if (i11 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onExtraCallback + 93;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1856925480, i2, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeEditScreen.<anonymous>.<anonymous>.<anonymous> (AssetDepositHomeEditScreen.kt:664)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_save_cta_label, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetDepositHomeEditViewModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnExtraCallback2)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda31 externalSyntheticLambda31 = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda31(getsupportedhighspeedresolutionsfor, assetDepositHomeEditViewModel);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda31);
                    obj = externalSyntheticLambda31;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, zOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 502);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        assetDepositHomeEditViewModel.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v15 ??, still in use, count: 1, list:
          (r9v15 ?? I:java.lang.Object) from 0x059c: INVOKE (r5v2 ?? I:o.CameraCaptureResultEmptyCameraCaptureResult), (r9v15 ?? I:java.lang.Object) INTERFACE call: o.CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(java.lang.Object):void (LINE:898)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private static /* synthetic */ java.lang.Object onTransact(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v15 ??, still in use, count: 1, list:
          (r9v15 ?? I:java.lang.Object) from 0x059c: INVOKE (r5v2 ?? I:o.CameraCaptureResultEmptyCameraCaptureResult), (r9v15 ?? I:java.lang.Object) INTERFACE call: o.CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(java.lang.Object):void (LINE:898)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r53v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
        */

    private static final Unit IAuthTabCallback(long j, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStubProxy(0.98f);
        fliphorizontally.IAuthTabCallbackStubProxy(0.98f);
        fliphorizontally.access100(fliphorizontally.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f)));
        fliphorizontally.onExtraCallback(j);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(getConfigJSONObject<toJSONObject.IAuthTabCallback> getconfigjsonobject, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean zOnExtraCallback;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1302031754);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i4 = onExtraCallback + 125;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getconfigjsonobject);
            } else {
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getconfigjsonobject);
                int i6 = onExtraCallback + 45;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
            i2 = (zOnExtraCallback ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i2 & 3) == 2), i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 79;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1302031754, i2, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.DraggingItem (AssetDepositHomeEditScreen.kt:700)");
            }
            toJSONObject.IAuthTabCallback iAuthTabCallback = (toJSONObject.IAuthTabCallback) getconfigjsonobject.IAuthTabCallback();
            long jOnExtraCallback = getconfigjsonobject.onExtraCallback();
            if (iAuthTabCallback != null) {
                int i10 = onExtraCallback + 73;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 57 / 0;
                    if (setUseCaseAttached.onWarmupCompleted(jOnExtraCallback, setUseCaseAttached.Companion.onNavigationEvent())) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(979351032);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(978599530);
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                        long jExtraCommand = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).extraCommand();
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = submit.onExtraCallbackWithResult(onextracallback, 2.0f);
                        boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnExtraCallback);
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnWarmupCompleted || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda18(jOnExtraCallback);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = CaptureNoResponseQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized);
                        boolean zOnWarmupCompleted2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jExtraCommand);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnWarmupCompleted2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized2 = new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda19(jExtraCommand);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = verifyDrawable.onExtraCallbackWithResult(attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, (Function1) objOnMinimized2), y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)));
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
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
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        putConfigCache.onWarmupCompleted(854830388, _string.onNavigationEvent.IAuthTabCallback(), -854830385, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), new Object[]{onextracallback, iAuthTabCallback, false, true, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 52});
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                } else if (!setUseCaseAttached.onWarmupCompleted(jOnExtraCallback, setUseCaseAttached.Companion.onNavigationEvent())) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i12 = onWarmupCompleted + 117;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda20(getconfigjsonobject, i));
        }
        int i13 = onExtraCallback + 67;
        onWarmupCompleted = i13 % 128;
        if (i13 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        long jLongValue;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1792177209);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i4 = onExtraCallback + 71;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = onExtraCallback + 97;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1792177209, i2, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.SectionEmptyRow (AssetDepositHomeEditScreen.kt:733)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 2, (Object) null);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onMessageChannelReady(), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f)));
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onExtraCallback(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout())) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f));
            getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1544907700);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1544908660);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i8 = onExtraCallback + 5;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport0OnWarmupCompleted2, gethumanreadablename, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onTransact(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i2 & 14) | 48), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetDepositHomeEditScreenKt$.ExternalSyntheticLambda32(str, i));
        }
    }

    private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = onWarmupCompleted + 91;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return zBooleanValue;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onWarmupCompleted + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
    }

    private static final getScreenWidth onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<getScreenWidth> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getScreenWidth getscreenwidth = (getScreenWidth) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onExtraCallback + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return getscreenwidth;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getTimebase gettimebase = (getTimebase) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        int i4 = onWarmupCompleted + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(iOnWarmupCompleted);
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        getTimebase gettimebase = (getTimebase) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        gettimebase.onExtraCallback(iIntValue);
        int i4 = onExtraCallback + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        boolean zBooleanValue;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            zBooleanValue = bool.booleanValue();
            int i4 = 88 / 0;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ExtensionsInfoExternalSyntheticLambda0 onNavigationEvent(long j, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        long jMax;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            jMax = Math.max(1, getBacktraceNoteBytes.onExtraCallback(Float.intBitsToFloat((int) j))) ^ 4294967294L;
        } else {
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            jMax = Math.max(0, getBacktraceNoteBytes.onExtraCallback(Float.intBitsToFloat((int) j))) & 4294967295L;
        }
        ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0IAuthTabCallback = ExtensionsInfoExternalSyntheticLambda0.IAuthTabCallback(ExtensionsInfoExternalSyntheticLambda0.onNavigationEvent(jMax));
        int i3 = onExtraCallback + 37;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
        }
        return extensionsInfoExternalSyntheticLambda0IAuthTabCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), -462532206, setCurrentIndex.onNavigationEvent(), 462532211, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit IAuthTabCallback(readFully readfully, setIso setiso) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{readfully, setiso}, iOnNavigationEvent2, 1052322582, setCurrentIndex.onNavigationEvent(), -1052322579, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, assetDepositHomeEditViewModel, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), -1714756374, setCurrentIndex.onNavigationEvent(), 1714756384, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onNavigationEvent(getDensity getdensity, getRpcProxy getrpcproxy, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {getdensity, getrpcproxy, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), -918421394, setCurrentIndex.onNavigationEvent(), 918421400, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onExtraCallback(getDensity getdensity, getRpcProxy getrpcproxy, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {getdensity, getrpcproxy, assetDepositHomeEditViewModel, getsupportedhighspeedresolutionsfor, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), 945816696, setCurrentIndex.onNavigationEvent(), -945816682, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{assetDepositHomeEditViewModel}, iOnNavigationEvent2, -329092493, setCurrentIndex.onNavigationEvent(), 329092505, iOnNavigationEvent);
    }

    public static /* synthetic */ ExtensionsInfoExternalSyntheticLambda0 onExtraCallback(long j, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        Object[] objArr = {Long.valueOf(j), r8lambdanm9dm2eewl4vrptnjmesfjqky4};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (ExtensionsInfoExternalSyntheticLambda0) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), -292004886, setCurrentIndex.onNavigationEvent(), 292004887, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor2}, iOnNavigationEvent2, 475905869, setCurrentIndex.onNavigationEvent(), -475905867, iOnNavigationEvent);
    }

    public static final void onExtraCallback(@NotNull getSupportedHighSpeedResolutionsFor<openUrl> getsupportedhighspeedresolutionsfor, @Nullable AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, assetDepositHomeEditViewModel, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), -369740549, setCurrentIndex.onNavigationEvent(), 369740557, iOnNavigationEvent);
    }

    private static final int onExtraCallbackWithResult(getTimebase gettimebase) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        return ((Integer) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{gettimebase}, iOnNavigationEvent2, 1490349599, setCurrentIndex.onNavigationEvent(), -1490349590, iOnNavigationEvent)).intValue();
    }

    private static final void onWarmupCompleted(getTimebase gettimebase, int i) {
        Object[] objArr = {gettimebase, Integer.valueOf(i)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), 1797330117, setCurrentIndex.onNavigationEvent(), -1797330106, iOnNavigationEvent);
    }

    private static final boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        return ((Boolean) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor}, iOnNavigationEvent2, -245726195, setCurrentIndex.onNavigationEvent(), 245726208, iOnNavigationEvent)).booleanValue();
    }

    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2}, iOnNavigationEvent2, -2098112522, setCurrentIndex.onNavigationEvent(), 2098112522, iOnNavigationEvent);
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2}, iOnNavigationEvent2, 823901950, setCurrentIndex.onNavigationEvent(), -823901946, iOnNavigationEvent);
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor2}, iOnNavigationEvent2, -278643226, setCurrentIndex.onNavigationEvent(), 278643233, iOnNavigationEvent);
    }
}
