package o;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.devtool.runtime.ui.scheme.history.compose.SchemeHistoryLoadedScreenKt$;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode9;
import o.s3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class getContainerHeight {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1885286064;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static short[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = -223267566;
    private static int onWarmupCompleted = 830587493;
    private static byte[] onExtraCallback = {-5, 13, -1, -50, 1, 53, -56, 1, 8, -5, 7, 24, -25, -9, 9, 11, -6, 43, -37, 15, 11, -13, 9, 2, 41, -21, -16, 0, -11, 13, 24, 35, 0, -70, 1, 8, -5, 7, 24, -25, -9, 9, 11, -6, 43, -37, 15, 11, -13, 9, 2, 41, -21, -16, 0, -11, 13, 24, 45, -63, -6, 12, -9, 11, -10, 4, 61, -67, 15, 11, -13, 9, 2, 9, 50, -63, -16, 0, -11, 13, -8, 77, -51, -4, 79, -63, -16, 12, -3, 14, -15, 11, 76, -54, -11, 8, -13, -10, 25, 9, 62, -77, 8, 12, -13, 78, -55, 12, 92, 85, 93, 43, 110, -110, 21, 110, 85, 88, 100, 101, 68, 84, 86, 104, 71, -120, 56, 108, 104, 80, 86, 111, 118, 72, 93, 109, 82, 106, 101, Byte.MIN_VALUE, 109, 55, 32, 83, 107, 87, 89, 96, 84, 86, 98, -118, 99, 69, 32, 83, 107, 87, 89, 96, 84, 86, 98, -118, 99, 69, 32, 83, 107, 87, 89, 96, 84, 86, 98, -118, 99, 21, 110, 85, 88, 100, 101, 68, 84, 86, 104, 71, -120, 56, 108, 104, 80, 86, 111, 118, 72, 93, 109, 82, 106, 101, -118, 46, 71, 105, 84, 104, 83, 97, -102, 26, 108, 104, 80, 86, 111, 86, -97, 46, 93, 109, 82, 106, 69, -86, 42, 89, -84, 46, 93, 105, 90, 107, 94, 104, -87, 23, 82, 85, 80, 83, 102, 86, -101, 16, 85, 105, 80, -85, 22, 105, 80, 71, 86, 80, 71, 86, 80, 97, 74, 82, 84, 67, 104, 82, 88, 81, 81, 93};
    private static long IAuthTabCallbackStub = 6717415421055748828L;

    public static /* synthetic */ Object IAuthTabCallback(AppNode9.onNavigationEvent onnavigationevent, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 9;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(onnavigationevent, i);
        int i5 = asInterface + 97;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return objOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = asInterface + 125;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 93 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AppNode61 appNode61) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(appNode61);
        int i4 = asInterface + 5;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = (~(i8 | i2)) | i7;
        int i10 = ~i2;
        int i11 = ~(i8 | i10 | i);
        int i12 = (~(i2 | i7)) | i8 | (~(i10 | i));
        int i13 = i + i3 + i5 + (325770565 * i4) + ((-1284996642) * i6);
        int i14 = i13 * i13;
        int i15 = ((789042555 * i) - 1205338112) + ((-1364710777) * i3) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i5) + ((-667418624) * i4) + ((-145752064) * i6) + (1116340224 * i14);
        int i16 = (i * (-1991011123)) + 595473426 + (i3 * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * 906) + (i5 * (-1991010217)) + (i4 * (-1223611789)) + (i6 * (-291900814)) + (i14 * (-1931083776));
        if (i15 + (i16 * i16 * (-1558839296)) == 1) {
            return onNavigationEvent(objArr);
        }
        AppNode9.onNavigationEvent onnavigationevent = (AppNode9.onNavigationEvent) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue3 = ((Number) objArr[6]).intValue();
        int i17 = 2 % 2;
        int i18 = asInterface + 27;
        IAuthTabCallbackDefault = i18 % 128;
        int i19 = i18 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(onnavigationevent, function1, quirksExternalSyntheticBackport0, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i20 = asInterface + 7;
        IAuthTabCallbackDefault = i20 % 128;
        int i21 = i20 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 45;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = asInterface + 29;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppNode9.onNavigationEvent onnavigationevent, Function1 function1, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onnavigationevent, function1, audioRestrictionControllerImplExternalSyntheticLambda0);
        int i4 = asInterface + 87;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(AppNode9.onNavigationEvent onnavigationevent, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 21;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(onnavigationevent, (Function1<? super AppNode61, Unit>) function1, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = asInterface + 3;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 30 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppNode9.onNavigationEvent onnavigationevent, Function1 function1, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 33;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onnavigationevent, function1, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = asInterface + 43;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    private static final Object onExtraCallbackWithResult(AppNode9.onNavigationEvent onnavigationevent, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 5;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        getRunScene getrunscene = onnavigationevent.onWarmupCompleted().get(i);
        if (i4 != 0) {
            return getrunscene.onNavigationEvent();
        }
        int i5 = 91 / 0;
        return getrunscene.onNavigationEvent();
    }

    private static final Unit IAuthTabCallback(AppNode9.onNavigationEvent onnavigationevent, Function1 function1, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 51;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i2 & 48) == 0) {
            int i7 = asInterface + 83;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 145) != 144, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = asInterface + 85;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr = new Object[1];
                a((short) ((-92) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (byte) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 736561588, (-1459023026) - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1782179364, objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1315702810, i3, -1, ((String) objArr[0]).intern());
            }
            getRunScene getrunscene = onnavigationevent.onWarmupCompleted().get(i);
            getAppIdFromNode.onNavigationEvent(i, getrunscene.onExtraCallback(), getrunscene.onNavigationEvent(), function1, null, cameraCaptureResultEmptyCameraCaptureResult, (i3 >> 3) & 14, 16);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(AppNode9.onNavigationEvent onnavigationevent, Function1 function1, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallbackWithResult(audioRestrictionControllerImplExternalSyntheticLambda0, onnavigationevent.onWarmupCompleted().size(), new SchemeHistoryLoadedScreenKt$.ExternalSyntheticLambda2(onnavigationevent), (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(-1315702810, true, new SchemeHistoryLoadedScreenKt$.ExternalSyntheticLambda3(onnavigationevent, function1)), 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 109;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r25) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getContainerHeight.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    private static final Unit onNavigationEvent(AppNode61 appNode61) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appNode61, "");
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final void IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(831227661);
        if (i != 0) {
            int i3 = asInterface + 27;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackDefault + 89;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                b(new char[]{53122, 27713, 34891, 9418, 16536, 64891, 6450, 46516, 53687, 3697, 43611, 50706, 25296, 40607, 15205, 22380, 62441, 12201, 19579, 59482, 1038, 41173, 56468, 31012, 38198, 12781, 28147, 35429, 9804, 16904, 65244, 6815, 46958, 54114, 4077, 43959, 51300, 25692, 32782, 15560, 22666, 62746, 4398, 19945, 59826, 1632, 41542, 56849, 31454, 38610, 13158, 28461, 35823, 10173, 17532, 57423, 7211, 47309, 54414, 28994, 44320, 51698, 26016, 33374, 15940, 23053, 63169, 4763, 20307, 60187, 2018, 41896, 49270, 31793, 38915, 13558, 20621, 36181, 10527, 17899, 57790, 7787, 47733, 54854, 29428, 44699, 52057, 26415, 33774, 16289, 23637, 63551, 5148, 45268, 60566, 2368, 42290, 49600, 32170, 39551, 13875, 21005, 36549, 10921, 18256, 58118, 8168, 48035, 55409, 29822, 36866, 52438, 26817, 34063, 8512, 23975}, 41927 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(831227661, i, -1, ((String) objArr[0]).intern());
            }
            ArrayList arrayList = new ArrayList(5);
            int i7 = 0;
            while (i7 < 5) {
                Object[] objArr2 = new Object[1];
                b(new char[]{53144, 29673, 46965, 64235, 15941, 25036, 42318, 59609, 11296, 28670, 37730, 55001, 6679, 23951, 33028, 50551, 2228, 19567, 36826, 13136, 30420, 47709, 64956, 8490, 25783, 43037, 60306, 12040, 21200, 38626, 55932, 7654, 16738, 33998, 51264, 3021, 20259, 62181, 13874, 31167, 48387, 57473, 9247, 26722, 44016, 61299, 4858, 22024, 39316, 56579, 189, 17457, 34730, 52013, 3806, 45593, 62860, 14842, 32110, 41203, 58466, 10176, 27469, 44747, 53828, 5554, 22890, 40109, 49174, 906, 18181, 35525, 52989, 29291, 46585, 63839, 15577, 24649, 41930, 59187, 10927, 28197, 37274, 54544, 6360, 23563, 32880, 50152, 1895, 19191, 36434, 12738, 30026, 47341, 64636, 16305, 25453, 42629, 59904, 11663, 20965, 38229, 55534, 7268, 24519, 33612, 50832, 2675, 19884}, ((byte) KeyEvent.getModifierMetaStateMask()) + 48248, objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                a((short) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 87), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.alpha(0) + 736561732, (-1459023080) - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 1782179239, objArr3);
                arrayList.add(new getRunScene(strIntern, ((String) objArr3[0]).intern()));
                i7++;
                int i8 = IAuthTabCallbackDefault + 69;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
            }
            AppNode9.onNavigationEvent onnavigationevent = new AppNode9.onNavigationEvent(arrayList);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new SchemeHistoryLoadedScreenKt$.ExternalSyntheticLambda0();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            IAuthTabCallback(onnavigationevent, (Function1<? super AppNode61, Unit>) objOnMinimized, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = asInterface + 5;
                IAuthTabCallbackDefault = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i11 = 28 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new SchemeHistoryLoadedScreenKt$.ExternalSyntheticLambda1(i));
        }
    }

    private static void b(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) ^ (IAuthTabCallbackStub ^ 5407414049857832247L);
            SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            int i3 = $11 + 71;
            $10 = i3 % 128;
            int i4 = i3 % 2;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $11 + 81;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7 A[PHI: r0
      0x00a7: PHI (r0v18 int) = (r0v4 int), (r0v21 int) binds: [B:24:0x00a5, B:21:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9 A[PHI: r0
      0x00a9: PHI (r0v5 int) = (r0v4 int), (r0v21 int) binds: [B:24:0x00a5, B:21:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r14, byte r15, int r16, int r17, int r18, java.lang.Object[] r19) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getContainerHeight.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppNode9.onNavigationEvent onnavigationevent, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {onnavigationevent, function1, quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onExtraCallback(1617709366, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1617709366, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    public static final void IAuthTabCallback(@NotNull AppNode9.onNavigationEvent onnavigationevent, @NotNull Function1<? super AppNode61, Unit> function1, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {onnavigationevent, function1, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onExtraCallback(961522303, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -961522302, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }
}
