package o;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zziea;
import im.toss.features.leave.R;
import im.toss.features.leave.ui.intro.LeaveIntroScreenKt$;
import im.toss.features.leave.ui.intro.LeaveIntroViewModel;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.MaxRewardedInterstitialAdapter;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.getPrivacyDestinationUri;
import o.isSnapshotFileExist;
import o.mExternalSyntheticApiModelOutline1;
import o.oExternalSyntheticLambda0;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVSnapshotUtils {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallback = {-631137224, 1582841274, -927200338, -805754214, 670660039, 789933749, -947649435, 335091891, -390888556, -1150993721, -1713986628, -43082862, -125890664, 1289190500, -299129057, 846532467, 2102370423, -143553967};
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent();
        int i4 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = (~(i2 | i6)) | (~(i7 | i9));
        int i12 = ~(i9 | i5 | i6);
        int i13 = i5 + i6 + i4 + ((-194346734) * i3) + (9035316 * i);
        int i14 = i13 * i13;
        int i15 = (((-787818500) * i5) - 443744256) + ((-1492047866) * i6) + (352114683 * i10) + (i11 * (-352114683)) + ((-352114683) * i12) + ((-1139933184) * i4) + (1190920192 * i3) + (1456996352 * i) + ((-1774911488) * i14);
        int i16 = (i5 * 1174986172) + 1294669563 + (i6 * 1174986598) + (i10 * (-213)) + (i11 * 213) + (i12 * 213) + (i4 * 1174986385) + (i3 * (-1060063438)) + (i * 107475828) + (i14 * 168099840);
        int i17 = i15 + (i16 * i16 * 40566784);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? onExtraCallback(objArr) : IAuthTabCallbackStub(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(LeaveIntroViewModel leaveIntroViewModel) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(leaveIntroViewModel);
        int i4 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(LeaveIntroViewModel leaveIntroViewModel, Function0 function0, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onWarmupCompleted(leaveIntroViewModel, function0, str);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(leaveIntroViewModel, function0, str);
        int i3 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(LeaveIntroViewModel leaveIntroViewModel, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(leaveIntroViewModel, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 25 / 0;
        }
        int i6 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, LeaveIntroViewModel leaveIntroViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, function02, function03, function04, function05, leaveIntroViewModel, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LeaveIntroViewModel leaveIntroViewModel, Function0 function0, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 != 0) {
            int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            return (Unit) onExtraCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{leaveIntroViewModel, function0, u3Var, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iOnNavigationEvent, iOnNavigationEvent3, iOnNavigationEvent2, 1555365711, -1555365710);
        }
        int iOnNavigationEvent4 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent5 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent6 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, LeaveIntroViewModel leaveIntroViewModel, v1 v1Var, Function0 function0, Function0 function02, Function0 function03, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, leaveIntroViewModel, v1Var, function0, function02, function03, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            return (Unit) onExtraCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent2, 5824514, -5824514);
        }
        Object[] objArr2 = {cameraPresenceProviderExternalSyntheticLambda6, leaveIntroViewModel, v1Var, function0, function02, function03, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent4 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LeaveIntroViewModel leaveIntroViewModel, Function0 function0, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(leaveIntroViewModel, function0, str);
        int i4 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            return (Unit) onExtraCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{function0}, iOnNavigationEvent, iOnNavigationEvent3, iOnNavigationEvent2, -1446483531, 1446483534);
        }
        int iOnNavigationEvent4 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent5 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent6 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, LeaveIntroViewModel leaveIntroViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{function0, function02, function03, function04, function05, leaveIntroViewModel, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 574512951, -574512946);
        } else {
            onExtraCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{function0, function02, function03, function04, function05, leaveIntroViewModel, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 574512951, -574512946);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LeaveIntroViewModel leaveIntroViewModel = (LeaveIntroViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(leaveIntroViewModel);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(leaveIntroViewModel);
        int i3 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LeaveIntroViewModel leaveIntroViewModel, Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(leaveIntroViewModel, function0);
        int i4 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LeaveIntroViewModel leaveIntroViewModel, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(leaveIntroViewModel, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        int i;
        int i2;
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Object obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i3;
        Function0 function04;
        Function0 function05;
        LeaveIntroViewModel leaveIntroViewModel;
        boolean z;
        int i4;
        Function0 function06 = (Function0) objArr[0];
        Function0 function07 = (Function0) objArr[1];
        Function0 function08 = (Function0) objArr[2];
        Function0 function09 = (Function0) objArr[3];
        Function0 function010 = (Function0) objArr[4];
        LeaveIntroViewModel leaveIntroViewModel2 = (LeaveIntroViewModel) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int iIntValue2 = ((Number) objArr[8]).intValue();
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(function08, "");
        Intrinsics.checkNotNullParameter(function09, "");
        Intrinsics.checkNotNullParameter(function010, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-489289672);
        int i6 = iIntValue2 & 1;
        if (i6 != 0) {
            i = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            int i7 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 68 / 0;
                i2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function06) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function06)) {
            }
            i = i2 | iIntValue;
        } else {
            i = iIntValue;
        }
        int i9 = iIntValue2 & 2;
        if (i9 != 0) {
            i |= 48;
        } else if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function07) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            int i10 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function08)) {
                int i12 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                i4 = 256;
            } else {
                i4 = 128;
            }
            i |= i4;
        }
        if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function09) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            int i14 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i14 % 128;
            if (i14 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function010);
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function010) ? 16384 : 8192;
        }
        if ((196608 & iIntValue) == 0) {
            i |= ((iIntValue2 & 32) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(leaveIntroViewModel2)) ? 131072 : 65536;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i) != 74898, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((iIntValue & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if (i6 != 0) {
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    Object obj2 = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Object externalSyntheticLambda8 = new LeaveIntroScreenKt$.ExternalSyntheticLambda8();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda8);
                        obj2 = externalSyntheticLambda8;
                    }
                    function06 = (Function0) obj2;
                }
                if (i9 != 0) {
                    int i15 = onNavigationEvent + 33;
                    onExtraCallbackWithResult = i15 % 128;
                    int i16 = i15 % 2;
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    Object obj3 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Object externalSyntheticLambda9 = new LeaveIntroScreenKt$.ExternalSyntheticLambda9();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda9);
                        obj3 = externalSyntheticLambda9;
                    }
                    function07 = (Function0) obj3;
                }
                if ((iIntValue2 & 32) != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1890788296);
                    TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onWarmupCompleted);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = LongPressTextDragObserverKtExternalSyntheticLambda3.IAuthTabCallback(textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1729797275);
                    ViewModel viewModelIAuthTabCallback = DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.IAuthTabCallback(LeaveIntroViewModel.class, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, onwarmupcompletedIAuthTabCallback, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 36936, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    leaveIntroViewModel2 = (LeaveIntroViewModel) viewModelIAuthTabCallback;
                    i &= -458753;
                    int i17 = onExtraCallbackWithResult + 67;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                }
            } else {
                int i19 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((iIntValue2 & 32) != 0) {
                    int i21 = onExtraCallbackWithResult + 75;
                    onNavigationEvent = i21 % 128;
                    int i22 = i21 % 2;
                    i &= -458753;
                }
            }
            Function0 function011 = function06;
            Function0 function012 = function07;
            LeaveIntroViewModel leaveIntroViewModel3 = leaveIntroViewModel2;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-489289672, i, -1, "im.toss.features.leave.ui.intro.LeaveIntroScreen (LeaveIntroScreen.kt:45)");
            }
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(leaveIntroViewModel3.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
            v1 v1VarOnExtraCallback = y1.onExtraCallback((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (u5b) null, (Function2) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Function0) null, (findResAndMsg) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1023);
            Unit unit = Unit.INSTANCE;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(leaveIntroViewModel3);
            if ((i & 112) == 32) {
                int i23 = onNavigationEvent + 31;
                onExtraCallbackWithResult = i23 % 128;
                int i24 = i23 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean z2 = (i & 14) == 4;
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v1VarOnExtraCallback);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((z | zOnExtraCallback | z2 | zOnExtraCallback2 | zOnNavigationEvent) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = new onNavigationEvent(leaveIntroViewModel3, function012, function011, context, v1VarOnExtraCallback, (access13800) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            setForceUse.IAuthTabCallback(leaveIntroViewModel3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i >> 15) & 14);
            obj = null;
            i3 = iIntValue;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            function0 = function010;
            function02 = function09;
            function03 = function08;
            clearValueCallback.onWarmupCompleted(new Object[]{ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), null, ForwardingCameraControl.onExtraCallback(-1980483700, true, new LeaveIntroScreenKt$.ExternalSyntheticLambda10(function08), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), false, null, null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(1977690687, true, new LeaveIntroScreenKt$.ExternalSyntheticLambda11(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, leaveIntroViewModel3, v1VarOnExtraCallback, function09, function010, function08), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult, 390, 48, 2042}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            function04 = function011;
            leaveIntroViewModel = leaveIntroViewModel3;
            function05 = function012;
        } else {
            function0 = function010;
            function02 = function09;
            function03 = function08;
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i3 = iIntValue;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i25 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i25 % 128;
            int i26 = i25 % 2;
            function04 = function06;
            function05 = function07;
            leaveIntroViewModel = leaveIntroViewModel2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LeaveIntroScreenKt$.ExternalSyntheticLambda12(function04, function05, function03, function02, function0, leaveIntroViewModel, i3, iIntValue2));
        }
        return obj;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        Object obj;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1980483700, i, -1, "im.toss.features.leave.ui.intro.LeaveIntroScreen.<anonymous> (LeaveIntroScreen.kt:73)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnNavigationEvent)) {
                LeaveIntroScreenKt$.ExternalSyntheticLambda13 externalSyntheticLambda13 = new LeaveIntroScreenKt$.ExternalSyntheticLambda13(function0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda13);
                obj = externalSyntheticLambda13;
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 254);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onNavigationEvent + 19;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 254);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(LeaveIntroViewModel leaveIntroViewModel) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        leaveIntroViewModel.onWarmupCompleted();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        int i5 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(LeaveIntroViewModel leaveIntroViewModel, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        Object obj;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            i2 = i | (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 3;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(950245852, i2, -1, "im.toss.features.leave.ui.intro.LeaveIntroScreen.<anonymous>.<anonymous> (LeaveIntroScreen.kt:130)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_error_button, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Block;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(leaveIntroViewModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnExtraCallback)) {
                LeaveIntroScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new LeaveIntroScreenKt$.ExternalSyntheticLambda0(leaveIntroViewModel);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                int i8 = onExtraCallbackWithResult + 59;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                obj = externalSyntheticLambda0;
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                int i10 = onExtraCallbackWithResult + 75;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 5 % 5;
            }
        }
        return Unit.INSTANCE;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 71, 8848 - TextUtils.getOffsetBefore("", 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int i7 = $10 + 17;
            $11 = i7 % 128;
            int i8 = 2;
            int i9 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $11 + 79;
                $10 = i11 % 128;
                if (i11 % i8 != 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i10]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(i5, i5), TextUtils.getOffsetBefore("", i5) + 72, ImageFormat.getBitsPerPixel(i5) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.resolveSize(0, 0) + 72, View.resolveSize(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i10++;
                }
                i5 = 0;
                i8 = 2;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i12 = $11 + 41;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                try {
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 22252), 39 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i14++;
                    int i16 = $11 + 81;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 79, TextUtils.indexOf((CharSequence) "", '0') + 7399, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit onWarmupCompleted(LeaveIntroViewModel leaveIntroViewModel, Function0 function0, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        leaveIntroViewModel.onExtraCallback("call");
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(LeaveIntroViewModel leaveIntroViewModel, Function0 function0, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            leaveIntroViewModel.onExtraCallback("chat");
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        leaveIntroViewModel.onExtraCallback("chat");
        function0.invoke();
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 34 / 0;
        }
        return unit2;
    }

    private static final Unit onWarmupCompleted(LeaveIntroViewModel leaveIntroViewModel) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        leaveIntroViewModel.onWarmupCompleted("contact_support");
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(LeaveIntroViewModel leaveIntroViewModel, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i5 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i5 % 128;
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
            int i7 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 25;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1920008363, i2, -1, "im.toss.features.leave.ui.intro.LeaveIntroScreen.<anonymous>.<anonymous>.<anonymous> (LeaveIntroScreen.kt:175)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_error_required_tasks_top_accessory_button, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(leaveIntroViewModel);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    LeaveIntroScreenKt$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new LeaveIntroScreenKt$.ExternalSyntheticLambda1(leaveIntroViewModel);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda1);
                    int i11 = onExtraCallbackWithResult + 43;
                    onNavigationEvent = i11 % 128;
                    obj = externalSyntheticLambda1;
                    if (i11 % 2 == 0) {
                        int i12 = 3 / 5;
                        obj = externalSyntheticLambda1;
                    }
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, onextracallback, onwarmupcompleted, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 221184, i2 & 14, 966);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(LeaveIntroViewModel leaveIntroViewModel, Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            leaveIntroViewModel.onWarmupCompleted("close");
            function0.invoke();
            return Unit.INSTANCE;
        }
        leaveIntroViewModel.onWarmupCompleted("close");
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LeaveIntroViewModel leaveIntroViewModel = (LeaveIntroViewModel) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        u3 u3Var = (u3) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int i = 4;
        int iIntValue = ((Number) objArr[4]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                int i3 = onNavigationEvent + 99;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1941443920, iIntValue, -1, "im.toss.features.leave.ui.intro.LeaveIntroScreen.<anonymous>.<anonymous>.<anonymous> (LeaveIntroScreen.kt:186)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_close, cameraCaptureResultEmptyCameraCaptureResult, 0);
            oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(leaveIntroViewModel);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnNavigationEvent)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    LeaveIntroScreenKt$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new LeaveIntroScreenKt$.ExternalSyntheticLambda2(leaveIntroViewModel, function0);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                    obj = externalSyntheticLambda2;
                }
                u3Var.IAuthTabCallback(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, onextracallbackwithresultOnNavigationEvent, 0L, false, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 21) & 29360128) | 3072, 54);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onNavigationEvent + 73;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i6 = 89 / 0;
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x039c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        isSnapshotFileExist.onExtraCallbackWithResult onExtraCallbackWithResult2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        LeaveIntroViewModel leaveIntroViewModel = (LeaveIntroViewModel) objArr[1];
        v1 v1Var = (v1) objArr[2];
        Function0 function0 = (Function0) objArr[3];
        Function0 function02 = (Function0) objArr[4];
        Function0 function03 = (Function0) objArr[5];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((iIntValue & 17) != 16, iIntValue & 1)) {
            int i2 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 16 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i4 = onNavigationEvent + 87;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1977690687, iIntValue, -1, "im.toss.features.leave.ui.intro.LeaveIntroScreen.<anonymous> (LeaveIntroScreen.kt:80)");
                }
                onExtraCallbackWithResult2 = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<? extends isSnapshotFileExist>) cameraPresenceProviderExternalSyntheticLambda6);
                if (!(onExtraCallbackWithResult2 instanceof isSnapshotFileExist.onNavigationEvent)) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-977977305);
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 8, (Object) null);
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                        int i6 = onNavigationEvent + 125;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                        int i8 = onNavigationEvent + 73;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                            throw null;
                        }
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
                    String str = getFixedPositions.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, 0) ? " " : "\n";
                    mExternalSyntheticApiModelOutline1.onWarmupCompleted.onWarmupCompleted(DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.leave_intro_title, new Object[]{PlayerErrorCode.onPostMessage(), str + DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_intro_title_postfix, cameraCaptureResultEmptyCameraCaptureResult2, 0)}, cameraCaptureResultEmptyCameraCaptureResult2, 0), mExternalSyntheticApiModelOutline1.IAuthTabCallback.access100.onExtraCallback.IAuthTabCallbackDefault(), highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.access100()), 0, AppLovinPostbackService.onExtraCallbackWithResult.asInterface(), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).isEngagementSignalsApiAvailable(), 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft, (mExternalSyntheticApiModelOutline1.onTransact) null, (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, (Long) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResult2, 48, 100666752, 249800);
                    setIconUri.IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult(), highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onExtraCallback()), (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), 0.0f, (Function0) null, (String) null, isForceUse.onWarmupCompleted.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult2, 12585990, 116);
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                } else {
                    if (!(onExtraCallbackWithResult2 instanceof isSnapshotFileExist.onExtraCallbackWithResult)) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2109755683);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    int i9 = onExtraCallbackWithResult + 3;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-976239135);
                    if (onExtraCallbackWithResult2.IAuthTabCallback()) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-976257580);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                        String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_error_screen_title, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                        Object[] objArr2 = new Object[1];
                        a(new int[]{-72878850, -841635670, 177813689, -37915122, -1277569058, -52931298, -1099260777, 263320742, -865607569, -1884645197, -1487044315, 1238313598, -135768744, -482345891, 1895082442, 1816601020, 1403502280, 1301464138, 1310100719, 440207060, -227576581, 1822477632, -734743614, 603259875, -1361951590, 592430991}, 49 - ExpandableListView.getPackedPositionChild(0L), objArr2);
                        y1h.onNavigationEvent(deprecated_authenticator.onExtraCallback(((String) objArr2[0]).intern()), strOnExtraCallback, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_error_cancellation_screen_subtitle, cameraCaptureResultEmptyCameraCaptureResult2, 0), quirksExternalSyntheticBackport0OnNavigationEvent, ForwardingCameraControl.onExtraCallback(950245852, true, new LeaveIntroScreenKt$.ExternalSyntheticLambda3(leaveIntroViewModel), cameraCaptureResultEmptyCameraCaptureResult2, 54), isForceUse.onWarmupCompleted.onNavigationEvent(), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult2, 224256, 448);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-974754824);
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null);
                        component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnNavigationEvent2);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                        if (!cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult3.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult3.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        if (v1Var.IAuthTabCallback_Parcel()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(132263676);
                            String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_pending_task_customer_service_connect_bottomsheet_title, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(leaveIntroViewModel);
                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function0);
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (!(zOnExtraCallback | zOnNavigationEvent)) {
                                Object obj = objOnMinimized;
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    LeaveIntroScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new LeaveIntroScreenKt$.ExternalSyntheticLambda4(leaveIntroViewModel, function0);
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda4);
                                    obj = externalSyntheticLambda4;
                                }
                                Function1 function1 = (Function1) obj;
                                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(leaveIntroViewModel);
                                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function02);
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if ((zOnExtraCallback2 | zOnNavigationEvent2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized2 = new LeaveIntroScreenKt$.ExternalSyntheticLambda5(leaveIntroViewModel, function02);
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                                }
                                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                                loadSnapshotFile.onNavigationEvent(v1Var, strOnExtraCallback2, function1, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(132962168);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null);
                        String strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.leave_error_required_tasks_title, new Object[]{PlayerErrorCode.onPostMessage()}, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        Object[] objArr3 = new Object[1];
                        a(new int[]{-72878850, -841635670, 177813689, -37915122, -1277569058, -52931298, -1099260777, 263320742, -865607569, -1884645197, -698640099, -1745519988, -1917508132, -1998305058, -751896937, -758316390, 2088446567, 432803725, 1887483291, 1024520531, 1712548563, 461866256, 1288781774, -392920552, 1907850762, -1073496823, -1447723314, -27348704}, Drawable.resolveOpacity(0, 0) + 55, objArr3);
                        y1h.onNavigationEvent(deprecated_authenticator.onExtraCallback(((String) objArr3[0]).intern()), strIAuthTabCallback, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.leave_error_required_tasks_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0), quirksExternalSyntheticBackport0OnNavigationEvent3, ForwardingCameraControl.onExtraCallback(1920008363, true, new LeaveIntroScreenKt$.ExternalSyntheticLambda6(leaveIntroViewModel), cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote) null, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallback(-1941443920, true, new LeaveIntroScreenKt$.ExternalSyntheticLambda7(leaveIntroViewModel, function03), cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 12610560, 352);
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i11 = onNavigationEvent + 117;
                            onExtraCallbackWithResult = i11 % 128;
                            int i12 = i11 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i13 = onNavigationEvent + 51;
                            onExtraCallbackWithResult = i13 % 128;
                            int i14 = i13 % 2;
                        }
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                onExtraCallbackWithResult2 = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<? extends isSnapshotFileExist>) cameraPresenceProviderExternalSyntheticLambda6);
                if (!(onExtraCallbackWithResult2 instanceof isSnapshotFileExist.onNavigationEvent)) {
                }
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final isSnapshotFileExist onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<? extends isSnapshotFileExist> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        isSnapshotFileExist issnapshotfileexist = (isSnapshotFileExist) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return issnapshotfileexist;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onExtraCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[0], iOnNavigationEvent, iOnNavigationEvent3, iOnNavigationEvent2, -1524146605, 1524146607);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LeaveIntroViewModel leaveIntroViewModel) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onExtraCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{leaveIntroViewModel}, iOnNavigationEvent, iOnNavigationEvent3, iOnNavigationEvent2, 538744348, -538744344);
    }

    public static final void onWarmupCompleted(@Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04, @NotNull Function0<Unit> function05, @Nullable LeaveIntroViewModel leaveIntroViewModel, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {function0, function02, function03, function04, function05, leaveIntroViewModel, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        onExtraCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent2, 574512951, -574512946);
    }

    private static final Unit IAuthTabCallback(Function0 function0) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onExtraCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{function0}, iOnNavigationEvent, iOnNavigationEvent3, iOnNavigationEvent2, -1446483531, 1446483534);
    }

    private static final Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, LeaveIntroViewModel leaveIntroViewModel, v1 v1Var, Function0 function0, Function0 function02, Function0 function03, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, leaveIntroViewModel, v1Var, function0, function02, function03, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onExtraCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent2, 5824514, -5824514);
    }

    private static final Unit onNavigationEvent(LeaveIntroViewModel leaveIntroViewModel, Function0 function0, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {leaveIntroViewModel, function0, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onExtraCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent2, 1555365711, -1555365710);
    }
}
