package o;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowScope;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.tmoney.LiveCheckConstants;
import im.toss.feature.credit.ui.kcbsurvey.R;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getSwitchMinWidth;
import o.preRenderInitDegradeOpt;
import o.resolveKeyPath;
import o.w3b;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class preRenderInitDegradeOpt {
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback;
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault;
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub;
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallback;
    private static int ICustomTabsCallbackDefault;
    private static setTaggedAddrCtrl<resolveKeyPath, getSwitchMinWidth<Boolean>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100;
    private static setTaggedAddrCtrl<resolveKeyPath, getSwitchMinWidth<Boolean>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder;
    private static setTaggedAddrCtrl<resolveKeyPath, getSwitchMinWidth<Boolean>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallback;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallbackWithResult;
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityLayout;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    public static final preRenderInitDegradeOpt onExtraCallbackWithResult;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMessageChannelReady;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent;
    private static int onPostMessage;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact;
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> readTypedObject;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedObject;
    private static final byte[] $$a = {79, 23, 89, 11};
    private static final int $$b = 131;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onUnminimized = 0;
    private static int onActivityResized = 0;
    private static int onMinimized = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        int i2 = s * 4;
        byte[] bArr = $$a;
        int i3 = 4 - (b * 3);
        int i4 = (s2 * 2) + 105;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i3;
            int i9 = (-i3) + i6;
            int i10 = i8 + 1;
            i = i7;
            i4 = i9;
            i3 = i10;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            int i11 = i4;
            i8 = i3;
            i3 = bArr[i3];
            i7 = i + 1;
            i6 = i11;
            int i92 = (-i3) + i6;
            int i102 = i8 + 1;
            i = i7;
            i4 = i92;
            i3 = i102;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onActivityResized + 115;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onMinimized + 103;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i);
        int i9 = ~i2;
        int i10 = (~(i9 | i6)) | i8;
        int i11 = ~i;
        int i12 = i11 | i6;
        int i13 = i10 | (~i12);
        int i14 = i7 | i2;
        int i15 = i8 | (~i14);
        int i16 = (~(i | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i2));
        int i17 = i6 + i2 + i3 + ((-1254723898) * i5) + ((-1667789834) * i4);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i6) + 1379663872 + ((-481802647) * i2) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i3) + ((-1033371648) * i5) + ((-106430464) * i4) + (1552875520 * i18);
        int i20 = ((i6 * (-402395399)) - 1316031342) + (i2 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + ((-402393527) * i3) + ((-1219896714) * i5) + ((-610841306) * i4) + (i18 * (-825819136));
        boolean z = true;
        switch (i19 + (i20 * i20 * (-1063190528))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                RowScope rowScope = (RowScope) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i21 = 2 % 2;
                int i22 = onMinimized + 123;
                onActivityResized = i22 % 128;
                int i23 = i22 % 2;
                Intrinsics.checkNotNullParameter(rowScope, "");
                if ((iIntValue & 17) != 16) {
                    int i24 = onMinimized + 121;
                    onActivityResized = i24 % 128;
                    int i25 = i24 % 2;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-407773150, iIntValue, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$-407773150.<anonymous> (KcbSurveyIntroActivity.kt:368)");
                    }
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_intro3_content_row2_text, cameraCaptureResultEmptyCameraCaptureResult, 0), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 131060}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                int i26 = 2 % 2;
                int i27 = onActivityResized + 101;
                int i28 = i27 % 128;
                onMinimized = i28;
                int i29 = i27 % 2;
                setTaggedAddrCtrl<resolveKeyPath, getSwitchMinWidth<Boolean>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> settaggedaddrctrl = access000;
                int i30 = i28 + 115;
                onActivityResized = i30 % 128;
                int i31 = i30 % 2;
                return settaggedaddrctrl;
            case 6:
                return onExtraCallback(objArr);
            case 7:
                return IAuthTabCallback(objArr);
            case 8:
                int i32 = 2 % 2;
                int i33 = onActivityResized;
                int i34 = i33 + 35;
                onMinimized = i34 % 128;
                int i35 = i34 % 2;
                setTaggedAddrCtrl<resolveKeyPath, getSwitchMinWidth<Boolean>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> settaggedaddrctrl2 = asInterface;
                int i36 = i33 + 83;
                onMinimized = i36 % 128;
                int i37 = i36 % 2;
                return settaggedaddrctrl2;
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return asInterface(objArr);
            default:
                resolveKeyPath resolvekeypath = (resolveKeyPath) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i38 = 2 % 2;
                Intrinsics.checkNotNullParameter(resolvekeypath, "");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(resolvekeypath) ? 4 : 2;
                }
                if ((iIntValue2 & 131) != 130) {
                    int i39 = onMinimized + 75;
                    onActivityResized = i39 % 128;
                    int i40 = i39 % 2;
                } else {
                    int i41 = onActivityResized + 105;
                    onMinimized = i41 % 128;
                    int i42 = i41 % 2;
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue2 & 1)) {
                    int i43 = onMinimized + 47;
                    onActivityResized = i43 % 128;
                    int i44 = i43 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1113580293, iIntValue2, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$1113580293.<anonymous> (KcbSurveyIntroActivity.kt:262)");
                    }
                    resolvekeypath.IAuthTabCallback(IAuthTabCallback_Parcel, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 6 | ((iIntValue2 << 9) & 7168), 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i45 = onActivityResized + 37;
                        onMinimized = i45 % 128;
                        int i46 = i45 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 27;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onMinimized + 87;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(resolveKeyPath resolvekeypath, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 41;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) IAuthTabCallback(new Object[]{resolvekeypath, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -509067236, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 509067236);
        int i5 = onMinimized + 71;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 52 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 27;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onActivityResized + 29;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onMinimized + 13;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onMessageChannelReady;
        int i5 = i3 + 29;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onMinimized + 47;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onActivityResized + 23;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 85;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onActivityResized + 71;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(resolveKeyPath resolvekeypath, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 11;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(resolvekeypath, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 74 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 9;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onActivityResized + 109;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 3;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallbackStub(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackStub(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 65;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallbackDefault(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onActivityResized + 29;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 49;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) IAuthTabCallback(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -563038047, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 563038048);
        int i5 = onActivityResized + 91;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onMinimized + 49;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onActivityResized + 37;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onActivityResized + 21;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onMinimized + 7;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 39;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(resolveKeyPath resolvekeypath, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 39;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(resolvekeypath, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 10 / 0;
        }
        int i6 = onActivityResized + 45;
        onMinimized = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 65;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onActivityResized + 111;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onActivityResized + 73;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackStubProxy;
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return getbacktracenote;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 89;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            unit = (Unit) IAuthTabCallback(new Object[]{rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -639241789, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 639241792);
            int i4 = 28 / 0;
        } else {
            unit = (Unit) IAuthTabCallback(new Object[]{rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -639241789, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 639241792);
        }
        int i5 = onActivityResized + 51;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onMinimized + 29;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onMinimized + 67;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 95;
        onActivityResized = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onActivityResized + 73;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onMinimized + 25;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onMinimized + 51;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onWarmupCompleted(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 67;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onActivityResized + 69;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onMinimized + 123;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 91;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = access100;
        int i5 = i2 + 7;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onActivityResized + 113;
        int i3 = i2 % 128;
        onMinimized = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = getInterfaceDescriptor;
        int i4 = i3 + 89;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    public final setTaggedAddrCtrl<resolveKeyPath, getSwitchMinWidth<Boolean>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 45;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        setTaggedAddrCtrl<resolveKeyPath, getSwitchMinWidth<Boolean>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> settaggedaddrctrl = asBinder;
        int i5 = i2 + 91;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return settaggedaddrctrl;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMinimized + 5;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback;
        int i5 = i3 + 21;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onMinimized + 41;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        throw null;
    }

    public final getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact() {
        int i = 2 % 2;
        int i2 = onActivityResized + 107;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackStub;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 105;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackDefault;
        int i5 = i2 + 77;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i5 = $10 + 87;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            j = 0;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(onPostMessage)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35126 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10277, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 55, View.MeasureSpec.getSize(0) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i8 = $11 + 67;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 12843), 55 - ExpandableListView.getPackedPositionType(j), 2167 - KeyEvent.getDeadChar(0, 0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    j = 0;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        ICustomTabsCallbackDefault = 1;
        access000();
        onExtraCallbackWithResult = new preRenderInitDegradeOpt();
        writeTypedObject = ForwardingCameraControl.onExtraCallbackWithResult(851064190, false, new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i2 % 128;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                Integer num = (Integer) obj2;
                if (i2 % 2 != 0) {
                    return preRenderInitDegradeOpt.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                }
                preRenderInitDegradeOpt.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        ICustomTabsCallback = ForwardingCameraControl.onExtraCallbackWithResult(1948382079, false, new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda11
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 21;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                Integer numValueOf = Integer.valueOf(((Integer) obj2).intValue());
                if (i3 != 0) {
                    throw null;
                }
                Unit unit = (Unit) preRenderInitDegradeOpt.IAuthTabCallback(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1266156487, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1266156485);
                int i4 = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        });
        asInterface = ForwardingCameraControl.onExtraCallbackWithResult(-637701924, false, new setTaggedAddrCtrl() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 45;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                resolveKeyPath resolvekeypath = (resolveKeyPath) obj;
                getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) obj2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if (i3 == 0) {
                    return preRenderInitDegradeOpt.onExtraCallback(resolvekeypath, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                preRenderInitDegradeOpt.onExtraCallback(resolvekeypath, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            }
        });
        IAuthTabCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(1593706279, false, new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda14
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 27;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = (Unit) preRenderInitDegradeOpt.IAuthTabCallback(new Object[]{(CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 2128104273, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -2128104266);
                int i4 = onExtraCallbackWithResult + 53;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        });
        asBinder = ForwardingCameraControl.onExtraCallbackWithResult(1113580293, false, new setTaggedAddrCtrl() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = preRenderInitDegradeOpt.IAuthTabCallback((resolveKeyPath) obj, (getSwitchMinWidth) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i4 = IAuthTabCallback + 33;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        });
        IAuthTabCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(1047154297, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda16
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 23;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = preRenderInitDegradeOpt.onWarmupCompleted((AppLovinNativeAdImplExternalSyntheticLambda1) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onNavigationEvent + 83;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        });
        extraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(1896593670, false, new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda17
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = preRenderInitDegradeOpt.onWarmupCompleted((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i4 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        });
        onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-142869817, false, new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda18
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 3;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i3 == 0) {
                    preRenderInitDegradeOpt.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    throw null;
                }
                Unit unitOnNavigationEvent = preRenderInitDegradeOpt.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = onNavigationEvent + 113;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        });
        access000 = ForwardingCameraControl.onExtraCallbackWithResult(1416467684, false, new setTaggedAddrCtrl() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda19
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 39;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = preRenderInitDegradeOpt.onNavigationEvent((resolveKeyPath) obj, (getSwitchMinWidth) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i4 = onExtraCallback + 121;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        });
        readTypedObject = ForwardingCameraControl.onExtraCallbackWithResult(2055662490, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda20
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 65;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = preRenderInitDegradeOpt.onExtraCallback((RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallback + 55;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        });
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1586549022, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 99;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                w5a w5aVar = (w5a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    return preRenderInitDegradeOpt.onExtraCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                preRenderInitDegradeOpt.onExtraCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        IAuthTabCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(-1910726226, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                w3b w3bVar = (w3b) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    return preRenderInitDegradeOpt.onExtraCallbackWithResult(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                preRenderInitDegradeOpt.onExtraCallbackWithResult(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        extraCallback = ForwardingCameraControl.onExtraCallbackWithResult(738767363, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 95;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = preRenderInitDegradeOpt.IAuthTabCallback((RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onNavigationEvent + 91;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 46 / 0;
                }
                return unitIAuthTabCallback;
            }
        });
        onMessageChannelReady = ForwardingCameraControl.onExtraCallbackWithResult(971850571, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 85;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                w5a w5aVar = (w5a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 != 0) {
                    return preRenderInitDegradeOpt.onWarmupCompleted(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                preRenderInitDegradeOpt.onWarmupCompleted(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-1324797161, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = preRenderInitDegradeOpt.onWarmupCompleted((w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        });
        onActivityLayout = ForwardingCameraControl.onExtraCallbackWithResult(909121977, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = preRenderInitDegradeOpt.onExtraCallbackWithResult((RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        access100 = ForwardingCameraControl.onExtraCallbackWithResult(1561877761, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda7
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit unitIAuthTabCallback;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 25;
                onNavigationEvent = i2 % 128;
                w5a w5aVar = (w5a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 == 0) {
                    unitIAuthTabCallback = preRenderInitDegradeOpt.IAuthTabCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    int i3 = 65 / 0;
                } else {
                    unitIAuthTabCallback = preRenderInitDegradeOpt.IAuthTabCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                int i4 = onNavigationEvent + 95;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 59 / 0;
                }
                return unitIAuthTabCallback;
            }
        });
        IAuthTabCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(1237700557, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda8
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 71;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = preRenderInitDegradeOpt.onNavigationEvent((w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 105;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        onTransact = ForwardingCameraControl.onExtraCallbackWithResult(-407773150, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda9
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = preRenderInitDegradeOpt.onWarmupCompleted((RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        });
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-174689942, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda10
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = (Unit) preRenderInitDegradeOpt.IAuthTabCallback(new Object[]{(w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1035991198, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1035991192);
                int i4 = onWarmupCompleted + 31;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        getInterfaceDescriptor = ForwardingCameraControl.onExtraCallbackWithResult(1823629622, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt$$ExternalSyntheticLambda12
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = preRenderInitDegradeOpt.onExtraCallback((w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallback;
            }
        });
        int i = onUnminimized + 117;
        ICustomTabsCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
            int i2 = onMinimized + 21;
            onActivityResized = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 40 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(851064190, iIntValue, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$851064190.<anonymous> (KcbSurveyIntroActivity.kt:253)");
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_intro1_content_step1_title, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i4 = onActivityResized + 37;
                    onMinimized = i4 % 128;
                    int i5 = i4 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i5 == 0) {
                        int i6 = 55 / 0;
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_intro1_content_step1_title, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 67;
        onMinimized = i3 % 128;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 4) != 4, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1948382079, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$1948382079.<anonymous> (KcbSurveyIntroActivity.kt:254)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_intro1_content_step1_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onMinimized + 99;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onMinimized + 29;
        onActivityResized = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(resolveKeyPath resolvekeypath, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 23;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(resolvekeypath, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(resolvekeypath) ^ true ? 2 : 4;
        }
        if ((i & 131) != 130) {
            int i5 = onMinimized + 5;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-637701924, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$-637701924.<anonymous> (KcbSurveyIntroActivity.kt:252)");
            }
            resolvekeypath.IAuthTabCallback(writeTypedObject, ICustomTabsCallback, null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 54, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = onActivityResized + 105;
                onMinimized = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onMinimized;
            int i4 = i3 + 27;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 111;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1593706279, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$1593706279.<anonymous> (KcbSurveyIntroActivity.kt:263)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_intro1_content_step2_title, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 117;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i5 = onMinimized + 63;
            onActivityResized = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onMinimized + 75;
                onActivityResized = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1047154297, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$1047154297.<anonymous> (KcbSurveyIntroActivity.kt:272)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f));
            Object[] objArr = new Object[1];
            a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 54, (ViewConfiguration.getPressedStateDuration() >> 16) + 36, new char[]{18, 65485, '\b', '\f', 65486, 11, 14, 19, 19, '\b', 4, 18, 65486, 6, 0, 20, 6, 4, 65484, 2, 14, '\b', '\r', 65484, '\b', '\r', 19, 4, 11, 11, '\b', 65485, '\t', 18, 14, '\r', 7, 19, 19, 15, 18, 65497, 65486, 65486, 18, 19, 0, 19, '\b', 2, 65485, 19, 14, 18}, false, ImageFormat.getBitsPerPixel(0) + 117, objArr);
            AppLovinStarRatingView.IAuthTabCallback(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, false, false, 0, 0.0f, false, 0.0f, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 54, 0, 8188);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onMinimized + 107;
                onActivityResized = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onMinimized + 29;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onActivityResized + 13;
                onMinimized = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1896593670, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$1896593670.<anonymous> (KcbSurveyIntroActivity.kt:279)");
                    int i6 = 72 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1896593670, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$1896593670.<anonymous> (KcbSurveyIntroActivity.kt:279)");
                }
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_intro1_content_step3_title, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onActivityResized + 25;
                onMinimized = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i3 = onMinimized + 33;
                onActivityResized = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-142869817, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$-142869817.<anonymous> (KcbSurveyIntroActivity.kt:280)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_intro1_content_step3_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onActivityResized + 15;
                onMinimized = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i6 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(resolveKeyPath resolvekeypath, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(resolvekeypath, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(resolvekeypath)) {
                int i4 = onMinimized + 59;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 131) != 130, i & 1)) {
            int i6 = onMinimized + 117;
            onActivityResized = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1416467684, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$1416467684.<anonymous> (KcbSurveyIntroActivity.kt:278)");
            }
            resolvekeypath.IAuthTabCallback(extraCallbackWithResult, onNavigationEvent, null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 54, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onActivityResized + 111;
                onMinimized = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onActivityResized + 69;
            onMinimized = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = onMinimized + 69;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1910726226, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$-1910726226.<anonymous> (KcbSurveyIntroActivity.kt:294)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 66, 1 - (ViewConfiguration.getEdgeSlop() >> 16), new char[]{'\t', '\b', 15, 17, 65487, '\r', '\r', '\n', 7, 65486, 6, '\r', '\b', 15, 2, '\n', 19, 21, 65486, '\b', 15, '\n', 15, 19, 2, 24, 65486, 15, 16, 4, '\n', 65488, 25, 65493, 65488, '\b', 15, 17, 65488, 20, 15, 16, 4, '\n', 65488, 14, '\n', 65487, 20, 20, 16, 21, 65487, 4, '\n', 21, 2, 21, 20, 65488, 65488, 65499, 20, 17, 21, 21}, true, View.getDefaultSize(0, 0) + 114, objArr);
            AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 1020}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onMinimized + 105;
                onActivityResized = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onActivityResized + 75;
        onMinimized = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onMinimized + 103;
                onActivityResized = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2055662490, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$2055662490.<anonymous> (KcbSurveyIntroActivity.kt:302)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_intro2_content_row1_text, cameraCaptureResultEmptyCameraCaptureResult, 0), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 131060}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onMinimized + 33;
                onActivityResized = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onMinimized + 43;
        onActivityResized = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 21 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStub(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onActivityResized + 95;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 117) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                    int i5 = onMinimized + 41;
                    onActivityResized = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            z = true;
        } else {
            int i7 = onActivityResized + 45;
            onMinimized = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onMinimized + 7;
                onActivityResized = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1586549022, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$-1586549022.<anonymous> (KcbSurveyIntroActivity.kt:300)");
                int i11 = onMinimized + 77;
                onActivityResized = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 5 / 2;
                }
            }
            w5aVar.onExtraCallback(readTypedObject, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onMinimized + 9;
                onActivityResized = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 17) != 16) {
            int i3 = onActivityResized + 95;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onMinimized + 51;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onMinimized + 39;
            onActivityResized = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onActivityResized + 25;
                onMinimized = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1324797161, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$-1324797161.<anonymous> (KcbSurveyIntroActivity.kt:314)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1324797161, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$-1324797161.<anonymous> (KcbSurveyIntroActivity.kt:314)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 66, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{'\t', '\b', 15, 17, 65487, '\r', '\r', '\n', 7, 65486, 6, '\r', '\b', 15, 2, '\n', 19, 21, 65486, '\b', 15, '\n', 15, 19, 2, 24, 65486, 15, 16, 4, '\n', 65488, 25, 65493, 65488, '\b', 15, 17, 65488, 20, 15, 16, 4, '\n', 65488, 14, '\n', 65487, 20, 20, 16, 21, 65487, 4, '\n', 21, 2, 21, 20, 65488, 65488, 65499, 20, 17, 21, 21}, true, 114 - TextUtils.getCapsMode("", 0, 0), objArr);
            AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 1020}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onMinimized + 93;
                onActivityResized = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = onActivityResized + 29;
            onMinimized = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 3 % 5;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStub(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onActivityResized + 97;
            onMinimized = i3 % 128;
            z = i3 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onActivityResized + 39;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(738767363, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$738767363.<anonymous> (KcbSurveyIntroActivity.kt:322)");
                int i6 = onActivityResized + 47;
                onMinimized = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 % 3;
                }
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_intro2_content_row2_text, cameraCaptureResultEmptyCameraCaptureResult, 0), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 131060}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asInterface(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onActivityResized + 69;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 106) == 0) {
                if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar))) {
                    int i5 = onActivityResized + 15;
                    onMinimized = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onMinimized + 85;
                onActivityResized = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(971850571, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$971850571.<anonymous> (KcbSurveyIntroActivity.kt:320)");
            }
            w5aVar.onExtraCallback(extraCallback, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 17) != 16) {
            int i3 = onMinimized + 11;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onActivityResized + 87;
            onMinimized = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1237700557, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$1237700557.<anonymous> (KcbSurveyIntroActivity.kt:340)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            Object[] objArr = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0', 0) + 67, View.MeasureSpec.getMode(0) + 1, new char[]{'\t', '\b', 15, 17, 65487, '\r', '\r', '\n', 7, 65486, 6, '\r', '\b', 15, 2, '\n', 19, 21, 65486, '\b', 15, '\n', 15, 19, 2, 24, 65486, 15, 16, 4, '\n', 65488, 25, 65493, 65488, '\b', 15, 17, 65488, 20, 15, 16, 4, '\n', 65488, 14, '\n', 65487, 20, 20, 16, 21, 65487, 4, '\n', 21, 2, 21, 20, 65488, 65488, 65499, 20, 17, 21, 21}, true, 114 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 1020}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onMinimized + 119;
            onActivityResized = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 43;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i5 = onActivityResized + 85;
            onMinimized = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onActivityResized + 71;
                onMinimized = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(909121977, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$909121977.<anonymous> (KcbSurveyIntroActivity.kt:348)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_intro3_content_row1_text, cameraCaptureResultEmptyCameraCaptureResult, 0), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 131060}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        boolean z = true;
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = onMinimized + 99;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
                i2 = 2;
            } else {
                i2 = 4;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i6 = onActivityResized + 51;
            onMinimized = i6 % 128;
            int i7 = i6 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1561877761, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$1561877761.<anonymous> (KcbSurveyIntroActivity.kt:346)");
            }
            w5aVar.onExtraCallback(onActivityLayout, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onMinimized + 107;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onMinimized + 21;
                onActivityResized = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1823629622, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$1823629622.<anonymous> (KcbSurveyIntroActivity.kt:360)");
                int i7 = onMinimized + 23;
                onActivityResized = i7 % 128;
                int i8 = i7 % 2;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 65, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{'\t', '\b', 15, 17, 65487, '\r', '\r', '\n', 7, 65486, 6, '\r', '\b', 15, 2, '\n', 19, 21, 65486, '\b', 15, '\n', 15, 19, 2, 24, 65486, 15, 16, 4, '\n', 65488, 25, 65493, 65488, '\b', 15, 17, 65488, 20, 15, 16, 4, '\n', 65488, 14, '\n', 65487, 20, 20, 16, 21, 65487, 4, '\n', 21, 2, 21, 20, 65488, 65488, 65499, 20, 17, 21, 21}, true, 114 - Drawable.resolveOpacity(0, 0), objArr);
            AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 1020}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asBinder(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onMinimized + 97;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 110) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i4 = onMinimized + 51;
            onActivityResized = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 3;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i6 = onActivityResized + 59;
            onMinimized = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-174689942, i, -1, "im.toss.feature.credit.ui.kcbsurvey.ComposableSingletons$KcbSurveyIntroActivityKt.lambda$-174689942.<anonymous> (KcbSurveyIntroActivity.kt:366)");
            }
            w5aVar.onExtraCallback(onTransact, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1266156487, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1266156485);
    }

    public static /* synthetic */ Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 2128104273, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -2128104266);
    }

    public static /* synthetic */ Unit onNavigationEvent(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(new Object[]{w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1035991198, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1035991192);
    }

    private static final Unit onWarmupCompleted(resolveKeyPath resolvekeypath, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(new Object[]{resolvekeypath, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -509067236, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 509067236);
    }

    private static final Unit asBinder(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -563038047, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 563038048);
    }

    private static final Unit asInterface(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(new Object[]{rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -639241789, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 639241792);
    }

    public final setTaggedAddrCtrl<resolveKeyPath, getSwitchMinWidth<Boolean>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        return (setTaggedAddrCtrl) IAuthTabCallback(new Object[]{this}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1148873756, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1148873748);
    }

    public final getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault() {
        return (getBacktraceNote) IAuthTabCallback(new Object[]{this}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -678167974, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 678167978);
    }

    public final setTaggedAddrCtrl<resolveKeyPath, getSwitchMinWidth<Boolean>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder() {
        return (setTaggedAddrCtrl) IAuthTabCallback(new Object[]{this}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1044517691, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1044517696);
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor() {
        return (getBacktraceNote) IAuthTabCallback(new Object[]{this}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -96679067, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 96679076);
    }

    static void access000() {
        onPostMessage = 478308922;
    }
}
