package im.toss.features.leave.ui.remainingbalance;

import im.toss.features.leave.common.nav.LeaveNav;
import im.toss.features.leave.common.nav.LeaveNav$Todo;
import im.toss.features.leave.common.nav.RemainingMoneyNav;
import im.toss.features.leave.common.nav.RemainingMoneyNav$InputAccountNotice;
import im.toss.features.leave.common.nav.RemainingMoneyNav$PendingTransfer;
import im.toss.features.leave.common.nav.RemainingMoneyNav$RemainingBalanceList;
import im.toss.features.leave.common.nav.RemainingMoneyNav$VisitorRemainingBalanceList;
import im.toss.features.leave.common.nav.RemainingMoneyNavEvent;
import im.toss.features.leave.ui.LeaveViewModel;
import im.toss.features.leave.ui.remainingbalance.RemainingBalanceScreenKt$;
import im.toss.features.leave.ui.remainingbalance.inputaccount.InputAccountNoticeUserInfo;
import im.toss.features.leave.ui.remainingbalance.inputaccount.InputAccountNoticeViewModel;
import im.toss.features.leave.ui.remainingbalance.list.RemainingBalanceListScreenKt;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceViewModel;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.BaseResourcePackage;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.EncoderProfilesProxyVideoProfileProxy;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8;
import o.ForwardingCameraControl;
import o.KeyBoardVisiblePoint;
import o.PluginResourcePackageMyPluginDownloadCallback;
import o.PullRefreshIndicatorKtExternalSyntheticLambda3;
import o.PullRefreshIndicatorKtExternalSyntheticLambda5;
import o.RippleContainer;
import o.TextKtExternalSyntheticLambda9;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.TwoLineExternalSyntheticLambda0;
import o.TypographyKtExternalSyntheticLambda0;
import o.access8100;
import o.getDummyAd;
import o.hasData;
import o.onNotInstalled;
import o.setDividerDrawable;
import o.setPopupContentSizefhxjrPA;
import o.setPositionProvider;
import o.setSnapshotHtml;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemainingBalanceScreenKt {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit IAuthTabCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(typographyKtExternalSyntheticLambda0);
        }
        onTransact(typographyKtExternalSyntheticLambda0);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, getDummyAd getdummyad, Function0 function0, LeaveViewModel leaveViewModel, Function0 function02, Function0 function03, Function2 function2, Function0 function04, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(typographyKtExternalSyntheticLambda0, getdummyad, function0, leaveViewModel, function02, function03, function2, function04, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8);
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        int i5 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(typographyKtExternalSyntheticLambda0, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 12 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5 = (PullRefreshIndicatorKtExternalSyntheticLambda5) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 1836526416, -1836526414, new Object[]{pullRefreshIndicatorKtExternalSyntheticLambda5}, iOnWarmupCompleted3);
        }
        int iOnWarmupCompleted4 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted5 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted6 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int i3 = 82 / 0;
        return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted5, iOnWarmupCompleted4, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 1836526416, -1836526414, new Object[]{pullRefreshIndicatorKtExternalSyntheticLambda5}, iOnWarmupCompleted6);
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(typographyKtExternalSyntheticLambda0);
        int i4 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return unitAsBinder;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa = (setPopupContentSizefhxjrPA) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setpopupcontentsizefhxjrpa);
        int i4 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(pullRefreshIndicatorKtExternalSyntheticLambda5);
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(typographyKtExternalSyntheticLambda0);
        int i4 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, Function2 function2, Boolean bool, KeyBoardVisiblePoint keyBoardVisiblePoint) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(typographyKtExternalSyntheticLambda0, function2, bool, keyBoardVisiblePoint);
        int i4 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(typographyKtExternalSyntheticLambda0, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getDummyAd getdummyad, Function0 function0, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getdummyad, function0, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = i7 | i5;
        int i9 = ~i8;
        int i10 = ~i2;
        int i11 = i9 | (~(i10 | i5));
        int i12 = i8 | i10;
        int i13 = (~(i2 | i5)) | (~(i7 | (~i5)));
        int i14 = i5 + i4 + i + ((-1311665080) * i6) + (1761575915 * i3);
        int i15 = i14 * i14;
        int i16 = ((-2073022045) * i5) + 412680192 + (1917570655 * i4) + (i11 * (-1995296350)) + (1995296350 * i12) + ((-1995296350) * i13) + ((-77725696) * i) + (175112192 * i6) + ((-649461760) * i3) + (1783169024 * i15);
        int i17 = ((i5 * 1226044109) - 1701849991) + (i4 * 1226043089) + (i11 * 510) + (i12 * (-510)) + (i13 * 510) + (i * 1226043599) + (i6 * (-858626504)) + (i3 * 1069087493) + (i15 * 1627848704);
        switch (i16 + (i17 * i17 * 739704832)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa = (setPopupContentSizefhxjrPA) objArr[0];
                int i18 = 2 % 2;
                Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
                setpopupcontentsizefhxjrpa.onNavigationEvent(Reflection.getOrCreateKotlinClass(RemainingMoneyNav$PendingTransfer.class), new RemainingBalanceScreenKt$.ExternalSyntheticLambda11());
                Unit unit = Unit.INSTANCE;
                int i19 = onWarmupCompleted + 3;
                onExtraCallbackWithResult = i19 % 128;
                int i20 = i19 % 2;
                return unit;
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0 = (TypographyKtExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(typographyKtExternalSyntheticLambda0);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(typographyKtExternalSyntheticLambda0);
        int i3 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(typographyKtExternalSyntheticLambda0);
        int i4 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, InputAccountNoticeUserInfo inputAccountNoticeUserInfo) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(typographyKtExternalSyntheticLambda0, inputAccountNoticeUserInfo);
        }
        IAuthTabCallback(typographyKtExternalSyntheticLambda0, inputAccountNoticeUserInfo);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted4 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted5 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted6 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnWarmupCompleted5, iOnWarmupCompleted4, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 979550078, -979550072, new Object[]{typographyKtExternalSyntheticLambda0, str}, iOnWarmupCompleted6);
        int i3 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (i3 == 0) {
            int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -2022783043, 2022783047, new Object[]{typographyKtExternalSyntheticLambda0, boolValueOf}, iOnWarmupCompleted3);
        }
        int iOnWarmupCompleted4 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted5 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted6 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int i4 = 2 / 0;
        return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted5, iOnWarmupCompleted4, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -2022783043, 2022783047, new Object[]{typographyKtExternalSyntheticLambda0, boolValueOf}, iOnWarmupCompleted6);
    }

    public static /* synthetic */ Unit onNavigationEvent(getDummyAd getdummyad, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, Function0 function0, Function0 function02, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            onWarmupCompleted(getdummyad, typographyKtExternalSyntheticLambda0, function0, function02, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(getdummyad, typographyKtExternalSyntheticLambda0, function0, function02, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LeaveViewModel leaveViewModel = (LeaveViewModel) objArr[0];
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0 = (TypographyKtExternalSyntheticLambda0) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        Function0 function02 = (Function0) objArr[3];
        Function0 function03 = (Function0) objArr[4];
        Function2 function2 = (Function2) objArr[5];
        Function0 function04 = (Function0) objArr[6];
        setDividerDrawable setdividerdrawable = (setDividerDrawable) objArr[7];
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0 = (TwoLineExternalSyntheticLambda0) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onWarmupCompleted(leaveViewModel, typographyKtExternalSyntheticLambda0, function0, function02, function03, function2, function04, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(leaveViewModel, typographyKtExternalSyntheticLambda0, function0, function02, function03, function2, function04, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(typographyKtExternalSyntheticLambda0);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        int i5 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAccess000;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, BaseResourcePackage baseResourcePackage) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(typographyKtExternalSyntheticLambda0, baseResourcePackage);
        int i4 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -1793438582, 1793438587, new Object[]{setpopupcontentsizefhxjrpa}, iOnWarmupCompleted3);
        int i4 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TypographyKtExternalSyntheticLambda0.onExtraCallback(typographyKtExternalSyntheticLambda0, LeaveNav$Todo.INSTANCE, false, false, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5 = (PullRefreshIndicatorKtExternalSyntheticLambda5) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pullRefreshIndicatorKtExternalSyntheticLambda5, "");
        pullRefreshIndicatorKtExternalSyntheticLambda5.IAuthTabCallback(true);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pullRefreshIndicatorKtExternalSyntheticLambda5, "");
        pullRefreshIndicatorKtExternalSyntheticLambda5.IAuthTabCallback(true);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
        setpopupcontentsizefhxjrpa.onNavigationEvent(Reflection.getOrCreateKotlinClass(RemainingMoneyNav$PendingTransfer.class), new RemainingBalanceScreenKt$.ExternalSyntheticLambda5());
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0 = (TypographyKtExternalSyntheticLambda0) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (zBooleanValue) {
            typographyKtExternalSyntheticLambda0.onExtraCallback(RemainingMoneyNav$VisitorRemainingBalanceList.INSTANCE, new RemainingBalanceScreenKt$.ExternalSyntheticLambda6());
        } else {
            typographyKtExternalSyntheticLambda0.onExtraCallback(RemainingMoneyNav$RemainingBalanceList.INSTANCE, new RemainingBalanceScreenKt$.ExternalSyntheticLambda7());
            int i3 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object obj;
        Object obj2;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(988699677, i, -1, "im.toss.features.leave.ui.remainingbalance.remainingMoneyGraph.<anonymous>.<anonymous> (RemainingBalanceScreen.kt:32)");
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(typographyKtExternalSyntheticLambda0);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        Object obj3 = null;
        if (!zOnExtraCallback) {
            int i5 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                throw null;
            }
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                RemainingBalanceScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new RemainingBalanceScreenKt$.ExternalSyntheticLambda0(typographyKtExternalSyntheticLambda0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                obj = externalSyntheticLambda0;
            }
        }
        Function0 function0 = (Function0) obj;
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(typographyKtExternalSyntheticLambda0);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback2) {
            int i6 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                obj3.hashCode();
                throw null;
            }
            obj2 = objOnMinimized2;
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                RemainingBalanceScreenKt$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new RemainingBalanceScreenKt$.ExternalSyntheticLambda1(typographyKtExternalSyntheticLambda0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda1);
                obj2 = externalSyntheticLambda1;
            }
        }
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        setSnapshotHtml.IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 842936410, new Object[]{function0, (Function1) obj2, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 4}, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -842936409, iOnExtraCallback);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(getDummyAd getdummyad, Function0 function0, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1741270700, i, -1, "im.toss.features.leave.ui.remainingbalance.remainingMoneyGraph.<anonymous>.<anonymous> (RemainingBalanceScreen.kt:55)");
            int i5 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 3;
            }
        }
        PluginResourcePackageMyPluginDownloadCallback.onWarmupCompleted((VisitorRemainingBalanceViewModel) null, getdummyad, function0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        TypographyKtExternalSyntheticLambda0.onExtraCallback((TypographyKtExternalSyntheticLambda0) objArr[0], new RemainingMoneyNav.SelectAccount((String) objArr[1]), (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, Function2 function2, Boolean bool, KeyBoardVisiblePoint keyBoardVisiblePoint) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TypographyKtExternalSyntheticLambda0.onExtraCallback(typographyKtExternalSyntheticLambda0, LeaveNav$Todo.INSTANCE, false, false, 4, (Object) null);
        function2.invoke(bool, keyBoardVisiblePoint);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TypographyKtExternalSyntheticLambda0.onExtraCallback(typographyKtExternalSyntheticLambda0, LeaveNav$Todo.INSTANCE, false, false, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(LeaveViewModel leaveViewModel, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function0 function04, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        Object obj4 = null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(611587541, i, -1, "im.toss.features.leave.ui.remainingbalance.remainingMoneyGraph.<anonymous>.<anonymous> (RemainingBalanceScreen.kt:62)");
                obj4.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(611587541, i, -1, "im.toss.features.leave.ui.remainingbalance.remainingMoneyGraph.<anonymous>.<anonymous> (RemainingBalanceScreen.kt:62)");
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(typographyKtExternalSyntheticLambda0);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback) {
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                RemainingBalanceScreenKt$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new RemainingBalanceScreenKt$.ExternalSyntheticLambda8(typographyKtExternalSyntheticLambda0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda8);
                obj = externalSyntheticLambda8;
            }
        }
        Function1 function1 = (Function1) obj;
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(typographyKtExternalSyntheticLambda0);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback2 | zOnNavigationEvent)) {
            int i6 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                obj4.hashCode();
                throw null;
            }
            obj2 = objOnMinimized2;
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                RemainingBalanceScreenKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new RemainingBalanceScreenKt$.ExternalSyntheticLambda9(typographyKtExternalSyntheticLambda0, function2);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda9);
                obj2 = externalSyntheticLambda9;
            }
        }
        Function2 function22 = (Function2) obj2;
        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(typographyKtExternalSyntheticLambda0);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback3) {
            int i7 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 34 / 0;
                obj3 = objOnMinimized3;
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    RemainingBalanceScreenKt$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new RemainingBalanceScreenKt$.ExternalSyntheticLambda10(typographyKtExternalSyntheticLambda0);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda10);
                    obj3 = externalSyntheticLambda10;
                }
            } else {
                obj3 = objOnMinimized3;
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
            }
        }
        RemainingBalanceListScreenKt.IAuthTabCallback(1771435214, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1771435205, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{leaveViewModel, twoLineExternalSyntheticLambda0, function1, function0, function02, function03, function22, function04, (Function0) obj3, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i & 112), 512}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TypographyKtExternalSyntheticLambda0.onExtraCallback(typographyKtExternalSyntheticLambda0, RemainingMoneyNav$InputAccountNotice.INSTANCE, (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, BaseResourcePackage baseResourcePackage) {
        int i = 2 % 2;
        String string = RemainingMoneyNav.SelectAccount.Companion.toString();
        RemainingMoneyNavEvent.SelectAccount selectAccount = new RemainingMoneyNavEvent.SelectAccount(baseResourcePackage);
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy = typographyKtExternalSyntheticLambda0.IAuthTabCallbackStubProxy();
        if (twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy != null) {
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7OnTransact = twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy.onTransact();
                if (textLinkScopeExternalSyntheticLambda7OnTransact != null) {
                    int i3 = onExtraCallbackWithResult + 83;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                        textLinkScopeExternalSyntheticLambda7OnTransact.onWarmupCompleted(string, selectAccount);
                    } else {
                        textLinkScopeExternalSyntheticLambda7OnTransact.onWarmupCompleted(string, selectAccount);
                        int i4 = 88 / 0;
                    }
                }
            } else {
                twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy.onTransact();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        typographyKtExternalSyntheticLambda0.getInterfaceDescriptor();
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7OnTransact;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            String string = RemainingMoneyNav.SelectAccount.Companion.toString();
            RemainingMoneyNavEvent.ForceUpdateRemainingBalance forceUpdateRemainingBalance = RemainingMoneyNavEvent.ForceUpdateRemainingBalance.onNavigationEvent;
            TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy = typographyKtExternalSyntheticLambda0.IAuthTabCallbackStubProxy();
            if (twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy != null && (textLinkScopeExternalSyntheticLambda7OnTransact = twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy.onTransact()) != null) {
                textLinkScopeExternalSyntheticLambda7OnTransact.onWarmupCompleted(string, forceUpdateRemainingBalance);
            }
            typographyKtExternalSyntheticLambda0.getInterfaceDescriptor();
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        RemainingMoneyNav.SelectAccount.Companion.toString();
        RemainingMoneyNavEvent.ForceUpdateRemainingBalance forceUpdateRemainingBalance2 = RemainingMoneyNavEvent.ForceUpdateRemainingBalance.onNavigationEvent;
        typographyKtExternalSyntheticLambda0.IAuthTabCallbackStubProxy();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1330521514, i, -1, "im.toss.features.leave.ui.remainingbalance.remainingMoneyGraph.<anonymous>.<anonymous> (RemainingBalanceScreen.kt:84)");
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(typographyKtExternalSyntheticLambda0);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback) {
            int i3 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                RemainingBalanceScreenKt$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new RemainingBalanceScreenKt$.ExternalSyntheticLambda2(typographyKtExternalSyntheticLambda0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                obj = externalSyntheticLambda2;
            }
        }
        Function0 function0 = (Function0) obj;
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(typographyKtExternalSyntheticLambda0);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback2) {
            obj2 = objOnMinimized2;
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                RemainingBalanceScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new RemainingBalanceScreenKt$.ExternalSyntheticLambda3(typographyKtExternalSyntheticLambda0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda3);
                int i5 = onWarmupCompleted + 63;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                obj2 = externalSyntheticLambda3;
            }
        }
        Function1 function1 = (Function1) obj2;
        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(typographyKtExternalSyntheticLambda0);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback3) {
            int i7 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            obj3 = objOnMinimized3;
            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                RemainingBalanceScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new RemainingBalanceScreenKt$.ExternalSyntheticLambda4(typographyKtExternalSyntheticLambda0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                obj3 = externalSyntheticLambda4;
            }
        }
        onNotInstalled.onNavigationEvent(new Object[]{twoLineExternalSyntheticLambda0, function0, function1, (Function0) obj3, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i >> 3) & 14), 16}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -910810400, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 910810404, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit access000(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        try {
            TypographyKtExternalSyntheticLambda0.onExtraCallback(typographyKtExternalSyntheticLambda0, TextKtExternalSyntheticLambda9.onWarmupCompleted(typographyKtExternalSyntheticLambda0.onNavigationEvent(Reflection.getOrCreateKotlinClass(RemainingMoneyNav$RemainingBalanceList.class)), Reflection.getOrCreateKotlinClass(RemainingMoneyNav$RemainingBalanceList.class)), false, false, 4, (Object) null);
            int i4 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } catch (IllegalArgumentException unused) {
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        String string = RemainingMoneyNav$InputAccountNotice.INSTANCE.toString();
        RemainingMoneyNavEvent.ShowRegisterOtherAccount showRegisterOtherAccount = RemainingMoneyNavEvent.ShowRegisterOtherAccount.onWarmupCompleted;
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy = typographyKtExternalSyntheticLambda0.IAuthTabCallbackStubProxy();
        if (twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy != null) {
            int i2 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7OnTransact = twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy.onTransact();
            if (textLinkScopeExternalSyntheticLambda7OnTransact != null) {
                int i4 = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                textLinkScopeExternalSyntheticLambda7OnTransact.onWarmupCompleted(string, showRegisterOtherAccount);
                int i6 = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        typographyKtExternalSyntheticLambda0.getInterfaceDescriptor();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[PHI: r6
      0x0035: PHI (r6v3 o.TextLinkScopeExternalSyntheticLambda7) = (r6v2 o.TextLinkScopeExternalSyntheticLambda7), (r6v7 o.TextLinkScopeExternalSyntheticLambda7) binds: [B:10:0x0033, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, InputAccountNoticeUserInfo inputAccountNoticeUserInfo) {
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7OnTransact;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(inputAccountNoticeUserInfo, "");
        String string = RemainingMoneyNav$InputAccountNotice.INSTANCE.toString();
        RemainingMoneyNavEvent.RegisterMyAccount registerMyAccount = new RemainingMoneyNavEvent.RegisterMyAccount(inputAccountNoticeUserInfo);
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy = typographyKtExternalSyntheticLambda0.IAuthTabCallbackStubProxy();
        if (twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy != null) {
            int i2 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                textLinkScopeExternalSyntheticLambda7OnTransact = twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy.onTransact();
                int i3 = 32 / 0;
                if (textLinkScopeExternalSyntheticLambda7OnTransact != null) {
                    textLinkScopeExternalSyntheticLambda7OnTransact.onWarmupCompleted(string, registerMyAccount);
                    int i4 = onWarmupCompleted + 57;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                textLinkScopeExternalSyntheticLambda7OnTransact = twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy.onTransact();
                if (textLinkScopeExternalSyntheticLambda7OnTransact != null) {
                }
            }
        }
        typographyKtExternalSyntheticLambda0.getInterfaceDescriptor();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(getDummyAd getdummyad, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, Function0 function0, Function0 function02, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1022336727, i, -1, "im.toss.features.leave.ui.remainingbalance.remainingMoneyGraph.<anonymous>.<anonymous> (RemainingBalanceScreen.kt:105)");
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(typographyKtExternalSyntheticLambda0);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback) {
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                RemainingBalanceScreenKt$.ExternalSyntheticLambda12 externalSyntheticLambda12 = new RemainingBalanceScreenKt$.ExternalSyntheticLambda12(typographyKtExternalSyntheticLambda0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda12);
                obj = externalSyntheticLambda12;
            }
        }
        Function1 function1 = (Function1) obj;
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(typographyKtExternalSyntheticLambda0);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback2) {
            obj2 = objOnMinimized2;
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                RemainingBalanceScreenKt$.ExternalSyntheticLambda13 externalSyntheticLambda13 = new RemainingBalanceScreenKt$.ExternalSyntheticLambda13(typographyKtExternalSyntheticLambda0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda13);
                obj2 = externalSyntheticLambda13;
            }
        }
        Function0 function03 = (Function0) obj2;
        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(typographyKtExternalSyntheticLambda0);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback3) {
            int i3 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            obj3 = objOnMinimized3;
            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                RemainingBalanceScreenKt$.ExternalSyntheticLambda14 externalSyntheticLambda14 = new RemainingBalanceScreenKt$.ExternalSyntheticLambda14(typographyKtExternalSyntheticLambda0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda14);
                obj3 = externalSyntheticLambda14;
            }
        }
        hasData.onExtraCallbackWithResult(getdummyad, function1, function03, (Function0) obj3, function0, function02, (InputAccountNoticeViewModel) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 64);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, getDummyAd getdummyad, Function0 function0, LeaveViewModel leaveViewModel, Function0 function02, Function0 function03, Function2 function2, Function0 function04, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(988699677, true, new RemainingBalanceScreenKt$.ExternalSyntheticLambda15(typographyKtExternalSyntheticLambda0));
        RippleContainer.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, Reflection.getOrCreateKotlinClass(RemainingMoneyNav$PendingTransfer.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult);
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult2 = ForwardingCameraControl.onExtraCallbackWithResult(-1741270700, true, new RemainingBalanceScreenKt$.ExternalSyntheticLambda16(getdummyad, function0));
        RippleContainer.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, Reflection.getOrCreateKotlinClass(RemainingMoneyNav$VisitorRemainingBalanceList.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult2);
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult3 = ForwardingCameraControl.onExtraCallbackWithResult(611587541, true, new RemainingBalanceScreenKt$.ExternalSyntheticLambda17(leaveViewModel, typographyKtExternalSyntheticLambda0, function0, function02, function03, function2, function04));
        RippleContainer.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, Reflection.getOrCreateKotlinClass(RemainingMoneyNav$RemainingBalanceList.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult3);
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult4 = ForwardingCameraControl.onExtraCallbackWithResult(-1330521514, true, new RemainingBalanceScreenKt$.ExternalSyntheticLambda18(typographyKtExternalSyntheticLambda0));
        RippleContainer.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, Reflection.getOrCreateKotlinClass(RemainingMoneyNav.SelectAccount.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult4);
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult5 = ForwardingCameraControl.onExtraCallbackWithResult(1022336727, true, new RemainingBalanceScreenKt$.ExternalSyntheticLambda19(getdummyad, typographyKtExternalSyntheticLambda0, function02, function03));
        RippleContainer.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, Reflection.getOrCreateKotlinClass(RemainingMoneyNav$InputAccountNotice.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult5);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final void onNavigationEvent(@NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull LeaveViewModel leaveViewModel, @NotNull getDummyAd getdummyad, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function2<? super Boolean, ? super KeyBoardVisiblePoint, Unit> function2, @NotNull Function0<Unit> function04) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(leaveViewModel, "");
        Intrinsics.checkNotNullParameter(getdummyad, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function04, "");
        RemainingMoneyNav$PendingTransfer remainingMoneyNav$PendingTransfer = RemainingMoneyNav$PendingTransfer.INSTANCE;
        RemainingBalanceScreenKt$.ExternalSyntheticLambda20 externalSyntheticLambda20 = new RemainingBalanceScreenKt$.ExternalSyntheticLambda20(typographyKtExternalSyntheticLambda0, getdummyad, function0, leaveViewModel, function02, function03, function2, function04);
        RippleContainer.onExtraCallback(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, remainingMoneyNav$PendingTransfer, Reflection.getOrCreateKotlinClass(LeaveNav.RemainingMoneyNavRoot.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, externalSyntheticLambda20);
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LeaveViewModel leaveViewModel, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function0 function04, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {leaveViewModel, typographyKtExternalSyntheticLambda0, function0, function02, function03, function2, function04, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 1503536388, -1503536387, objArr, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -361477453, 361477453, new Object[]{typographyKtExternalSyntheticLambda0}, iOnWarmupCompleted3);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -386624635, 386624642, new Object[]{pullRefreshIndicatorKtExternalSyntheticLambda5}, iOnWarmupCompleted3);
    }

    public static /* synthetic */ Unit IAuthTabCallback(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -1168016253, 1168016256, new Object[]{setpopupcontentsizefhxjrpa}, iOnWarmupCompleted3);
    }

    private static final Unit IAuthTabCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, boolean z) {
        Object[] objArr = {typographyKtExternalSyntheticLambda0, Boolean.valueOf(z)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -2022783043, 2022783047, objArr, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
    }

    private static final Unit onExtraCallback(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -1793438582, 1793438587, new Object[]{setpopupcontentsizefhxjrpa}, iOnWarmupCompleted3);
    }

    private static final Unit onNavigationEvent(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 1836526416, -1836526414, new Object[]{pullRefreshIndicatorKtExternalSyntheticLambda5}, iOnWarmupCompleted3);
    }

    private static final Unit IAuthTabCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, String str) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 979550078, -979550072, new Object[]{typographyKtExternalSyntheticLambda0, str}, iOnWarmupCompleted3);
    }
}
