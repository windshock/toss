package im.toss.feature.credit.ui.kcbsurvey.result;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.feature.credit.ui.kcbsurvey.R;
import im.toss.feature.credit.ui.kcbsurvey.result.KcbSurveyResultScoreRaisedActivity$;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography5;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.ForwardingCameraControl;
import o.QuirksExternalSyntheticBackport0;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.findResAndMsg;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getUserData;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.ipcMsgClientProcessOpt;
import o.isStopUpload;
import o.logVerbose;
import o.readIntokhttp;
import o.readTimeout;
import o.response;
import o.setAdVideoPlaybackListener;
import o.setRubIn;
import o.uploadRvInitLog;
import o.zzck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class KcbSurveyResultScoreRaisedActivity extends Hilt_KcbSurveyResultScoreRaisedActivity implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static long access000 = 0;
    private static int access100 = 0;
    public static final int asBinder;
    private static int getInterfaceDescriptor = 1;
    private static int readTypedObject = 1;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy IAuthTabCallback_Parcel = isStopUpload.onNavigationEvent(this, 1484965, (Function1) null, new KcbSurveyResultScoreRaisedActivity$.ExternalSyntheticLambda7(this), 2, (Object) null);
    private final Lazy IAuthTabCallbackDefault = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallback(this));
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new KcbSurveyResultScoreRaisedActivity$.ExternalSyntheticLambda8(this));
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new KcbSurveyResultScoreRaisedActivity$.ExternalSyntheticLambda9(this));
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new KcbSurveyResultScoreRaisedActivity$.ExternalSyntheticLambda10(this));

    static {
        IEngagementSignalsCallbackStub();
        Companion = new onWarmupCompleted(null);
        asBinder = 8;
        int i = readTypedObject + 57;
        access100 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ long IAuthTabCallback(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        long jAsInterface = asInterface(kcbSurveyResultScoreRaisedActivity);
        int i4 = IAuthTabCallbackStubProxy + 5;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return jAsInterface;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity = (KcbSurveyResultScoreRaisedActivity) objArr[0];
        initMiniApp.onWarmupCompleted onwarmupcompleted = (initMiniApp.onWarmupCompleted) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(kcbSurveyResultScoreRaisedActivity, onwarmupcompleted);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        int i5 = getInterfaceDescriptor + 105;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ String onExtraCallback(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackStub = IAuthTabCallbackStub(kcbSurveyResultScoreRaisedActivity);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return strIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity, View view) {
        Unit unit;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            unit = (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{kcbSurveyResultScoreRaisedActivity, view}, -1932555365, iOnNavigationEvent2, iOnNavigationEvent, 1932555365);
            int i3 = 79 / 0;
        } else {
            int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            int iOnNavigationEvent4 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            unit = (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{kcbSurveyResultScoreRaisedActivity, view}, -1932555365, iOnNavigationEvent4, iOnNavigationEvent3, 1932555365);
        }
        int i4 = IAuthTabCallbackStubProxy + 3;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        SessionTrackerb sessionTrackerb;
        String strIntern;
        boolean z;
        Function1 function1;
        Bundle bundle;
        boolean z2;
        int i7;
        int i8 = ~i3;
        int i9 = ~i6;
        int i10 = (~(i9 | i5)) | i8;
        int i11 = ~i5;
        int i12 = ~(i9 | i11 | i3);
        int i13 = (~(i5 | i8)) | i9 | (~(i11 | i3));
        int i14 = i3 + i6 + i4 + (325770565 * i) + ((-1284996642) * i2);
        int i15 = i14 * i14;
        int i16 = ((789042555 * i3) - 1205338112) + ((-1364710777) * i6) + (i10 * 1076876666) + (1076876666 * i12) + ((-1076876666) * i13) + ((-287834112) * i4) + ((-667418624) * i) + ((-145752064) * i2) + (1116340224 * i15);
        int i17 = (i3 * (-1991011123)) + 595473426 + (i6 * (-1991009311)) + (i10 * (-906)) + (i12 * (-906)) + (i13 * 906) + (i4 * (-1991010217)) + (i * (-1223611789)) + (i2 * (-291900814)) + (i15 * (-1931083776));
        int i18 = i16 + (i17 * i17 * (-1558839296));
        if (i18 == 1) {
            return onExtraCallback(objArr);
        }
        if (i18 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i18 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i18 != 4) {
            return onWarmupCompleted(objArr);
        }
        SetDetectingInterval setDetectingInterval = (KcbSurveyResultScoreRaisedActivity) objArr[0];
        View view = (View) objArr[1];
        int i19 = 2 % 2;
        int i20 = getInterfaceDescriptor + 65;
        IAuthTabCallbackStubProxy = i20 % 128;
        if (i20 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            sessionTrackerb = (SessionTrackerb) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{setDetectingInterval}, -552749750, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, 552749751);
            Object[] objArr2 = new Object[1];
            a(new char[]{36426, 25055, 20847, 16613, 12295, 9106, 4900, 847, 62162, 57896, 54696, 50503, 46257, 42017, 37970, 34762, 30502, 26265, 22016, 18877, 14645, 10583, 6377, 2149, 64386, 60173, 55993, 51847, 47711, 44539, 40293, 35985, 31787, 28600, 24538, 20306, 16040, 11877, 409, 61753, 57509, 53467, 49235, 46039, 41750, 37517, 33329, 30107, 26074, 21871, 17661, 13318, 10112, 5935, 1892, 63198, 58996, 55793, 51458, 47284, 43065}, 61331 - (KeyEvent.getMaxKeyCode() + 3), objArr2);
            strIntern = ((String) objArr2[0]).intern();
            z = false;
            function1 = null;
            bundle = null;
            z2 = true;
            i7 = 56;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            sessionTrackerb = (SessionTrackerb) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{setDetectingInterval}, -552749750, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, 552749751);
            Object[] objArr3 = new Object[1];
            a(new char[]{36426, 25055, 20847, 16613, 12295, 9106, 4900, 847, 62162, 57896, 54696, 50503, 46257, 42017, 37970, 34762, 30502, 26265, 22016, 18877, 14645, 10583, 6377, 2149, 64386, 60173, 55993, 51847, 47711, 44539, 40293, 35985, 31787, 28600, 24538, 20306, 16040, 11877, 409, 61753, 57509, 53467, 49235, 46039, 41750, 37517, 33329, 30107, 26074, 21871, 17661, 13318, 10112, 5935, 1892, 63198, 58996, 55793, 51458, 47284, 43065}, (KeyEvent.getMaxKeyCode() >> 16) + 61331, objArr3);
            strIntern = ((String) objArr3[0]).intern();
            z = false;
            function1 = null;
            bundle = null;
            z2 = false;
            i7 = 60;
        }
        SessionTrackerb.IAuthTabCallback(sessionTrackerb, setDetectingInterval, strIntern, z, function1, bundle, z2, i7, (Object) null);
        setDetectingInterval.finish();
        Unit unit = Unit.INSTANCE;
        int i21 = IAuthTabCallbackStubProxy + 81;
        getInterfaceDescriptor = i21 % 128;
        int i22 = i21 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {kcbSurveyResultScoreRaisedActivity};
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent4 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(iOnNavigationEvent3, iOnNavigationEvent4, objArr, -1154787381, iOnNavigationEvent2, iOnNavigationEvent, 1154787383);
        int i4 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{kcbSurveyResultScoreRaisedActivity, view}, 678152824, iOnNavigationEvent2, iOnNavigationEvent, -678152820);
        int i4 = IAuthTabCallbackStubProxy + 73;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ long onNavigationEvent(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        long jOnWarmupCompleted = onWarmupCompleted(kcbSurveyResultScoreRaisedActivity);
        int i4 = getInterfaceDescriptor + 123;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return jOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackDefault(kcbSurveyResultScoreRaisedActivity, view);
        }
        IAuthTabCallbackDefault(kcbSurveyResultScoreRaisedActivity, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 115;
        getInterfaceDescriptor = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            IAuthTabCallback(kcbSurveyResultScoreRaisedActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(kcbSurveyResultScoreRaisedActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStubProxy + 109;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(kcbSurveyResultScoreRaisedActivity, view);
        int i4 = IAuthTabCallbackStubProxy + 5;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(uploadRvInitLog uploadrvinitlog, KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(uploadrvinitlog, kcbSurveyResultScoreRaisedActivity);
        }
        onExtraCallbackWithResult(uploadrvinitlog, kcbSurveyResultScoreRaisedActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback implements Function0<uploadRvInitLog> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public onExtraCallback(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5IAuthTabCallback = IAuthTabCallback();
            int i4 = IAuthTabCallback + 109;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 81 / 0;
            }
            return searchBarKtExternalSyntheticLambda5IAuthTabCallback;
        }

        public final uploadRvInitLog IAuthTabCallback() {
            uploadRvInitLog uploadrvinitlogIAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
                uploadrvinitlogIAuthTabCallback = uploadRvInitLog.IAuthTabCallback(layoutInflater);
                int i3 = 51 / 0;
            } else {
                LayoutInflater layoutInflater2 = this.onExtraCallbackWithResult.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater2, "");
                uploadrvinitlogIAuthTabCallback = uploadRvInitLog.IAuthTabCallback(layoutInflater2);
            }
            int i4 = onWarmupCompleted + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return uploadrvinitlogIAuthTabCallback;
        }
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i3 = getInterfaceDescriptor + 123;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
            throw null;
        }
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i3 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        int i4 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.openJavaCrashMonitor*/.access200();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i3 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return jAccess200;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = IAuthTabCallbackStubProxy + 15;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return viewAq_;
        }
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i4 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return findresandmsgAs_;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = getInterfaceDescriptor + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return screenId;
    }

    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return super.getScreenParams();
        }
        super.getScreenParams();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = IAuthTabCallbackStubProxy + 117;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 123;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = IAuthTabCallbackStubProxy + 29;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsServiceDefault();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i3 = IAuthTabCallbackStubProxy + 81;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
        int i4 = getInterfaceDescriptor + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return hascrashwhenjavacrashICustomTabsServiceStub;
        }
        throw null;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        int i4 = IAuthTabCallbackStubProxy + 59;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity = (KcbSurveyResultScoreRaisedActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 3;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = kcbSurveyResultScoreRaisedActivity.tossRouter;
        Object obj = null;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = IAuthTabCallbackStubProxy + 91;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        int i7 = i2 + 125;
        IAuthTabCallbackStubProxy = i7 % 128;
        if (i7 % 2 == 0) {
            return sessionTrackerb;
        }
        obj.hashCode();
        throw null;
    }

    public hasCrashWhenJavaCrash ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.IAuthTabCallback_Parcel.getValue();
        int i3 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return hascrashwhenjavacrash;
    }

    private static final Unit onExtraCallback(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object[] objArr = new Object[1];
        a(new char[]{36427, 14771, 57729, 43409, 20983, 6624, 49606, 35266}, (ViewConfiguration.getTouchSlop() >> 8) + 47087, objArr);
        onwarmupcompleted.onExtraCallback(((String) objArr[0]).intern(), kcbSurveyResultScoreRaisedActivity.IPostMessageServiceDefault());
        onwarmupcompleted.onExtraCallbackWithResult("raised_score", Long.valueOf(kcbSurveyResultScoreRaisedActivity.onSessionEnded()));
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final uploadRvInitLog onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallbackDefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        uploadRvInitLog uploadrvinitlog = (uploadRvInitLog) value;
        int i4 = IAuthTabCallbackStubProxy + 33;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return uploadrvinitlog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IAuthTabCallbackStub(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(kcbSurveyResultScoreRaisedActivity.getIntent());
        int i4 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return strOnNavigationEvent;
    }

    private final String IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = (String) this.IAuthTabCallbackStub.getValue();
        int i3 = IAuthTabCallbackStubProxy + 31;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final long asInterface(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity) {
        int i = 2 % 2;
        Intent intent = kcbSurveyResultScoreRaisedActivity.getIntent();
        long longExtra = -1;
        if (intent != null) {
            longExtra = intent.getLongExtra("raisedScore", -1L);
            int i2 = getInterfaceDescriptor + 53;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = getInterfaceDescriptor + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return longExtra;
    }

    private final long onSessionEnded() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = ((Number) this.onTransact.getValue()).longValue();
        int i4 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return jLongValue;
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    private final long IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) this.asInterface.getValue();
        if (i3 == 0) {
            return number.longValue();
        }
        int i4 = 20 / 0;
        return number.longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final long onWarmupCompleted(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = kcbSurveyResultScoreRaisedActivity.getIntent();
        long longExtra = intent != null ? intent.getLongExtra("finalScore", -1L) : -1L;
        int i4 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return longExtra;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 27;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 2;
        }
        while (true) {
            j = 0;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24, 19628 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (access000 ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 58 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 125;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 59 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ExpandableListView.getPackedPositionChild(j) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            j = 0;
        }
        String str = new String(cArr2);
        int i8 = $11 + 89;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (IEngagementSignalsCallbackDefault() != (-1)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        IEngagementSignalsCallback_Parcel();
        r6 = im.toss.feature.credit.ui.kcbsurvey.result.KcbSurveyResultScoreRaisedActivity.IAuthTabCallbackStubProxy + 63;
        im.toss.feature.credit.ui.kcbsurvey.result.KcbSurveyResultScoreRaisedActivity.getInterfaceDescriptor = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if ((r6 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r6 = 88 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (IEngagementSignalsCallbackDefault() != (-1)) goto L13;
     */
    @Override // im.toss.feature.credit.ui.kcbsurvey.result.Hilt_KcbSurveyResultScoreRaisedActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            setContentView(onVerticalScrollEvent().onNavigationEvent());
            if (onSessionEnded() != -1) {
                int i3 = getInterfaceDescriptor + 101;
                IAuthTabCallbackStubProxy = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 44 / 0;
                }
            }
            finish();
            return;
        }
        super.onCreate(bundle);
        setContentView(onVerticalScrollEvent().onNavigationEvent());
        onSessionEnded();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback_Parcel() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onVerticalScrollEvent().onExtraCallbackWithResult.setVisibility(0);
        onVerticalScrollEvent().onExtraCallback.setVisibility(4);
        int i4 = IAuthTabCallback.onWarmupCompleted[onNavigationEvent.Companion.onWarmupCompleted(onSessionEnded()).ordinal()];
        if (i4 != 1) {
            int i5 = IAuthTabCallbackStubProxy + 39;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0 ? i4 != 2 : i4 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            uploadRvInitLog uploadrvinitlogOnVerticalScrollEvent = onVerticalScrollEvent();
            uploadrvinitlogOnVerticalScrollEvent.onExtraCallbackWithResult.setVisibility(8);
            uploadrvinitlogOnVerticalScrollEvent.onTransact.extraCallbackWithResult();
            uploadrvinitlogOnVerticalScrollEvent.onTransact.setSubTypography(5);
            uploadrvinitlogOnVerticalScrollEvent.onTransact.setFont(response.Bold);
            AnimateText animateText = uploadrvinitlogOnVerticalScrollEvent.onTransact;
            Intrinsics.checkNotNullExpressionValue(animateText, "");
            List listListOf = CollectionsKt.listOf(new String[]{getString(R.string.credit_kcb_survey_result_not_raised_title), getString(R.string.credit_kcb_survey_result_not_raised_title2)});
            readTimeout.asInterface.onNavigationEvent onnavigationevent = readTimeout.asInterface.onNavigationEvent.onWarmupCompleted;
            AnimateText.onNavigationEvent onnavigationevent2 = AnimateText.onNavigationEvent.CENTER;
            Object[] objArr = new Object[1];
            a(new char[]{36360}, ExpandableListView.getPackedPositionChild(0L) + 20220, objArr);
            AnimateText.onWarmupCompleted(animateText, listListOf, onnavigationevent, 0, 0, ((String) objArr[0]).intern(), onnavigationevent2, false, (Function0) null, (Function0) null, new KcbSurveyResultScoreRaisedActivity$.ExternalSyntheticLambda6(uploadrvinitlogOnVerticalScrollEvent, this), 0, (Integer) null, 3532, (Object) null);
            return;
        }
        uploadRvInitLog uploadrvinitlogOnVerticalScrollEvent2 = onVerticalScrollEvent();
        LottieAnimationView lottieAnimationView = uploadrvinitlogOnVerticalScrollEvent2.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{36433, 60006, 17947, 41672, 7910, 31444, 55060, 13115, 44818, 3022, 26614, 50068, 15444, 39029, 62541, 20680, 52454, 10385, 34124, 57638, 23820, 47571, 5540, 29064, 59998, 18046, 41491, 7897, 31464, 54933, 13084, 44911, 2870, 26588, 50153, 16317, 38977, 62586, 20530, 52379, 10466, 33973, 57689, 23910, 47416, 5570, 29175, 60853, 17924, 41575, 7719, 31448, 55017, 12977, 44879, 2913, 26495, 50112, 16372, 39871, 62531}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25642, objArr2);
        zzck.onWarmupCompleted(-59676451, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 59676451, new Object[]{lottieAnimationView, ((String) objArr2[0]).intern(), false, 0L, null, null, null, 62, null}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        uploadrvinitlogOnVerticalScrollEvent2.IAuthTabCallbackDefault.playAnimation();
        TdsImageView tdsImageView = uploadrvinitlogOnVerticalScrollEvent2.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Object[] objArr3 = new Object[1];
        a(new char[]{36433, 6352, 41847, 19870, 54334, 32530, 2488, 36957, 15010, 50632, 27770, 63218, 33036, 11171, 45697, 23934, 59270, 36391, 6464, 41904, 18964, 54453, 32616, 1553, 37093, 15171, 50604, 27863, 63328, 33175, 10298, 45847, 24058, 58475, 36490, 6432, 40960, 19177, 54535, 32700, 1750, 37170, 15243, 49672, 27810}, 38557 - TextUtils.getTrimmedLength(""), objArr3);
        TdsImageView.setImage$default(tdsImageView, ((String) objArr3[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        uploadrvinitlogOnVerticalScrollEvent2.onWarmupCompleted.extraCallbackWithResult();
        uploadrvinitlogOnVerticalScrollEvent2.onWarmupCompleted.setSubTypography(5);
        uploadrvinitlogOnVerticalScrollEvent2.onWarmupCompleted.setFont(response.Bold);
        AnimateText animateText2 = uploadrvinitlogOnVerticalScrollEvent2.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(animateText2, "");
        List listListOf2 = CollectionsKt.listOf(new String[]{getString(R.string.credit_kcb_survey_result_raised_confetti), getString(R.string.credit_kcb_survey_result_raised_title, Long.valueOf(onSessionEnded()))});
        readTimeout.asInterface.onNavigationEvent onnavigationevent3 = readTimeout.asInterface.onNavigationEvent.onWarmupCompleted;
        AnimateText.onNavigationEvent onnavigationevent4 = AnimateText.onNavigationEvent.CENTER;
        Object[] objArr4 = new Object[1];
        a(new char[]{36360}, View.MeasureSpec.getSize(0) + 20219, objArr4);
        AnimateText.onWarmupCompleted(animateText2, listListOf2, onnavigationevent3, 0, 0, ((String) objArr4[0]).intern(), onnavigationevent4, false, (Function0) null, (Function0) null, new KcbSurveyResultScoreRaisedActivity$.ExternalSyntheticLambda5(this), 0, (Integer) null, 3532, (Object) null);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Unit unit;
        KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity = (KcbSurveyResultScoreRaisedActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            kcbSurveyResultScoreRaisedActivity.IPostMessageService();
            unit = Unit.INSTANCE;
            int i3 = 73 / 0;
        } else {
            kcbSurveyResultScoreRaisedActivity.IPostMessageService();
            unit = Unit.INSTANCE;
        }
        int i4 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        SessionTrackerb.IAuthTabCallback((SessionTrackerb) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{kcbSurveyResultScoreRaisedActivity}, -552749750, iOnNavigationEvent2, iOnNavigationEvent, 552749751), kcbSurveyResultScoreRaisedActivity, h5ScreenShotObserverOnChangeOpt.ICustomTabsCallbackDefault.IAuthTabCallback(h5ScreenShotObserverOnChangeOpt.ICustomTabsCallbackDefault.IAuthTabCallback, "credit_kcb_survey_result", false, 2, (Object) null), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        kcbSurveyResultScoreRaisedActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            kcbSurveyResultScoreRaisedActivity.finish();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        kcbSurveyResultScoreRaisedActivity.finish();
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 5;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(uploadRvInitLog uploadrvinitlog, KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity) throws Throwable {
        int i = 2 % 2;
        uploadrvinitlog.onExtraCallback.setVisibility(0);
        TdsImageView tdsImageView = uploadrvinitlog.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Object[] objArr = new Object[1];
        a(new char[]{36433, 6352, 41847, 19870, 54334, 32530, 2488, 36957, 15010, 50632, 27770, 63218, 33036, 11171, 45697, 23934, 59270, 36391, 6464, 41904, 18964, 54453, 32616, 1553, 37093, 15171, 50604, 27863, 63328, 33175, 10298, 45847, 24058, 58475, 36490, 6432, 40960, 19177, 54535, 32700, 1750, 37170, 15243, 49672, 27810}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38557, objArr);
        TdsImageView.setImage$default(tdsImageView, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        TdsBottomCtaV1View tdsBottomCtaV1View = uploadrvinitlog.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        String string = kcbSurveyResultScoreRaisedActivity.getString(R.string.credit_kcb_survey_result_not_raised_cta);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new KcbSurveyResultScoreRaisedActivity$.ExternalSyntheticLambda3(kcbSurveyResultScoreRaisedActivity), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        uploadrvinitlog.IAuthTabCallback.setBottomButtonType(TdsTextButtonV0View.IAuthTabCallback.PRIMARY);
        uploadrvinitlog.IAuthTabCallback.setBottomButton(viva.republica.toss.R.string.close, new KcbSurveyResultScoreRaisedActivity$.ExternalSyntheticLambda4(kcbSurveyResultScoreRaisedActivity));
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        return unit;
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] onExtraCallback = {-350460071, 1698724576, 381433196, -646395604, -1578574048, -1176564079, 2042087971, -537270685, -1322816900, -259652889, 478926530, 1789443087, -1501376273, 1552460296, 1279082310, -707530570, -167319164, 89311212};
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onExtraCallback;
            int i3 = -1469660336;
            int i4 = 0;
            if (iArr2 != null) {
                int i5 = $11 + 11;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Gravity.getAbsoluteGravity(0, 0) + 72, TextUtils.getCapsMode("", 0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i7++;
                        i3 = -1469660336;
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
            int[] iArr5 = onExtraCallback;
            if (iArr5 != null) {
                int i8 = $10 + 87;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i4] = Integer.valueOf(iArr5[i10]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 72, 8848 - KeyEvent.getDeadChar(i4, i4), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i10++;
                    i4 = 0;
                }
                iArr5 = iArr6;
            }
            int i11 = i4;
            System.arraycopy(iArr5, i11, iArr4, i11, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i11;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i11] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i12 = 0;
                for (int i13 = 16; i12 < i13; i13 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16754964) - Color.rgb(0, 0, 0)), 39 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i12++;
                        int i14 = $10 + 39;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 4033), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 79, Color.blue(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i11 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private onWarmupCompleted() {
        }

        public final Intent onWarmupCompleted(@NotNull Context context, @NotNull String str, long j, long j2) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) KcbSurveyResultScoreRaisedActivity.class);
            Object[] objArr = new Object[1];
            a(new int[]{-1256368653, 1919828142, 312100771, 1845809504}, 8 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str).putExtra("raisedScore", j).putExtra("finalScore", j2);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = onWarmupCompleted + 27;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return intentPutExtra;
            }
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 37;
        getInterfaceDescriptor = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 2) != 5, i & 1)) {
            int i4 = IAuthTabCallbackStubProxy + 69;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = getInterfaceDescriptor + 75;
                IAuthTabCallbackStubProxy = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2120574642, i, -1, "im.toss.feature.credit.ui.kcbsurvey.result.KcbSurveyResultScoreRaisedActivity.showRaisedCardView.<anonymous>.<anonymous> (KcbSurveyResultScoreRaisedActivity.kt:152)");
                    int i7 = 98 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2120574642, i, -1, "im.toss.feature.credit.ui.kcbsurvey.result.KcbSurveyResultScoreRaisedActivity.showRaisedCardView.<anonymous>.<anonymous> (KcbSurveyResultScoreRaisedActivity.kt:152)");
                }
            }
            ipcMsgClientProcessOpt.onNavigationEvent((QuirksExternalSyntheticBackport0) null, kcbSurveyResultScoreRaisedActivity.onSessionEnded(), kcbSurveyResultScoreRaisedActivity.IEngagementSignalsCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageService() {
        int i = 2 % 2;
        uploadRvInitLog uploadrvinitlogOnVerticalScrollEvent = onVerticalScrollEvent();
        uploadrvinitlogOnVerticalScrollEvent.onExtraCallbackWithResult.setVisibility(4);
        uploadrvinitlogOnVerticalScrollEvent.onExtraCallback.setVisibility(0);
        uploadrvinitlogOnVerticalScrollEvent.access000.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(2120574642, true, new KcbSurveyResultScoreRaisedActivity$.ExternalSyntheticLambda0(this))));
        SubTypography5 subTypography5 = uploadrvinitlogOnVerticalScrollEvent.access100;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(R.string.credit_kcb_survey_result_raised2_title));
        Configuration configuration = getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).asBinder());
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.credit_kcb_survey_result_raised2_title2));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) getString(R.string.credit_kcb_survey_result_raised2_title3));
        subTypography5.setText(new SpannedString(spannableStringBuilder));
        uploadrvinitlogOnVerticalScrollEvent.IAuthTabCallbackStubProxy.setText(getString(R.string.credit_kcb_survey_result_raised_subtitle));
        TdsBottomCtaV1View tdsBottomCtaV1View = uploadrvinitlogOnVerticalScrollEvent.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        String string = getString(R.string.credit_kcb_survey_result_raised_cta);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new KcbSurveyResultScoreRaisedActivity$.ExternalSyntheticLambda1(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        uploadrvinitlogOnVerticalScrollEvent.IAuthTabCallback.setBottomButtonType(TdsTextButtonV0View.IAuthTabCallback.PRIMARY);
        uploadrvinitlogOnVerticalScrollEvent.IAuthTabCallback.setBottomButton(viva.republica.toss.R.string.close, new KcbSurveyResultScoreRaisedActivity$.ExternalSyntheticLambda2(this));
        int i2 = IAuthTabCallbackStubProxy + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Unit unit;
        KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity = (KcbSurveyResultScoreRaisedActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            kcbSurveyResultScoreRaisedActivity.finish();
            unit = Unit.INSTANCE;
            int i3 = 29 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            kcbSurveyResultScoreRaisedActivity.finish();
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStubProxy + 1;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{kcbSurveyResultScoreRaisedActivity, onwarmupcompleted}, 1414170623, iOnNavigationEvent2, iOnNavigationEvent, -1414170620);
    }

    private static final Unit onTransact(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{kcbSurveyResultScoreRaisedActivity}, -1154787381, iOnNavigationEvent2, iOnNavigationEvent, 1154787383);
    }

    private static final Unit onTransact(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity, View view) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{kcbSurveyResultScoreRaisedActivity, view}, 678152824, iOnNavigationEvent2, iOnNavigationEvent, -678152820);
    }

    private static final Unit IAuthTabCallbackStub(KcbSurveyResultScoreRaisedActivity kcbSurveyResultScoreRaisedActivity, View view) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{kcbSurveyResultScoreRaisedActivity, view}, -1932555365, iOnNavigationEvent2, iOnNavigationEvent, 1932555365);
    }

    public final SessionTrackerb ICustomTabsService_Parcel() {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (SessionTrackerb) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, -552749750, iOnNavigationEvent2, iOnNavigationEvent, 552749751);
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.result.Hilt_KcbSurveyResultScoreRaisedActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.result.Hilt_KcbSurveyResultScoreRaisedActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 21;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.result.Hilt_KcbSurveyResultScoreRaisedActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 125;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.result.Hilt_KcbSurveyResultScoreRaisedActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = getInterfaceDescriptor + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IEngagementSignalsCallbackStub() {
        access000 = 5293380061826190094L;
    }
}
