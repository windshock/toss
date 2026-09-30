package o;

import android.content.res.Resources;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.features.home.feature.asset_home.R;
import im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeDeleteScreenKt$;
import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetDepositHomeEditViewModel;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.getDensity;
import o.setApTextSize;
import o.toJSONObject;
import o.toPreviewOnlyRange;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class defaultPlatform {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[0];
        toJSONObject.IAuthTabCallback iAuthTabCallback = (toJSONObject.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(getrpcproxy, iAuthTabCallback);
        int i4 = IAuthTabCallback + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(toJSONObject.IAuthTabCallback iAuthTabCallback, clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{iAuthTabCallback, clearprocesscache, iAuthTabCallback2}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1073252282, iOnNavigationEvent2, iOnNavigationEvent, -1073252280);
        int i4 = onNavigationEvent + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        clearProcessCache clearprocesscache = (clearProcessCache) objArr[0];
        toJSONObject.IAuthTabCallback iAuthTabCallback = (toJSONObject.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(clearprocesscache, iAuthTabCallback);
        int i4 = IAuthTabCallback + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        toJSONObject.IAuthTabCallback iAuthTabCallback = (toJSONObject.IAuthTabCallback) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(iAuthTabCallback);
        int i4 = onNavigationEvent + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallback(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, sendSimpleRpcJsapi sendsimplerpcjsapi, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 87;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(assetDepositHomeEditViewModel, sendsimplerpcjsapi, (Function1<? super toJSONObject.IAuthTabCallback, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 15;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(function1, clearprocesscache, iAuthTabCallback);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, clearprocesscache, iAuthTabCallback);
        int i3 = onNavigationEvent + 113;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1991059081, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, -1991059077);
        int i6 = onNavigationEvent + 117;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getRpcProxy getrpcproxy, toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onTransact(getrpcproxy, iAuthTabCallback);
            obj.hashCode();
            throw null;
        }
        Unit unitOnTransact = onTransact(getrpcproxy, iAuthTabCallback);
        int i3 = onNavigationEvent + 17;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(toJSONObject.IAuthTabCallback iAuthTabCallback, clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(iAuthTabCallback, clearprocesscache, iAuthTabCallback2);
        }
        asInterface(iAuthTabCallback, clearprocesscache, iAuthTabCallback2);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[0];
        clearProcessCache clearprocesscache = (clearProcessCache) objArr[1];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[2];
        RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        toJSONObject.IAuthTabCallback iAuthTabCallback = (toJSONObject.IAuthTabCallback) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, iIntValue, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = IAuthTabCallback + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            asInterface(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = IAuthTabCallback + 7;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getRpcProxy getrpcproxy, toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{getrpcproxy, iAuthTabCallback}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1882576941, iOnNavigationEvent2, iOnNavigationEvent, 1882576944);
        int i4 = onNavigationEvent + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(toJSONObject.IAuthTabCallback iAuthTabCallback, clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(iAuthTabCallback, clearprocesscache, iAuthTabCallback2);
        int i4 = IAuthTabCallback + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, sendSimpleRpcJsapi sendsimplerpcjsapi, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(assetDepositHomeEditViewModel, sendsimplerpcjsapi, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 31;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 27;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onWarmupCompleted(clearprocesscache, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(clearprocesscache, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallback + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 43;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnTransact = onTransact(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 7;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getRpcProxy getrpcproxy, toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(getrpcproxy, iAuthTabCallback);
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        int i5 = IAuthTabCallback + 53;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(toJSONObject.IAuthTabCallback iAuthTabCallback, clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(iAuthTabCallback, clearprocesscache, iAuthTabCallback2);
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        boolean z2;
        Object objOnMinimized;
        boolean zOnNavigationEvent;
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~(i8 | i5)) | i7;
        int i10 = (~(i7 | (~i5) | i3)) | (~(i8 | i7 | i5));
        int i11 = (~(i5 | i3)) | (~(i6 | i3));
        int i12 = i6 + i3 + i4 + ((-1520811122) * i) + (1880343047 * i2);
        int i13 = i12 * i12;
        int i14 = ((i6 * (-660833811)) - 1995073173) + (i3 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + ((-660833671) * i4) + (644061726 * i) + ((-2012083377) * i2) + (i13 * (-1027145728));
        switch ((((-88056299) * i6) - 1254686720) + (875799021 * i3) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i4) + ((-206831616) * i) + (408289280 * i2) + ((-683737088) * i13) + (i14 * i14 * 814809088)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                boolean z3 = false;
                getRpcProxy getrpcproxy = (getRpcProxy) objArr[0];
                clearProcessCache clearprocesscache = (clearProcessCache) objArr[1];
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[2];
                RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[3];
                ((Number) objArr[4]).intValue();
                toJSONObject.IAuthTabCallback iAuthTabCallback = (toJSONObject.IAuthTabCallback) objArr[5];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
                int iIntValue = ((Number) objArr[7]).intValue();
                int i15 = 2 % 2;
                Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
                Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
                if ((iIntValue & 384) == 0) {
                    int i16 = IAuthTabCallback + 51;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    iIntValue |= (iIntValue & 512) == 0 ? cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback) : cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback) ? 256 : 128;
                } else {
                    int i18 = onNavigationEvent + 117;
                    IAuthTabCallback = i18 % 128;
                    int i19 = i18 % 2;
                }
                if ((iIntValue & 1153) != 1152) {
                    int i20 = IAuthTabCallback + 61;
                    onNavigationEvent = i20 % 128;
                    z = i20 % 2 == 0;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i21 = onNavigationEvent + 1;
                        IAuthTabCallback = i21 % 128;
                        int i22 = i21 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(264118104, iIntValue, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeDeleteScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDepositHomeDeleteScreen.kt:201)");
                    }
                    boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
                    int i23 = iIntValue & 896;
                    if (i23 == 256) {
                        z2 = true;
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if ((zOnExtraCallback | z2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda19(getrpcproxy, iAuthTabCallback);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                        }
                        Function0 function0 = (Function0) objOnMinimized;
                        if (i23 == 256) {
                            int i24 = IAuthTabCallback + 71;
                            onNavigationEvent = i24 % 128;
                            if (i24 % 2 == 0) {
                                if ((iIntValue & 512) != 0) {
                                }
                                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(z3 | zOnNavigationEvent)) {
                                }
                            } else if ((iIntValue & 11927) == 0) {
                                z3 = true;
                                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
                                Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(z3 | zOnNavigationEvent)) {
                                    Object obj = objOnMinimized22;
                                    if (objOnMinimized22 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda20 externalSyntheticLambda20 = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda20(iAuthTabCallback, clearprocesscache);
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda20);
                                        obj = externalSyntheticLambda20;
                                    }
                                    putConfigCache.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, iAuthTabCallback, false, zOnExtraCallbackWithResult, function0, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue >> 3) & 112, 5);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        int i25 = onNavigationEvent + 103;
                                        IAuthTabCallback = i25 % 128;
                                        int i26 = i25 % 2;
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                }
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback)) {
                            }
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
                            Object objOnMinimized222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!(z3 | zOnNavigationEvent)) {
                            }
                        }
                    } else {
                        if ((iIntValue & 512) != 0) {
                            int i27 = onNavigationEvent + 85;
                            IAuthTabCallback = i27 % 128;
                            int i28 = i27 % 2;
                            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback)) {
                            }
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (zOnExtraCallback | z2) {
                                objOnMinimized = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda19(getrpcproxy, iAuthTabCallback);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                                Function0 function02 = (Function0) objOnMinimized;
                                if (i23 == 256) {
                                }
                            }
                        }
                        z2 = false;
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnExtraCallback | z2) {
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return onTransact(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(getDensity getdensity, Resources resources, getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getdensity, resources, getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, audioRestrictionControllerImplExternalSyntheticLambda0);
        int i4 = IAuthTabCallback + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAsBinder = asBinder(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 57;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getRpcProxy getrpcproxy, toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            return (Unit) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{getrpcproxy, iAuthTabCallback}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -942853179, iOnNavigationEvent2, iOnNavigationEvent, 942853186);
        }
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(toJSONObject.IAuthTabCallback iAuthTabCallback, clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(iAuthTabCallback, clearprocesscache, iAuthTabCallback2);
        int i4 = IAuthTabCallback + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    private static final Unit onWarmupCompleted(clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        String strIAuthTabCallback;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i3 = onNavigationEvent + 33;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 2;
            }
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = IAuthTabCallback + 105;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1595850717, i, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeDeleteScreen.<anonymous> (AssetDepositHomeDeleteScreen.kt:53)");
            }
            toJSONObject.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = clearprocesscache.onWarmupCompleted();
            String strIAuthTabCallback2 = iAuthTabCallbackOnWarmupCompleted != null ? iAuthTabCallbackOnWarmupCompleted.IAuthTabCallback() : null;
            String str = strIAuthTabCallback2 != null ? strIAuthTabCallback2 : "";
            if (StringsKt.isBlank(str)) {
                int i7 = IAuthTabCallback + 85;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-995578010);
                strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_asset_delete_alert_default_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-995444493);
                if (FaceDetectCallBack.onExtraCallback(FaceDetectCallBack.onExtraCallbackWithResult, str, false, 2, (Object) null)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-995386740);
                    strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.home_v2_feature_asset_home_edit_asset_delete_alert_title_last_consonant, new Object[]{str}, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-995235429);
                    strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.home_v2_feature_asset_home_edit_asset_delete_alert_title, new Object[]{str}, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallback, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onNavigationEvent + 83;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 25 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            RVRpcProxy.onExtraCallbackWithResult(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, iAuthTabCallback.IAuthTabCallbackStub(), iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        RVRpcProxy.onExtraCallbackWithResult(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, iAuthTabCallback.IAuthTabCallbackStub(), iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback());
        int i3 = 94 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        RVRpcProxy.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, iAuthTabCallback.IAuthTabCallbackStub(), iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), true);
        function1.invoke(clearprocesscache.onWarmupCompleted());
        clearprocesscache.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        RVRpcProxy.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, iAuthTabCallback.IAuthTabCallbackStub(), iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), false);
        clearprocesscache.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 109;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(getRpcProxy getrpcproxy, toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getrpcproxy.onExtraCallbackWithResult(iAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), false);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        toJSONObject.IAuthTabCallback iAuthTabCallback = (toJSONObject.IAuthTabCallback) objArr[0];
        clearProcessCache clearprocesscache = (clearProcessCache) objArr[1];
        toJSONObject.IAuthTabCallback iAuthTabCallback2 = (toJSONObject.IAuthTabCallback) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
        Object[] objArr2 = {ConvertFloatArrayToByteArray.onExtraCallbackWithResult, iAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), false};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1167719291, 1167719298, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr2, iOnExtraCallback);
        clearprocesscache.onExtraCallbackWithResult(iAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStub(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean zOnExtraCallback;
        int i3 = i2;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 61;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if ((i3 & 384) == 0) {
            if ((i3 & 512) == 0) {
                int i7 = IAuthTabCallback + 69;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback);
            } else {
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback);
            }
            i3 |= zOnExtraCallback ? 256 : 128;
        }
        boolean z = false;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 1153) != 1152, i3 & 1)) {
            int i9 = IAuthTabCallback + 49;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1987612063, i3, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeDeleteScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDepositHomeDeleteScreen.kt:120)");
            }
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i10 = i3 & 896;
            if (i10 != 256) {
                int i11 = onNavigationEvent + 21;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                boolean z2 = (i3 & 512) != 0 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback2 | z2)) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda17 externalSyntheticLambda17 = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda17(getrpcproxy, iAuthTabCallback);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda17);
                        obj = externalSyntheticLambda17;
                    }
                    Function0 function0 = (Function0) obj;
                    if (i10 == 256 || ((i3 & 512) != 0 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback))) {
                        z = true;
                    }
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnNavigationEvent | z) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda18(iAuthTabCallback, clearprocesscache);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    putConfigCache.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, iAuthTabCallback, false, zOnExtraCallbackWithResult, function0, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, (i3 >> 3) & 112, 5);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i13 = onNavigationEvent + 97;
                        IAuthTabCallback = i13 % 128;
                        if (i13 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[0];
        toJSONObject.IAuthTabCallback iAuthTabCallback = (toJSONObject.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getrpcproxy.onExtraCallbackWithResult(iAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), false);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return unit;
    }

    private static final Unit onTransact(toJSONObject.IAuthTabCallback iAuthTabCallback, clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
            Object[] objArr = {ConvertFloatArrayToByteArray.onExtraCallbackWithResult, iAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), false};
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1167719291, 1167719298, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
            Object[] objArr2 = {ConvertFloatArrayToByteArray.onExtraCallbackWithResult, iAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), false};
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1167719291, 1167719298, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr2, iOnExtraCallback2);
        }
        clearprocesscache.onExtraCallbackWithResult(iAuthTabCallback);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asInterface(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        boolean zOnExtraCallback;
        int i3 = i2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if ((i3 & 384) == 0) {
            if ((i3 & 512) == 0) {
                int i5 = onNavigationEvent + 117;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback);
                int i7 = IAuthTabCallback + 87;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            } else {
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback);
            }
            i3 |= zOnExtraCallback ? 256 : 128;
        }
        boolean z2 = true;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 1153) != 1152, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(162748118, i3, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeDeleteScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDepositHomeDeleteScreen.kt:147)");
            }
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i9 = i3 & 896;
            if (i9 != 256) {
                int i10 = onNavigationEvent + 119;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0 ? (i3 & 512) != 0 : (i3 & 25911) != 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback)) {
                        z = true;
                    }
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback2 | z) {
                        int i11 = IAuthTabCallback + 11;
                        onNavigationEvent = i11 % 128;
                        if (i11 % 2 != 0) {
                            CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Object obj2 = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda0(getrpcproxy, iAuthTabCallback);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                            obj2 = externalSyntheticLambda0;
                        }
                        Function0 function0 = (Function0) obj2;
                        if (i9 != 256) {
                            if ((i3 & 512) != 0) {
                                int i12 = onNavigationEvent + 7;
                                IAuthTabCallback = i12 % 128;
                                if (i12 % 2 != 0 ? !cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback) : !cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback)) {
                                    z2 = false;
                                }
                            }
                        }
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnNavigationEvent | z2)) {
                            Object obj3 = objOnMinimized2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda1(iAuthTabCallback, clearprocesscache);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda1);
                                obj3 = externalSyntheticLambda1;
                            }
                            putConfigCache.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, iAuthTabCallback, false, zOnExtraCallbackWithResult, function0, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResult, (i3 >> 3) & 112, 5);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }
                }
                z = false;
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback2 | z) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(getRpcProxy getrpcproxy, toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getrpcproxy.onExtraCallbackWithResult(iAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), false);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(toJSONObject.IAuthTabCallback iAuthTabCallback, clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
        RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1167719291, 1167719298, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, iAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), false}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        clearprocesscache.onExtraCallbackWithResult(iAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 95;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asBinder(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = i2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        boolean z2 = true;
        if ((i3 & 384) == 0) {
            i3 |= ((i3 & 512) == 0 ? cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback) : cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback)) ^ true ? 128 : 256;
        }
        if ((i3 & 1153) != 1152) {
            int i5 = onNavigationEvent + 55;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onNavigationEvent + 67;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(213433111, i3, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeDeleteScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDepositHomeDeleteScreen.kt:174)");
            }
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i9 = i3 & 896;
            boolean z3 = i9 == 256 || ((i3 & 512) != 0 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback));
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | z3)) {
                int i10 = IAuthTabCallback + 49;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda15 externalSyntheticLambda15 = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda15(getrpcproxy, iAuthTabCallback);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda15);
                    obj2 = externalSyntheticLambda15;
                }
                Function0 function0 = (Function0) obj2;
                if (i9 != 256) {
                    if ((i3 & 512) != 0) {
                        int i11 = onNavigationEvent + 97;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                        if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback)) {
                            z2 = false;
                        }
                    }
                }
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | z2)) {
                    Object obj3 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda16 externalSyntheticLambda16 = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda16(iAuthTabCallback, clearprocesscache);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda16);
                        obj3 = externalSyntheticLambda16;
                    }
                    putConfigCache.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, iAuthTabCallback, false, zOnExtraCallbackWithResult, function0, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResult, (i3 >> 3) & 112, 5);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[0];
        toJSONObject.IAuthTabCallback iAuthTabCallback = (toJSONObject.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getrpcproxy.onExtraCallbackWithResult(iAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), false);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asBinder(toJSONObject.IAuthTabCallback iAuthTabCallback, clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
            RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1167719291, 1167719298, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, iAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), false}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
            RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1167719291, 1167719298, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, iAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), false}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        }
        clearprocesscache.onExtraCallbackWithResult(iAuthTabCallback);
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(getRpcProxy getrpcproxy, toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getrpcproxy.onExtraCallbackWithResult(iAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), true);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(toJSONObject.IAuthTabCallback iAuthTabCallback, clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
            RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1167719291, 1167719298, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, iAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), true}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
            RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1167719291, 1167719298, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, iAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStubProxy().onExtraCallback(), true}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        }
        clearprocesscache.onExtraCallbackWithResult(iAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 77;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onTransact(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        boolean z2;
        int i3 = i2;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        boolean z3 = true;
        if ((i3 & 384) == 0) {
            i3 |= !((i3 & 512) == 0 ? cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback) : cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback)) ? 128 : 256;
        }
        if ((i3 & 1153) != 1152) {
            int i7 = onNavigationEvent + 111;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 95;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(314803097, i3, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeDeleteScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetDepositHomeDeleteScreen.kt:227)");
            }
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i11 = i3 & 896;
            if (i11 == 256) {
                z2 = true;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | z2)) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda2(getrpcproxy, iAuthTabCallback);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                        obj = externalSyntheticLambda2;
                    }
                    Function0 function0 = (Function0) obj;
                    if (i11 != 256 && ((i3 & 512) == 0 || !cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback))) {
                        z3 = false;
                    }
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnNavigationEvent | z3) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda3(iAuthTabCallback, clearprocesscache);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                        int i12 = onNavigationEvent + 19;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                    }
                    putConfigCache.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, iAuthTabCallback, true, zOnExtraCallbackWithResult, function0, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, ((i3 >> 3) & 112) | 384, 1);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if ((i3 & 512) != 0) {
                    int i14 = onNavigationEvent + 57;
                    IAuthTabCallback = i14 % 128;
                    if (i14 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback)) {
                    }
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnExtraCallback | z2)) {
                    }
                }
                z2 = false;
                Object objOnMinimized32 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | z2)) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(getDensity getdensity, Resources resources, getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) throws Resources.NotFoundException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        getDensity.onNavigationEvent onnavigationevent = (getDensity.onNavigationEvent) getdensity;
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        List list = (List) getDensity.onNavigationEvent.onWarmupCompleted(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -641708251, iIAuthTabCallback2, new Object[]{onnavigationevent}, iIAuthTabCallback3, iIAuthTabCallback, 641708252);
        String string = resources.getString(R.string.home_v2_feature_asset_home_edit_asset_deposit_category_section_header_deposit);
        Intrinsics.checkNotNullExpressionValue(string, "");
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, list, string, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(1987612063, true, new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda10(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6)), 9, (Object) null);
        List listAsBinder = onnavigationevent.asBinder();
        String string2 = resources.getString(R.string.home_v2_feature_asset_home_edit_asset_deposit_category_section_header_saving);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "Saving", listAsBinder, string2, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(162748118, true, new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda11(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6)), 8, (Object) null);
        List listOnNavigationEvent = onnavigationevent.onNavigationEvent();
        String string3 = resources.getString(R.string.home_v2_feature_asset_home_edit_asset_deposit_category_section_header_investment);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "Investment", listOnNavigationEvent, string3, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(213433111, true, new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda12(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6)), 8, (Object) null);
        List listOnTransact = onnavigationevent.onTransact();
        String string4 = resources.getString(R.string.home_v2_feature_asset_home_edit_asset_deposit_category_section_header_pension);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "Pension", listOnTransact, string4, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(264118104, true, new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda13(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6)), 8, (Object) null);
        List listOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
        String string5 = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_account_hidden);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listOnExtraCallbackWithResult, string5, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(314803097, true, new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda14(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6)), 9, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0197  */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, @NotNull sendSimpleRpcJsapi sendsimplerpcjsapi, @NotNull Function1<? super toJSONObject.IAuthTabCallback, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        AssetDepositHomeEditViewModel assetDepositHomeEditViewModel2;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        AssetDepositHomeEditViewModel assetDepositHomeEditViewModel3;
        AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback defaultViewModelCreationExtras;
        boolean z;
        int i4;
        AssetDepositHomeEditViewModel assetDepositHomeEditViewModel4;
        ?? r0;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        int i5;
        boolean zOnNavigationEvent;
        int i6;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(sendsimplerpcjsapi, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1512469210);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                assetDepositHomeEditViewModel2 = assetDepositHomeEditViewModel;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetDepositHomeEditViewModel2)) {
                    int i8 = IAuthTabCallback + 19;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    i6 = 4;
                }
                i3 = i6 | i;
            } else {
                assetDepositHomeEditViewModel2 = assetDepositHomeEditViewModel;
            }
            i6 = 2;
            i3 = i6 | i;
        } else {
            assetDepositHomeEditViewModel2 = assetDepositHomeEditViewModel;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sendsimplerpcjsapi) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
        }
        int i10 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i10 & 147) != 146, i10 & 1)) {
            int i11 = onNavigationEvent + 49;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) != 0) {
                int i13 = onNavigationEvent + 69;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if ((i2 & 1) != 0) {
                        TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        if (!(textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6)) {
                            defaultViewModelCreationExtras = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
                        } else {
                            int i15 = onNavigationEvent + 53;
                            IAuthTabCallback = i15 % 128;
                            int i16 = i15 % 2;
                            defaultViewModelCreationExtras = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras();
                        }
                        z = true;
                        i4 = 0;
                        assetDepositHomeEditViewModel2 = (AssetDepositHomeEditViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(AssetDepositHomeEditViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, defaultViewModelCreationExtras, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                        i10 &= -15;
                    }
                    assetDepositHomeEditViewModel4 = assetDepositHomeEditViewModel2;
                    r0 = z;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    clearProcessCache clearprocesscacheOnExtraCallback = GlobalInfoRecorder.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(sendsimplerpcjsapi.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1595850717, (boolean) r0, new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda4(clearprocesscacheOnExtraCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                    getProductVersion getproductversion = getProductVersion.onNavigationEvent;
                    Function2 function2OnNavigationEvent = getproductversion.onNavigationEvent();
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    }
                    Function1 function12 = (Function1) objOnMinimized;
                    if ((i10 & 896) == 256) {
                    }
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((i5 | (zOnNavigationEvent ? 1 : 0)) == 0) {
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 1) != 0) {
                        int i17 = IAuthTabCallback;
                        int i18 = i17 + 85;
                        onNavigationEvent = i18 % 128;
                        i10 = i18 % 2 != 0 ? i10 & 117 : i10 & (-15);
                        int i19 = i17 + 87;
                        onNavigationEvent = i19 % 128;
                        int i20 = i19 % 2;
                        assetDepositHomeEditViewModel4 = assetDepositHomeEditViewModel2;
                        r0 = 1;
                        i4 = 0;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1512469210, i10, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetDepositHomeDeleteScreen (AssetDepositHomeDeleteScreen.kt:44)");
                        }
                        clearProcessCache clearprocesscacheOnExtraCallback2 = GlobalInfoRecorder.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(sendsimplerpcjsapi.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-1595850717, (boolean) r0, new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda4(clearprocesscacheOnExtraCallback2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                        getProductVersion getproductversion2 = getProductVersion.onNavigationEvent;
                        Function2 function2OnNavigationEvent2 = getproductversion2.onNavigationEvent();
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda5();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        Function1 function122 = (Function1) objOnMinimized;
                        i5 = (i10 & 896) == 256 ? r0 : i4;
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback2);
                        Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((i5 | (zOnNavigationEvent ? 1 : 0)) == 0) {
                            Object obj = objOnMinimized22;
                            if (objOnMinimized22 == onwarmupcompleted.onExtraCallback()) {
                                AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda6(function1, clearprocesscacheOnExtraCallback2);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda6);
                                obj = externalSyntheticLambda6;
                            }
                            Function1 function13 = (Function1) obj;
                            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback2);
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            Object obj2 = null;
                            if (!zOnNavigationEvent2) {
                                int i21 = onNavigationEvent + 43;
                                IAuthTabCallback = i21 % 128;
                                if (i21 % 2 == 0) {
                                    onwarmupcompleted.onExtraCallback();
                                    throw null;
                                }
                                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized3 = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda7(clearprocesscacheOnExtraCallback2);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                }
                                GlobalInfoRecorder.onWarmupCompleted(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -872906731, 872906732, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{clearprocesscacheOnExtraCallback2, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, function2OnNavigationEvent2, function122, function13, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3504}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, (int) r0, (Object) null);
                                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                    int i22 = IAuthTabCallback + 13;
                                    onNavigationEvent = i22 % 128;
                                    if (i22 % 2 != 0) {
                                        getAwbState.onExtraCallback();
                                        obj2.hashCode();
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
                                y1ExternalSyntheticLambda6.onExtraCallbackWithResult(getproductversion2.onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 384, 12286);
                                getDensity getdensity = (getDensity) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(assetDepositHomeEditViewModel4.onWarmupCompleted(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult();
                                if (getdensity instanceof getDensity.onNavigationEvent) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1714470688);
                                    Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                                    getRpcProxy getrpcproxyOnNavigationEvent = RVRpcProxy.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, onextracallback, 1.0f, false, 2, (Object) null);
                                    DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnNavigationEvent = StillCaptureFlashStopRepeatingQuirk.onNavigationEvent(ZslDisablerQuirk.onExtraCallbackWithResult(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getdensity);
                                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(resources);
                                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getrpcproxyOnNavigationEvent);
                                    boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback2);
                                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!(zOnNavigationEvent3 | zOnExtraCallback | zOnNavigationEvent4 | zOnExtraCallback2 | zOnNavigationEvent5)) {
                                        Object obj3 = objOnMinimized4;
                                        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                            AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda8(getdensity, resources, getrpcproxyOnNavigationEvent, clearprocesscacheOnExtraCallback2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda8);
                                            obj3 = externalSyntheticLambda8;
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent, (Camera2CameraMetadataExternalSyntheticLambda1) null, deviceQuirksExternalSyntheticLambda0OnNavigationEvent, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 506);
                                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                    }
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1708026222);
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                }
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    int i23 = onNavigationEvent + 105;
                                    IAuthTabCallback = i23 % 128;
                                    int i24 = i23 % 2;
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                assetDepositHomeEditViewModel3 = assetDepositHomeEditViewModel4;
                            }
                        }
                    }
                }
                z = true;
                i4 = 0;
                assetDepositHomeEditViewModel4 = assetDepositHomeEditViewModel2;
                r0 = z;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                clearProcessCache clearprocesscacheOnExtraCallback22 = GlobalInfoRecorder.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback22 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(sendsimplerpcjsapi.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback22 = ForwardingCameraControl.onExtraCallback(-1595850717, (boolean) r0, new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda4(clearprocesscacheOnExtraCallback22), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                getProductVersion getproductversion22 = getProductVersion.onNavigationEvent;
                Function2 function2OnNavigationEvent22 = getproductversion22.onNavigationEvent();
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                }
                Function1 function1222 = (Function1) objOnMinimized;
                if ((i10 & 896) == 256) {
                }
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback22);
                Object objOnMinimized222 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((i5 | (zOnNavigationEvent ? 1 : 0)) == 0) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            assetDepositHomeEditViewModel3 = assetDepositHomeEditViewModel2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetDepositHomeDeleteScreenKt$.ExternalSyntheticLambda9(assetDepositHomeEditViewModel3, sendsimplerpcjsapi, function1, i, i2));
        }
    }

    private static final boolean onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
        int i4 = onNavigationEvent + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return zBooleanValue;
    }

    public static /* synthetic */ Unit onNavigationEvent(toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{iAuthTabCallback}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -222766803, iOnNavigationEvent2, iOnNavigationEvent, 222766803);
    }

    public static /* synthetic */ Unit onNavigationEvent(clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{clearprocesscache, iAuthTabCallback}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -96066133, iOnNavigationEvent2, iOnNavigationEvent, 96066139);
    }

    public static /* synthetic */ Unit IAuthTabCallback(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1521924307, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, 1521924308);
    }

    public static /* synthetic */ Unit IAuthTabCallback(getRpcProxy getrpcproxy, toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{getrpcproxy, iAuthTabCallback}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -941326455, iOnNavigationEvent2, iOnNavigationEvent, 941326460);
    }

    private static final Unit IAuthTabCallbackStub(toJSONObject.IAuthTabCallback iAuthTabCallback, clearProcessCache clearprocesscache, toJSONObject.IAuthTabCallback iAuthTabCallback2) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{iAuthTabCallback, clearprocesscache, iAuthTabCallback2}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1073252282, iOnNavigationEvent2, iOnNavigationEvent, -1073252280);
    }

    private static final Unit IAuthTabCallbackDefault(getRpcProxy getrpcproxy, toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{getrpcproxy, iAuthTabCallback}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1882576941, iOnNavigationEvent2, iOnNavigationEvent, 1882576944);
    }

    private static final Unit IAuthTabCallbackDefault(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1991059081, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, -1991059077);
    }

    private static final Unit IAuthTabCallbackStub(getRpcProxy getrpcproxy, toJSONObject.IAuthTabCallback iAuthTabCallback) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{getrpcproxy, iAuthTabCallback}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -942853179, iOnNavigationEvent2, iOnNavigationEvent, 942853186);
    }
}
