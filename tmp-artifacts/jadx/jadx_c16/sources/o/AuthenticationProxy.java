package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.horcrux.svg.SvgPackage;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.features.home.feature.home_asset.R;
import im.toss.features.home.feature.home_asset.edit.HomeAssetEditV2ScreenKt$;
import im.toss.features.home.feature.home_asset.edit.HomeAssetEditV2ViewModel;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.Interruptable;
import o.Interruptable$IAuthTabCallback;
import o.QuirkSettingsLoader;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.drawEmptyStars;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AuthenticationProxy {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static long onWarmupCompleted = 1511365330560733301L;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        String str;
        int i7 = ~i3;
        int i8 = ~(i7 | i4);
        int i9 = ~i4;
        int i10 = ~(i9 | i3);
        int i11 = ~((~i2) | i4);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i9)) | i11;
        int i14 = i4 + i3 + i5 + ((-1232316077) * i) + ((-263306238) * i6);
        int i15 = i14 * i14;
        int i16 = (((-69115011) * i4) - 1785593856) + (933837065 * i3) + (763021048 * i8) + (1765973124 * i12) + ((-1765973124) * i13) + (1696858112 * i5) + (1319895040 * i) + (1514668032 * i6) + (1334968320 * i15);
        int i17 = ((i4 * (-2046307327)) - 1888090795) + (i3 * (-2046308995)) + (i8 * 1112) + (i12 * (-556)) + (i13 * 556) + ((-2046307883) * i5) + (1526207759 * i) + ((-1095616598) * i6) + (i15 * 1719271424);
        boolean z = false;
        switch (i16 + (i17 * i17 * 2111700992)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                registerSceneDialogFactory registerscenedialogfactory = (registerSceneDialogFactory) objArr[0];
                findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
                Map map = (Map) objArr[2];
                HomeAssetEditV2ViewModel homeAssetEditV2ViewModel = (HomeAssetEditV2ViewModel) objArr[3];
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[4];
                int i18 = 2 % 2;
                RVManifestIProxyManifest.IAuthTabCallback(registerscenedialogfactory, (List) null, 1, (Object) null);
                if (map != null) {
                    int i19 = onNavigationEvent + 119;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    Object[] objArr2 = new Object[1];
                    a(new char[]{15126, 15204, 59189, 19497, 12359, 52695, 26323, 53209, 38528, 5382, 13556, 32234}, Color.blue(0) + 1, objArr2);
                    str = (String) map.get(((String) objArr2[0]).intern());
                } else {
                    str = null;
                }
                registerscenedialogfactory.onExtraCallbackWithResult(findresandmsg, str);
                registerscenedialogfactory.onExtraCallbackWithResult(map);
                registerscenedialogfactory.asInterface();
                if (onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).IAuthTabCallback().onExtraCallbackWithResult()) {
                    Interruptable.onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback();
                    Interruptable interruptable = (Interruptable) HomeAssetEditV2ViewModel.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{homeAssetEditV2ViewModel}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -57832776, 57832777, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                    registerscenedialogfactory.onWarmupCompleted(onnavigationeventOnExtraCallback, interruptable != null ? interruptable.IAuthTabCallback() : null);
                    int i21 = onNavigationEvent + 121;
                    IAuthTabCallback = i21 % 128;
                    int i22 = i21 % 2;
                }
                return Unit.INSTANCE;
            case 6:
                registerSceneDialogFactory registerscenedialogfactory2 = (registerSceneDialogFactory) objArr[0];
                HomeAssetEditV2ViewModel homeAssetEditV2ViewModel2 = (HomeAssetEditV2ViewModel) objArr[1];
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[2];
                Interruptable$IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = (Interruptable$IAuthTabCallback.onExtraCallbackWithResult) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                int i23 = 2 % 2;
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                Interruptable.onNavigationEvent onnavigationevent = Interruptable.onNavigationEvent.AUTOMATIC;
                Interruptable interruptable2 = (Interruptable) HomeAssetEditV2ViewModel.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{homeAssetEditV2ViewModel2}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -57832776, 57832777, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                if (interruptable2 != null) {
                    int i24 = onNavigationEvent + 29;
                    IAuthTabCallback = i24 % 128;
                    int i25 = i24 % 2;
                    if (interruptable2.onExtraCallback()) {
                        int i26 = onNavigationEvent;
                        int i27 = i26 + 65;
                        IAuthTabCallback = i27 % 128;
                        int i28 = i27 % 2;
                        int i29 = i26 + 37;
                        IAuthTabCallback = i29 % 128;
                        int i30 = i29 % 2;
                        z = true;
                    }
                }
                registerscenedialogfactory2.onExtraCallbackWithResult(onextracallbackwithresult, iIntValue, onnavigationevent, z, onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda62).onExtraCallback());
                return Unit.INSTANCE;
            case 7:
                return IAuthTabCallbackStub(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Context context, registerSceneDialogFactory registerscenedialogfactory, SessionTrackerb sessionTrackerb, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 57;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(context, registerscenedialogfactory, sessionTrackerb, cameraPresenceProviderExternalSyntheticLambda6, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(context, registerscenedialogfactory, sessionTrackerb, cameraPresenceProviderExternalSyntheticLambda6, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Resources resources, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, registerSceneDialogFactory registerscenedialogfactory, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(resources, getsupportedhighspeedresolutionsfor, registerscenedialogfactory, cameraPresenceProviderExternalSyntheticLambda6, homeAssetEditV2ViewModel, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Interruptable$IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 59;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(registerscenedialogfactory, homeAssetEditV2ViewModel, cameraPresenceProviderExternalSyntheticLambda6, onextracallbackwithresult, i);
        }
        onExtraCallback(registerscenedialogfactory, homeAssetEditV2ViewModel, cameraPresenceProviderExternalSyntheticLambda6, onextracallbackwithresult, i);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, getLocalPrivacyDialog getlocalprivacydialog, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, setUseCaseAttached setusecaseattached, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(registerscenedialogfactory, homeAssetEditV2ViewModel, getlocalprivacydialog, cameraPresenceProviderExternalSyntheticLambda6, setusecaseattached, i);
        int i5 = onNavigationEvent + 117;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        HomeAssetEditV2ViewModel homeAssetEditV2ViewModel = (HomeAssetEditV2ViewModel) objArr[0];
        registerSceneDialogFactory registerscenedialogfactory = (registerSceneDialogFactory) objArr[1];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[2];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[3];
        View view = (View) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        String str = (String) objArr[7];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(homeAssetEditV2ViewModel, registerscenedialogfactory, findresandmsg, cameraPresenceProviderExternalSyntheticLambda6, view, iIntValue, iIntValue2, str);
        }
        IAuthTabCallback(homeAssetEditV2ViewModel, registerscenedialogfactory, findresandmsg, cameraPresenceProviderExternalSyntheticLambda6, view, iIntValue, iIntValue2, str);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        registerSceneDialogFactory registerscenedialogfactory = (registerSceneDialogFactory) objArr[0];
        SessionTrackerb sessionTrackerb = (SessionTrackerb) objArr[1];
        Context context = (Context) objArr[2];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, 2128777309, -2128777309, iIAuthTabCallback2, new Object[]{registerscenedialogfactory, sessionTrackerb, context, cameraPresenceProviderExternalSyntheticLambda6}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        }
        Object[] objArr2 = {registerscenedialogfactory, sessionTrackerb, context, cameraPresenceProviderExternalSyntheticLambda6};
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, registerSceneDialogFactory registerscenedialogfactory, SessionTrackerb sessionTrackerb, Map map, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 29;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(homeAssetEditV2ViewModel, registerscenedialogfactory, sessionTrackerb, map, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 41;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1768479047, 1768479051, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        int i5 = IAuthTabCallback + 57;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static final /* synthetic */ boolean onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        int i5 = onNavigationEvent + 33;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return zOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(context);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(context);
        int i3 = onNavigationEvent + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(registerscenedialogfactory, homeAssetEditV2ViewModel, cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = onNavigationEvent + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Interruptable$IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 1;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {registerscenedialogfactory, homeAssetEditV2ViewModel, cameraPresenceProviderExternalSyntheticLambda6, onextracallbackwithresult, Integer.valueOf(i)};
        if (i4 != 0) {
            return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -361018572, 361018578, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        }
        int i5 = 16 / 0;
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -361018572, 361018578, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, Interruptable$IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(registerscenedialogfactory, homeAssetEditV2ViewModel, onextracallbackwithresult, i);
        int i5 = onNavigationEvent + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(getsupportedhighspeedresolutionsfor, z);
        int i4 = onNavigationEvent + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, registerSceneDialogFactory registerscenedialogfactory, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            onWarmupCompleted(homeAssetEditV2ViewModel, registerscenedialogfactory, i, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(homeAssetEditV2ViewModel, registerscenedialogfactory, i, i2);
        int i5 = IAuthTabCallback + 39;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onNavigationEvent(HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, registerSceneDialogFactory registerscenedialogfactory, SessionTrackerb sessionTrackerb, Map map, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 85;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(homeAssetEditV2ViewModel, registerscenedialogfactory, sessionTrackerb, map, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 79;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, findResAndMsg findresandmsg, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, View view, String str, Interruptable$IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {registerscenedialogfactory, homeAssetEditV2ViewModel, findresandmsg, cameraPresenceProviderExternalSyntheticLambda6, view, str, onextracallbackwithresult, Integer.valueOf(i)};
            return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1736130393, 1736130395, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        }
        Object[] objArr2 = {registerscenedialogfactory, homeAssetEditV2ViewModel, findresandmsg, cameraPresenceProviderExternalSyntheticLambda6, view, str, onextracallbackwithresult, Integer.valueOf(i)};
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(registerSceneDialogFactory registerscenedialogfactory, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(registerscenedialogfactory, cameraPresenceProviderExternalSyntheticLambda6, homeAssetEditV2ViewModel, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 85;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ closeGetAuthorize onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        closeGetAuthorize closegetauthorizeOnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = IAuthTabCallback + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return closegetauthorizeOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        registerSceneDialogFactory registerscenedialogfactory = (registerSceneDialogFactory) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        Map map = (Map) objArr[2];
        HomeAssetEditV2ViewModel homeAssetEditV2ViewModel = (HomeAssetEditV2ViewModel) objArr[3];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[4];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, -623543758, 623543763, iIAuthTabCallback2, new Object[]{registerscenedialogfactory, findresandmsg, map, homeAssetEditV2ViewModel, cameraPresenceProviderExternalSyntheticLambda6}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        int i4 = IAuthTabCallback + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getLocalPrivacyDialog getlocalprivacydialog, findResAndMsg findresandmsg, Resources resources, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 67;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(registerscenedialogfactory, homeAssetEditV2ViewModel, cameraPresenceProviderExternalSyntheticLambda6, getlocalprivacydialog, findresandmsg, resources, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 3;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, Interruptable.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(registerscenedialogfactory, homeAssetEditV2ViewModel, onnavigationevent);
        int i4 = onNavigationEvent + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Map<String, String> $params;
        final /* synthetic */ HomeAssetEditV2ViewModel $vm;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, Map<String, String> map, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$vm = homeAssetEditV2ViewModel;
            this.$params = map;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$vm, this.$params, access13800Var);
            int i2 = onNavigationEvent + 57;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 14 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            HomeAssetEditV2ViewModel homeAssetEditV2ViewModel = this.$vm;
            Map<String, String> mapOnNavigationEvent = this.$params;
            if (mapOnNavigationEvent == null) {
                mapOnNavigationEvent = access8100.onNavigationEvent();
            }
            homeAssetEditV2ViewModel.onWarmupCompleted(mapOnNavigationEvent);
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 65;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 17;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 3;
        }
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 49;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 45812), 85 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 21232 - TextUtils.indexOf((CharSequence) "", '0'), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getPressedStateDuration() >> 16)), TextUtils.indexOf("", "", 0, 0) + 19, TextUtils.indexOf((CharSequence) "", '0') + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i8 = $11 + 109;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, Interruptable$IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, int i) {
        boolean z;
        Interruptable.onNavigationEvent onnavigationeventIAuthTabCallback;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Interruptable interruptable = (Interruptable) HomeAssetEditV2ViewModel.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{homeAssetEditV2ViewModel}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -57832776, 57832777, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        if (interruptable != null) {
            int i3 = onNavigationEvent + 69;
            IAuthTabCallback = i3 % 128;
            z = true;
            if (i3 % 2 == 0 ? !interruptable.onExtraCallback() : interruptable.onExtraCallback()) {
                z = false;
            }
        }
        Interruptable interruptable2 = (Interruptable) HomeAssetEditV2ViewModel.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{homeAssetEditV2ViewModel}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -57832776, 57832777, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        if (interruptable2 != null) {
            int i4 = onNavigationEvent + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                onnavigationeventIAuthTabCallback = interruptable2.IAuthTabCallback();
                int i5 = 37 / 0;
            } else {
                onnavigationeventIAuthTabCallback = interruptable2.IAuthTabCallback();
            }
            int i6 = onNavigationEvent + 45;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            onnavigationeventIAuthTabCallback = null;
        }
        registerSceneDialogFactory.onNavigationEvent(new Object[]{registerscenedialogfactory, onextracallbackwithresult, Integer.valueOf(i), Boolean.valueOf(z), onnavigationeventIAuthTabCallback}, 195165043, -195165041, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 89;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, registerSceneDialogFactory registerscenedialogfactory, int i, int i2) {
        int i3 = 2 % 2;
        Object[] objArr = {homeAssetEditV2ViewModel, Integer.valueOf(i), Integer.valueOf(i2), new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda3(registerscenedialogfactory, homeAssetEditV2ViewModel)};
        HomeAssetEditV2ViewModel.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), objArr, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 949306159, -949306155, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            hasVaryAll.IAuthTabCallback(context);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (activityIAuthTabCallback != null) {
            activityIAuthTabCallback.finish();
            int i3 = IAuthTabCallback + 59;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 93;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String strOnNavigationEvent;
        registerSceneDialogFactory registerscenedialogfactory = (registerSceneDialogFactory) objArr[0];
        SessionTrackerb sessionTrackerb = (SessionTrackerb) objArr[1];
        Context context = (Context) objArr[2];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        registerscenedialogfactory.onTransact();
        Interruptable.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).onNavigationEvent();
        if (onwarmupcompletedOnNavigationEvent != null) {
            int i4 = IAuthTabCallback + 109;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            strOnNavigationEvent = onwarmupcompletedOnNavigationEvent.onNavigationEvent();
        } else {
            strOnNavigationEvent = null;
        }
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerb, context, strOnNavigationEvent, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Context context, registerSceneDialogFactory registerscenedialogfactory, SessionTrackerb sessionTrackerb, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onNavigationEvent + 35;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            String strOnWarmupCompleted = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 3;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1303761907, i, -1, "im.toss.features.home.feature.home_asset.edit.HomeAssetEditV2Screen.<anonymous> (HomeAssetEditV2Screen.kt:96)");
                    strOnWarmupCompleted.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1303761907, i, -1, "im.toss.features.home.feature.home_asset.edit.HomeAssetEditV2Screen.<anonymous> (HomeAssetEditV2Screen.kt:96)");
            }
            Interruptable.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).onNavigationEvent();
            if (onwarmupcompletedOnNavigationEvent != null) {
                strOnWarmupCompleted = onwarmupcompletedOnNavigationEvent.onWarmupCompleted();
            } else {
                int i6 = IAuthTabCallback + 37;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda1(context);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Function0 function0 = (Function0) objOnMinimized;
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(registerscenedialogfactory);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(sessionTrackerb);
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnExtraCallback2 | zOnExtraCallback3 | zOnExtraCallback4 | zOnNavigationEvent) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda2(registerscenedialogfactory, sessionTrackerb, context, cameraPresenceProviderExternalSyntheticLambda6);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            showErrorTipDialog.onWarmupCompleted(strOnWarmupCompleted, function0, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i8 = IAuthTabCallback + 73;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i9 = 1 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, Interruptable.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        registerscenedialogfactory.onExtraCallback(onnavigationevent);
        homeAssetEditV2ViewModel.onExtraCallback(onnavigationevent);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 61;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b9, code lost:
    
        if (r2.onExtraCallback() == true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, getLocalPrivacyDialog getlocalprivacydialog, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, setUseCaseAttached setusecaseattached, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 75;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Interruptable$IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = (Interruptable$IAuthTabCallback.onExtraCallbackWithResult) closeGetAuthorize.onNavigationEvent(new Object[]{onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6), Integer.valueOf(i)}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1230949627, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1230949627, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
        if (onextracallbackwithresult == null) {
            int i5 = IAuthTabCallback + 121;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            Unit unit = Unit.INSTANCE;
            int i7 = onNavigationEvent + 95;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
        int iOnNavigationEvent = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).onNavigationEvent(onextracallbackwithresult.IAuthTabCallback());
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        if (((Boolean) Interruptable$IAuthTabCallback.onExtraCallbackWithResult.onExtraCallback(-962656365, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{onextracallbackwithresult}, 962656365)).booleanValue()) {
            Interruptable interruptable = (Interruptable) HomeAssetEditV2ViewModel.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{homeAssetEditV2ViewModel}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -57832776, 57832777, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            boolean z = false;
            if (interruptable != null) {
                int i9 = IAuthTabCallback + 67;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    if (!interruptable.onExtraCallback()) {
                    }
                    z = true;
                }
                int i10 = IAuthTabCallback + 27;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 3 % 4;
                }
                z = true;
            }
            registerscenedialogfactory.IAuthTabCallback(onextracallbackwithresult, iOnNavigationEvent, z, onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback());
            homeAssetEditV2ViewModel.IAuthTabCallback(onextracallbackwithresult);
            getlocalprivacydialog.IAuthTabCallback(setusecaseattached.onExtraCallback());
        }
        return Unit.INSTANCE;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ String $resultMessage;
        final /* synthetic */ View $view;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(View view, String str, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$view = view;
            this.$resultMessage = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$view, this.$resultMessage, access13800Var);
            int i2 = onExtraCallbackWithResult + 35;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 5;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 60 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            this.$view.announceForAccessibility(this.$resultMessage);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean z;
        registerSceneDialogFactory registerscenedialogfactory = (registerSceneDialogFactory) objArr[0];
        HomeAssetEditV2ViewModel homeAssetEditV2ViewModel = (HomeAssetEditV2ViewModel) objArr[1];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[2];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[3];
        View view = (View) objArr[4];
        String str = (String) objArr[5];
        Interruptable$IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = (Interruptable$IAuthTabCallback.onExtraCallbackWithResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Interruptable interruptable = (Interruptable) HomeAssetEditV2ViewModel.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{homeAssetEditV2ViewModel}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -57832776, 57832777, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        if (interruptable != null) {
            int i2 = onNavigationEvent + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (interruptable.onExtraCallback()) {
                int i4 = onNavigationEvent + 25;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
        }
        registerSceneDialogFactory.onNavigationEvent(new Object[]{registerscenedialogfactory, onextracallbackwithresult, Integer.valueOf(iIntValue), Boolean.valueOf(z), onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback()}, 195165043, -195165041, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(view, str, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, registerSceneDialogFactory registerscenedialogfactory, findResAndMsg findresandmsg, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, View view, int i, int i2, String str) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = {homeAssetEditV2ViewModel, Integer.valueOf(i), Integer.valueOf(i2), new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda17(registerscenedialogfactory, homeAssetEditV2ViewModel, findresandmsg, cameraPresenceProviderExternalSyntheticLambda6, view, str)};
        HomeAssetEditV2ViewModel.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), objArr, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 949306159, -949306155, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086 A[PHI: r0 r2
      0x0086: PHI (r0v7 int) = (r0v5 int), (r0v6 int), (r0v9 int) binds: [B:8:0x0079, B:10:0x0080, B:5:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r2v4 o.Interruptable$onNavigationEvent) = 
      (r2v2 o.Interruptable$onNavigationEvent)
      (r2v3 o.Interruptable$onNavigationEvent)
      (r2v6 o.Interruptable$onNavigationEvent)
     binds: [B:8:0x0079, B:10:0x0080, B:5:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007b A[PHI: r0 r2 r11
      0x007b: PHI (r0v6 int) = (r0v5 int), (r0v9 int) binds: [B:8:0x0079, B:5:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r2v3 o.Interruptable$onNavigationEvent) = (r2v2 o.Interruptable$onNavigationEvent), (r2v6 o.Interruptable$onNavigationEvent) binds: [B:8:0x0079, B:5:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r11v3 o.Interruptable) = (r11v2 o.Interruptable), (r11v10 o.Interruptable) binds: [B:8:0x0079, B:5:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Interruptable$IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, int i) {
        int iOnNavigationEvent;
        Interruptable.onNavigationEvent onnavigationevent;
        Interruptable interruptable;
        int i2;
        Interruptable.onNavigationEvent onnavigationevent2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 105;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            iOnNavigationEvent = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).onNavigationEvent(onextracallbackwithresult.IAuthTabCallback());
            onnavigationevent = Interruptable.onNavigationEvent.MANUAL;
            interruptable = (Interruptable) HomeAssetEditV2ViewModel.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{homeAssetEditV2ViewModel}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -57832776, 57832777, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            int i5 = 35 / 0;
            if (interruptable != null) {
                if (interruptable.onExtraCallback()) {
                    i2 = iOnNavigationEvent;
                    onnavigationevent2 = onnavigationevent;
                    z = true;
                } else {
                    i2 = iOnNavigationEvent;
                    z = false;
                    onnavigationevent2 = onnavigationevent;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            iOnNavigationEvent = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).onNavigationEvent(onextracallbackwithresult.IAuthTabCallback());
            onnavigationevent = Interruptable.onNavigationEvent.MANUAL;
            interruptable = (Interruptable) HomeAssetEditV2ViewModel.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{homeAssetEditV2ViewModel}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -57832776, 57832777, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            if (interruptable != null) {
            }
        }
        registerscenedialogfactory.onExtraCallbackWithResult(onextracallbackwithresult, i2, onnavigationevent2, z, onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 55;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $hasAnnounced$delegate;
        final /* synthetic */ Resources $resources;
        final /* synthetic */ View $view;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(View view, Resources resources, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$view = view;
            this.$resources = resources;
            this.$hasAnnounced$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$view, this.$resources, this.$hasAnnounced$delegate, access13800Var);
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onextracallbackCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[PHI: r1
          0x0032: PHI (r1v10 java.lang.Object) = (r1v4 java.lang.Object), (r1v11 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
          0x0024: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 17 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (!AuthenticationProxy.onExtraCallback(this.$hasAnnounced$delegate)) {
                        AuthenticationProxy.onExtraCallbackWithResult(this.$hasAnnounced$delegate, true);
                        this.label = 1;
                        if (formatMsgs.onWarmupCompleted(300L, this) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                this.$view.announceForAccessibility(this.$resources.getString(R.string.home_v2_feature_home_asset_edit_v2_accessibility_display_button));
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
                this.$view.announceForAccessibility(this.$resources.getString(R.string.home_v2_feature_home_asset_edit_v2_accessibility_display_button));
            }
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    private static final Unit onWarmupCompleted(Resources resources, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, registerSceneDialogFactory registerscenedialogfactory, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxy;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(199714087, i, -1, "im.toss.features.home.feature.home_asset.edit.HomeAssetEditV2Screen.<anonymous>.<anonymous>.<anonymous> (HomeAssetEditV2Screen.kt:211)");
        }
        View view = (View) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
        Unit unit = Unit.INSTANCE;
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(view);
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(resources);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(!(zOnExtraCallback | zOnExtraCallback2)) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new onExtraCallback(view, resources, getsupportedhighspeedresolutionsfor, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            int i3 = onNavigationEvent + 107;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6);
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = YuvImageOnePixelShiftQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion);
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1333791028, true, new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda15(registerscenedialogfactory, cameraPresenceProviderExternalSyntheticLambda6, homeAssetEditV2ViewModel), cameraCaptureResultEmptyCameraCaptureResult, 54);
        if (!onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).IAuthTabCallback().onNavigationEvent() || onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).IAuthTabCallback().onExtraCallback() <= 0) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1154218422);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            encoderProfilesProxyVideoProfileProxy = null;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1154002849);
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-1471391531, true, new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda16(cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            encoderProfilesProxyVideoProfileProxy = encoderProfilesProxyVideoProfileProxyOnExtraCallback2;
        }
        u1.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, (u2) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, encoderProfilesProxyVideoProfileProxy, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 4026);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallback + 77;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 == 0) {
                throw null;
            }
        }
        return unit;
    }

    private static final Unit onNavigationEvent(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        Interruptable.onNavigationEvent onnavigationeventIAuthTabCallback;
        int i = 2 % 2;
        Interruptable.onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback();
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Interruptable interruptable = (Interruptable) HomeAssetEditV2ViewModel.onNavigationEvent(iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{homeAssetEditV2ViewModel}, iOnExtraCallbackWithResult2, -57832776, 57832777, iOnExtraCallbackWithResult3);
        if (interruptable != null) {
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onnavigationeventIAuthTabCallback = interruptable.IAuthTabCallback();
        } else {
            onnavigationeventIAuthTabCallback = null;
        }
        registerscenedialogfactory.onNavigationEvent(onnavigationeventOnExtraCallback, onnavigationeventIAuthTabCallback);
        homeAssetEditV2ViewModel.asBinder();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(registerSceneDialogFactory registerscenedialogfactory, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        Object obj = null;
        if ((i & 6) == 0) {
            int i4 = onNavigationEvent + 77;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var);
                throw null;
            }
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i5 = onNavigationEvent + 113;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i7 = onNavigationEvent + 85;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 73;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1333791028, i2, -1, "im.toss.features.home.feature.home_asset.edit.HomeAssetEditV2Screen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeAssetEditV2Screen.kt:223)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1333791028, i2, -1, "im.toss.features.home.feature.home_asset.edit.HomeAssetEditV2Screen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeAssetEditV2Screen.kt:223)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_home_asset_edit_v2_cta_save, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Inline;
            boolean zOnWarmupCompleted = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).IAuthTabCallback().onWarmupCompleted();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(registerscenedialogfactory);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(homeAssetEditV2ViewModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnNavigationEvent | zOnExtraCallback2)) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda0(registerscenedialogfactory, homeAssetEditV2ViewModel, cameraPresenceProviderExternalSyntheticLambda6);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                    obj2 = externalSyntheticLambda0;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj2, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, zOnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 262);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = onNavigationEvent + 69;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 4 / 2;
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = onNavigationEvent + 121;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 4 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        boolean z = true;
        u3 u3Var = (u3) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                int i3 = IAuthTabCallback + 103;
                onNavigationEvent = i3 % 128;
                i = i3 % 2 == 0 ? 5 : 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            int i4 = onNavigationEvent + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallback + 47;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1471391531, iIntValue, -1, "im.toss.features.home.feature.home_asset.edit.HomeAssetEditV2Screen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeAssetEditV2Screen.kt:238)");
                    int i7 = 8 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1471391531, iIntValue, -1, "im.toss.features.home.feature.home_asset.edit.HomeAssetEditV2Screen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeAssetEditV2Screen.kt:238)");
                }
            }
            u3Var.onWarmupCompleted(DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.home_v2_feature_home_asset_edit_v2_cta_description, new Object[]{Integer.valueOf(onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).IAuthTabCallback().onExtraCallback())}, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, 0L, 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue << 15) & 458752, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0351  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getLocalPrivacyDialog getlocalprivacydialog, findResAndMsg findresandmsg, Resources resources, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        Object obj;
        Object obj2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        updateFocusedState updatefocusedstate;
        HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2;
        int i3;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        updateFocusedState updatefocusedstate2;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = IAuthTabCallback + 3;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1235115831, i2, -1, "im.toss.features.home.feature.home_asset.edit.HomeAssetEditV2Screen.<anonymous> (HomeAssetEditV2Screen.kt:109)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, deviceQuirksExternalSyntheticLambda0);
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
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout())) {
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
            HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda22 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport02);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i8 = onNavigationEvent + 1;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i10 = onNavigationEvent + 85;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
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
            showErrorTipDialog.onNavigationEvent(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, 0}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -413961684, 413961685, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
            Interruptable.onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback();
            Interruptable.onNavigationEvent onnavigationevent = Interruptable.onNavigationEvent.AUTOMATIC;
            int i11 = onnavigationeventOnExtraCallback == onnavigationevent ? 0 : 1;
            boolean z2 = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback() == onnavigationevent;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(registerscenedialogfactory);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(homeAssetEditV2ViewModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnExtraCallback | zOnExtraCallback2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda9(registerscenedialogfactory, homeAssetEditV2ViewModel);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            showErrorTipDialog.onExtraCallback(i11, z2, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, quirksExternalSyntheticBackport02, 1.0f, false, 2, (Object) null), 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i12 = onNavigationEvent + 41;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            int i14 = IAuthTabCallbackDefault.onNavigationEvent[onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback().ordinal()];
            if (i14 == 1) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(561455522);
                View view = (View) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
                closeGetAuthorize closegetauthorizeOnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(registerscenedialogfactory);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(homeAssetEditV2ViewModel);
                boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getlocalprivacydialog);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnExtraCallback3 | zOnExtraCallback4 | zOnExtraCallback5)) {
                    int i15 = onNavigationEvent + 93;
                    IAuthTabCallback = i15 % 128;
                    if (i15 % 2 != 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda10(registerscenedialogfactory, homeAssetEditV2ViewModel, getlocalprivacydialog, cameraPresenceProviderExternalSyntheticLambda6);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda10);
                        obj = externalSyntheticLambda10;
                    } else {
                        obj = objOnMinimized2;
                    }
                    Function2 function2 = (Function2) obj;
                    boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(homeAssetEditV2ViewModel);
                    boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(registerscenedialogfactory);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                    boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
                    boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(view);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnExtraCallback6 | zOnExtraCallback7 | zOnNavigationEvent2 | zOnExtraCallback8 | zOnExtraCallback9)) {
                        Object obj4 = objOnMinimized3;
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda11(homeAssetEditV2ViewModel, registerscenedialogfactory, findresandmsg, cameraPresenceProviderExternalSyntheticLambda6, view);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda11);
                            obj4 = externalSyntheticLambda11;
                        }
                        getBacktraceNote getbacktracenote = (getBacktraceNote) obj4;
                        boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(registerscenedialogfactory);
                        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                        boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(homeAssetEditV2ViewModel);
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(!(zOnExtraCallback10 | zOnNavigationEvent3 | zOnExtraCallback11))) {
                            HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda12 externalSyntheticLambda12 = new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda12(registerscenedialogfactory, homeAssetEditV2ViewModel, cameraPresenceProviderExternalSyntheticLambda6);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda12);
                            int i16 = IAuthTabCallback + 1;
                            onNavigationEvent = i16 % 128;
                            int i17 = i16 % 2;
                            obj2 = externalSyntheticLambda12;
                            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                            updatefocusedstate = null;
                            highSpeedResolverExternalSyntheticLambda2 = highSpeedResolverExternalSyntheticLambda22;
                            i3 = 3;
                            i4 = 2;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                            showErrorTipDialog.onWarmupCompleted(closegetauthorizeOnExtraCallbackWithResult, getlocalprivacydialog, function2, getbacktracenote, (Function2) obj2, cameraCaptureResultEmptyCameraCaptureResult, Interruptable.onWarmupCompleted.onExtraCallback | Interruptable.onExtraCallbackWithResult.IAuthTabCallback | Interruptable.onExtraCallback.IAuthTabCallback);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            Unit unit = Unit.INSTANCE;
                        } else {
                            int i18 = IAuthTabCallback + 23;
                            onNavigationEvent = i18 % 128;
                            int i19 = i18 % 2;
                            if (objOnMinimized4 != CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                obj2 = objOnMinimized4;
                            }
                            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                            updatefocusedstate = null;
                            highSpeedResolverExternalSyntheticLambda2 = highSpeedResolverExternalSyntheticLambda22;
                            i3 = 3;
                            i4 = 2;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                            showErrorTipDialog.onWarmupCompleted(closegetauthorizeOnExtraCallbackWithResult, getlocalprivacydialog, function2, getbacktracenote, (Function2) obj2, cameraCaptureResultEmptyCameraCaptureResult, Interruptable.onWarmupCompleted.onExtraCallback | Interruptable.onExtraCallbackWithResult.IAuthTabCallback | Interruptable.onExtraCallback.IAuthTabCallback);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
            } else {
                if (i14 != 2) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-397532498);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(564300795);
                closeGetAuthorize closegetauthorizeOnExtraCallbackWithResult2 = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6);
                boolean zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(registerscenedialogfactory);
                boolean zOnExtraCallback13 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(homeAssetEditV2ViewModel);
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnExtraCallback12 | zOnExtraCallback13 | zOnNavigationEvent4) || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized5 = new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda13(registerscenedialogfactory, homeAssetEditV2ViewModel, cameraPresenceProviderExternalSyntheticLambda6);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                }
                showErrorTipDialog.onWarmupCompleted(closegetauthorizeOnExtraCallbackWithResult2, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult, Interruptable.onWarmupCompleted.onExtraCallback | Interruptable.onExtraCallbackWithResult.IAuthTabCallback | Interruptable.onExtraCallback.IAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                Unit unit3 = Unit.INSTANCE;
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                highSpeedResolverExternalSyntheticLambda2 = highSpeedResolverExternalSyntheticLambda22;
                i4 = 2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                updatefocusedstate = null;
                i3 = 3;
            }
            boolean zOnExtraCallback14 = getlocalprivacydialog.onExtraCallback();
            Integer num = (Integer) getLocalPrivacyDialog.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 438852666, new Object[]{getlocalprivacydialog}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -438852664, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
            if (num != null) {
                updatefocusedstate2 = (Interruptable$IAuthTabCallback.onExtraCallbackWithResult) closeGetAuthorize.onNavigationEvent(new Object[]{onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6), Integer.valueOf(num.intValue())}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1230949627, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1230949627, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            } else {
                updatefocusedstate2 = updatefocusedstate;
            }
            showErrorTipDialog.onNavigationEvent(zOnExtraCallback14, updatefocusedstate2, getlocalprivacydialog.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult2, Interruptable$IAuthTabCallback.onExtraCallbackWithResult.onExtraCallback << i3);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                int i20 = onNavigationEvent + 97;
                IAuthTabCallback = i20 % 128;
                objOnMinimized6 = i20 % i4 != 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, updatefocusedstate, i3, updatefocusedstate) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, updatefocusedstate, i4, updatefocusedstate);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized6);
            }
            HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda23 = highSpeedResolverExternalSyntheticLambda2;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
            setVerticalGravity.onWarmupCompleted(onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).IAuthTabCallback().onExtraCallbackWithResult(), highSpeedResolverExternalSyntheticLambda23.onWarmupCompleted(quirksExternalSyntheticBackport0, onextracallbackwithresult.onWarmupCompleted()), ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(updatefocusedstate, 0.0f, i3, updatefocusedstate).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.onExtraCallback((updateFocusedState) null, (QuirkSettingsLoader.onWarmupCompleted) null, false, (Function1) null, 15, (Object) null)), ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(updatefocusedstate, 0.0f, i3, updatefocusedstate).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback((updateFocusedState) null, (QuirkSettingsLoader.onWarmupCompleted) null, false, (Function1) null, 15, (Object) null)), (String) null, ForwardingCameraControl.onExtraCallback(199714087, true, new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda14(resources, (getSupportedHighSpeedResolutionsFor) objOnMinimized6, registerscenedialogfactory, cameraPresenceProviderExternalSyntheticLambda6, homeAssetEditV2ViewModel), cameraCaptureResultEmptyCameraCaptureResult3, 54), cameraCaptureResultEmptyCameraCaptureResult, 200064, 16);
            if (onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize>) cameraPresenceProviderExternalSyntheticLambda6).IAuthTabCallbackStub()) {
                cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(163294337);
                drawFilledStars.onWarmupCompleted(highSpeedResolverExternalSyntheticLambda23.onWarmupCompleted(quirksExternalSyntheticBackport03, onextracallbackwithresult.onExtraCallback()), drawEmptyStars.onWarmupCompleted.Companion.IAuthTabCallback(), (drawEmptyStars.onNavigationEvent) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 12);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(163448531);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i21 = IAuthTabCallback + 79;
                onNavigationEvent = i21 % 128;
                int i22 = i21 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getLocalPrivacyDialog $listState;
        final /* synthetic */ HomeAssetEditV2ViewModel $vm;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(getLocalPrivacyDialog getlocalprivacydialog, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$listState = getlocalprivacydialog;
            this.$vm = homeAssetEditV2ViewModel;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$listState, this.$vm, access13800Var);
            int i2 = IAuthTabCallback + 91;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 103;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 37;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (!this.$listState.onExtraCallback()) {
                int i4 = onWarmupCompleted + 77;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    this.$vm.IAuthTabCallbackDefault();
                    throw null;
                }
                this.$vm.IAuthTabCallbackDefault();
            }
            Unit unit = Unit.INSTANCE;
            int i5 = onWarmupCompleted + 25;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[PHI: r0
      0x004e: PHI (r0v85 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v86 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0038, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r0
      0x003a: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v86 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0038, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, @NotNull registerSceneDialogFactory registerscenedialogfactory, @NotNull SessionTrackerb sessionTrackerb, @Nullable Map<String, String> map, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        HomeAssetEditV2ViewModel homeAssetEditV2ViewModel2;
        int i3;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        HomeAssetEditV2ViewModel homeAssetEditV2ViewModel3;
        Throwable th;
        int i5;
        boolean z2;
        int i6;
        HomeAssetEditV2ViewModel homeAssetEditV2ViewModel4;
        Unit unit;
        boolean zOnExtraCallback;
        int i7;
        boolean z3;
        Object objOnMinimized;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
        Object objOnMinimized2;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        findResAndMsg findresandmsg;
        boolean zOnExtraCallback2;
        boolean zOnExtraCallback3;
        boolean z4;
        boolean zOnNavigationEvent;
        boolean zOnExtraCallback4;
        Object objOnMinimized3;
        Unit unit2;
        HomeAssetEditV2ViewModel homeAssetEditV2ViewModel5;
        boolean z5;
        boolean zOnExtraCallback5;
        boolean zOnExtraCallback6;
        int i8;
        int i9 = 2 % 2;
        int i10 = IAuthTabCallback + 27;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(registerscenedialogfactory, "");
            Intrinsics.checkNotNullParameter(sessionTrackerb, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1201089264);
            if ((i & 41) == 0) {
                if ((i2 & 1) == 0) {
                    homeAssetEditV2ViewModel2 = homeAssetEditV2ViewModel;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(homeAssetEditV2ViewModel2)) {
                        i3 = 4;
                    }
                    i4 = i3 | i;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                } else {
                    homeAssetEditV2ViewModel2 = homeAssetEditV2ViewModel;
                }
                i3 = 2;
                i4 = i3 | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                homeAssetEditV2ViewModel2 = homeAssetEditV2ViewModel;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(registerscenedialogfactory, "");
            Intrinsics.checkNotNullParameter(sessionTrackerb, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1201089264);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(registerscenedialogfactory) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i11 = IAuthTabCallback + 69;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 32 / 0;
                i8 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(sessionTrackerb) ? 256 : 128;
            } else if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(sessionTrackerb)) {
            }
            i4 |= i8;
        }
        if ((i & 3072) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(map) ? 2048 : 1024;
        }
        if ((i4 & 1171) != 1170) {
            int i13 = onNavigationEvent;
            int i14 = i13 + 57;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i13 + 97;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i4 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStub();
            if ((i & 1) != 0) {
                int i18 = onNavigationEvent + 89;
                IAuthTabCallback = i18 % 128;
                if (i18 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onPostMessage();
                    throw null;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onPostMessage()) {
                    if ((i2 & 1) != 0) {
                        TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult2, 6);
                        if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        int i19 = IAuthTabCallback + 59;
                        onNavigationEvent = i19 % 128;
                        if (i19 % 2 == 0) {
                            boolean z6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6;
                            throw null;
                        }
                        th = null;
                        HomeAssetEditV2ViewModel homeAssetEditV2ViewModel6 = (HomeAssetEditV2ViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(HomeAssetEditV2ViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0);
                        i5 = 6;
                        z2 = true;
                        i6 = i4 & (-15);
                        homeAssetEditV2ViewModel4 = homeAssetEditV2ViewModel6;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i20 = onNavigationEvent + 81;
                        IAuthTabCallback = i20 % 128;
                        int i21 = i20 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1201089264, i6, -1, "im.toss.features.home.feature.home_asset.edit.HomeAssetEditV2Screen (HomeAssetEditV2Screen.kt:54)");
                    }
                    unit = Unit.INSTANCE;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(homeAssetEditV2ViewModel4);
                    i7 = i6 & 7168;
                    if (i7 != 2048) {
                        int i22 = onNavigationEvent + 15;
                        IAuthTabCallback = i22 % 128;
                        int i23 = i22 % 2;
                        z3 = z2;
                    } else {
                        z3 = false;
                    }
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (!(zOnExtraCallback | z3) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new onExtraCallbackWithResult(homeAssetEditV2ViewModel4, map, th);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, i5);
                    cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(homeAssetEditV2ViewModel4.onTransact(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 7);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        int i24 = onNavigationEvent + 119;
                        IAuthTabCallback = i24 % 128;
                        if (i24 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult2));
                            th.hashCode();
                            throw th;
                        }
                        objOnMinimized2 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult2);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                    }
                    findresandmsg = (findResAndMsg) objOnMinimized2;
                    TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START;
                    zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(registerscenedialogfactory);
                    zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(findresandmsg);
                    z4 = i7 != 2048;
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                    zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(homeAssetEditV2ViewModel4);
                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if ((!(z4 | zOnExtraCallback2 | zOnExtraCallback3 | zOnNavigationEvent) && !zOnExtraCallback4) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        unit2 = unit;
                        homeAssetEditV2ViewModel5 = homeAssetEditV2ViewModel4;
                        z5 = true;
                        HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda4(registerscenedialogfactory, findresandmsg, map, homeAssetEditV2ViewModel4, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda4);
                        objOnMinimized3 = externalSyntheticLambda4;
                    } else {
                        unit2 = unit;
                        homeAssetEditV2ViewModel5 = homeAssetEditV2ViewModel4;
                        z5 = true;
                    }
                    AndroidTextContextMenuToolbarProviderExternalSyntheticLambda5.IAuthTabCallback(onextracallbackwithresult, (TextFieldScrollKtExternalSyntheticLambda0) null, (Function0) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, 6, 2);
                    HomeAssetEditV2ViewModel homeAssetEditV2ViewModel7 = homeAssetEditV2ViewModel5;
                    zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(homeAssetEditV2ViewModel7);
                    zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(registerscenedialogfactory);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (zOnExtraCallback5 | zOnExtraCallback6) {
                        Object obj = objOnMinimized4;
                        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                            HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda5(homeAssetEditV2ViewModel7, registerscenedialogfactory);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda5);
                            obj = externalSyntheticLambda5;
                        }
                        getLocalPrivacyDialog getlocalprivacydialogOnWarmupCompleted = AuthSettingProxy.onWarmupCompleted((findResAndMsg) null, (Camera2CameraMetadataExternalSyntheticLambda1) null, (Function2) obj, cameraCaptureResultEmptyCameraCaptureResult2, 0, 3);
                        Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                        Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                        obtain.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(-1303761907, z5, new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda6(context, registerscenedialogfactory, sessionTrackerb, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback), cameraCaptureResultEmptyCameraCaptureResult2, 54), ForwardingCameraControl.onExtraCallback(-1235115831, z5, new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda7(registerscenedialogfactory, homeAssetEditV2ViewModel7, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, getlocalprivacydialogOnWarmupCompleted, findresandmsg, resources), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 432, 1);
                        boolean zOnExtraCallback7 = getlocalprivacydialogOnWarmupCompleted.onExtraCallback();
                        boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(getlocalprivacydialogOnWarmupCompleted);
                        boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(homeAssetEditV2ViewModel7);
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if ((zOnExtraCallback8 | zOnExtraCallback9) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized5 = new onWarmupCompleted(getlocalprivacydialogOnWarmupCompleted, homeAssetEditV2ViewModel7, null);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized5);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zOnExtraCallback7), (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                        boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(homeAssetEditV2ViewModel7);
                        boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context);
                        boolean zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(resources);
                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                        boolean zOnExtraCallback13 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(getlocalprivacydialogOnWarmupCompleted);
                        boolean zOnExtraCallback14 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(registerscenedialogfactory);
                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (((zOnExtraCallback10 | zOnExtraCallback11 | zOnExtraCallback12 | zOnNavigationEvent2 | zOnExtraCallback13) || zOnExtraCallback14) || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                            objOnMinimized6 = new IAuthTabCallback(homeAssetEditV2ViewModel7, context, resources, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, getlocalprivacydialogOnWarmupCompleted, registerscenedialogfactory, (access13800) null);
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized6);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(unit2, (Function2) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResult3, 6);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        homeAssetEditV2ViewModel3 = homeAssetEditV2ViewModel7;
                    }
                } else {
                    int i25 = IAuthTabCallback + 113;
                    onNavigationEvent = i25 % 128;
                    int i26 = i25 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    if ((i2 & 1) != 0) {
                        i4 &= -15;
                    }
                }
                th = null;
                z2 = true;
                i5 = 6;
                int i27 = i4;
                homeAssetEditV2ViewModel4 = homeAssetEditV2ViewModel2;
                i6 = i27;
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                unit = Unit.INSTANCE;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(homeAssetEditV2ViewModel4);
                i7 = i6 & 7168;
                if (i7 != 2048) {
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!(zOnExtraCallback | z3)) {
                    objOnMinimized = new onExtraCallbackWithResult(homeAssetEditV2ViewModel4, map, th);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, i5);
                    cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(homeAssetEditV2ViewModel4.onTransact(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 7);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    }
                    findresandmsg = (findResAndMsg) objOnMinimized2;
                    TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult2 = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START;
                    zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(registerscenedialogfactory);
                    zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(findresandmsg);
                    if (i7 != 2048) {
                    }
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                    zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(homeAssetEditV2ViewModel4);
                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (!(z4 | zOnExtraCallback2 | zOnExtraCallback3 | zOnNavigationEvent | zOnExtraCallback4)) {
                        unit2 = unit;
                        homeAssetEditV2ViewModel5 = homeAssetEditV2ViewModel4;
                        z5 = true;
                        HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda42 = new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda4(registerscenedialogfactory, findresandmsg, map, homeAssetEditV2ViewModel4, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda42);
                        objOnMinimized3 = externalSyntheticLambda42;
                        AndroidTextContextMenuToolbarProviderExternalSyntheticLambda5.IAuthTabCallback(onextracallbackwithresult2, (TextFieldScrollKtExternalSyntheticLambda0) null, (Function0) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, 6, 2);
                        HomeAssetEditV2ViewModel homeAssetEditV2ViewModel72 = homeAssetEditV2ViewModel5;
                        zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(homeAssetEditV2ViewModel72);
                        zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(registerscenedialogfactory);
                        Object objOnMinimized42 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (zOnExtraCallback5 | zOnExtraCallback6) {
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
            homeAssetEditV2ViewModel3 = homeAssetEditV2ViewModel2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new HomeAssetEditV2ScreenKt$.ExternalSyntheticLambda8(homeAssetEditV2ViewModel3, registerscenedialogfactory, sessionTrackerb, map, i, i2));
        }
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onNavigationEvent + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return zBooleanValue;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = IAuthTabCallback + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final closeGetAuthorize onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<closeGetAuthorize> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        closeGetAuthorize closegetauthorize = (closeGetAuthorize) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return closegetauthorize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, registerSceneDialogFactory registerscenedialogfactory, findResAndMsg findresandmsg, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, View view, int i, int i2, String str) {
        Object[] objArr = {homeAssetEditV2ViewModel, registerscenedialogfactory, findresandmsg, cameraPresenceProviderExternalSyntheticLambda6, view, Integer.valueOf(i), Integer.valueOf(i2), str};
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -2034483488, 2034483495, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(registerSceneDialogFactory registerscenedialogfactory, findResAndMsg findresandmsg, Map map, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, -877851708, 877851711, iIAuthTabCallback2, new Object[]{registerscenedialogfactory, findresandmsg, map, homeAssetEditV2ViewModel, cameraPresenceProviderExternalSyntheticLambda6}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(registerSceneDialogFactory registerscenedialogfactory, SessionTrackerb sessionTrackerb, Context context, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, -1308674381, 1308674382, iIAuthTabCallback2, new Object[]{registerscenedialogfactory, sessionTrackerb, context, cameraPresenceProviderExternalSyntheticLambda6}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(registerSceneDialogFactory registerscenedialogfactory, findResAndMsg findresandmsg, Map map, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, -623543758, 623543763, iIAuthTabCallback2, new Object[]{registerscenedialogfactory, findresandmsg, map, homeAssetEditV2ViewModel, cameraPresenceProviderExternalSyntheticLambda6}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(registerSceneDialogFactory registerscenedialogfactory, SessionTrackerb sessionTrackerb, Context context, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, 2128777309, -2128777309, iIAuthTabCallback2, new Object[]{registerscenedialogfactory, sessionTrackerb, context, cameraPresenceProviderExternalSyntheticLambda6}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit onExtraCallbackWithResult(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, findResAndMsg findresandmsg, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, View view, String str, Interruptable$IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, int i) {
        Object[] objArr = {registerscenedialogfactory, homeAssetEditV2ViewModel, findresandmsg, cameraPresenceProviderExternalSyntheticLambda6, view, str, onextracallbackwithresult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1736130393, 1736130395, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(registerSceneDialogFactory registerscenedialogfactory, HomeAssetEditV2ViewModel homeAssetEditV2ViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Interruptable$IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, int i) {
        Object[] objArr = {registerscenedialogfactory, homeAssetEditV2ViewModel, cameraPresenceProviderExternalSyntheticLambda6, onextracallbackwithresult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -361018572, 361018578, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1768479047, 1768479051, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }
}
