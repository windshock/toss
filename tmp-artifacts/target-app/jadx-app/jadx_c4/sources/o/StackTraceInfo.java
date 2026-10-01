package o;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.internal.ads.zzgsa;
import com.skt.usp.UCPApiConstants;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.feature.credit.ui.main.home.CreditHomeViewModel;
import im.toss.features.credit.CreditBaseViewModel;
import im.toss.features.credit.data.response.CreditHomeHeaderCta;
import im.toss.features.credit.data.response.CreditHomeHeaderItem;
import im.toss.features.credit.data.response.CreditHomeHeaderResponse;
import im.toss.features.credit.data.response.CreditHomeLargeBannerResponse;
import im.toss.features.credit.data.response.CreditHomeLargeBannerType;
import im.toss.features.credit.data.response.MyQuizDetailsResponse;
import im.toss.features.credit.data.response.ScoreDeltaInfo;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.inventory_sdk.InventoryAdManager;
import im.toss.inventory_sdk.model.InventoryAdDto;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SetDetectableSize;
import o.StackTraceInfo;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.createWifiConfiguration;
import o.getPreRenderJob;
import o.getSharedPreferences;
import o.getViewTypeCount;
import o.h5ScreenShotObserverOnChangeOpt;
import o.liteProcessHandlerThreadOpt;
import o.liteTrackWatchDogHandlerThreadOpt;
import o.oExternalSyntheticLambda0;
import o.onUnavailable;
import o.setHorizontalGravity;
import o.toPreviewOnlyRange;
import o.w5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class StackTraceInfo {
    private static short[] onWarmupCompleted;
    private static final byte[] $$a = {69, 81, 99, -123};
    private static final int $$b = 68;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallback = 1789065545;
    private static int onExtraCallback = -1538795398;
    private static int onExtraCallbackWithResult = -1592448411;
    private static byte[] onNavigationEvent = {-102, 35, 37, 51, -101, 86, 85, 120, 82, -98, -114, 100, 113, -114, 112, 114, 100, -102, -37, -30, -64};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3;
        int i4 = (i * 3) + 4;
        int i5 = (b * 4) + 1;
        int i6 = 115 - (s * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i4++;
            i6 = (-i6) + i7;
            i2 = i3;
            int i8 = i4;
            int i9 = i6;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i9;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i4 = i8;
            i6 = bArr[i8];
            i7 = i9;
            i4++;
            i6 = (-i6) + i7;
            i2 = i3;
            int i82 = i4;
            int i92 = i6;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i92;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            int i822 = i4;
            int i922 = i6;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i922;
            if (i3 == i5) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeViewModel creditHomeViewModel) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackDefault(creditHomeViewModel);
        }
        IAuthTabCallbackDefault(creditHomeViewModel);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeViewModel creditHomeViewModel, Resources resources) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditHomeViewModel, resources);
        int i4 = asInterface + 95;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeViewModel creditHomeViewModel, CreditHomeHeaderItem creditHomeHeaderItem, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 97;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeViewModel, creditHomeHeaderItem, i);
        int i5 = onTransact + 63;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeViewModel creditHomeViewModel, String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditHomeViewModel, str, liteprocesshandlerthreadopt);
        int i4 = asInterface + 25;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeViewModel creditHomeViewModel, Function1 function1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = asInterface + 35;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditHomeViewModel, function1, cameraPresenceProviderExternalSyntheticLambda6, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 26 / 0;
        }
        int i6 = onTransact + 63;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeViewModel creditHomeViewModel, Function1 function1, enableAppModelOpt enableappmodelopt, getSharedPreferences getsharedpreferences) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditHomeViewModel, function1, enableappmodelopt, getsharedpreferences);
        int i4 = onTransact + 83;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeViewModel creditHomeViewModel, boolean z, boolean z2, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function1 function13, InventoryAdManager inventoryAdManager, String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onTransact + 49;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeViewModel, z, z2, function1, function12, function0, function02, function13, inventoryAdManager, str, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onTransact + 53;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeHeaderItem creditHomeHeaderItem, int i, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onTransact + 13;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(-1697812153, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{creditHomeHeaderItem, Integer.valueOf(i), setDetectableSize}, 1697812155, R.drawable.IAuthTabCallback());
        int i4 = onTransact + 121;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ScoreDeltaInfo scoreDeltaInfo, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(scoreDeltaInfo, setDetectableSize);
        }
        onExtraCallback(scoreDeltaInfo, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
            return (Unit) onWarmupCompleted(-1720888511, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{str, str2, setDetectableSize}, 1720888515, iIAuthTabCallback3);
        }
        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback5 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback6 = R.drawable.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(str, setDetectableSize);
        }
        onWarmupCompleted(str, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(str, liteprocesshandlerthreadopt, setDetectableSize);
        int i4 = onTransact + 45;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSharedPreferences getsharedpreferences, enableAppModelOpt enableappmodelopt, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getsharedpreferences, enableappmodelopt, setDetectableSize);
        int i4 = asInterface + 41;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, ScoreDeltaInfo scoreDeltaInfo, List list, CreditHomeViewModel creditHomeViewModel, Function1 function1, String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 9;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return (Unit) onWarmupCompleted(1457519689, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{Boolean.valueOf(z), scoreDeltaInfo, list, creditHomeViewModel, function1, str, liteprocesshandlerthreadopt, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1457519656, R.drawable.IAuthTabCallback());
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(CreditHomeHeaderItem creditHomeHeaderItem, int i, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 45;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return asBinder(creditHomeHeaderItem, i, setDetectableSize);
        }
        asBinder(creditHomeHeaderItem, i, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[0];
        onUnavailable onunavailable = (onUnavailable) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeViewModel, onunavailable);
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        String str = (String) objArr[0];
        CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, creditHomeViewModel);
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        String str = (String) objArr[0];
        CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        CreditHomeHeaderItem creditHomeHeaderItem = (CreditHomeHeaderItem) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {str, creditHomeViewModel, function1, creditHomeHeaderItem, Integer.valueOf(iIntValue)};
        Unit unit = (Unit) onWarmupCompleted(-247715997, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2, 247716021, R.drawable.IAuthTabCallback());
        int i4 = asInterface + 27;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[0];
        ScoreDeltaInfo scoreDeltaInfo = (ScoreDeltaInfo) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 111;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(creditHomeViewModel, scoreDeltaInfo);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(creditHomeViewModel, scoreDeltaInfo);
        int i3 = onTransact + 97;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt = (liteProcessHandlerThreadOpt) objArr[0];
        CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[1];
        String str = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        int i = 2 % 2;
        int i2 = onTransact + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(liteprocesshandlerthreadopt, creditHomeViewModel, str, zBooleanValue, zBooleanValue2);
        int i4 = asInterface + 81;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt = (liteProcessHandlerThreadOpt) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        Function0 function02 = (Function0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {liteprocesshandlerthreadopt, function1, function0, function02, Integer.valueOf(iIntValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2)};
        Unit unit = (Unit) onWarmupCompleted(-567767527, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2, 567767559, R.drawable.IAuthTabCallback());
        int i4 = onTransact + 1;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object access100(Object[] objArr) throws Throwable {
        onUnavailable onunavailable = (onUnavailable) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onunavailable, setDetectableSize);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        String str = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[4];
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeViewModel, function1, str, zBooleanValue, creditHomeLargeBannerResponse);
        int i4 = onTransact + 65;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        CreditHomeHeaderItem creditHomeHeaderItem = (CreditHomeHeaderItem) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(creditHomeHeaderItem, iIntValue, setDetectableSize);
        int i4 = asInterface + 23;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[0];
        CreditHomeHeaderResponse creditHomeHeaderResponse = (CreditHomeHeaderResponse) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(creditHomeViewModel, creditHomeHeaderResponse);
        }
        IAuthTabCallback(creditHomeViewModel, creditHomeHeaderResponse);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[3];
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(creditHomeViewModel, str, zBooleanValue, creditHomeLargeBannerResponse);
        }
        IAuthTabCallback(creditHomeViewModel, str, zBooleanValue, creditHomeLargeBannerResponse);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeViewModel creditHomeViewModel) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
            return (Unit) onWarmupCompleted(564955324, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{creditHomeViewModel}, -564955304, iIAuthTabCallback3);
        }
        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback5 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback6 = R.drawable.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeViewModel creditHomeViewModel, CreditHomeHeaderResponse creditHomeHeaderResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeViewModel, creditHomeHeaderResponse);
        int i4 = asInterface + 121;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeViewModel creditHomeViewModel, Function1 function1, Resources resources) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(creditHomeViewModel, function1, resources);
        }
        onNavigationEvent(creditHomeViewModel, function1, resources);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeViewModel creditHomeViewModel, Function1 function1, CreditHomeHeaderItem creditHomeHeaderItem, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 115;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeViewModel, function1, creditHomeHeaderItem, i);
        if (i4 != 0) {
            int i5 = 0 / 0;
        }
        int i6 = onTransact + 107;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeViewModel creditHomeViewModel, Function1 function1, ScoreDeltaInfo scoreDeltaInfo, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditHomeViewModel, function1, scoreDeltaInfo, str);
        int i4 = onTransact + 47;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeViewModel creditHomeViewModel, Function1 function1, String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditHomeViewModel, function1, str, creditHomeLargeBannerResponse);
        int i4 = onTransact + 97;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeViewModel creditHomeViewModel, Function1 function1, String str, boolean z, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(creditHomeViewModel, function1, str, z, creditHomeLargeBannerResponse);
        }
        IAuthTabCallback(creditHomeViewModel, function1, str, z, creditHomeLargeBannerResponse);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeViewModel creditHomeViewModel, Function1 function1, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, String str, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeViewModel, function1, liteprocesshandlerthreadopt, str, z);
        int i4 = asInterface + 45;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeHeaderItem creditHomeHeaderItem, int i, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 83;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(creditHomeHeaderItem, i, setDetectableSize);
        int i5 = asInterface + 125;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(MyQuizDetailsResponse myQuizDetailsResponse, enableAppModelOpt enableappmodelopt, CreditHomeViewModel creditHomeViewModel, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onTransact + 85;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr = {myQuizDetailsResponse, enableappmodelopt, creditHomeViewModel, function1, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            return (Unit) onWarmupCompleted(2142974855, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -2142974854, R.drawable.IAuthTabCallback());
        }
        Object[] objArr2 = {myQuizDetailsResponse, enableappmodelopt, creditHomeViewModel, function1, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, creditHomeLargeBannerResponse, setDetectableSize);
        int i4 = onTransact + 59;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, boolean z, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {str, creditHomeLargeBannerResponse, Boolean.valueOf(z), setDetectableSize};
        Unit unit = (Unit) onWarmupCompleted(1274185993, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -1274185978, R.drawable.IAuthTabCallback());
        int i4 = onTransact + 57;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
            return (Unit) onWarmupCompleted(1716453667, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{str, str2, setDetectableSize}, -1716453667, iIAuthTabCallback3);
        }
        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback5 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback6 = R.drawable.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, String str, String str2) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
            unit = (Unit) onWarmupCompleted(-891201097, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{function0, str, str2}, 891201125, iIAuthTabCallback3);
            int i3 = 55 / 0;
        } else {
            int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback5 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback6 = R.drawable.IAuthTabCallback();
            unit = (Unit) onWarmupCompleted(-891201097, iIAuthTabCallback4, iIAuthTabCallback5, R.drawable.IAuthTabCallback(), new Object[]{function0, str, str2}, 891201125, iIAuthTabCallback6);
        }
        int i4 = asInterface + 111;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, Function1 function1, Function0 function0, Function0 function02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 21;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(liteprocesshandlerthreadopt, function1, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 73;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        onUnavailable onunavailable = (onUnavailable) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 101;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(function0, onunavailable);
        }
        IAuthTabCallback(function0, onunavailable);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Resources resources, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(resources, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(resources, setDetectableSize);
        int i3 = asInterface + 31;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHomeViewModel creditHomeViewModel) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(creditHomeViewModel);
        int i4 = asInterface + 27;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHomeViewModel creditHomeViewModel, Function1 function1, String str, onUnavailable onunavailable) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditHomeViewModel, function1, str, onunavailable);
        int i4 = onTransact + 107;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHomeHeaderItem creditHomeHeaderItem, int i, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 71;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(creditHomeHeaderItem, i, setDetectableSize);
        if (i4 != 0) {
            int i5 = 34 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ScoreDeltaInfo scoreDeltaInfo, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(scoreDeltaInfo, setDetectableSize);
        }
        onWarmupCompleted(scoreDeltaInfo, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 35;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            i |= 1;
        }
        onNavigationEvent(str, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = asInterface + 17;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(str, setDetectableSize);
        }
        onExtraCallback(str, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
            return (Unit) onWarmupCompleted(986091608, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{str, liteprocesshandlerthreadopt, setDetectableSize}, -986091579, iIAuthTabCallback3);
        }
        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback5 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback6 = R.drawable.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, onUnavailable onunavailable) {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(2115975218, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{function0, onunavailable}, -2115975192, iIAuthTabCallback3);
        int i4 = onTransact + 73;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 53;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 113;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSharedPreferences getsharedpreferences, enableAppModelOpt enableappmodelopt, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsharedpreferences, enableappmodelopt, setDetectableSize);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        int i5 = asInterface + 5;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(onUnavailable onunavailable, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onunavailable, setDetectableSize);
        int i4 = onTransact + 83;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        int i4 = onTransact + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(Resources resources, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(resources, setDetectableSize);
        }
        IAuthTabCallback(resources, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHomeViewModel creditHomeViewModel) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(creditHomeViewModel);
        }
        asInterface(creditHomeViewModel);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHomeViewModel creditHomeViewModel, Function1 function1, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditHomeViewModel, function1, liteprocesshandlerthreadopt, str);
        int i4 = asInterface + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHomeViewModel creditHomeViewModel, enableAppModelOpt enableappmodelopt, getSharedPreferences getsharedpreferences) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHomeViewModel, enableappmodelopt, getsharedpreferences);
        int i4 = asInterface + 69;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHomeHeaderItem creditHomeHeaderItem, int i, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 57;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(creditHomeHeaderItem, i, setDetectableSize);
        if (i4 != 0) {
            int i5 = 53 / 0;
        }
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, CreditHomeViewModel creditHomeViewModel, Function1 function1, CreditHomeHeaderItem creditHomeHeaderItem, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 15;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, creditHomeViewModel, function1, creditHomeHeaderItem, i);
        int i5 = asInterface + 17;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(str, creditHomeLargeBannerResponse, z, setDetectableSize);
        int i4 = asInterface + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return asBinder(str, setDetectableSize);
        }
        asBinder(str, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(str, liteprocesshandlerthreadopt, setDetectableSize);
        int i4 = asInterface + 41;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(str, liteprocesshandlerthreadopt, z, setDetectableSize);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(str, liteprocesshandlerthreadopt, z, setDetectableSize);
        int i3 = onTransact + 117;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 95;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 15;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = asInterface + 115;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
        onWarmupCompleted(1405468134, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -1405468123, R.drawable.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i7 = asInterface + 107;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, CreditHomeViewModel creditHomeViewModel, String str, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(liteprocesshandlerthreadopt, creditHomeViewModel, str, z);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt = (liteProcessHandlerThreadOpt) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(function1, liteprocesshandlerthreadopt, zBooleanValue);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, liteprocesshandlerthreadopt, zBooleanValue);
        int i3 = onTransact + 55;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i = 2 % 2;
        int i2 = asInterface + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(str, creditHomeLargeBannerResponse, zBooleanValue, setDetectableSize);
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        return unitAsBinder;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x02bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7;
        int i8;
        boolean z;
        Object obj;
        int i9 = ~i5;
        int i10 = ~((~i2) | i9);
        int i11 = ~i;
        int i12 = ~(i11 | i5);
        int i13 = ~(i9 | i);
        int i14 = i10 | i12 | i13;
        int i15 = ~(i11 | i9 | i2);
        int i16 = (~(i2 | i9)) | i12 | i13;
        int i17 = i + i5 + i3 + (2052055731 * i6) + (1687666023 * i4);
        int i18 = i17 * i17;
        int i19 = (i * 1533266457) + 1248777597 + (i5 * 1533266457) + (i14 * (-800)) + (i15 * (-1200)) + (i16 * 400) + (1533266057 * i3) + (706030027 * i6) + (1023530015 * i4) + (i18 * (-2088042496));
        switch ((i * (-1966771951)) + 1000013824 + ((-1966771951) * i5) + ((-617538080) * i14) + ((-926307120) * i15) + (308769040 * i16) + (2019426304 * i3) + (632946688 * i6) + ((-741212160) * i4) + (2121465856 * i18) + (i19 * i19 * 1434255360)) {
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
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return onTransact(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                String str = (String) objArr[0];
                Function0 function0 = (Function0) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                int iIntValue2 = ((Number) objArr[4]).intValue();
                int i20 = 2 % 2;
                int i21 = onTransact + 1;
                asInterface = i21 % 128;
                int i22 = i21 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, function0, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
                int i23 = onTransact + 39;
                asInterface = i23 % 128;
                int i24 = i23 % 2;
                return unitOnExtraCallbackWithResult;
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                final int iIntValue3 = ((Number) objArr[2]).intValue();
                final int iIntValue4 = ((Number) objArr[3]).intValue();
                int i25 = 2 % 2;
                int i26 = asInterface + 53;
                onTransact = i26 % 128;
                int i27 = i26 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-1473810093);
                int i28 = iIntValue4 & 1;
                if (i28 != 0) {
                    i7 = iIntValue3 | 6;
                } else if ((iIntValue3 & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback)) {
                        i8 = 4;
                    } else {
                        int i29 = asInterface + 39;
                        onTransact = i29 % 128;
                        int i30 = i29 % 2;
                        i8 = 2;
                    }
                    i7 = i8 | iIntValue3;
                } else {
                    i7 = iIntValue3;
                }
                if ((i7 & 3) != 2) {
                    int i31 = onTransact + 111;
                    asInterface = i31 % 128;
                    z = i31 % 2 != 0;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i7 & 1)) {
                    if (i28 != 0) {
                        int i32 = onTransact + 83;
                        asInterface = i32 % 128;
                        int i33 = i32 % 2;
                        onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        int i34 = onTransact + 107;
                        asInterface = i34 % 128;
                        if (i34 % 2 == 0) {
                            int i35 = 4 % 5;
                        }
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1473810093, i7, -1, "im.toss.feature.credit.ui.main.home.GradientOverlay (CreditHomeScreen.kt:738)");
                    }
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                    Unit unit = Unit.INSTANCE;
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized2 = new onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    obj = null;
                    setVerticalGravity.onWarmupCompleted(onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor), (QuirksExternalSyntheticBackport0) null, (ResourceManagerInternalResourceManagerHooks) null, ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(onQueryRefine.onExtraCallbackWithResult(800, 0, (setOnQueryTextListener) null, 6, (Object) null), 0.0f, 2, (Object) null), (String) null, ForwardingCameraControl.onExtraCallback(-546207877, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda66
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i36 = 2 % 2;
                            int i37 = onExtraCallback + 95;
                            onWarmupCompleted = i37 % 128;
                            int i38 = i37 % 2;
                            Unit unitOnExtraCallbackWithResult2 = StackTraceInfo.onExtraCallbackWithResult(onextracallback, (setHorizontalGravity) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i39 = onExtraCallback + 67;
                            onWarmupCompleted = i39 % 128;
                            if (i39 % 2 == 0) {
                                int i40 = 59 / 0;
                            }
                            return unitOnExtraCallbackWithResult2;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 199680, 22);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i36 = asInterface + 55;
                        onTransact = i36 % 128;
                        int i37 = i36 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    obj = null;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                }
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda67
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2, Object obj3) throws Throwable {
                            int i38 = 2 % 2;
                            int i39 = onWarmupCompleted + 81;
                            onExtraCallback = i39 % 128;
                            int i40 = i39 % 2;
                            Unit unitOnWarmupCompleted = StackTraceInfo.onWarmupCompleted(onextracallback, iIntValue3, iIntValue4, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i41 = onWarmupCompleted + 23;
                            onExtraCallback = i41 % 128;
                            if (i41 % 2 != 0) {
                                int i42 = 16 / 0;
                            }
                            return unitOnWarmupCompleted;
                        }
                    });
                }
                return obj;
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return asInterface(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[0];
                final String str2 = (String) objArr[1];
                final boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse = (CreditHomeLargeBannerResponse) objArr[3];
                int i38 = 2 % 2;
                Intrinsics.checkNotNullParameter(creditHomeLargeBannerResponse, "");
                CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1347749L, ((CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponse}, zzgsa.onWarmupCompleted())).name(), false, true, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        Unit unitOnExtraCallback;
                        int i39 = 2 % 2;
                        int i40 = onNavigationEvent + 63;
                        IAuthTabCallback = i40 % 128;
                        if (i40 % 2 == 0) {
                            unitOnExtraCallback = StackTraceInfo.onExtraCallback(str2, creditHomeLargeBannerResponse, zBooleanValue, (SetDetectableSize) obj2);
                            int i41 = 63 / 0;
                        } else {
                            unitOnExtraCallback = StackTraceInfo.onExtraCallback(str2, creditHomeLargeBannerResponse, zBooleanValue, (SetDetectableSize) obj2);
                        }
                        int i42 = IAuthTabCallback + 27;
                        onNavigationEvent = i42 % 128;
                        int i43 = i42 % 2;
                        return unitOnExtraCallback;
                    }
                }, 4, (Object) null);
                Unit unit2 = Unit.INSTANCE;
                int i39 = onTransact + 11;
                asInterface = i39 % 128;
                int i40 = i39 % 2;
                return unit2;
            case 14:
                return getInterfaceDescriptor(objArr);
            case 15:
                String str3 = (String) objArr[0];
                CreditHomeLargeBannerResponse creditHomeLargeBannerResponse2 = (CreditHomeLargeBannerResponse) objArr[1];
                boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
                int i41 = 2 % 2;
                int i42 = onTransact + 19;
                asInterface = i42 % 128;
                int i43 = i42 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                Object[] objArr2 = new Object[1];
                a((short) (AndroidCharacter.getMirror('0') - 169), (byte) Color.green(0), 823844553 + TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 89321978, (-115) - (Process.myTid() >> 22), objArr2);
                setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str3);
                setDetectableSize.onExtraCallback("banner_type", creditHomeLargeBannerResponse2.asInterface());
                IAuthTabCallback(setDetectableSize, creditHomeLargeBannerResponse2, zBooleanValue2);
                Unit unit3 = Unit.INSTANCE;
                int i44 = onTransact + 35;
                asInterface = i44 % 128;
                int i45 = i44 % 2;
                return unit3;
            case 16:
                return IAuthTabCallback_Parcel(objArr);
            case 17:
                return IAuthTabCallbackStubProxy(objArr);
            case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                return access100(objArr);
            case 19:
                return access000(objArr);
            case 20:
                return extraCallbackWithResult(objArr);
            case 21:
                String str4 = (String) objArr[0];
                liteProcessHandlerThreadOpt liteprocesshandlerthreadopt = (liteProcessHandlerThreadOpt) objArr[1];
                SetDetectableSize setDetectableSize2 = (SetDetectableSize) objArr[2];
                int i46 = 2 % 2;
                int i47 = asInterface + 15;
                onTransact = i47 % 128;
                int i48 = i47 % 2;
                Unit unitOnTransact = onTransact(str4, liteprocesshandlerthreadopt, setDetectableSize2);
                int i49 = asInterface + 5;
                onTransact = i49 % 128;
                int i50 = i49 % 2;
                return unitOnTransact;
            case 22:
                return writeTypedObject(objArr);
            case 23:
                return ICustomTabsCallback(objArr);
            case 24:
                return extraCallback(objArr);
            case 25:
                return readTypedObject(objArr);
            case 26:
                return onMessageChannelReady(objArr);
            case 27:
                return onActivityLayout(objArr);
            case 28:
                return onMinimized(objArr);
            case 29:
                return onActivityResized(objArr);
            case 30:
                return onPostMessage(objArr);
            case 31:
                return ICustomTabsCallbackDefault(objArr);
            case 32:
                liteProcessHandlerThreadOpt liteprocesshandlerthreadopt2 = (liteProcessHandlerThreadOpt) objArr[0];
                Function1 function1 = (Function1) objArr[1];
                Function0 function02 = (Function0) objArr[2];
                Function0 function03 = (Function0) objArr[3];
                int iIntValue5 = ((Number) objArr[4]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
                ((Number) objArr[6]).intValue();
                int i51 = 2 % 2;
                int i52 = onTransact + 55;
                asInterface = i52 % 128;
                int i53 = i52 % 2;
                onExtraCallbackWithResult(liteprocesshandlerthreadopt2, function1, function02, function03, cameraCaptureResultEmptyCameraCaptureResult3, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue5 | 1));
                return Unit.INSTANCE;
            case 33:
                return onUnminimized(objArr);
            default:
                String str5 = (String) objArr[0];
                String str6 = (String) objArr[1];
                SetDetectableSize setDetectableSize3 = (SetDetectableSize) objArr[2];
                int i54 = 2 % 2;
                int i55 = onTransact + 117;
                asInterface = i55 % 128;
                int i56 = i55 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize3, "");
                Object[] objArr3 = new Object[1];
                a((short) (((byte) KeyEvent.getModifierMetaStateMask()) + 42), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), 823844560 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-89321977) + Color.red(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 114, objArr3);
                setDetectableSize3.onExtraCallback(((String) objArr3[0]).intern(), str5);
                Object[] objArr4 = new Object[1];
                a((short) ((-122) - Process.getGidForName("")), (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 823844552 - Color.argb(0, 0, 0, 0), (-89321979) + View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 116, objArr4);
                setDetectableSize3.onExtraCallback(((String) objArr4[0]).intern(), str6);
                Unit unit4 = Unit.INSTANCE;
                int i57 = onTransact + 31;
                asInterface = i57 % 128;
                int i58 = i57 % 2;
                return unit4;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        MyQuizDetailsResponse myQuizDetailsResponse = (MyQuizDetailsResponse) objArr[0];
        enableAppModelOpt enableappmodelopt = (enableAppModelOpt) objArr[1];
        CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 3;
        onTransact = i2 % 128;
        onExtraCallbackWithResult(myQuizDetailsResponse, enableappmodelopt, creditHomeViewModel, function1, zBooleanValue, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHomeViewModel creditHomeViewModel) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(creditHomeViewModel);
        int i4 = asInterface + 91;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHomeViewModel creditHomeViewModel, String str, boolean z, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {creditHomeViewModel, str, Boolean.valueOf(z), creditHomeLargeBannerResponse};
        Unit unit = (Unit) onWarmupCompleted(-389487177, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 389487190, R.drawable.IAuthTabCallback());
        int i4 = asInterface + 99;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(CreditHomeViewModel creditHomeViewModel, boolean z, boolean z2, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function1 function13, InventoryAdManager inventoryAdManager, String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onTransact + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {creditHomeViewModel, Boolean.valueOf(z), Boolean.valueOf(z2), function1, function12, function0, function02, function13, inventoryAdManager, str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        onWarmupCompleted(-232540988, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 232540994, R.drawable.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i6 = asInterface + 87;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(str, creditHomeLargeBannerResponse, z, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, creditHomeLargeBannerResponse, z, setDetectableSize);
        int i3 = asInterface + 45;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, str2);
        int i4 = asInterface + 57;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, liteprocesshandlerthreadopt, z, setDetectableSize);
        int i4 = asInterface + 73;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = asInterface + 123;
        onTransact = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            onNavigationEvent(quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = asInterface + 115;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ liteTrackWatchDogHandlerThreadOpt onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt = (liteTrackWatchDogHandlerThreadOpt) onWarmupCompleted(-1245651513, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, 1245651518, iIAuthTabCallback3);
        int i4 = onTransact + 85;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return litetrackwatchdoghandlerthreadopt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        String str = (String) objArr[0];
        CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, creditHomeViewModel);
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return unitOnNavigationEvent;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<liteTrackWatchDogHandlerThreadOpt> $event$delegate;
        final /* synthetic */ boolean $isTalkBackEnabled;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $showScoreInfo$delegate;
        final /* synthetic */ boolean $skipScoreRaiseAnimation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(boolean z, boolean z2, CameraPresenceProviderExternalSyntheticLambda6<? extends liteTrackWatchDogHandlerThreadOpt> cameraPresenceProviderExternalSyntheticLambda6, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$isTalkBackEnabled = z;
            this.$skipScoreRaiseAnimation = z2;
            this.$event$delegate = cameraPresenceProviderExternalSyntheticLambda6;
            this.$showScoreInfo$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$isTalkBackEnabled, this.$skipScoreRaiseAnimation, this.$event$delegate, this.$showScoreInfo$delegate, access13800Var);
            int i2 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (!this.$isTalkBackEnabled) {
                int i2 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!this.$skipScoreRaiseAnimation && (StackTraceInfo.onWarmupCompleted(this.$event$delegate) instanceof liteTrackWatchDogHandlerThreadOpt.access000)) {
                    StackTraceInfo.onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor) this.$showScoreInfo$delegate, false);
                }
            }
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        creditHomeViewModel.onExtraCallbackWithResult(true);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt = (liteProcessHandlerThreadOpt) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a((short) (View.combineMeasuredStates(0, 0) - 121), (byte) ((-1) - TextUtils.lastIndexOf("", '0')), 823844552 + TextUtils.getOffsetBefore("", 0), ExpandableListView.getPackedPositionType(0L) - 89321979, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 115, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        Object[] objArr3 = new Object[1];
        a((short) (AndroidCharacter.getMirror('0') - 7), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), Drawable.resolveOpacity(0, 0) + 823844560, (-89321977) - ExpandableListView.getPackedPositionGroup(0L), (-116) - ExpandableListView.getPackedPositionChild(0L), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), liteprocesshandlerthreadopt.onExtraCallback().onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 47;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CreditHomeViewModel creditHomeViewModel, final String str, final liteProcessHandlerThreadOpt liteprocesshandlerthreadopt) {
        int i = 2 % 2;
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1381166L, "credit_change_top_banner", false, true, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = StackTraceInfo.onExtraCallbackWithResult(str, liteprocesshandlerthreadopt, (SetDetectableSize) obj);
                int i5 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        }, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) (Color.rgb(0, 0, 0) + 16777095), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 823844552 - View.MeasureSpec.getSize(0), (ViewConfiguration.getTapTimeout() >> 16) - 89321979, (ViewConfiguration.getTouchSlop() >> 8) - 115, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a((short) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 41), (byte) Color.red(0), TextUtils.lastIndexOf("", '0', 0, 0) + 823844561, ExpandableListView.getPackedPositionGroup(0L) - 89321977, (-115) - View.resolveSize(0, 0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), liteprocesshandlerthreadopt.onExtraCallback().onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 113;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(CreditHomeViewModel creditHomeViewModel, Function1 function1, final liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, final String str) {
        int i = 2 % 2;
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1381168L, (String) null, false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda74
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 35;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = StackTraceInfo.IAuthTabCallback(str, liteprocesshandlerthreadopt, (SetDetectableSize) obj);
                int i5 = IAuthTabCallback + 103;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 0;
                }
                return unitIAuthTabCallback;
            }
        }, 6, (Object) null);
        function1.invoke(liteprocesshandlerthreadopt.onExtraCallback().onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 39;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(String str, CreditHomeViewModel creditHomeViewModel) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(str);
            creditHomeViewModel.onNavigationEvent();
            unit = Unit.INSTANCE;
            int i3 = 22 / 0;
        } else {
            onExtraCallback(str);
            creditHomeViewModel.onNavigationEvent();
            unit = Unit.INSTANCE;
        }
        int i4 = onTransact + 43;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        boolean z = false;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        final ScoreDeltaInfo scoreDeltaInfo = (ScoreDeltaInfo) objArr[1];
        List list = (List) objArr[2];
        final CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[3];
        final Function1 function1 = (Function1) objArr[4];
        final String str = (String) objArr[5];
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt = (liteProcessHandlerThreadOpt) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = asInterface + 59;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-948771920, iIntValue, -1, "im.toss.feature.credit.ui.main.home.CreditHomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditHomeScreen.kt:193)");
                int i4 = onTransact + 83;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
            if (zBooleanValue) {
                int i6 = onTransact + 67;
                int i7 = i6 % 128;
                asInterface = i7;
                if (i6 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (scoreDeltaInfo != null) {
                    int i8 = i7 + 39;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(315677750);
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(creditHomeViewModel);
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(scoreDeltaInfo);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent | zOnExtraCallback | zOnNavigationEvent2)) {
                        int i10 = onTransact + 75;
                        asInterface = i10 % 128;
                        int i11 = i10 % 2;
                        Object obj2 = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function1 function12 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda59
                                private static int onNavigationEvent = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj3) {
                                    int i12 = 2 % 2;
                                    int i13 = onNavigationEvent + 39;
                                    onWarmupCompleted = i13 % 128;
                                    int i14 = i13 % 2;
                                    Unit unitOnExtraCallback = StackTraceInfo.onExtraCallback(creditHomeViewModel, function1, scoreDeltaInfo, (String) obj3);
                                    int i15 = onWarmupCompleted + 3;
                                    onNavigationEvent = i15 % 128;
                                    int i16 = i15 % 2;
                                    return unitOnExtraCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function12);
                            obj2 = function12;
                        }
                        Function1 function13 = (Function1) obj2;
                        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(creditHomeViewModel);
                        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnNavigationEvent3 | zOnNavigationEvent4 | zOnNavigationEvent5)) {
                            int i12 = onTransact + 123;
                            asInterface = i12 % 128;
                            int i13 = i12 % 2;
                            Object obj3 = objOnMinimized2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                Function2 function2 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda60
                                    private static int IAuthTabCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke(Object obj4, Object obj5) {
                                        int i14 = 2 % 2;
                                        int i15 = IAuthTabCallback + 73;
                                        onExtraCallbackWithResult = i15 % 128;
                                        if (i15 % 2 != 0) {
                                            return (Unit) StackTraceInfo.onWarmupCompleted(2124804753, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{str, creditHomeViewModel, function1, (CreditHomeHeaderItem) obj4, Integer.valueOf(((Integer) obj5).intValue())}, -2124804737, R.drawable.IAuthTabCallback());
                                        }
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function2);
                                obj3 = function2;
                            }
                            Function2 function22 = (Function2) obj3;
                            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(creditHomeViewModel);
                            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(scoreDeltaInfo);
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if ((zOnNavigationEvent6 | zOnExtraCallback2) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized3 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda61
                                    private static int IAuthTabCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke() {
                                        int i14 = 2 % 2;
                                        int i15 = onNavigationEvent + 95;
                                        IAuthTabCallback = i15 % 128;
                                        int i16 = i15 % 2;
                                        Object[] objArr2 = {creditHomeViewModel, scoreDeltaInfo};
                                        Unit unit = (Unit) StackTraceInfo.onWarmupCompleted(-1113599837, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2, 1113599860, R.drawable.IAuthTabCallback());
                                        int i17 = onNavigationEvent + 77;
                                        IAuthTabCallback = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            int i18 = 89 / 0;
                                        }
                                        return unit;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                            }
                            Function0 function0 = (Function0) objOnMinimized3;
                            boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(creditHomeViewModel);
                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!zOnNavigationEvent7) {
                                Object obj4 = objOnMinimized4;
                                if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    Function2 function23 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda62
                                        private static int onExtraCallback = 0;
                                        private static int onExtraCallbackWithResult = 1;

                                        public final Object invoke(Object obj5, Object obj6) {
                                            int i14 = 2 % 2;
                                            int i15 = onExtraCallback + 75;
                                            onExtraCallbackWithResult = i15 % 128;
                                            int i16 = i15 % 2;
                                            Unit unitIAuthTabCallback = StackTraceInfo.IAuthTabCallback(creditHomeViewModel, (CreditHomeHeaderItem) obj5, ((Integer) obj6).intValue());
                                            int i17 = onExtraCallbackWithResult + 1;
                                            onExtraCallback = i17 % 128;
                                            int i18 = i17 % 2;
                                            return unitIAuthTabCallback;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function23);
                                    obj4 = function23;
                                }
                                Function2 function24 = (Function2) obj4;
                                boolean zOnWarmupCompleted = createWifiConfiguration.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted((String) liteProcessHandlerThreadOpt.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 46942577, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -46942575, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{liteprocesshandlerthreadopt}));
                                boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                                boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(creditHomeViewModel);
                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(zOnNavigationEvent8 | zOnNavigationEvent9)) {
                                    Object obj5 = objOnMinimized5;
                                    if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda63
                                            private static int IAuthTabCallback = 0;
                                            private static int onExtraCallback = 1;

                                            public final Object invoke() {
                                                int i14 = 2 % 2;
                                                int i15 = onExtraCallback + 87;
                                                IAuthTabCallback = i15 % 128;
                                                int i16 = i15 % 2;
                                                Object[] objArr2 = {str, creditHomeViewModel};
                                                Unit unit = (Unit) StackTraceInfo.onWarmupCompleted(-718914467, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2, 718914492, R.drawable.IAuthTabCallback());
                                                int i17 = IAuthTabCallback + 115;
                                                onExtraCallback = i17 % 128;
                                                if (i17 % 2 != 0) {
                                                    return unit;
                                                }
                                                Object obj6 = null;
                                                obj6.hashCode();
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                                        obj5 = function02;
                                    }
                                    Boolean boolValueOf = Boolean.valueOf(zOnWarmupCompleted);
                                    getRuntimeInfo.onWarmupCompleted(1726095641, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{scoreDeltaInfo, list, function13, function22, function0, function24, boolValueOf, (Function0) obj5, cameraCaptureResultEmptyCameraCaptureResult, 0, 0}, -1726095641);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                }
                            }
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(318902866);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(ScoreDeltaInfo scoreDeltaInfo, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-54) - (ViewConfiguration.getTouchSlop() >> 8)), (byte) View.combineMeasuredStates(0, 0), 823844544 + ImageFormat.getBitsPerPixel(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 89321978, Color.blue(0) - 115, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "credit_analysis");
        Object[] objArr2 = new Object[1];
        a((short) (TextUtils.lastIndexOf("", '0', 0) - 100), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), 823844547 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 89321978, TextUtils.indexOf("", "", 0) - 115, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), scoreDeltaInfo.IAuthTabCallbackDefault());
        setDetectableSize.onExtraCallback("sub_title", scoreDeltaInfo.onWarmupCompleted());
        setDetectableSize.onExtraCallback("kcb_score_delta", Integer.valueOf(scoreDeltaInfo.onExtraCallback()));
        setDetectableSize.onExtraCallback("nice_score_delta", Integer.valueOf(scoreDeltaInfo.onExtraCallbackWithResult()));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 85;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CreditHomeViewModel creditHomeViewModel, Function1 function1, final ScoreDeltaInfo scoreDeltaInfo, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1213869L, "credit_analysis", false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 45;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = StackTraceInfo.onExtraCallbackWithResult(scoreDeltaInfo, (SetDetectableSize) obj);
                int i5 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 4, (Object) null);
        function1.invoke(str);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(CreditHomeHeaderItem creditHomeHeaderItem, int i, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 105;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-55) - TextUtils.lastIndexOf("", '0')), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 823844543 + Color.argb(0, 0, 0, 0), (-89321978) - Process.getGidForName(""), AndroidCharacter.getMirror('0') - 163, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditHomeHeaderItem.IAuthTabCallbackDefault());
        Object[] objArr2 = new Object[1];
        a((short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 102), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.getMode(0) + 823844547, (-89321977) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.red(0) - 115, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), creditHomeHeaderItem.asInterface());
        setDetectableSize.onExtraCallback("sub_title", creditHomeHeaderItem.onWarmupCompleted());
        setDetectableSize.onExtraCallback("order", Integer.valueOf(i + 1));
        String lowerCase = creditHomeHeaderItem.IAuthTabCallbackStubProxy().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        setDetectableSize.onExtraCallback("sub_type", lowerCase);
        Unit unit = Unit.INSTANCE;
        int i5 = asInterface + 93;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075 A[PHI: r15
      0x0075: PHI (r15v8 java.lang.String) = (r15v7 java.lang.String), (r15v12 java.lang.String) binds: [B:16:0x0073, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        String strOnWarmupCompleted;
        String str = (String) objArr[0];
        CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        final CreditHomeHeaderItem creditHomeHeaderItem = (CreditHomeHeaderItem) objArr[3];
        final int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 23;
        onTransact = i2 % 128;
        String strIAuthTabCallbackStub = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
            Intrinsics.areEqual(creditHomeHeaderItem.IAuthTabCallbackDefault(), "credit_improve_score");
            throw null;
        }
        Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
        if (Intrinsics.areEqual(creditHomeHeaderItem.IAuthTabCallbackDefault(), "credit_improve_score")) {
            onExtraCallback(str);
        } else {
            CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1213869L, creditHomeHeaderItem.IAuthTabCallbackDefault(), false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda58
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i3 = 2 % 2;
                    int i4 = onWarmupCompleted + 55;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    CreditHomeHeaderItem creditHomeHeaderItem2 = creditHomeHeaderItem;
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    return (Unit) StackTraceInfo.onWarmupCompleted(319445092, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{creditHomeHeaderItem2, numValueOf, (SetDetectableSize) obj}, -319445080, R.drawable.IAuthTabCallback());
                }
            }, 4, (Object) null);
        }
        CreditHomeHeaderCta creditHomeHeaderCtaIAuthTabCallback = creditHomeHeaderItem.IAuthTabCallback();
        if (creditHomeHeaderCtaIAuthTabCallback != null) {
            int i3 = asInterface + 63;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                strOnWarmupCompleted = creditHomeHeaderCtaIAuthTabCallback.onWarmupCompleted();
                int i4 = 0 / 0;
                if (strOnWarmupCompleted != null) {
                    if (StringsKt.isBlank(strOnWarmupCompleted)) {
                        int i5 = asInterface + 55;
                        onTransact = i5 % 128;
                        int i6 = i5 % 2;
                    } else {
                        strIAuthTabCallbackStub = strOnWarmupCompleted;
                    }
                    if (strIAuthTabCallbackStub == null) {
                        strIAuthTabCallbackStub = creditHomeHeaderItem.IAuthTabCallbackStub();
                    }
                }
            } else {
                strOnWarmupCompleted = creditHomeHeaderCtaIAuthTabCallback.onWarmupCompleted();
                if (strOnWarmupCompleted != null) {
                }
            }
        }
        function1.invoke(strIAuthTabCallbackStub);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(ScoreDeltaInfo scoreDeltaInfo, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-55) - MotionEvent.axisFromString("")), (byte) KeyEvent.normalizeMetaState(0), 823844543 - ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionType(0L) - 89321977, TextUtils.indexOf("", "") - 115, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "credit_analysis");
        Object[] objArr2 = new Object[1];
        a((short) ((-101) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) (KeyEvent.getMaxKeyCode() >> 16), Color.blue(0) + 823844547, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 89321977, (-115) - TextUtils.indexOf("", ""), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), scoreDeltaInfo.IAuthTabCallbackDefault());
        setDetectableSize.onExtraCallback("sub_title", scoreDeltaInfo.onWarmupCompleted());
        setDetectableSize.onExtraCallback("kcb_score_delta", Integer.valueOf(scoreDeltaInfo.onExtraCallback()));
        setDetectableSize.onExtraCallback("nice_score_delta", Integer.valueOf(scoreDeltaInfo.onExtraCallbackWithResult()));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 5;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(CreditHomeViewModel creditHomeViewModel, final ScoreDeltaInfo scoreDeltaInfo) {
        int i = 2 % 2;
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1236665L, "credit_analysis", false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda53
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 99;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = StackTraceInfo.IAuthTabCallback(scoreDeltaInfo, (SetDetectableSize) obj);
                int i5 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 12, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 17;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 43424), Color.green(0) + 42, Color.blue(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = onNavigationEvent;
                if (bArr != null) {
                    int i6 = $11 + 75;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        int i9 = $11 + 27;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 12843), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 55, 2167 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 43424), 42 - TextUtils.getCapsMode("", 0, 0), 22439 - Gravity.getAbsoluteGravity(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                if (z2) {
                    int i12 = $11 + 111;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 1;
                } else {
                    int i14 = $10 + 25;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), ExpandableListView.getPackedPositionGroup(0L) + 86, TextUtils.getOffsetBefore("", 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onNavigationEvent;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i17 = $11 + 81;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!(!z)) {
                        int i19 = $10 + 75;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            String string = sb.toString();
            int i21 = $10 + 103;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            objArr[0] = string;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static final Unit onTransact(CreditHomeHeaderItem creditHomeHeaderItem, int i, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 49;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 54), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), 823844542 - TextUtils.indexOf((CharSequence) "", '0', 0), (-89321977) - View.MeasureSpec.getMode(0), (-115) - TextUtils.getTrimmedLength(""), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditHomeHeaderItem.IAuthTabCallbackDefault());
        Object[] objArr2 = new Object[1];
        a((short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 101), (byte) TextUtils.indexOf("", "", 0), 823844547 - Gravity.getAbsoluteGravity(0, 0), (-89321977) - TextUtils.getOffsetBefore("", 0), KeyEvent.getDeadChar(0, 0) - 115, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), creditHomeHeaderItem.asInterface());
        setDetectableSize.onExtraCallback("sub_title", creditHomeHeaderItem.onWarmupCompleted());
        setDetectableSize.onExtraCallback("order", Integer.valueOf(i + 1));
        String lowerCase = creditHomeHeaderItem.IAuthTabCallbackStubProxy().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        setDetectableSize.onExtraCallback("sub_type", lowerCase);
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 11;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(CreditHomeViewModel creditHomeViewModel, final CreditHomeHeaderItem creditHomeHeaderItem, final int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1236665L, creditHomeHeaderItem.IAuthTabCallbackDefault() + "_" + i, false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda49
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 13;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    StackTraceInfo.onExtraCallbackWithResult(creditHomeHeaderItem, i, (SetDetectableSize) obj);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = StackTraceInfo.onExtraCallbackWithResult(creditHomeHeaderItem, i, (SetDetectableSize) obj);
                int i5 = onExtraCallback + 7;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 51 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        }, 12, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i3 = asInterface + 31;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(String str, CreditHomeViewModel creditHomeViewModel) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(str);
        creditHomeViewModel.onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 69;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onTransact(CreditHomeViewModel creditHomeViewModel) {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        creditHomeViewModel.readTypedObject();
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 113;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        CreditHomeHeaderItem creditHomeHeaderItem = (CreditHomeHeaderItem) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a((short) ((ViewConfiguration.getScrollDefaultDelay() >> 16) - 54), (byte) ((-1) - TextUtils.lastIndexOf("", '0')), 823844544 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-89321977) - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getOffsetBefore("", 0) - 115, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), creditHomeHeaderItem.IAuthTabCallbackDefault());
        Object[] objArr3 = new Object[1];
        a((short) ((-102) - ExpandableListView.getPackedPositionChild(0L)), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getFadingEdgeLength() >> 16) + 823844547, (-89321977) - View.MeasureSpec.getMode(0), (-115) - (ViewConfiguration.getPressedStateDuration() >> 16), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), creditHomeHeaderItem.asInterface());
        setDetectableSize.onExtraCallback("sub_title", creditHomeHeaderItem.onWarmupCompleted());
        setDetectableSize.onExtraCallback("order", Integer.valueOf(iIntValue + 1));
        String lowerCase = creditHomeHeaderItem.IAuthTabCallbackStubProxy().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        setDetectableSize.onExtraCallback("sub_type", lowerCase);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 11;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(CreditHomeViewModel creditHomeViewModel, CreditHomeHeaderResponse creditHomeHeaderResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(creditHomeHeaderResponse, "");
        Iterator it = creditHomeHeaderResponse.IAuthTabCallback().iterator();
        final int i4 = 0;
        while (it.hasNext()) {
            int i5 = asInterface + 109;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                it.next();
                throw null;
            }
            Object next = it.next();
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final CreditHomeHeaderItem creditHomeHeaderItem = (CreditHomeHeaderItem) next;
            CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1236665L, creditHomeHeaderItem.IAuthTabCallbackDefault() + "_" + i4, false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda54
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 25;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        StackTraceInfo.IAuthTabCallback(creditHomeHeaderItem, i4, (SetDetectableSize) obj);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    Unit unitIAuthTabCallback = StackTraceInfo.IAuthTabCallback(creditHomeHeaderItem, i4, (SetDetectableSize) obj);
                    int i8 = IAuthTabCallback + 105;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    return unitIAuthTabCallback;
                }
            }, 12, (Object) null);
            i4++;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(CreditHomeHeaderItem creditHomeHeaderItem, int i, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 9;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) (TextUtils.lastIndexOf("", '0', 0) - 53), (byte) (Process.myTid() >> 22), TextUtils.indexOf("", "", 0) + 823844543, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 89321977, (-115) - ExpandableListView.getPackedPositionType(0L), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditHomeHeaderItem.IAuthTabCallbackDefault());
        Object[] objArr2 = new Object[1];
        a((short) ((-101) - TextUtils.indexOf("", "", 0)), (byte) KeyEvent.normalizeMetaState(0), 823844547 - ((Process.getThreadPriority(0) + 20) >> 6), (-89321977) - View.getDefaultSize(0, 0), MotionEvent.axisFromString("") - 114, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), creditHomeHeaderItem.asInterface());
        setDetectableSize.onExtraCallback("sub_title", creditHomeHeaderItem.onWarmupCompleted());
        setDetectableSize.onExtraCallback("order", Integer.valueOf(i + 1));
        String lowerCase = creditHomeHeaderItem.IAuthTabCallbackStubProxy().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        setDetectableSize.onExtraCallback("sub_type", lowerCase);
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 35;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(String str, CreditHomeViewModel creditHomeViewModel, Function1 function1, final CreditHomeHeaderItem creditHomeHeaderItem, final int i) {
        String strIAuthTabCallbackStub;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
        if (Intrinsics.areEqual(creditHomeHeaderItem.IAuthTabCallbackDefault(), "credit_improve_score")) {
            int i3 = onTransact + 1;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallback(str);
                int i4 = 9 / 0;
            } else {
                onExtraCallback(str);
            }
        } else {
            CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1213869L, creditHomeHeaderItem.IAuthTabCallbackDefault(), false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda55
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) throws Throwable {
                    Unit unitOnNavigationEvent;
                    int i5 = 2 % 2;
                    int i6 = onWarmupCompleted + 99;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        unitOnNavigationEvent = StackTraceInfo.onNavigationEvent(creditHomeHeaderItem, i, (SetDetectableSize) obj);
                        int i7 = 11 / 0;
                    } else {
                        unitOnNavigationEvent = StackTraceInfo.onNavigationEvent(creditHomeHeaderItem, i, (SetDetectableSize) obj);
                    }
                    int i8 = onWarmupCompleted + 1;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        return unitOnNavigationEvent;
                    }
                    throw null;
                }
            }, 4, (Object) null);
        }
        CreditHomeHeaderCta creditHomeHeaderCtaIAuthTabCallback = creditHomeHeaderItem.IAuthTabCallback();
        if (creditHomeHeaderCtaIAuthTabCallback != null) {
            int i5 = onTransact + 35;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            strIAuthTabCallbackStub = creditHomeHeaderCtaIAuthTabCallback.onWarmupCompleted();
            if (strIAuthTabCallbackStub == null) {
                strIAuthTabCallbackStub = creditHomeHeaderItem.IAuthTabCallbackStub();
            } else {
                if (StringsKt.isBlank(strIAuthTabCallbackStub)) {
                    strIAuthTabCallbackStub = null;
                }
                if (strIAuthTabCallbackStub == null) {
                }
            }
        }
        function1.invoke(strIAuthTabCallbackStub);
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-122) - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.getOffsetBefore("", 0) + 823844552, TextUtils.getTrimmedLength("") - 89321979, (-116) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("banner_type", creditHomeLargeBannerResponse.asInterface());
        IAuthTabCallback(setDetectableSize, creditHomeLargeBannerResponse, z);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 119;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(CreditHomeViewModel creditHomeViewModel, Function1 function1, final String str, final boolean z, final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(creditHomeLargeBannerResponse, "");
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1347751L, (String) null, false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda68
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 97;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = StackTraceInfo.onNavigationEvent(str, creditHomeLargeBannerResponse, z, (SetDetectableSize) obj);
                int i5 = onExtraCallback + 5;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        }, 6, (Object) null);
        CreditHomeLargeBannerResponse.Cta ctaOnWarmupCompleted = creditHomeLargeBannerResponse.onWarmupCompleted();
        if (ctaOnWarmupCompleted != null) {
            int i2 = asInterface + 9;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                ctaOnWarmupCompleted.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strOnWarmupCompleted = ctaOnWarmupCompleted.onWarmupCompleted();
            if (strOnWarmupCompleted != null) {
                str2 = strOnWarmupCompleted;
            }
        }
        function1.invoke(str2);
        Unit unit = Unit.INSTANCE;
        int i3 = asInterface + 23;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-121) - Color.argb(0, 0, 0, 0)), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 823844552 - (KeyEvent.getMaxKeyCode() >> 16), (-89321979) - (ViewConfiguration.getPressedStateDuration() >> 16), (-115) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("banner_type", liteprocesshandlerthreadopt.asInterface().asInterface());
        IAuthTabCallback(setDetectableSize, liteprocesshandlerthreadopt.asInterface(), z);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 11;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(final liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, CreditHomeViewModel creditHomeViewModel, final String str, final boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z2) {
            Object[] objArr = {liteprocesshandlerthreadopt.asInterface()};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1347749L, ((CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, iOnWarmupCompleted)).name(), false, true, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda43
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) throws Throwable {
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback + 65;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        StackTraceInfo.onNavigationEvent(str, liteprocesshandlerthreadopt, z, (SetDetectableSize) obj2);
                        throw null;
                    }
                    Unit unitOnNavigationEvent = StackTraceInfo.onNavigationEvent(str, liteprocesshandlerthreadopt, z, (SetDetectableSize) obj2);
                    int i5 = onWarmupCompleted + 17;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return unitOnNavigationEvent;
                    }
                    throw null;
                }
            }, 4, (Object) null);
            int i3 = onTransact + 99;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(CreditHomeViewModel creditHomeViewModel) {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        creditHomeViewModel.extraCallback();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-121) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 823844552 + (ViewConfiguration.getLongPressTimeout() >> 16), (-89321980) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-115) - Color.green(0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("banner_type", liteprocesshandlerthreadopt.asInterface().asInterface());
        IAuthTabCallback(setDetectableSize, liteprocesshandlerthreadopt.asInterface(), z);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 51;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(CreditHomeViewModel creditHomeViewModel, Function1 function1, final liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, final String str, final boolean z) {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1347751L, (String) null, false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda56
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 65;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                String str2 = str;
                if (i4 == 0) {
                    return StackTraceInfo.onWarmupCompleted(str2, liteprocesshandlerthreadopt, z, (SetDetectableSize) obj);
                }
                StackTraceInfo.onWarmupCompleted(str2, liteprocesshandlerthreadopt, z, (SetDetectableSize) obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 6, (Object) null);
        CreditHomeLargeBannerResponse.Cta ctaOnWarmupCompleted = liteprocesshandlerthreadopt.asInterface().onWarmupCompleted();
        if (ctaOnWarmupCompleted != null) {
            int i2 = onTransact + 55;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                ctaOnWarmupCompleted.onWarmupCompleted();
                throw null;
            }
            strOnWarmupCompleted = ctaOnWarmupCompleted.onWarmupCompleted();
            if (strOnWarmupCompleted == null) {
                strOnWarmupCompleted = "";
            }
        }
        function1.invoke(strOnWarmupCompleted);
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 47;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0c0f  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0c3e  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0c82  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0cf0  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0ecc  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0ee9  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0f80  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x1165  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x122b  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x1275  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0243 A[PHI: r5
      0x0243: PHI (r5v89 im.toss.features.credit.data.response.CreditHomeLargeBannerResponse$DualColumnContents) = 
      (r5v88 im.toss.features.credit.data.response.CreditHomeLargeBannerResponse$DualColumnContents)
      (r5v91 im.toss.features.credit.data.response.CreditHomeLargeBannerResponse$DualColumnContents)
     binds: [B:97:0x0241, B:94:0x023a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        int i;
        final Function1 function1;
        Function1 function12;
        Function0 function0;
        int i2;
        Function0 function02;
        Function1 function13;
        String str;
        boolean z;
        boolean z2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        InventoryAdManager inventoryAdManager;
        Object obj;
        Function1 function14;
        Integer num;
        int i3;
        String strIAuthTabCallback;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        boolean zOnNavigationEvent;
        boolean z3;
        boolean z4;
        boolean zOnExtraCallback;
        boolean zOnNavigationEvent2;
        Object objOnMinimized2;
        InventoryAdManager inventoryAdManager2;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6;
        Function1 function15;
        Function0 function03;
        Integer num2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        boolean z5;
        boolean z6;
        boolean z7;
        int i4;
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt;
        final String str2;
        final Function1 function16;
        final liteProcessHandlerThreadOpt liteprocesshandlerthreadopt2;
        boolean z8;
        boolean z9;
        CreditHomeLargeBannerType creditHomeLargeBannerType;
        ScoreDeltaInfo scoreDeltaInfoOnExtraCallbackWithResult;
        List listEmptyList;
        Integer num3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final boolean z10;
        final String str3;
        boolean z11;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z12;
        int i5;
        String strIAuthTabCallback2;
        boolean z13;
        final boolean z14;
        final String str4;
        Integer num4;
        Object obj2;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnWarmupCompleted;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnNavigationEvent;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnWarmupCompleted2;
        String strOnExtraCallbackWithResult;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnNavigationEvent2;
        String strOnExtraCallbackWithResult2;
        String strOnExtraCallback;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnNavigationEvent3;
        CreditHomeLargeBannerType creditHomeLargeBannerType2;
        CreditHomeLargeBannerType creditHomeLargeBannerType3;
        int i6;
        int i7;
        String str5;
        int i8;
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt3;
        Function1 function17;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        boolean z15;
        Function2 function2;
        Integer num5;
        final Function1 function18;
        int i9;
        int i10;
        final String str6;
        int i11;
        CreditHomeLargeBannerType creditHomeLargeBannerType4;
        String str7;
        Integer num6;
        int i12;
        final Function1 function19;
        final liteProcessHandlerThreadOpt liteprocesshandlerthreadopt4;
        final Function0 function04;
        boolean z16;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxy;
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt5;
        int i13;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxy2;
        final String str8;
        Object obj3;
        final Resources resources;
        boolean z17;
        Object obj4;
        final boolean z18;
        boolean z19;
        Object obj5;
        boolean z20;
        boolean z21;
        CreditHomeLargeBannerResponse.DualRowContents dualRowContentsOnTransact;
        boolean z22;
        Object obj6;
        boolean z23;
        CreditHomeHeaderResponse creditHomeHeaderResponseOnTransact;
        ScoreDeltaInfo scoreDeltaInfoOnExtraCallbackWithResult2;
        CreditHomeHeaderResponse creditHomeHeaderResponseOnTransact2;
        ScoreDeltaInfo scoreDeltaInfoOnExtraCallbackWithResult3;
        boolean z24;
        Object obj7;
        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault;
        final CreditHomeViewModel creditHomeViewModel = (CreditHomeViewModel) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        Function1 function110 = (Function1) objArr[3];
        Function1 function111 = (Function1) objArr[4];
        Function0 function05 = (Function0) objArr[5];
        Function0 function06 = (Function0) objArr[6];
        Function1 function112 = (Function1) objArr[7];
        InventoryAdManager inventoryAdManager3 = (InventoryAdManager) objArr[8];
        String str9 = (String) objArr[9];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        int iIntValue = ((Number) objArr[11]).intValue();
        int i14 = 2 % 2;
        Intrinsics.checkNotNullParameter(creditHomeViewModel, "");
        Intrinsics.checkNotNullParameter(function110, "");
        Intrinsics.checkNotNullParameter(function111, "");
        Intrinsics.checkNotNullParameter(function05, "");
        Intrinsics.checkNotNullParameter(function06, "");
        Intrinsics.checkNotNullParameter(function112, "");
        Intrinsics.checkNotNullParameter(inventoryAdManager3, "");
        Intrinsics.checkNotNullParameter(str9, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(713975638);
        if ((iIntValue & 6) == 0) {
            i = iIntValue | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(creditHomeViewModel) ? 4 : 2);
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function110) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function111) ? 16384 : 8192;
        }
        if ((196608 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function05) ? 131072 : 65536;
        }
        if ((1572864 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function06) ? 1048576 : 524288;
        }
        if ((12582912 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function112) ? 8388608 : 4194304;
        }
        if ((100663296 & iIntValue) == 0) {
            i |= (134217728 & iIntValue) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(inventoryAdManager3) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inventoryAdManager3) ? 67108864 : 33554432;
        }
        if ((805306368 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str9) ? 536870912 : 268435456;
        }
        int i15 = i;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i15 & 306783379) != 306783378, i15 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                function14 = function112;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(713975638, i15, -1, "im.toss.feature.credit.ui.main.home.CreditHomeScreen (CreditHomeScreen.kt:88)");
            } else {
                function14 = function112;
            }
            Resources resources2 = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.onExtraCallbackWithResult(creditHomeViewModel.IAuthTabCallbackStub(), (Object) null, (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 14);
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(creditHomeViewModel.access100(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
            liteProcessHandlerThreadOpt liteprocesshandlerthreadoptOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<liteProcessHandlerThreadOpt>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
            if (liteprocesshandlerthreadoptOnExtraCallback == null) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1371732456);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                function1 = function110;
                function0 = function06;
                i2 = iIntValue;
                function13 = function111;
                str = str9;
                z = zBooleanValue2;
                z2 = zBooleanValue;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                inventoryAdManager = inventoryAdManager3;
                function02 = function05;
                function12 = function14;
                obj = null;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1371732457);
                createWifiConfiguration.onExtraCallbackWithResult onextracallbackwithresult = createWifiConfiguration.onExtraCallbackWithResult.onExtraCallback;
                boolean zOnExtraCallback2 = onextracallbackwithresult.onExtraCallback((String) liteProcessHandlerThreadOpt.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 46942577, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -46942575, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{liteprocesshandlerthreadoptOnExtraCallback}));
                boolean zIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback((String) liteProcessHandlerThreadOpt.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 46942577, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -46942575, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{liteprocesshandlerthreadoptOnExtraCallback}));
                CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface = liteprocesshandlerthreadoptOnExtraCallback.asInterface();
                if (creditHomeLargeBannerResponseAsInterface != null) {
                    num = 6;
                    int i16 = asInterface + 21;
                    i3 = iIntValue;
                    onTransact = i16 % 128;
                    if (i16 % 2 != 0) {
                        dualColumnContentsIAuthTabCallbackDefault = creditHomeLargeBannerResponseAsInterface.IAuthTabCallbackDefault();
                        int i17 = 64 / 0;
                        strIAuthTabCallback = dualColumnContentsIAuthTabCallbackDefault != null ? dualColumnContentsIAuthTabCallbackDefault.IAuthTabCallback() : null;
                    } else {
                        dualColumnContentsIAuthTabCallbackDefault = creditHomeLargeBannerResponseAsInterface.IAuthTabCallbackDefault();
                        if (dualColumnContentsIAuthTabCallbackDefault != null) {
                        }
                    }
                    boolean z25 = (strIAuthTabCallback != null || StringsKt.isBlank(strIAuthTabCallback) || creditHomeViewModel.IAuthTabCallbackStubProxy()) ? false : true;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = QuirksExternalSyntheticBackport0.Companion;
                    boolean z26 = z25;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport05, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onExtraCallbackWithResult(), (toMetersPerSecond) null, 2, (Object) null), 0.0f, 1, (Object) null);
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
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
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(zBooleanValue2 || zIAuthTabCallback || ((liteprocesshandlerthreadoptOnExtraCallback.access000().extraCallbackWithResult() || zBooleanValue) && !creditHomeViewModel.asInterface())), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                    zOnNavigationEvent = onextracallbackwithresult.onNavigationEvent((String) liteProcessHandlerThreadOpt.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 46942577, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -46942575, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{liteprocesshandlerthreadoptOnExtraCallback}));
                    boolean z27 = zOnExtraCallback2 || zOnNavigationEvent;
                    if (zOnNavigationEvent) {
                        z3 = true;
                        liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt = (liteTrackWatchDogHandlerThreadOpt) onWarmupCompleted(-1245651513, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult}, 1245651518, R.drawable.IAuthTabCallback());
                        z4 = (i15 & 896) == 256;
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zIAuthTabCallback);
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (((z4 | zOnExtraCallback) || zOnNavigationEvent2) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            inventoryAdManager2 = inventoryAdManager3;
                            cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult;
                            function15 = function14;
                            function03 = function06;
                            num2 = num;
                            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport05;
                            z5 = zBooleanValue2;
                            z6 = zBooleanValue;
                            z7 = z26;
                            i2 = i3;
                            i4 = 6;
                            liteprocesshandlerthreadopt = liteprocesshandlerthreadoptOnExtraCallback;
                            function02 = function05;
                            onWarmupCompleted onwarmupcompleted2 = new onWarmupCompleted(zBooleanValue2, zIAuthTabCallback, cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(onwarmupcompleted2);
                            objOnMinimized2 = onwarmupcompleted2;
                        } else {
                            cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult;
                            liteprocesshandlerthreadopt = liteprocesshandlerthreadoptOnExtraCallback;
                            z5 = zBooleanValue2;
                            z6 = zBooleanValue;
                            inventoryAdManager2 = inventoryAdManager3;
                            function02 = function05;
                            z7 = z26;
                            function03 = function06;
                            i2 = i3;
                            num2 = num;
                            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport05;
                            function15 = function14;
                            i4 = 6;
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(litetrackwatchdoghandlerthreadopt, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport0;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport06, 0.0f, 1, (Object) null), onextracallbackwithresult2.IAuthTabCallback_Parcel());
                        FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult2.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted2);
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult3.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult3.onTransact());
                        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport06, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                        if (liteprocesshandlerthreadopt.extraCallbackWithResult()) {
                            str2 = str9;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-268331089);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-268484849);
                            boolean z28 = (i15 & 14) == 4;
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z28 || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized3 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda6
                                    private static int IAuthTabCallback = 0;
                                    private static int onExtraCallback = 1;

                                    public final Object invoke() {
                                        int i18 = 2 % 2;
                                        int i19 = IAuthTabCallback + 105;
                                        onExtraCallback = i19 % 128;
                                        int i20 = i19 % 2;
                                        CreditHomeViewModel creditHomeViewModel2 = creditHomeViewModel;
                                        if (i20 != 0) {
                                            return StackTraceInfo.onExtraCallback(creditHomeViewModel2);
                                        }
                                        StackTraceInfo.onExtraCallback(creditHomeViewModel2);
                                        Object obj8 = null;
                                        obj8.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                            }
                            str2 = str9;
                            onNavigationEvent(str2, (Function0<Unit>) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i15 >> 27) & 14);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport06, 0.0f, 1, (Object) null);
                        component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult2.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                        int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                        Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent2, onextracallbackwithresult3.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult3.onTransact());
                        if (liteprocesshandlerthreadopt.onExtraCallback() == null) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(249354162);
                            String strOnExtraCallbackWithResult3 = liteprocesshandlerthreadopt.onExtraCallback().onExtraCallbackWithResult();
                            String strOnWarmupCompleted = liteprocesshandlerthreadopt.onExtraCallback().onWarmupCompleted();
                            int i18 = i15 & 14;
                            boolean z29 = i18 == 4;
                            int i19 = 1879048192 & i15;
                            if (i19 == 536870912) {
                                liteprocesshandlerthreadopt2 = liteprocesshandlerthreadopt;
                                z24 = true;
                            } else {
                                liteprocesshandlerthreadopt2 = liteprocesshandlerthreadopt;
                                z24 = false;
                            }
                            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(liteprocesshandlerthreadopt2);
                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(z29 | z24 | zOnExtraCallback3)) {
                                Object obj8 = objOnMinimized4;
                                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                    Function0 function07 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda17
                                        private static int IAuthTabCallback = 0;
                                        private static int onExtraCallback = 1;

                                        public final Object invoke() {
                                            int i20 = 2 % 2;
                                            int i21 = IAuthTabCallback + 11;
                                            onExtraCallback = i21 % 128;
                                            if (i21 % 2 == 0) {
                                                StackTraceInfo.IAuthTabCallback(creditHomeViewModel, str2, liteprocesshandlerthreadopt2);
                                                throw null;
                                            }
                                            Unit unitIAuthTabCallback = StackTraceInfo.IAuthTabCallback(creditHomeViewModel, str2, liteprocesshandlerthreadopt2);
                                            int i22 = IAuthTabCallback + 3;
                                            onExtraCallback = i22 % 128;
                                            if (i22 % 2 != 0) {
                                                return unitIAuthTabCallback;
                                            }
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function07);
                                    obj8 = function07;
                                }
                                Function0 function08 = (Function0) obj8;
                                boolean z30 = i18 == 4;
                                boolean z31 = i19 == 536870912;
                                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(liteprocesshandlerthreadopt2);
                                boolean z32 = (i15 & 7168) == 2048;
                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(z30 | z31 | zOnExtraCallback4 | z32)) {
                                    int i20 = asInterface + 109;
                                    onTransact = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        onwarmupcompleted.onExtraCallback();
                                        throw null;
                                    }
                                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                        function16 = function110;
                                        Function0 function09 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda26
                                            private static int IAuthTabCallback = 1;
                                            private static int onExtraCallback;

                                            public final Object invoke() {
                                                int i21 = 2 % 2;
                                                int i22 = IAuthTabCallback + 93;
                                                onExtraCallback = i22 % 128;
                                                if (i22 % 2 != 0) {
                                                    StackTraceInfo.onNavigationEvent(creditHomeViewModel, function16, liteprocesshandlerthreadopt2, str2);
                                                    Object obj9 = null;
                                                    obj9.hashCode();
                                                    throw null;
                                                }
                                                Unit unitOnNavigationEvent = StackTraceInfo.onNavigationEvent(creditHomeViewModel, function16, liteprocesshandlerthreadopt2, str2);
                                                int i23 = onExtraCallback + 59;
                                                IAuthTabCallback = i23 % 128;
                                                int i24 = i23 % 2;
                                                return unitOnNavigationEvent;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function09);
                                        obj7 = function09;
                                    } else {
                                        function16 = function110;
                                        obj7 = objOnMinimized5;
                                    }
                                    RuntimeEnvironmentListener.onNavigationEvent(strOnExtraCallbackWithResult3, strOnWarmupCompleted, function08, (Function0) obj7, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport06, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                }
                            }
                        } else {
                            function16 = function110;
                            liteprocesshandlerthreadopt2 = liteprocesshandlerthreadopt;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(250683225);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        boolean zIAuthTabCallback2 = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
                        getTime gettimeAsBinder = liteprocesshandlerthreadopt2.asBinder();
                        getTime gettimeIAuthTabCallbackStubProxy = liteprocesshandlerthreadopt2.IAuthTabCallbackStubProxy();
                        int iOnExtraCallback = (zOnExtraCallback2 || (creditHomeHeaderResponseOnTransact2 = liteprocesshandlerthreadopt2.onTransact()) == null || (scoreDeltaInfoOnExtraCallbackWithResult3 = creditHomeHeaderResponseOnTransact2.onExtraCallbackWithResult()) == null) ? 0 : scoreDeltaInfoOnExtraCallbackWithResult3.onExtraCallback();
                        int iOnExtraCallbackWithResult = (zOnExtraCallback2 || (creditHomeHeaderResponseOnTransact = liteprocesshandlerthreadopt2.onTransact()) == null || (scoreDeltaInfoOnExtraCallbackWithResult2 = creditHomeHeaderResponseOnTransact.onExtraCallbackWithResult()) == null) ? 0 : scoreDeltaInfoOnExtraCallbackWithResult2.onExtraCallbackWithResult();
                        int i21 = 1879048192 & i15;
                        z8 = i21 != 536870912;
                        int i22 = i15 & 14;
                        z9 = i22 != 4;
                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (z8 | z9) {
                            Object obj9 = objOnMinimized6;
                            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                Function0 function010 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda27
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke() {
                                        int i23 = 2 % 2;
                                        int i24 = onNavigationEvent + 13;
                                        onExtraCallbackWithResult = i24 % 128;
                                        if (i24 % 2 != 0) {
                                            Object[] objArr2 = {str2, creditHomeViewModel};
                                            throw null;
                                        }
                                        Object[] objArr3 = {str2, creditHomeViewModel};
                                        Unit unit = (Unit) StackTraceInfo.onWarmupCompleted(1312714059, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr3, -1312714042, R.drawable.IAuthTabCallback());
                                        int i25 = onNavigationEvent + 1;
                                        onExtraCallbackWithResult = i25 % 128;
                                        if (i25 % 2 == 0) {
                                            return unit;
                                        }
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function010);
                                obj9 = function010;
                            }
                            Function0 function011 = (Function0) obj9;
                            int i23 = i15 >> 12;
                            RuntimeHelper1.onWarmupCompleted(zIAuthTabCallback2, false, z27, gettimeAsBinder, gettimeIAuthTabCallbackStubProxy, iOnExtraCallback, iOnExtraCallbackWithResult, zOnExtraCallback2, zOnNavigationEvent, z3, function111, function011, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, i23 & 14, 0);
                            if (z27) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(251907353);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(251788189);
                                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport06, zOnExtraCallback2 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                            CreditHomeHeaderResponse creditHomeHeaderResponseOnTransact3 = liteprocesshandlerthreadopt2.onTransact();
                            if (creditHomeHeaderResponseOnTransact3 != null) {
                                int i24 = onTransact + 85;
                                asInterface = i24 % 128;
                                if (i24 % 2 == 0) {
                                    creditHomeHeaderResponseOnTransact3.onExtraCallbackWithResult();
                                    throw null;
                                }
                                scoreDeltaInfoOnExtraCallbackWithResult = creditHomeHeaderResponseOnTransact3.onExtraCallbackWithResult();
                                creditHomeLargeBannerType = null;
                            } else {
                                creditHomeLargeBannerType = null;
                                scoreDeltaInfoOnExtraCallbackWithResult = null;
                            }
                            boolean z33 = zOnExtraCallback2 && scoreDeltaInfoOnExtraCallbackWithResult != null;
                            CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface2 = liteprocesshandlerthreadopt2.asInterface();
                            CreditHomeLargeBannerType creditHomeLargeBannerType5 = creditHomeLargeBannerResponseAsInterface2 != null ? (CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponseAsInterface2}, zzgsa.onWarmupCompleted()) : creditHomeLargeBannerType;
                            CreditHomeLargeBannerType creditHomeLargeBannerType6 = CreditHomeLargeBannerType.LOAN_NEEDS_V2;
                            boolean z34 = creditHomeLargeBannerType5 == creditHomeLargeBannerType6;
                            CreditHomeHeaderResponse creditHomeHeaderResponseOnTransact4 = liteprocesshandlerthreadopt2.onTransact();
                            if (creditHomeHeaderResponseOnTransact4 == null || (listEmptyList = creditHomeHeaderResponseOnTransact4.IAuthTabCallback()) == null) {
                                listEmptyList = CollectionsKt.emptyList();
                            }
                            final List list = listEmptyList;
                            final boolean z35 = z33;
                            final ScoreDeltaInfo scoreDeltaInfo = scoreDeltaInfoOnExtraCallbackWithResult;
                            final String str10 = str2;
                            final Function1 function113 = function16;
                            function13 = function111;
                            final Function1 function114 = function16;
                            final liteProcessHandlerThreadOpt liteprocesshandlerthreadopt6 = liteprocesshandlerthreadopt2;
                            Function2 function2OnExtraCallback = ForwardingCameraControl.onExtraCallback(-948771920, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda28
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj10, Object obj11) {
                                    int i25 = 2 % 2;
                                    int i26 = IAuthTabCallback + 39;
                                    onExtraCallbackWithResult = i26 % 128;
                                    int i27 = i26 % 2;
                                    Unit unitIAuthTabCallback = StackTraceInfo.IAuthTabCallback(z35, scoreDeltaInfo, list, creditHomeViewModel, function113, str10, liteprocesshandlerthreadopt6, (CameraCaptureResultEmptyCameraCaptureResult) obj10, ((Integer) obj11).intValue());
                                    int i28 = onExtraCallbackWithResult + 65;
                                    IAuthTabCallback = i28 % 128;
                                    int i29 = i28 % 2;
                                    return unitIAuthTabCallback;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                            if (zOnExtraCallback2) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-261605484);
                                num3 = num2;
                                function2OnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, num3);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            } else {
                                num3 = num2;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-261548785);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            }
                            CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface3 = liteprocesshandlerthreadopt2.asInterface();
                            if (creditHomeLargeBannerResponseAsInterface3 != null) {
                                CreditHomeLargeBannerType creditHomeLargeBannerType7 = (CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponseAsInterface3}, zzgsa.onWarmupCompleted());
                                boolean z36 = creditHomeLargeBannerType7 != null && creditHomeLargeBannerType7.isCreditRecoveryType();
                                if (liteprocesshandlerthreadopt2.onTransact() == null || z36 || z33) {
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
                                    z10 = z7;
                                    str3 = str10;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-258177969);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-261245481);
                                    CreditHomeHeaderResponse creditHomeHeaderResponseOnTransact5 = liteprocesshandlerthreadopt2.onTransact();
                                    CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface4 = liteprocesshandlerthreadopt2.asInterface();
                                    boolean zIAuthTabCallbackStubProxy = creditHomeViewModel.IAuthTabCallbackStubProxy();
                                    boolean z37 = i22 == 4;
                                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!z37) {
                                        Object obj10 = objOnMinimized7;
                                        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                            Function0 function012 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda29
                                                private static int IAuthTabCallback = 1;
                                                private static int onExtraCallback;

                                                public final Object invoke() {
                                                    int i25 = 2 % 2;
                                                    int i26 = onExtraCallback + 115;
                                                    IAuthTabCallback = i26 % 128;
                                                    int i27 = i26 % 2;
                                                    CreditHomeViewModel creditHomeViewModel2 = creditHomeViewModel;
                                                    if (i27 != 0) {
                                                        return StackTraceInfo.onExtraCallbackWithResult(creditHomeViewModel2);
                                                    }
                                                    StackTraceInfo.onExtraCallbackWithResult(creditHomeViewModel2);
                                                    Object obj11 = null;
                                                    obj11.hashCode();
                                                    throw null;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function012);
                                            obj10 = function012;
                                        }
                                        Function0 function013 = (Function0) obj10;
                                        boolean z38 = i22 == 4;
                                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (!z38) {
                                            Object obj11 = objOnMinimized8;
                                            if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                                                Function1 function115 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda30
                                                    private static int onExtraCallbackWithResult = 0;
                                                    private static int onWarmupCompleted = 1;

                                                    public final Object invoke(Object obj12) {
                                                        int i25 = 2 % 2;
                                                        int i26 = onWarmupCompleted + 55;
                                                        onExtraCallbackWithResult = i26 % 128;
                                                        int i27 = i26 % 2;
                                                        Object[] objArr2 = {creditHomeViewModel, (CreditHomeHeaderResponse) obj12};
                                                        Unit unit = (Unit) StackTraceInfo.onWarmupCompleted(-1040333592, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2, 1040333606, R.drawable.IAuthTabCallback());
                                                        int i28 = onWarmupCompleted + 29;
                                                        onExtraCallbackWithResult = i28 % 128;
                                                        int i29 = i28 % 2;
                                                        return unit;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function115);
                                                obj11 = function115;
                                            }
                                            Function1 function116 = (Function1) obj11;
                                            if (i21 == 536870912) {
                                                int i25 = onTransact + 87;
                                                asInterface = i25 % 128;
                                                int i26 = i25 % 2;
                                                z22 = true;
                                            } else {
                                                z22 = false;
                                            }
                                            boolean z39 = i22 == 4;
                                            int i27 = i15 & 7168;
                                            boolean z40 = i27 == 2048;
                                            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (((z22 | z39) || z40) || objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                                                str3 = str10;
                                                Function2 function22 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda31
                                                    private static int IAuthTabCallback = 1;
                                                    private static int onWarmupCompleted;

                                                    public final Object invoke(Object obj12, Object obj13) {
                                                        int i28 = 2 % 2;
                                                        int i29 = onWarmupCompleted + 47;
                                                        IAuthTabCallback = i29 % 128;
                                                        int i30 = i29 % 2;
                                                        Unit unitOnNavigationEvent = StackTraceInfo.onNavigationEvent(str3, creditHomeViewModel, function114, (CreditHomeHeaderItem) obj12, ((Integer) obj13).intValue());
                                                        int i31 = IAuthTabCallback + 73;
                                                        onWarmupCompleted = i31 % 128;
                                                        int i32 = i31 % 2;
                                                        return unitOnNavigationEvent;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function22);
                                                obj6 = function22;
                                            } else {
                                                str3 = str10;
                                                obj6 = objOnMinimized9;
                                            }
                                            Function2 function23 = (Function2) obj6;
                                            if (i22 == 4) {
                                                int i28 = asInterface + 29;
                                                onTransact = i28 % 128;
                                                int i29 = i28 % 2;
                                                z23 = true;
                                            } else {
                                                z23 = false;
                                            }
                                            z10 = z7;
                                            boolean z41 = i21 == 536870912;
                                            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z10);
                                            Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (!(z23 | z41 | zOnExtraCallback5)) {
                                                Object obj12 = objOnMinimized10;
                                                if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                                                    Function1 function117 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda32
                                                        private static int onNavigationEvent = 1;
                                                        private static int onWarmupCompleted;

                                                        public final Object invoke(Object obj13) {
                                                            int i30 = 2 % 2;
                                                            int i31 = onWarmupCompleted + 67;
                                                            onNavigationEvent = i31 % 128;
                                                            int i32 = i31 % 2;
                                                            Unit unitOnWarmupCompleted = StackTraceInfo.onWarmupCompleted(creditHomeViewModel, str3, z10, (CreditHomeLargeBannerResponse) obj13);
                                                            int i33 = onNavigationEvent + 93;
                                                            onWarmupCompleted = i33 % 128;
                                                            int i34 = i33 % 2;
                                                            return unitOnWarmupCompleted;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function117);
                                                    obj12 = function117;
                                                }
                                                Function1 function118 = (Function1) obj12;
                                                boolean z42 = i22 == 4;
                                                boolean z43 = i21 == 536870912;
                                                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z10);
                                                boolean z44 = i27 == 2048;
                                                Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (!(z42 | z43 | zOnExtraCallback6 | z44)) {
                                                    Object obj13 = objOnMinimized11;
                                                    if (objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                                                        Function1 function119 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda33
                                                            private static int onExtraCallback = 1;
                                                            private static int onWarmupCompleted;

                                                            public final Object invoke(Object obj14) {
                                                                int i30 = 2 % 2;
                                                                int i31 = onExtraCallback + 85;
                                                                onWarmupCompleted = i31 % 128;
                                                                int i32 = i31 % 2;
                                                                CreditHomeViewModel creditHomeViewModel2 = creditHomeViewModel;
                                                                Function1 function120 = function114;
                                                                String str11 = str3;
                                                                Boolean boolValueOf = Boolean.valueOf(z10);
                                                                int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                                                                int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                                                                int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
                                                                Unit unit = (Unit) StackTraceInfo.onWarmupCompleted(-667881123, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{creditHomeViewModel2, function120, str11, boolValueOf, (CreditHomeLargeBannerResponse) obj14}, 667881130, iIAuthTabCallback3);
                                                                int i33 = onExtraCallback + 35;
                                                                onWarmupCompleted = i33 % 128;
                                                                if (i33 % 2 == 0) {
                                                                    return unit;
                                                                }
                                                                throw null;
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function119);
                                                        obj13 = function119;
                                                    }
                                                    printVisualizationLog.onWarmupCompleted(creditHomeHeaderResponseOnTransact5, creditHomeLargeBannerResponseAsInterface4, zIAuthTabCallbackStubProxy, function013, function116, function23, function118, (Function1) obj13, liteprocesshandlerthreadopt2.getInterfaceDescriptor(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
                                                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!(!z33) && z34) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-257906316);
                                    Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized12 = Boolean.valueOf(creditHomeViewModel.onExtraCallbackWithResult());
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized12);
                                    }
                                    final boolean zBooleanValue3 = ((Boolean) objOnMinimized12).booleanValue();
                                    z11 = z10;
                                    Integer num7 = num3;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ensureNavButtonView.onExtraCallback(verifyDrawable.onExtraCallbackWithResult(setExtensionStrength.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(64.0f), 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 2, (Object) null), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f))), addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0) ? ByteOrderedDataOutputStream.onExtraCallback(148034044) : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4294769916L), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f))), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.5f), ByteOrderedDataOutputStream.onExtraCallback(addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0) ? 83892019 : Integer.MAX_VALUE), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f)));
                                    component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.onExtraCallback(), false);
                                    int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                                    Function0 function0IAuthTabCallback4 = onextracallbackwithresult3.IAuthTabCallback();
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                        getAwbState.onExtraCallback();
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback4);
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                    }
                                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnWarmupCompleted2, onextracallbackwithresult3.asBinder());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult3.asInterface());
                                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult3.onWarmupCompleted());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult3.onNavigationEvent());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult3.onTransact());
                                    CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault2 = liteprocesshandlerthreadopt2.asInterface().IAuthTabCallbackDefault();
                                    String strValueOf = String.valueOf((dualColumnContentsIAuthTabCallbackDefault2 == null || (columnContentOnNavigationEvent3 = dualColumnContentsIAuthTabCallbackDefault2.onNavigationEvent()) == null) ? null : columnContentOnNavigationEvent3.onExtraCallbackWithResult());
                                    boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(liteprocesshandlerthreadopt2);
                                    boolean z45 = i22 == 4;
                                    if (i21 == 536870912) {
                                        int i30 = onTransact + 83;
                                        asInterface = i30 % 128;
                                        if (i30 % 2 == 0) {
                                            int i31 = 3 % 3;
                                        }
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!(zOnExtraCallback7 | z45 | z12)) {
                                        Object obj14 = objOnMinimized13;
                                        if (objOnMinimized13 == onwarmupcompleted.onExtraCallback()) {
                                            Function1 function120 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda7
                                                private static int IAuthTabCallback = 1;
                                                private static int onExtraCallbackWithResult;

                                                public final Object invoke(Object obj15) {
                                                    int i32 = 2 % 2;
                                                    int i33 = onExtraCallbackWithResult + 27;
                                                    IAuthTabCallback = i33 % 128;
                                                    int i34 = i33 % 2;
                                                    Object[] objArr2 = {liteprocesshandlerthreadopt2, creditHomeViewModel, str3, Boolean.valueOf(zBooleanValue3), Boolean.valueOf(((Boolean) obj15).booleanValue())};
                                                    Unit unit = (Unit) StackTraceInfo.onWarmupCompleted(1177714309, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2, -1177714278, R.drawable.IAuthTabCallback());
                                                    int i35 = IAuthTabCallback + 41;
                                                    onExtraCallbackWithResult = i35 % 128;
                                                    int i36 = i35 % 2;
                                                    return unit;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function120);
                                            obj14 = function120;
                                        }
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageLoaderBuilderExternalSyntheticLambda1.IAuthTabCallback(quirksExternalSyntheticBackport03, 0.0f, strValueOf, null, null, (Function1) obj14, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 13);
                                        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault3 = liteprocesshandlerthreadopt2.asInterface().IAuthTabCallbackDefault();
                                        String str11 = (dualColumnContentsIAuthTabCallbackDefault3 == null || (strOnExtraCallback = dualColumnContentsIAuthTabCallbackDefault3.onExtraCallback()) == null) ? "" : strOnExtraCallback;
                                        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault4 = liteprocesshandlerthreadopt2.asInterface().IAuthTabCallbackDefault();
                                        String str12 = (dualColumnContentsIAuthTabCallbackDefault4 == null || (columnContentOnNavigationEvent2 = dualColumnContentsIAuthTabCallbackDefault4.onNavigationEvent()) == null || (strOnExtraCallbackWithResult2 = columnContentOnNavigationEvent2.onExtraCallbackWithResult()) == null) ? "" : strOnExtraCallbackWithResult2;
                                        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault5 = liteprocesshandlerthreadopt2.asInterface().IAuthTabCallbackDefault();
                                        String str13 = (dualColumnContentsIAuthTabCallbackDefault5 == null || (columnContentOnWarmupCompleted2 = dualColumnContentsIAuthTabCallbackDefault5.onWarmupCompleted()) == null || (strOnExtraCallbackWithResult = columnContentOnWarmupCompleted2.onExtraCallbackWithResult()) == null) ? "" : strOnExtraCallbackWithResult;
                                        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault6 = liteprocesshandlerthreadopt2.asInterface().IAuthTabCallbackDefault();
                                        CreditHomeLargeBannerResponse.ChangeType changeTypeOnWarmupCompleted = (dualColumnContentsIAuthTabCallbackDefault6 == null || (columnContentOnNavigationEvent = dualColumnContentsIAuthTabCallbackDefault6.onNavigationEvent()) == null) ? null : columnContentOnNavigationEvent.onWarmupCompleted();
                                        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault7 = liteprocesshandlerthreadopt2.asInterface().IAuthTabCallbackDefault();
                                        CreditHomeLargeBannerResponse.ChangeType changeTypeOnWarmupCompleted2 = (dualColumnContentsIAuthTabCallbackDefault7 == null || (columnContentOnWarmupCompleted = dualColumnContentsIAuthTabCallbackDefault7.onWarmupCompleted()) == null) ? null : columnContentOnWarmupCompleted.onWarmupCompleted();
                                        String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.main.R.string.credit_home_loan_needs_cta, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault8 = liteprocesshandlerthreadopt2.asInterface().IAuthTabCallbackDefault();
                                        if (dualColumnContentsIAuthTabCallbackDefault8 != null) {
                                            strIAuthTabCallback2 = dualColumnContentsIAuthTabCallbackDefault8.IAuthTabCallback();
                                            i5 = 4;
                                        } else {
                                            i5 = 4;
                                            strIAuthTabCallback2 = null;
                                        }
                                        if (i22 == i5) {
                                            z13 = true;
                                        } else {
                                            int i32 = onTransact + 39;
                                            asInterface = i32 % 128;
                                            int i33 = i32 % 2;
                                            z13 = false;
                                        }
                                        boolean z46 = i21 == 536870912;
                                        boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(liteprocesshandlerthreadopt2);
                                        boolean z47 = (i15 & 7168) == 2048;
                                        Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (((z13 | z46 | zOnExtraCallback8) || z47) || objOnMinimized14 == onwarmupcompleted.onExtraCallback()) {
                                            z14 = zBooleanValue3;
                                            final String str14 = str3;
                                            final liteProcessHandlerThreadOpt liteprocesshandlerthreadopt7 = liteprocesshandlerthreadopt2;
                                            str4 = str14;
                                            num4 = num7;
                                            Function0 function014 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda8
                                                private static int IAuthTabCallback = 0;
                                                private static int onExtraCallback = 1;

                                                public final Object invoke() {
                                                    int i34 = 2 % 2;
                                                    int i35 = IAuthTabCallback + 63;
                                                    onExtraCallback = i35 % 128;
                                                    int i36 = i35 % 2;
                                                    Unit unitOnExtraCallback = StackTraceInfo.onExtraCallback(creditHomeViewModel, function114, liteprocesshandlerthreadopt7, str14, z14);
                                                    int i37 = IAuthTabCallback + 69;
                                                    onExtraCallback = i37 % 128;
                                                    int i38 = i37 % 2;
                                                    return unitOnExtraCallback;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function014);
                                            obj2 = function014;
                                        } else {
                                            z14 = zBooleanValue3;
                                            str4 = str3;
                                            num4 = num7;
                                            obj2 = objOnMinimized14;
                                        }
                                        Function0 function015 = (Function0) obj2;
                                        boolean z48 = i22 == 4;
                                        Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (!z48) {
                                            Object obj15 = objOnMinimized15;
                                            if (objOnMinimized15 == onwarmupcompleted.onExtraCallback()) {
                                                Function0 function016 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda9
                                                    private static int onNavigationEvent = 1;
                                                    private static int onWarmupCompleted;

                                                    public final Object invoke() {
                                                        int i34 = 2 % 2;
                                                        int i35 = onNavigationEvent + 123;
                                                        onWarmupCompleted = i35 % 128;
                                                        int i36 = i35 % 2;
                                                        Unit unitOnWarmupCompleted = StackTraceInfo.onWarmupCompleted(creditHomeViewModel);
                                                        int i37 = onNavigationEvent + 111;
                                                        onWarmupCompleted = i37 % 128;
                                                        if (i37 % 2 != 0) {
                                                            int i38 = 53 / 0;
                                                        }
                                                        return unitOnWarmupCompleted;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function016);
                                                obj15 = function016;
                                            }
                                            addInfoPartTwo.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, str11, str12, str13, changeTypeOnWarmupCompleted, changeTypeOnWarmupCompleted2, strOnExtraCallback2, function015, true, strIAuthTabCallback2, z14, (Function0) obj15, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663296, 6, 0);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        }
                                    }
                                } else {
                                    z11 = z10;
                                    num4 = num3;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                                    str4 = str3;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-254620657);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                }
                                CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface5 = liteprocesshandlerthreadopt2.asInterface();
                                if (creditHomeLargeBannerResponseAsInterface5 != null) {
                                    creditHomeLargeBannerType3 = (CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponseAsInterface5}, zzgsa.onWarmupCompleted());
                                    creditHomeLargeBannerType2 = creditHomeLargeBannerType6;
                                } else {
                                    creditHomeLargeBannerType2 = creditHomeLargeBannerType6;
                                    creditHomeLargeBannerType3 = null;
                                }
                                boolean z49 = creditHomeLargeBannerType3 == creditHomeLargeBannerType2;
                                Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized16 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized16 = Boolean.valueOf(creditHomeViewModel.onExtraCallback());
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized16);
                                }
                                boolean zBooleanValue4 = ((Boolean) objOnMinimized16).booleanValue();
                                if (z49) {
                                    i6 = i22;
                                    i7 = i21;
                                    str5 = str4;
                                    i8 = i15;
                                    liteprocesshandlerthreadopt3 = liteprocesshandlerthreadopt2;
                                    function17 = function114;
                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                    z15 = z11;
                                    z = z5;
                                    z2 = z6;
                                    function2 = function2OnExtraCallback;
                                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-250804433);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-254260189);
                                    CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface6 = liteprocesshandlerthreadopt2.asInterface();
                                    if (creditHomeLargeBannerResponseAsInterface6 != null) {
                                        CreditHomeLargeBannerType creditHomeLargeBannerType8 = (CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponseAsInterface6}, zzgsa.onWarmupCompleted());
                                        if (creditHomeLargeBannerType8 == null) {
                                            creditHomeLargeBannerType8 = "";
                                        }
                                        CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface7 = liteprocesshandlerthreadopt2.asInterface();
                                        if (creditHomeLargeBannerResponseAsInterface7 != null) {
                                            CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents = (CreditHomeLargeBannerResponse.DualCtaContents) CreditHomeLargeBannerResponse.onNavigationEvent(-1313771003, zzgsa.onWarmupCompleted(), 1313771004, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponseAsInterface7}, zzgsa.onWarmupCompleted());
                                            String strOnTransact = dualCtaContents != null ? dualCtaContents.onTransact() : null;
                                            CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface8 = liteprocesshandlerthreadopt2.asInterface();
                                            String str15 = creditHomeLargeBannerType8 + strOnTransact + ((creditHomeLargeBannerResponseAsInterface8 == null || (dualRowContentsOnTransact = creditHomeLargeBannerResponseAsInterface8.onTransact()) == null) ? null : dualRowContentsOnTransact.IAuthTabCallback());
                                            boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(liteprocesshandlerthreadopt2);
                                            boolean z50 = i21 == 536870912;
                                            boolean z51 = i22 == 4;
                                            Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (!(zOnExtraCallback9 | z50 | z51)) {
                                                Object obj16 = objOnMinimized17;
                                                if (objOnMinimized17 == onwarmupcompleted.onExtraCallback()) {
                                                    Function1 function121 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda10
                                                        private static int IAuthTabCallback = 0;
                                                        private static int onExtraCallbackWithResult = 1;

                                                        public final Object invoke(Object obj17) throws Throwable {
                                                            int i34 = 2 % 2;
                                                            int i35 = onExtraCallbackWithResult + 89;
                                                            IAuthTabCallback = i35 % 128;
                                                            int i36 = i35 % 2;
                                                            Unit unitOnNavigationEvent = StackTraceInfo.onNavigationEvent(liteprocesshandlerthreadopt2, creditHomeViewModel, str4, ((Boolean) obj17).booleanValue());
                                                            int i37 = IAuthTabCallback + 109;
                                                            onExtraCallbackWithResult = i37 % 128;
                                                            if (i37 % 2 != 0) {
                                                                return unitOnNavigationEvent;
                                                            }
                                                            throw null;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function121);
                                                    obj16 = function121;
                                                }
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = ImageLoaderBuilderExternalSyntheticLambda1.IAuthTabCallback(quirksExternalSyntheticBackport03, 0.0f, str15, null, null, (Function1) obj16, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 13);
                                                liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt2 = (liteTrackWatchDogHandlerThreadOpt) onWarmupCompleted(-1245651513, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, 1245651518, R.drawable.IAuthTabCallback());
                                                CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface9 = liteprocesshandlerthreadopt2.asInterface();
                                                if (i22 == 4) {
                                                    int i34 = asInterface + 17;
                                                    onTransact = i34 % 128;
                                                    int i35 = i34 % 2;
                                                    z20 = true;
                                                } else {
                                                    z20 = false;
                                                }
                                                boolean z52 = i21 == 536870912;
                                                boolean z53 = (i15 & 7168) == 2048;
                                                Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (!(z20 | z52 | z53)) {
                                                    Object obj17 = objOnMinimized18;
                                                    if (objOnMinimized18 == onwarmupcompleted.onExtraCallback()) {
                                                        Function1 function122 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda11
                                                            private static int onExtraCallback = 0;
                                                            private static int onExtraCallbackWithResult = 1;

                                                            public final Object invoke(Object obj18) {
                                                                int i36 = 2 % 2;
                                                                int i37 = onExtraCallback + 61;
                                                                onExtraCallbackWithResult = i37 % 128;
                                                                int i38 = i37 % 2;
                                                                Unit unitOnExtraCallback = StackTraceInfo.onExtraCallback(creditHomeViewModel, function114, str4, (CreditHomeLargeBannerResponse) obj18);
                                                                int i39 = onExtraCallbackWithResult + 117;
                                                                onExtraCallback = i39 % 128;
                                                                int i40 = i39 % 2;
                                                                return unitOnExtraCallback;
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function122);
                                                        obj17 = function122;
                                                    }
                                                    Function1 function123 = (Function1) obj17;
                                                    if (i22 == 4) {
                                                        int i36 = asInterface + 71;
                                                        onTransact = i36 % 128;
                                                        int i37 = i36 % 2;
                                                        z21 = true;
                                                    } else {
                                                        z21 = false;
                                                    }
                                                    Object objOnMinimized19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                    if (!z21) {
                                                        Object obj18 = objOnMinimized19;
                                                        if (objOnMinimized19 == onwarmupcompleted.onExtraCallback()) {
                                                            Function0 function017 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda12
                                                                private static int onExtraCallback = 0;
                                                                private static int onWarmupCompleted = 1;

                                                                public final Object invoke() {
                                                                    int i38 = 2 % 2;
                                                                    int i39 = onWarmupCompleted + 121;
                                                                    onExtraCallback = i39 % 128;
                                                                    int i40 = i39 % 2;
                                                                    Unit unitIAuthTabCallback = StackTraceInfo.IAuthTabCallback(creditHomeViewModel);
                                                                    int i41 = onWarmupCompleted + 49;
                                                                    onExtraCallback = i41 % 128;
                                                                    int i42 = i41 % 2;
                                                                    return unitIAuthTabCallback;
                                                                }
                                                            };
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function017);
                                                            obj18 = function017;
                                                        }
                                                        i7 = i21;
                                                        function17 = function114;
                                                        function2 = function2OnExtraCallback;
                                                        i6 = i22;
                                                        str5 = str4;
                                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                        z = z5;
                                                        i8 = i15;
                                                        liteprocesshandlerthreadopt3 = liteprocesshandlerthreadopt2;
                                                        z15 = z11;
                                                        z2 = z6;
                                                        getQos.onExtraCallbackWithResult(-1351414432, new Object[]{quirksExternalSyntheticBackport0IAuthTabCallback2, str4, litetrackwatchdoghandlerthreadopt2, false, creditHomeLargeBannerResponseAsInterface9, function123, function114, Boolean.valueOf(zOnExtraCallback2), Boolean.valueOf(zBooleanValue4), (Function0) obj18, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i15 >> 24) & 112) | 100666368 | ((i15 << 9) & 3670016)), 0}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1351414441, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (zOnExtraCallback2) {
                                    num5 = num4;
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-250702257);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-250758956);
                                    num5 = num4;
                                    function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, num5);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                }
                                component5 component5VarOnWarmupCompleted3 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
                                int iHashCode5 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport04);
                                Function0 function0IAuthTabCallback5 = onextracallbackwithresult3.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                                    getAwbState.onExtraCallback();
                                }
                                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback5);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, component5VarOnWarmupCompleted3, onextracallbackwithresult3.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5, onextracallbackwithresult3.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, Integer.valueOf(iHashCode5), onextracallbackwithresult3.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, onextracallbackwithresult3.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, quirksExternalSyntheticBackport0OnWarmupCompleted6, onextracallbackwithresult3.onTransact());
                                component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult2.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                                int iHashCode6 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject6 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted7 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport04);
                                Function0 function0IAuthTabCallback6 = onextracallbackwithresult3.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                                    getAwbState.onExtraCallback();
                                }
                                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback6);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, component5VarOnNavigationEvent3, onextracallbackwithresult3.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject6, onextracallbackwithresult3.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, Integer.valueOf(iHashCode6), onextracallbackwithresult3.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, onextracallbackwithresult3.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, quirksExternalSyntheticBackport0OnWarmupCompleted7, onextracallbackwithresult3.onTransact());
                                if (liteprocesshandlerthreadopt3.onTransact() == null || !z36 || z33) {
                                    function18 = function17;
                                    i9 = i6;
                                    i10 = i7;
                                    str6 = str5;
                                    i11 = i8;
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1820922253);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1824077216);
                                    CreditHomeHeaderResponse creditHomeHeaderResponseOnTransact6 = liteprocesshandlerthreadopt3.onTransact();
                                    CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface10 = liteprocesshandlerthreadopt3.asInterface();
                                    boolean zIAuthTabCallbackStubProxy2 = creditHomeViewModel.IAuthTabCallbackStubProxy();
                                    i9 = i6;
                                    boolean z54 = i9 == 4;
                                    Object objOnMinimized20 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!z54) {
                                        Object obj19 = objOnMinimized20;
                                        if (objOnMinimized20 == onwarmupcompleted.onExtraCallback()) {
                                            Function0 function018 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda13
                                                private static int IAuthTabCallback = 0;
                                                private static int onExtraCallback = 1;

                                                public final Object invoke() {
                                                    int i38 = 2 % 2;
                                                    int i39 = onExtraCallback + 9;
                                                    IAuthTabCallback = i39 % 128;
                                                    int i40 = i39 % 2;
                                                    Unit unitOnNavigationEvent = StackTraceInfo.onNavigationEvent(creditHomeViewModel);
                                                    int i41 = onExtraCallback + 13;
                                                    IAuthTabCallback = i41 % 128;
                                                    int i42 = i41 % 2;
                                                    return unitOnNavigationEvent;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function018);
                                            obj19 = function018;
                                        }
                                        Function0 function019 = (Function0) obj19;
                                        boolean z55 = i9 == 4;
                                        Object objOnMinimized21 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                        if (!z55) {
                                            Object obj20 = objOnMinimized21;
                                            if (objOnMinimized21 == onwarmupcompleted.onExtraCallback()) {
                                                Function1 function124 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda14
                                                    private static int onExtraCallback = 1;
                                                    private static int onWarmupCompleted;

                                                    public final Object invoke(Object obj21) {
                                                        int i38 = 2 % 2;
                                                        int i39 = onWarmupCompleted + 117;
                                                        onExtraCallback = i39 % 128;
                                                        int i40 = i39 % 2;
                                                        CreditHomeViewModel creditHomeViewModel2 = creditHomeViewModel;
                                                        CreditHomeHeaderResponse creditHomeHeaderResponse = (CreditHomeHeaderResponse) obj21;
                                                        if (i40 != 0) {
                                                            return StackTraceInfo.onExtraCallback(creditHomeViewModel2, creditHomeHeaderResponse);
                                                        }
                                                        StackTraceInfo.onExtraCallback(creditHomeViewModel2, creditHomeHeaderResponse);
                                                        throw null;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function124);
                                                obj20 = function124;
                                            }
                                            Function1 function125 = (Function1) obj20;
                                            boolean z56 = i9 == 4;
                                            i11 = i8;
                                            int i38 = i11 & 7168;
                                            boolean z57 = i38 == 2048;
                                            Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if ((z56 || z57) || objOnMinimized22 == onwarmupcompleted.onExtraCallback()) {
                                                function18 = function17;
                                                Function2 function24 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda15
                                                    private static int onExtraCallback = 0;
                                                    private static int onNavigationEvent = 1;

                                                    public final Object invoke(Object obj21, Object obj22) {
                                                        int i39 = 2 % 2;
                                                        int i40 = onNavigationEvent + 91;
                                                        onExtraCallback = i40 % 128;
                                                        int i41 = i40 % 2;
                                                        Unit unitOnExtraCallback = StackTraceInfo.onExtraCallback(creditHomeViewModel, function18, (CreditHomeHeaderItem) obj21, ((Integer) obj22).intValue());
                                                        int i42 = onNavigationEvent + 113;
                                                        onExtraCallback = i42 % 128;
                                                        int i43 = i42 % 2;
                                                        return unitOnExtraCallback;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function24);
                                                obj4 = function24;
                                            } else {
                                                function18 = function17;
                                                obj4 = objOnMinimized22;
                                            }
                                            Function2 function25 = (Function2) obj4;
                                            i10 = i7;
                                            boolean z58 = i9 == 4;
                                            if (i10 == 536870912) {
                                                z18 = z15;
                                                z19 = true;
                                            } else {
                                                z18 = z15;
                                                z19 = false;
                                            }
                                            boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z18);
                                            Object objOnMinimized23 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (((z58 | z19) || zOnExtraCallback10) || objOnMinimized23 == onwarmupcompleted.onExtraCallback()) {
                                                str6 = str5;
                                                Function1 function126 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda16
                                                    private static int onExtraCallbackWithResult = 0;
                                                    private static int onWarmupCompleted = 1;

                                                    public final Object invoke(Object obj21) {
                                                        int i39 = 2 % 2;
                                                        int i40 = onExtraCallbackWithResult + 107;
                                                        onWarmupCompleted = i40 % 128;
                                                        int i41 = i40 % 2;
                                                        CreditHomeViewModel creditHomeViewModel2 = creditHomeViewModel;
                                                        String str16 = str6;
                                                        Boolean boolValueOf = Boolean.valueOf(z18);
                                                        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                                                        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                                                        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
                                                        Unit unit = (Unit) StackTraceInfo.onWarmupCompleted(-972950576, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{creditHomeViewModel2, str16, boolValueOf, (CreditHomeLargeBannerResponse) obj21}, 972950603, iIAuthTabCallback3);
                                                        int i42 = onWarmupCompleted + 53;
                                                        onExtraCallbackWithResult = i42 % 128;
                                                        int i43 = i42 % 2;
                                                        return unit;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function126);
                                                obj5 = function126;
                                            } else {
                                                str6 = str5;
                                                obj5 = objOnMinimized23;
                                            }
                                            Function1 function127 = (Function1) obj5;
                                            boolean z59 = i9 == 4;
                                            boolean z60 = i10 == 536870912;
                                            boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z18);
                                            boolean z61 = i38 == 2048;
                                            Object objOnMinimized24 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (!(z61 | z59 | z60 | zOnExtraCallback11)) {
                                                Object obj21 = objOnMinimized24;
                                                if (objOnMinimized24 == onwarmupcompleted.onExtraCallback()) {
                                                    Function1 function128 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda18
                                                        private static int onExtraCallbackWithResult = 1;
                                                        private static int onWarmupCompleted;

                                                        public final Object invoke(Object obj22) {
                                                            int i39 = 2 % 2;
                                                            int i40 = onWarmupCompleted + 105;
                                                            onExtraCallbackWithResult = i40 % 128;
                                                            if (i40 % 2 == 0) {
                                                                StackTraceInfo.onExtraCallback(creditHomeViewModel, function18, str6, z18, (CreditHomeLargeBannerResponse) obj22);
                                                                throw null;
                                                            }
                                                            Unit unitOnExtraCallback = StackTraceInfo.onExtraCallback(creditHomeViewModel, function18, str6, z18, (CreditHomeLargeBannerResponse) obj22);
                                                            int i41 = onWarmupCompleted + 113;
                                                            onExtraCallbackWithResult = i41 % 128;
                                                            int i42 = i41 % 2;
                                                            return unitOnExtraCallback;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function128);
                                                    obj21 = function128;
                                                }
                                                printVisualizationLog.onWarmupCompleted(creditHomeHeaderResponseOnTransact6, creditHomeLargeBannerResponseAsInterface10, zIAuthTabCallbackStubProxy2, function019, function125, function25, function127, (Function1) obj21, liteprocesshandlerthreadopt3.getInterfaceDescriptor(), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                                                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport04, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                            }
                                        }
                                    }
                                }
                                CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface11 = liteprocesshandlerthreadopt3.asInterface();
                                CreditHomeLargeBannerType creditHomeLargeBannerType9 = creditHomeLargeBannerResponseAsInterface11 != null ? (CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponseAsInterface11}, zzgsa.onWarmupCompleted()) : null;
                                CreditHomeLargeBannerType creditHomeLargeBannerType10 = CreditHomeLargeBannerType.NONE;
                                if (creditHomeLargeBannerType9 != creditHomeLargeBannerType10) {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1820757953);
                                    onExtraCallbackWithResult(liteprocesshandlerthreadopt3, function15, function03, function02, cameraCaptureResultEmptyCameraCaptureResult, ((i11 >> 18) & 112) | (i23 & 896) | ((i11 >> 6) & 7168));
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1820615725);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                }
                                if (zOnExtraCallback2) {
                                    creditHomeLargeBannerType4 = creditHomeLargeBannerType10;
                                    str7 = str6;
                                    num6 = num5;
                                    i12 = i10;
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1820118733);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1820550222);
                                    liteProcessHandlerThreadOpt liteprocesshandlerthreadoptOnExtraCallback2 = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<liteProcessHandlerThreadOpt>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                                    MyQuizDetailsResponse myQuizDetailsResponse = liteprocesshandlerthreadoptOnExtraCallback2 != null ? (MyQuizDetailsResponse) liteProcessHandlerThreadOpt.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 615749290, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -615749289, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{liteprocesshandlerthreadoptOnExtraCallback2}) : null;
                                    liteProcessHandlerThreadOpt liteprocesshandlerthreadoptOnExtraCallback3 = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<liteProcessHandlerThreadOpt>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                                    creditHomeLargeBannerType4 = creditHomeLargeBannerType10;
                                    str7 = str6;
                                    num6 = num5;
                                    i12 = i10;
                                    onExtraCallbackWithResult(myQuizDetailsResponse, liteprocesshandlerthreadoptOnExtraCallback3 != null ? liteprocesshandlerthreadoptOnExtraCallback3.IAuthTabCallbackStub() : null, creditHomeViewModel, function18, false, cameraCaptureResultEmptyCameraCaptureResult, ((i11 << 6) & 896) | 24576 | (i11 & 7168), 0);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                }
                                List<liteProcessServerManagerOpt> listOnWarmupCompleted = liteprocesshandlerthreadopt3.onWarmupCompleted();
                                onUnavailable onunavailableICustomTabsCallback = liteprocesshandlerthreadopt3.ICustomTabsCallback();
                                CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface12 = liteprocesshandlerthreadopt3.asInterface();
                                if ((creditHomeLargeBannerResponseAsInterface12 != null ? (CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponseAsInterface12}, zzgsa.onWarmupCompleted()) : null) == creditHomeLargeBannerType4) {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1816661737);
                                    function19 = function15;
                                    liteprocesshandlerthreadopt4 = liteprocesshandlerthreadopt3;
                                    function04 = function03;
                                    final Function0 function020 = function02;
                                    Function2 function26 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda19
                                        private static int onExtraCallbackWithResult = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj22, Object obj23) {
                                            int i39 = 2 % 2;
                                            int i40 = onWarmupCompleted + 59;
                                            onExtraCallbackWithResult = i40 % 128;
                                            int i41 = i40 % 2;
                                            Unit unitOnExtraCallback = StackTraceInfo.onExtraCallback(liteprocesshandlerthreadopt4, function19, function04, function020, (CameraCaptureResultEmptyCameraCaptureResult) obj22, ((Integer) obj23).intValue());
                                            int i42 = onExtraCallbackWithResult + 33;
                                            onWarmupCompleted = i42 % 128;
                                            if (i42 % 2 == 0) {
                                                return unitOnExtraCallback;
                                            }
                                            Object obj24 = null;
                                            obj24.hashCode();
                                            throw null;
                                        }
                                    };
                                    z16 = true;
                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-665340552, true, function26, cameraCaptureResultEmptyCameraCaptureResult, 54);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                    encoderProfilesProxyVideoProfileProxy = encoderProfilesProxyVideoProfileProxyOnExtraCallback;
                                } else {
                                    function19 = function15;
                                    liteprocesshandlerthreadopt4 = liteprocesshandlerthreadopt3;
                                    function04 = function03;
                                    z16 = true;
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1816165489);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                    encoderProfilesProxyVideoProfileProxy = null;
                                }
                                if (zOnExtraCallback2) {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1815953325);
                                    liteprocesshandlerthreadopt5 = liteprocesshandlerthreadopt4;
                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-1741471533, z16, new Function2() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda20
                                        private static int onExtraCallback = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj22, Object obj23) throws NoWhenBranchMatchedException {
                                            int i39 = 2 % 2;
                                            int i40 = onWarmupCompleted + 81;
                                            onExtraCallback = i40 % 128;
                                            int i41 = i40 % 2;
                                            Unit unitIAuthTabCallback = StackTraceInfo.IAuthTabCallback(creditHomeViewModel, function18, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj22, ((Integer) obj23).intValue());
                                            int i42 = onWarmupCompleted + 53;
                                            onExtraCallback = i42 % 128;
                                            if (i42 % 2 == 0) {
                                                int i43 = 62 / 0;
                                            }
                                            return unitIAuthTabCallback;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResult, 54);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                    encoderProfilesProxyVideoProfileProxy2 = encoderProfilesProxyVideoProfileProxyOnExtraCallback2;
                                    i13 = 536870912;
                                } else {
                                    liteprocesshandlerthreadopt5 = liteprocesshandlerthreadopt4;
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1815391729);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                    i13 = 536870912;
                                    encoderProfilesProxyVideoProfileProxy2 = null;
                                }
                                boolean z62 = i12 == i13 ? z16 : false;
                                boolean z63 = i9 == 4 ? z16 : false;
                                int i39 = i11 & 7168;
                                Function1 function129 = function19;
                                boolean z64 = i39 == 2048;
                                Object objOnMinimized25 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (((z62 | z63) || z64) || objOnMinimized25 == onwarmupcompleted.onExtraCallback()) {
                                    str8 = str7;
                                    Function1 function130 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda21
                                        private static int onExtraCallback = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj22) {
                                            int i40 = 2 % 2;
                                            int i41 = onWarmupCompleted + 125;
                                            onExtraCallback = i41 % 128;
                                            int i42 = i41 % 2;
                                            Unit unitOnExtraCallbackWithResult = StackTraceInfo.onExtraCallbackWithResult(creditHomeViewModel, function18, str8, (onUnavailable) obj22);
                                            int i43 = onExtraCallback + 71;
                                            onWarmupCompleted = i43 % 128;
                                            if (i43 % 2 == 0) {
                                                return unitOnExtraCallbackWithResult;
                                            }
                                            Object obj23 = null;
                                            obj23.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function130);
                                    obj3 = function130;
                                } else {
                                    str8 = str7;
                                    obj3 = objOnMinimized25;
                                }
                                Function1 function131 = (Function1) obj3;
                                boolean z65 = i9 == 4;
                                Object objOnMinimized26 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!z65) {
                                    Object obj22 = objOnMinimized26;
                                    if (objOnMinimized26 == onwarmupcompleted.onExtraCallback()) {
                                        Function1 function132 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda22
                                            private static int onExtraCallbackWithResult = 0;
                                            private static int onNavigationEvent = 1;

                                            public final Object invoke(Object obj23) {
                                                int i40 = 2 % 2;
                                                int i41 = onNavigationEvent + 21;
                                                onExtraCallbackWithResult = i41 % 128;
                                                int i42 = i41 % 2;
                                                CreditHomeViewModel creditHomeViewModel2 = creditHomeViewModel;
                                                onUnavailable onunavailable = (onUnavailable) obj23;
                                                if (i42 == 0) {
                                                    int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                                                    int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                                                    int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
                                                    return (Unit) StackTraceInfo.onWarmupCompleted(137477108, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{creditHomeViewModel2, onunavailable}, -137477098, iIAuthTabCallback3);
                                                }
                                                int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
                                                int iIAuthTabCallback5 = R.drawable.IAuthTabCallback();
                                                int iIAuthTabCallback6 = R.drawable.IAuthTabCallback();
                                                Unit unit = (Unit) StackTraceInfo.onWarmupCompleted(137477108, iIAuthTabCallback4, iIAuthTabCallback5, R.drawable.IAuthTabCallback(), new Object[]{creditHomeViewModel2, onunavailable}, -137477098, iIAuthTabCallback6);
                                                int i43 = 56 / 0;
                                                return unit;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function132);
                                        obj22 = function132;
                                    }
                                    str = str8;
                                    function1 = function18;
                                    liteProcessHandlerThreadOpt liteprocesshandlerthreadopt8 = liteprocesshandlerthreadopt5;
                                    function12 = function129;
                                    function0 = function04;
                                    int i40 = i11;
                                    getDeviceStatus.onWarmupCompleted(new Object[]{listOnWarmupCompleted, function131, (Function1) obj22, encoderProfilesProxyVideoProfileProxy, Boolean.valueOf(zOnExtraCallback2), encoderProfilesProxyVideoProfileProxy2, onunavailableICustomTabsCallback, cameraCaptureResultEmptyCameraCaptureResult, 0, 0}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1507904486, -1507904484, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback());
                                    if (liteprocesshandlerthreadopt8.onExtraCallbackWithResult() != null) {
                                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1815240294);
                                        inventoryAdManager = inventoryAdManager2;
                                        getNetworkStatus.onExtraCallbackWithResult(liteprocesshandlerthreadopt8.onExtraCallbackWithResult(), inventoryAdManager, function1, cameraCaptureResultEmptyCameraCaptureResult, InventoryAdDto.Normal.$stable | (InventoryAdManager.onExtraCallbackWithResult << 3) | ((i40 >> 21) & 112) | ((i40 >> 3) & 896));
                                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                    } else {
                                        inventoryAdManager = inventoryAdManager2;
                                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1815001005);
                                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                    }
                                    onPageLoadError.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 152134227, new Object[]{cameraCaptureResultEmptyCameraCaptureResult, 0}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -152134227);
                                    obj = null;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(quirksExternalSyntheticBackport04, onextracallbackwithresult2.onTransact()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null);
                                    if (i9 == 4) {
                                        resources = resources2;
                                        z17 = true;
                                    } else {
                                        resources = resources2;
                                        z17 = false;
                                    }
                                    boolean zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(resources);
                                    Object objOnMinimized27 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!(z17 | zOnExtraCallback12)) {
                                        Object obj23 = objOnMinimized27;
                                        if (objOnMinimized27 == onwarmupcompleted.onExtraCallback()) {
                                            Function0 function021 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda23
                                                private static int onExtraCallbackWithResult = 1;
                                                private static int onNavigationEvent;

                                                public final Object invoke() {
                                                    int i41 = 2 % 2;
                                                    int i42 = onExtraCallbackWithResult + 87;
                                                    onNavigationEvent = i42 % 128;
                                                    int i43 = i42 % 2;
                                                    CreditHomeViewModel creditHomeViewModel2 = creditHomeViewModel;
                                                    if (i43 == 0) {
                                                        return StackTraceInfo.IAuthTabCallback(creditHomeViewModel2, resources);
                                                    }
                                                    StackTraceInfo.IAuthTabCallback(creditHomeViewModel2, resources);
                                                    Object obj24 = null;
                                                    obj24.hashCode();
                                                    throw null;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function021);
                                            obj23 = function021;
                                        }
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted8 = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, 0.0f, null, (Function0) obj23, cameraCaptureResultEmptyCameraCaptureResult, 0, 3);
                                        String strOnExtraCallback3 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.main.R.string.credit_consulting_banner_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
                                        getHumanReadableName gethumanreadablenameOnNavigationEvent = AppLovinPostbackService.onExtraCallbackWithResult.onNavigationEvent();
                                        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallbackOnExtraCallback = oExternalSyntheticLambda0.IAuthTabCallback.Companion.onExtraCallback();
                                        boolean z66 = i9 == 4;
                                        boolean zOnExtraCallback13 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(resources);
                                        boolean z67 = i39 == 2048;
                                        Object objOnMinimized28 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                        if (!(zOnExtraCallback13 | z66 | z67)) {
                                            Object obj24 = objOnMinimized28;
                                            if (objOnMinimized28 == onwarmupcompleted.onExtraCallback()) {
                                                Function0 function022 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda24
                                                    private static int onExtraCallback = 1;
                                                    private static int onNavigationEvent;

                                                    public final Object invoke() {
                                                        int i41 = 2 % 2;
                                                        int i42 = onNavigationEvent + 79;
                                                        onExtraCallback = i42 % 128;
                                                        int i43 = i42 % 2;
                                                        Unit unitOnExtraCallback = StackTraceInfo.onExtraCallback(creditHomeViewModel, function1, resources);
                                                        int i44 = onNavigationEvent + 83;
                                                        onExtraCallback = i44 % 128;
                                                        int i45 = i44 % 2;
                                                        return unitOnExtraCallback;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function022);
                                                obj24 = function022;
                                            }
                                            oExternalSyntheticLambda1.IAuthTabCallback(strOnExtraCallback3, quirksExternalSyntheticBackport0OnWarmupCompleted8, 0L, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, iAuthTabCallbackOnExtraCallback, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, gethumanreadablenameOnNavigationEvent, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0) obj24, (Role) null, (Function1) null, false, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 245484);
                                            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport04, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(80.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                            CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface13 = liteprocesshandlerthreadopt8.asInterface();
                                            if (creditHomeLargeBannerResponseAsInterface13 != null && appIdForPluginAndTinyApp.onExtraCallbackWithResult(creditHomeLargeBannerResponseAsInterface13) && zBooleanValue4) {
                                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1267319697);
                                                onWarmupCompleted(1405468134, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, num6, 0}, -1405468123, R.drawable.IAuthTabCallback());
                                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                            } else {
                                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1267465769);
                                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                            Unit unit = Unit.INSTANCE;
                                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface14 = liteprocesshandlerthreadoptOnExtraCallback.asInterface();
                        if (creditHomeLargeBannerResponseAsInterface14 != null) {
                            CreditHomeLargeBannerType creditHomeLargeBannerType11 = (CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponseAsInterface14}, zzgsa.onWarmupCompleted());
                            if (creditHomeLargeBannerType11 == null || !creditHomeLargeBannerType11.isCreditRecoveryType()) {
                            }
                            liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt3 = (liteTrackWatchDogHandlerThreadOpt) onWarmupCompleted(-1245651513, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult}, 1245651518, R.drawable.IAuthTabCallback());
                            if ((i15 & 896) == 256) {
                            }
                            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zIAuthTabCallback);
                            zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
                            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z4 | zOnExtraCallback | zOnNavigationEvent2) {
                                inventoryAdManager2 = inventoryAdManager3;
                                cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult;
                                function15 = function14;
                                function03 = function06;
                                num2 = num;
                                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport05;
                                z5 = zBooleanValue2;
                                z6 = zBooleanValue;
                                z7 = z26;
                                i2 = i3;
                                i4 = 6;
                                liteprocesshandlerthreadopt = liteprocesshandlerthreadoptOnExtraCallback;
                                function02 = function05;
                                onWarmupCompleted onwarmupcompleted22 = new onWarmupCompleted(zBooleanValue2, zIAuthTabCallback, cameraPresenceProviderExternalSyntheticLambda6, getsupportedhighspeedresolutionsfor, null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(onwarmupcompleted22);
                                objOnMinimized2 = onwarmupcompleted22;
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(litetrackwatchdoghandlerthreadopt3, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport062 = quirksExternalSyntheticBackport0;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport062, 0.0f, 1, (Object) null), onextracallbackwithresult2.IAuthTabCallback_Parcel());
                                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda122 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                                component5 component5VarOnNavigationEvent4 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda122.IAuthTabCallbackStub(), onextracallbackwithresult2.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                int iHashCode22 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted32 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted22);
                                Function0 function0IAuthTabCallback22 = onextracallbackwithresult3.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, component5VarOnNavigationEvent4, onextracallbackwithresult3.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22, onextracallbackwithresult3.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, Integer.valueOf(iHashCode22), onextracallbackwithresult3.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, onextracallbackwithresult3.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, quirksExternalSyntheticBackport0OnWarmupCompleted32, onextracallbackwithresult3.onTransact());
                                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport062, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4);
                                if (liteprocesshandlerthreadopt.extraCallbackWithResult()) {
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport062, 0.0f, 1, (Object) null);
                                component5 component5VarOnNavigationEvent22 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda122.IAuthTabCallbackStub(), onextracallbackwithresult2.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                                int iHashCode32 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject32 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted42 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback3);
                                Function0 function0IAuthTabCallback32 = onextracallbackwithresult3.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, component5VarOnNavigationEvent22, onextracallbackwithresult3.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject32, onextracallbackwithresult3.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, Integer.valueOf(iHashCode32), onextracallbackwithresult3.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, onextracallbackwithresult3.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, quirksExternalSyntheticBackport0OnWarmupCompleted42, onextracallbackwithresult3.onTransact());
                                if (liteprocesshandlerthreadopt.onExtraCallback() == null) {
                                }
                                boolean zIAuthTabCallback22 = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
                                getTime gettimeAsBinder2 = liteprocesshandlerthreadopt2.asBinder();
                                getTime gettimeIAuthTabCallbackStubProxy2 = liteprocesshandlerthreadopt2.IAuthTabCallbackStubProxy();
                                if (zOnExtraCallback2) {
                                    if (zOnExtraCallback2) {
                                        int i212 = 1879048192 & i15;
                                        if (i212 != 536870912) {
                                        }
                                        int i222 = i15 & 14;
                                        if (i222 != 4) {
                                        }
                                        Object objOnMinimized62 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (z8 | z9) {
                                        }
                                    }
                                }
                            }
                        }
                        int i41 = asInterface + 115;
                        onTransact = i41 % 128;
                        int i42 = i41 % 2;
                        z3 = false;
                        liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt32 = (liteTrackWatchDogHandlerThreadOpt) onWarmupCompleted(-1245651513, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult}, 1245651518, R.drawable.IAuthTabCallback());
                        if ((i15 & 896) == 256) {
                        }
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zIAuthTabCallback);
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (z4 | zOnExtraCallback | zOnNavigationEvent2) {
                        }
                    }
                } else {
                    num = 6;
                    i3 = iIntValue;
                }
                if (strIAuthTabCallback != null) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport052 = QuirksExternalSyntheticBackport0.Companion;
                    boolean z262 = z25;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport052, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onExtraCallbackWithResult(), (toMetersPerSecond) null, 2, (Object) null), 0.0f, 1, (Object) null);
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult22 = QuirkSettingsLoader.Companion;
                    component5 component5VarOnWarmupCompleted4 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult22.access100(), false);
                    int iHashCode7 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted9 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult32 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback7 = onextracallbackwithresult32.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, component5VarOnWarmupCompleted4, onextracallbackwithresult32.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject7, onextracallbackwithresult32.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, Integer.valueOf(iHashCode7), onextracallbackwithresult32.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, onextracallbackwithresult32.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, quirksExternalSyntheticBackport0OnWarmupCompleted9, onextracallbackwithresult32.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    }
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                    zOnNavigationEvent = onextracallbackwithresult.onNavigationEvent((String) liteProcessHandlerThreadOpt.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 46942577, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -46942575, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{liteprocesshandlerthreadoptOnExtraCallback}));
                    if (zOnExtraCallback2) {
                        if (zOnNavigationEvent) {
                        }
                    }
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            function1 = function110;
            function12 = function112;
            function0 = function06;
            i2 = iIntValue;
            function02 = function05;
            function13 = function111;
            str = str9;
            z = zBooleanValue2;
            z2 = zBooleanValue;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            inventoryAdManager = inventoryAdManager3;
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            return obj;
        }
        final boolean z68 = z2;
        final boolean z69 = z;
        final Function1 function133 = function1;
        final Function1 function134 = function13;
        final Function0 function023 = function02;
        Object obj25 = obj;
        final Function0 function024 = function0;
        final InventoryAdManager inventoryAdManager4 = inventoryAdManager;
        final Function1 function135 = function12;
        final String str16 = str;
        final int i43 = i2;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda25
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj26, Object obj27) throws Throwable {
                int i44 = 2 % 2;
                int i45 = onWarmupCompleted + 17;
                onExtraCallbackWithResult = i45 % 128;
                int i46 = i45 % 2;
                Unit unitIAuthTabCallback = StackTraceInfo.IAuthTabCallback(creditHomeViewModel, z68, z69, function133, function134, function023, function024, function135, inventoryAdManager4, str16, i43, (CameraCaptureResultEmptyCameraCaptureResult) obj26, ((Integer) obj27).intValue());
                int i47 = onWarmupCompleted + 17;
                onExtraCallbackWithResult = i47 % 128;
                int i48 = i47 % 2;
                return unitIAuthTabCallback;
            }
        });
        return obj25;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01da A[PHI: r2
      0x01da: PHI (r2v28 im.toss.features.credit.data.response.CreditHomeLargeBannerResponse$DualRowContents$RowItem) = 
      (r2v27 im.toss.features.credit.data.response.CreditHomeLargeBannerResponse$DualRowContents$RowItem)
      (r2v35 im.toss.features.credit.data.response.CreditHomeLargeBannerResponse$DualRowContents$RowItem)
     binds: [B:40:0x01d8, B:37:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onTransact(String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, SetDetectableSize setDetectableSize) throws Throwable {
        Object objOnNavigationEvent;
        String strOnExtraCallbackWithResult;
        Object objIAuthTabCallback;
        CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult;
        String strIAuthTabCallback;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 121), (byte) (KeyEvent.getMaxKeyCode() >> 16), 823844552 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") - 89321979, (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 115, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("banner_type", ((CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{liteprocesshandlerthreadopt.asInterface()}, zzgsa.onWarmupCompleted())).name());
        setDetectableSize.onExtraCallback("log_type", liteprocesshandlerthreadopt.asInterface().asInterface());
        CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents = (CreditHomeLargeBannerResponse.DualCtaContents) CreditHomeLargeBannerResponse.onNavigationEvent(-1313771003, zzgsa.onWarmupCompleted(), 1313771004, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{liteprocesshandlerthreadopt.asInterface()}, zzgsa.onWarmupCompleted());
        if (dualCtaContents != null) {
            Object[] objArr2 = new Object[1];
            a((short) ((-101) - View.resolveSize(0, 0)), (byte) View.combineMeasuredStates(0, 0), Gravity.getAbsoluteGravity(0, 0) + 823844547, (-89321978) - Process.getGidForName(""), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 115, objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), dualCtaContents.onTransact());
            setDetectableSize.onExtraCallback("sub_title", dualCtaContents.IAuthTabCallbackDefault());
            CreditHomeLargeBannerResponse.DualCtaContents.CtaButton ctaButtonIAuthTabCallback = dualCtaContents.IAuthTabCallback();
            if (ctaButtonIAuthTabCallback != null) {
                int i2 = onTransact + 79;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    objOnExtraCallbackWithResult = ctaButtonIAuthTabCallback.onExtraCallbackWithResult();
                    int i3 = 77 / 0;
                } else {
                    objOnExtraCallbackWithResult = ctaButtonIAuthTabCallback.onExtraCallbackWithResult();
                }
            } else {
                objOnExtraCallbackWithResult = null;
            }
            setDetectableSize.onExtraCallback("button_title_1", objOnExtraCallbackWithResult);
            CreditHomeLargeBannerResponse.DualCtaContents.CtaButton ctaButtonOnExtraCallback = dualCtaContents.onExtraCallback();
            setDetectableSize.onExtraCallback("button_title_2", ctaButtonOnExtraCallback != null ? ctaButtonOnExtraCallback.onExtraCallbackWithResult() : null);
        }
        CreditHomeLargeBannerResponse.DualRowContents dualRowContentsOnTransact = liteprocesshandlerthreadopt.asInterface().onTransact();
        if (dualRowContentsOnTransact != null) {
            int i4 = onTransact + 99;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr3 = new Object[1];
            a((short) (View.MeasureSpec.getSize(0) - 101), (byte) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf("", "", 0) + 823844547, (ViewConfiguration.getEdgeSlop() >> 16) - 89321977, (-115) - (ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
            setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), dualRowContentsOnTransact.IAuthTabCallback());
            CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult2 = dualRowContentsOnTransact.onExtraCallbackWithResult();
            if (rowItemOnExtraCallbackWithResult2 != null) {
                int i6 = asInterface + 97;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                objOnNavigationEvent = rowItemOnExtraCallbackWithResult2.onNavigationEvent();
            } else {
                objOnNavigationEvent = null;
            }
            setDetectableSize.onExtraCallback("button_title_1", objOnNavigationEvent);
            CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallback = dualRowContentsOnTransact.onExtraCallback();
            setDetectableSize.onExtraCallback("button_title_2", rowItemOnExtraCallback != null ? rowItemOnExtraCallback.onNavigationEvent() : null);
            CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult3 = dualRowContentsOnTransact.onExtraCallbackWithResult();
            if (rowItemOnExtraCallbackWithResult3 != null) {
                int i8 = onTransact + 27;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                strOnExtraCallbackWithResult = rowItemOnExtraCallbackWithResult3.onExtraCallbackWithResult();
            } else {
                strOnExtraCallbackWithResult = null;
            }
            if (strOnExtraCallbackWithResult == null || StringsKt.isBlank(strOnExtraCallbackWithResult)) {
                CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult4 = dualRowContentsOnTransact.onExtraCallbackWithResult();
                objIAuthTabCallback = rowItemOnExtraCallbackWithResult4 != null ? rowItemOnExtraCallbackWithResult4.IAuthTabCallback() : null;
            } else {
                int i10 = onTransact + 65;
                asInterface = i10 % 128;
                if (i10 % 2 == 0) {
                    rowItemOnExtraCallbackWithResult = dualRowContentsOnTransact.onExtraCallbackWithResult();
                    int i11 = 96 / 0;
                    if (rowItemOnExtraCallbackWithResult != null) {
                        strIAuthTabCallback = rowItemOnExtraCallbackWithResult.IAuthTabCallback();
                        int i12 = asInterface + 39;
                        onTransact = i12 % 128;
                        int i13 = i12 % 2;
                    } else {
                        int i14 = onTransact + 91;
                        asInterface = i14 % 128;
                        int i15 = i14 % 2;
                        strIAuthTabCallback = null;
                    }
                } else {
                    rowItemOnExtraCallbackWithResult = dualRowContentsOnTransact.onExtraCallbackWithResult();
                    if (rowItemOnExtraCallbackWithResult != null) {
                    }
                }
                CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallbackWithResult5 = dualRowContentsOnTransact.onExtraCallbackWithResult();
                objIAuthTabCallback = strIAuthTabCallback + "|" + (rowItemOnExtraCallbackWithResult5 != null ? rowItemOnExtraCallbackWithResult5.onExtraCallbackWithResult() : null);
            }
            setDetectableSize.onExtraCallback("button_value_1", objIAuthTabCallback);
            CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallback2 = dualRowContentsOnTransact.onExtraCallback();
            if ((rowItemOnExtraCallback2 != null ? rowItemOnExtraCallback2.onExtraCallbackWithResult() : null) == null || !(!StringsKt.isBlank(r1))) {
                CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallback3 = dualRowContentsOnTransact.onExtraCallback();
                if (rowItemOnExtraCallback3 != null) {
                    strIAuthTabCallback = rowItemOnExtraCallback3.IAuthTabCallback();
                }
            } else {
                CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallback4 = dualRowContentsOnTransact.onExtraCallback();
                String strIAuthTabCallback2 = rowItemOnExtraCallback4 != null ? rowItemOnExtraCallback4.IAuthTabCallback() : null;
                CreditHomeLargeBannerResponse.DualRowContents.RowItem rowItemOnExtraCallback5 = dualRowContentsOnTransact.onExtraCallback();
                strIAuthTabCallback = strIAuthTabCallback2 + "|" + (rowItemOnExtraCallback5 != null ? rowItemOnExtraCallback5.onExtraCallbackWithResult() : null);
            }
            setDetectableSize.onExtraCallback("button_value_2", strIAuthTabCallback);
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-121) - TextUtils.getOffsetAfter("", 0)), (byte) ((-16777216) - Color.rgb(0, 0, 0)), 823844552 - (ViewConfiguration.getPressedStateDuration() >> 16), 3541 + AndroidCharacter.getMirror('0'), (ViewConfiguration.getWindowTouchSlop() >> 8) - 115, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        onExtraCallbackWithResult(setDetectableSize, liteprocesshandlerthreadopt.asInterface());
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 87;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(final liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, CreditHomeViewModel creditHomeViewModel, final String str, boolean z) throws Throwable {
        String strName;
        int i = 2 % 2;
        int i2 = asInterface + 101;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 74 / 0;
            if (z) {
                CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface = liteprocesshandlerthreadopt.asInterface();
                if (creditHomeLargeBannerResponseAsInterface != null) {
                    int i4 = onTransact + 17;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                    int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
                    CreditHomeLargeBannerType creditHomeLargeBannerType = (CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, iOnWarmupCompleted2, zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponseAsInterface}, iOnWarmupCompleted);
                    if (creditHomeLargeBannerType != null) {
                        int i6 = onTransact + 97;
                        asInterface = i6 % 128;
                        if (i6 % 2 != 0 ? !creditHomeLargeBannerType.isCreditRecoveryType() : creditHomeLargeBannerType.isCreditRecoveryType()) {
                            CreditHomeLargeBannerResponse creditHomeLargeBannerResponseAsInterface2 = liteprocesshandlerthreadopt.asInterface();
                            if (creditHomeLargeBannerResponseAsInterface2 != null) {
                                int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
                                int iOnWarmupCompleted4 = zzgsa.onWarmupCompleted();
                                CreditHomeLargeBannerType creditHomeLargeBannerType2 = (CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, iOnWarmupCompleted4, zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponseAsInterface2}, iOnWarmupCompleted3);
                                if (creditHomeLargeBannerType2 != null) {
                                    int i7 = onTransact + 13;
                                    asInterface = i7 % 128;
                                    int i8 = i7 % 2;
                                    strName = creditHomeLargeBannerType2.name();
                                } else {
                                    strName = null;
                                }
                                CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1347749L, strName, false, true, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda51
                                    private static int onExtraCallbackWithResult = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj) throws Throwable {
                                        int i9 = 2 % 2;
                                        int i10 = onNavigationEvent + 67;
                                        onExtraCallbackWithResult = i10 % 128;
                                        int i11 = i10 % 2;
                                        Unit unitOnNavigationEvent = StackTraceInfo.onNavigationEvent(str, liteprocesshandlerthreadopt, (SetDetectableSize) obj);
                                        int i12 = onExtraCallbackWithResult + 87;
                                        onNavigationEvent = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            int i13 = 53 / 0;
                                        }
                                        return unitOnNavigationEvent;
                                    }
                                }, 4, (Object) null);
                            }
                        } else {
                            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1652768L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda50
                                private static int onExtraCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj) {
                                    int i9 = 2 % 2;
                                    int i10 = onExtraCallback + 51;
                                    onExtraCallbackWithResult = i10 % 128;
                                    int i11 = i10 % 2;
                                    String str2 = str;
                                    if (i11 != 0) {
                                        Object[] objArr = {str2, liteprocesshandlerthreadopt, (SetDetectableSize) obj};
                                        return (Unit) StackTraceInfo.onWarmupCompleted(-1627953565, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 1627953586, R.drawable.IAuthTabCallback());
                                    }
                                    Object[] objArr2 = {str2, liteprocesshandlerthreadopt, (SetDetectableSize) obj};
                                    throw null;
                                }
                            }, 14, null);
                            int i9 = asInterface + 47;
                            onTransact = i9 % 128;
                            int i10 = i9 % 2;
                        }
                    }
                }
            }
        } else if (z) {
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) (((Process.getThreadPriority(0) + 20) >> 6) - 121), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 823844553, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 89321980, (-115) - (Process.myPid() >> 22), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        onExtraCallbackWithResult(setDetectableSize, creditHomeLargeBannerResponse);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 27;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(CreditHomeViewModel creditHomeViewModel, Function1 function1, final String str, final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        onTransact = i2 % 128;
        String str2 = "";
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(creditHomeLargeBannerResponse, "");
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            ((CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, iOnWarmupCompleted2, zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponse}, iOnWarmupCompleted)).isCreditRecoveryType();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(creditHomeLargeBannerResponse, "");
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted4 = zzgsa.onWarmupCompleted();
        if (!((CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, iOnWarmupCompleted4, zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponse}, iOnWarmupCompleted3)).isCreditRecoveryType()) {
            CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1347751L, (String) null, false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) throws Throwable {
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback + 21;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    Unit unitOnExtraCallback = StackTraceInfo.onExtraCallback(str, creditHomeLargeBannerResponse, (SetDetectableSize) obj2);
                    int i6 = onWarmupCompleted + 125;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 66 / 0;
                    }
                    return unitOnExtraCallback;
                }
            }, 6, (Object) null);
            CreditHomeLargeBannerResponse.Cta ctaOnWarmupCompleted = creditHomeLargeBannerResponse.onWarmupCompleted();
            if (ctaOnWarmupCompleted != null) {
                int i3 = asInterface + 87;
                onTransact = i3 % 128;
                if (i3 % 2 != 0) {
                    ctaOnWarmupCompleted.onWarmupCompleted();
                    obj.hashCode();
                    throw null;
                }
                String strOnWarmupCompleted = ctaOnWarmupCompleted.onWarmupCompleted();
                if (strOnWarmupCompleted != null) {
                    str2 = strOnWarmupCompleted;
                }
            }
            function1.invoke(str2);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(CreditHomeViewModel creditHomeViewModel) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        creditHomeViewModel.ICustomTabsCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(CreditHomeViewModel creditHomeViewModel) {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        creditHomeViewModel.readTypedObject();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 49;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return unit;
    }

    private static final Unit asBinder(CreditHomeHeaderItem creditHomeHeaderItem, int i, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-53) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 823844543 - TextUtils.getOffsetAfter("", 0), (-89321977) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (-115) - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditHomeHeaderItem.IAuthTabCallbackDefault());
        Object[] objArr2 = new Object[1];
        a((short) (Drawable.resolveOpacity(0, 0) - 101), (byte) TextUtils.getOffsetAfter("", 0), 823844546 - ImageFormat.getBitsPerPixel(0), (-89321977) - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) - 115, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), creditHomeHeaderItem.asInterface());
        setDetectableSize.onExtraCallback("sub_title", creditHomeHeaderItem.onWarmupCompleted());
        setDetectableSize.onExtraCallback("order", Integer.valueOf(i + 1));
        String lowerCase = creditHomeHeaderItem.IAuthTabCallbackStubProxy().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        setDetectableSize.onExtraCallback("sub_type", lowerCase);
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 15;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(CreditHomeViewModel creditHomeViewModel, CreditHomeHeaderResponse creditHomeHeaderResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(creditHomeHeaderResponse, "");
        final int i4 = 0;
        for (Object obj : creditHomeHeaderResponse.IAuthTabCallback()) {
            if (i4 < 0) {
                int i5 = onTransact + 81;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                CollectionsKt.throwIndexOverflow();
            }
            final CreditHomeHeaderItem creditHomeHeaderItem = (CreditHomeHeaderItem) obj;
            CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1236665L, creditHomeHeaderItem.IAuthTabCallbackDefault() + "_" + i4, false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda52
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2) throws Throwable {
                    Unit unitIAuthTabCallbackDefault;
                    int i7 = 2 % 2;
                    int i8 = onExtraCallbackWithResult + 51;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 != 0) {
                        unitIAuthTabCallbackDefault = StackTraceInfo.IAuthTabCallbackDefault(creditHomeHeaderItem, i4, (SetDetectableSize) obj2);
                        int i9 = 27 / 0;
                    } else {
                        unitIAuthTabCallbackDefault = StackTraceInfo.IAuthTabCallbackDefault(creditHomeHeaderItem, i4, (SetDetectableSize) obj2);
                    }
                    int i10 = onNavigationEvent + 35;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return unitIAuthTabCallbackDefault;
                }
            }, 12, (Object) null);
            i4++;
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onTransact + 57;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit asInterface(CreditHomeHeaderItem creditHomeHeaderItem, int i, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 115;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-53) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 823844543, (-89321978) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-116) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditHomeHeaderItem.IAuthTabCallbackDefault());
        Object[] objArr2 = new Object[1];
        a((short) ((-101) - (ViewConfiguration.getTouchSlop() >> 8)), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 823844547, (-89321977) - Color.argb(0, 0, 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 115, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), creditHomeHeaderItem.asInterface());
        setDetectableSize.onExtraCallback("sub_title", creditHomeHeaderItem.onWarmupCompleted());
        setDetectableSize.onExtraCallback("order", Integer.valueOf(i + 1));
        String lowerCase = creditHomeHeaderItem.IAuthTabCallbackStubProxy().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        setDetectableSize.onExtraCallback("sub_type", lowerCase);
        Unit unit = Unit.INSTANCE;
        int i5 = asInterface + 87;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(CreditHomeViewModel creditHomeViewModel, Function1 function1, final CreditHomeHeaderItem creditHomeHeaderItem, final int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1213869L, creditHomeHeaderItem.IAuthTabCallbackDefault(), false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda38
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) throws Throwable {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 117;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                CreditHomeHeaderItem creditHomeHeaderItem2 = creditHomeHeaderItem;
                if (i5 != 0) {
                    return StackTraceInfo.onExtraCallback(creditHomeHeaderItem2, i, (SetDetectableSize) obj);
                }
                Unit unitOnExtraCallback = StackTraceInfo.onExtraCallback(creditHomeHeaderItem2, i, (SetDetectableSize) obj);
                int i6 = 39 / 0;
                return unitOnExtraCallback;
            }
        }, 4, (Object) null);
        function1.invoke(creditHomeHeaderItem.IAuthTabCallbackStub());
        Unit unit = Unit.INSTANCE;
        int i3 = asInterface + 9;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) - 121), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Color.argb(0, 0, 0, 0) + 823844552, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 89321979, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 116, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("banner_type", creditHomeLargeBannerResponse.asInterface());
        IAuthTabCallback(setDetectableSize, creditHomeLargeBannerResponse, z);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 51;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(CreditHomeViewModel creditHomeViewModel, final String str, final boolean z, final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(creditHomeLargeBannerResponse, "");
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1347749L, ((CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, iOnWarmupCompleted2, zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponse}, iOnWarmupCompleted)).name(), false, true, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda37
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 73;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String str2 = str;
                if (i4 != 0) {
                    return StackTraceInfo.onWarmupCompleted(str2, creditHomeLargeBannerResponse, z, (SetDetectableSize) obj);
                }
                Unit unitOnWarmupCompleted = StackTraceInfo.onWarmupCompleted(str2, creditHomeLargeBannerResponse, z, (SetDetectableSize) obj);
                int i5 = 25 / 0;
                return unitOnWarmupCompleted;
            }
        }, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 41;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asBinder(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) (((byte) KeyEvent.getModifierMetaStateMask()) - 120), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 840621768 + Color.rgb(0, 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 89321980, (ViewConfiguration.getScrollDefaultDelay() >> 16) - 115, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("banner_type", creditHomeLargeBannerResponse.asInterface());
        IAuthTabCallback(setDetectableSize, creditHomeLargeBannerResponse, z);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 41;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(CreditHomeViewModel creditHomeViewModel, Function1 function1, final String str, final boolean z, final CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        int i = 2 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(creditHomeLargeBannerResponse, "");
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1347751L, (String) null, false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda36
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 105;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str3 = str;
                if (i4 == 0) {
                    CreditHomeLargeBannerResponse creditHomeLargeBannerResponse2 = creditHomeLargeBannerResponse;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                    int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                    int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
                    return (Unit) StackTraceInfo.onWarmupCompleted(-1890644561, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{str3, creditHomeLargeBannerResponse2, boolValueOf, (SetDetectableSize) obj}, 1890644569, iIAuthTabCallback3);
                }
                CreditHomeLargeBannerResponse creditHomeLargeBannerResponse3 = creditHomeLargeBannerResponse;
                Boolean boolValueOf2 = Boolean.valueOf(z);
                int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
                int iIAuthTabCallback5 = R.drawable.IAuthTabCallback();
                int iIAuthTabCallback6 = R.drawable.IAuthTabCallback();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 6, (Object) null);
        CreditHomeLargeBannerResponse.Cta ctaOnWarmupCompleted = creditHomeLargeBannerResponse.onWarmupCompleted();
        if (ctaOnWarmupCompleted != null) {
            int i2 = onTransact + 7;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                ctaOnWarmupCompleted.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strOnWarmupCompleted = ctaOnWarmupCompleted.onWarmupCompleted();
            if (strOnWarmupCompleted == null) {
                int i3 = onTransact + 81;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
            } else {
                str2 = strOnWarmupCompleted;
            }
        }
        function1.invoke(str2);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-121) - Color.argb(0, 0, 0, 0)), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 823844552 - ((Process.getThreadPriority(0) + 20) >> 6), (-89321980) - TextUtils.lastIndexOf("", '0'), (-115) - TextUtils.indexOf("", ""), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("service_home", "credit_home");
        setDetectableSize.onExtraCallback("menu_entry_id", 11001883);
        setDetectableSize.onExtraCallback("service_home_menu_entry_id", 11001514);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 53;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(onUnavailable onunavailable, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) (Drawable.resolveOpacity(0, 0) - 101), (byte) KeyEvent.normalizeMetaState(0), 823844547 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-89321977) - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf("", "") - 115, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), onunavailable.access100());
        if (onunavailable.onExtraCallbackWithResult() != null && (!StringsKt.isBlank(r4))) {
            setDetectableSize.onExtraCallback("sub_title", onunavailable.onExtraCallbackWithResult());
            int i2 = asInterface + 49;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 2;
            }
        }
        if (!StringsKt.isBlank(onunavailable.asBinder())) {
            Object[] objArr2 = new Object[1];
            a((short) (View.getDefaultSize(0, 0) - 54), (byte) Color.blue(0), 823844543 + (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-89321977) - View.MeasureSpec.getMode(0), Color.blue(0) - 115, objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), onunavailable.asBinder());
        }
        if (Intrinsics.areEqual(onunavailable.asBinder(), "credit_my_info_detail")) {
            int i4 = onTransact + 33;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
            if (((String) onUnavailable.onExtraCallbackWithResult(1430561057, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onunavailable}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1430561056)) != null) {
                int i6 = asInterface + 91;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                if (!StringsKt.isBlank(r4)) {
                    int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = zzgc.onExtraCallbackWithResult();
                    setDetectableSize.onExtraCallback("repayment_dday", (String) onUnavailable.onExtraCallbackWithResult(1430561057, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onunavailable}, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, -1430561056));
                }
            }
        }
        Map mapOnWarmupCompleted = onunavailable.onWarmupCompleted();
        if (mapOnWarmupCompleted != null) {
            int i8 = asInterface + 55;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            Iterator it = mapOnWarmupCompleted.entrySet().iterator();
            int i10 = asInterface + 71;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            while (!(!it.hasNext())) {
                Map.Entry entry = (Map.Entry) it.next();
                setDetectableSize.onExtraCallback((String) entry.getKey(), entry.getValue());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(CreditHomeViewModel creditHomeViewModel, Function1 function1, final String str, final onUnavailable onunavailable) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onunavailable, "");
        if (Intrinsics.areEqual(onunavailable.asBinder(), "mission")) {
            ConvertByteArrayToFloatArray.onExtraCallback(1285163L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda64
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj) throws Throwable {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 81;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnExtraCallbackWithResult = StackTraceInfo.onExtraCallbackWithResult(str, (SetDetectableSize) obj);
                    int i5 = onExtraCallback + 19;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, 14, null);
            int i2 = onTransact + 83;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        }
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1213869L, (String) null, false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda65
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) throws Throwable {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 75;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                Unit unitOnExtraCallbackWithResult = StackTraceInfo.onExtraCallbackWithResult(onunavailable, (SetDetectableSize) obj);
                int i7 = onExtraCallback + 47;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 6, (Object) null);
        String strOnTransact = onunavailable.onTransact();
        if (strOnTransact != null) {
            int i4 = asInterface + 85;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 24 / 0;
                if (!StringsKt.isBlank(strOnTransact)) {
                    String strOnTransact2 = onunavailable.onTransact();
                    function1.invoke(strOnTransact2 != null ? strOnTransact2 : "");
                    int i6 = asInterface + 81;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                }
            } else if (!StringsKt.isBlank(strOnTransact)) {
            }
        }
        onunavailable.IAuthTabCallbackStubProxy().invoke();
        Unit unit = Unit.INSTANCE;
        int i8 = onTransact + 117;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 51 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(onUnavailable onunavailable, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        if (!StringsKt.isBlank(onunavailable.asBinder())) {
            Object[] objArr = new Object[1];
            a((short) ((-53) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (byte) View.getDefaultSize(0, 0), 823844543 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-89321977) - View.getDefaultSize(0, 0), (-116) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), onunavailable.asBinder());
        }
        Object[] objArr2 = new Object[1];
        a((short) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 101), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 807067331 - Color.rgb(0, 0, 0), (KeyEvent.getMaxKeyCode() >> 16) - 89321977, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 114, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), onunavailable.access100());
        if (onunavailable.onExtraCallbackWithResult() != null) {
            int i2 = asInterface + 81;
            onTransact = i2 % 128;
            if (i2 % 2 == 0 ? (!StringsKt.isBlank(r1)) : !(!StringsKt.isBlank(r1))) {
                setDetectableSize.onExtraCallback("sub_title", onunavailable.onExtraCallbackWithResult());
            }
        }
        if (Intrinsics.areEqual(onunavailable.asBinder(), "credit_my_info_detail")) {
            int i3 = asInterface + 21;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
                throw null;
            }
            int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = zzgc.onExtraCallbackWithResult();
            String str = (String) onUnavailable.onExtraCallbackWithResult(1430561057, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onunavailable}, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, -1430561056);
            if (str != null) {
                int i4 = onTransact + 63;
                asInterface = i4 % 128;
                if (i4 % 2 != 0 ? (!StringsKt.isBlank(str)) : !StringsKt.isBlank(str)) {
                    int iOnExtraCallbackWithResult5 = zzgc.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult6 = zzgc.onExtraCallbackWithResult();
                    setDetectableSize.onExtraCallback("repayment_dday", (String) onUnavailable.onExtraCallbackWithResult(1430561057, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onunavailable}, iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5, -1430561056));
                }
            }
        }
        Map mapOnWarmupCompleted = onunavailable.onWarmupCompleted();
        if (mapOnWarmupCompleted != null) {
            int i5 = asInterface + 79;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            for (Map.Entry entry : mapOnWarmupCompleted.entrySet()) {
                int i7 = onTransact + 9;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                setDetectableSize.onExtraCallback((String) entry.getKey(), entry.getValue());
                int i9 = asInterface + 27;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(CreditHomeViewModel creditHomeViewModel, final onUnavailable onunavailable) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onunavailable, "");
        if (!Intrinsics.areEqual(onunavailable.asBinder(), "mission")) {
            CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1236665L, onunavailable.asBinder(), false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda4
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 23;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr = {onunavailable, (SetDetectableSize) obj};
                    Unit unit = (Unit) StackTraceInfo.onWarmupCompleted(1685534891, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -1685534873, R.drawable.IAuthTabCallback());
                    int i7 = onExtraCallback + 33;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    return unit;
                }
            }, 12, (Object) null);
        } else {
            int i4 = asInterface + 9;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            String strAccess100 = onunavailable.access100();
            creditHomeViewModel.IAuthTabCallback(strAccess100 != null ? strAccess100 : "");
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, Function1 function1, Function0 function0, Function0 function02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact + 109;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 37;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = i4 + 59;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i10 = onTransact + 25;
            asInterface = i10 % 128;
            if (i10 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-665340552, i, -1, "im.toss.feature.credit.ui.main.home.CreditHomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditHomeScreen.kt:547)");
            }
            onExtraCallbackWithResult(liteprocesshandlerthreadopt, function1, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(CreditHomeViewModel creditHomeViewModel, Function1 function1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        MyQuizDetailsResponse myQuizDetailsResponse;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = asInterface;
            int i4 = i3 + 63;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 33;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onTransact + 63;
            asInterface = i8 % 128;
            enableAppModelOpt enableappmodeloptIAuthTabCallbackStub = null;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                enableappmodeloptIAuthTabCallbackStub.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1741471533, i, -1, "im.toss.feature.credit.ui.main.home.CreditHomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditHomeScreen.kt:560)");
            }
            liteProcessHandlerThreadOpt liteprocesshandlerthreadoptOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<liteProcessHandlerThreadOpt>) cameraPresenceProviderExternalSyntheticLambda6);
            if (liteprocesshandlerthreadoptOnExtraCallback != null) {
                int i9 = asInterface + 85;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                myQuizDetailsResponse = (MyQuizDetailsResponse) liteProcessHandlerThreadOpt.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 615749290, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -615749289, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{liteprocesshandlerthreadoptOnExtraCallback});
            } else {
                myQuizDetailsResponse = null;
            }
            liteProcessHandlerThreadOpt liteprocesshandlerthreadoptOnExtraCallback2 = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<liteProcessHandlerThreadOpt>) cameraPresenceProviderExternalSyntheticLambda6);
            if (liteprocesshandlerthreadoptOnExtraCallback2 != null) {
                int i11 = onTransact + 23;
                asInterface = i11 % 128;
                if (i11 % 2 == 0) {
                    liteprocesshandlerthreadoptOnExtraCallback2.IAuthTabCallbackStub();
                    throw null;
                }
                enableappmodeloptIAuthTabCallbackStub = liteprocesshandlerthreadoptOnExtraCallback2.IAuthTabCallbackStub();
            }
            onExtraCallbackWithResult(myQuizDetailsResponse, enableappmodeloptIAuthTabCallbackStub, creditHomeViewModel, function1, true, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Resources resources, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-54) - Color.blue(0)), (byte) Color.alpha(0), 823844543 - TextUtils.getCapsMode("", 0, 0), AndroidCharacter.getMirror('0') - 61993, Color.red(0) - 115, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "credit_recovery");
        Object[] objArr2 = new Object[1];
        a((short) ((ViewConfiguration.getEdgeSlop() >> 16) - 101), (byte) (AndroidCharacter.getMirror('0') - '0'), 823844547 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-89321977) - (Process.myPid() >> 22), (-114) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), resources.getString(im.toss.feature.credit.ui.main.R.string.credit_consulting_banner_title));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 83;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(CreditHomeViewModel creditHomeViewModel, final Resources resources) {
        int i = 2 % 2;
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1236665L, "credit_recovery", false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda44
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 3;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = StackTraceInfo.onExtraCallbackWithResult(resources, (SetDetectableSize) obj);
                int i5 = onWarmupCompleted + 121;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        }, 12, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(Resources resources, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-54) - Color.red(0)), (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), 823844543 + (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.getTrimmedLength("") - 89321977, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 116, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "credit_recovery");
        Object[] objArr2 = new Object[1];
        a((short) ((ViewConfiguration.getScrollBarSize() >> 8) - 101), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), 823844548 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-89321977) - (KeyEvent.getMaxKeyCode() >> 16), Color.blue(0) - 115, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), resources.getString(im.toss.feature.credit.ui.main.R.string.credit_consulting_banner_title));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 59;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(CreditHomeViewModel creditHomeViewModel, Function1 function1, final Resources resources) {
        int i = 2 % 2;
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1213869L, (String) null, false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda75
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 1;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = StackTraceInfo.onNavigationEvent(resources, (SetDetectableSize) obj);
                int i5 = onWarmupCompleted + 29;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        }, 6, (Object) null);
        function1.invoke(h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult.onWarmupCompleted, false, "credit_main", true, null, 9, null));
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 23;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(getSharedPreferences getsharedpreferences, enableAppModelOpt enableappmodelopt, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) (ImageFormat.getBitsPerPixel(0) - 53), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 823844543, (-89321978) - ((byte) KeyEvent.getModifierMetaStateMask()), (-115) - (KeyEvent.getMaxKeyCode() >> 16), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), getsharedpreferences.onWarmupCompleted());
        Object[] objArr2 = new Object[1];
        a((short) ((-101) - View.combineMeasuredStates(0, 0)), (byte) (Process.myTid() >> 22), 823844547 - Color.blue(0), Color.alpha(0) - 89321977, (-116) - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), getsharedpreferences.onNavigationEvent());
        setDetectableSize.onExtraCallback("sub_title", getsharedpreferences.onExtraCallback());
        if (!(!Intrinsics.areEqual(getsharedpreferences.onWarmupCompleted(), "mission"))) {
            int i2 = asInterface + 117;
            int i3 = i2 % 128;
            onTransact = i3;
            Integer numOnWarmupCompleted = null;
            if (i2 % 2 != 0) {
                numOnWarmupCompleted.hashCode();
                throw null;
            }
            if (enableappmodelopt != null) {
                numOnWarmupCompleted = enableappmodelopt.onWarmupCompleted();
                int i4 = asInterface + 93;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = i3 + 93;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            }
            setDetectableSize.onExtraCallback("left_mission_cnt", numOnWarmupCompleted);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(CreditHomeViewModel creditHomeViewModel, final enableAppModelOpt enableappmodelopt, final getSharedPreferences getsharedpreferences) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getsharedpreferences, "");
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1236665L, getsharedpreferences.onNavigationEvent(), false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda57
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 63;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = StackTraceInfo.IAuthTabCallback(getsharedpreferences, enableappmodelopt, (SetDetectableSize) obj);
                int i5 = onExtraCallback + 65;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 16 / 0;
                }
                return unitIAuthTabCallback;
            }
        }, 12, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 33;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(getSharedPreferences getsharedpreferences, enableAppModelOpt enableappmodelopt, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-55) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), 823844543 + (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionGroup(0L) - 89321977, (-114) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), getsharedpreferences.onWarmupCompleted());
        Object[] objArr2 = new Object[1];
        a((short) ((-102) - Process.getGidForName("")), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 823844548 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-89321977) - KeyEvent.getDeadChar(0, 0), (-114) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), getsharedpreferences.onNavigationEvent());
        setDetectableSize.onExtraCallback("sub_title", getsharedpreferences.onExtraCallback());
        if (Intrinsics.areEqual(getsharedpreferences.onWarmupCompleted(), "mission")) {
            int i4 = onTransact + 73;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                num.hashCode();
                throw null;
            }
            setDetectableSize.onExtraCallback("left_mission_cnt", enableappmodelopt != null ? enableappmodelopt.onWarmupCompleted() : null);
            int i5 = asInterface + 9;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(CreditHomeViewModel creditHomeViewModel, Function1 function1, final enableAppModelOpt enableappmodelopt, final getSharedPreferences getsharedpreferences) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getsharedpreferences, "");
        CreditBaseViewModel.onExtraCallback(creditHomeViewModel, 1213869L, getsharedpreferences.onWarmupCompleted(), false, false, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda73
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 97;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    StackTraceInfo.onExtraCallbackWithResult(getsharedpreferences, enableappmodelopt, (SetDetectableSize) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = StackTraceInfo.onExtraCallbackWithResult(getsharedpreferences, enableappmodelopt, (SetDetectableSize) obj);
                int i4 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 14 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        }, 4, (Object) null);
        function1.invoke(getsharedpreferences.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final MyQuizDetailsResponse myQuizDetailsResponse, final enableAppModelOpt enableappmodelopt, final CreditHomeViewModel creditHomeViewModel, final Function1<? super String, Unit> function1, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        boolean z2;
        final boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean zAreEqual;
        boolean z4;
        List listIAuthTabCallbackStub;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-990903946);
        if ((i & 6) == 0) {
            int i6 = asInterface + 57;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(myQuizDetailsResponse);
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(myQuizDetailsResponse) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(enableappmodelopt) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(creditHomeViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i7 = asInterface + 29;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i8 = asInterface + 71;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        int i10 = i2 & 16;
        if (i10 == 0) {
            if ((i & 24576) == 0) {
                int i11 = onTransact + 107;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                z2 = z;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 16384 : 8192;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                int i13 = asInterface + 27;
                onTransact = i13 % 128;
                int i14 = i13 % 2;
                z3 = z2;
            } else {
                int i15 = onTransact + 71;
                asInterface = i15 % 128;
                int i16 = i15 % 2;
                boolean z5 = i10 != 0 ? false : z2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i17 = asInterface + 31;
                    onTransact = i17 % 128;
                    if (i17 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-990903946, i3, -1, "im.toss.feature.credit.ui.main.home.CreditHomeQuizSection (CreditHomeScreen.kt:625)");
                        int i18 = 28 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-990903946, i3, -1, "im.toss.feature.credit.ui.main.home.CreditHomeQuizSection (CreditHomeScreen.kt:625)");
                    }
                }
                if ((myQuizDetailsResponse == null || (listIAuthTabCallbackStub = myQuizDetailsResponse.IAuthTabCallbackStub()) == null || !(!listIAuthTabCallbackStub.isEmpty())) && enableappmodelopt != null) {
                    int i19 = onTransact + 15;
                    asInterface = i19 % 128;
                    if (i19 % 2 == 0) {
                        zAreEqual = Intrinsics.areEqual(enableappmodelopt.onNavigationEvent(), Boolean.TRUE);
                        int i20 = 15 / 0;
                    } else {
                        zAreEqual = Intrinsics.areEqual(enableappmodelopt.onNavigationEvent(), Boolean.TRUE);
                    }
                    if (zAreEqual) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-707545460);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-708853381);
                        int i21 = i3 & 896;
                        if (i21 == 256) {
                            int i22 = onTransact + 65;
                            asInterface = i22 % 128;
                            int i23 = i22 % 2;
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(enableappmodelopt);
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(z4 | zOnExtraCallback)) {
                            int i24 = onTransact + 95;
                            asInterface = i24 % 128;
                            if (i24 % 2 == 0) {
                                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                throw null;
                            }
                            Object obj = objOnMinimized;
                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                Function1 function12 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda46
                                    private static int IAuthTabCallback = 1;
                                    private static int onExtraCallbackWithResult;

                                    public final Object invoke(Object obj2) {
                                        int i25 = 2 % 2;
                                        int i26 = onExtraCallbackWithResult + 23;
                                        IAuthTabCallback = i26 % 128;
                                        int i27 = i26 % 2;
                                        Unit unitOnNavigationEvent = StackTraceInfo.onNavigationEvent(creditHomeViewModel, enableappmodelopt, (getSharedPreferences) obj2);
                                        int i28 = IAuthTabCallback + 75;
                                        onExtraCallbackWithResult = i28 % 128;
                                        int i29 = i28 % 2;
                                        return unitOnNavigationEvent;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function12);
                                obj = function12;
                            }
                            Function1 function13 = (Function1) obj;
                            boolean z6 = i21 == 256;
                            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(enableappmodelopt);
                            boolean z7 = (i3 & 7168) == 2048;
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if ((z6 | zOnExtraCallback2 | z7) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized2 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda47
                                    private static int onNavigationEvent = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj2) {
                                        int i25 = 2 % 2;
                                        int i26 = onNavigationEvent + 121;
                                        onWarmupCompleted = i26 % 128;
                                        int i27 = i26 % 2;
                                        CreditHomeViewModel creditHomeViewModel2 = creditHomeViewModel;
                                        if (i27 != 0) {
                                            return StackTraceInfo.IAuthTabCallback(creditHomeViewModel2, function1, enableappmodelopt, (getSharedPreferences) obj2);
                                        }
                                        Unit unitIAuthTabCallback = StackTraceInfo.IAuthTabCallback(creditHomeViewModel2, function1, enableappmodelopt, (getSharedPreferences) obj2);
                                        int i28 = 87 / 0;
                                        return unitIAuthTabCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            }
                            addObjToArray.IAuthTabCallback(myQuizDetailsResponse, enableappmodelopt, function13, (Function1) objOnMinimized2, z5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 57470, 0);
                            if (z5) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-707551412);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-707611955);
                                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    z3 = z5;
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda48
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i25 = 2 % 2;
                        int i26 = onNavigationEvent + 29;
                        onExtraCallback = i26 % 128;
                        int i27 = i26 % 2;
                        Unit unitOnExtraCallback = StackTraceInfo.onExtraCallback(myQuizDetailsResponse, enableappmodelopt, creditHomeViewModel, function1, z3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i28 = onNavigationEvent + 123;
                        onExtraCallback = i28 % 128;
                        if (i28 % 2 != 0) {
                            return unitOnExtraCallback;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        z2 = z;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onWarmupCompleted(Function1 function1, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (z) {
            function1.invoke(liteprocesshandlerthreadopt.IAuthTabCallbackDefault());
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 95;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(Function0 function0, onUnavailable onunavailable) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 33;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        Unit unit;
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            function0.invoke();
            unit = Unit.INSTANCE;
            int i3 = 32 / 0;
        } else {
            function0.invoke();
            unit = Unit.INSTANCE;
        }
        int i4 = asInterface + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, final Function1<? super onUnavailable, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(14590684);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(liteprocesshandlerthreadopt)) {
                int i5 = asInterface + 23;
                onTransact = i5 % 128;
                i3 = i5 % 2 != 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = onTransact + 103;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1);
                strAsBinder.hashCode();
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
            int i7 = asInterface + 103;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 / 3;
            }
        }
        if ((i & 384) == 0) {
            int i9 = onTransact + 69;
            asInterface = i9 % 128;
            if (i9 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0);
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 2048 : 1024;
        }
        int i10 = i2;
        boolean z3 = false;
        if ((i10 & 1171) != 1170) {
            int i11 = onTransact + 67;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i10 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i13 = onTransact + 11;
                asInterface = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(14590684, i10, -1, "im.toss.feature.credit.ui.main.home.CreditHomeIntelligence (CreditHomeScreen.kt:665)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            onUnavailable onunavailableIAuthTabCallbackDefault = liteprocesshandlerthreadopt.IAuthTabCallbackDefault();
            strAsBinder = onunavailableIAuthTabCallbackDefault != null ? onunavailableIAuthTabCallbackDefault.asBinder() : null;
            if ((i10 & 112) == 32) {
                int i15 = asInterface + 7;
                onTransact = i15 % 128;
                int i16 = i15 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(liteprocesshandlerthreadopt);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(z2 | zOnExtraCallback)) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function1 function12 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda69
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj3) {
                            int i17 = 2 % 2;
                            int i18 = IAuthTabCallback + 37;
                            onWarmupCompleted = i18 % 128;
                            int i19 = i18 % 2;
                            Object[] objArr = {function1, liteprocesshandlerthreadopt, Boolean.valueOf(((Boolean) obj3).booleanValue())};
                            Unit unit = (Unit) StackTraceInfo.onWarmupCompleted(-1298548653, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 1298548683, R.drawable.IAuthTabCallback());
                            int i20 = onWarmupCompleted + 81;
                            IAuthTabCallback = i20 % 128;
                            int i21 = i20 % 2;
                            return unit;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function12);
                    obj2 = function12;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageLoaderBuilderExternalSyntheticLambda1.IAuthTabCallback(onextracallback, 0.0f, strAsBinder, null, null, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 13);
                onUnavailable onunavailableIAuthTabCallbackDefault2 = liteprocesshandlerthreadopt.IAuthTabCallbackDefault();
                boolean z4 = (i10 & 896) == 256;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z4 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function1 function13 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda70
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj3) {
                            int i17 = 2 % 2;
                            int i18 = onExtraCallback + 21;
                            onNavigationEvent = i18 % 128;
                            int i19 = i18 % 2;
                            Object[] objArr = {function0, (onUnavailable) obj3};
                            Unit unit = (Unit) StackTraceInfo.onWarmupCompleted(-2041539430, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 2041539433, R.drawable.IAuthTabCallback());
                            int i20 = onNavigationEvent + 113;
                            onExtraCallback = i20 % 128;
                            if (i20 % 2 != 0) {
                                return unit;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function13);
                    obj = function13;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    obj = objOnMinimized2;
                }
                Function1 function14 = (Function1) obj;
                if ((i10 & 7168) == 2048) {
                    int i17 = onTransact + 25;
                    asInterface = i17 % 128;
                    int i18 = i17 % 2;
                    z3 = true;
                }
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!z3) {
                    Object obj3 = objOnMinimized3;
                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function1 function15 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda71
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj4) {
                                int i19 = 2 % 2;
                                int i20 = onNavigationEvent + 97;
                                IAuthTabCallback = i20 % 128;
                                int i21 = i20 % 2;
                                Unit unitOnExtraCallbackWithResult = StackTraceInfo.onExtraCallbackWithResult(function02, (onUnavailable) obj4);
                                int i22 = onNavigationEvent + 115;
                                IAuthTabCallback = i22 % 128;
                                if (i22 % 2 != 0) {
                                    return unitOnExtraCallbackWithResult;
                                }
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function15);
                        obj3 = function15;
                    }
                    getWebViewType.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback, onunavailableIAuthTabCallbackDefault2, (Function1<? super onUnavailable, Unit>) function14, (Function1<? super onUnavailable, Unit>) obj3, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda72
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj4, Object obj5) {
                    int i19 = 2 % 2;
                    int i20 = onExtraCallbackWithResult + 51;
                    onExtraCallback = i20 % 128;
                    int i21 = i20 % 2;
                    liteProcessHandlerThreadOpt liteprocesshandlerthreadopt2 = liteprocesshandlerthreadopt;
                    Function1 function16 = function1;
                    Function0 function03 = function0;
                    Function0 function04 = function02;
                    int i22 = i;
                    int iIntValue = ((Integer) obj5).intValue();
                    Object[] objArr = {liteprocesshandlerthreadopt2, function16, function03, function04, Integer.valueOf(i22), (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(iIntValue)};
                    Unit unit = (Unit) StackTraceInfo.onWarmupCompleted(899171872, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -899171853, R.drawable.IAuthTabCallback());
                    int i23 = onExtraCallback + 63;
                    onExtraCallbackWithResult = i23 % 128;
                    if (i23 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }
            });
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a((short) (ExpandableListView.getPackedPositionGroup(0L) + 41), (byte) KeyEvent.normalizeMetaState(0), 823844560 + (ViewConfiguration.getScrollDefaultDelay() >> 16), (-89321977) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') - 114, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        Object[] objArr3 = new Object[1];
        a((short) ((-121) - TextUtils.getTrimmedLength("")), (byte) TextUtils.indexOf("", ""), 823844552 + (ViewConfiguration.getFadingEdgeLength() >> 16), (-89321979) + (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "", 0) - 115, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str2);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 81;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(final String str, final String str2) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1273689L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 39;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    StackTraceInfo.IAuthTabCallback(str, str2, (SetDetectableSize) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallback = StackTraceInfo.IAuthTabCallback(str, str2, (SetDetectableSize) obj);
                int i4 = IAuthTabCallback + 23;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        }, 14, null);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 73;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i5 = onTransact + 1;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = asInterface + 53;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(427572800, i2, -1, "im.toss.feature.credit.ui.main.home.CreditHomeSuggestRefreshSection.<anonymous> (CreditHomeScreen.kt:698)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, str, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 << 12) & 57344), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 789392640, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -789392637, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        final String str = (String) objArr[1];
        final String str2 = (String) objArr[2];
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1273691L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda45
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 49;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = StackTraceInfo.onExtraCallback(str, str2, (SetDetectableSize) obj);
                int i5 = onNavigationEvent + 123;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 14, null);
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 123;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final String str, @NotNull final Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        long jLongValue;
        boolean z;
        boolean z2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1281206781);
        boolean z3 = true;
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                i3 = 2;
            } else {
                int i5 = onTransact + 15;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        int i7 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i7 & 19) == 18), i7 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = asInterface + 97;
                onTransact = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1281206781, i7, -1, "im.toss.feature.credit.ui.main.home.CreditHomeSuggestRefreshSection (CreditHomeScreen.kt:685)");
                    int i9 = 44 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1281206781, i7, -1, "im.toss.feature.credit.ui.main.home.CreditHomeSuggestRefreshSection (CreditHomeScreen.kt:685)");
                }
            }
            final String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.main.R.string.credit_suggest_refresh, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1415906890);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onRelationshipValidationResult();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1415907850);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(onextracallback, jLongValue, (toMetersPerSecond) null, 2, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallback);
            int i10 = i7 & 14;
            if (i10 == 4) {
                int i11 = onTransact + 21;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(zOnNavigationEvent | z)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda39
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i13 = 2 % 2;
                            int i14 = onWarmupCompleted + 85;
                            onNavigationEvent = i14 % 128;
                            int i15 = i14 % 2;
                            String str2 = strOnExtraCallback;
                            if (i15 != 0) {
                                return StackTraceInfo.onWarmupCompleted(str2, str);
                            }
                            int i16 = 43 / 0;
                            return StackTraceInfo.onWarmupCompleted(str2, str);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                    obj = function02;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = ImageLoaderBuilderExternalSyntheticLambda1.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, 0.0f, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(427572800, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda40
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        Unit unitOnNavigationEvent;
                        int i13 = 2 % 2;
                        int i14 = onWarmupCompleted + 59;
                        onExtraCallbackWithResult = i14 % 128;
                        if (i14 % 2 == 0) {
                            unitOnNavigationEvent = StackTraceInfo.onNavigationEvent(strOnExtraCallback, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i15 = 92 / 0;
                        } else {
                            unitOnNavigationEvent = StackTraceInfo.onNavigationEvent(strOnExtraCallback, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        }
                        int i16 = onExtraCallbackWithResult + 21;
                        onWarmupCompleted = i16 % 128;
                        if (i16 % 2 == 0) {
                            return unitOnNavigationEvent;
                        }
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnNavigationEvent = initMonitorHandler.IAuthTabCallback.onNavigationEvent();
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallback);
                if (i10 == 4) {
                    int i13 = asInterface + 89;
                    onTransact = i13 % 128;
                    int i14 = i13 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i7 & 112) == 32) {
                    int i15 = onTransact + 99;
                    asInterface = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    z3 = false;
                }
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent2 | z2 | z3)) {
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function03 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda41
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke() {
                                int i17 = 2 % 2;
                                int i18 = onExtraCallback + 3;
                                IAuthTabCallback = i18 % 128;
                                int i19 = i18 % 2;
                                Function0 function04 = function0;
                                if (i19 == 0) {
                                    return StackTraceInfo.onExtraCallback(function04, strOnExtraCallback, str);
                                }
                                StackTraceInfo.onExtraCallback(function04, strOnExtraCallback, str);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function03);
                        obj2 = function03;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, getbacktracenoteOnNavigationEvent, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj2, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 196614, 0, 114652);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i17 = onTransact + 53;
                        asInterface = i17 % 128;
                        int i18 = i17 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda42
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj3, Object obj4) {
                    int i19 = 2 % 2;
                    int i20 = onNavigationEvent + 55;
                    onWarmupCompleted = i20 % 128;
                    int i21 = i20 % 2;
                    String str2 = str;
                    if (i21 != 0) {
                        Function0 function04 = function0;
                        int i22 = i;
                        int iIntValue = ((Integer) obj4).intValue();
                        Object[] objArr = {str2, function04, Integer.valueOf(i22), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue)};
                        return (Unit) StackTraceInfo.onWarmupCompleted(300926296, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -300926287, R.drawable.IAuthTabCallback());
                    }
                    Function0 function05 = function0;
                    int i23 = i;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    Object[] objArr2 = {str2, function05, Integer.valueOf(i23), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue2)};
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            });
        }
    }

    private static final Unit onWarmupCompleted(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-121) - View.combineMeasuredStates(0, 0)), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 823844552 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 89321980, (Process.myPid() >> 22) - 115, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 73;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallback(final String str) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1213867L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda34
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 25;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                String str2 = str;
                SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
                if (i4 != 0) {
                    return StackTraceInfo.IAuthTabCallback(str2, setDetectableSize);
                }
                Unit unitIAuthTabCallback = StackTraceInfo.IAuthTabCallback(str2, setDetectableSize);
                int i5 = 7 / 0;
                return unitIAuthTabCallback;
            }
        }, 14, null);
        ConvertByteArrayToFloatArray.onExtraCallback(1285163L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.CreditHomeScreenKt$$ExternalSyntheticLambda35
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 79;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str2 = str;
                SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
                if (i4 != 0) {
                    return StackTraceInfo.onNavigationEvent(str2, setDetectableSize);
                }
                StackTraceInfo.onNavigationEvent(str2, setDetectableSize);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 14, null);
        int i2 = onTransact + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit asBinder(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) ((-121) - (ViewConfiguration.getLongPressTimeout() >> 16)), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 823844552 - ((Process.getThreadPriority(0) + 20) >> 6), (-89321979) - Color.red(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 116, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("service_home", "credit_home");
        setDetectableSize.onExtraCallback("menu_entry_id", 1000117);
        setDetectableSize.onExtraCallback("service_home_menu_entry_id", 11001514);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 67;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $showOverlay$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$showOverlay$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$showOverlay$delegate, access13800Var);
            int i2 = onNavigationEvent + 45;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 63;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 71 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback;
                int i4 = i3 + 65;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 5;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1200L, this) == objOnWarmupCompleted) {
                    int i8 = IAuthTabCallback + 57;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 19 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            StackTraceInfo.IAuthTabCallback((getSupportedHighSpeedResolutionsFor) this.$showOverlay$delegate, false);
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 91;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onTransact + 125;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-546207877, i, -1, "im.toss.feature.credit.ui.main.home.GradientOverlay.<anonymous> (CreditHomeScreen.kt:750)");
                int i5 = 72 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-546207877, i, -1, "im.toss.feature.credit.ui.main.home.GradientOverlay.<anonymous> (CreditHomeScreen.kt:750)");
            }
        }
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
        FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(setMaxAdCount.onExtraCallback(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0, getMaxAdCount.onExtraCallbackWithResult(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), 0.3f), (toMetersPerSecond) null, 2, (Object) null), new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), 0.3f))), getWrite.IAuthTabCallback(Float.valueOf(0.1f), setByteOrder.onNavigationEvent(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onExtraCallback())), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), 0.0f)))}, 90.0f, 0, cameraCaptureResultEmptyCameraCaptureResult, 384, 4), cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final void onExtraCallbackWithResult(SetDetectableSize setDetectableSize, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        CreditHomeLargeBannerType creditHomeLargeBannerType;
        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault;
        String strOnExtraCallbackWithResult;
        String strOnExtraCallback;
        CreditHomeLargeBannerResponse.Cta ctaOnWarmupCompleted;
        int i = 2 % 2;
        setDetectableSize.onExtraCallback("banner_type", creditHomeLargeBannerResponse != null ? creditHomeLargeBannerResponse.asInterface() : null);
        if (creditHomeLargeBannerResponse != null) {
            int i2 = asInterface + 51;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            creditHomeLargeBannerType = (CreditHomeLargeBannerType) CreditHomeLargeBannerResponse.onNavigationEvent(-558612175, zzgsa.onWarmupCompleted(), 558612175, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{creditHomeLargeBannerResponse}, zzgsa.onWarmupCompleted());
        } else {
            creditHomeLargeBannerType = null;
        }
        if (creditHomeLargeBannerType != CreditHomeLargeBannerType.LOAN_NEEDS_V2) {
            if (creditHomeLargeBannerResponse == null || (ctaOnWarmupCompleted = creditHomeLargeBannerResponse.onWarmupCompleted()) == null) {
                strOnExtraCallback = null;
            } else {
                int i4 = onTransact + 7;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                strOnExtraCallback = ctaOnWarmupCompleted.onExtraCallback();
            }
            setDetectableSize.onExtraCallback("button_text", strOnExtraCallback);
        }
        if (creditHomeLargeBannerResponse == null || (dualColumnContentsIAuthTabCallbackDefault = creditHomeLargeBannerResponse.IAuthTabCallbackDefault()) == null) {
            return;
        }
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnNavigationEvent = dualColumnContentsIAuthTabCallbackDefault.onNavigationEvent();
        setDetectableSize.onExtraCallback("left_title", columnContentOnNavigationEvent != null ? columnContentOnNavigationEvent.onNavigationEvent() : null);
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnNavigationEvent2 = dualColumnContentsIAuthTabCallbackDefault.onNavigationEvent();
        if (columnContentOnNavigationEvent2 != null) {
            int i6 = onTransact + 83;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                columnContentOnNavigationEvent2.onExtraCallbackWithResult();
                str.hashCode();
                throw null;
            }
            strOnExtraCallbackWithResult = columnContentOnNavigationEvent2.onExtraCallbackWithResult();
            int i7 = asInterface + 121;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        } else {
            strOnExtraCallbackWithResult = null;
        }
        setDetectableSize.onExtraCallback("left_value", strOnExtraCallbackWithResult);
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnWarmupCompleted = dualColumnContentsIAuthTabCallbackDefault.onWarmupCompleted();
        setDetectableSize.onExtraCallback("right_title", columnContentOnWarmupCompleted != null ? columnContentOnWarmupCompleted.onNavigationEvent() : null);
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnWarmupCompleted2 = dualColumnContentsIAuthTabCallbackDefault.onWarmupCompleted();
        setDetectableSize.onExtraCallback("right_value", columnContentOnWarmupCompleted2 != null ? columnContentOnWarmupCompleted2.onExtraCallbackWithResult() : null);
        String str = (String) onWarmupCompleted(-2110356285, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{dualColumnContentsIAuthTabCallbackDefault}, 2110356307, R.drawable.IAuthTabCallback());
        if (str != null) {
            setDetectableSize.onExtraCallback("ml_improvement", str);
        }
    }

    private static final void IAuthTabCallback(SetDetectableSize setDetectableSize, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, boolean z) {
        String strOnExtraCallbackWithResult;
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = asInterface + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsIAuthTabCallbackDefault = creditHomeLargeBannerResponse.IAuthTabCallbackDefault();
        if (dualColumnContentsIAuthTabCallbackDefault != null) {
            setDetectableSize.onExtraCallback("banner_title", dualColumnContentsIAuthTabCallbackDefault.onExtraCallback());
            CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnNavigationEvent = dualColumnContentsIAuthTabCallbackDefault.onNavigationEvent();
            setDetectableSize.onExtraCallback("left_value", columnContentOnNavigationEvent != null ? columnContentOnNavigationEvent.onExtraCallbackWithResult() : null);
            CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnWarmupCompleted = dualColumnContentsIAuthTabCallbackDefault.onWarmupCompleted();
            if (columnContentOnWarmupCompleted != null) {
                int i4 = asInterface + 117;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                strOnExtraCallbackWithResult = columnContentOnWarmupCompleted.onExtraCallbackWithResult();
                int i6 = onTransact + 53;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            } else {
                strOnExtraCallbackWithResult = null;
            }
            setDetectableSize.onExtraCallback("right_value", strOnExtraCallbackWithResult);
            if (z && (strIAuthTabCallback = dualColumnContentsIAuthTabCallbackDefault.IAuthTabCallback()) != null) {
                int i8 = onTransact + 21;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                if (!StringsKt.isBlank(strIAuthTabCallback)) {
                    setDetectableSize.onExtraCallback("rolling_title", dualColumnContentsIAuthTabCallbackDefault.IAuthTabCallback());
                }
            }
            String str = (String) onWarmupCompleted(-2110356285, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{dualColumnContentsIAuthTabCallbackDefault}, 2110356307, R.drawable.IAuthTabCallback());
            if (str != null) {
                setDetectableSize.onExtraCallback("ml_improvement", str);
            }
        }
        int i10 = asInterface + 35;
        onTransact = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        CreditHomeLargeBannerResponse.ChangeType changeTypeOnWarmupCompleted;
        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContents = (CreditHomeLargeBannerResponse.DualColumnContents) objArr[0];
        int i = 2 % 2;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnNavigationEvent = dualColumnContents.onNavigationEvent();
        if (columnContentOnNavigationEvent != null) {
            int i2 = asInterface + 87;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                changeTypeOnWarmupCompleted = columnContentOnNavigationEvent.onWarmupCompleted();
                int i3 = 58 / 0;
            } else {
                changeTypeOnWarmupCompleted = columnContentOnNavigationEvent.onWarmupCompleted();
            }
        } else {
            changeTypeOnWarmupCompleted = null;
        }
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContentOnWarmupCompleted = dualColumnContents.onWarmupCompleted();
        List listListOfNotNull = CollectionsKt.listOfNotNull(new CreditHomeLargeBannerResponse.ChangeType[]{changeTypeOnWarmupCompleted, columnContentOnWarmupCompleted != null ? columnContentOnWarmupCompleted.onWarmupCompleted() : null});
        boolean zContains = listListOfNotNull.contains(CreditHomeLargeBannerResponse.ChangeType.DOWN);
        boolean zContains2 = listListOfNotNull.contains(CreditHomeLargeBannerResponse.ChangeType.UP);
        if (zContains && zContains2) {
            int i4 = asInterface + 99;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 34 / 0;
            }
            return "interest_and_limit";
        }
        if (zContains) {
            return "interest";
        }
        if (!zContains2) {
            return null;
        }
        int i6 = onTransact + 77;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 68 / 0;
        }
        return "limit";
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onTransact + 77;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        liteTrackWatchDogHandlerThreadOpt litetrackwatchdoghandlerthreadopt = (liteTrackWatchDogHandlerThreadOpt) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = asInterface + 113;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return litetrackwatchdoghandlerthreadopt;
        }
        throw null;
    }

    private static final liteProcessHandlerThreadOpt onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<liteProcessHandlerThreadOpt> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        liteProcessHandlerThreadOpt liteprocesshandlerthreadopt = (liteProcessHandlerThreadOpt) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = asInterface + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return liteprocesshandlerthreadopt;
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onTransact + 93;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            throw null;
        }
        int i4 = asInterface + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, boolean z) {
        Object[] objArr = {function1, liteprocesshandlerthreadopt, Boolean.valueOf(z)};
        return (Unit) onWarmupCompleted(-1298548653, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 1298548683, R.drawable.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, CreditHomeViewModel creditHomeViewModel, String str, boolean z, boolean z2) {
        Object[] objArr = {liteprocesshandlerthreadopt, creditHomeViewModel, str, Boolean.valueOf(z), Boolean.valueOf(z2)};
        return (Unit) onWarmupCompleted(1177714309, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -1177714278, R.drawable.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHomeHeaderItem creditHomeHeaderItem, int i, SetDetectableSize setDetectableSize) {
        Object[] objArr = {creditHomeHeaderItem, Integer.valueOf(i), setDetectableSize};
        return (Unit) onWarmupCompleted(319445092, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -319445080, R.drawable.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, CreditHomeViewModel creditHomeViewModel, Function1 function1, CreditHomeHeaderItem creditHomeHeaderItem, int i) {
        Object[] objArr = {str, creditHomeViewModel, function1, creditHomeHeaderItem, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(2124804753, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -2124804737, R.drawable.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, CreditHomeViewModel creditHomeViewModel) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-718914467, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{str, creditHomeViewModel}, 718914492, iIAuthTabCallback3);
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHomeViewModel creditHomeViewModel, onUnavailable onunavailable) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onWarmupCompleted(137477108, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{creditHomeViewModel, onunavailable}, -137477098, iIAuthTabCallback3);
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeViewModel creditHomeViewModel, String str, boolean z, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        Object[] objArr = {creditHomeViewModel, str, Boolean.valueOf(z), creditHomeLargeBannerResponse};
        return (Unit) onWarmupCompleted(-972950576, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 972950603, R.drawable.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(String str, CreditHomeViewModel creditHomeViewModel) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onWarmupCompleted(1312714059, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{str, creditHomeViewModel}, -1312714042, iIAuthTabCallback3);
    }

    public static /* synthetic */ Unit onNavigationEvent(onUnavailable onunavailable, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onWarmupCompleted(1685534891, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{onunavailable, setDetectableSize}, -1685534873, iIAuthTabCallback3);
    }

    public static /* synthetic */ Unit onWarmupCompleted(liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, Function1 function1, Function0 function0, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {liteprocesshandlerthreadopt, function1, function0, function02, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onWarmupCompleted(899171872, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -899171853, R.drawable.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHomeViewModel creditHomeViewModel, Function1 function1, String str, boolean z, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        Object[] objArr = {creditHomeViewModel, function1, str, Boolean.valueOf(z), creditHomeLargeBannerResponse};
        return (Unit) onWarmupCompleted(-667881123, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 667881130, R.drawable.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHomeViewModel creditHomeViewModel, CreditHomeHeaderResponse creditHomeHeaderResponse) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-1040333592, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{creditHomeViewModel, creditHomeHeaderResponse}, 1040333606, iIAuthTabCallback3);
    }

    public static /* synthetic */ Unit onExtraCallback(String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onWarmupCompleted(300926296, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -300926287, R.drawable.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, boolean z, SetDetectableSize setDetectableSize) {
        Object[] objArr = {str, creditHomeLargeBannerResponse, Boolean.valueOf(z), setDetectableSize};
        return (Unit) onWarmupCompleted(-1890644561, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 1890644569, R.drawable.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-1627953565, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{str, liteprocesshandlerthreadopt, setDetectableSize}, 1627953586, iIAuthTabCallback3);
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHomeViewModel creditHomeViewModel, ScoreDeltaInfo scoreDeltaInfo) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-1113599837, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{creditHomeViewModel, scoreDeltaInfo}, 1113599860, iIAuthTabCallback3);
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, onUnavailable onunavailable) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-2041539430, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{function0, onunavailable}, 2041539433, iIAuthTabCallback3);
    }

    private static final Unit onNavigationEvent(Function0 function0, onUnavailable onunavailable) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onWarmupCompleted(2115975218, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{function0, onunavailable}, -2115975192, iIAuthTabCallback3);
    }

    private static final Unit onExtraCallback(liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, Function1 function1, Function0 function0, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {liteprocesshandlerthreadopt, function1, function0, function02, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onWarmupCompleted(-567767527, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 567767559, R.drawable.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(MyQuizDetailsResponse myQuizDetailsResponse, enableAppModelOpt enableappmodelopt, CreditHomeViewModel creditHomeViewModel, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {myQuizDetailsResponse, enableappmodelopt, creditHomeViewModel, function1, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onWarmupCompleted(2142974855, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -2142974854, R.drawable.IAuthTabCallback());
    }

    public static final void onExtraCallbackWithResult(@NotNull CreditHomeViewModel creditHomeViewModel, boolean z, boolean z2, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super getTime, Unit> function12, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function1<? super onUnavailable, Unit> function13, @NotNull InventoryAdManager inventoryAdManager, @NotNull String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        Object[] objArr = {creditHomeViewModel, Boolean.valueOf(z), Boolean.valueOf(z2), function1, function12, function0, function02, function13, inventoryAdManager, str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        onWarmupCompleted(-232540988, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 232540994, R.drawable.IAuthTabCallback());
    }

    private static final liteTrackWatchDogHandlerThreadOpt IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends liteTrackWatchDogHandlerThreadOpt> cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (liteTrackWatchDogHandlerThreadOpt) onWarmupCompleted(-1245651513, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, 1245651518, iIAuthTabCallback3);
    }

    private static final Unit asBinder(CreditHomeViewModel creditHomeViewModel) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onWarmupCompleted(564955324, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{creditHomeViewModel}, -564955304, iIAuthTabCallback3);
    }

    private static final Unit onExtraCallback(String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onWarmupCompleted(986091608, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{str, liteprocesshandlerthreadopt, setDetectableSize}, -986091579, iIAuthTabCallback3);
    }

    private static final Unit onWarmupCompleted(boolean z, ScoreDeltaInfo scoreDeltaInfo, List list, CreditHomeViewModel creditHomeViewModel, Function1 function1, String str, liteProcessHandlerThreadOpt liteprocesshandlerthreadopt, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Boolean.valueOf(z), scoreDeltaInfo, list, creditHomeViewModel, function1, str, liteprocesshandlerthreadopt, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(1457519689, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -1457519656, R.drawable.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(String str, CreditHomeViewModel creditHomeViewModel, Function1 function1, CreditHomeHeaderItem creditHomeHeaderItem, int i) {
        Object[] objArr = {str, creditHomeViewModel, function1, creditHomeHeaderItem, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(-247715997, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 247716021, R.drawable.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallbackStubProxy(CreditHomeHeaderItem creditHomeHeaderItem, int i, SetDetectableSize setDetectableSize) {
        Object[] objArr = {creditHomeHeaderItem, Integer.valueOf(i), setDetectableSize};
        return (Unit) onWarmupCompleted(-1697812153, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 1697812155, R.drawable.IAuthTabCallback());
    }

    private static final Unit onExtraCallbackWithResult(CreditHomeViewModel creditHomeViewModel, String str, boolean z, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse) {
        Object[] objArr = {creditHomeViewModel, str, Boolean.valueOf(z), creditHomeLargeBannerResponse};
        return (Unit) onWarmupCompleted(-389487177, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, 389487190, R.drawable.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallbackStub(String str, CreditHomeLargeBannerResponse creditHomeLargeBannerResponse, boolean z, SetDetectableSize setDetectableSize) {
        Object[] objArr = {str, creditHomeLargeBannerResponse, Boolean.valueOf(z), setDetectableSize};
        return (Unit) onWarmupCompleted(1274185993, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -1274185978, R.drawable.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(String str, String str2, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-1720888511, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{str, str2, setDetectableSize}, 1720888515, iIAuthTabCallback3);
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, String str, String str2) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-891201097, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{function0, str, str2}, 891201125, iIAuthTabCallback3);
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onWarmupCompleted(1716453667, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{str, str2, setDetectableSize}, -1716453667, iIAuthTabCallback3);
    }

    private static final void onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        Object[] objArr = {quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onWarmupCompleted(1405468134, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, -1405468123, R.drawable.IAuthTabCallback());
    }

    private static final String onExtraCallbackWithResult(CreditHomeLargeBannerResponse.DualColumnContents dualColumnContents) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (String) onWarmupCompleted(-2110356285, iIAuthTabCallback, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{dualColumnContents}, 2110356307, iIAuthTabCallback3);
    }
}
