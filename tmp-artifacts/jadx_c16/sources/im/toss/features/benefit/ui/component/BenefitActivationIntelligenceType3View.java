package im.toss.features.benefit.ui.component;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType3View$;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import o.AddPhoneContactBridgeExtension1;
import o.AppLovinCmpErrorCode;
import o.AppLovinPostbackService;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.AppLovinVastMediaViewf;
import o.BrickModulesListExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.ForwardingCameraControl;
import o.GraphicDeviceInfo;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ParamImpl;
import o.ParamUtils;
import o.QuirksExternalSyntheticBackport0;
import o.ScreenBrightnessBridgeExtension;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.ZslRingBuffer;
import o.access13800;
import o.access14300;
import o.access15400;
import o.accessgetCipherSuitesAsStringp;
import o.accessgetTlsVersionsAsStringp;
import o.bindChildren;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.connectionCount;
import o.createCameraCaptureCallback;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdService;
import o.getExtensionsBeforeInitialized;
import o.getHumanReadableName;
import o.getLongName;
import o.getMinWebSocketMessageToCompressokhttp;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isRepeatingEnabled;
import o.isZslDisabledByByUserCaseConfig;
import o.launchUri;
import o.needCorrectJpegMetadata;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI;
import o.r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg;
import o.r8lambdazmdK5Aeq3EJkWJLcjaoC90W2ZHw;
import o.readIntokhttp;
import o.response;
import o.setAdVideoPlaybackListener;
import o.setAdvertiser;
import o.setCallToAction;
import o.setDone;
import o.setVisitUrl;
import o.unregisterOutputSurface;
import o.use;
import o.useAndConfigureProgramWithTexture;
import o.wa;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BenefitActivationIntelligenceType3View extends FrameLayout {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final AddPhoneContactBridgeExtension1 onExtraCallback;
    private Function1<? super BenefitActivationIntelligence.Type3, Unit> onNavigationEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BenefitActivationIntelligenceType3View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BenefitActivationIntelligenceType3View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View = (BenefitActivationIntelligenceType3View) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        benefitActivationIntelligenceType3View.onWarmupCompleted(str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.RollingNumberText rollingNumberText, float f, Integer num, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {benefitActivationIntelligenceType3View, rollingNumberText, Float.valueOf(f), num, Integer.valueOf(i), quirksExternalSyntheticBackport0, Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, objArr, 920737167, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -920737161);
        int i8 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.RollingNumberText rollingNumberText, BenefitActivationIntelligence.Type3 type3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(benefitActivationIntelligenceType3View, rollingNumberText, type3, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.Type3 type3, BenefitActivationIntelligence.RollingNumberText rollingNumberText, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(benefitActivationIntelligenceType3View, type3, rollingNumberText, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(benefitActivationIntelligenceType3View, type3, rollingNumberText, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.RollingNumberText rollingNumberText, float f, Integer num, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {Boolean.valueOf(z), benefitActivationIntelligenceType3View, rollingNumberText, Float.valueOf(f), num, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        if (i5 != 0) {
            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            return (Unit) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, objArr, -1280310212, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1280310217);
        }
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback2, objArr, -1280310212, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1280310217);
        int i6 = 52 / 0;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Unit unitOnExtraCallback;
        BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View = (BenefitActivationIntelligenceType3View) objArr[0];
        BenefitActivationIntelligence.RollingNumberText rollingNumberText = (BenefitActivationIntelligence.RollingNumberText) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        Integer num = (Integer) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = onExtraCallback(benefitActivationIntelligenceType3View, rollingNumberText, fFloatValue, num, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
            int i3 = 75 / 0;
        } else {
            unitOnExtraCallback = onExtraCallback(benefitActivationIntelligenceType3View, rollingNumberText, fFloatValue, num, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        }
        int i4 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View = (BenefitActivationIntelligenceType3View) objArr[0];
        launchUri launchuri = (launchUri) objArr[1];
        BenefitActivationIntelligence.RollingNumberText rollingNumberText = (BenefitActivationIntelligence.RollingNumberText) objArr[2];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        benefitActivationIntelligenceType3View.onExtraCallbackWithResult(launchuri, rollingNumberText, quirksExternalSyntheticBackport0, zBooleanValue, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.RollingNumberText rollingNumberText, float f, Integer num, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        int iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1);
        if (i6 != 0) {
            Object[] objArr = {benefitActivationIntelligenceType3View, rollingNumberText, Float.valueOf(f), num, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iOnExtraCallbackWithResult)};
            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, objArr, 622200257, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -622200256);
        } else {
            Object[] objArr2 = {benefitActivationIntelligenceType3View, rollingNumberText, Float.valueOf(f), num, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iOnExtraCallbackWithResult)};
            int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback2, objArr2, 622200257, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -622200256);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.Type3 type3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(benefitActivationIntelligenceType3View, type3);
        int i4 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(benefitActivationIntelligenceType3View, str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.Type3 type3, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            return (Unit) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{benefitActivationIntelligenceType3View, type3, view}, -229401762, iOnExtraCallback3, 229401765);
        }
        int iOnExtraCallback4 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback5 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback6 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {benefitActivationIntelligenceType3View, str, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, objArr, -287496841, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 287496848);
        int i6 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 45 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(benefitActivationIntelligenceType3View, str, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 71 / 0;
        }
        int i6 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, launchUri launchuri, BenefitActivationIntelligence.RollingNumberText rollingNumberText, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {benefitActivationIntelligenceType3View, launchuri, rollingNumberText, quirksExternalSyntheticBackport0, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, objArr, 772310421, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -772310421);
        int i7 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        boolean z;
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i3);
        int i11 = ~i6;
        int i12 = (~(i8 | i11 | i4)) | i10;
        int i13 = (~(i3 | i11)) | (~(i7 | i11));
        int i14 = i4 + i6 + i2 + (1941422536 * i5) + ((-555707305) * i);
        int i15 = i14 * i14;
        int i16 = ((i4 * 487360618) - 1291405921) + (i6 * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (487361161 * i2) + ((-1188264952) * i5) + (624576655 * i) + (i15 * (-25952256));
        switch ((i4 * (-2131549542)) + 177471488 + ((-2131549542) * i6) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i2) + ((-1363148800) * i5) + (2141716480 * i) + ((-573308928) * i15) + (i16 * i16 * 74186752)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View = (BenefitActivationIntelligenceType3View) objArr[0];
                ComposeView composeView = (ComposeView) objArr[1];
                BenefitActivationIntelligence.RollingNumberText rollingNumberText = (BenefitActivationIntelligence.RollingNumberText) objArr[2];
                float fFloatValue = ((Number) objArr[3]).floatValue();
                Integer num = (Integer) objArr[4];
                int iIntValue = ((Number) objArr[5]).intValue();
                boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
                int i17 = 2 % 2;
                composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
                composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1661294620, true, new BenefitActivationIntelligenceType3View$.ExternalSyntheticLambda4(zBooleanValue, benefitActivationIntelligenceType3View, rollingNumberText, fFloatValue, num, iIntValue))));
                int i18 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 5:
                boolean zBooleanValue2 = ((Boolean) objArr[0]).booleanValue();
                BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View2 = (BenefitActivationIntelligenceType3View) objArr[1];
                BenefitActivationIntelligence.RollingNumberText rollingNumberText2 = (BenefitActivationIntelligence.RollingNumberText) objArr[2];
                float fFloatValue2 = ((Number) objArr[3]).floatValue();
                Integer num2 = (Integer) objArr[4];
                int iIntValue2 = ((Number) objArr[5]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
                int iIntValue3 = ((Number) objArr[7]).intValue();
                int i20 = 2 % 2;
                int i21 = onWarmupCompleted;
                int i22 = i21 + 1;
                onExtraCallbackWithResult = i22 % 128;
                int i23 = i22 % 2;
                if ((iIntValue3 & 3) != 2) {
                    int i24 = i21 + 97;
                    onExtraCallbackWithResult = i24 % 128;
                    z = i24 % 2 != 0;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue3 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                } else {
                    int i25 = onWarmupCompleted + 77;
                    onExtraCallbackWithResult = i25 % 128;
                    int i26 = i25 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1661294620, iIntValue3, -1, "im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType3View.bindRollingText.<anonymous>.<anonymous> (BenefitActivationIntelligenceType3View.kt:238)");
                    }
                    if (zBooleanValue2) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(719918463);
                        benefitActivationIntelligenceType3View2.onExtraCallback(rollingNumberText2, fFloatValue2, num2, iIntValue2, null, false, cameraCaptureResultEmptyCameraCaptureResult, 0, 48);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(720185466);
                        onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{benefitActivationIntelligenceType3View2, rollingNumberText2, Float.valueOf(fFloatValue2), num2, Integer.valueOf(iIntValue2), cameraCaptureResultEmptyCameraCaptureResult, 0}, 622200257, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -622200256);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i27 = onWarmupCompleted + 55;
                        onExtraCallbackWithResult = i27 % 128;
                        int i28 = i27 % 2;
                    }
                }
                return Unit.INSTANCE;
            case 6:
                BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View3 = (BenefitActivationIntelligenceType3View) objArr[0];
                BenefitActivationIntelligence.RollingNumberText rollingNumberText3 = (BenefitActivationIntelligence.RollingNumberText) objArr[1];
                float fFloatValue3 = ((Number) objArr[2]).floatValue();
                Integer num3 = (Integer) objArr[3];
                int iIntValue4 = ((Number) objArr[4]).intValue();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[5];
                boolean zBooleanValue3 = ((Boolean) objArr[6]).booleanValue();
                int iIntValue5 = ((Number) objArr[7]).intValue();
                int iIntValue6 = ((Number) objArr[8]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
                ((Number) objArr[10]).intValue();
                int i29 = 2 % 2;
                int i30 = onWarmupCompleted + 75;
                onExtraCallbackWithResult = i30 % 128;
                int i31 = i30 % 2;
                benefitActivationIntelligenceType3View3.onExtraCallback(rollingNumberText3, fFloatValue3, num3, iIntValue4, quirksExternalSyntheticBackport0, zBooleanValue3, cameraCaptureResultEmptyCameraCaptureResult2, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue5 | 1), iIntValue6);
                Unit unit = Unit.INSTANCE;
                int i32 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i32 % 128;
                int i33 = i32 % 2;
                return unit;
            case 7:
                return IAuthTabCallback(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, launchUri launchuri, String str2, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, launchuri, str2, useandconfigureprogramwithtexture);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        int i5 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static final class IAuthTabCallbackDefault implements View.OnLayoutChangeListener {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ BenefitActivationIntelligence.RollingNumberText onExtraCallback;
        final /* synthetic */ BenefitActivationIntelligence.Row onNavigationEvent;

        public IAuthTabCallbackDefault(BenefitActivationIntelligence.RollingNumberText rollingNumberText, BenefitActivationIntelligence.Row row) {
            this.onExtraCallback = rollingNumberText;
            this.onNavigationEvent = row;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9;
            int i10 = 2 % 2;
            int i11 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            view.removeOnLayoutChangeListener(this);
            int iOnExtraCallbackWithResult = BenefitActivationIntelligenceType3View.onExtraCallbackWithResult(BenefitActivationIntelligenceType3View.this, this.onExtraCallback);
            int iOnNavigationEvent = BenefitActivationIntelligenceType3View.onNavigationEvent(BenefitActivationIntelligenceType3View.this, this.onNavigationEvent.IAuthTabCallbackStub());
            int width = BenefitActivationIntelligenceType3View.IAuthTabCallback(BenefitActivationIntelligenceType3View.this).IAuthTabCallback_Parcel.getWidth();
            int width2 = BenefitActivationIntelligenceType3View.IAuthTabCallback(BenefitActivationIntelligenceType3View.this).onExtraCallback.getWidth();
            BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View = BenefitActivationIntelligenceType3View.this;
            LinearLayout linearLayout = BenefitActivationIntelligenceType3View.IAuthTabCallback(benefitActivationIntelligenceType3View).IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            boolean z = iOnExtraCallbackWithResult > (((width - width2) - BenefitActivationIntelligenceType3View.IAuthTabCallback(benefitActivationIntelligenceType3View, linearLayout)) - iOnNavigationEvent) - BenefitActivationIntelligenceType3View.onNavigationEvent(BenefitActivationIntelligenceType3View.this, 12);
            ComposeView composeView = BenefitActivationIntelligenceType3View.IAuthTabCallback(BenefitActivationIntelligenceType3View.this).onTransact;
            Intrinsics.checkNotNullExpressionValue(composeView, "");
            ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.topMargin = BenefitActivationIntelligenceType3View.onNavigationEvent(BenefitActivationIntelligenceType3View.this, 4);
            composeView.setLayoutParams(marginLayoutParams);
            ComposeView composeView2 = BenefitActivationIntelligenceType3View.IAuthTabCallback(BenefitActivationIntelligenceType3View.this).asInterface;
            Intrinsics.checkNotNullExpressionValue(composeView2, "");
            if (z) {
                int i13 = onExtraCallbackWithResult + 99;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                i9 = 8;
            } else {
                int i15 = onExtraCallbackWithResult + 73;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                i9 = 0;
            }
            composeView2.setVisibility(i9);
            ComposeView composeView3 = BenefitActivationIntelligenceType3View.IAuthTabCallback(BenefitActivationIntelligenceType3View.this).onTransact;
            Intrinsics.checkNotNullExpressionValue(composeView3, "");
            composeView3.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitActivationIntelligenceType3View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int iIntValue;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AddPhoneContactBridgeExtension1 addPhoneContactBridgeExtension1OnExtraCallback = AddPhoneContactBridgeExtension1.onExtraCallback(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(addPhoneContactBridgeExtension1OnExtraCallback, "");
        this.onExtraCallback = addPhoneContactBridgeExtension1OnExtraCallback;
        TdsRoundLayout tdsRoundLayout = addPhoneContactBridgeExtension1OnExtraCallback.onExtraCallbackWithResult;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.onExtraCallback(configuration)) {
            Configuration configuration2 = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iIntValue = new getUrlokhttp(new onExtraCallback(configuration2)).onSessionEnded();
            int i2 = 2 % 2;
        } else {
            Configuration configuration3 = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            Object[] objArr = {new getUrlokhttp(new IAuthTabCallbackStub(configuration3))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(objArr, -1252317281, 1252317293, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        }
        tdsRoundLayout.setStrokeColor(iIntValue);
        TdsListHeaderV3View tdsListHeaderV3View = addPhoneContactBridgeExtension1OnExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNull(tdsListHeaderV3View);
        TdsListHeaderV3View.setTitleType$default(tdsListHeaderV3View, TdsListHeaderV3View.onNavigationEvent.PARAGRAPH, (String) null, (Function0) null, 6, (Object) null);
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.MEDIUM);
        tdsListHeaderV3View.setHorizontalPadding(wa.onExtraCallback.Companion.onNavigationEvent());
        tdsListHeaderV3View.setVerticalPadding(wa.IAuthTabCallbackStub.Companion.onExtraCallback());
        Configuration configuration4 = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        tdsListHeaderV3View.setTitleTextColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration4)).onUnminimized());
        tdsListHeaderV3View.setTitleFontWeight(GraphicDeviceInfo.Companion.IAuthTabCallback());
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpAccess000 = tdsListHeaderV3View.access000();
        if (getminwebsocketmessagetocompressokhttpAccess000 != null) {
            int i3 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                getminwebsocketmessagetocompressokhttpAccess000.IAuthTabCallback().IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f)));
                getminwebsocketmessagetocompressokhttpAccess000.IAuthTabCallbackDefault().IAuthTabCallback(AppLovinVastMediaViewf.IAuthTabCallback(AppLovinVastMediaViewf.Companion.onNavigationEvent()));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getminwebsocketmessagetocompressokhttpAccess000.IAuthTabCallback().IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f)));
            getminwebsocketmessagetocompressokhttpAccess000.IAuthTabCallbackDefault().IAuthTabCallback(AppLovinVastMediaViewf.IAuthTabCallback(AppLovinVastMediaViewf.Companion.onNavigationEvent()));
        }
        int i4 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BenefitActivationIntelligenceType3View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 % 2;
            } else {
                int i5 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i6 % 128;
            i = i6 % 2 != 0 ? 1 : 0;
            int i7 = 2 % 2;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ int IAuthTabCallback(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = benefitActivationIntelligenceType3View.onNavigationEvent(viewGroup);
        int i4 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ AddPhoneContactBridgeExtension1 IAuthTabCallback(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        AddPhoneContactBridgeExtension1 addPhoneContactBridgeExtension1 = benefitActivationIntelligenceType3View.onExtraCallback;
        int i5 = i3 + 43;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return addPhoneContactBridgeExtension1;
    }

    public static final /* synthetic */ int onExtraCallbackWithResult(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.RollingNumberText rollingNumberText) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = benefitActivationIntelligenceType3View.onNavigationEvent(rollingNumberText);
        int i4 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return iOnNavigationEvent;
    }

    public static final /* synthetic */ int onNavigationEvent(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iOnNavigationEvent = benefitActivationIntelligenceType3View.onNavigationEvent(i);
        int i5 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return iOnNavigationEvent;
    }

    public static final /* synthetic */ int onNavigationEvent(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.RollingNumberText rollingNumberText) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = benefitActivationIntelligenceType3View.onWarmupCompleted(rollingNumberText);
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return iOnWarmupCompleted;
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus;
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
                int i2 = onWarmupCompleted + 9;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus2;
            }
            int i4 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i5 = 94 / 0;
            } else {
                getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            }
            int i6 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                int i4 = onWarmupCompleted + 7;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i6 = onNavigationEvent + 5;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 1 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onWarmupCompleted))) {
                int i2 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onNavigationEvent + 15;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            obj.hashCode();
            throw null;
        }
    }

    public final void setOnCtaClick(@Nullable Function1<? super BenefitActivationIntelligence.Type3, Unit> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        this.onNavigationEvent = function1;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 53;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 53 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View = (BenefitActivationIntelligenceType3View) objArr[0];
        BenefitActivationIntelligence.Type3 type3 = (BenefitActivationIntelligence.Type3) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[2], "");
        Function1<? super BenefitActivationIntelligence.Type3, Unit> function1 = benefitActivationIntelligenceType3View.onNavigationEvent;
        if (function1 != null) {
            function1.invoke(type3);
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@NotNull BenefitActivationIntelligence.Type3 type3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(type3, "");
        onExtraCallbackWithResult(type3);
        TdsImageView tdsImageView = this.onExtraCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, type3.onExtraCallback().onWarmupCompleted(), (Function1) null, (Function1) null, 6, (Object) null);
        onNavigationEvent(type3);
        Object[] objArr = {this.onExtraCallback.asBinder, ParamUtils.NORMAL, new BenefitActivationIntelligenceType3View$.ExternalSyntheticLambda10(this, type3)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        ComposeView composeView = this.onExtraCallback.asInterface;
        Intrinsics.checkNotNullExpressionValue(composeView, "");
        composeView.setVisibility(8);
        ComposeView composeView2 = this.onExtraCallback.onTransact;
        Intrinsics.checkNotNullExpressionValue(composeView2, "");
        composeView2.setVisibility(8);
        ComposeView composeView3 = this.onExtraCallback.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(composeView3, "");
        BenefitActivationIntelligence.RollingNumberText rollingNumberTextIAuthTabCallbackStub = type3.onExtraCallback().IAuthTabCallbackStub();
        float fOnNavigationEvent = type3.onExtraCallback().onNavigationEvent();
        Object[] objArr2 = {this, composeView3, rollingNumberTextIAuthTabCallbackStub, Float.valueOf(fOnNavigationEvent), type3.onExtraCallback().onExtraCallback(), Integer.valueOf(createCameraCaptureCallback.Companion.onTransact()), false};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, objArr2, -1848411666, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1848411670);
        ComposeView composeView4 = this.onExtraCallback.asInterface;
        Intrinsics.checkNotNullExpressionValue(composeView4, "");
        onExtraCallbackWithResult(composeView4, type3);
        ComposeView composeView5 = this.onExtraCallback.onTransact;
        Intrinsics.checkNotNullExpressionValue(composeView5, "");
        onExtraCallbackWithResult(composeView5, type3);
        onExtraCallback(type3.onExtraCallback());
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void onExtraCallbackWithResult(ComposeView composeView, BenefitActivationIntelligence.Type3 type3) {
        int i = 2 % 2;
        Object[] objArr = {this, type3.onExtraCallback().onExtraCallbackWithResult()};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        BenefitActivationIntelligence.RollingNumberText rollingNumberText = (BenefitActivationIntelligence.RollingNumberText) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, objArr, 1098528322, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1098528320);
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-1869936869, true, new BenefitActivationIntelligenceType3View$.ExternalSyntheticLambda11(this, type3, rollingNumberText))));
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
    }

    private static final Unit IAuthTabCallback(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.Type3 type3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Function1<? super BenefitActivationIntelligence.Type3, Unit> function1 = benefitActivationIntelligenceType3View.onNavigationEvent;
        if (function1 != null) {
            int i5 = i2 + 23;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            function1.invoke(type3);
            if (i6 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.RollingNumberText rollingNumberText, BenefitActivationIntelligence.Type3 type3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i7 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-141055003, i, -1, "im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType3View.bindButton.<anonymous>.<anonymous>.<anonymous> (BenefitActivationIntelligenceType3View.kt:184)");
            }
            benefitActivationIntelligenceType3View.onExtraCallback(rollingNumberText, type3.onExtraCallback().onNavigationEvent(), type3.onExtraCallback().onExtraCallback(), createCameraCaptureCallback.Companion.IAuthTabCallback(), null, true, cameraCaptureResultEmptyCameraCaptureResult, 196608, 16);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.Type3 type3, BenefitActivationIntelligence.RollingNumberText rollingNumberText, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        Object obj;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 111;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1869936869, i, -1, "im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType3View.bindButton.<anonymous>.<anonymous> (BenefitActivationIntelligenceType3View.kt:174)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(QuirksExternalSyntheticBackport0.Companion, ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).c_(benefitActivationIntelligenceType3View.onNavigationEvent(rollingNumberText)));
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = setCallToAction.IAuthTabCallback.Companion.onNavigationEvent();
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(benefitActivationIntelligenceType3View);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(type3);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || zOnNavigationEvent) {
                BenefitActivationIntelligenceType3View$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new BenefitActivationIntelligenceType3View$.ExternalSyntheticLambda8(benefitActivationIntelligenceType3View, type3);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda8);
                obj = externalSyntheticLambda8;
                setAdvertiser.onWarmupCompleted(quirksExternalSyntheticBackport0AsBinder, iAuthTabCallbackOnNavigationEvent, onwarmupcompleted, onextracallback, (setCallToAction.onNavigationEvent) null, (Function0) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, ForwardingCameraControl.onExtraCallback(-141055003, true, new BenefitActivationIntelligenceType3View$.ExternalSyntheticLambda9(benefitActivationIntelligenceType3View, rollingNumberText, type3), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3504, 6, 944);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = onExtraCallbackWithResult + 123;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                setAdvertiser.onWarmupCompleted(quirksExternalSyntheticBackport0AsBinder, iAuthTabCallbackOnNavigationEvent, onwarmupcompleted, onextracallback, (setCallToAction.onNavigationEvent) null, (Function0) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, ForwardingCameraControl.onExtraCallback(-141055003, true, new BenefitActivationIntelligenceType3View$.ExternalSyntheticLambda9(benefitActivationIntelligenceType3View, rollingNumberText, type3), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3504, 6, 944);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 93 / 0;
        }
        return unit;
    }

    private final int onNavigationEvent(BenefitActivationIntelligence.RollingNumberText rollingNumberText) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iMax = Math.max(onNavigationEvent(52), IAuthTabCallback(rollingNumberText, onWarmupCompleted()) + onNavigationEvent(20));
        int i4 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return iMax;
    }

    private final int onWarmupCompleted(BenefitActivationIntelligence.RollingNumberText rollingNumberText) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextPaint textPaintIAuthTabCallback = IAuthTabCallback();
        if (i3 != 0) {
            return IAuthTabCallback(rollingNumberText, textPaintIAuthTabCallback);
        }
        IAuthTabCallback(rollingNumberText, textPaintIAuthTabCallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ float $intervalSec;
        final /* synthetic */ Integer $loopCount;
        final /* synthetic */ List<String> $sequence;
        final /* synthetic */ launchUri $state;
        final /* synthetic */ BenefitActivationIntelligence.RollingNumberText $text;
        float F$0;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(BenefitActivationIntelligence.RollingNumberText rollingNumberText, List<String> list, Integer num, float f, launchUri launchuri, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$text = rollingNumberText;
            this.$sequence = list;
            this.$loopCount = num;
            this.$intervalSec = f;
            this.$state = launchuri;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$text, this.$sequence, this.$loopCount, this.$intervalSec, this.$state, access13800Var);
            int i2 = onExtraCallback + 83;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 123;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
        
            r6 = r21.$sequence;
            r7 = r21.$intervalSec;
            r8 = r21.$state;
            r9 = r6.iterator();
            r11 = r6;
            r10 = r8;
            r6 = 0;
            r8 = 0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:29:0x00a9, B:32:0x00b1], limit reached: 53 */
        /* JADX WARN: Path cross not found for [B:37:0x00c3, B:44:0x00d8], limit reached: 53 */
        /* JADX WARN: Path cross not found for [B:44:0x00d8, B:37:0x00c3], limit reached: 53 */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[PHI: r12 r13
          0x00b9: PHI (r12v6 java.lang.Object) = (r12v5 java.lang.Object), (r12v8 java.lang.Object) binds: [B:33:0x00b7, B:30:0x00ae] A[DONT_GENERATE, DONT_INLINE]
          0x00b9: PHI (r13v2 int) = (r13v1 int), (r13v4 int) binds: [B:33:0x00b7, B:30:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
        /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Iterable] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref.IntRef intRef;
            Integer num;
            Iterator it;
            Object next;
            int i;
            long j;
            int i2 = 2;
            int i3 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            int i5 = 1;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$text == null || this.$sequence.isEmpty()) {
                    return Unit.INSTANCE;
                }
                intRef = new Ref.IntRef();
                num = this.$loopCount;
                if (num == null) {
                }
                if (((it.hasNext() ? 1 : 0) ^ i5) != 0) {
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = IAuthTabCallback + 47;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = this.I$1;
                int i9 = this.I$0;
                float f = this.F$0;
                String str = (String) this.L$5;
                Iterator it2 = (Iterator) this.L$3;
                launchUri launchuri = (launchUri) this.L$2;
                ?? r11 = (Iterable) this.L$1;
                Ref.IntRef intRef2 = (Ref.IntRef) this.L$0;
                ResultKt.onNavigationEvent(obj);
                Iterator it3 = it2;
                launchUri launchuri2 = launchuri;
                List<String> list = r11;
                String str2 = str;
                int i10 = 2;
                int i11 = i8;
                intRef = intRef2;
                launchUri.onExtraCallbackWithResult(launchuri2, str2, false, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback) null, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) null, false, 30, (Object) null);
                it = it3;
                launchUri launchuri3 = launchuri2;
                List<String> list2 = list;
                int i12 = i10;
                int i13 = i11;
                i2 = i12;
                if (((it.hasNext() ? 1 : 0) ^ i5) != 0) {
                    intRef.element += i5;
                    num = this.$loopCount;
                    if (num == null) {
                        int i14 = onExtraCallback + 49;
                        IAuthTabCallback = i14 % 128;
                        if (i14 % i2 == 0) {
                            int i15 = intRef.element;
                            num.intValue();
                            throw null;
                        }
                        if (intRef.element >= num.intValue()) {
                            return Unit.INSTANCE;
                        }
                        List<String> list3 = this.$sequence;
                        f = this.$intervalSec;
                        launchUri launchuri4 = this.$state;
                        it = list3.iterator();
                        list2 = list3;
                        launchuri3 = launchuri4;
                        i9 = 0;
                        i13 = 0;
                    }
                    if (((it.hasNext() ? 1 : 0) ^ i5) != 0) {
                        int i16 = onExtraCallback + 13;
                        IAuthTabCallback = i16 % 128;
                        if (i16 % 2 == 0) {
                            next = it.next();
                            i = i13;
                            if (i13 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            String str3 = (String) next;
                            if (intRef.element <= 0) {
                                int i17 = IAuthTabCallback + 45;
                                onExtraCallback = i17 % 128;
                                if (i17 % i2 != 0) {
                                    int i18 = 3 / 0;
                                    if (i13 <= 0) {
                                    }
                                } else if (i13 <= 0) {
                                    i10 = i2;
                                    i5 = 1;
                                    it3 = it;
                                    launchuri2 = launchuri3;
                                    list = list2;
                                    i11 = i;
                                    str2 = str3;
                                }
                                launchUri.onExtraCallbackWithResult(launchuri2, str2, false, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback) null, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) null, false, 30, (Object) null);
                                it = it3;
                                launchUri launchuri32 = launchuri2;
                                List<String> list22 = list;
                                int i122 = i10;
                                int i132 = i11;
                                i2 = i122;
                                if (((it.hasNext() ? 1 : 0) ^ i5) != 0) {
                                }
                            }
                            j = (long) (1000.0f * f);
                            this.L$0 = intRef;
                            this.L$1 = access15400.onNavigationEvent(list22);
                            this.L$2 = launchuri32;
                            this.L$3 = it;
                            this.L$4 = access15400.onNavigationEvent(next);
                            this.L$5 = str3;
                            this.F$0 = f;
                            this.I$0 = i9;
                            this.I$1 = i;
                            this.I$2 = i132;
                            this.I$3 = 0;
                            i5 = 1;
                            this.label = 1;
                            objOnWarmupCompleted = objOnWarmupCompleted;
                            if (formatMsgs.onWarmupCompleted(j, this) != objOnWarmupCompleted) {
                                int i19 = onExtraCallback + 25;
                                IAuthTabCallback = i19 % 128;
                                int i20 = i19 % 2;
                                return objOnWarmupCompleted;
                            }
                            i10 = 2;
                            it3 = it;
                            launchuri2 = launchuri32;
                            list = list22;
                            i11 = i;
                            str2 = str3;
                            launchUri.onExtraCallbackWithResult(launchuri2, str2, false, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback) null, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) null, false, 30, (Object) null);
                            it = it3;
                            launchUri launchuri322 = launchuri2;
                            List<String> list222 = list;
                            int i1222 = i10;
                            int i1322 = i11;
                            i2 = i1222;
                            if (((it.hasNext() ? 1 : 0) ^ i5) != 0) {
                            }
                        } else {
                            next = it.next();
                            i = i1322 + 1;
                            if (i1322 < 0) {
                            }
                            String str32 = (String) next;
                            if (intRef.element <= 0) {
                            }
                            j = (long) (1000.0f * f);
                            this.L$0 = intRef;
                            this.L$1 = access15400.onNavigationEvent(list222);
                            this.L$2 = launchuri322;
                            this.L$3 = it;
                            this.L$4 = access15400.onNavigationEvent(next);
                            this.L$5 = str32;
                            this.F$0 = f;
                            this.I$0 = i9;
                            this.I$1 = i;
                            this.I$2 = i1322;
                            this.I$3 = 0;
                            i5 = 1;
                            this.label = 1;
                            objOnWarmupCompleted = objOnWarmupCompleted;
                            if (formatMsgs.onWarmupCompleted(j, this) != objOnWarmupCompleted) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[PHI: r5
      0x005e: PHI (r5v66 o.CameraCaptureResultEmptyCameraCaptureResult) = (r5v5 o.CameraCaptureResultEmptyCameraCaptureResult), (r5v67 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0050, B:5:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052 A[PHI: r5
      0x0052: PHI (r5v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r5v5 o.CameraCaptureResultEmptyCameraCaptureResult), (r5v67 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0050, B:5:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        boolean z;
        launchUri launchuri;
        int i2;
        Object obj;
        int i3;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i5;
        int i6;
        BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View = (BenefitActivationIntelligenceType3View) objArr[0];
        BenefitActivationIntelligence.RollingNumberText rollingNumberText = (BenefitActivationIntelligence.RollingNumberText) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        Integer num = (Integer) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i7 = 2 % 2;
        int i8 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(-767229115);
            if ((iIntValue2 & 14) == 0) {
                i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rollingNumberText) ? 4 : 2) | iIntValue2;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i = iIntValue2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(-767229115);
            if ((iIntValue2 & 6) == 0) {
            }
        }
        if ((iIntValue2 & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fFloatValue) ? 32 : 16;
        }
        if ((iIntValue2 & 384) == 0) {
            int i9 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(num)) {
                int i11 = onExtraCallbackWithResult + 107;
                onWarmupCompleted = i11 % 128;
                i6 = i11 % 2 != 0 ? 18651 : 256;
            } else {
                i6 = 128;
            }
            i |= i6;
        }
        if ((iIntValue2 & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iIntValue)) {
                int i12 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i |= i5;
        }
        if ((iIntValue2 & 24576) == 0) {
            int i14 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i14 % 128;
            if (i14 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(benefitActivationIntelligenceType3View);
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(benefitActivationIntelligenceType3View) ? 16384 : 8192;
        }
        int i15 = i;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i15 & 9363) != 9362, i15 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            obj = null;
            i4 = iIntValue;
            i2 = iIntValue2;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-767229115, i15, -1, "im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType3View.TitleRollingTextContent (BenefitActivationIntelligenceType3View.kt:263)");
            }
            getHumanReadableName interfaceDescriptor = AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor();
            long jICustomTabsService = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            List listIAuthTabCallback = rollingNumberText != null ? rollingNumberText.IAuthTabCallback() : null;
            if (listIAuthTabCallback == null) {
                listIAuthTabCallback = CollectionsKt.emptyList();
            }
            List list = listIAuthTabCallback;
            String str = (String) CollectionsKt.firstOrNull(list);
            if (str == null) {
                str = "";
            }
            launchUri launchuriOnWarmupCompleted = r8lambdazmdK5Aeq3EJkWJLcjaoC90W2ZHw.onWarmupCompleted(str, false, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback) null, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onNavigationEvent) null, interfaceDescriptor, jICustomTabsService, 0L, 0L, createCameraCaptureCallback.onExtraCallback(iIntValue), ScreenBrightnessBridgeExtension.onNavigationEvent(), (bindChildren) null, (use) null, 0L, graphicDeviceInfoOnExtraCallbackWithResult, (findResAndMsg) null, false, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, ((i15 << 15) & 234881024) | 805306368, 3072, 122062);
            int i16 = i15 & 14;
            if (i16 == 4) {
                int i17 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i17 % 128;
                int i18 = i17 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list);
            boolean z2 = (i15 & 896) == 256;
            boolean z3 = (i15 & 112) == 32;
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(launchuriOnWarmupCompleted);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (((z2 | z | zOnNavigationEvent | z3) || zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                launchuri = launchuriOnWarmupCompleted;
                i2 = iIntValue2;
                obj = null;
                i3 = i16;
                i4 = iIntValue;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(rollingNumberText, list, num, fFloatValue, launchuri, null);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(iAuthTabCallback);
                objOnMinimized = iAuthTabCallback;
            } else {
                launchuri = launchuriOnWarmupCompleted;
                i4 = iIntValue;
                i2 = iIntValue2;
                obj = null;
                i3 = i16;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(rollingNumberText, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, i3);
            benefitActivationIntelligenceType3View.onExtraCallbackWithResult(launchuri, rollingNumberText, quirksExternalSyntheticBackport0OnExtraCallback, false, cameraCaptureResultEmptyCameraCaptureResult2, ((i15 << 3) & 112) | 384 | (i15 & 57344), 8);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new BenefitActivationIntelligenceType3View$.ExternalSyntheticLambda5(benefitActivationIntelligenceType3View, rollingNumberText, fFloatValue, num, i4, i2));
        }
        return obj;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ float $intervalSec;
        final /* synthetic */ Integer $loopCount;
        final /* synthetic */ List<String> $sequence;
        final /* synthetic */ launchUri $state;
        final /* synthetic */ BenefitActivationIntelligence.RollingNumberText $text;
        float F$0;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(BenefitActivationIntelligence.RollingNumberText rollingNumberText, List<String> list, Integer num, float f, launchUri launchuri, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$text = rollingNumberText;
            this.$sequence = list;
            this.$loopCount = num;
            this.$intervalSec = f;
            this.$state = launchuri;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$text, this.$sequence, this.$loopCount, this.$intervalSec, this.$state, access13800Var);
            int i2 = onNavigationEvent + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
        
            r16 = r9;
            r17 = r10;
            r18 = r11;
            r1 = r13;
            r9 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
        
            r6 = r19.$sequence;
            r7 = r19.$intervalSec;
            r8 = r19.$state;
            r9 = r6.iterator();
            r11 = r6;
            r10 = r8;
            r6 = 0;
            r8 = 0;
         */
        /* JADX WARN: Path cross not found for [B:26:0x00a5, B:29:0x00ae], limit reached: 44 */
        /* JADX WARN: Path cross not found for [B:34:0x00c0, B:36:0x00c3], limit reached: 44 */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b6 A[PHI: r12 r13
          0x00b6: PHI (r12v5 java.lang.Object) = (r12v4 java.lang.Object), (r12v8 java.lang.Object) binds: [B:30:0x00b4, B:27:0x00ab] A[DONT_GENERATE, DONT_INLINE]
          0x00b6: PHI (r13v2 int) = (r13v1 int), (r13v4 int) binds: [B:30:0x00b4, B:27:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00f1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref.IntRef intRef;
            Integer num;
            float f;
            Iterator it;
            Object obj2;
            launchUri launchuri;
            int i;
            int i2;
            Object next;
            int i3;
            String str;
            long j;
            int i4 = 2;
            int i5 = 2 % 2;
            int i6 = onNavigationEvent + 103;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i8 = this.label;
            if (i8 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$text == null || this.$sequence.isEmpty()) {
                    return Unit.INSTANCE;
                }
                intRef = new Ref.IntRef();
                int i9 = onWarmupCompleted + 27;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 4 / 5;
                }
                num = this.$loopCount;
                if (num == null) {
                    List<String> list = this.$sequence;
                    f = this.$intervalSec;
                    launchUri launchuri2 = this.$state;
                    it = list.iterator();
                    obj2 = list;
                    launchuri = launchuri2;
                    i = 0;
                    i2 = 0;
                }
                if (!it.hasNext()) {
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = onNavigationEvent + 35;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                int i13 = this.I$1;
                i = this.I$0;
                f = this.F$0;
                String str2 = (String) this.L$5;
                Iterator it2 = (Iterator) this.L$3;
                launchUri launchuri3 = (launchUri) this.L$2;
                Object obj3 = (Iterable) this.L$1;
                Ref.IntRef intRef2 = (Ref.IntRef) this.L$0;
                ResultKt.onNavigationEvent(obj);
                int i14 = i13;
                Iterator it3 = it2;
                launchUri launchuri4 = launchuri3;
                Object obj4 = obj3;
                intRef = intRef2;
                String str3 = str2;
                launchUri.onExtraCallbackWithResult(launchuri4, str3, false, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback) null, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) null, false, 30, (Object) null);
                i2 = i14;
                it = it3;
                launchuri = launchuri4;
                obj2 = obj4;
                i4 = 2;
                if (!it.hasNext()) {
                    int i15 = onNavigationEvent + 109;
                    onWarmupCompleted = i15 % 128;
                    if (i15 % i4 == 0) {
                        next = it.next();
                        i3 = i2 % 0;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        str = (String) next;
                        if (intRef.element <= 0 || i2 > 0) {
                            j = (long) (1000.0f * f);
                            this.L$0 = intRef;
                            this.L$1 = access15400.onNavigationEvent(obj2);
                            this.L$2 = launchuri;
                            this.L$3 = it;
                            this.L$4 = access15400.onNavigationEvent(next);
                            this.L$5 = str;
                            this.F$0 = f;
                            this.I$0 = i;
                            this.I$1 = i3;
                            this.I$2 = i2;
                            this.I$3 = 0;
                            this.label = 1;
                            objOnWarmupCompleted = objOnWarmupCompleted;
                            if (formatMsgs.onWarmupCompleted(j, this) != objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                            it3 = it;
                            launchuri4 = launchuri;
                            obj4 = obj2;
                            i14 = i3;
                            str3 = str;
                        }
                        launchUri.onExtraCallbackWithResult(launchuri4, str3, false, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback) null, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) null, false, 30, (Object) null);
                        i2 = i14;
                        it = it3;
                        launchuri = launchuri4;
                        obj2 = obj4;
                        i4 = 2;
                        if (!it.hasNext()) {
                            intRef.element++;
                            i4 = 2;
                            num = this.$loopCount;
                            if (num == null && intRef.element >= num.intValue()) {
                                return Unit.INSTANCE;
                            }
                            List<String> list2 = this.$sequence;
                            f = this.$intervalSec;
                            launchUri launchuri22 = this.$state;
                            it = list2.iterator();
                            obj2 = list2;
                            launchuri = launchuri22;
                            i = 0;
                            i2 = 0;
                            if (!it.hasNext()) {
                            }
                        }
                    } else {
                        next = it.next();
                        i3 = i2 + 1;
                        if (i2 < 0) {
                        }
                        str = (String) next;
                        if (intRef.element <= 0) {
                        }
                        j = (long) (1000.0f * f);
                        this.L$0 = intRef;
                        this.L$1 = access15400.onNavigationEvent(obj2);
                        this.L$2 = launchuri;
                        this.L$3 = it;
                        this.L$4 = access15400.onNavigationEvent(next);
                        this.L$5 = str;
                        this.F$0 = f;
                        this.I$0 = i;
                        this.I$1 = i3;
                        this.I$2 = i2;
                        this.I$3 = 0;
                        this.label = 1;
                        objOnWarmupCompleted = objOnWarmupCompleted;
                        if (formatMsgs.onWarmupCompleted(j, this) != objOnWarmupCompleted) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(BenefitActivationIntelligence.RollingNumberText rollingNumberText, float f, Integer num, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        int i6;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        List listEmptyList;
        boolean z4;
        int i7;
        int i8;
        int i9;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
        int i10 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-100331920);
        if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rollingNumberText) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(num) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                i9 = 1024;
            } else {
                int i11 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                i9 = 2048;
            }
            i4 |= i9;
        }
        int i13 = i3 & 16;
        if (i13 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            int i14 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 27 / 0;
                i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ? 16384 : 8192;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03)) {
            }
            i4 |= i5;
        }
        int i16 = i3 & 32;
        if (i16 == 0) {
            if ((i2 & 196608) == 0) {
                z2 = z;
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                    i6 = 65536;
                } else {
                    int i17 = onExtraCallbackWithResult + 17;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    i6 = 131072;
                }
                i4 |= i6;
            }
            if ((1572864 & i2) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this)) {
                    int i19 = onExtraCallbackWithResult + 53;
                    onWarmupCompleted = i19 % 128;
                    int i20 = i19 % 2;
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i4) == 599186, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                z3 = z2;
            } else {
                if (i13 != 0) {
                    quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                boolean z5 = i16 != 0 ? false : z2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-100331920, i4, -1, "im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType3View.RollingTextContent (BenefitActivationIntelligenceType3View.kt:308)");
                }
                Object obj = null;
                if (rollingNumberText != null) {
                    int i21 = onWarmupCompleted + 31;
                    onExtraCallbackWithResult = i21 % 128;
                    if (i21 % 2 == 0) {
                        rollingNumberText.IAuthTabCallback();
                        obj.hashCode();
                        throw null;
                    }
                    listEmptyList = rollingNumberText.IAuthTabCallback();
                } else {
                    listEmptyList = null;
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List list = listEmptyList;
                String str = (String) CollectionsKt.firstOrNull(list);
                if (str == null) {
                    str = "";
                }
                launchUri launchuriOnWarmupCompleted = r8lambdazmdK5Aeq3EJkWJLcjaoC90W2ZHw.onWarmupCompleted(str, false, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback) null, (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onNavigationEvent) null, AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IPostMessageService_Parcel(), 0L, 0L, createCameraCaptureCallback.onExtraCallback(i), ScreenBrightnessBridgeExtension.IAuthTabCallback(), (bindChildren) null, (use) null, 0L, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), (findResAndMsg) null, false, (Object) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i4 << 15) & 234881024) | 805306368, 3072, 122062);
                int i22 = i4 & 14;
                boolean z6 = i22 == 4;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list);
                boolean z7 = (i4 & 896) == 256;
                if ((i4 & 112) == 32) {
                    int i23 = onWarmupCompleted + 81;
                    onExtraCallbackWithResult = i23 % 128;
                    int i24 = i23 % 2;
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(launchuriOnWarmupCompleted);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnNavigationEvent2 || (z7 | zOnNavigationEvent | z6 | z4)) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    i7 = i4;
                    objOnMinimized = new onWarmupCompleted(rollingNumberText, list, num, f, launchuriOnWarmupCompleted, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                } else {
                    i7 = i4;
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(rollingNumberText, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i22);
                int i25 = i7 >> 6;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                onExtraCallbackWithResult(launchuriOnWarmupCompleted, rollingNumberText, quirksExternalSyntheticBackport04, z5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i7 << 3) & 112) | (i25 & 896) | (i25 & 7168) | (i25 & 57344), 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i26 = onWarmupCompleted + 9;
                    onExtraCallbackWithResult = i26 % 128;
                    if (i26 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                z3 = z5;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new BenefitActivationIntelligenceType3View$.ExternalSyntheticLambda7(this, rollingNumberText, f, num, i, quirksExternalSyntheticBackport02, z3, i2, i3));
                return;
            }
            return;
        }
        int i27 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i27 % 128;
        int i28 = i27 % 2;
        i4 |= 196608;
        z2 = z;
        if ((1572864 & i2) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i4) == 599186, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit IAuthTabCallback(String str, launchUri launchuri, String str2, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            int i2 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            str = "";
        }
        sb.append(str);
        sb.append(launchuri.onExtraCallbackWithResult());
        if (str2 == null) {
            int i3 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            str2 = "";
        }
        sb.append(str2);
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, sb.toString());
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 115;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1222063532, i, -1, "im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType3View.RenderRollingText.<anonymous>.<anonymous> (BenefitActivationIntelligenceType3View.kt:364)");
            }
            benefitActivationIntelligenceType3View.onWarmupCompleted(str, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 67;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(618087794, i, -1, "im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType3View.RenderRollingText.<anonymous>.<anonymous> (BenefitActivationIntelligenceType3View.kt:365)");
                    int i6 = 4 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(618087794, i, -1, "im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType3View.RenderRollingText.<anonymous>.<anonymous> (BenefitActivationIntelligenceType3View.kt:365)");
                }
            }
            benefitActivationIntelligenceType3View.onWarmupCompleted(str, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(launchUri launchuri, BenefitActivationIntelligence.RollingNumberText rollingNumberText, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        boolean z2;
        int i5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        Function2 function2;
        Function2 function2OnExtraCallback;
        int i6;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2118480552);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(launchuri) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rollingNumberText) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ^ true) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                        int i9 = onExtraCallbackWithResult + 7;
                        onWarmupCompleted = i9 % 128;
                        i5 = i9 % 2 != 0 ? 27355 : 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                Object obj = null;
                if ((i & 24576) == 0) {
                    int i10 = onExtraCallbackWithResult + 85;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this);
                        obj.hashCode();
                        throw null;
                    }
                    if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this)) {
                        i6 = 8192;
                    } else {
                        int i11 = onExtraCallbackWithResult + 1;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        i6 = 16384;
                    }
                    i3 |= i6;
                }
                boolean z4 = false;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i8 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                    boolean z5 = i4 != 0 ? false : z2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i13 = onExtraCallbackWithResult + 37;
                        onWarmupCompleted = i13 % 128;
                        if (i13 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2118480552, i3, -1, "im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType3View.RenderRollingText (BenefitActivationIntelligenceType3View.kt:351)");
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2118480552, i3, -1, "im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType3View.RenderRollingText (BenefitActivationIntelligenceType3View.kt:351)");
                    }
                    String strOnNavigationEvent = rollingNumberText != null ? rollingNumberText.onNavigationEvent() : null;
                    String strOnExtraCallbackWithResult = rollingNumberText != null ? rollingNumberText.onExtraCallbackWithResult() : null;
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnNavigationEvent);
                    int i14 = i3 & 14;
                    if (i14 == 4) {
                        int i15 = onExtraCallbackWithResult + 43;
                        onWarmupCompleted = i15 % 128;
                        if (i15 % 2 == 0) {
                            z4 = true;
                        }
                    }
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallbackWithResult);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnNavigationEvent2 | zOnNavigationEvent | z4) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new BenefitActivationIntelligenceType3View$.ExternalSyntheticLambda0(strOnNavigationEvent, launchuri, strOnExtraCallbackWithResult);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport05, (Function1) objOnMinimized);
                    if (z5) {
                        int i16 = onExtraCallbackWithResult + 29;
                        onWarmupCompleted = i16 % 128;
                        if (i16 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1405272720);
                            throw null;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1405272720);
                        if (strOnNavigationEvent == null) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1405349630);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            function2 = null;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1405349631);
                            Function2 function2OnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-1222063532, true, new BenefitActivationIntelligenceType3View$.ExternalSyntheticLambda1(this, strOnNavigationEvent), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            function2 = function2OnExtraCallback2;
                        }
                        if (strOnExtraCallbackWithResult == null) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1405411134);
                            function2OnExtraCallback = null;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1405411135);
                            function2OnExtraCallback = ForwardingCameraControl.onExtraCallback(618087794, true, new BenefitActivationIntelligenceType3View$.ExternalSyntheticLambda2(this, strOnExtraCallbackWithResult), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onExtraCallbackWithResult(launchuri, quirksExternalSyntheticBackport0OnWarmupCompleted, function2, function2OnExtraCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i14, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1405533430);
                        if (strOnNavigationEvent == null) {
                            int i17 = onExtraCallbackWithResult + 91;
                            onWarmupCompleted = i17 % 128;
                            int i18 = i17 % 2;
                            strOnNavigationEvent = "";
                        }
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                        String str = strOnNavigationEvent;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(launchuri, quirksExternalSyntheticBackport0OnWarmupCompleted, str, strOnExtraCallbackWithResult == null ? "" : strOnExtraCallbackWithResult, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult2, i14, 48);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                    z3 = z5;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    z3 = z2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new BenefitActivationIntelligenceType3View$.ExternalSyntheticLambda3(this, launchuri, rollingNumberText, quirksExternalSyntheticBackport03, z3, i, i2));
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            Object obj2 = null;
            if ((i & 24576) == 0) {
            }
            boolean z42 = false;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        Object obj22 = null;
        if ((i & 24576) == 0) {
        }
        boolean z422 = false;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private final void onWarmupCompleted(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-217743962);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            int i6 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 2;
            }
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = 41;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this)) {
                int i9 = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    i8 = 32;
                }
            } else {
                int i10 = onWarmupCompleted + 41;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i2 & 19) != 18) {
            int i12 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-217743962, i2, -1, "im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType3View.NoWrapAffix (BenefitActivationIntelligenceType3View.kt:379)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{IAuthTabCallback(str), null, null, 0L, 0L, 0L, null, 1, null, Float.valueOf(ScreenBrightnessBridgeExtension.IAuthTabCallback()), null, null, 0L, Integer.valueOf(AppLovinVastMediaViewf.Companion.IAuthTabCallback()), false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 817889280, 27648, 105854}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new BenefitActivationIntelligenceType3View$.ExternalSyntheticLambda6(this, str, i));
        }
    }

    private final int IAuthTabCallback(BenefitActivationIntelligence.RollingNumberText rollingNumberText, TextPaint textPaint) {
        int i = 2 % 2;
        if (rollingNumberText == null) {
            int i2 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        List listIAuthTabCallback = rollingNumberText.IAuthTabCallback();
        if (listIAuthTabCallback == null) {
            int i4 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                CollectionsKt.emptyList();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            listIAuthTabCallback = CollectionsKt.emptyList();
        }
        listCreateListBuilder.addAll(listIAuthTabCallback);
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        if (!(!listBuild.isEmpty())) {
            listBuild = CollectionsKt.listOf("");
        }
        Iterator it = listBuild.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        String str = (String) it.next();
        StringBuilder sb = new StringBuilder();
        String strOnNavigationEvent = rollingNumberText.onNavigationEvent();
        if (strOnNavigationEvent == null) {
            strOnNavigationEvent = "";
        }
        sb.append(strOnNavigationEvent);
        sb.append(str);
        String strOnExtraCallbackWithResult = rollingNumberText.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult == null) {
            int i5 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            strOnExtraCallbackWithResult = "";
        }
        sb.append(strOnExtraCallbackWithResult);
        int iCeil = (int) Math.ceil(textPaint.measureText(sb.toString()));
        while (it.hasNext()) {
            String str2 = (String) it.next();
            StringBuilder sb2 = new StringBuilder();
            String strOnNavigationEvent2 = rollingNumberText.onNavigationEvent();
            if (strOnNavigationEvent2 == null) {
                strOnNavigationEvent2 = "";
            }
            sb2.append(strOnNavigationEvent2);
            sb2.append(str2);
            String strOnExtraCallbackWithResult2 = rollingNumberText.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult2 == null) {
                strOnExtraCallbackWithResult2 = "";
            }
            sb2.append(strOnExtraCallbackWithResult2);
            int iCeil2 = (int) Math.ceil(textPaint.measureText(sb2.toString()));
            if (iCeil < iCeil2) {
                int i7 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                iCeil = iCeil2;
            }
        }
        return iCeil;
    }

    private final String IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        String strReplace$default = i2 % 2 == 0 ? StringsKt.replace$default(str, " ", " ", false, 2, (Object) null) : StringsKt.replace$default(str, " ", " ", false, 4, (Object) null);
        int i3 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
        return strReplace$default;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View = (BenefitActivationIntelligenceType3View) objArr[0];
        BenefitActivationIntelligence.RollingNumberText rollingNumberText = (BenefitActivationIntelligence.RollingNumberText) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        ArrayList arrayList = null;
        if (rollingNumberText == null) {
            int i5 = i2 + 41;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            arrayList.hashCode();
            throw null;
        }
        List listIAuthTabCallback = rollingNumberText.IAuthTabCallback();
        if (listIAuthTabCallback != null) {
            List list = listIAuthTabCallback;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(benefitActivationIntelligenceType3View.onExtraCallbackWithResult((String) it.next()));
            }
        }
        BenefitActivationIntelligence.RollingNumberText rollingNumberTextIAuthTabCallback = BenefitActivationIntelligence.RollingNumberText.IAuthTabCallback(rollingNumberText, (String) null, (String) null, arrayList, 3, (Object) null);
        int i6 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return rollingNumberTextIAuthTabCallback;
    }

    private final String onExtraCallbackWithResult(String str) {
        Long longOrNull;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            longOrNull = StringsKt.toLongOrNull(StringsKt.replace$default(str, ",", "", false, 4, (Object) null));
            if (longOrNull == null) {
                return str;
            }
        } else {
            longOrNull = StringsKt.toLongOrNull(StringsKt.replace$default(str, ",", "", false, 4, (Object) null));
            if (longOrNull == null) {
                return str;
            }
        }
        long jLongValue = longOrNull.longValue();
        Object[] objArr = {Long.valueOf(jLongValue), ParamImpl.EMPTY};
        String str2 = (String) getLongName.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -640286283, ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, 640286283);
        int i3 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    private final TextPaint onWarmupCompleted() {
        int i = 2 % 2;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        connectionCount connectioncount = new connectionCount(accessgetTlsVersionsAsStringp.Typography7.getSize(), 0.0f, 2, (DefaultConstructorMarker) null);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textPaint.setTextSize(accessgetCipherSuitesAsStringp.onExtraCallback(connectioncount, context, ScreenBrightnessBridgeExtension.IAuthTabCallback()));
        response responseVar = response.SemiBold;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textPaint.setTypeface(response.toTypeface$default(responseVar, context2, (setDone) null, 2, (Object) null));
        int i2 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return textPaint;
        }
        throw null;
    }

    private final TextPaint IAuthTabCallback() {
        int i = 2 % 2;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        Object obj = null;
        connectionCount connectioncount = new connectionCount(accessgetTlsVersionsAsStringp.Typography5.getSize(), 0.0f, 2, (DefaultConstructorMarker) null);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textPaint.setTextSize(accessgetCipherSuitesAsStringp.onExtraCallback(connectioncount, context, ScreenBrightnessBridgeExtension.onNavigationEvent()));
        response responseVar = response.Bold;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textPaint.setTypeface(response.toTypeface$default(responseVar, context2, (setDone) null, 2, (Object) null));
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return textPaint;
        }
        obj.hashCode();
        throw null;
    }

    private final int onNavigationEvent(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (i3 != 0) {
            boolean z = layoutParams instanceof ViewGroup.MarginLayoutParams;
            throw null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.getMarginStart();
        }
        int i4 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    private final int onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (int) (i * getResources().getDisplayMetrics().density);
        int i6 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private final void onExtraCallbackWithResult(BenefitActivationIntelligence.Type3 type3) {
        TdsListHeaderV3View.onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        TdsListHeaderV3View tdsListHeaderV3View = this.onExtraCallback.onWarmupCompleted;
        int iOnNavigationEvent = 0;
        tdsListHeaderV3View.setTitleText(AppLovinCmpErrorCode.onExtraCallback(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(tdsListHeaderV3View.getContext().getResources().getConfiguration().fontScale >= 1.2f ? StringsKt.replace$default(type3.asBinder(), "\n", " ", false, 4, (Object) null) : type3.asBinder(), false, 1, (Object) null), (Function1) null, 1, (Object) null));
        if (Intrinsics.areEqual(type3.IAuthTabCallbackDefault(), Boolean.TRUE)) {
            onwarmupcompleted = TdsListHeaderV3View.onWarmupCompleted.TOP;
        } else {
            onwarmupcompleted = TdsListHeaderV3View.onWarmupCompleted.BOTTOM;
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        tdsListHeaderV3View.setDescriptionPosition(onwarmupcompleted);
        if (type3.IAuthTabCallback() == null || !(!StringsKt.isBlank(r2))) {
            tdsListHeaderV3View.setDescriptionType((TdsListHeaderV3View.IAuthTabCallback) null);
        } else {
            tdsListHeaderV3View.setDescriptionType(TdsListHeaderV3View.IAuthTabCallback.TEXT);
            getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpOnWarmupCompleted = tdsListHeaderV3View.onWarmupCompleted();
            if (getminwebsocketmessagetocompressokhttpOnWarmupCompleted != null) {
                getminwebsocketmessagetocompressokhttpOnWarmupCompleted.onNavigationEvent(AppLovinCmpErrorCode.onExtraCallback(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(type3.IAuthTabCallback(), false, 1, (Object) null), (Function1) null, 1, (Object) null));
                Context context = tdsListHeaderV3View.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                getminwebsocketmessagetocompressokhttpOnWarmupCompleted.onNavigationEvent(Integer.valueOf(new getUrlokhttp(new onNavigationEvent(configuration)).onPostMessage()));
                getminwebsocketmessagetocompressokhttpOnWarmupCompleted.IAuthTabCallback().IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)));
                int i4 = onWarmupCompleted + 43;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        tdsListHeaderV3View.setRightType((TdsListHeaderV3View.onExtraCallback) null);
        Typography7 typography7 = this.onExtraCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        typography7.setVisibility(type3.onNavigationEvent() ? 0 : 8);
        TdsListHeaderV3View tdsListHeaderV3View2 = this.onExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsListHeaderV3View2, "");
        ViewGroup.LayoutParams layoutParams = tdsListHeaderV3View2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (type3.onNavigationEvent()) {
            int i6 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i6 % 128;
            iOnNavigationEvent = i6 % 2 != 0 ? onNavigationEvent(97) : onNavigationEvent(30);
        }
        marginLayoutParams.setMarginEnd(iOnNavigationEvent);
        tdsListHeaderV3View2.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(BenefitActivationIntelligence.Type3 type3) {
        boolean z;
        int i = 2 % 2;
        String strAsInterface = type3.onExtraCallback().asInterface();
        Object obj = null;
        if (strAsInterface != null) {
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                StringsKt.isBlank(strAsInterface);
                throw null;
            }
            if (StringsKt.isBlank(strAsInterface)) {
                z = true;
            } else {
                int i3 = onWarmupCompleted + 79;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                z = false;
            }
        }
        Typography7 typography7 = this.onExtraCallback.IAuthTabCallbackStub;
        String strAsInterface2 = type3.onExtraCallback().asInterface();
        if (strAsInterface2 == null) {
            int i5 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            strAsInterface2 = "";
        }
        typography7.setText(strAsInterface2);
        Typography7 typography72 = this.onExtraCallback.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(typography72, "");
        typography72.setVisibility(!z ? 0 : 8);
        Typography7 typography73 = this.onExtraCallback.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(typography73, "");
        ViewGroup.LayoutParams layoutParams = typography73.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        int i6 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = 0;
        typography73.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5 A[PHI: r1
      0x00d5: PHI (r1v11 androidx.compose.ui.platform.ComposeView) = (r1v8 androidx.compose.ui.platform.ComposeView), (r1v13 androidx.compose.ui.platform.ComposeView) binds: [B:19:0x00d3, B:16:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7 A[PHI: r1
      0x00d7: PHI (r1v9 androidx.compose.ui.platform.ComposeView) = (r1v8 androidx.compose.ui.platform.ComposeView), (r1v13 androidx.compose.ui.platform.ComposeView) binds: [B:19:0x00d3, B:16:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(BenefitActivationIntelligence.Row row) {
        ComposeView composeView;
        int i;
        int i2 = 2 % 2;
        BenefitActivationIntelligence.RollingNumberText rollingNumberText = (BenefitActivationIntelligence.RollingNumberText) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this, row.onExtraCallbackWithResult()}, 1098528322, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1098528320);
        LinearLayout linearLayout = this.onExtraCallback.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (!(!linearLayout.isLaidOut()) && !linearLayout.isLayoutRequested()) {
            int i3 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(this, rollingNumberText);
            int iOnNavigationEvent = onNavigationEvent(this, row.IAuthTabCallbackStub());
            int width = IAuthTabCallback(this).IAuthTabCallback_Parcel.getWidth();
            int width2 = IAuthTabCallback(this).onExtraCallback.getWidth();
            LinearLayout linearLayout2 = IAuthTabCallback(this).IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            boolean z = iOnExtraCallbackWithResult > (((width - width2) - IAuthTabCallback(this, linearLayout2)) - iOnNavigationEvent) - onNavigationEvent(this, 12);
            ComposeView composeView2 = IAuthTabCallback(this).onTransact;
            Intrinsics.checkNotNullExpressionValue(composeView2, "");
            ViewGroup.LayoutParams layoutParams = composeView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            int i5 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.topMargin = onNavigationEvent(this, 2);
                composeView2.setLayoutParams(marginLayoutParams);
                composeView = IAuthTabCallback(this).asInterface;
                Intrinsics.checkNotNullExpressionValue(composeView, "");
                if (z) {
                    i = 8;
                } else {
                    int i6 = onWarmupCompleted + 113;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    i = 0;
                }
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams2.setMarginStart(0);
                marginLayoutParams2.topMargin = onNavigationEvent(this, 4);
                composeView2.setLayoutParams(marginLayoutParams2);
                composeView = IAuthTabCallback(this).asInterface;
                Intrinsics.checkNotNullExpressionValue(composeView, "");
                if (z) {
                }
            }
            composeView.setVisibility(i);
            ComposeView composeView3 = IAuthTabCallback(this).onTransact;
            Intrinsics.checkNotNullExpressionValue(composeView3, "");
            composeView3.setVisibility(z ? 0 : 8);
            return;
        }
        linearLayout.addOnLayoutChangeListener(new IAuthTabCallbackDefault(rollingNumberText, row));
    }

    public static /* synthetic */ Unit onWarmupCompleted(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.RollingNumberText rollingNumberText, float f, Integer num, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {benefitActivationIntelligenceType3View, rollingNumberText, Float.valueOf(f), num, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, objArr, -497694351, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 497694359);
    }

    private static final Unit onExtraCallback(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {benefitActivationIntelligenceType3View, str, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, objArr, -287496841, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 287496848);
    }

    private static final Unit IAuthTabCallback(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, launchUri launchuri, BenefitActivationIntelligence.RollingNumberText rollingNumberText, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {benefitActivationIntelligenceType3View, launchuri, rollingNumberText, quirksExternalSyntheticBackport0, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, objArr, 772310421, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -772310421);
    }

    private static final Unit onNavigationEvent(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.RollingNumberText rollingNumberText, float f, Integer num, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {benefitActivationIntelligenceType3View, rollingNumberText, Float.valueOf(f), num, Integer.valueOf(i), quirksExternalSyntheticBackport0, Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, objArr, 920737167, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -920737161);
    }

    private final void onExtraCallback(BenefitActivationIntelligence.RollingNumberText rollingNumberText, float f, Integer num, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {this, rollingNumberText, Float.valueOf(f), num, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, objArr, 622200257, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -622200256);
    }

    private static final Unit onWarmupCompleted(BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.Type3 type3, View view) {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{benefitActivationIntelligenceType3View, type3, view}, -229401762, iOnExtraCallback3, 229401765);
    }

    private final void onWarmupCompleted(ComposeView composeView, BenefitActivationIntelligence.RollingNumberText rollingNumberText, float f, Integer num, int i, boolean z) {
        Object[] objArr = {this, composeView, rollingNumberText, Float.valueOf(f), num, Integer.valueOf(i), Boolean.valueOf(z)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, objArr, -1848411666, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1848411670);
    }

    private static final Unit onExtraCallback(boolean z, BenefitActivationIntelligenceType3View benefitActivationIntelligenceType3View, BenefitActivationIntelligence.RollingNumberText rollingNumberText, float f, Integer num, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Boolean.valueOf(z), benefitActivationIntelligenceType3View, rollingNumberText, Float.valueOf(f), num, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback, objArr, -1280310212, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1280310217);
    }

    private final BenefitActivationIntelligence.RollingNumberText IAuthTabCallback(BenefitActivationIntelligence.RollingNumberText rollingNumberText) {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (BenefitActivationIntelligence.RollingNumberText) onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this, rollingNumberText}, 1098528322, iOnExtraCallback3, -1098528320);
    }
}
