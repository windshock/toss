package o;

import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAdPlacerExternalSyntheticLambda2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    public static final MaxAdPlacerExternalSyntheticLambda2 onNavigationEvent = new MaxAdPlacerExternalSyntheticLambda2();
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 25;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~i4;
        int i11 = ~(i8 | i10);
        int i12 = i9 | i11;
        int i13 = (~(i4 | i8 | i3)) | (~(i7 | i6)) | (~(i10 | i7));
        int i14 = i3 + i6 + i5 + ((-1336646162) * i2) + (1706069763 * i);
        int i15 = i14 * i14;
        int i16 = ((i3 * (-1709230891)) - 203685888) + ((-1709230891) * i6) + ((-1137600936) * i12) + (568800468 * i11) + ((-568800468) * i13) + (2016935936 * i5) + ((-602931200) * i2) + ((-1331167232) * i) + ((-1604583424) * i15);
        int i17 = ((i3 * 112646815) - 831444653) + (i6 * 112646815) + (i12 * 520) + (i11 * (-260)) + (i13 * 260) + (i5 * 112647075) + (i2 * (-2078048118)) + (i * (-2015059991)) + (i15 * (-829161472));
        int i18 = i16 + (i17 * i17 * (-1266417664));
        if (i18 != 1) {
            return i18 != 2 ? i18 != 3 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
        }
        MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda2 = (MaxAdPlacerExternalSyntheticLambda2) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i19 = 2 % 2;
        int i20 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i20 % 128;
        int i21 = i20 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i22 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i22 % 128;
            int i23 = i22 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1950864088, iIntValue, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-greyOpacity100> (TdsPalette.kt:251)");
            int i24 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i24 % 128;
            int i25 = i24 % 2;
        }
        long jMayLaunchUrl = maxAdPlacerExternalSyntheticLambda2.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, iIntValue & 14).mayLaunchUrl();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Long.valueOf(jMayLaunchUrl);
    }

    private MaxAdPlacerExternalSyntheticLambda2() {
    }

    public final addFixedPosition onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onAdRemoved.onExtraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        addFixedPosition addfixedpositionOnExtraCallbackWithResult = onAdRemoved.onExtraCallbackWithResult();
        int i3 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return addfixedpositionOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final addFixedPosition onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        addFixedPosition addfixedpositionIAuthTabCallback = onAdRemoved.IAuthTabCallback();
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        return addfixedpositionIAuthTabCallback;
    }

    public final addFixedPosition onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(854810697, i, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-current> (TdsPalette.kt:31)");
        }
        addFixedPosition addfixedpositionIAuthTabCallback = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 != 0) {
                throw null;
            }
        }
        return addfixedpositionIAuthTabCallback;
    }

    public final long onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1558178814, i, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-blue500> (TdsPalette.kt:61)");
        }
        long jIAuthTabCallbackStub = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i & 14).IAuthTabCallbackStub();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i4 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return jIAuthTabCallbackStub;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 44 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 71;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1804970362, i, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-blue700> (TdsPalette.kt:71)");
                if (i6 != 0) {
                    int i7 = 14 / 0;
                }
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        long jOnTransact = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i & 14).onTransact();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnTransact;
    }

    public final long IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            obj.hashCode();
            throw null;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-41647344, i, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-grey100> (TdsPalette.kt:201)");
        }
        long jOnActivityLayout = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i & 14).onActivityLayout();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i5 != 0) {
                int i6 = 17 / 0;
            }
        }
        int i7 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return jOnActivityLayout;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda2 = (MaxAdPlacerExternalSyntheticLambda2) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i2 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(81748430, iIntValue, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-grey200> (TdsPalette.kt:206)");
            if (i3 != 0) {
                int i4 = 6 / 0;
            }
        }
        long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{maxAdPlacerExternalSyntheticLambda2.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, iIntValue & 14)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i5 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 2;
            }
        }
        return Long.valueOf(jLongValue);
    }

    public final long asBinder(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(205144204, i, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-grey300> (TdsPalette.kt:211)");
            int i4 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        long jOnRelationshipValidationResult = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i & 14).onRelationshipValidationResult();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnRelationshipValidationResult;
    }

    public final long onTransact(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(328539978, i, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-grey400> (TdsPalette.kt:216)");
        }
        long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i & 14)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 != 0) {
                throw null;
            }
        }
        return jLongValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long IAuthTabCallbackStub(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 98 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(451935752, i, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-grey500> (TdsPalette.kt:221)");
                if (i6 == 0) {
                    int i7 = 88 / 0;
                }
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        long jOnUnminimized = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i & 14).onUnminimized();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i10 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return jOnUnminimized;
    }

    public final long asInterface(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(698727300, i, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-grey700> (TdsPalette.kt:231)");
        }
        long jICustomTabsService = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i & 14).ICustomTabsService();
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i5 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return jICustomTabsService;
    }

    public final long IAuthTabCallbackDefault(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            obj.hashCode();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(822123074, i, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-grey800> (TdsPalette.kt:236)");
        }
        long jIsEngagementSignalsApiAvailable = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i & 14).isEngagementSignalsApiAvailable();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        return jIsEngagementSignalsApiAvailable;
    }

    public final long access000(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(945518848, i, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-grey900> (TdsPalette.kt:241)");
            if (i6 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i & 14)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i7 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i8 != 0) {
                int i9 = 2 / 0;
            }
        }
        return jLongValue;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda2 = (MaxAdPlacerExternalSyntheticLambda2) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i2 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-225423832, iIntValue, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-greyOpacity900> (TdsPalette.kt:291)");
        }
        long jRequestPostMessageChannelWithExtras = maxAdPlacerExternalSyntheticLambda2.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, iIntValue & 14).requestPostMessageChannelWithExtras();
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i4 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i5 == 0) {
                int i6 = 22 / 0;
            }
            int i7 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        return Long.valueOf(jRequestPostMessageChannelWithExtras);
    }

    public final long access100(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(699045992, i, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-red800> (TdsPalette.kt:416)");
            if (i4 != 0) {
                throw null;
            }
        }
        long jIEngagementSignalsCallback_Parcel = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i & 14).IEngagementSignalsCallback_Parcel();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jIEngagementSignalsCallback_Parcel;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long getInterfaceDescriptor(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 31 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-332217986, i, -1, "im.toss.tds.compose.foundation.color.TdsPalette.<get-staticWhite> (TdsPalette.kt:461)");
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        long jIPostMessageService_Parcel = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i & 14).IPostMessageService_Parcel();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i7 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return jIPostMessageService_Parcel;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        addFixedPosition addfixedpositionOnWarmupCompleted;
        Object next;
        MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda2 = (MaxAdPlacerExternalSyntheticLambda2) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-934207073, iIntValue, -1, "im.toss.tds.compose.foundation.color.TdsPalette.tonalColorOf (TdsPalette.kt:758)");
        }
        addFixedPosition addfixedpositionOnNavigationEvent = maxAdPlacerExternalSyntheticLambda2.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, (iIntValue >> 3) & 14);
        if (addfixedpositionOnNavigationEvent.AudioAttributesCompatParcelizer() == getSpecialFeatureOptInStatus.Dark) {
            int i2 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            addfixedpositionOnWarmupCompleted = maxAdPlacerExternalSyntheticLambda2.onExtraCallbackWithResult();
        } else {
            addfixedpositionOnWarmupCompleted = maxAdPlacerExternalSyntheticLambda2.onWarmupCompleted();
            int i4 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        Iterator it = CollectionsKt.plus(addfixedpositionOnNavigationEvent.write(), addfixedpositionOnWarmupCompleted.write()).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Set<setByteOrder> setOnExtraCallbackWithResult = ((getRepeatingInterval) next).onExtraCallbackWithResult();
            if (!(setOnExtraCallbackWithResult instanceof Collection) || !setOnExtraCallbackWithResult.isEmpty()) {
                Iterator<T> it2 = setOnExtraCallbackWithResult.iterator();
                while (it2.hasNext()) {
                    int i6 = onWarmupCompleted + 57;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 52 / 0;
                        if (setByteOrder.onExtraCallbackWithResult(((setByteOrder) it2.next()).access100(), jLongValue)) {
                            break loop0;
                        }
                    } else if (setByteOrder.onExtraCallbackWithResult(((setByteOrder) it2.next()).access100(), jLongValue)) {
                        break loop0;
                    }
                }
            }
        }
        getRepeatingInterval getrepeatinginterval = (getRepeatingInterval) next;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return getrepeatinginterval;
    }

    public final long onNavigationEvent(long j, int i, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1732367276, i2, -1, "im.toss.tds.compose.foundation.color.TdsPalette.shiftShade (TdsPalette.kt:770)");
                int i5 = 42 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1732367276, i2, -1, "im.toss.tds.compose.foundation.color.TdsPalette.shiftShade (TdsPalette.kt:770)");
            }
        }
        Object[] objArr = {this, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 & 14) | ((i2 >> 3) & 112))};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        getRepeatingInterval getrepeatinginterval = (getRepeatingInterval) IAuthTabCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1674640265, iOnWarmupCompleted, iOnWarmupCompleted2, -1674640265);
        if (getrepeatinginterval == null) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 103;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = 0 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            return j;
        }
        long jIAuthTabCallback = getrepeatinginterval.IAuthTabCallback(j, i);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long onExtraCallbackWithResult(long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 96 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 47;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1366803152, i, -1, "im.toss.tds.compose.foundation.color.TdsPalette.nextShade (TdsPalette.kt:777)");
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        long jOnNavigationEvent = onNavigationEvent(j, 100, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | 48 | ((i << 3) & 896));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        return jOnNavigationEvent;
    }

    public final long onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Long) IAuthTabCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1545563122, iOnWarmupCompleted, iOnWarmupCompleted2, -1545563120)).longValue();
    }

    public final long IAuthTabCallback_Parcel(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Long) IAuthTabCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -118255345, iOnWarmupCompleted, iOnWarmupCompleted2, 118255346)).longValue();
    }

    public final long IAuthTabCallbackStubProxy(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Long) IAuthTabCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -404736689, iOnWarmupCompleted, iOnWarmupCompleted2, 404736692)).longValue();
    }

    public final getRepeatingInterval onWarmupCompleted(long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (getRepeatingInterval) IAuthTabCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1674640265, iOnWarmupCompleted, iOnWarmupCompleted2, -1674640265);
    }
}
