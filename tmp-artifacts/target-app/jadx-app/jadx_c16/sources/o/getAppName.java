package o;

import android.content.res.Resources;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.features.home.feature.asset_home.R;
import im.toss.features.home.feature.asset_home.compose.edit.screen.AssetInvestmentHomeDeleteScreenKt$;
import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetInvestmentHomeEditViewModel;
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
import o.getRelativeTop;
import o.toPreviewOnlyRange;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getAppName {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = (~i2) | i8;
        int i10 = i7 | (~i9);
        int i11 = i2 | i8;
        int i12 = ~(i9 | i);
        int i13 = i4 + i + i6 + (1075552530 * i5) + ((-1519595880) * i3);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i4) - 1639710720) + ((-2116975300) * i) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i6) + ((-189792256) * i5) + (1111490560 * i3) + (1415839744 * i14);
        int i16 = (i4 * 251836610) + 257048825 + (i * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i6 * 251837547) + (i5 * 1710852742) + (i3 * (-1855850104)) + (i14 * (-1244921856));
        int i17 = i15 + (i16 * i16 * (-1300496384));
        if (i17 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i17 == 2) {
            return onExtraCallback(objArr);
        }
        if (i17 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i17 == 4) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 == 5) {
            return onNavigationEvent(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        clearProcessCache clearprocesscache = (clearProcessCache) objArr[1];
        toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted = (toJSONObject$onWarmupCompleted) objArr[2];
        int i18 = 2 % 2;
        int i19 = IAuthTabCallback + 113;
        onExtraCallback = i19 % 128;
        int i20 = i19 % 2;
        Unit unit = (Unit) IAuthTabCallback(new Object[]{function1, clearprocesscache, tojsonobject_onwarmupcompleted}, -1498351835, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1498351840, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult());
        int i21 = IAuthTabCallback + 15;
        onExtraCallback = i21 % 128;
        int i22 = i21 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AssetInvestmentHomeEditViewModel assetInvestmentHomeEditViewModel, sendSimpleRpcJsapi sendsimplerpcjsapi, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 3;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(assetInvestmentHomeEditViewModel, sendsimplerpcjsapi, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 15;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getRelativeTop getrelativetop, Resources resources, getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getrelativetop, resources, getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, audioRestrictionControllerImplExternalSyntheticLambda0);
        int i4 = IAuthTabCallback + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, tojsonobject_onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 13;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted = (toJSONObject$onWarmupCompleted) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(tojsonobject_onwarmupcompleted);
        }
        onWarmupCompleted(tojsonobject_onwarmupcompleted);
        throw null;
    }

    private static final Unit onExtraCallback(AssetInvestmentHomeEditViewModel assetInvestmentHomeEditViewModel, sendSimpleRpcJsapi sendsimplerpcjsapi, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(assetInvestmentHomeEditViewModel, sendsimplerpcjsapi, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 111;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, tojsonobject_onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 86 / 0;
        }
        int i7 = onExtraCallback + 89;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 96 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted, clearProcessCache clearprocesscache, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(new Object[]{tojsonobject_onwarmupcompleted, clearprocesscache, tojsonobject_onwarmupcompleted2}, 594203704, iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), -594203701, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i4 = onExtraCallback + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getRpcProxy getrpcproxy = (getRpcProxy) objArr[0];
        toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted = (toJSONObject$onWarmupCompleted) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(getrpcproxy, tojsonobject_onwarmupcompleted);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = onExtraCallback + 45;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(clearProcessCache clearprocesscache, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(clearprocesscache, tojsonobject_onwarmupcompleted);
        int i4 = IAuthTabCallback + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getRpcProxy getrpcproxy, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getrpcproxy, tojsonobject_onwarmupcompleted);
        int i4 = IAuthTabCallback + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted, clearProcessCache clearprocesscache, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(tojsonobject_onwarmupcompleted, clearprocesscache, tojsonobject_onwarmupcompleted2);
        int i4 = IAuthTabCallback + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getRpcProxy getrpcproxy, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = alertWithArgs.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(new Object[]{getrpcproxy, tojsonobject_onwarmupcompleted}, 2089940825, iOnExtraCallbackWithResult3, alertWithArgs.onExtraCallbackWithResult(), -2089940824, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4);
        int i3 = IAuthTabCallback + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted, clearProcessCache clearprocesscache, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tojsonobject_onwarmupcompleted, clearprocesscache, tojsonobject_onwarmupcompleted2);
        int i4 = IAuthTabCallback + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, tojsonobject_onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 115;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onWarmupCompleted(toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tojsonobject_onwarmupcompleted, "");
        RVRpcProxy.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, tojsonobject_onwarmupcompleted.IAuthTabCallbackStub(), "investment");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        clearProcessCache clearprocesscache = (clearProcessCache) objArr[1];
        toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted = (toJSONObject$onWarmupCompleted) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tojsonobject_onwarmupcompleted, "");
        RVRpcProxy.onExtraCallbackWithResult(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, tojsonobject_onwarmupcompleted.IAuthTabCallbackStub(), "investment", true);
        function1.invoke(clearprocesscache.onWarmupCompleted());
        clearprocesscache.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(clearProcessCache clearprocesscache, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tojsonobject_onwarmupcompleted, "");
        RVRpcProxy.onExtraCallbackWithResult(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, tojsonobject_onwarmupcompleted.IAuthTabCallbackStub(), "investment", false);
        clearprocesscache.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(getRpcProxy getrpcproxy, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        getrpcproxy.onNavigationEvent(tojsonobject_onwarmupcompleted, "investment", "investment", i2 % 2 != 0);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted = (toJSONObject$onWarmupCompleted) objArr[0];
        clearProcessCache clearprocesscache = (clearProcessCache) objArr[1];
        toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted2 = (toJSONObject$onWarmupCompleted) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tojsonobject_onwarmupcompleted2, "");
            RVRpcProxy.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) tojsonobject_onwarmupcompleted, "investment", "investment", true);
        } else {
            Intrinsics.checkNotNullParameter(tojsonobject_onwarmupcompleted2, "");
            RVRpcProxy.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) tojsonobject_onwarmupcompleted, "investment", "investment", false);
        }
        clearprocesscache.onExtraCallbackWithResult(tojsonobject_onwarmupcompleted);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        boolean zOnNavigationEvent;
        int i3 = i2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(tojsonobject_onwarmupcompleted, "");
        if ((i3 & 384) == 0) {
            i3 |= (i3 & 512) == 0 ? cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(tojsonobject_onwarmupcompleted) : cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(tojsonobject_onwarmupcompleted) ? 256 : 128;
        }
        boolean z2 = false;
        if ((i3 & 1153) != 1152) {
            z = true;
        } else {
            int i5 = IAuthTabCallback + 95;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2033365129, i3, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetInvestmentHomeDeleteScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetInvestmentHomeDeleteScreen.kt:120)");
            }
            boolean zOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i7 = i3 & 896;
            boolean z3 = i7 == 256 || ((i3 & 512) != 0 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(tojsonobject_onwarmupcompleted));
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback2 | z3)) {
                int i8 = IAuthTabCallback + 109;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda10(getrpcproxy, tojsonobject_onwarmupcompleted);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda10);
                    obj2 = externalSyntheticLambda10;
                }
                Function0 function0 = (Function0) obj2;
                if (i7 != 256) {
                    int i9 = IAuthTabCallback;
                    int i10 = i9 + 105;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 == 0 ? (i3 & 512) != 0 : (i3 & 17581) != 0) {
                        int i11 = i9 + 17;
                        onExtraCallback = i11 % 128;
                        if (i11 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(tojsonobject_onwarmupcompleted);
                        } else if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(tojsonobject_onwarmupcompleted)) {
                        }
                        z2 = true;
                    }
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent | z2) {
                        Object obj3 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda11(tojsonobject_onwarmupcompleted, clearprocesscache);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda11);
                            obj3 = externalSyntheticLambda11;
                        }
                        putConfigCache.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, tojsonobject_onwarmupcompleted, false, zOnExtraCallback, function0, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResult, (i3 >> 3) & 112, 5);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                } else {
                    z2 = true;
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
                    Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent | z2) {
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
        toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted = (toJSONObject$onWarmupCompleted) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getrpcproxy.onNavigationEvent(tojsonobject_onwarmupcompleted, "investment", "pension", false);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted, clearProcessCache clearprocesscache, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tojsonobject_onwarmupcompleted2, "");
        RVRpcProxy.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, (toJSONObject) tojsonobject_onwarmupcompleted, "investment", "pension", false);
        clearprocesscache.onExtraCallbackWithResult(tojsonobject_onwarmupcompleted);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        boolean zOnExtraCallback;
        int i3 = i2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(tojsonobject_onwarmupcompleted, "");
        if ((i3 & 384) == 0) {
            if ((i3 & 512) == 0) {
                int i5 = IAuthTabCallback + 9;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(tojsonobject_onwarmupcompleted);
            } else {
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(tojsonobject_onwarmupcompleted);
            }
            i3 |= zOnExtraCallback ? 256 : 128;
            int i7 = IAuthTabCallback + 103;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 / 2;
            }
        }
        boolean z2 = true;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 1153) != 1152, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallback + 103;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1636184818, i3, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetInvestmentHomeDeleteScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetInvestmentHomeDeleteScreen.kt:148)");
            }
            boolean zOnExtraCallback2 = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i11 = i3 & 896;
            if (i11 != 256) {
                int i12 = onExtraCallback + 125;
                int i13 = i12 % 128;
                IAuthTabCallback = i13;
                int i14 = i12 % 2;
                if ((i3 & 512) != 0) {
                    int i15 = i13 + 25;
                    onExtraCallback = i15 % 128;
                    int i16 = i15 % 2;
                    if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(tojsonobject_onwarmupcompleted)) {
                        z = true;
                    }
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback3 | z) {
                        Object obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda0(getrpcproxy, tojsonobject_onwarmupcompleted);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                            int i17 = IAuthTabCallback + 79;
                            onExtraCallback = i17 % 128;
                            int i18 = i17 % 2;
                            obj = externalSyntheticLambda0;
                        }
                        Function0 function0 = (Function0) obj;
                        if (i11 != 256) {
                            int i19 = onExtraCallback + 5;
                            IAuthTabCallback = i19 % 128;
                            int i20 = i19 % 2;
                            if ((i3 & 512) == 0 || !cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(tojsonobject_onwarmupcompleted)) {
                                z2 = false;
                            }
                        }
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if ((zOnNavigationEvent | z2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized2 = new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda1(tojsonobject_onwarmupcompleted, clearprocesscache);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                        }
                        putConfigCache.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, tojsonobject_onwarmupcompleted, false, zOnExtraCallback2, function0, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, (i3 >> 3) & 112, 5);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i21 = onExtraCallback + 7;
                            IAuthTabCallback = i21 % 128;
                            int i22 = i21 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
                z = false;
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback3 | z) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(getRpcProxy getrpcproxy, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getRpcProxy.onExtraCallback(getrpcproxy, tojsonobject_onwarmupcompleted, "investment", (String) null, false, 5, (Object) null);
        } else {
            getRpcProxy.onExtraCallback(getrpcproxy, tojsonobject_onwarmupcompleted, "investment", (String) null, true, 4, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 35;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onTransact(toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted, clearProcessCache clearprocesscache, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tojsonobject_onwarmupcompleted2, "");
        Object[] objArr = {ConvertFloatArrayToByteArray.onExtraCallbackWithResult, tojsonobject_onwarmupcompleted, "investment", null, true, 4, null};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        RVRpcProxy.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1140895382, 1140895395, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
        clearprocesscache.onExtraCallbackWithResult(tojsonobject_onwarmupcompleted);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 93;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStub(getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        boolean zOnNavigationEvent;
        int i3 = i2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(tojsonobject_onwarmupcompleted, "");
        if ((i3 & 384) == 0) {
            int i5 = IAuthTabCallback + 117;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0 ? (i3 & 512) != 0 : (i3 & 6080) != 0) {
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(tojsonobject_onwarmupcompleted);
            } else {
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(tojsonobject_onwarmupcompleted);
                int i6 = IAuthTabCallback + 95;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            i3 |= zOnNavigationEvent ? 256 : 128;
        }
        boolean z2 = false;
        if ((i3 & 1153) != 1152) {
            int i8 = onExtraCallback + 41;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1426651183, i3, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetInvestmentHomeDeleteScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetInvestmentHomeDeleteScreen.kt:176)");
            }
            boolean zOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getrpcproxy);
            int i10 = i3 & 896;
            boolean z3 = i10 == 256 || ((i3 & 512) != 0 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(tojsonobject_onwarmupcompleted));
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback2 | z3)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda12 externalSyntheticLambda12 = new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda12(getrpcproxy, tojsonobject_onwarmupcompleted);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda12);
                    int i11 = IAuthTabCallback + 47;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    obj = externalSyntheticLambda12;
                }
                Function0 function0 = (Function0) obj;
                if (i10 != 256) {
                    int i13 = IAuthTabCallback;
                    int i14 = i13 + 91;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    if ((i3 & 512) != 0) {
                        int i16 = i13 + 115;
                        onExtraCallback = i16 % 128;
                        int i17 = i16 % 2;
                        if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(tojsonobject_onwarmupcompleted)) {
                            z2 = true;
                        }
                    }
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(clearprocesscache);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent2 | z2)) {
                        int i18 = IAuthTabCallback + 95;
                        onExtraCallback = i18 % 128;
                        if (i18 % 2 != 0) {
                            CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                            throw null;
                        }
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized2 = new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda13(tojsonobject_onwarmupcompleted, clearprocesscache);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                        }
                        putConfigCache.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, tojsonobject_onwarmupcompleted, true, zOnExtraCallback, function0, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, ((i3 >> 3) & 112) | 384, 1);
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

    private static final Unit onWarmupCompleted(getRelativeTop getrelativetop, Resources resources, getRpcProxy getrpcproxy, clearProcessCache clearprocesscache, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) throws Resources.NotFoundException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        getRelativeTop.onWarmupCompleted onwarmupcompleted = (getRelativeTop.onWarmupCompleted) getrelativetop;
        List listOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted();
        String string = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_investment);
        Intrinsics.checkNotNullExpressionValue(string, "");
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listOnWarmupCompleted, string, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(2033365129, true, new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda7(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6)), 9, (Object) null);
        List listOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
        String string2 = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_pension);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listOnExtraCallbackWithResult, string2, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(1636184818, true, new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda8(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6)), 9, (Object) null);
        List listOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
        String string3 = resources.getString(R.string.home_v2_feature_asset_home_edit_category_section_header_hidden);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        RVConfigService.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (String) null, listOnNavigationEvent, string3, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallbackWithResult(-1426651183, true, new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda9(getrpcproxy, clearprocesscache, cameraPresenceProviderExternalSyntheticLambda6)), 9, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@Nullable AssetInvestmentHomeEditViewModel assetInvestmentHomeEditViewModel, @NotNull sendSimpleRpcJsapi sendsimplerpcjsapi, @NotNull Function1<? super toJSONObject$onWarmupCompleted, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        AssetInvestmentHomeEditViewModel assetInvestmentHomeEditViewModel2;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        AssetInvestmentHomeEditViewModel assetInvestmentHomeEditViewModel3;
        int i4;
        int i5;
        AssetInvestmentHomeEditViewModel assetInvestmentHomeEditViewModel4;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        int i6;
        boolean zOnNavigationEvent;
        Object obj;
        boolean zOnNavigationEvent2;
        Object objOnMinimized2;
        getRelativeTop getrelativetop;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = IAuthTabCallback + 61;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(sendsimplerpcjsapi, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-608866411);
        if ((i & 6) == 0) {
            int i12 = onExtraCallback + 73;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 == 0 || (i2 & 1) == 0) {
                assetInvestmentHomeEditViewModel2 = assetInvestmentHomeEditViewModel;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetInvestmentHomeEditViewModel2)) {
                    i8 = 4;
                }
                i3 = i8 | i;
            } else {
                assetInvestmentHomeEditViewModel2 = assetInvestmentHomeEditViewModel;
            }
            i8 = 2;
            i3 = i8 | i;
        } else {
            assetInvestmentHomeEditViewModel2 = assetInvestmentHomeEditViewModel;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sendsimplerpcjsapi) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i13 = onExtraCallback + 51;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                i7 = 128;
            } else {
                int i15 = IAuthTabCallback + 99;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                i7 = 256;
            }
            i3 |= i7;
        }
        int i17 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i17 & 147) != 146, i17 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((i2 & 1) != 0) {
                    TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    i4 = 0;
                    i5 = i17 & (-15);
                    assetInvestmentHomeEditViewModel4 = (AssetInvestmentHomeEditViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(AssetInvestmentHomeEditViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                } else {
                    i4 = 0;
                    assetInvestmentHomeEditViewModel4 = assetInvestmentHomeEditViewModel2;
                    i5 = i17;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-608866411, i5, -1, "im.toss.features.home.feature.asset_home.compose.edit.screen.AssetInvestmentHomeDeleteScreen (AssetInvestmentHomeDeleteScreen.kt:44)");
                }
                clearProcessCache clearprocesscacheOnExtraCallback = GlobalInfoRecorder.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(sendsimplerpcjsapi.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                getTopActivity gettopactivity = getTopActivity.onExtraCallback;
                getBacktraceNote getbacktracenoteOnNavigationEvent = gettopactivity.onNavigationEvent();
                Function2 function2OnExtraCallback = gettopactivity.onExtraCallback();
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda2();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    int i18 = IAuthTabCallback + 113;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                }
                Function1 function12 = (Function1) objOnMinimized;
                if ((i5 & 896) != 256) {
                    int i20 = onExtraCallback + 101;
                    IAuthTabCallback = i20 % 128;
                    int i21 = i20 % 2;
                    i6 = 1;
                } else {
                    i6 = i4;
                }
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((i6 | (zOnNavigationEvent ? 1 : 0)) != 0) {
                    int i22 = IAuthTabCallback + 71;
                    onExtraCallback = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i23 = 87 / i4;
                        obj = objOnMinimized3;
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda3(function1, clearprocesscacheOnExtraCallback);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda3);
                            obj = externalSyntheticLambda3;
                        }
                        Function1 function13 = (Function1) obj;
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback);
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnNavigationEvent2 || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized2 = new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda4(clearprocesscacheOnExtraCallback);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        GlobalInfoRecorder.onWarmupCompleted(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -872906731, 872906732, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{clearprocesscacheOnExtraCallback, getbacktracenoteOnNavigationEvent, function2OnExtraCallback, function12, function13, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3504}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
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
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                            int i24 = IAuthTabCallback + 101;
                            onExtraCallback = i24 % 128;
                            int i25 = i24 % 2;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                        y1ExternalSyntheticLambda6.onExtraCallbackWithResult(gettopactivity.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 384, 12286);
                        getrelativetop = (getRelativeTop) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback((setRubIn) AssetInvestmentHomeEditViewModel.onExtraCallbackWithResult(-287770246, 287770247, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{assetInvestmentHomeEditViewModel4}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult()), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult();
                        if (getrelativetop instanceof getRelativeTop.onWarmupCompleted) {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-814929917);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-818933443);
                            Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                            getRpcProxy getrpcproxyOnNavigationEvent = RVRpcProxy.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, onextracallback, 1.0f, false, 2, (Object) null);
                            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnNavigationEvent = StillCaptureFlashStopRepeatingQuirk.onNavigationEvent(ZslDisablerQuirk.onExtraCallbackWithResult(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getrelativetop);
                            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(resources);
                            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getrpcproxyOnNavigationEvent);
                            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback);
                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(zOnNavigationEvent3 | zOnExtraCallback | zOnNavigationEvent4 | zOnExtraCallback2 | zOnNavigationEvent5)) {
                                Object obj2 = objOnMinimized4;
                                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                    AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda5(getrelativetop, resources, getrpcproxyOnNavigationEvent, clearprocesscacheOnExtraCallback, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda5);
                                    obj2 = externalSyntheticLambda5;
                                }
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent, (Camera2CameraMetadataExternalSyntheticLambda1) null, deviceQuirksExternalSyntheticLambda0OnNavigationEvent, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 506);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        assetInvestmentHomeEditViewModel3 = assetInvestmentHomeEditViewModel4;
                    } else {
                        obj = objOnMinimized3;
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        }
                        Function1 function132 = (Function1) obj;
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback);
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnNavigationEvent2) {
                            objOnMinimized2 = new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda4(clearprocesscacheOnExtraCallback);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            GlobalInfoRecorder.onWarmupCompleted(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -872906731, 872906732, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{clearprocesscacheOnExtraCallback, getbacktracenoteOnNavigationEvent, function2OnExtraCallback, function12, function132, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3504}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback2, 0.0f, 1, (Object) null);
                            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
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
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(gettopactivity.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 384, 12286);
                            getrelativetop = (getRelativeTop) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback((setRubIn) AssetInvestmentHomeEditViewModel.onExtraCallbackWithResult(-287770246, 287770247, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{assetInvestmentHomeEditViewModel4}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult()), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult();
                            if (getrelativetop instanceof getRelativeTop.onWarmupCompleted) {
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            assetInvestmentHomeEditViewModel3 = assetInvestmentHomeEditViewModel4;
                        }
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i2 & 1) != 0) {
                    i5 = i17 & (-15);
                    assetInvestmentHomeEditViewModel4 = assetInvestmentHomeEditViewModel2;
                    i4 = 0;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                clearProcessCache clearprocesscacheOnExtraCallback2 = GlobalInfoRecorder.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(sendsimplerpcjsapi.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                getTopActivity gettopactivity2 = getTopActivity.onExtraCallback;
                getBacktraceNote getbacktracenoteOnNavigationEvent2 = gettopactivity2.onNavigationEvent();
                Function2 function2OnExtraCallback2 = gettopactivity2.onExtraCallback();
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                }
                Function1 function122 = (Function1) objOnMinimized;
                if ((i5 & 896) != 256) {
                }
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(clearprocesscacheOnExtraCallback2);
                Object objOnMinimized32 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((i6 | (zOnNavigationEvent ? 1 : 0)) != 0) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            assetInvestmentHomeEditViewModel3 = assetInvestmentHomeEditViewModel2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetInvestmentHomeDeleteScreenKt$.ExternalSyntheticLambda6(assetInvestmentHomeEditViewModel3, sendsimplerpcjsapi, function1, i, i2));
        }
    }

    private static final boolean onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, clearProcessCache clearprocesscache, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(new Object[]{function1, clearprocesscache, tojsonobject_onwarmupcompleted}, -632439532, iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), 632439532, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit IAuthTabCallback(getRpcProxy getrpcproxy, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(new Object[]{getrpcproxy, tojsonobject_onwarmupcompleted}, 1232941614, iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), -1232941610, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onExtraCallback(toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(new Object[]{tojsonobject_onwarmupcompleted}, -772303993, iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), 772303995, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private static final Unit onExtraCallback(Function1 function1, clearProcessCache clearprocesscache, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(new Object[]{function1, clearprocesscache, tojsonobject_onwarmupcompleted}, -1498351835, iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), 1498351840, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private static final Unit IAuthTabCallback(toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted, clearProcessCache clearprocesscache, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted2) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(new Object[]{tojsonobject_onwarmupcompleted, clearprocesscache, tojsonobject_onwarmupcompleted2}, 594203704, iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), -594203701, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private static final Unit onWarmupCompleted(getRpcProxy getrpcproxy, toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(new Object[]{getrpcproxy, tojsonobject_onwarmupcompleted}, 2089940825, iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), -2089940824, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }
}
