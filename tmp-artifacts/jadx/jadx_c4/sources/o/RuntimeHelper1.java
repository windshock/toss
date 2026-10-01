package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.R;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.Futures3;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RuntimeHelper1;
import o.SnapshotStateListExternalSyntheticLambda0;
import o.SpannedDataExternalSyntheticLambda0;
import o.SurfaceProcessorNodeOut;
import o.getSupportedHighSpeedResolutionsFor;
import o.getTime;
import o.immediateFailedFuture;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RuntimeHelper1 {
    private static final byte[] $$a = {119, -27, 13, -93};
    private static final int $$b = 105;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int[] IAuthTabCallback = {-1057122264, 1213858114, -379621521, -65412484, -525580129, -1976073170, 601970841, -1616801901, 1722121917, 1681160861, -1682600195, 1193846245, -1190546609, 1435113690, -764645775, -1613322580, 1983456728, -1194717947};
    private static long onWarmupCompleted = 7798559133331975163L;
    private static int onExtraCallback = -1776194565;
    private static char onExtraCallbackWithResult = 51269;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3 = 4 - (s * 4);
        int i4 = i * 3;
        int i5 = 110 - b;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            int i8 = 0;
            i3++;
            i5 = (-i5) + i7;
            i2 = i8;
            int i9 = i3;
            int i10 = i5;
            bArr2[i2] = (byte) i10;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i3 = i9;
            i5 = bArr[i9];
            i7 = i10;
            i3++;
            i5 = (-i5) + i7;
            i2 = i8;
            int i92 = i3;
            int i102 = i5;
            bArr2[i2] = (byte) i102;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i922 = i3;
            int i1022 = i5;
            bArr2[i2] = (byte) i1022;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    private static final float IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        if (i >= 1000) {
            return 1.0f;
        }
        if (i >= 980) {
            int i3 = onTransact + 11;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return 0.97f;
        }
        if (i >= 970) {
            return 0.95f;
        }
        if (i >= 950) {
            int i5 = onTransact + 49;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return 0.93f;
        }
        if (i >= 920) {
            return 0.92f;
        }
        if (i >= 900) {
            return 0.91f;
        }
        return i / 1000.0f;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        setByteOrder setbyteorder = (setByteOrder) objArr[1];
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[3]).booleanValue();
        Function0 function0 = (Function0) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onTransact = i2 % 128;
        onExtraCallback(zBooleanValue, setbyteorder, zBooleanValue2, zBooleanValue3, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, SnapshotKtExternalSyntheticLambda1 snapshotKtExternalSyntheticLambda1, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 113;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, snapshotKtExternalSyntheticLambda1, f, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 43;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor, z);
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor, z);
        int i3 = onNavigationEvent + 101;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, boolean z2, boolean z3, getTime gettime, getTime gettime2, int i, int i2, boolean z4, boolean z5, boolean z6, Function1 function1, Function0 function0, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) throws Throwable {
        int i7 = 2 % 2;
        int i8 = onNavigationEvent + 43;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(z, z2, z3, gettime, gettime2, i, i2, z4, z5, z6, function1, function0, i3, i4, i5, cameraCaptureResultEmptyCameraCaptureResult, i6);
        if (i9 == 0) {
            int i10 = 24 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function0);
        int i4 = onNavigationEvent + 39;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        getTime gettime = (getTime) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(151809603, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -151809595, iIAuthTabCallback3, iIAuthTabCallback, new Object[]{function1, gettime});
        int i4 = onTransact + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue4 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(quirksExternalSyntheticBackport0, iIntValue, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        }
        int i3 = 61 / 0;
        return onExtraCallback(quirksExternalSyntheticBackport0, iIntValue, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        float fFloatValue = ((Number) objArr[0]).floatValue();
        int i = 2 % 2;
        int i2 = onTransact + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return Float.valueOf(fFloatValue);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onTransact + 35;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        onWarmupCompleted(quirksExternalSyntheticBackport0, i, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onTransact + 41;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, SnapshotKtExternalSyntheticLambda1 snapshotKtExternalSyntheticLambda1, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 7;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        int iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1);
        if (i6 == 0) {
            Object[] objArr = {quirksExternalSyntheticBackport0, snapshotKtExternalSyntheticLambda1, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iOnExtraCallbackWithResult), Integer.valueOf(i2)};
            onNavigationEvent(-863049809, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 863049814, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr);
        } else {
            Object[] objArr2 = {quirksExternalSyntheticBackport0, snapshotKtExternalSyntheticLambda1, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iOnExtraCallbackWithResult), Integer.valueOf(i2)};
            onNavigationEvent(-863049809, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 863049814, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr2);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getTime gettime, int i, boolean z, long j, float f, Function0 function0, Function1 function1, Function0 function02, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 97;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        onWarmupCompleted(quirksExternalSyntheticBackport0, gettime, i, z, j, f, function0, function1, function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 119;
        onTransact = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, getTime gettime, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 53;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), gettime, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(-1596051120, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1596051135, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr);
        int i7 = onTransact + 83;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, f);
        int i4 = onNavigationEvent + 47;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static final Unit onExtraCallback(getTime gettime, getTime gettime2, int i, int i2, Function1 function1, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 67;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        IAuthTabCallback(gettime, gettime2, i, i2, (Function1<? super getTime, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1));
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 37;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getTime gettime, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(gettime, useandconfigureprogramwithtexture);
        int i4 = onTransact + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onExtraCallback(boolean z, boolean z2, boolean z3, getTime gettime, getTime gettime2, int i, int i2, boolean z4, boolean z5, boolean z6, Function1 function1, Function0 function0, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) throws Throwable {
        int i7 = 2 % 2;
        int i8 = onTransact + 119;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        onWarmupCompleted(z, z2, z3, gettime, gettime2, i, i2, z4, z5, z6, function1, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i4), i5);
        Unit unit = Unit.INSTANCE;
        int i10 = onTransact + 85;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(long j, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(j, getsupportedhighspeedresolutionsfor);
        int i4 = onTransact + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(context, getsupportedhighspeedresolutionsfor, futures3);
        int i4 = onNavigationEvent + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, Function0 function0, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(-361030059, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 361030066, iIAuthTabCallback3, iIAuthTabCallback, new Object[]{function1, function0, surfaceProcessorNodeOut});
        int i4 = onTransact + 67;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, getTime gettime) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(function1, gettime);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        int i5 = onTransact + 11;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getTime gettime, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 73;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, gettime, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 115;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 58 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getTime gettime, int i, boolean z, long j, float f, Function0 function0, Function1 function1, Function0 function02, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        Unit unitOnExtraCallback;
        int i5 = 2 % 2;
        int i6 = onTransact + 59;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, gettime, i, z, j, f, function0, function1, function02, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            int i7 = 83 / 0;
        } else {
            unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, gettime, i, z, j, f, function0, function1, function02, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        }
        int i8 = onTransact + 105;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 51 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getTime gettime, getTime gettime2, int i, int i2, Function1 function1, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 107;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallback = onExtraCallback(gettime, gettime2, i, i2, function1, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onNavigationEvent + 91;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallbackWithResult(boolean z, boolean z2, boolean z3, getTime gettime, getTime gettime2, int i, int i2, boolean z4, boolean z5, boolean z6, Function1 function1, Function0 function0, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) throws Throwable {
        int i7 = 2 % 2;
        int i8 = onTransact + 97;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        onWarmupCompleted(z, z2, z3, gettime, gettime2, i, i2, z4, z5, z6, function1, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i4), i5);
        Unit unit = Unit.INSTANCE;
        int i10 = onTransact + 51;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    public static /* synthetic */ float onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(f);
        if (i3 == 0) {
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            ((Float) onNavigationEvent(-1229785145, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1229785151, iIAuthTabCallback3, iIAuthTabCallback, new Object[]{fValueOf})).floatValue();
            throw null;
        }
        int iIAuthTabCallback4 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback5 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback6 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        float fFloatValue = ((Float) onNavigationEvent(-1229785145, iIAuthTabCallback5, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1229785151, iIAuthTabCallback6, iIAuthTabCallback4, new Object[]{fValueOf})).floatValue();
        int i4 = onTransact + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    public static /* synthetic */ float onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62);
        }
        IAuthTabCallback(getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62);
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i4 | i6);
        int i12 = (~(i6 | i4)) | (~(i7 | i9)) | i8;
        int i13 = i4 + i + i2 + ((-1422066268) * i5) + ((-2108786386) * i3);
        int i14 = i13 * i13;
        int i15 = ((-1583913924) * i4) + 967573504 + (322476998 * i) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i2) + ((-1298137088) * i5) + (1722810368 * i3) + (518782976 * i14);
        int i16 = (i4 * 793895740) + 1353643607 + (i * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (i2 * 793896001) + (i5 * 692483748) + (i3 * (-1016611666)) + (i14 * 166461440);
        switch (i15 + (i16 * i16 * 1997799424)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
                int i17 = 2 % 2;
                int i18 = onTransact + 101;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                float fFloatValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue();
                int i20 = onTransact + 113;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                return Float.valueOf(fFloatValue);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                Function1 function1 = (Function1) objArr[0];
                Function0 function0 = (Function0) objArr[1];
                SurfaceProcessorNodeOut surfaceProcessorNodeOut = (SurfaceProcessorNodeOut) objArr[2];
                int i22 = 2 % 2;
                Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
                function1.invoke(Boolean.valueOf(surfaceProcessorNodeOut.onExtraCallbackWithResult()));
                if (!(!surfaceProcessorNodeOut.onExtraCallbackWithResult())) {
                    int i23 = onNavigationEvent + 107;
                    onTransact = i23 % 128;
                    int i24 = i23 % 2;
                    function0.invoke();
                    int i25 = onNavigationEvent + 119;
                    onTransact = i25 % 128;
                    int i26 = i25 % 2;
                }
                return Unit.INSTANCE;
            case 8:
                return IAuthTabCallbackStub(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return onTransact(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return IAuthTabCallbackDefault(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                float fFloatValue2 = ((Number) objArr[0]).floatValue();
                int i27 = 2 % 2;
                int i28 = onNavigationEvent + 15;
                int i29 = i28 % 128;
                onTransact = i29;
                int i30 = i28 % 2;
                int i31 = i29 + 69;
                onNavigationEvent = i31 % 128;
                int i32 = i31 % 2;
                return Float.valueOf(fFloatValue2);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                int i33 = 2 % 2;
                int i34 = onNavigationEvent + 9;
                onTransact = i34 % 128;
                int i35 = i34 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(zBooleanValue);
                int i36 = onNavigationEvent + 107;
                onTransact = i36 % 128;
                int i37 = i36 % 2;
                return unitOnWarmupCompleted;
            case 14:
                return access100(objArr);
            case 15:
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                getTime gettime = (getTime) objArr[2];
                Function1 function12 = (Function1) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                int iIntValue2 = ((Number) objArr[5]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
                ((Number) objArr[7]).intValue();
                int i38 = 2 % 2;
                int i39 = onNavigationEvent + 81;
                onTransact = i39 % 128;
                int i40 = i39 % 2;
                Object[] objArr2 = {quirksExternalSyntheticBackport0, Boolean.valueOf(zBooleanValue2), gettime, function12, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue)), Integer.valueOf(iIntValue2)};
                if (i40 == 0) {
                    onNavigationEvent(-1418150270, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1418150274, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr2);
                } else {
                    onNavigationEvent(-1418150270, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1418150274, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr2);
                }
                return Unit.INSTANCE;
            case 16:
                return access000(objArr);
            case 17:
                return IAuthTabCallback_Parcel(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onTransact((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, zBooleanValue);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0);
        int i4 = onTransact + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, f);
        int i4 = onTransact + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, boolean z2, boolean z3, getTime gettime, getTime gettime2, int i, int i2, boolean z4, boolean z5, boolean z6, Function1 function1, Function0 function0, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) throws Throwable {
        int i7 = 2 % 2;
        int i8 = onTransact + 123;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            onExtraCallback(z, z2, z3, gettime, gettime2, i, i2, z4, z5, z6, function1, function0, i3, i4, i5, cameraCaptureResultEmptyCameraCaptureResult, i6);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(z, z2, z3, gettime, gettime2, i, i2, z4, z5, z6, function1, function0, i3, i4, i5, cameraCaptureResultEmptyCameraCaptureResult, i6);
        int i9 = onTransact + 53;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ float onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Float.valueOf(f)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        float fFloatValue = ((Float) onNavigationEvent(-1635625211, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1635625223, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr)).floatValue();
        int i4 = onNavigationEvent + 55;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return fFloatValue;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback();
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback();
        int i3 = onNavigationEvent + 79;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(long j, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(j, getsupportedhighspeedresolutionsfor);
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = onNavigationEvent + 97;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, getTime gettime) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(function1, gettime);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(function1, gettime);
        int i3 = onNavigationEvent + 51;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getTime gettime, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onTransact + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, gettime, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onTransact + 91;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, f);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        int i5 = onTransact + 33;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, z);
        }
        IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, z);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, setByteOrder setbyteorder, boolean z2, boolean z3, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onTransact + 117;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr = {Boolean.valueOf(z), setbyteorder, Boolean.valueOf(z2), Boolean.valueOf(z3), function0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {Boolean.valueOf(z), setbyteorder, Boolean.valueOf(z2), Boolean.valueOf(z3), function0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        Unit unit = (Unit) onNavigationEvent(-2097034903, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 2097034904, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr2);
        int i6 = onNavigationEvent + 31;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ boolean $isScoreRaiseAvailable;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $startAnimation$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(boolean z, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$isScoreRaiseAvailable = z;
            this.$startAnimation$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$isScoreRaiseAvailable, this.$startAnimation$delegate, access13800Var);
            int i2 = onExtraCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[PHI: r1
          0x0032: PHI (r1v6 java.lang.Object) = (r1v4 java.lang.Object), (r1v7 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
          0x0024: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 47;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 49 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(700L, this) == objOnWarmupCompleted) {
                        int i5 = onExtraCallback + 123;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            Object[] objArr = {this.$startAnimation$delegate, Boolean.valueOf(this.$isScoreRaiseAvailable)};
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            RuntimeHelper1.onNavigationEvent(1599006328, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1599006325, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr);
            return Unit.INSTANCE;
        }
    }

    private static void a(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $11 + 69;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), 43 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1452 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49122);
                        int i5 = 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i6 = 1495 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte b3 = (byte) ($$b & 7);
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, i5, i6, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 23972), KeyEvent.normalizeMetaState(0) + 50, 22938 - ImageFormat.getBitsPerPixel(0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, 12577 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i7 = $11 + 59;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IAuthTabCallback;
        int i4 = -1469660336;
        float f = 0.0f;
        if (iArr3 != null) {
            int i5 = $11 + 115;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 72 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i2++;
                    int i6 = $10 + 103;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 3 % 3;
                    }
                    i4 = -1469660336;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int i8 = $11 + 111;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i10 = 0; i10 < length3; i10++) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 71, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i11 = $10 + 47;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Gravity.getAbsoluteGravity(0, 0)), 39 - (Process.myTid() >> 22), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i13++;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 77, 7398 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i18 = $11 + 103;
            $10 = i18 % 128;
            int i19 = i18 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(final boolean z, final boolean z2, final boolean z3, @NotNull final getTime gettime, @NotNull final getTime gettime2, int i, int i2, boolean z4, boolean z5, boolean z6, @NotNull final Function1<? super getTime, Unit> function1, @NotNull final Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i3, final int i4, final int i5) throws Throwable {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final int i15;
        final int i16;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z10;
        Object obj;
        int i17;
        int i18;
        int i19;
        setByteOrder setbyteorderOnNavigationEvent;
        int i20;
        int i21;
        int i22 = 2 % 2;
        Intrinsics.checkNotNullParameter(gettime, "");
        Intrinsics.checkNotNullParameter(gettime2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(91970220);
        if ((i3 & 6) == 0) {
            i6 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                int i23 = onNavigationEvent + 23;
                onTransact = i23 % 128;
                int i24 = i23 % 2;
                i21 = 32;
            } else {
                i21 = 16;
            }
            i6 |= i21;
        }
        if ((i3 & 384) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gettime) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            int i25 = onTransact + 53;
            onNavigationEvent = i25 % 128;
            int i26 = i25 % 2;
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gettime2) ? 16384 : 8192;
        }
        int i27 = i5 & 32;
        if (i27 != 0) {
            i6 |= 196608;
        } else {
            if ((196608 & i3) == 0) {
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 131072 : 65536;
            }
            i7 = i5 & 64;
            if (i7 == 0) {
                i6 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                int i28 = onNavigationEvent + 35;
                onTransact = i28 % 128;
                if (i28 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2);
                    throw null;
                }
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 1048576 : 524288;
            }
            i8 = i5 & 128;
            if (i8 == 0) {
                i6 |= 12582912;
            } else {
                if ((12582912 & i3) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4)) {
                        int i29 = onTransact + 97;
                        onNavigationEvent = i29 % 128;
                        int i30 = i29 % 2;
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i6 |= i9;
                }
                i10 = i5 & 256;
                if (i10 != 0) {
                    i6 |= 100663296;
                } else {
                    if ((100663296 & i3) == 0) {
                        i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z5) ? 67108864 : 33554432;
                    }
                    i11 = i5 & 512;
                    if (i11 != 0) {
                        if ((805306368 & i3) == 0) {
                            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z6) ? 536870912 : 268435456;
                        }
                        i12 = i6;
                        if ((i4 & 6) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                                i20 = 4;
                            } else {
                                int i31 = onNavigationEvent + 45;
                                onTransact = i31 % 128;
                                if (i31 % 2 == 0) {
                                    int i32 = 3 / 4;
                                }
                                i20 = 2;
                            }
                            i13 = i4 | i20;
                        } else {
                            i13 = i4;
                        }
                        if ((i4 & 48) == 0) {
                            i13 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
                        }
                        i14 = i13;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i12) == 306783378 && (i14 & 19) == 18) ? false : true, i12 & 1)) {
                            int i33 = i27 != 0 ? 0 : i;
                            int i34 = i7 == 0 ? i2 : 0;
                            if (i8 != 0) {
                                int i35 = onNavigationEvent + 33;
                                onTransact = i35 % 128;
                                int i36 = i35 % 2;
                                z10 = false;
                            } else {
                                z10 = z4;
                            }
                            boolean z11 = i10 != 0 ? false : z5;
                            boolean z12 = i11 != 0 ? false : z6;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(91970220, i12, i14, "im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSection (CreditHomeScoreSection.kt:86)");
                            }
                            if (!(!z10)) {
                                setByteOrder setbyteorderOnNavigationEvent2 = null;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-303809587);
                                IAuthTabCallback(gettime, gettime2, i33, i34, function1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i12 >> 9) & 8190) | ((i14 << 12) & 57344));
                                if (z3) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-303533470);
                                    if (z12) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1810902061);
                                        long jICustomTabsService = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        setbyteorderOnNavigationEvent2 = setByteOrder.onNavigationEvent(jICustomTabsService);
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-303376239);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    }
                                    onExtraCallback(false, setbyteorderOnNavigationEvent2, true, z11, function0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i12 >> 15) & 7168) | 390 | ((i14 << 9) & 57344), 0);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-303206730);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 != null) {
                                    final int i37 = i33;
                                    final int i38 = i34;
                                    final boolean z13 = z10;
                                    final boolean z14 = z11;
                                    final boolean z15 = z12;
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda7
                                        private static int onExtraCallback = 0;
                                        private static int onNavigationEvent = 1;

                                        public final Object invoke(Object obj2, Object obj3) throws Throwable {
                                            int i39 = 2 % 2;
                                            int i40 = onExtraCallback + 125;
                                            onNavigationEvent = i40 % 128;
                                            int i41 = i40 % 2;
                                            Unit unitOnNavigationEvent = RuntimeHelper1.onNavigationEvent(z, z2, z3, gettime, gettime2, i37, i38, z13, z14, z15, function1, function0, i3, i4, i5, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                            int i42 = onExtraCallback + 77;
                                            onNavigationEvent = i42 % 128;
                                            if (i42 % 2 != 0) {
                                                return unitOnNavigationEvent;
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
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-303185898);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                            Unit unit = Unit.INSTANCE;
                            boolean z16 = (i12 & 112) == 32;
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z16 || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                obj = null;
                                objOnMinimized2 = new onExtraCallbackWithResult(z2, getsupportedhighspeedresolutionsfor, null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            } else {
                                obj = null;
                            }
                            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, obj);
                            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                            QuirkSettingsLoader.onNavigationEvent onnavigationeventOnTransact = onextracallbackwithresult.onTransact();
                            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onnavigationeventOnTransact, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                int i39 = onNavigationEvent + 23;
                                onTransact = i39 % 128;
                                if (i39 % 2 == 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                                    int i40 = 59 / 0;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                                }
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                            if (z) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1268428775);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.onExtraCallback(), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                    int i41 = onTransact + 9;
                                    onNavigationEvent = i41 % 128;
                                    if (i41 % 2 != 0) {
                                        getAwbState.onExtraCallback();
                                        int i42 = 23 / 0;
                                    } else {
                                        getAwbState.onExtraCallback();
                                    }
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                    int i43 = onNavigationEvent + 103;
                                    onTransact = i43 % 128;
                                    if (i43 % 2 == 0) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                                        throw null;
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = RowScope.onNavigationEvent(rowScopeInstance, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
                                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
                                Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                    getAwbState.onExtraCallback();
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(gettime.onWarmupCompleted()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                }
                                int i44 = (i14 << 9) & 7168;
                                i19 = 6;
                                i17 = i14;
                                i18 = i12;
                                onNavigationEvent(-1418150270, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1418150274, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.IAuthTabCallbackStub()), Boolean.valueOf(onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor) && IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) objOnMinimized3)), gettime, function1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i12 >> 3) & 896) | i44), 0});
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = RowScope.onNavigationEvent(rowScopeInstance, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
                                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                                int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
                                Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
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
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(gettime2.onWarmupCompleted()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                }
                                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.asInterface());
                                Boolean boolValueOf = Boolean.valueOf(onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor) && asBinder((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2));
                                Integer numValueOf = Integer.valueOf(((i18 >> 6) & 896) | i44);
                                setbyteorderOnNavigationEvent = null;
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                onNavigationEvent(-1418150270, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1418150274, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnWarmupCompleted5, boolValueOf, gettime2, function1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, numValueOf, 0});
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                i17 = i14;
                                i18 = i12;
                                i19 = 6;
                                setbyteorderOnNavigationEvent = null;
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1267008913);
                                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(118.0f)), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                            if (z3) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1266904846);
                                boolean zOnExtraCallback = onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
                                if (z12) {
                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1841978243);
                                    long jICustomTabsService2 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, i19).ICustomTabsService();
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                    setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(jICustomTabsService2);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1266737881);
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                }
                                onExtraCallback(zOnExtraCallback, setbyteorderOnNavigationEvent, false, z11, function0, cameraCaptureResultEmptyCameraCaptureResult2, ((i18 >> 15) & 7168) | ((i17 << 9) & 57344), 4);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1266603092);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            i15 = i33;
                            i16 = i34;
                            z7 = z10;
                            z8 = z11;
                            z9 = z12;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            i15 = i;
                            i16 = i2;
                            z7 = z4;
                            z8 = z5;
                            z9 = z6;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda8
                                private static int onNavigationEvent = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj2, Object obj3) throws Throwable {
                                    int i45 = 2 % 2;
                                    int i46 = onNavigationEvent + 15;
                                    onWarmupCompleted = i46 % 128;
                                    int i47 = i46 % 2;
                                    Unit unitIAuthTabCallback = RuntimeHelper1.IAuthTabCallback(z, z2, z3, gettime, gettime2, i15, i16, z7, z8, z9, function1, function0, i3, i4, i5, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i48 = onNavigationEvent + 27;
                                    onWarmupCompleted = i48 % 128;
                                    int i49 = i48 % 2;
                                    return unitIAuthTabCallback;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    int i45 = onTransact + 111;
                    onNavigationEvent = i45 % 128;
                    int i46 = i45 % 2;
                    i6 |= 805306368;
                    i12 = i6;
                    if ((i4 & 6) == 0) {
                    }
                    if ((i4 & 48) == 0) {
                    }
                    i14 = i13;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i12) == 306783378 && (i14 & 19) == 18) ? false : true, i12 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i11 = i5 & 512;
                if (i11 != 0) {
                }
                i12 = i6;
                if ((i4 & 6) == 0) {
                }
                if ((i4 & 48) == 0) {
                }
                i14 = i13;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i12) == 306783378 && (i14 & 19) == 18) ? false : true, i12 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i10 = i5 & 256;
            if (i10 != 0) {
            }
            i11 = i5 & 512;
            if (i11 != 0) {
            }
            i12 = i6;
            if ((i4 & 6) == 0) {
            }
            if ((i4 & 48) == 0) {
            }
            i14 = i13;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i12) == 306783378 && (i14 & 19) == 18) ? false : true, i12 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i7 = i5 & 64;
        if (i7 == 0) {
        }
        i8 = i5 & 128;
        if (i8 == 0) {
        }
        i10 = i5 & 256;
        if (i10 != 0) {
        }
        i11 = i5 & 512;
        if (i11 != 0) {
        }
        i12 = i6;
        if ((i4 & 6) == 0) {
        }
        if ((i4 & 48) == 0) {
        }
        i14 = i13;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i12) == 306783378 && (i14 & 19) == 18) ? false : true, i12 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit onNavigationEvent(long j, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        long jOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk>) getsupportedhighspeedresolutionsfor);
        RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(jOnNavigationEvent);
        long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(jOnNavigationEvent), AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(jOnNavigationEvent) * 0.95f);
        RequestOptionConfigBuilderExternalSyntheticLambda0.onNavigationEvent(jOnExtraCallback, j);
        if (Float.compare(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(jOnExtraCallback), AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(j)) >= 0) {
            int i4 = onTransact + 33;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                onExtraCallback((getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk>) getsupportedhighspeedresolutionsfor, jOnExtraCallback);
            } else {
                onExtraCallback((getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk>) getsupportedhighspeedresolutionsfor, jOnExtraCallback);
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Function1 function1, getTime gettime) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(gettime);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 103;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(long j, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        long jOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk>) getsupportedhighspeedresolutionsfor);
        RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(jOnNavigationEvent);
        long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(jOnNavigationEvent), AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(jOnNavigationEvent) * 0.95f);
        RequestOptionConfigBuilderExternalSyntheticLambda0.onNavigationEvent(jOnExtraCallback, j);
        if (Float.compare(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(jOnExtraCallback), AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(j)) >= 0) {
            int i4 = onNavigationEvent + 65;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallback((getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk>) getsupportedhighspeedresolutionsfor, jOnExtraCallback);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 93;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 52 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        asInterface(getsupportedhighspeedresolutionsfor, z);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return unit;
    }

    private static final Unit onTransact(Function1 function1, getTime gettime) {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(gettime);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(final getTime gettime, final getTime gettime2, final int i, final int i2, final Function1<? super getTime, Unit> function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i3) throws Throwable {
        int i4;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj;
        boolean z5;
        Object obj2;
        long jNewSession;
        long jNewSession2;
        long jPostMessage;
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        float f;
        Object obj3;
        int i6;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1139627897);
        if ((i3 & 6) == 0) {
            int i8 = onTransact + 77;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gettime) ? 4 : 2) | i3;
            int i10 = onTransact + 57;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            int i12 = onTransact + 125;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gettime2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2)) {
                int i14 = onNavigationEvent + 23;
                onTransact = i14 % 128;
                int i15 = i14 % 2;
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
        }
        if ((i3 & 24576) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 16384 : 8192;
        }
        int i16 = i4;
        if ((i16 & 9363) != 9362) {
            int i17 = onNavigationEvent + 57;
            onTransact = i17 % 128;
            z = i17 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i16 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1139627897, i16, -1, "im.toss.feature.credit.ui.main.home.component.CompactScoreSection (CreditHomeScoreSection.kt:179)");
            }
            boolean z6 = i == 0 && i2 == 0;
            final long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(12);
            int i18 = i16 & 14;
            boolean z7 = i18 == 4;
            int i19 = i16 & 112;
            boolean z8 = i19 == 32;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(z7 | z8)) {
                Object obj4 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(20)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                    obj4 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) obj4;
                if (i18 == 4) {
                    i5 = 32;
                    z2 = true;
                } else {
                    i5 = 32;
                    z2 = false;
                }
                boolean z9 = i19 == i5;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z9 | z2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted2);
                    objOnMinimized2 = getsupportedhighspeedresolutionsforOnWarmupCompleted2;
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                if (i18 == 4) {
                    int i20 = onNavigationEvent + 73;
                    onTransact = i20 % 128;
                    int i21 = i20 % 2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i19 == 32) {
                    int i22 = onTransact + 3;
                    onNavigationEvent = i22 % 128;
                    int i23 = i22 % 2;
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(z3 | z4)) {
                    int i24 = onTransact + 27;
                    onNavigationEvent = i24 % 128;
                    if (i24 % 2 != 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted3);
                        objOnMinimized3 = getsupportedhighspeedresolutionsforOnWarmupCompleted3;
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                    if (!onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor3)) {
                        int i25 = onTransact + 25;
                        onNavigationEvent = i25 % 128;
                        if (i25 % 2 != 0) {
                            ((Boolean) onNavigationEvent(-2094738366, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 2094738375, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor4})).booleanValue();
                            Object obj6 = null;
                            obj6.hashCode();
                            throw null;
                        }
                        if (((Boolean) onNavigationEvent(-2094738366, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 2094738375, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor4})).booleanValue()) {
                            obj = null;
                            z5 = false;
                        } else {
                            obj = null;
                            z5 = true;
                        }
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, obj), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
                        component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            int i26 = onTransact + 47;
                            onNavigationEvent = i26 % 128;
                            int i27 = i26 % 2;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                        RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                        long jOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk>) getsupportedhighspeedresolutionsfor2);
                        float f2 = z5 ? 1.0f : 0.0f;
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnNavigationEvent || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized4 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda20
                                private static int IAuthTabCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke() {
                                    int i28 = 2 % 2;
                                    int i29 = IAuthTabCallback + 59;
                                    onNavigationEvent = i29 % 128;
                                    if (i29 % 2 != 0) {
                                        RuntimeHelper1.onWarmupCompleted(jOnExtraCallback, getsupportedhighspeedresolutionsfor2);
                                        throw null;
                                    }
                                    Unit unitOnWarmupCompleted = RuntimeHelper1.onWarmupCompleted(jOnExtraCallback, getsupportedhighspeedresolutionsfor2);
                                    int i30 = onNavigationEvent + 17;
                                    IAuthTabCallback = i30 % 128;
                                    int i31 = i30 % 2;
                                    return unitOnWarmupCompleted;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                        }
                        Function0 function0 = (Function0) objOnMinimized4;
                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor3);
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnNavigationEvent2) {
                            Object obj7 = objOnMinimized5;
                            if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                Function1 function12 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda21
                                    private static int onExtraCallback = 1;
                                    private static int onExtraCallbackWithResult;

                                    public final Object invoke(Object obj8) {
                                        int i28 = 2 % 2;
                                        int i29 = onExtraCallback + 51;
                                        onExtraCallbackWithResult = i29 % 128;
                                        int i30 = i29 % 2;
                                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = getsupportedhighspeedresolutionsfor3;
                                        Boolean bool = (Boolean) obj8;
                                        if (i30 == 0) {
                                            return RuntimeHelper1.onWarmupCompleted(getsupportedhighspeedresolutionsfor5, bool.booleanValue());
                                        }
                                        RuntimeHelper1.onWarmupCompleted(getsupportedhighspeedresolutionsfor5, bool.booleanValue());
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function12);
                                obj7 = function12;
                            }
                            Function1 function13 = (Function1) obj7;
                            int i28 = i16 & 57344;
                            boolean z10 = i28 == 16384;
                            boolean z11 = i18 == 4;
                            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if ((z10 || z11) || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda22
                                    private static int IAuthTabCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke() {
                                        int i29 = 2 % 2;
                                        int i30 = onExtraCallbackWithResult + 17;
                                        IAuthTabCallback = i30 % 128;
                                        int i31 = i30 % 2;
                                        Unit unitOnWarmupCompleted = RuntimeHelper1.onWarmupCompleted(function1, gettime);
                                        int i32 = IAuthTabCallback + 39;
                                        onExtraCallbackWithResult = i32 % 128;
                                        if (i32 % 2 != 0) {
                                            return unitOnWarmupCompleted;
                                        }
                                        Object obj8 = null;
                                        obj8.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                                obj2 = function02;
                            } else {
                                obj2 = objOnMinimized6;
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, gettime, i, z6, jOnNavigationEvent, f2, function0, function13, (Function0) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i16 & 896) | ((i16 << 3) & 112), 0);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f));
                            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                            if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(930790041);
                                jNewSession = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).postMessage();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(930788857);
                                jNewSession = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).newSession();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(jNewSession, 0.0f)));
                            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(930795545);
                                jNewSession2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).newSessionWithExtras();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(930796729);
                                jNewSession2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).newSession();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(Float.valueOf(0.5f), setByteOrder.onNavigationEvent(jNewSession2));
                            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(930799673);
                                jPostMessage = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).newSession();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(930800857);
                                jPostMessage = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).postMessage();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(setMaxAdCount.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(jPostMessage, 0.0f)))}, 90.0f, 0, cameraCaptureResultEmptyCameraCaptureResult2, 390, 4), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                            long jOnNavigationEvent2 = onNavigationEvent((getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk>) getsupportedhighspeedresolutionsfor2);
                            if (z5) {
                                f = 1.0f;
                                getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor2;
                            } else {
                                getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor2;
                                f = 0.0f;
                            }
                            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (!zOnNavigationEvent3) {
                                Object obj8 = objOnMinimized7;
                                if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    Function0 function03 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda23
                                        private static int onExtraCallbackWithResult = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke() {
                                            int i29 = 2 % 2;
                                            int i30 = onExtraCallbackWithResult + 101;
                                            onWarmupCompleted = i30 % 128;
                                            int i31 = i30 % 2;
                                            Unit unitOnExtraCallbackWithResult = RuntimeHelper1.onExtraCallbackWithResult(jOnExtraCallback, getsupportedhighspeedresolutionsfor);
                                            int i32 = onExtraCallbackWithResult + 101;
                                            onWarmupCompleted = i32 % 128;
                                            if (i32 % 2 == 0) {
                                                int i33 = 0 / 0;
                                            }
                                            return unitOnExtraCallbackWithResult;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function03);
                                    obj8 = function03;
                                }
                                Function0 function04 = (Function0) obj8;
                                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor4);
                                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (!zOnNavigationEvent4) {
                                    Object obj9 = objOnMinimized8;
                                    if (objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Function1 function14 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda24
                                            private static int onNavigationEvent = 0;
                                            private static int onWarmupCompleted = 1;

                                            public final Object invoke(Object obj10) {
                                                int i29 = 2 % 2;
                                                int i30 = onWarmupCompleted + 65;
                                                onNavigationEvent = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    RuntimeHelper1.IAuthTabCallback(getsupportedhighspeedresolutionsfor4, ((Boolean) obj10).booleanValue());
                                                    throw null;
                                                }
                                                Unit unitIAuthTabCallback = RuntimeHelper1.IAuthTabCallback(getsupportedhighspeedresolutionsfor4, ((Boolean) obj10).booleanValue());
                                                int i31 = onNavigationEvent + 103;
                                                onWarmupCompleted = i31 % 128;
                                                if (i31 % 2 == 0) {
                                                    int i32 = 45 / 0;
                                                }
                                                return unitIAuthTabCallback;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function14);
                                        obj9 = function14;
                                    }
                                    Function1 function15 = (Function1) obj9;
                                    boolean z12 = i28 == 16384;
                                    boolean z13 = i19 == 32;
                                    Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                    if ((z12 || z13) || objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Function0 function05 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda25
                                            private static int onExtraCallback = 1;
                                            private static int onExtraCallbackWithResult;

                                            public final Object invoke() {
                                                int i29 = 2 % 2;
                                                int i30 = onExtraCallbackWithResult + 21;
                                                onExtraCallback = i30 % 128;
                                                if (i30 % 2 == 0) {
                                                    RuntimeHelper1.onExtraCallbackWithResult(function1, gettime2);
                                                    throw null;
                                                }
                                                Unit unitOnExtraCallbackWithResult = RuntimeHelper1.onExtraCallbackWithResult(function1, gettime2);
                                                int i31 = onExtraCallback + 51;
                                                onExtraCallbackWithResult = i31 % 128;
                                                if (i31 % 2 != 0) {
                                                    int i32 = 28 / 0;
                                                }
                                                return unitOnExtraCallbackWithResult;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function05);
                                        obj3 = function05;
                                    } else {
                                        obj3 = objOnMinimized9;
                                    }
                                    onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback2, gettime2, i2, z6, jOnNavigationEvent2, f, function04, function15, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResult2, i19 | ((i16 >> 3) & 896), 0);
                                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda26
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj10, Object obj11) throws Throwable {
                    int i29 = 2 % 2;
                    int i30 = onExtraCallbackWithResult + 95;
                    onWarmupCompleted = i30 % 128;
                    int i31 = i30 % 2;
                    Unit unitOnExtraCallbackWithResult = RuntimeHelper1.onExtraCallbackWithResult(gettime, gettime2, i, i2, function1, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj10, ((Integer) obj11).intValue());
                    int i32 = onWarmupCompleted + 71;
                    onExtraCallbackWithResult = i32 % 128;
                    int i33 = i32 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
    }

    private static final Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0 A[PHI: r7
      0x00a0: PHI (r7v36 int) = (r7v11 int), (r7v17 int), (r7v19 int) binds: [B:54:0x009e, B:61:0x00c2, B:60:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final getTime gettime, final int i, boolean z, long j, float f, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, final Function0<Unit> function02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) throws Throwable {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z2;
        final long j2;
        final float f2;
        final Function0<Unit> function03;
        final Function1<? super Boolean, Unit> function12;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        Function0<Unit> function04;
        Function1<? super Boolean, Unit> function13;
        int iOnNavigationEvent;
        Function1<? super Boolean, Unit> function14;
        String strIntern;
        int i13;
        Object obj;
        int i14;
        long jITrustedWebActivityService;
        String str;
        final Function0<Unit> function05;
        final Function1<? super Boolean, Unit> function15;
        Object obj2;
        long jLongValue;
        long jLongValue2;
        int i15 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1412383832);
        int i16 = i3 & 1;
        if (i16 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gettime) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 256 : 128;
        }
        int i17 = i3 & 8;
        if (i17 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                        int i18 = onNavigationEvent + 21;
                        onTransact = i18 % 128;
                        i6 = i18 % 2 == 0 ? 7417 : 16384;
                    } else {
                        i6 = 8192;
                    }
                    i7 = i6 | i4;
                }
                i8 = i3 & 32;
                int i19 = 196608;
                if (i8 != 0) {
                    i7 |= i19;
                } else if ((196608 & i2) == 0) {
                    int i20 = onNavigationEvent + 81;
                    onTransact = i20 % 128;
                    int i21 = i20 % 2;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                        int i22 = onNavigationEvent + 89;
                        onTransact = i22 % 128;
                        int i23 = i22 % 2;
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i7 |= i19;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i7 |= 1572864;
                } else {
                    if ((1572864 & i2) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                            int i24 = onNavigationEvent + 49;
                            onTransact = i24 % 128;
                            int i25 = i24 % 2;
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i11 = i10 | i7;
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        if ((12582912 & i2) == 0) {
                            i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 8388608 : 4194304;
                        }
                        if ((i2 & 100663296) == 0) {
                            i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 67108864 : 33554432;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i11 & 38347923) != 38347922, i11 & 1)) {
                            if (i16 != 0) {
                                int i26 = onNavigationEvent + 17;
                                onTransact = i26 % 128;
                                int i27 = i26 % 2;
                                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                            } else {
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                            }
                            boolean z3 = i17 != 0 ? false : z;
                            long jOnExtraCallback = i5 != 0 ? RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(20) : j;
                            float f3 = i8 != 0 ? 1.0f : f;
                            if (i9 != 0) {
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda1
                                        private static int onExtraCallbackWithResult = 1;
                                        private static int onNavigationEvent;

                                        public final Object invoke() {
                                            int i28 = 2 % 2;
                                            int i29 = onExtraCallbackWithResult + 53;
                                            onNavigationEvent = i29 % 128;
                                            if (i29 % 2 != 0) {
                                                RuntimeHelper1.onWarmupCompleted();
                                                throw null;
                                            }
                                            Unit unitOnWarmupCompleted = RuntimeHelper1.onWarmupCompleted();
                                            int i30 = onNavigationEvent + 31;
                                            onExtraCallbackWithResult = i30 % 128;
                                            int i31 = i30 % 2;
                                            return unitOnWarmupCompleted;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                }
                                function04 = (Function0) objOnMinimized;
                            } else {
                                function04 = function0;
                            }
                            if (i12 != 0) {
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized2 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda2
                                        private static int onExtraCallback = 1;
                                        private static int onExtraCallbackWithResult;

                                        public final Object invoke(Object obj3) {
                                            int i28 = 2 % 2;
                                            int i29 = onExtraCallback + 111;
                                            onExtraCallbackWithResult = i29 % 128;
                                            int i30 = i29 % 2;
                                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                            if (i30 != 0) {
                                                Object[] objArr = {Boolean.valueOf(zBooleanValue)};
                                                throw null;
                                            }
                                            Object[] objArr2 = {Boolean.valueOf(zBooleanValue)};
                                            Unit unit = (Unit) RuntimeHelper1.onNavigationEvent(-1627094706, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1627094719, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr2);
                                            int i31 = onExtraCallbackWithResult + 69;
                                            onExtraCallback = i31 % 128;
                                            int i32 = i31 % 2;
                                            return unit;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                }
                                function13 = (Function1) objOnMinimized2;
                            } else {
                                function13 = function1;
                            }
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1412383832, i11, -1, "im.toss.feature.credit.ui.main.home.component.CompactScoreItem (CreditHomeScoreSection.kt:253)");
                            }
                            boolean zOnExtraCallbackWithResult = addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            boolean z4 = gettime instanceof getTime.onNavigationEvent;
                            getTime.onNavigationEvent onnavigationevent = z4 ? (getTime.onNavigationEvent) gettime : null;
                            if (onnavigationevent != null) {
                                int i28 = onTransact + 61;
                                onNavigationEvent = i28 % 128;
                                int i29 = i28 % 2;
                                iOnNavigationEvent = onnavigationevent.onNavigationEvent();
                            } else {
                                iOnNavigationEvent = 0;
                            }
                            final float fIAuthTabCallback = IAuthTabCallback(iOnNavigationEvent);
                            if (i > 0 || !(!z3)) {
                                z2 = z3;
                                if (zOnExtraCallbackWithResult) {
                                    function14 = function13;
                                    Object[] objArr = new Object[1];
                                    a(1884070889 - ExpandableListView.getPackedPositionGroup(0L), (char) TextUtils.getOffsetAfter("", 0), new char[]{23263, 21972, 2215, 56603, 56447, 29979, 55046, 1792, 40103, 38845, 47906, 21731, 3788, 26981, 27651, 45141, 60280, 4250, 47678, 31093, 32641, 15383, 9607, 53754, 11026, 9071, 40763, 62197, 31526, 22636, 13191, 2698, 41853, 11324, 7301, 1529, 24038, 23641, 35274, 6596, 18799, 31042, 9531, 4310, 13821, 17221, 60759, 7019, 20115, 11424, 38106}, new char[]{59799, 19619, 11632, 36764}, new char[]{0, 0, 0, 0}, objArr);
                                    strIntern = ((String) objArr[0]).intern();
                                } else {
                                    function14 = function13;
                                    Object[] objArr2 = new Object[1];
                                    a(((byte) KeyEvent.getModifierMetaStateMask()) + 1289022593, (char) KeyEvent.normalizeMetaState(0), new char[]{42982, 35201, 39382, 14538, 63185, 26149, 47144, 2966, 13649, 60920, 50928, 19781, 38654, 39258, 9637, 51398, 1570, 1277, 51612, 4083, 16991, 59336, 56736, 15054, 2331, 10700, 9522, 39687, 16375, 40955, 60212, 45854, 54322, 25034, 17235, 21949, 42699, 29373, 7728, 54434, 23838, 26832, 62267, 14423, 51885, 50624, 28739}, new char[]{32976, 54508, 1356, 44142}, new char[]{0, 0, 0, 0}, objArr2);
                                    strIntern = ((String) objArr2[0]).intern();
                                }
                            } else {
                                if (i < 0) {
                                    int i30 = onTransact + 119;
                                    onNavigationEvent = i30 % 128;
                                    if (i30 % 2 != 0) {
                                        throw null;
                                    }
                                    if (!zOnExtraCallbackWithResult) {
                                        z2 = z3;
                                        Object[] objArr3 = new Object[1];
                                        b(new int[]{1514985068, 1812232243, 226940015, -456881095, -158313399, 215483794, -780434404, -1066098462, -47279874, 1194012084, 2137708069, 1002557504, -2133428432, -1912790774, 2104806157, 393349542, 141459254, 1301056155, 21905255, -1335713889, -379012537, 1361775646, -1427739578, 866986295, -2122667173, -915128396}, 50 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
                                        strIntern = ((String) objArr3[0]).intern();
                                    } else {
                                        z2 = z3;
                                        Object[] objArr4 = new Object[1];
                                        b(new int[]{1514985068, 1812232243, 226940015, -456881095, -158313399, 215483794, -780434404, -1066098462, -47279874, 1194012084, 2137708069, 1002557504, -2133428432, -1912790774, 2104806157, 393349542, 141459254, 1301056155, 21905255, -1335713889, -1384249765, 37548612, 772602996, -281394129, -1427739578, 866986295, -2122667173, -915128396}, (ViewConfiguration.getEdgeSlop() >> 16) + 53, objArr4);
                                        strIntern = ((String) objArr4[0]).intern();
                                    }
                                } else {
                                    z2 = z3;
                                    if (zOnExtraCallbackWithResult) {
                                        Object[] objArr5 = new Object[1];
                                        b(new int[]{1514985068, 1812232243, 226940015, -456881095, -158313399, 215483794, -780434404, -1066098462, -47279874, 1194012084, 2137708069, 1002557504, -2133428432, -1912790774, 1575824775, -80475601, -160337084, -2022950719, 1022089748, 1085825986, 23700654, 1388694977, -760087321, -214965214, -1520958225, 1987645056}, 52 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr5);
                                        strIntern = ((String) objArr5[0]).intern();
                                    } else {
                                        Object[] objArr6 = new Object[1];
                                        b(new int[]{1514985068, 1812232243, 226940015, -456881095, -158313399, 215483794, -780434404, -1066098462, -47279874, 1194012084, 2137708069, 1002557504, -2133428432, -1912790774, 1575824775, -80475601, -160337084, -2022950719, 1022089748, 1085825986, -786129893, 1429634017, -1520958225, 1987645056}, 47 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr6);
                                        strIntern = ((String) objArr6[0]).intern();
                                        function14 = function13;
                                    }
                                }
                                function14 = function13;
                            }
                            if (zOnExtraCallbackWithResult) {
                                int i31 = onTransact + 97;
                                onNavigationEvent = i31 % 128;
                                if (i31 % 2 != 0) {
                                    i13 = 0;
                                    Object[] objArr7 = new Object[1];
                                    b(new int[]{1514985068, 1812232243, 226940015, -456881095, -158313399, 215483794, -780434404, -1066098462, -47279874, 1194012084, -806391129, -1504225148, -1836940236, 2055058964, 1153002852, 1816253604, 1934929105, 99218318, 772602996, -281394129, 1018642127, 1786529994, -1815526558, -567410927}, KeyEvent.normalizeMetaState(0) * 108, objArr7);
                                    obj = objArr7[0];
                                } else {
                                    i13 = 0;
                                    Object[] objArr8 = new Object[1];
                                    b(new int[]{1514985068, 1812232243, 226940015, -456881095, -158313399, 215483794, -780434404, -1066098462, -47279874, 1194012084, -806391129, -1504225148, -1836940236, 2055058964, 1153002852, 1816253604, 1934929105, 99218318, 772602996, -281394129, 1018642127, 1786529994, -1815526558, -567410927}, KeyEvent.normalizeMetaState(0) + 48, objArr8);
                                    obj = objArr8[0];
                                }
                            } else {
                                i13 = 0;
                                Object[] objArr9 = new Object[1];
                                b(new int[]{1514985068, 1812232243, 226940015, -456881095, -158313399, 215483794, -780434404, -1066098462, -47279874, 1194012084, -806391129, -1504225148, -1836940236, 2055058964, 1153002852, 1816253604, 1934929105, 99218318, -1753822217, 1936330907, 1018642127, 1786529994, -1815526558, -567410927}, 47 - ExpandableListView.getPackedPositionChild(0L), objArr9);
                                obj = objArr9[0];
                            }
                            String strIntern2 = ((String) obj).intern();
                            Function0<Unit> function06 = function04;
                            float f4 = f3;
                            int i32 = i13;
                            SnapshotKtExternalSyntheticLambda1 snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult = SaverKtExternalSyntheticLambda0.onExtraCallbackWithResult(RememberLottieCompositionKt.onExtraCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.IAuthTabCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.onNavigationEvent(strIntern)), (String) null, (String) null, (String) null, (String) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 62).onWarmupCompleted(), false, false, false, (SnapshotKtExternalSyntheticLambda0) null, 0.0f, 0, (SnapshotCompanionExternalSyntheticLambda1) null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1022);
                            if ((234881024 & i11) == 67108864) {
                                int i33 = onNavigationEvent + 7;
                                onTransact = i33 % 128;
                                int i34 = i33 % 2;
                                i14 = 1;
                            } else {
                                i14 = i32;
                            }
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (i14 == 0) {
                                Object obj3 = objOnMinimized3;
                                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    Function0 function07 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda3
                                        private static int IAuthTabCallback = 0;
                                        private static int onExtraCallback = 1;

                                        public final Object invoke() {
                                            Unit unit;
                                            int i35 = 2 % 2;
                                            int i36 = onExtraCallback + 77;
                                            IAuthTabCallback = i36 % 128;
                                            if (i36 % 2 != 0) {
                                                Object[] objArr10 = {function02};
                                                int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                                                unit = (Unit) RuntimeHelper1.onNavigationEvent(1850616675, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1850616658, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr10);
                                                int i37 = 77 / 0;
                                            } else {
                                                Object[] objArr11 = {function02};
                                                int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                                                unit = (Unit) RuntimeHelper1.onNavigationEvent(1850616675, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1850616658, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, objArr11);
                                            }
                                            int i38 = onExtraCallback + 101;
                                            IAuthTabCallback = i38 % 128;
                                            if (i38 % 2 == 0) {
                                                return unit;
                                            }
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function07);
                                    obj3 = function07;
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = configureReward.onExtraCallback(quirksExternalSyntheticBackport03, (getConfiguration) null, (getCachingExecutorService) null, false, false, false, false, (String) null, (Role) null, (Function0) obj3, 255, (Object) null);
                                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                                QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = onextracallbackwithresult.IAuthTabCallbackDefault();
                                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i32));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
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
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(54.0f));
                                if (zOnExtraCallbackWithResult) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(129531593);
                                    jITrustedWebActivityService = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallback();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(129533001);
                                    jITrustedWebActivityService = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityService();
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, jITrustedWebActivityService, RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f)));
                                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onExtraCallback(), false);
                                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                    getAwbState.onExtraCallback();
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), onextracallbackwithresult.IAuthTabCallback_Parcel());
                                immediateFailedFuture.IAuthTabCallback iAuthTabCallback = immediateFailedFuture.Companion;
                                AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{strIntern2, quirksExternalSyntheticBackport0OnWarmupCompleted3, null, null, null, null, null, null, iAuthTabCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663296, 764}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = CaptureNoResponseQuirk.onWarmupCompleted(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), onextracallbackwithresult.IAuthTabCallback_Parcel()), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-5.0f), 1, (Object) null);
                                ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2IAuthTabCallback = snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult.IAuthTabCallback();
                                immediateFailedFuture immediatefailedfutureOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                                AppLovinFullscreenImmersiveActivity appLovinFullscreenImmersiveActivityOnExtraCallbackWithResult = showAndRender.onExtraCallbackWithResult(composableLambdaImplExternalSyntheticLambda2IAuthTabCallback);
                                boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fIAuthTabCallback);
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!zIAuthTabCallback) {
                                    Object obj4 = objOnMinimized4;
                                    if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Function0 function08 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda4
                                            private static int onExtraCallbackWithResult = 0;
                                            private static int onNavigationEvent = 1;

                                            public final Object invoke() {
                                                int i35 = 2 % 2;
                                                int i36 = onNavigationEvent + 51;
                                                onExtraCallbackWithResult = i36 % 128;
                                                if (i36 % 2 != 0) {
                                                    Float.valueOf(RuntimeHelper1.onWarmupCompleted(fIAuthTabCallback));
                                                    Object obj5 = null;
                                                    obj5.hashCode();
                                                    throw null;
                                                }
                                                Float fValueOf = Float.valueOf(RuntimeHelper1.onWarmupCompleted(fIAuthTabCallback));
                                                int i37 = onExtraCallbackWithResult + 51;
                                                onNavigationEvent = i37 % 128;
                                                if (i37 % 2 == 0) {
                                                    int i38 = 77 / 0;
                                                }
                                                return fValueOf;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function08);
                                        obj4 = function08;
                                    }
                                    ReadonlySnapshot.onWarmupCompleted(composableLambdaImplExternalSyntheticLambda2IAuthTabCallback, (Function0) obj4, setAdVideoPlaybackListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted4, "LottieAnimation", (Object) null, appLovinFullscreenImmersiveActivityOnExtraCallbackWithResult), false, false, false, false, (RenderMode) null, false, (SnapshotStateObserverExternalSyntheticLambda0) null, (QuirkSettingsLoader) null, immediatefailedfutureOnExtraCallbackWithResult, false, false, (Map) null, (ComposableLambdaImplExternalSyntheticLambda4) null, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 48, 129016);
                                    onWarmupCompleted(CaptureNoResponseQuirk.onWarmupCompleted(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), 1, (Object) null), i, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i11 >> 3) & 112) | 6, 0);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                    int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                                    Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                        getAwbState.onExtraCallback();
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                    }
                                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
                                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                                    if (z4) {
                                        str = ((getTime.onNavigationEvent) gettime).onNavigationEvent() + "점";
                                    } else {
                                        str = "-";
                                    }
                                    String str2 = str;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = onCaptureSessionStart.onExtraCallback(onextracallback, f4);
                                    isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                                    GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isrepeatingenabled.onExtraCallbackWithResult();
                                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                                    long jLongValue3 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                                    boolean z5 = (29360128 & i11) == 8388608;
                                    boolean z6 = (3670016 & i11) == 1048576;
                                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!(!(z6 | z5)) || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        function05 = function06;
                                        function15 = function14;
                                        Function1 function16 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda5
                                            private static int onExtraCallbackWithResult = 1;
                                            private static int onWarmupCompleted;

                                            public final Object invoke(Object obj5) {
                                                int i35 = 2 % 2;
                                                int i36 = onExtraCallbackWithResult + 107;
                                                onWarmupCompleted = i36 % 128;
                                                int i37 = i36 % 2;
                                                Unit unitOnExtraCallbackWithResult = RuntimeHelper1.onExtraCallbackWithResult(function15, function05, (SurfaceProcessorNodeOut) obj5);
                                                int i38 = onWarmupCompleted + 45;
                                                onExtraCallbackWithResult = i38 % 128;
                                                int i39 = i38 % 2;
                                                return unitOnExtraCallbackWithResult;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function16);
                                        obj2 = function16;
                                    } else {
                                        function05 = function06;
                                        function15 = function14;
                                        obj2 = objOnMinimized5;
                                    }
                                    Function1<? super Boolean, Unit> function17 = function15;
                                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, quirksExternalSyntheticBackport0OnExtraCallback2, null, Long.valueOf(jLongValue3), Long.valueOf(jOnExtraCallback), 0L, null, 1, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnExtraCallbackWithResult, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i11 & 57344) | 12582912), 221184, 16228}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                    component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                                    int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                                    Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
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
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnExtraCallback2, onextracallbackwithresult2.asBinder());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
                                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted6, onextracallbackwithresult2.onTransact());
                                    String strName = gettime.IAuthTabCallback().name();
                                    GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub = isrepeatingenabled.IAuthTabCallbackStub();
                                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(815989953);
                                        jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(815990913);
                                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strName, null, null, Long.valueOf(jLongValue), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoIAuthTabCallbackStub, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 196608, 98278}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
                                    int i35 = R.drawable.icon_arrow_right_mono;
                                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                        int i36 = onTransact + 85;
                                        onNavigationEvent = i36 % 128;
                                        if (i36 % 2 != 0) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(816000001);
                                            jLongValue2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 10).onUnminimized();
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(816000001);
                                            jLongValue2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onUnminimized();
                                        }
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(816000961);
                                        jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    AppLovinNativeAdImplc.onExtraCallback(i35, quirksExternalSyntheticBackport0IAuthTabCallbackDefault2, jLongValue2, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663344, 248);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                    f2 = f4;
                                    function03 = function05;
                                    j2 = jOnExtraCallback;
                                    function12 = function17;
                                }
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            z2 = z;
                            j2 = j;
                            f2 = f;
                            function03 = function0;
                            function12 = function1;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                            final boolean z7 = z2;
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda6
                                private static int IAuthTabCallback = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj5, Object obj6) throws Throwable {
                                    int i37 = 2 % 2;
                                    int i38 = IAuthTabCallback + 17;
                                    onWarmupCompleted = i38 % 128;
                                    int i39 = i38 % 2;
                                    Unit unitOnExtraCallbackWithResult = RuntimeHelper1.onExtraCallbackWithResult(quirksExternalSyntheticBackport05, gettime, i, z7, j2, f2, function03, function12, function02, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                    int i40 = onWarmupCompleted + 91;
                                    IAuthTabCallback = i40 % 128;
                                    int i41 = i40 % 2;
                                    return unitOnExtraCallbackWithResult;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i11 |= 12582912;
                    if ((i2 & 100663296) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i11 & 38347923) != 38347922, i11 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i11 = i7;
                i12 = i3 & 128;
                if (i12 != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i11 & 38347923) != 38347922, i11 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i7 = i4;
            i8 = i3 & 32;
            int i192 = 196608;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i11 = i7;
            i12 = i3 & 128;
            if (i12 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i11 & 38347923) != 38347922, i11 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i7 = i4;
        i8 = i3 & 32;
        int i1922 = 196608;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i11 = i7;
        i12 = i3 & 128;
        if (i12 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i11 & 38347923) != 38347922, i11 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final void onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) throws Throwable {
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        long jLongValue;
        Pair pairIAuthTabCallback;
        long jAudioAttributesImplBaseParcelizer;
        long jOnExtraCallbackWithResult;
        int i5;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1283215572);
        int i7 = i3 & 1;
        if (i7 != 0) {
            int i8 = onTransact + 113;
            onNavigationEvent = i8 % 128;
            i4 = i8 % 2 != 0 ? i2 | 114 : i2 | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i2 & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i2;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                int i9 = onTransact + 103;
                onNavigationEvent = i9 % 128;
                i5 = i9 % 2 != 0 ? 127 : 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i4 & 19) != 18) {
            int i10 = onNavigationEvent + 43;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
            int i12 = onNavigationEvent + 57;
            onTransact = i12 % 128;
            int i13 = i12 % 2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i7 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1283215572, i4, -1, "im.toss.feature.credit.ui.main.home.component.CompactDeltaArrow (CreditHomeScoreSection.kt:340)");
            }
            boolean zOnExtraCallbackWithResult = addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (i > 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-514545048);
                Object[] objArr = new Object[1];
                a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) Color.blue(0), new char[]{48847, 18108, 54139, 21400, 47694, 26547, 23087, 27384, 42233, 24965, 21471, 48106, 61941, 14516, 5468, 13796, 56526, 29606, 57433, 58683, 56822, 36255, 40574, 40340, 35921, 26340, 11980, 20098, 57022, 28024, 23727, 12829, 56753, 62645, 38007, 49111, 18897, 23023, 4142, 30886, 3794, 34107, 44706, 64102, 19363, 7806, 8042, 47031, 24181, 51793, 52065, 28065, 13544, 7489, 58523, 22726, 8839, 8491, 61873, 740, 35387, 31993}, new char[]{54793, 8562, 61533, 47705}, new char[]{0, 0, 0, 0}, objArr);
                pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), setByteOrder.onNavigationEvent(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else if (i < 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-514541013);
                if (!(!zOnExtraCallbackWithResult)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-514538240);
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-514536939);
                        jOnExtraCallbackWithResult = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).MediaMetadataCompat();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-514535915);
                        jOnExtraCallbackWithResult = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).MediaBrowserCompatMediaItem();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-514532612);
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-514534027);
                        jAudioAttributesImplBaseParcelizer = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).RatingCompatApi19Impl();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-514533003);
                        jAudioAttributesImplBaseParcelizer = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).AudioAttributesImplBaseParcelizer();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    jOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(jAudioAttributesImplBaseParcelizer, 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(jOnExtraCallbackWithResult);
                Object[] objArr2 = new Object[1];
                b(new int[]{1514985068, 1812232243, 226940015, -456881095, -158313399, 215483794, -780434404, -1066098462, -47279874, 1194012084, -806391129, -1504225148, -1836940236, 2055058964, 1153002852, 1816253604, 1934929105, 99218318, -1059875449, -2131268665, -799714531, -1150297967, -1063418447, 1020942127, -1237261112, 1666938852, -1758409910, -68890187, -874061409, 547766369, -1815526558, -567410927}, Drawable.resolveOpacity(0, 0) + 64, objArr2);
                pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), setbyteorderOnNavigationEvent);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-514530425);
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda03 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda03, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-514526829);
                    jLongValue = y3externalsyntheticlambda03.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onUnminimized();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-514525869);
                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda03.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                Object[] objArr3 = new Object[1];
                a(MotionEvent.axisFromString("") + 1622314258, (char) (50722 - (ViewConfiguration.getLongPressTimeout() >> 16)), new char[]{27045, 50974, 26097, 4110, 12762, 13063, 54018, 249, 19329, 42919, 3254, 61087, 21928, 43735, 11687, 36382, 50427, 55452, 33841, 63453, 7496, 56300, 54029, 7109, 51725, 15163, 1977, 24998, 26905, 18859, 38737, 35707, 11722, 7595, 14956, 45075, 29461, 13128, 14996, 19675, 14146, 59025, 11396, 42551, 12558, 45696, 55895, 49304, 2643, 7708, 62854, 21411, 56864, 33048, 16834, 65334, 40564, 42059, 47431, 41911, 6695, 19743, 21435, 48063, 61746, 17401, 59847}, new char[]{4570, 45709, 8800, 54982}, new char[]{0, 0, 0, 0}, objArr3);
                pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), setByteOrder.onNavigationEvent(jLongValue));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinNativeAdImplc.onExtraCallback((String) pairIAuthTabCallback.onExtraCallbackWithResult(), ((setByteOrder) pairIAuthTabCallback.IAuthTabCallback()).access100(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport03, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), (String) null, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1016);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onTransact + 33;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) {
                    int i16 = 2 % 2;
                    int i17 = IAuthTabCallback + 37;
                    onExtraCallbackWithResult = i17 % 128;
                    int i18 = i17 % 2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                    if (i18 != 0) {
                        int i19 = i;
                        int i20 = i2;
                        int i21 = i3;
                        int iIntValue = ((Integer) obj2).intValue();
                        Object[] objArr4 = {quirksExternalSyntheticBackport05, Integer.valueOf(i19), Integer.valueOf(i20), Integer.valueOf(i21), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    int i22 = i;
                    int i23 = i2;
                    int i24 = i3;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    Object[] objArr5 = {quirksExternalSyntheticBackport05, Integer.valueOf(i22), Integer.valueOf(i23), Integer.valueOf(i24), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue2)};
                    int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                    Unit unit = (Unit) RuntimeHelper1.onNavigationEvent(-973349954, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 973349964, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, objArr5);
                    int i25 = onExtraCallbackWithResult + 59;
                    IAuthTabCallback = i25 % 128;
                    if (i25 % 2 == 0) {
                        int i26 = 91 / 0;
                    }
                    return unit;
                }
            });
        }
    }

    private static final Unit IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        asBinder(getsupportedhighspeedresolutionsfor, true);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return unit;
    }

    private static final float IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        if (((Boolean) onNavigationEvent(862608929, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -862608915, iIAuthTabCallback3, iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutionsfor})).booleanValue()) {
            return asBinder((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6);
        }
        float fOnTransact = onTransact((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62);
        int i4 = onNavigationEvent + 103;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return fOnTransact;
    }

    private static final Unit onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            int i3 = onTransact + 21;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        function0.invoke();
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(Context context, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        int iAsBinder = (int) (futures3.asBinder() >> 32);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(((Float) varyMatches.onNavigationEvent(1845166571, -1845166568, new Object[]{Integer.valueOf(iAsBinder), displayMetrics}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).floatValue()) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(22.0f));
        int iAsBinder2 = (int) futures3.asBinder();
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(((Float) varyMatches.onNavigationEvent(1845166571, -1845166568, new Object[]{Integer.valueOf(iAsBinder2), displayMetrics2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).floatValue()) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f));
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor, setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(fIAuthTabCallback) << 32) | (4294967295L & Float.floatToRawIntBits(fIAuthTabCallback2))));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 103;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(boolean z, setByteOrder setbyteorder, boolean z2, boolean z3, final Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws Throwable {
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        setByteOrder setbyteorder2;
        final boolean z5;
        final boolean z6;
        final boolean z7;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z8;
        long jOnTransact;
        int i8;
        long jLongValue;
        float fIAuthTabCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        long jLongValue2;
        boolean z9;
        long jIAuthTabCallbackDefault;
        int i9 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(24736923);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            z4 = z;
        } else if ((i & 6) == 0) {
            z4 = z;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4) ? 4 : 2) | i;
        } else {
            z4 = z;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setbyteorder) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                int i12 = onTransact + 103;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                        int i14 = onTransact + 125;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 == 0) {
                    if ((i & 3072) == 0) {
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 2048 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 16384 : 8192;
                    }
                    i7 = i3;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 9363) == 9362, i7 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        setbyteorder2 = setbyteorder;
                        z5 = z2;
                        z6 = z3;
                        z7 = z4;
                    } else {
                        boolean z10 = i10 != 0 ? false : z4;
                        setbyteorder2 = i11 != 0 ? null : setbyteorder;
                        if (i4 != 0) {
                            int i16 = onTransact + 63;
                            onNavigationEvent = i16 % 128;
                            int i17 = i16 % 2;
                            z8 = false;
                        } else {
                            z8 = z2;
                        }
                        boolean z11 = i6 != 0 ? false : z3;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(24736923, i7, -1, "im.toss.feature.credit.ui.main.home.component.ScoreRaiseNeonButton (CreditHomeScoreSection.kt:364)");
                        }
                        final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setUseCaseDetached.onNavigationEvent(setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L))), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                        Object[] objArr = new Object[1];
                        a(Color.alpha(0) + 802035564, (char) (32077 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), new char[]{3770, 5847, 28256, 32145, 775, 12681, 31088, 60654, 4777, 56912, 51731, 33668, 32135, 16469, 23561, 39908, 45817, 8571, 14181, 36300, 30230, 59940, 59903, 55022, 59909, 42414, 55926, 32076, 24052, 14628, 56221, 13740, 22817, 60333, 36870, 5822, 25905, 21960, 14342, ';', 27630, 25460, 59774, 43703, 11833, 53532, 10592, 5798, 29355, 20510, 3327, 58706, 25238, 24484, 30067}, new char[]{27876, 52759, 19503, 7549}, new char[]{0, 0, 0, 0}, objArr);
                        SnapshotKtExternalSyntheticLambda1 snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult = SaverKtExternalSyntheticLambda0.onExtraCallbackWithResult(RememberLottieCompositionKt.onExtraCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.IAuthTabCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.onNavigationEvent(((String) objArr[0]).intern())), (String) null, (String) null, (String) null, (String) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 62).onWarmupCompleted(), false, false, false, (SnapshotKtExternalSyntheticLambda0) null, 0.0f, 0, (SnapshotCompanionExternalSyntheticLambda1) null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1022);
                        float f = z10 ? 0.5f : 0.0f;
                        getCallToActionButton getcalltoactionbutton = getCallToActionButton.onExtraCallback;
                        getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(1000, 0, getcalltoactionbutton.onTransact(), 2, (Object) null);
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized3 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda11
                                private static int onNavigationEvent = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj) {
                                    int i18 = 2 % 2;
                                    int i19 = onNavigationEvent + 101;
                                    onWarmupCompleted = i19 % 128;
                                    int i20 = i19 % 2;
                                    Unit unitOnNavigationEvent = RuntimeHelper1.onNavigationEvent(getsupportedhighspeedresolutionsfor, ((Float) obj).floatValue());
                                    int i21 = onNavigationEvent + 79;
                                    onWarmupCompleted = i21 % 128;
                                    int i22 = i21 % 2;
                                    return unitOnNavigationEvent;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = isSubmitButtonEnabled.IAuthTabCallback(f, getthumbpositionOnExtraCallbackWithResult, 0.0f, "firstProgress", (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 27696, 4);
                        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = isSubmitButtonEnabled.IAuthTabCallback(((Boolean) onNavigationEvent(862608929, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -862608915, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor})).booleanValue() ? 1.0f : 0.5f, onQueryRefine.onExtraCallback(1000, 1000, getcalltoactionbutton.onTransact()), 0.0f, "secondProgress", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 20);
                        if (z10) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1997576881);
                            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1997575580);
                                jOnTransact = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1160806746, OverseasRrnInputTextField.IAuthTabCallback(), -1160806737)).longValue();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1997574556);
                                jOnTransact = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService_Parcel();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1997573534);
                            jOnTransact = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onTransact();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = updateSubmitButton.onExtraCallback(jOnTransact, onQueryRefine.onExtraCallbackWithResult(1000, 0, getcalltoactionbutton.onTransact(), 2, (Object) null), "buttonFirstTextColor", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 8);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1997565373);
                        if (((Boolean) onNavigationEvent(862608929, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -862608915, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor})).booleanValue()) {
                            int i18 = onNavigationEvent + 75;
                            onTransact = i18 % 128;
                            if (i18 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1997564254);
                                jLongValue = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 111).onTransact();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1997564254);
                                jLongValue = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onTransact();
                            }
                            i8 = 1;
                        } else {
                            y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                            i8 = 1;
                            if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1997561436);
                                jLongValue = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService_Parcel();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1997562460);
                                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1160806746, OverseasRrnInputTextField.IAuthTabCallback(), -1160806737)).longValue();
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        int i19 = i8;
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2 = updateSubmitButton.onExtraCallback(jLongValue, onQueryRefine.onExtraCallback(1000, 1000, getcalltoactionbutton.onTransact()), "buttonSecondTextColor", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 8);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                        if (z8) {
                            int i20 = onTransact + 97;
                            onNavigationEvent = i20 % 128;
                            if (i20 % 2 != 0) {
                                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
                                int i21 = 43 / 0;
                            } else {
                                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
                            }
                        } else {
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 0.0f, 0.0f, fIAuthTabCallback, 7, (Object) null), 0.0f, i19, (Object) null);
                        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onExtraCallback(), false);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            int i22 = onTransact + 39;
                            onNavigationEvent = i22 % 128;
                            if (i22 % 2 != 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                                throw null;
                            }
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
                        if (z10) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-950230657);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(Float.intBitsToFloat((int) (((Long) onNavigationEvent(-1279414723, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1279414734, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor2})).longValue() >> 32))), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(Float.intBitsToFloat((int) ((Long) onNavigationEvent(-1279414723, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1279414734, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor2})).longValue())));
                            ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2IAuthTabCallback = snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult.IAuthTabCallback();
                            immediateFailedFuture immediatefailedfutureOnNavigationEvent = immediateFailedFuture.Companion.onNavigationEvent();
                            AppLovinFullscreenImmersiveActivity appLovinFullscreenImmersiveActivityOnExtraCallbackWithResult = showAndRender.onExtraCallbackWithResult(composableLambdaImplExternalSyntheticLambda2IAuthTabCallback);
                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                                int i23 = onTransact + 9;
                                onNavigationEvent = i23 % 128;
                                int i24 = i23 % 2;
                                Object obj = objOnMinimized4;
                                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                    Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda12
                                        private static int onExtraCallback = 0;
                                        private static int onNavigationEvent = 1;

                                        public final Object invoke() {
                                            int i25 = 2 % 2;
                                            int i26 = onNavigationEvent + 61;
                                            onExtraCallback = i26 % 128;
                                            int i27 = i26 % 2;
                                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor;
                                            if (i27 == 0) {
                                                return Float.valueOf(RuntimeHelper1.onNavigationEvent(getsupportedhighspeedresolutionsfor3, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback));
                                            }
                                            int i28 = 60 / 0;
                                            return Float.valueOf(RuntimeHelper1.onNavigationEvent(getsupportedhighspeedresolutionsfor3, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback));
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                                    obj = function02;
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = setAdVideoPlaybackListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, "LottieAnimation", (Object) null, appLovinFullscreenImmersiveActivityOnExtraCallbackWithResult);
                                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                                ReadonlySnapshot.onWarmupCompleted(composableLambdaImplExternalSyntheticLambda2IAuthTabCallback, (Function0) obj, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, false, false, false, false, (RenderMode) null, false, (SnapshotStateObserverExternalSyntheticLambda0) null, (QuirkSettingsLoader) null, immediatefailedfutureOnNavigationEvent, false, false, (Map) null, (ComposableLambdaImplExternalSyntheticLambda4) null, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 48, 129016);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            }
                        } else {
                            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-949889161);
                            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(Float.intBitsToFloat((int) (((Long) onNavigationEvent(-1279414723, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1279414734, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor2})).longValue() >> 32))), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(Float.intBitsToFloat((int) ((Long) onNavigationEvent(-1279414723, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1279414734, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor2})).longValue()))), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(setExtensionStrength.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f))), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(Float.intBitsToFloat((int) ((Long) onNavigationEvent(-1279414723, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1279414734, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor2})).longValue()) == 0.0f ? 7.0f : 0.0f), 1, (Object) null);
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda03 = y3ExternalSyntheticLambda0.onExtraCallback;
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda03, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-949418519);
                            if (z11) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(939206698);
                                jLongValue2 = y3externalsyntheticlambda03.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallback();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(939208092);
                                jLongValue2 = y3externalsyntheticlambda03.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onRelationshipValidationResult();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-949283483);
                            jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda03.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult4 = verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult3, jLongValue2, RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f)));
                        if ((i7 & 57344) == 16384) {
                            int i25 = onTransact + 29;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!z9) {
                            Object obj2 = objOnMinimized5;
                            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                Function0 function03 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda13
                                    private static int onExtraCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke() {
                                        int i27 = 2 % 2;
                                        int i28 = onExtraCallbackWithResult + 79;
                                        onExtraCallback = i28 % 128;
                                        if (i28 % 2 != 0) {
                                            RuntimeHelper1.onNavigationEvent(function0);
                                            Object obj3 = null;
                                            obj3.hashCode();
                                            throw null;
                                        }
                                        Unit unitOnNavigationEvent = RuntimeHelper1.onNavigationEvent(function0);
                                        int i29 = onExtraCallback + 7;
                                        onExtraCallbackWithResult = i29 % 128;
                                        int i30 = i29 % 2;
                                        return unitOnNavigationEvent;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function03);
                                obj2 = function03;
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = configureReward.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult4, (getConfiguration) null, (getCachingExecutorService) null, true, false, false, true, (String) null, (Role) null, (Function0) obj2, 219, (Object) null);
                            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(!zOnExtraCallback) || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized6 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda14
                                    private static int onExtraCallbackWithResult = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj3) {
                                        Unit unitOnExtraCallbackWithResult;
                                        int i27 = 2 % 2;
                                        int i28 = onWarmupCompleted + 111;
                                        onExtraCallbackWithResult = i28 % 128;
                                        if (i28 % 2 == 0) {
                                            unitOnExtraCallbackWithResult = RuntimeHelper1.onExtraCallbackWithResult(context, getsupportedhighspeedresolutionsfor2, (Futures3) obj3);
                                            int i29 = 24 / 0;
                                        } else {
                                            unitOnExtraCallbackWithResult = RuntimeHelper1.onExtraCallbackWithResult(context, getsupportedhighspeedresolutionsfor2, (Futures3) obj3);
                                        }
                                        int i30 = onExtraCallbackWithResult + 19;
                                        onWarmupCompleted = i30 % 128;
                                        int i31 = i30 % 2;
                                        return unitOnExtraCallbackWithResult;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) objOnMinimized6);
                            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
                            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                int i27 = onTransact + 39;
                                onNavigationEvent = i27 % 128;
                                int i28 = i27 % 2;
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.main.R.string.credit_score_raise_btn, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            long jOnNavigationEvent = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f));
                            GraphicDeviceInfo graphicDeviceInfoAsBinder = GraphicDeviceInfo.Companion.asBinder();
                            if (setbyteorder2 != null) {
                                jIAuthTabCallbackDefault = setbyteorder2.access100();
                            } else {
                                if (((Boolean) onNavigationEvent(862608929, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -862608915, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor})).booleanValue()) {
                                    int i29 = onNavigationEvent + 101;
                                    onTransact = i29 % 128;
                                    int i30 = i29 % 2;
                                    jIAuthTabCallbackDefault = onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2);
                                } else {
                                    jIAuthTabCallbackDefault = IAuthTabCallbackDefault((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback);
                                }
                            }
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), null, Long.valueOf(jIAuthTabCallbackDefault), Long.valueOf(jOnNavigationEvent), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoAsBinder, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            z7 = z10;
                            z5 = z8;
                            z6 = z11;
                        }
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        final setByteOrder setbyteorder3 = setbyteorder2;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda15
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke(Object obj3, Object obj4) {
                                int i31 = 2 % 2;
                                int i32 = IAuthTabCallback + 43;
                                onExtraCallback = i32 % 128;
                                int i33 = i32 % 2;
                                Unit unitOnWarmupCompleted = RuntimeHelper1.onWarmupCompleted(z7, setbyteorder3, z5, z6, function0, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                int i34 = onExtraCallback + 51;
                                IAuthTabCallback = i34 % 128;
                                int i35 = i34 % 2;
                                return unitOnWarmupCompleted;
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                if ((i & 24576) == 0) {
                }
                i7 = i3;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 9363) == 9362, i7 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i7 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 9363) == 9362, i7 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i7 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 9363) == 9362, i7 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        getTime gettime = (getTime) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(gettime);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        onNavigationEvent = i2 % 128;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, i2 % 2 == 0);
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 101;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        onNavigationEvent = i2 % 128;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, i2 % 2 == 0);
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 103;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        int i;
        boolean z;
        getTime gettime;
        Function1 function1;
        int i2;
        int i3;
        Object obj;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        boolean z2;
        int i4;
        Object obj2;
        String strIntern;
        Object obj3;
        Object objOnMinimized;
        int i5;
        float f;
        Object objOnMinimized2;
        Object obj4;
        Object objOnNavigationEvent;
        Object objOnNavigationEvent2;
        int i6;
        int i7;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        final getTime gettime2 = (getTime) objArr[2];
        final Function1 function12 = (Function1) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1774981345);
        int i9 = iIntValue2 & 1;
        if (i9 != 0) {
            int i10 = onNavigationEvent + 63;
            onTransact = i10 % 128;
            i = i10 % 2 == 0 ? iIntValue | 24 : iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            int i11 = onTransact + 49;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue)) {
                int i13 = onTransact + 49;
                onNavigationEvent = i13 % 128;
                i7 = i13 % 2 != 0 ? 94 : 32;
            } else {
                i7 = 16;
            }
            i |= i7;
        }
        if ((iIntValue & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gettime2)) {
                int i14 = onNavigationEvent + 43;
                onTransact = i14 % 128;
                i6 = i14 % 2 == 0 ? 13521 : 256;
            } else {
                i6 = 128;
            }
            i |= i6;
        }
        if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 2048 : 1024;
        }
        int i15 = i;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i15 & 1171) != 1170, i15 & 1)) {
            if (i9 != 0) {
                int i16 = onNavigationEvent + 113;
                onTransact = i16 % 128;
                if (i16 % 2 == 0) {
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = QuirksExternalSyntheticBackport0.Companion;
                    throw null;
                }
                onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = onextracallback2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1774981345, i15, -1, "im.toss.feature.credit.ui.main.home.component.CircularScoreInfo (CreditHomeScoreSection.kt:474)");
            }
            if ((i15 & 7168) == 2048) {
                int i17 = onTransact + 79;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = (i15 & 896) == 256;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(z2 | z3)) {
                Object obj5 = objOnMinimized3;
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda16
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i19 = 2 % 2;
                            int i20 = onExtraCallbackWithResult + 25;
                            onWarmupCompleted = i20 % 128;
                            int i21 = i20 % 2;
                            Object[] objArr2 = {function12, gettime2};
                            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                            Unit unit = (Unit) RuntimeHelper1.onNavigationEvent(2016876846, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -2016876830, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr2);
                            int i22 = onExtraCallbackWithResult + 5;
                            onWarmupCompleted = i22 % 128;
                            if (i22 % 2 == 0) {
                                int i23 = 54 / 0;
                            }
                            return unit;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0);
                    obj5 = function0;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = configureReward.onExtraCallback(onextracallback4, (getConfiguration) null, (getCachingExecutorService) null, false, false, false, false, (String) null, (Role) null, (Function0) obj5, 255, (Object) null);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(gettime2.IAuthTabCallback() == enableNebulaServiceInitOpt.KCB ? QuirkSettingsLoader.Companion.IAuthTabCallbackStub() : QuirkSettingsLoader.Companion.asInterface(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback5 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback5, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(118.0f));
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.IAuthTabCallback_Parcel(), false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallbackDefault);
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
                if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                    int i19 = onNavigationEvent + 121;
                    onTransact = i19 % 128;
                    if (i19 % 2 == 0) {
                        Object[] objArr2 = new Object[1];
                        b(new int[]{1514985068, 1812232243, 226940015, -456881095, -158313399, 215483794, -780434404, -1066098462, -47279874, 1194012084, 2137708069, 1002557504, -2133428432, -1912790774, 1740507028, -1712338900, -1805794326, 1760524890, -1031235961, 1335266965, 1656482624, -420318750, -896886411, -374694402, 96791767, 869452674}, 61 >> View.MeasureSpec.getSize(1), objArr2);
                        strIntern = ((String) objArr2[0]).intern();
                        i4 = i15;
                        SnapshotKtExternalSyntheticLambda1 snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult = SaverKtExternalSyntheticLambda0.onExtraCallbackWithResult(RememberLottieCompositionKt.onExtraCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.IAuthTabCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.onNavigationEvent(strIntern)), (String) null, (String) null, (String) null, (String) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 62).onWarmupCompleted(), false, false, false, (SnapshotKtExternalSyntheticLambda0) null, 0.0f, 0, (SnapshotCompanionExternalSyntheticLambda1) null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1022);
                        if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                            function1 = function12;
                            i2 = iIntValue;
                            i3 = iIntValue2;
                            Object[] objArr3 = new Object[1];
                            b(new int[]{1514985068, 1812232243, 226940015, -456881095, -158313399, 215483794, -780434404, -1066098462, -47279874, 1194012084, 2137708069, 1002557504, -2133428432, -1912790774, 1740507028, -1712338900, -1805794326, 1760524890, -1510512677, 1290081184, -1180705023, 882934, -1520958225, 1987645056}, Color.blue(0) + 47, objArr3);
                            obj3 = objArr3[0];
                        } else {
                            i3 = iIntValue2;
                            i2 = iIntValue;
                            function1 = function12;
                            Object[] objArr4 = new Object[1];
                            a((-1) - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (TextUtils.indexOf("", "", 0, 0) + 5004), new char[]{48762, 139, 2387, 63113, 38669, 12701, 63396, 33168, 51564, 61903, 38503, 43038, 5925, 29121, 31969, 48681, 50821, 1564, 33462, 29739, 56629, 39572, 47207, 9273, 31676, 29835, 63303, 5984, 34683, 12661, 23136, 46835, 22608, 40495, 3669, 64028, 11790, 19733, 39867, 20006, 24323, 30829, 54614, 6732, 22837, 43635, 10457, 5444, 23010, 14746, 2413, 16409}, new char[]{37067, 9261, 35865, 17427}, new char[]{0, 0, 0, 0}, objArr4);
                            obj3 = objArr4[0];
                        }
                        SnapshotKtExternalSyntheticLambda1 snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult2 = SaverKtExternalSyntheticLambda0.onExtraCallbackWithResult(RememberLottieCompositionKt.onExtraCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.IAuthTabCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.onNavigationEvent(((String) obj3).intern())), (String) null, (String) null, (String) null, (String) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 62).onWarmupCompleted(), false, false, false, (SnapshotKtExternalSyntheticLambda0) null, 0.0f, 0, (SnapshotCompanionExternalSyntheticLambda1) null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1022);
                        getTime.onNavigationEvent onnavigationevent = !(gettime2 instanceof getTime.onNavigationEvent) ? (getTime.onNavigationEvent) gettime2 : null;
                        Pair<Float, Float> pairOnWarmupCompleted = onWarmupCompleted(onnavigationevent == null ? onnavigationevent.onNavigationEvent() : 0);
                        float fFloatValue = ((Number) pairOnWarmupCompleted.onExtraCallbackWithResult()).floatValue();
                        float fFloatValue2 = ((Number) pairOnWarmupCompleted.IAuthTabCallback()).floatValue();
                        float f2 = !zBooleanValue ? fFloatValue2 : fFloatValue;
                        getCallToActionButton getcalltoactionbutton = getCallToActionButton.onExtraCallback;
                        getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(1000, 0, getcalltoactionbutton.onTransact(), 2, (Object) null);
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda17
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke(Object obj6) {
                                    int i20 = 2 % 2;
                                    int i21 = IAuthTabCallback + 11;
                                    onExtraCallbackWithResult = i21 % 128;
                                    int i22 = i21 % 2;
                                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                                    Float f3 = (Float) obj6;
                                    if (i22 == 0) {
                                        return RuntimeHelper1.onExtraCallback(getsupportedhighspeedresolutionsfor2, f3.floatValue());
                                    }
                                    RuntimeHelper1.onExtraCallback(getsupportedhighspeedresolutionsfor2, f3.floatValue());
                                    Object obj7 = null;
                                    obj7.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = isSubmitButtonEnabled.IAuthTabCallback(f2, getthumbpositionOnExtraCallbackWithResult, 0.0f, "firstProgress", (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 27696, 4);
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = isSubmitButtonEnabled.IAuthTabCallback(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor) ? fFloatValue2 : fFloatValue, onQueryRefine.onExtraCallback(1000, 1000, getcalltoactionbutton.onTransact()), 0.0f, "secondProgress", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3120, 20);
                        if (zBooleanValue) {
                            i5 = 2;
                            f = 0.0f;
                        } else {
                            int i20 = onTransact + 41;
                            onNavigationEvent = i20 % 128;
                            i5 = 2;
                            int i21 = i20 % 2;
                            f = 1.0f;
                        }
                        float f3 = f;
                        z = zBooleanValue;
                        getThumbPosition getthumbpositionOnExtraCallbackWithResult2 = onQueryRefine.onExtraCallbackWithResult(1000, 0, getcalltoactionbutton.onTransact(), i5, (Object) null);
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized2 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda18
                                private static int onExtraCallbackWithResult = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj6) {
                                    int i22 = 2 % 2;
                                    int i23 = onExtraCallbackWithResult + 53;
                                    onWarmupCompleted = i23 % 128;
                                    int i24 = i23 % 2;
                                    Unit unitOnWarmupCompleted = RuntimeHelper1.onWarmupCompleted(getsupportedhighspeedresolutionsfor, ((Float) obj6).floatValue());
                                    int i25 = onExtraCallbackWithResult + 93;
                                    onWarmupCompleted = i25 % 128;
                                    int i26 = i25 % 2;
                                    return unitOnWarmupCompleted;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent = addInterstitialAdapter.onNavigationEvent(f3, getthumbpositionOnExtraCallbackWithResult2, 0.0f, "firstAlpha", (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 27696, 4);
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent2 = addInterstitialAdapter.onNavigationEvent(!IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor) ? 0.0f : 1.0f, onQueryRefine.onExtraCallback(1000, 1000, getcalltoactionbutton.onTransact()), 0.0f, "secondAlpha", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3120, 20);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback5, 0.0f, 1, (Object) null);
                        if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                            Object[] objArr5 = new Object[1];
                            a((ViewConfiguration.getJumpTapTimeout() >> 16) + 1470410965, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{54670, 54469, 28378, 54227, 2000, 14289, 44590, 35124, 43680, 35511, 10433, 6029, 11329, 48529, 6984, 8733, 56729, 10762, 53305, 21203, 49002, 28821, 48567, 34949, 15763, 39464, 43740, 22161, 31863, 44736, 2281, 57998, 55201, 58418, 50891, 29599, 39160, 3782, 65440, 57434, 53002, 40638, 25963, 213, 57823, 60892, 44904}, new char[]{54584, 42160, 21335, 40618}, new char[]{0, 0, 0, 0}, objArr5);
                            obj4 = objArr5[0];
                        } else {
                            Object[] objArr6 = new Object[1];
                            b(new int[]{1514985068, 1812232243, 226940015, -456881095, -158313399, 215483794, -780434404, -1066098462, -47279874, 1194012084, -806391129, -1504225148, -1593955090, 1231362488, -1212667251, 1391045532, -942293593, 1830381918, -1713788016, 806433347, -97952825, 549282540, -960335043, 840450789}, '^' - AndroidCharacter.getMirror('0'), objArr6);
                            obj4 = objArr6[0];
                        }
                        AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{((String) obj4).intern(), quirksExternalSyntheticBackport0OnNavigationEvent, null, null, null, null, null, null, immediateFailedFuture.Companion.onNavigationEvent(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663344, 764}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                        if (IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                            objOnNavigationEvent = onNavigationEvent(-1843914947, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1843914949, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback});
                        } else {
                            objOnNavigationEvent = onNavigationEvent(1951720442, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1951720442, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2});
                        }
                        onextracallback = onextracallback4;
                        int i22 = i4;
                        obj = null;
                        onNavigationEvent(-863049809, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 863049814, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{null, snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult, Float.valueOf(((Float) objOnNavigationEvent).floatValue()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1});
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = onCaptureSessionStart.onExtraCallback(onextracallback5, !IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor) ? onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent2) : onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent));
                        if (IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                            objOnNavigationEvent2 = onNavigationEvent(-1843914947, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1843914949, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback});
                        } else {
                            int i23 = onNavigationEvent + 41;
                            onTransact = i23 % 128;
                            int i24 = i23 % 2;
                            objOnNavigationEvent2 = onNavigationEvent(1951720442, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1951720442, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2});
                        }
                        onNavigationEvent(-863049809, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 863049814, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnExtraCallback2, snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult2, Float.valueOf(((Float) objOnNavigationEvent2).floatValue()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0});
                        gettime = gettime2;
                        onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult2.onExtraCallback()), gettime, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i22 >> 3) & 112);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i25 = onNavigationEvent + 101;
                            onTransact = i25 % 128;
                            int i26 = i25 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    } else {
                        i4 = i15;
                        Object[] objArr7 = new Object[1];
                        b(new int[]{1514985068, 1812232243, 226940015, -456881095, -158313399, 215483794, -780434404, -1066098462, -47279874, 1194012084, 2137708069, 1002557504, -2133428432, -1912790774, 1740507028, -1712338900, -1805794326, 1760524890, -1031235961, 1335266965, 1656482624, -420318750, -896886411, -374694402, 96791767, 869452674}, View.MeasureSpec.getSize(0) + 50, objArr7);
                        obj2 = objArr7[0];
                    }
                } else {
                    i4 = i15;
                    Object[] objArr8 = new Object[1];
                    b(new int[]{1514985068, 1812232243, 226940015, -456881095, -158313399, 215483794, -780434404, -1066098462, -47279874, 1194012084, 2137708069, 1002557504, -2133428432, -1912790774, 1740507028, -1712338900, -1805794326, 1760524890, -1031235961, 1335266965, -1427739578, 866986295, -2122667173, -915128396}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 45, objArr8);
                    obj2 = objArr8[0];
                }
                strIntern = ((String) obj2).intern();
                SnapshotKtExternalSyntheticLambda1 snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult3 = SaverKtExternalSyntheticLambda0.onExtraCallbackWithResult(RememberLottieCompositionKt.onExtraCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.IAuthTabCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.onNavigationEvent(strIntern)), (String) null, (String) null, (String) null, (String) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 62).onWarmupCompleted(), false, false, false, (SnapshotKtExternalSyntheticLambda0) null, 0.0f, 0, (SnapshotCompanionExternalSyntheticLambda1) null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1022);
                if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                }
                SnapshotKtExternalSyntheticLambda1 snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult22 = SaverKtExternalSyntheticLambda0.onExtraCallbackWithResult(RememberLottieCompositionKt.onExtraCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.IAuthTabCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.onNavigationEvent(((String) obj3).intern())), (String) null, (String) null, (String) null, (String) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 62).onWarmupCompleted(), false, false, false, (SnapshotKtExternalSyntheticLambda0) null, 0.0f, 0, (SnapshotCompanionExternalSyntheticLambda1) null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1022);
                if (!(gettime2 instanceof getTime.onNavigationEvent)) {
                }
                Pair<Float, Float> pairOnWarmupCompleted2 = onWarmupCompleted(onnavigationevent == null ? onnavigationevent.onNavigationEvent() : 0);
                float fFloatValue3 = ((Number) pairOnWarmupCompleted2.onExtraCallbackWithResult()).floatValue();
                float fFloatValue22 = ((Number) pairOnWarmupCompleted2.IAuthTabCallback()).floatValue();
                if (!zBooleanValue) {
                }
                getCallToActionButton getcalltoactionbutton2 = getCallToActionButton.onExtraCallback;
                getThumbPosition getthumbpositionOnExtraCallbackWithResult3 = onQueryRefine.onExtraCallbackWithResult(1000, 0, getcalltoactionbutton2.onTransact(), 2, (Object) null);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                }
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3 = isSubmitButtonEnabled.IAuthTabCallback(f2, getthumbpositionOnExtraCallbackWithResult3, 0.0f, "firstProgress", (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 27696, 4);
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback22 = isSubmitButtonEnabled.IAuthTabCallback(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor) ? fFloatValue22 : fFloatValue3, onQueryRefine.onExtraCallback(1000, 1000, getcalltoactionbutton2.onTransact()), 0.0f, "secondProgress", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3120, 20);
                if (zBooleanValue) {
                }
                float f32 = f;
                z = zBooleanValue;
                getThumbPosition getthumbpositionOnExtraCallbackWithResult22 = onQueryRefine.onExtraCallbackWithResult(1000, 0, getcalltoactionbutton2.onTransact(), i5, (Object) null);
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                }
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent3 = addInterstitialAdapter.onNavigationEvent(f32, getthumbpositionOnExtraCallbackWithResult22, 0.0f, "firstAlpha", (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 27696, 4);
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent22 = addInterstitialAdapter.onNavigationEvent(!IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor) ? 0.0f : 1.0f, onQueryRefine.onExtraCallback(1000, 1000, getcalltoactionbutton2.onTransact()), 0.0f, "secondAlpha", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3120, 20);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback5, 0.0f, 1, (Object) null);
                if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                }
                AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{((String) obj4).intern(), quirksExternalSyntheticBackport0OnNavigationEvent2, null, null, null, null, null, null, immediateFailedFuture.Companion.onNavigationEvent(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663344, 764}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                if (IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                }
                onextracallback = onextracallback4;
                int i222 = i4;
                obj = null;
                onNavigationEvent(-863049809, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 863049814, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{null, snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult3, Float.valueOf(((Float) objOnNavigationEvent).floatValue()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1});
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback22 = onCaptureSessionStart.onExtraCallback(onextracallback5, !IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor) ? onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent22) : onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent3));
                if (IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                }
                onNavigationEvent(-863049809, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 863049814, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0OnExtraCallback22, snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult22, Float.valueOf(((Float) objOnNavigationEvent2).floatValue()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0});
                gettime = gettime2;
                onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult2.onExtraCallback()), gettime, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i222 >> 3) & 112);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            z = zBooleanValue;
            gettime = gettime2;
            function1 = function12;
            i2 = iIntValue;
            i3 = iIntValue2;
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            onextracallback = onextracallback2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback6 = onextracallback;
            final boolean z4 = z;
            final getTime gettime3 = gettime;
            final Function1 function13 = function1;
            final int i27 = i2;
            final int i28 = i3;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda19
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj6, Object obj7) {
                    int i29 = 2 % 2;
                    int i30 = onExtraCallbackWithResult + 31;
                    onNavigationEvent = i30 % 128;
                    int i31 = i30 % 2;
                    Unit unitOnExtraCallback = RuntimeHelper1.onExtraCallback(onextracallback6, z4, gettime3, function13, i27, i28, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                    int i32 = onExtraCallbackWithResult + 97;
                    onNavigationEvent = i32 % 128;
                    if (i32 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            });
        }
        return obj;
    }

    private static final Unit onWarmupCompleted(getTime gettime, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, gettime.IAuthTabCallback().name());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, gettime.IAuthTabCallback().name());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x038c A[PHI: r8 r12
      0x038c: PHI (r8v13 int) = (r8v12 int), (r8v15 int) binds: [B:69:0x038a, B:66:0x0379] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r12v13 o.CameraCaptureResultEmptyCameraCaptureResult) = (r12v12 o.CameraCaptureResultEmptyCameraCaptureResult), (r12v16 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:69:0x038a, B:66:0x0379] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03a5 A[PHI: r3 r8 r12
      0x03a5: PHI (r3v20 o.getTime$onNavigationEvent) = (r3v17 o.getTime$onNavigationEvent), (r3v28 o.getTime$onNavigationEvent) binds: [B:69:0x038a, B:66:0x0379] A[DONT_GENERATE, DONT_INLINE]
      0x03a5: PHI (r8v14 int) = (r8v12 int), (r8v15 int) binds: [B:69:0x038a, B:66:0x0379] A[DONT_GENERATE, DONT_INLINE]
      0x03a5: PHI (r12v15 o.CameraCaptureResultEmptyCameraCaptureResult) = (r12v12 o.CameraCaptureResultEmptyCameraCaptureResult), (r12v16 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:69:0x038a, B:66:0x0379] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final getTime gettime, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws Throwable {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        long jLongValue;
        long jLongValue2;
        Throwable th;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        String strOnExtraCallback;
        long j;
        int i3;
        int i4;
        int i5;
        getTime.onNavigationEvent onnavigationevent;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-416723310);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = onNavigationEvent + 95;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gettime) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i9 = onNavigationEvent + 75;
            onTransact = i9 % 128;
            z = i9 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onTransact + 45;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-416723310, i2, -1, "im.toss.feature.credit.ui.main.home.component.CreditScoreInfo (CreditHomeScoreSection.kt:576)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            QuirkSettingsLoader.onNavigationEvent onnavigationeventOnTransact = onextracallbackwithresult.onTransact();
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.onNavigationEvent(), onnavigationeventOnTransact, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CaptureNoResponseQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 0.0f, 2, (Object) null);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i12 = onNavigationEvent + 63;
                onTransact = i12 % 128;
                int i13 = i12 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                int i14 = onTransact + 77;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            boolean z2 = (i2 & 112) == 32;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z2) {
                int i16 = onNavigationEvent + 61;
                onTransact = i16 % 128;
                int i17 = i16 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda9
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj) {
                            Unit unitOnExtraCallback;
                            int i18 = 2 % 2;
                            int i19 = onExtraCallback + 87;
                            onExtraCallbackWithResult = i19 % 128;
                            if (i19 % 2 == 0) {
                                unitOnExtraCallback = RuntimeHelper1.onExtraCallback(gettime, (useAndConfigureProgramWithTexture) obj);
                                int i20 = 79 / 0;
                            } else {
                                unitOnExtraCallback = RuntimeHelper1.onExtraCallback(gettime, (useAndConfigureProgramWithTexture) obj);
                            }
                            int i21 = onExtraCallback + 99;
                            onExtraCallbackWithResult = i21 % 128;
                            if (i21 % 2 != 0) {
                                return unitOnExtraCallback;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null);
                int iIAuthTabCallback = createCameraCaptureCallback.Companion.IAuthTabCallback();
                String strName = gettime.IAuthTabCallback().name();
                GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub = isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub();
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-353488449);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-353487489);
                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                }
                long j2 = jLongValue;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strName, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, null, Long.valueOf(j2), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)), 0L, null, null, createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback), Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(17.0f)), null, null, 0L, 0, false, graphicDeviceInfoIAuthTabCallbackStub, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 805330944, 196608, 97508}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = CaptureNoResponseQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-5.0f), 0.0f, 2, (Object) null);
                int i18 = R.drawable.icon_arrow_right_mono;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    int i19 = onNavigationEvent + 35;
                    onTransact = i19 % 128;
                    int i20 = i19 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-353476001);
                    jLongValue2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-353475041);
                    jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                AppLovinNativeAdImplc.onExtraCallback(i18, quirksExternalSyntheticBackport0OnWarmupCompleted4, jLongValue2, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663344, 248);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (!(!(gettime instanceof getTime.onNavigationEvent))) {
                    int i21 = onNavigationEvent + 61;
                    onTransact = i21 % 128;
                    if (i21 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-977051138);
                        onnavigationevent = (getTime.onNavigationEvent) gettime;
                        i5 = 0;
                        int i22 = 71 / 0;
                        if (onnavigationevent.onExtraCallbackWithResult()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-976993850);
                            sendMsgToIDEOpt.onNavigationEvent(null, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.features.credit.ui.R.string.credit_score_maintenance, cameraCaptureResultEmptyCameraCaptureResult2, i5), 0L, cameraCaptureResultEmptyCameraCaptureResult2, 0, 5);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        } else if (onnavigationevent.onExtraCallback()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-976819444);
                            sendMsgToIDEOpt.onNavigationEvent(null, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.features.credit.ui.R.string.credit_score_empty, cameraCaptureResultEmptyCameraCaptureResult2, i5), 0L, cameraCaptureResultEmptyCameraCaptureResult2, 0, 5);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-976667730);
                            String str = String.format(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.history.R.string.score_format, cameraCaptureResultEmptyCameraCaptureResult2, i5), Arrays.copyOf(new Object[]{String.valueOf(onnavigationevent.onNavigationEvent())}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "");
                            sendMsgToIDEOpt.onNavigationEvent(null, str, 0L, cameraCaptureResultEmptyCameraCaptureResult2, 0, 5);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                    } else {
                        i5 = 0;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-977051138);
                        onnavigationevent = (getTime.onNavigationEvent) gettime;
                        if (onnavigationevent.onExtraCallbackWithResult()) {
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    th = null;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    if (gettime instanceof getTime.onWarmupCompleted) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-976430859);
                        th = null;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                        String str2 = String.format(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.history.R.string.score_format, cameraCaptureResultEmptyCameraCaptureResult2, 0), Arrays.copyOf(new Object[]{"???"}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "");
                        sendMsgToIDEOpt.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback2, str2, 0L, cameraCaptureResultEmptyCameraCaptureResult2, 6, 4);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        th = null;
                        if ((gettime instanceof getTime.onExtraCallbackWithResult) || (gettime instanceof getTime.IAuthTabCallback)) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-976144233);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                            String str3 = String.format(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.history.R.string.score_format, cameraCaptureResultEmptyCameraCaptureResult2, 0), Arrays.copyOf(new Object[]{"-"}, 1));
                            Intrinsics.checkNotNullExpressionValue(str3, "");
                            sendMsgToIDEOpt.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback3, str3, 0L, cameraCaptureResultEmptyCameraCaptureResult2, 6, 4);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        } else {
                            if (!(gettime instanceof getTime.onExtraCallback)) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1416992236);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                throw new NoWhenBranchMatchedException();
                            }
                            int i23 = onNavigationEvent + 25;
                            onTransact = i23 % 128;
                            if (i23 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-975887336);
                                quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 0, (Object) null);
                                strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.features.credit.ui.R.string.credit_score_maintenance, cameraCaptureResultEmptyCameraCaptureResult2, 1);
                                j = 1;
                                i3 = 45;
                                i4 = 5;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-975887336);
                                quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                                strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.features.credit.ui.R.string.credit_score_maintenance, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                j = 0;
                                i3 = 6;
                                i4 = 4;
                            }
                            sendMsgToIDEOpt.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, strOnExtraCallback, j, cameraCaptureResultEmptyCameraCaptureResult2, i3, i4);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i24 = onNavigationEvent + 81;
                    onTransact = i24 % 128;
                    if (i24 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw th;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda10
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    Unit unitOnWarmupCompleted;
                    int i25 = 2 % 2;
                    int i26 = onNavigationEvent + 53;
                    onExtraCallback = i26 % 128;
                    if (i26 % 2 == 0) {
                        unitOnWarmupCompleted = RuntimeHelper1.onWarmupCompleted(quirksExternalSyntheticBackport0, gettime, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i27 = 0 / 0;
                    } else {
                        unitOnWarmupCompleted = RuntimeHelper1.onWarmupCompleted(quirksExternalSyntheticBackport0, gettime, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    int i28 = onExtraCallback + 113;
                    onNavigationEvent = i28 % 128;
                    int i29 = i28 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        boolean z;
        Object obj;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[0];
        final SnapshotKtExternalSyntheticLambda1 snapshotKtExternalSyntheticLambda1 = (SnapshotKtExternalSyntheticLambda1) objArr[1];
        final float fFloatValue = ((Number) objArr[2]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        final int iIntValue = ((Number) objArr[4]).intValue();
        final int iIntValue2 = ((Number) objArr[5]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(snapshotKtExternalSyntheticLambda1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-581846791);
        int i3 = iIntValue2 & 1;
        if (i3 != 0) {
            int i4 = onTransact + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            i = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            int i6 = onNavigationEvent + 35;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(snapshotKtExternalSyntheticLambda1) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 256 : 128;
            int i8 = onTransact + 125;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 5;
            }
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            int i10 = onNavigationEvent + 105;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            z = false;
        }
        Object obj2 = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i12 = onNavigationEvent + 99;
            onTransact = i12 % 128;
            int i13 = i12 % 2;
            if (i3 != 0) {
                onextracallback = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onNavigationEvent + 111;
                onTransact = i14 % 128;
                if (i14 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-581846791, i, -1, "im.toss.feature.credit.ui.main.home.component.CircularGraphLottie (CreditHomeScoreSection.kt:652)");
                    int i15 = 14 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-581846791, i, -1, "im.toss.feature.credit.ui.main.home.component.CircularGraphLottie (CreditHomeScoreSection.kt:652)");
                }
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2IAuthTabCallback = snapshotKtExternalSyntheticLambda1.IAuthTabCallback();
            immediateFailedFuture immediatefailedfutureOnExtraCallbackWithResult = immediateFailedFuture.Companion.onExtraCallbackWithResult();
            AppLovinFullscreenImmersiveActivity appLovinFullscreenImmersiveActivityOnExtraCallbackWithResult = showAndRender.onExtraCallbackWithResult(composableLambdaImplExternalSyntheticLambda2IAuthTabCallback);
            boolean z2 = (i & 896) == 256;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z2) {
                int i16 = onNavigationEvent + 79;
                onTransact = i16 % 128;
                if (i16 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj2.hashCode();
                    throw null;
                }
                Object obj3 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda27
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i17 = 2 % 2;
                            int i18 = IAuthTabCallback + 19;
                            onWarmupCompleted = i18 % 128;
                            int i19 = i18 % 2;
                            Float fValueOf = Float.valueOf(RuntimeHelper1.onNavigationEvent(fFloatValue));
                            int i20 = onWarmupCompleted + 83;
                            IAuthTabCallback = i20 % 128;
                            if (i20 % 2 != 0) {
                                int i21 = 21 / 0;
                            }
                            return fValueOf;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0);
                    obj3 = function0;
                }
                obj = null;
                ReadonlySnapshot.onWarmupCompleted(composableLambdaImplExternalSyntheticLambda2IAuthTabCallback, (Function0) obj3, setAdVideoPlaybackListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnNavigationEvent, "LottieAnimation", (Object) null, appLovinFullscreenImmersiveActivityOnExtraCallbackWithResult), false, false, false, false, (RenderMode) null, false, (SnapshotStateObserverExternalSyntheticLambda0) null, (QuirkSettingsLoader) null, immediatefailedfutureOnExtraCallbackWithResult, false, false, (Map) null, (ComposableLambdaImplExternalSyntheticLambda4) null, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 48, 129016);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = onextracallback;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeScoreSectionKt$$ExternalSyntheticLambda28
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj4, Object obj5) {
                    int i17 = 2 % 2;
                    int i18 = onNavigationEvent + 125;
                    onExtraCallbackWithResult = i18 % 128;
                    if (i18 % 2 == 0) {
                        return RuntimeHelper1.IAuthTabCallback(onextracallback2, snapshotKtExternalSyntheticLambda1, fFloatValue, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    }
                    RuntimeHelper1.IAuthTabCallback(onextracallback2, snapshotKtExternalSyntheticLambda1, fFloatValue, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                }
            });
        }
        return obj;
    }

    public static final Pair<Float, Float> onWarmupCompleted(int i) {
        Float fValueOf;
        float fCoerceIn;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            float f = i % 1000.0f;
            fValueOf = Float.valueOf(f);
            fCoerceIn = RangesKt.coerceIn(f + 0.12f, 0.0f, 0.0f);
        } else {
            float f2 = i / 1000.0f;
            fValueOf = Float.valueOf(f2);
            fCoerceIn = RangesKt.coerceIn(f2 + 0.12f, 0.0f, 1.0f);
        }
        Pair<Float, Float> pairIAuthTabCallback = getWrite.IAuthTabCallback(fValueOf, Float.valueOf(fCoerceIn));
        int i4 = onTransact + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return pairIAuthTabCallback;
    }

    private static final boolean IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return bool.booleanValue();
        }
        int i4 = 26 / 0;
        return bool.booleanValue();
    }

    private static final boolean asBinder(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onNavigationEvent + 69;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return zBooleanValue;
    }

    private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onNavigationEvent + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void onTransact(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final long onNavigationEvent(getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        AvoidCaptureProcessProgressAvailabilityCheckQuirk avoidCaptureProcessProgressAvailabilityCheckQuirk = (AvoidCaptureProcessProgressAvailabilityCheckQuirk) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            avoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback();
            obj.hashCode();
            throw null;
        }
        long jIAuthTabCallback = avoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback();
        int i4 = onTransact + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return jIAuthTabCallback;
        }
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk> getsupportedhighspeedresolutionsfor, long j) {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(j));
        int i4 = onNavigationEvent + 115;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        int i5 = onNavigationEvent + 33;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            bool.booleanValue();
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = onTransact + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    private static final void asInterface(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onNavigationEvent + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return Boolean.valueOf(bool.booleanValue());
        }
        bool.booleanValue();
        throw null;
    }

    private static final void asBinder(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onTransact + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        long jOnNavigationEvent;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        setUseCaseDetached setusecasedetached = (setUseCaseDetached) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            jOnNavigationEvent = setusecasedetached.onNavigationEvent();
            int i4 = 72 / 0;
        } else {
            jOnNavigationEvent = setusecasedetached.onNavigationEvent();
        }
        return Long.valueOf(jOnNavigationEvent);
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<setUseCaseDetached> getsupportedhighspeedresolutionsfor, long j) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(setUseCaseDetached.onNavigationEvent(j));
            int i3 = 69 / 0;
        } else {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(setUseCaseDetached.onNavigationEvent(j));
        }
        int i4 = onTransact + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final float onTransact(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        float fFloatValue;
        int i = 2 % 2;
        int i2 = onTransact + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            fFloatValue = number.floatValue();
            int i4 = 65 / 0;
        } else {
            fFloatValue = number.floatValue();
        }
        int i5 = onNavigationEvent + 41;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return fFloatValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float asBinder(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        float fFloatValue;
        int i = 2 % 2;
        int i2 = onTransact + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            fFloatValue = number.floatValue();
            int i4 = 36 / 0;
        } else {
            fFloatValue = number.floatValue();
        }
        int i5 = onTransact + 67;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return fFloatValue;
    }

    private static final long IAuthTabCallbackDefault(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        setByteOrder setbyteorder = (setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return setbyteorder.access100();
        }
        setbyteorder.access100();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final long onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        long jAccess100 = ((setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).access100();
        int i4 = onTransact + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return jAccess100;
        }
        throw null;
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        int i5 = onTransact + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return zBooleanValue;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onTransact + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        float fFloatValue;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            fFloatValue = number.floatValue();
            int i4 = 92 / 0;
        } else {
            fFloatValue = number.floatValue();
        }
        int i5 = onNavigationEvent + 21;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return Float.valueOf(fFloatValue);
    }

    private static final float onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            number.floatValue();
            obj.hashCode();
            throw null;
        }
        float fFloatValue = number.floatValue();
        int i4 = onTransact + 61;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return fFloatValue;
        }
        obj.hashCode();
        throw null;
    }

    private static final float onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            number.floatValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fFloatValue = number.floatValue();
        int i4 = onNavigationEvent + 101;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z) {
        Object[] objArr = {Boolean.valueOf(z)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(-1627094706, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1627094719, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, getTime gettime) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(2016876846, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -2016876830, iIAuthTabCallback3, iIAuthTabCallback, new Object[]{function1, gettime});
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(-973349954, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 973349964, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(1850616675, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1850616658, iIAuthTabCallback3, iIAuthTabCallback, new Object[]{function0});
    }

    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull SnapshotKtExternalSyntheticLambda1 snapshotKtExternalSyntheticLambda1, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, snapshotKtExternalSyntheticLambda1, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onNavigationEvent(-863049809, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 863049814, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr);
    }

    private static final float IAuthTabCallback(float f) {
        Object[] objArr = {Float.valueOf(f)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return ((Float) onNavigationEvent(-1229785145, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1229785151, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr)).floatValue();
    }

    private static final void onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, getTime gettime, Function1<? super getTime, Unit> function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), gettime, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onNavigationEvent(-1418150270, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1418150274, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr);
    }

    private static final Unit onNavigationEvent(Function1 function1, getTime gettime) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(151809603, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -151809595, iIAuthTabCallback3, iIAuthTabCallback, new Object[]{function1, gettime});
    }

    private static final float onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return ((Float) onNavigationEvent(-1843914947, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1843914949, iIAuthTabCallback3, iIAuthTabCallback, new Object[]{cameraPresenceProviderExternalSyntheticLambda6})).floatValue();
    }

    private static final float IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return ((Float) onNavigationEvent(1951720442, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1951720442, iIAuthTabCallback3, iIAuthTabCallback, new Object[]{cameraPresenceProviderExternalSyntheticLambda6})).floatValue();
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, getTime gettime, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), gettime, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(-1596051120, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1596051135, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr);
    }

    private static final float onExtraCallbackWithResult(float f) {
        Object[] objArr = {Float.valueOf(f)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return ((Float) onNavigationEvent(-1635625211, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1635625223, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr)).floatValue();
    }

    private static final Unit IAuthTabCallback(Function1 function1, Function0 function0, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(-361030059, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 361030066, iIAuthTabCallback3, iIAuthTabCallback, new Object[]{function1, function0, surfaceProcessorNodeOut});
    }

    private static final boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(-2094738366, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 2094738375, iIAuthTabCallback3, iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutionsfor})).booleanValue();
    }

    private static final boolean IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(862608929, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -862608915, iIAuthTabCallback3, iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutionsfor})).booleanValue();
    }

    private static final Unit IAuthTabCallback(boolean z, setByteOrder setbyteorder, boolean z2, boolean z3, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {Boolean.valueOf(z), setbyteorder, Boolean.valueOf(z2), Boolean.valueOf(z3), function0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(-2097034903, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 2097034904, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr);
    }

    private static final long onTransact(getSupportedHighSpeedResolutionsFor<setUseCaseDetached> getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return ((Long) onNavigationEvent(-1279414723, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1279414734, iIAuthTabCallback3, iIAuthTabCallback, new Object[]{getsupportedhighspeedresolutionsfor})).longValue();
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onNavigationEvent(1599006328, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1599006325, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr);
    }
}
