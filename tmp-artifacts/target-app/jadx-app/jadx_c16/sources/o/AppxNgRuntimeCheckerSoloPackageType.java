package o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zziea;
import com.initech.xsafe.cert.INIXSAFEProtocolException;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.otaliastudios.cameraview.R$styleable;
import im.toss.features.home.core.model.asset.edit.AssetForEditV2Dto;
import im.toss.features.home.ui.R;
import im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2ScreenKt$;
import im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2ScreenKt$AssetHomeEditV2Content$3$1$1$;
import im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2ScreenKt$AssetHomeEditV2Screen$6$1$;
import im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2ViewModel;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.compose.component.atom.image.ResourceSizeKt;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.MaxRewardedInterstitialAdapter;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.UpdatePluginCallback;
import o.WebSocketFactory;
import o.access;
import o.drawEmptyStars;
import o.getViewTypeCount;
import o.oExternalSyntheticLambda0;
import o.readFully;
import o.setByteOrder;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.wa;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AppxNgRuntimeCheckerSoloPackageType {
    private static int IAuthTabCallback;
    private static byte[] IAuthTabCallbackDefault;
    private static short[] IAuthTabCallbackStub;
    private static int asInterface;
    private static int onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {79, 23, 89, 11};
    private static final int $$b = 41;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, byte b) {
        int i2;
        byte[] bArr = $$a;
        int i3 = (b * 3) + 115;
        int i4 = s * 2;
        int i5 = 3 - (i * 2);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            int i8 = 0;
            int i9 = i5;
            int i10 = i5 + i7;
            i2 = i8;
            int i11 = i9;
            i3 = i10;
            i5 = i11;
            int i12 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i13 = i3;
            i9 = i12;
            i5 = bArr[i12];
            i7 = i13;
            int i102 = i5 + i7;
            i2 = i8;
            int i112 = i9;
            i3 = i102;
            i5 = i112;
            int i122 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1222 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NetworkStream networkStream = (NetworkStream) objArr[0];
        List list = (List) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        Function1 function1 = (Function1) objArr[3];
        Function1 function12 = (Function1) objArr[4];
        Function2 function2 = (Function2) objArr[5];
        Function1 function13 = (Function1) objArr[6];
        Function2 function22 = (Function2) objArr[7];
        Function1 function14 = (Function1) objArr[8];
        Function2 function23 = (Function2) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue2 = ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(networkStream, list, zBooleanValue, function1, function12, function2, function13, function22, function14, function23, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 73;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Context context, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 117;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(context, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 29;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, Context context, Function0 function0, getRuntimeSupportMax getruntimesupportmax, Resources resources) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(assetHomeEditV2ViewModel, context, function0, getruntimesupportmax, resources);
        int i4 = onTransact + 19;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 99;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(assetHomeEditV2ViewModel, getruntimesupportmax, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 89;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(function0);
        }
        onExtraCallbackWithResult(function0);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(UpdatePluginCallback.IAuthTabCallback.IAuthTabCallback iAuthTabCallback, boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 73;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(iAuthTabCallback, z, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onTransact + 63;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 69;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(onextracallbackwithresult, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 77;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static final Unit IAuthTabCallback(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, boolean z, boolean z2, needCheckSnapshotMd5 needchecksnapshotmd5, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 31;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(onextracallbackwithresult, z, z2, needchecksnapshotmd5, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 45;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getRuntimeSupportMax getruntimesupportmax, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getruntimesupportmax, assetHomeEditV2ViewModel);
        int i4 = onTransact + 15;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getRuntimeSupportMax getruntimesupportmax, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(getruntimesupportmax, assetHomeEditV2ViewModel, dialogInterface);
        }
        onNavigationEvent(getruntimesupportmax, assetHomeEditV2ViewModel, dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, Resources resources, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(z, resources, useandconfigureprogramwithtexture);
        int i4 = asBinder + 1;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        MaxAppOpenAdapterListener maxAppOpenAdapterListener = (MaxAppOpenAdapterListener) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Function1 function1 = (Function1) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(maxAppOpenAdapterListener, zBooleanValue, function1, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = asBinder + 121;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 103;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(function1);
        }
        onExtraCallback(function1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        getRuntimeSupportMax getruntimesupportmax = (getRuntimeSupportMax) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        DialogInterface dialogInterface = (DialogInterface) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getruntimesupportmax, function0, dialogInterface);
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        int i5 = asBinder + 43;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object access100(Object[] objArr) throws Throwable {
        UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Resources resources = (Resources) objArr[2];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[3];
        RightPreset rightPreset = (RightPreset) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onwarmupcompleted, zBooleanValue, resources, getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = asBinder + 77;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getRuntimeSupportMax getruntimesupportmax = (getRuntimeSupportMax) objArr[0];
        Resources resources = (Resources) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        AssetHomeEditV2ViewModel assetHomeEditV2ViewModel = (AssetHomeEditV2ViewModel) objArr[3];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[4];
        int i = 2 % 2;
        int i2 = asBinder + 53;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(getruntimesupportmax, resources, function0, assetHomeEditV2ViewModel, commonModule_setLeftEdgeTouchEnabled);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(getruntimesupportmax, resources, function0, assetHomeEditV2ViewModel, commonModule_setLeftEdgeTouchEnabled);
        int i3 = onTransact + 53;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        getRuntimeSupportMax getruntimesupportmax = (getRuntimeSupportMax) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getruntimesupportmax, findresandmsg, str);
        int i4 = onTransact + 101;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onTransact + 83;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        Context context = (Context) objArr[0];
        UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = (UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult) objArr[1];
        w3b w3bVar = (w3b) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -689007913, 689007930, new Object[]{context, onextracallbackwithresult, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        int i4 = onTransact + 41;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = (~(i7 | i8 | i5)) | (~(i3 | i2 | i5));
        int i10 = ~i5;
        int i11 = (~(i8 | i3)) | (~(i8 | i10));
        int i12 = (~(i5 | i2)) | (~(i7 | i10));
        int i13 = i3 + i2 + i + ((-564018846) * i4) + (483938512 * i6);
        int i14 = i13 * i13;
        int i15 = (1473915126 * i3) + 752877568 + ((-1516524009) * i2) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i) + (1390411776 * i4) + (452984832 * i6) + ((-1135738880) * i14);
        int i16 = ((i3 * 1456092922) - 824780772) + (i2 * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (i * 1456093799) + (i4 * 578355822) + (i6 * 1098359728) + (i14 * 1868693504);
        switch (i15 + (i16 * i16 * 2110914560)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                getRuntimeSupportMax getruntimesupportmax = (getRuntimeSupportMax) objArr[0];
                Context context = (Context) objArr[1];
                Function0 function0 = (Function0) objArr[2];
                CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[3];
                int i17 = 2 % 2;
                Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
                int i18 = R.string.home_ui_asset_edit_delete_dialog_title;
                String string = context.getString(i18);
                Intrinsics.checkNotNullExpressionValue(string, "");
                int i19 = R.string.home_ui_asset_edit_delete_dialog_message;
                String string2 = context.getString(i19);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getruntimesupportmax.IAuthTabCallback(string, string2);
                commonModule_setLeftEdgeTouchEnabled.onExtraCallback(context.getString(i18));
                commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(context.getString(i19));
                CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.home_ui_remove, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DANGER, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 14, (DefaultConstructorMarker) null), false, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda34(getruntimesupportmax, function0), 4, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.home_ui_close, (TdsButtonV1View.asInterface) null, false, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda35(getruntimesupportmax), 6, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda36(getruntimesupportmax));
                Unit unit = Unit.INSTANCE;
                int i20 = onTransact + 35;
                asBinder = i20 % 128;
                int i21 = i20 % 2;
                return unit;
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                List list = (List) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                Function1 function1 = (Function1) objArr[2];
                Function2 function2 = (Function2) objArr[3];
                Function1 function12 = (Function1) objArr[4];
                Function2 function22 = (Function2) objArr[5];
                Function1 function13 = (Function1) objArr[6];
                AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0 = (AudioRestrictionControllerImplExternalSyntheticLambda0) objArr[7];
                int i22 = 2 % 2;
                Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
                audioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback(list.size(), new onNavigationEvent(new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda37(), list), new asInterface(list), ForwardingCameraControl.onExtraCallbackWithResult(2039820996, true, new IAuthTabCallbackDefault(list, zBooleanValue, function1, function2, function12, function22, function13)));
                Unit unit2 = Unit.INSTANCE;
                int i23 = onTransact + 57;
                asBinder = i23 % 128;
                int i24 = i23 % 2;
                return unit2;
            case 10:
                return asBinder(objArr);
            case 11:
                Function1 function14 = (Function1) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i25 = 2 % 2;
                int i26 = asBinder + 81;
                onTransact = i26 % 128;
                int i27 = i26 % 2;
                function14.invoke(Boolean.valueOf(!zBooleanValue2));
                return Unit.INSTANCE;
            case 12:
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
                flipHorizontally fliphorizontally = (flipHorizontally) objArr[1];
                int i28 = 2 % 2;
                int i29 = onTransact + 73;
                asBinder = i29 % 128;
                int i30 = i29 % 2;
                Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, fliphorizontally);
                int i31 = asBinder + 81;
                onTransact = i31 % 128;
                int i32 = i31 % 2;
                return unitOnNavigationEvent;
            case 13:
                return IAuthTabCallbackStub(objArr);
            case 14:
                return getInterfaceDescriptor(objArr);
            case 15:
                return IAuthTabCallbackStubProxy(objArr);
            case 16:
                NetworkStream networkStream = (NetworkStream) objArr[0];
                setUseCaseAttached setusecaseattached = (setUseCaseAttached) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i33 = 2 % 2;
                int i34 = onTransact + 41;
                asBinder = i34 % 128;
                int i35 = i34 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(networkStream, setusecaseattached, iIntValue);
                int i36 = asBinder + 73;
                onTransact = i36 % 128;
                int i37 = i36 % 2;
                return unitOnExtraCallbackWithResult;
            case 17:
                return IAuthTabCallback_Parcel(objArr);
            case 18:
                return access100(objArr);
            case 19:
                return access000(objArr);
            case 20:
                return readTypedObject(objArr);
            case 21:
                return ICustomTabsCallback(objArr);
            case 22:
                return extraCallback(objArr);
            case 23:
                return extraCallbackWithResult(objArr);
            case 24:
                return writeTypedObject(objArr);
            case 25:
                return onMessageChannelReady(objArr);
            case R$styleable.CameraView_cameraPictureMetering /* 26 */:
                return onActivityResized(objArr);
            case 27:
                return onPostMessage(objArr);
            case 28:
                return onActivityLayout(objArr);
            case 29:
                return onMinimized(objArr);
            case 30:
                return onUnminimized(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        needCheckSnapshotMd5 needchecksnapshotmd5 = (needCheckSnapshotMd5) objArr[1];
        Context context = (Context) objArr[2];
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[3];
        int i = 2 % 2;
        int i2 = asBinder + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(zBooleanValue, needchecksnapshotmd5, context, useandconfigureprogramwithtexture);
        int i4 = asBinder + 99;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 53;
        asBinder = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 2073421504, -2073421484, new Object[]{assetHomeEditV2ViewModel, getruntimesupportmax, Integer.valueOf(i), Integer.valueOf(i2)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        int i5 = onTransact + 33;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(MaxAppOpenAdapterListener maxAppOpenAdapterListener, boolean z, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 13;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(maxAppOpenAdapterListener, z, (Function1<? super Boolean, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 67;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(onextracallbackwithresult, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 115;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(onextracallbackwithresult, useandconfigureprogramwithtexture);
        int i4 = onTransact + 67;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallback(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onextracallbackwithresult, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 25 / 0;
        }
        int i6 = onTransact + 87;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(getRuntimeSupportMax getruntimesupportmax, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getruntimesupportmax, dialogInterface);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(getRuntimeSupportMax getruntimesupportmax, AssetForEditV2Dto.Asset asset, AssetForEditV2Dto.Category category, AssetForEditV2Dto.Category category2) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1418190376, -1418190348, new Object[]{getruntimesupportmax, asset, category, category2}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        int i3 = asBinder + 31;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getRuntimeSupportMax getruntimesupportmax, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getruntimesupportmax, assetHomeEditV2ViewModel, str);
        int i4 = asBinder + 115;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 43;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = asBinder + 33;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 71;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(z, onextracallbackwithresult, f, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onTransact + 49;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, needCheckSnapshotMd5 needchecksnapshotmd5, Context context, UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, Function0 function0, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 103;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(z, needchecksnapshotmd5, context, onextracallbackwithresult, function0, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 103;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 27;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(z, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 17;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static final /* synthetic */ isQueryRefinementEnabled onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabledOnExtraCallbackWithResult = onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<isQueryRefinementEnabled<Float, onSuggestionsKey>>) getsupportedhighspeedresolutionsfor);
        int i4 = onTransact + 39;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return isqueryrefinementenabledOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        UpdatePluginCallback.IAuthTabCallback iAuthTabCallback = (UpdatePluginCallback.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 47;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -30893213, 30893219, new Object[]{Integer.valueOf(iIntValue), iAuthTabCallback}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
            throw null;
        }
        Object objOnExtraCallback = onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -30893213, 30893219, new Object[]{Integer.valueOf(iIntValue), iAuthTabCallback}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        int i3 = asBinder + 13;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(long j, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(j, fliphorizontally);
        }
        onNavigationEvent(j, fliphorizontally);
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, SessionTrackerb sessionTrackerb, String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 27;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -890816982, 890816984, new Object[]{assetHomeEditV2ViewModel, getruntimesupportmax, sessionTrackerb, str, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        } else {
            onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -890816982, 890816984, new Object[]{assetHomeEditV2ViewModel, getruntimesupportmax, sessionTrackerb, str, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 59;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(function0, assetHomeEditV2ViewModel, getruntimesupportmax, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(function0, assetHomeEditV2ViewModel, getruntimesupportmax, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asBinder + 95;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1008932979, 1008932990, new Object[]{function1, Boolean.valueOf(z)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        int i4 = asBinder + 75;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NetworkStream networkStream, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, Context context, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 57;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(networkStream, assetHomeEditV2ViewModel, getruntimesupportmax, context, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(networkStream, assetHomeEditV2ViewModel, getruntimesupportmax, context, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asBinder + 33;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NetworkStream networkStream, List list, Function1 function1) {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(networkStream, list, function1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(networkStream, list, function1);
        int i3 = onTransact + 55;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallbackWithResult(UpdatePluginCallback.IAuthTabCallback.asBinder asbinder, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 87;
        asBinder = i4 % 128;
        onExtraCallbackWithResult(asbinder, cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(onextracallbackwithresult, useandconfigureprogramwithtexture);
        int i4 = asBinder + 69;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 49;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onextracallbackwithresult, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 21;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 3;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(onextracallbackwithresult, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(onextracallbackwithresult, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asBinder + 95;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getRuntimeSupportMax getruntimesupportmax, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 833051827, -833051805, new Object[]{getruntimesupportmax, assetHomeEditV2ViewModel, Boolean.valueOf(z)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        int i4 = asBinder + 81;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getRuntimeSupportMax getruntimesupportmax, Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getruntimesupportmax, function0, dialogInterface);
        int i4 = asBinder + 83;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(boolean z, UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 15;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -636095398, 636095413, new Object[]{Boolean.valueOf(z), onextracallbackwithresult, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 101;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(UpdatePluginCallback.IAuthTabCallback.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 115;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 33;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted onwarmupcompleted, boolean z, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 41;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(onwarmupcompleted, z, (Function1<? super Boolean, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 76 / 0;
        }
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1476458395, 1476458421, new Object[]{onwarmupcompleted, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        int i4 = asBinder + 49;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(assetHomeEditV2ViewModel, str);
        int i4 = onTransact + 47;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 73;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(assetHomeEditV2ViewModel, getruntimesupportmax, maxAppOpenAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 19;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 5;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(assetHomeEditV2ViewModel, getruntimesupportmax, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(assetHomeEditV2ViewModel, getruntimesupportmax, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(List list, boolean z, Function1 function1, Function2 function2, Function1 function12, Function2 function22, Function1 function13, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 72707003, -72706994, new Object[]{list, Boolean.valueOf(z), function1, function2, function12, function22, function13, audioRestrictionControllerImplExternalSyntheticLambda0}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1);
        int i4 = onTransact + 37;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(UpdatePluginCallback.IAuthTabCallback.onExtraCallback onextracallback, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 91;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onextracallback, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 45;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 125;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return onTransact(onextracallbackwithresult, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onTransact(onextracallbackwithresult, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(onextracallbackwithresult, useandconfigureprogramwithtexture);
        int i4 = onTransact + 77;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onNavigationEvent(getRuntimeSupportMax getruntimesupportmax, Context context, Function0 function0, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -241144331, 241144335, new Object[]{getruntimesupportmax, context, function0, commonModule_setLeftEdgeTouchEnabled}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        int i4 = onTransact + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(getRuntimeSupportMax getruntimesupportmax, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(getruntimesupportmax, dialogInterface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsBinder = asBinder(getruntimesupportmax, dialogInterface);
        int i3 = onTransact + 87;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onNavigationEvent(getRuntimeSupportMax getruntimesupportmax, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, Context context, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getruntimesupportmax, assetHomeEditV2ViewModel, context, str);
        int i4 = onTransact + 47;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(getRuntimeSupportMax getruntimesupportmax, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, boolean z, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getruntimesupportmax, assetHomeEditV2ViewModel, z, str);
        int i4 = asBinder + 37;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, Function0 function0, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 69;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, onextracallbackwithresult, function0, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 109;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ needCheckSnapshotMd5 onNavigationEvent(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, int i, UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult) {
        int i2 = 2 % 2;
        int i3 = asBinder + 99;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallback(assetHomeEditV2ViewModel, getruntimesupportmax, i, onextracallbackwithresult);
            throw null;
        }
        needCheckSnapshotMd5 needchecksnapshotmd5OnExtraCallback = onExtraCallback(assetHomeEditV2ViewModel, getruntimesupportmax, i, onextracallbackwithresult);
        int i4 = asBinder + 61;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return needchecksnapshotmd5OnExtraCallback;
    }

    public static final /* synthetic */ void onNavigationEvent(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, boolean z, boolean z2, needCheckSnapshotMd5 needchecksnapshotmd5, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 121;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(onextracallbackwithresult, z, z2, needchecksnapshotmd5, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 57;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 1;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted(z, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 52 / 0;
        }
        int i6 = onTransact + 67;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        AssetHomeEditV2ViewModel assetHomeEditV2ViewModel = (AssetHomeEditV2ViewModel) objArr[0];
        getRuntimeSupportMax getruntimesupportmax = (getRuntimeSupportMax) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(assetHomeEditV2ViewModel, getruntimesupportmax, iIntValue, iIntValue2);
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        int i5 = asBinder + 57;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        UpdatePluginCallback.IAuthTabCallback.onExtraCallback onextracallback = (UpdatePluginCallback.IAuthTabCallback.onExtraCallback) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 61;
        onTransact = i2 % 128;
        onWarmupCompleted(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AssetHomeEditV2ViewModel assetHomeEditV2ViewModel = (AssetHomeEditV2ViewModel) objArr[0];
        getRuntimeSupportMax getruntimesupportmax = (getRuntimeSupportMax) objArr[1];
        SessionTrackerb sessionTrackerb = (SessionTrackerb) objArr[2];
        String str = (String) objArr[3];
        Function0 function0 = (Function0) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 25;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(assetHomeEditV2ViewModel, getruntimesupportmax, sessionTrackerb, str, function0, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(assetHomeEditV2ViewModel, getruntimesupportmax, sessionTrackerb, str, function0, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i3 = asBinder + 79;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(NetworkStream networkStream, List list, boolean z, Function1 function1, Function1 function12, Function2 function2, Function1 function13, Function2 function22, Function1 function14, Function2 function23, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(networkStream, list, z, function1, function12, function2, function13, function22, function14, function23, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 51;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(UpdatePluginCallback.IAuthTabCallback.IAuthTabCallback iAuthTabCallback, boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 125;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(iAuthTabCallback, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(UpdatePluginCallback.IAuthTabCallback.asBinder asbinder, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 67;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallbackWithResult(asbinder, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(asbinder, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(UpdatePluginCallback.IAuthTabCallback.onExtraCallback onextracallback, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Unit unit;
        int i3 = 2 % 2;
        int i4 = onTransact + 31;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            unit = (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -967144245, 967144275, new Object[]{onextracallback, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
            int i5 = 0 / 0;
        } else {
            unit = (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -967144245, 967144275, new Object[]{onextracallback, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        }
        int i6 = asBinder + 113;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallbackwithresult, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 47;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1630693238, -1630693209, new Object[]{onextracallbackwithresult, useandconfigureprogramwithtexture}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        }
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1630693238, -1630693209, new Object[]{onextracallbackwithresult, useandconfigureprogramwithtexture}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        int i3 = 51 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, boolean z, boolean z2, needCheckSnapshotMd5 needchecksnapshotmd5, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 7;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult, z, z2, needchecksnapshotmd5, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onTransact + 47;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted onwarmupcompleted, boolean z, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 25;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 260313967, -260313943, new Object[]{onwarmupcompleted, Boolean.valueOf(z), function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        int i5 = onTransact + 75;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getRuntimeSupportMax getruntimesupportmax, AssetForEditV2Dto.Asset asset, AssetForEditV2Dto.Category category, AssetForEditV2Dto.Category category2) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(getruntimesupportmax, asset, category, category2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(getruntimesupportmax, asset, category, category2);
        int i3 = onTransact + 45;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 65 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit onWarmupCompleted(boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void onWarmupCompleted(UpdatePluginCallback.IAuthTabCallback.IAuthTabCallback iAuthTabCallback, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 37;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(iAuthTabCallback, z, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 67;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(UpdatePluginCallback.IAuthTabCallback.asBinder asbinder, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 13;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult(asbinder, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = onTransact + 125;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(getRuntimeSupportMax getruntimesupportmax, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(getruntimesupportmax, dialogInterface);
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Function1 function1 = (Function1) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asBinder = i2 % 128;
        onNavigationEvent(onwarmupcompleted, zBooleanValue, (Function1<? super Boolean, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 71;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(getRuntimeSupportMax getruntimesupportmax, AssetForEditV2Dto.Asset asset, AssetForEditV2Dto.Category category, AssetForEditV2Dto.Category category2) {
        Unit unit;
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            getruntimesupportmax.IAuthTabCallback(asset, category, category2);
            unit = Unit.INSTANCE;
            int i3 = 79 / 0;
        } else {
            getruntimesupportmax.IAuthTabCallback(asset, category, category2);
            unit = Unit.INSTANCE;
        }
        int i4 = asBinder + 59;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, int i, int i2) {
        int i3 = 2 % 2;
        assetHomeEditV2ViewModel.onWarmupCompleted(i, i2, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda58(getruntimesupportmax));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 19;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getRuntimeSupportMax getruntimesupportmax, findResAndMsg findresandmsg, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        RVManifestIProxyManifest.IAuthTabCallback(getruntimesupportmax, (List) null, 1, (Object) null);
        getruntimesupportmax.onExtraCallbackWithResult(findresandmsg, str);
        getruntimesupportmax.IAuthTabCallbackStub();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 81;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(getRuntimeSupportMax getruntimesupportmax, Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            getruntimesupportmax.IAuthTabCallback("CANCEL");
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        getruntimesupportmax.IAuthTabCallback("CANCEL");
        function0.invoke();
        Unit unit2 = Unit.INSTANCE;
        int i3 = asBinder + 11;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onNavigationEvent(getRuntimeSupportMax getruntimesupportmax, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        getruntimesupportmax.IAuthTabCallback("SAVE");
        dialogInterface.dismiss();
        assetHomeEditV2ViewModel.access000();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 113;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void IAuthTabCallback(getRuntimeSupportMax getruntimesupportmax, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getruntimesupportmax.IAuthTabCallback("CLOSE");
        int i4 = asBinder + 73;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(getRuntimeSupportMax getruntimesupportmax, Resources resources, Function0 function0, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        getruntimesupportmax.onTransact();
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(resources.getString(R.string.home_ui_asset_home_edit_v2_back_dialog_title));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.home_ui_asset_home_edit_v2_back_dialog_negative_button, (TdsButtonV1View.asInterface) null, false, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda55(getruntimesupportmax, function0), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.home_ui_asset_home_edit_v2_back_dialog_positive_button, (TdsButtonV1View.asInterface) null, false, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda56(getruntimesupportmax, assetHomeEditV2ViewModel), 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda57(getruntimesupportmax));
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, Context context, Function0 function0, getRuntimeSupportMax getruntimesupportmax, Resources resources) {
        int i = 2 % 2;
        if (assetHomeEditV2ViewModel.access100()) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda49(getruntimesupportmax, resources, function0, assetHomeEditV2ViewModel));
        } else {
            function0.invoke();
            int i2 = asBinder + 121;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 3;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 79;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i2;
        Function0 function0;
        String str;
        SessionTrackerb sessionTrackerb;
        getRuntimeSupportMax getruntimesupportmax;
        AssetHomeEditV2ViewModel assetHomeEditV2ViewModel;
        Object obj;
        boolean z;
        int i3;
        boolean z2;
        Resources resources;
        SessionTrackerb sessionTrackerb2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        String str2;
        Context context;
        int i4;
        int i5;
        int i6;
        AssetHomeEditV2ViewModel assetHomeEditV2ViewModel2 = (AssetHomeEditV2ViewModel) objArr[0];
        getRuntimeSupportMax getruntimesupportmax2 = (getRuntimeSupportMax) objArr[1];
        SessionTrackerb sessionTrackerb3 = (SessionTrackerb) objArr[2];
        String str3 = (String) objArr[3];
        int i7 = 4;
        Function0 function02 = (Function0) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(assetHomeEditV2ViewModel2, "");
        Intrinsics.checkNotNullParameter(getruntimesupportmax2, "");
        Intrinsics.checkNotNullParameter(sessionTrackerb3, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(8425580);
        if ((iIntValue & 6) == 0) {
            int i9 = asBinder + 11;
            onTransact = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 32 / 0;
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetHomeEditV2ViewModel2)) {
                    i7 = 2;
                }
                i = i7 | iIntValue;
            } else {
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetHomeEditV2ViewModel2)) {
                }
                i = i7 | iIntValue;
            }
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getruntimesupportmax2)) {
                int i11 = onTransact + 105;
                asBinder = i11 % 128;
                int i12 = i11 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i |= i6;
        }
        if ((iIntValue & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sessionTrackerb3)) {
                i5 = 256;
            } else {
                int i13 = asBinder + 81;
                onTransact = i13 % 128;
                int i14 = i13 % 2;
                i5 = 128;
            }
            i |= i5;
        }
        if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                int i15 = onTransact + 35;
                asBinder = i15 % 128;
                int i16 = i15 % 2;
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i |= i4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 9363) != 9362, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(8425580, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2Screen (AssetHomeEditV2Screen.kt:114)");
            }
            Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            Resources resources2 = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetHomeEditV2ViewModel2);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getruntimesupportmax2);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(zOnExtraCallback | zOnExtraCallback2)) {
                Object obj2 = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda62 externalSyntheticLambda62 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda62(assetHomeEditV2ViewModel2, getruntimesupportmax2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda62);
                    obj2 = externalSyntheticLambda62;
                }
                NetworkStream networkStreamOnWarmupCompleted = initStream.onWarmupCompleted((findResAndMsg) null, (Camera2CameraMetadataExternalSyntheticLambda1) null, (Function2) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START;
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getruntimesupportmax2);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg);
                if ((i & 7168) == 2048) {
                    int i17 = asBinder + 53;
                    onTransact = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                } else {
                    z = false;
                }
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(z | zOnExtraCallback3 | zOnExtraCallback4)) {
                    int i19 = onTransact + 31;
                    asBinder = i19 % 128;
                    int i20 = i19 % 2;
                    Object obj3 = objOnMinimized3;
                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda63 externalSyntheticLambda63 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda63(getruntimesupportmax2, findresandmsg, str3);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda63);
                        obj3 = externalSyntheticLambda63;
                    }
                    AndroidTextContextMenuToolbarProviderExternalSyntheticLambda5.IAuthTabCallback(onextracallbackwithresult, (TextFieldScrollKtExternalSyntheticLambda0) null, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 2);
                    boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(assetHomeEditV2ViewModel2);
                    boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context2);
                    boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getruntimesupportmax2);
                    boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(resources2);
                    int i21 = i & 57344;
                    if (i21 == 16384) {
                        i3 = i21;
                        z2 = true;
                    } else {
                        i3 = i21;
                        z2 = false;
                    }
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (((zOnExtraCallback5 | zOnExtraCallback6 | zOnExtraCallback7 | zOnExtraCallback8) || z2) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        resources = resources2;
                        sessionTrackerb2 = sessionTrackerb3;
                        i2 = iIntValue;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        str2 = str3;
                        context = context2;
                        objOnMinimized4 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda64(assetHomeEditV2ViewModel2, context2, function02, getruntimesupportmax2, resources);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
                    } else {
                        str2 = str3;
                        sessionTrackerb2 = sessionTrackerb3;
                        resources = resources2;
                        i2 = iIntValue;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        context = context2;
                    }
                    requestPostMessageChannel.onExtraCallbackWithResult(false, (Function0) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1);
                    int i22 = i3;
                    boolean z3 = true;
                    function0 = function02;
                    Context context3 = context;
                    str = str2;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult2;
                    SessionTrackerb sessionTrackerb4 = sessionTrackerb2;
                    getruntimesupportmax = getruntimesupportmax2;
                    Resources resources3 = resources;
                    clearValueCallback.onWarmupCompleted(new Object[]{null, null, ForwardingCameraControl.onExtraCallback(-1035136616, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda65(function02, assetHomeEditV2ViewModel2, getruntimesupportmax2), cameraCaptureResultEmptyCameraCaptureResult2, 54), false, null, null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(-1596366907, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda66(networkStreamOnWarmupCompleted, assetHomeEditV2ViewModel2, getruntimesupportmax2, context), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult4, 384, 48, 2043}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        int i23 = onTransact + 19;
                        asBinder = i23 % 128;
                        int i24 = i23 % 2;
                        objOnMinimized5 = Float.valueOf(M_.onExtraCallback.onExtraCallback());
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult4;
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult4;
                    }
                    float fFloatValue = ((Number) objOnMinimized5).floatValue();
                    boolean zOnWarmupCompleted = networkStreamOnWarmupCompleted.onWarmupCompleted();
                    Integer num = (Integer) NetworkStream.IAuthTabCallback(-1884186337, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1884186339, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{networkStreamOnWarmupCompleted});
                    UpdatePluginCallback.IAuthTabCallback iAuthTabCallback = num != null ? (UpdatePluginCallback.IAuthTabCallback) assetHomeEditV2ViewModel2.asBinder().get(num.intValue()) : null;
                    onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -636095398, 636095413, new Object[]{Boolean.valueOf(zOnWarmupCompleted), iAuthTabCallback instanceof UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult ? (UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult) iAuthTabCallback : null, Float.valueOf(Math.max(0.0f, fFloatValue + networkStreamOnWarmupCompleted.IAuthTabCallback())), cameraCaptureResultEmptyCameraCaptureResult, 0}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
                    Throwable thOnWarmupCompleted = assetHomeEditV2ViewModel2.onWarmupCompleted();
                    assetHomeEditV2ViewModel = assetHomeEditV2ViewModel2;
                    boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeEditV2ViewModel);
                    boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context3);
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnExtraCallback9 || zOnExtraCallback10) || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                        obj = null;
                        objOnMinimized6 = new asBinder(assetHomeEditV2ViewModel, context3, null);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                    } else {
                        obj = null;
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(thOnWarmupCompleted, (Function2) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    Unit unit = Unit.INSTANCE;
                    boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeEditV2ViewModel);
                    boolean zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context3);
                    boolean zOnExtraCallback13 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(resources3);
                    sessionTrackerb = sessionTrackerb4;
                    boolean zOnExtraCallback14 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(sessionTrackerb);
                    if (i22 != 16384) {
                        z3 = false;
                    }
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnExtraCallback11 | zOnExtraCallback12 | zOnExtraCallback13 | zOnExtraCallback14 | z3) || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                        IAuthTabCallback_Parcel iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(assetHomeEditV2ViewModel, context3, resources3, sessionTrackerb, function0, (access13800) null);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(iAuthTabCallback_Parcel);
                        objOnMinimized7 = iAuthTabCallback_Parcel;
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    Configuration configuration = (Configuration) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult());
                    List listAsBinder = assetHomeEditV2ViewModel.asBinder();
                    boolean zOnExtraCallback15 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeEditV2ViewModel);
                    boolean zOnExtraCallback16 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(networkStreamOnWarmupCompleted);
                    boolean zOnExtraCallback17 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(configuration);
                    boolean zOnExtraCallback18 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(resources3);
                    Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnExtraCallback15 | zOnExtraCallback16 | zOnExtraCallback17 | zOnExtraCallback18) || objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(assetHomeEditV2ViewModel, networkStreamOnWarmupCompleted, configuration, resources3, null);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(iAuthTabCallbackStubProxy);
                        objOnMinimized8 = iAuthTabCallbackStubProxy;
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(listAsBinder, (Function2) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i25 = asBinder + 87;
                        onTransact = i25 % 128;
                        int i26 = i25 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i2 = iIntValue;
            function0 = function02;
            str = str3;
            sessionTrackerb = sessionTrackerb3;
            getruntimesupportmax = getruntimesupportmax2;
            assetHomeEditV2ViewModel = assetHomeEditV2ViewModel2;
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda67(assetHomeEditV2ViewModel, getruntimesupportmax, sessionTrackerb, str, function0, i2));
        }
        return obj;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 85;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        String str;
        getRuntimeSupportMax getruntimesupportmax = (getRuntimeSupportMax) objArr[0];
        AssetHomeEditV2ViewModel assetHomeEditV2ViewModel = (AssetHomeEditV2ViewModel) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onTransact + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 36 / 0;
            if (!zBooleanValue) {
                str = "CANCEL";
            } else {
                str = "DELETE";
            }
        } else if (!zBooleanValue) {
        }
        getruntimesupportmax.onTransact(str);
        assetHomeEditV2ViewModel.onWarmupCompleted(zBooleanValue);
        assetHomeEditV2ViewModel.extraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 29;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, MaxAppOpenAdapterListener maxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(maxAppOpenAdapterListener, "");
        if ((i & 6) == 0) {
            int i4 = asBinder + 119;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxAppOpenAdapterListener) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = asBinder + 71;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = onTransact + 7;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i10 = asBinder + 35;
            onTransact = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 5 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-285881382, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2Screen.<anonymous>.<anonymous> (AssetHomeEditV2Screen.kt:170)");
                }
                if (!((Boolean) AssetHomeEditV2ViewModel.onExtraCallbackWithResult(-1448700798, 1448700803, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{assetHomeEditV2ViewModel})).booleanValue()) {
                    int i12 = onTransact + 105;
                    asBinder = i12 % 128;
                    int i13 = i12 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(227960792);
                    boolean zIAuthTabCallback_Parcel = assetHomeEditV2ViewModel.IAuthTabCallback_Parcel();
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getruntimesupportmax);
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeEditV2ViewModel);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnExtraCallback | zOnExtraCallback2)) {
                        int i14 = asBinder + 117;
                        onTransact = i14 % 128;
                        if (i14 % 2 == 0) {
                            CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                            throw null;
                        }
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda45(getruntimesupportmax, assetHomeEditV2ViewModel);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                        }
                        onNavigationEvent(maxAppOpenAdapterListener, zIAuthTabCallback_Parcel, (Function1<? super Boolean, Unit>) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, i2 & 14);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        int i15 = onTransact + 79;
                        asBinder = i15 % 128;
                        int i16 = i15 % 2;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(228498952);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                if (!((Boolean) AssetHomeEditV2ViewModel.onExtraCallbackWithResult(-1448700798, 1448700803, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{assetHomeEditV2ViewModel})).booleanValue()) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Function0 function0, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact + 83;
        int i4 = i3 % 128;
        asBinder = i4;
        if (i3 % 2 == 0 ? (i & 3) == 2 : (i & 5) == 2) {
            z = false;
        } else {
            int i5 = i4 + 35;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = asBinder + 97;
                onTransact = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1035136616, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2Screen.<anonymous> (AssetHomeEditV2Screen.kt:164)");
                    int i8 = 88 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1035136616, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2Screen.<anonymous> (AssetHomeEditV2Screen.kt:164)");
                }
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = YuvImageOnePixelShiftQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i9 = onTransact + 21;
                asBinder = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda5(function0);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda5);
                    obj = externalSyntheticLambda5;
                }
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, quirksExternalSyntheticBackport0OnWarmupCompleted, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(-285881382, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda6(assetHomeEditV2ViewModel, getruntimesupportmax), cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 1572864, 188);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final /* synthetic */ class onTransact extends FunctionReferenceImpl implements Function1<String, getSupportedHighSpeedResolutionsFor<Boolean>> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        onTransact(Object obj) {
            super(1, obj, AssetHomeEditV2ViewModel.class, "isHiddenCategoryExpanded", "isHiddenCategoryExpanded(Ljava/lang/String;)Landroidx/compose/runtime/MutableState;", 0);
        }

        public final getSupportedHighSpeedResolutionsFor<Boolean> IAuthTabCallback(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                return ((AssetHomeEditV2ViewModel) ((CallableReference) this).receiver).onWarmupCompleted(str);
            }
            Intrinsics.checkNotNullParameter(str, "");
            ((AssetHomeEditV2ViewModel) ((CallableReference) this).receiver).onWarmupCompleted(str);
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsforIAuthTabCallback = IAuthTabCallback((String) obj);
            if (i3 == 0) {
                int i4 = 47 / 0;
            }
            int i5 = onNavigationEvent + 105;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return getsupportedhighspeedresolutionsforIAuthTabCallback;
            }
            throw null;
        }
    }

    static final /* synthetic */ class IAuthTabCallbackStub extends FunctionReferenceImpl implements Function1<String, getSupportedHighSpeedResolutionsFor<Boolean>> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        IAuthTabCallbackStub(Object obj) {
            super(1, obj, AssetHomeEditV2ViewModel.class, "isAssetExpanded", "isAssetExpanded(Ljava/lang/String;)Landroidx/compose/runtime/MutableState;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onNavigationEvent = i2 % 128;
            String str = (String) obj;
            if (i2 % 2 == 0) {
                onWarmupCompleted(str);
                throw null;
            }
            getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsforOnWarmupCompleted = onWarmupCompleted(str);
            int i3 = onNavigationEvent + 43;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return getsupportedhighspeedresolutionsforOnWarmupCompleted;
            }
            throw null;
        }

        public final getSupportedHighSpeedResolutionsFor<Boolean> onWarmupCompleted(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                ((AssetHomeEditV2ViewModel) ((CallableReference) this).receiver).IAuthTabCallback(str);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsforIAuthTabCallback = ((AssetHomeEditV2ViewModel) ((CallableReference) this).receiver).IAuthTabCallback(str);
            int i3 = IAuthTabCallback + 111;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return getsupportedhighspeedresolutionsforIAuthTabCallback;
            }
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(NetworkStream networkStream, setUseCaseAttached setusecaseattached, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 125;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            networkStream.onNavigationEvent(setusecaseattached.onExtraCallback());
            Unit unit = Unit.INSTANCE;
            int i4 = onTransact + 3;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
        networkStream.onNavigationEvent(setusecaseattached.onExtraCallback());
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(getRuntimeSupportMax getruntimesupportmax, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        AssetForEditV2Dto.Category categoryOnExtraCallback = assetHomeEditV2ViewModel.onExtraCallback(str);
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = assetHomeEditV2ViewModel.onWarmupCompleted(str);
        boolean zBooleanValue = false;
        if (getsupportedhighspeedresolutionsforOnWarmupCompleted != null) {
            int i4 = onTransact + 41;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 86 / 0;
                zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsforOnWarmupCompleted.onExtraCallbackWithResult()).booleanValue();
            } else {
                zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsforOnWarmupCompleted.onExtraCallbackWithResult()).booleanValue();
            }
        }
        getruntimesupportmax.onNavigationEvent(categoryOnExtraCallback, zBooleanValue);
        return Unit.INSTANCE;
    }

    public static final class asInterface implements Function1<Integer, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ List onNavigationEvent;

        public asInterface(List list) {
            this.onNavigationEvent = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(((Number) obj).intValue());
            int i4 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return ((UpdatePluginCallback.IAuthTabCallback) this.onNavigationEvent.get(i)).onExtraCallbackWithResult();
            }
            ((UpdatePluginCallback.IAuthTabCallback) this.onNavigationEvent.get(i)).onExtraCallbackWithResult();
            throw null;
        }
    }

    public static final class onNavigationEvent implements Function1<Integer, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function2 onExtraCallback;
        final /* synthetic */ List onNavigationEvent;

        public onNavigationEvent(Function2 function2, List list) {
            this.onExtraCallback = function2;
            this.onNavigationEvent = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent(((Number) obj).intValue());
            int i4 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objInvoke = this.onExtraCallback.invoke(Integer.valueOf(i), this.onNavigationEvent.get(i));
            int i5 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objInvoke;
        }
    }

    private static final Unit onWarmupCompleted(getRuntimeSupportMax getruntimesupportmax, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, boolean z, String str) {
        Unit unit;
        int i = 2 % 2;
        int i2 = asBinder + 49;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            getruntimesupportmax.onWarmupCompleted(assetHomeEditV2ViewModel.onExtraCallback(str), z);
            assetHomeEditV2ViewModel.IAuthTabCallback(z, str);
            unit = Unit.INSTANCE;
            int i3 = 46 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            getruntimesupportmax.onWarmupCompleted(assetHomeEditV2ViewModel.onExtraCallback(str), z);
            assetHomeEditV2ViewModel.IAuthTabCallback(z, str);
            unit = Unit.INSTANCE;
        }
        int i4 = asBinder + 15;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class IAuthTabCallbackDefault implements setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int asBinder = 0;
        private static int asInterface = 1;
        final /* synthetic */ List IAuthTabCallback;
        final /* synthetic */ Function1 IAuthTabCallbackStub;
        final /* synthetic */ Function1 onExtraCallback;
        final /* synthetic */ Function2 onExtraCallbackWithResult;
        final /* synthetic */ Function1 onNavigationEvent;
        final /* synthetic */ Function2 onTransact;
        final /* synthetic */ boolean onWarmupCompleted;

        public IAuthTabCallbackDefault(List list, boolean z, Function1 function1, Function2 function2, Function1 function12, Function2 function22, Function1 function13) {
            this.IAuthTabCallback = list;
            this.onWarmupCompleted = z;
            this.onNavigationEvent = function1;
            this.onTransact = function2;
            this.onExtraCallback = function12;
            this.onExtraCallbackWithResult = function22;
            this.IAuthTabCallbackStub = function13;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = asInterface + 9;
            asBinder = i2 % 128;
            RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj;
            Number number = (Number) obj2;
            if (i2 % 2 != 0) {
                onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, number.intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, number.intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit2 = Unit.INSTANCE;
            int i3 = asBinder + 103;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 76 / 0;
            }
            return unit2;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01c9 A[PHI: r12 r14
          0x01c9: PHI (r12v6 o.UpdatePluginCallback$IAuthTabCallback$onWarmupCompleted) = 
          (r12v5 o.UpdatePluginCallback$IAuthTabCallback$onWarmupCompleted)
          (r12v10 o.UpdatePluginCallback$IAuthTabCallback$onWarmupCompleted)
         binds: [B:67:0x01c7, B:63:0x01b0] A[DONT_GENERATE, DONT_INLINE]
          0x01c9: PHI (r14v20 o.getSupportedHighSpeedResolutionsFor) = (r14v18 o.getSupportedHighSpeedResolutionsFor), (r14v27 o.getSupportedHighSpeedResolutionsFor) binds: [B:67:0x01c7, B:63:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0209  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onNavigationEvent(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
            int i3;
            UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted onwarmupcompleted;
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
            boolean zBooleanValue;
            boolean zOnNavigationEvent;
            boolean zOnNavigationEvent2;
            Object objOnMinimized;
            int i4;
            int i5 = 2 % 2;
            if ((i2 & 6) == 0) {
                int i6 = asInterface + 41;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                    int i8 = asInterface + 69;
                    int i9 = i8 % 128;
                    asBinder = i9;
                    int i10 = i8 % 2;
                    int i11 = i9 + 99;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 32;
                } else {
                    int i13 = asInterface + 25;
                    asBinder = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 16;
                }
                i3 |= i4;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            int i15 = asBinder + 53;
            asInterface = i15 % 128;
            int i16 = i15 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i17 = asBinder + 89;
                asInterface = i17 % 128;
                int i18 = i17 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2039820996, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            UpdatePluginCallback.IAuthTabCallback.onExtraCallback onextracallback = (UpdatePluginCallback.IAuthTabCallback) this.IAuthTabCallback.get(i);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1755778182);
            if (onextracallback instanceof UpdatePluginCallback.IAuthTabCallback.asInterface) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1755758002);
                AppxNgRuntimeCheckerSoloPackageType.onNavigationEvent(this.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (onextracallback instanceof UpdatePluginCallback.IAuthTabCallback.onExtraCallback) {
                int i19 = asInterface + 45;
                asBinder = i19 % 128;
                if (i19 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1755624237);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1755624237);
                }
                AppxNgRuntimeCheckerSoloPackageType.onExtraCallbackWithResult(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (onextracallback instanceof UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted) {
                int i20 = asInterface + 99;
                asBinder = i20 % 128;
                if (i20 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1755479653);
                    onwarmupcompleted = (UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted) onextracallback;
                    getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) this.onNavigationEvent.invoke(onwarmupcompleted.IAuthTabCallback());
                    if (getsupportedhighspeedresolutionsfor != null) {
                        int i21 = asInterface + 7;
                        asBinder = i21 % 128;
                        if (i21 % 2 != 0) {
                            ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.onTransact);
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallback);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((!(zOnNavigationEvent | zOnNavigationEvent2)) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new onExtraCallback(this.onTransact, onextracallback);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    AppxNgRuntimeCheckerSoloPackageType.onExtraCallbackWithResult(onwarmupcompleted, zBooleanValue, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i22 = asInterface + 113;
                    asBinder = i22 % 128;
                    int i23 = i22 % 2;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1755479653);
                    onwarmupcompleted = (UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted) onextracallback;
                    getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) this.onNavigationEvent.invoke(onwarmupcompleted.IAuthTabCallback());
                    if (getsupportedhighspeedresolutionsfor == null) {
                        zBooleanValue = true;
                    }
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.onTransact);
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallback);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                        objOnMinimized = new onExtraCallback(this.onTransact, onextracallback);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                        AppxNgRuntimeCheckerSoloPackageType.onExtraCallbackWithResult(onwarmupcompleted, zBooleanValue, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        int i222 = asInterface + 113;
                        asBinder = i222 % 128;
                        int i232 = i222 % 2;
                    }
                }
            } else if (onextracallback instanceof UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1755040755);
                UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = (UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult) onextracallback;
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) this.onExtraCallback.invoke(onextracallbackwithresult.IAuthTabCallbackDefault());
                boolean zBooleanValue2 = getsupportedhighspeedresolutionsfor2 != null ? ((Boolean) getsupportedhighspeedresolutionsfor2.onExtraCallbackWithResult()).booleanValue() : true;
                boolean z = this.onWarmupCompleted;
                needCheckSnapshotMd5 needchecksnapshotmd5 = (needCheckSnapshotMd5) this.onExtraCallbackWithResult.invoke(Integer.valueOf(i), onextracallback);
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.IAuthTabCallbackStub);
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallback);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent3 | zOnNavigationEvent4) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new onExtraCallbackWithResult(this.IAuthTabCallbackStub, onextracallback);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                AppxNgRuntimeCheckerSoloPackageType.onNavigationEvent(onextracallbackwithresult, zBooleanValue2, z, needchecksnapshotmd5, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (onextracallback instanceof UpdatePluginCallback.IAuthTabCallback.IAuthTabCallback) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1754499712);
                AppxNgRuntimeCheckerSoloPackageType.onWarmupCompleted((UpdatePluginCallback.IAuthTabCallback.IAuthTabCallback) onextracallback, this.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (onextracallback instanceof UpdatePluginCallback.IAuthTabCallback.asBinder) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1754354539);
                AppxNgRuntimeCheckerSoloPackageType.onWarmupCompleted((UpdatePluginCallback.IAuthTabCallback.asBinder) onextracallback, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                if (!(onextracallback instanceof UpdatePluginCallback.IAuthTabCallback.onNavigationEvent)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1165016663);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1754228648);
                AppxNgRuntimeCheckerSoloPackageType.onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1927467112, -1927467089, new Object[]{cameraCaptureResultEmptyCameraCaptureResult, 0}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
    }

    private static final Unit IAuthTabCallback(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            assetHomeEditV2ViewModel.onExtraCallbackWithResult(str);
            return Unit.INSTANCE;
        }
        assetHomeEditV2ViewModel.onExtraCallbackWithResult(str);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(getRuntimeSupportMax getruntimesupportmax, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, Context context, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        getruntimesupportmax.onNavigationEvent(assetHomeEditV2ViewModel.onNavigationEvent(str));
        onExtraCallback(context, getruntimesupportmax, (Function0<Unit>) new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda51(assetHomeEditV2ViewModel, str));
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 115;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final needCheckSnapshotMd5 onExtraCallback(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, int i, UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        needCheckSnapshotMd5 needchecksnapshotmd5OnWarmupCompleted = assetHomeEditV2ViewModel.onWarmupCompleted(i, onextracallbackwithresult, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda60(assetHomeEditV2ViewModel, getruntimesupportmax));
        int i3 = onTransact + 125;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return needchecksnapshotmd5OnWarmupCompleted;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        getRuntimeSupportMax getruntimesupportmax = (getRuntimeSupportMax) objArr[0];
        AssetForEditV2Dto.Asset asset = (AssetForEditV2Dto.Asset) objArr[1];
        AssetForEditV2Dto.Category category = (AssetForEditV2Dto.Category) objArr[2];
        AssetForEditV2Dto.Category category2 = (AssetForEditV2Dto.Category) objArr[3];
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            getruntimesupportmax.IAuthTabCallback(asset, category, category2);
            return Unit.INSTANCE;
        }
        getruntimesupportmax.IAuthTabCallback(asset, category, category2);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        int i = 2 % 2;
        ((AssetHomeEditV2ViewModel) objArr[0]).onWarmupCompleted(((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda21((getRuntimeSupportMax) objArr[1]));
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 39;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01ad A[PHI: r0
      0x01ad: PHI (r0v9 int) = (r0v8 int), (r0v43 int) binds: [B:45:0x01ab, B:42:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01af A[PHI: r0
      0x01af: PHI (r0v40 int) = (r0v8 int), (r0v43 int) binds: [B:45:0x01ab, B:42:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        boolean z;
        int length;
        byte[] bArr;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 43424), (ViewConfiguration.getLongPressTimeout() >> 16) + 42, 16799655 + Color.rgb(0, 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            long j = 0;
            if (z2) {
                byte[] bArr2 = IAuthTabCallbackDefault;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i7 = 0;
                    while (i7 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))), 55 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2166 - TextUtils.indexOf((CharSequence) "", '0', 0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr3[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i7++;
                        j = 0;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    int i8 = $10 + 77;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    byte[] bArr4 = IAuthTabCallbackDefault;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 43424), 42 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.argb(0, 0, 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallbackStub[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i10 = $11 + 75;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    i4 = ((i % iIntValue) + 3) << ((int) (onExtraCallback / (-4629411779493505016L)));
                    i5 = z2 ? 1 : 0;
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
                    if (z2) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 86 - Gravity.getAbsoluteGravity(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = IAuthTabCallbackDefault;
                if (bArr5 != null) {
                    int i11 = $10 + 101;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i12 = 0; i12 < length; i12++) {
                        bArr[i12] = (byte) (bArr5[i12] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    z = true;
                } else {
                    int i13 = $10 + 15;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = IAuthTabCallbackDefault;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallbackStub;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static final Unit onExtraCallback(getRuntimeSupportMax getruntimesupportmax, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel) {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            getruntimesupportmax.asBinder();
            assetHomeEditV2ViewModel.access000();
            int i3 = 63 / 0;
            return Unit.INSTANCE;
        }
        getruntimesupportmax.asBinder();
        assetHomeEditV2ViewModel.access000();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        int i5 = asBinder + 91;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i7 = asBinder + 83;
            onTransact = i7 % 128;
            if (i7 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i8 = onTransact + 93;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i10 = onTransact + 101;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i12 = onTransact + 91;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1512193978, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2Screen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssetHomeEditV2Screen.kt:251)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_ui_asset_home_edit_v2_cta_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean interfaceDescriptor = assetHomeEditV2ViewModel.getInterfaceDescriptor();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getruntimesupportmax);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeEditV2ViewModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!(zOnExtraCallback | zOnExtraCallback2))) {
                AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda4(getruntimesupportmax, assetHomeEditV2ViewModel);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                obj = externalSyntheticLambda4;
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, interfaceDescriptor, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 502);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, interfaceDescriptor, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 502);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 55;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = asBinder + 93;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1635277529, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2Screen.<anonymous>.<anonymous>.<anonymous> (AssetHomeEditV2Screen.kt:248)");
                int i6 = 68 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1635277529, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2Screen.<anonymous>.<anonymous>.<anonymous> (AssetHomeEditV2Screen.kt:248)");
            }
        }
        u1.IAuthTabCallback(YuvImageOnePixelShiftQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion), (u2) null, ForwardingCameraControl.onExtraCallback(1512193978, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda54(assetHomeEditV2ViewModel, getruntimesupportmax), cameraCaptureResultEmptyCameraCaptureResult, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 4090);
        if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onTransact + 93;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(NetworkStream networkStream, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, Context context, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        boolean z2;
        boolean zOnExtraCallback;
        boolean zOnExtraCallback2;
        boolean z3;
        int i2 = 2 % 2;
        int i3 = onTransact + 89;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            z = (i & 85) != 19;
        } else {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1596366907, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2Screen.<anonymous> (AssetHomeEditV2Screen.kt:186)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
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
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            List listAsBinder = assetHomeEditV2ViewModel.asBinder();
            boolean zIAuthTabCallback_Parcel = assetHomeEditV2ViewModel.IAuthTabCallback_Parcel();
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeEditV2ViewModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback3 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onTransact(assetHomeEditV2ViewModel);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Function1 function1 = (access5300) objOnMinimized;
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeEditV2ViewModel);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback4 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new IAuthTabCallbackStub(assetHomeEditV2ViewModel);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            Function1 function12 = (access5300) objOnMinimized2;
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(networkStream);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback5) {
                int i4 = onTransact + 93;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized3;
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda8(networkStream);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda8);
                    obj2 = externalSyntheticLambda8;
                }
                Function2 function2 = (Function2) obj2;
                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getruntimesupportmax);
                boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeEditV2ViewModel);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback6 && !zOnExtraCallback7) {
                    int i5 = onTransact + 7;
                    asBinder = i5 % 128;
                    if (i5 % 2 != 0) {
                        z2 = false;
                        int i6 = 56 / 0;
                        if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        Function1 function13 = (Function1) objOnMinimized4;
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getruntimesupportmax);
                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeEditV2ViewModel);
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnExtraCallback | zOnExtraCallback2)) {
                            Object obj3 = objOnMinimized5;
                            if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda10(getruntimesupportmax, assetHomeEditV2ViewModel);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda10);
                                obj3 = externalSyntheticLambda10;
                            }
                            Function2 function22 = (Function2) obj3;
                            boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getruntimesupportmax);
                            boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeEditV2ViewModel);
                            boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!(zOnExtraCallback8 | zOnExtraCallback9 | zOnExtraCallback10)) {
                                Object obj4 = objOnMinimized6;
                                if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda11(getruntimesupportmax, assetHomeEditV2ViewModel, context);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda11);
                                    obj4 = externalSyntheticLambda11;
                                }
                                Function1 function14 = (Function1) obj4;
                                boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeEditV2ViewModel);
                                boolean zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getruntimesupportmax);
                                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(zOnExtraCallback11 | zOnExtraCallback12)) {
                                    int i7 = asBinder + 91;
                                    onTransact = i7 % 128;
                                    int i8 = i7 % 2;
                                    if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized7 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda12(assetHomeEditV2ViewModel, getruntimesupportmax);
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
                                    }
                                    onWarmupCompleted(networkStream, listAsBinder, zIAuthTabCallback_Parcel, function1, function12, function2, function13, function22, function14, (Function2) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResult, 0);
                                    if (assetHomeEditV2ViewModel.IAuthTabCallbackStubProxy()) {
                                        int i9 = onTransact + 113;
                                        asBinder = i9 % 128;
                                        int i10 = i9 % 2;
                                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-765652815);
                                        drawFilledStars.onWarmupCompleted(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onExtraCallback()), drawEmptyStars.onWarmupCompleted.Companion.IAuthTabCallback(), (drawEmptyStars.onNavigationEvent) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 12);
                                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-765498621);
                                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted());
                                    if (assetHomeEditV2ViewModel.IAuthTabCallback_Parcel() || !assetHomeEditV2ViewModel.access100()) {
                                        z3 = z2;
                                        setVerticalGravity.onWarmupCompleted(z3, quirksExternalSyntheticBackport0OnWarmupCompleted2, ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback((updateFocusedState) null, 0.0f, 3, (Object) null).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.onExtraCallback((updateFocusedState) null, onextracallbackwithresult.access000(), false, (Function1) null, 13, (Object) null)), ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted((updateFocusedState) null, 0.0f, 3, (Object) null).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback((updateFocusedState) null, onextracallbackwithresult.access000(), false, (Function1) null, 13, (Object) null)), (String) null, ForwardingCameraControl.onExtraCallback(-1635277529, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda13(assetHomeEditV2ViewModel, getruntimesupportmax), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 200064, 16);
                                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                            int i11 = asBinder + 57;
                                            onTransact = i11 % 128;
                                            int i12 = i11 % 2;
                                        }
                                    } else {
                                        int i13 = onTransact + 13;
                                        asBinder = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            z3 = true;
                                        }
                                        setVerticalGravity.onWarmupCompleted(z3, quirksExternalSyntheticBackport0OnWarmupCompleted2, ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback((updateFocusedState) null, 0.0f, 3, (Object) null).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.onExtraCallback((updateFocusedState) null, onextracallbackwithresult.access000(), false, (Function1) null, 13, (Object) null)), ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted((updateFocusedState) null, 0.0f, 3, (Object) null).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback((updateFocusedState) null, onextracallbackwithresult.access000(), false, (Function1) null, 13, (Object) null)), (String) null, ForwardingCameraControl.onExtraCallback(-1635277529, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda13(assetHomeEditV2ViewModel, getruntimesupportmax), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 200064, 16);
                                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        z2 = false;
                        if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        Function1 function132 = (Function1) objOnMinimized4;
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getruntimesupportmax);
                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeEditV2ViewModel);
                        Object objOnMinimized52 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnExtraCallback | zOnExtraCallback2)) {
                        }
                    }
                } else {
                    z2 = false;
                }
                objOnMinimized4 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda9(getruntimesupportmax, assetHomeEditV2ViewModel);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                Function1 function1322 = (Function1) objOnMinimized4;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(getruntimesupportmax);
                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(assetHomeEditV2ViewModel);
                Object objOnMinimized522 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | zOnExtraCallback2)) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Context $context;
        final /* synthetic */ AssetHomeEditV2ViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, Context context, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$viewModel = assetHomeEditV2ViewModel;
            this.$context = context;
        }

        public static /* synthetic */ Unit onWarmupCompleted(Context context, DialogInterface dialogInterface) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(context, dialogInterface);
            int i4 = onExtraCallbackWithResult + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$viewModel, this.$context, access13800Var);
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return asbinder;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800<? super Unit>) obj2);
            int i4 = onExtraCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Throwable thOnWarmupCompleted = this.$viewModel.onWarmupCompleted();
            if (thOnWarmupCompleted != null) {
                Context context = this.$context;
                getParamImp.onWarmupCompleted(thOnWarmupCompleted, context, false, (initMiniApp) null, (Function0) null, new AssetHomeEditV2ScreenKt$AssetHomeEditV2Screen$6$1$.ExternalSyntheticLambda0(context), 14, (Object) null);
                int i3 = onExtraCallbackWithResult + 85;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i5 = onExtraCallbackWithResult + 13;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 0 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit onExtraCallback(Context context, DialogInterface dialogInterface) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            if (i3 == 0) {
                int i4 = 1 / 0;
                if (activityIAuthTabCallback != null) {
                    activityIAuthTabCallback.finish();
                }
            } else if (activityIAuthTabCallback != null) {
            }
            Unit unit = Unit.INSTANCE;
            int i5 = onExtraCallbackWithResult + 115;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration $configuration;
        final /* synthetic */ NetworkStream $listState;
        final /* synthetic */ Resources $resources;
        final /* synthetic */ AssetHomeEditV2ViewModel $viewModel;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, NetworkStream networkStream, Configuration configuration, Resources resources, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$viewModel = assetHomeEditV2ViewModel;
            this.$listState = networkStream;
            this.$configuration = configuration;
            this.$resources = resources;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxyCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return iAuthTabCallbackStubProxyCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallbackStubProxyCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(this.$viewModel, this.$listState, this.$configuration, this.$resources, access13800Var);
            int i2 = onNavigationEvent + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!this.$viewModel.asBinder().isEmpty()) {
                    int i4 = onNavigationEvent + 79;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        this.$viewModel.asInterface();
                        throw null;
                    }
                    String strAsInterface = this.$viewModel.asInterface();
                    if (strAsInterface == null) {
                        return Unit.INSTANCE;
                    }
                    Iterator it = this.$viewModel.asBinder().iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i5 = -1;
                            break;
                        }
                        int i6 = onExtraCallback + 15;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 != 0) {
                            boolean z = ((UpdatePluginCallback.IAuthTabCallback) it.next()) instanceof UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult;
                            throw null;
                        }
                        UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = (UpdatePluginCallback.IAuthTabCallback) it.next();
                        if (!(!(onextracallbackwithresult instanceof UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult)) && Intrinsics.areEqual(onextracallbackwithresult.IAuthTabCallbackDefault(), strAsInterface)) {
                            break;
                        }
                        i5++;
                        int i7 = onNavigationEvent + 37;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    if (i5 != -1) {
                        this.$viewModel.IAuthTabCallbackStub((String) null);
                        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnNavigationEvent = this.$listState.onNavigationEvent();
                        Integer numOnNavigationEvent = access14000.onNavigationEvent(this.$configuration.screenHeightDp);
                        DisplayMetrics displayMetrics = this.$resources.getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                        int i9 = -(varyMatches.onNavigationEvent(numOnNavigationEvent, displayMetrics) / 2);
                        Integer numOnNavigationEvent2 = access14000.onNavigationEvent(80);
                        DisplayMetrics displayMetrics2 = this.$resources.getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                        int iOnNavigationEvent = varyMatches.onNavigationEvent(numOnNavigationEvent2, displayMetrics2);
                        this.L$0 = access15400.onNavigationEvent(strAsInterface);
                        this.I$0 = i5;
                        this.label = 1;
                        if (camera2CameraMetadataExternalSyntheticLambda1OnNavigationEvent.onNavigationEvent(i5, i9 + iOnNavigationEvent, this) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i10 = onNavigationEvent + 83;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    private static final void onExtraCallback(Context context, getRuntimeSupportMax getruntimesupportmax, Function0<Unit> function0) {
        int i = 2 % 2;
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda61(getruntimesupportmax, context, function0));
        int i2 = onTransact + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback(getRuntimeSupportMax getruntimesupportmax, Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        getruntimesupportmax.onExtraCallback("DELETE");
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 71;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(getRuntimeSupportMax getruntimesupportmax, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            getruntimesupportmax.onExtraCallback("CANCEL");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        getruntimesupportmax.onExtraCallback("CANCEL");
        int i3 = 79 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(getRuntimeSupportMax getruntimesupportmax, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            getruntimesupportmax.onExtraCallback("CLOSE");
            return Unit.INSTANCE;
        }
        getruntimesupportmax.onExtraCallback("CLOSE");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 105;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[PHI: r0
      0x00a7: PHI (r0v9 java.lang.String) = (r0v8 java.lang.String), (r0v18 java.lang.String) binds: [B:41:0x00a5, B:38:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[PHI: r0
      0x00aa: PHI (r0v16 java.lang.String) = (r0v8 java.lang.String), (r0v18 java.lang.String) binds: [B:41:0x00a5, B:38:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(MaxAppOpenAdapterListener maxAppOpenAdapterListener, boolean z, Function1<? super Boolean, Unit> function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        String strOnExtraCallback;
        String str;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(840540982);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(maxAppOpenAdapterListener) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i5 = onTransact + 99;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        boolean z2 = true;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 147) != 146, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = asBinder + 3;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(840540982, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.DeleteActionButton (AssetHomeEditV2Screen.kt:402)");
            }
            if (z) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(897402657);
                String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_ui_asset_home_edit_v2_complete_menu, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                if ((i2 & 896) == 256) {
                    int i9 = onTransact + 49;
                    asBinder = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    z2 = false;
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z2 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda2(function1);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    int i11 = asBinder + 103;
                    onTransact = i11 % 128;
                    int i12 = i11 % 2;
                }
                MaxAppOpenAdapterListener.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 207608401, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -207608398, new Object[]{maxAppOpenAdapterListener, strOnExtraCallback2, (Function0) objOnMinimized, null, false, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i2 << 15) & 458752), 28}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                int i13 = asBinder + 25;
                onTransact = i13 % 128;
                if (i13 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(897198212);
                    strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_ui_asset_home_edit_v2_delete_menu, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    if ((i2 & 30779) != 15421) {
                        str = strOnExtraCallback;
                        z2 = false;
                    } else {
                        str = strOnExtraCallback;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(897198212);
                    strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_ui_asset_home_edit_v2_delete_menu, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    if ((i2 & 896) != 256) {
                    }
                }
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z2) {
                    AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda1(function1);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda1);
                    obj = externalSyntheticLambda1;
                    MaxAppOpenAdapterListener.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 207608401, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -207608398, new Object[]{maxAppOpenAdapterListener, str, (Function0) obj, null, false, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i2 << 15) & 458752), 28}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    obj = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    MaxAppOpenAdapterListener.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 207608401, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -207608398, new Object[]{maxAppOpenAdapterListener, str, (Function0) obj, null, false, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i2 << 15) & 458752), 28}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda3(maxAppOpenAdapterListener, z, function1, i));
        }
    }

    private static final Unit onExtraCallback(NetworkStream networkStream, List list, Function1 function1) {
        int i = 2 % 2;
        Iterator it = getMaintainOriginalImageBounds.IAuthTabCallback(networkStream.onNavigationEvent(), 1.0f, 0, 2, (Object) null).iterator();
        int i2 = onTransact + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda7 = (Camera2CameraControlExternalSyntheticLambda7) it.next();
            if (CollectionsKt.getOrNull(list, camera2CameraControlExternalSyntheticLambda7.onExtraCallbackWithResult()) instanceof UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted) {
                int i4 = asBinder + 71;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                function1.invoke(((UpdatePluginCallback.IAuthTabCallback) list.get(camera2CameraControlExternalSyntheticLambda7.onExtraCallbackWithResult())).IAuthTabCallback());
            }
        }
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback implements PointerInputEventHandler {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ NetworkStream IAuthTabCallback;
        final /* synthetic */ Function2<setUseCaseAttached, Integer, Unit> onExtraCallbackWithResult;
        final /* synthetic */ boolean onNavigationEvent;

        IAuthTabCallback(boolean z, NetworkStream networkStream, Function2<? super setUseCaseAttached, ? super Integer, Unit> function2) {
            this.onNavigationEvent = z;
            this.IAuthTabCallback = networkStream;
            this.onExtraCallbackWithResult = function2;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(NetworkStream networkStream, HandlerScheduledExecutorService2 handlerScheduledExecutorService2, setUseCaseAttached setusecaseattached) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(networkStream, handlerScheduledExecutorService2, setusecaseattached);
            int i4 = onExtraCallback + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallback;
        }

        public static /* synthetic */ Unit onNavigationEvent(NetworkStream networkStream) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(networkStream);
            if (i3 == 0) {
                int i4 = 76 / 0;
            }
            int i5 = onWarmupCompleted + 85;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unitOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(NetworkStream networkStream) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(networkStream);
            int i4 = onWarmupCompleted + 81;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }

        public static /* synthetic */ Unit onWarmupCompleted(boolean z, NetworkStream networkStream, Function2 function2, setUseCaseAttached setusecaseattached) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallback(z, networkStream, function2, setusecaseattached);
            }
            onExtraCallback(z, networkStream, function2, setusecaseattached);
            throw null;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            Object objOnExtraCallbackWithResult = FeatureCombinationQueryImplExternalSyntheticLambda10.onExtraCallbackWithResult(highPriorityExecutor, new AssetHomeEditV2ScreenKt$AssetHomeEditV2Content$3$1$1$.ExternalSyntheticLambda0(this.onNavigationEvent, this.IAuthTabCallback, this.onExtraCallbackWithResult), new AssetHomeEditV2ScreenKt$AssetHomeEditV2Content$3$1$1$.ExternalSyntheticLambda1(this.IAuthTabCallback), new AssetHomeEditV2ScreenKt$AssetHomeEditV2Content$3$1$1$.ExternalSyntheticLambda2(this.IAuthTabCallback), new AssetHomeEditV2ScreenKt$AssetHomeEditV2Content$3$1$1$.ExternalSyntheticLambda3(this.IAuthTabCallback), access13800Var);
            if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i2 = onWarmupCompleted + 69;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 87;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallbackWithResult;
        }

        private static final Unit onExtraCallback(boolean z, NetworkStream networkStream, Function2 function2, setUseCaseAttached setusecaseattached) {
            int i = 2 % 2;
            if (!z) {
                int i2 = onWarmupCompleted + 83;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    networkStream.onExtraCallbackWithResult(setusecaseattached.onExtraCallback());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda7OnExtraCallbackWithResult = networkStream.onExtraCallbackWithResult(setusecaseattached.onExtraCallback());
                if (camera2CameraControlExternalSyntheticLambda7OnExtraCallbackWithResult != null) {
                    function2.invoke(setusecaseattached, Integer.valueOf(camera2CameraControlExternalSyntheticLambda7OnExtraCallbackWithResult.onExtraCallbackWithResult()));
                    int i3 = onWarmupCompleted + 41;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            return Unit.INSTANCE;
        }

        private static final Unit onExtraCallback(NetworkStream networkStream) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            networkStream.IAuthTabCallbackStub();
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 11;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 32 / 0;
            }
            return unit;
        }

        private static final Unit onExtraCallbackWithResult(NetworkStream networkStream) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            NetworkStream.IAuthTabCallback(-440394732, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, 440394733, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{networkStream});
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit IAuthTabCallback(NetworkStream networkStream, HandlerScheduledExecutorService2 handlerScheduledExecutorService2, setUseCaseAttached setusecaseattached) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(handlerScheduledExecutorService2, "");
            handlerScheduledExecutorService2.onExtraCallback();
            networkStream.onExtraCallback(setusecaseattached.onExtraCallback());
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 103;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        String strOnExtraCallback;
        ((Number) objArr[0]).intValue();
        UpdatePluginCallback.IAuthTabCallback iAuthTabCallback = (UpdatePluginCallback.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            strOnExtraCallback = iAuthTabCallback.onExtraCallback();
            int i3 = 59 / 0;
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            strOnExtraCallback = iAuthTabCallback.onExtraCallback();
        }
        int i4 = onTransact + 97;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    static final class onExtraCallback implements Function1<Boolean, Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function2<Boolean, String, Unit> IAuthTabCallback;
        final /* synthetic */ UpdatePluginCallback.IAuthTabCallback onExtraCallback;

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(Function2<? super Boolean, ? super String, Unit> function2, UpdatePluginCallback.IAuthTabCallback iAuthTabCallback) {
            this.IAuthTabCallback = function2;
            this.onExtraCallback = iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(((Boolean) obj).booleanValue());
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 17;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 64 / 0;
            }
            return unit;
        }

        public final void onExtraCallbackWithResult(boolean z) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(Boolean.valueOf(z), this.onExtraCallback.IAuthTabCallback());
            int i4 = onWarmupCompleted + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    static final class onExtraCallbackWithResult implements Function0<Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function1<String, Unit> onExtraCallback;
        final /* synthetic */ UpdatePluginCallback.IAuthTabCallback onExtraCallbackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(Function1<? super String, Unit> function1, UpdatePluginCallback.IAuthTabCallback iAuthTabCallback) {
            this.onExtraCallback = function1;
            this.onExtraCallbackWithResult = iAuthTabCallback;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted();
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 43;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(this.onExtraCallbackWithResult.IAuthTabCallbackDefault());
            int i4 = onWarmupCompleted + 7;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(NetworkStream networkStream, List<? extends UpdatePluginCallback.IAuthTabCallback> list, boolean z, Function1<? super String, ? extends getSupportedHighSpeedResolutionsFor<Boolean>> function1, Function1<? super String, ? extends getSupportedHighSpeedResolutionsFor<Boolean>> function12, Function2<? super setUseCaseAttached, ? super Integer, Unit> function2, Function1<? super String, Unit> function13, Function2<? super Boolean, ? super String, Unit> function22, Function1<? super String, Unit> function14, Function2<? super Integer, ? super UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult, needCheckSnapshotMd5> function23, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z2;
        Object obj;
        boolean zOnExtraCallback;
        boolean z3;
        boolean z4;
        boolean z5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Object obj2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-941197344);
        Object obj3 = null;
        if ((i & 6) == 0) {
            int i7 = onTransact + 91;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(networkStream);
                obj3.hashCode();
                throw null;
            }
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(networkStream) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list)) {
                int i8 = asBinder + 97;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            int i10 = asBinder + 1;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i12 = onTransact + 25;
                asBinder = i12 % 128;
                i4 = i12 % 2 != 0 ? 22803 : 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function14) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            int i13 = asBinder + 87;
            onTransact = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 97 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function23) ? 536870912 : 268435456;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function23)) {
            }
            i2 |= i3;
            int i15 = onTransact + 103;
            asBinder = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = i2;
        if ((306783379 & i17) != 306783378) {
            int i18 = onTransact + 61;
            asBinder = i18 % 128;
            int i19 = i18 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i17 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        } else {
            int i20 = onTransact + 103;
            asBinder = i20 % 128;
            int i21 = i20 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-941197344, i17, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2Content (AssetHomeEditV2Screen.kt:432)");
            }
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START;
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(networkStream);
            int i22 = i17 & 112;
            boolean z6 = i22 == 32;
            int i23 = i17 & 3670016;
            boolean z7 = i23 == 1048576;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(!(zOnExtraCallback2 | z6 | z7))) {
                AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda46 externalSyntheticLambda46 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda46(networkStream, list, function13);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda46);
                obj = externalSyntheticLambda46;
                AndroidTextContextMenuToolbarProviderExternalSyntheticLambda5.IAuthTabCallback(onextracallbackwithresult, (TextFieldScrollKtExternalSyntheticLambda0) null, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 2);
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(networkStream);
                z3 = i22 != 32;
                z4 = i23 == 1048576;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback | z3 | (!z4)) {
                    int i24 = asBinder + 69;
                    onTransact = i24 % 128;
                    if (i24 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new onWarmupCompleted(networkStream, list, function13, (access13800) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(list, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i17 >> 3) & 14);
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
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
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnNavigationEvent = networkStream.onNavigationEvent();
                    DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnNavigationEvent = StillCaptureFlashStopRepeatingQuirk.onNavigationEvent(ZslDisablerQuirk.onExtraCallbackWithResult(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                    Unit unit = Unit.INSTANCE;
                    int i25 = i17 & 896;
                    boolean z8 = i25 == 256;
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(networkStream);
                    boolean z9 = (458752 & i17) == 131072;
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((z9 | z8 | zOnExtraCallback3) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new IAuthTabCallback(z, networkStream, function2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, unit, (PointerInputEventHandler) objOnMinimized3);
                    boolean z10 = i22 == 32;
                    boolean z11 = i25 == 256;
                    boolean z12 = (i17 & 7168) == 2048;
                    boolean z13 = (29360128 & i17) == 8388608;
                    boolean z14 = (57344 & i17) == 16384;
                    if ((1879048192 & i17) == 536870912) {
                        int i26 = asBinder + 121;
                        onTransact = i26 % 128;
                        int i27 = i26 % 2;
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z15 = (i17 & 234881024) == 67108864;
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (((z10 | z11 | z12 | z13 | z14 | z5) || z15) || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda47 externalSyntheticLambda47 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda47(list, z, function1, function22, function12, function23, function14);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda47);
                        obj2 = externalSyntheticLambda47;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        obj2 = objOnMinimized4;
                    }
                    ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback, camera2CameraMetadataExternalSyntheticLambda1OnNavigationEvent, deviceQuirksExternalSyntheticLambda0OnNavigationEvent, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult2, 0, 504);
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                AndroidTextContextMenuToolbarProviderExternalSyntheticLambda5.IAuthTabCallback(onextracallbackwithresult, (TextFieldScrollKtExternalSyntheticLambda0) null, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 2);
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(networkStream);
                if (i22 != 32) {
                }
                if (i23 == 1048576) {
                }
                Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback | z3 | (!z4)) {
                }
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda48(networkStream, list, z, function1, function12, function2, function13, function22, function14, function23, i));
        }
    }

    private static final Unit onNavigationEvent(boolean z, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        String strOnExtraCallback;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        Object obj = null;
        if ((i & 6) == 0) {
            int i4 = asBinder + 115;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar);
                obj.hashCode();
                throw null;
            }
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onTransact + 35;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1376616074, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.TitleContent.<anonymous> (AssetHomeEditV2Screen.kt:533)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1376616074, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.TitleContent.<anonymous> (AssetHomeEditV2Screen.kt:533)");
            }
            if (z) {
                int i6 = onTransact + 93;
                asBinder = i6 % 128;
                if (i6 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1873317823);
                    strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_ui_asset_home_edit_v2_delete_mode_title, cameraCaptureResultEmptyCameraCaptureResult, 1);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1873317823);
                    strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_ui_asset_home_edit_v2_delete_mode_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1873431531);
                strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_ui_asset_home_edit_v2_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, strOnExtraCallback, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 24576), 10}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1692174350);
        if ((i & 6) == 0) {
            int i4 = asBinder + 89;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i6 = asBinder + 31;
                onTransact = i6 % 128;
                int i7 = i6 % 2 == 0 ? 2 : 4;
                i2 = i7 | i;
            }
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1692174350, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.TitleContent (AssetHomeEditV2Screen.kt:528)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-1376616074, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda14(z), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback(), (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResult2, 390, 48, 14330);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            int i8 = asBinder + 71;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda15(z, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(UpdatePluginCallback.IAuthTabCallback.onExtraCallback onextracallback, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onTransact + 41;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        boolean z = false;
        if ((i & 6) == 0) {
            int i7 = onTransact + 55;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 40 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled)) {
                    int i9 = asBinder + 99;
                    onTransact = i9 % 128;
                    int i10 = i9 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            } else if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled))) {
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i11 = onTransact + 111;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i13 = onTransact + 15;
            asBinder = i13 % 128;
            int i14 = i13 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(423410943, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.CategoryContent.<anonymous> (AssetHomeEditV2Screen.kt:550)");
            }
            areallitemsenabled.onWarmupCompleted(onextracallback.onNavigationEvent(), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 18) & 3670016, 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i15 = asBinder + 11;
            onTransact = i15 % 128;
            int i16 = i15 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[PHI: r1
      0x0033: PHI (r1v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
      0x0028: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(UpdatePluginCallback.IAuthTabCallback.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = asBinder + 33;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(562791816);
            if ((i & 18) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(562791816);
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 3) != 2) {
            int i5 = asBinder + 3;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i7 = onTransact + 71;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(562791816, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.CategoryContent (AssetHomeEditV2Screen.kt:547)");
                int i8 = asBinder + 113;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
            }
            w2.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(423410943, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda52(onextracallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, (wa.onTransact) null, wa.IAuthTabCallback.Companion.onWarmupCompleted(), 0.0f, (wa.onNavigationEvent) null, (getBacktraceNote) null, (wa.IAuthTabCallbackStub) null, (wa.onExtraCallback) null, (getBacktraceNote) null, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 0, 4086);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onTransact + 75;
                asBinder = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda53(onextracallback, i));
        }
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ boolean $isExpanded;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<isQueryRefinementEnabled<Float, onSuggestionsKey>> $rotationAngle$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(boolean z, getSupportedHighSpeedResolutionsFor<isQueryRefinementEnabled<Float, onSuggestionsKey>> getsupportedhighspeedresolutionsfor, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$isExpanded = z;
            this.$rotationAngle$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = new access000(this.$isExpanded, this.$rotationAngle$delegate, access13800Var);
            int i2 = onExtraCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return access000Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 47;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            float f;
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallbackWithResult + 27;
                int i6 = i5 % 128;
                onExtraCallback = i6;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = i6 + 7;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                isQueryRefinementEnabled isqueryrefinementenabledOnExtraCallback = AppxNgRuntimeCheckerSoloPackageType.onExtraCallback(this.$rotationAngle$delegate);
                if (this.$isExpanded) {
                    int i9 = onExtraCallbackWithResult + 107;
                    onExtraCallback = i9 % 128;
                    f = 180.0f;
                    if (i9 % 2 != 0) {
                        int i10 = 68 / 0;
                    }
                } else {
                    int i11 = onExtraCallback + 107;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 3 % 5;
                    }
                    f = 0.0f;
                }
                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(f);
                getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(300, 0, setSubmitButtonEnabled.onExtraCallback(), 2, (Object) null);
                this.label = 1;
                if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabledOnExtraCallback, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(Context context, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onTransact + 45;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((i & 72) != 0) {
                i2 = i;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
                int i5 = onTransact + 31;
                asBinder = i5 % 128;
                int i6 = i5 % 2 != 0 ? 2 : 4;
                i2 = i | i6;
            }
        } else {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i7 = asBinder + 77;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1678875330, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.HiddenCategoryContent.<anonymous> (AssetHomeEditV2Screen.kt:578)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i9 = asBinder + 55;
                onTransact = i9 % 128;
                if (i9 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ensureNavButtonView.onExtraCallback(verifyDrawable.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(onextracallback, RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f))), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onActivityLayout(), (toMetersPerSecond) null, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.5f), ByteOrderedDataOutputStream.onExtraCallback(((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue() ? 234881023 : 83886080), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)));
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f);
            immediateFailedFuture immediatefailedfutureOnNavigationEvent = ResourceSizeKt.onNavigationEvent(immediateFailedFuture.Companion);
            Object[] objArr = new Object[1];
            a((short) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 96), (byte) (105 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2110671652, ((byte) KeyEvent.getModifierMetaStateMask()) - 755030597, TextUtils.getCapsMode("", 0, 0) - 12, objArr);
            w3bVar.onExtraCallbackWithResult(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0OnExtraCallback, fIAuthTabCallback, immediatefailedfutureOnNavigationEvent, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 3462, 112);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onTransact + 45;
                asBinder = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 17) != 16, iIntValue & 1)) {
            int i2 = asBinder + 33;
            onTransact = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1375549682, iIntValue, -1, "im.toss.features.home.ui.view.asset.edit.v2.HiddenCategoryContent.<anonymous> (AssetHomeEditV2Screen.kt:595)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.home_ui_asset_home_edit_v2_hidden_section_title, new Object[]{onwarmupcompleted.onWarmupCompleted(), Integer.valueOf(onwarmupcompleted.onNavigationEvent().size())}, cameraCaptureResultEmptyCameraCaptureResult, 0), null, AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onTransact + 33;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i4 = onTransact + 63;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackDefault(((Number) onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<isQueryRefinementEnabled<Float, onSuggestionsKey>>) getsupportedhighspeedresolutionsfor).IAuthTabCallback()).floatValue());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 81;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(boolean z, Resources resources, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) throws Resources.NotFoundException {
        String string;
        int i = 2 % 2;
        int i2 = asBinder + 53;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        if (z) {
            string = resources.getString(R.string.home_ui_asset_home_edit_v2_hidden_state_expanded);
            Intrinsics.checkNotNull(string);
        } else {
            string = resources.getString(R.string.home_ui_asset_home_edit_v2_hidden_state_collapsed);
            Intrinsics.checkNotNull(string);
        }
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, string);
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 95;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted onwarmupcompleted, boolean z, Resources resources, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z2;
        long jLongValue;
        int i3;
        int i4 = 2 % 2;
        int i5 = asBinder + 17;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            int i7 = asBinder + 59;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                i3 = 2;
            } else {
                int i9 = onTransact + 121;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
                i3 = 4;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i11 = onTransact + 43;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1894934910, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.HiddenCategoryContent.<anonymous> (AssetHomeEditV2Screen.kt:603)");
            }
            if (onwarmupcompleted.onNavigationEvent().isEmpty()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1043251740);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1044139177);
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-33677051);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-33676091);
                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda24(getsupportedhighspeedresolutionsfor);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(onextracallback, (Function1) objOnMinimized);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(resources);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | zOnExtraCallback2)) {
                    int i13 = onTransact + 47;
                    asBinder = i13 % 128;
                    int i14 = i13 % 2;
                    if (objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
                        objOnMinimized2 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda25(z, resources);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, false, (Function1) objOnMinimized2, 1, (Object) null);
                    Object[] objArr = new Object[1];
                    a((short) (TextUtils.indexOf("", "", 0, 0) + 30), (byte) ((-124) - Gravity.getAbsoluteGravity(0, 0)), 2110671710 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) - 755030598, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 13, objArr);
                    rightPreset.onNavigationEvent(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0OnExtraCallbackWithResult, fIAuthTabCallback, (String) null, jLongValue, (immediateFailedFuture) null, cameraCaptureResultEmptyCameraCaptureResult, (3670016 & (i2 << 18)) | 390, 40);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted onwarmupcompleted, boolean z, Function1<? super Boolean, Unit> function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z3;
        Function0 function0;
        boolean z4;
        boolean z5;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1599759765);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onwarmupcompleted) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i4 = asBinder + 113;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z);
                obj.hashCode();
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i5 = asBinder + 11;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146) {
            int i7 = asBinder + 93;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1599759765, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.HiddenCategoryContent (AssetHomeEditV2Screen.kt:564)");
                int i9 = onTransact + 99;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
            }
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted2.onExtraCallback()) {
                int i11 = asBinder + 87;
                onTransact = i11 % 128;
                objOnMinimized = i11 % 2 == 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(isIconified.onWarmupCompleted(0.0f, 1.0f, 2, (Object) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 4, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            int i12 = i2 & 112;
            if (i12 == 32) {
                int i13 = onTransact + 17;
                asBinder = i13 % 128;
                int i14 = i13 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z3 || objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized2 = new access000(z, getsupportedhighspeedresolutionsfor, null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 >> 3) & 14);
            if (onwarmupcompleted.onNavigationEvent().isEmpty()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1483376078);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                function0 = null;
            } else {
                int i15 = asBinder + 33;
                onTransact = i15 % 128;
                if (i15 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1483429242);
                    z4 = (i2 & INIXSAFEProtocolException.FAIL_TO_NFILTER_DECRYPT) == 29467;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1483429242);
                    if ((i2 & 896) == 256) {
                    }
                }
                if (i12 == 32) {
                    int i16 = asBinder + 43;
                    onTransact = i16 % 128;
                    int i17 = i16 % 2;
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z4 | z5) || objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized3 = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda40(function1, z);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                function0 = (Function0) objOnMinimized3;
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-1375549682, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda41(onwarmupcompleted), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(1678875330, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda42(context), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(1894934910, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda43(onwarmupcompleted, z, resources, getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, function0, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 196998, 0, 114650);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda44(onwarmupcompleted, z, function1, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(boolean z, needCheckSnapshotMd5 needchecksnapshotmd5, Context context, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        List<DefaultSurfaceProcessorFactoryExternalSyntheticLambda0> listOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onTransact + 93;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            int i3 = 31 / 0;
            if (!z) {
                int i4 = onTransact + 45;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                listOnNavigationEvent = needchecksnapshotmd5.onNavigationEvent(context);
            } else {
                listOnNavigationEvent = CollectionsKt.emptyList();
            }
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            if (!z) {
            }
        }
        unregisterOutputSurface.onExtraCallbackWithResult(useandconfigureprogramwithtexture, listOnNavigationEvent);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        String strOnNavigationEvent;
        int i2;
        int i3 = 2 % 2;
        int i4 = onTransact + 101;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
                int i6 = onTransact + 29;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
            int i8 = onTransact + 79;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onTransact + 115;
                asBinder = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1620204281, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetContent.<anonymous>.<anonymous> (AssetHomeEditV2Screen.kt:651)");
                    int i11 = 14 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1620204281, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetContent.<anonymous>.<anonymous> (AssetHomeEditV2Screen.kt:651)");
                }
            }
            if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0)) {
                strOnNavigationEvent = onextracallbackwithresult.onWarmupCompleted();
                if (strOnNavigationEvent == null) {
                    int i12 = onTransact + 1;
                    asBinder = i12 % 128;
                    int i13 = i12 % 2;
                    strOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
                }
            } else {
                strOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
            }
            defaultValue.onNavigationEvent(w3bVar, strOnNavigationEvent, false, onextracallbackwithresult.IAuthTabCallbackStub(), (String) null, cameraCaptureResultEmptyCameraCaptureResult, i & 14, 10);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = (UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult) objArr[0];
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        String strOnNavigationEvent = onextracallbackwithresult.onTransact().onNavigationEvent();
        if (strOnNavigationEvent == null) {
            int i4 = asBinder + 105;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                onextracallbackwithresult.onTransact().onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            strOnNavigationEvent = onextracallbackwithresult.onTransact().onExtraCallback();
        }
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, strOnNavigationEvent);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = asBinder + 103;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = asBinder + 69;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(255401978, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetContent.<anonymous>.<anonymous>.<anonymous> (AssetHomeEditV2Screen.kt:663)");
                int i7 = onTransact + 87;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
            }
            hasProvider hasproviderIAuthTabCallback = PerfId.IAuthTabCallback(onextracallbackwithresult.onTransact().onExtraCallback());
            long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
            GraphicDeviceInfo graphicDeviceInfoIAuthTabCallback = GraphicDeviceInfo.Companion.IAuthTabCallback();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda50(onextracallbackwithresult);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderIAuthTabCallback, getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null), (getHumanReadableName) null, jLongValue, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, graphicDeviceInfoIAuthTabCallback, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1572864, 196596);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = asBinder + 89;
                onTransact = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 / 4;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            onextracallbackwithresult.asInterface().onNavigationEvent();
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        String strOnNavigationEvent = onextracallbackwithresult.asInterface().onNavigationEvent();
        if (strOnNavigationEvent == null) {
            int i3 = onTransact + 25;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            strOnNavigationEvent = onextracallbackwithresult.asInterface().onExtraCallback();
        }
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, strOnNavigationEvent);
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        long jLongValue;
        int i2 = 2 % 2;
        int i3 = asBinder + 11;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i5 = asBinder + 103;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            int i7 = asBinder + 47;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(170592507, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetContent.<anonymous>.<anonymous>.<anonymous> (AssetHomeEditV2Screen.kt:673)");
            }
            hasProvider hasproviderIAuthTabCallback = PerfId.IAuthTabCallback(onextracallbackwithresult.asInterface().onExtraCallback());
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(730648066);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(730649026);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            long j = jLongValue;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i9 = onTransact + 101;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda20(onextracallbackwithresult);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderIAuthTabCallback, getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null), (getHumanReadableName) null, j, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262132);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = onTransact + 115;
        asBinder = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asBinder + 87;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 59) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i4 = asBinder + 1;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = asBinder + 53;
                onTransact = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(647447506, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetContent.<anonymous>.<anonymous> (AssetHomeEditV2Screen.kt:661)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(647447506, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetContent.<anonymous>.<anonymous> (AssetHomeEditV2Screen.kt:661)");
            }
            w5aVar.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(255401978, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda22(onextracallbackwithresult), cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(170592507, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda23(onextracallbackwithresult), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(boolean z, UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, Function0 function0, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z2;
        long jLongValue;
        int i3;
        long jIEngagementSignalsCallbackStub;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i5 = onTransact + 109;
            asBinder = i5 % 128;
            z2 = i5 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i2 & 1)) {
            int i6 = onTransact + 117;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 24 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(928703939, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetContent.<anonymous>.<anonymous> (AssetHomeEditV2Screen.kt:684)");
                }
                if (z) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1159620260);
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-868685334);
                        jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-868684374);
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i8 = asBinder + 33;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                    float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
                    Object[] objArr = new Object[1];
                    a((short) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 96), (byte) (87 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 2110671583 - KeyEvent.keyCodeFromString(""), (-755030598) - (Process.myTid() >> 22), (-12) - Color.argb(0, 0, 0, 0), objArr);
                    i3 = 0;
                    rightPreset.onNavigationEvent(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, fIAuthTabCallback, (String) null, jLongValue, (immediateFailedFuture) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 390, 42);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1160220203);
                    if (onextracallbackwithresult.getInterfaceDescriptor()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1160154173);
                        String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_ui_asset_home_edit_v2_delete_asset_right_button, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
                        getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                        oExternalSyntheticLambda0.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted = oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion;
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-868697271);
                            jIEngagementSignalsCallbackStub = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-868696343);
                            jIEngagementSignalsCallbackStub = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IEngagementSignalsCallbackStub();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        oExternalSyntheticLambda1.IAuthTabCallback(strOnExtraCallback, quirksExternalSyntheticBackport0OnWarmupCompleted, 0L, onwarmupcompleted.IAuthTabCallback(jIEngagementSignalsCallbackStub, 0L, cameraCaptureResultEmptyCameraCaptureResult, 384, 2), (oExternalSyntheticLambda0.IAuthTabCallback) null, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, gethumanreadablename, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, function0, (Role) null, (Function1) null, false, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 245492);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1159674913);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    i3 = 0;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = onTransact + 41;
                    asBinder = i10 % 128;
                    if (i10 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i11 = 88 / i3;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                if (z) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(boolean z, needCheckSnapshotMd5 needchecksnapshotmd5, Context context, UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, Function0 function0, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 83;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
            int i4 = 35 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2003893073, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetContent.<anonymous> (AssetHomeEditV2Screen.kt:643)");
            }
        } else {
            Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(needchecksnapshotmd5);
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback | zOnNavigationEvent | zOnExtraCallback2)) {
            int i5 = onTransact + 115;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 90 / 0;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda26(z, needchecksnapshotmd5, context);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
            } else if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null);
        w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(647447506, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda27(onextracallbackwithresult), cameraCaptureResultEmptyCameraCaptureResult, 54), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), quirksExternalSyntheticBackport0OnExtraCallbackWithResult, ForwardingCameraControl.onExtraCallback(-1620204281, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda28(onextracallbackwithresult), cameraCaptureResultEmptyCameraCaptureResult, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(928703939, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda29(z, onextracallbackwithresult, function0), cameraCaptureResultEmptyCameraCaptureResult, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 1575990, 0, 65456);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, boolean z, boolean z2, needCheckSnapshotMd5 needchecksnapshotmd5, Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1194945495);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(needchecksnapshotmd5)) {
                int i6 = onTransact + 81;
                asBinder = i6 % 128;
                i4 = i6 % 2 != 0 ? 20474 : 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0))) {
                int i7 = onTransact + 121;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        boolean z3 = false;
        if ((i2 & 9363) != 9362) {
            int i9 = onTransact + 51;
            asBinder = i9 % 128;
            if (i9 % 2 == 0) {
                z3 = true;
            }
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1194945495, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.AssetContent (AssetHomeEditV2Screen.kt:636)");
            }
            setVerticalGravity.onWarmupCompleted(z, (QuirksExternalSyntheticBackport0) null, ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback((updateFocusedState) null, 0.0f, 3, (Object) null).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.onExtraCallback((updateFocusedState) null, (QuirkSettingsLoader.onWarmupCompleted) null, false, (Function1) null, 15, (Object) null)), ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted((updateFocusedState) null, 0.0f, 3, (Object) null).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback((updateFocusedState) null, (QuirkSettingsLoader.onWarmupCompleted) null, false, (Function1) null, 15, (Object) null)), (String) null, ForwardingCameraControl.onExtraCallback(-2003893073, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda38(z2, needchecksnapshotmd5, (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()), onextracallbackwithresult, function0), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 >> 3) & 14) | 200064, 18);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda39(onextracallbackwithresult, z, z2, needchecksnapshotmd5, function0, i));
        }
        int i10 = onTransact + 75;
        asBinder = i10 % 128;
        int i11 = i10 % 2;
    }

    private static final Unit onNavigationEvent(long j, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.access100(fliphorizontally.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f)));
            fliphorizontally.onExtraCallback(j);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.access100(fliphorizontally.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f)));
        fliphorizontally.onExtraCallback(j);
        int i3 = 61 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        boolean z;
        String strOnNavigationEvent;
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        Context context = (Context) objArr[0];
        UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = (UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult) objArr[1];
        w3b w3bVar = (w3b) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(w3bVar) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i3 = asBinder + 113;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(603455226, iIntValue, -1, "im.toss.features.home.ui.view.asset.edit.v2.DraggingAssetContent.<anonymous> (AssetHomeEditV2Screen.kt:728)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
            Object obj = null;
            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                int i5 = onTransact + 5;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                    obj.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            if (!((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue() || (strOnNavigationEvent = onextracallbackwithresult.onWarmupCompleted()) == null) {
                strOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
            }
            String str = strOnNavigationEvent;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(onextracallback, RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)));
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.5f);
            if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
                int i6 = onTransact + 31;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                i = 234881023;
            } else {
                i = 83886080;
            }
            int i8 = ((iIntValue << 21) & 29360128) | 384;
            w3bVar.onExtraCallbackWithResult(str, ensureNavButtonView.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, fIAuthTabCallback, ByteOrderedDataOutputStream.onExtraCallback(i), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f))), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f), (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult2, i8, 120);
            if (!onextracallbackwithresult.IAuthTabCallbackStub()) {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1155492814);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1154789362);
                w3bVar.onExtraCallbackWithResult(deprecated_authenticator.onWarmupCompleted("icon-exclamation-red-fill").IAuthTabCallback(deprecated_cache.Companion.IAuthTabCallback()), ensureNavButtonView.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(CaptureNoResponseQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult2.IAuthTabCallback()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f))), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f))), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, i8, 120);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onTransact + 47;
                asBinder = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        String strOnNavigationEvent = onextracallbackwithresult.onTransact().onNavigationEvent();
        if (strOnNavigationEvent == null) {
            strOnNavigationEvent = onextracallbackwithresult.onTransact().onExtraCallback();
            int i2 = asBinder + 115;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, strOnNavigationEvent);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 55;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onTransact + 45;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2145337107, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.DraggingAssetContent.<anonymous>.<anonymous> (AssetHomeEditV2Screen.kt:765)");
                int i5 = onTransact + 29;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
            }
            hasProvider hasproviderIAuthTabCallback = PerfId.IAuthTabCallback(onextracallbackwithresult.onTransact().onExtraCallback());
            long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
            GraphicDeviceInfo graphicDeviceInfoIAuthTabCallback = GraphicDeviceInfo.Companion.IAuthTabCallback();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i7 = onTransact + 91;
                asBinder = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda59(onextracallbackwithresult);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderIAuthTabCallback, getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null), (getHumanReadableName) null, jLongValue, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, graphicDeviceInfoIAuthTabCallback, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1572864, 196596);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        String strOnNavigationEvent = onextracallbackwithresult.asInterface().onNavigationEvent();
        if (strOnNavigationEvent == null) {
            int i2 = asBinder + 55;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            strOnNavigationEvent = onextracallbackwithresult.asInterface().onExtraCallback();
        }
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, strOnNavigationEvent);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 87;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asInterface(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long jLongValue;
        int i2 = 2 % 2;
        int i3 = onTransact + 119;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-654768402, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.DraggingAssetContent.<anonymous>.<anonymous> (AssetHomeEditV2Screen.kt:775)");
            }
            hasProvider hasproviderIAuthTabCallback = PerfId.IAuthTabCallback(onextracallbackwithresult.asInterface().onExtraCallback());
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i5 = onTransact + 69;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2127764277);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 107).ICustomTabsService();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2127764277);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2127765237);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            long j = jLongValue;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i6 = asBinder + 61;
                onTransact = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 91 / 0;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda7(onextracallbackwithresult);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderIAuthTabCallback, getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null), (getHumanReadableName) null, j, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262132);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i8 = onTransact + 103;
                        asBinder = i8 % 128;
                        if (i8 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i9 = 64 / 0;
                        } else {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        int i10 = onTransact + 29;
                        asBinder = i10 % 128;
                        int i11 = i10 % 2;
                    }
                } else {
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderIAuthTabCallback, getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null), (getHumanReadableName) null, j, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262132);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = onTransact + 33;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i6 = onTransact + 7;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onTransact + 1;
            asBinder = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-329491259, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.DraggingAssetContent.<anonymous> (AssetHomeEditV2Screen.kt:763)");
            }
            w5aVar.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-2145337107, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda31(onextracallbackwithresult), cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-654768402, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda32(onextracallbackwithresult), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onTransact + 23;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        int i;
        Object obj;
        long jPostMessage;
        boolean z = false;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = (UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i2 = 2 % 2;
        int i3 = asBinder + 47;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(25246727);
        Object obj2 = null;
        if ((iIntValue & 6) == 0) {
            int i5 = onTransact + 101;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue);
                obj2.hashCode();
                throw null;
            }
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            int i6 = asBinder + 125;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult);
                obj2.hashCode();
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 256 : 128;
        }
        if ((i & 147) != 146) {
            int i7 = onTransact + 123;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(25246727, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.DraggingAssetContent (AssetHomeEditV2Screen.kt:711)");
            }
            if (!zBooleanValue || onextracallbackwithresult == null) {
                obj = null;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(509786459);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(506232681);
                Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1507689131);
                    jPostMessage = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).newSession();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1507687947);
                    jPostMessage = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).postMessage();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(((Float) varyMatches.onNavigationEvent(1845166571, -1845166568, new Object[]{Float.valueOf(fFloatValue), displayMetrics}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).floatValue()), 0.0f, 0.0f, 13, (Object) null), 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0.0f, 2, (Object) null);
                boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jPostMessage);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnWarmupCompleted) {
                    int i9 = onTransact + 49;
                    asBinder = i9 % 128;
                    int i10 = i9 % 2;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda16(jPostMessage);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    obj = null;
                    w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-329491259, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda17(onextracallbackwithresult), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), verifyDrawable.onExtraCallbackWithResult(attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized), y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f))), ForwardingCameraControl.onExtraCallback(603455226, true, new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda18(context, onextracallbackwithresult), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, AbstractResource.onExtraCallback.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1575990, 0, 65456);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda19(zBooleanValue, onextracallbackwithresult, fFloatValue, iIntValue));
        }
        return obj;
    }

    private static final void onExtraCallback(UpdatePluginCallback.IAuthTabCallback.IAuthTabCallback iAuthTabCallback, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z3;
        String strIAuthTabCallback;
        long jLongValue;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1063717323);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i5 = onTransact + 121;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i7 = asBinder + 73;
                onTransact = i7 % 128;
                i3 = i7 % 2 == 0 ? 102 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i8 = asBinder + 81;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = asBinder + 61;
                onTransact = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1063717323, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.CategoryEmptyContent (AssetHomeEditV2Screen.kt:800)");
            }
            if (z) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-932944595);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-933898868);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    int i12 = onTransact + 71;
                    asBinder = i12 % 128;
                    if (i12 % 2 != 0) {
                        getAwbState.onExtraCallback();
                        throw null;
                    }
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i13 = onTransact + 13;
                    asBinder = i13 % 128;
                    int i14 = i13 % 2;
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
                if (iAuthTabCallback.onWarmupCompleted()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1541502539);
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1541432386);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null);
                if (FaceDetectCallBack.onExtraCallbackWithResult.IAuthTabCallback(iAuthTabCallback.onNavigationEvent(), true)) {
                    int i15 = onTransact + 39;
                    asBinder = i15 % 128;
                    int i16 = i15 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1541194058);
                    z3 = false;
                    strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.home_ui_asset_home_edit_v2_empty_section_title_euro, new Object[]{iAuthTabCallback.onNavigationEvent()}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    z3 = false;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1541053256);
                    strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.home_ui_asset_home_edit_v2_empty_section_title_ro, new Object[]{iAuthTabCallback.onNavigationEvent()}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1474315755);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1474316715);
                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                }
                long j = jLongValue;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                int i17 = asBinder + 19;
                onTransact = i17 % 128;
                int i18 = i17 % 2;
                boolean z4 = z3;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), Long.valueOf(j), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(z4 ? 1 : 0), Boolean.valueOf(z4), null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, Integer.valueOf(z4 ? 1 : 0), 130800}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i19 = onTransact + 31;
                asBinder = i19 % 128;
                int i20 = i19 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i21 = asBinder + 71;
                onTransact = i21 % 128;
                int i22 = i21 % 2;
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda0(iAuthTabCallback, z, i));
        }
    }

    private static final void onExtraCallbackWithResult(UpdatePluginCallback.IAuthTabCallback.asBinder asbinder, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-449498132);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(asbinder) ? 4 : 2) | i;
            int i4 = onTransact + 7;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i6 = asBinder + 49;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = asBinder + 61;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-449498132, i2, -1, "im.toss.features.home.ui.view.asset.edit.v2.SpacerContent (AssetHomeEditV2Screen.kt:828)");
            }
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(asbinder.onNavigationEvent())), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i10 = asBinder + 23;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda33(asbinder, i));
        }
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        long jNewAuthTabSession;
        long jNewAuthTabSession2;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(162612743);
        if (i != 0) {
            int i3 = onTransact + 77;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(162612743, i, -1, "im.toss.features.home.ui.view.asset.edit.v2.DividerContent (AssetHomeEditV2Screen.kt:833)");
            }
            AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult onExtraCallbackWithResult2 = AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            readFully.onExtraCallback onextracallback2 = readFully.Companion;
            setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(onextracallbackwithresult.IAuthTabCallbackDefault()));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1652033973);
                jNewAuthTabSession = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).receiveFile();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1652035157);
                jNewAuthTabSession = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).newAuthTabSession();
            }
            long j = jNewAuthTabSession;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i5 = asBinder + 111;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(Float.valueOf(0.25f), setByteOrder.onNavigationEvent(setByteOrder.onExtraCallbackWithResult(j, 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null)));
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i7 = asBinder + 65;
                onTransact = i7 % 128;
                if (i7 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1652040149);
                    jNewAuthTabSession2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 32).receiveFile();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1652040149);
                    jNewAuthTabSession2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).receiveFile();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1652041333);
                jNewAuthTabSession2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).newAuthTabSession();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(onExtraCallbackWithResult2, verifyDrawable.onWarmupCompleted(onextracallback, readFully.onExtraCallback.onNavigationEvent(onextracallback2, new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(Float.valueOf(0.75f), setByteOrder.onNavigationEvent(setByteOrder.onExtraCallbackWithResult(jNewAuthTabSession2, 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null)))}, 0.0f, 0.0f, 0, 14, (Object) null), (toMetersPerSecond) null, 0.0f, 6, (Object) null), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onTransact + 41;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i10 = asBinder + 75;
                onTransact = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetHomeEditV2ScreenKt$.ExternalSyntheticLambda30(i));
        }
    }

    private static final isQueryRefinementEnabled<Float, onSuggestionsKey> onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<isQueryRefinementEnabled<Float, onSuggestionsKey>> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = (isQueryRefinementEnabled) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onTransact + 11;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return isqueryrefinementenabled;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getRuntimeSupportMax getruntimesupportmax, Resources resources, Function0 function0, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1224550060, 1224550070, new Object[]{getruntimesupportmax, resources, function0, assetHomeEditV2ViewModel, commonModule_setLeftEdgeTouchEnabled}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1991565489, 1991565510, new Object[]{function1}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted onwarmupcompleted, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -57033132, 57033157, new Object[]{onwarmupcompleted, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, int i, int i2) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1776745100, -1776745073, new Object[]{assetHomeEditV2ViewModel, getruntimesupportmax, Integer.valueOf(i), Integer.valueOf(i2)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, SessionTrackerb sessionTrackerb, String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 814909995, -814909992, new Object[]{assetHomeEditV2ViewModel, getruntimesupportmax, sessionTrackerb, str, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(Context context, UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1957167822, -1957167808, new Object[]{context, onextracallbackwithresult, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted onwarmupcompleted, boolean z, Resources resources, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -626053360, 626053378, new Object[]{onwarmupcompleted, Boolean.valueOf(z), resources, getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(NetworkStream networkStream, setUseCaseAttached setusecaseattached, int i) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1109817622, -1109817606, new Object[]{networkStream, setusecaseattached, Integer.valueOf(i)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(getRuntimeSupportMax getruntimesupportmax, Function0 function0, DialogInterface dialogInterface) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 344350981, -344350962, new Object[]{getruntimesupportmax, function0, dialogInterface}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(NetworkStream networkStream, List list, boolean z, Function1 function1, Function1 function12, Function2 function2, Function1 function13, Function2 function22, Function1 function14, Function2 function23, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1686156751, 1686156751, new Object[]{networkStream, list, Boolean.valueOf(z), function1, function12, function2, function13, function22, function14, function23, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(getRuntimeSupportMax getruntimesupportmax, findResAndMsg findresandmsg, String str) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1249561855, 1249561862, new Object[]{getruntimesupportmax, findresandmsg, str}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, needCheckSnapshotMd5 needchecksnapshotmd5, Context context, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -2056493334, 2056493335, new Object[]{Boolean.valueOf(z), needchecksnapshotmd5, context, useandconfigureprogramwithtexture}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(MaxAppOpenAdapterListener maxAppOpenAdapterListener, boolean z, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -325592250, 325592263, new Object[]{maxAppOpenAdapterListener, Boolean.valueOf(z), function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1473951904, 1473951912, new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, flipHorizontally fliphorizontally) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -797981558, 797981570, new Object[]{getsupportedhighspeedresolutionsfor, fliphorizontally}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1630693238, -1630693209, new Object[]{onextracallbackwithresult, useandconfigureprogramwithtexture}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(List list, boolean z, Function1 function1, Function2 function2, Function1 function12, Function2 function22, Function1 function13, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 72707003, -72706994, new Object[]{list, Boolean.valueOf(z), function1, function2, function12, function22, function13, audioRestrictionControllerImplExternalSyntheticLambda0}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Object onNavigationEvent(int i, UpdatePluginCallback.IAuthTabCallback iAuthTabCallback) {
        return onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -30893213, 30893219, new Object[]{Integer.valueOf(i), iAuthTabCallback}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static final void onNavigationEvent(@NotNull AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, @NotNull getRuntimeSupportMax getruntimesupportmax, @NotNull SessionTrackerb sessionTrackerb, @NotNull String str, @NotNull Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -890816982, 890816984, new Object[]{assetHomeEditV2ViewModel, getruntimesupportmax, sessionTrackerb, str, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(getRuntimeSupportMax getruntimesupportmax, AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, boolean z) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 833051827, -833051805, new Object[]{getruntimesupportmax, assetHomeEditV2ViewModel, Boolean.valueOf(z)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, getRuntimeSupportMax getruntimesupportmax, int i, int i2) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 2073421504, -2073421484, new Object[]{assetHomeEditV2ViewModel, getruntimesupportmax, Integer.valueOf(i), Integer.valueOf(i2)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit onExtraCallbackWithResult(getRuntimeSupportMax getruntimesupportmax, AssetForEditV2Dto.Asset asset, AssetForEditV2Dto.Category category, AssetForEditV2Dto.Category category2) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1418190376, -1418190348, new Object[]{getruntimesupportmax, asset, category, category2}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit onExtraCallbackWithResult(UpdatePluginCallback.IAuthTabCallback.onExtraCallback onextracallback, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -967144245, 967144275, new Object[]{onextracallback, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final void IAuthTabCallback(boolean z, UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -636095398, 636095413, new Object[]{Boolean.valueOf(z), onextracallbackwithresult, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(Context context, UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -689007913, 689007930, new Object[]{context, onextracallbackwithresult, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(Function1 function1, boolean z) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1008932979, 1008932990, new Object[]{function1, Boolean.valueOf(z)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted onwarmupcompleted, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1476458395, 1476458421, new Object[]{onwarmupcompleted, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted onwarmupcompleted, boolean z, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 260313967, -260313943, new Object[]{onwarmupcompleted, Boolean.valueOf(z), function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(getRuntimeSupportMax getruntimesupportmax, Context context, Function0 function0, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -241144331, 241144335, new Object[]{getruntimesupportmax, context, function0, commonModule_setLeftEdgeTouchEnabled}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    static {
        asInterface = 0;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a((short) (View.resolveSizeAndState(0, 0, 0) - 21), (byte) (32 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 2110671778 - View.MeasureSpec.makeMeasureSpec(0, 0), (-755030598) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-12) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((short) (4 - View.MeasureSpec.makeMeasureSpec(0, 0)), (byte) (83 - Process.getGidForName("")), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2110671838, (-755030599) - Process.getGidForName(""), (ViewConfiguration.getJumpTapTimeout() >> 16) - 12, objArr2);
        onNavigationEvent = ((String) objArr2[0]).intern();
        int i = IAuthTabCallbackStubProxy + 43;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    static void IAuthTabCallback() {
        onExtraCallback = 645295401;
        onWarmupCompleted = -1538795517;
        IAuthTabCallback = -1991834970;
        IAuthTabCallbackDefault = new byte[]{50, 70, 65, -67, Byte.MIN_VALUE, -2, 64, -3, -65, -122, -2, -11, 66, 0, -124, -4, -10, 6, 55, -1, 76, -11, 75, -72, 55, 72, -6, 66, 0, Byte.MIN_VALUE, 64, -13, 69, 5, -120, -69, -6, 55, 70, 65, -66, -125, -6, 64, -13, 69, 5, 61, -5, 4, -124, -1, -5, 68, -71, 52, 69, 74, -20, 82, -2, -69, -1, 74, 56, -4, 67, -1, -13, 39, -8, -1, -125, 52, -43, -14, -54, -69, 56, -57, -56, -7, -7, -45, -11, -54, -74, 62, -2, -51, -5, -69, 54, -123, -60, 9, -8, -1, Byte.MIN_VALUE, 61, -60, -2, -51, -5, -69, 3, -59, -70, 58, -63, -59, -6, -121, 10, -5, -12, -46, -20, -64, -123, -63, -12, 6, -62, -3, -63, -51, 49, 87, 84, -96, 21, 111, 85, 96, -82, 41, Byte.MAX_VALUE, 85, 83, 111, 105, 92, -84, 21, 93, 102, 121, -99, 28, 102, 83, 110, Byte.MAX_VALUE, -102, 21, 85, 98, 104, -88, 29, -86, 107, 38, 87, 84, -81, 18, 107, 85, 98, 104, -88, 32, 106, -87, 41, 110, 106, 105, -84, 57, 104, 91, 113, 67, 111, -86, 110, 91, 45, 97, 82, 110, 98, 57, -4, -7, 54, 57, -89, 50, -4, -6, 115, -93, 53, 48, 61, 52, -23, -119, -72, 48, -6, 61, 74, 35, -2, -4, 63, 61, -5, 73, 35, -89, 75, -7, -30, 61, 50, 48, 58, -1, 49, 56, -72, 61, 49, -8, 115, 8, -25, -30, 64, -22, 62, 113, 61, -30, -12, 48, -7, 61, 73, 56, -81, -84, 81, 108, -30, 69, -81, -83, 6, -17, 81, 88, -85, 83, 98, -102, 80, -82, -83, 69, 84, -103, -81, 90, 88, -82, 92, 86, -30, 94, -84, -107, 88, 69, 91, 109, -102, 68, 99, -29, 88, 68, -93, 6, -109, -94, -107, 75, -67, 89, 4, 88, -107, -121, 91, -84, 88, 92};
    }
}
