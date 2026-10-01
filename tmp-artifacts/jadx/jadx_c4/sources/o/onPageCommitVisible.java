package o;

import android.view.View;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeExtension;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.Futures3;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.WebSocketFactory;
import o.decrementVideoUsage;
import o.flipHorizontally;
import o.getSupportedHighSpeedResolutionsFor;
import o.isInVideoUsage;
import o.onPageCommitVisible;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onPageCommitVisible {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objArr[0];
        flipHorizontally fliphorizontally = (flipHorizontally) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(isqueryrefinementenabled, fliphorizontally);
        int i4 = IAuthTabCallback + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strAccess000 = access000(getsupportedhighspeedresolutionsfor);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        int i5 = onWarmupCompleted + 101;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return strAccess000;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset, NativeAdsManager nativeAdsManager, setContentInsetsRelative setcontentinsetsrelative, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 61;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallback(quirksExternalSyntheticBackport0, nativeAdsDto, adAsset, nativeAdsManager, setcontentinsetsrelative, camera2CameraMetadataExternalSyntheticLambda1, viewPager2LinearLayoutManagerImpl, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, nativeAdsDto, adAsset, nativeAdsManager, setcontentinsetsrelative, camera2CameraMetadataExternalSyntheticLambda1, viewPager2LinearLayoutManagerImpl, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onWarmupCompleted + 109;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(671396607, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr, iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -671396598);
        int i4 = onWarmupCompleted + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final /* synthetic */ boolean asBinder(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean interfaceDescriptor = getInterfaceDescriptor(getsupportedhighspeedresolutionsfor);
        int i4 = IAuthTabCallback + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static final /* synthetic */ NativeAdsDto.AdAsset onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.AdAsset adAssetIAuthTabCallbackDefault = IAuthTabCallbackDefault((getSupportedHighSpeedResolutionsFor<NativeAdsDto.AdAsset>) getsupportedhighspeedresolutionsfor);
        int i4 = IAuthTabCallback + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return adAssetIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = i | i9;
        int i11 = ~i;
        int i12 = i9 | (~(i11 | i6));
        int i13 = (~(i4 | i7 | i)) | (~(i8 | i11 | i7));
        int i14 = i6 + i + i3 + ((-619979367) * i5) + (68302741 * i2);
        int i15 = i14 * i14;
        int i16 = (i6 * 561304900) + 382271488 + (561304900 * i) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i3) + (1615200256 * i5) + ((-1821507584) * i2) + (428933120 * i15);
        int i17 = ((i6 * (-96142684)) - 56799437) + (i * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i3 * (-96141863)) + (i5 * (-1380774991)) + (i2 * (-1175232947)) + (i15 * (-118947840));
        switch (i16 + (i17 * i17 * (-1369505792))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return asBinder(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return IAuthTabCallbackDefault(objArr);
            default:
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
                int i18 = 2 % 2;
                int i19 = IAuthTabCallback + 87;
                onWarmupCompleted = i19 % 128;
                int i20 = i19 % 2;
                float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
                int i21 = IAuthTabCallback + 31;
                onWarmupCompleted = i21 % 128;
                int i22 = i21 % 2;
                return Float.valueOf(fOnNavigationEvent);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, float f, View view, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, f, view, futures3);
        int i4 = IAuthTabCallback + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset, NativeAdsManager nativeAdsManager, setContentInsetsRelative setcontentinsetsrelative, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 111;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            Object[] objArr = {quirksExternalSyntheticBackport0, nativeAdsDto, adAsset, nativeAdsManager, setcontentinsetsrelative, camera2CameraMetadataExternalSyntheticLambda1, viewPager2LinearLayoutManagerImpl, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)};
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            onExtraCallback(529280377, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr, iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -529280371);
        } else {
            Object[] objArr2 = {quirksExternalSyntheticBackport0, nativeAdsDto, adAsset, nativeAdsManager, setcontentinsetsrelative, camera2CameraMetadataExternalSyntheticLambda1, viewPager2LinearLayoutManagerImpl, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
            int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            onExtraCallback(529280377, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr2, iIAuthTabCallback2, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -529280371);
        }
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ TextFieldPressGestureFilterKtExternalSyntheticLambda0 onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        if (i3 != 0) {
            throw null;
        }
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0 = (TextFieldPressGestureFilterKtExternalSyntheticLambda0) onExtraCallback(15369880, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr, iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -15369872);
        int i4 = IAuthTabCallback + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return textFieldPressGestureFilterKtExternalSyntheticLambda0;
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, str);
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, z);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
    }

    public static final /* synthetic */ float onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            return ((Float) onExtraCallback(1816216077, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{getsupportedhighspeedresolutions}, iIAuthTabCallback, iIAuthTabCallback3, -1816216077)).floatValue();
        }
        int iIAuthTabCallback4 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback5 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback6 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        ((Float) onExtraCallback(1816216077, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback5, new Object[]{getsupportedhighspeedresolutions}, iIAuthTabCallback4, iIAuthTabCallback6, -1816216077)).floatValue();
        throw null;
    }

    public static final /* synthetic */ NativeAdsDto onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            return (NativeAdsDto) onExtraCallback(-1013784112, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iIAuthTabCallback, iIAuthTabCallback3, 1013784114);
        }
        int iIAuthTabCallback4 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback5 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback6 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(getsupportedhighspeedresolutionsfor, z);
        int i4 = IAuthTabCallback + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStub = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        int i4 = IAuthTabCallback + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallbackStub;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(getsupportedhighspeedresolutions, f);
        int i4 = onWarmupCompleted + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        asBinder(getsupportedhighspeedresolutionsfor, z);
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        int i5 = onWarmupCompleted + 65;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
    }

    public static final /* synthetic */ boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        boolean zBooleanValue = ((Boolean) onExtraCallback(-888111541, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback, iIAuthTabCallback3, 888111545)).booleanValue();
        int i4 = onWarmupCompleted + 53;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ boolean onNavigationEvent(setContentInsetsRelative setcontentinsetsrelative, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        boolean zBooleanValue = ((Boolean) onExtraCallback(626079886, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{setcontentinsetsrelative, camera2CameraMetadataExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor}, iIAuthTabCallback, iIAuthTabCallback3, -626079879)).booleanValue();
        int i4 = onWarmupCompleted + 101;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static final /* synthetic */ NativeAdsDto.AdAsset onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.AdAsset adAssetIAuthTabCallbackDefault = IAuthTabCallbackDefault((CameraPresenceProviderExternalSyntheticLambda6<NativeAdsDto.AdAsset>) cameraPresenceProviderExternalSyntheticLambda6);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return adAssetIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(-397076630, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr, iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 397076631);
        int i4 = onWarmupCompleted + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage onWarmupCompleted(NativeAdsManager nativeAdsManager, onExtraCallback onextracallback, isInVideoUsage isinvideousage) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnNavigationEvent = onNavigationEvent(nativeAdsManager, onextracallback, isinvideousage);
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return decrementvideousageOnNavigationEvent;
    }

    public static final /* synthetic */ boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        }
        asInterface((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        throw null;
    }

    private static final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        int i4 = onWarmupCompleted + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforOnWarmupCompleted;
    }

    public static final class asInterface implements decrementVideoUsage {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ NativeAdsManager onExtraCallback;
        final /* synthetic */ onExtraCallback onExtraCallbackWithResult;

        public asInterface(NativeAdsManager nativeAdsManager, onExtraCallback onextracallback) {
            this.onExtraCallback = nativeAdsManager;
            this.onExtraCallbackWithResult = onextracallback;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallback.onWarmupCompleted(this.onExtraCallbackWithResult);
                throw null;
            }
            this.onExtraCallback.onWarmupCompleted(this.onExtraCallbackWithResult);
            int i3 = onWarmupCompleted + 19;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 38 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        setContentInsetsRelative setcontentinsetsrelative = (setContentInsetsRelative) objArr[0];
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[1];
        int i = 2 % 2;
        if (!onTransact((getSupportedHighSpeedResolutionsFor<Boolean>) objArr[2])) {
            if (setcontentinsetsrelative != null) {
                int i2 = IAuthTabCallback + 85;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0 ? !setcontentinsetsrelative.IAuthTabCallbackDefault() : !setcontentinsetsrelative.IAuthTabCallbackDefault()) {
                    if (camera2CameraMetadataExternalSyntheticLambda1 == null || !camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallbackDefault()) {
                        return true;
                    }
                }
            }
        }
        int i3 = onWarmupCompleted + 119;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $externalAlpha;
        final /* synthetic */ getSupportedHighSpeedResolutions $externalAlphaTarget$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$externalAlpha = isqueryrefinementenabled;
            this.$externalAlphaTarget$delegate = getsupportedhighspeedresolutions;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$externalAlpha, this.$externalAlphaTarget$delegate, access13800Var);
            int i2 = IAuthTabCallback + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 59;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 55;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 45;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$externalAlpha;
                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(onPageCommitVisible.onExtraCallbackWithResult(this.$externalAlphaTarget$delegate));
                getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(500, 0, (setOnQueryTextListener) null, 6, (Object) null);
                this.label = 1;
                if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onExtraCallback implements removeNonDecorViews {
        private static int IAuthTabCallback_Parcel = 1;
        private static int access100;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<TextFieldPressGestureFilterKtExternalSyntheticLambda0> IAuthTabCallback;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> IAuthTabCallbackDefault;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> IAuthTabCallbackStub;
        final /* synthetic */ NativeAdsManager asBinder;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> asInterface;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<NativeAdsDto.AdAsset> getInterfaceDescriptor;
        final /* synthetic */ getSupportedHighSpeedResolutions onExtraCallback;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<NativeAdsDto> onExtraCallbackWithResult;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> onNavigationEvent;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> onTransact;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<NativeAdsDto.AdAsset> onWarmupCompleted;

        public static /* synthetic */ boolean onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
            int i = 2 % 2;
            int i2 = access100 + 113;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor3);
            if (i3 == 0) {
                int i4 = 79 / 0;
            }
            int i5 = IAuthTabCallback_Parcel + 61;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                return zOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
            int i = 2 % 2;
            int i2 = access100 + 31;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor3);
            int i4 = access100 + 33;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return zIAuthTabCallback;
        }

        public static /* synthetic */ boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 43;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallbackDefault = IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor3);
            int i4 = IAuthTabCallback_Parcel + 83;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 55 / 0;
            }
            return zIAuthTabCallbackDefault;
        }

        onExtraCallback(NativeAdsManager nativeAdsManager, CameraPresenceProviderExternalSyntheticLambda6<? extends TextFieldPressGestureFilterKtExternalSyntheticLambda0> cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6<NativeAdsDto> cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6<NativeAdsDto.AdAsset> cameraPresenceProviderExternalSyntheticLambda63, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<NativeAdsDto.AdAsset> getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor6) {
            this.asBinder = nativeAdsManager;
            this.IAuthTabCallback = cameraPresenceProviderExternalSyntheticLambda6;
            this.onExtraCallbackWithResult = cameraPresenceProviderExternalSyntheticLambda62;
            this.onWarmupCompleted = cameraPresenceProviderExternalSyntheticLambda63;
            this.asInterface = getsupportedhighspeedresolutionsfor;
            this.getInterfaceDescriptor = getsupportedhighspeedresolutionsfor2;
            this.onNavigationEvent = getsupportedhighspeedresolutionsfor3;
            this.IAuthTabCallbackStub = getsupportedhighspeedresolutionsfor4;
            this.onTransact = getsupportedhighspeedresolutionsfor5;
            this.onExtraCallback = getsupportedhighspeedresolutions;
            this.IAuthTabCallbackDefault = getsupportedhighspeedresolutionsfor6;
        }

        private static final boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 53;
            access100 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onPageCommitVisible.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                obj.hashCode();
                throw null;
            }
            if (!onPageCommitVisible.onNavigationEvent(getsupportedhighspeedresolutionsfor)) {
                int i3 = IAuthTabCallback_Parcel + 97;
                access100 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.areEqual(onPageCommitVisible.onExtraCallback(getsupportedhighspeedresolutionsfor2), onPageCommitVisible.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6));
                    obj.hashCode();
                    throw null;
                }
                if (Intrinsics.areEqual(onPageCommitVisible.onExtraCallback(getsupportedhighspeedresolutionsfor2), onPageCommitVisible.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6)) && onPageCommitVisible.asBinder(getsupportedhighspeedresolutionsfor3)) {
                    return true;
                }
            }
            int i4 = IAuthTabCallback_Parcel + 95;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }

        private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
            int i = 2 % 2;
            int i2 = access100 + 31;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                onPageCommitVisible.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (onPageCommitVisible.onNavigationEvent(getsupportedhighspeedresolutionsfor) || !Intrinsics.areEqual(onPageCommitVisible.onExtraCallback(getsupportedhighspeedresolutionsfor2), onPageCommitVisible.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6)) || !onPageCommitVisible.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor3)) {
                return false;
            }
            int i3 = access100 + 51;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }

        @Override // o.removeNonDecorViews
        public void IAuthTabCallback() throws Throwable {
            int i = 2 % 2;
            NativeAdsManager nativeAdsManager = this.asBinder;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnExtraCallback = onPageCommitVisible.onExtraCallback(this.IAuthTabCallback);
            String strIAuthTabCallbackStub = onPageCommitVisible.onExtraCallbackWithResult(this.onExtraCallbackWithResult).IAuthTabCallbackStub();
            NativeAdsDto.AdAsset adAssetOnWarmupCompleted = onPageCommitVisible.onWarmupCompleted(this.onWarmupCompleted);
            final getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor = this.asInterface;
            final getSupportedHighSpeedResolutionsFor<NativeAdsDto.AdAsset> getsupportedhighspeedresolutionsfor2 = this.getInterfaceDescriptor;
            final CameraPresenceProviderExternalSyntheticLambda6<NativeAdsDto.AdAsset> cameraPresenceProviderExternalSyntheticLambda6 = this.onWarmupCompleted;
            final getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor3 = this.onNavigationEvent;
            Function0 function0 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsComponentKt$NativeAd$impressionHandler$1$1$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 15;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    Boolean boolValueOf = Boolean.valueOf(onPageCommitVisible.onExtraCallback.onExtraCallback(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor3));
                    int i5 = IAuthTabCallback + 23;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return boolValueOf;
                }
            };
            final getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor4 = this.asInterface;
            final getSupportedHighSpeedResolutionsFor<NativeAdsDto.AdAsset> getsupportedhighspeedresolutionsfor5 = this.getInterfaceDescriptor;
            final CameraPresenceProviderExternalSyntheticLambda6<NativeAdsDto.AdAsset> cameraPresenceProviderExternalSyntheticLambda62 = this.onWarmupCompleted;
            final getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor6 = this.IAuthTabCallbackStub;
            NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1869487633, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1869487598, new Object[]{nativeAdsManager, textFieldPressGestureFilterKtExternalSyntheticLambda0OnExtraCallback, strIAuthTabCallbackStub, adAssetOnWarmupCompleted, function0, new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsComponentKt$NativeAd$impressionHandler$1$1$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    Boolean boolValueOf;
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 123;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        boolValueOf = Boolean.valueOf(onPageCommitVisible.onExtraCallback.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, cameraPresenceProviderExternalSyntheticLambda62, getsupportedhighspeedresolutionsfor6));
                        int i4 = 99 / 0;
                    } else {
                        boolValueOf = Boolean.valueOf(onPageCommitVisible.onExtraCallback.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, cameraPresenceProviderExternalSyntheticLambda62, getsupportedhighspeedresolutionsfor6));
                    }
                    int i5 = onExtraCallback + 17;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return boolValueOf;
                }
            }}, nSetPosition.onExtraCallbackWithResult());
            NativeAdsManager nativeAdsManager2 = this.asBinder;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnExtraCallback2 = onPageCommitVisible.onExtraCallback(this.IAuthTabCallback);
            String strIAuthTabCallbackStub2 = onPageCommitVisible.onExtraCallbackWithResult(this.onExtraCallbackWithResult).IAuthTabCallbackStub();
            NativeAdsDto.AdAsset adAssetOnWarmupCompleted2 = onPageCommitVisible.onWarmupCompleted(this.onWarmupCompleted);
            final getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor7 = this.asInterface;
            final getSupportedHighSpeedResolutionsFor<NativeAdsDto.AdAsset> getsupportedhighspeedresolutionsfor8 = this.getInterfaceDescriptor;
            final CameraPresenceProviderExternalSyntheticLambda6<NativeAdsDto.AdAsset> cameraPresenceProviderExternalSyntheticLambda63 = this.onWarmupCompleted;
            final getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor9 = this.onTransact;
            nativeAdsManager2.onExtraCallback((findResAndMsg) textFieldPressGestureFilterKtExternalSyntheticLambda0OnExtraCallback2, strIAuthTabCallbackStub2, adAssetOnWarmupCompleted2, new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsComponentKt$NativeAd$impressionHandler$1$1$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 49;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        Boolean.valueOf(onPageCommitVisible.onExtraCallback.onWarmupCompleted(getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor8, cameraPresenceProviderExternalSyntheticLambda63, getsupportedhighspeedresolutionsfor9));
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Boolean boolValueOf = Boolean.valueOf(onPageCommitVisible.onExtraCallback.onWarmupCompleted(getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor8, cameraPresenceProviderExternalSyntheticLambda63, getsupportedhighspeedresolutionsfor9));
                    int i4 = onWarmupCompleted + 25;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return boolValueOf;
                }
            });
            int i2 = access100 + 43;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
        }

        private static final boolean IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
            int i = 2 % 2;
            if (!onPageCommitVisible.onNavigationEvent(getsupportedhighspeedresolutionsfor)) {
                int i2 = access100 + 103;
                IAuthTabCallback_Parcel = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.areEqual(onPageCommitVisible.onExtraCallback(getsupportedhighspeedresolutionsfor2), onPageCommitVisible.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6));
                    throw null;
                }
                if (Intrinsics.areEqual(onPageCommitVisible.onExtraCallback(getsupportedhighspeedresolutionsfor2), onPageCommitVisible.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6)) && onPageCommitVisible.onWarmupCompleted(getsupportedhighspeedresolutionsfor3)) {
                    int i3 = access100 + 121;
                    IAuthTabCallback_Parcel = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
            }
            int i5 = IAuthTabCallback_Parcel + 73;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        @Override // o.removeNonDecorViews
        public void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = access100 + 121;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            onPageCommitVisible.onNavigationEvent((getSupportedHighSpeedResolutionsFor) this.asInterface, true);
            if (!(onPageCommitVisible.onWarmupCompleted(this.onWarmupCompleted).onExtraCallbackWithResult() instanceof NativeAdsDto.Creative.Normal)) {
                return;
            }
            onPageCommitVisible.onNavigationEvent(this.onExtraCallback, 0.0f);
            int i4 = access100 + 113;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.removeNonDecorViews
        public void onNavigationEvent() {
            int i = 2 % 2;
            onPageCommitVisible.onNavigationEvent((getSupportedHighSpeedResolutionsFor) this.asInterface, false);
            if (onPageCommitVisible.onWarmupCompleted(this.onWarmupCompleted).onExtraCallbackWithResult() instanceof NativeAdsDto.Creative.Normal) {
                int i2 = IAuthTabCallback_Parcel + 31;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                onPageCommitVisible.onNavigationEvent(this.onExtraCallback, 1.0f);
                int i4 = access100 + 113;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        @Override // o.removeNonDecorViews
        public void IAuthTabCallback(boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 3;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            onPageCommitVisible.onExtraCallback(this.IAuthTabCallbackDefault, z);
            int i4 = IAuthTabCallback_Parcel + 63;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<String> $animatedContentTypeKey$delegate;
        final /* synthetic */ String $contentTypeKey;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $externalAlpha;
        final /* synthetic */ getSupportedHighSpeedResolutions $externalAlphaTarget$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(String str, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$contentTypeKey = str;
            this.$externalAlpha = isqueryrefinementenabled;
            this.$animatedContentTypeKey$delegate = getsupportedhighspeedresolutionsfor;
            this.$externalAlphaTarget$delegate = getsupportedhighspeedresolutions;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$contentTypeKey, this.$externalAlpha, this.$animatedContentTypeKey$delegate, this.$externalAlphaTarget$delegate, access13800Var);
            int i2 = onWarmupCompleted + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 77;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (Intrinsics.areEqual(onPageCommitVisible.IAuthTabCallback(this.$animatedContentTypeKey$delegate), this.$contentTypeKey)) {
                    int i3 = onNavigationEvent + 91;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0 ? onPageCommitVisible.onExtraCallbackWithResult(this.$externalAlphaTarget$delegate) == 1.0f : onPageCommitVisible.onExtraCallbackWithResult(this.$externalAlphaTarget$delegate) == 0.0f) {
                        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$externalAlpha;
                        Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(1.0f);
                        this.label = 1;
                        if (isqueryrefinementenabled.onWarmupCompleted(fOnExtraCallbackWithResult, this) == objOnWarmupCompleted) {
                            int i4 = onWarmupCompleted + 11;
                            onNavigationEvent = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i5 = 86 / 0;
                            }
                            return objOnWarmupCompleted;
                        }
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i6 = onWarmupCompleted + 41;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            onPageCommitVisible.onExtraCallback(this.$animatedContentTypeKey$delegate, this.$contentTypeKey);
            onPageCommitVisible.onNavigationEvent(this.$externalAlphaTarget$delegate, 1.0f);
            Unit unit = Unit.INSTANCE;
            int i8 = onWarmupCompleted + 9;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ onExtraCallback $impressionHandler;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(onExtraCallback onextracallback, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$impressionHandler = onextracallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$impressionHandler, access13800Var);
            int i2 = IAuthTabCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 37;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 89 / 0;
            }
            int i5 = onWarmupCompleted + 73;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = IAuthTabCallback + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$impressionHandler.IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ onExtraCallback $impressionHandler;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(onExtraCallback onextracallback, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$impressionHandler = onextracallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$impressionHandler, access13800Var);
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 79 / 0;
            }
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 51 / 0;
            }
            int i5 = onExtraCallback + 97;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(400L, this) == objOnWarmupCompleted) {
                    int i3 = onExtraCallback + 125;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            this.$impressionHandler.IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 89;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 22 / 0;
            }
            return unit;
        }
    }

    private static final Unit onExtraCallbackWithResult(isQueryRefinementEnabled isqueryrefinementenabled, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        fliphorizontally.asInterface(getDoubleValue.IAuthTabCallback(0.5f, 0.0f));
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onTransact(getsupportedhighspeedresolutionsfor, z);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 35;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor, zBooleanValue);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            access100(getsupportedhighspeedresolutionsfor, zBooleanValue);
            return Unit.INSTANCE;
        }
        access100(getsupportedhighspeedresolutionsfor, zBooleanValue);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0119 A[PHI: r10
      0x0119: PHI (r10v30 int) = (r10v8 int), (r10v11 int), (r10v12 int) binds: [B:69:0x0117, B:76:0x0127, B:75:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i6;
        NativeAdsManager nativeAdsManager;
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        final Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1;
        final setContentInsetsRelative setcontentinsetsrelative;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3;
        boolean z;
        boolean z2;
        NativeAdsManager nativeAdsManager2;
        Object objOnMinimized;
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted2;
        Object objOnMinimized2;
        boolean zOnExtraCallback;
        Object objOnMinimized3;
        Object objOnMinimized4;
        Object objOnMinimized5;
        Object objOnMinimized6;
        int i7;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = (QuirksExternalSyntheticBackport0) objArr[0];
        final NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[1];
        final NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
        final NativeAdsManager nativeAdsManager3 = (NativeAdsManager) objArr[3];
        setContentInsetsRelative setcontentinsetsrelative2 = (setContentInsetsRelative) objArr[4];
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda12 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[5];
        final ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl2 = (ViewPager2LinearLayoutManagerImpl) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        final int iIntValue2 = ((Number) objArr[9]).intValue();
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsDto, "");
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(nativeAdsManager3, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(603852331);
        int i9 = iIntValue2 & 1;
        if (i9 != 0) {
            i = iIntValue | 6;
        } else if ((iIntValue & 6) != 0) {
            i = iIntValue;
        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback3)) {
            int i10 = onWarmupCompleted + 75;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2 != 0 ? 2 : 4;
            i = i11 | iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(nativeAdsDto) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            int i12 = IAuthTabCallback + 75;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(adAsset) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nativeAdsManager3)) {
                int i14 = onWarmupCompleted + 103;
                IAuthTabCallback = i14 % 128;
                i7 = i14 % 2 != 0 ? 25010 : 2048;
            } else {
                i7 = 1024;
            }
            i |= i7;
        }
        int i15 = i;
        int i16 = iIntValue2 & 16;
        if (i16 == 0) {
            if ((iIntValue & 24576) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setcontentinsetsrelative2) ? 16384 : 8192) | i15;
            }
            i3 = iIntValue2 & 32;
            Object obj = null;
            if (i3 == 0) {
                i2 |= 196608;
            } else if ((196608 & iIntValue) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda12)) {
                    int i17 = IAuthTabCallback + 53;
                    onWarmupCompleted = i17 % 128;
                    if (i17 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i2 |= i4;
            }
            i5 = iIntValue2 & 64;
            int i18 = 1572864;
            if (i5 != 0) {
                i2 |= i18;
            } else if ((1572864 & iIntValue) == 0) {
                i18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(viewPager2LinearLayoutManagerImpl2) ? 1048576 : 524288;
                i2 |= i18;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i2) == 599186, i2 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i6 = iIntValue;
                nativeAdsManager = nativeAdsManager3;
                onwarmupcompleted = null;
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                onextracallback = onextracallback3;
                camera2CameraMetadataExternalSyntheticLambda1 = camera2CameraMetadataExternalSyntheticLambda12;
                setcontentinsetsrelative = setcontentinsetsrelative2;
            } else {
                if (i9 != 0) {
                    onextracallback3 = QuirksExternalSyntheticBackport0.Companion;
                }
                final setContentInsetsRelative setcontentinsetsrelative3 = i16 != 0 ? null : setcontentinsetsrelative2;
                final Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda13 = i3 != 0 ? null : camera2CameraMetadataExternalSyntheticLambda12;
                if (i5 != 0) {
                    viewPager2LinearLayoutManagerImpl2 = null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(603852331, i2, -1, "im.toss.ads_sdk.ui.compose.NativeAd (NativeAdsComponent.kt:50)");
                }
                TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent((TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback()));
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted3 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized7 == onwarmupcompleted3.onExtraCallback()) {
                    int i19 = IAuthTabCallback + 29;
                    onWarmupCompleted = i19 % 128;
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = i19 % 2 == 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 5, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                    objOnMinimized7 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objOnMinimized7;
                String strIAuthTabCallbackStub = nativeAdsDto.IAuthTabCallbackStub();
                int i20 = i2 & 896;
                boolean z3 = i20 == 256;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallbackStub);
                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z3 | zOnNavigationEvent) || objOnMinimized8 == onwarmupcompleted3.onExtraCallback()) {
                    objOnMinimized8 = JavaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallbackWithResult.IAuthTabCallback(nativeAdsDto.IAuthTabCallbackStub(), adAsset, nativeAdsManager3);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                }
                String str = (String) objOnMinimized8;
                Object[] objArr2 = new Object[0];
                Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized9 == onwarmupcompleted3.onExtraCallback()) {
                    objOnMinimized9 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsComponentKt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i21 = 2 % 2;
                            int i22 = IAuthTabCallback + 85;
                            onWarmupCompleted = i22 % 128;
                            int i23 = i22 % 2;
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnNavigationEvent = onPageCommitVisible.onNavigationEvent();
                            int i24 = onWarmupCompleted + 95;
                            IAuthTabCallback = i24 % 128;
                            int i25 = i24 % 2;
                            return getsupportedhighspeedresolutionsforOnNavigationEvent;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr2, (Function0) objOnMinimized9, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized10 == onwarmupcompleted3.onExtraCallback()) {
                    viewPager2LinearLayoutManagerImpl = viewPager2LinearLayoutManagerImpl2;
                    objOnMinimized10 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized10);
                } else {
                    viewPager2LinearLayoutManagerImpl = viewPager2LinearLayoutManagerImpl2;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6 = (getSupportedHighSpeedResolutionsFor) objOnMinimized10;
                Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized11 == onwarmupcompleted3.onExtraCallback()) {
                    onextracallback2 = onextracallback3;
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted2);
                    int i21 = onWarmupCompleted + 89;
                    IAuthTabCallback = i21 % 128;
                    int i22 = i21 % 2;
                    objOnMinimized11 = getsupportedhighspeedresolutionsforOnWarmupCompleted2;
                } else {
                    onextracallback2 = onextracallback3;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7 = (getSupportedHighSpeedResolutionsFor) objOnMinimized11;
                Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized12 == onwarmupcompleted3.onExtraCallback()) {
                    getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor7;
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted3);
                    objOnMinimized12 = getsupportedhighspeedresolutionsforOnWarmupCompleted3;
                } else {
                    getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor7;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8 = (getSupportedHighSpeedResolutionsFor) objOnMinimized12;
                Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized13 == onwarmupcompleted3.onExtraCallback()) {
                    getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor8;
                    objOnMinimized13 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized13);
                } else {
                    getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor8;
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9 = (getSupportedHighSpeedResolutionsFor) objOnMinimized13;
                Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized14 == onwarmupcompleted3.onExtraCallback()) {
                    int i23 = onWarmupCompleted + 121;
                    IAuthTabCallback = i23 % 128;
                    int i24 = i23 % 2;
                    getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor6;
                    objOnMinimized14 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized14);
                } else {
                    getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor6;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10 = (getSupportedHighSpeedResolutionsFor) objOnMinimized14;
                String strAccess000 = access000(getsupportedhighspeedresolutionsfor5);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strAccess000);
                Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnNavigationEvent3 | zOnNavigationEvent2) || objOnMinimized15 == onwarmupcompleted3.onExtraCallback()) {
                    if (setcontentinsetsrelative3 != null) {
                        z = true;
                        if (setcontentinsetsrelative3.IAuthTabCallbackDefault()) {
                            z2 = true;
                            objOnMinimized15 = Boolean.valueOf(z2);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized15);
                        }
                    } else {
                        z = true;
                    }
                    if ((camera2CameraMetadataExternalSyntheticLambda13 == null || camera2CameraMetadataExternalSyntheticLambda13.IAuthTabCallbackDefault() != z) && !Intrinsics.areEqual(access000(getsupportedhighspeedresolutionsfor5), str)) {
                        z2 = false;
                    }
                    objOnMinimized15 = Boolean.valueOf(z2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized15);
                }
                float f = ((Boolean) objOnMinimized15).booleanValue() ? 1.0f : 0.0f;
                Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized16 == onwarmupcompleted3.onExtraCallback()) {
                    objOnMinimized16 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(f);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized16);
                }
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized16;
                Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized17 == onwarmupcompleted3.onExtraCallback()) {
                    isQueryRefinementEnabled isqueryrefinementenabledOnWarmupCompleted = isIconified.onWarmupCompleted(f, 0.0f, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(isqueryrefinementenabledOnWarmupCompleted);
                    objOnMinimized17 = isqueryrefinementenabledOnWarmupCompleted;
                }
                final isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized17;
                Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized18 == onwarmupcompleted3.onExtraCallback()) {
                    objOnMinimized18 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsComponentKt$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i25 = 2 % 2;
                            int i26 = onExtraCallback + 73;
                            onWarmupCompleted = i26 % 128;
                            int i27 = i26 % 2;
                            Boolean boolValueOf = Boolean.valueOf(onPageCommitVisible.onNavigationEvent(setcontentinsetsrelative3, camera2CameraMetadataExternalSyntheticLambda13, getsupportedhighspeedresolutionsfor9));
                            int i28 = onWarmupCompleted + 39;
                            onExtraCallback = i28 % 128;
                            int i29 = i28 % 2;
                            return boolValueOf;
                        }
                    });
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized18);
                }
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized18;
                int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
                float fFloatValue = ((Float) onExtraCallback(1816216077, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutions}, iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1816216077)).floatValue();
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda14 = camera2CameraMetadataExternalSyntheticLambda13;
                Object objOnMinimized19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback2 || objOnMinimized19 == onwarmupcompleted3.onExtraCallback()) {
                    objOnMinimized19 = new onNavigationEvent(isqueryrefinementenabled, getsupportedhighspeedresolutions, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized19);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(Float.valueOf(fFloatValue), (Function2) objOnMinimized19, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(nativeAdsDto, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 >> 3) & 14);
                int i25 = (i2 >> 6) & 14;
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(adAsset, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i25);
                Object objOnMinimized20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized20 == onwarmupcompleted3.onExtraCallback()) {
                    objOnMinimized20 = new onExtraCallback(nativeAdsManager3, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutions, getsupportedhighspeedresolutionsfor9);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized20);
                    int i26 = IAuthTabCallback + 13;
                    onWarmupCompleted = i26 % 128;
                    int i27 = i26 % 2;
                }
                final onExtraCallback onextracallback4 = (onExtraCallback) objOnMinimized20;
                Unit unit = Unit.INSTANCE;
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nativeAdsManager3);
                Object objOnMinimized21 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback3 || objOnMinimized21 == onwarmupcompleted3.onExtraCallback()) {
                    objOnMinimized21 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsComponentKt$$ExternalSyntheticLambda2
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2) throws Throwable {
                            int i28 = 2 % 2;
                            int i29 = onExtraCallbackWithResult + 23;
                            onNavigationEvent = i29 % 128;
                            int i30 = i29 % 2;
                            decrementVideoUsage decrementvideousageOnWarmupCompleted = onPageCommitVisible.onWarmupCompleted(nativeAdsManager3, onextracallback4, (isInVideoUsage) obj2);
                            int i31 = onNavigationEvent + 39;
                            onExtraCallbackWithResult = i31 % 128;
                            int i32 = i31 % 2;
                            return decrementvideousageOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized21);
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(unit, (Function1) objOnMinimized21, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor5);
                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                setContentInsetsRelative setcontentinsetsrelative4 = setcontentinsetsrelative3;
                Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent4 | zOnNavigationEvent5) && !zOnExtraCallback4) {
                    int i28 = IAuthTabCallback + 79;
                    nativeAdsManager2 = nativeAdsManager3;
                    onWarmupCompleted = i28 % 128;
                    int i29 = i28 % 2;
                    if (objOnMinimized22 == onwarmupcompleted3.onExtraCallback()) {
                    }
                    isZslDisabledByByUserCaseConfig.onExtraCallback(adAsset, str, (Function2) objOnMinimized22, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i25);
                    boolean zAsInterface = asInterface((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2);
                    boolean zIAuthTabCallbackStub = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
                    boolean interfaceDescriptor = getInterfaceDescriptor(getsupportedhighspeedresolutionsfor3);
                    int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
                    Object[] objArr3 = {Boolean.valueOf(zAsInterface), Boolean.valueOf(zIAuthTabCallbackStub), Boolean.valueOf(interfaceDescriptor), Boolean.valueOf(((Boolean) onExtraCallback(-888111541, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor10}, iIAuthTabCallback2, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 888111545)).booleanValue())};
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized != onwarmupcompleted3.onExtraCallback()) {
                        onwarmupcompleted2 = null;
                        objOnMinimized = new onWarmupCompleted(onextracallback4, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    } else {
                        onwarmupcompleted2 = null;
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr3, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized2 == onwarmupcompleted3.onExtraCallback()) {
                        objOnMinimized2 = new IAuthTabCallback(onextracallback4, onwarmupcompleted2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(adAsset, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i25);
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback5 = onextracallback2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback5, 0.0f, 1, onwarmupcompleted2), onwarmupcompleted2, false, 3, onwarmupcompleted2);
                    NativeExtension nativeExtensionIAuthTabCallbackStub = adAsset.IAuthTabCallbackStub();
                    ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl3 = viewPager2LinearLayoutManagerImpl;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnWarmupCompleted.onExtraCallback(onPageSelected.onNavigationEvent(nativeExtensionIAuthTabCallbackStub == null ? nativeExtensionIAuthTabCallbackStub.onWarmupCompleted() : onwarmupcompleted2, nativeAdsDto.IAuthTabCallbackStub(), adAsset.onExtraCallbackWithResult().IAuthTabCallback(), viewPager2LinearLayoutManagerImpl3));
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnExtraCallback || objOnMinimized3 == onwarmupcompleted3.onExtraCallback()) {
                        objOnMinimized3 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsComponentKt$$ExternalSyntheticLambda3
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke(Object obj2) {
                                int i30 = 2 % 2;
                                int i31 = onExtraCallback + 115;
                                IAuthTabCallback = i31 % 128;
                                if (i31 % 2 != 0) {
                                    Object[] objArr4 = {isqueryrefinementenabled, (flipHorizontally) obj2};
                                    int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
                                    throw null;
                                }
                                Object[] objArr5 = {isqueryrefinementenabled, (flipHorizontally) obj2};
                                int iIAuthTabCallback4 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
                                Unit unit2 = (Unit) onPageCommitVisible.onExtraCallback(-1618943317, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr5, iIAuthTabCallback4, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1618943322);
                                int i32 = IAuthTabCallback + 53;
                                onExtraCallback = i32 % 128;
                                int i33 = i32 % 2;
                                return unit2;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized3);
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    JavaScriptReplyProxyImplExternalSyntheticLambda0 javaScriptReplyProxyImplExternalSyntheticLambda0 = JavaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallbackWithResult;
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback6 = QuirksExternalSyntheticBackport0.Companion;
                    objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized4 == onwarmupcompleted3.onExtraCallback()) {
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11 = getsupportedhighspeedresolutionsfor2;
                        objOnMinimized4 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsComponentKt$$ExternalSyntheticLambda4
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj2) {
                                int i30 = 2 % 2;
                                int i31 = onExtraCallbackWithResult + 103;
                                IAuthTabCallback = i31 % 128;
                                int i32 = i31 % 2;
                                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12 = getsupportedhighspeedresolutionsfor11;
                                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                if (i32 != 0) {
                                    return onPageCommitVisible.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor12, zBooleanValue);
                                }
                                onPageCommitVisible.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor12, zBooleanValue);
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onNavigationEvent(onextracallback6, 0.0f, (Function1) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 438);
                    objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized5 == onwarmupcompleted3.onExtraCallback()) {
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12 = getsupportedhighspeedresolutionsfor;
                        objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsComponentKt$$ExternalSyntheticLambda5
                            private static int onNavigationEvent = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj2) {
                                int i30 = 2 % 2;
                                int i31 = onWarmupCompleted + 31;
                                onNavigationEvent = i31 % 128;
                                if (i31 % 2 != 0) {
                                    onPageCommitVisible.onWarmupCompleted(getsupportedhighspeedresolutionsfor12, ((Boolean) obj2).booleanValue());
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                Unit unitOnWarmupCompleted = onPageCommitVisible.onWarmupCompleted(getsupportedhighspeedresolutionsfor12, ((Boolean) obj2).booleanValue());
                                int i32 = onWarmupCompleted + 107;
                                onNavigationEvent = i32 % 128;
                                int i33 = i32 % 2;
                                return unitOnWarmupCompleted;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent, 0.5f, (Function1) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432);
                    objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized6 == onwarmupcompleted3.onExtraCallback()) {
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor13 = getsupportedhighspeedresolutionsfor3;
                        objOnMinimized6 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsComponentKt$$ExternalSyntheticLambda6
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2) {
                                Unit unitIAuthTabCallback;
                                int i30 = 2 % 2;
                                int i31 = onExtraCallbackWithResult + 31;
                                onNavigationEvent = i31 % 128;
                                if (i31 % 2 != 0) {
                                    unitIAuthTabCallback = onPageCommitVisible.IAuthTabCallback(getsupportedhighspeedresolutionsfor13, ((Boolean) obj2).booleanValue());
                                    int i32 = 1 / 0;
                                } else {
                                    unitIAuthTabCallback = onPageCommitVisible.IAuthTabCallback(getsupportedhighspeedresolutionsfor13, ((Boolean) obj2).booleanValue());
                                }
                                int i33 = onNavigationEvent + 47;
                                onExtraCallbackWithResult = i33 % 128;
                                if (i33 % 2 == 0) {
                                    int i34 = 64 / 0;
                                }
                                return unitIAuthTabCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent2, 0.98f, (Function1) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432);
                    int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
                    int i30 = (i2 & 3670016) | (i2 & 112) | 12582912 | i20 | (i2 & 7168);
                    onwarmupcompleted = onwarmupcompleted2;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    i6 = iIntValue;
                    nativeAdsManager = nativeAdsManager2;
                    javaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnNavigationEvent3, nativeAdsDto, adAsset, nativeAdsManager2, ((Boolean) onExtraCallback(-777583491, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iIAuthTabCallback3, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 777583494)).booleanValue(), null, viewPager2LinearLayoutManagerImpl3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i30, 32);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (!Intrinsics.areEqual(adAsset, IAuthTabCallbackDefault((getSupportedHighSpeedResolutionsFor<NativeAdsDto.AdAsset>) getsupportedhighspeedresolutionsfor4))) {
                        onExtraCallback((getSupportedHighSpeedResolutionsFor<NativeAdsDto.AdAsset>) getsupportedhighspeedresolutionsfor4, adAsset);
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    onextracallback = onextracallback5;
                    viewPager2LinearLayoutManagerImpl2 = viewPager2LinearLayoutManagerImpl3;
                    setcontentinsetsrelative = setcontentinsetsrelative4;
                    camera2CameraMetadataExternalSyntheticLambda1 = camera2CameraMetadataExternalSyntheticLambda14;
                } else {
                    nativeAdsManager2 = nativeAdsManager3;
                }
                objOnMinimized22 = new onExtraCallbackWithResult(str, isqueryrefinementenabled, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutions, null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized22);
                isZslDisabledByByUserCaseConfig.onExtraCallback(adAsset, str, (Function2) objOnMinimized22, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i25);
                boolean zAsInterface2 = asInterface((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2);
                boolean zIAuthTabCallbackStub2 = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
                boolean interfaceDescriptor2 = getInterfaceDescriptor(getsupportedhighspeedresolutionsfor3);
                int iIAuthTabCallback22 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
                Object[] objArr32 = {Boolean.valueOf(zAsInterface2), Boolean.valueOf(zIAuthTabCallbackStub2), Boolean.valueOf(interfaceDescriptor2), Boolean.valueOf(((Boolean) onExtraCallback(-888111541, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor10}, iIAuthTabCallback22, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 888111545)).booleanValue())};
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized != onwarmupcompleted3.onExtraCallback()) {
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr32, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted3.onExtraCallback()) {
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(adAsset, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i25);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback52 = onextracallback2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback52, 0.0f, 1, onwarmupcompleted2), onwarmupcompleted2, false, 3, onwarmupcompleted2);
                NativeExtension nativeExtensionIAuthTabCallbackStub2 = adAsset.IAuthTabCallbackStub();
                ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl32 = viewPager2LinearLayoutManagerImpl;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0OnWarmupCompleted3.onExtraCallback(onPageSelected.onNavigationEvent(nativeExtensionIAuthTabCallbackStub2 == null ? nativeExtensionIAuthTabCallbackStub2.onWarmupCompleted() : onwarmupcompleted2, nativeAdsDto.IAuthTabCallbackStub(), adAsset.onExtraCallbackWithResult().IAuthTabCallback(), viewPager2LinearLayoutManagerImpl32));
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnExtraCallback) {
                    objOnMinimized3 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsComponentKt$$ExternalSyntheticLambda3
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj2) {
                            int i302 = 2 % 2;
                            int i31 = onExtraCallback + 115;
                            IAuthTabCallback = i31 % 128;
                            if (i31 % 2 != 0) {
                                Object[] objArr4 = {isqueryrefinementenabled, (flipHorizontally) obj2};
                                int iIAuthTabCallback32 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
                                throw null;
                            }
                            Object[] objArr5 = {isqueryrefinementenabled, (flipHorizontally) obj2};
                            int iIAuthTabCallback4 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
                            Unit unit2 = (Unit) onPageCommitVisible.onExtraCallback(-1618943317, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr5, iIAuthTabCallback4, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1618943322);
                            int i32 = IAuthTabCallback + 53;
                            onExtraCallback = i32 % 128;
                            int i33 = i32 % 2;
                            return unit2;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) objOnMinimized3);
                    component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback2);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult2.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    JavaScriptReplyProxyImplExternalSyntheticLambda0 javaScriptReplyProxyImplExternalSyntheticLambda02 = JavaScriptReplyProxyImplExternalSyntheticLambda0.onExtraCallbackWithResult;
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback62 = QuirksExternalSyntheticBackport0.Companion;
                    objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized4 == onwarmupcompleted3.onExtraCallback()) {
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent4 = onNavigationEvent(onextracallback62, 0.0f, (Function1) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 438);
                    objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized5 == onwarmupcompleted3.onExtraCallback()) {
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent22 = onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent4, 0.5f, (Function1) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432);
                    objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized6 == onwarmupcompleted3.onExtraCallback()) {
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent32 = onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent22, 0.98f, (Function1) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432);
                    int iIAuthTabCallback32 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
                    int i302 = (i2 & 3670016) | (i2 & 112) | 12582912 | i20 | (i2 & 7168);
                    onwarmupcompleted = onwarmupcompleted2;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    i6 = iIntValue;
                    nativeAdsManager = nativeAdsManager2;
                    javaScriptReplyProxyImplExternalSyntheticLambda02.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnNavigationEvent32, nativeAdsDto, adAsset, nativeAdsManager2, ((Boolean) onExtraCallback(-777583491, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iIAuthTabCallback32, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 777583494)).booleanValue(), null, viewPager2LinearLayoutManagerImpl32, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i302, 32);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (!Intrinsics.areEqual(adAsset, IAuthTabCallbackDefault((getSupportedHighSpeedResolutionsFor<NativeAdsDto.AdAsset>) getsupportedhighspeedresolutionsfor4))) {
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    onextracallback = onextracallback52;
                    viewPager2LinearLayoutManagerImpl2 = viewPager2LinearLayoutManagerImpl32;
                    setcontentinsetsrelative = setcontentinsetsrelative4;
                    camera2CameraMetadataExternalSyntheticLambda1 = camera2CameraMetadataExternalSyntheticLambda14;
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                final NativeAdsManager nativeAdsManager4 = nativeAdsManager;
                final int i31 = i6;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsComponentKt$$ExternalSyntheticLambda7
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i32 = 2 % 2;
                        int i33 = onExtraCallback + 57;
                        onNavigationEvent = i33 % 128;
                        int i34 = i33 % 2;
                        Unit unitIAuthTabCallback = onPageCommitVisible.IAuthTabCallback(onextracallback, nativeAdsDto, adAsset, nativeAdsManager4, setcontentinsetsrelative, camera2CameraMetadataExternalSyntheticLambda1, viewPager2LinearLayoutManagerImpl2, i31, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i35 = onExtraCallback + 113;
                        onNavigationEvent = i35 % 128;
                        if (i35 % 2 != 0) {
                            return unitIAuthTabCallback;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                });
            }
            return onwarmupcompleted;
        }
        int i32 = onWarmupCompleted + 83;
        IAuthTabCallback = i32 % 128;
        i15 = i32 % 2 != 0 ? i15 | 6208 : i15 | 24576;
        i2 = i15;
        i3 = iIntValue2 & 32;
        Object obj2 = null;
        if (i3 == 0) {
        }
        i5 = iIntValue2 & 64;
        int i182 = 1572864;
        if (i5 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i2) == 599186, i2 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return onwarmupcompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final float f, @NotNull final Function1<? super Boolean, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onWarmupCompleted + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-374058250, i, -1, "im.toss.ads_sdk.ui.compose.onImpressedChange (NativeAdsComponent.kt:206)");
        }
        final View view = (View) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
        if (((i & 896) ^ 384) > 256) {
            int i5 = onWarmupCompleted + 41;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1)) {
                z = (i & 384) == 256;
            }
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(view);
        boolean z2 = (((i & 112) ^ 48) > 32 && !(cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f) ^ true)) || (i & 48) == 32;
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(z | zOnExtraCallback | z2)) {
            int i7 = onWarmupCompleted + 11;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsComponentKt$$ExternalSyntheticLambda8
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i9 = 2 % 2;
                        int i10 = IAuthTabCallback + 49;
                        onWarmupCompleted = i10 % 128;
                        Object obj2 = null;
                        if (i10 % 2 == 0) {
                            onPageCommitVisible.onExtraCallback(function1, f, view, (Futures3) obj);
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitOnExtraCallback = onPageCommitVisible.onExtraCallback(function1, f, view, (Futures3) obj);
                        int i11 = onWarmupCompleted + 91;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 == 0) {
                            return unitOnExtraCallback;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) objOnMinimized);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i9 = IAuthTabCallback + 93;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i10 == 0) {
                throw null;
            }
        }
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    private static final Unit onWarmupCompleted(Function1 function1, float f, View view, Futures3 futures3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        boolean z = false;
        Rect rectOnWarmupCompleted = FuturesCallbackListener.onWarmupCompleted(futures3, false, 1, (Object) null);
        if (rectOnWarmupCompleted.onMinimized()) {
            int i2 = onWarmupCompleted + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(Boolean.FALSE);
            return Unit.INSTANCE;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            int i4 = IAuthTabCallback + 113;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                function1.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            }
            function1.invoke(Boolean.FALSE);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Rect rectIAuthTabCallback = rectOnWarmupCompleted.IAuthTabCallback(RectHelper_androidKt.onExtraCallback(rect));
        int iAsBinder = ((int) (futures3.asBinder() >> 32)) * ((int) futures3.asBinder());
        float fIAuthTabCallback_Parcel = (rectIAuthTabCallback.IAuthTabCallback_Parcel() - rectIAuthTabCallback.IAuthTabCallbackStubProxy()) * (rectIAuthTabCallback.IAuthTabCallbackDefault() - rectIAuthTabCallback.extraCallback());
        if (iAsBinder <= 0 || fIAuthTabCallback_Parcel <= 0.0f) {
            function1.invoke(Boolean.FALSE);
            return Unit.INSTANCE;
        }
        if (fIAuthTabCallback_Parcel / iAsBinder > f) {
            int i5 = IAuthTabCallback + 43;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    private static final decrementVideoUsage onNavigationEvent(NativeAdsManager nativeAdsManager, onExtraCallback onextracallback, isInVideoUsage isinvideousage) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1941440202, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1941440172, new Object[]{nativeAdsManager, onextracallback}, iOnExtraCallbackWithResult);
        asInterface asinterface = new asInterface(nativeAdsManager, onextracallback);
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 59 / 0;
        }
        return asinterface;
    }

    private static final NativeAdsDto.AdAsset IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<NativeAdsDto.AdAsset> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 83;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return adAsset;
        }
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<NativeAdsDto.AdAsset> getsupportedhighspeedresolutionsfor, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(adAsset);
        int i4 = onWarmupCompleted + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
    }

    private static final String access000(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        int i5 = onWarmupCompleted + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
    }

    private static final boolean getInterfaceDescriptor(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onWarmupCompleted + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final void access100(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
    }

    private static final boolean IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            bool.booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = onWarmupCompleted + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = IAuthTabCallback + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean asInterface(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallback + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void onTransact(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onTransact(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallback + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final void IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
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

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        boolean zBooleanValue;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            zBooleanValue = bool.booleanValue();
            int i4 = 28 / 0;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        int i5 = IAuthTabCallback + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void asBinder(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        int i4 = onWarmupCompleted + 103;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0 = (TextFieldPressGestureFilterKtExternalSyntheticLambda0) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 109;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return textFieldPressGestureFilterKtExternalSyntheticLambda0;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto nativeAdsDto = (NativeAdsDto) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return nativeAdsDto;
    }

    private static final NativeAdsDto.AdAsset IAuthTabCallbackDefault(CameraPresenceProviderExternalSyntheticLambda6<NativeAdsDto.AdAsset> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return adAsset;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(isQueryRefinementEnabled isqueryrefinementenabled, flipHorizontally fliphorizontally) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onExtraCallback(-1618943317, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{isqueryrefinementenabled, fliphorizontally}, iIAuthTabCallback, iIAuthTabCallback3, 1618943322);
    }

    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull NativeAdsDto nativeAdsDto, @NotNull NativeAdsDto.AdAsset adAsset, @NotNull NativeAdsManager nativeAdsManager, @Nullable setContentInsetsRelative setcontentinsetsrelative, @Nullable Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @Nullable ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, nativeAdsDto, adAsset, nativeAdsManager, setcontentinsetsrelative, camera2CameraMetadataExternalSyntheticLambda1, viewPager2LinearLayoutManagerImpl, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        onExtraCallback(529280377, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr, iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -529280371);
    }

    private static final boolean access100(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return ((Boolean) onExtraCallback(-888111541, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback, iIAuthTabCallback3, 888111545)).booleanValue();
    }

    private static final float IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return ((Float) onExtraCallback(1816216077, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{getsupportedhighspeedresolutions}, iIAuthTabCallback, iIAuthTabCallback3, -1816216077)).floatValue();
    }

    private static final boolean onExtraCallback(setContentInsetsRelative setcontentinsetsrelative, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return ((Boolean) onExtraCallback(626079886, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{setcontentinsetsrelative, camera2CameraMetadataExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor}, iIAuthTabCallback, iIAuthTabCallback3, -626079879)).booleanValue();
    }

    private static final boolean onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return ((Boolean) onExtraCallback(-777583491, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iIAuthTabCallback, iIAuthTabCallback3, 777583494)).booleanValue();
    }

    private static final TextFieldPressGestureFilterKtExternalSyntheticLambda0 IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends TextFieldPressGestureFilterKtExternalSyntheticLambda0> cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (TextFieldPressGestureFilterKtExternalSyntheticLambda0) onExtraCallback(15369880, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iIAuthTabCallback, iIAuthTabCallback3, -15369872);
    }

    private static final NativeAdsDto IAuthTabCallbackStub(CameraPresenceProviderExternalSyntheticLambda6<NativeAdsDto> cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (NativeAdsDto) onExtraCallback(-1013784112, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iIAuthTabCallback, iIAuthTabCallback3, 1013784114);
    }

    private static final Unit IAuthTabCallbackStubProxy(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onExtraCallback(-397076630, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr, iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 397076631);
    }

    private static final Unit access000(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onExtraCallback(671396607, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr, iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -671396598);
    }
}
