package o;

import android.content.Context;
import android.graphics.Shader;
import android.view.animation.LinearInterpolator;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;
import im.toss.tds.foundation.anim.rally.RallysKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.attachAppLovinSdk;
import o.getKekid;
import o.getMediaContentViewGroup;
import o.getSupportedHighSpeedResolutionsFor;
import o.mExternalSyntheticApiModelOutline1;
import o.mExternalSyntheticLambda8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class mExternalSyntheticApiModelOutline1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final mExternalSyntheticApiModelOutline1 onWarmupCompleted = new mExternalSyntheticApiModelOutline1();

    public static abstract class IAuthTabCallbackStubProxy {
        public abstract Shader onWarmupCompleted(float f, float f2);
    }

    static {
        int i = onNavigationEvent + 7;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        mExternalSyntheticLambda8 mexternalsyntheticlambda8 = (mExternalSyntheticLambda8) objArr[0];
        QuirkSettingsLoader quirkSettingsLoader = (QuirkSettingsLoader) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(mexternalsyntheticlambda8, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallback + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline1, List list, IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, boolean z, getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, bindChildren bindchildren, use useVar, long j4, GraphicDeviceInfo graphicDeviceInfo, onExtraCallbackWithResult onextracallbackwithresult, onTransact ontransact, IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, Object obj, int i4, int i5, int i6, int i7, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i8) {
        int i9 = 2 % 2;
        int i10 = IAuthTabCallback + 111;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(mexternalsyntheticapimodeloutline1, list, iAuthTabCallback, quirksExternalSyntheticBackport0, i, i2, i3, z, gethumanreadablename, j, j2, j3, f, bindchildren, useVar, j4, graphicDeviceInfo, onextracallbackwithresult, ontransact, iAuthTabCallbackStubProxy, obj, i4, i5, i6, i7, cameraCaptureResultEmptyCameraCaptureResult, i8);
        int i12 = onExtraCallback + 85;
        IAuthTabCallback = i12 % 128;
        if (i12 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnTransact = onTransact();
        int i4 = onExtraCallback + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirkSettingsLoader quirkSettingsLoader, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(mexternalsyntheticlambda8, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 93;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub();
        }
        IAuthTabCallbackStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = (~(i8 | i6)) | i7;
        int i10 = (~(i7 | (~i6) | i5)) | (~(i8 | i7 | i6));
        int i11 = (~(i5 | i6)) | (~(i4 | i5));
        int i12 = i4 + i5 + i + ((-1520811122) * i2) + (1880343047 * i3);
        int i13 = i12 * i12;
        int i14 = ((i4 * (-660833811)) - 1995073173) + (i5 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + ((-660833671) * i) + (644061726 * i2) + ((-2012083377) * i3) + (i13 * (-1027145728));
        switch ((((-88056299) * i4) - 1254686720) + (875799021 * i5) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i) + ((-206831616) * i2) + (408289280 * i3) + ((-683737088) * i13) + (i14 * i14 * 814809088)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                mExternalSyntheticLambda8 mexternalsyntheticlambda8 = (mExternalSyntheticLambda8) objArr[0];
                QuirkSettingsLoader quirkSettingsLoader = (QuirkSettingsLoader) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i15 = 2 % 2;
                if ((iIntValue & 3) != 2) {
                    int i16 = IAuthTabCallback + 103;
                    int i17 = i16 % 128;
                    onExtraCallback = i17;
                    int i18 = i16 % 2;
                    int i19 = i17 + 85;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1))) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i21 = IAuthTabCallback + 121;
                        onExtraCallback = i21 % 128;
                        int i22 = i21 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1288821699, iIntValue, -1, "im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1.To.<anonymous> (TdsAnimateTextV1.kt:374)");
                    }
                    mExternalSyntheticLambda7.onWarmupCompleted(440982441, JsParamKeys.onExtraCallbackWithResult(), -440982437, new Object[]{mexternalsyntheticlambda8, null, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, 0, 2}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                Unit unit = Unit.INSTANCE;
                int i23 = IAuthTabCallback + 103;
                onExtraCallback = i23 % 128;
                int i24 = i23 % 2;
                return unit;
            case 7:
                return asBinder(objArr);
            case 8:
                return onTransact(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static final Unit onExtraCallbackWithResult(mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline1, List list, IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, boolean z, getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, bindChildren bindchildren, use useVar, long j4, GraphicDeviceInfo graphicDeviceInfo, onExtraCallbackWithResult onextracallbackwithresult, onTransact ontransact, IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, Object obj, int i4, int i5, int i6, int i7, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i8) {
        int i9 = 2 % 2;
        int i10 = onExtraCallback + 29;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        mexternalsyntheticapimodeloutline1.onExtraCallbackWithResult(list, iAuthTabCallback, quirksExternalSyntheticBackport0, i, i2, i3, z, gethumanreadablename, j, j2, j3, f, bindchildren, useVar, j4, graphicDeviceInfo, onextracallbackwithresult, ontransact, iAuthTabCallbackStubProxy, obj, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i4 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i5), RecomposeScopeImplKt.onExtraCallbackWithResult(i6), i7);
        Unit unit = Unit.INSTANCE;
        int i12 = onExtraCallback + 91;
        IAuthTabCallback = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 18 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirkSettingsLoader quirkSettingsLoader, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{mexternalsyntheticlambda8, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -898349749, 898349755, iOnWarmupCompleted2);
        int i5 = onExtraCallback + 83;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return unit;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforAsBinder = asBinder();
        int i4 = onExtraCallback + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return getsupportedhighspeedresolutionsforAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline1, List list, IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, boolean z, getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, bindChildren bindchildren, use useVar, long j4, GraphicDeviceInfo graphicDeviceInfo, onExtraCallbackWithResult onextracallbackwithresult, onTransact ontransact, IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, Object obj, int i4, int i5, int i6, int i7, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i8) {
        int i9 = 2 % 2;
        int i10 = IAuthTabCallback + 17;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(mexternalsyntheticapimodeloutline1, list, iAuthTabCallback, quirksExternalSyntheticBackport0, i, i2, i3, z, gethumanreadablename, j, j2, j3, f, bindchildren, useVar, j4, graphicDeviceInfo, onextracallbackwithresult, ontransact, iAuthTabCallbackStubProxy, obj, i4, i5, i6, i7, cameraCaptureResultEmptyCameraCaptureResult, i8);
        int i12 = onExtraCallback + 7;
        IAuthTabCallback = i12 % 128;
        if (i12 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline1, hasProvider hasprovider, IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, bindChildren bindchildren, use useVar, long j4, GraphicDeviceInfo graphicDeviceInfo, onExtraCallbackWithResult onextracallbackwithresult, onTransact ontransact, IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, Long l, Object obj, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onExtraCallback + 123;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(mexternalsyntheticapimodeloutline1, hasprovider, iAuthTabCallback, quirksExternalSyntheticBackport0, i, gethumanreadablename, j, j2, j3, f, bindchildren, useVar, j4, graphicDeviceInfo, onextracallbackwithresult, ontransact, iAuthTabCallbackStubProxy, l, obj, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
        int i9 = onExtraCallback + 99;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 43 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline1, hasProvider hasprovider, IAuthTabCallbackStub iAuthTabCallbackStub, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, boolean z, getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, bindChildren bindchildren, use useVar, long j4, GraphicDeviceInfo graphicDeviceInfo, onExtraCallbackWithResult onextracallbackwithresult, onTransact ontransact, IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, Object obj, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onExtraCallback + 1;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(mexternalsyntheticapimodeloutline1, hasprovider, iAuthTabCallbackStub, quirksExternalSyntheticBackport0, i, z, gethumanreadablename, j, j2, j3, f, bindchildren, useVar, j4, graphicDeviceInfo, onextracallbackwithresult, ontransact, iAuthTabCallbackStubProxy, obj, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
        if (i8 == 0) {
            int i9 = 21 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirkSettingsLoader quirkSettingsLoader, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(mexternalsyntheticlambda8, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 52 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    private static final Unit onWarmupCompleted(mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline1, List list, IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, boolean z, getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, bindChildren bindchildren, use useVar, long j4, GraphicDeviceInfo graphicDeviceInfo, onExtraCallbackWithResult onextracallbackwithresult, onTransact ontransact, IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, Object obj, int i4, int i5, int i6, int i7, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i8) {
        int i9 = 2 % 2;
        int i10 = onExtraCallback + 77;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        mexternalsyntheticapimodeloutline1.IAuthTabCallback(list, iAuthTabCallback, quirksExternalSyntheticBackport0, i, i2, i3, z, gethumanreadablename, j, j2, j3, f, bindchildren, useVar, j4, graphicDeviceInfo, onextracallbackwithresult, ontransact, iAuthTabCallbackStubProxy, obj, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i4 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i5), RecomposeScopeImplKt.onExtraCallbackWithResult(i6), i7);
        Unit unit = Unit.INSTANCE;
        int i12 = IAuthTabCallback + 1;
        onExtraCallback = i12 % 128;
        if (i12 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline1, hasProvider hasprovider, IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, bindChildren bindchildren, use useVar, long j4, GraphicDeviceInfo graphicDeviceInfo, onExtraCallbackWithResult onextracallbackwithresult, onTransact ontransact, IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, Long l, Object obj, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = IAuthTabCallback + 77;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        mexternalsyntheticapimodeloutline1.onNavigationEvent(hasprovider, iAuthTabCallback, quirksExternalSyntheticBackport0, i, gethumanreadablename, j, j2, j3, f, bindchildren, useVar, j4, graphicDeviceInfo, onextracallbackwithresult, ontransact, iAuthTabCallbackStubProxy, l, obj, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
        Unit unit = Unit.INSTANCE;
        int i9 = onExtraCallback + 47;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline1, hasProvider hasprovider, IAuthTabCallbackStub iAuthTabCallbackStub, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, boolean z, getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, bindChildren bindchildren, use useVar, long j4, GraphicDeviceInfo graphicDeviceInfo, onExtraCallbackWithResult onextracallbackwithresult, onTransact ontransact, IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, Object obj, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onExtraCallback + 83;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        mexternalsyntheticapimodeloutline1.onNavigationEvent(hasprovider, iAuthTabCallbackStub, quirksExternalSyntheticBackport0, i, z, gethumanreadablename, j, j2, j3, f, bindchildren, useVar, j4, graphicDeviceInfo, onextracallbackwithresult, ontransact, iAuthTabCallbackStubProxy, obj, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
        Unit unit = Unit.INSTANCE;
        int i9 = onExtraCallback + 87;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private mExternalSyntheticApiModelOutline1() {
    }

    public static final /* synthetic */ boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        int i4 = IAuthTabCallback + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onTransact((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            throw null;
        }
        boolean zOnTransact = onTransact((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        int i3 = onExtraCallback + 95;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return Boolean.valueOf(zOnTransact);
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{getsupportedhighspeedresolutionsfor, Boolean.valueOf(zBooleanValue)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1116926409, 1116926417, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = onExtraCallback + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor, z);
        int i4 = IAuthTabCallback + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(getsupportedhighspeedresolutionsfor, z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
    }

    public static final /* synthetic */ boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{getsupportedhighspeedresolutionsfor}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 813459424, -813459424, iOnWarmupCompleted)).booleanValue();
        int i4 = IAuthTabCallback + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return zBooleanValue;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{getsupportedhighspeedresolutionsfor, Boolean.valueOf(zBooleanValue)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 2092337110, -2092337109, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = IAuthTabCallback + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
            return ((Boolean) onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{getsupportedhighspeedresolutionsfor}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1573083592, 1573083595, iOnWarmupCompleted)).booleanValue();
        }
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int i3 = 99 / 0;
        return ((Boolean) onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{getsupportedhighspeedresolutionsfor}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1573083592, 1573083595, iOnWarmupCompleted2)).booleanValue();
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull IAuthTabCallback iAuthTabCallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable onTransact ontransact, @Nullable IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, @Nullable Long l, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        use useVar2;
        GraphicDeviceInfo graphicDeviceInfo2;
        onExtraCallbackWithResult onextracallbackwithresult2;
        onTransact ontransactIAuthTabCallback;
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy2;
        Object obj2;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if ((i4 & 4) != 0) {
            int i6 = IAuthTabCallback + 31;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        int i8 = (i4 & 8) != 0 ? 0 : i;
        getHumanReadableName gethumanreadablename2 = (i4 & 16) != 0 ? (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()) : gethumanreadablename;
        long jOnTransact = (i4 & 32) != 0 ? setByteOrder.Companion.onTransact() : j;
        long jOnNavigationEvent = (i4 & 64) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        long jOnNavigationEvent2 = (i4 & 128) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
        float fOnExtraCallback = (i4 & 256) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
        bindChildren bindchildren2 = (i4 & 512) != 0 ? null : bindchildren;
        if ((i4 & 1024) != 0) {
            int i9 = onExtraCallback + 43;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 50 / 0;
            }
            useVar2 = null;
        } else {
            useVar2 = useVar;
        }
        long jOnNavigationEvent3 = (i4 & 2048) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
        if ((i4 & 4096) != 0) {
            int i11 = onExtraCallback + 47;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 == 0) {
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if ((i4 & 8192) != 0) {
            int i12 = onExtraCallback + 113;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 == 0) {
                onExtraCallbackWithResult onextracallbackwithresult3 = onExtraCallbackWithResult.TopLeft;
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            onextracallbackwithresult2 = onExtraCallbackWithResult.TopLeft;
        } else {
            onextracallbackwithresult2 = onextracallbackwithresult;
        }
        if ((i4 & 16384) != 0) {
            int i13 = onExtraCallback + 121;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            ontransactIAuthTabCallback = onTransact.Companion.IAuthTabCallback();
        } else {
            ontransactIAuthTabCallback = ontransact;
        }
        if ((32768 & i4) != 0) {
            int i15 = onExtraCallback + 3;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
            iAuthTabCallbackStubProxy2 = null;
        } else {
            iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy;
        }
        Long l2 = (65536 & i4) != 0 ? null : l;
        if ((i4 & 131072) != 0) {
            int i17 = IAuthTabCallback + 115;
            onExtraCallback = i17 % 128;
            int i18 = i17 % 2;
            obj2 = null;
        } else {
            obj2 = obj;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-11714621, i2, i3, "im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1.To (TdsAnimateTextV1.kt:271)");
        }
        onNavigationEvent(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), iAuthTabCallback, quirksExternalSyntheticBackport02, i8, gethumanreadablename2, jOnTransact, jOnNavigationEvent, jOnNavigationEvent2, fOnExtraCallback, bindchildren2, useVar2, jOnNavigationEvent3, graphicDeviceInfo2, onextracallbackwithresult2, ontransactIAuthTabCallback, iAuthTabCallbackStubProxy2, l2, obj2, cameraCaptureResultEmptyCameraCaptureResult, i2 & 2147483632, i3 & 268435454, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i19 = IAuthTabCallback + 47;
            onExtraCallback = i19 % 128;
            int i20 = i19 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i20 != 0) {
                throw null;
            }
        }
    }

    private static final getSupportedHighSpeedResolutionsFor onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        int i4 = onExtraCallback + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforOnWarmupCompleted;
    }

    static final class ICustomTabsCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $animated$delegate;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ IAuthTabCallback $motion;
        final /* synthetic */ Long $skipDurationMillis;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        final /* synthetic */ hasProvider $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, IAuthTabCallback iAuthTabCallback, int i, Long l, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super ICustomTabsCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$text = hasprovider;
            this.$motion = iAuthTabCallback;
            this.$initialDelay = i;
            this.$skipDurationMillis = l;
            this.$animated$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(this.$state, this.$text, this.$motion, this.$initialDelay, this.$skipDurationMillis, this.$animated$delegate, access13800Var);
            int i2 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
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
            int i3 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ICustomTabsCallback iCustomTabsCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                iCustomTabsCallbackCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = iCustomTabsCallbackCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (!mExternalSyntheticApiModelOutline1.onNavigationEvent(this.$animated$delegate)) {
                int i2 = onExtraCallbackWithResult + 11;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                mExternalSyntheticLambda8.onExtraCallbackWithResult(this.$state, this.$text, this.$motion, (onTransact) null, this.$initialDelay, false, this.$skipDurationMillis, 20, (Object) null);
                mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult(this.$animated$delegate, true);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final class writeTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ IAuthTabCallback $motion;
        final /* synthetic */ Long $skipDurationMillis;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        final /* synthetic */ hasProvider $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        writeTypedObject(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, IAuthTabCallback iAuthTabCallback, int i, Long l, access13800<? super writeTypedObject> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$text = hasprovider;
            this.$motion = iAuthTabCallback;
            this.$initialDelay = i;
            this.$skipDurationMillis = l;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            writeTypedObject writetypedobject = new writeTypedObject(this.$state, this.$text, this.$motion, this.$initialDelay, this.$skipDurationMillis, access13800Var);
            int i2 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return writetypedobject;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i3 != 0) {
                mExternalSyntheticLambda8.onExtraCallbackWithResult(this.$state, this.$text, this.$motion, (onTransact) null, this.$initialDelay, false, this.$skipDurationMillis, 31, (Object) null);
            } else {
                mExternalSyntheticLambda8.onExtraCallbackWithResult(this.$state, this.$text, this.$motion, (onTransact) null, this.$initialDelay, false, this.$skipDurationMillis, 20, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:332:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull final hasProvider hasprovider, @NotNull final IAuthTabCallback iAuthTabCallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable onTransact ontransact, @Nullable IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, @Nullable Long l, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i26;
        getHumanReadableName gethumanreadablename2;
        long j5;
        long j6;
        long j7;
        float f2;
        bindChildren bindchildren2;
        use useVar2;
        long j8;
        final GraphicDeviceInfo graphicDeviceInfo2;
        final onExtraCallbackWithResult onextracallbackwithresult2;
        final onTransact ontransact2;
        final IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy2;
        final Long l2;
        final Object obj2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i27;
        getHumanReadableName gethumanreadablename3;
        use useVar3;
        bindChildren bindchildren3;
        Long l3;
        Long l4;
        int i28;
        float f3;
        GraphicDeviceInfo graphicDeviceInfo3;
        onExtraCallbackWithResult onextracallbackwithresult3;
        Object obj3;
        onTransact ontransact3;
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy3;
        long j9;
        long j10;
        bindChildren bindchildren4;
        use useVar4;
        long j11;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        float f4;
        long j12;
        getHumanReadableName gethumanreadablename4;
        long j13;
        Long l5;
        boolean z;
        int i29 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-906749859);
        if ((i2 & 6) == 0) {
            i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 32 : 16;
        }
        int i30 = i4 & 4;
        if (i30 != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    int i31 = onExtraCallback + 17;
                    IAuthTabCallback = i31 % 128;
                    int i32 = i31 % 2;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                        int i33 = IAuthTabCallback + 17;
                        onExtraCallback = i33 % 128;
                        i7 = i33 % 2 != 0 ? 13991 : 2048;
                    } else {
                        i7 = 1024;
                    }
                    i5 |= i7;
                }
                if ((i2 & 24576) == 0) {
                    i5 |= ((i4 & 16) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename)) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((i2 & 196608) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 131072 : 65536;
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else {
                        if ((i2 & 1572864) == 0) {
                            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 1048576 : 524288;
                        }
                        i10 = i4 & 128;
                        if (i10 != 0) {
                            i5 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i5 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ^ true) ? 8388608 : 4194304;
                        }
                        i11 = i4 & 256;
                        if (i11 != 0) {
                            i5 |= 100663296;
                        } else {
                            if ((100663296 & i2) == 0) {
                                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 67108864 : 33554432;
                            }
                            i12 = i4 & 512;
                            if (i12 == 0) {
                                i5 |= 805306368;
                            } else if ((i2 & 805306368) == 0) {
                                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bindchildren) ? 536870912 : 268435456;
                            }
                            i13 = i4 & 1024;
                            if (i13 == 0) {
                                i14 = i3 | 6;
                            } else if ((i3 & 6) == 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(useVar)) {
                                    int i34 = onExtraCallback + 79;
                                    IAuthTabCallback = i34 % 128;
                                    int i35 = i34 % 2;
                                    i15 = 4;
                                } else {
                                    i15 = 2;
                                }
                                i14 = i3 | i15;
                            } else {
                                i14 = i3;
                            }
                            i16 = i4 & 2048;
                            if (i16 == 0) {
                                i14 |= 48;
                            } else {
                                if ((i3 & 48) == 0) {
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j4)) {
                                        int i36 = IAuthTabCallback + 99;
                                        onExtraCallback = i36 % 128;
                                        int i37 = i36 % 2;
                                        i17 = 32;
                                    } else {
                                        i17 = 16;
                                    }
                                    i18 = i14 | i17;
                                }
                                i19 = i4 & 4096;
                                if (i19 != 0) {
                                    i18 |= 384;
                                } else {
                                    if ((i3 & 384) == 0) {
                                        i18 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 256 : 128;
                                    }
                                    i20 = i4 & 8192;
                                    if (i20 == 0) {
                                        i18 |= 3072;
                                    } else if ((i3 & 3072) == 0) {
                                        i18 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal()) ? 2048 : 1024;
                                    }
                                    i21 = i4 & 16384;
                                    if (i21 == 0) {
                                        i18 |= 24576;
                                        i22 = i21;
                                    } else {
                                        i22 = i21;
                                        if ((i3 & 24576) == 0) {
                                            i18 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(ontransact) ? 16384 : 8192;
                                        }
                                        i23 = i4 & 32768;
                                        if (i23 == 0) {
                                            if ((i3 & 196608) == 0) {
                                                i18 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStubProxy) ? 131072 : 65536;
                                            }
                                            i24 = i4 & 65536;
                                            if (i24 == 0) {
                                                i18 |= 1572864;
                                            } else if ((i3 & 1572864) == 0) {
                                                i18 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(l) ? 1048576 : 524288;
                                            }
                                            i25 = i4 & 131072;
                                            if (i25 == 0) {
                                                i18 |= 12582912;
                                            } else if ((i3 & 12582912) == 0) {
                                                i18 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj) ? 8388608 : 4194304;
                                            }
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (4793491 & i18) != 4793490, i5 & 1)) {
                                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                                i26 = i;
                                                gethumanreadablename2 = gethumanreadablename;
                                                j5 = j;
                                                j6 = j2;
                                                j7 = j3;
                                                f2 = f;
                                                bindchildren2 = bindchildren;
                                                useVar2 = useVar;
                                                j8 = j4;
                                                graphicDeviceInfo2 = graphicDeviceInfo;
                                                onextracallbackwithresult2 = onextracallbackwithresult;
                                                ontransact2 = ontransact;
                                                iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy;
                                                l2 = l;
                                                obj2 = obj;
                                            } else {
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                                if ((i2 & 1) != 0) {
                                                    int i38 = IAuthTabCallback + 117;
                                                    onExtraCallback = i38 % 128;
                                                    int i39 = i38 % 2;
                                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                                        quirksExternalSyntheticBackport03 = i30 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                                        i27 = i6 != 0 ? 0 : i;
                                                        if ((i4 & 16) != 0) {
                                                            gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                                            i5 &= -57345;
                                                        } else {
                                                            gethumanreadablename3 = gethumanreadablename;
                                                        }
                                                        long jOnTransact = i8 != 0 ? setByteOrder.Companion.onTransact() : j;
                                                        long jOnNavigationEvent = i9 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
                                                        long jOnNavigationEvent2 = i10 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
                                                        float fOnExtraCallback = i11 != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
                                                        bindChildren bindchildren5 = i12 != 0 ? null : bindchildren;
                                                        if (i13 != 0) {
                                                            int i40 = IAuthTabCallback + 65;
                                                            onExtraCallback = i40 % 128;
                                                            if (i40 % 2 != 0) {
                                                                int i41 = 96 / 0;
                                                            }
                                                            useVar3 = null;
                                                        } else {
                                                            useVar3 = useVar;
                                                        }
                                                        long jOnNavigationEvent3 = i16 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
                                                        GraphicDeviceInfo graphicDeviceInfo4 = i19 != 0 ? null : graphicDeviceInfo;
                                                        onExtraCallbackWithResult onextracallbackwithresult4 = i20 != 0 ? onExtraCallbackWithResult.TopLeft : onextracallbackwithresult;
                                                        onTransact ontransactIAuthTabCallback = i22 != 0 ? onTransact.Companion.IAuthTabCallback() : ontransact;
                                                        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy4 = i23 != 0 ? null : iAuthTabCallbackStubProxy;
                                                        if (i24 != 0) {
                                                            int i42 = IAuthTabCallback + 89;
                                                            bindchildren3 = bindchildren5;
                                                            onExtraCallback = i42 % 128;
                                                            int i43 = i42 % 2;
                                                            l3 = null;
                                                        } else {
                                                            bindchildren3 = bindchildren5;
                                                            l3 = l;
                                                        }
                                                        l4 = l3;
                                                        i28 = i5;
                                                        f3 = fOnExtraCallback;
                                                        j8 = jOnNavigationEvent3;
                                                        graphicDeviceInfo3 = graphicDeviceInfo4;
                                                        onextracallbackwithresult3 = onextracallbackwithresult4;
                                                        obj3 = i25 != 0 ? null : obj;
                                                        ontransact3 = ontransactIAuthTabCallback;
                                                        iAuthTabCallbackStubProxy3 = iAuthTabCallbackStubProxy4;
                                                        j9 = jOnTransact;
                                                        j10 = jOnNavigationEvent2;
                                                        bindchildren4 = bindchildren3;
                                                        useVar4 = useVar3;
                                                        j11 = jOnNavigationEvent;
                                                    } else {
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                        if ((i4 & 16) != 0) {
                                                            int i44 = IAuthTabCallback + 105;
                                                            onExtraCallback = i44 % 128;
                                                            if (i44 % 2 != 0) {
                                                                throw null;
                                                            }
                                                            i5 &= -57345;
                                                        }
                                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                                        i27 = i;
                                                        gethumanreadablename3 = gethumanreadablename;
                                                        j11 = j2;
                                                        j10 = j3;
                                                        f3 = f;
                                                        bindchildren4 = bindchildren;
                                                        useVar4 = useVar;
                                                        j8 = j4;
                                                        graphicDeviceInfo3 = graphicDeviceInfo;
                                                        onextracallbackwithresult3 = onextracallbackwithresult;
                                                        ontransact3 = ontransact;
                                                        iAuthTabCallbackStubProxy3 = iAuthTabCallbackStubProxy;
                                                        l4 = l;
                                                        obj3 = obj;
                                                        i28 = i5;
                                                        j9 = j;
                                                    }
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-906749859, i28, i18, "im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1.To (TdsAnimateTextV1.kt:314)");
                                                    } else {
                                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                    }
                                                    int i45 = i18 >> 6;
                                                    int i46 = i28 << 3;
                                                    int i47 = i27;
                                                    int i48 = i18 << 6;
                                                    int i49 = i18;
                                                    final mExternalSyntheticLambda8 mexternalsyntheticlambda8OnNavigationEvent = mExternalSyntheticLambda5.onNavigationEvent("", obj3, ontransact3, iAuthTabCallbackStubProxy3, null, gethumanreadablename3, j9, j11, j10, createCameraCaptureCallback.onExtraCallback(mExternalSyntheticLambda7.onExtraCallbackWithResult(onextracallbackwithresult3)), f3, bindchildren4, useVar4, j8, graphicDeviceInfo3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i45 & 896) | ((i18 >> 18) & 112) | 6 | (i45 & 7168) | (458752 & i46) | (3670016 & i46) | (29360128 & i46) | (234881024 & i46), (i48 & 896) | ((i28 >> 24) & 126) | (i48 & 7168) | (57344 & i48), 16);
                                                    if (obj3 != null) {
                                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1934314299);
                                                        Object[] objArr = {obj3, mexternalsyntheticlambda8OnNavigationEvent, hasprovider, iAuthTabCallback, Integer.valueOf(i47), l4};
                                                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                                        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                                            objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda6
                                                                private static int onNavigationEvent = 0;
                                                                private static int onWarmupCompleted = 1;

                                                                public final Object invoke() {
                                                                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforIAuthTabCallback;
                                                                    int i50 = 2 % 2;
                                                                    int i51 = onWarmupCompleted + 19;
                                                                    onNavigationEvent = i51 % 128;
                                                                    if (i51 % 2 != 0) {
                                                                        getsupportedhighspeedresolutionsforIAuthTabCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback();
                                                                        int i52 = 34 / 0;
                                                                    } else {
                                                                        getsupportedhighspeedresolutionsforIAuthTabCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback();
                                                                    }
                                                                    int i53 = onNavigationEvent + 83;
                                                                    onWarmupCompleted = i53 % 128;
                                                                    int i54 = i53 % 2;
                                                                    return getsupportedhighspeedresolutionsforIAuthTabCallback;
                                                                }
                                                            };
                                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                                                        }
                                                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, 48);
                                                        Unit unit = Unit.INSTANCE;
                                                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                                                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(mexternalsyntheticlambda8OnNavigationEvent);
                                                        f4 = f3;
                                                        j12 = j9;
                                                        boolean z2 = (i28 & 14) == 4;
                                                        boolean z3 = (i28 & 112) == 32;
                                                        gethumanreadablename4 = gethumanreadablename3;
                                                        boolean z4 = (i28 & 7168) == 2048;
                                                        j13 = j11;
                                                        boolean z5 = (i49 & 3670016) == 1048576;
                                                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                                        if (!(z2 | zOnNavigationEvent | zOnNavigationEvent2 | z3 | z4 | z5)) {
                                                            int i50 = onExtraCallback + 83;
                                                            IAuthTabCallback = i50 % 128;
                                                            if (i50 % 2 == 0) {
                                                                onwarmupcompleted.onExtraCallback();
                                                                throw null;
                                                            }
                                                            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                                                objOnMinimized2 = new ICustomTabsCallback(mexternalsyntheticlambda8OnNavigationEvent, hasprovider, iAuthTabCallback, i47, l4, getsupportedhighspeedresolutionsfor, null);
                                                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                                                            }
                                                            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                                                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                                            l5 = l4;
                                                        }
                                                    } else {
                                                        f4 = f3;
                                                        j12 = j9;
                                                        gethumanreadablename4 = gethumanreadablename3;
                                                        j13 = j11;
                                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1933652015);
                                                        l5 = l4;
                                                        Object[] objArr2 = {mexternalsyntheticlambda8OnNavigationEvent, hasprovider, iAuthTabCallback, Integer.valueOf(i47), l5};
                                                        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(mexternalsyntheticlambda8OnNavigationEvent);
                                                        boolean z6 = (i28 & 14) == 4;
                                                        if ((i28 & 112) == 32) {
                                                            int i51 = onExtraCallback + 19;
                                                            IAuthTabCallback = i51 % 128;
                                                            int i52 = i51 % 2;
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        boolean z7 = (i28 & 7168) == 2048;
                                                        boolean z8 = (i49 & 3670016) == 1048576;
                                                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                                        if ((z8 | zOnNavigationEvent3 | z6 | z | z7) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                            objOnMinimized3 = new writeTypedObject(mexternalsyntheticlambda8OnNavigationEvent, hasprovider, iAuthTabCallback, i47, l5, null);
                                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                                                        }
                                                        isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr2, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                                    }
                                                    final QuirkSettingsLoader quirkSettingsLoaderOnNavigationEvent = mExternalSyntheticLambda7.onNavigationEvent(onextracallbackwithresult3);
                                                    mExternalSyntheticLambda7.onWarmupCompleted(-422700871, JsParamKeys.onExtraCallbackWithResult(), 422700876, new Object[]{ontransact3, mexternalsyntheticlambda8OnNavigationEvent, CollectionsKt.listOf(hasprovider), quirkSettingsLoaderOnNavigationEvent, quirksExternalSyntheticBackport04, ForwardingCameraControl.onExtraCallback(-1288821699, true, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda7
                                                        private static int onExtraCallbackWithResult = 1;
                                                        private static int onWarmupCompleted;

                                                        public final Object invoke(Object obj4, Object obj5) {
                                                            int i53 = 2 % 2;
                                                            int i54 = onWarmupCompleted + 11;
                                                            onExtraCallbackWithResult = i54 % 128;
                                                            int i55 = i54 % 2;
                                                            Unit unitOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult(mexternalsyntheticlambda8OnNavigationEvent, quirkSettingsLoaderOnNavigationEvent, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                                            int i56 = onWarmupCompleted + 111;
                                                            onExtraCallbackWithResult = i56 % 128;
                                                            int i57 = i56 % 2;
                                                            return unitOnExtraCallbackWithResult;
                                                        }
                                                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((i49 >> 12) & 14) | 196608 | (57344 & (i28 << 6)))}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                                    }
                                                    i26 = i47;
                                                    gethumanreadablename2 = gethumanreadablename4;
                                                    l2 = l5;
                                                    bindchildren2 = bindchildren4;
                                                    j7 = j10;
                                                    useVar2 = useVar4;
                                                    graphicDeviceInfo2 = graphicDeviceInfo3;
                                                    onextracallbackwithresult2 = onextracallbackwithresult3;
                                                    ontransact2 = ontransact3;
                                                    iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy3;
                                                    obj2 = obj3;
                                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                                    f2 = f4;
                                                    j5 = j12;
                                                    j6 = j13;
                                                }
                                            }
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                                                final int i53 = i26;
                                                final getHumanReadableName gethumanreadablename5 = gethumanreadablename2;
                                                final long j14 = j5;
                                                final long j15 = j6;
                                                final long j16 = j7;
                                                final float f5 = f2;
                                                final bindChildren bindchildren6 = bindchildren2;
                                                final use useVar5 = useVar2;
                                                final long j17 = j8;
                                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda8
                                                    private static int onNavigationEvent = 1;
                                                    private static int onWarmupCompleted;

                                                    public final Object invoke(Object obj4, Object obj5) {
                                                        int i54 = 2 % 2;
                                                        int i55 = onWarmupCompleted + 105;
                                                        onNavigationEvent = i55 % 128;
                                                        int i56 = i55 % 2;
                                                        Unit unitOnNavigationEvent = mExternalSyntheticApiModelOutline1.onNavigationEvent(this.f$0, hasprovider, iAuthTabCallback, quirksExternalSyntheticBackport05, i53, gethumanreadablename5, j14, j15, j16, f5, bindchildren6, useVar5, j17, graphicDeviceInfo2, onextracallbackwithresult2, ontransact2, iAuthTabCallbackStubProxy2, l2, obj2, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                                        int i57 = onWarmupCompleted + 107;
                                                        onNavigationEvent = i57 % 128;
                                                        int i58 = i57 % 2;
                                                        return unitOnNavigationEvent;
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        i18 |= 196608;
                                        i24 = i4 & 65536;
                                        if (i24 == 0) {
                                        }
                                        i25 = i4 & 131072;
                                        if (i25 == 0) {
                                        }
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (4793491 & i18) != 4793490, i5 & 1)) {
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                        }
                                    }
                                    i23 = i4 & 32768;
                                    if (i23 == 0) {
                                    }
                                    i24 = i4 & 65536;
                                    if (i24 == 0) {
                                    }
                                    i25 = i4 & 131072;
                                    if (i25 == 0) {
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (4793491 & i18) != 4793490, i5 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                    }
                                }
                                i20 = i4 & 8192;
                                if (i20 == 0) {
                                }
                                i21 = i4 & 16384;
                                if (i21 == 0) {
                                }
                                i23 = i4 & 32768;
                                if (i23 == 0) {
                                }
                                i24 = i4 & 65536;
                                if (i24 == 0) {
                                }
                                i25 = i4 & 131072;
                                if (i25 == 0) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (4793491 & i18) != 4793490, i5 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                }
                            }
                            i18 = i14;
                            i19 = i4 & 4096;
                            if (i19 != 0) {
                            }
                            i20 = i4 & 8192;
                            if (i20 == 0) {
                            }
                            i21 = i4 & 16384;
                            if (i21 == 0) {
                            }
                            i23 = i4 & 32768;
                            if (i23 == 0) {
                            }
                            i24 = i4 & 65536;
                            if (i24 == 0) {
                            }
                            i25 = i4 & 131072;
                            if (i25 == 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (4793491 & i18) != 4793490, i5 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            }
                        }
                        i12 = i4 & 512;
                        if (i12 == 0) {
                        }
                        i13 = i4 & 1024;
                        if (i13 == 0) {
                        }
                        i16 = i4 & 2048;
                        if (i16 == 0) {
                        }
                        i18 = i14;
                        i19 = i4 & 4096;
                        if (i19 != 0) {
                        }
                        i20 = i4 & 8192;
                        if (i20 == 0) {
                        }
                        i21 = i4 & 16384;
                        if (i21 == 0) {
                        }
                        i23 = i4 & 32768;
                        if (i23 == 0) {
                        }
                        i24 = i4 & 65536;
                        if (i24 == 0) {
                        }
                        i25 = i4 & 131072;
                        if (i25 == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (4793491 & i18) != 4793490, i5 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i10 = i4 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 512;
                    if (i12 == 0) {
                    }
                    i13 = i4 & 1024;
                    if (i13 == 0) {
                    }
                    i16 = i4 & 2048;
                    if (i16 == 0) {
                    }
                    i18 = i14;
                    i19 = i4 & 4096;
                    if (i19 != 0) {
                    }
                    i20 = i4 & 8192;
                    if (i20 == 0) {
                    }
                    i21 = i4 & 16384;
                    if (i21 == 0) {
                    }
                    i23 = i4 & 32768;
                    if (i23 == 0) {
                    }
                    i24 = i4 & 65536;
                    if (i24 == 0) {
                    }
                    i25 = i4 & 131072;
                    if (i25 == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (4793491 & i18) != 4793490, i5 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                }
                i12 = i4 & 512;
                if (i12 == 0) {
                }
                i13 = i4 & 1024;
                if (i13 == 0) {
                }
                i16 = i4 & 2048;
                if (i16 == 0) {
                }
                i18 = i14;
                i19 = i4 & 4096;
                if (i19 != 0) {
                }
                i20 = i4 & 8192;
                if (i20 == 0) {
                }
                i21 = i4 & 16384;
                if (i21 == 0) {
                }
                i23 = i4 & 32768;
                if (i23 == 0) {
                }
                i24 = i4 & 65536;
                if (i24 == 0) {
                }
                i25 = i4 & 131072;
                if (i25 == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (4793491 & i18) != 4793490, i5 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            if ((i2 & 24576) == 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 != 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i4 & 512;
            if (i12 == 0) {
            }
            i13 = i4 & 1024;
            if (i13 == 0) {
            }
            i16 = i4 & 2048;
            if (i16 == 0) {
            }
            i18 = i14;
            i19 = i4 & 4096;
            if (i19 != 0) {
            }
            i20 = i4 & 8192;
            if (i20 == 0) {
            }
            i21 = i4 & 16384;
            if (i21 == 0) {
            }
            i23 = i4 & 32768;
            if (i23 == 0) {
            }
            i24 = i4 & 65536;
            if (i24 == 0) {
            }
            i25 = i4 & 131072;
            if (i25 == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (4793491 & i18) != 4793490, i5 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 != 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i4 & 512;
        if (i12 == 0) {
        }
        i13 = i4 & 1024;
        if (i13 == 0) {
        }
        i16 = i4 & 2048;
        if (i16 == 0) {
        }
        i18 = i14;
        i19 = i4 & 4096;
        if (i19 != 0) {
        }
        i20 = i4 & 8192;
        if (i20 == 0) {
        }
        i21 = i4 & 16384;
        if (i21 == 0) {
        }
        i23 = i4 & 32768;
        if (i23 == 0) {
        }
        i24 = i4 & 65536;
        if (i24 == 0) {
        }
        i25 = i4 & 131072;
        if (i25 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (4793491 & i18) != 4793490, i5 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    @Deprecated
    public final void onExtraCallback(@NotNull List<String> list, @NotNull IAuthTabCallback iAuthTabCallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, boolean z, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable onTransact ontransact, @Nullable IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        boolean z2;
        getHumanReadableName gethumanreadablename2;
        long jOnTransact;
        long jOnNavigationEvent;
        bindChildren bindchildren2;
        GraphicDeviceInfo graphicDeviceInfo2;
        List<String> list2 = list;
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i7 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i7 & 8) != 0) {
            int i11 = onExtraCallback + 115;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            i8 = Integer.MAX_VALUE;
        } else {
            i8 = i;
        }
        int i13 = 0;
        int i14 = (i7 & 16) != 0 ? 0 : i2;
        if ((i7 & 32) != 0) {
            int i15 = onExtraCallback + 101;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
            i9 = 0;
        } else {
            i9 = i3;
        }
        if ((i7 & 64) != 0) {
            int i17 = onExtraCallback + 31;
            IAuthTabCallback = i17 % 128;
            int i18 = i17 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i7 & 128) != 0) {
            int i19 = IAuthTabCallback + 11;
            onExtraCallback = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
            gethumanreadablename2 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        if ((i7 & 256) != 0) {
            int i20 = IAuthTabCallback + 53;
            onExtraCallback = i20 % 128;
            if (i20 % 2 != 0) {
                jOnTransact = setByteOrder.Companion.onTransact();
                int i21 = 3 / 0;
            } else {
                jOnTransact = setByteOrder.Companion.onTransact();
            }
            int i22 = onExtraCallback + 31;
            IAuthTabCallback = i22 % 128;
            int i23 = i22 % 2;
        } else {
            jOnTransact = j;
        }
        long jOnNavigationEvent2 = (i7 & 512) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        if ((i7 & 1024) != 0) {
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            int i24 = onExtraCallback + 83;
            IAuthTabCallback = i24 % 128;
            int i25 = i24 % 2;
        } else {
            jOnNavigationEvent = j3;
        }
        float fOnExtraCallback = (i7 & 2048) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
        if ((i7 & 4096) != 0) {
            int i26 = onExtraCallback + 35;
            IAuthTabCallback = i26 % 128;
            if (i26 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            bindchildren2 = null;
        } else {
            bindchildren2 = bindchildren;
        }
        use useVar2 = (i7 & 8192) != 0 ? null : useVar;
        long jOnNavigationEvent3 = (i7 & 16384) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
        if ((32768 & i7) != 0) {
            int i27 = onExtraCallback + 83;
            IAuthTabCallback = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 19 / 0;
            }
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = (65536 & i7) != 0 ? onExtraCallbackWithResult.TopLeft : onextracallbackwithresult;
        onTransact ontransactIAuthTabCallback = (131072 & i7) != 0 ? onTransact.Companion.IAuthTabCallback() : ontransact;
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy2 = (262144 & i7) != 0 ? null : iAuthTabCallbackStubProxy;
        Object obj3 = (i7 & 524288) != 0 ? null : obj;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1001580413, i4, i5, "im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1.Ticker (TdsAnimateTextV1.kt:411)");
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list2.size();
        while (i13 < size) {
            arrayList.add(new hasProvider(list2.get(i13), (List) null, 2, (DefaultConstructorMarker) null));
            i13++;
            list2 = list;
        }
        onExtraCallbackWithResult(arrayList, iAuthTabCallback, quirksExternalSyntheticBackport02, i8, i14, i9, z2, gethumanreadablename2, jOnTransact, jOnNavigationEvent2, jOnNavigationEvent, fOnExtraCallback, bindchildren2, useVar2, jOnNavigationEvent3, graphicDeviceInfo2, onextracallbackwithresult2, ontransactIAuthTabCallback, iAuthTabCallbackStubProxy2, obj3, cameraCaptureResultEmptyCameraCaptureResult, i4 & 2147483632, i5 & 2147483646, i6 & 14, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i29 = IAuthTabCallback + 7;
            onExtraCallback = i29 % 128;
            int i30 = i29 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final getSupportedHighSpeedResolutionsFor asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        int i4 = onExtraCallback + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforOnWarmupCompleted;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $animated$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ int $interval;
        final /* synthetic */ IAuthTabCallback $motion;
        final /* synthetic */ int $playCount;
        final /* synthetic */ boolean $skipIntroMotion;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        final /* synthetic */ List<hasProvider> $texts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, List<hasProvider> list, IAuthTabCallback iAuthTabCallback, int i, int i2, int i3, boolean z, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$context = context;
            this.$texts = list;
            this.$motion = iAuthTabCallback;
            this.$playCount = i;
            this.$initialDelay = i2;
            this.$interval = i3;
            this.$skipIntroMotion = z;
            this.$animated$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(this.$state, this.$context, this.$texts, this.$motion, this.$playCount, this.$initialDelay, this.$interval, this.$skipIntroMotion, this.$animated$delegate, access13800Var);
            int i2 = IAuthTabCallback + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (!mExternalSyntheticApiModelOutline1.onWarmupCompleted(this.$animated$delegate)) {
                int i3 = onNavigationEvent + 67;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                mExternalSyntheticLambda8.onWarmupCompleted(this.$state, this.$context, this.$texts, this.$motion, null, this.$playCount, this.$initialDelay, this.$interval, this.$skipIntroMotion, false, 8, null);
                mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this.$animated$delegate, true}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 277329017, -277329013, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            }
            return Unit.INSTANCE;
        }
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ int $interval;
        final /* synthetic */ IAuthTabCallback $motion;
        final /* synthetic */ int $playCount;
        final /* synthetic */ boolean $skipIntroMotion;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        final /* synthetic */ List<hasProvider> $texts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getInterfaceDescriptor(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, List<hasProvider> list, IAuthTabCallback iAuthTabCallback, int i, int i2, int i3, boolean z, access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$context = context;
            this.$texts = list;
            this.$motion = iAuthTabCallback;
            this.$playCount = i;
            this.$initialDelay = i2;
            this.$interval = i3;
            this.$skipIntroMotion = z;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = new getInterfaceDescriptor(this.$state, this.$context, this.$texts, this.$motion, this.$playCount, this.$initialDelay, this.$interval, this.$skipIntroMotion, access13800Var);
            int i2 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return getinterfacedescriptor;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            mExternalSyntheticLambda8.onWarmupCompleted(this.$state, this.$context, this.$texts, this.$motion, null, this.$playCount, this.$initialDelay, this.$interval, this.$skipIntroMotion, false, 8, null);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    private static final Unit IAuthTabCallbackDefault(mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirkSettingsLoader quirkSettingsLoader, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 17;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 65;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = IAuthTabCallback + 15;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1891184454, i, -1, "im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1.Ticker.<anonymous> (TdsAnimateTextV1.kt:543)");
            }
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            mExternalSyntheticLambda7.onWarmupCompleted(440982441, JsParamKeys.onExtraCallbackWithResult(), -440982437, new Object[]{mexternalsyntheticlambda8, null, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, 0, 2}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0121  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull final List<hasProvider> list, @NotNull final IAuthTabCallback iAuthTabCallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, boolean z, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable onTransact ontransact, @Nullable IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i4, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final int i31;
        final int i32;
        final int i33;
        final boolean z2;
        final getHumanReadableName gethumanreadablename2;
        final long j5;
        final long j6;
        final long j7;
        final float f2;
        final bindChildren bindchildren2;
        final use useVar2;
        long jOnNavigationEvent;
        final GraphicDeviceInfo graphicDeviceInfo2;
        final onExtraCallbackWithResult onextracallbackwithresult2;
        final onTransact ontransact2;
        final IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy2;
        final Object obj2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i34;
        int i35;
        int i36;
        boolean z3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        getHumanReadableName gethumanreadablename3;
        long jOnTransact;
        long jOnNavigationEvent2;
        bindChildren bindchildren3;
        use useVar3;
        GraphicDeviceInfo graphicDeviceInfo3;
        onExtraCallbackWithResult onextracallbackwithresult3;
        onTransact ontransactIAuthTabCallback;
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        getHumanReadableName gethumanreadablename4;
        int i37;
        float f3;
        long j8;
        int i38;
        Object obj3;
        getHumanReadableName gethumanreadablename5;
        long j9;
        float f4;
        bindChildren bindchildren4;
        use useVar4;
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy4;
        GraphicDeviceInfo graphicDeviceInfo4;
        int i39;
        int i40;
        int i41 = 2 % 2;
        int i42 = IAuthTabCallback + 41;
        onExtraCallback = i42 % 128;
        int i43 = i42 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1001580413);
        if ((i4 & 6) == 0) {
            i8 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 4 : 2) | i4;
        } else {
            i8 = i4;
        }
        if ((i4 & 48) == 0) {
            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 32 : 16;
        }
        int i44 = i7 & 4;
        if (i44 != 0) {
            i8 |= 384;
        } else {
            if ((i4 & 384) == 0) {
                i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 256 : 128;
            }
            i9 = i7 & 8;
            if (i9 == 0) {
                i8 |= 3072;
            } else {
                if ((i4 & 3072) == 0) {
                    i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 2048 : 1024;
                }
                i10 = i7 & 16;
                if (i10 != 0) {
                    i8 |= 24576;
                } else {
                    if ((i4 & 24576) == 0) {
                        i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 16384 : 8192;
                    }
                    i11 = i7 & 32;
                    if (i11 == 0) {
                        i8 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i3) ? 131072 : 65536;
                    }
                    i12 = i7 & 64;
                    if (i12 == 0) {
                        i8 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 1048576 : 524288;
                    }
                    if ((i4 & 12582912) == 0) {
                        i8 |= ((i7 & 128) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename)) ? 8388608 : 4194304;
                    }
                    i13 = i7 & 256;
                    if (i13 == 0) {
                        i8 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 67108864 : 33554432;
                    }
                    i14 = i7 & 512;
                    if (i14 == 0) {
                        i8 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 536870912 : 268435456;
                    }
                    i15 = i7 & 1024;
                    if (i15 == 0) {
                        i16 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        i16 = i5 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ? 4 : 2);
                    } else {
                        i16 = i5;
                    }
                    i17 = i7 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                    } else if ((i5 & 48) == 0) {
                        i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 32 : 16;
                    }
                    int i45 = i16;
                    i18 = i7 & 4096;
                    if (i18 == 0) {
                        i45 |= 384;
                    } else {
                        if ((i5 & 384) == 0) {
                            i45 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bindchildren) ? 256 : 128;
                        }
                        i19 = i7 & 8192;
                        if (i19 != 0) {
                            i45 |= 3072;
                        } else {
                            if ((i5 & 3072) == 0) {
                                int i46 = IAuthTabCallback + 53;
                                onExtraCallback = i46 % 128;
                                int i47 = i46 % 2;
                                i45 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(useVar) ? 2048 : 1024;
                            }
                            i20 = i7 & 16384;
                            if (i20 == 0) {
                                i45 |= 24576;
                            } else {
                                if ((i5 & 24576) == 0) {
                                    int i48 = onExtraCallback + 13;
                                    i21 = i20;
                                    IAuthTabCallback = i48 % 128;
                                    int i49 = i48 % 2;
                                    i22 = i19;
                                    i45 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j4) ? 16384 : 8192;
                                }
                                i23 = i7 & 32768;
                                if (i23 != 0) {
                                    i45 |= 196608;
                                } else if ((i5 & 196608) == 0) {
                                    i45 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 131072 : 65536;
                                }
                                i24 = 65536 & i7;
                                if (i24 != 0) {
                                    i45 |= 1572864;
                                } else if ((i5 & 1572864) == 0) {
                                    i45 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal()) ? 1048576 : 524288;
                                }
                                i25 = i7 & 131072;
                                if (i25 != 0) {
                                    i45 |= 12582912;
                                } else {
                                    if ((i5 & 12582912) == 0) {
                                        int i50 = IAuthTabCallback + 43;
                                        i26 = i24;
                                        onExtraCallback = i50 % 128;
                                        if (i50 % 2 != 0) {
                                            int i51 = 68 / 0;
                                            i27 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(ontransact) ? 8388608 : 4194304;
                                        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(ontransact)) {
                                        }
                                        i45 |= i27;
                                    }
                                    i28 = 262144 & i7;
                                    if (i28 == 0) {
                                        i45 |= 100663296;
                                    } else {
                                        if ((i5 & 100663296) == 0) {
                                            i45 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStubProxy) ? 67108864 : 33554432;
                                        }
                                        i29 = i7 & 524288;
                                        if (i29 == 0) {
                                            i40 = (i5 & 805306368) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj) ? 536870912 : 268435456 : 805306368;
                                            i30 = onExtraCallback + 121;
                                            IAuthTabCallback = i30 % 128;
                                            if (i30 % 2 != 0) {
                                                Object obj4 = null;
                                                obj4.hashCode();
                                                throw null;
                                            }
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i8) == 306783378 && (306783379 & i45) == 306783378 && (i6 & 1) == 0) ? false : true, i8 & 1)) {
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                                if ((i4 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                                    if (i44 != 0) {
                                                        int i52 = IAuthTabCallback + 93;
                                                        onExtraCallback = i52 % 128;
                                                        int i53 = i52 % 2;
                                                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                                                    } else {
                                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                                    }
                                                    i34 = i9 != 0 ? Integer.MAX_VALUE : i;
                                                    i35 = i10 != 0 ? 0 : i2;
                                                    i36 = i11 != 0 ? 0 : i3;
                                                    z3 = i12 != 0 ? false : z;
                                                    if ((i7 & 128) != 0) {
                                                        int i54 = IAuthTabCallback + 51;
                                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                        onExtraCallback = i54 % 128;
                                                        if (i54 % 2 != 0) {
                                                            Object obj5 = null;
                                                            obj5.hashCode();
                                                            throw null;
                                                        }
                                                        gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                                        i8 &= -29360129;
                                                    } else {
                                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                        gethumanreadablename3 = gethumanreadablename;
                                                    }
                                                    jOnTransact = i13 != 0 ? setByteOrder.Companion.onTransact() : j;
                                                    long jOnNavigationEvent3 = i14 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
                                                    jOnNavigationEvent2 = i15 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
                                                    float fOnExtraCallback = i17 != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
                                                    bindchildren3 = i18 != 0 ? null : bindchildren;
                                                    useVar3 = i22 != 0 ? null : useVar;
                                                    jOnNavigationEvent = i21 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
                                                    graphicDeviceInfo3 = i23 != 0 ? null : graphicDeviceInfo;
                                                    onextracallbackwithresult3 = i26 != 0 ? onExtraCallbackWithResult.TopLeft : onextracallbackwithresult;
                                                    ontransactIAuthTabCallback = i25 != 0 ? onTransact.Companion.IAuthTabCallback() : ontransact;
                                                    iAuthTabCallbackStubProxy3 = i28 != 0 ? null : iAuthTabCallbackStubProxy;
                                                    if (i29 != 0) {
                                                        getHumanReadableName gethumanreadablename6 = gethumanreadablename3;
                                                        int i55 = onExtraCallback + 11;
                                                        long j10 = jOnNavigationEvent3;
                                                        IAuthTabCallback = i55 % 128;
                                                        int i56 = i55 % 2;
                                                        quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                                        gethumanreadablename4 = gethumanreadablename6;
                                                        i38 = i8;
                                                        obj3 = null;
                                                        f3 = fOnExtraCallback;
                                                        j8 = j10;
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                                                        } else {
                                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1001580413, i38, i45, "im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1.Ticker (TdsAnimateTextV1.kt:464)");
                                                        }
                                                        Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                                                        int i57 = i45 >> 15;
                                                        int i58 = i38 >> 6;
                                                        onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult3;
                                                        int i59 = i38;
                                                        final mExternalSyntheticLambda8 mexternalsyntheticlambda8OnNavigationEvent = mExternalSyntheticLambda5.onNavigationEvent("", obj3, ontransactIAuthTabCallback, iAuthTabCallbackStubProxy3, null, gethumanreadablename4, jOnTransact, j8, jOnNavigationEvent2, createCameraCaptureCallback.onExtraCallback(mExternalSyntheticLambda7.onExtraCallbackWithResult(onextracallbackwithresult3)), f3, bindchildren3, useVar3, jOnNavigationEvent, graphicDeviceInfo3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i57 & 896) | ((i45 >> 24) & 112) | 6 | (i57 & 7168) | (i58 & 458752) | (i58 & 3670016) | (i58 & 29360128) | ((i45 << 24) & 234881024), (i45 >> 3) & 65534, 16);
                                                        if (obj3 == null) {
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(945816221);
                                                            Object[] objArr = {obj3, mexternalsyntheticlambda8OnNavigationEvent, list, iAuthTabCallback, Integer.valueOf(i35), Integer.valueOf(i36), Integer.valueOf(i34), Boolean.valueOf(z3)};
                                                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                                            gethumanreadablename5 = gethumanreadablename4;
                                                            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                                                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda0
                                                                    private static int IAuthTabCallback = 0;
                                                                    private static int onExtraCallback = 1;

                                                                    public final Object invoke() {
                                                                        int i60 = 2 % 2;
                                                                        int i61 = IAuthTabCallback + 41;
                                                                        onExtraCallback = i61 % 128;
                                                                        int i62 = i61 % 2;
                                                                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult();
                                                                        int i63 = onExtraCallback + 45;
                                                                        IAuthTabCallback = i63 % 128;
                                                                        if (i63 % 2 != 0) {
                                                                            int i64 = 24 / 0;
                                                                        }
                                                                        return getsupportedhighspeedresolutionsforOnExtraCallbackWithResult;
                                                                    }
                                                                };
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                                            }
                                                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                                                            Unit unit = Unit.INSTANCE;
                                                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                                                            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mexternalsyntheticlambda8OnNavigationEvent);
                                                            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                                                            j9 = j8;
                                                            boolean z4 = (i59 & 14) == 4;
                                                            f4 = f3;
                                                            boolean z5 = (i59 & 112) == 32;
                                                            bindchildren4 = bindchildren3;
                                                            i39 = i59;
                                                            useVar4 = useVar3;
                                                            boolean z6 = (i39 & 7168) == 2048;
                                                            boolean z7 = (57344 & i39) == 16384;
                                                            iAuthTabCallbackStubProxy4 = iAuthTabCallbackStubProxy3;
                                                            if ((458752 & i39) == 131072) {
                                                                int i60 = IAuthTabCallback + 93;
                                                                onExtraCallback = i60 % 128;
                                                                boolean z8 = i60 % 2 == 0;
                                                                graphicDeviceInfo4 = graphicDeviceInfo3;
                                                                boolean z9 = (3670016 & i39) == 1048576;
                                                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                if ((z4 | zOnNavigationEvent | zOnNavigationEvent2 | zOnExtraCallback | z5 | z6 | z7 | z8 | z9) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                                                    objOnMinimized2 = new IAuthTabCallback_Parcel(mexternalsyntheticlambda8OnNavigationEvent, context, list, iAuthTabCallback, i34, i35, i36, z3, getsupportedhighspeedresolutionsfor, null);
                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                                                }
                                                                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                            }
                                                        } else {
                                                            gethumanreadablename5 = gethumanreadablename4;
                                                            j9 = j8;
                                                            f4 = f3;
                                                            bindchildren4 = bindchildren3;
                                                            useVar4 = useVar3;
                                                            iAuthTabCallbackStubProxy4 = iAuthTabCallbackStubProxy3;
                                                            graphicDeviceInfo4 = graphicDeviceInfo3;
                                                            i39 = i59;
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(946711098);
                                                            Object[] objArr2 = {mexternalsyntheticlambda8OnNavigationEvent, list, iAuthTabCallback, Integer.valueOf(i35), Integer.valueOf(i36), Integer.valueOf(i34), Boolean.valueOf(z3)};
                                                            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mexternalsyntheticlambda8OnNavigationEvent);
                                                            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                                                            boolean z10 = (i39 & 14) == 4;
                                                            boolean z11 = (i39 & 112) == 32;
                                                            boolean z12 = (i39 & 7168) == 2048;
                                                            boolean z13 = (57344 & i39) == 16384;
                                                            boolean z14 = (458752 & i39) == 131072;
                                                            boolean z15 = (3670016 & i39) == 1048576;
                                                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                            if (!(z10 | zOnNavigationEvent3 | zOnExtraCallback2 | z11 | z12 | z13 | z14 | z15)) {
                                                                int i61 = onExtraCallback + 125;
                                                                IAuthTabCallback = i61 % 128;
                                                                int i62 = i61 % 2;
                                                                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                                    objOnMinimized3 = new getInterfaceDescriptor(mexternalsyntheticlambda8OnNavigationEvent, context, list, iAuthTabCallback, i34, i35, i36, z3, null);
                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                                                }
                                                                isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr2, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                            }
                                                        }
                                                        final QuirkSettingsLoader quirkSettingsLoaderOnNavigationEvent = mExternalSyntheticLambda7.onNavigationEvent(onextracallbackwithresult4);
                                                        int i63 = i39 << 6;
                                                        mExternalSyntheticLambda7.onWarmupCompleted(-422700871, JsParamKeys.onExtraCallbackWithResult(), 422700876, new Object[]{ontransactIAuthTabCallback, mexternalsyntheticlambda8OnNavigationEvent, list, quirkSettingsLoaderOnNavigationEvent, quirksExternalSyntheticBackport02, ForwardingCameraControl.onExtraCallback(1891184454, true, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda1
                                                            private static int onExtraCallback = 0;
                                                            private static int onExtraCallbackWithResult = 1;

                                                            public final Object invoke(Object obj6, Object obj7) {
                                                                int i64 = 2 % 2;
                                                                int i65 = onExtraCallbackWithResult + 63;
                                                                onExtraCallback = i65 % 128;
                                                                int i66 = i65 % 2;
                                                                Unit unitOnExtraCallback = mExternalSyntheticApiModelOutline1.onExtraCallback(mexternalsyntheticlambda8OnNavigationEvent, quirkSettingsLoaderOnNavigationEvent, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                                                                int i67 = onExtraCallbackWithResult + 77;
                                                                onExtraCallback = i67 % 128;
                                                                if (i67 % 2 != 0) {
                                                                    int i68 = 50 / 0;
                                                                }
                                                                return unitOnExtraCallback;
                                                            }
                                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i63 & 57344) | ((i45 >> 21) & 14) | 196608 | (i63 & 896))}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                                        }
                                                        gethumanreadablename2 = gethumanreadablename5;
                                                        j6 = j9;
                                                        iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy4;
                                                        graphicDeviceInfo2 = graphicDeviceInfo4;
                                                        i31 = i34;
                                                        i32 = i35;
                                                        i33 = i36;
                                                        ontransact2 = ontransactIAuthTabCallback;
                                                        z2 = z3;
                                                        onextracallbackwithresult2 = onextracallbackwithresult4;
                                                        obj2 = obj3;
                                                        j5 = jOnTransact;
                                                        j7 = jOnNavigationEvent2;
                                                        f2 = f4;
                                                        bindchildren2 = bindchildren4;
                                                        useVar2 = useVar4;
                                                    } else {
                                                        getHumanReadableName gethumanreadablename7 = gethumanreadablename3;
                                                        long j11 = jOnNavigationEvent3;
                                                        quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                                        gethumanreadablename4 = gethumanreadablename7;
                                                        i37 = i8;
                                                        f3 = fOnExtraCallback;
                                                        j8 = j11;
                                                    }
                                                } else {
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                    if ((i7 & 128) != 0) {
                                                        i8 &= -29360129;
                                                    }
                                                    quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport0;
                                                    i34 = i;
                                                    i35 = i2;
                                                    i36 = i3;
                                                    z3 = z;
                                                    gethumanreadablename4 = gethumanreadablename;
                                                    jOnTransact = j;
                                                    j8 = j2;
                                                    jOnNavigationEvent2 = j3;
                                                    bindchildren3 = bindchildren;
                                                    useVar3 = useVar;
                                                    jOnNavigationEvent = j4;
                                                    graphicDeviceInfo3 = graphicDeviceInfo;
                                                    onextracallbackwithresult3 = onextracallbackwithresult;
                                                    ontransactIAuthTabCallback = ontransact;
                                                    iAuthTabCallbackStubProxy3 = iAuthTabCallbackStubProxy;
                                                    i37 = i8;
                                                    f3 = f;
                                                }
                                                obj3 = obj;
                                                i38 = i37;
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                }
                                                Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                                                int i572 = i45 >> 15;
                                                int i582 = i38 >> 6;
                                                onExtraCallbackWithResult onextracallbackwithresult42 = onextracallbackwithresult3;
                                                int i592 = i38;
                                                final mExternalSyntheticLambda8 mexternalsyntheticlambda8OnNavigationEvent2 = mExternalSyntheticLambda5.onNavigationEvent("", obj3, ontransactIAuthTabCallback, iAuthTabCallbackStubProxy3, null, gethumanreadablename4, jOnTransact, j8, jOnNavigationEvent2, createCameraCaptureCallback.onExtraCallback(mExternalSyntheticLambda7.onExtraCallbackWithResult(onextracallbackwithresult3)), f3, bindchildren3, useVar3, jOnNavigationEvent, graphicDeviceInfo3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i572 & 896) | ((i45 >> 24) & 112) | 6 | (i572 & 7168) | (i582 & 458752) | (i582 & 3670016) | (i582 & 29360128) | ((i45 << 24) & 234881024), (i45 >> 3) & 65534, 16);
                                                if (obj3 == null) {
                                                }
                                                final QuirkSettingsLoader quirkSettingsLoaderOnNavigationEvent2 = mExternalSyntheticLambda7.onNavigationEvent(onextracallbackwithresult42);
                                                int i632 = i39 << 6;
                                                mExternalSyntheticLambda7.onWarmupCompleted(-422700871, JsParamKeys.onExtraCallbackWithResult(), 422700876, new Object[]{ontransactIAuthTabCallback, mexternalsyntheticlambda8OnNavigationEvent2, list, quirkSettingsLoaderOnNavigationEvent2, quirksExternalSyntheticBackport02, ForwardingCameraControl.onExtraCallback(1891184454, true, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda1
                                                    private static int onExtraCallback = 0;
                                                    private static int onExtraCallbackWithResult = 1;

                                                    public final Object invoke(Object obj6, Object obj7) {
                                                        int i64 = 2 % 2;
                                                        int i65 = onExtraCallbackWithResult + 63;
                                                        onExtraCallback = i65 % 128;
                                                        int i66 = i65 % 2;
                                                        Unit unitOnExtraCallback = mExternalSyntheticApiModelOutline1.onExtraCallback(mexternalsyntheticlambda8OnNavigationEvent2, quirkSettingsLoaderOnNavigationEvent2, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                                                        int i67 = onExtraCallbackWithResult + 77;
                                                        onExtraCallback = i67 % 128;
                                                        if (i67 % 2 != 0) {
                                                            int i68 = 50 / 0;
                                                        }
                                                        return unitOnExtraCallback;
                                                    }
                                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i632 & 57344) | ((i45 >> 21) & 14) | 196608 | (i632 & 896))}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                }
                                                gethumanreadablename2 = gethumanreadablename5;
                                                j6 = j9;
                                                iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy4;
                                                graphicDeviceInfo2 = graphicDeviceInfo4;
                                                i31 = i34;
                                                i32 = i35;
                                                i33 = i36;
                                                ontransact2 = ontransactIAuthTabCallback;
                                                z2 = z3;
                                                onextracallbackwithresult2 = onextracallbackwithresult42;
                                                obj2 = obj3;
                                                j5 = jOnTransact;
                                                j7 = jOnNavigationEvent2;
                                                f2 = f4;
                                                bindchildren2 = bindchildren4;
                                                useVar2 = useVar4;
                                            } else {
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                                i31 = i;
                                                i32 = i2;
                                                i33 = i3;
                                                z2 = z;
                                                gethumanreadablename2 = gethumanreadablename;
                                                j5 = j;
                                                j6 = j2;
                                                j7 = j3;
                                                f2 = f;
                                                bindchildren2 = bindchildren;
                                                useVar2 = useVar;
                                                jOnNavigationEvent = j4;
                                                graphicDeviceInfo2 = graphicDeviceInfo;
                                                onextracallbackwithresult2 = onextracallbackwithresult;
                                                ontransact2 = ontransact;
                                                iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy;
                                                obj2 = obj;
                                            }
                                            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport02;
                                                final long j12 = jOnNavigationEvent;
                                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda2
                                                    private static int onExtraCallback = 0;
                                                    private static int onWarmupCompleted = 1;

                                                    public final Object invoke(Object obj6, Object obj7) {
                                                        int i64 = 2 % 2;
                                                        int i65 = onExtraCallback + 77;
                                                        onWarmupCompleted = i65 % 128;
                                                        int i66 = i65 % 2;
                                                        Unit unitOnNavigationEvent = mExternalSyntheticApiModelOutline1.onNavigationEvent(this.f$0, list, iAuthTabCallback, quirksExternalSyntheticBackport06, i31, i32, i33, z2, gethumanreadablename2, j5, j6, j7, f2, bindchildren2, useVar2, j12, graphicDeviceInfo2, onextracallbackwithresult2, ontransact2, iAuthTabCallbackStubProxy2, obj2, i4, i5, i6, i7, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                                                        int i67 = onExtraCallback + 113;
                                                        onWarmupCompleted = i67 % 128;
                                                        int i68 = i67 % 2;
                                                        return unitOnNavigationEvent;
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        i45 |= i40;
                                        i30 = onExtraCallback + 121;
                                        IAuthTabCallback = i30 % 128;
                                        if (i30 % 2 != 0) {
                                        }
                                    }
                                    i29 = i7 & 524288;
                                    if (i29 == 0) {
                                    }
                                    i45 |= i40;
                                    i30 = onExtraCallback + 121;
                                    IAuthTabCallback = i30 % 128;
                                    if (i30 % 2 != 0) {
                                    }
                                }
                                i26 = i24;
                                i28 = 262144 & i7;
                                if (i28 == 0) {
                                }
                                i29 = i7 & 524288;
                                if (i29 == 0) {
                                }
                                i45 |= i40;
                                i30 = onExtraCallback + 121;
                                IAuthTabCallback = i30 % 128;
                                if (i30 % 2 != 0) {
                                }
                            }
                            i21 = i20;
                            i22 = i19;
                            i23 = i7 & 32768;
                            if (i23 != 0) {
                            }
                            i24 = 65536 & i7;
                            if (i24 != 0) {
                            }
                            i25 = i7 & 131072;
                            if (i25 != 0) {
                            }
                            i26 = i24;
                            i28 = 262144 & i7;
                            if (i28 == 0) {
                            }
                            i29 = i7 & 524288;
                            if (i29 == 0) {
                            }
                            i45 |= i40;
                            i30 = onExtraCallback + 121;
                            IAuthTabCallback = i30 % 128;
                            if (i30 % 2 != 0) {
                            }
                        }
                        i20 = i7 & 16384;
                        if (i20 == 0) {
                        }
                        i21 = i20;
                        i22 = i19;
                        i23 = i7 & 32768;
                        if (i23 != 0) {
                        }
                        i24 = 65536 & i7;
                        if (i24 != 0) {
                        }
                        i25 = i7 & 131072;
                        if (i25 != 0) {
                        }
                        i26 = i24;
                        i28 = 262144 & i7;
                        if (i28 == 0) {
                        }
                        i29 = i7 & 524288;
                        if (i29 == 0) {
                        }
                        i45 |= i40;
                        i30 = onExtraCallback + 121;
                        IAuthTabCallback = i30 % 128;
                        if (i30 % 2 != 0) {
                        }
                    }
                    i19 = i7 & 8192;
                    if (i19 != 0) {
                    }
                    i20 = i7 & 16384;
                    if (i20 == 0) {
                    }
                    i21 = i20;
                    i22 = i19;
                    i23 = i7 & 32768;
                    if (i23 != 0) {
                    }
                    i24 = 65536 & i7;
                    if (i24 != 0) {
                    }
                    i25 = i7 & 131072;
                    if (i25 != 0) {
                    }
                    i26 = i24;
                    i28 = 262144 & i7;
                    if (i28 == 0) {
                    }
                    i29 = i7 & 524288;
                    if (i29 == 0) {
                    }
                    i45 |= i40;
                    i30 = onExtraCallback + 121;
                    IAuthTabCallback = i30 % 128;
                    if (i30 % 2 != 0) {
                    }
                }
                i11 = i7 & 32;
                if (i11 == 0) {
                }
                i12 = i7 & 64;
                if (i12 == 0) {
                }
                if ((i4 & 12582912) == 0) {
                }
                i13 = i7 & 256;
                if (i13 == 0) {
                }
                i14 = i7 & 512;
                if (i14 == 0) {
                }
                i15 = i7 & 1024;
                if (i15 == 0) {
                }
                i17 = i7 & 2048;
                if (i17 == 0) {
                }
                int i452 = i16;
                i18 = i7 & 4096;
                if (i18 == 0) {
                }
                i19 = i7 & 8192;
                if (i19 != 0) {
                }
                i20 = i7 & 16384;
                if (i20 == 0) {
                }
                i21 = i20;
                i22 = i19;
                i23 = i7 & 32768;
                if (i23 != 0) {
                }
                i24 = 65536 & i7;
                if (i24 != 0) {
                }
                i25 = i7 & 131072;
                if (i25 != 0) {
                }
                i26 = i24;
                i28 = 262144 & i7;
                if (i28 == 0) {
                }
                i29 = i7 & 524288;
                if (i29 == 0) {
                }
                i452 |= i40;
                i30 = onExtraCallback + 121;
                IAuthTabCallback = i30 % 128;
                if (i30 % 2 != 0) {
                }
            }
            i10 = i7 & 16;
            if (i10 != 0) {
            }
            i11 = i7 & 32;
            if (i11 == 0) {
            }
            i12 = i7 & 64;
            if (i12 == 0) {
            }
            if ((i4 & 12582912) == 0) {
            }
            i13 = i7 & 256;
            if (i13 == 0) {
            }
            i14 = i7 & 512;
            if (i14 == 0) {
            }
            i15 = i7 & 1024;
            if (i15 == 0) {
            }
            i17 = i7 & 2048;
            if (i17 == 0) {
            }
            int i4522 = i16;
            i18 = i7 & 4096;
            if (i18 == 0) {
            }
            i19 = i7 & 8192;
            if (i19 != 0) {
            }
            i20 = i7 & 16384;
            if (i20 == 0) {
            }
            i21 = i20;
            i22 = i19;
            i23 = i7 & 32768;
            if (i23 != 0) {
            }
            i24 = 65536 & i7;
            if (i24 != 0) {
            }
            i25 = i7 & 131072;
            if (i25 != 0) {
            }
            i26 = i24;
            i28 = 262144 & i7;
            if (i28 == 0) {
            }
            i29 = i7 & 524288;
            if (i29 == 0) {
            }
            i4522 |= i40;
            i30 = onExtraCallback + 121;
            IAuthTabCallback = i30 % 128;
            if (i30 % 2 != 0) {
            }
        }
        i9 = i7 & 8;
        if (i9 == 0) {
        }
        i10 = i7 & 16;
        if (i10 != 0) {
        }
        i11 = i7 & 32;
        if (i11 == 0) {
        }
        i12 = i7 & 64;
        if (i12 == 0) {
        }
        if ((i4 & 12582912) == 0) {
        }
        i13 = i7 & 256;
        if (i13 == 0) {
        }
        i14 = i7 & 512;
        if (i14 == 0) {
        }
        i15 = i7 & 1024;
        if (i15 == 0) {
        }
        i17 = i7 & 2048;
        if (i17 == 0) {
        }
        int i45222 = i16;
        i18 = i7 & 4096;
        if (i18 == 0) {
        }
        i19 = i7 & 8192;
        if (i19 != 0) {
        }
        i20 = i7 & 16384;
        if (i20 == 0) {
        }
        i21 = i20;
        i22 = i19;
        i23 = i7 & 32768;
        if (i23 != 0) {
        }
        i24 = 65536 & i7;
        if (i24 != 0) {
        }
        i25 = i7 & 131072;
        if (i25 != 0) {
        }
        i26 = i24;
        i28 = 262144 & i7;
        if (i28 == 0) {
        }
        i29 = i7 & 524288;
        if (i29 == 0) {
        }
        i45222 |= i40;
        i30 = onExtraCallback + 121;
        IAuthTabCallback = i30 % 128;
        if (i30 % 2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull List<String> list, @NotNull IAuthTabCallback iAuthTabCallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, boolean z, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable onTransact ontransact, @Nullable IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4, int i5, int i6, int i7) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i8;
        getHumanReadableName gethumanreadablename2;
        long jOnTransact;
        float fOnExtraCallback;
        long jOnNavigationEvent;
        onExtraCallbackWithResult onextracallbackwithresult2;
        List<String> list2 = list;
        int i9 = 2 % 2;
        int i10 = onExtraCallback + 87;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            if ((i7 & 4) != 0) {
                int i11 = onExtraCallback + 101;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            }
        } else {
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            if ((i7 & 4) != 0) {
            }
        }
        int i13 = (i7 & 8) != 0 ? Integer.MAX_VALUE : i;
        if ((i7 & 16) != 0) {
            int i14 = IAuthTabCallback + 35;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            i8 = 0;
        } else {
            i8 = i2;
        }
        int i16 = (i7 & 32) != 0 ? 0 : i3;
        boolean z2 = (i7 & 64) != 0 ? false : z;
        if ((i7 & 128) != 0) {
            gethumanreadablename2 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
            int i17 = onExtraCallback + 55;
            IAuthTabCallback = i17 % 128;
            int i18 = i17 % 2;
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        if ((i7 & 256) != 0) {
            jOnTransact = setByteOrder.Companion.onTransact();
            int i19 = onExtraCallback + 31;
            IAuthTabCallback = i19 % 128;
            int i20 = i19 % 2;
        } else {
            jOnTransact = j;
        }
        long jOnNavigationEvent2 = (i7 & 512) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        long jOnNavigationEvent3 = (i7 & 1024) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
        if ((i7 & 2048) != 0) {
            int i21 = IAuthTabCallback + 73;
            onExtraCallback = i21 % 128;
            int i22 = i21 % 2;
            fOnExtraCallback = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
        } else {
            fOnExtraCallback = f;
        }
        bindChildren bindchildren2 = (i7 & 4096) != 0 ? null : bindchildren;
        use useVar2 = (i7 & 8192) != 0 ? null : useVar;
        if ((i7 & 16384) != 0) {
            int i23 = IAuthTabCallback + 35;
            onExtraCallback = i23 % 128;
            int i24 = i23 % 2;
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j4;
        }
        GraphicDeviceInfo graphicDeviceInfo2 = (32768 & i7) != 0 ? null : graphicDeviceInfo;
        if ((65536 & i7) != 0) {
            int i25 = onExtraCallback + 49;
            IAuthTabCallback = i25 % 128;
            int i26 = i25 % 2;
            onextracallbackwithresult2 = onExtraCallbackWithResult.TopLeft;
        } else {
            onextracallbackwithresult2 = onextracallbackwithresult;
        }
        onTransact ontransactIAuthTabCallback = (131072 & i7) != 0 ? onTransact.Companion.IAuthTabCallback() : ontransact;
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy2 = (262144 & i7) != 0 ? null : iAuthTabCallbackStubProxy;
        Object obj2 = (524288 & i7) != 0 ? null : obj;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i27 = onExtraCallback + 93;
            IAuthTabCallback = i27 % 128;
            int i28 = i27 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1624886297, i4, i5, "im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1.TickerV2 (TdsAnimateTextV1.kt:574)");
        }
        ArrayList arrayList = new ArrayList(list.size());
        int i29 = 0;
        for (int size = list2.size(); i29 < size; size = size) {
            arrayList.add(new hasProvider(list2.get(i29), (List) null, 2, (DefaultConstructorMarker) null));
            i29++;
            list2 = list;
        }
        IAuthTabCallback(arrayList, iAuthTabCallback, quirksExternalSyntheticBackport02, i13, i8, i16, z2, gethumanreadablename2, jOnTransact, jOnNavigationEvent2, jOnNavigationEvent3, fOnExtraCallback, bindchildren2, useVar2, jOnNavigationEvent, graphicDeviceInfo2, onextracallbackwithresult2, ontransactIAuthTabCallback, iAuthTabCallbackStubProxy2, obj2, cameraCaptureResultEmptyCameraCaptureResult, i4 & 2147483632, i5 & 2147483646, i6 & 14, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final getSupportedHighSpeedResolutionsFor IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        int i4 = onExtraCallback + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return getsupportedhighspeedresolutionsforOnWarmupCompleted;
        }
        throw null;
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $animated$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ int $interval;
        final /* synthetic */ IAuthTabCallback $motion;
        final /* synthetic */ int $playCount;
        final /* synthetic */ boolean $skipIntroMotion;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        final /* synthetic */ List<hasProvider> $texts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, List<hasProvider> list, IAuthTabCallback iAuthTabCallback, int i, int i2, int i3, boolean z, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$context = context;
            this.$texts = list;
            this.$motion = iAuthTabCallback;
            this.$playCount = i;
            this.$initialDelay = i2;
            this.$interval = i3;
            this.$skipIntroMotion = z;
            this.$animated$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 113;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = new access000(this.$state, this.$context, this.$texts, this.$motion, this.$playCount, this.$initialDelay, this.$interval, this.$skipIntroMotion, this.$animated$delegate, access13800Var);
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return access000Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 117;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (!((Boolean) mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this.$animated$delegate}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -154613870, 154613875, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted())).booleanValue()) {
                int i4 = onNavigationEvent + 107;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                mExternalSyntheticLambda8.onWarmupCompleted(this.$state, this.$context, this.$texts, this.$motion, null, this.$playCount, this.$initialDelay, this.$interval, this.$skipIntroMotion, false, 264, null);
                mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this.$animated$delegate, true}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1526323062, -1526323055, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            }
            Unit unit = Unit.INSTANCE;
            int i6 = onExtraCallback + 103;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ int $interval;
        final /* synthetic */ IAuthTabCallback $motion;
        final /* synthetic */ int $playCount;
        final /* synthetic */ boolean $skipIntroMotion;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        final /* synthetic */ List<hasProvider> $texts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, List<hasProvider> list, IAuthTabCallback iAuthTabCallback, int i, int i2, int i3, boolean z, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$context = context;
            this.$texts = list;
            this.$motion = iAuthTabCallback;
            this.$playCount = i;
            this.$initialDelay = i2;
            this.$interval = i3;
            this.$skipIntroMotion = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = new access100(this.$state, this.$context, this.$texts, this.$motion, this.$playCount, this.$initialDelay, this.$interval, this.$skipIntroMotion, access13800Var);
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return access100Var;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 6 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            mExternalSyntheticLambda8.onWarmupCompleted(this.$state, this.$context, this.$texts, this.$motion, null, this.$playCount, this.$initialDelay, this.$interval, this.$skipIntroMotion, false, 264, null);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    private static final Unit asInterface(mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirkSettingsLoader quirkSettingsLoader, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 27;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 9;
            int i7 = i6 % 128;
            onExtraCallback = i7;
            z = i6 % 2 == 0;
            int i8 = i7 + 81;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i10 = IAuthTabCallback + 75;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallback + 113;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-538975006, i, -1, "im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1.TickerV2.<anonymous> (TdsAnimateTextV1.kt:698)");
            }
            mExternalSyntheticLambda7.onWarmupCompleted(440982441, JsParamKeys.onExtraCallbackWithResult(), -440982437, new Object[]{mexternalsyntheticlambda8, null, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, 0, 2}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:381:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull final List<hasProvider> list, @NotNull final IAuthTabCallback iAuthTabCallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, boolean z, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable onTransact ontransact, @Nullable IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i4, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int iOrdinal;
        int i30;
        int i31;
        int i32;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final int i33;
        final int i34;
        final int i35;
        final boolean z2;
        final getHumanReadableName gethumanreadablename2;
        final long j5;
        final long j6;
        final long j7;
        final float f2;
        final bindChildren bindchildren2;
        final use useVar2;
        final long j8;
        final GraphicDeviceInfo graphicDeviceInfo2;
        final onExtraCallbackWithResult onextracallbackwithresult2;
        final onTransact ontransact2;
        final IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy2;
        final Object obj2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i36;
        int i37;
        int i38;
        boolean z3;
        getHumanReadableName gethumanreadablename3;
        long jOnTransact;
        long jOnNavigationEvent;
        long jOnNavigationEvent2;
        float fOnExtraCallback;
        bindChildren bindchildren3;
        use useVar3;
        long jOnNavigationEvent3;
        GraphicDeviceInfo graphicDeviceInfo3;
        onExtraCallbackWithResult onextracallbackwithresult3;
        onTransact ontransactIAuthTabCallback;
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy3;
        Object obj3;
        getHumanReadableName gethumanreadablename4;
        long j9;
        float f3;
        GraphicDeviceInfo graphicDeviceInfo4;
        int i39;
        bindChildren bindchildren4;
        use useVar4;
        boolean z4;
        boolean z5;
        int i40;
        int i41;
        int i42 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1624886297);
        if ((i4 & 6) == 0) {
            i8 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 4 : 2) | i4;
        } else {
            i8 = i4;
        }
        if ((i4 & 48) == 0) {
            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 32 : 16;
        }
        int i43 = i7 & 4;
        if (i43 != 0) {
            i8 |= 384;
        } else {
            if ((i4 & 384) == 0) {
                i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 256 : 128;
            }
            i9 = i7 & 8;
            if (i9 == 0) {
                i8 |= 3072;
            } else {
                if ((i4 & 3072) == 0) {
                    i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 2048 : 1024;
                }
                i10 = i7 & 16;
                if (i10 != 0) {
                    i8 |= 24576;
                } else {
                    if ((i4 & 24576) == 0) {
                        i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 16384 : 8192;
                    }
                    i11 = i7 & 32;
                    if (i11 == 0) {
                        i8 |= 196608;
                    } else {
                        if ((i4 & 196608) == 0) {
                            int i44 = onExtraCallback + 113;
                            IAuthTabCallback = i44 % 128;
                            int i45 = i44 % 2;
                            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i3) ? 131072 : 65536;
                        }
                        i12 = i7 & 64;
                        if (i12 != 0) {
                            i8 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                                int i46 = onExtraCallback + 61;
                                IAuthTabCallback = i46 % 128;
                                int i47 = i46 % 2;
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i8 |= i13;
                        }
                        if ((12582912 & i4) == 0) {
                            i8 |= ((i7 & 128) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename)) ? 8388608 : 4194304;
                        }
                        i14 = i7 & 256;
                        if (i14 != 0) {
                            i8 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 67108864 : 33554432;
                        }
                        i15 = i7 & 512;
                        if (i15 != 0) {
                            i8 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 536870912 : 268435456;
                        }
                        i16 = i7 & 1024;
                        if (i16 != 0) {
                            i17 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3)) {
                                int i48 = IAuthTabCallback + 89;
                                onExtraCallback = i48 % 128;
                                i18 = i48 % 2 != 0 ? 3 : 4;
                            } else {
                                i18 = 2;
                            }
                            i17 = i5 | i18;
                        } else {
                            i17 = i5;
                        }
                        i19 = i7 & 2048;
                        if (i19 != 0) {
                            i21 = i17 | 48;
                        } else if ((i5 & 48) == 0) {
                            int i49 = onExtraCallback + 11;
                            IAuthTabCallback = i49 % 128;
                            if (i49 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f);
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            i21 = i17 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 32 : 16);
                        } else {
                            i20 = i17;
                            i22 = i7 & 4096;
                            if (i22 == 0) {
                                i20 |= 384;
                            } else {
                                if ((i5 & 384) == 0) {
                                    i20 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bindchildren) ? 256 : 128;
                                }
                                i23 = i7 & 8192;
                                if (i23 != 0) {
                                    i20 |= 3072;
                                } else {
                                    if ((i5 & 3072) == 0) {
                                        i20 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(useVar) ? 2048 : 1024;
                                    }
                                    i24 = i7 & 16384;
                                    if (i24 == 0) {
                                        i20 |= 24576;
                                        i25 = i23;
                                    } else {
                                        i25 = i23;
                                        if ((i5 & 24576) == 0) {
                                            i26 = i15;
                                            i20 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j4) ? 16384 : 8192;
                                        }
                                        i27 = i7 & 32768;
                                        if (i27 != 0) {
                                            i20 |= 196608;
                                        } else if ((i5 & 196608) == 0) {
                                            i20 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 131072 : 65536;
                                        }
                                        i28 = 65536 & i7;
                                        if (i28 != 0) {
                                            i20 |= 1572864;
                                        } else {
                                            if ((i5 & 1572864) == 0) {
                                                if (onextracallbackwithresult == null) {
                                                    int i50 = IAuthTabCallback + 57;
                                                    i29 = i28;
                                                    onExtraCallback = i50 % 128;
                                                    int i51 = i50 % 2;
                                                    iOrdinal = -1;
                                                } else {
                                                    i29 = i28;
                                                    iOrdinal = onextracallbackwithresult.ordinal();
                                                }
                                                i20 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 1048576 : 524288;
                                            }
                                            i30 = i7 & 131072;
                                            if (i30 == 0) {
                                                i20 |= 12582912;
                                            } else {
                                                if ((12582912 & i5) == 0) {
                                                    i20 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(ontransact) ? 8388608 : 4194304;
                                                }
                                                i31 = i7 & 262144;
                                                if (i31 != 0) {
                                                    i20 |= 100663296;
                                                } else {
                                                    if ((i5 & 100663296) == 0) {
                                                        i20 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStubProxy) ? 67108864 : 33554432;
                                                    }
                                                    i32 = i7 & 524288;
                                                    if (i32 == 0) {
                                                        i41 = (i5 & 805306368) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj) ? 536870912 : 268435456 : 805306368;
                                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i8 & 306783379) == 306783378 && (306783379 & i20) == 306783378 && (i6 & 1) == 0) ? false : true, i8 & 1)) {
                                                            int i52 = IAuthTabCallback + 79;
                                                            onExtraCallback = i52 % 128;
                                                            if (i52 % 2 != 0) {
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                                                if ((i4 & 1) != 0) {
                                                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                                                        quirksExternalSyntheticBackport03 = i43 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                                                        i36 = i9 != 0 ? Integer.MAX_VALUE : i;
                                                                        i37 = i10 != 0 ? 0 : i2;
                                                                        i38 = i11 != 0 ? 0 : i3;
                                                                        z3 = i12 != 0 ? false : z;
                                                                        if ((i7 & 128) != 0) {
                                                                            gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                                                            i8 &= -29360129;
                                                                        } else {
                                                                            gethumanreadablename3 = gethumanreadablename;
                                                                        }
                                                                        jOnTransact = i14 != 0 ? setByteOrder.Companion.onTransact() : j;
                                                                        jOnNavigationEvent = i26 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
                                                                        jOnNavigationEvent2 = i16 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
                                                                        fOnExtraCallback = i19 != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
                                                                        bindchildren3 = i22 != 0 ? null : bindchildren;
                                                                        useVar3 = i25 != 0 ? null : useVar;
                                                                        jOnNavigationEvent3 = i24 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
                                                                        graphicDeviceInfo3 = i27 != 0 ? null : graphicDeviceInfo;
                                                                        onextracallbackwithresult3 = i29 != 0 ? onExtraCallbackWithResult.TopLeft : onextracallbackwithresult;
                                                                        ontransactIAuthTabCallback = i30 != 0 ? onTransact.Companion.IAuthTabCallback() : ontransact;
                                                                        iAuthTabCallbackStubProxy3 = i31 != 0 ? null : iAuthTabCallbackStubProxy;
                                                                        if (i32 != 0) {
                                                                            obj3 = null;
                                                                        }
                                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1624886297, i8, i20, "im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1.TickerV2 (TdsAnimateTextV1.kt:621)");
                                                                        }
                                                                        Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                                                                        int i53 = i20 >> 15;
                                                                        int i54 = i8 >> 6;
                                                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                                                        int i55 = i8;
                                                                        final mExternalSyntheticLambda8 mexternalsyntheticlambda8OnNavigationEvent = mExternalSyntheticLambda5.onNavigationEvent("", obj3, ontransactIAuthTabCallback, iAuthTabCallbackStubProxy3, null, gethumanreadablename3, jOnTransact, jOnNavigationEvent, jOnNavigationEvent2, createCameraCaptureCallback.onExtraCallback(mExternalSyntheticLambda7.onExtraCallbackWithResult(onextracallbackwithresult3)), fOnExtraCallback, bindchildren3, useVar3, jOnNavigationEvent3, graphicDeviceInfo3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i53 & 7168) | (i53 & 896) | ((i20 >> 24) & 112) | 6 | (i54 & 458752) | (i54 & 3670016) | (i54 & 29360128) | ((i20 << 24) & 234881024), (i20 >> 3) & 65534, 16);
                                                                        if (obj3 == null) {
                                                                            int i56 = IAuthTabCallback + 91;
                                                                            onExtraCallback = i56 % 128;
                                                                            int i57 = i56 % 2;
                                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1587180881);
                                                                            Object[] objArr = {obj3, mexternalsyntheticlambda8OnNavigationEvent, list, iAuthTabCallback, Integer.valueOf(i37), Integer.valueOf(i38), Integer.valueOf(i36), Boolean.valueOf(z3)};
                                                                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                                                            gethumanreadablename4 = gethumanreadablename3;
                                                                            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                                                                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda9
                                                                                    private static int IAuthTabCallback = 1;
                                                                                    private static int onExtraCallback;

                                                                                    public final Object invoke() {
                                                                                        int i58 = 2 % 2;
                                                                                        int i59 = onExtraCallback + 93;
                                                                                        IAuthTabCallback = i59 % 128;
                                                                                        int i60 = i59 % 2;
                                                                                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnExtraCallback = mExternalSyntheticApiModelOutline1.onExtraCallback();
                                                                                        int i61 = IAuthTabCallback + 85;
                                                                                        onExtraCallback = i61 % 128;
                                                                                        if (i61 % 2 != 0) {
                                                                                            int i62 = 5 / 0;
                                                                                        }
                                                                                        return getsupportedhighspeedresolutionsforOnExtraCallback;
                                                                                    }
                                                                                };
                                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                                                            }
                                                                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                                                                            Unit unit = Unit.INSTANCE;
                                                                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                                                                            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mexternalsyntheticlambda8OnNavigationEvent);
                                                                            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                                                                            j9 = jOnNavigationEvent2;
                                                                            boolean z6 = (i55 & 14) == 4;
                                                                            f3 = fOnExtraCallback;
                                                                            boolean z7 = (i55 & 112) == 32;
                                                                            graphicDeviceInfo4 = graphicDeviceInfo3;
                                                                            bindchildren4 = bindchildren3;
                                                                            boolean z8 = (i55 & 7168) == 2048;
                                                                            useVar4 = useVar3;
                                                                            boolean z9 = (57344 & i55) == 16384;
                                                                            i39 = i20;
                                                                            if ((458752 & i55) == 131072) {
                                                                                int i58 = onExtraCallback + 27;
                                                                                IAuthTabCallback = i58 % 128;
                                                                                boolean z10 = i58 % 2 != 0;
                                                                                int i59 = 3670016 & i55;
                                                                                i40 = i55;
                                                                                boolean z11 = i59 == 1048576;
                                                                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                                if ((z6 | zOnNavigationEvent | zOnNavigationEvent2 | zOnExtraCallback | z7 | z8 | z9 | z10 | z11) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                                                                    objOnMinimized2 = new access000(mexternalsyntheticlambda8OnNavigationEvent, context, list, iAuthTabCallback, i36, i37, i38, z3, getsupportedhighspeedresolutionsfor, null);
                                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                                                                }
                                                                                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                                            }
                                                                        } else {
                                                                            gethumanreadablename4 = gethumanreadablename3;
                                                                            j9 = jOnNavigationEvent2;
                                                                            f3 = fOnExtraCallback;
                                                                            graphicDeviceInfo4 = graphicDeviceInfo3;
                                                                            i39 = i20;
                                                                            bindchildren4 = bindchildren3;
                                                                            useVar4 = useVar3;
                                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1586331512);
                                                                            Object[] objArr2 = {mexternalsyntheticlambda8OnNavigationEvent, list, iAuthTabCallback, Integer.valueOf(i37), Integer.valueOf(i38), Integer.valueOf(i36), Boolean.valueOf(z3)};
                                                                            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mexternalsyntheticlambda8OnNavigationEvent);
                                                                            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                                                                            if ((i55 & 14) == 4) {
                                                                                int i60 = onExtraCallback + 1;
                                                                                IAuthTabCallback = i60 % 128;
                                                                                int i61 = i60 % 2;
                                                                                z4 = true;
                                                                            } else {
                                                                                z4 = false;
                                                                            }
                                                                            boolean z12 = (i55 & 112) == 32;
                                                                            boolean z13 = (i55 & 7168) == 2048;
                                                                            boolean z14 = (57344 & i55) == 16384;
                                                                            if ((458752 & i55) == 131072) {
                                                                                int i62 = onExtraCallback + 119;
                                                                                IAuthTabCallback = i62 % 128;
                                                                                int i63 = i62 % 2;
                                                                                z5 = true;
                                                                            } else {
                                                                                z5 = false;
                                                                            }
                                                                            int i64 = 3670016 & i55;
                                                                            i40 = i55;
                                                                            boolean z15 = i64 == 1048576;
                                                                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                            if ((zOnNavigationEvent3 | zOnExtraCallback2 | z4 | z12 | z13 | z14 | z5 | z15) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                                                objOnMinimized3 = new access100(mexternalsyntheticlambda8OnNavigationEvent, context, list, iAuthTabCallback, i36, i37, i38, z3, null);
                                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                                                            }
                                                                            isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr2, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                                        }
                                                                        final QuirkSettingsLoader quirkSettingsLoaderOnNavigationEvent = mExternalSyntheticLambda7.onNavigationEvent(onextracallbackwithresult3);
                                                                        int i65 = i40 << 6;
                                                                        mExternalSyntheticLambda7.onWarmupCompleted(-422700871, JsParamKeys.onExtraCallbackWithResult(), 422700876, new Object[]{ontransactIAuthTabCallback, mexternalsyntheticlambda8OnNavigationEvent, list, quirkSettingsLoaderOnNavigationEvent, quirksExternalSyntheticBackport02, ForwardingCameraControl.onExtraCallback(-538975006, true, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda10
                                                                            private static int onExtraCallbackWithResult = 0;
                                                                            private static int onWarmupCompleted = 1;

                                                                            public final Object invoke(Object obj5, Object obj6) {
                                                                                int i66 = 2 % 2;
                                                                                int i67 = onWarmupCompleted + 65;
                                                                                onExtraCallbackWithResult = i67 % 128;
                                                                                int i68 = i67 % 2;
                                                                                mExternalSyntheticLambda8 mexternalsyntheticlambda8 = mexternalsyntheticlambda8OnNavigationEvent;
                                                                                if (i68 == 0) {
                                                                                    return (Unit) mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{mexternalsyntheticlambda8, quirkSettingsLoaderOnNavigationEvent, (CameraCaptureResultEmptyCameraCaptureResult) obj5, Integer.valueOf(((Integer) obj6).intValue())}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 502863644, -502863642, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                                                                                }
                                                                                Object[] objArr3 = {mexternalsyntheticlambda8, quirkSettingsLoaderOnNavigationEvent, (CameraCaptureResultEmptyCameraCaptureResult) obj5, Integer.valueOf(((Integer) obj6).intValue())};
                                                                                int i69 = 64 / 0;
                                                                                return (Unit) mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr3, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 502863644, -502863642, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                                                                            }
                                                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i65 & 57344) | ((i39 >> 21) & 14) | 196608 | (i65 & 896))}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                                                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                                                        }
                                                                        useVar2 = useVar4;
                                                                        i33 = i36;
                                                                        z2 = z3;
                                                                        i34 = i37;
                                                                        i35 = i38;
                                                                        onextracallbackwithresult2 = onextracallbackwithresult3;
                                                                        ontransact2 = ontransactIAuthTabCallback;
                                                                        iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy3;
                                                                        obj2 = obj3;
                                                                        j5 = jOnTransact;
                                                                        j6 = jOnNavigationEvent;
                                                                        j8 = jOnNavigationEvent3;
                                                                        gethumanreadablename2 = gethumanreadablename4;
                                                                        j7 = j9;
                                                                        f2 = f3;
                                                                        graphicDeviceInfo2 = graphicDeviceInfo4;
                                                                        bindchildren2 = bindchildren4;
                                                                    } else {
                                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                                        if ((i7 & 128) != 0) {
                                                                            i8 &= -29360129;
                                                                        }
                                                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                                                        i36 = i;
                                                                        i37 = i2;
                                                                        i38 = i3;
                                                                        z3 = z;
                                                                        gethumanreadablename3 = gethumanreadablename;
                                                                        jOnTransact = j;
                                                                        jOnNavigationEvent = j2;
                                                                        jOnNavigationEvent2 = j3;
                                                                        fOnExtraCallback = f;
                                                                        bindchildren3 = bindchildren;
                                                                        useVar3 = useVar;
                                                                        jOnNavigationEvent3 = j4;
                                                                        graphicDeviceInfo3 = graphicDeviceInfo;
                                                                        onextracallbackwithresult3 = onextracallbackwithresult;
                                                                        ontransactIAuthTabCallback = ontransact;
                                                                        iAuthTabCallbackStubProxy3 = iAuthTabCallbackStubProxy;
                                                                    }
                                                                    obj3 = obj;
                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                    }
                                                                    Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                                                                    int i532 = i20 >> 15;
                                                                    int i542 = i8 >> 6;
                                                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                                                    int i552 = i8;
                                                                    final mExternalSyntheticLambda8 mexternalsyntheticlambda8OnNavigationEvent2 = mExternalSyntheticLambda5.onNavigationEvent("", obj3, ontransactIAuthTabCallback, iAuthTabCallbackStubProxy3, null, gethumanreadablename3, jOnTransact, jOnNavigationEvent, jOnNavigationEvent2, createCameraCaptureCallback.onExtraCallback(mExternalSyntheticLambda7.onExtraCallbackWithResult(onextracallbackwithresult3)), fOnExtraCallback, bindchildren3, useVar3, jOnNavigationEvent3, graphicDeviceInfo3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i532 & 7168) | (i532 & 896) | ((i20 >> 24) & 112) | 6 | (i542 & 458752) | (i542 & 3670016) | (i542 & 29360128) | ((i20 << 24) & 234881024), (i20 >> 3) & 65534, 16);
                                                                    if (obj3 == null) {
                                                                    }
                                                                    final QuirkSettingsLoader quirkSettingsLoaderOnNavigationEvent2 = mExternalSyntheticLambda7.onNavigationEvent(onextracallbackwithresult3);
                                                                    int i652 = i40 << 6;
                                                                    mExternalSyntheticLambda7.onWarmupCompleted(-422700871, JsParamKeys.onExtraCallbackWithResult(), 422700876, new Object[]{ontransactIAuthTabCallback, mexternalsyntheticlambda8OnNavigationEvent2, list, quirkSettingsLoaderOnNavigationEvent2, quirksExternalSyntheticBackport02, ForwardingCameraControl.onExtraCallback(-538975006, true, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda10
                                                                        private static int onExtraCallbackWithResult = 0;
                                                                        private static int onWarmupCompleted = 1;

                                                                        public final Object invoke(Object obj5, Object obj6) {
                                                                            int i66 = 2 % 2;
                                                                            int i67 = onWarmupCompleted + 65;
                                                                            onExtraCallbackWithResult = i67 % 128;
                                                                            int i68 = i67 % 2;
                                                                            mExternalSyntheticLambda8 mexternalsyntheticlambda8 = mexternalsyntheticlambda8OnNavigationEvent2;
                                                                            if (i68 == 0) {
                                                                                return (Unit) mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{mexternalsyntheticlambda8, quirkSettingsLoaderOnNavigationEvent2, (CameraCaptureResultEmptyCameraCaptureResult) obj5, Integer.valueOf(((Integer) obj6).intValue())}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 502863644, -502863642, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                                                                            }
                                                                            Object[] objArr3 = {mexternalsyntheticlambda8, quirkSettingsLoaderOnNavigationEvent2, (CameraCaptureResultEmptyCameraCaptureResult) obj5, Integer.valueOf(((Integer) obj6).intValue())};
                                                                            int i69 = 64 / 0;
                                                                            return (Unit) mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr3, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 502863644, -502863642, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                                                                        }
                                                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i652 & 57344) | ((i39 >> 21) & 14) | 196608 | (i652 & 896))}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                    }
                                                                    useVar2 = useVar4;
                                                                    i33 = i36;
                                                                    z2 = z3;
                                                                    i34 = i37;
                                                                    i35 = i38;
                                                                    onextracallbackwithresult2 = onextracallbackwithresult3;
                                                                    ontransact2 = ontransactIAuthTabCallback;
                                                                    iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy3;
                                                                    obj2 = obj3;
                                                                    j5 = jOnTransact;
                                                                    j6 = jOnNavigationEvent;
                                                                    j8 = jOnNavigationEvent3;
                                                                    gethumanreadablename2 = gethumanreadablename4;
                                                                    j7 = j9;
                                                                    f2 = f3;
                                                                    graphicDeviceInfo2 = graphicDeviceInfo4;
                                                                    bindchildren2 = bindchildren4;
                                                                }
                                                            } else {
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                                                if ((i4 & 1) != 0) {
                                                                }
                                                            }
                                                        } else {
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                                            i33 = i;
                                                            i34 = i2;
                                                            i35 = i3;
                                                            z2 = z;
                                                            gethumanreadablename2 = gethumanreadablename;
                                                            j5 = j;
                                                            j6 = j2;
                                                            j7 = j3;
                                                            f2 = f;
                                                            bindchildren2 = bindchildren;
                                                            useVar2 = useVar;
                                                            j8 = j4;
                                                            graphicDeviceInfo2 = graphicDeviceInfo;
                                                            onextracallbackwithresult2 = onextracallbackwithresult;
                                                            ontransact2 = ontransact;
                                                            iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy;
                                                            obj2 = obj;
                                                        }
                                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda11
                                                                private static int onExtraCallback = 0;
                                                                private static int onExtraCallbackWithResult = 1;

                                                                public final Object invoke(Object obj5, Object obj6) {
                                                                    int i66 = 2 % 2;
                                                                    int i67 = onExtraCallbackWithResult + 83;
                                                                    onExtraCallback = i67 % 128;
                                                                    int i68 = i67 % 2;
                                                                    Unit unitIAuthTabCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback(this.f$0, list, iAuthTabCallback, quirksExternalSyntheticBackport04, i33, i34, i35, z2, gethumanreadablename2, j5, j6, j7, f2, bindchildren2, useVar2, j8, graphicDeviceInfo2, onextracallbackwithresult2, ontransact2, iAuthTabCallbackStubProxy2, obj2, i4, i5, i6, i7, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                                                    int i69 = onExtraCallbackWithResult + 33;
                                                                    onExtraCallback = i69 % 128;
                                                                    if (i69 % 2 != 0) {
                                                                        int i70 = 98 / 0;
                                                                    }
                                                                    return unitIAuthTabCallback;
                                                                }
                                                            });
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    i20 |= i41;
                                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i8 & 306783379) == 306783378 && (306783379 & i20) == 306783378 && (i6 & 1) == 0) ? false : true, i8 & 1)) {
                                                    }
                                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                                    }
                                                }
                                                i32 = i7 & 524288;
                                                if (i32 == 0) {
                                                }
                                                i20 |= i41;
                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i8 & 306783379) == 306783378 && (306783379 & i20) == 306783378 && (i6 & 1) == 0) ? false : true, i8 & 1)) {
                                                }
                                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                                }
                                            }
                                            i31 = i7 & 262144;
                                            if (i31 != 0) {
                                            }
                                            i32 = i7 & 524288;
                                            if (i32 == 0) {
                                            }
                                            i20 |= i41;
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i8 & 306783379) == 306783378 && (306783379 & i20) == 306783378 && (i6 & 1) == 0) ? false : true, i8 & 1)) {
                                            }
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                            }
                                        }
                                        i29 = i28;
                                        i30 = i7 & 131072;
                                        if (i30 == 0) {
                                        }
                                        i31 = i7 & 262144;
                                        if (i31 != 0) {
                                        }
                                        i32 = i7 & 524288;
                                        if (i32 == 0) {
                                        }
                                        i20 |= i41;
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i8 & 306783379) == 306783378 && (306783379 & i20) == 306783378 && (i6 & 1) == 0) ? false : true, i8 & 1)) {
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                        }
                                    }
                                    i26 = i15;
                                    i27 = i7 & 32768;
                                    if (i27 != 0) {
                                    }
                                    i28 = 65536 & i7;
                                    if (i28 != 0) {
                                    }
                                    i29 = i28;
                                    i30 = i7 & 131072;
                                    if (i30 == 0) {
                                    }
                                    i31 = i7 & 262144;
                                    if (i31 != 0) {
                                    }
                                    i32 = i7 & 524288;
                                    if (i32 == 0) {
                                    }
                                    i20 |= i41;
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i8 & 306783379) == 306783378 && (306783379 & i20) == 306783378 && (i6 & 1) == 0) ? false : true, i8 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    }
                                }
                                i24 = i7 & 16384;
                                if (i24 == 0) {
                                }
                                i26 = i15;
                                i27 = i7 & 32768;
                                if (i27 != 0) {
                                }
                                i28 = 65536 & i7;
                                if (i28 != 0) {
                                }
                                i29 = i28;
                                i30 = i7 & 131072;
                                if (i30 == 0) {
                                }
                                i31 = i7 & 262144;
                                if (i31 != 0) {
                                }
                                i32 = i7 & 524288;
                                if (i32 == 0) {
                                }
                                i20 |= i41;
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i8 & 306783379) == 306783378 && (306783379 & i20) == 306783378 && (i6 & 1) == 0) ? false : true, i8 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                }
                            }
                            i23 = i7 & 8192;
                            if (i23 != 0) {
                            }
                            i24 = i7 & 16384;
                            if (i24 == 0) {
                            }
                            i26 = i15;
                            i27 = i7 & 32768;
                            if (i27 != 0) {
                            }
                            i28 = 65536 & i7;
                            if (i28 != 0) {
                            }
                            i29 = i28;
                            i30 = i7 & 131072;
                            if (i30 == 0) {
                            }
                            i31 = i7 & 262144;
                            if (i31 != 0) {
                            }
                            i32 = i7 & 524288;
                            if (i32 == 0) {
                            }
                            i20 |= i41;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i8 & 306783379) == 306783378 && (306783379 & i20) == 306783378 && (i6 & 1) == 0) ? false : true, i8 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i20 = i21;
                        i22 = i7 & 4096;
                        if (i22 == 0) {
                        }
                        i23 = i7 & 8192;
                        if (i23 != 0) {
                        }
                        i24 = i7 & 16384;
                        if (i24 == 0) {
                        }
                        i26 = i15;
                        i27 = i7 & 32768;
                        if (i27 != 0) {
                        }
                        i28 = 65536 & i7;
                        if (i28 != 0) {
                        }
                        i29 = i28;
                        i30 = i7 & 131072;
                        if (i30 == 0) {
                        }
                        i31 = i7 & 262144;
                        if (i31 != 0) {
                        }
                        i32 = i7 & 524288;
                        if (i32 == 0) {
                        }
                        i20 |= i41;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i8 & 306783379) == 306783378 && (306783379 & i20) == 306783378 && (i6 & 1) == 0) ? false : true, i8 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i12 = i7 & 64;
                    if (i12 != 0) {
                    }
                    if ((12582912 & i4) == 0) {
                    }
                    i14 = i7 & 256;
                    if (i14 != 0) {
                    }
                    i15 = i7 & 512;
                    if (i15 != 0) {
                    }
                    i16 = i7 & 1024;
                    if (i16 != 0) {
                    }
                    i19 = i7 & 2048;
                    if (i19 != 0) {
                    }
                    i20 = i21;
                    i22 = i7 & 4096;
                    if (i22 == 0) {
                    }
                    i23 = i7 & 8192;
                    if (i23 != 0) {
                    }
                    i24 = i7 & 16384;
                    if (i24 == 0) {
                    }
                    i26 = i15;
                    i27 = i7 & 32768;
                    if (i27 != 0) {
                    }
                    i28 = 65536 & i7;
                    if (i28 != 0) {
                    }
                    i29 = i28;
                    i30 = i7 & 131072;
                    if (i30 == 0) {
                    }
                    i31 = i7 & 262144;
                    if (i31 != 0) {
                    }
                    i32 = i7 & 524288;
                    if (i32 == 0) {
                    }
                    i20 |= i41;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i8 & 306783379) == 306783378 && (306783379 & i20) == 306783378 && (i6 & 1) == 0) ? false : true, i8 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i11 = i7 & 32;
                if (i11 == 0) {
                }
                i12 = i7 & 64;
                if (i12 != 0) {
                }
                if ((12582912 & i4) == 0) {
                }
                i14 = i7 & 256;
                if (i14 != 0) {
                }
                i15 = i7 & 512;
                if (i15 != 0) {
                }
                i16 = i7 & 1024;
                if (i16 != 0) {
                }
                i19 = i7 & 2048;
                if (i19 != 0) {
                }
                i20 = i21;
                i22 = i7 & 4096;
                if (i22 == 0) {
                }
                i23 = i7 & 8192;
                if (i23 != 0) {
                }
                i24 = i7 & 16384;
                if (i24 == 0) {
                }
                i26 = i15;
                i27 = i7 & 32768;
                if (i27 != 0) {
                }
                i28 = 65536 & i7;
                if (i28 != 0) {
                }
                i29 = i28;
                i30 = i7 & 131072;
                if (i30 == 0) {
                }
                i31 = i7 & 262144;
                if (i31 != 0) {
                }
                i32 = i7 & 524288;
                if (i32 == 0) {
                }
                i20 |= i41;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i8 & 306783379) == 306783378 && (306783379 & i20) == 306783378 && (i6 & 1) == 0) ? false : true, i8 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i10 = i7 & 16;
            if (i10 != 0) {
            }
            i11 = i7 & 32;
            if (i11 == 0) {
            }
            i12 = i7 & 64;
            if (i12 != 0) {
            }
            if ((12582912 & i4) == 0) {
            }
            i14 = i7 & 256;
            if (i14 != 0) {
            }
            i15 = i7 & 512;
            if (i15 != 0) {
            }
            i16 = i7 & 1024;
            if (i16 != 0) {
            }
            i19 = i7 & 2048;
            if (i19 != 0) {
            }
            i20 = i21;
            i22 = i7 & 4096;
            if (i22 == 0) {
            }
            i23 = i7 & 8192;
            if (i23 != 0) {
            }
            i24 = i7 & 16384;
            if (i24 == 0) {
            }
            i26 = i15;
            i27 = i7 & 32768;
            if (i27 != 0) {
            }
            i28 = 65536 & i7;
            if (i28 != 0) {
            }
            i29 = i28;
            i30 = i7 & 131072;
            if (i30 == 0) {
            }
            i31 = i7 & 262144;
            if (i31 != 0) {
            }
            i32 = i7 & 524288;
            if (i32 == 0) {
            }
            i20 |= i41;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i8 & 306783379) == 306783378 && (306783379 & i20) == 306783378 && (i6 & 1) == 0) ? false : true, i8 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i9 = i7 & 8;
        if (i9 == 0) {
        }
        i10 = i7 & 16;
        if (i10 != 0) {
        }
        i11 = i7 & 32;
        if (i11 == 0) {
        }
        i12 = i7 & 64;
        if (i12 != 0) {
        }
        if ((12582912 & i4) == 0) {
        }
        i14 = i7 & 256;
        if (i14 != 0) {
        }
        i15 = i7 & 512;
        if (i15 != 0) {
        }
        i16 = i7 & 1024;
        if (i16 != 0) {
        }
        i19 = i7 & 2048;
        if (i19 != 0) {
        }
        i20 = i21;
        i22 = i7 & 4096;
        if (i22 == 0) {
        }
        i23 = i7 & 8192;
        if (i23 != 0) {
        }
        i24 = i7 & 16384;
        if (i24 == 0) {
        }
        i26 = i15;
        i27 = i7 & 32768;
        if (i27 != 0) {
        }
        i28 = 65536 & i7;
        if (i28 != 0) {
        }
        i29 = i28;
        i30 = i7 & 131072;
        if (i30 == 0) {
        }
        i31 = i7 & 262144;
        if (i31 != 0) {
        }
        i32 = i7 & 524288;
        if (i32 == 0) {
        }
        i20 |= i41;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i8 & 306783379) == 306783378 && (306783379 & i20) == 306783378 && (i6 & 1) == 0) ? false : true, i8 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, boolean z, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable onTransact ontransact, @Nullable IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        int i5;
        getHumanReadableName gethumanreadablename2;
        use useVar2;
        GraphicDeviceInfo graphicDeviceInfo2;
        onExtraCallbackWithResult onextracallbackwithresult2;
        onTransact ontransact2;
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy2;
        onTransact ontransactIAuthTabCallback;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i4 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i4 & 8) != 0) {
            int i7 = IAuthTabCallback + 19;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            i5 = 0;
        } else {
            i5 = i;
        }
        boolean z2 = (i4 & 16) != 0 ? false : z;
        if ((i4 & 32) != 0) {
            getHumanReadableName gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
            int i9 = onExtraCallback + 69;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            gethumanreadablename2 = gethumanreadablename3;
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        long jOnTransact = (i4 & 64) != 0 ? setByteOrder.Companion.onTransact() : j;
        long jOnNavigationEvent = (i4 & 128) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        long jOnNavigationEvent2 = (i4 & 256) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
        float fOnExtraCallback = (i4 & 512) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
        bindChildren bindchildren2 = (i4 & 1024) != 0 ? null : bindchildren;
        if ((i4 & 2048) != 0) {
            int i11 = IAuthTabCallback + 119;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            useVar2 = null;
        } else {
            useVar2 = useVar;
        }
        long jOnNavigationEvent3 = (i4 & 4096) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
        if ((i4 & 8192) != 0) {
            int i13 = IAuthTabCallback + 101;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if ((i4 & 16384) != 0) {
            int i15 = IAuthTabCallback + 79;
            onExtraCallback = i15 % 128;
            int i16 = i15 % 2;
            onextracallbackwithresult2 = onExtraCallbackWithResult.TopLeft;
        } else {
            onextracallbackwithresult2 = onextracallbackwithresult;
        }
        if ((32768 & i4) != 0) {
            int i17 = IAuthTabCallback + 17;
            onExtraCallback = i17 % 128;
            if (i17 % 2 != 0) {
                ontransactIAuthTabCallback = onTransact.Companion.IAuthTabCallback();
                int i18 = 66 / 0;
            } else {
                ontransactIAuthTabCallback = onTransact.Companion.IAuthTabCallback();
            }
            ontransact2 = ontransactIAuthTabCallback;
        } else {
            ontransact2 = ontransact;
        }
        if ((65536 & i4) != 0) {
            int i19 = IAuthTabCallback + 17;
            onExtraCallback = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 22 / 0;
            }
            iAuthTabCallbackStubProxy2 = null;
        } else {
            iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy;
        }
        Object obj2 = (i4 & 131072) != 0 ? null : obj;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1200800857, i2, i3, "im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1.Infinite (TdsAnimateTextV1.kt:726)");
        }
        onNavigationEvent(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), iAuthTabCallbackStub, quirksExternalSyntheticBackport02, i5, z2, gethumanreadablename2, jOnTransact, jOnNavigationEvent, jOnNavigationEvent2, fOnExtraCallback, bindchildren2, useVar2, jOnNavigationEvent3, graphicDeviceInfo2, onextracallbackwithresult2, ontransact2, iAuthTabCallbackStubProxy2, obj2, cameraCaptureResultEmptyCameraCaptureResult, i2 & 2147483632, i3 & 268435454, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final getSupportedHighSpeedResolutionsFor onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        int i4 = onExtraCallback + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforOnWarmupCompleted;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $animated$delegate;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ IAuthTabCallbackStub $motion;
        final /* synthetic */ boolean $skipIntroMotion;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        final /* synthetic */ hasProvider $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, IAuthTabCallbackStub iAuthTabCallbackStub, int i, boolean z, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$text = hasprovider;
            this.$motion = iAuthTabCallbackStub;
            this.$initialDelay = i;
            this.$skipIntroMotion = z;
            this.$animated$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 98 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$state, this.$text, this.$motion, this.$initialDelay, this.$skipIntroMotion, this.$animated$delegate, access13800Var);
            int i2 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (!mExternalSyntheticApiModelOutline1.IAuthTabCallback(this.$animated$delegate)) {
                int i4 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                mExternalSyntheticLambda8.onNavigationEvent(this.$state, this.$text, this.$motion, (onTransact) null, this.$initialDelay, this.$skipIntroMotion, 4, (Object) null);
                mExternalSyntheticApiModelOutline1.onNavigationEvent(this.$animated$delegate, true);
                int i6 = onWarmupCompleted + 7;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ IAuthTabCallbackStub $motion;
        final /* synthetic */ boolean $skipIntroMotion;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        final /* synthetic */ hasProvider $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, IAuthTabCallbackStub iAuthTabCallbackStub, int i, boolean z, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$text = hasprovider;
            this.$motion = iAuthTabCallbackStub;
            this.$initialDelay = i;
            this.$skipIntroMotion = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$state, this.$text, this.$motion, this.$initialDelay, this.$skipIntroMotion, access13800Var);
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 99;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnExtraCallback;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                asbinderCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = asbinderCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 5;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 29;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 115;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 != 0) {
                mExternalSyntheticLambda8.onNavigationEvent(this.$state, this.$text, this.$motion, (onTransact) null, this.$initialDelay, this.$skipIntroMotion, 2, (Object) null);
            } else {
                mExternalSyntheticLambda8.onNavigationEvent(this.$state, this.$text, this.$motion, (onTransact) null, this.$initialDelay, this.$skipIntroMotion, 4, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit IAuthTabCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirkSettingsLoader quirkSettingsLoader, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0 ? (i & 3) == 2 : (i & 3) == 2) {
            z = false;
        } else {
            int i5 = i3 + 55;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = IAuthTabCallback + 59;
            onExtraCallback = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-69949915, i, -1, "im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1.Infinite.<anonymous> (TdsAnimateTextV1.kt:835)");
                int i8 = onExtraCallback + 69;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            mExternalSyntheticLambda7.onWarmupCompleted(440982441, JsParamKeys.onExtraCallbackWithResult(), -440982437, new Object[]{mexternalsyntheticlambda8, null, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, 0, 2}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i10 = IAuthTabCallback + 21;
                onExtraCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:347:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull final hasProvider hasprovider, @NotNull final IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, boolean z, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable onTransact ontransact, @Nullable IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i28;
        boolean z3;
        getHumanReadableName gethumanreadablename2;
        long j5;
        long j6;
        long j7;
        float f2;
        bindChildren bindchildren2;
        use useVar2;
        long j8;
        final GraphicDeviceInfo graphicDeviceInfo2;
        final onExtraCallbackWithResult onextracallbackwithresult2;
        final onTransact ontransact2;
        final IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy2;
        final Object obj2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i29;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z4;
        getHumanReadableName gethumanreadablename3;
        long jOnTransact;
        long jOnNavigationEvent;
        long jOnNavigationEvent2;
        bindChildren bindchildren3;
        use useVar3;
        long jOnNavigationEvent3;
        GraphicDeviceInfo graphicDeviceInfo3;
        onExtraCallbackWithResult onextracallbackwithresult3;
        onTransact ontransactIAuthTabCallback;
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy3;
        int i30;
        float f3;
        boolean z5;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i31;
        GraphicDeviceInfo graphicDeviceInfo4;
        onExtraCallbackWithResult onextracallbackwithresult4;
        onTransact ontransact3;
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy4;
        long j9;
        long j10;
        long j11;
        Object obj3;
        float f4;
        IAuthTabCallbackStub iAuthTabCallbackStub2;
        long j12;
        Integer numOnExtraCallbackWithResult;
        long j13;
        long j14;
        long j15;
        getHumanReadableName gethumanreadablename4;
        int i32;
        int i33 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-978490811);
        if ((i2 & 6) == 0) {
            i5 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider) ^ true) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub)) {
                int i34 = onExtraCallback + 17;
                IAuthTabCallback = i34 % 128;
                i32 = i34 % 2 == 0 ? 21 : 32;
            } else {
                i32 = 16;
            }
            i5 |= i32;
        }
        int i35 = i4 & 4;
        if (i35 != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    int i36 = onExtraCallback + 113;
                    IAuthTabCallback = i36 % 128;
                    int i37 = i36 % 2;
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 != 0) {
                    int i38 = IAuthTabCallback + 43;
                    onExtraCallback = i38 % 128;
                    i5 = i38 % 2 != 0 ? i5 | 13042 : i5 | 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 16384 : 8192;
                    }
                    if ((i2 & 196608) == 0) {
                        i5 |= ((i4 & 32) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename)) ? 131072 : 65536;
                    }
                    i8 = i4 & 64;
                    if (i8 == 0) {
                        i5 |= 1572864;
                    } else {
                        if ((i2 & 1572864) == 0) {
                            i9 = i35;
                            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 1048576 : 524288;
                        }
                        i10 = i4 & 128;
                        if (i10 != 0) {
                            int i39 = onExtraCallback + 7;
                            IAuthTabCallback = i39 % 128;
                            if (i39 % 2 == 0) {
                                i5 |= 12582912;
                                int i40 = 94 / 0;
                            } else {
                                i5 |= 12582912;
                            }
                        } else {
                            if ((i2 & 12582912) == 0) {
                                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 8388608 : 4194304;
                            }
                            i11 = i4 & 256;
                            if (i11 == 0) {
                                i5 |= 100663296;
                            } else if ((i2 & 100663296) == 0) {
                                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ? 67108864 : 33554432;
                            }
                            i12 = i4 & 512;
                            if (i12 == 0) {
                                i5 |= 805306368;
                            } else {
                                if ((805306368 & i2) == 0) {
                                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 536870912 : 268435456;
                                }
                                i13 = i4 & 1024;
                                if (i13 != 0) {
                                    i14 = i3 | 6;
                                } else if ((i3 & 6) == 0) {
                                    i14 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bindchildren) ? 4 : 2);
                                } else {
                                    i14 = i3;
                                }
                                i15 = i4 & 2048;
                                if (i15 != 0) {
                                    i14 |= 48;
                                } else if ((i3 & 48) == 0) {
                                    i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(useVar) ? 32 : 16;
                                }
                                int i41 = i14;
                                i16 = i4 & 4096;
                                if (i16 != 0) {
                                    i41 |= 384;
                                } else {
                                    if ((i3 & 384) == 0) {
                                        i41 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j4) ? 256 : 128;
                                    }
                                    i17 = i4 & 8192;
                                    if (i17 == 0) {
                                        i41 |= 3072;
                                    } else {
                                        if ((i3 & 3072) == 0) {
                                            i41 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 2048 : 1024;
                                        }
                                        i18 = i4 & 16384;
                                        if (i18 != 0) {
                                            i41 |= 24576;
                                            i20 = i17;
                                            i19 = i18;
                                        } else {
                                            i19 = i18;
                                            if ((i3 & 24576) == 0) {
                                                i20 = i17;
                                                i41 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal()) ^ true) ? 16384 : 8192;
                                            } else {
                                                i20 = i17;
                                            }
                                        }
                                        i21 = 32768 & i4;
                                        if (i21 != 0) {
                                            i41 |= 196608;
                                        } else {
                                            if ((i3 & 196608) == 0) {
                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(ontransact)) {
                                                    int i42 = IAuthTabCallback + 81;
                                                    i22 = i21;
                                                    onExtraCallback = i42 % 128;
                                                    int i43 = i42 % 2;
                                                    i23 = 131072;
                                                } else {
                                                    i22 = i21;
                                                    i23 = 65536;
                                                }
                                                i24 = i23 | i41;
                                            }
                                            i25 = 65536 & i4;
                                            if (i25 != 0) {
                                                if ((i3 & 1572864) == 0) {
                                                    int i44 = IAuthTabCallback + 99;
                                                    i26 = i25;
                                                    onExtraCallback = i44 % 128;
                                                    if (i44 % 2 != 0) {
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStubProxy);
                                                        throw null;
                                                    }
                                                    i24 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStubProxy) ? 1048576 : 524288;
                                                }
                                                i27 = 131072 & i4;
                                                if (i27 != 0) {
                                                    i24 |= 12582912;
                                                } else if ((i3 & 12582912) == 0) {
                                                    i24 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj) ? 8388608 : 4194304;
                                                }
                                                if ((i5 & 306783379) == 306783378) {
                                                    int i45 = onExtraCallback + 47;
                                                    IAuthTabCallback = i45 % 128;
                                                    int i46 = i45 % 2;
                                                    z2 = (4793491 & i24) != 4793490;
                                                }
                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i5 & 1)) {
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                                    if ((i2 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i9 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                                        i29 = i6 != 0 ? 0 : i;
                                                        if (i7 != 0) {
                                                            int i47 = IAuthTabCallback + 53;
                                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                            onExtraCallback = i47 % 128;
                                                            int i48 = i47 % 2;
                                                            z4 = false;
                                                        } else {
                                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                            z4 = z;
                                                        }
                                                        if ((i4 & 32) != 0) {
                                                            gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                                            i5 &= -458753;
                                                        } else {
                                                            gethumanreadablename3 = gethumanreadablename;
                                                        }
                                                        jOnTransact = i8 != 0 ? setByteOrder.Companion.onTransact() : j;
                                                        jOnNavigationEvent = i10 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
                                                        jOnNavigationEvent2 = i11 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
                                                        float fOnExtraCallback = i12 != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
                                                        bindchildren3 = i13 != 0 ? null : bindchildren;
                                                        useVar3 = i15 != 0 ? null : useVar;
                                                        jOnNavigationEvent3 = i16 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
                                                        graphicDeviceInfo3 = i20 != 0 ? null : graphicDeviceInfo;
                                                        onextracallbackwithresult3 = i19 != 0 ? onExtraCallbackWithResult.TopLeft : onextracallbackwithresult;
                                                        ontransactIAuthTabCallback = i22 != 0 ? onTransact.Companion.IAuthTabCallback() : ontransact;
                                                        iAuthTabCallbackStubProxy3 = i26 != 0 ? null : iAuthTabCallbackStubProxy;
                                                        if (i27 != 0) {
                                                            i31 = i5;
                                                            bindchildren2 = bindchildren3;
                                                            useVar2 = useVar3;
                                                            j8 = jOnNavigationEvent3;
                                                            graphicDeviceInfo4 = graphicDeviceInfo3;
                                                            onextracallbackwithresult4 = onextracallbackwithresult3;
                                                            ontransact3 = ontransactIAuthTabCallback;
                                                            iAuthTabCallbackStubProxy4 = iAuthTabCallbackStubProxy3;
                                                            j9 = jOnTransact;
                                                            j10 = jOnNavigationEvent;
                                                            j11 = jOnNavigationEvent2;
                                                            obj3 = null;
                                                            f4 = fOnExtraCallback;
                                                            z5 = z4;
                                                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                int i49 = IAuthTabCallback + 125;
                                                                onExtraCallback = i49 % 128;
                                                                int i50 = i49 % 2;
                                                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-978490811, i31, i24, "im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1.Infinite (TdsAnimateTextV1.kt:769)");
                                                            }
                                                            if (j9 == 16) {
                                                                int i51 = IAuthTabCallback + 97;
                                                                onExtraCallback = i51 % 128;
                                                                int i52 = i51 % 2;
                                                                iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                                                                j12 = j9;
                                                                j13 = j12;
                                                            } else {
                                                                iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                                                                j12 = j9;
                                                                long jOnExtraCallback = ((iAuthTabCallbackStub2 instanceof onExtraCallback) && (numOnExtraCallbackWithResult = ((onExtraCallback) iAuthTabCallbackStub2).onExtraCallbackWithResult()) != null) ? ByteOrderedDataOutputStream.onExtraCallback(numOnExtraCallbackWithResult.intValue()) : setByteOrder.Companion.onTransact();
                                                                j13 = jOnExtraCallback;
                                                            }
                                                            int i53 = i24 >> 9;
                                                            int i54 = i24 << 3;
                                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                                                            final mExternalSyntheticLambda8 mexternalsyntheticlambda8OnNavigationEvent = mExternalSyntheticLambda5.onNavigationEvent("", obj3, ontransact3, iAuthTabCallbackStubProxy4, null, gethumanreadablename3, j13, j10, j11, createCameraCaptureCallback.onExtraCallback(mExternalSyntheticLambda7.onExtraCallbackWithResult(onextracallbackwithresult4)), f4, bindchildren2, useVar2, j8, graphicDeviceInfo4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i53 & 896) | ((i24 >> 18) & 112) | 6 | (i53 & 7168) | (458752 & i31) | (29360128 & i31) | (234881024 & i31), ((i31 >> 27) & 14) | (i54 & 112) | (i54 & 896) | (i54 & 7168) | (i54 & 57344), 16);
                                                            if (obj3 == null) {
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-275061952);
                                                                Object[] objArr = {obj3, mexternalsyntheticlambda8OnNavigationEvent, hasprovider, iAuthTabCallbackStub, Integer.valueOf(i29), Boolean.valueOf(z5)};
                                                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                                                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                                                    objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda3
                                                                        private static int IAuthTabCallback = 1;
                                                                        private static int onExtraCallbackWithResult;

                                                                        public final Object invoke() {
                                                                            int i55 = 2 % 2;
                                                                            int i56 = onExtraCallbackWithResult + 65;
                                                                            IAuthTabCallback = i56 % 128;
                                                                            if (i56 % 2 != 0) {
                                                                                return mExternalSyntheticApiModelOutline1.onNavigationEvent();
                                                                            }
                                                                            mExternalSyntheticApiModelOutline1.onNavigationEvent();
                                                                            Object obj4 = null;
                                                                            obj4.hashCode();
                                                                            throw null;
                                                                        }
                                                                    };
                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                                                }
                                                                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                                                                Unit unit = Unit.INSTANCE;
                                                                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                                                                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mexternalsyntheticlambda8OnNavigationEvent);
                                                                j14 = j10;
                                                                boolean z6 = (i31 & 14) == 4;
                                                                j15 = j11;
                                                                boolean z7 = (i31 & 112) == 32;
                                                                gethumanreadablename4 = gethumanreadablename3;
                                                                boolean z8 = (i31 & 7168) == 2048;
                                                                boolean z9 = (i31 & 57344) == 16384;
                                                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                if ((z6 | zOnNavigationEvent | zOnNavigationEvent2 | z7 | z8 | z9) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                                                    objOnMinimized2 = new onNavigationEvent(mexternalsyntheticlambda8OnNavigationEvent, hasprovider, iAuthTabCallbackStub, i29, z5, getsupportedhighspeedresolutionsfor, null);
                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                                                }
                                                                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                            } else {
                                                                j14 = j10;
                                                                j15 = j11;
                                                                gethumanreadablename4 = gethumanreadablename3;
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-274402644);
                                                                Object[] objArr2 = {mexternalsyntheticlambda8OnNavigationEvent, hasprovider, iAuthTabCallbackStub2, Integer.valueOf(i29), Boolean.valueOf(z5)};
                                                                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mexternalsyntheticlambda8OnNavigationEvent);
                                                                boolean z10 = (i31 & 14) == 4;
                                                                boolean z11 = (i31 & 112) == 32;
                                                                boolean z12 = (i31 & 7168) == 2048;
                                                                boolean z13 = (i31 & 57344) == 16384;
                                                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                if ((zOnNavigationEvent3 | z10 | z11 | z12 | z13) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                                    objOnMinimized3 = new asBinder(mexternalsyntheticlambda8OnNavigationEvent, hasprovider, iAuthTabCallbackStub, i29, z5, null);
                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                                                }
                                                                isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr2, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                            }
                                                            final QuirkSettingsLoader quirkSettingsLoaderOnNavigationEvent = mExternalSyntheticLambda7.onNavigationEvent(onextracallbackwithresult4);
                                                            mExternalSyntheticLambda7.onWarmupCompleted(-422700871, JsParamKeys.onExtraCallbackWithResult(), 422700876, new Object[]{ontransact3, mexternalsyntheticlambda8OnNavigationEvent, CollectionsKt.listOf(hasprovider), quirkSettingsLoaderOnNavigationEvent, quirksExternalSyntheticBackport06, ForwardingCameraControl.onExtraCallback(-69949915, true, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda4
                                                                private static int IAuthTabCallback = 0;
                                                                private static int onExtraCallback = 1;

                                                                public final Object invoke(Object obj4, Object obj5) {
                                                                    int i55 = 2 % 2;
                                                                    int i56 = onExtraCallback + 67;
                                                                    IAuthTabCallback = i56 % 128;
                                                                    if (i56 % 2 != 0) {
                                                                        mExternalSyntheticApiModelOutline1.onNavigationEvent(mexternalsyntheticlambda8OnNavigationEvent, quirkSettingsLoaderOnNavigationEvent, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                                                        Object obj6 = null;
                                                                        obj6.hashCode();
                                                                        throw null;
                                                                    }
                                                                    Unit unitOnNavigationEvent = mExternalSyntheticApiModelOutline1.onNavigationEvent(mexternalsyntheticlambda8OnNavigationEvent, quirkSettingsLoaderOnNavigationEvent, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                                                    int i57 = IAuthTabCallback + 27;
                                                                    onExtraCallback = i57 % 128;
                                                                    int i58 = i57 % 2;
                                                                    return unitOnNavigationEvent;
                                                                }
                                                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i24 >> 15) & 14) | 196608 | ((i31 << 6) & 57344))}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                                            }
                                                            j5 = j12;
                                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
                                                            j7 = j15;
                                                            gethumanreadablename2 = gethumanreadablename4;
                                                            z3 = z5;
                                                            i28 = i29;
                                                            f2 = f4;
                                                            graphicDeviceInfo2 = graphicDeviceInfo4;
                                                            onextracallbackwithresult2 = onextracallbackwithresult4;
                                                            ontransact2 = ontransact3;
                                                            iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy4;
                                                            obj2 = obj3;
                                                            j6 = j14;
                                                        } else {
                                                            i30 = i5;
                                                            f3 = fOnExtraCallback;
                                                            z5 = z4;
                                                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                        }
                                                    } else {
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                        if ((i4 & 32) != 0) {
                                                            i5 &= -458753;
                                                        }
                                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                                        i29 = i;
                                                        z5 = z;
                                                        gethumanreadablename3 = gethumanreadablename;
                                                        jOnTransact = j;
                                                        jOnNavigationEvent = j2;
                                                        jOnNavigationEvent2 = j3;
                                                        bindchildren3 = bindchildren;
                                                        useVar3 = useVar;
                                                        jOnNavigationEvent3 = j4;
                                                        graphicDeviceInfo3 = graphicDeviceInfo;
                                                        onextracallbackwithresult3 = onextracallbackwithresult;
                                                        ontransactIAuthTabCallback = ontransact;
                                                        iAuthTabCallbackStubProxy3 = iAuthTabCallbackStubProxy;
                                                        i30 = i5;
                                                        f3 = f;
                                                    }
                                                    obj3 = obj;
                                                    bindchildren2 = bindchildren3;
                                                    useVar2 = useVar3;
                                                    j8 = jOnNavigationEvent3;
                                                    i31 = i30;
                                                    graphicDeviceInfo4 = graphicDeviceInfo3;
                                                    onextracallbackwithresult4 = onextracallbackwithresult3;
                                                    ontransact3 = ontransactIAuthTabCallback;
                                                    iAuthTabCallbackStubProxy4 = iAuthTabCallbackStubProxy3;
                                                    j10 = jOnNavigationEvent;
                                                    j11 = jOnNavigationEvent2;
                                                    f4 = f3;
                                                    j9 = jOnTransact;
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    }
                                                    if (j9 == 16) {
                                                    }
                                                    int i532 = i24 >> 9;
                                                    int i542 = i24 << 3;
                                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport062 = quirksExternalSyntheticBackport04;
                                                    final mExternalSyntheticLambda8 mexternalsyntheticlambda8OnNavigationEvent2 = mExternalSyntheticLambda5.onNavigationEvent("", obj3, ontransact3, iAuthTabCallbackStubProxy4, null, gethumanreadablename3, j13, j10, j11, createCameraCaptureCallback.onExtraCallback(mExternalSyntheticLambda7.onExtraCallbackWithResult(onextracallbackwithresult4)), f4, bindchildren2, useVar2, j8, graphicDeviceInfo4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i532 & 896) | ((i24 >> 18) & 112) | 6 | (i532 & 7168) | (458752 & i31) | (29360128 & i31) | (234881024 & i31), ((i31 >> 27) & 14) | (i542 & 112) | (i542 & 896) | (i542 & 7168) | (i542 & 57344), 16);
                                                    if (obj3 == null) {
                                                    }
                                                    final QuirkSettingsLoader quirkSettingsLoaderOnNavigationEvent2 = mExternalSyntheticLambda7.onNavigationEvent(onextracallbackwithresult4);
                                                    mExternalSyntheticLambda7.onWarmupCompleted(-422700871, JsParamKeys.onExtraCallbackWithResult(), 422700876, new Object[]{ontransact3, mexternalsyntheticlambda8OnNavigationEvent2, CollectionsKt.listOf(hasprovider), quirkSettingsLoaderOnNavigationEvent2, quirksExternalSyntheticBackport062, ForwardingCameraControl.onExtraCallback(-69949915, true, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda4
                                                        private static int IAuthTabCallback = 0;
                                                        private static int onExtraCallback = 1;

                                                        public final Object invoke(Object obj4, Object obj5) {
                                                            int i55 = 2 % 2;
                                                            int i56 = onExtraCallback + 67;
                                                            IAuthTabCallback = i56 % 128;
                                                            if (i56 % 2 != 0) {
                                                                mExternalSyntheticApiModelOutline1.onNavigationEvent(mexternalsyntheticlambda8OnNavigationEvent2, quirkSettingsLoaderOnNavigationEvent2, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                                                Object obj6 = null;
                                                                obj6.hashCode();
                                                                throw null;
                                                            }
                                                            Unit unitOnNavigationEvent = mExternalSyntheticApiModelOutline1.onNavigationEvent(mexternalsyntheticlambda8OnNavigationEvent2, quirkSettingsLoaderOnNavigationEvent2, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                                            int i57 = IAuthTabCallback + 27;
                                                            onExtraCallback = i57 % 128;
                                                            int i58 = i57 % 2;
                                                            return unitOnNavigationEvent;
                                                        }
                                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i24 >> 15) & 14) | 196608 | ((i31 << 6) & 57344))}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    }
                                                    j5 = j12;
                                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport062;
                                                    j7 = j15;
                                                    gethumanreadablename2 = gethumanreadablename4;
                                                    z3 = z5;
                                                    i28 = i29;
                                                    f2 = f4;
                                                    graphicDeviceInfo2 = graphicDeviceInfo4;
                                                    onextracallbackwithresult2 = onextracallbackwithresult4;
                                                    ontransact2 = ontransact3;
                                                    iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy4;
                                                    obj2 = obj3;
                                                    j6 = j14;
                                                } else {
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                                    i28 = i;
                                                    z3 = z;
                                                    gethumanreadablename2 = gethumanreadablename;
                                                    j5 = j;
                                                    j6 = j2;
                                                    j7 = j3;
                                                    f2 = f;
                                                    bindchildren2 = bindchildren;
                                                    useVar2 = useVar;
                                                    j8 = j4;
                                                    graphicDeviceInfo2 = graphicDeviceInfo;
                                                    onextracallbackwithresult2 = onextracallbackwithresult;
                                                    ontransact2 = ontransact;
                                                    iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy;
                                                    obj2 = obj;
                                                }
                                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport02;
                                                    final int i55 = i28;
                                                    final boolean z14 = z3;
                                                    final getHumanReadableName gethumanreadablename5 = gethumanreadablename2;
                                                    final long j16 = j5;
                                                    final long j17 = j6;
                                                    final long j18 = j7;
                                                    final float f5 = f2;
                                                    final bindChildren bindchildren4 = bindchildren2;
                                                    final use useVar4 = useVar2;
                                                    final long j19 = j8;
                                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$$ExternalSyntheticLambda5
                                                        private static int IAuthTabCallback = 1;
                                                        private static int onExtraCallback;

                                                        public final Object invoke(Object obj4, Object obj5) {
                                                            int i56 = 2 % 2;
                                                            int i57 = onExtraCallback + 63;
                                                            IAuthTabCallback = i57 % 128;
                                                            int i58 = i57 % 2;
                                                            Unit unitOnNavigationEvent = mExternalSyntheticApiModelOutline1.onNavigationEvent(this.f$0, hasprovider, iAuthTabCallbackStub, quirksExternalSyntheticBackport07, i55, z14, gethumanreadablename5, j16, j17, j18, f5, bindchildren4, useVar4, j19, graphicDeviceInfo2, onextracallbackwithresult2, ontransact2, iAuthTabCallbackStubProxy2, obj2, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                                            int i59 = onExtraCallback + 119;
                                                            IAuthTabCallback = i59 % 128;
                                                            if (i59 % 2 != 0) {
                                                                return unitOnNavigationEvent;
                                                            }
                                                            Object obj6 = null;
                                                            obj6.hashCode();
                                                            throw null;
                                                        }
                                                    });
                                                    return;
                                                }
                                                return;
                                            }
                                            i24 |= 1572864;
                                            i26 = i25;
                                            i27 = 131072 & i4;
                                            if (i27 != 0) {
                                            }
                                            if ((i5 & 306783379) == 306783378) {
                                            }
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i5 & 1)) {
                                            }
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                            }
                                        }
                                        i22 = i21;
                                        i24 = i41;
                                        i25 = 65536 & i4;
                                        if (i25 != 0) {
                                        }
                                        i26 = i25;
                                        i27 = 131072 & i4;
                                        if (i27 != 0) {
                                        }
                                        if ((i5 & 306783379) == 306783378) {
                                        }
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i5 & 1)) {
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                        }
                                    }
                                    i18 = i4 & 16384;
                                    if (i18 != 0) {
                                    }
                                    i21 = 32768 & i4;
                                    if (i21 != 0) {
                                    }
                                    i22 = i21;
                                    i24 = i41;
                                    i25 = 65536 & i4;
                                    if (i25 != 0) {
                                    }
                                    i26 = i25;
                                    i27 = 131072 & i4;
                                    if (i27 != 0) {
                                    }
                                    if ((i5 & 306783379) == 306783378) {
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i5 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    }
                                }
                                i17 = i4 & 8192;
                                if (i17 == 0) {
                                }
                                i18 = i4 & 16384;
                                if (i18 != 0) {
                                }
                                i21 = 32768 & i4;
                                if (i21 != 0) {
                                }
                                i22 = i21;
                                i24 = i41;
                                i25 = 65536 & i4;
                                if (i25 != 0) {
                                }
                                i26 = i25;
                                i27 = 131072 & i4;
                                if (i27 != 0) {
                                }
                                if ((i5 & 306783379) == 306783378) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i5 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                }
                            }
                            i13 = i4 & 1024;
                            if (i13 != 0) {
                            }
                            i15 = i4 & 2048;
                            if (i15 != 0) {
                            }
                            int i412 = i14;
                            i16 = i4 & 4096;
                            if (i16 != 0) {
                            }
                            i17 = i4 & 8192;
                            if (i17 == 0) {
                            }
                            i18 = i4 & 16384;
                            if (i18 != 0) {
                            }
                            i21 = 32768 & i4;
                            if (i21 != 0) {
                            }
                            i22 = i21;
                            i24 = i412;
                            i25 = 65536 & i4;
                            if (i25 != 0) {
                            }
                            i26 = i25;
                            i27 = 131072 & i4;
                            if (i27 != 0) {
                            }
                            if ((i5 & 306783379) == 306783378) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i5 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i11 = i4 & 256;
                        if (i11 == 0) {
                        }
                        i12 = i4 & 512;
                        if (i12 == 0) {
                        }
                        i13 = i4 & 1024;
                        if (i13 != 0) {
                        }
                        i15 = i4 & 2048;
                        if (i15 != 0) {
                        }
                        int i4122 = i14;
                        i16 = i4 & 4096;
                        if (i16 != 0) {
                        }
                        i17 = i4 & 8192;
                        if (i17 == 0) {
                        }
                        i18 = i4 & 16384;
                        if (i18 != 0) {
                        }
                        i21 = 32768 & i4;
                        if (i21 != 0) {
                        }
                        i22 = i21;
                        i24 = i4122;
                        i25 = 65536 & i4;
                        if (i25 != 0) {
                        }
                        i26 = i25;
                        i27 = 131072 & i4;
                        if (i27 != 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i5 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i9 = i35;
                    i10 = i4 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                    }
                    i12 = i4 & 512;
                    if (i12 == 0) {
                    }
                    i13 = i4 & 1024;
                    if (i13 != 0) {
                    }
                    i15 = i4 & 2048;
                    if (i15 != 0) {
                    }
                    int i41222 = i14;
                    i16 = i4 & 4096;
                    if (i16 != 0) {
                    }
                    i17 = i4 & 8192;
                    if (i17 == 0) {
                    }
                    i18 = i4 & 16384;
                    if (i18 != 0) {
                    }
                    i21 = 32768 & i4;
                    if (i21 != 0) {
                    }
                    i22 = i21;
                    i24 = i41222;
                    i25 = 65536 & i4;
                    if (i25 != 0) {
                    }
                    i26 = i25;
                    i27 = 131072 & i4;
                    if (i27 != 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i5 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                if ((i2 & 196608) == 0) {
                }
                i8 = i4 & 64;
                if (i8 == 0) {
                }
                i9 = i35;
                i10 = i4 & 128;
                if (i10 != 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i4 & 512;
                if (i12 == 0) {
                }
                i13 = i4 & 1024;
                if (i13 != 0) {
                }
                i15 = i4 & 2048;
                if (i15 != 0) {
                }
                int i412222 = i14;
                i16 = i4 & 4096;
                if (i16 != 0) {
                }
                i17 = i4 & 8192;
                if (i17 == 0) {
                }
                i18 = i4 & 16384;
                if (i18 != 0) {
                }
                i21 = 32768 & i4;
                if (i21 != 0) {
                }
                i22 = i21;
                i24 = i412222;
                i25 = 65536 & i4;
                if (i25 != 0) {
                }
                i26 = i25;
                i27 = 131072 & i4;
                if (i27 != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i5 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            i8 = i4 & 64;
            if (i8 == 0) {
            }
            i9 = i35;
            i10 = i4 & 128;
            if (i10 != 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i4 & 512;
            if (i12 == 0) {
            }
            i13 = i4 & 1024;
            if (i13 != 0) {
            }
            i15 = i4 & 2048;
            if (i15 != 0) {
            }
            int i4122222 = i14;
            i16 = i4 & 4096;
            if (i16 != 0) {
            }
            i17 = i4 & 8192;
            if (i17 == 0) {
            }
            i18 = i4 & 16384;
            if (i18 != 0) {
            }
            i21 = 32768 & i4;
            if (i21 != 0) {
            }
            i22 = i21;
            i24 = i4122222;
            i25 = 65536 & i4;
            if (i25 != 0) {
            }
            i26 = i25;
            i27 = 131072 & i4;
            if (i27 != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i5 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        i8 = i4 & 64;
        if (i8 == 0) {
        }
        i9 = i35;
        i10 = i4 & 128;
        if (i10 != 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i4 & 512;
        if (i12 == 0) {
        }
        i13 = i4 & 1024;
        if (i13 != 0) {
        }
        i15 = i4 & 2048;
        if (i15 != 0) {
        }
        int i41222222 = i14;
        i16 = i4 & 4096;
        if (i16 != 0) {
        }
        i17 = i4 & 8192;
        if (i17 == 0) {
        }
        i18 = i4 & 16384;
        if (i18 != 0) {
        }
        i21 = 32768 & i4;
        if (i21 != 0) {
        }
        i22 = i21;
        i24 = i41222222;
        i25 = 65536 & i4;
        if (i25 != 0) {
        }
        i26 = i25;
        i27 = 131072 & i4;
        if (i27 != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i5 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public interface onTransact {
        public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.onExtraCallbackWithResult;

        onNavigationEvent IAuthTabCallback(@NotNull List<SurfaceProcessorNodeOut> list, int i);

        public static final class onExtraCallbackWithResult {
            private static int IAuthTabCallbackStub = 0;
            private static int asBinder = 1;
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            static final /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
            private static final onTransact IAuthTabCallback = new onNavigationEvent();
            private static final onTransact onWarmupCompleted = new IAuthTabCallback();

            private onExtraCallbackWithResult() {
            }

            public static final class onNavigationEvent implements onTransact {
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                onNavigationEvent() {
                }

                @Override // o.mExternalSyntheticApiModelOutline1.onTransact
                public onNavigationEvent IAuthTabCallback(List<SurfaceProcessorNodeOut> list, int i) {
                    int i2 = 2 % 2;
                    Intrinsics.checkNotNullParameter(list, "");
                    int size = list.size();
                    boolean z = false;
                    int i3 = 0;
                    int iMax = 0;
                    int iMax2 = 0;
                    while (true) {
                        DefaultConstructorMarker defaultConstructorMarker = null;
                        if (i3 >= size) {
                            return new onNavigationEvent(ExtensionsManager1.onWarmupCompleted((iMax << 32) | (iMax2 & 4294967295L)), z, defaultConstructorMarker);
                        }
                        int i4 = IAuthTabCallback + 21;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0) {
                            list.get(i3);
                            defaultConstructorMarker.hashCode();
                            throw null;
                        }
                        SurfaceProcessorNodeOut surfaceProcessorNodeOut = list.get(i3);
                        if (surfaceProcessorNodeOut != null) {
                            long jAsBinder = surfaceProcessorNodeOut.asBinder();
                            iMax = Math.max(iMax, (int) (jAsBinder >> 32));
                            iMax2 = Math.max(iMax2, (int) (4294967295L & jAsBinder));
                        }
                        i3++;
                        int i5 = IAuthTabCallback + 77;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
            }

            static {
                int i = onExtraCallback + 71;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onTransact IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 119;
                int i3 = i2 % 128;
                asBinder = i3;
                int i4 = i2 % 2;
                onTransact ontransact = IAuthTabCallback;
                int i5 = i3 + 53;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    return ontransact;
                }
                throw null;
            }

            public static final class IAuthTabCallback implements onTransact {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                IAuthTabCallback() {
                }

                @Override // o.mExternalSyntheticApiModelOutline1.onTransact
                public onNavigationEvent IAuthTabCallback(List<SurfaceProcessorNodeOut> list, int i) {
                    long jOnNavigationEvent;
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 35;
                    onNavigationEvent = i3 % 128;
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    if (i3 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(list, "");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(list, "");
                    SurfaceProcessorNodeOut surfaceProcessorNodeOut = (SurfaceProcessorNodeOut) CollectionsKt.getOrNull(list, i);
                    if (surfaceProcessorNodeOut != null) {
                        jOnNavigationEvent = surfaceProcessorNodeOut.asBinder();
                    } else {
                        jOnNavigationEvent = ExtensionsManager1.Companion.onNavigationEvent();
                        int i4 = onNavigationEvent + 87;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    return new onNavigationEvent(jOnNavigationEvent, true, defaultConstructorMarker);
                }
            }

            public final onTransact onExtraCallback() {
                int i = 2 % 2;
                int i2 = asBinder + 45;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                onTransact ontransact = onWarmupCompleted;
                int i4 = i3 + 9;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 81 / 0;
                }
                return ontransact;
            }
        }

        public static final class onNavigationEvent {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            private final long onExtraCallbackWithResult;
            private final boolean onNavigationEvent;

            public /* synthetic */ onNavigationEvent(long j, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, z);
            }

            public final boolean IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 95;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                boolean z = this.onNavigationEvent;
                int i5 = i2 + 57;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return z;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 47;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onNavigationEvent)) {
                    return false;
                }
                onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
                if (!ExtensionsManager1.IAuthTabCallback(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult)) {
                    int i3 = onExtraCallback + 59;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 77 / 0;
                    }
                    return false;
                }
                if (this.onNavigationEvent != onnavigationevent.onNavigationEvent) {
                    int i5 = onExtraCallback + 59;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                int i7 = IAuthTabCallback + 125;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 69 / 0;
                }
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 63;
                onExtraCallback = i2 % 128;
                int iIAuthTabCallback = i2 % 2 != 0 ? (ExtensionsManager1.IAuthTabCallback(this.onExtraCallbackWithResult) / 123) * Boolean.hashCode(this.onNavigationEvent) : (ExtensionsManager1.IAuthTabCallback(this.onExtraCallbackWithResult) * 31) + Boolean.hashCode(this.onNavigationEvent);
                int i3 = onExtraCallback + 89;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return iIAuthTabCallback;
            }

            public final long onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 79;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onExtraCallbackWithResult;
                }
                int i3 = 82 / 0;
                return this.onExtraCallbackWithResult;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "MeasureResult(size=" + ExtensionsManager1.onTransact(this.onExtraCallbackWithResult) + ", animate=" + this.onNavigationEvent + ")";
                int i2 = onExtraCallback + 39;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 68 / 0;
                }
                return str;
            }

            private onNavigationEvent(long j, boolean z) {
                this.onExtraCallbackWithResult = j;
                this.onNavigationEvent = z;
            }

            public final long onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onExtraCallbackWithResult TopLeft = new onExtraCallbackWithResult("TopLeft", 0);
        public static final onExtraCallbackWithResult TopCenter = new onExtraCallbackWithResult("TopCenter", 1);
        public static final onExtraCallbackWithResult Center = new onExtraCallbackWithResult("Center", 2);
        public static final onExtraCallbackWithResult CenterLeft = new onExtraCallbackWithResult("CenterLeft", 3);
        public static final onExtraCallbackWithResult CenterRight = new onExtraCallbackWithResult("CenterRight", 4);

        public static final /* synthetic */ class onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            public static final /* synthetic */ int[] onWarmupCompleted;

            static {
                int[] iArr = new int[onExtraCallbackWithResult.values().length];
                try {
                    iArr[onExtraCallbackWithResult.TopLeft.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[onExtraCallbackWithResult.TopCenter.ordinal()] = 2;
                    int i = 2 % 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[onExtraCallbackWithResult.Center.ordinal()] = 3;
                    int i2 = onNavigationEvent + 11;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[onExtraCallbackWithResult.CenterLeft.ordinal()] = 4;
                    int i4 = 2 % 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[onExtraCallbackWithResult.CenterRight.ordinal()] = 5;
                    int i5 = onNavigationEvent + 43;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                } catch (NoSuchFieldError unused5) {
                }
                onWarmupCompleted = iArr;
            }
        }

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {TopLeft, TopCenter, Center, CenterLeft, CenterRight};
            int i5 = i2 + 43;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 51 / 0;
            }
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 27;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i4 = i2 + 29;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return enumEntries;
            }
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 != 0) {
                return onextracallbackwithresult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onExtraCallback + 25;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackwithresultArr;
            }
            throw null;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallbackWithResult + 73;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Pair<QuirkSettingsLoader, createCameraCaptureCallback> resolve() throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = onWarmupCompleted.onWarmupCompleted[ordinal()];
            if (i4 == 1) {
                return getWrite.IAuthTabCallback(QuirkSettingsLoader.Companion.access100(), createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.onTransact()));
            }
            if (i4 == 2) {
                return getWrite.IAuthTabCallback(QuirkSettingsLoader.Companion.IAuthTabCallback_Parcel(), createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()));
            }
            if (i4 != 3) {
                int i5 = onWarmupCompleted + 91;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0 ? i4 == 4 : i4 == 3) {
                    return getWrite.IAuthTabCallback(QuirkSettingsLoader.Companion.asInterface(), createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.onTransact()));
                }
                if (i4 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return getWrite.IAuthTabCallback(QuirkSettingsLoader.Companion.IAuthTabCallbackStub(), createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.onExtraCallback()));
            }
            return getWrite.IAuthTabCallback(QuirkSettingsLoader.Companion.onExtraCallback(), createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallbackDefault {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallbackDefault[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final IAuthTabCallbackDefault Char = new IAuthTabCallbackDefault("Char", 0);
        public static final IAuthTabCallbackDefault Line = new IAuthTabCallbackDefault("Line", 1);
        public static final IAuthTabCallbackDefault Word = new IAuthTabCallbackDefault("Word", 2);
        public static final IAuthTabCallbackDefault None = new IAuthTabCallbackDefault("None", 3);

        private static final /* synthetic */ IAuthTabCallbackDefault[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = Char;
            if (i3 != 0) {
                return new IAuthTabCallbackDefault[]{iAuthTabCallbackDefault, Line, Word, None};
            }
            IAuthTabCallbackDefault iAuthTabCallbackDefault2 = Line;
            IAuthTabCallbackDefault iAuthTabCallbackDefault3 = Word;
            IAuthTabCallbackDefault iAuthTabCallbackDefault4 = None;
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr = {iAuthTabCallbackDefault, iAuthTabCallbackDefault2};
            iAuthTabCallbackDefaultArr[4] = iAuthTabCallbackDefault3;
            iAuthTabCallbackDefaultArr[4] = iAuthTabCallbackDefault4;
            return iAuthTabCallbackDefaultArr;
        }

        public static EnumEntries<IAuthTabCallbackDefault> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallbackDefault valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) Enum.valueOf(IAuthTabCallbackDefault.class, str);
            int i4 = onNavigationEvent + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackDefault;
        }

        public static IAuthTabCallbackDefault[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr = (IAuthTabCallbackDefault[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 71;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackDefaultArr;
        }

        private IAuthTabCallbackDefault(String str, int i) {
        }

        static {
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr$values = $values();
            $VALUES = iAuthTabCallbackDefaultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackDefaultArr$values);
            int i = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public interface asInterface {
        public static final onExtraCallback Companion = onExtraCallback.IAuthTabCallback;

        IAuthTabCallbackDefault onExtraCallback();

        public static final class onExtraCallback {
            private static int onActivityLayout = 1;
            private static int onActivityResized = 0;
            private static int onPostMessage = 1;
            private static int writeTypedObject;
            static final /* synthetic */ onExtraCallback IAuthTabCallback = new onExtraCallback();
            private static final IAuthTabCallback.IAuthTabCallbackStub IAuthTabCallbackStub = IAuthTabCallback.IAuthTabCallbackStub.onNavigationEvent;
            private static final IAuthTabCallback.onTransact access000 = IAuthTabCallback.onTransact.onWarmupCompleted;
            private static final IAuthTabCallback.IAuthTabCallback_Parcel ICustomTabsCallback = IAuthTabCallback.IAuthTabCallback_Parcel.onExtraCallback;
            private static final IAuthTabCallback.IAuthTabCallbackStubProxy IAuthTabCallback_Parcel = IAuthTabCallback.IAuthTabCallbackStubProxy.onWarmupCompleted;
            private static final IAuthTabCallback.access100 access100 = IAuthTabCallback.access100.onExtraCallback;
            private static final IAuthTabCallback.access000 readTypedObject = IAuthTabCallback.access000.onWarmupCompleted;
            private static final IAuthTabCallback.onExtraCallbackWithResult onTransact = IAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallback;
            private static final IAuthTabCallback.asInterface IAuthTabCallbackStubProxy = IAuthTabCallback.asInterface.IAuthTabCallback;
            private static final IAuthTabCallback.onWarmupCompleted asInterface = IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult;
            private static final IAuthTabCallback.C0040IAuthTabCallback onWarmupCompleted = IAuthTabCallback.C0040IAuthTabCallback.onExtraCallback;
            private static final IAuthTabCallback.onExtraCallback onExtraCallbackWithResult = IAuthTabCallback.onExtraCallback.onExtraCallbackWithResult;
            private static final IAuthTabCallback.onNavigationEvent onExtraCallback = IAuthTabCallback.onNavigationEvent.onExtraCallbackWithResult;
            private static final IAuthTabCallback.IAuthTabCallbackDefault getInterfaceDescriptor = IAuthTabCallback.IAuthTabCallbackDefault.onWarmupCompleted;
            private static final IAuthTabCallback.asBinder asBinder = IAuthTabCallback.asBinder.onExtraCallback;
            private static final IAuthTabCallback.getInterfaceDescriptor extraCallback = IAuthTabCallback.getInterfaceDescriptor.onExtraCallbackWithResult;
            private static final IAuthTabCallbackStub.onNavigationEvent IAuthTabCallbackDefault = IAuthTabCallbackStub.onNavigationEvent.onExtraCallbackWithResult;
            private static final IAuthTabCallbackStub.onExtraCallback extraCallbackWithResult = IAuthTabCallbackStub.onExtraCallback.IAuthTabCallback;
            private static final IAuthTabCallbackStub.onWarmupCompleted onNavigationEvent = IAuthTabCallbackStub.onWarmupCompleted.onNavigationEvent;

            public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
                int i7 = ~i;
                int i8 = ~i3;
                int i9 = (~i2) | i8;
                int i10 = i7 | (~i9);
                int i11 = i2 | i8;
                int i12 = ~(i9 | i);
                int i13 = i3 + i + i4 + (1075552530 * i5) + ((-1519595880) * i6);
                int i14 = i13 * i13;
                int i15 = (((-1050772794) * i3) - 1639710720) + ((-2116975300) * i) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i4) + ((-189792256) * i5) + (1111490560 * i6) + (1415839744 * i14);
                int i16 = (i3 * 251836610) + 257048825 + (i * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i4 * 251837547) + (i5 * 1710852742) + (i6 * (-1855850104)) + (i14 * (-1244921856));
                return i15 + ((i16 * i16) * (-1300496384)) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
            }

            private onExtraCallback() {
            }

            static {
                int i = onPostMessage + 29;
                writeTypedObject = i % 128;
                int i2 = i % 2;
            }

            public final IAuthTabCallback.onTransact onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onActivityResized + 83;
                onActivityLayout = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback.onTransact ontransact = access000;
                if (i3 == 0) {
                    int i4 = 27 / 0;
                }
                return ontransact;
            }

            public final IAuthTabCallback.IAuthTabCallback_Parcel IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onActivityResized + 107;
                int i3 = i2 % 128;
                onActivityLayout = i3;
                int i4 = i2 % 2;
                IAuthTabCallback.IAuthTabCallback_Parcel iAuthTabCallback_Parcel = ICustomTabsCallback;
                int i5 = i3 + 49;
                onActivityResized = i5 % 128;
                int i6 = i5 % 2;
                return iAuthTabCallback_Parcel;
            }

            private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
                int i = 2 % 2;
                int i2 = onActivityResized + 19;
                int i3 = i2 % 128;
                onActivityLayout = i3;
                int i4 = i2 % 2;
                IAuthTabCallback.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = IAuthTabCallback_Parcel;
                int i5 = i3 + 101;
                onActivityResized = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 99 / 0;
                }
                return iAuthTabCallbackStubProxy;
            }

            public final IAuthTabCallback.access100 asBinder() {
                int i = 2 % 2;
                int i2 = onActivityResized + 65;
                onActivityLayout = i2 % 128;
                if (i2 % 2 != 0) {
                    return access100;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final IAuthTabCallback.access000 onTransact() {
                int i = 2 % 2;
                int i2 = onActivityResized;
                int i3 = i2 + 119;
                onActivityLayout = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback.access000 access000Var = readTypedObject;
                int i5 = i2 + 69;
                onActivityLayout = i5 % 128;
                if (i5 % 2 != 0) {
                    return access000Var;
                }
                throw null;
            }

            private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
                int i = 2 % 2;
                int i2 = onActivityLayout + 115;
                int i3 = i2 % 128;
                onActivityResized = i3;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = onTransact;
                int i4 = i3 + 57;
                onActivityLayout = i4 % 128;
                int i5 = i4 % 2;
                return onextracallbackwithresult;
            }

            public final IAuthTabCallback.asInterface IAuthTabCallbackDefault() {
                IAuthTabCallback.asInterface asinterface;
                int i = 2 % 2;
                int i2 = onActivityLayout + 55;
                int i3 = i2 % 128;
                onActivityResized = i3;
                if (i2 % 2 != 0) {
                    asinterface = IAuthTabCallbackStubProxy;
                    int i4 = 7 / 0;
                } else {
                    asinterface = IAuthTabCallbackStubProxy;
                }
                int i5 = i3 + 61;
                onActivityLayout = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 26 / 0;
                }
                return asinterface;
            }

            public final IAuthTabCallback.onNavigationEvent onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onActivityLayout + 7;
                int i3 = i2 % 128;
                onActivityResized = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                IAuthTabCallback.onNavigationEvent onnavigationevent = onExtraCallback;
                int i4 = i3 + 63;
                onActivityLayout = i4 % 128;
                if (i4 % 2 != 0) {
                    return onnavigationevent;
                }
                throw null;
            }

            public final IAuthTabCallbackStub.onNavigationEvent IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onActivityLayout;
                int i3 = i2 + 29;
                onActivityResized = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallbackStub.onNavigationEvent onnavigationevent = IAuthTabCallbackDefault;
                int i5 = i2 + 11;
                onActivityResized = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationevent;
            }

            public final IAuthTabCallbackStub.onWarmupCompleted onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onActivityResized + 57;
                onActivityLayout = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallbackStub.onWarmupCompleted onwarmupcompleted = onNavigationEvent;
                if (i3 == 0) {
                    int i4 = 71 / 0;
                }
                return onwarmupcompleted;
            }

            public final IAuthTabCallback.onExtraCallbackWithResult onExtraCallback() {
                return (IAuthTabCallback.onExtraCallbackWithResult) IAuthTabCallback(-616426957, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 616426958, new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            }

            public final IAuthTabCallback.IAuthTabCallbackStubProxy asInterface() {
                return (IAuthTabCallback.IAuthTabCallbackStubProxy) IAuthTabCallback(-129908653, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 129908653, new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            }
        }
    }

    public static final class IAuthTabCallback implements asInterface {
        private static int IAuthTabCallbackDefault = 1;
        private static int asBinder;
        private final Integer IAuthTabCallback;
        private final boolean asInterface;
        private final int onExtraCallback;
        private final MaxNativeAdMaxNativeAdImage onExtraCallbackWithResult;
        private final MaxNativeAdMaxNativeAdImage onNavigationEvent;
        private final IAuthTabCallbackDefault onTransact;
        private final int onWarmupCompleted;

        public static /* synthetic */ IAuthTabCallback onWarmupCompleted(IAuthTabCallback iAuthTabCallback, IAuthTabCallbackDefault iAuthTabCallbackDefault, MaxNativeAdMaxNativeAdImage maxNativeAdMaxNativeAdImage, int i, MaxNativeAdMaxNativeAdImage maxNativeAdMaxNativeAdImage2, int i2, Integer num, boolean z, int i3, Object obj) {
            MaxNativeAdMaxNativeAdImage maxNativeAdMaxNativeAdImage3;
            int i4;
            boolean z2;
            int i5 = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault2 = (i3 & 1) != 0 ? iAuthTabCallback.onTransact : iAuthTabCallbackDefault;
            if ((i3 & 2) != 0) {
                int i6 = IAuthTabCallbackDefault + 43;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                maxNativeAdMaxNativeAdImage3 = iAuthTabCallback.onExtraCallbackWithResult;
            } else {
                maxNativeAdMaxNativeAdImage3 = maxNativeAdMaxNativeAdImage;
            }
            int i8 = (i3 & 4) != 0 ? iAuthTabCallback.onWarmupCompleted : i;
            MaxNativeAdMaxNativeAdImage maxNativeAdMaxNativeAdImage4 = (i3 & 8) != 0 ? iAuthTabCallback.onNavigationEvent : maxNativeAdMaxNativeAdImage2;
            if ((i3 & 16) != 0) {
                int i9 = IAuthTabCallbackDefault + 83;
                asBinder = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = iAuthTabCallback.onExtraCallback;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                i4 = iAuthTabCallback.onExtraCallback;
            } else {
                i4 = i2;
            }
            Integer num2 = (i3 & 32) != 0 ? iAuthTabCallback.IAuthTabCallback : num;
            if ((i3 & 64) != 0) {
                z2 = iAuthTabCallback.asInterface;
                int i11 = asBinder + 99;
                IAuthTabCallbackDefault = i11 % 128;
                int i12 = i11 % 2;
            } else {
                z2 = z;
            }
            return iAuthTabCallback.onExtraCallback(iAuthTabCallbackDefault2, maxNativeAdMaxNativeAdImage3, i8, maxNativeAdMaxNativeAdImage4, i4, num2, z2);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (this.onTransact != iAuthTabCallback.onTransact) {
                int i2 = asBinder + 45;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, iAuthTabCallback.onExtraCallbackWithResult) || this.onWarmupCompleted != iAuthTabCallback.onWarmupCompleted) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, iAuthTabCallback.onNavigationEvent)) {
                int i4 = IAuthTabCallbackDefault + 91;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (this.onExtraCallback != iAuthTabCallback.onExtraCallback) {
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, iAuthTabCallback.IAuthTabCallback)) {
                return this.asInterface == iAuthTabCallback.asInterface;
            }
            int i6 = asBinder + 103;
            IAuthTabCallbackDefault = i6 % 128;
            return i6 % 2 == 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = asBinder + 31;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.onTransact.hashCode();
            int iHashCode3 = this.onExtraCallbackWithResult.hashCode();
            int iHashCode4 = Integer.hashCode(this.onWarmupCompleted);
            int iHashCode5 = this.onNavigationEvent.hashCode();
            int iHashCode6 = Integer.hashCode(this.onExtraCallback);
            Integer num = this.IAuthTabCallback;
            if (num == null) {
                int i4 = IAuthTabCallbackDefault + 73;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = num.hashCode();
            }
            return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + Boolean.hashCode(this.asInterface);
        }

        public final IAuthTabCallback onExtraCallback(@NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault, @NotNull MaxNativeAdMaxNativeAdImage maxNativeAdMaxNativeAdImage, int i, @NotNull MaxNativeAdMaxNativeAdImage maxNativeAdMaxNativeAdImage2, int i2, @Nullable Integer num, boolean z) {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            Intrinsics.checkNotNullParameter(maxNativeAdMaxNativeAdImage, "");
            Intrinsics.checkNotNullParameter(maxNativeAdMaxNativeAdImage2, "");
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(iAuthTabCallbackDefault, maxNativeAdMaxNativeAdImage, i, maxNativeAdMaxNativeAdImage2, i2, num, z);
            int i4 = IAuthTabCallbackDefault + 49;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "InOutMotion(splitUnit=" + this.onTransact + ", inMotion=" + this.onExtraCallbackWithResult + ", inStaggerDelay=" + this.onWarmupCompleted + ", outMotion=" + this.onNavigationEvent + ", outStaggerDelay=" + this.onExtraCallback + ", outInMotionDelay=" + this.IAuthTabCallback + ", useTextCenterPivot=" + this.asInterface + ")";
            int i2 = asBinder + 57;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 10 / 0;
            }
            return str;
        }

        public IAuthTabCallback(@NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault, @NotNull MaxNativeAdMaxNativeAdImage maxNativeAdMaxNativeAdImage, int i, @NotNull MaxNativeAdMaxNativeAdImage maxNativeAdMaxNativeAdImage2, int i2, @Nullable Integer num, boolean z) {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            Intrinsics.checkNotNullParameter(maxNativeAdMaxNativeAdImage, "");
            Intrinsics.checkNotNullParameter(maxNativeAdMaxNativeAdImage2, "");
            this.onTransact = iAuthTabCallbackDefault;
            this.onExtraCallbackWithResult = maxNativeAdMaxNativeAdImage;
            this.onWarmupCompleted = i;
            this.onNavigationEvent = maxNativeAdMaxNativeAdImage2;
            this.onExtraCallback = i2;
            this.IAuthTabCallback = num;
            this.asInterface = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(IAuthTabCallbackDefault iAuthTabCallbackDefault, MaxNativeAdMaxNativeAdImage maxNativeAdMaxNativeAdImage, int i, MaxNativeAdMaxNativeAdImage maxNativeAdMaxNativeAdImage2, int i2, Integer num, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            Integer num2;
            boolean z2;
            if ((i3 & 32) != 0) {
                int i4 = asBinder;
                int i5 = i4 + 73;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                int i6 = i4 + 29;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                num2 = null;
            } else {
                num2 = num;
            }
            if ((i3 & 64) != 0) {
                int i9 = asBinder + 91;
                int i10 = i9 % 128;
                IAuthTabCallbackDefault = i10;
                int i11 = i9 % 2;
                int i12 = i10 + 103;
                asBinder = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 2 % 2;
                z2 = false;
            } else {
                z2 = z;
            }
            this(iAuthTabCallbackDefault, maxNativeAdMaxNativeAdImage, i, maxNativeAdMaxNativeAdImage2, i2, num2, z2);
        }

        @Override // o.mExternalSyntheticApiModelOutline1.asInterface
        public IAuthTabCallbackDefault onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 49;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = this.onTransact;
            int i5 = i2 + 41;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            throw null;
        }

        public final MaxNativeAdMaxNativeAdImage onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 107;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 25;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = this.onWarmupCompleted;
            int i5 = i2 + 49;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 40 / 0;
            }
            return i4;
        }

        public final MaxNativeAdMaxNativeAdImage onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 57;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            MaxNativeAdMaxNativeAdImage maxNativeAdMaxNativeAdImage = this.onNavigationEvent;
            int i5 = i3 + 87;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return maxNativeAdMaxNativeAdImage;
        }

        public final int onTransact() {
            int i = 2 % 2;
            int i2 = asBinder + 115;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Integer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 101;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            Integer num = this.IAuthTabCallback;
            int i4 = i3 + 59;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return num;
        }

        public final boolean asBinder() {
            int i = 2 % 2;
            int i2 = asBinder + 49;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.asInterface;
            if (i3 == 0) {
                int i4 = 80 / 0;
            }
            return z;
        }

        public static final class IAuthTabCallbackStub {
            private static int IAuthTabCallback = 1;
            private static int IAuthTabCallbackStub = 0;
            private static int asInterface = 1;
            private static int onExtraCallback;
            public static final IAuthTabCallbackStub onNavigationEvent = new IAuthTabCallbackStub();
            private static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback(IAuthTabCallbackDefault.Char, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Roll$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 41;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStub.onNavigationEvent();
                    int i4 = IAuthTabCallback + 57;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 25 / 0;
                    }
                    return appLovinSdkSettingsOnNavigationEvent;
                }
            }, 30, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Roll$$ExternalSyntheticLambda3
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 69;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        return mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStub.onExtraCallback();
                    }
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStub.onExtraCallback();
                    throw null;
                }
            }, 20, null, false, 96, null);
            private static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback(IAuthTabCallbackDefault.Line, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Roll$$ExternalSyntheticLambda4
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 43;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStub.onExtraCallbackWithResult();
                    if (i3 != 0) {
                        int i4 = 76 / 0;
                    }
                    return appLovinSdkSettingsOnExtraCallbackWithResult;
                }
            }, 100, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Roll$$ExternalSyntheticLambda5
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 11;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
                        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
                        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
                        return (AppLovinSdkSettings) mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStub.onNavigationEvent(-1630674499, iOnExtraCallback2, iOnExtraCallback, ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[0], 1630674499, iOnExtraCallback3);
                    }
                    int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
                    int iOnExtraCallback5 = ICustomTabsCallbackStubProxy.onExtraCallback();
                    int iOnExtraCallback6 = ICustomTabsCallbackStubProxy.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, 0, null, false, 96, null);

            private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 99;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return IAuthTabCallbackStub();
                }
                IAuthTabCallbackStub();
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 47;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackDefault = IAuthTabCallbackDefault();
                int i4 = onExtraCallback + 121;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettingsIAuthTabCallbackDefault;
            }

            private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    IAuthTabCallback(attachapplovinsdk);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallback = IAuthTabCallback(attachapplovinsdk);
                int i3 = onExtraCallback + 95;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 56 / 0;
                }
                return unitIAuthTabCallback;
            }

            public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 107;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = onExtraCallback(attachapplovinsdk);
                int i4 = IAuthTabCallback + 93;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallback;
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult() {
                AppLovinSdkSettings appLovinSdkSettingsOnTransact;
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    appLovinSdkSettingsOnTransact = onTransact();
                    int i3 = 90 / 0;
                } else {
                    appLovinSdkSettingsOnTransact = onTransact();
                }
                int i4 = IAuthTabCallback + 83;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettingsOnTransact;
            }

            public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
                int i7 = ~i5;
                int i8 = ~i;
                int i9 = (~(i8 | i3)) | i7;
                int i10 = (~(i7 | (~i3) | i)) | (~(i8 | i7 | i3));
                int i11 = (~(i3 | i)) | (~(i5 | i));
                int i12 = i5 + i + i2 + ((-1520811122) * i6) + (1880343047 * i4);
                int i13 = i12 * i12;
                int i14 = (((-88056299) * i5) - 1254686720) + (875799021 * i) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i2) + ((-206831616) * i6) + (408289280 * i4) + ((-683737088) * i13);
                int i15 = ((i5 * (-660833811)) - 1995073173) + (i * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i2 * (-660833671)) + (i6 * 644061726) + (i4 * (-2012083377)) + (i13 * (-1027145728));
                return i14 + ((i15 * i15) * 814809088) != 1 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
            }

            public static /* synthetic */ AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 123;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onWarmupCompleted();
                }
                onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private IAuthTabCallbackStub() {
            }

            static {
                int i = IAuthTabCallbackStub + 65;
                asInterface = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 83;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                Float fValueOf = Float.valueOf(0.0f);
                Float fValueOf2 = Float.valueOf(1.0f);
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf, fValueOf2, (Function1) null, 4, (Object) null);
                Float fValueOf3 = Float.valueOf(0.5f);
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.asBinder(isMuted.IAuthTabCallback(isMuted.access000((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, new Object[]{appLovinSdkSettingsOnNavigationEvent, fValueOf3, fValueOf, null, 4, null}, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), fValueOf3, fValueOf, null, 4, null), Float.valueOf(-90.0f), fValueOf, (Function1) null, 4, (Object) null), Float.valueOf(0.9f), fValueOf2, null, 4, null), 20}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = IAuthTabCallback + 65;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 87 / 0;
                }
                return appLovinSdkSettings;
            }

            private static final Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 57;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                attachapplovinsdk.IAuthTabCallback(250);
                Unit unit = Unit.INSTANCE;
                int i4 = IAuthTabCallback + 41;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 91 / 0;
                }
                return unit;
            }

            private static final AppLovinSdkSettings IAuthTabCallbackDefault() {
                int i = 2 % 2;
                Object[] objArr = {isMuted.onNavigationEvent(onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback()), (Float) null, Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Roll$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onNavigationEvent + 59;
                        IAuthTabCallback = i3 % 128;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i3 % 2 == 0) {
                            mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStub.onExtraCallbackWithResult(attachapplovinsdk);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStub.onExtraCallbackWithResult(attachapplovinsdk);
                        int i4 = onNavigationEvent + 7;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 33 / 0;
                        }
                        return unitOnExtraCallbackWithResult;
                    }
                }, 1, (Object) null), null, Float.valueOf(-0.45f), null, 5, null};
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = isMuted.IAuthTabCallback(isMuted.asBinder(isMuted.access000((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), null, Float.valueOf(0.5f), null, 5, null), null, Float.valueOf(0.9f), null, 5, null), (Float) null, Float.valueOf(80.0f), (Function1) null, 5, (Object) null);
                int i2 = onExtraCallback + 3;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return appLovinSdkSettingsIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final AppLovinSdkSettings onTransact() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 41;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                Float fValueOf = Float.valueOf(0.0f);
                Float fValueOf2 = Float.valueOf(1.0f);
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf, fValueOf2, (Function1) null, 4, (Object) null);
                Float fValueOf3 = Float.valueOf(0.5f);
                Object obj = null;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.IAuthTabCallback(isMuted.access000(isMuted.asBinder((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, new Object[]{appLovinSdkSettingsOnNavigationEvent, fValueOf3, fValueOf, null, 4, null}, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Float.valueOf(0.9f), fValueOf2, null, 4, null), fValueOf3, fValueOf, null, 4, null), Float.valueOf(-90.0f), fValueOf, (Function1) null, 4, (Object) null), 30}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = IAuthTabCallback + 59;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return appLovinSdkSettings;
                }
                obj.hashCode();
                throw null;
            }

            private static final Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 113;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                    i = 32034;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                    i = 250;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                return Unit.INSTANCE;
            }

            private static final AppLovinSdkSettings IAuthTabCallbackStub() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                Float fValueOf = Float.valueOf(0.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, (Float) null, fValueOf, new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Roll$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = IAuthTabCallback + 99;
                        onNavigationEvent = i3 % 128;
                        Object obj2 = null;
                        Object[] objArr2 = {(attachAppLovinSdk) obj};
                        if (i3 % 2 == 0) {
                            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
                            throw null;
                        }
                        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
                        Unit unit = (Unit) mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStub.onNavigationEvent(163526967, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), objArr2, -163526966, ICustomTabsCallbackStubProxy.onExtraCallback());
                        int i4 = IAuthTabCallback + 85;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 != 0) {
                            return unit;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                }, 1, (Object) null), null, Float.valueOf(-0.45f), null, 5, null};
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = isMuted.IAuthTabCallback(isMuted.access000(isMuted.asBinder((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), null, Float.valueOf(0.9f), null, 5, null), fValueOf, Float.valueOf(0.5f), null, 4, null), (Float) null, Float.valueOf(80.0f), (Function1) null, 5, (Object) null);
                int i2 = onExtraCallback + 25;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return appLovinSdkSettingsIAuthTabCallback;
            }

            public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback() {
                int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
                int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
                int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
                return (AppLovinSdkSettings) onNavigationEvent(-1630674499, iOnExtraCallback2, iOnExtraCallback, ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[0], 1630674499, iOnExtraCallback3);
            }

            public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
                int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
                int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
                int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
                return (Unit) onNavigationEvent(163526967, iOnExtraCallback2, iOnExtraCallback, ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{attachapplovinsdk}, -163526966, iOnExtraCallback3);
            }
        }

        public static final class onTransact {
            private static int IAuthTabCallbackDefault = 1;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            private static int onTransact;
            public static final onTransact onWarmupCompleted = new onTransact();
            private static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback(IAuthTabCallbackDefault.Char, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$RollBounce$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 115;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onTransact.onExtraCallbackWithResult();
                    int i4 = onExtraCallbackWithResult + 89;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return appLovinSdkSettingsOnExtraCallbackWithResult;
                }
            }, 20, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$RollBounce$$ExternalSyntheticLambda3
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 27;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onTransact.onExtraCallback();
                    int i4 = onWarmupCompleted + 83;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return appLovinSdkSettingsOnExtraCallback;
                }
            }, 0, null, false, 96, null);
            private static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback(IAuthTabCallbackDefault.Line, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$RollBounce$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 123;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        return mExternalSyntheticApiModelOutline1.IAuthTabCallback.onTransact.onWarmupCompleted();
                    }
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback.onTransact.onWarmupCompleted();
                    throw null;
                }
            }, 120, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$RollBounce$$ExternalSyntheticLambda5
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 1;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onTransact.onNavigationEvent();
                    int i4 = onExtraCallback + 101;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return appLovinSdkSettingsOnNavigationEvent;
                }
            }, 0, null, false, 96, null);

            public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
                int i7 = ~i;
                int i8 = ~((~i6) | i7);
                int i9 = ~i4;
                int i10 = i8 | (~(i9 | i6)) | (~(i | i6));
                int i11 = i7 | i6;
                int i12 = i9 | i11;
                int i13 = i + i6 + i3 + ((-1542968645) * i2) + (1789173782 * i5);
                int i14 = i13 * i13;
                int i15 = (1553370224 * i) + 752877568 + ((-368479342) * i6) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i3) + (1802502144 * i2) + (148897792 * i5) + (289275904 * i14);
                int i16 = (i * (-930071408)) + 1959937684 + (i6 * (-930070194)) + (i10 * 607) + (i11 * (-1214)) + (i12 * 607) + (i3 * (-930070801)) + (i2 * 1059663509) + (i5 * (-1428764534)) + (i14 * 484573184);
                return i15 + ((i16 * i16) * 411172864) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
            }

            public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
                Unit unit;
                int i = 2 % 2;
                int i2 = onExtraCallback + 37;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {attachapplovinsdk};
                int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                int iOnExtraCallback4 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                if (i3 != 0) {
                    unit = (Unit) onExtraCallback(-982163066, iOnExtraCallback3, objArr, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback4, 982163067);
                    int i4 = 12 / 0;
                } else {
                    unit = (Unit) onExtraCallback(-982163066, iOnExtraCallback3, objArr, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback4, 982163067);
                }
                int i5 = onExtraCallback + 123;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 93;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackDefault = IAuthTabCallbackDefault();
                int i4 = onExtraCallbackWithResult + 17;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettingsIAuthTabCallbackDefault;
            }

            public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = onNavigationEvent(attachapplovinsdk);
                int i4 = onExtraCallback + 21;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 103;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    asInterface();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                AppLovinSdkSettings appLovinSdkSettingsAsInterface = asInterface();
                int i3 = onExtraCallback + 89;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return appLovinSdkSettingsAsInterface;
            }

            public static /* synthetic */ AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackStub = IAuthTabCallbackStub();
                if (i3 == 0) {
                    int i4 = 24 / 0;
                }
                return appLovinSdkSettingsIAuthTabCallbackStub;
            }

            public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnTransact = onTransact();
                int i4 = onExtraCallbackWithResult + 91;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return appLovinSdkSettingsOnTransact;
                }
                throw null;
            }

            private onTransact() {
            }

            static {
                int i = IAuthTabCallbackDefault + 7;
                onTransact = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            private static final AppLovinSdkSettings asInterface() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 95;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onExtraCallbackWithResult(), 550}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141);
                Float fValueOf = Float.valueOf(0.0f);
                Float fValueOf2 = Float.valueOf(1.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettings, fValueOf, fValueOf2, (Function1) null, 4, (Object) null), Float.valueOf(1.2f), fValueOf, null, 4, null};
                Object[] objArr2 = {isMuted.asBinder(isMuted.IAuthTabCallback(isMuted.access000((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Float.valueOf(0.1f), Float.valueOf(0.5f), null, 4, null), Float.valueOf(90.0f), fValueOf, (Function1) null, 4, (Object) null), fValueOf2, fValueOf2, null, 4, null), 20};
                AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = onExtraCallbackWithResult + 103;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return appLovinSdkSettings2;
                }
                throw null;
            }

            private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i = 2 % 2;
                int i2 = onExtraCallback + 9;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                attachapplovinsdk.IAuthTabCallback(150);
                Unit unit = Unit.INSTANCE;
                int i4 = onExtraCallbackWithResult + 29;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 79 / 0;
                }
                return unit;
            }

            private static final AppLovinSdkSettings IAuthTabCallbackDefault() {
                int i = 2 % 2;
                Object[] objArr = {isMuted.onNavigationEvent(onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback()), (Float) null, Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$RollBounce$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onNavigationEvent + 27;
                        onExtraCallbackWithResult = i3 % 128;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i3 % 2 != 0) {
                            return mExternalSyntheticApiModelOutline1.IAuthTabCallback.onTransact.onExtraCallback(attachapplovinsdk);
                        }
                        mExternalSyntheticApiModelOutline1.IAuthTabCallback.onTransact.onExtraCallback(attachapplovinsdk);
                        throw null;
                    }
                }, 1, (Object) null), null, Float.valueOf(-0.75f), null, 5, null};
                AppLovinSdkSettings appLovinSdkSettingsAsBinder = isMuted.asBinder(isMuted.IAuthTabCallback(isMuted.access000((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), null, Float.valueOf(0.5f), null, 5, null), (Float) null, Float.valueOf(80.0f), (Function1) null, 5, (Object) null), null, Float.valueOf(0.9f), null, 5, null);
                int i2 = onExtraCallbackWithResult + 69;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return appLovinSdkSettingsAsBinder;
                }
                throw null;
            }

            private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 95;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                IAuthTabCallback iAuthTabCallback = IAuthTabCallback;
                int i4 = i2 + 21;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return iAuthTabCallback;
                }
                throw null;
            }

            private static final AppLovinSdkSettings onTransact() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 115;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onExtraCallbackWithResult(), 550}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141);
                Float fValueOf = Float.valueOf(0.0f);
                Float fValueOf2 = Float.valueOf(1.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettings, fValueOf, fValueOf2, (Function1) null, 4, (Object) null), Float.valueOf(2.0f), fValueOf, null, 4, null};
                Object[] objArr2 = {isMuted.asBinder(isMuted.IAuthTabCallback(isMuted.access000((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Float.valueOf(0.1f), Float.valueOf(0.5f), null, 4, null), Float.valueOf(90.0f), fValueOf, (Function1) null, 4, (Object) null), fValueOf2, fValueOf2, null, 4, null), 20};
                AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = onExtraCallback + 101;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return appLovinSdkSettings2;
                }
                throw null;
            }

            private static final Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 87;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                    i = 23317;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                    i = 250;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                Unit unit = Unit.INSTANCE;
                int i4 = onExtraCallbackWithResult + 3;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final AppLovinSdkSettings IAuthTabCallbackStub() {
                int i = 2 % 2;
                Object[] objArr = {isMuted.onNavigationEvent(onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback()), (Float) null, Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$RollBounce$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallbackWithResult + 97;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onTransact.onExtraCallbackWithResult((attachAppLovinSdk) obj);
                        int i5 = onExtraCallbackWithResult + 61;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                }, 1, (Object) null), null, Float.valueOf(-0.75f), null, 5, null};
                AppLovinSdkSettings appLovinSdkSettingsAsBinder = isMuted.asBinder(isMuted.IAuthTabCallback(isMuted.access000((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), null, Float.valueOf(0.5f), null, 5, null), (Float) null, Float.valueOf(80.0f), (Function1) null, 5, (Object) null), null, Float.valueOf(0.9f), null, 5, null);
                int i2 = onExtraCallback + 7;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return appLovinSdkSettingsAsBinder;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
                int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                return (Unit) onExtraCallback(-982163066, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{attachapplovinsdk}, iOnExtraCallback2, iOnExtraCallback, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 982163067);
            }

            public final IAuthTabCallback IAuthTabCallback() {
                int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                return (IAuthTabCallback) onExtraCallback(411964998, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, iOnExtraCallback, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -411964998);
            }
        }

        public static final class IAuthTabCallback_Parcel {
            private static int IAuthTabCallback = 1;
            private static int asBinder = 1;
            private static int onExtraCallbackWithResult;
            private static int onWarmupCompleted;
            public static final IAuthTabCallback_Parcel onExtraCallback = new IAuthTabCallback_Parcel();
            private static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback(IAuthTabCallbackDefault.Word, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Snap$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 105;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallback_Parcel.onNavigationEvent();
                    int i4 = onExtraCallback + 103;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 74 / 0;
                    }
                    return appLovinSdkSettingsOnNavigationEvent;
                }
            }, 100, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Snap$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 61;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallback_Parcel.onExtraCallback();
                    int i4 = onNavigationEvent + 125;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        return appLovinSdkSettingsOnExtraCallback;
                    }
                    throw null;
                }
            }, 60, null, false, 96, null);

            public static /* synthetic */ AppLovinSdkSettings onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 57;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = onWarmupCompleted();
                if (i3 != 0) {
                    int i4 = 28 / 0;
                }
                return appLovinSdkSettingsOnWarmupCompleted;
            }

            public static /* synthetic */ AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 111;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return IAuthTabCallback();
                }
                IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 117;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return onExtraCallbackWithResult(attachapplovinsdk);
                }
                onExtraCallbackWithResult(attachapplovinsdk);
                throw null;
            }

            private IAuthTabCallback_Parcel() {
            }

            public final IAuthTabCallback onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 77;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return onNavigationEvent;
                }
                throw null;
            }

            static {
                int i = asBinder + 29;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            private static final AppLovinSdkSettings IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 55;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onExtraCallback(), 1200}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141);
                Float fValueOf = Float.valueOf(0.0f);
                AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.IAuthTabCallback(isMuted.access000(isMuted.onNavigationEvent(appLovinSdkSettings, fValueOf, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), fValueOf, fValueOf, null, 4, null), Float.valueOf(100.0f), (Float) null, (Function1) null, 6, (Object) null), 300}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = IAuthTabCallback + 37;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettings2;
            }

            private static final Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 63;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    i = 25618;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    i = 300;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                Unit unit = Unit.INSTANCE;
                int i4 = onWarmupCompleted + 81;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent((AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onTransact(), 800}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), (Float) null, Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Snap$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallbackWithResult + 7;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnWarmupCompleted = mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallback_Parcel.onWarmupCompleted((attachAppLovinSdk) obj);
                        int i5 = onExtraCallbackWithResult + 3;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return unitOnWarmupCompleted;
                    }
                }, 1, (Object) null);
                Float fValueOf = Float.valueOf(1.0f);
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = isMuted.IAuthTabCallback(isMuted.access000(appLovinSdkSettingsOnNavigationEvent, fValueOf, fValueOf, null, 4, null), (Float) null, Float.valueOf(-100.0f), (Function1) null, 5, (Object) null);
                int i2 = IAuthTabCallback + 77;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return appLovinSdkSettingsIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class access100 {
            private static int IAuthTabCallbackDefault = 0;
            private static int asBinder = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final access100 onExtraCallback = new access100();
            private static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback(IAuthTabCallbackDefault.Char, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Slide$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 115;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onExtraCallback();
                    }
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onExtraCallback();
                    throw null;
                }
            }, 40, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Slide$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 55;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        return mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onNavigationEvent();
                    }
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onNavigationEvent();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, 0, null, false, 96, null);
            private static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback(IAuthTabCallbackDefault.Line, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Slide$$ExternalSyntheticLambda4
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 91;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onExtraCallbackWithResult();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onExtraCallbackWithResult();
                    int i3 = onWarmupCompleted + 63;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 47 / 0;
                    }
                    return appLovinSdkSettingsOnExtraCallbackWithResult;
                }
            }, 100, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Slide$$ExternalSyntheticLambda5
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    AppLovinSdkSettings appLovinSdkSettings;
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 23;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                        appLovinSdkSettings = (AppLovinSdkSettings) mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onNavigationEvent(822312129, new Object[0], MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -822312129);
                        int i3 = 18 / 0;
                    } else {
                        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                        appLovinSdkSettings = (AppLovinSdkSettings) mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onNavigationEvent(822312129, new Object[0], MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -822312129);
                    }
                    int i4 = onNavigationEvent + 91;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return appLovinSdkSettings;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, 0, null, false, 96, null);

            public static /* synthetic */ AppLovinSdkSettings onExtraCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return asBinder();
                }
                asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackStub = IAuthTabCallbackStub();
                if (i3 != 0) {
                    int i4 = 99 / 0;
                }
                return appLovinSdkSettingsIAuthTabCallbackStub;
            }

            public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
                int i7 = ~i;
                int i8 = i7 | i6;
                int i9 = ~(i8 | i4);
                int i10 = (~i4) | (~((~i6) | i));
                int i11 = (~(i4 | i6)) | (~(i7 | i4)) | (~i8);
                int i12 = i + i6 + i2 + ((-953487067) * i5) + ((-1992133889) * i3);
                int i13 = i12 * i12;
                int i14 = (1737059190 * i) + 1765277696 + (1051104396 * i6) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i2) + ((-1703411712) * i5) + (1961361408 * i3) + (907935744 * i13);
                int i15 = ((i * 272661978) - 2115615402) + (i6 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i2 * 272662391) + (i5 * 2077717299) + (i3 * 1957688713) + (i13 * 166854656);
                return i14 + ((i15 * i15) * (-213778432)) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
            }

            private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(attachapplovinsdk);
                int i4 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallbackWithResult;
            }

            public static /* synthetic */ AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 61;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnTransact = onTransact();
                int i4 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return appLovinSdkSettingsOnTransact;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 31;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    asInterface();
                    throw null;
                }
                AppLovinSdkSettings appLovinSdkSettingsAsInterface = asInterface();
                int i3 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 33 / 0;
                }
                return appLovinSdkSettingsAsInterface;
            }

            public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    onNavigationEvent(attachapplovinsdk);
                    throw null;
                }
                Unit unitOnNavigationEvent = onNavigationEvent(attachapplovinsdk);
                int i3 = onNavigationEvent + 95;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return unitOnNavigationEvent;
            }

            private access100() {
            }

            public final IAuthTabCallback onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 21;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback iAuthTabCallback = IAuthTabCallback;
                int i5 = i2 + 107;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return iAuthTabCallback;
            }

            static {
                int i = asBinder + 115;
                IAuthTabCallbackDefault = i % 128;
                if (i % 2 != 0) {
                    int i2 = 87 / 0;
                }
            }

            private static final AppLovinSdkSettings asBinder() {
                Object objOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 23;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallbackStub());
                    Float fValueOf = Float.valueOf(2.0f);
                    Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf, Float.valueOf(0.0f), (Function1) null, 2, (Object) null), Float.valueOf(0.2f), fValueOf, null, 4, null};
                    Object[] objArr2 = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 21};
                    objOnExtraCallbackWithResult = AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                } else {
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback2 = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallbackStub());
                    Float fValueOf2 = Float.valueOf(0.0f);
                    Object[] objArr3 = {isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback2, fValueOf2, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), Float.valueOf(0.2f), fValueOf2, null, 4, null};
                    Object[] objArr4 = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr3, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 100};
                    objOnExtraCallbackWithResult = AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr4, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                }
                return (AppLovinSdkSettings) objOnExtraCallbackWithResult;
            }

            private static final Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                    i = 6681;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                    i = 400;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                Unit unit = Unit.INSTANCE;
                int i4 = onNavigationEvent + 105;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 77 / 0;
                }
                return unit;
            }

            private static final AppLovinSdkSettings onTransact() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                Float fValueOf = Float.valueOf(0.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, (Float) null, fValueOf, new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Slide$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onWarmupCompleted + 85;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnWarmupCompleted = mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onWarmupCompleted((attachAppLovinSdk) obj);
                        if (i4 == 0) {
                            int i5 = 75 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                }, 1, (Object) null), fValueOf, Float.valueOf(-0.2f), null, 4, null};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                int i2 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return appLovinSdkSettings;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final IAuthTabCallback IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 121;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback iAuthTabCallback = onWarmupCompleted;
                int i5 = i2 + 61;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return iAuthTabCallback;
            }

            private static final AppLovinSdkSettings IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 111;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallbackStub());
                Float fValueOf = Float.valueOf(0.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), Float.valueOf(0.3f), fValueOf, null, 4, null};
                Object[] objArr2 = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 100};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = onNavigationEvent + 31;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettings;
            }

            private static final Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                attachapplovinsdk.IAuthTabCallback(300);
                Unit unit = Unit.INSTANCE;
                int i4 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            private static final AppLovinSdkSettings asInterface() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.onTransact());
                Float fValueOf = Float.valueOf(0.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, (Float) null, fValueOf, new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Slide$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = IAuthTabCallback + 57;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                        Unit unit = (Unit) mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onNavigationEvent(694726269, new Object[]{(attachAppLovinSdk) obj}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -694726268);
                        int i5 = onExtraCallbackWithResult + 85;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return unit;
                    }
                }, 1, (Object) null), fValueOf, Float.valueOf(-0.3f), null, 4, null};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                int i2 = onExtraCallbackWithResult + 67;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return appLovinSdkSettings;
                }
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback() {
                int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                return (AppLovinSdkSettings) onNavigationEvent(822312129, new Object[0], MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -822312129);
            }

            public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
                int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                return (Unit) onNavigationEvent(694726269, new Object[]{attachapplovinsdk}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -694726268);
            }
        }

        public static final class IAuthTabCallbackStubProxy {
            private static int IAuthTabCallback = 1;
            private static int IAuthTabCallbackStub = 0;
            private static int asBinder = 1;
            private static int onNavigationEvent;
            public static final IAuthTabCallbackStubProxy onWarmupCompleted = new IAuthTabCallbackStubProxy();
            private static final IAuthTabCallback onExtraCallback = new IAuthTabCallback(IAuthTabCallbackDefault.Char, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$SlideFast$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 103;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStubProxy.onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), -1237554281, RNSScreenManagerDelegate.onNavigationEvent(), new Object[0], 1237554282, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
                    int i4 = onExtraCallback + 83;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return appLovinSdkSettings;
                }
            }, 40, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$SlideFast$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 109;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStubProxy.onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), 378614407, RNSScreenManagerDelegate.onNavigationEvent(), new Object[0], -378614407, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
                    int i4 = IAuthTabCallback + 79;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return appLovinSdkSettings;
                }
            }, 0, null, false, 96, null);
            private static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback(IAuthTabCallbackDefault.Line, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$SlideFast$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 71;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStubProxy.IAuthTabCallback();
                    int i4 = onExtraCallbackWithResult + 33;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        return appLovinSdkSettingsIAuthTabCallback;
                    }
                    throw null;
                }
            }, 100, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$SlideFast$$ExternalSyntheticLambda4
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 69;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        return mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStubProxy.onExtraCallback();
                    }
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStubProxy.onExtraCallback();
                    throw null;
                }
            }, 0, null, false, 96, null);

            public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(attachapplovinsdk);
                int i4 = onNavigationEvent + 73;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 125;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsAsInterface = asInterface();
                int i4 = IAuthTabCallback + 79;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return appLovinSdkSettingsAsInterface;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
                int i7 = ~((~i) | i4);
                int i8 = (~((~i4) | (~i2))) | i7;
                int i9 = i4 | i2;
                int i10 = i4 + i2 + i3 + ((-39394691) * i6) + ((-2104995841) * i5);
                int i11 = i10 * i10;
                int i12 = (i4 * (-1880913482)) + 198443008 + ((-1880913482) * i2) + ((-1126725195) * i7) + (i8 * 1126725195) + (1126725195 * i9) + ((-754188288) * i3) + ((-1529085952) * i6) + ((-319553536) * i5) + ((-289079296) * i11);
                int i13 = ((i4 * 1773844906) - 1404835566) + (i2 * 1773844906) + (i7 * (-613)) + (i8 * 613) + (i9 * 613) + (i3 * 1773845519) + (i6 * 1055723859) + (i5 * 1996616689) + (i11 * (-1450508288));
                return i12 + ((i13 * i13) * (-778371072)) != 1 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
            }

            private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 109;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackStub = IAuthTabCallbackStub();
                int i4 = IAuthTabCallback + 61;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return appLovinSdkSettingsIAuthTabCallbackStub;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 119;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackDefault = IAuthTabCallbackDefault();
                int i4 = onNavigationEvent + 73;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettingsIAuthTabCallbackDefault;
            }

            public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 73;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return onExtraCallback(attachapplovinsdk);
                }
                onExtraCallback(attachapplovinsdk);
                throw null;
            }

            private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 49;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return asBinder();
                }
                asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private IAuthTabCallbackStubProxy() {
            }

            static {
                int i = IAuthTabCallbackStub + 63;
                asBinder = i % 128;
                int i2 = i % 2;
            }

            private static final AppLovinSdkSettings asBinder() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 81;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                Float fValueOf = Float.valueOf(0.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), Float.valueOf(0.2f), fValueOf, null, 4, null};
                Object[] objArr2 = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 100};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = IAuthTabCallback + 55;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettings;
            }

            private static final Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 91;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                attachapplovinsdk.IAuthTabCallback(400);
                Unit unit = Unit.INSTANCE;
                int i4 = onNavigationEvent + 25;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final AppLovinSdkSettings IAuthTabCallbackStub() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                Float fValueOf = Float.valueOf(0.0f);
                Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, (Float) null, fValueOf, new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$SlideFast$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallback + 69;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnNavigationEvent = mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStubProxy.onNavigationEvent((attachAppLovinSdk) obj);
                        int i5 = onExtraCallback + 95;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 57 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                }, 1, (Object) null), fValueOf, Float.valueOf(-0.2f), null, 4, null};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                int i2 = onNavigationEvent + 41;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 94 / 0;
                }
                return appLovinSdkSettings;
            }

            public final IAuthTabCallback onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 23;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                IAuthTabCallback iAuthTabCallback = onExtraCallbackWithResult;
                int i5 = i3 + 49;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return iAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final AppLovinSdkSettings asInterface() {
                Object objOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 25;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                    Float fValueOf = Float.valueOf(0.0f);
                    Object[] objArr = {isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf, Float.valueOf(1.0f), (Function1) null, 2, (Object) null), Float.valueOf(0.3f), fValueOf, null, 2, null};
                    Object[] objArr2 = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 72};
                    objOnExtraCallbackWithResult = AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                } else {
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback2 = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                    Float fValueOf2 = Float.valueOf(0.0f);
                    Object[] objArr3 = {isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback2, fValueOf2, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), Float.valueOf(0.3f), fValueOf2, null, 4, null};
                    Object[] objArr4 = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr3, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 100};
                    objOnExtraCallbackWithResult = AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr4, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                }
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objOnExtraCallbackWithResult;
                int i3 = IAuthTabCallback + 111;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return appLovinSdkSettings;
            }

            private static final Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 39;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                    i = 5815;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                    i = 300;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                return Unit.INSTANCE;
            }

            private static final AppLovinSdkSettings IAuthTabCallbackDefault() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.onTransact());
                Float fValueOf = Float.valueOf(0.0f);
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, new Object[]{isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, (Float) null, fValueOf, new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$SlideFast$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onNavigationEvent + 67;
                        onExtraCallback = i3 % 128;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i3 % 2 == 0) {
                            return mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStubProxy.IAuthTabCallback(attachapplovinsdk);
                        }
                        mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackStubProxy.IAuthTabCallback(attachapplovinsdk);
                        throw null;
                    }
                }, 1, (Object) null), fValueOf, Float.valueOf(-0.3f), null, 4, null}, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                int i2 = IAuthTabCallback + 99;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return appLovinSdkSettings;
                }
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onNavigationEvent() {
                return (AppLovinSdkSettings) onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), -1237554281, RNSScreenManagerDelegate.onNavigationEvent(), new Object[0], 1237554282, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult() {
                return (AppLovinSdkSettings) onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), 378614407, RNSScreenManagerDelegate.onNavigationEvent(), new Object[0], -378614407, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
            }
        }

        public static final class access000 {
            private static int IAuthTabCallback = 1;
            private static int asBinder = 1;
            private static int asInterface;
            private static int onNavigationEvent;
            public static final access000 onWarmupCompleted = new access000();
            private static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback(IAuthTabCallbackDefault.Char, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$SlideX$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 19;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        return mExternalSyntheticApiModelOutline1.IAuthTabCallback.access000.IAuthTabCallback();
                    }
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback.access000.IAuthTabCallback();
                    throw null;
                }
            }, 30, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$SlideX$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 35;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = mExternalSyntheticApiModelOutline1.IAuthTabCallback.access000.onNavigationEvent();
                    int i4 = onNavigationEvent + 101;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 / 0;
                    }
                    return appLovinSdkSettingsOnNavigationEvent;
                }
            }, 20, null, false, 96, null);
            private static final IAuthTabCallback onExtraCallback = new IAuthTabCallback(IAuthTabCallbackDefault.Line, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$SlideX$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 115;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.IAuthTabCallback.access000.onExtraCallbackWithResult();
                    if (i3 == 0) {
                        int i4 = 19 / 0;
                    }
                    return appLovinSdkSettingsOnExtraCallbackWithResult;
                }
            }, 60, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$SlideX$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 5;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = mExternalSyntheticApiModelOutline1.IAuthTabCallback.access000.onWarmupCompleted();
                    if (i3 == 0) {
                        int i4 = 95 / 0;
                    }
                    return appLovinSdkSettingsOnWarmupCompleted;
                }
            }, 20, null, false, 96, null);

            public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 117;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(attachapplovinsdk);
                int i4 = IAuthTabCallback + 57;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 85;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return onTransact();
                }
                onTransact();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
                int i7 = i3 | i | i6;
                int i8 = (~((~i6) | i)) | i3;
                int i9 = ~((~i3) | i);
                int i10 = i3 + i + i5 + (1132004924 * i4) + ((-2047965933) * i2);
                int i11 = i10 * i10;
                int i12 = ((1650805025 * i3) - 289800192) + ((-1513965855) * i) + ((-565098208) * i7) + (i8 * 565098208) + (565098208 * i9) + ((-2079064064) * i5) + (1823473664 * i4) + (830210048 * i2) + ((-1143341056) * i11);
                int i13 = ((i3 * (-767560105)) - 1188649921) + (i * (-767559017)) + (i7 * (-544)) + (i8 * 544) + (i9 * 544) + (i5 * (-767559561)) + (i4 * 1544553956) + (i2 * (-1468578859)) + (i11 * (-2108293120));
                return i12 + ((i13 * i13) * (-2075787264)) != 1 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 83;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackDefault = IAuthTabCallbackDefault();
                int i4 = IAuthTabCallback + 15;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return appLovinSdkSettingsIAuthTabCallbackDefault;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 93;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                    int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                    int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                    return (Unit) onExtraCallbackWithResult(-1316792464, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1316792465, new Object[]{attachapplovinsdk}, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted);
                }
                int iOnWarmupCompleted4 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                int iOnWarmupCompleted5 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                int iOnWarmupCompleted6 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 111;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return IAuthTabCallbackStub();
                }
                IAuthTabCallbackStub();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 87;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) onExtraCallbackWithResult(1329988894, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1329988894, new Object[0], iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted);
                int i4 = onNavigationEvent + 125;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return appLovinSdkSettings;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private access000() {
            }

            public final IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 83;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback iAuthTabCallback = onExtraCallbackWithResult;
                int i5 = i2 + 43;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 93 / 0;
                }
                return iAuthTabCallback;
            }

            static {
                int i = asBinder + 121;
                asInterface = i % 128;
                int i2 = i % 2;
            }

            private static final AppLovinSdkSettings onTransact() {
                Object objOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 79;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                    Float fValueOf = Float.valueOf(2.0f);
                    Object[] objArr = {isMuted.IAuthTabCallbackStubProxy(isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf, Float.valueOf(2.0f), (Function1) null, 3, (Object) null), Float.valueOf(1.5f), fValueOf, null, 5, null), 100};
                    objOnExtraCallbackWithResult = AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                } else {
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback2 = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                    Float fValueOf2 = Float.valueOf(0.0f);
                    Object[] objArr2 = {isMuted.IAuthTabCallbackStubProxy(isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback2, fValueOf2, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), Float.valueOf(1.5f), fValueOf2, null, 4, null), 40};
                    objOnExtraCallbackWithResult = AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                }
                return (AppLovinSdkSettings) objOnExtraCallbackWithResult;
            }

            private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i = 2 % 2;
                int i2 = onNavigationEvent + 15;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                attachapplovinsdk.IAuthTabCallback(250);
                Unit unit = Unit.INSTANCE;
                int i4 = IAuthTabCallback + 21;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            private static final AppLovinSdkSettings IAuthTabCallbackStub() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackStubProxy = isMuted.IAuthTabCallbackStubProxy(isMuted.onNavigationEvent(onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback()), (Float) null, Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$SlideX$$ExternalSyntheticLambda4
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallbackWithResult + 49;
                        onWarmupCompleted = i3 % 128;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i3 % 2 == 0) {
                            mExternalSyntheticApiModelOutline1.IAuthTabCallback.access000.onNavigationEvent(attachapplovinsdk);
                            throw null;
                        }
                        Unit unitOnNavigationEvent = mExternalSyntheticApiModelOutline1.IAuthTabCallback.access000.onNavigationEvent(attachapplovinsdk);
                        int i4 = onExtraCallbackWithResult + 65;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 != 0) {
                            return unitOnNavigationEvent;
                        }
                        throw null;
                    }
                }, 1, (Object) null), null, Float.valueOf(-1.0f), null, 5, null);
                int i2 = onNavigationEvent + 121;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 78 / 0;
                }
                return appLovinSdkSettingsIAuthTabCallbackStubProxy;
            }

            private static final AppLovinSdkSettings IAuthTabCallbackDefault() {
                Object objOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 25;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                    Float fValueOf = Float.valueOf(1.0f);
                    Object[] objArr = {isMuted.IAuthTabCallbackStubProxy(isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf, Float.valueOf(2.0f), (Function1) null, 4, (Object) null), Float.valueOf(0.25f), fValueOf, null, 2, null), 89};
                    objOnExtraCallbackWithResult = AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                } else {
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback2 = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                    Float fValueOf2 = Float.valueOf(0.0f);
                    Object[] objArr2 = {isMuted.IAuthTabCallbackStubProxy(isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback2, fValueOf2, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), Float.valueOf(0.25f), fValueOf2, null, 4, null), 40};
                    objOnExtraCallbackWithResult = AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr2, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                }
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objOnExtraCallbackWithResult;
                int i3 = onNavigationEvent + 101;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return appLovinSdkSettings;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                attachapplovinsdk.IAuthTabCallback(250);
                Unit unit = Unit.INSTANCE;
                int i4 = IAuthTabCallback + 119;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackStubProxy = isMuted.IAuthTabCallbackStubProxy(isMuted.onNavigationEvent(onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback()), (Float) null, Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$SlideX$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onWarmupCompleted + 51;
                        onExtraCallback = i3 % 128;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i3 % 2 == 0) {
                            mExternalSyntheticApiModelOutline1.IAuthTabCallback.access000.IAuthTabCallback(attachapplovinsdk);
                            throw null;
                        }
                        Unit unitIAuthTabCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.access000.IAuthTabCallback(attachapplovinsdk);
                        int i4 = onWarmupCompleted + 65;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            return unitIAuthTabCallback;
                        }
                        throw null;
                    }
                }, 1, (Object) null), null, Float.valueOf(-0.25f), null, 5, null);
                int i2 = onNavigationEvent + 21;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return appLovinSdkSettingsIAuthTabCallbackStubProxy;
                }
                throw null;
            }

            private static final Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
                int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                return (Unit) onExtraCallbackWithResult(-1316792464, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1316792465, new Object[]{attachapplovinsdk}, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted);
            }

            private static final AppLovinSdkSettings asInterface() {
                int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                return (AppLovinSdkSettings) onExtraCallbackWithResult(1329988894, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1329988894, new Object[0], iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted);
            }
        }

        public static final class onExtraCallbackWithResult {
            private static int asInterface = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
            private static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback(IAuthTabCallbackDefault.Line, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Fade$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 91;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallback();
                    }
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, 0, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Fade$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 123;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted();
                    int i4 = onExtraCallback + 61;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return appLovinSdkSettingsOnWarmupCompleted;
                }
            }, 0, null, false, 96, null);

            public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 57;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onExtraCallback();
                }
                onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 45;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    onExtraCallbackWithResult();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i3 = onNavigationEvent + 65;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return appLovinSdkSettingsOnExtraCallbackWithResult;
            }

            private onExtraCallbackWithResult() {
            }

            public final IAuthTabCallback onNavigationEvent() {
                IAuthTabCallback iAuthTabCallback;
                int i = 2 % 2;
                int i2 = onExtraCallback + 77;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                if (i2 % 2 == 0) {
                    iAuthTabCallback = onWarmupCompleted;
                    int i4 = 28 / 0;
                } else {
                    iAuthTabCallback = onWarmupCompleted;
                }
                int i5 = i3 + 109;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 36 / 0;
                }
                return iAuthTabCallback;
            }

            static {
                int i = onExtraCallbackWithResult + 1;
                asInterface = i % 128;
                int i2 = i % 2;
            }

            private static final AppLovinSdkSettings onExtraCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 97;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {isMuted.onNavigationEvent(onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallbackStub()), Float.valueOf(0.0f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null), 200};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = onNavigationEvent + 35;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettings;
            }

            private static final AppLovinSdkSettings onExtraCallbackWithResult() {
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback;
                Float f;
                Float fValueOf;
                Function1 function1;
                int i;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 1;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.onTransact());
                    f = null;
                    fValueOf = Float.valueOf(1.0f);
                    function1 = null;
                    i = 4;
                } else {
                    appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.onTransact());
                    f = null;
                    fValueOf = Float.valueOf(0.0f);
                    function1 = null;
                    i = 5;
                }
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, f, fValueOf, function1, i, (Object) null);
                int i4 = onExtraCallback + 65;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettingsOnNavigationEvent;
            }
        }

        public static final class asInterface {
            private static int asInterface = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            public static final asInterface IAuthTabCallback = new asInterface();
            private static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback(IAuthTabCallbackDefault.Char, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Rotate$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 29;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        mExternalSyntheticApiModelOutline1.IAuthTabCallback.asInterface.onWarmupCompleted();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = mExternalSyntheticApiModelOutline1.IAuthTabCallback.asInterface.onWarmupCompleted();
                    int i3 = onExtraCallbackWithResult + 91;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return appLovinSdkSettingsOnWarmupCompleted;
                }
            }, 30, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Rotate$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 41;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        mExternalSyntheticApiModelOutline1.IAuthTabCallback.asInterface.onNavigationEvent();
                        throw null;
                    }
                    AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = mExternalSyntheticApiModelOutline1.IAuthTabCallback.asInterface.onNavigationEvent();
                    int i3 = onExtraCallback + 61;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return appLovinSdkSettingsOnNavigationEvent;
                }
            }, 0, null, false, 96, null);

            public static /* synthetic */ AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 3;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = IAuthTabCallback();
                int i4 = onExtraCallbackWithResult + 59;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 21 / 0;
                }
                return appLovinSdkSettingsIAuthTabCallback;
            }

            public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 95;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    onExtraCallbackWithResult();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i3 = onExtraCallbackWithResult + 119;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return appLovinSdkSettingsOnExtraCallbackWithResult;
            }

            private asInterface() {
            }

            public final IAuthTabCallback onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 91;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback iAuthTabCallback = onNavigationEvent;
                int i5 = i2 + 55;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return iAuthTabCallback;
                }
                throw null;
            }

            static {
                int i = onWarmupCompleted + 13;
                asInterface = i % 128;
                int i2 = i % 2;
            }

            private static final AppLovinSdkSettings onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onExtraCallbackWithResult(), 550}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141);
                Float fValueOf = Float.valueOf(0.0f);
                Float fValueOf2 = Float.valueOf(1.0f);
                Object[] objArr = {isMuted.access000(isMuted.asInterface(isMuted.onWarmupCompleted(isMuted.onNavigationEvent(appLovinSdkSettings, fValueOf, fValueOf2, (Function1) null, 4, (Object) null), Float.valueOf(15.0f), fValueOf, (Function1) null, 4, (Object) null), fValueOf, fValueOf, (Function1) null, 4, (Object) null), fValueOf2, fValueOf2, null, 4, null), 100};
                AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i4 = onExtraCallback + 51;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return appLovinSdkSettings2;
                }
                throw null;
            }

            private static final AppLovinSdkSettings IAuthTabCallback() {
                AppLovinSdkSettings appLovinSdkSettings;
                Float f;
                Float fValueOf;
                Function1 function1;
                int i;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 113;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    appLovinSdkSettings = (AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onTransact(), 31782}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141);
                    f = null;
                    fValueOf = Float.valueOf(1.0f);
                    function1 = null;
                    i = 4;
                } else {
                    appLovinSdkSettings = (AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onTransact(), 200}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141);
                    f = null;
                    fValueOf = Float.valueOf(0.0f);
                    function1 = null;
                    i = 5;
                }
                return isMuted.onNavigationEvent(appLovinSdkSettings, f, fValueOf, function1, i, (Object) null);
            }
        }

        public static final class onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int asInterface = 1;
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();
            private static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback(IAuthTabCallbackDefault.Line, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$FadeShort$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 113;
                    onExtraCallbackWithResult = i2 % 128;
                    Object obj = null;
                    if (i2 % 2 == 0) {
                        mExternalSyntheticApiModelOutline1.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult();
                        obj.hashCode();
                        throw null;
                    }
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult();
                    int i3 = onWarmupCompleted + 99;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        return appLovinSdkSettingsOnExtraCallbackWithResult;
                    }
                    obj.hashCode();
                    throw null;
                }
            }, 40, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$FadeShort$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 113;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onWarmupCompleted.IAuthTabCallback();
                    int i4 = onNavigationEvent + 67;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return appLovinSdkSettingsIAuthTabCallback;
                }
            }, 0, null, false, 96, null);

            public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback() {
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 59;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    appLovinSdkSettingsOnNavigationEvent = onNavigationEvent();
                    int i3 = 69 / 0;
                } else {
                    appLovinSdkSettingsOnNavigationEvent = onNavigationEvent();
                }
                int i4 = onNavigationEvent + 83;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return appLovinSdkSettingsOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 19;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onExtraCallback();
                int i4 = onNavigationEvent + 113;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return appLovinSdkSettingsOnExtraCallback;
                }
                throw null;
            }

            private onWarmupCompleted() {
            }

            static {
                int i = IAuthTabCallback + 21;
                asInterface = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            private static final AppLovinSdkSettings onExtraCallback() {
                int i = 2 % 2;
                Object[] objArr = {isMuted.onNavigationEvent(RallysKt.onExtraCallback(new LinearInterpolator(), 400), Float.valueOf(0.0f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null), 200};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i2 = onExtraCallback + 119;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return appLovinSdkSettings;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final AppLovinSdkSettings onNavigationEvent() {
                AppLovinSdkSettings appLovinSdkSettings;
                Float f;
                Float fValueOf;
                int i = 2 % 2;
                int i2 = onExtraCallback + 69;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    appLovinSdkSettings = (AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onExtraCallback(), 21976}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141);
                    f = null;
                    fValueOf = Float.valueOf(2.0f);
                } else {
                    appLovinSdkSettings = (AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onExtraCallback(), 600}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141);
                    f = null;
                    fValueOf = Float.valueOf(0.0f);
                }
                return isMuted.onNavigationEvent(appLovinSdkSettings, f, fValueOf, (Function1) null, 5, (Object) null);
            }
        }

        /* renamed from: o.mExternalSyntheticApiModelOutline1$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0040IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int asInterface = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            public static final C0040IAuthTabCallback onExtraCallback = new C0040IAuthTabCallback();
            private static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback(IAuthTabCallbackDefault.Char, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Blur$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 89;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        mExternalSyntheticApiModelOutline1.IAuthTabCallback.C0040IAuthTabCallback.onWarmupCompleted();
                        throw null;
                    }
                    AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = mExternalSyntheticApiModelOutline1.IAuthTabCallback.C0040IAuthTabCallback.onWarmupCompleted();
                    int i3 = onWarmupCompleted + 85;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        return appLovinSdkSettingsOnWarmupCompleted;
                    }
                    throw null;
                }
            }, 50, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Blur$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 97;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.IAuthTabCallback.C0040IAuthTabCallback.onExtraCallbackWithResult();
                    int i4 = onExtraCallback + 63;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        return appLovinSdkSettingsOnExtraCallbackWithResult;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, 0, null, false, 96, null);

            public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onTransact(attachapplovinsdk);
                }
                onTransact(attachapplovinsdk);
                throw null;
            }

            public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    onExtraCallback(attachapplovinsdk);
                    throw null;
                }
                Unit unitOnExtraCallback = onExtraCallback(attachapplovinsdk);
                int i3 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iOnExtraCallback = matches.onExtraCallback();
                int iOnExtraCallback2 = matches.onExtraCallback();
                int iOnExtraCallback3 = matches.onExtraCallback();
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) onNavigationEvent(iOnExtraCallback2, iOnExtraCallback, matches.onExtraCallback(), new Object[0], -547274980, 547274980, iOnExtraCallback3);
                int i4 = onExtraCallbackWithResult + 65;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettings;
            }

            public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
                int i7 = i4 | i2;
                int i8 = ~((~i2) | i4);
                int i9 = ~i4;
                int i10 = i8 | (~(i9 | i5 | i2));
                int i11 = (~(i2 | i9)) | i5;
                int i12 = i4 + i5 + i + (2127773517 * i6) + (1026174006 * i3);
                int i13 = i12 * i12;
                int i14 = (i4 * (-484454144)) + 743702528 + ((-484454144) * i5) + (i7 * (-1605095679)) + (1605095679 * i10) + ((-1605095679) * i11) + ((-2089549824) * i) + (367263744 * i6) + ((-1434976256) * i3) + (1105526784 * i13);
                int i15 = (i4 * 21308160) + 1622758390 + (i5 * 21308160) + (i7 * 947) + (i10 * (-947)) + (i11 * 947) + (i * 21309107) + (i6 * 1708896471) + (i3 * 664464834) + (i13 * 287244288);
                return i14 + ((i15 * i15) * 966983680) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
            }

            public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAsInterface = asInterface(attachapplovinsdk);
                int i4 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitAsInterface;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 39;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iOnExtraCallback = matches.onExtraCallback();
                int iOnExtraCallback2 = matches.onExtraCallback();
                int iOnExtraCallback3 = matches.onExtraCallback();
                Unit unit = (Unit) onNavigationEvent(iOnExtraCallback2, iOnExtraCallback, matches.onExtraCallback(), new Object[]{attachapplovinsdk}, -353097672, 353097673, iOnExtraCallback3);
                int i4 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    onExtraCallback();
                    throw null;
                }
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onExtraCallback();
                int i3 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 80 / 0;
                }
                return appLovinSdkSettingsOnExtraCallback;
            }

            private C0040IAuthTabCallback() {
            }

            static {
                int i = onWarmupCompleted + 117;
                asInterface = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 39;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(1000);
                Unit unit = Unit.INSTANCE;
                int i4 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit asInterface(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    i = 4522;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    i = 2200;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                return Unit.INSTANCE;
            }

            private static final AppLovinSdkSettings onExtraCallback() {
                int i = 2 % 2;
                Object[] objArr = {(AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onTransact(), 1000}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), deprecated_directory.Medium, deprecated_directory.None, new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Blur$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = IAuthTabCallback + 103;
                        onNavigationEvent = i3 % 128;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i3 % 2 != 0) {
                            return mExternalSyntheticApiModelOutline1.IAuthTabCallback.C0040IAuthTabCallback.onExtraCallbackWithResult(attachapplovinsdk);
                        }
                        mExternalSyntheticApiModelOutline1.IAuthTabCallback.C0040IAuthTabCallback.onExtraCallbackWithResult(attachapplovinsdk);
                        throw null;
                    }
                }};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -2050354086, objArr, 2050354118, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                Float fValueOf = Float.valueOf(1.0f);
                AppLovinSdkSettings appLovinSdkSettingsOnTransact = isMuted.onTransact(isMuted.onExtraCallback(appLovinSdkSettings, Float.valueOf(0.0f), fValueOf, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Blur$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onNavigationEvent + 63;
                        IAuthTabCallback = i3 % 128;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i3 % 2 != 0) {
                            mExternalSyntheticApiModelOutline1.IAuthTabCallback.C0040IAuthTabCallback.onNavigationEvent(attachapplovinsdk);
                            throw null;
                        }
                        Unit unitOnNavigationEvent = mExternalSyntheticApiModelOutline1.IAuthTabCallback.C0040IAuthTabCallback.onNavigationEvent(attachapplovinsdk);
                        int i4 = IAuthTabCallback + 43;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 71 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                }), Float.valueOf(0.5f), fValueOf, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Blur$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onNavigationEvent + 103;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitIAuthTabCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.C0040IAuthTabCallback.IAuthTabCallback((attachAppLovinSdk) obj);
                        if (i4 != 0) {
                            int i5 = 83 / 0;
                        }
                        int i6 = onExtraCallback + 85;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        return unitIAuthTabCallback;
                    }
                });
                int i2 = IAuthTabCallback + 101;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return appLovinSdkSettingsOnTransact;
            }

            private static final Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(1000);
                Unit unit = Unit.INSTANCE;
                int i4 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
                int i;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    i = 21221;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    i = 400;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                return Unit.INSTANCE;
            }

            private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsAsBinder = isMuted.asBinder(isMuted.onNavigationEvent(isMuted.IAuthTabCallback((AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onTransact(), 800}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), (deprecated_directory) null, deprecated_directory.Medium, (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Blur$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallback + 99;
                        onNavigationEvent = i3 % 128;
                        Object obj2 = null;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i3 % 2 == 0) {
                            mExternalSyntheticApiModelOutline1.IAuthTabCallback.C0040IAuthTabCallback.onWarmupCompleted(attachapplovinsdk);
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = mExternalSyntheticApiModelOutline1.IAuthTabCallback.C0040IAuthTabCallback.onWarmupCompleted(attachapplovinsdk);
                        int i4 = onNavigationEvent + 109;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        throw null;
                    }
                }, 1, (Object) null), null, Float.valueOf(0.5f), null, 5, null);
                int i2 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return appLovinSdkSettingsAsBinder;
            }

            private static final AppLovinSdkSettings onNavigationEvent() {
                int iOnExtraCallback = matches.onExtraCallback();
                int iOnExtraCallback2 = matches.onExtraCallback();
                int iOnExtraCallback3 = matches.onExtraCallback();
                return (AppLovinSdkSettings) onNavigationEvent(iOnExtraCallback2, iOnExtraCallback, matches.onExtraCallback(), new Object[0], -547274980, 547274980, iOnExtraCallback3);
            }

            private static final Unit IAuthTabCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
                int iOnExtraCallback = matches.onExtraCallback();
                int iOnExtraCallback2 = matches.onExtraCallback();
                int iOnExtraCallback3 = matches.onExtraCallback();
                return (Unit) onNavigationEvent(iOnExtraCallback2, iOnExtraCallback, matches.onExtraCallback(), new Object[]{attachapplovinsdk}, -353097672, 353097673, iOnExtraCallback3);
            }
        }

        public static final class onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int asBinder = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
            private static final IAuthTabCallback onExtraCallback = new IAuthTabCallback(IAuthTabCallbackDefault.Char, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$BlurZoom$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 45;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallback.onWarmupCompleted();
                    }
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallback.onWarmupCompleted();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, 50, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$BlurZoom$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 99;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallback.onNavigationEvent();
                    int i4 = onExtraCallbackWithResult + 27;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return appLovinSdkSettingsOnNavigationEvent;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, 0, null, false, 96, null);

            public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
                int i7 = ~i;
                int i8 = ~i4;
                int i9 = ~(i7 | i8);
                int i10 = (~((~i3) | i8)) | i9;
                int i11 = i | i4;
                int i12 = (~(i3 | i8)) | i9;
                int i13 = i + i4 + i6 + (1258674323 * i2) + ((-126594725) * i5);
                int i14 = i13 * i13;
                int i15 = ((-1449289074) * i) + 1954676736 + ((-212912869) * i4) + (i10 * (-1236376205)) + (i11 * (-1236376205)) + ((-1236376205) * i12) + (1609302016 * i6) + (881065984 * i2) + ((-991690752) * i5) + ((-541982720) * i14);
                int i16 = ((i * (-1656160718)) - 817430035) + (i4 * (-1656161339)) + (i10 * 621) + (i11 * 621) + (i12 * 621) + (i6 * (-1656160097)) + (i2 * (-2121497779)) + (i5 * 1378977669) + (i14 * (-275906560));
                if (i15 + (i16 * i16 * (-372375552)) != 1) {
                    return onExtraCallbackWithResult(objArr);
                }
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i17 = 2 % 2;
                int i18 = onWarmupCompleted + 95;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(1000);
                Unit unit = Unit.INSTANCE;
                int i20 = onNavigationEvent + 29;
                onWarmupCompleted = i20 % 128;
                int i21 = i20 % 2;
                return unit;
            }

            public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 7;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    asBinder(attachapplovinsdk);
                    throw null;
                }
                Unit unitAsBinder = asBinder(attachapplovinsdk);
                int i3 = onWarmupCompleted + 87;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return unitAsBinder;
            }

            private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 111;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(attachapplovinsdk);
                int i4 = onWarmupCompleted + 35;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitIAuthTabCallbackDefault;
                }
                throw null;
            }

            public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 23;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = onExtraCallback(attachapplovinsdk);
                int i4 = onWarmupCompleted + 29;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 69;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = IAuthTabCallback();
                int i4 = onNavigationEvent + 19;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettingsIAuthTabCallback;
            }

            public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 115;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = (Unit) IAuthTabCallback(new Object[]{attachapplovinsdk}, 1849501287, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -1849501286, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
                int i4 = onWarmupCompleted + 91;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 95;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i4 = onWarmupCompleted + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettingsOnExtraCallbackWithResult;
            }

            private onExtraCallback() {
            }

            static {
                int i = IAuthTabCallback + 101;
                asBinder = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 89;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    i = 7688;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    i = 1000;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                return Unit.INSTANCE;
            }

            private static final Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 51;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    i = 29467;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    i = 2200;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                return Unit.INSTANCE;
            }

            private static final AppLovinSdkSettings onExtraCallbackWithResult() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -2050354086, new Object[]{(AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onTransact(), 1000}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), deprecated_directory.Medium, deprecated_directory.None, new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$BlurZoom$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = IAuthTabCallback + 21;
                        onWarmupCompleted = i3 % 128;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i3 % 2 == 0) {
                            mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallback.onNavigationEvent(attachapplovinsdk);
                            throw null;
                        }
                        Unit unitOnNavigationEvent = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallback.onNavigationEvent(attachapplovinsdk);
                        int i4 = onWarmupCompleted + 39;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 83 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                }}, 2050354118, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                Float fValueOf = Float.valueOf(1.0f);
                AppLovinSdkSettings appLovinSdkSettingsOnTransact = isMuted.onTransact(isMuted.onExtraCallback(appLovinSdkSettings, Float.valueOf(0.0f), fValueOf, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$BlurZoom$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallbackWithResult + 105;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitIAuthTabCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallback.IAuthTabCallback((attachAppLovinSdk) obj);
                        if (i4 != 0) {
                            int i5 = 40 / 0;
                        }
                        int i6 = onExtraCallback + 25;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 != 0) {
                            return unitIAuthTabCallback;
                        }
                        throw null;
                    }
                }), Float.valueOf(3.0f), fValueOf, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$BlurZoom$$ExternalSyntheticLambda5
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onNavigationEvent + 81;
                        onWarmupCompleted = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnWarmupCompleted = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallback.onWarmupCompleted((attachAppLovinSdk) obj);
                        int i5 = onWarmupCompleted + 19;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 != 0) {
                            return unitOnWarmupCompleted;
                        }
                        throw null;
                    }
                });
                int i2 = onWarmupCompleted + 65;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return appLovinSdkSettingsOnTransact;
            }

            private static final Unit IAuthTabCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 79;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(400);
                Unit unit = Unit.INSTANCE;
                int i4 = onWarmupCompleted + 25;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final AppLovinSdkSettings IAuthTabCallback() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsAsBinder = isMuted.asBinder(isMuted.onNavigationEvent(isMuted.IAuthTabCallback((AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onTransact(), 800}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), (deprecated_directory) null, deprecated_directory.Medium, (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$BlurZoom$$ExternalSyntheticLambda2
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallbackWithResult + 89;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Object[] objArr = {(attachAppLovinSdk) obj};
                        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
                        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
                        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
                        int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
                        if (i4 == 0) {
                            return (Unit) mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallback.IAuthTabCallback(objArr, -1361153508, iIAuthTabCallback3, iIAuthTabCallback, 1361153508, iIAuthTabCallback4, iIAuthTabCallback2);
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, 1, (Object) null), null, Float.valueOf(0.5f), null, 5, null);
                int i2 = onNavigationEvent + 95;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return appLovinSdkSettingsAsBinder;
            }

            public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                return (Unit) IAuthTabCallback(new Object[]{attachapplovinsdk}, -1361153508, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 1361153508, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
            }

            private static final Unit IAuthTabCallbackStub(attachAppLovinSdk attachapplovinsdk) {
                return (Unit) IAuthTabCallback(new Object[]{attachapplovinsdk}, 1849501287, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -1849501286, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
            }
        }

        public static final class onNavigationEvent {
            private static int IAuthTabCallback = 0;
            private static int asBinder = 1;
            private static int onExtraCallback = 1;
            public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
            private static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback(IAuthTabCallbackDefault.Line, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$BlurSlide$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 41;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        mExternalSyntheticApiModelOutline1.IAuthTabCallback.onNavigationEvent.onExtraCallbackWithResult();
                        throw null;
                    }
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onNavigationEvent.onExtraCallbackWithResult();
                    int i3 = IAuthTabCallback + 115;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        return appLovinSdkSettingsOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            }, 180, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$BlurSlide$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 17;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return mExternalSyntheticApiModelOutline1.IAuthTabCallback.onNavigationEvent.onWarmupCompleted();
                    }
                    mExternalSyntheticApiModelOutline1.IAuthTabCallback.onNavigationEvent.onWarmupCompleted();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, 0, null, false, 96, null);
            private static int onWarmupCompleted;

            public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 39;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAsInterface = asInterface(attachapplovinsdk);
                if (i3 == 0) {
                    int i4 = 28 / 0;
                }
                int i5 = onExtraCallback + 59;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitAsInterface;
            }

            public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 3;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
                int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
                Unit unit = (Unit) onNavigationEvent(iIAuthTabCallback, forceDomainCheck.IAuthTabCallback(), -510300647, 510300648, iIAuthTabCallback2, forceDomainCheck.IAuthTabCallback(), new Object[]{attachapplovinsdk});
                int i4 = IAuthTabCallback + 29;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 57;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
                int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) onNavigationEvent(iIAuthTabCallback, forceDomainCheck.IAuthTabCallback(), -895620379, 895620379, iIAuthTabCallback2, forceDomainCheck.IAuthTabCallback(), new Object[0]);
                int i4 = IAuthTabCallback + 77;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettings;
            }

            public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
                int i7;
                int i8 = ~i3;
                int i9 = ~i4;
                int i10 = ~i;
                int i11 = (~(i9 | i10)) | i8;
                int i12 = ~(i | i4);
                int i13 = i11 | i12;
                int i14 = (~(i8 | i4)) | (~(i8 | i10)) | (~(i10 | i4));
                int i15 = i4 + i3 + i5 + (669352129 * i2) + (266941808 * i6);
                int i16 = i15 * i15;
                int i17 = (720661947 * i4) + 1572077568 + ((-1243901369) * i3) + (1165201990 * i13) + (i12 * (-1165201990)) + ((-1165201990) * i14) + (1885863936 * i5) + ((-1100480512) * i2) + ((-1249902592) * i6) + ((-491520000) * i16);
                int i18 = (i4 * 1617402437) + 56426783 + (i3 * 1617401273) + (i13 * (-582)) + (i12 * 582) + (i14 * 582) + (i5 * 1617401855) + (i2 * 1244927807) + (i6 * (-404665712)) + (i16 * (-45350912));
                if (i17 + (i18 * i18 * 1565261824) != 1) {
                    return onExtraCallbackWithResult(objArr);
                }
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i19 = 2 % 2;
                int i20 = IAuthTabCallback + 81;
                onExtraCallback = i20 % 128;
                if (i20 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    i7 = 21427;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    i7 = 1000;
                }
                attachapplovinsdk.IAuthTabCallback(i7);
                Unit unit = Unit.INSTANCE;
                int i21 = onExtraCallback + 61;
                IAuthTabCallback = i21 % 128;
                int i22 = i21 % 2;
                return unit;
            }

            public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 95;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    onTransact(attachapplovinsdk);
                    throw null;
                }
                Unit unitOnTransact = onTransact(attachapplovinsdk);
                int i3 = IAuthTabCallback + 3;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 35 / 0;
                }
                return unitOnTransact;
            }

            public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 69;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(attachapplovinsdk);
                int i4 = onExtraCallback + 23;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallbackStub;
            }

            public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted() {
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 81;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    appLovinSdkSettingsOnExtraCallback = onExtraCallback();
                    int i3 = 28 / 0;
                } else {
                    appLovinSdkSettingsOnExtraCallback = onExtraCallback();
                }
                int i4 = onExtraCallback + 43;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return appLovinSdkSettingsOnExtraCallback;
                }
                throw null;
            }

            private onNavigationEvent() {
            }

            public final IAuthTabCallback IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 11;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback iAuthTabCallback = onNavigationEvent;
                int i5 = i2 + 1;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 84 / 0;
                }
                return iAuthTabCallback;
            }

            static {
                int i = onWarmupCompleted + 35;
                asBinder = i % 128;
                int i2 = i % 2;
            }

            private static final Unit IAuthTabCallbackStub(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 69;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(2200);
                Unit unit = Unit.INSTANCE;
                int i4 = IAuthTabCallback + 5;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
                int i = 2 % 2;
                Object[] objArr2 = {(AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onTransact(), 2200}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), deprecated_directory.Medium, deprecated_directory.None, new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$BlurSlide$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onWarmupCompleted + 9;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnExtraCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onNavigationEvent.onExtraCallback((attachAppLovinSdk) obj);
                        int i5 = onExtraCallback + 5;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        return unitOnExtraCallback;
                    }
                }};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -2050354086, objArr2, 2050354118, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                Float fValueOf = Float.valueOf(0.0f);
                AppLovinSdkSettings appLovinSdkSettingsAccess100 = isMuted.access100(isMuted.onExtraCallback(appLovinSdkSettings, fValueOf, Float.valueOf(1.0f), (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$BlurSlide$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallbackWithResult + 11;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnWarmupCompleted = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onNavigationEvent.onWarmupCompleted((attachAppLovinSdk) obj);
                        if (i4 == 0) {
                            int i5 = 22 / 0;
                        }
                        int i6 = onNavigationEvent + 119;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        throw null;
                    }
                }), Float.valueOf(1.5f), fValueOf, new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$BlurSlide$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onNavigationEvent + 69;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnNavigationEvent = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onNavigationEvent.onNavigationEvent((attachAppLovinSdk) obj);
                        if (i4 == 0) {
                            int i5 = 11 / 0;
                        }
                        int i6 = IAuthTabCallback + 101;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        return unitOnNavigationEvent;
                    }
                });
                int i2 = onExtraCallback + 57;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return appLovinSdkSettingsAccess100;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 19;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onExtraCallback());
                    attachapplovinsdk.IAuthTabCallback(29984);
                    i = 30116;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onExtraCallback());
                    attachapplovinsdk.IAuthTabCallback(1250);
                    i = 300;
                }
                attachapplovinsdk.onExtraCallback(i);
                return Unit.INSTANCE;
            }

            private static final Unit asInterface(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 35;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.IAuthTabCallback(400);
                Unit unit = Unit.INSTANCE;
                int i4 = IAuthTabCallback + 69;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final AppLovinSdkSettings onExtraCallback() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, new Object[]{isMuted.onNavigationEvent(isMuted.IAuthTabCallback((AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onTransact(), 800}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), (deprecated_directory) null, deprecated_directory.Medium, (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$BlurSlide$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallbackWithResult + 107;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitIAuthTabCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.onNavigationEvent.IAuthTabCallback((attachAppLovinSdk) obj);
                        if (i4 == 0) {
                            int i5 = 11 / 0;
                        }
                        return unitIAuthTabCallback;
                    }
                }, 1, (Object) null), null, Float.valueOf(-0.5f), null, 5, null}, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                int i2 = onExtraCallback + 55;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 91 / 0;
                }
                return appLovinSdkSettings;
            }

            private static final AppLovinSdkSettings onNavigationEvent() {
                int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
                int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
                return (AppLovinSdkSettings) onNavigationEvent(iIAuthTabCallback, forceDomainCheck.IAuthTabCallback(), -895620379, 895620379, iIAuthTabCallback2, forceDomainCheck.IAuthTabCallback(), new Object[0]);
            }

            private static final Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
                int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
                return (Unit) onNavigationEvent(iIAuthTabCallback, forceDomainCheck.IAuthTabCallback(), -510300647, 510300648, iIAuthTabCallback2, forceDomainCheck.IAuthTabCallback(), new Object[]{attachapplovinsdk});
            }
        }

        public static final class IAuthTabCallbackDefault {
            private static int IAuthTabCallback = 1;
            private static int IAuthTabCallbackDefault = 1;
            private static int onExtraCallback;
            private static int onExtraCallbackWithResult;
            public static final IAuthTabCallbackDefault onWarmupCompleted = new IAuthTabCallbackDefault();
            private static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback(IAuthTabCallbackDefault.None, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Rotate3D$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    AppLovinSdkSettings appLovinSdkSettings;
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 111;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        int iOnExtraCallback = getKekid.onExtraCallback();
                        int iOnExtraCallback2 = getKekid.onExtraCallback();
                        int iOnExtraCallback3 = getKekid.onExtraCallback();
                        appLovinSdkSettings = (AppLovinSdkSettings) mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackDefault.IAuthTabCallback(760598469, iOnExtraCallback, getKekid.onExtraCallback(), iOnExtraCallback3, new Object[0], iOnExtraCallback2, -760598468);
                        int i3 = 49 / 0;
                    } else {
                        int iOnExtraCallback4 = getKekid.onExtraCallback();
                        int iOnExtraCallback5 = getKekid.onExtraCallback();
                        int iOnExtraCallback6 = getKekid.onExtraCallback();
                        appLovinSdkSettings = (AppLovinSdkSettings) mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackDefault.IAuthTabCallback(760598469, iOnExtraCallback4, getKekid.onExtraCallback(), iOnExtraCallback6, new Object[0], iOnExtraCallback5, -760598468);
                    }
                    int i4 = onWarmupCompleted + 21;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 72 / 0;
                    }
                    return appLovinSdkSettings;
                }
            }, 0, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Rotate3D$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 99;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackDefault.onNavigationEvent();
                    int i4 = IAuthTabCallback + 103;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return appLovinSdkSettingsOnNavigationEvent;
                }
            }, 0, 80, false, 64, null);

            public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
                int i7 = ~i6;
                int i8 = ~(i7 | i);
                int i9 = ~i2;
                int i10 = ~(i9 | i);
                int i11 = i8 | i10;
                int i12 = ~i;
                int i13 = ~(i12 | i6);
                int i14 = (~(i2 | i7)) | i13 | i10;
                int i15 = (~(i9 | i6)) | (~(i12 | i9)) | i13;
                int i16 = i + i6 + i5 + ((-954185507) * i4) + (2055044340 * i3);
                int i17 = i16 * i16;
                int i18 = ((1110557339 * i) - 760807424) + ((-878567756) * i6) + ((-1537228134) * i11) + (i14 * 768614067) + (768614067 * i15) + ((-1647181824) * i5) + (1313472512 * i4) + (606601216 * i3) + ((-1232666624) * i17);
                int i19 = (i * 1290134917) + 267690129 + (i6 * 1290136780) + (i11 * (-1242)) + (i14 * 621) + (i15 * 621) + (i5 * 1290136159) + (i4 * 826674179) + (i3 * 1594648204) + (i17 * 572063744);
                return i18 + ((i19 * i19) * 607715328) != 1 ? onExtraCallback(objArr) : onNavigationEvent(objArr);
            }

            public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(attachapplovinsdk);
                int i4 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallbackWithResult;
            }

            private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    asBinder(attachapplovinsdk);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitAsBinder = asBinder(attachapplovinsdk);
                int i3 = IAuthTabCallback + 105;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 62 / 0;
                }
                return unitAsBinder;
            }

            public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(attachapplovinsdk);
                int i4 = onExtraCallbackWithResult + 47;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }

            private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return IAuthTabCallback();
                }
                IAuthTabCallback();
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 49;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onExtraCallback();
                int i4 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 98 / 0;
                }
                return appLovinSdkSettingsOnExtraCallback;
            }

            private IAuthTabCallbackDefault() {
            }

            static {
                int i = onExtraCallback + 73;
                IAuthTabCallbackDefault = i % 128;
                if (i % 2 == 0) {
                    int i2 = 78 / 0;
                }
            }

            private static final Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 31;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    i = 17364;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    i = 800;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                Unit unit = Unit.INSTANCE;
                int i4 = IAuthTabCallback + 55;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final AppLovinSdkSettings IAuthTabCallback() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onTransact(), 500}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141);
                Float fValueOf = Float.valueOf(0.0f);
                Float fValueOf2 = Float.valueOf(1.0f);
                Object[] objArr = {isMuted.onExtraCallback(appLovinSdkSettings, fValueOf, fValueOf2, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Rotate3D$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = IAuthTabCallback + 43;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitOnExtraCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackDefault.onExtraCallback((attachAppLovinSdk) obj);
                        if (i4 != 0) {
                            int i5 = 4 / 0;
                        }
                        return unitOnExtraCallback;
                    }
                }), Float.valueOf(0.5f), fValueOf, null, 4, null};
                Object[] objArr2 = {isMuted.IAuthTabCallback(isMuted.onWarmupCompleted(isMuted.asBinder((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Float.valueOf(0.8f), fValueOf2, null, 4, null).onExtraCallback(getVersionCode.STRONG), Float.valueOf(-10.0f), fValueOf, (Function1) null, 4, (Object) null), Float.valueOf(-90.0f), fValueOf, (Function1) null, 4, (Object) null), Float.valueOf(10.0f), fValueOf, null, 4, null};
                AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1818891848, objArr2, 1818891874, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                int i2 = onExtraCallbackWithResult + 75;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return appLovinSdkSettings2;
            }

            private static final Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 57;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getIconContentView.onWarmupCompleted.onExtraCallbackWithResult());
                Unit unit = Unit.INSTANCE;
                int i4 = IAuthTabCallback + 77;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 57;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                attachapplovinsdk.IAuthTabCallback(760);
                Unit unit = Unit.INSTANCE;
                int i4 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final AppLovinSdkSettings onExtraCallback() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                Float fValueOf = Float.valueOf(1.0f);
                Float fValueOf2 = Float.valueOf(0.0f);
                Object[] objArr = {isMuted.onExtraCallback(appLovinSdkSettingsOnExtraCallback, fValueOf, fValueOf2, (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Rotate3D$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onNavigationEvent + 61;
                        onWarmupCompleted = i3 % 128;
                        int i4 = i3 % 2;
                        Unit unitIAuthTabCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackDefault.IAuthTabCallback((attachAppLovinSdk) obj);
                        int i5 = onWarmupCompleted + 123;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        return unitIAuthTabCallback;
                    }
                }), fValueOf2, Float.valueOf(-1.0f), null, 4, null};
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback2 = isMuted.onTransact((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), fValueOf, Float.valueOf(0.7f), (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Rotate3D$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = IAuthTabCallback + 67;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        int iOnExtraCallback = getKekid.onExtraCallback();
                        int iOnExtraCallback2 = getKekid.onExtraCallback();
                        int iOnExtraCallback3 = getKekid.onExtraCallback();
                        Unit unit = (Unit) mExternalSyntheticApiModelOutline1.IAuthTabCallback.IAuthTabCallbackDefault.IAuthTabCallback(1978984273, iOnExtraCallback, getKekid.onExtraCallback(), iOnExtraCallback3, new Object[]{(attachAppLovinSdk) obj}, iOnExtraCallback2, -1978984273);
                        int i5 = IAuthTabCallback + 121;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 65 / 0;
                        }
                        return unit;
                    }
                }).onExtraCallback(getVersionCode.STRONG);
                Float fValueOf3 = Float.valueOf(-10.0f);
                Object[] objArr2 = {isMuted.IAuthTabCallback(isMuted.onWarmupCompleted(appLovinSdkSettingsOnExtraCallback2, fValueOf2, fValueOf3, (Function1) null, 4, (Object) null), fValueOf2, Float.valueOf(90.0f), (Function1) null, 4, (Object) null), fValueOf2, fValueOf3, null, 4, null};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1818891848, objArr2, 1818891874, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                int i2 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return appLovinSdkSettings;
                }
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult() {
                int iOnExtraCallback = getKekid.onExtraCallback();
                int iOnExtraCallback2 = getKekid.onExtraCallback();
                int iOnExtraCallback3 = getKekid.onExtraCallback();
                return (AppLovinSdkSettings) IAuthTabCallback(760598469, iOnExtraCallback, getKekid.onExtraCallback(), iOnExtraCallback3, new Object[0], iOnExtraCallback2, -760598468);
            }

            public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
                int iOnExtraCallback = getKekid.onExtraCallback();
                int iOnExtraCallback2 = getKekid.onExtraCallback();
                int iOnExtraCallback3 = getKekid.onExtraCallback();
                return (Unit) IAuthTabCallback(1978984273, iOnExtraCallback, getKekid.onExtraCallback(), iOnExtraCallback3, new Object[]{attachapplovinsdk}, iOnExtraCallback2, -1978984273);
            }
        }

        public static final class asBinder {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onTransact = 1;
            private static int onWarmupCompleted = 1;
            public static final asBinder onExtraCallback = new asBinder();
            private static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback(IAuthTabCallbackDefault.Char, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Flip3D$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 47;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.asBinder.IAuthTabCallback();
                    int i4 = onNavigationEvent + 51;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 47 / 0;
                    }
                    return appLovinSdkSettingsIAuthTabCallback;
                }
            }, 24, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Flip3D$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // o.MaxNativeAdMaxNativeAdImage
                public final AppLovinSdkSettings invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 113;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.asBinder.onExtraCallback();
                    int i4 = onWarmupCompleted + 1;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 81 / 0;
                    }
                    return appLovinSdkSettingsOnExtraCallback;
                }
            }, 6, 200, true);

            public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 51;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i4 = onExtraCallbackWithResult + 77;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 23 / 0;
                }
                return appLovinSdkSettingsOnExtraCallbackWithResult;
            }

            public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(attachapplovinsdk);
                int i4 = onWarmupCompleted + 69;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallback() {
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    appLovinSdkSettingsOnNavigationEvent = onNavigationEvent();
                    int i3 = 71 / 0;
                } else {
                    appLovinSdkSettingsOnNavigationEvent = onNavigationEvent();
                }
                int i4 = onWarmupCompleted + 113;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return appLovinSdkSettingsOnNavigationEvent;
                }
                throw null;
            }

            private asBinder() {
            }

            static {
                int i = onTransact + 69;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
                int i;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 113;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                    i = 683;
                } else {
                    Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                    onNativeAdExpired.onNavigationEvent(attachapplovinsdk, getCallToActionButton.onExtraCallback.onTransact());
                    i = 760;
                }
                attachapplovinsdk.IAuthTabCallback(i);
                return Unit.INSTANCE;
            }

            private static final AppLovinSdkSettings onExtraCallbackWithResult() {
                int i = 2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback());
                Float fValueOf = Float.valueOf(0.0f);
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = isMuted.IAuthTabCallback(isMuted.onExtraCallback(appLovinSdkSettingsOnExtraCallback, fValueOf, Float.valueOf(1.0f), (Function1<? super attachAppLovinSdk, Unit>) new Function1() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Flip3D$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = onNavigationEvent + 81;
                        onExtraCallback = i3 % 128;
                        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                        if (i3 % 2 != 0) {
                            mExternalSyntheticApiModelOutline1.IAuthTabCallback.asBinder.onExtraCallback(attachapplovinsdk);
                            throw null;
                        }
                        Unit unitOnExtraCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.asBinder.onExtraCallback(attachapplovinsdk);
                        int i4 = onNavigationEvent + 21;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            return unitOnExtraCallback;
                        }
                        throw null;
                    }
                }).onExtraCallback(getVersionCode.WEAK), Float.valueOf(-80.0f), fValueOf, (Function1) null, 4, (Object) null);
                int i2 = onWarmupCompleted + 91;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return appLovinSdkSettingsIAuthTabCallback;
            }

            private static final AppLovinSdkSettings onNavigationEvent() {
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback;
                Float fValueOf;
                Float fValueOf2;
                Function1 function1;
                int i;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 43;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.onExtraCallbackWithResult());
                    fValueOf = Float.valueOf(2.0f);
                    fValueOf2 = Float.valueOf(1.0f);
                    function1 = null;
                    i = 2;
                } else {
                    appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.onExtraCallbackWithResult());
                    fValueOf = Float.valueOf(0.0f);
                    fValueOf2 = Float.valueOf(1.0f);
                    function1 = null;
                    i = 4;
                }
                Float f = fValueOf;
                return isMuted.IAuthTabCallback(isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf2, f, function1, i, (Object) null).onExtraCallback(getVersionCode.WEAK), f, Float.valueOf(80.0f), (Function1) null, 4, (Object) null);
            }
        }

        public static final class getInterfaceDescriptor {
            private static int IAuthTabCallback = 0;
            private static int IAuthTabCallbackDefault = 1;
            private static final IAuthTabCallback onExtraCallback;
            public static final getInterfaceDescriptor onExtraCallbackWithResult = new getInterfaceDescriptor();
            private static int onNavigationEvent = 1;
            private static int onTransact;
            private static final IAuthTabCallback onWarmupCompleted;

            public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 41;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    asInterface();
                    throw null;
                }
                AppLovinSdkSettings appLovinSdkSettingsAsInterface = asInterface();
                int i3 = IAuthTabCallback + 39;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return appLovinSdkSettingsAsInterface;
                }
                throw null;
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 57;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackStub = IAuthTabCallbackStub();
                int i4 = onNavigationEvent + 29;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettingsIAuthTabCallbackStub;
            }

            public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 97;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsAsBinder = asBinder();
                int i4 = IAuthTabCallback + 101;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettingsAsBinder;
            }

            public static /* synthetic */ AppLovinSdkSettings onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return onWarmupCompleted();
                }
                onWarmupCompleted();
                throw null;
            }

            private getInterfaceDescriptor() {
            }

            static {
                int i = 200;
                onExtraCallback = new IAuthTabCallback(IAuthTabCallbackDefault.Word, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Typing$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // o.MaxNativeAdMaxNativeAdImage
                    public final AppLovinSdkSettings invoke() {
                        int i2 = 2 % 2;
                        int i3 = onWarmupCompleted + 125;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.IAuthTabCallback.getInterfaceDescriptor.onExtraCallbackWithResult();
                        int i5 = onWarmupCompleted + 81;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        return appLovinSdkSettingsOnExtraCallbackWithResult;
                    }
                }, 110, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Typing$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    @Override // o.MaxNativeAdMaxNativeAdImage
                    public final AppLovinSdkSettings invoke() {
                        int i2 = 2 % 2;
                        int i3 = IAuthTabCallback + 89;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallback.getInterfaceDescriptor.IAuthTabCallback();
                        int i5 = IAuthTabCallback + 7;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 1 / 0;
                        }
                        return appLovinSdkSettingsIAuthTabCallback;
                    }
                }, 0, i, false, 64, null);
                onWarmupCompleted = new IAuthTabCallback(IAuthTabCallbackDefault.Char, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Typing$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    @Override // o.MaxNativeAdMaxNativeAdImage
                    public final AppLovinSdkSettings invoke() {
                        int i2 = 2 % 2;
                        int i3 = IAuthTabCallback + 123;
                        onExtraCallback = i3 % 128;
                        if (i3 % 2 == 0) {
                            return mExternalSyntheticApiModelOutline1.IAuthTabCallback.getInterfaceDescriptor.onNavigationEvent();
                        }
                        mExternalSyntheticApiModelOutline1.IAuthTabCallback.getInterfaceDescriptor.onNavigationEvent();
                        throw null;
                    }
                }, 70, new MaxNativeAdMaxNativeAdImage() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InOutMotion$Typing$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    @Override // o.MaxNativeAdMaxNativeAdImage
                    public final AppLovinSdkSettings invoke() {
                        int i2 = 2 % 2;
                        int i3 = IAuthTabCallback + 59;
                        onExtraCallbackWithResult = i3 % 128;
                        if (i3 % 2 == 0) {
                            return mExternalSyntheticApiModelOutline1.IAuthTabCallback.getInterfaceDescriptor.onExtraCallback();
                        }
                        mExternalSyntheticApiModelOutline1.IAuthTabCallback.getInterfaceDescriptor.onExtraCallback();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }, 0, i, false, 64, null);
                int i2 = onTransact + 111;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final AppLovinSdkSettings asBinder() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent((AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onTransact(), 300}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), Float.valueOf(0.0f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null);
                int i4 = onNavigationEvent + 55;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return appLovinSdkSettingsOnNavigationEvent;
                }
                throw null;
            }

            private static final AppLovinSdkSettings asInterface() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 13;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder()), Float.valueOf(1.0f), Float.valueOf(0.0f), (Function1) null, 4, (Object) null);
                int i4 = IAuthTabCallback + 121;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettingsOnNavigationEvent;
            }

            private static final AppLovinSdkSettings onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 115;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent((AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.onTransact(), 180}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), Float.valueOf(0.0f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null);
                int i4 = IAuthTabCallback + 119;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return appLovinSdkSettingsOnNavigationEvent;
            }

            private static final AppLovinSdkSettings IAuthTabCallbackStub() {
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback;
                Float fValueOf;
                Float fValueOf2;
                Function1 function1;
                int i;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 63;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder());
                    fValueOf = Float.valueOf(2.0f);
                    fValueOf2 = Float.valueOf(0.0f);
                    function1 = null;
                    i = 5;
                } else {
                    appLovinSdkSettingsOnExtraCallback = onNativeAdExpired.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder());
                    fValueOf = Float.valueOf(1.0f);
                    fValueOf2 = Float.valueOf(0.0f);
                    function1 = null;
                    i = 4;
                }
                return isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf, fValueOf2, function1, i, (Object) null);
            }
        }
    }

    public interface IAuthTabCallbackStub extends asInterface {
        public static final IAuthTabCallback Companion = IAuthTabCallback.onWarmupCompleted;

        setOptionsView IAuthTabCallback();

        int onWarmupCompleted();

        public static final class onNavigationEvent {
            private static int IAuthTabCallback = 0;
            private static int asBinder = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
            private static final IAuthTabCallbackStub onExtraCallback = new onWarmupCompleted(IAuthTabCallbackDefault.Char, new setOptionsView() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InfiniteMotion$Fade$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.setOptionsView
                public final List invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 17;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    List listOnExtraCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub.onNavigationEvent.onExtraCallback();
                    int i4 = onWarmupCompleted + 89;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return listOnExtraCallback;
                }
            }, 100);

            public static /* synthetic */ List onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 5;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                List listIAuthTabCallback = IAuthTabCallback();
                int i4 = onWarmupCompleted + 93;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 91 / 0;
                }
                return listIAuthTabCallback;
            }

            private onNavigationEvent() {
            }

            public final IAuthTabCallbackStub onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 59;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallbackStub iAuthTabCallbackStub = onExtraCallback;
                int i5 = i2 + 25;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return iAuthTabCallbackStub;
            }

            static {
                int i = asBinder + 13;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            private static final List IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 13;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallback = IAuthTabCallbackStub.Companion;
                List listListOf = CollectionsKt.listOf(new AppLovinSdkSettings[]{isMuted.onNavigationEvent((AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{iAuthTabCallback.onWarmupCompleted(), 1200}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), (Float) null, Float.valueOf(0.4f), (Function1) null, 5, (Object) null), isMuted.onNavigationEvent((AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{iAuthTabCallback.onWarmupCompleted(), 1200}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null)});
                int i4 = onWarmupCompleted + 49;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return listListOf;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class onExtraCallback {
            private static int asBinder = 1;
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            public static final onExtraCallback IAuthTabCallback = new onExtraCallback();
            private static final IAuthTabCallbackStub onExtraCallbackWithResult = new onWarmupCompleted(IAuthTabCallbackDefault.Char, new setOptionsView() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InfiniteMotion$Wave$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.setOptionsView
                public final List invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 123;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        return mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub.onExtraCallback.onExtraCallback();
                    }
                    mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub.onExtraCallback.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, 80);

            public static /* synthetic */ List onExtraCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 15;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                List listIAuthTabCallback = IAuthTabCallback();
                int i4 = onNavigationEvent + 39;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return listIAuthTabCallback;
            }

            private onExtraCallback() {
            }

            static {
                int i = asBinder + 29;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            private static final List IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 73;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallback = IAuthTabCallbackStub.Companion;
                Object[] objArr = {(AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{iAuthTabCallback.onWarmupCompleted(), 400}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), null, Float.valueOf(-0.08f), null, 5, null};
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                Object[] objArr2 = {(AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{iAuthTabCallback.onWarmupCompleted(), 400}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), null, Float.valueOf(0.0f), null, 5, null};
                List listListOf = CollectionsKt.listOf(new AppLovinSdkSettings[]{appLovinSdkSettings, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr2, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult())});
                int i4 = onExtraCallback + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return listListOf;
            }
        }

        public static final class onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();
            private static int onWarmupCompleted = 1;

            static {
                int i = IAuthTabCallback + 33;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            private onWarmupCompleted() {
            }

            public static /* synthetic */ IAuthTabCallbackStub IAuthTabCallback(onWarmupCompleted onwarmupcompleted, long j, long j2, int i, Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 25;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 4) != 0) {
                    j2 = setByteOrder.Companion.onTransact();
                    int i4 = onWarmupCompleted + 121;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                }
                return onwarmupcompleted.onWarmupCompleted(j, j2);
            }

            public final IAuthTabCallbackStub onWarmupCompleted(long j, long j2) {
                Integer numValueOf;
                Integer numValueOf2;
                int i = 2 % 2;
                setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(j2);
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (setbyteorderOnNavigationEvent.access100() == 16) {
                    int i2 = onWarmupCompleted + 31;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    setbyteorderOnNavigationEvent = null;
                }
                if (setbyteorderOnNavigationEvent != null) {
                    numValueOf = Integer.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(setbyteorderOnNavigationEvent.access100()));
                    int i4 = onExtraCallback + 105;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    numValueOf = null;
                }
                setByteOrder setbyteorderOnNavigationEvent2 = setByteOrder.onNavigationEvent(j);
                if (setbyteorderOnNavigationEvent2.access100() == 16) {
                    setbyteorderOnNavigationEvent2 = null;
                }
                if (setbyteorderOnNavigationEvent2 != null) {
                    int i6 = onExtraCallback + 107;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        numValueOf2 = Integer.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(setbyteorderOnNavigationEvent2.access100()));
                        int i7 = 35 / 0;
                    } else {
                        numValueOf2 = Integer.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(setbyteorderOnNavigationEvent2.access100()));
                    }
                } else {
                    numValueOf2 = null;
                }
                onExtraCallback onextracallback = new onExtraCallback(numValueOf, numValueOf2, defaultConstructorMarker);
                int i8 = onWarmupCompleted + 19;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 95 / 0;
                }
                return onextracallback;
            }
        }

        public static final class IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int asBinder = 1;
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            static final /* synthetic */ IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();
            private static final Lazy<getMediaContentViewGroup> onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$InfiniteMotion$Companion$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    getMediaContentViewGroup getmediacontentviewgroupOnExtraCallback;
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 63;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        getmediacontentviewgroupOnExtraCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub.IAuthTabCallback.onExtraCallback();
                        int i3 = 82 / 0;
                    } else {
                        getmediacontentviewgroupOnExtraCallback = mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub.IAuthTabCallback.onExtraCallback();
                    }
                    int i4 = onNavigationEvent + 5;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        return getmediacontentviewgroupOnExtraCallback;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });

            public static /* synthetic */ getMediaContentViewGroup onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 63;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                getMediaContentViewGroup getmediacontentviewgroupOnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i4 = IAuthTabCallback + 13;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return getmediacontentviewgroupOnExtraCallbackWithResult;
            }

            private IAuthTabCallback() {
            }

            static {
                int i = asBinder + 55;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 42 / 0;
                }
            }

            public final getMediaContentViewGroup onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                getMediaContentViewGroup getmediacontentviewgroup = (getMediaContentViewGroup) onExtraCallbackWithResult.getValue();
                int i3 = IAuthTabCallback + 77;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return getmediacontentviewgroup;
            }

            private static final getMediaContentViewGroup onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                getMediaContentViewGroup getmediacontentviewgroupIAuthTabCallback = getCallToActionButton.onExtraCallback.IAuthTabCallback(0.46f, 0.03f, 0.52f, 0.96f);
                int i4 = onNavigationEvent + 55;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return getmediacontentviewgroupIAuthTabCallback;
            }
        }
    }

    static final class onWarmupCompleted implements IAuthTabCallbackStub {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final setOptionsView IAuthTabCallback;
        private final IAuthTabCallbackDefault onExtraCallback;
        private final int onNavigationEvent;

        public onWarmupCompleted(@NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault, @NotNull setOptionsView setoptionsview, int i) {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            Intrinsics.checkNotNullParameter(setoptionsview, "");
            this.onExtraCallback = iAuthTabCallbackDefault;
            this.IAuthTabCallback = setoptionsview;
            this.onNavigationEvent = i;
        }

        @Override // o.mExternalSyntheticApiModelOutline1.asInterface
        public IAuthTabCallbackDefault onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = this.onExtraCallback;
            int i5 = i2 + 65;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackDefault;
        }

        @Override // o.mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub
        public setOptionsView IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            setOptionsView setoptionsview = this.IAuthTabCallback;
            int i5 = i3 + 61;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return setoptionsview;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub
        public int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallbackStub)) {
                int i4 = i3 + 121;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            IAuthTabCallbackStub iAuthTabCallbackStub = (IAuthTabCallbackStub) obj;
            if (onExtraCallback() == iAuthTabCallbackStub.onExtraCallback()) {
                int i6 = onWarmupCompleted + 115;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    IAuthTabCallback();
                    iAuthTabCallbackStub.IAuthTabCallback();
                    throw null;
                }
                if (IAuthTabCallback() == iAuthTabCallbackStub.IAuthTabCallback() && onWarmupCompleted() == iAuthTabCallbackStub.onWarmupCompleted()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = (((onExtraCallback().hashCode() / 20) << IAuthTabCallback().hashCode()) << 43) << onWarmupCompleted();
            } else {
                iHashCode = (((onExtraCallback().hashCode() * 31) + IAuthTabCallback().hashCode()) * 31) + onWarmupCompleted();
            }
            int i3 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }
    }

    public static final class onExtraCallback implements IAuthTabCallbackStub {
        private static int IAuthTabCallbackDefault = 0;
        private static int asInterface = 1;
        private final IAuthTabCallbackDefault IAuthTabCallback;
        private final Integer onExtraCallback;
        private final Integer onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private final setOptionsView onWarmupCompleted;

        public /* synthetic */ onExtraCallback(Integer num, Integer num2, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, num2);
        }

        public static /* synthetic */ List onWarmupCompleted(onExtraCallback onextracallback) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 67;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            List listOnExtraCallback = onExtraCallback(onextracallback);
            int i4 = IAuthTabCallbackDefault + 45;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return listOnExtraCallback;
            }
            throw null;
        }

        private onExtraCallback(Integer num, Integer num2) {
            this.onExtraCallbackWithResult = num;
            this.onExtraCallback = num2;
            this.IAuthTabCallback = IAuthTabCallbackDefault.Char;
            this.onWarmupCompleted = new setOptionsView() { // from class: im.toss.tds.compose.component.anim.animatetext.TdsAnimateTextV1$ColorInfiniteMotion$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.setOptionsView
                public final List invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 23;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        mExternalSyntheticApiModelOutline1.onExtraCallback.onWarmupCompleted(this.f$0);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    List listOnWarmupCompleted = mExternalSyntheticApiModelOutline1.onExtraCallback.onWarmupCompleted(this.f$0);
                    int i3 = onNavigationEvent + 89;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return listOnWarmupCompleted;
                }
            };
            this.onNavigationEvent = 80;
        }

        public final Integer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 115;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            Integer num = this.onExtraCallbackWithResult;
            int i5 = i2 + 71;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return num;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Integer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 119;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            Integer num = this.onExtraCallback;
            int i5 = i3 + 45;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        @Override // o.mExternalSyntheticApiModelOutline1.asInterface
        public IAuthTabCallbackDefault onExtraCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 125;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = this.IAuthTabCallback;
            if (i3 != 0) {
                int i4 = 16 / 0;
            }
            return iAuthTabCallbackDefault;
        }

        @Override // o.mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub
        public setOptionsView IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 47;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            setOptionsView setoptionsview = this.onWarmupCompleted;
            int i5 = i3 + 117;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return setoptionsview;
        }

        private static final List onExtraCallback(onExtraCallback onextracallback) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 111;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStub.IAuthTabCallback iAuthTabCallback = IAuthTabCallbackStub.Companion;
            List listListOf = CollectionsKt.listOf(new AppLovinSdkSettings[]{isMuted.IAuthTabCallback((AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{iAuthTabCallback.onWarmupCompleted(), 1200}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), onextracallback.onExtraCallbackWithResult, onextracallback.onExtraCallback, (Function1) null, 4, (Object) null), isMuted.IAuthTabCallback((AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{iAuthTabCallback.onWarmupCompleted(), 1200}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), onextracallback.onExtraCallback, onextracallback.onExtraCallbackWithResult, (Function1) null, 4, (Object) null)});
            int i4 = IAuthTabCallbackDefault + 27;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return listListOf;
            }
            throw null;
        }

        @Override // o.mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub
        public int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 87;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            int i5 = this.onNavigationEvent;
            int i6 = i3 + 69;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(!(obj instanceof onExtraCallback))) {
                onExtraCallback onextracallback = (onExtraCallback) obj;
                if (Intrinsics.areEqual(onextracallback.onExtraCallbackWithResult, this.onExtraCallbackWithResult) && Intrinsics.areEqual(onextracallback.onExtraCallback, this.onExtraCallback)) {
                    int i2 = asInterface + 63;
                    IAuthTabCallbackDefault = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
            }
            int i4 = asInterface + 31;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int iIntValue;
            int i = 2 % 2;
            Integer num = this.onExtraCallbackWithResult;
            int iIntValue2 = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                int i2 = asInterface + 99;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                iIntValue = 0;
            }
            Integer num2 = this.onExtraCallback;
            if (num2 != null) {
                int i4 = IAuthTabCallbackDefault + 101;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                iIntValue2 = num2.intValue();
            }
            return (iIntValue * 31) + iIntValue2;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            bool.booleanValue();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = IAuthTabCallback + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        int i5 = 10 / 0;
        return Boolean.valueOf(zBooleanValue);
    }

    private static final void IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = IAuthTabCallback + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            bool.booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = IAuthTabCallback + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        if (i3 == 0) {
            return null;
        }
        int i4 = 35 / 0;
        return null;
    }

    private static final boolean onTransact(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallback + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        int i4 = onExtraCallback + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallback + 51;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirkSettingsLoader quirkSettingsLoader, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{mexternalsyntheticlambda8, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 502863644, -502863642, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final void onTransact(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1116926409, 1116926417, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final boolean asInterface(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{getsupportedhighspeedresolutionsfor}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1573083592, 1573083595, iOnWarmupCompleted)).booleanValue();
    }

    private static final void IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 2092337110, -2092337109, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final boolean IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{getsupportedhighspeedresolutionsfor}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 813459424, -813459424, iOnWarmupCompleted)).booleanValue();
    }

    private static final Unit IAuthTabCallbackStub(mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirkSettingsLoader quirkSettingsLoader, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{mexternalsyntheticlambda8, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -898349749, 898349755, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{getsupportedhighspeedresolutionsfor}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -154613870, 154613875, iOnWarmupCompleted)).booleanValue();
    }
}
