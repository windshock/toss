package o;

import android.content.res.Resources;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zzaq;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.features.home.feature.asset_home.R;
import im.toss.features.home.feature.asset_home.compose.edit.screen.AssetCardHomeDeleteScreenKt$;
import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetCardHomeEditViewModel;
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
import o.getFontSize;
import o.toJSONObject$onNavigationEvent;
import o.toPreviewOnlyRange;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVConfigServiceOnConfigChangeListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static /* synthetic */ Unit IAuthTabCallback(AssetCardHomeEditViewModel assetCardHomeEditViewModel, sendSimpleRpcJsapi sendsimplerpcjsapi, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 109;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {assetCardHomeEditViewModel, sendsimplerpcjsapi, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        Unit unit = (Unit) onExtraCallbackWithResult(zzaq.onNavigationEvent(), 1524581749, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), objArr, -1524581749, zzaq.onNavigationEvent());
        int i7 = onExtraCallback + 53;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 71 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onextracallbackwithresult);
        int i4 = IAuthTabCallback + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult = (toJSONObject$onNavigationEvent.onExtraCallbackWithResult) objArr[0];
        clearProcessCache clearprocesscache = (clearProcessCache) objArr[1];
        toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult2 = (toJSONObject$onNavigationEvent.onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(onextracallbackwithresult, clearprocesscache, onextracallbackwithresult2);
        }
        onExtraCallback(onextracallbackwithresult, clearprocesscache, onextracallbackwithresult2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(zzaq.onNavigationEvent(), 96356978, zzaq.onNavigationEvent(), iOnNavigationEvent, new Object[]{clearprocesscache, onextracallbackwithresult}, -96356977, iOnNavigationEvent2);
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 93;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i2);
        int i11 = i9 | i10 | (~(i8 | i2));
        int i12 = i10 | i4;
        int i13 = ~i2;
        int i14 = (~(i4 | i13 | i5)) | (~(i7 | i13 | i8)) | (~(i8 | i5 | i2));
        int i15 = i5 + i2 + i6 + ((-1329026341) * i) + ((-1277752516) * i3);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i5) - 1912602624) + ((-659060787) * i2) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i6) + (494927872 * i) + (1577058304 * i3) + ((-1783103488) * i16);
        int i18 = (i5 * 595972471) + 129777640 + (i2 * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i6 * 595972219) + (i * (-1341978823)) + (i3 * 731850196) + (i16 * 1869086720);
        int i19 = i17 + (i18 * i18 * (-846725120));
        if (i19 == 1) {
            clearProcessCache clearprocesscache = (clearProcessCache) objArr[0];
            toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult = (toJSONObject$onNavigationEvent.onExtraCallbackWithResult) objArr[1];
            int i20 = 2 % 2;
            int i21 = IAuthTabCallback + 73;
            onExtraCallback = i21 % 128;
            if (i21 % 2 != 0) {
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            } else {
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            }
            RVRpcProxy.onExtraCallbackWithResult(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onextracallbackwithresult.IAuthTabCallbackStub(), "card", false);
            clearprocesscache.onExtraCallback();
            Unit unit = Unit.INSTANCE;
            int i22 = onExtraCallback + 77;
            IAuthTabCallback = i22 % 128;
            int i23 = i22 % 2;
            return unit;
        }
        if (i19 == 2) {
            return onExtraCallback(objArr);
        }
        if (i19 == 3) {
            return onNavigationEvent(objArr);
        }
        AssetCardHomeEditViewModel assetCardHomeEditViewModel = (AssetCardHomeEditViewModel) objArr[0];
        sendSimpleRpcJsapi sendsimplerpcjsapi = (sendSimpleRpcJsapi) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        ((Number) objArr[6]).intValue();
        int i24 = 2 % 2;
        int i25 = onExtraCallback + 49;
        IAuthTabCallback = i25 % 128;
        if (i25 % 2 != 0) {
            iIntValue |= 1;
        }
        onExtraCallback(assetCardHomeEditViewModel, sendsimplerpcjsapi, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue), iIntValue2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(function1, clearprocesscache, onextracallbackwithresult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(function1, clearprocesscache, onextracallbackwithresult);
        int i3 = onExtraCallback + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 65 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(getRelativeLeft getrelativeleft, Resources resources, getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getrelativeleft, resources, getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, audioRestrictionControllerImplExternalSyntheticLambda0);
        int i4 = onExtraCallback + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getrpcproxy, onextracallbackwithresult);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult, clearprocesscache, onextracallbackwithresult2);
        int i4 = onExtraCallback + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(zzaq.onNavigationEvent(), 449919550, zzaq.onNavigationEvent(), iOnNavigationEvent, new Object[]{getrpcproxy, onextracallbackwithresult}, -449919547, iOnNavigationEvent2);
        int i4 = IAuthTabCallback + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            RVRpcProxy.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onextracallbackwithresult.IAuthTabCallbackStub(), "card");
            unit = Unit.INSTANCE;
            int i3 = 63 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            RVRpcProxy.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onextracallbackwithresult.IAuthTabCallbackStub(), "card");
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 101;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(Function1 function1, clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        RVRpcProxy.onExtraCallbackWithResult(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onextracallbackwithresult.IAuthTabCallbackStub(), "card", true);
        function1.invoke(onextracallbackwithresult);
        clearprocesscache.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getRpcProxy.onExtraCallback(getrpcproxy, onextracallbackwithresult, "card", (String) null, false, 5, (Object) null);
        } else {
            getRpcProxy.onExtraCallback(getrpcproxy, onextracallbackwithresult, "card", (String) null, false, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult2, "");
            RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1140895382, 1140895395, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onextracallbackwithresult, "card", null, false, 2, null}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult2, "");
            RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1140895382, 1140895395, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onextracallbackwithresult, "card", null, false, 4, null}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        }
        clearprocesscache.onExtraCallbackWithResult(onextracallbackwithresult);
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = i2;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if ((i4 & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult)) {
                int i6 = IAuthTabCallback + 121;
                onExtraCallback = i6 % 128;
                i3 = i6 % 2 != 0 ? 14220 : 256;
            } else {
                i3 = 128;
            }
            i4 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i4 & 1153) != 1152, i4 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallback + 47;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1875550763, i4, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetCardHomeDeleteScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetCardHomeDeleteScreen.kt:127)");
            }
            boolean zOnNavigationEvent = onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i9 = i4 & 896;
            boolean z = i9 == 256;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | z)) {
                int i10 = IAuthTabCallback + 37;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda4(getrpcproxy, onextracallbackwithresult);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                    obj = externalSyntheticLambda4;
                }
                Function0 function0 = (Function0) obj;
                boolean z2 = i9 == 256;
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent2 | z2)) {
                    int i12 = onExtraCallback + 5;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda5(onextracallbackwithresult, clearprocesscache);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    putConfigCache.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, onextracallbackwithresult, false, zOnNavigationEvent, function0, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, (i4 >> 3) & 112, 5);
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

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[0];
        toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult = (toJSONObject$onNavigationEvent.onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getRpcProxy.onExtraCallback(getrpcproxy, onextracallbackwithresult, "card", (String) null, true, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult2, "");
        Object[] objArr = {ConvertFloatArrayToByteArray.onExtraCallbackWithResult, onextracallbackwithresult, "card", null, true, 4, null};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1140895382, 1140895395, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
        clearprocesscache.onExtraCallbackWithResult(onextracallbackwithresult);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = i2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if ((i3 & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult) ? 256 : 128;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 1153) != 1152, i3 & 1)) {
            int i5 = IAuthTabCallback + 9;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1287150526, i3, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetCardHomeDeleteScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetCardHomeDeleteScreen.kt:153)");
            }
            boolean zOnNavigationEvent = onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i6 = i3 & 896;
            if (i6 == 256) {
                int i7 = IAuthTabCallback + 85;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(z | zOnExtraCallback)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda0(getrpcproxy, onextracallbackwithresult);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                    obj = externalSyntheticLambda0;
                }
                Function0 function0 = (Function0) obj;
                boolean z2 = i6 == 256;
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent2 | z2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda1(onextracallbackwithresult, clearprocesscache);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                putConfigCache.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, onextracallbackwithresult, true, zOnNavigationEvent, function0, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, ((i3 >> 3) & 112) | 384, 1);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getRelativeLeft getrelativeleft, Resources resources, getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) throws Resources.NotFoundException {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        List listOnWarmupCompleted = getrelativeleft.onWarmupCompleted();
        if (getrelativeleft.IAuthTabCallback().isEmpty()) {
            int i2 = onExtraCallback + 125;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            str = "";
        } else {
            String string = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_card_shown);
            Intrinsics.checkNotNull(string);
            str = string;
        }
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listOnWarmupCompleted, str, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(-1875550763, true, new AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda2(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6)), 9, (Object) null);
        List listIAuthTabCallback = getrelativeleft.IAuthTabCallback();
        String string2 = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_card_hidden);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listIAuthTabCallback, string2, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(1287150526, true, new AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda3(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6)), 9, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@Nullable AssetCardHomeEditViewModel assetCardHomeEditViewModel, @NotNull sendSimpleRpcJsapi sendsimplerpcjsapi, @NotNull Function1<? super toJSONObject$onNavigationEvent.onExtraCallbackWithResult, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        AssetCardHomeEditViewModel assetCardHomeEditViewModel2;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        AssetCardHomeEditViewModel assetCardHomeEditViewModel3;
        int i4;
        AssetCardHomeEditViewModel assetCardHomeEditViewModel4;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        int i5;
        boolean zOnNavigationEvent;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = onExtraCallback + 21;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        Intrinsics.checkNotNullParameter(sendsimplerpcjsapi, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-743193666);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                int i11 = onExtraCallback + 77;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                assetCardHomeEditViewModel2 = assetCardHomeEditViewModel;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetCardHomeEditViewModel2)) {
                    i7 = 4;
                }
                i3 = i7 | i;
            } else {
                assetCardHomeEditViewModel2 = assetCardHomeEditViewModel;
            }
            i7 = 2;
            i3 = i7 | i;
        } else {
            assetCardHomeEditViewModel2 = assetCardHomeEditViewModel;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sendsimplerpcjsapi)) {
                int i13 = IAuthTabCallback + 97;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
        }
        int i15 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i15 & 147) != 146, i15 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) != 0) {
                int i16 = onExtraCallback + 9;
                IAuthTabCallback = i16 % 128;
                int i17 = i16 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if ((i2 & 1) != 0) {
                        TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        int i18 = onExtraCallback + 9;
                        IAuthTabCallback = i18 % 128;
                        int i19 = i18 % 2;
                        i4 = 0;
                        assetCardHomeEditViewModel2 = (AssetCardHomeEditViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(AssetCardHomeEditViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, !(textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) ? AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult : textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                        i15 &= -15;
                    }
                    assetCardHomeEditViewModel4 = assetCardHomeEditViewModel2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    clearProcessCache clearprocesscacheOnExtraCallback = GlobalInfoRecorder.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(sendsimplerpcjsapi.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                    getAppRegion getappregion = getAppRegion.onNavigationEvent;
                    getBacktraceNote getbacktracenoteOnNavigationEvent = getappregion.onNavigationEvent();
                    Function2 function2OnExtraCallback = getappregion.onExtraCallback();
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    }
                    Function1 function12 = (Function1) objOnMinimized;
                    if ((i15 & 896) == 256) {
                    }
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((i5 | (zOnNavigationEvent ? 1 : 0)) == 0) {
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 1) != 0) {
                        i15 &= -15;
                        assetCardHomeEditViewModel4 = assetCardHomeEditViewModel2;
                        i4 = 0;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i20 = IAuthTabCallback + 59;
                            onExtraCallback = i20 % 128;
                            int i21 = i20 % 2;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-743193666, i15, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetCardHomeDeleteScreen (AssetCardHomeDeleteScreen.kt:44)");
                            int i22 = IAuthTabCallback + 61;
                            onExtraCallback = i22 % 128;
                            int i23 = i22 % 2;
                        }
                        clearProcessCache clearprocesscacheOnExtraCallback2 = GlobalInfoRecorder.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(sendsimplerpcjsapi.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                        getAppRegion getappregion2 = getAppRegion.onNavigationEvent;
                        getBacktraceNote getbacktracenoteOnNavigationEvent2 = getappregion2.onNavigationEvent();
                        Function2 function2OnExtraCallback2 = getappregion2.onExtraCallback();
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized = new AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda6();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        Function1 function122 = (Function1) objOnMinimized;
                        i5 = (i15 & 896) == 256 ? 1 : i4;
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback2);
                        Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((i5 | (zOnNavigationEvent ? 1 : 0)) == 0) {
                            Object obj = objOnMinimized22;
                            if (objOnMinimized22 == onwarmupcompleted.onExtraCallback()) {
                                AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda7(function1, clearprocesscacheOnExtraCallback2);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda7);
                                obj = externalSyntheticLambda7;
                            }
                            Function1 function13 = (Function1) obj;
                            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback2);
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnNavigationEvent2 || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized3 = new AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda8(clearprocesscacheOnExtraCallback2);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                            }
                            GlobalInfoRecorder.onWarmupCompleted(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -872906731, 872906732, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{clearprocesscacheOnExtraCallback2, getbacktracenoteOnNavigationEvent2, function2OnExtraCallback2, function122, function13, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3504}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                int i24 = onExtraCallback + 33;
                                IAuthTabCallback = i24 % 128;
                                int i25 = i24 % 2;
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
                            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(getappregion2.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 384, 12286);
                            getFontSize.IAuthTabCallback iAuthTabCallback = (getFontSize) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(assetCardHomeEditViewModel4.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult();
                            if (iAuthTabCallback instanceof getFontSize.IAuthTabCallback) {
                                int i26 = onExtraCallback + 115;
                                IAuthTabCallback = i26 % 128;
                                int i27 = i26 % 2;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1403186458);
                                Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                                getRelativeLeft getrelativeleftIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                                getRpcProxy getrpcproxyOnNavigationEvent = RVRpcProxy.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, onextracallback, 1.0f, false, 2, (Object) null);
                                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnNavigationEvent = StillCaptureFlashStopRepeatingQuirk.onNavigationEvent(ZslDisablerQuirk.onExtraCallbackWithResult(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getrelativeleftIAuthTabCallback);
                                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(resources);
                                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getrpcproxyOnNavigationEvent);
                                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback2);
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent3 | zOnExtraCallback3 | zOnNavigationEvent4)) {
                                    Object obj2 = objOnMinimized4;
                                    if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                        AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda9(getrelativeleftIAuthTabCallback, resources, getrpcproxyOnNavigationEvent, clearprocesscacheOnExtraCallback2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda9);
                                        obj2 = externalSyntheticLambda9;
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent, (Camera2CameraMetadataExternalSyntheticLambda1) null, deviceQuirksExternalSyntheticLambda0OnNavigationEvent, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 506);
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                }
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1400399558);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            assetCardHomeEditViewModel3 = assetCardHomeEditViewModel4;
                        }
                    }
                }
                i4 = 0;
                assetCardHomeEditViewModel4 = assetCardHomeEditViewModel2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                clearProcessCache clearprocesscacheOnExtraCallback22 = GlobalInfoRecorder.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback22 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(sendsimplerpcjsapi.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                getAppRegion getappregion22 = getAppRegion.onNavigationEvent;
                getBacktraceNote getbacktracenoteOnNavigationEvent22 = getappregion22.onNavigationEvent();
                Function2 function2OnExtraCallback22 = getappregion22.onExtraCallback();
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                }
                Function1 function1222 = (Function1) objOnMinimized;
                if ((i15 & 896) == 256) {
                }
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback22);
                Object objOnMinimized222 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((i5 | (zOnNavigationEvent ? 1 : 0)) == 0) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            assetCardHomeEditViewModel3 = assetCardHomeEditViewModel2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetCardHomeDeleteScreenKt$.ExternalSyntheticLambda10(assetCardHomeEditViewModel3, sendsimplerpcjsapi, function1, i, i2));
        }
    }

    private static final boolean onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallback + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult2) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(zzaq.onNavigationEvent(), -1325281955, zzaq.onNavigationEvent(), iOnNavigationEvent, new Object[]{onextracallbackwithresult, clearprocesscache, onextracallbackwithresult2}, 1325281957, iOnNavigationEvent2);
    }

    private static final Unit onNavigationEvent(clearProcessCache clearprocesscache, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(zzaq.onNavigationEvent(), 96356978, zzaq.onNavigationEvent(), iOnNavigationEvent, new Object[]{clearprocesscache, onextracallbackwithresult}, -96356977, iOnNavigationEvent2);
    }

    private static final Unit IAuthTabCallback(getRpcProxy getrpcproxy, toJSONObject$onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(zzaq.onNavigationEvent(), 449919550, zzaq.onNavigationEvent(), iOnNavigationEvent, new Object[]{getrpcproxy, onextracallbackwithresult}, -449919547, iOnNavigationEvent2);
    }

    private static final Unit onWarmupCompleted(AssetCardHomeEditViewModel assetCardHomeEditViewModel, sendSimpleRpcJsapi sendsimplerpcjsapi, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {assetCardHomeEditViewModel, sendsimplerpcjsapi, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onExtraCallbackWithResult(zzaq.onNavigationEvent(), 1524581749, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), objArr, -1524581749, zzaq.onNavigationEvent());
    }
}
