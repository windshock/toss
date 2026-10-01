package im.toss.feature.credit.ui.main.home.loan_needs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzaq;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import java.io.Serializable;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.ImageLoaderBuilderExternalSyntheticLambda3;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TrackGroupExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.diffGcInfo;
import o.getGcInfo;
import o.getHostnameVerifierokhttp;
import o.h5ScreenShotObserverOnChangeOpt;
import o.isFistLaunch;
import o.mExternalSyntheticApiModelOutline1;
import o.setHeaders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ScoreRaiseLoanNeedsActivity extends Hilt_ScoreRaiseLoanNeedsActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int ICustomTabsCallback = 0;
    public static final int asInterface;
    private static int extraCallback = 1;
    private static int extraCallbackWithResult = 1;
    private static char[] getInterfaceDescriptor;
    private static int readTypedObject;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy access100 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda3
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke() throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity = this.f$0;
            if (i3 != 0) {
                return ScoreRaiseLoanNeedsActivity.onTransact(scoreRaiseLoanNeedsActivity);
            }
            ScoreRaiseLoanNeedsActivity.onTransact(scoreRaiseLoanNeedsActivity);
            throw null;
        }
    });
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda4
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Integer.valueOf(ScoreRaiseLoanNeedsActivity.onNavigationEvent(this.f$0));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Integer numValueOf = Integer.valueOf(ScoreRaiseLoanNeedsActivity.onNavigationEvent(this.f$0));
            int i3 = onExtraCallback + 77;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return numValueOf;
        }
    });
    private final Lazy IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda5
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Float fValueOf = Float.valueOf(ScoreRaiseLoanNeedsActivity.onWarmupCompleted(this.f$0));
            int i4 = onWarmupCompleted + 17;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 7 / 0;
            }
            return fValueOf;
        }
    });
    private final Lazy IAuthTabCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda6
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Integer numOnExtraCallbackWithResult = ScoreRaiseLoanNeedsActivity.onExtraCallbackWithResult(this.f$0);
            int i4 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return numOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda7
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity = this.f$0;
            if (i3 == 0) {
                return ScoreRaiseLoanNeedsActivity.IAuthTabCallbackStub(scoreRaiseLoanNeedsActivity);
            }
            ScoreRaiseLoanNeedsActivity.IAuthTabCallbackStub(scoreRaiseLoanNeedsActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda8
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String str = (String) ScoreRaiseLoanNeedsActivity.onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1002148864, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this.f$0}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1002148860);
            int i4 = onExtraCallback + 93;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
    });
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda9
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Float fOnExtraCallback = ScoreRaiseLoanNeedsActivity.onExtraCallback(this.f$0);
            int i4 = onExtraCallback + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return fOnExtraCallback;
        }
    });
    private final Lazy access000 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda10
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity = this.f$0;
            if (i3 != 0) {
                return ScoreRaiseLoanNeedsActivity.IAuthTabCallback(scoreRaiseLoanNeedsActivity);
            }
            ScoreRaiseLoanNeedsActivity.IAuthTabCallback(scoreRaiseLoanNeedsActivity);
            throw null;
        }
    });

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[isFistLaunch.values().length];
            try {
                iArr[isFistLaunch.RAISED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[isFistLaunch.NOT_RAISED.ordinal()] = 2;
                int i = onNavigationEvent + 125;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[isFistLaunch.COOLTIME.ordinal()] = 3;
                int i4 = onNavigationEvent + 3;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
            int[] iArr2 = new int[getGcInfo.values().length];
            try {
                iArr2[getGcInfo.LOWEST_INTEREST_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[getGcInfo.MAX_LIMIT.ordinal()] = 2;
                int i7 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            onWarmupCompleted = iArr2;
        }
    }

    static {
        IAuthTabCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        asInterface = 8;
        int i = extraCallbackWithResult + 77;
        ICustomTabsCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity = (ScoreRaiseLoanNeedsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 83;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(scoreRaiseLoanNeedsActivity);
        int i4 = readTypedObject + 9;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ isFistLaunch IAuthTabCallback(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        isFistLaunch typedObject = readTypedObject(scoreRaiseLoanNeedsActivity);
        int i4 = extraCallback + 35;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return typedObject;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        isFistLaunch isfistlaunch = (isFistLaunch) objArr[0];
        ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity = (ScoreRaiseLoanNeedsActivity) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        String str = (String) objArr[3];
        String str2 = (String) objArr[4];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[5];
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(isfistlaunch, scoreRaiseLoanNeedsActivity, fFloatValue, str, str2, setDetectableSize);
        int i4 = readTypedObject + 101;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallbackStub(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 9;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(scoreRaiseLoanNeedsActivity);
            throw null;
        }
        String strAsBinder = asBinder(scoreRaiseLoanNeedsActivity);
        int i3 = readTypedObject + 81;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return strAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Float onExtraCallback(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 125;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Float fAccess000 = access000(scoreRaiseLoanNeedsActivity);
        int i4 = readTypedObject + 81;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return fAccess000;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity = (ScoreRaiseLoanNeedsActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 35;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(scoreRaiseLoanNeedsActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity, float f, String str, String str2) {
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -438189704, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{scoreRaiseLoanNeedsActivity, Float.valueOf(f), str, str2}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 438189711);
        int i4 = readTypedObject + 11;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(isFistLaunch isfistlaunch, float f, String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(isfistlaunch, f, str, str2, setDetectableSize);
        int i4 = readTypedObject + 63;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Integer onExtraCallbackWithResult(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Integer numIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(scoreRaiseLoanNeedsActivity);
        int i4 = readTypedObject + 39;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return numIAuthTabCallback_Parcel;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity = (ScoreRaiseLoanNeedsActivity) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        int i = 2 % 2;
        int i2 = extraCallback + 37;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(scoreRaiseLoanNeedsActivity, fFloatValue, str, str2);
        int i4 = extraCallback + 45;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ int onNavigationEvent(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iAccess100 = access100(scoreRaiseLoanNeedsActivity);
        int i4 = readTypedObject + 89;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iAccess100;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~(i7 | i6);
        int i9 = ~i6;
        int i10 = ~((~i4) | i9);
        int i11 = ~(i9 | i2);
        int i12 = i10 | i11;
        int i13 = (~(i4 | i7)) | i11 | i8;
        int i14 = i6 + i2 + i + ((-168536539) * i3) + (1787681333 * i5);
        int i15 = i14 * i14;
        int i16 = ((-1349843359) * i6) + 1460535296 + ((-923239215) * i2) + ((-1716058528) * i8) + (i12 * (-1289454384)) + ((-1289454384) * i13) + (366215168 * i) + (1604583424 * i3) + (216268800 * i5) + (1778253824 * i15);
        int i17 = (i6 * (-925914073)) + 175428941 + (i2 * (-925912777)) + (i8 * (-864)) + (i12 * 432) + (i13 * 432) + (i * (-925913209)) + (i3 * 1252505731) + (i5 * 30625011) + (i15 * (-2030960640));
        switch (i16 + (i17 * i17 * 899809280)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                isFistLaunch isfistlaunch = (isFistLaunch) objArr[0];
                String str = (String) objArr[1];
                float fFloatValue = ((Number) objArr[2]).floatValue();
                String str2 = (String) objArr[3];
                String str3 = (String) objArr[4];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[5];
                int i18 = 2 % 2;
                int i19 = extraCallback + 67;
                readTypedObject = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 4, 0, 0}, false, new byte[]{0, 1, 1, 1}, objArr2);
                setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), isfistlaunch.getLogType());
                Object[] objArr3 = new Object[1];
                a(new int[]{4, 8, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, objArr3);
                setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), isfistlaunch.getLogReferrer());
                Object[] objArr4 = new Object[1];
                a(new int[]{12, 12, 0, 9}, false, new byte[]{0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr4);
                setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), str);
                setDetectableSize.onExtraCallback("expected_interest_rate", Float.valueOf(fFloatValue));
                setDetectableSize.onExtraCallback("expected_limit", str2);
                setDetectableSize.onExtraCallback("predict_model_yn", str3);
                Unit unit = Unit.INSTANCE;
                int i21 = readTypedObject + 53;
                extraCallback = i21 % 128;
                int i22 = i21 % 2;
                return unit;
            case 7:
                return asInterface(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity = (ScoreRaiseLoanNeedsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 33;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(scoreRaiseLoanNeedsActivity);
        int i4 = readTypedObject + 41;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return unitICustomTabsCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity, String str, float f, String str2, String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 13;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(scoreRaiseLoanNeedsActivity, str, f, str2, str3);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(scoreRaiseLoanNeedsActivity, str, f, str2, str3);
        int i3 = extraCallback + 77;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(isFistLaunch isfistlaunch, String str, float f, String str2, String str3, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCallback + 117;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1945849725, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{isfistlaunch, str, Float.valueOf(f), str2, str3, setDetectableSize}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1945849731);
        int i3 = extraCallback + 123;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ String onTransact(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 79;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strExtraCallback = extraCallback(scoreRaiseLoanNeedsActivity);
        int i4 = readTypedObject + 77;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return strExtraCallback;
    }

    public static /* synthetic */ float onWarmupCompleted(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 59;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            return ((Float) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -814049889, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{scoreRaiseLoanNeedsActivity}, iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 814049889)).floatValue();
        }
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        ((Float) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -814049889, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{scoreRaiseLoanNeedsActivity}, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 814049889)).floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity, float f, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 5;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(scoreRaiseLoanNeedsActivity, f, str, str2);
        int i4 = extraCallback + 73;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(isFistLaunch isfistlaunch, String str, float f, String str2, String str3, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 11;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(isfistlaunch, str, f, str2, str3, setDetectableSize);
        int i4 = readTypedObject + 11;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCallback + 7;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 35;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String extraCallback(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        h5ScreenShotObserverOnChangeOpt.onExtraCallback onextracallback = h5ScreenShotObserverOnChangeOpt.Companion;
        Intent intent = scoreRaiseLoanNeedsActivity.getIntent();
        if (i3 == 0) {
            return onextracallback.onNavigationEvent(intent);
        }
        onextracallback.onNavigationEvent(intent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int ICustomTabsServiceStub() {
        int iIntValue;
        int i = 2 % 2;
        int i2 = extraCallback + 115;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            iIntValue = ((Number) this.IAuthTabCallbackDefault.getValue()).intValue();
            int i3 = 29 / 0;
        } else {
            iIntValue = ((Number) this.IAuthTabCallbackDefault.getValue()).intValue();
        }
        int i4 = readTypedObject + 93;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int access100(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 105;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return scoreRaiseLoanNeedsActivity.getIntent().getIntExtra("EXTRA_KCB_SCORE", 0);
    }

    private final float ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.IAuthTabCallback_Parcel.getValue()).floatValue();
        int i4 = extraCallback + 125;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return fFloatValue;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getHostnameVerifierokhttp gethostnameverifierokhttp = (ScoreRaiseLoanNeedsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 67;
        readTypedObject = i2 % 128;
        float floatExtra = gethostnameverifierokhttp.getIntent().getFloatExtra("EXTRA_LOWEST_INTEREST_RATES", i2 % 2 != 0 ? 2.0f : 0.0f);
        int i3 = readTypedObject + 69;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return Float.valueOf(floatExtra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Integer IAuthTabCallback_Parcel(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Integer numValueOf = Integer.valueOf(scoreRaiseLoanNeedsActivity.getIntent().getIntExtra("EXTRA_LOAN_APPROVAL_RATES", -1));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        int i4 = extraCallback + 117;
        readTypedObject = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final Integer validateRelationship() {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Integer num = (Integer) this.IAuthTabCallbackStubProxy.getValue();
        int i4 = readTypedObject + 81;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String asBinder(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = scoreRaiseLoanNeedsActivity.getIntent().getStringExtra("EXTRA_AVERAGE_MAX_LIMIT");
        int i4 = extraCallback + 59;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    private final String setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = (String) this.IAuthTabCallbackStub.getValue();
        int i3 = readTypedObject + 17;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IAuthTabCallbackStubProxy(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 23;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = scoreRaiseLoanNeedsActivity.getIntent().getStringExtra("EXTRA_ESTIMATED_MAX_LIMIT");
        int i4 = readTypedObject + 119;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    private final String updateVisuals() {
        int i = 2 % 2;
        int i2 = extraCallback + 55;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = (String) this.asBinder.getValue();
        int i3 = readTypedObject + 67;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 55 / 0;
        }
        return str;
    }

    private final Float ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 5;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Float f = (Float) this.onTransact.getValue();
        int i4 = readTypedObject + 47;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Float access000(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 85;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            scoreRaiseLoanNeedsActivity.getIntent().hasExtra("EXTRA_ESTIMATED_LOWEST_INTEREST_RATE");
            throw null;
        }
        if (!scoreRaiseLoanNeedsActivity.getIntent().hasExtra("EXTRA_ESTIMATED_LOWEST_INTEREST_RATE")) {
            int i3 = extraCallback + 37;
            readTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        return Float.valueOf(scoreRaiseLoanNeedsActivity.getIntent().getFloatExtra("EXTRA_ESTIMATED_LOWEST_INTEREST_RATE", 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final isFistLaunch readTypedObject(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int i = 2 % 2;
        Serializable serializableExtra = scoreRaiseLoanNeedsActivity.getIntent().getSerializableExtra("EXTRA_SCORE_RAISE_RESULT_SCREEN_TYPE");
        if (!(serializableExtra instanceof isFistLaunch)) {
            int i2 = extraCallback + 77;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        isFistLaunch isfistlaunch = (isFistLaunch) serializableExtra;
        int i4 = extraCallback + 19;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return isfistlaunch;
    }

    private final isFistLaunch writeTypedList() {
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.access000.getValue();
        if (i3 == 0) {
            return (isFistLaunch) value;
        }
        int i4 = 50 / 0;
        return (isFistLaunch) value;
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = extraCallback + 3;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((r6 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        finish();
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        o.IAuthTabCallbackStubProxy.onWarmupCompleted(r5, (o.ICustomTabsService) null, (o.ICustomTabsService) null, 3, (java.lang.Object) null);
        getWindow().setStatusBarColor(0);
        o.requestPostMessageChannelWithExtras.onExtraCallback(r5, (o.CameraConfigBuilder) null, o.setAdVideoPlaybackListener.onWarmupCompleted(o.ForwardingCameraControl.onExtraCallbackWithResult(-111679558, true, new im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$.ExternalSyntheticLambda2(r5))), 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (writeTypedList() == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (writeTypedList() == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r6 = im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity.extraCallback + 125;
        im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity.readTypedObject = r6 % 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.feature.credit.ui.main.home.loan_needs.Hilt_ScoreRaiseLoanNeedsActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            overridePendingTransition(1, 0);
            super.onCreate(bundle);
        } else {
            overridePendingTransition(0, 0);
            super.onCreate(bundle);
        }
    }

    private static final Unit onNavigationEvent(isFistLaunch isfistlaunch, float f, String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 0, 0}, false, new byte[]{0, 1, 1, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), isfistlaunch.getLogType());
        Object[] objArr2 = new Object[1];
        a(new int[]{4, 8, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), isfistlaunch.getLogReferrer());
        setDetectableSize.onExtraCallback("expected_interest_rate", Float.valueOf(f));
        setDetectableSize.onExtraCallback("expected_limit", str);
        setDetectableSize.onExtraCallback("predict_model_yn", str2);
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 77;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r10
      0x001f: PHI (r10v2 o.isFistLaunch) = (r10v1 o.isFistLaunch), (r10v7 o.isFistLaunch) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity, final float f, final String str, final String str2) throws Throwable {
        final isFistLaunch isfistlaunchWriteTypedList;
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            isfistlaunchWriteTypedList = scoreRaiseLoanNeedsActivity.writeTypedList();
            int i3 = 23 / 0;
            if (isfistlaunchWriteTypedList != null) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1009175L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda16
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj) throws Throwable {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallback + 15;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitOnExtraCallback = ScoreRaiseLoanNeedsActivity.onExtraCallback(isfistlaunchWriteTypedList, f, str, str2, (SetDetectableSize) obj);
                        int i7 = IAuthTabCallback + 105;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            return unitOnExtraCallback;
                        }
                        throw null;
                    }
                }, 14, null);
                int i4 = readTypedObject + 65;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            isfistlaunchWriteTypedList = scoreRaiseLoanNeedsActivity.writeTypedList();
            if (isfistlaunchWriteTypedList != null) {
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallback(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 87;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        scoreRaiseLoanNeedsActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 101;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final class onWarmupCompleted {
        private static final byte[] $$a = {70, 83, 77, 1};
        private static final int $$b = 138;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static long onWarmupCompleted = 7924117833564754128L;
        private static int onExtraCallback = -1776194565;
        private static char onExtraCallbackWithResult = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, int i2, int i3) {
            int i4;
            int i5;
            byte[] bArr = $$a;
            int i6 = 1 - (i * 3);
            int i7 = (i3 * 4) + 4;
            int i8 = i2 + 109;
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i9 = i8;
                i5 = 0;
                i8 = i6;
                i8 += i9;
                i7++;
                i4 = i5;
                i5 = i4 + 1;
                bArr2[i4] = (byte) i8;
                if (i5 == i6) {
                    return new String(bArr2, 0);
                }
                i9 = bArr[i7];
                i8 += i9;
                i7++;
                i4 = i5;
                i5 = i4 + 1;
                bArr2[i4] = (byte) i8;
                if (i5 == i6) {
                }
            } else {
                i4 = 0;
                i5 = i4 + 1;
                bArr2[i4] = (byte) i8;
                if (i5 == i6) {
                }
            }
        }

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
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
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i4 = $10 + 9;
                $11 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        int iKeyCodeFromString = 43 - KeyEvent.keyCodeFromString("");
                        int iBlue = Color.blue(0) + 1451;
                        byte b = $$a[3];
                        byte b2 = (byte) (b - 1);
                        byte b3 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), iKeyCodeFromString, iBlue, 228868077, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char maximumFlingVelocity = (char) (49123 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1494;
                        byte b4 = (byte) ($$a[3] - 1);
                        byte b5 = b4;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, scrollBarFadeDuration, packedPositionGroup, 1533236389, false, $$c(b4, b5, b5), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 50 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 45848), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i6 = $10 + 13;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }

        private onWarmupCompleted() {
        }

        public final Intent onWarmupCompleted(@NotNull Context context, @NotNull String str, int i, @NotNull isFistLaunch isfistlaunch, float f, @Nullable Integer num, @Nullable String str2, @Nullable Float f2, @Nullable String str3) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(isfistlaunch, "");
            Intent intent = new Intent(context, (Class<?>) ScoreRaiseLoanNeedsActivity.class);
            Object[] objArr = new Object[1];
            a((char) ExpandableListView.getPackedPositionType(0L), Color.blue(0), new char[]{26886, 5289, 10016, 33167, 27026, 53599, 16405, 28857}, new char[]{31531, 1494, 4889, 450}, new char[]{38398, 4175, 27712, 11892}, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            intent.putExtra("EXTRA_KCB_SCORE", i);
            intent.putExtra("EXTRA_SCORE_RAISE_RESULT_SCREEN_TYPE", isfistlaunch);
            intent.putExtra("EXTRA_LOWEST_INTEREST_RATES", f);
            intent.putExtra("EXTRA_LOAN_APPROVAL_RATES", num);
            intent.putExtra("EXTRA_AVERAGE_MAX_LIMIT", str2);
            intent.putExtra("EXTRA_ESTIMATED_MAX_LIMIT", str3);
            if (f2 != null) {
                int i3 = IAuthTabCallback + 123;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                intent.putExtra("EXTRA_ESTIMATED_LOWEST_INTEREST_RATE", f2.floatValue());
            }
            int i5 = IAuthTabCallback + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return intent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(isFistLaunch isfistlaunch, ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity, float f, String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 7;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 0, 0}, false, new byte[]{0, 1, 1, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), isfistlaunch.getLogType());
        Object[] objArr2 = new Object[1];
        a(new int[]{4, 8, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), isfistlaunch.getLogReferrer());
        Object[] objArr3 = new Object[1];
        a(new int[]{12, 12, 0, 9}, false, new byte[]{0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), scoreRaiseLoanNeedsActivity.getString(R.string.close));
        setDetectableSize.onExtraCallback("expected_interest_rate", Float.valueOf(f));
        setDetectableSize.onExtraCallback("expected_limit", str);
        setDetectableSize.onExtraCallback("predict_model_yn", str2);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 63;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(final ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity, final float f, final String str, final String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 103;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            scoreRaiseLoanNeedsActivity.writeTypedList();
            obj.hashCode();
            throw null;
        }
        final isFistLaunch isfistlaunchWriteTypedList = scoreRaiseLoanNeedsActivity.writeTypedList();
        if (isfistlaunchWriteTypedList != null) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5188754L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2) {
                    int i3 = 2 % 2;
                    int i4 = onExtraCallback + 99;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    Unit unit = (Unit) ScoreRaiseLoanNeedsActivity.onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 792698972, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{isfistlaunchWriteTypedList, scoreRaiseLoanNeedsActivity, Float.valueOf(f), str, str2, (SetDetectableSize) obj2}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -792698967);
                    int i6 = onExtraCallbackWithResult + 89;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return unit;
                }
            }, 14, null);
        }
        scoreRaiseLoanNeedsActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i3 = readTypedObject + 51;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity, final String str, final float f, final String str2, final String str3) throws Throwable {
        int i = 2 % 2;
        final isFistLaunch isfistlaunchWriteTypedList = scoreRaiseLoanNeedsActivity.writeTypedList();
        if (isfistlaunchWriteTypedList != null) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1230737L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 65;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnNavigationEvent = ScoreRaiseLoanNeedsActivity.onNavigationEvent(isfistlaunchWriteTypedList, str, f, str2, str3, (SetDetectableSize) obj);
                    int i5 = onWarmupCompleted + 35;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        return unitOnNavigationEvent;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }, 14, null);
            SessionTrackerb sessionTrackerbOnNavigationEvent = scoreRaiseLoanNeedsActivity.onNavigationEvent();
            String logReferrer = isfistlaunchWriteTypedList.getLogReferrer();
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new int[]{24, 56, 190, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(logReferrer);
            SessionTrackerb.IAuthTabCallback(sessionTrackerbOnNavigationEvent, scoreRaiseLoanNeedsActivity, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            int i2 = extraCallback + 85;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 47;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(isFistLaunch isfistlaunch, String str, float f, String str2, String str3, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 45;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 0, 0}, false, new byte[]{0, 1, 1, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), isfistlaunch.getLogType());
        Object[] objArr2 = new Object[1];
        a(new int[]{4, 8, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), isfistlaunch.getLogReferrer());
        Object[] objArr3 = new Object[1];
        a(new int[]{12, 12, 0, 9}, false, new byte[]{0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str);
        setDetectableSize.onExtraCallback("expected_interest_rate", Float.valueOf(f));
        setDetectableSize.onExtraCallback("expected_limit", str2);
        setDetectableSize.onExtraCallback("predict_model_yn", str3);
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 119;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004c A[PHI: r4 r5
      0x004c: PHI (r4v9 java.lang.String) = (r4v8 java.lang.String), (r4v18 java.lang.String) binds: [B:8:0x004a, B:5:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r5v3 o.isFistLaunch) = (r5v2 o.isFistLaunch), (r5v8 o.isFistLaunch) binds: [B:8:0x004a, B:5:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.app.Activity, android.content.Context, im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        String string;
        final isFistLaunch isfistlaunchWriteTypedList;
        ?? r3 = (ScoreRaiseLoanNeedsActivity) objArr[0];
        final float fFloatValue = ((Number) objArr[1]).floatValue();
        final String str = (String) objArr[2];
        final String str2 = (String) objArr[3];
        int i = 2 % 2;
        int i2 = extraCallback + 47;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            string = r3.getString(R.string.guide);
            Intrinsics.checkNotNullExpressionValue(string, "");
            isfistlaunchWriteTypedList = r3.writeTypedList();
            int i3 = 29 / 0;
            if (isfistlaunchWriteTypedList != null) {
                final String str3 = string;
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5187928L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda17
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) throws Throwable {
                        int i4 = 2 % 2;
                        int i5 = IAuthTabCallback + 31;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            return ScoreRaiseLoanNeedsActivity.onWarmupCompleted(isfistlaunchWriteTypedList, str3, fFloatValue, str, str2, (SetDetectableSize) obj);
                        }
                        ScoreRaiseLoanNeedsActivity.onWarmupCompleted(isfistlaunchWriteTypedList, str3, fFloatValue, str, str2, (SetDetectableSize) obj);
                        throw null;
                    }
                }, 14, null);
                int i4 = readTypedObject + 47;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            string = r3.getString(R.string.guide);
            Intrinsics.checkNotNullExpressionValue(string, "");
            isfistlaunchWriteTypedList = r3.writeTypedList();
            if (isfistlaunchWriteTypedList != null) {
            }
        }
        SessionTrackerb sessionTrackerbOnNavigationEvent = r3.onNavigationEvent();
        Object[] objArr2 = new Object[1];
        a(new int[]{80, 108, 0, 86}, true, new byte[]{1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1}, objArr2);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbOnNavigationEvent, (Activity) r3, ((String) objArr2[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(final ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        getGcInfo getgcinfo;
        setHeaders.onExtraCallback onextracallback;
        setHeaders setheaders;
        setHeaders.onExtraCallback onextracallbackOnWarmupCompleted;
        final float fIAuthTabCallback;
        final String str;
        final String str2;
        boolean zOnExtraCallback;
        boolean zIAuthTabCallback;
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        Object objOnMinimized;
        int i2;
        String str3;
        int i3;
        String string;
        int i4;
        String string2;
        mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult;
        boolean zOnExtraCallback2;
        String str4;
        Object obj;
        String string3;
        int i5 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-111679558, i, -1, "im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity.onCreate.<anonymous> (ScoreRaiseLoanNeedsActivity.kt:57)");
            }
            isFistLaunch isfistlaunchWriteTypedList = scoreRaiseLoanNeedsActivity.writeTypedList();
            int i6 = isfistlaunchWriteTypedList == null ? -1 : onNavigationEvent.IAuthTabCallback[isfistlaunchWriteTypedList.ordinal()];
            if (i6 == -1) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = extraCallback + 123;
                    readTypedObject = i7 % 128;
                    if (i7 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i8 = 23 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i9 = readTypedObject + 93;
                extraCallback = i9 % 128;
                int i10 = i9 % 2;
                return unit;
            }
            int i11 = extraCallback;
            int i12 = i11 + 33;
            readTypedObject = i12 % 128;
            if (i12 % 2 == 0 ? i6 == 1 : i6 == 0) {
                getgcinfo = getGcInfo.LOWEST_INTEREST_RATE;
            } else {
                int i13 = i11 + 123;
                readTypedObject = i13 % 128;
                int i14 = i13 % 2;
                if (i6 != 2 && i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                getgcinfo = getGcInfo.MAX_LIMIT;
            }
            getGcInfo getgcinfo2 = getgcinfo;
            int iICustomTabsServiceStub = scoreRaiseLoanNeedsActivity.ICustomTabsServiceStub();
            float fICustomTabsService_Parcel = scoreRaiseLoanNeedsActivity.ICustomTabsService_Parcel();
            Integer numValidateRelationship = scoreRaiseLoanNeedsActivity.validateRelationship();
            String engagementSignalsCallback = scoreRaiseLoanNeedsActivity.setEngagementSignalsCallback();
            String strUpdateVisuals = scoreRaiseLoanNeedsActivity.updateVisuals();
            if (strUpdateVisuals == null) {
                onextracallback = null;
                setheaders = new setHeaders(Integer.valueOf(iICustomTabsServiceStub), fICustomTabsService_Parcel, numValidateRelationship, engagementSignalsCallback, onextracallback, true, new setHeaders.onNavigationEvent("", ""));
                onextracallbackOnWarmupCompleted = setheaders.onWarmupCompleted();
                fIAuthTabCallback = onextracallbackOnWarmupCompleted != null ? onextracallbackOnWarmupCompleted.IAuthTabCallback() : setheaders.IAuthTabCallback();
                if (onextracallbackOnWarmupCompleted == null || (strOnExtraCallback = onextracallbackOnWarmupCompleted.onExtraCallback()) == null) {
                    String strOnExtraCallback = setheaders.onExtraCallback();
                }
                str = strOnExtraCallback;
                str2 = onextracallbackOnWarmupCompleted == null ? "Y" : "N";
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(scoreRaiseLoanNeedsActivity);
                zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fIAuthTabCallback);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | zIAuthTabCallback | zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda11
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            Unit unit2;
                            int i15 = 2 % 2;
                            int i16 = onExtraCallbackWithResult + 123;
                            onWarmupCompleted = i16 % 128;
                            if (i16 % 2 != 0) {
                                ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity2 = this.f$0;
                                float f = fIAuthTabCallback;
                                unit2 = (Unit) ScoreRaiseLoanNeedsActivity.onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -637592769, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{scoreRaiseLoanNeedsActivity2, Float.valueOf(f), str, str2}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 637592772);
                                int i17 = 10 / 0;
                            } else {
                                ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity3 = this.f$0;
                                float f2 = fIAuthTabCallback;
                                unit2 = (Unit) ScoreRaiseLoanNeedsActivity.onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -637592769, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{scoreRaiseLoanNeedsActivity3, Float.valueOf(f2), str, str2}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 637592772);
                            }
                            int i18 = onWarmupCompleted + 51;
                            onExtraCallbackWithResult = i18 % 128;
                            if (i18 % 2 == 0) {
                                int i19 = 53 / 0;
                            }
                            return unit2;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                ImageLoaderBuilderExternalSyntheticLambda3.onNavigationEvent(null, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                isFistLaunch isfistlaunchWriteTypedList2 = scoreRaiseLoanNeedsActivity.writeTypedList();
                i2 = isfistlaunchWriteTypedList2 != null ? -1 : onNavigationEvent.IAuthTabCallback[isfistlaunchWriteTypedList2.ordinal()];
                if (i2 == -1) {
                    if (i2 == 1) {
                        string3 = scoreRaiseLoanNeedsActivity.getString(im.toss.feature.credit.ui.main.R.string.credit_score_raised_loan_needs_lowest_interest_title);
                    } else if (i2 == 2) {
                        string3 = scoreRaiseLoanNeedsActivity.getString(im.toss.feature.credit.ui.main.R.string.credit_score_raise_loan_needs_score_max_limit_title);
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string3 = scoreRaiseLoanNeedsActivity.getString(im.toss.feature.credit.ui.main.R.string.credit_score_raise_loan_needs_max_limit_title);
                    }
                    str3 = string3;
                } else {
                    str3 = "";
                }
                Intrinsics.checkNotNull(str3);
                int[] iArr = onNavigationEvent.onWarmupCompleted;
                i3 = iArr[getgcinfo2.ordinal()];
                if (i3 == 1) {
                    int i15 = extraCallback + 87;
                    readTypedObject = i15 % 128;
                    int i16 = i15 % 2;
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = scoreRaiseLoanNeedsActivity.getString(im.toss.features.credit.ui.R.string.credit_history_detail_my_loan_max_limit);
                } else {
                    string = scoreRaiseLoanNeedsActivity.getString(im.toss.features.credit.ui.R.string.credit_history_detail_my_lowest_interest_rates);
                }
                String str5 = string;
                Intrinsics.checkNotNull(str5);
                i4 = iArr[getgcinfo2.ordinal()];
                if (i4 != 1) {
                    string2 = scoreRaiseLoanNeedsActivity.getString(im.toss.feature.credit.ui.main.R.string.credit_score_raise_loan_needs_lowest_interest_cta);
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i17 = readTypedObject + 117;
                    extraCallback = i17 % 128;
                    int i18 = i17 % 2;
                    string2 = scoreRaiseLoanNeedsActivity.getString(im.toss.feature.credit.ui.main.R.string.credit_score_raise_loan_needs_max_limit_cta);
                }
                final String str6 = string2;
                Intrinsics.checkNotNull(str6);
                int iICustomTabsServiceStub2 = scoreRaiseLoanNeedsActivity.ICustomTabsServiceStub();
                if (scoreRaiseLoanNeedsActivity.writeTypedList() != isFistLaunch.COOLTIME) {
                    int i19 = extraCallback + 51;
                    readTypedObject = i19 % 128;
                    int i20 = i19 % 2;
                    onextracallbackwithresult = mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft;
                } else {
                    onextracallbackwithresult = mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.Center;
                }
                mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(scoreRaiseLoanNeedsActivity);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback2) {
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda12
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke() {
                                int i21 = 2 % 2;
                                int i22 = onWarmupCompleted + 15;
                                onExtraCallback = i22 % 128;
                                if (i22 % 2 != 0) {
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                Unit unit2 = (Unit) ScoreRaiseLoanNeedsActivity.onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1016509767, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this.f$0}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1016509768);
                                int i23 = onExtraCallback + 61;
                                onWarmupCompleted = i23 % 128;
                                int i24 = i23 % 2;
                                return unit2;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                        obj2 = function0;
                    }
                    Function0 function02 = (Function0) obj2;
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(scoreRaiseLoanNeedsActivity);
                    boolean zIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fIAuthTabCallback);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnExtraCallback3 | zIAuthTabCallback2 | zOnNavigationEvent3 | zOnNavigationEvent4)) {
                        Object obj3 = objOnMinimized3;
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function0 function03 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda13
                                private static int IAuthTabCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke() throws Throwable {
                                    int i21 = 2 % 2;
                                    int i22 = onNavigationEvent + 77;
                                    IAuthTabCallback = i22 % 128;
                                    if (i22 % 2 == 0) {
                                        ScoreRaiseLoanNeedsActivity.onWarmupCompleted(this.f$0, fIAuthTabCallback, str, str2);
                                        throw null;
                                    }
                                    Unit unitOnWarmupCompleted = ScoreRaiseLoanNeedsActivity.onWarmupCompleted(this.f$0, fIAuthTabCallback, str, str2);
                                    int i23 = onNavigationEvent + 37;
                                    IAuthTabCallback = i23 % 128;
                                    int i24 = i23 % 2;
                                    return unitOnWarmupCompleted;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function03);
                            obj3 = function03;
                        }
                        Function0 function04 = (Function0) obj3;
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(scoreRaiseLoanNeedsActivity);
                        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str6);
                        boolean zIAuthTabCallback3 = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fIAuthTabCallback);
                        boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                        boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2);
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (((zOnExtraCallback4 | zOnNavigationEvent5 | zIAuthTabCallback3 | zOnNavigationEvent6) || zOnNavigationEvent7) || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            str4 = str6;
                            Function0 function05 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda14
                                private static int onExtraCallbackWithResult = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke() throws Throwable {
                                    int i21 = 2 % 2;
                                    int i22 = onNavigationEvent + 91;
                                    onExtraCallbackWithResult = i22 % 128;
                                    int i23 = i22 % 2;
                                    ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity2 = this.f$0;
                                    if (i23 == 0) {
                                        return ScoreRaiseLoanNeedsActivity.onNavigationEvent(scoreRaiseLoanNeedsActivity2, str6, fIAuthTabCallback, str, str2);
                                    }
                                    ScoreRaiseLoanNeedsActivity.onNavigationEvent(scoreRaiseLoanNeedsActivity2, str6, fIAuthTabCallback, str, str2);
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function05);
                            int i21 = extraCallback + 119;
                            readTypedObject = i21 % 128;
                            obj = function05;
                            if (i21 % 2 != 0) {
                                int i22 = 4 % 3;
                                obj = function05;
                            }
                        } else {
                            str4 = str6;
                            obj = objOnMinimized4;
                        }
                        Function0 function06 = (Function0) obj;
                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(scoreRaiseLoanNeedsActivity);
                        boolean zIAuthTabCallback4 = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fIAuthTabCallback);
                        boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                        boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2);
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnExtraCallback5 | zIAuthTabCallback4 | zOnNavigationEvent8 | zOnNavigationEvent9)) {
                            Object obj4 = objOnMinimized5;
                            if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                Function0 function07 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda15
                                    private static int onExtraCallbackWithResult = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke() {
                                        int i23 = 2 % 2;
                                        int i24 = onExtraCallbackWithResult + 17;
                                        onNavigationEvent = i24 % 128;
                                        int i25 = i24 % 2;
                                        Unit unitOnExtraCallback = ScoreRaiseLoanNeedsActivity.onExtraCallback(this.f$0, fIAuthTabCallback, str, str2);
                                        int i26 = onNavigationEvent + 107;
                                        onExtraCallbackWithResult = i26 % 128;
                                        int i27 = i26 % 2;
                                        return unitOnExtraCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function07);
                                obj4 = function07;
                            }
                            diffGcInfo.onExtraCallback(zzaq.onNavigationEvent(), -1420630163, zzaq.onNavigationEvent(), 1420630164, new Object[]{getgcinfo2, Integer.valueOf(iICustomTabsServiceStub2), setheaders, str3, str5, str4, onextracallbackwithresult2, function02, function04, function06, (Function0) obj4, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 0}, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i23 = extraCallback + 35;
                                readTypedObject = i23 % 128;
                                int i24 = i23 % 2;
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }
                }
            } else {
                Float fICustomTabsServiceDefault = scoreRaiseLoanNeedsActivity.ICustomTabsServiceDefault();
                if (fICustomTabsServiceDefault != null) {
                    onextracallback = new setHeaders.onExtraCallback(fICustomTabsServiceDefault.floatValue(), strUpdateVisuals);
                    setheaders = new setHeaders(Integer.valueOf(iICustomTabsServiceStub), fICustomTabsService_Parcel, numValidateRelationship, engagementSignalsCallback, onextracallback, true, new setHeaders.onNavigationEvent("", ""));
                    onextracallbackOnWarmupCompleted = setheaders.onWarmupCompleted();
                    fIAuthTabCallback = onextracallbackOnWarmupCompleted != null ? onextracallbackOnWarmupCompleted.IAuthTabCallback() : setheaders.IAuthTabCallback();
                    if (onextracallbackOnWarmupCompleted == null) {
                        String strOnExtraCallback2 = setheaders.onExtraCallback();
                        str = strOnExtraCallback2;
                        str2 = onextracallbackOnWarmupCompleted == null ? "Y" : "N";
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(scoreRaiseLoanNeedsActivity);
                        zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fIAuthTabCallback);
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2);
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnExtraCallback | zIAuthTabCallback | zOnNavigationEvent | zOnNavigationEvent2)) {
                            objOnMinimized = new Function0() { // from class: im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity$$ExternalSyntheticLambda11
                                private static int onExtraCallbackWithResult = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke() {
                                    Unit unit2;
                                    int i152 = 2 % 2;
                                    int i162 = onExtraCallbackWithResult + 123;
                                    onWarmupCompleted = i162 % 128;
                                    if (i162 % 2 != 0) {
                                        ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity2 = this.f$0;
                                        float f = fIAuthTabCallback;
                                        unit2 = (Unit) ScoreRaiseLoanNeedsActivity.onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -637592769, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{scoreRaiseLoanNeedsActivity2, Float.valueOf(f), str, str2}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 637592772);
                                        int i172 = 10 / 0;
                                    } else {
                                        ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity3 = this.f$0;
                                        float f2 = fIAuthTabCallback;
                                        unit2 = (Unit) ScoreRaiseLoanNeedsActivity.onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -637592769, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{scoreRaiseLoanNeedsActivity3, Float.valueOf(f2), str, str2}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 637592772);
                                    }
                                    int i182 = onWarmupCompleted + 51;
                                    onExtraCallbackWithResult = i182 % 128;
                                    if (i182 % 2 == 0) {
                                        int i192 = 53 / 0;
                                    }
                                    return unit2;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                            ImageLoaderBuilderExternalSyntheticLambda3.onNavigationEvent(null, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                            isFistLaunch isfistlaunchWriteTypedList22 = scoreRaiseLoanNeedsActivity.writeTypedList();
                            if (isfistlaunchWriteTypedList22 != null) {
                            }
                            if (i2 == -1) {
                            }
                            Intrinsics.checkNotNull(str3);
                            int[] iArr2 = onNavigationEvent.onWarmupCompleted;
                            i3 = iArr2[getgcinfo2.ordinal()];
                            if (i3 == 1) {
                            }
                            String str52 = string;
                            Intrinsics.checkNotNull(str52);
                            i4 = iArr2[getgcinfo2.ordinal()];
                            if (i4 != 1) {
                            }
                            final String str62 = string2;
                            Intrinsics.checkNotNull(str62);
                            int iICustomTabsServiceStub22 = scoreRaiseLoanNeedsActivity.ICustomTabsServiceStub();
                            if (scoreRaiseLoanNeedsActivity.writeTypedList() != isFistLaunch.COOLTIME) {
                            }
                            mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult22 = onextracallbackwithresult;
                            zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(scoreRaiseLoanNeedsActivity);
                            Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (zOnExtraCallback2) {
                            }
                        }
                    }
                } else {
                    int i25 = extraCallback + 47;
                    readTypedObject = i25 % 128;
                    int i26 = i25 % 2;
                    onextracallback = null;
                    setheaders = new setHeaders(Integer.valueOf(iICustomTabsServiceStub), fICustomTabsService_Parcel, numValidateRelationship, engagementSignalsCallback, onextracallback, true, new setHeaders.onNavigationEvent("", ""));
                    onextracallbackOnWarmupCompleted = setheaders.onWarmupCompleted();
                    fIAuthTabCallback = onextracallbackOnWarmupCompleted != null ? onextracallbackOnWarmupCompleted.IAuthTabCallback() : setheaders.IAuthTabCallback();
                    if (onextracallbackOnWarmupCompleted == null) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = getInterfaceDescriptor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 23;
                $11 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 35283), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 34, ExpandableListView.getPackedPositionChild(0L) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (Process.myPid() >> 22) + 65, Process.getGidForName("") + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        int i11 = $11 + 53;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (-16777187) - Color.rgb(0, 0, 0), 17657 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.indexOf("", "", 0, 0) + 70, 12486 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i14 = $10 + 87;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i16, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $10 + 5;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static /* synthetic */ Unit onWarmupCompleted(isFistLaunch isfistlaunch, ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity, float f, String str, String str2, SetDetectableSize setDetectableSize) {
        return (Unit) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 792698972, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{isfistlaunch, scoreRaiseLoanNeedsActivity, Float.valueOf(f), str, str2, setDetectableSize}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -792698967);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -942823212, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{scoreRaiseLoanNeedsActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 942823214);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity, float f, String str, String str2) {
        return (Unit) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -637592769, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{scoreRaiseLoanNeedsActivity, Float.valueOf(f), str, str2}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 637592772);
    }

    public static /* synthetic */ String IAuthTabCallbackDefault(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (String) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1002148864, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{scoreRaiseLoanNeedsActivity}, iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1002148860);
    }

    public static /* synthetic */ Unit asInterface(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1016509767, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{scoreRaiseLoanNeedsActivity}, iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1016509768);
    }

    private static final float getInterfaceDescriptor(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return ((Float) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -814049889, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{scoreRaiseLoanNeedsActivity}, iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 814049889)).floatValue();
    }

    private static final Unit onExtraCallback(isFistLaunch isfistlaunch, String str, float f, String str2, String str3, SetDetectableSize setDetectableSize) {
        return (Unit) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1945849725, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{isfistlaunch, str, Float.valueOf(f), str2, str3, setDetectableSize}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1945849731);
    }

    private static final Unit IAuthTabCallbackStub(ScoreRaiseLoanNeedsActivity scoreRaiseLoanNeedsActivity, float f, String str, String str2) {
        return (Unit) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -438189704, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{scoreRaiseLoanNeedsActivity, Float.valueOf(f), str, str2}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 438189711);
    }

    @Override // im.toss.feature.credit.ui.main.home.loan_needs.Hilt_ScoreRaiseLoanNeedsActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallback + 91;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = extraCallback + 115;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.main.home.loan_needs.Hilt_ScoreRaiseLoanNeedsActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = extraCallback + 65;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = extraCallback + 15;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.main.home.loan_needs.Hilt_ScoreRaiseLoanNeedsActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = extraCallback + 123;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.main.home.loan_needs.Hilt_ScoreRaiseLoanNeedsActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 107;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
    }

    static void IAuthTabCallback() {
        getInterfaceDescriptor = new char[]{27252, 27192, 27194, 27172, 27255, 27173, 27173, 27196, 27173, 27179, 27179, 27173, 27252, 27199, 27168, 27176, 27175, 27168, 27168, 27198, 27174, 27181, 27173, 27194, 27350, 27516, 27518, 27494, 27495, 27519, 27489, 27489, 27519, 27482, 27324, 27299, 27461, 27493, 27496, 27499, 27458, 27465, 27497, 27490, 27490, 27496, 27497, 27493, 27490, 27489, 27490, 27458, 27456, 27495, 27495, 27519, 27493, 27492, 27519, 27457, 27459, 27489, 27495, 27465, 27456, 27495, 27494, 27495, 27501, 27497, 27482, 27480, 27495, 27501, 27501, 27495, 27518, 27495, 27495, 27483, 27260, 27173, 27196, 27173, 27179, 27179, 27173, 27158, 27158, 27173, 27175, 27173, 27179, 27176, 27177, 27173, 27168, 27176, 27143, 27136, 27168, 27199, 27168, 27171, 27175, 27174, 27168, 27168, 27175, 27142, 27139, 27177, 27174, 27171, 27139, 27167, 27168, 27168, 27192, 27196, 27176, 27177, 27177, 27142, 27140, 27173, 27198, 27175, 27173, 27167, 27167, 27168, 27176, 27178, 27173, 27172, 27143, 27167, 27199, 27175, 27175, 27175, 27176, 27178, 27177, 27177, 27177, 27139, 27139, 27177, 27174, 27171, 27139, 27233, 27258, 27160, 27197, 27199, 27199, 27170, 27178, 27176, 27169, 27194, 27173, 27170, 27170, 27176, 27179, 27170, 27199, 27176, 27180, 27171, 27196, 27198, 27199, 27168, 27173, 27178, 27175, 27168, 27176, 27178, 27173, 27172, 27166, 27161};
    }
}
