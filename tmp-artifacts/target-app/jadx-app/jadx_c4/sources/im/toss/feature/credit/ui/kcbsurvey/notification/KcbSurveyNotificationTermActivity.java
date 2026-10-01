package im.toss.feature.credit.ui.kcbsurvey.notification;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.TossApplication;
import im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinAdImpl;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.access8100;
import o.findResAndMsg;
import o.getDummyAd;
import o.getOriginalFullResponse;
import o.getUserData;
import o.getWrite;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logVerbose;
import o.maybeUpdateAnimatable;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0;
import o.setHasShown;
import o.setRandomHost;
import o.setRubIn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class KcbSurveyNotificationTermActivity extends Hilt_KcbSurveyNotificationTermActivity implements SetDetectingInterval {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int IAuthTabCallbackDefault = 8;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000;
    private static int getInterfaceDescriptor;

    @Inject
    public getDummyAd termsIntent;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy IAuthTabCallbackStub = isStopUpload.onNavigationEvent(this, -1, (Function1) null, (Function1) null, 6, (Object) null);
    private final Lazy access100 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermActivity$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnWarmupCompleted = KcbSurveyNotificationTermActivity.onWarmupCompleted(this.f$0);
            if (i3 == 0) {
                int i4 = 86 / 0;
            }
            return strOnWarmupCompleted;
        }
    });
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermActivity$$ExternalSyntheticLambda1
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Boolean.valueOf(KcbSurveyNotificationTermActivity.onNavigationEvent(this.f$0));
                throw null;
            }
            Boolean boolValueOf = Boolean.valueOf(KcbSurveyNotificationTermActivity.onNavigationEvent(this.f$0));
            int i3 = onExtraCallback + 5;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return boolValueOf;
        }
    });
    private final SessionTrackera onTransact = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermActivity$$ExternalSyntheticLambda2
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            Unit unit = (Unit) KcbSurveyNotificationTermActivity.onNavigationEvent(new Object[]{this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj}, TossApplication.onSessionEnded.onExtraCallback(), -1300889224, 1300889225, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback());
            int i3 = onNavigationEvent + 63;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    });
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermActivity$$ExternalSyntheticLambda3
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = KcbSurveyNotificationTermActivity.onExtraCallbackWithResult(this.f$0);
            int i4 = IAuthTabCallback + 47;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return strOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });

    static {
        int i = access000 + 9;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strAsInterface = asInterface(kcbSurveyNotificationTermActivity);
        int i4 = IAuthTabCallbackStubProxy + 73;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return strAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~((~i) | i8);
        int i10 = i | i8;
        int i11 = i2 + i3 + i5 + ((-189913888) * i6) + ((-1809372279) * i4);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i2) - 1671495680) + (10634006 * i3) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i5) + (952107008 * i6) + (1092222976 * i4) + ((-70844416) * i12);
        int i14 = (i2 * 986545540) + 223666697 + (i3 * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i5 * 986544659) + (i6 * 1843362976) + (i4 * (-1872984789)) + (i12 * (-2050686976));
        int i15 = i13 + (i14 * i14 * 1179713536);
        if (i15 != 1) {
            return i15 != 2 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
        }
        KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity = (KcbSurveyNotificationTermActivity) objArr[0];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1];
        int i16 = 2 % 2;
        int i17 = IAuthTabCallbackStubProxy + 33;
        getInterfaceDescriptor = i17 % 128;
        int i18 = i17 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(kcbSurveyNotificationTermActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i19 = IAuthTabCallbackStubProxy + 3;
        getInterfaceDescriptor = i19 % 128;
        int i20 = i19 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ boolean onNavigationEvent(KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub(kcbSurveyNotificationTermActivity);
        }
        IAuthTabCallbackStub(kcbSurveyNotificationTermActivity);
        throw null;
    }

    public static /* synthetic */ String onWarmupCompleted(KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackDefault = IAuthTabCallbackDefault(kcbSurveyNotificationTermActivity);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return strIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity = (KcbSurveyNotificationTermActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        SessionTrackera sessionTrackera = kcbSurveyNotificationTermActivity.onTransact;
        int i5 = i3 + 85;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return sessionTrackera;
        }
        throw null;
    }

    public static final /* synthetic */ String IAuthTabCallback(KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return kcbSurveyNotificationTermActivity.onSessionEnded();
        }
        kcbSurveyNotificationTermActivity.onSessionEnded();
        throw null;
    }

    public static final /* synthetic */ String onTransact(KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strOnVerticalScrollEvent = kcbSurveyNotificationTermActivity.onVerticalScrollEvent();
        int i4 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnVerticalScrollEvent;
        }
        throw null;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i4 = getInterfaceDescriptor + 47;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i4 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        int i4 = IAuthTabCallbackStubProxy + 119;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = getInterfaceDescriptor + 93;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return jAccess200;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return viewAq_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return findresandmsgAs_;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = getInterfaceDescriptor + 75;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return screenId;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return screenParams;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        int i5 = getInterfaceDescriptor + 87;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = IAuthTabCallbackStubProxy + 105;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i4 = IAuthTabCallbackStubProxy + 113;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        throw null;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ICustomTabsServiceStub();
            throw null;
        }
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
        int i3 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return hascrashwhenjavacrashICustomTabsServiceStub;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 == 0) {
            throw null;
        }
    }

    public hasCrashWhenJavaCrash ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.IAuthTabCallbackStub.getValue();
        int i3 = getInterfaceDescriptor + 33;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return hascrashwhenjavacrash;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 101;
        r3 = r2 % 128;
        im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermActivity.getInterfaceDescriptor = r3;
        r2 = r2 % 2;
        r3 = r3 + 87;
        im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermActivity.IAuthTabCallbackStubProxy = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final getDummyAd ICustomTabsService_Parcel() {
        getDummyAd getdummyad;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 == 0) {
            getdummyad = this.termsIntent;
            int i4 = 65 / 0;
        } else {
            getdummyad = this.termsIntent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IAuthTabCallbackDefault(KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity) {
        int i = 2 % 2;
        Intent intent = kcbSurveyNotificationTermActivity.getIntent();
        if (intent == null) {
            return "";
        }
        int i2 = getInterfaceDescriptor + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = intent.getStringExtra("EXTRA_KCB_SURVEY_RESULT");
        if (i3 == 0) {
            int i4 = 44 / 0;
            if (stringExtra == null) {
                return "";
            }
        } else if (stringExtra == null) {
            return "";
        }
        int i5 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return stringExtra;
    }

    private final String onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.access100.getValue();
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean IAuthTabCallbackStub(KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            kcbSurveyNotificationTermActivity.getIntent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intent intent = kcbSurveyNotificationTermActivity.getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("EXTRA_KCB_SURVEY_ROUTE_TO_HISTORY", false);
        }
        int i3 = IAuthTabCallbackStubProxy + 79;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    private final boolean IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.asBinder.getValue()).booleanValue();
        int i4 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final Unit onNavigationEvent(KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult() == r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_ALREADY_TERMS_AGREED) {
            if (!kcbSurveyNotificationTermActivity.IEngagementSignalsCallbackStub()) {
                kcbSurveyNotificationTermActivity.IEngagementSignalsCallback_Parcel();
                int i2 = IAuthTabCallbackStubProxy + 47;
                getInterfaceDescriptor = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 3;
                }
            } else {
                kcbSurveyNotificationTermActivity.IEngagementSignalsCallbackDefault();
            }
        } else if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed() && r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onWarmupCompleted() == r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.AGREED) {
            int i4 = getInterfaceDescriptor + 45;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                onNavigationEvent(new Object[]{kcbSurveyNotificationTermActivity}, TossApplication.onSessionEnded.onExtraCallback(), 1634964749, -1634964747, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback());
                throw null;
            }
            onNavigationEvent(new Object[]{kcbSurveyNotificationTermActivity}, TossApplication.onSessionEnded.onExtraCallback(), 1634964749, -1634964747, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback());
        } else if (kcbSurveyNotificationTermActivity.IEngagementSignalsCallbackStub()) {
            kcbSurveyNotificationTermActivity.IEngagementSignalsCallbackDefault();
            int i5 = IAuthTabCallbackStubProxy + 23;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
        }
        kcbSurveyNotificationTermActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String asInterface(KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(kcbSurveyNotificationTermActivity.getIntent());
        int i4 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnNavigationEvent;
        }
        throw null;
    }

    private final String onSessionEnded() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = (String) this.asInterface.getValue();
        int i3 = IAuthTabCallbackStubProxy + 125;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.notification.Hilt_KcbSurveyNotificationTermActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 107;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = KcbSurveyNotificationTermActivity.this.new onNavigationEvent(access13800Var);
            int i2 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context, im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermActivity] */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i6 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                objOnExtraCallback = obj;
            } else {
                ResultKt.onNavigationEvent(obj);
                getDummyAd getdummyadICustomTabsService_Parcel = KcbSurveyNotificationTermActivity.this.ICustomTabsService_Parcel();
                ?? r3 = KcbSurveyNotificationTermActivity.this;
                String strIAuthTabCallback = KcbSurveyNotificationTermActivity.IAuthTabCallback((KcbSurveyNotificationTermActivity) r3);
                Map mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback("CREDIT_KCB_SURVEY_RESULT", KcbSurveyNotificationTermActivity.onTransact(KcbSurveyNotificationTermActivity.this)));
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadICustomTabsService_Parcel, (Context) r3, "STD_KCB_CREDIT_SURVEY_NOTIFICATION", strIAuthTabCallback, (String) null, 0L, mapOnNavigationEvent, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388568, (Object) null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i8 = onNavigationEvent + 61;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    return objOnWarmupCompleted;
                }
            }
            ((SessionTrackera) KcbSurveyNotificationTermActivity.onNavigationEvent(new Object[]{KcbSurveyNotificationTermActivity.this}, TossApplication.onSessionEnded.onExtraCallback(), 897103995, -897103995, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback())).onNavigationEvent((Intent) objOnExtraCallback);
            Unit unit = Unit.INSTANCE;
            int i10 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return unit;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            startActivity(KcbSurveyNotificationTermAlreadyAgreedActivity.Companion.onNavigationEvent(this, onSessionEnded()));
            int i3 = getInterfaceDescriptor + 113;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 35 / 0;
                return;
            }
            return;
        }
        startActivity(KcbSurveyNotificationTermAlreadyAgreedActivity.Companion.onNavigationEvent(this, onSessionEnded()));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermActivity] */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ?? r4 = (KcbSurveyNotificationTermActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        r4.startActivity(KcbSurveyNotificationTermAgreedActivity.Companion.IAuthTabCallback(r4, r4.onSessionEnded(), r4.IEngagementSignalsCallbackStub()));
        int i4 = getInterfaceDescriptor + 23;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = -8298734900403636714L;
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 59;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 19627 - View.resolveSize(0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                    try {
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), 59 - Color.blue(0), 6384 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        int i6 = $10 + 53;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
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
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i8 = $11 + 117;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 59 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getTouchSlop() >> 8) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            objArr[0] = new String(cArr2);
        }

        private onExtraCallback() {
        }

        public static /* synthetic */ Intent onWarmupCompleted(onExtraCallback onextracallback, Context context, String str, String str2, boolean z, int i, Object obj) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 63;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 8) != 0) {
                z = false;
            }
            Intent intentOnExtraCallback = onextracallback.onExtraCallback(context, str, str2, z);
            int i5 = onExtraCallback + 3;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return intentOnExtraCallback;
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull String str, @NotNull String str2, boolean z) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intent = new Intent(context, (Class<?>) KcbSurveyNotificationTermActivity.class);
            Object[] objArr = new Object[1];
            a(new char[]{29523, 58657, 24461, 45163, 10951, 40106, 62746, 28560}, 38501 - TextUtils.indexOf("", "", 0, 0), objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str).putExtra("EXTRA_KCB_SURVEY_RESULT", str2).putExtra("EXTRA_KCB_SURVEY_ROUTE_TO_HISTORY", z);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = onWarmupCompleted + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            startActivity(KcbSurveyHistoryActivity.Companion.onWarmupCompleted(this, onSessionEnded()));
            int i3 = 22 / 0;
        } else {
            startActivity(KcbSurveyHistoryActivity.Companion.onWarmupCompleted(this, onSessionEnded()));
        }
        int i4 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        return (Unit) onNavigationEvent(new Object[]{kcbSurveyNotificationTermActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, TossApplication.onSessionEnded.onExtraCallback(), -1300889224, 1300889225, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback());
    }

    public static final /* synthetic */ SessionTrackera onExtraCallback(KcbSurveyNotificationTermActivity kcbSurveyNotificationTermActivity) {
        return (SessionTrackera) onNavigationEvent(new Object[]{kcbSurveyNotificationTermActivity}, TossApplication.onSessionEnded.onExtraCallback(), 897103995, -897103995, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback());
    }

    private final void IPostMessageServiceStub() throws Throwable {
        onNavigationEvent(new Object[]{this}, TossApplication.onSessionEnded.onExtraCallback(), 1634964749, -1634964747, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback());
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.notification.Hilt_KcbSurveyNotificationTermActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.notification.Hilt_KcbSurveyNotificationTermActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.notification.Hilt_KcbSurveyNotificationTermActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.notification.Hilt_KcbSurveyNotificationTermActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
