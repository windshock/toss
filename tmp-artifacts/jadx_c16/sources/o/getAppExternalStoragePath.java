package o;

import android.content.res.Resources;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.features.home.feature.asset_home.R;
import im.toss.features.home.feature.asset_home.compose.edit.screen.AssetEtcHomeDeleteScreenKt$;
import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetEtcHomeEditViewModel;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.toJSONObject$onNavigationEvent;
import o.toPreviewOnlyRange;
import o.tryUnparcel;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getAppExternalStoragePath {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent = (toJSONObject$onNavigationEvent.onNavigationEvent) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(onnavigationevent);
        }
        IAuthTabCallback(onnavigationevent);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, clearprocesscache, onnavigationevent);
        int i4 = onWarmupCompleted + 97;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(getRelativeLeft getrelativeleft, Resources resources, getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getrelativeleft, resources, getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, audioRestrictionControllerImplExternalSyntheticLambda0);
        int i4 = onWarmupCompleted + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getrpcproxy, onnavigationevent);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        int i5 = onExtraCallback + 65;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        boolean z;
        Object obj;
        int i7;
        int i8 = ~i2;
        int i9 = ~i4;
        int i10 = i8 | i9;
        int i11 = ~(i10 | i6);
        int i12 = ~i6;
        int i13 = (~(i8 | i4)) | (~(i9 | i12)) | (~(i9 | i2));
        int i14 = ~(i12 | i10);
        int i15 = i2 + i4 + i3 + (1938118820 * i) + ((-1869228383) * i5);
        int i16 = i15 * i15;
        int i17 = ((i2 * 647972376) - 1941852458) + (i4 * 647972376) + (i11 * 1702) + (i13 * 851) + (i14 * 851) + (647973227 * i3) + ((-1260466036) * i) + (1557372491 * i5) + (i16 * 1239351296);
        int i18 = (i2 * (-1046486968)) + 2037645312 + ((-1046486968) * i4) + (1604861810 * i11) + (i13 * (-1345052743)) + ((-1345052743) * i14) + (1903427584 * i3) + ((-1907359744) * i) + (1374945280 * i5) + (1516044288 * i16) + (i17 * i17 * 490405888);
        if (i18 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i18 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 != 3) {
            return onExtraCallback(objArr);
        }
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[0];
        clearProcessCache clearprocesscache = (clearProcessCache) objArr[1];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[2];
        RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[3];
        ((Number) objArr[4]).intValue();
        toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent = (toJSONObject$onNavigationEvent.onNavigationEvent) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i19 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if ((iIntValue & 384) == 0) {
            int i20 = onExtraCallback + 13;
            onWarmupCompleted = i20 % 128;
            int i21 = i20 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onnavigationevent)) {
                int i22 = onWarmupCompleted + 113;
                onExtraCallback = i22 % 128;
                i7 = i22 % 2 == 0 ? 23019 : 256;
            } else {
                i7 = 128;
            }
            iIntValue |= i7;
            int i23 = onWarmupCompleted + 75;
            onExtraCallback = i23 % 128;
            int i24 = i23 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((iIntValue & 1153) == 1152), iIntValue & 1)) {
            int i25 = onExtraCallback + 35;
            onWarmupCompleted = i25 % 128;
            int i26 = i25 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i27 = onWarmupCompleted + 55;
                onExtraCallback = i27 % 128;
                int i28 = i27 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1177648170, iIntValue, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetEtcHomeDeleteScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetEtcHomeDeleteScreen.kt:153)");
            }
            boolean zOnNavigationEvent = onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i29 = iIntValue & 896;
            if (i29 == 256) {
                int i30 = onWarmupCompleted + 97;
                onExtraCallback = i30 % 128;
                int i31 = i30 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnExtraCallback | z) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda9(getrpcproxy, onnavigationevent);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Function0 function0 = (Function0) objOnMinimized;
            boolean z2 = i29 == 256;
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (z2 || zOnNavigationEvent2) {
                AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda10(onnavigationevent, clearprocesscache);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda10);
                obj = externalSyntheticLambda10;
                putConfigCache.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, onnavigationevent, true, zOnNavigationEvent, function0, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue >> 3) & 112) | 384, 1);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                int i32 = onExtraCallback + 109;
                onWarmupCompleted = i32 % 128;
                int i33 = i32 % 2;
                obj = objOnMinimized2;
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                putConfigCache.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, onnavigationevent, true, zOnNavigationEvent, function0, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue >> 3) & 112) | 384, 1);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[0];
        clearProcessCache clearprocesscache = (clearProcessCache) objArr[1];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[2];
        RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent = (toJSONObject$onNavigationEvent.onNavigationEvent) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, iIntValue, onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        onNavigationEvent(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, iIntValue, onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Unit unit;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Object[] objArr = {getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
            unit = (Unit) onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onExtraCallback(), -1667553009, ICustomTabsCallbackStubProxy.onExtraCallback(), 1667553012, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), objArr);
            int i5 = 55 / 0;
        } else {
            Object[] objArr2 = {getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
            unit = (Unit) onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onExtraCallback(), -1667553009, ICustomTabsCallbackStubProxy.onExtraCallback(), 1667553012, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), objArr2);
        }
        int i6 = onWarmupCompleted + 27;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onnavigationevent, clearprocesscache, onnavigationevent2);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AssetEtcHomeEditViewModel assetEtcHomeEditViewModel = (AssetEtcHomeEditViewModel) objArr[0];
        sendSimpleRpcJsapi sendsimplerpcjsapi = (sendSimpleRpcJsapi) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        IAuthTabCallback(assetEtcHomeEditViewModel, sendsimplerpcjsapi, function1, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, sendSimpleRpcJsapi sendsimplerpcjsapi, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Object[] objArr = {assetEtcHomeEditViewModel, sendsimplerpcjsapi, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {assetEtcHomeEditViewModel, sendsimplerpcjsapi, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onExtraCallback(), 12286793, ICustomTabsCallbackStubProxy.onExtraCallback(), -12286792, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, objArr2);
        int i6 = onWarmupCompleted + 17;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(clearprocesscache, onnavigationevent);
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        int i5 = onWarmupCompleted + 43;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(getrpcproxy, onnavigationevent);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(getrpcproxy, onnavigationevent);
        int i3 = onWarmupCompleted + 81;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 75 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onnavigationevent, clearprocesscache, onnavigationevent2);
        int i4 = onWarmupCompleted + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit IAuthTabCallback(toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        RVRpcProxy.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onnavigationevent.IAuthTabCallbackStub(), "other_assets");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(Function1 function1, clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        RVRpcProxy.onExtraCallbackWithResult(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onnavigationevent.IAuthTabCallbackStub(), "other_assets", true);
        function1.invoke(clearprocesscache.onWarmupCompleted());
        clearprocesscache.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent) {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
        String strIAuthTabCallbackStub;
        boolean z;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            strIAuthTabCallbackStub = onnavigationevent.IAuthTabCallbackStub();
            z = true;
        } else {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            strIAuthTabCallbackStub = onnavigationevent.IAuthTabCallbackStub();
            z = false;
        }
        RVRpcProxy.onExtraCallbackWithResult(convertFloatArrayToByteArray, strIAuthTabCallbackStub, "other_assets", z);
        clearprocesscache.onExtraCallback();
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getRpcProxy.onExtraCallback(getrpcproxy, onnavigationevent, "other_assets", (String) null, false, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent2, "");
            RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1140895382, 1140895395, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onnavigationevent, "other_assets", null, true, 5, null}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        } else {
            Intrinsics.checkNotNullParameter(onnavigationevent2, "");
            RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1140895382, 1140895395, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onnavigationevent, "other_assets", null, false, 4, null}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        }
        clearprocesscache.onExtraCallbackWithResult(onnavigationevent);
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 41;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 39;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            if ((i2 & 28312) == 0) {
                i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onnavigationevent) ^ true ? 128 : 256) | i2;
            } else {
                int i6 = onWarmupCompleted + 69;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                i3 = i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            if ((i2 & 384) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 1153) != 1152, i3 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-797850209, i3, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetEtcHomeDeleteScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetEtcHomeDeleteScreen.kt:127)");
            }
            boolean zOnNavigationEvent = onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i8 = i3 & 896;
            boolean z = i8 == 256;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | z)) {
                int i9 = onWarmupCompleted + 83;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda0(getrpcproxy, onnavigationevent);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                    obj = externalSyntheticLambda0;
                }
                Function0 function0 = (Function0) obj;
                boolean z2 = i8 == 256;
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent2 | z2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda1(onnavigationevent, clearprocesscache);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                putConfigCache.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, onnavigationevent, false, zOnNavigationEvent, function0, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, (i3 >> 3) & 112, 5);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i11 = onWarmupCompleted + 73;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            getRpcProxy.onExtraCallback(getrpcproxy, onnavigationevent, "other_assets", (String) null, true, 5, (Object) null);
        } else {
            getRpcProxy.onExtraCallback(getrpcproxy, onnavigationevent, "other_assets", (String) null, true, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent2, "");
        Object[] objArr = {ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onnavigationevent, "other_assets", null, true, 4, null};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1140895382, 1140895395, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
        clearprocesscache.onExtraCallbackWithResult(onnavigationevent);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(getRelativeLeft getrelativeleft, Resources resources, getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) throws Resources.NotFoundException {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        List listOnWarmupCompleted = getrelativeleft.onWarmupCompleted();
        if (getrelativeleft.IAuthTabCallback().isEmpty()) {
            int i2 = onWarmupCompleted + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        } else {
            String string = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_etc_shown);
            Intrinsics.checkNotNull(string);
            int i4 = onWarmupCompleted + 37;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 4;
            }
            str = string;
        }
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listOnWarmupCompleted, str, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(-797850209, true, new AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda7(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6)), 9, (Object) null);
        List listIAuthTabCallback = getrelativeleft.IAuthTabCallback();
        String string2 = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_etc_hidden);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listIAuthTabCallback, string2, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(-1177648170, true, new AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda8(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6)), 9, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 5;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, @NotNull sendSimpleRpcJsapi sendsimplerpcjsapi, @NotNull Function1<? super toJSONObject$onNavigationEvent.onNavigationEvent, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        AssetEtcHomeEditViewModel assetEtcHomeEditViewModel2;
        int i4;
        int i5;
        int i6;
        int i7;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        int i8;
        boolean zOnNavigationEvent;
        int i9;
        int i10 = 2 % 2;
        int i11 = onExtraCallback + 29;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(sendsimplerpcjsapi, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1698691172);
        Object obj = null;
        if ((i & 6) != 0) {
            int i13 = onWarmupCompleted + 55;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            i3 = i;
        } else if ((i2 & 1) == 0) {
            int i15 = onWarmupCompleted + 35;
            onExtraCallback = i15 % 128;
            if (i15 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetEtcHomeEditViewModel);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetEtcHomeEditViewModel)) {
                int i16 = onWarmupCompleted + 37;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sendsimplerpcjsapi) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
        }
        int i18 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i18 & 147) != 146, i18 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((i2 & 1) != 0) {
                    TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    int i19 = onWarmupCompleted + 49;
                    onExtraCallback = i19 % 128;
                    int i20 = i19 % 2;
                    i4 = 1;
                    i5 = 256;
                    i6 = i18 & (-15);
                    assetEtcHomeEditViewModel2 = (AssetEtcHomeEditViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(AssetEtcHomeEditViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                    i7 = 0;
                } else {
                    i4 = 1;
                    i5 = 256;
                    i7 = 0;
                    assetEtcHomeEditViewModel2 = assetEtcHomeEditViewModel;
                    i6 = i18;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1698691172, i6, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetEtcHomeDeleteScreen (AssetEtcHomeDeleteScreen.kt:44)");
                }
                clearProcessCache clearprocesscacheOnExtraCallback = GlobalInfoRecorder.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i7);
                int i21 = i6;
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(sendsimplerpcjsapi.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                getXTap getxtap = getXTap.onWarmupCompleted;
                getBacktraceNote getbacktracenoteOnExtraCallback = getxtap.onExtraCallback();
                Function2 function2OnExtraCallbackWithResult = getxtap.onExtraCallbackWithResult();
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = new AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda2();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                Function1 function12 = (Function1) objOnMinimized;
                i8 = (i21 & 896) != i5 ? i4 : 0;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (((zOnNavigationEvent ? 1 : 0) | i8) != 0) {
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda3(function1, clearprocesscacheOnExtraCallback);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda3);
                        obj2 = externalSyntheticLambda3;
                    }
                    Function1 function13 = (Function1) obj2;
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnNavigationEvent2) {
                        Object obj3 = objOnMinimized3;
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda4(clearprocesscacheOnExtraCallback);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda4);
                            obj3 = externalSyntheticLambda4;
                        }
                        GlobalInfoRecorder.onWarmupCompleted(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -872906731, 872906732, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{clearprocesscacheOnExtraCallback, getbacktracenoteOnExtraCallback, function2OnExtraCallbackWithResult, function12, function13, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3504}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, i4, (Object) null);
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            int i22 = onExtraCallback + 13;
                            onWarmupCompleted = i22 % 128;
                            if (i22 % 2 != 0) {
                                getAwbState.onExtraCallback();
                                obj.hashCode();
                                throw null;
                            }
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                        y1ExternalSyntheticLambda6.onExtraCallbackWithResult(getxtap.onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 384, 12286);
                        tryUnparcel.onExtraCallbackWithResult onextracallbackwithresult2 = (tryUnparcel) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(assetEtcHomeEditViewModel2.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult();
                        if (onextracallbackwithresult2 instanceof tryUnparcel.onExtraCallbackWithResult) {
                            int i23 = onExtraCallback + 125;
                            onWarmupCompleted = i23 % 128;
                            int i24 = i23 % 2;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(85474375);
                            Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                            getRelativeLeft getrelativeleftOnExtraCallbackWithResult = onextracallbackwithresult2.onExtraCallbackWithResult();
                            getRpcProxy getrpcproxyOnNavigationEvent = RVRpcProxy.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, onextracallback, 1.0f, false, 2, (Object) null);
                            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnNavigationEvent = StillCaptureFlashStopRepeatingQuirk.onNavigationEvent(ZslDisablerQuirk.onExtraCallbackWithResult(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getrelativeleftOnExtraCallbackWithResult);
                            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(resources);
                            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getrpcproxyOnNavigationEvent);
                            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback);
                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent3 | zOnExtraCallback3 | zOnNavigationEvent4)) {
                                int i25 = onExtraCallback + 63;
                                onWarmupCompleted = i25 % 128;
                                if (i25 % 2 != 0) {
                                    onwarmupcompleted.onExtraCallback();
                                    obj.hashCode();
                                    throw null;
                                }
                                Object obj4 = objOnMinimized4;
                                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                    AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda5(getrelativeleftOnExtraCallbackWithResult, resources, getrpcproxyOnNavigationEvent, clearprocesscacheOnExtraCallback, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda5);
                                    obj4 = externalSyntheticLambda5;
                                }
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent, (Camera2CameraMetadataExternalSyntheticLambda1) null, deviceQuirksExternalSyntheticLambda0OnNavigationEvent, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj4, cameraCaptureResultEmptyCameraCaptureResult2, 0, 506);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(88304520);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i2 & 1) != 0) {
                    i6 = i18 & (-15);
                    assetEtcHomeEditViewModel2 = assetEtcHomeEditViewModel;
                    i4 = 1;
                    i5 = 256;
                    i7 = 0;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                clearProcessCache clearprocesscacheOnExtraCallback2 = GlobalInfoRecorder.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i7);
                int i212 = i6;
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(sendsimplerpcjsapi.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                getXTap getxtap2 = getXTap.onWarmupCompleted;
                getBacktraceNote getbacktracenoteOnExtraCallback2 = getxtap2.onExtraCallback();
                Function2 function2OnExtraCallbackWithResult2 = getxtap2.onExtraCallbackWithResult();
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                }
                Function1 function122 = (Function1) objOnMinimized;
                if ((i212 & 896) != i5) {
                }
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback2);
                Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (((zOnNavigationEvent ? 1 : 0) | i8) != 0) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            assetEtcHomeEditViewModel2 = assetEtcHomeEditViewModel;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetEtcHomeDeleteScreenKt$.ExternalSyntheticLambda6(assetEtcHomeEditViewModel2, sendsimplerpcjsapi, function1, i, i2));
        }
    }

    private static final boolean onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            bool.booleanValue();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = onWarmupCompleted + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return zBooleanValue;
    }

    public static /* synthetic */ Unit onNavigationEvent(toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onExtraCallback(), 406824209, iOnExtraCallback2, -406824209, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, new Object[]{onnavigationevent});
    }

    public static /* synthetic */ Unit onWarmupCompleted(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onExtraCallback(), -604649156, ICustomTabsCallbackStubProxy.onExtraCallback(), 604649158, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr);
    }

    private static final Unit onExtraCallback(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onNavigationEvent onnavigationevent, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onExtraCallback(), -1667553009, ICustomTabsCallbackStubProxy.onExtraCallback(), 1667553012, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr);
    }

    private static final Unit IAuthTabCallback(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, sendSimpleRpcJsapi sendsimplerpcjsapi, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {assetEtcHomeEditViewModel, sendsimplerpcjsapi, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onExtraCallback(), 12286793, ICustomTabsCallbackStubProxy.onExtraCallback(), -12286792, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, objArr);
    }
}
