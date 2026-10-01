package im.toss.features.credit.ui.plus.intro;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.features.credit.ui.plus.R;
import im.toss.features.credit.ui.plus.home.CreditPlusHomeActivity;
import im.toss.features.credit.ui.plus.intro.CreditPlusSuccessPayActivity$;
import im.toss.features.credit.ui.plus.intro.CreditPlusSuccessPayActivity$initView$3$1$1$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ArchiveMatcher1;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Cache;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.IPostMessageServiceStubProxy;
import o.ManagedRetainedValuesStoreKtExternalSyntheticLambda0;
import o.ParamUtils;
import o.PlayerErrorCode;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.authenticate;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdService;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getUserData;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isFireOS;
import o.isStopUpload;
import o.logVerbose;
import o.maybeUpdateAnimatable;
import o.readIntokhttp;
import o.readTimeout;
import o.response;
import o.setRandomHost;
import o.setRubIn;
import o.zzaz;
import o.zzck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusSuccessPayActivity extends Hilt_CreditPlusSuccessPayActivity implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallbackStubProxy = 1;
    private static char[] IAuthTabCallback_Parcel = null;
    private static int access000 = 0;
    private static int access100 = 0;
    public static final int asInterface;
    private static int getInterfaceDescriptor = 1;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new CreditPlusSuccessPayActivity$.ExternalSyntheticLambda5(this));
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new CreditPlusSuccessPayActivity$.ExternalSyntheticLambda6(this));
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new CreditPlusSuccessPayActivity$.ExternalSyntheticLambda7(this));
    private final Lazy IAuthTabCallbackDefault = isStopUpload.onNavigationEvent(this, 1359149, (Function1) null, new CreditPlusSuccessPayActivity$.ExternalSyntheticLambda8(this), 2, (Object) null);

    static {
        ICustomTabsService_Parcel();
        Companion = new IAuthTabCallback((DefaultConstructorMarker) null);
        asInterface = 8;
        int i = IAuthTabCallbackStubProxy + 61;
        access100 = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        CreditPlusSuccessPayActivity creditPlusSuccessPayActivity = (CreditPlusSuccessPayActivity) objArr[0];
        initMiniApp.onWarmupCompleted onwarmupcompleted = (initMiniApp.onWarmupCompleted) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 97;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(creditPlusSuccessPayActivity, onwarmupcompleted);
        }
        IAuthTabCallback(creditPlusSuccessPayActivity, onwarmupcompleted);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity) {
        int i = 2 % 2;
        int i2 = access000 + 103;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(creditPlusSuccessPayActivity);
        }
        asBinder(creditPlusSuccessPayActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 5;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(view);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(view);
        int i3 = getInterfaceDescriptor + 37;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity, View view) {
        int i = 2 % 2;
        int i2 = access000 + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditPlusSuccessPayActivity, view);
        int i4 = getInterfaceDescriptor + 73;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ ArchiveMatcher1 onExtraCallback(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity) {
        int i = 2 % 2;
        int i2 = access000 + 37;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onTransact(creditPlusSuccessPayActivity);
            throw null;
        }
        ArchiveMatcher1 archiveMatcher1OnTransact = onTransact(creditPlusSuccessPayActivity);
        int i3 = access000 + 49;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return archiveMatcher1OnTransact;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = access000 + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{view}, -1787624867, 1787624870);
        int i4 = access000 + 99;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = i6 | i7 | i8;
        int i10 = ~(i2 | i7);
        int i11 = (~(i7 | i8)) | (~i6);
        int i12 = i6 + i5 + i4 + ((-1537480081) * i3) + ((-1176924877) * i);
        int i13 = i12 * i12;
        int i14 = (((-324914750) * i6) - 1179058176) + ((-1443770816) * i5) + (1588055615 * i9) + (i10 * (-1588055615)) + ((-1588055615) * i11) + (1263140864 * i4) + (1226178560 * i3) + ((-1044512768) * i) + (1201733632 * i13);
        int i15 = (i6 * 1018573086) + 1206756779 + (i5 * 1018572224) + (i9 * (-431)) + (i10 * 431) + (i11 * 431) + (i4 * 1018572655) + (i3 * (-758184159)) + (i * (-595421667)) + (i13 * (-1647378432));
        int i16 = i14 + (i15 * i15 * 1518272512);
        if (i16 == 1) {
            SetDetectingInterval setDetectingInterval = (CreditPlusSuccessPayActivity) objArr[0];
            int i17 = 2 % 2;
            int i18 = access000 + 27;
            getInterfaceDescriptor = i18 % 128;
            int i19 = i18 % 2;
            String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(setDetectingInterval.getIntent());
            int i20 = access000 + 25;
            getInterfaceDescriptor = i20 % 128;
            int i21 = i20 % 2;
            return strOnNavigationEvent;
        }
        if (i16 == 2) {
            return onExtraCallback(objArr);
        }
        if (i16 == 3) {
            return onNavigationEvent(objArr);
        }
        if (i16 != 4) {
            return IAuthTabCallback(objArr);
        }
        SetDetectingInterval setDetectingInterval2 = (CreditPlusSuccessPayActivity) objArr[0];
        int i22 = 2 % 2;
        int i23 = getInterfaceDescriptor + 1;
        access000 = i23 % 128;
        int i24 = i23 % 2;
        boolean booleanExtra = setDetectingInterval2.getIntent().getBooleanExtra("EXTRA_IS_FREE_TRIAL", false);
        int i25 = getInterfaceDescriptor + 111;
        access000 = i25 % 128;
        int i26 = i25 % 2;
        return Boolean.valueOf(booleanExtra);
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity, View view) {
        int i = 2 % 2;
        int i2 = access000 + 89;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditPlusSuccessPayActivity, view);
        int i4 = getInterfaceDescriptor + 25;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ boolean onNavigationEvent(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {creditPlusSuccessPayActivity};
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        if (i3 != 0) {
            int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            ((Boolean) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, 497839149, -497839145)).booleanValue();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, objArr, 497839149, -497839145)).booleanValue();
        int i4 = access000 + 11;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ String onWarmupCompleted(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity) {
        int i = 2 % 2;
        int i2 = access000 + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        String str = (String) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{creditPlusSuccessPayActivity}, -1151994359, 1151994360);
        int i4 = getInterfaceDescriptor + 107;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return str;
    }

    public static final /* synthetic */ boolean IAuthTabCallbackStub(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity) {
        int i = 2 % 2;
        int i2 = access000 + 25;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            creditPlusSuccessPayActivity.IEngagementSignalsCallbackStub();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIEngagementSignalsCallbackStub = creditPlusSuccessPayActivity.IEngagementSignalsCallbackStub();
        int i3 = getInterfaceDescriptor + 113;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return zIEngagementSignalsCallbackStub;
    }

    public static final /* synthetic */ ArchiveMatcher1 onExtraCallbackWithResult(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        ArchiveMatcher1 archiveMatcher1OnVerticalScrollEvent = creditPlusSuccessPayActivity.onVerticalScrollEvent();
        int i4 = access000 + 113;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return archiveMatcher1OnVerticalScrollEvent;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        }
        super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = access000 + 81;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i3 = access000 + 91;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 78 / 0;
        }
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access000 + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        int i5 = access000 + 41;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = access000 + 11;
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
        int i2 = getInterfaceDescriptor + 9;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = access000 + 101;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return viewAq_;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = access000 + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i4 = getInterfaceDescriptor + 115;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return mapAr_;
        }
        throw null;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.openJavaCrashMonitor*/.as_();
            throw null;
        }
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i3 = access000 + 43;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return findresandmsgAs_;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = getInterfaceDescriptor + 89;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return screenId;
    }

    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        return screenParams;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = access000 + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = access000 + 83;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = access000 + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = getInterfaceDescriptor + 71;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access000 + 85;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i4 = getInterfaceDescriptor + 5;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = access000 + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
        int i4 = access000 + 57;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return hascrashwhenjavacrashICustomTabsServiceStub;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = access000 + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        int i4 = getInterfaceDescriptor + 117;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final ArchiveMatcher1 onTransact(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity) {
        int i = 2 % 2;
        int i2 = access000 + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ArchiveMatcher1 archiveMatcher1OnWarmupCompleted = ArchiveMatcher1.onWarmupCompleted(LayoutInflater.from(creditPlusSuccessPayActivity));
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return archiveMatcher1OnWarmupCompleted;
    }

    private final ArchiveMatcher1 onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = access000 + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onTransact.getValue();
        if (i3 != 0) {
            return (ArchiveMatcher1) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String onSessionEnded() {
        int i = 2 % 2;
        int i2 = access000 + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.asBinder.getValue();
        int i4 = getInterfaceDescriptor + 81;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private final boolean IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = access000 + 21;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            ((Boolean) this.IAuthTabCallbackStub.getValue()).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) this.IAuthTabCallbackStub.getValue()).booleanValue();
        int i3 = access000 + 53;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
        return zBooleanValue;
    }

    public hasCrashWhenJavaCrash ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = access000 + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.IAuthTabCallbackDefault.getValue();
        int i4 = getInterfaceDescriptor + 7;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrash;
    }

    private static final Unit IAuthTabCallback(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object[] objArr = new Object[1];
        a(new int[]{61, 8, 0, 3}, true, new byte[]{0, 1, 1, 0, 1, 1, 0, 1}, objArr);
        onwarmupcompleted.onExtraCallback(((String) objArr[0]).intern(), creditPlusSuccessPayActivity.onSessionEnded());
        onwarmupcompleted.onExtraCallback("free_yn", zzaz.onExtraCallbackWithResult(creditPlusSuccessPayActivity.IEngagementSignalsCallbackStub()));
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 49;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return unit;
    }

    @Override // im.toss.features.credit.ui.plus.intro.Hilt_CreditPlusSuccessPayActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(onVerticalScrollEvent().IAuthTabCallback());
        ConstraintLayout constraintLayoutIAuthTabCallback = onVerticalScrollEvent().IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutIAuthTabCallback, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(constraintLayoutIAuthTabCallback, onVerticalScrollEvent().onExtraCallback, (View) null, (View) null, false, 14, (Object) null);
        IEngagementSignalsCallbackDefault();
        int i4 = getInterfaceDescriptor + 47;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallback + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.features.credit.ui.plus.intro.CreditPlusSuccessPayActivity.onExtraCallbackWithResult.onWarmupCompleted + 125;
            im.toss.features.credit.ui.plus.intro.CreditPlusSuccessPayActivity.onExtraCallbackWithResult.onExtraCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onNavigationEvent)) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onNavigationEvent) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 96 / 0;
            }
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onTransact = 1;
        int label;
        private static char[] onWarmupCompleted = {32480, 32284, 32280, 32285, 32470, 32473, 32495, 32487, 32493, 32474, 32281, 32283, 32484, 32483, 32481, 32275, 32475, 32282, 32479, 32466, 32472, 32486};
        private static int onExtraCallback = -1184334200;
        private static boolean onNavigationEvent = true;
        private static boolean onExtraCallbackWithResult = true;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit onNavigationEvent(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity) {
            int i = 2 % 2;
            int i2 = onTransact + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditPlusSuccessPayActivity);
            if (i3 != 0) {
                int i4 = 6 / 0;
            }
            int i5 = IAuthTabCallback + 75;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return unitOnExtraCallbackWithResult;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onwarmupcompletedCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 41;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 32 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = CreditPlusSuccessPayActivity.this.new onWarmupCompleted(access13800Var);
            int i2 = IAuthTabCallback + 45;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 105;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            throw null;
        }

        private static final Unit onExtraCallbackWithResult(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity) {
            TdsBottomCtaV1View tdsBottomCtaV1View;
            int i = 2 % 2;
            int i2 = onTransact + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                tdsBottomCtaV1View = CreditPlusSuccessPayActivity.onExtraCallbackWithResult(creditPlusSuccessPayActivity).onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
            } else {
                tdsBottomCtaV1View = CreditPlusSuccessPayActivity.onExtraCallbackWithResult(creditPlusSuccessPayActivity).onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
            }
            tdsBottomCtaV1View.setVisibility(0);
            return Unit.INSTANCE;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(500L, this) == objOnWarmupCompleted) {
                    int i5 = IAuthTabCallback + 47;
                    onTransact = i5 % 128;
                    if (i5 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            AnimateText animateText = CreditPlusSuccessPayActivity.onExtraCallbackWithResult(CreditPlusSuccessPayActivity.this).onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(animateText, "");
            animateText.setVisibility(0);
            if (!CreditPlusSuccessPayActivity.IAuthTabCallbackStub(CreditPlusSuccessPayActivity.this)) {
                TdsImageView tdsImageView = CreditPlusSuccessPayActivity.onExtraCallbackWithResult(CreditPlusSuccessPayActivity.this).IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                tdsImageView.setVisibility(8);
            } else {
                LottieAnimationView lottieAnimationView = CreditPlusSuccessPayActivity.onExtraCallbackWithResult(CreditPlusSuccessPayActivity.this).asInterface;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
                lottieAnimationView.setVisibility(0);
                LottieAnimationView lottieAnimationView2 = CreditPlusSuccessPayActivity.onExtraCallbackWithResult(CreditPlusSuccessPayActivity.this).asInterface;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-110, -117, -124, -106, -118, -120, -115, -115, -114, -126, -110, -120, -111, -107, -108, -109, -111, -110, -120, -117, -119, -111, -114, -113, -112, -121, -113, -122, -124, -114, -120, -126, -126, -117, -115, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, Process.getGidForName("") + 128, objArr);
                zzck.onWarmupCompleted(-59676451, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 59676451, new Object[]{lottieAnimationView2, ((String) objArr[0]).intern(), false, 0L, null, null, null, 62, null}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
            }
            CreditPlusSuccessPayActivity.onExtraCallbackWithResult(CreditPlusSuccessPayActivity.this).onTransact.playAnimation();
            AnimateText animateText2 = CreditPlusSuccessPayActivity.onExtraCallbackWithResult(CreditPlusSuccessPayActivity.this).onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(animateText2, "");
            String string = CreditPlusSuccessPayActivity.IAuthTabCallbackStub(CreditPlusSuccessPayActivity.this) ? CreditPlusSuccessPayActivity.this.getString(R.string.credit_ui_plus_success_register_payment_top_title2) : CreditPlusSuccessPayActivity.this.getString(R.string.credit_ui_plus_success_pay_top_title2);
            Intrinsics.checkNotNull(string);
            AnimateText.onExtraCallback(animateText2, string, readTimeout.asInterface.onExtraCallback.onExtraCallbackWithResult, 0, AnimateText.onNavigationEvent.CENTER, false, false, (Function0) null, (Function0) null, (Function0) null, 500, (Object) null);
            TdsImageView tdsImageView2 = CreditPlusSuccessPayActivity.onExtraCallbackWithResult(CreditPlusSuccessPayActivity.this).IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
            AuthenticatorCompanion authenticatorCompanion = AuthenticatorCompanion.IAuthTabCallback;
            authenticate authenticateVar = authenticate.IN;
            AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone = AuthenticatorCompanionAuthenticatorNone.FAST;
            Rally rallyOnWarmupCompleted = RallysKt.onWarmupCompleted(tdsImageView2, CollectionsKt.listOf(AuthenticatorCompanion.onExtraCallbackWithResult(authenticatorCompanion, authenticateVar, authenticatorCompanionAuthenticatorNone, (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, access14000.onNavigationEvent(false), 0, 0L, false, 1916, (Object) null);
            TdsBottomCtaV1View tdsBottomCtaV1View = CreditPlusSuccessPayActivity.onExtraCallbackWithResult(CreditPlusSuccessPayActivity.this).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
            Iterator it = CollectionsKt.listOf(new Rally[]{rallyOnWarmupCompleted, Rally.IAuthTabCallback((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsBottomCtaV1View, AuthenticatorCompanion.IAuthTabCallback(authenticatorCompanion, authenticateVar, Cache.UP, authenticatorCompanionAuthenticatorNone, false, (Function1) null, 24, (Object) null), 0, null, 0, null, null, null, 1000, 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new CreditPlusSuccessPayActivity$initView$3$1$1$.ExternalSyntheticLambda0(CreditPlusSuccessPayActivity.this), 1, (Object) null)}).iterator();
            while (it.hasNext()) {
                isFireOS.onExtraCallbackWithResult((Rally) it.next(), false, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onWarmupCompleted;
            float f = 0.0f;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $11 + 123;
                    $10 = i5 % 128;
                    if (i5 % i2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 77 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 20952 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 77 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    }
                    i4++;
                    i2 = 2;
                    f = 0.0f;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getPressedStateDuration() >> 16) + 75, 16037 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            if (onExtraCallbackWithResult) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 63 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i6 = $10 + 41;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $10 + 49;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] * iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 63 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf((CharSequence) "", '0', 0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 63, TextUtils.getOffsetAfter("", 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                }
            }
            objArr[0] = new String(cArr6);
        }
    }

    private static final Unit asBinder(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity) {
        int i = 2 % 2;
        AnimateText animateText = creditPlusSuccessPayActivity.onVerticalScrollEvent().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(animateText, "");
        animateText.setVisibility(8);
        TdsImageView tdsImageView = creditPlusSuccessPayActivity.onVerticalScrollEvent().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(8);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditPlusSuccessPayActivity), (CoroutineContext) null, (setRandomHost) null, creditPlusSuccessPayActivity.new onWarmupCompleted(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 125;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 51 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 49;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = access000 + 25;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity, View view) {
        int i = 2 % 2;
        int i2 = access000 + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        creditPlusSuccessPayActivity.onNavigationEvent(true);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 95;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 91;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity, View view) {
        int i = 2 % 2;
        int i2 = access000 + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        creditPlusSuccessPayActivity.onNavigationEvent(false);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 93;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[PHI: r2
      0x0034: PHI (r2v7 o.IPostMessageServiceStubProxy) = (r2v6 o.IPostMessageServiceStubProxy), (r2v27 o.IPostMessageServiceStubProxy) binds: [B:8:0x0032, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IEngagementSignalsCallbackDefault() throws Throwable {
        IPostMessageServiceStubProxy supportActionBar;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            setToolbar(onVerticalScrollEvent().asBinder);
            supportActionBar = getSupportActionBar();
            int i3 = 11 / 0;
            if (supportActionBar != null) {
                int i4 = access000 + 71;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 == 0) {
                    supportActionBar.IAuthTabCallbackStub(true);
                } else {
                    supportActionBar.IAuthTabCallbackStub(false);
                }
            }
        } else {
            setToolbar(onVerticalScrollEvent().asBinder);
            supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
            }
        }
        AnimateText animateText = onVerticalScrollEvent().onExtraCallbackWithResult;
        animateText.setTypography(3);
        response responseVar = response.Bold;
        animateText.setFont(responseVar);
        Intrinsics.checkNotNull(animateText);
        Context context = animateText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        animateText.setTextColor(new getUrlokhttp(new onExtraCallback(configuration)).onRelationshipValidationResult());
        AnimateText animateText2 = onVerticalScrollEvent().onWarmupCompleted;
        animateText2.setTypography(3);
        animateText2.setFont(responseVar);
        Intrinsics.checkNotNull(animateText2);
        Context context2 = animateText2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        animateText2.setTextColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).onRelationshipValidationResult());
        String string = getString(im.toss.features.credit.ui.plus.R.string.credit_ui_plus_success_pay_top_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = String.format(string, Arrays.copyOf(new Object[]{PlayerErrorCode.onPostMessage()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        AnimateText.onExtraCallback(animateText2, str, readTimeout.asInterface.onExtraCallback.onExtraCallbackWithResult, 1000, AnimateText.onNavigationEvent.CENTER, false, false, (Function0) null, (Function0) null, new CreditPlusSuccessPayActivity$.ExternalSyntheticLambda0(this), 240, (Object) null);
        TdsBottomCtaV1View tdsBottomCtaV1View = onVerticalScrollEvent().onNavigationEvent;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        String string2 = getString(im.toss.features.credit.ui.plus.R.string.credit_ui_plus_success_pay_cta_variant);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string2, new CreditPlusSuccessPayActivity$.ExternalSyntheticLambda1(), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.FILL, TdsButtonV1View.onWarmupCompleted.XLARGE, TdsButtonV1View.IAuthTabCallback.BLOCK), false, 8, (Object) null);
        TdsButtonV1View tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface();
        ParamUtils paramUtils = ParamUtils.NORMAL;
        Object[] objArr = {tdsButtonV1ViewAsInterface, paramUtils, new CreditPlusSuccessPayActivity$.ExternalSyntheticLambda2(this)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        tdsBottomCtaV1View.setBottomButtonType(TdsTextButtonV0View.IAuthTabCallback.GREY);
        tdsBottomCtaV1View.setBottomButton(getString(im.toss.features.credit.ui.plus.R.string.credit_ui_plus_success_pay_text_button_variant), new CreditPlusSuccessPayActivity$.ExternalSyntheticLambda3());
        Object[] objArr2 = {tdsBottomCtaV1View.onExtraCallbackWithResult(), paramUtils, new CreditPlusSuccessPayActivity$.ExternalSyntheticLambda4(this)};
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted4 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        LottieAnimationView lottieAnimationView = onVerticalScrollEvent().onTransact;
        lottieAnimationView.setRepeatCount(1);
        Intrinsics.checkNotNull(lottieAnimationView);
        Object[] objArr3 = new Object[1];
        a(new int[]{0, 61, 0, 9}, true, new byte[]{1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1}, objArr3);
        zzck.onExtraCallback(lottieAnimationView, ((String) objArr3[0]).intern(), (ManagedRetainedValuesStoreKtExternalSyntheticLambda0) null, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 3;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            startActivity(CreditPlusHomeActivity.Companion.onWarmupCompleted(this, onSessionEnded(), z));
            finish();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        startActivity(CreditPlusHomeActivity.Companion.onWarmupCompleted(this, onSessionEnded(), z));
        finish();
        int i3 = getInterfaceDescriptor + 95;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 86 / 0;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallback_Parcel;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - Color.red(0)), TextUtils.lastIndexOf("", c) + 36, 14238 - TextUtils.indexOf("", c, 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    c = '0';
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
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i7 = $10 + 91;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 10935), 65 - (KeyEvent.getMaxKeyCode() >> 16), 16718 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 29 - TextUtils.indexOf("", "", 0), TextUtils.lastIndexOf("", '0') + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - View.MeasureSpec.makeMeasureSpec(0, 0)), 70 - ExpandableListView.getPackedPositionGroup(0L), View.resolveSize(0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i11 = $11 + 89;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 1, cArr5, 0, i3);
                System.arraycopy(cArr5, 0, cArr3, i3 << i5, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i3 % i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i12 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr3, i12, i5);
                System.arraycopy(cArr6, i5, cArr3, 0, i12);
            }
        }
        if (z) {
            char[] cArr7 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i4 > 0) {
            int i13 = $11 + 31;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static /* synthetic */ Unit IAuthTabCallback(View view) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{view}, -1314349131, 1314349133);
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{creditPlusSuccessPayActivity, onwarmupcompleted}, 1319045496, -1319045496);
    }

    private static final Unit onExtraCallback(View view) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{view}, -1787624867, 1787624870);
    }

    private static final boolean IAuthTabCallbackDefault(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{creditPlusSuccessPayActivity}, 497839149, -497839145)).booleanValue();
    }

    private static final String asInterface(CreditPlusSuccessPayActivity creditPlusSuccessPayActivity) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (String) onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{creditPlusSuccessPayActivity}, -1151994359, 1151994360);
    }

    @Override // im.toss.features.credit.ui.plus.intro.Hilt_CreditPlusSuccessPayActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access000 + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
        int i4 = access000 + 87;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.credit.ui.plus.intro.Hilt_CreditPlusSuccessPayActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 89;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            throw null;
        }
        int i4 = access000 + 75;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.features.credit.ui.plus.intro.Hilt_CreditPlusSuccessPayActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 103;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // im.toss.features.credit.ui.plus.intro.Hilt_CreditPlusSuccessPayActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = getInterfaceDescriptor + 69;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ICustomTabsService_Parcel() {
        IAuthTabCallback_Parcel = new char[]{27255, 27167, 27233, 27258, 27160, 27199, 27196, 27194, 27168, 27173, 27168, 27199, 27168, 27138, 27136, 27198, 27173, 27176, 27140, 27138, 27170, 27198, 27171, 27143, 27141, 27168, 27194, 27170, 27179, 27172, 27168, 27175, 27143, 27136, 27168, 27168, 27171, 27168, 27175, 27142, 27166, 27170, 27177, 27168, 27194, 27199, 27171, 27139, 27136, 27173, 27141, 27166, 27197, 27199, 27199, 27167, 27142, 27176, 27168, 27172, 27172, 27261, 27179, 27173, 27196, 27173, 27173, 27196, 27173};
    }
}
