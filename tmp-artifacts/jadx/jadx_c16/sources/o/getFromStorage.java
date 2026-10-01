package o;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zziea;
import im.toss.features.leave.R;
import im.toss.features.leave.common.nav.CancellationServiceNav$CancelInProgress;
import im.toss.features.leave.ui.todo.LeaveTodoScreenKt$;
import im.toss.features.leave.ui.todo.LeaveTodoViewModel;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxRewardedInterstitialAdapter;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.getResourceHeaderMap;
import o.oExternalSyntheticLambda0;
import o.r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g;
import o.setApTextSize;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.x2ExternalSyntheticLambda25;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getFromStorage {
    private static final byte[] $$a = {80, 83, -21, -55};
    private static final int $$b = 69;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onNavigationEvent = 1;
    private static char[] IAuthTabCallback = {27822, 53347, 5392, 23237, 40945, 56553, 15, 17758, 35389, 53227, 3213, 28745, 46435, 64056, 16262, 31885, 41401, 58708, 10759, 28523, 44283, 4494, 21791, 39474, 57146, 7298, 16793, 34464, 51829, 3841, 19665, 45562, 63177, 14914, 32565, 48147, 57751, 9922, 27641, 44860, 60444, 20954, 38648, 56232, 8024, 23573, 33126, 50921, 2968, 18592, 60860, 20849, 37890, 56279, 7907, 24059, 33053, 50252, 2863, 20217, 36255, 61787, 13425, 31530, 48788, 64927, 8363, 25670, 43797, 61049, 11753, 37020, 54285, 7039, 24099, 40393, 49306, 1974, 19309, 36362, 52615, 12536, 30619, 47944, 65147, 15656, 24798, 42958, 60087, 11889, 27918, 53442, 6124, 23266, 40458, 56644, ')', 18427, 35467, 51617, 3368, 28701, 47059, 64254, 14764};
    private static long onExtraCallback = -4339822340304842491L;

    private static String $$c(byte b, short s, byte b2) {
        int i = s + 4;
        int i2 = (b2 * 2) + 97;
        byte[] bArr = $$a;
        int i3 = b * 3;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = (-i2) + i3;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i++;
            i2 = (-bArr[i]) + i2;
            i4 = i5;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0);
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        int i5 = onWarmupCompleted + 1;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LeaveTodoViewModel leaveTodoViewModel = (LeaveTodoViewModel) objArr[0];
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[1];
        TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult = (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {leaveTodoViewModel, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        if (i3 != 0) {
            onNavigationEvent(-1441693835, iOnNavigationEvent, 1441693841, iOnNavigationEvent4, objArr2, iOnNavigationEvent3, iOnNavigationEvent2);
            obj.hashCode();
            throw null;
        }
        onNavigationEvent(-1441693835, iOnNavigationEvent, 1441693841, iOnNavigationEvent4, objArr2, iOnNavigationEvent3, iOnNavigationEvent2);
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(LeaveTodoViewModel leaveTodoViewModel, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(leaveTodoViewModel, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 90 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LeaveTodoViewModel leaveTodoViewModel, Function0 function0, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(leaveTodoViewModel, function0, str);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(function0);
        int i4 = onWarmupCompleted + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 93;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i2) | i7);
        int i9 = (~i) | (~(i7 | i2));
        int i10 = i2 | i | i7;
        int i11 = i + i3 + i6 + (1635157569 * i5) + ((-1141649966) * i4);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i) - 711983104) + (488484398 * i3) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i6) + (1462763520 * i5) + (1566572544 * i4) + (1631846400 * i12);
        int i14 = (i * 1521345644) + 2088555610 + (i3 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i6 * 1521345871) + (i5 * (-1382509809)) + (i4 * 37969358) + (i12 * (-671350784));
        switch (i13 + (i14 * i14 * (-1069809664))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                LeaveTodoViewModel leaveTodoViewModel = (LeaveTodoViewModel) objArr[0];
                Function0 function0 = (Function0) objArr[1];
                int i15 = 2 % 2;
                int i16 = onWarmupCompleted + 87;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                Unit unitOnExtraCallback = onExtraCallback(leaveTodoViewModel, function0);
                int i18 = onNavigationEvent + 119;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                return unitOnExtraCallback;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<getBacktraceNote<y0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>>) getsupportedhighspeedresolutionsfor, (getBacktraceNote<? super y0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LeaveTodoViewModel leaveTodoViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(leaveTodoViewModel);
        int i4 = onWarmupCompleted + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onWarmupCompleted(function0, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, Function0 function0, Function1 function1, Function0 function02, Function1 function12, Function0 function03, Function0 function04, Function0 function05, Function0 function06, LeaveTodoViewModel leaveTodoViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 13;
        onWarmupCompleted = i5 % 128;
        IAuthTabCallback(twoLineExternalSyntheticLambda0, function0, function1, function02, function12, function03, function04, function05, function06, leaveTodoViewModel, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 23;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LeaveTodoViewModel leaveTodoViewModel = (LeaveTodoViewModel) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        u3 u3Var = (u3) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr2 = {leaveTodoViewModel, function0, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
            return (Unit) onNavigationEvent(-443618957, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 443618962, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        }
        Object[] objArr3 = {leaveTodoViewModel, function0, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LeaveTodoViewModel leaveTodoViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(leaveTodoViewModel);
        }
        IAuthTabCallback(leaveTodoViewModel);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LeaveTodoViewModel leaveTodoViewModel, Function0 function0, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(leaveTodoViewModel, function0, str);
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        int i5 = onNavigationEvent + 83;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LeaveTodoViewModel leaveTodoViewModel, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 83;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(leaveTodoViewModel, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 71 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0);
        int i4 = onWarmupCompleted + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, Function0 function0, Function1 function1, Function0 function02, Function1 function12, Function0 function03, Function0 function04, Function0 function05, Function0 function06, LeaveTodoViewModel leaveTodoViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        Unit unitOnNavigationEvent;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            unitOnNavigationEvent = onNavigationEvent(twoLineExternalSyntheticLambda0, function0, function1, function02, function12, function03, function04, function05, function06, leaveTodoViewModel, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            int i6 = 82 / 0;
        } else {
            unitOnNavigationEvent = onNavigationEvent(twoLineExternalSyntheticLambda0, function0, function1, function02, function12, function03, function04, function05, function06, leaveTodoViewModel, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        int i7 = onWarmupCompleted + 87;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, LeaveTodoViewModel leaveTodoViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function0 function0, v1 v1Var, Function0 function02, Function0 function03, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 85;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, leaveTodoViewModel, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, cameraPresenceProviderExternalSyntheticLambda6, function0, v1Var, function02, function03, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(-331126145, iOnNavigationEvent, 331126152, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2);
        int i5 = onWarmupCompleted + 37;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage onWarmupCompleted(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LeaveTodoViewModel leaveTodoViewModel, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, leaveTodoViewModel, isinvideousage);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        decrementVideoUsage decrementvideousageOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, leaveTodoViewModel, isinvideousage);
        int i3 = onWarmupCompleted + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return decrementvideousageOnExtraCallbackWithResult;
    }

    public static final class onNavigationEvent implements decrementVideoUsage {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 onExtraCallback;
        final /* synthetic */ LifecycleEventObserver onNavigationEvent;

        public onNavigationEvent(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LifecycleEventObserver lifecycleEventObserver) {
            this.onExtraCallback = textFieldScrollKtExternalSyntheticLambda0;
            this.onNavigationEvent = lifecycleEventObserver;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = this.onExtraCallback.getLifecycle();
            if (i3 != 0) {
                lifecycle.onExtraCallbackWithResult(this.onNavigationEvent);
                return;
            }
            lifecycle.onExtraCallbackWithResult(this.onNavigationEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit asInterface(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 93;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i * i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 59697), View.resolveSizeAndState(0, 0, 0) + 17, 10973 - KeyEvent.getDeadChar(0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getEdgeSlop() >> 16)), Color.green(0) + 31, TextUtils.indexOf("", "") + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, 1493 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(IAuthTabCallback[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - Color.green(0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16, 10973 - (ViewConfiguration.getEdgeSlop() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (Process.myPid() >> 22)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 31, 20219 - ExpandableListView.getPackedPositionChild(0L), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 49123), AndroidCharacter.getMirror('0') - 4, 1542 - AndroidCharacter.getMirror('0'), -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $10 + 101;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i9 = $10 + 111;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 49123), (ViewConfiguration.getJumpTapTimeout() >> 16) + 44, 1494 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1657859959, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback8 == null) {
                byte b7 = (byte) 0;
                byte b8 = (byte) (b7 - 1);
                objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 49123), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44, Color.green(0) + 1494, -1657859959, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback8).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        LeaveTodoViewModel leaveTodoViewModel = (LeaveTodoViewModel) objArr[0];
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[1];
        TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult = (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onextracallbackwithresult != TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_RESUME) {
            return null;
        }
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        leaveTodoViewModel.asBinder();
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        int i5 = onNavigationEvent + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $key;
        final /* synthetic */ Object $popUp;
        final /* synthetic */ Resources $resources$inlined;
        final /* synthetic */ TwoLineExternalSyntheticLambda0 $this_ObservePopUpData;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor $toastLeftPreset$delegate$inlined;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor $toastMessage$delegate$inlined;
        final /* synthetic */ r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 $toastState$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Object obj, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, String str, access13800 access13800Var, Resources resources, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
            super(2, access13800Var);
            this.$popUp = obj;
            this.$this_ObservePopUpData = twoLineExternalSyntheticLambda0;
            this.$key = str;
            this.$resources$inlined = resources;
            this.$toastState$inlined = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
            this.$toastLeftPreset$delegate$inlined = getsupportedhighspeedresolutionsfor;
            this.$toastMessage$delegate$inlined = getsupportedhighspeedresolutionsfor2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$popUp, this.$this_ObservePopUpData, this.$key, access13800Var, this.$resources$inlined, this.$toastState$inlined, this.$toastLeftPreset$delegate$inlined, this.$toastMessage$delegate$inlined);
            int i2 = onNavigationEvent + 93;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 67;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Resources.NotFoundException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 15;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
            int i = 2 % 2;
            if (this.label == 0) {
                ResultKt.onNavigationEvent(obj);
                Object obj2 = this.$popUp;
                if (obj2 != null) {
                    if (IAuthTabCallback.onWarmupCompleted[((RVResourcePresetProxyInputStreamGetter) obj2).ordinal()] == 1) {
                        int i2 = onExtraCallback + 97;
                        onNavigationEvent = i2 % 128;
                        if (i2 % 2 == 0) {
                            Object[] objArr = {this.$toastLeftPreset$delegate$inlined, afterParsePackage.onExtraCallbackWithResult.onNavigationEvent()};
                            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                            getFromStorage.onNavigationEvent(2026616878, iOnNavigationEvent, -2026616877, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2);
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = this.$toastMessage$delegate$inlined;
                            String string = this.$resources$inlined.getString(R.string.leave_cancellation_service_success_toast);
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                            int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                            int iOnNavigationEvent5 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                            getFromStorage.onNavigationEvent(-1768903601, iOnNavigationEvent3, 1768903603, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, string}, iOnNavigationEvent5, iOnNavigationEvent4);
                            this.$toastState$inlined.IAuthTabCallbackStubProxy();
                        } else {
                            Object[] objArr2 = {this.$toastLeftPreset$delegate$inlined, afterParsePackage.onExtraCallbackWithResult.onNavigationEvent()};
                            int iOnNavigationEvent6 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                            int iOnNavigationEvent7 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                            getFromStorage.onNavigationEvent(2026616878, iOnNavigationEvent6, -2026616877, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent7);
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = this.$toastMessage$delegate$inlined;
                            String string2 = this.$resources$inlined.getString(R.string.leave_cancellation_service_success_toast);
                            Intrinsics.checkNotNullExpressionValue(string2, "");
                            int iOnNavigationEvent8 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                            int iOnNavigationEvent9 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                            int iOnNavigationEvent10 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                            getFromStorage.onNavigationEvent(-1768903601, iOnNavigationEvent8, 1768903603, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor2, string2}, iOnNavigationEvent10, iOnNavigationEvent9);
                            this.$toastState$inlined.IAuthTabCallbackStubProxy();
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    }
                    this.$this_ObservePopUpData.onTransact().IAuthTabCallback(this.$key);
                    int i3 = onExtraCallback + 97;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private static final Unit onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            function0.invoke();
            int i3 = 81 / 0;
            return Unit.INSTANCE;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onNavigationEvent + 121;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-984315310, i, -1, "im.toss.features.leave.ui.todo.LeaveTodoScreen.<anonymous> (LeaveTodoScreen.kt:135)");
                int i5 = onNavigationEvent + 1;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i7 = onNavigationEvent + 97;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    LeaveTodoScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new LeaveTodoScreenKt$.ExternalSyntheticLambda0(function0);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                    int i8 = onWarmupCompleted + 119;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    obj2 = externalSyntheticLambda0;
                }
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj2, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 254);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = onWarmupCompleted + 21;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i11 = 78 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(LeaveTodoViewModel leaveTodoViewModel) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        leaveTodoViewModel.asBinder();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(LeaveTodoViewModel leaveTodoViewModel, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = i | (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = onWarmupCompleted + 41;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i6 = onWarmupCompleted + 37;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1323496007, i2, -1, "im.toss.features.leave.ui.todo.LeaveTodoScreen.<anonymous>.<anonymous>.<anonymous> (LeaveTodoScreen.kt:177)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_error_button, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Block;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(leaveTodoViewModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    LeaveTodoScreenKt$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new LeaveTodoScreenKt$.ExternalSyntheticLambda2(leaveTodoViewModel);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                    obj = externalSyntheticLambda2;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = onWarmupCompleted + 107;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = onWarmupCompleted + 91;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        Object obj;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = onWarmupCompleted + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(924783240, i2, -1, "im.toss.features.leave.ui.todo.LeaveTodoScreen.<anonymous>.<anonymous>.<anonymous> (LeaveTodoScreen.kt:187)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_close, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Block;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnNavigationEvent)) {
                LeaveTodoScreenKt$.ExternalSyntheticLambda16 externalSyntheticLambda16 = new LeaveTodoScreenKt$.ExternalSyntheticLambda16(function0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda16);
                int i6 = onNavigationEvent + 111;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                obj = externalSyntheticLambda16;
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = onWarmupCompleted + 51;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
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
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onWarmupCompleted + 39;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(LeaveTodoViewModel leaveTodoViewModel, Function0 function0, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        leaveTodoViewModel.IAuthTabCallback("call");
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(LeaveTodoViewModel leaveTodoViewModel, Function0 function0, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        leaveTodoViewModel.IAuthTabCallback("chat");
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 57;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(LeaveTodoViewModel leaveTodoViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            leaveTodoViewModel.onNavigationEvent("contact_support");
            leaveTodoViewModel.IAuthTabCallbackStub();
            return Unit.INSTANCE;
        }
        leaveTodoViewModel.onNavigationEvent("contact_support");
        leaveTodoViewModel.IAuthTabCallbackStub();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(LeaveTodoViewModel leaveTodoViewModel, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i5 = onNavigationEvent + 85;
                onWarmupCompleted = i5 % 128;
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
            int i7 = onWarmupCompleted + 53;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-112104362, i2, -1, "im.toss.features.leave.ui.todo.LeaveTodoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LeaveTodoScreen.kt:222)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_error_required_tasks_top_accessory_button, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(leaveTodoViewModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i9 = onWarmupCompleted + 95;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 94 / 0;
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        LeaveTodoScreenKt$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new LeaveTodoScreenKt$.ExternalSyntheticLambda1(leaveTodoViewModel);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda1);
                        int i11 = onWarmupCompleted + 27;
                        onNavigationEvent = i11 % 128;
                        obj = externalSyntheticLambda1;
                        if (i11 % 2 == 0) {
                            int i12 = 3 % 2;
                            obj = externalSyntheticLambda1;
                        }
                    }
                    u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 221184, i2 & 14, 966);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 221184, i2 & 14, 966);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(LeaveTodoViewModel leaveTodoViewModel, Function0 function0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        leaveTodoViewModel.onNavigationEvent("close");
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean z;
        Object obj;
        LeaveTodoViewModel leaveTodoViewModel = (LeaveTodoViewModel) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        u3 u3Var = (u3) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int i = 4;
        int iIntValue = ((Number) objArr[4]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                int i3 = onWarmupCompleted + 119;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    i = 5;
                }
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            int i4 = onNavigationEvent + 15;
            onWarmupCompleted = i4 % 128;
            z = i4 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i5 = onWarmupCompleted + 49;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-478379493, iIntValue, -1, "im.toss.features.leave.ui.todo.LeaveTodoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LeaveTodoScreen.kt:233)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_close, cameraCaptureResultEmptyCameraCaptureResult, 0);
            oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(leaveTodoViewModel);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnNavigationEvent)) {
                int i7 = onNavigationEvent + 49;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 28 / 0;
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        LeaveTodoScreenKt$.ExternalSyntheticLambda15 externalSyntheticLambda15 = new LeaveTodoScreenKt$.ExternalSyntheticLambda15(leaveTodoViewModel, function0);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda15);
                        obj = externalSyntheticLambda15;
                    }
                    u3Var.IAuthTabCallback(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, onextracallbackwithresultOnNavigationEvent, 0L, false, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 21) & 29360128) | 3072, 54);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i9 = onWarmupCompleted + 121;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    u3Var.IAuthTabCallback(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, onextracallbackwithresultOnNavigationEvent, 0L, false, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 21) & 29360128) | 3072, 54);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4 = (r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4) objArr[0];
        LeaveTodoViewModel leaveTodoViewModel = (LeaveTodoViewModel) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[2];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[3];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[4];
        Function0 function0 = (Function0) objArr[5];
        v1 v1Var = (v1) objArr[6];
        Function0 function02 = (Function0) objArr[7];
        Function0 function03 = (Function0) objArr[8];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[9];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        int iIntValue = ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((iIntValue & 17) != 16) {
            int i2 = onNavigationEvent + 43;
            onWarmupCompleted = i2 % 128;
            z = i2 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue & 1)) {
            int i3 = onNavigationEvent + 113;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1786348411, iIntValue, -1, "im.toss.features.leave.ui.todo.LeaveTodoScreen.<anonymous> (LeaveTodoScreen.kt:142)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout())) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            r8lambdaIItvJ65H1kry9itpoQE60dxnTI.IAuthTabCallback(onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor), (QuirksExternalSyntheticBackport0) null, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, onWarmupCompleted((getSupportedHighSpeedResolutionsFor<getBacktraceNote<y0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>>) getsupportedhighspeedresolutionsfor2), (getBacktraceNote) null, (Function0) null, (r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w) null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 114);
            getResourceHeaderMap.onExtraCallback onextracallbackOnNavigationEvent = onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<? extends getResourceHeaderMap>) cameraPresenceProviderExternalSyntheticLambda6);
            if (onextracallbackOnNavigationEvent instanceof getResourceHeaderMap.onExtraCallbackWithResult) {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1171742213);
                x2ExternalSyntheticLambda24.onExtraCallback(x2ExternalSyntheticLambda25.IAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallback, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), (x2ExternalSyntheticLambda28) null, x2ExternalSyntheticLambda25.onExtraCallback.onExtraCallback.onNavigationEvent, 0L, (DeviceQuirksExternalSyntheticLambda0) null, cameraCaptureResultEmptyCameraCaptureResult, 3126, 52);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                if (onextracallbackOnNavigationEvent instanceof getResourceHeaderMap.onExtraCallback) {
                    int i4 = onNavigationEvent + 7;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1171412838);
                    getResourceHeaderMap.onExtraCallback onextracallback2 = onextracallbackOnNavigationEvent;
                    getSetupLock.onNavigationEvent(leaveTodoViewModel, onextracallback2.onNavigationEvent(), onextracallback2.IAuthTabCallback(), onextracallback2.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else if (onextracallbackOnNavigationEvent instanceof getResourceHeaderMap.onNavigationEvent) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1170983612);
                    if (((getResourceHeaderMap.onNavigationEvent) onextracallbackOnNavigationEvent).onExtraCallback()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1171000476);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                        String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_error_screen_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        Object[] objArr2 = new Object[1];
                        a(ViewConfiguration.getEdgeSlop() >> 16, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, (char) (KeyEvent.normalizeMetaState(0) + 33042), objArr2);
                        y1h.onNavigationEvent(deprecated_authenticator.onExtraCallback(((String) objArr2[0]).intern()), strOnExtraCallback, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_error_cancellation_screen_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0), quirksExternalSyntheticBackport0OnNavigationEvent2, ForwardingCameraControl.onExtraCallback(1323496007, true, new LeaveTodoScreenKt$.ExternalSyntheticLambda9(leaveTodoViewModel), cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(924783240, true, new LeaveTodoScreenKt$.ExternalSyntheticLambda10(function0), cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 224256, 448);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1169391793);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                        component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent3);
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                            int i6 = onNavigationEvent + 51;
                            onWarmupCompleted = i6 % 128;
                            int i7 = i6 % 2;
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                        if (!(!v1Var.IAuthTabCallback_Parcel())) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1995127941);
                            String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_pending_task_customer_service_connect_bottomsheet_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
                            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(leaveTodoViewModel);
                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function02);
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!(zOnExtraCallback | zOnNavigationEvent)) {
                                Object obj = objOnMinimized;
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    LeaveTodoScreenKt$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new LeaveTodoScreenKt$.ExternalSyntheticLambda11(leaveTodoViewModel, function02);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda11);
                                    obj = externalSyntheticLambda11;
                                }
                                Function1 function1 = (Function1) obj;
                                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(leaveTodoViewModel);
                                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function03);
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(zOnExtraCallback2 | zOnNavigationEvent2)) {
                                    Object obj2 = objOnMinimized2;
                                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        LeaveTodoScreenKt$.ExternalSyntheticLambda12 externalSyntheticLambda12 = new LeaveTodoScreenKt$.ExternalSyntheticLambda12(leaveTodoViewModel, function03);
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda12);
                                        int i8 = onNavigationEvent + 61;
                                        onWarmupCompleted = i8 % 128;
                                        int i9 = i8 % 2;
                                        obj2 = externalSyntheticLambda12;
                                    }
                                    loadSnapshotFile.onNavigationEvent(v1Var, strOnExtraCallback2, function1, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                }
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1995872685);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent4 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                        String strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.leave_error_required_tasks_title, new Object[]{PlayerErrorCode.onPostMessage()}, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        Object[] objArr3 = new Object[1];
                        a(49 - TextUtils.lastIndexOf("", '0', 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 54, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr3);
                        y1h.onNavigationEvent(deprecated_authenticator.onExtraCallback(((String) objArr3[0]).intern()), strIAuthTabCallback, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_error_required_tasks_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0), quirksExternalSyntheticBackport0OnNavigationEvent4, ForwardingCameraControl.onExtraCallback(-112104362, true, new LeaveTodoScreenKt$.ExternalSyntheticLambda13(leaveTodoViewModel), cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote) null, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallback(-478379493, true, new LeaveTodoScreenKt$.ExternalSyntheticLambda14(leaveTodoViewModel, function0), cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 12610560, 352);
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1146013009);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x037e  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, @NotNull Function0<Unit> function0, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function0<Unit> function02, @NotNull Function1<? super String, Unit> function12, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04, @NotNull Function0<Unit> function05, @NotNull Function0<Unit> function06, @Nullable LeaveTodoViewModel leaveTodoViewModel, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        LeaveTodoViewModel leaveTodoViewModel2;
        AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras;
        int i4;
        LeaveTodoViewModel leaveTodoViewModel3;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        int i5;
        CameraPresenceProviderExternalSyntheticLambda0 cameraPresenceProviderExternalSyntheticLambda0;
        Object objOnMinimized2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0;
        v1 v1VarOnExtraCallback;
        boolean zOnExtraCallback;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i6;
        boolean z5;
        boolean zOnNavigationEvent;
        Object objOnMinimized3;
        v1 v1Var;
        int i7;
        Throwable th;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02;
        LeaveTodoViewModel leaveTodoViewModel4;
        ?? r13;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        boolean z6;
        Object objOnMinimized4;
        boolean zOnExtraCallback2;
        boolean zOnExtraCallback3;
        Throwable th2;
        int i8;
        int i9;
        int i10;
        int i11 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function04, "");
        Intrinsics.checkNotNullParameter(function05, "");
        Intrinsics.checkNotNullParameter(function06, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1832843010);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(twoLineExternalSyntheticLambda0)) {
                int i12 = onNavigationEvent + 5;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i14 = onNavigationEvent + 43;
            onWarmupCompleted = i14 % 128;
            if (i14 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i15 = onWarmupCompleted + 29;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                int i17 = onWarmupCompleted + 65;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function04) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function05) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function06) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            int i19 = onWarmupCompleted + 23;
            onNavigationEvent = i19 % 128;
            int i20 = i19 % 2;
            if ((i2 & 512) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(leaveTodoViewModel)) {
                int i21 = onWarmupCompleted + 117;
                onNavigationEvent = i21 % 128;
                if (i21 % 2 == 0) {
                    throw null;
                }
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i3 |= i8;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i3) != 306783378, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((i2 & 512) != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1890788296);
                    TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onWarmupCompleted);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = LongPressTextDragObserverKtExternalSyntheticLambda3.IAuthTabCallback(textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1729797275);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                        int i22 = onNavigationEvent + 99;
                        onWarmupCompleted = i22 % 128;
                        if (i22 % 2 != 0) {
                            textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras();
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        defaultViewModelCreationExtras = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
                    }
                    ViewModel viewModelIAuthTabCallback = DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.IAuthTabCallback(LeaveTodoViewModel.class, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, onwarmupcompletedIAuthTabCallback, defaultViewModelCreationExtras, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 36936, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    i4 = i3 & (-1879048193);
                    leaveTodoViewModel3 = (LeaveTodoViewModel) viewModelIAuthTabCallback;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1832843010, i4, -1, "im.toss.features.leave.ui.todo.LeaveTodoScreen (LeaveTodoScreen.kt:61)");
                }
                r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback = r8lambdaPEtEbZoUEaIc2Hj0StO1oIbkWQ.IAuthTabCallback((r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted) null, (DeviceQuirksExternalSyntheticLambda0) null, (VirtualCameraControlExternalSyntheticLambda1) null, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 15);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized != onwarmupcompleted.onExtraCallback()) {
                    i5 = 2;
                    cameraPresenceProviderExternalSyntheticLambda0 = null;
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                } else {
                    i5 = 2;
                    cameraPresenceProviderExternalSyntheticLambda0 = null;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda0, cameraPresenceProviderExternalSyntheticLambda0, i5, cameraPresenceProviderExternalSyntheticLambda0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
                Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(leaveTodoViewModel3.onExtraCallbackWithResult(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                v1VarOnExtraCallback = y1.onExtraCallback((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (u5b) null, (Function2) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Function0) null, (findResAndMsg) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1023);
                Unit unit = Unit.INSTANCE;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(leaveTodoViewModel3);
                z = (i4 & 3670016) != 1048576;
                z2 = (i4 & 7168) != 2048;
                z3 = (i4 & 112) != 32;
                z4 = (i4 & 896) != 256;
                i6 = i4;
                z5 = (57344 & i4) != 16384;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v1VarOnExtraCallback);
                objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((!(z2 | zOnExtraCallback | z | z3 | z4 | z5) && !zOnNavigationEvent) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    v1Var = v1VarOnExtraCallback;
                    i7 = i6;
                    th = null;
                    textFieldScrollKtExternalSyntheticLambda02 = textFieldScrollKtExternalSyntheticLambda0;
                    leaveTodoViewModel4 = leaveTodoViewModel3;
                    r13 = 0;
                    onWarmupCompleted onwarmupcompleted2 = new onWarmupCompleted(leaveTodoViewModel3, function04, function02, function0, function1, function12, v1Var, (access13800) null);
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(onwarmupcompleted2);
                    objOnMinimized3 = onwarmupcompleted2;
                } else {
                    textFieldScrollKtExternalSyntheticLambda02 = textFieldScrollKtExternalSyntheticLambda0;
                    v1Var = v1VarOnExtraCallback;
                    leaveTodoViewModel4 = leaveTodoViewModel3;
                    i7 = i6;
                    th = null;
                    r13 = 0;
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult3, 6);
                z6 = (i7 & 458752) != 131072 ? true : r13;
                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                if (!z6 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new LeaveTodoScreenKt$.ExternalSyntheticLambda4(function03);
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized4);
                }
                requestPostMessageChannel.onExtraCallbackWithResult((boolean) r13, (Function0) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult3, (int) r13, 1);
                BaseStoragePackage.onExtraCallback(leaveTodoViewModel4, cameraCaptureResultEmptyCameraCaptureResult3, (i7 >> 27) & 14);
                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallback(leaveTodoViewModel4);
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda03 = textFieldScrollKtExternalSyntheticLambda02;
                zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallback(textFieldScrollKtExternalSyntheticLambda03);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                if (zOnExtraCallback2 | zOnExtraCallback3) {
                    int i23 = onNavigationEvent + 49;
                    onWarmupCompleted = i23 % 128;
                    if (i23 % 2 != 0) {
                        onwarmupcompleted.onExtraCallback();
                        th.hashCode();
                        throw th;
                    }
                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        th2 = th;
                        objOnMinimized5 = new LeaveTodoScreenKt$.ExternalSyntheticLambda5(textFieldScrollKtExternalSyntheticLambda03, leaveTodoViewModel4);
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized5);
                    } else {
                        th2 = th;
                    }
                    isZslDisabledByByUserCaseConfig.onExtraCallback(textFieldScrollKtExternalSyntheticLambda03, (Function1) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult3, (int) r13);
                    if (twoLineExternalSyntheticLambda0 == null) {
                        cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-304750168);
                        cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-425472647);
                        String string = CancellationServiceNav$CancelInProgress.INSTANCE.toString();
                        Object objOnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(twoLineExternalSyntheticLambda0.onTransact().onExtraCallback(string, th2), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult3, 0, 7).onExtraCallbackWithResult();
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(objOnExtraCallbackWithResult, new onExtraCallbackWithResult(objOnExtraCallbackWithResult, twoLineExternalSyntheticLambda0, string, null, resources, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResult2, (int) r13);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        int i24 = onNavigationEvent + 49;
                        onWarmupCompleted = i24 % 128;
                        int i25 = i24 % 2;
                    }
                    clearValueCallback.onWarmupCompleted(new Object[]{ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), null, ForwardingCameraControl.onExtraCallback(-984315310, true, new LeaveTodoScreenKt$.ExternalSyntheticLambda6(function03), cameraCaptureResultEmptyCameraCaptureResult2, 54), Boolean.valueOf((boolean) r13), null, null, null, Integer.valueOf((int) r13), Boolean.valueOf((boolean) r13), 0L, 0L, ForwardingCameraControl.onExtraCallback(-1786348411, true, new LeaveTodoScreenKt$.ExternalSyntheticLambda7(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback, leaveTodoViewModel4, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, function03, v1Var, function05, function06), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 390, 48, 2042}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    leaveTodoViewModel2 = leaveTodoViewModel4;
                }
            } else {
                int i26 = onNavigationEvent + 119;
                onWarmupCompleted = i26 % 128;
                if (i26 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 6854) != 0) {
                        i3 &= -1879048193;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 512) != 0) {
                    }
                }
            }
            leaveTodoViewModel3 = leaveTodoViewModel;
            i4 = i3;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback2 = r8lambdaPEtEbZoUEaIc2Hj0StO1oIbkWQ.IAuthTabCallback((r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted) null, (DeviceQuirksExternalSyntheticLambda0) null, (VirtualCameraControlExternalSyntheticLambda1) null, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 15);
            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized != onwarmupcompleted.onExtraCallback()) {
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor22 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
            textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
            Resources resources2 = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(leaveTodoViewModel3.onExtraCallbackWithResult(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
            v1VarOnExtraCallback = y1.onExtraCallback((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (u5b) null, (Function2) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Function0) null, (findResAndMsg) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1023);
            Unit unit2 = Unit.INSTANCE;
            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(leaveTodoViewModel3);
            if ((i4 & 3670016) != 1048576) {
            }
            if ((i4 & 7168) != 2048) {
            }
            if ((i4 & 112) != 32) {
            }
            if ((i4 & 896) != 256) {
            }
            i6 = i4;
            if ((57344 & i4) != 16384) {
            }
            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v1VarOnExtraCallback);
            objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(z2 | zOnExtraCallback | z | z3 | z4 | z5 | zOnNavigationEvent)) {
                v1Var = v1VarOnExtraCallback;
                i7 = i6;
                th = null;
                textFieldScrollKtExternalSyntheticLambda02 = textFieldScrollKtExternalSyntheticLambda0;
                leaveTodoViewModel4 = leaveTodoViewModel3;
                r13 = 0;
                onWarmupCompleted onwarmupcompleted22 = new onWarmupCompleted(leaveTodoViewModel3, function04, function02, function0, function1, function12, v1Var, (access13800) null);
                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(onwarmupcompleted22);
                objOnMinimized3 = onwarmupcompleted22;
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit2, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult3, 6);
                if ((i7 & 458752) != 131072) {
                }
                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                if (!z6) {
                    objOnMinimized4 = new LeaveTodoScreenKt$.ExternalSyntheticLambda4(function03);
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized4);
                    requestPostMessageChannel.onExtraCallbackWithResult((boolean) r13, (Function0) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult3, (int) r13, 1);
                    BaseStoragePackage.onExtraCallback(leaveTodoViewModel4, cameraCaptureResultEmptyCameraCaptureResult3, (i7 >> 27) & 14);
                    zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallback(leaveTodoViewModel4);
                    TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda032 = textFieldScrollKtExternalSyntheticLambda02;
                    zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallback(textFieldScrollKtExternalSyntheticLambda032);
                    Object objOnMinimized52 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                    if (zOnExtraCallback2 | zOnExtraCallback3) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            leaveTodoViewModel2 = leaveTodoViewModel;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LeaveTodoScreenKt$.ExternalSyntheticLambda8(twoLineExternalSyntheticLambda0, function0, function1, function02, function12, function03, function04, function05, function06, leaveTodoViewModel2, i, i2));
        }
    }

    private static final decrementVideoUsage onExtraCallbackWithResult(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LeaveTodoViewModel leaveTodoViewModel, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        LeaveTodoScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new LeaveTodoScreenKt$.ExternalSyntheticLambda3(leaveTodoViewModel);
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(externalSyntheticLambda3);
        onNavigationEvent onnavigationevent = new onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0, externalSyntheticLambda3);
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return onnavigationevent;
    }

    private static final String onExtraCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getBacktraceNote<y0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted(getSupportedHighSpeedResolutionsFor<getBacktraceNote<y0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<y0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = (getBacktraceNote) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<getBacktraceNote<y0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> getsupportedhighspeedresolutionsfor, getBacktraceNote<? super y0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(getbacktracenote);
        int i4 = onWarmupCompleted + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getResourceHeaderMap onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<? extends getResourceHeaderMap> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getResourceHeaderMap getresourceheadermap = (getResourceHeaderMap) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        int i5 = onNavigationEvent + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return getresourceheadermap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(LeaveTodoViewModel leaveTodoViewModel, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(-2033440735, iOnNavigationEvent, 2033440735, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{leaveTodoViewModel, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult}, iOnNavigationEvent3, iOnNavigationEvent2);
    }

    public static /* synthetic */ Unit IAuthTabCallback(LeaveTodoViewModel leaveTodoViewModel, Function0 function0, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {leaveTodoViewModel, function0, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(-377154558, iOnNavigationEvent, 377154561, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2);
    }

    public static /* synthetic */ Unit IAuthTabCallback(LeaveTodoViewModel leaveTodoViewModel, Function0 function0) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(-186462425, iOnNavigationEvent, 186462429, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{leaveTodoViewModel, function0}, iOnNavigationEvent3, iOnNavigationEvent2);
    }

    private static final Unit onExtraCallbackWithResult(r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, LeaveTodoViewModel leaveTodoViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function0 function0, v1 v1Var, Function0 function02, Function0 function03, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, leaveTodoViewModel, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, cameraPresenceProviderExternalSyntheticLambda6, function0, v1Var, function02, function03, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(-331126145, iOnNavigationEvent, 331126152, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2);
    }

    private static final Unit onExtraCallbackWithResult(LeaveTodoViewModel leaveTodoViewModel, Function0 function0, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {leaveTodoViewModel, function0, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(-443618957, iOnNavigationEvent, 443618962, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2);
    }

    private static final void onWarmupCompleted(LeaveTodoViewModel leaveTodoViewModel, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(-1441693835, iOnNavigationEvent, 1441693841, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{leaveTodoViewModel, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult}, iOnNavigationEvent3, iOnNavigationEvent2);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(-1768903601, iOnNavigationEvent, 1768903603, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnNavigationEvent3, iOnNavigationEvent2);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getBacktraceNote getbacktracenote) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(2026616878, iOnNavigationEvent, -2026616877, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, getbacktracenote}, iOnNavigationEvent3, iOnNavigationEvent2);
    }
}
