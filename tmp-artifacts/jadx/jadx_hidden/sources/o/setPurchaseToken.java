package o;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback;
import im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.bindContext;
import viva.republica.toss.guest.CreatePasswordActivity;

/* loaded from: classes.dex */
public final class setPurchaseToken {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static long onNavigationEvent = -587256972100495274L;

    public static /* synthetic */ Unit IAuthTabCallback(GriverPhotoSelectActivity8 griverPhotoSelectActivity8, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, GlobalOnboardingResetPasswordViewModel globalOnboardingResetPasswordViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(griverPhotoSelectActivity8, function1, quirksExternalSyntheticBackport0, globalOnboardingResetPasswordViewModel, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallback(GriverPhotoSelectActivity8 griverPhotoSelectActivity8, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, GlobalOnboardingResetPasswordViewModel globalOnboardingResetPasswordViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(griverPhotoSelectActivity8, function1, quirksExternalSyntheticBackport0, globalOnboardingResetPasswordViewModel, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Context context, GlobalOnboardingResetPasswordViewModel globalOnboardingResetPasswordViewModel, Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(context, globalOnboardingResetPasswordViewModel, function1);
        int i4 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static final /* synthetic */ void onNavigationEvent(GriverPhotoSelectActivity8 griverPhotoSelectActivity8, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, GlobalOnboardingResetPasswordViewModel globalOnboardingResetPasswordViewModel, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(griverPhotoSelectActivity8, function1, quirksExternalSyntheticBackport0, globalOnboardingResetPasswordViewModel, cameraCaptureResultEmptyCameraCaptureResult, i, i2);
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 111;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onNavigationEvent);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i5 = $10 + 89;
        $11 = i5 % 128;
        if (i5 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i6 = 84 / 0;
            objArr[0] = str;
        }
    }

    private static final Unit IAuthTabCallback(Context context, GlobalOnboardingResetPasswordViewModel globalOnboardingResetPasswordViewModel, Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreatePasswordActivity.onExtraCallback onextracallback = CreatePasswordActivity.Companion;
        long jOnExtraCallback = ((createAlternativeBillingOnlyReportingDetailsAsync) globalOnboardingResetPasswordViewModel.onWarmupCompleted$3a5882b4()).onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{60656, 60599, 28380, 3530, 54833, 4298, 61223, 50539, 25049, 40530, 17545, 29266, 63086, 4276, 61697, 33268, 17562, 25866, 32367, 5987, 55575, 63097, 60620, 39552, 12203, 18683, 39202, 10274, 48336, 56663, 1981, 48966, 12671, 12193, 46100, 49865}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr);
        function1.invoke(CreatePasswordActivity.onExtraCallback.onWarmupCompleted(onextracallback, context, false, jOnExtraCallback, 6045L, ((String) objArr[0]).intern(), false, (getLogUploadURLMap) null, false, false, (Long) null, (checkImageLoaded) null, 2016, (Object) null));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<Long, Unit> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int[] onNavigationEvent = {-1257584188, -1962056901, -638799246, 1846144750, 2041108969, 1020635961, 696396769, -1130663822, 155980876, -779422795, -1585182253, -26627730, 428564107, 822976272, -1479909785, -279312125, -1589673284, 236097075};

        /* JADX WARN: Illegal instructions before constructor call */
        onWarmupCompleted(Object obj) {
            Object[] objArr = new Object[1];
            a(new int[]{-1969822576, 480371622, 1170379535, 2079232920, 105794490, 1944560241, 714610090, 1274587281, 1767264291, -1750526629}, Gravity.getAbsoluteGravity(0, 0) + 20, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new int[]{-1969822576, 480371622, 1170379535, 2079232920, 105794490, 1944560241, 714610090, 1274587281, 1767264291, -1750526629, -936751662, -1432540071}, 24 - View.getDefaultSize(0, 0), objArr2);
            super(1, obj, GlobalOnboardingResetPasswordViewModel.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        public final void IAuthTabCallback(long j) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            GlobalOnboardingResetPasswordViewModel globalOnboardingResetPasswordViewModel = (GlobalOnboardingResetPasswordViewModel) ((CallableReference) this).receiver;
            if (i3 == 0) {
                globalOnboardingResetPasswordViewModel.onExtraCallback(j);
            } else {
                globalOnboardingResetPasswordViewModel.onExtraCallback(j);
                int i4 = 63 / 0;
            }
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(((Number) obj).longValue());
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static void a(int[] iArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onNavigationEvent;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                for (int i3 = 0; i3 < length; i3++) {
                    iArr3[i3] = Hilt_QuickActionBottomSheetActivity$4.h(iArr2[i3]);
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onNavigationEvent;
            if (iArr5 != null) {
                int i4 = $11 + 33;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                for (int i6 = 0; i6 < length3; i6++) {
                    iArr6[i6] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i6]);
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i7 = $11 + 65;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                for (int i9 = 0; i9 < 16; i9++) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i9];
                    int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
                }
                int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i10;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i11 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                DevToolActionListViewModel$onExtraCallback.f(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<GetBillingConfigParamsBuilder, Unit> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 1;
        private static int onWarmupCompleted;
        private static char[] onExtraCallback = {32425, 32418, 32421, 32431, 32441, 32430, 32472, 32479, 32443, 32426, 32476, 32420, 32473, 32440, 32611, 32391, 32422, 32612, 32428, 32423, 32429, 32478, 32477, 32466, 32396, 32446, 32400, 32610, 32445};
        private static int onExtraCallbackWithResult = -1184334005;
        private static boolean IAuthTabCallback = true;
        private static boolean onNavigationEvent = true;

        /* JADX WARN: Illegal instructions before constructor call */
        onExtraCallback(Object obj) {
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-125, -116, -126, -121, -121, -122, -114, -124, -115, -116, -117, -121, -121, -118, -119, -120, -122, -121, -122, -123, -124, -125, -126, -127}, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-99, -100, -101, -121, -125, -116, -126, -121, -121, -122, -114, -124, -122, -126, -107, -126, -125, -102, -124, -115, -116, -117, -121, -121, -118, -119, -120, -122, -121, -122, -123, -108, -118, -127, -116, -108, -103, -110, -108, -122, -124, -116, -111, -110, -104, -107, -126, -115, -122, -105, -110, -121, -122, -115, -106, -120, -118, -122, -107, -110, -108, -118, -127, -116, -108, -109, -110, -121, -121, -116, -120, -110, -111, -126, -112, -113, -125, -116, -126, -121, -121, -122, -114, -124, -115, -116, -117, -121, -121, -118, -119, -120, -122, -121, -122, -123, -124, -125, -126, -127}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, objArr2);
            super(1, obj, GlobalOnboardingResetPasswordViewModel.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((GetBillingConfigParamsBuilder) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = asInterface + 77;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent(GetBillingConfigParamsBuilder getBillingConfigParamsBuilder) {
            int i = 2 % 2;
            int i2 = asInterface + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(getBillingConfigParamsBuilder, "");
            ((GlobalOnboardingResetPasswordViewModel) ((CallableReference) this).receiver).onWarmupCompleted(getBillingConfigParamsBuilder);
            int i4 = asInterface + 71;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
            char[] cArr2;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = onExtraCallback;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i3 = 0;
                while (i3 < length) {
                    int i4 = $10 + 19;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        cArr4[i3] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr3[i3]);
                    } else {
                        cArr4[i3] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr3[i3]);
                        i3++;
                    }
                }
                cArr3 = cArr4;
            }
            int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(onExtraCallbackWithResult);
            if (onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i5 = $10 + 101;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> 1) % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] * iY);
                    } else {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                    }
                    Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i6 = $11 + 29;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $10 + 63;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 0) % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] - iY);
                } else {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                }
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b1  */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void onWarmupCompleted(o.GriverPhotoSelectActivity8 r19, kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> r20, o.QuirksExternalSyntheticBackport0 r21, im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel r22, o.CameraCaptureResultEmptyCameraCaptureResult r23, int r24, int r25) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPurchaseToken.onWarmupCompleted(o.GriverPhotoSelectActivity8, kotlin.jvm.functions.Function1, o.QuirksExternalSyntheticBackport0, im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel, o.CameraCaptureResultEmptyCameraCaptureResult, int, int):void");
    }

    private static final AlternativeBillingOnlyReportingDetailsListener IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends AlternativeBillingOnlyReportingDetailsListener> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener = (AlternativeBillingOnlyReportingDetailsListener) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return alternativeBillingOnlyReportingDetailsListener;
        }
        obj.hashCode();
        throw null;
    }
}
