package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.common.collect.Synchronized;
import com.skt.usp.UCPApiConstants;
import im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageViewModel;
import im.toss.features.credit.CreditBaseViewModel;
import im.toss.features.credit.data.response.QuizHistory;
import im.toss.features.credit.ui.quiz.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityResultPoint;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.getViewTypeCount;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ActivityResultPoint {
    private static final byte[] $$a = {79, -7, -1, -17};
    private static final int $$b = 12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onExtraCallback = 4799057102014525249L;
    private static int onNavigationEvent = -1776194565;
    private static char IAuthTabCallback = 27643;

    private static String $$c(short s, byte b, byte b2) {
        int i = s + 4;
        int i2 = 110 - b2;
        int i3 = b * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 += i3;
        }
        while (true) {
            i4++;
            i++;
            bArr2[i4] = (byte) i2;
            if (i4 == i3) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i];
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, CreditQuizMyPageViewModel creditQuizMyPageViewModel, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {str, creditQuizMyPageViewModel, quirksExternalSyntheticBackport0, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        if (i6 != 0) {
            int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            return (Unit) onNavigationEvent(-953095289, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 953095289, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent);
        }
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(-953095289, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 953095289, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2);
        int i7 = 15 / 0;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(enableactivitymonitorinitfloatopt, str, setDetectableSize);
        }
        onExtraCallbackWithResult(enableactivitymonitorinitfloatopt, str, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(QuizHistory quizHistory, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(quizHistory, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, enableactivitymonitorinitfloatopt, str);
        int i4 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onExtraCallbackWithResult(String str, CreditQuizMyPageViewModel creditQuizMyPageViewModel, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(str, creditQuizMyPageViewModel, quirksExternalSyntheticBackport0, (Function1<? super String, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 37 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = i4 | i6;
        int i8 = ~i;
        int i9 = ~i6;
        int i10 = ~(i8 | i9);
        int i11 = (~(i6 | i8)) | (~(i9 | i4));
        int i12 = i4 + i + i2 + (1389894630 * i5) + ((-1243605516) * i3);
        int i13 = i12 * i12;
        int i14 = ((-345998475) * i4) + 1335230464 + (862422157 * i) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i2) + (1607991296 * i5) + ((-548405248) * i3) + ((-1553596416) * i13);
        int i15 = ((i4 * (-88671125)) - 261777699) + (i * (-88671149)) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + (i2 * (-88671137)) + (i5 * (-349388198)) + (i3 * (-147040884)) + (i13 * 182059008);
        int i16 = i14 + (i15 * i15 * (-132513792));
        if (i16 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 2) {
            return IAuthTabCallback(objArr);
        }
        String str = (String) objArr[0];
        CreditQuizMyPageViewModel creditQuizMyPageViewModel = (CreditQuizMyPageViewModel) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        ((Number) objArr[7]).intValue();
        int i17 = 2 % 2;
        int i18 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i18 % 128;
        int i19 = i18 % 2;
        onNavigationEvent(str, creditQuizMyPageViewModel, quirksExternalSyntheticBackport0, (Function1<? super String, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i20 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i20 % 128;
        int i21 = i20 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditQuizMyPageViewModel creditQuizMyPageViewModel, enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditQuizMyPageViewModel, enableactivitymonitorinitfloatopt, str);
        int i4 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuizHistory quizHistory, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quizHistory, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt = (enableActivityMonitorInitFloatOpt) objArr[0];
        String str = (String) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(-485498039, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{enableactivitymonitorinitfloatopt, str, setDetectableSize}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 485498041, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent);
        int i4 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, CreditQuizMyPageViewModel creditQuizMyPageViewModel, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, creditQuizMyPageViewModel, quirksExternalSyntheticBackport0, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt = (enableActivityMonitorInitFloatOpt) objArr[0];
        String str = (String) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("text1", enableactivitymonitorinitfloatopt.IAuthTabCallbackDefault());
        setDetectableSize.onExtraCallback("text2", enableactivitymonitorinitfloatopt.onTransact());
        setDetectableSize.onExtraCallback("banner_id", enableactivitymonitorinitfloatopt.onWarmupCompleted());
        Object[] objArr2 = new Object[1];
        a((char) (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{12475, 58979, 12120, 28908, 33275, 13504, 64904, 53474}, new char[]{17594, 26693, 41271, 11939}, new char[]{55175, 28983, 31113, 3568}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        setDetectableSize.onExtraCallback("service_referrer", "credit_my_quiz_detail");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(CreditQuizMyPageViewModel creditQuizMyPageViewModel, final enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, final String str) {
        int i = 2 % 2;
        CreditBaseViewModel.onExtraCallback(creditQuizMyPageViewModel, 1266249L, (String) null, false, false, new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageHistoryScreenKt$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 23;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {enableactivitymonitorinitfloatopt, str, (SetDetectableSize) obj};
                int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                Unit unit = (Unit) ActivityResultPoint.onNavigationEvent(-843255739, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 843255740, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent);
                int i5 = onExtraCallback + 91;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        }, 10, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("text1", enableactivitymonitorinitfloatopt.IAuthTabCallbackDefault());
        setDetectableSize.onExtraCallback("text2", enableactivitymonitorinitfloatopt.onTransact());
        setDetectableSize.onExtraCallback("banner_id", enableactivitymonitorinitfloatopt.onWarmupCompleted());
        Object[] objArr = new Object[1];
        a((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (-1) - Process.getGidForName(""), new char[]{12475, 58979, 12120, 28908, 33275, 13504, 64904, 53474}, new char[]{17594, 26693, 41271, 11939}, new char[]{55175, 28983, 31113, 3568}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("service_referrer", "credit_my_quiz_detail");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(Function1 function1, final enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, final String str) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1266251L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageHistoryScreenKt$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 53;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = ActivityResultPoint.IAuthTabCallback(enableactivitymonitorinitfloatopt, str, (SetDetectableSize) obj);
                int i5 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitIAuthTabCallback;
            }
        }, 14, null);
        String strOnExtraCallback = enableactivitymonitorinitfloatopt.onExtraCallback();
        Object[] objArr = new Object[1];
        a((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), '0' - AndroidCharacter.getMirror('0'), new char[]{12475, 58979, 12120, 28908, 33275, 13504, 64904, 53474}, new char[]{17594, 26693, 41271, 11939}, new char[]{55175, 28983, 31113, 3568}, objArr);
        function1.invoke(convertAnyToMap.onExtraCallback(strOnExtraCallback, ((String) objArr[0]).intern(), "credit_quiz_mypage_detail"));
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023d  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final String str, @NotNull final CreditQuizMyPageViewModel creditQuizMyPageViewModel, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        boolean z;
        ?? r0;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(creditQuizMyPageViewModel, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1713876292);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i7 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditQuizMyPageViewModel) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                int i10 = onWarmupCompleted + 91;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 93 / 0;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                        int i12 = onWarmupCompleted + 47;
                        onExtraCallbackWithResult = i12 % 128;
                        i5 = i12 % 2 == 0 ? 12237 : 2048;
                    } else {
                        i5 = 1024;
                    }
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                }
                i3 |= i5;
            }
            i4 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 1171) == 1170, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i9 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1713876292, i4, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageHistoryScreen (CreditQuizMyPageHistoryScreen.kt:40)");
                }
                setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                Object objOnNavigationEvent = ((kotlin.Result) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(creditQuizMyPageViewModel.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult()).onNavigationEvent();
                Object obj = null;
                if (kotlin.Result.onExtraCallback(objOnNavigationEvent)) {
                    objOnNavigationEvent = null;
                }
                ActivityOnPausePoint activityOnPausePoint = (ActivityOnPausePoint) objOnNavigationEvent;
                if (activityOnPausePoint == null) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i13 = onWarmupCompleted + 25;
                        onExtraCallbackWithResult = i13 % 128;
                        if (i13 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            obj.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        function2 = new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageHistoryScreenKt$$ExternalSyntheticLambda3
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i14 = 2 % 2;
                                int i15 = onExtraCallback + 89;
                                onNavigationEvent = i15 % 128;
                                int i16 = i15 % 2;
                                Object obj4 = null;
                                String str2 = str;
                                CreditQuizMyPageViewModel creditQuizMyPageViewModel2 = creditQuizMyPageViewModel;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport05;
                                Function1 function12 = function1;
                                int i17 = i;
                                int i18 = i2;
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                if (i16 == 0) {
                                    ActivityResultPoint.IAuthTabCallback(str2, creditQuizMyPageViewModel2, quirksExternalSyntheticBackport06, function12, i17, i18, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue);
                                    obj4.hashCode();
                                    throw null;
                                }
                                Unit unitIAuthTabCallback = ActivityResultPoint.IAuthTabCallback(str2, creditQuizMyPageViewModel2, quirksExternalSyntheticBackport06, function12, i17, i18, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue);
                                int i19 = onExtraCallback + 47;
                                onNavigationEvent = i19 % 128;
                                if (i19 % 2 != 0) {
                                    return unitIAuthTabCallback;
                                }
                                throw null;
                            }
                        };
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                        return;
                    }
                    return;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport05, 0.0f, 1, (Object) null), setcontentinsetsrelativeIAuthTabCallback, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout())) {
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
                QuizHistory quizHistoryIAuthTabCallbackStub = activityOnPausePoint.IAuthTabCallbackStub();
                if (quizHistoryIAuthTabCallbackStub == null) {
                    int i14 = onExtraCallbackWithResult + 99;
                    onWarmupCompleted = i14 % 128;
                    if (i14 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(281408737);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(281408737);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    z = false;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(281408738);
                    z = false;
                    onWarmupCompleted(quizHistoryIAuthTabCallbackStub, true, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 6);
                final enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatoptOnExtraCallbackWithResult = activityOnPausePoint.onExtraCallbackWithResult();
                if (enableactivitymonitorinitfloatoptOnExtraCallbackWithResult != null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(281688482);
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditQuizMyPageViewModel);
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(enableactivitymonitorinitfloatoptOnExtraCallbackWithResult);
                    int i15 = i4 & 14;
                    boolean z2 = i15 == 4 ? true : z;
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnExtraCallback | zOnExtraCallback2 | z2)) {
                        Object obj2 = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageHistoryScreenKt$$ExternalSyntheticLambda4
                                private static int onNavigationEvent = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke() {
                                    Unit unitOnNavigationEvent;
                                    int i16 = 2 % 2;
                                    int i17 = onNavigationEvent + 119;
                                    onWarmupCompleted = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        unitOnNavigationEvent = ActivityResultPoint.onNavigationEvent(creditQuizMyPageViewModel, enableactivitymonitorinitfloatoptOnExtraCallbackWithResult, str);
                                        int i18 = 49 / 0;
                                    } else {
                                        unitOnNavigationEvent = ActivityResultPoint.onNavigationEvent(creditQuizMyPageViewModel, enableactivitymonitorinitfloatoptOnExtraCallbackWithResult, str);
                                    }
                                    int i19 = onNavigationEvent + 63;
                                    onWarmupCompleted = i19 % 128;
                                    int i20 = i19 % 2;
                                    return unitOnNavigationEvent;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0);
                            obj2 = function0;
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback, 0.0f, null, (Function0) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 3);
                        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
                        String strOnNavigationEvent = enableactivitymonitorinitfloatoptOnExtraCallbackWithResult.onNavigationEvent();
                        String strIAuthTabCallbackDefault = enableactivitymonitorinitfloatoptOnExtraCallbackWithResult.IAuthTabCallbackDefault();
                        String strOnTransact = enableactivitymonitorinitfloatoptOnExtraCallbackWithResult.onTransact();
                        getViewTypeCount.onTransact ontransactOnNavigationEvent = getViewTypeCount.onTransact.Companion.onNavigationEvent();
                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(enableactivitymonitorinitfloatoptOnExtraCallbackWithResult);
                        boolean z3 = i15 == 4;
                        if ((i4 & 7168) == 2048) {
                            int i16 = onExtraCallbackWithResult + 105;
                            onWarmupCompleted = i16 % 128;
                            boolean z4 = i16 % 2 == 0;
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(zOnExtraCallback3 | z3 | z4)) {
                                int i17 = onWarmupCompleted + 107;
                                onExtraCallbackWithResult = i17 % 128;
                                int i18 = i17 % 2;
                                Object obj3 = objOnMinimized2;
                                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageHistoryScreenKt$$ExternalSyntheticLambda5
                                        private static int IAuthTabCallback = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke() throws Throwable {
                                            int i19 = 2 % 2;
                                            int i20 = IAuthTabCallback + 103;
                                            onWarmupCompleted = i20 % 128;
                                            int i21 = i20 % 2;
                                            Unit unitOnExtraCallback = ActivityResultPoint.onExtraCallback(function1, enableactivitymonitorinitfloatoptOnExtraCallbackWithResult, str);
                                            int i22 = onWarmupCompleted + 3;
                                            IAuthTabCallback = i22 % 128;
                                            if (i22 % 2 == 0) {
                                                int i23 = 62 / 0;
                                            }
                                            return unitOnExtraCallback;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                                    obj3 = function02;
                                }
                                r0 = 0;
                                EmbedWebviewLoadPoint.onNavigationEvent(quirksExternalSyntheticBackport0OnWarmupCompleted2, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent, strOnNavigationEvent, 0L, false, 0L, strIAuthTabCallbackDefault, strOnTransact, (AvoidCaptureProcessProgressAvailabilityCheckQuirk) null, (setByteOrder) null, (GraphicDeviceInfo) null, (String) null, (setByteOrder) null, false, false, (String) null, ontransactOnNavigationEvent, (getViewTypeCount.onNavigationEvent) null, (Function2) null, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 1572864, 458552);
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                EngineInitFailedPoint2.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                        }
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                    return;
                }
                int i19 = onWarmupCompleted + 49;
                onExtraCallbackWithResult = i19 % 128;
                int i20 = i19 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(281688481);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                r0 = z;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                List<QuizHistory> listOnExtraCallback = activityOnPausePoint.onExtraCallback();
                if (listOnExtraCallback == null) {
                    int i21 = onWarmupCompleted + 97;
                    onExtraCallbackWithResult = i21 % 128;
                    int i22 = i21 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(283138041);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(283138042);
                    Iterator<T> it = listOnExtraCallback.iterator();
                    while (it.hasNext()) {
                        onWarmupCompleted((QuizHistory) it.next(), r0, cameraCaptureResultEmptyCameraCaptureResult2, 48, r0);
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                onPageLoadError.IAuthTabCallbackStub(UCPApiConstants.ARAM_TIME_OUT, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                function2 = new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageHistoryScreenKt$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj4, Object obj5) {
                        int i23 = 2 % 2;
                        int i24 = IAuthTabCallback + 81;
                        onNavigationEvent = i24 % 128;
                        int i25 = i24 % 2;
                        Unit unitOnWarmupCompleted = ActivityResultPoint.onWarmupCompleted(str, creditQuizMyPageViewModel, quirksExternalSyntheticBackport03, function1, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                        int i26 = onNavigationEvent + 49;
                        IAuthTabCallback = i26 % 128;
                        int i27 = i26 % 2;
                        return unitOnWarmupCompleted;
                    }
                };
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                return;
            }
            return;
        }
        i3 |= 384;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 3072) == 0) {
        }
        i4 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 1171) == 1170, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2 = 2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $10 + 41;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 61;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iArgb = 43 - Color.argb(0, 0, 0, 0);
                    int capsMode = 1451 - TextUtils.getCapsMode("", 0, 0);
                    byte b = $$a[c2];
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(longPressTimeout, iArgb, capsMode, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char longPressTimeout2 = (char) (49123 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        int mirror = '\\' - AndroidCharacter.getMirror('0');
                        int edgeSlop = 1494 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b3 = $$a[2];
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(longPressTimeout2, mirror, edgeSlop, 1533236389, false, $$c(b4, (byte) (b4 + 1), (byte) (-b3)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23973 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 49 - ((byte) KeyEvent.getModifierMetaStateMask()), 22987 - AndroidCharacter.getMirror('0'), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 30, View.resolveSize(0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                        cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                        int i7 = $11 + 117;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        c2 = 2;
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
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x043d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final QuizHistory quizHistory, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        boolean z2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Object objOnExtraCallbackWithResult;
        long jICustomTabsService;
        String strOnExtraCallbackWithResult;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        String strIAuthTabCallback;
        long jLongValue;
        int i4;
        final boolean z3 = z;
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(quizHistory, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(36562191);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(quizHistory)) {
                int i8 = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            int i11 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i13 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i13 % 128;
            if (i13 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 32 : 16;
        }
        if ((i3 & 19) != 18) {
            int i14 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1)) {
            if (i10 != 0) {
                int i16 = onExtraCallbackWithResult + 53;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                z3 = false;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i18 = onExtraCallbackWithResult + 83;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(36562191, i3, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizHistoryItem (CreditQuizMyPageHistoryScreen.kt:99)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
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
                int i20 = onWarmupCompleted + 75;
                onExtraCallbackWithResult = i20 % 128;
                if (i20 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    int i21 = 69 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                }
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
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(z3 ? 4.0f : 24.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 5, (Object) null);
            Boolean boolOnNavigationEvent = quizHistory.onNavigationEvent();
            Boolean bool = Boolean.TRUE;
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(Intrinsics.areEqual(boolOnNavigationEvent, bool) ? R.string.category_right : R.string.category_wrong, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(311979242);
            if (Intrinsics.areEqual(quizHistory.onNavigationEvent(), bool)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(311980768);
                objOnExtraCallbackWithResult = addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255);
            } else {
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(311982560);
                    jICustomTabsService = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                    Object obj = null;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, quirksExternalSyntheticBackport0OnExtraCallback2, gethumanreadablenameIAuthTabCallback_Parcel, Long.valueOf(jICustomTabsService), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.IAuthTabCallbackStub(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 196608, 98272}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 7, (Object) null);
                    strOnExtraCallbackWithResult = quizHistory.onExtraCallbackWithResult();
                    if (strOnExtraCallbackWithResult != null) {
                        int i22 = onExtraCallbackWithResult + 87;
                        onWarmupCompleted = i22 % 128;
                        if (i22 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        strOnExtraCallbackWithResult = "";
                    }
                    y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnExtraCallback3, null, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24624, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    strIAuthTabCallback = quizHistory.IAuthTabCallback();
                    if (strIAuthTabCallback == null) {
                        strIAuthTabCallback = "";
                    }
                    hasProvider hasproviderOnNavigationEvent = AppLovinCmpErrorCode.onNavigationEvent(strIAuthTabCallback, (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 2);
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(312001024);
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                    } else {
                        int i23 = onWarmupCompleted + 95;
                        onExtraCallbackWithResult = i23 % 128;
                        if (i23 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(312000064);
                            jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 61).ICustomTabsService();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(312000064);
                            jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnNavigationEvent, (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, jLongValue, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13), 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult2, 24576, 0, 262118);
                    onPageLoadError.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    String str = String.format(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.my_credit_quiz_correct_rate, cameraCaptureResultEmptyCameraCaptureResult2, 0), Arrays.copyOf(new Object[]{quizHistory.onWarmupCompleted()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback(str, (QuirksExternalSyntheticBackport0) null, AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent.Small, AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Blue, AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted.Weak, cameraCaptureResultEmptyCameraCaptureResult2, 28032, 2);
                    onPageLoadError.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(311983520);
                    objOnExtraCallbackWithResult = addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446);
                }
            }
            jICustomTabsService = ((Long) objOnExtraCallbackWithResult).longValue();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            isRepeatingEnabled isrepeatingenabled2 = isRepeatingEnabled.onExtraCallback;
            Object obj2 = null;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, quirksExternalSyntheticBackport0OnExtraCallback2, gethumanreadablenameIAuthTabCallback_Parcel, Long.valueOf(jICustomTabsService), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled2.IAuthTabCallbackStub(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 196608, 98272}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback32 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 7, (Object) null);
            strOnExtraCallbackWithResult = quizHistory.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
            }
            y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnExtraCallback32, null, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled2.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24624, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            strIAuthTabCallback = quizHistory.IAuthTabCallback();
            if (strIAuthTabCallback == null) {
            }
            hasProvider hasproviderOnNavigationEvent2 = AppLovinCmpErrorCode.onNavigationEvent(strIAuthTabCallback, (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 2);
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnNavigationEvent2, (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, jLongValue, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13), 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult2, 24576, 0, 262118);
            onPageLoadError.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 0);
            String str2 = String.format(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.my_credit_quiz_correct_rate, cameraCaptureResultEmptyCameraCaptureResult2, 0), Arrays.copyOf(new Object[]{quizHistory.onWarmupCompleted()}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback(str2, (QuirksExternalSyntheticBackport0) null, AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent.Small, AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Blue, AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted.Weak, cameraCaptureResultEmptyCameraCaptureResult2, 28032, 2);
            onPageLoadError.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult2, 0);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageHistoryScreenKt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj3, Object obj4) {
                    int i24 = 2 % 2;
                    int i25 = onWarmupCompleted + 39;
                    onExtraCallback = i25 % 128;
                    int i26 = i25 % 2;
                    Unit unitOnNavigationEvent = ActivityResultPoint.onNavigationEvent(quizHistory, z3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i27 = onWarmupCompleted + 13;
                    onExtraCallback = i27 % 128;
                    int i28 = i27 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, String str, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onNavigationEvent(-843255739, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{enableactivitymonitorinitfloatopt, str, setDetectableSize}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 843255740, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent);
    }

    private static final Unit onNavigationEvent(String str, CreditQuizMyPageViewModel creditQuizMyPageViewModel, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {str, creditQuizMyPageViewModel, quirksExternalSyntheticBackport0, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onNavigationEvent(-953095289, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 953095289, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent);
    }

    private static final Unit onExtraCallback(enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, String str, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onNavigationEvent(-485498039, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{enableactivitymonitorinitfloatopt, str, setDetectableSize}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 485498041, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent);
    }
}
