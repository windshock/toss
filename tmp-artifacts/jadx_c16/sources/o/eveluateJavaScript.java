package o;

import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.common.collect.Synchronized;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.features.fds.impl.screen.SirenBottomSheetScreenKt$;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.UtilsKtExternalSyntheticLambda17;
import o.createNativeBridge;
import o.getApplication;
import o.getBackPerform;
import o.getCurrentUri;
import o.getEngine;
import o.getEngineType;
import o.getExitPerform;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class eveluateJavaScript {
    private static final byte[] $$a = {115, 102, 60, 8};
    private static final int $$b = 149;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent = 478308907;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 105 - (b * 3);
        int i4 = (b2 * 2) + 4;
        int i5 = i * 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i3 = (-i3) + i4;
            i4 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i4];
            int i8 = i4;
            i4 = i3;
            i3 = b3;
            i7 = i2 + 1;
            i6 = i8;
            i3 = (-i3) + i4;
            i4 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[1];
        Futures3 futures3 = (Futures3) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, futures3);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, futures3);
        int i3 = onWarmupCompleted + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(float f, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, setNativeBridge setnativebridge, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 69;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {Float.valueOf(f), getsupportedhighspeedresolutionsfor, setnativebridge, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {Float.valueOf(f), getsupportedhighspeedresolutionsfor, setnativebridge, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent4 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, 1551770122, objArr2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1551770117, iOnNavigationEvent4);
        int i4 = IAuthTabCallback + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, futures3);
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
        int i4 = IAuthTabCallback + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setNativeBridge setnativebridge, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 43;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {setnativebridge, getsupportedhighspeedresolutionsfor, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {setnativebridge, getsupportedhighspeedresolutionsfor, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onExtraCallbackWithResult(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1001228521, objArr2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1001228522, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        int i4 = onWarmupCompleted + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        Unit unitOnWarmupCompleted;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        String str5 = (String) objArr[4];
        String str6 = (String) objArr[5];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[6];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[7];
        isContainerClickable iscontainerclickable = (isContainerClickable) objArr[8];
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[9];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        int iIntValue = ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnWarmupCompleted = onWarmupCompleted(str, str2, str3, str4, str5, str6, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i3 = 70 / 0;
        } else {
            unitOnWarmupCompleted = onWarmupCompleted(str, str2, str3, str4, str5, str6, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        int i4 = onWarmupCompleted + 7;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor);
        int i4 = IAuthTabCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = ~i2;
        int i10 = (~(i7 | i9)) | i8;
        int i11 = ~(i9 | i8 | i7);
        int i12 = i5 + i3 + i6 + ((-112346298) * i4) + (505796074 * i);
        int i13 = i12 * i12;
        int i14 = ((1543607772 * i5) - 1525940224) + (1734765094 * i3) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i6) + (859308032 * i4) + (310902784 * i) + (417529856 * i13);
        int i15 = (i5 * (-1233303660)) + 1670658458 + (i3 * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i6 * (-1233302909)) + (i4 * 1075253458) + (i * 745806526) + (i13 * 1512636416);
        int i16 = i14 + (i15 * i15 * (-1737162752));
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? i16 != 5 ? onExtraCallback(objArr) : onTransact(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2, String str3, String str4, String str5, String str6, reload reloadVar, String str7, Integer num, Function0 function0, Function0 function02, Function0 function03, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 77;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, str2, str3, str4, str5, str6, reloadVar, str7, num, function0, function02, function03, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onWarmupCompleted + 101;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, String str, String str2, String str3, String str4, String str5, String str6, reload reloadVar, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 115;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(meteringRepeatingSessionExternalSyntheticLambda0, str, str2, str3, str4, str5, str6, reloadVar, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(meteringRepeatingSessionExternalSyntheticLambda0, str, str2, str3, str4, str5, str6, reloadVar, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
        int i4 = onWarmupCompleted + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        String str5 = (String) objArr[5];
        String str6 = (String) objArr[6];
        reload reloadVar = (reload) objArr[7];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(getsupportedhighspeedresolutionsfor, str, str2, str3, str4, str5, str6, reloadVar);
        }
        onWarmupCompleted(getsupportedhighspeedresolutionsfor, str, str2, str3, str4, str5, str6, reloadVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        Integer num = (Integer) objArr[0];
        setNativeBridge setnativebridge = (setNativeBridge) objArr[1];
        isContainerClickable iscontainerclickable = (isContainerClickable) objArr[2];
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(num, setnativebridge, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallback + 87;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(String str, String str2, String str3, String str4, String str5, String str6, reload reloadVar, String str7, Integer num, Function0 function0, Function0 function02, Function0 function03, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 67;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallback(str, str2, str3, str4, str5, str6, reloadVar, str7, num, function0, function02, function03, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 79;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, setNativeBridge setnativebridge, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            IAuthTabCallback(meteringRepeatingSessionExternalSyntheticLambda0, setnativebridge, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(meteringRepeatingSessionExternalSyntheticLambda0, setnativebridge, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str, String str2, String str3, String str4, String str5, String str6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, str, str2, str3, str4, str5, str6);
        int i4 = IAuthTabCallback + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, String str, String str2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, String str3, String str4, setNativeBridge setnativebridge, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7, String str5, String str6, String str7, reload reloadVar, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, str, str2, getsupportedhighspeedresolutionsfor5, str3, str4, setnativebridge, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor7, str5, str6, str7, reloadVar, getsupportedhighspeedresolutionsfor8, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 77;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(new getEngineType.onNavigationEvent(createEngineRouter.Cancel));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Integer num, setNativeBridge setnativebridge, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(iscontainerclickable, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        Object obj = null;
        if ((i & 6) == 0) {
            int i5 = onWarmupCompleted + 99;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable);
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable)) {
                i3 = 4;
            } else {
                int i6 = IAuthTabCallback + 99;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = IAuthTabCallback + 33;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth) ? 32 : 16;
        }
        if ((i2 & 147) != 146) {
            int i10 = onWarmupCompleted + 95;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onWarmupCompleted + 103;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                Object[] objArr = new Object[1];
                a(View.MeasureSpec.makeMeasureSpec(0, 0) + 98, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 62, new char[]{'\r', 25, 14, 15, 14, 1, 65500, 65486, 14, 5, 5, 18, 3, 65523, 20, 5, 5, '\b', 65523, '\r', 15, 20, 20, 15, 65506, 14, 5, 18, '\t', 65523, 65486, 14, 5, 5, 18, 3, 19, 65486, '\f', 16, '\r', '\t', 65486, 19, 4, 6, 65486, 19, 5, 18, 21, 20, 1, 5, 6, 65486, 19, 19, 15, 20, 65486, '\r', '\t', 65481, 65496, 65496, 65498, 20, 11, 65486, 14, 5, 5, 18, 3, 65523, 20, 5, 5, '\b', 65523, '\r', 15, 20, 20, 15, 65506, 14, 5, 18, '\t', 65523, 65480, 65472, 65502, 19, 21, 15}, true, 98 - View.MeasureSpec.getMode(0), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(347798259, i2, -1, ((String) objArr[0]).intern());
            }
            if (num != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1796885111);
                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallback(sendMsgFromVConsoleToAppx.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).c_(num.intValue()), 0.0f, 0.0f, 13, (Object) null), 0.0f, 1, (Object) null), iscontainerclickable, getswitchminwidth), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1797215695);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            BaseRenderImpl.onExtraCallback(sendMsgFromVConsoleToAppx.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), iscontainerclickable, getswitchminwidth), setnativebridge.IAuthTabCallbackStub(), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            BaseRenderImpl.onExtraCallbackWithResult(sendMsgFromVConsoleToAppx.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), iscontainerclickable, getswitchminwidth), setnativebridge.onNavigationEvent(), setnativebridge.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        float f;
        char[] cArr2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i5 = $10 + 31;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 3;
        }
        while (true) {
            f = 0.0f;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 35126), (ViewConfiguration.getFadingEdgeLength() >> 16) + 23, 10278 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54, TextUtils.lastIndexOf("", '0', 0) + 2168, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            int i8 = $10 + 105;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 54, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    f = 0.0f;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        boolean z;
        float fFloatValue = ((Number) objArr[0]).floatValue();
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        setNativeBridge setnativebridge = (setNativeBridge) objArr[2];
        isContainerClickable iscontainerclickable = (isContainerClickable) objArr[3];
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iscontainerclickable, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if ((iIntValue & 48) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth) ? 32 : 16;
        }
        if ((iIntValue & 145) != 144) {
            int i2 = IAuthTabCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = IAuthTabCallback + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i6 = onWarmupCompleted + 125;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallback + 29;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr2 = new Object[1];
                a(99 - View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, new char[]{21, 16, 14, 65524, '\t', 6, 6, 21, 65524, 4, 19, 6, 6, 15, 65487, '\f', 21, 65499, 65490, 65490, 65494, 65482, '\n', 14, 65487, 21, 16, 20, 20, 65487, 7, 6, 2, 21, 22, 19, 6, 20, 65487, 7, 5, 20, 65487, '\n', 14, 17, '\r', 65487, 20, 4, 19, 6, 6, 15, 65487, 65524, '\n', 19, 6, 15, 65507, 16, 21, 21, 16, 14, 65524, '\t', 6, 6, 21, 65524, 4, 19, 6, 6, 15, 65487, 65501, 2, 15, 16, 15, 26, 14, 16, 22, 20, 65503, 65473, 65481, 65524, '\n', 19, 6, 15, 65507, 16, 21}, false, 97 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(885415786, iIntValue, -1, ((String) objArr2[0]).intern());
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            BaseRenderImpl.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(onextracallback, fFloatValue, fFloatValue), setnativebridge.onExtraCallbackWithResult(), sendMsgFromVConsoleToAppx.IAuthTabCallback(onextracallback, (getCurrentUri) getswitchminwidth.IAuthTabCallback(), ((setUseCaseAttached) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onExtraCallback(), 0, cameraCaptureResultEmptyCameraCaptureResult, 3078), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            BaseRenderImpl.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(onextracallback, fFloatValue, fFloatValue), setnativebridge.onExtraCallbackWithResult(), sendMsgFromVConsoleToAppx.IAuthTabCallback(onextracallback, (getCurrentUri) getswitchminwidth.IAuthTabCallback(), ((setUseCaseAttached) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onExtraCallback(), 500, cameraCaptureResultEmptyCameraCaptureResult, 3078), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = onWarmupCompleted + 65;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        int i;
        int i2;
        setNativeBridge setnativebridge = (setNativeBridge) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        isContainerClickable iscontainerclickable = (isContainerClickable) objArr[2];
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(iscontainerclickable, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if ((iIntValue & 6) == 0) {
            int i4 = onWarmupCompleted + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            i = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable) ? 4 : 2) | iIntValue;
            int i6 = IAuthTabCallback + 15;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) {
                int i8 = onWarmupCompleted + 93;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 147) != 146, i & 1)) {
            int i10 = onWarmupCompleted + 7;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr2 = new Object[1];
                a(View.MeasureSpec.makeMeasureSpec(0, 0) + 99, Color.argb(0, 0, 0, 0) + 1, new char[]{65482, '\n', 14, 65487, 21, 16, 20, 20, 65487, 7, 6, 2, 21, 22, 19, 6, 20, 65487, 7, 5, 20, 65487, '\n', 14, 17, '\r', 65487, 20, 4, 19, 6, 6, 15, 65487, 65524, '\n', 19, 6, 15, 65507, 16, 21, 21, 16, 14, 65524, '\t', 6, 6, 21, 65524, 4, 19, 6, 6, 15, 65487, 65501, 2, 15, 16, 15, 26, 14, 16, 22, 20, 65503, 65473, 65481, 65524, '\n', 19, 6, 15, 65507, 16, 21, 21, 16, 14, 65524, '\t', 6, 6, 21, 65524, 4, 19, 6, 6, 15, 65487, '\f', 21, 65499, 65490, 65492, 65496}, false, 97 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2124488981, i, -1, ((String) objArr2[0]).intern());
            }
            int i11 = i << 3;
            BaseRenderImpl.onNavigationEvent(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), new Object[]{null, sendMsgFromVConsoleToAppx.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, (i11 & 112) | 6 | (i11 & 896)), setnativebridge.IAuthTabCallback(), Long.valueOf(((setUseCaseAttached) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onExtraCallback()), cameraCaptureResultEmptyCameraCaptureResult, 0, 1}, 1615833024, -1615833024, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = onWarmupCompleted + 37;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        if (!Intrinsics.areEqual(getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult(), getCurrentUri.onWarmupCompleted.onExtraCallbackWithResult)) {
            int i4 = onWarmupCompleted + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getsupportedhighspeedresolutionsfor2.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(FuturesCallbackListener.onTransact(futures3)));
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(getCurrentUri.onNavigationEvent.onExtraCallbackWithResult);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, setNativeBridge setnativebridge, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 49;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iscontainerclickable, "");
            Intrinsics.checkNotNullParameter(getswitchminwidth, "");
            if ((i & 26) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable)) {
                    int i6 = IAuthTabCallback + 87;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(iscontainerclickable, "");
            Intrinsics.checkNotNullParameter(getswitchminwidth, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            int i8 = onWarmupCompleted + 117;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                Object[] objArr = new Object[1];
                a(147 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 61 - View.MeasureSpec.getMode(0), new char[]{'\r', 15, 21, 19, 65502, 65486, 65500, 1, 14, 15, 14, 25, '\r', 15, 21, 19, 65502, 65486, 65500, 1, 14, 15, 14, 25, '\r', 15, 21, 19, 65502, 65472, 65480, 65523, '\t', 18, 5, 14, 65506, 15, 20, 20, 15, '\r', 65523, '\b', 5, 5, 20, 65523, 3, 18, 5, 5, 14, 65486, 11, 20, 65498, 65489, 65494, 65494, 65481, '\t', '\r', 65486, 20, 15, 19, 19, 65486, 6, 5, 1, 20, 21, 18, 5, 19, 65486, 6, 4, 19, 65486, '\t', '\r', 16, '\f', 65486, 19, 3, 18, 5, 5, 14, 65486, 65523, '\t', 18, 5, 14, 65506, 15, 20, 20, 15, '\r', 65523, '\b', 5, 5, 20, 65523, 3, 18, 5, 5, 14, 65486, 65500, 1, 14, 15, 14, 25, '\r', 15, 21, 19, 65502, 65486, 65500, 1, 14, 15, 14, 25, '\r', 15, 21, 19, 65502, 65486, 65500, 1, 14, 15, 14, 25}, false, 97 - ImageFormat.getBitsPerPixel(0), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1338706020, i3, -1, ((String) objArr[0]).intern());
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = meteringRepeatingSessionExternalSyntheticLambda0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, (QuirkSettingsLoader) null, false, 3, (Object) null), QuirkSettingsLoader.Companion.onTransact());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new SirenBottomSheetScreenKt$.ExternalSyntheticLambda0(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            BaseRenderImpl.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) sendMsgFromVConsoleToAppx.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -698399162, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized), iscontainerclickable, getswitchminwidth}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 698399176), setnativebridge.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = IAuthTabCallback + 75;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getEngineType getenginetype = (getEngineType) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (Intrinsics.areEqual(getenginetype, getEngineType.onExtraCallbackWithResult.onExtraCallback)) {
            getsupportedhighspeedresolutionsfor2.IAuthTabCallback(getApplication.onNavigationEvent.onExtraCallbackWithResult);
        } else if (Intrinsics.areEqual(getenginetype, getEngineType.onExtraCallback.onExtraCallbackWithResult)) {
            getsupportedhighspeedresolutionsfor2.IAuthTabCallback(getApplication.onTransact.onNavigationEvent);
            int i4 = onWarmupCompleted + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getEngineType getenginetype = (getEngineType) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (!Intrinsics.areEqual(getenginetype, getEngineType.onExtraCallbackWithResult.onExtraCallback)) {
            if (Intrinsics.areEqual(getenginetype, getEngineType.onExtraCallback.onExtraCallbackWithResult)) {
                getsupportedhighspeedresolutionsfor2.IAuthTabCallback(getApplication.IAuthTabCallbackDefault.onExtraCallbackWithResult);
            }
        } else {
            int i4 = IAuthTabCallback + 29;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                getsupportedhighspeedresolutionsfor2.IAuthTabCallback(getApplication.IAuthTabCallbackStub.onNavigationEvent);
                int i5 = 46 / 0;
            } else {
                getsupportedhighspeedresolutionsfor2.IAuthTabCallback(getApplication.IAuthTabCallbackStub.onNavigationEvent);
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str, String str2, String str3, String str4, String str5, String str6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getEngineType getenginetype = (getEngineType) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            if (Intrinsics.areEqual(getenginetype, getEngineType.onExtraCallbackWithResult.onExtraCallback)) {
                getEngineRouter.IAuthTabCallback.onExtraCallbackWithResult(str, str2, str3, str4);
            } else if (Intrinsics.areEqual(getenginetype, getEngineType.onExtraCallback.onExtraCallbackWithResult)) {
                int i3 = IAuthTabCallback + 109;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {getEngineRouter.IAuthTabCallback, str5, str6, str3, str4};
                getEngineRouter.onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, -1319036255, 1319036255);
            }
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(new getEngineType.onNavigationEvent(createEngineRouter.Cta));
            return Unit.INSTANCE;
        }
        Intrinsics.areEqual((getEngineType) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult(), getEngineType.onExtraCallbackWithResult.onExtraCallback);
        throw null;
    }

    private static final Unit onWarmupCompleted(String str, String str2, String str3, String str4, String str5, String str6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(iscontainerclickable, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if ((i & 6) == 0) {
            int i5 = IAuthTabCallback + 7;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable);
                throw null;
            }
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) {
                int i6 = onWarmupCompleted + 61;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            int i8 = IAuthTabCallback + 119;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            int i10 = IAuthTabCallback + 47;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr = new Object[1];
                a(Color.alpha(0) + 123, (KeyEvent.getMaxKeyCode() >> 16) + 98, new char[]{15, 6, 19, '\n', 65524, 65481, 65473, 65503, 20, 22, 16, 14, 26, 15, 16, 15, 2, 65501, 65487, 65503, 20, 22, 16, 14, 26, 15, 16, 15, 2, 65501, 65487, 65503, 20, 22, 16, 14, 26, 15, 16, 15, 2, 65501, 65487, 15, 6, 6, 19, 4, 65524, 21, 6, 6, '\t', 65524, 14, 16, 21, 21, 16, 65507, 15, 6, 19, '\n', 65524, 65487, 15, 6, 6, 19, 4, 20, 65487, '\r', 17, 14, '\n', 65487, 20, 5, 7, 65487, 20, 6, 19, 22, 21, 2, 6, 7, 65487, 20, 20, 16, 21, 65487, 14, '\n', 65482, 65490, 65489, 65491, 65499, 21, '\f', 65487, 15, 6, 6, 19, 4, 65524, 21, 6, 6, '\t', 65524, 14, 16, 21, 21, 16, 65507}, true, 96 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(228314520, i2, -1, ((String) objArr[0]).intern());
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = sendMsgFromVConsoleToAppx.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 10, (Object) null), iscontainerclickable, getswitchminwidth);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = sendMsgFromVConsoleToAppx.onNavigationEvent(onextracallback, iscontainerclickable, getswitchminwidth);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = sendMsgFromVConsoleToAppx.IAuthTabCallback(onextracallback, iscontainerclickable, getswitchminwidth);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = sendMsgFromVConsoleToAppx.onWarmupCompleted(onextracallback, iscontainerclickable, getswitchminwidth);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new SirenBottomSheetScreenKt$.ExternalSyntheticLambda12(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Function0 function0 = (Function0) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new SirenBottomSheetScreenKt$.ExternalSyntheticLambda13(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            Function0 function02 = (Function0) objOnMinimized2;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str3);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str4);
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str5);
            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str6);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4 | zOnNavigationEvent5 | zOnNavigationEvent6) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                SirenBottomSheetScreenKt$.ExternalSyntheticLambda14 externalSyntheticLambda14 = new SirenBottomSheetScreenKt$.ExternalSyntheticLambda14(getsupportedhighspeedresolutionsfor, str2, str3, str, str4, str5, str6);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda14);
                objOnMinimized3 = externalSyntheticLambda14;
            }
            BaseRenderImpl.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnNavigationEvent, quirksExternalSyntheticBackport0IAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted, str, function0, function02, (Function0) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 1769472, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onWarmupCompleted + 89;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(tinyDebugConsole.onExtraCallback(futures3)));
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(futures3, "");
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(tinyDebugConsole.onExtraCallback(futures3)));
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 79;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 92 / 0;
        }
        return unit2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str, String str2, String str3, String str4, String str5, String str6, reload reloadVar) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 67;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.areEqual((getEngineType) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult(), getEngineType.onExtraCallbackWithResult.onExtraCallback);
            throw null;
        }
        getEngineType getenginetype = (getEngineType) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        getEngineType.onExtraCallbackWithResult onextracallbackwithresult = getEngineType.onExtraCallbackWithResult.onExtraCallback;
        if (Intrinsics.areEqual(getenginetype, onextracallbackwithresult)) {
            getEngineRouter.IAuthTabCallback.onExtraCallbackWithResult(str, str2, str3, str4);
            int i4 = onWarmupCompleted + 5;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 4;
            }
        } else if (Intrinsics.areEqual(getenginetype, getEngineType.onExtraCallback.onExtraCallbackWithResult)) {
            int i6 = IAuthTabCallback + 1;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            getEngineRouter.onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{getEngineRouter.IAuthTabCallback, str5, str6, str3, str4}, -1319036255, 1319036255);
        }
        getEngineType getenginetype2 = (getEngineType) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (Intrinsics.areEqual(getenginetype2, onextracallbackwithresult)) {
            int i8 = onWarmupCompleted + 83;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0 ? (i = onExtraCallback.onExtraCallbackWithResult[reloadVar.ordinal()]) == 1 : (i = onExtraCallback.onExtraCallbackWithResult[reloadVar.ordinal()]) == 1) {
                getsupportedhighspeedresolutionsfor.IAuthTabCallback(new getEngineType.onNavigationEvent(createEngineRouter.TextButton));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i9 = IAuthTabCallback + 43;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                getsupportedhighspeedresolutionsfor.IAuthTabCallback(getEngineType.onExtraCallback.onExtraCallbackWithResult);
            }
        } else if (Intrinsics.areEqual(getenginetype2, getEngineType.onExtraCallback.onExtraCallbackWithResult)) {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(new getEngineType.onNavigationEvent(createEngineRouter.TextButton));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, String str, String str2, String str3, String str4, String str5, String str6, reload reloadVar, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 37;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iscontainerclickable, "");
            Intrinsics.checkNotNullParameter(getswitchminwidth, "");
            if ((i & 70) == 0) {
                int i7 = IAuthTabCallback + 77;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 6 / 0;
                    i2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable) ? 4 : 2;
                } else if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable))) {
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(iscontainerclickable, "");
            Intrinsics.checkNotNullParameter(getswitchminwidth, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            int i9 = onWarmupCompleted + 1;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) {
                int i11 = onWarmupCompleted + 3;
                IAuthTabCallback = i11 % 128;
                i4 = i11 % 2 == 0 ? 63 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                Object[] objArr = new Object[1];
                a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 123, TextUtils.lastIndexOf("", '0') + 104, new char[]{15, 20, 20, 15, 65506, 14, 5, 18, '\t', 65523, 65480, 65472, 65502, 19, 21, 15, '\r', 25, 14, 15, 14, 1, 65500, 65486, 65502, 19, 21, 15, '\r', 25, 14, 15, 14, 1, 65500, 65486, 65502, 19, 21, 15, '\r', 25, 14, 15, 14, 1, 65500, 65486, 14, 5, 5, 18, 3, 65523, 20, 5, 5, '\b', 65523, '\r', 15, 20, 20, 15, 65506, 14, 5, 18, '\t', 65523, 65486, 14, 5, 5, 18, 3, 19, 65486, '\f', 16, '\r', '\t', 65486, 19, 4, 6, 65486, 19, 5, 18, 21, 20, 1, 5, 6, 65486, 19, 19, 15, 20, 65486, '\r', '\t', 65481, 65496, 65494, 65490, 65498, 20, 11, 65486, 14, 5, 5, 18, 3, 65523, 20, 5, 5, '\b', 65523, '\r'}, true, 99 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1683134463, i3, -1, ((String) objArr[0]).intern());
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = meteringRepeatingSessionExternalSyntheticLambda0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f)), QuirkSettingsLoader.Companion.onTransact());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new SirenBottomSheetScreenKt$.ExternalSyntheticLambda1(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsInterface = sendMsgFromVConsoleToAppx.asInterface(r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized), iscontainerclickable, getswitchminwidth);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str3);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str4);
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str5);
            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str6);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(reloadVar.ordinal());
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4 | zOnNavigationEvent5 | zOnNavigationEvent6 | zOnExtraCallback) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new SirenBottomSheetScreenKt$.ExternalSyntheticLambda2(getsupportedhighspeedresolutionsfor2, str2, str3, str, str4, str5, str6, reloadVar);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            BaseRenderImpl.IAuthTabCallback(quirksExternalSyntheticBackport0AsInterface, str, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = IAuthTabCallback + 103;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x030d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, String str, String str2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, String str3, String str4, setNativeBridge setnativebridge, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7, String str5, String str6, String str7, reload reloadVar, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(iscontainerclickable, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable)) {
                int i5 = onWarmupCompleted + 67;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 147) != 146, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr = new Object[1];
                a(98 - ((byte) KeyEvent.getModifierMetaStateMask()), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 80, new char[]{5, 20, 65487, '\n', 14, 17, '\r', 65487, 20, 4, 19, 6, 6, 15, 65487, 65524, '\n', 19, 6, 15, 65507, 16, 21, 21, 16, 14, 65524, '\t', 6, 6, 21, 65524, 4, 19, 6, 6, 15, 65487, 65501, 2, 15, 16, 15, 26, 14, 16, 22, 20, 65503, 65473, 65481, 65524, '\n', 19, 6, 15, 65507, 16, 21, 21, 16, 14, 65524, '\t', 6, 6, 21, 65524, 4, 19, 6, 6, 15, 65487, '\f', 21, 65499, 65490, 65493, 65494, 65482, '\n', 14, 65487, 21, 16, 20, 20, 65487, 7, 6, 2, 21, 22, 19, 6, 20, 65487, 7}, false, 97 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-839426452, i2, -1, ((String) objArr[0]).intern());
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = sendMsgFromVConsoleToAppx.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(YuvImageOnePixelShiftQuirk.onExtraCallback(onextracallback), 0.0f, 1, (Object) null), iscontainerclickable, getswitchminwidth);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallback = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallback();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallback, onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 54);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 10, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i7 = onWarmupCompleted + 43;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                    obj.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                int i8 = IAuthTabCallback + 65;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), onextracallbackwithresult.onWarmupCompleted());
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted3);
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i10 = IAuthTabCallback + 61;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    int i11 = 56 / 0;
                } else {
                    getAwbState.onExtraCallback();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
            MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor5.onExtraCallbackWithResult(), null, 0, 0, ForwardingCameraControl.onExtraCallback(-1338706020, true, new SirenBottomSheetScreenKt$.ExternalSyntheticLambda9(lowLightBoostControlExternalSyntheticLambda0, setnativebridge, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor7), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24576, 14}, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
            if (getsupportedhighspeedresolutionsfor3.onExtraCallbackWithResult() == getTopRender.Text1) {
                int i12 = IAuthTabCallback + 123;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 32 / 0;
                    z = !(getsupportedhighspeedresolutionsfor4.onExtraCallbackWithResult() instanceof getEngineType.onNavigationEvent);
                } else if (!(getsupportedhighspeedresolutionsfor4.onExtraCallbackWithResult() instanceof getEngineType.onNavigationEvent)) {
                }
                BaseRenderImpl.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted5, str3, str4, z, 0, 0, cameraCaptureResultEmptyCameraCaptureResult, 6, 48);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), onextracallbackwithresult.onWarmupCompleted());
                if (getsupportedhighspeedresolutionsfor3.onExtraCallbackWithResult() == getTopRender.Text2) {
                    int i14 = onWarmupCompleted + 125;
                    IAuthTabCallback = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 52 / 0;
                        z2 = (getsupportedhighspeedresolutionsfor4.onExtraCallbackWithResult() instanceof getEngineType.onNavigationEvent) ^ true;
                    } else if (!(getsupportedhighspeedresolutionsfor4.onExtraCallbackWithResult() instanceof getEngineType.onNavigationEvent)) {
                    }
                    BaseRenderImpl.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted6, str, str2, z2, 0, 0, cameraCaptureResultEmptyCameraCaptureResult, 0, 48);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                    MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult(), null, 0, 0, ForwardingCameraControl.onExtraCallback(228314520, true, new SirenBottomSheetScreenKt$.ExternalSyntheticLambda10(str5, str3, str4, str6, str, str2, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24576, 14}, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
                    MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor2.onExtraCallbackWithResult(), null, 0, 0, ForwardingCameraControl.onExtraCallback(-1683134463, true, new SirenBottomSheetScreenKt$.ExternalSyntheticLambda11(lowLightBoostControlExternalSyntheticLambda0, str7, str3, str4, str6, str, str2, reloadVar, getsupportedhighspeedresolutionsfor8, getsupportedhighspeedresolutionsfor4), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24576, 14}, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
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

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<getEngineType> $screenStep;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<getEngineType> getsupportedhighspeedresolutionsfor, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$screenStep = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$screenStep, access13800Var);
            int i2 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 38 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onextracallbackwithresultCreate.invokeSuspend(unit);
            }
            onextracallbackwithresultCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 63;
            onNavigationEvent = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i2 + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i5 == 0) {
                this.$screenStep.IAuthTabCallback(getEngineType.onExtraCallbackWithResult.onExtraCallback);
                return Unit.INSTANCE;
            }
            this.$screenStep.IAuthTabCallback(getEngineType.onExtraCallbackWithResult.onExtraCallback);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull reload reloadVar, @Nullable String str7, @Nullable Integer num, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) throws Throwable {
        int i4;
        Integer num2;
        int i5;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        String str8;
        Integer num3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i6;
        int i7;
        CameraPresenceProviderExternalSyntheticLambda0 cameraPresenceProviderExternalSyntheticLambda0;
        int i8;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        access13800 access13800Var;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2;
        boolean z2;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3;
        boolean z4;
        boolean z5;
        int i15 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(reloadVar, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1163733867);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i16 = onWarmupCompleted + 87;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str5) ^ true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str6) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(reloadVar.ordinal()) ? 1048576 : 524288;
        }
        int i18 = i3 & 128;
        if (i18 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str7) ^ true) ? 8388608 : 4194304;
        }
        int i19 = i3 & 256;
        if (i19 == 0) {
            if ((100663296 & i) == 0) {
                num2 = num;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(num2) ? 67108864 : 33554432;
            }
            if ((i & 805306368) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 536870912 : 268435456;
            }
            if ((i2 & 6) != 0) {
                i5 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 4 : 2);
            } else {
                i5 = i2;
            }
            if ((i2 & 48) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03) ? 32 : 16;
            }
            int i20 = i5;
            if ((i4 & 306783379) != 306783378) {
                int i21 = IAuthTabCallback + 87;
                onWarmupCompleted = i21 % 128;
                int i22 = i21 % 2;
                z = (i20 & 19) != 18;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                str8 = str7;
                num3 = num2;
            } else {
                String str9 = i18 != 0 ? null : str7;
                if (i19 != 0) {
                    num2 = null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    Object[] objArr = new Object[1];
                    a(87 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 22 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{16, 21, 21, 16, 14, 65524, '\t', 6, 6, 21, 65524, 4, 19, 6, 6, 15, 65487, '\f', 21, 65499, 65495, 65491, 65482, '\n', 14, 65487, 21, 16, 20, 20, 65487, 7, 6, 2, 21, 22, 19, 6, 20, 65487, 7, 5, 20, 65487, '\n', 14, 17, '\r', 65487, 20, 4, 19, 6, 6, 15, 65487, 65524, '\n', 19, 6, 15, 65507, 16, 21, 21, 16, 14, 65524, '\t', 6, 6, 21, 65524, 4, 19, 6, 6, 15, 65473, 65481, 65524, '\n', 19, 6, 15, 65507}, false, 97 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1163733867, i4, i20, ((String) objArr[0]).intern());
                }
                setNativeBridge setnativebridgeOnNavigationEvent = getNode.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    int i23 = IAuthTabCallback + 125;
                    onWarmupCompleted = i23 % 128;
                    i6 = 2;
                    int i24 = i23 % 2;
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setUseCaseAttached.onNavigationEvent(setUseCaseAttached.Companion.IAuthTabCallback()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                } else {
                    i6 = 2;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setUseCaseAttached.onNavigationEvent(setUseCaseAttached.Companion.IAuthTabCallback()), (CameraPresenceProviderExternalSyntheticLambda0) null, i6, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getTopRender.Text1, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                    objOnMinimized3 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(((Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult())).screenWidthDp);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    i7 = i4;
                    objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getEngineType.onWarmupCompleted.onExtraCallback, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                } else {
                    i7 = i4;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7 = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    int i25 = IAuthTabCallback + 101;
                    onWarmupCompleted = i25 % 128;
                    if (i25 % 2 != 0) {
                        cameraPresenceProviderExternalSyntheticLambda0 = null;
                        objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(createNativeBridge.onExtraCallbackWithResult.IAuthTabCallback, (CameraPresenceProviderExternalSyntheticLambda0) null, 5, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                    } else {
                        cameraPresenceProviderExternalSyntheticLambda0 = null;
                        objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(createNativeBridge.onExtraCallbackWithResult.IAuthTabCallback, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                    }
                } else {
                    cameraPresenceProviderExternalSyntheticLambda0 = null;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8 = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized6 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getCurrentUri.onExtraCallbackWithResult.IAuthTabCallback, cameraPresenceProviderExternalSyntheticLambda0, 2, cameraPresenceProviderExternalSyntheticLambda0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9 = (getSupportedHighSpeedResolutionsFor) objOnMinimized6;
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized7 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getEngine.onExtraCallbackWithResult.onWarmupCompleted, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10 = (getSupportedHighSpeedResolutionsFor) objOnMinimized7;
                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                    int i26 = IAuthTabCallback + 33;
                    onWarmupCompleted = i26 % 128;
                    int i27 = i26 % 2;
                    objOnMinimized8 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getBackPerform.onWarmupCompleted.onWarmupCompleted, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11 = (getSupportedHighSpeedResolutionsFor) objOnMinimized8;
                Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                    i8 = 2;
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getExitPerform.onWarmupCompleted.IAuthTabCallback, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted2);
                    int i28 = IAuthTabCallback + 9;
                    onWarmupCompleted = i28 % 128;
                    int i29 = i28 % 2;
                    objOnMinimized9 = getsupportedhighspeedresolutionsforOnWarmupCompleted2;
                } else {
                    i8 = 2;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12 = (getSupportedHighSpeedResolutionsFor) objOnMinimized9;
                Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized10 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getApplication.onExtraCallbackWithResult.onExtraCallbackWithResult, (CameraPresenceProviderExternalSyntheticLambda0) null, i8, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized10);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor13 = (getSupportedHighSpeedResolutionsFor) objOnMinimized10;
                Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized11 = new SirenBottomSheetScreenKt$.ExternalSyntheticLambda3(getsupportedhighspeedresolutionsfor7);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized11);
                }
                requestPostMessageChannel.onExtraCallbackWithResult(false, (Function0) objOnMinimized11, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 1);
                MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor8.onExtraCallbackWithResult(), null, 0, 0, ForwardingCameraControl.onExtraCallback(347798259, true, new SirenBottomSheetScreenKt$.ExternalSyntheticLambda4(num2, setnativebridgeOnNavigationEvent), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 14}, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
                MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor9.onExtraCallbackWithResult(), null, 0, 0, ForwardingCameraControl.onExtraCallback(885415786, true, new SirenBottomSheetScreenKt$.ExternalSyntheticLambda5(fIAuthTabCallback, getsupportedhighspeedresolutionsfor4, setnativebridgeOnNavigationEvent), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 14}, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
                MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor12.onExtraCallbackWithResult(), null, 0, 0, ForwardingCameraControl.onExtraCallback(-2124488981, true, new SirenBottomSheetScreenKt$.ExternalSyntheticLambda6(setnativebridgeOnNavigationEvent, getsupportedhighspeedresolutionsfor5), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 14}, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
                int i30 = i7;
                num3 = num2;
                MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor8.onExtraCallbackWithResult(), null, 0, 0, ForwardingCameraControl.onExtraCallback(-839426452, true, new SirenBottomSheetScreenKt$.ExternalSyntheticLambda7(getsupportedhighspeedresolutionsfor13, getsupportedhighspeedresolutionsfor11, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor7, str3, str4, getsupportedhighspeedresolutionsfor10, str, str2, setnativebridgeOnNavigationEvent, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor4, str5, str9, str6, reloadVar, getsupportedhighspeedresolutionsfor5), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 14}, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
                Unit unit = Unit.INSTANCE;
                Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                    getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor7;
                    access13800Var = null;
                    objOnMinimized12 = new onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized12);
                } else {
                    getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor7;
                    access13800Var = null;
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized12, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized13 == onwarmupcompleted.onExtraCallback()) {
                    getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor9;
                    objOnMinimized13 = new onWarmupCompleted(getsupportedhighspeedresolutionsfor2, access13800Var);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized13);
                } else {
                    getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor9;
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(getsupportedhighspeedresolutionsfor2, (Function2) objOnMinimized13, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                int i31 = i30 & 14;
                if (i31 == 4) {
                    int i32 = IAuthTabCallback + 1;
                    onWarmupCompleted = i32 % 128;
                    int i33 = i32 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i34 = i30 & 112;
                boolean z6 = i34 == 32;
                int i35 = i30 & 29360128;
                boolean z7 = i35 == 8388608;
                int i36 = i30 & 896;
                if (i36 == 256) {
                    int i37 = IAuthTabCallback + 7;
                    onWarmupCompleted = i37 % 128;
                    int i38 = i37 % 2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i39 = i30 & 7168;
                boolean z8 = i39 == 2048;
                boolean z9 = (i30 & 1879048192) == 536870912;
                boolean z10 = (i20 & 14) == 4;
                boolean z11 = (i20 & 112) == 32;
                Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (((z2 | z6 | z7 | z3 | z8 | z9 | z10) || z11) || objOnMinimized14 == onwarmupcompleted.onExtraCallback()) {
                    i9 = i34;
                    i10 = i35;
                    i11 = i36;
                    i12 = i31;
                    i13 = i30;
                    i14 = i39;
                    getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor;
                    z4 = true;
                    IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(getsupportedhighspeedresolutionsfor, str, str2, str9, getsupportedhighspeedresolutionsfor8, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor13, getsupportedhighspeedresolutionsfor11, str3, str4, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor12, getsupportedhighspeedresolutionsfor6, function0, function02, function03, (access13800) null);
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(iAuthTabCallback);
                    objOnMinimized14 = iAuthTabCallback;
                } else {
                    i12 = i31;
                    i9 = i34;
                    i11 = i36;
                    i10 = i35;
                    i13 = i30;
                    i14 = i39;
                    getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    z4 = true;
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(getsupportedhighspeedresolutionsfor3, (Function2) objOnMinimized14, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                boolean z12 = i12 == 4 ? z4 : false;
                if (i9 == 32) {
                    int i40 = onWarmupCompleted + 47;
                    IAuthTabCallback = i40 % 128;
                    int i41 = i40 % 2;
                    z5 = z4;
                } else {
                    z5 = false;
                }
                boolean z13 = (i13 & 458752) == 131072 ? z4 : false;
                boolean z14 = i10 == 8388608 ? z4 : false;
                boolean z15 = i11 == 256 ? z4 : false;
                if (i14 != 2048) {
                    z4 = false;
                }
                Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if ((z5 | z12 | z13 | z14 | z15 | z4) || objOnMinimized15 == onwarmupcompleted.onExtraCallback()) {
                    onNavigationEvent onnavigationevent = new onNavigationEvent(getsupportedhighspeedresolutionsfor11, str, str2, str6, str9, str3, str4, (access13800) null);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(onnavigationevent);
                    objOnMinimized15 = onnavigationevent;
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(getsupportedhighspeedresolutionsfor11, (Function2) objOnMinimized15, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                str8 = str9;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new SirenBottomSheetScreenKt$.ExternalSyntheticLambda8(str, str2, str3, str4, str5, str6, reloadVar, str8, num3, function0, function02, function03, i, i2, i3));
                int i42 = onWarmupCompleted + 115;
                IAuthTabCallback = i42 % 128;
                int i43 = i42 % 2;
                return;
            }
            return;
        }
        i4 |= 100663296;
        num2 = num;
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i202 = i5;
        if ((i4 & 306783379) != 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, String str3, String str4, String str5, String str6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, 707204570, objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -707204570, iOnNavigationEvent2);
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Futures3 futures3) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, -1487428317, new Object[]{getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, futures3}, iOnNavigationEvent3, 1487428319, iOnNavigationEvent2);
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str, String str2, String str3, String str4, String str5, String str6, reload reloadVar) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, str, str2, str3, str4, str5, str6, reloadVar};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, -747313579, objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 747313582, iOnNavigationEvent2);
    }

    public static /* synthetic */ Unit onNavigationEvent(Integer num, setNativeBridge setnativebridge, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {num, setnativebridge, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, 1740635884, objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1740635880, iOnNavigationEvent2);
    }

    private static final Unit onNavigationEvent(float f, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, setNativeBridge setnativebridge, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Float.valueOf(f), getsupportedhighspeedresolutionsfor, setnativebridge, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, 1551770122, objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1551770117, iOnNavigationEvent2);
    }

    private static final Unit onWarmupCompleted(setNativeBridge setnativebridge, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {setnativebridge, getsupportedhighspeedresolutionsfor, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, -1001228521, objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1001228522, iOnNavigationEvent2);
    }
}
