package im.toss.feature.credit.ui.kcbsurvey.notification;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.internal.ads.zzaq;
import com.tmoney.LiveCheckConstants;
import im.toss.feature.credit.ui.kcbsurvey.R;
import im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermAlreadyAgreedActivity$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.IPostMessageServiceStubProxy;
import o.ManagedRetainedValuesStoreKtExternalSyntheticLambda0;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.findResAndMsg;
import o.getAdService;
import o.getDispatcherokhttp;
import o.getMinWebSocketMessageToCompressokhttp;
import o.getPrivacyDestinationUri;
import o.getRouteDatabase;
import o.getSpecialFeatureOptInStatus;
import o.getSupportedHighSpeedResolutionsFor;
import o.getUrlokhttp;
import o.getUserData;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logVerbose;
import o.readIntokhttp;
import o.rvInitOpt;
import o.setByteOrder;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setPingIntervalokhttp;
import o.setProxySelectorokhttp;
import o.setRubIn;
import o.varyMatches;
import o.zzck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class KcbSurveyNotificationTermAlreadyAgreedActivity extends Hilt_KcbSurveyNotificationTermAlreadyAgreedActivity implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    public static final int IAuthTabCallbackDefault;
    private static char IAuthTabCallbackStubProxy = 0;
    private static char IAuthTabCallback_Parcel = 0;
    private static int access000 = 0;
    private static int access100 = 0;
    private static char asInterface = 0;
    private static int extraCallback = 1;
    private static int getInterfaceDescriptor = 1;
    private static char onTransact;
    private final Lazy IAuthTabCallbackStub = isStopUpload.onNavigationEvent(this, 1480731, (Function1) null, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermAlreadyAgreedActivity$$ExternalSyntheticLambda2
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke(Object obj) {
            Unit unitOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                unitOnExtraCallbackWithResult = KcbSurveyNotificationTermAlreadyAgreedActivity.onExtraCallbackWithResult(this.f$0, (initMiniApp.onWarmupCompleted) obj);
                int i3 = 71 / 0;
            } else {
                unitOnExtraCallbackWithResult = KcbSurveyNotificationTermAlreadyAgreedActivity.onExtraCallbackWithResult(this.f$0, (initMiniApp.onWarmupCompleted) obj);
            }
            int i4 = onExtraCallback + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }
    }, 2, (Object) null);
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermAlreadyAgreedActivity$$ExternalSyntheticLambda3
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KcbSurveyNotificationTermAlreadyAgreedActivity kcbSurveyNotificationTermAlreadyAgreedActivity = this.f$0;
            if (i3 != 0) {
                return KcbSurveyNotificationTermAlreadyAgreedActivity.onExtraCallback(kcbSurveyNotificationTermAlreadyAgreedActivity);
            }
            KcbSurveyNotificationTermAlreadyAgreedActivity.onExtraCallback(kcbSurveyNotificationTermAlreadyAgreedActivity);
            throw null;
        }
    });

    @Inject
    public SessionTrackerb tossRouter;

    static {
        onSessionEnded();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        IAuthTabCallbackDefault = 8;
        int i = extraCallback + 11;
        access100 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        int i7 = ~(i | i2 | i3);
        int i8 = ~i;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = ~i3;
        int i12 = (~(i8 | i11)) | i10 | (~(i9 | i11));
        int i13 = i11 | i10;
        int i14 = i + i2 + i6 + (105149790 * i5) + ((-719480883) * i4);
        int i15 = i14 * i14;
        int i16 = (i * (-424837635)) + 281018368 + ((-424837635) * i2) + (1798143484 * i7) + (i12 * (-1798143484)) + ((-1798143484) * i13) + (2071986176 * i6) + ((-654311424) * i5) + (1702887424 * i4) + ((-155189248) * i15);
        int i17 = (i * 910058005) + 1460508013 + (i2 * 910058005) + (i7 * (-484)) + (i12 * 484) + (i13 * 484) + (i6 * 910058489) + (i5 * (-759332242)) + (i4 * (-1121784475)) + (i15 * 1086324736);
        if (i16 + (i17 * i17 * (-1925185536)) == 1) {
            return onExtraCallback(objArr);
        }
        KcbSurveyNotificationTermAlreadyAgreedActivity kcbSurveyNotificationTermAlreadyAgreedActivity = (KcbSurveyNotificationTermAlreadyAgreedActivity) objArr[0];
        initMiniApp.onWarmupCompleted onwarmupcompleted = (initMiniApp.onWarmupCompleted) objArr[1];
        int i18 = 2 % 2;
        int i19 = access000 + 37;
        getInterfaceDescriptor = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{33837, 15280, 28447, 54360, 55805, 59789, 40108, 58898}, 8 - (Process.myPid() >> 22), objArr2);
        onwarmupcompleted.onExtraCallback(((String) objArr2[0]).intern(), kcbSurveyNotificationTermAlreadyAgreedActivity.IEngagementSignalsCallbackStub());
        Unit unit = Unit.INSTANCE;
        int i21 = getInterfaceDescriptor + 125;
        access000 = i21 % 128;
        int i22 = i21 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(KcbSurveyNotificationTermAlreadyAgreedActivity kcbSurveyNotificationTermAlreadyAgreedActivity, TdsTopV2View tdsTopV2View) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(kcbSurveyNotificationTermAlreadyAgreedActivity, tdsTopV2View);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        int i5 = getInterfaceDescriptor + 125;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ String onExtraCallback(KcbSurveyNotificationTermAlreadyAgreedActivity kcbSurveyNotificationTermAlreadyAgreedActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 125;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(kcbSurveyNotificationTermAlreadyAgreedActivity);
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return strOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KcbSurveyNotificationTermAlreadyAgreedActivity kcbSurveyNotificationTermAlreadyAgreedActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(kcbSurveyNotificationTermAlreadyAgreedActivity, view);
        int i4 = access000 + 33;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KcbSurveyNotificationTermAlreadyAgreedActivity kcbSurveyNotificationTermAlreadyAgreedActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = access000 + 19;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) IAuthTabCallback(681573336, -681573336, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{kcbSurveyNotificationTermAlreadyAgreedActivity, onwarmupcompleted});
        }
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback5 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback6 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(681573336, -681573336, iOnExtraCallback4, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback6, iOnExtraCallback5, new Object[]{kcbSurveyNotificationTermAlreadyAgreedActivity, onwarmupcompleted});
        int i3 = 25 / 0;
        return unit;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
            int i3 = 4 / 0;
        } else {
            onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        }
        int i4 = getInterfaceDescriptor + 51;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        String strICustomTabsServiceStubProxy;
        int i = 2 % 2;
        int i2 = access000 + 97;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
            int i3 = 95 / 0;
        } else {
            strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        }
        int i4 = getInterfaceDescriptor + 25;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return strICustomTabsServiceStubProxy;
        }
        throw null;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        int i4 = getInterfaceDescriptor + 73;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = access000 + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = access000 + 1;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return jAccess200;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = getInterfaceDescriptor + 33;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return viewAq_;
        }
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = access000 + 123;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.openJavaCrashMonitor*/.ar_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i3 = access000 + 55;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = access000 + 41;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return findresandmsgAs_;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = access000 + 83;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return screenId;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = getInterfaceDescriptor + 19;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return screenParams;
        }
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = access000 + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access000 + 101;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = access000 + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 111;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = access000 + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        if (i3 == 0) {
            throw null;
        }
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access000 + 103;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i4 = access000 + 57;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsServiceStub;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
            int i3 = 60 / 0;
        } else {
            hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
        }
        int i4 = access000 + 85;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrashICustomTabsServiceStub;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        int i4 = access000 + 27;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public hasCrashWhenJavaCrash ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.IAuthTabCallbackStub.getValue();
        int i4 = access000 + 21;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return hascrashwhenjavacrash;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = ((KcbSurveyNotificationTermAlreadyAgreedActivity) objArr[0]).tossRouter;
        if (sessionTrackerb != null) {
            int i2 = access000 + 49;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = access000 + 75;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final String IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.asBinder.getValue();
        if (i3 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onNavigationEvent(KcbSurveyNotificationTermAlreadyAgreedActivity kcbSurveyNotificationTermAlreadyAgreedActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 57;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(kcbSurveyNotificationTermAlreadyAgreedActivity.getIntent());
            obj.hashCode();
            throw null;
        }
        String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(kcbSurveyNotificationTermAlreadyAgreedActivity.getIntent());
        int i3 = access000 + 55;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return strOnNavigationEvent;
        }
        throw null;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.notification.Hilt_KcbSurveyNotificationTermAlreadyAgreedActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(IEngagementSignalsCallbackDefault());
        int i4 = getInterfaceDescriptor + 29;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + 9;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(KcbSurveyNotificationTermAlreadyAgreedActivity kcbSurveyNotificationTermAlreadyAgreedActivity, TdsTopV2View tdsTopV2View) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsTopV2View, "");
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel = tdsTopV2View.IAuthTabCallback_Parcel();
        if (getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel != null) {
            getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel.onNavigationEvent(kcbSurveyNotificationTermAlreadyAgreedActivity.getString(R.string.credit_kcb_survey_notification_already_agreed_title));
            Context context = tdsTopV2View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel.onNavigationEvent(Integer.valueOf(new getUrlokhttp(new onExtraCallback(configuration)).onUnminimized()));
        }
        tdsTopV2View.setUpperType(TdsTopV2View.onTransact.ASSET_V1);
        getDispatcherokhttp getdispatcherokhttpAccess100 = tdsTopV2View.access100();
        if (getdispatcherokhttpAccess100 != null) {
            int i2 = access000 + 75;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            getdispatcherokhttpAccess100.onExtraCallbackWithResult().IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.IAuthTabCallback.Companion.IAuthTabCallback());
            int iOnNavigationEvent = zzaq.onNavigationEvent();
            ((getSupportedHighSpeedResolutionsFor) getDispatcherokhttp.IAuthTabCallback(-1880973595, new Object[]{getdispatcherokhttpAccess100}, zzaq.onNavigationEvent(), 1880973596, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), iOnNavigationEvent)).IAuthTabCallback(setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()));
            Object[] objArr = new Object[1];
            a(new char[]{7655, 62664, 54626, 59828, 54477, 64104, 15247, 37304, 18810, 41456, 16146, 58926, 28487, 13211, 47115, 21638, 32996, 40086, 27141, 32969, 49520, 38620, 20470, 32720, 43639, 60996, 43769, 18559, 48970, 37653, 56411, 7794, 65088, 7583, 47631, 22726, 20829, 59412, 60857, 43549, 48289, 17742, 25592, 15696, 55714, 8633, 43639, 60996, 40247, 56849, 4851, 40381, 18015, 45317}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 53, objArr);
            getdispatcherokhttpAccess100.IAuthTabCallback(((String) objArr[0]).intern());
            getdispatcherokhttpAccess100.onExtraCallbackWithResult(1);
            int i4 = getInterfaceDescriptor + 67;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(KcbSurveyNotificationTermAlreadyAgreedActivity kcbSurveyNotificationTermAlreadyAgreedActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 59;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        kcbSurveyNotificationTermAlreadyAgreedActivity.onVerticalScrollEvent();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 71;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $11 + 63;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i3) ^ ((c2 << 4) + ((char) (IAuthTabCallbackStubProxy ^ 1094535280733222934L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(IAuthTabCallback_Parcel)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 16777226, View.resolveSizeAndState(0, 0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (asInterface ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onTransact)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), (Process.myPid() >> 22) + 10, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4++;
                    int i7 = $10 + 109;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - View.resolveSize(0, 0)), MotionEvent.axisFromString("") + 15, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2, 0, i);
        int i9 = $10 + 63;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onVerticalScrollEvent() throws Throwable {
        SessionTrackerb sessionTrackerb;
        String strOnExtraCallbackWithResult;
        boolean z;
        Function1 function1;
        Bundle bundle;
        boolean z2;
        int i;
        int i2 = 2 % 2;
        int i3 = access000 + 113;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (!rvInitOpt.onExtraCallbackWithResult.onExtraCallback(IEngagementSignalsCallbackStub())) {
            int i5 = getInterfaceDescriptor + 85;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                sessionTrackerb = (SessionTrackerb) IAuthTabCallback(-331937198, 331937199, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{this});
                bundle = null;
                strOnExtraCallbackWithResult = h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault.onExtraCallback, true, "kcb_survey__next_year_available", true, null, 55, null);
                z = false;
                function1 = null;
                z2 = false;
                i = 73;
            } else {
                int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback5 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback6 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                sessionTrackerb = (SessionTrackerb) IAuthTabCallback(-331937198, 331937199, iOnExtraCallback4, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback6, iOnExtraCallback5, new Object[]{this});
                strOnExtraCallbackWithResult = h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault.onExtraCallback, false, "kcb_survey__next_year_available", false, null, 13, null);
                z = false;
                function1 = null;
                bundle = null;
                z2 = false;
                i = 60;
            }
            SessionTrackerb.IAuthTabCallback(sessionTrackerb, this, strOnExtraCallbackWithResult, z, function1, bundle, z2, i, (Object) null);
        }
        finish();
        int i6 = access000 + 101;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 25 / 0;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static char[] onExtraCallbackWithResult = {64982, 65065, 64981, 64961};
        private static char onWarmupCompleted = 51243;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent onNavigationEvent(@NotNull Context context, @NotNull String str) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) KcbSurveyNotificationTermAlreadyAgreedActivity.class);
            Object[] objArr = new Object[1];
            a(new char[]{2, 1, 0, 2, 13836, 13836, 1, 2}, (byte) (KeyEvent.normalizeMetaState(0) + 36), 9 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = IAuthTabCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallbackWithResult;
            int i4 = -1310771303;
            long j = 0;
            Object obj2 = null;
            if (cArr2 != null) {
                int i5 = $10 + 69;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), Process.getGidForName("") + 27, (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7++;
                        int i8 = $10 + 9;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        i4 = -1310771303;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 26, 23139 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i10 = $10 + 101;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i12 = $10 + 59;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i14 = $10 + 47;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback * b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent >> 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback % b);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        }
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - Color.alpha(0)), 74 - Color.argb(0, 0, 0, 0), 8089 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.blue(0) + 30, (-16757728) - Color.rgb(0, 0, 0), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i16 = $11 + 5;
                                $10 = i16 % 128;
                                int i17 = i16 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                            } else {
                                int i20 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i21 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i20];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i21];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    int i22 = $11 + 121;
                    $10 = i22 % 128;
                    int i23 = i22 % 2;
                    obj2 = obj;
                }
            }
            for (int i24 = 0; i24 < i; i24++) {
                cArr4[i24] = (char) (cArr4[i24] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View IEngagementSignalsCallbackDefault() throws Throwable {
        int i = 2 % 2;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        layoutParams.width = -1;
        layoutParams.height = -1;
        linearLayout.setLayoutParams(layoutParams);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AppBarLayout appBarLayout = new AppBarLayout(context, (AttributeSet) null);
        appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        appBarLayout.setStateListAnimator(AnimatorInflater.loadStateListAnimator(appBarLayout.getContext(), im.toss.uikit.R.drawable.appbar_elevation_off));
        Context context2 = appBarLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Toolbar toolbar = new Toolbar(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        toolbar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setSupportActionBar(toolbar);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = access000 + 103;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            supportActionBar.onNavigationEvent(true);
        }
        IPostMessageServiceStubProxy supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.IAuthTabCallbackStub(false);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(appBarLayout, toolbar);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, appBarLayout);
        getRouteDatabase.IAuthTabCallback(linearLayout, new KcbSurveyNotificationTermAlreadyAgreedActivity$.ExternalSyntheticLambda0(this));
        LottieAnimationView lottieAnimationView = new LottieAnimationView(linearLayout.getContext());
        DisplayMetrics displayMetrics = lottieAnimationView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(lottieAnimationView, varyMatches.onNavigationEvent(34, displayMetrics));
        linearLayout.setGravity(17);
        Object[] objArr = new Object[1];
        a(new char[]{7655, 62664, 54626, 59828, 54477, 64104, 15247, 37304, 18810, 41456, 16146, 58926, 28487, 13211, 47115, 21638, 32996, 40086, 27141, 32969, 49520, 38620, 20470, 32720, 43639, 60996, 43769, 18559, 48970, 37653, 27776, 14410, 36981, 14311, 11902, 1354, 4851, 40381, 22706, 886, 45044, 17766, 54965, 41975, 33301, 2888, 56411, 7794, 33837, 15280, 50539, 58410, 64607, 50308, 14097, 12910, 22723, 46448, 24339, 9927, 40108, 58898, 51885, 14840, 43451, 6909, 44400, 58268, 31740, 26252, 32623, 47565, 45096, 59191}, TextUtils.indexOf("", "", 0, 0) + 74, objArr);
        zzck.onExtraCallback(lottieAnimationView, ((String) objArr[0]).intern(), (ManagedRetainedValuesStoreKtExternalSyntheticLambda0) null, 2, (Object) null);
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.playAnimation();
        setPingIntervalokhttp.onWarmupCompleted(lottieAnimationView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, lottieAnimationView);
        View view = new View(linearLayout.getContext());
        ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        layoutParams3.width = 0;
        layoutParams3.height = 0;
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, view);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context3);
        String string = getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new KcbSurveyNotificationTermAlreadyAgreedActivity$.ExternalSyntheticLambda1(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        int i4 = access000 + 55;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return linearLayout;
    }

    private static final Unit IAuthTabCallback(KcbSurveyNotificationTermAlreadyAgreedActivity kcbSurveyNotificationTermAlreadyAgreedActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) IAuthTabCallback(681573336, -681573336, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{kcbSurveyNotificationTermAlreadyAgreedActivity, onwarmupcompleted});
    }

    public final SessionTrackerb ICustomTabsService_Parcel() {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (SessionTrackerb) IAuthTabCallback(-331937198, 331937199, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{this});
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.notification.Hilt_KcbSurveyNotificationTermAlreadyAgreedActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getInterfaceDescriptor + 107;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.notification.Hilt_KcbSurveyNotificationTermAlreadyAgreedActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = access000 + 15;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.notification.Hilt_KcbSurveyNotificationTermAlreadyAgreedActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 1;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access000 + 61;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.notification.Hilt_KcbSurveyNotificationTermAlreadyAgreedActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
    }

    static void onSessionEnded() {
        asInterface = (char) 18572;
        onTransact = (char) 44934;
        IAuthTabCallbackStubProxy = (char) 12431;
        IAuthTabCallback_Parcel = (char) 23911;
    }
}
