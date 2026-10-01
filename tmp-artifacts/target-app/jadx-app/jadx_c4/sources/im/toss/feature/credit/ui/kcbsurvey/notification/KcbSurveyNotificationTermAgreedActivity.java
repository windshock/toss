package im.toss.feature.credit.ui.kcbsurvey.notification;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.zzaq;
import com.tmoney.LiveCheckConstants;
import im.toss.base.BaseActivity;
import im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity;
import im.toss.feature.credit.ui.kcbsurvey.R;
import im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermAgreedActivity$;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.IPostMessageServiceStubProxy;
import o.SetDetectingInterval;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.WebSocketFactory;
import o.findResAndMsg;
import o.getAdService;
import o.getDispatcherokhttp;
import o.getHostnameVerifierokhttp;
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
import o.setByteOrder;
import o.setProxySelectorokhttp;
import o.setRubIn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class KcbSurveyNotificationTermAgreedActivity extends BaseActivity implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallbackStubProxy = 0;
    private static char IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 1;
    public static final int asBinder;
    private static int getInterfaceDescriptor;
    private final Lazy IAuthTabCallbackDefault = isStopUpload.onNavigationEvent(this, 1471325, (Function1) null, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermAgreedActivity$$ExternalSyntheticLambda2
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = KcbSurveyNotificationTermAgreedActivity.onNavigationEvent(this.f$0, (initMiniApp.onWarmupCompleted) obj);
            int i4 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnNavigationEvent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }, 2, (Object) null);
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermAgreedActivity$$ExternalSyntheticLambda3
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallback = KcbSurveyNotificationTermAgreedActivity.onExtraCallback(this.f$0);
            if (i3 != 0) {
                int i4 = 89 / 0;
            }
            return strOnExtraCallback;
        }
    });
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermAgreedActivity$$ExternalSyntheticLambda4
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolValueOf = Boolean.valueOf(KcbSurveyNotificationTermAgreedActivity.onExtraCallbackWithResult(this.f$0));
            int i4 = onWarmupCompleted + 27;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return boolValueOf;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });

    static {
        ICustomTabsService_Parcel();
        Companion = new onExtraCallbackWithResult(null);
        asBinder = 8;
        int i = IAuthTabCallbackStubProxy + 83;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~((~i5) | i7 | i6);
        int i9 = (~(i7 | (~i6))) | (~(i6 | i5));
        int i10 = (~(i5 | i3)) | i6;
        int i11 = i6 + i3 + i2 + ((-407681510) * i) + ((-298114539) * i4);
        int i12 = i11 * i11;
        int i13 = ((-1498977624) * i6) + 672923648 + (2103481690 * i3) + (i8 * 346253991) + (346253991 * i9) + ((-346253991) * i10) + ((-1845231616) * i2) + ((-328728576) * i) + ((-2108424192) * i4) + ((-1296629760) * i12);
        int i14 = ((i6 * 57881544) - 1472685786) + (i3 * 57881954) + (i8 * (-205)) + (i9 * (-205)) + (i10 * 205) + (i2 * 57881749) + (i * 289608994) + (i4 * 969284153) + (i12 * 813891584);
        if (i13 + (i14 * i14 * 454098944) != 1) {
            return IAuthTabCallback(objArr);
        }
        getHostnameVerifierokhttp gethostnameverifierokhttp = (KcbSurveyNotificationTermAgreedActivity) objArr[0];
        TdsTopV2View tdsTopV2View = (TdsTopV2View) objArr[1];
        int i15 = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsTopV2View, "");
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel = tdsTopV2View.IAuthTabCallback_Parcel();
        if (getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel != null) {
            getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel.onNavigationEvent(gethostnameverifierokhttp.getString(R.string.credit_kcb_survey_notification_agreement_complete_title));
            Context context = tdsTopV2View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel.onNavigationEvent(Integer.valueOf(new getUrlokhttp(new onNavigationEvent(configuration)).onUnminimized()));
        }
        tdsTopV2View.setSubtitle1Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
        tdsTopV2View.setSubtitle1TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpOnWarmupCompleted = tdsTopV2View.onWarmupCompleted();
        if (getminwebsocketmessagetocompressokhttpOnWarmupCompleted != null) {
            getminwebsocketmessagetocompressokhttpOnWarmupCompleted.onNavigationEvent(gethostnameverifierokhttp.getString(R.string.credit_kcb_survey_notification_agreement_complete_description));
            Context context2 = tdsTopV2View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            getminwebsocketmessagetocompressokhttpOnWarmupCompleted.onNavigationEvent(Integer.valueOf(new getUrlokhttp(new IAuthTabCallback(configuration2)).ICustomTabsCallbackStubProxy()));
        }
        tdsTopV2View.setUpperType(TdsTopV2View.onTransact.ASSET_V1);
        getDispatcherokhttp getdispatcherokhttpAccess100 = tdsTopV2View.access100();
        if (getdispatcherokhttpAccess100 != null) {
            getdispatcherokhttpAccess100.onExtraCallbackWithResult().IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onNavigationEvent.Companion.onNavigationEvent());
            Object[] objArr2 = new Object[1];
            a(new char[]{'\f', '\b', '\b', '\t', 6, 15, 13823, 13823, 6, '\b', 17, '\t', 22, 2, 7, '\b', 5, '\n', 6, 7, 15, 22, 0, '\r', 2, 5, '\f', 22, 15, '\b', 17, 2, 5, 0, 0, 5, 2, 4, 23, '\f', 17, 23, 22, 14, 6, '\t', 2, 5, 11, 1, '\n', 5, 13886}, (byte) (ExpandableListView.getPackedPositionChild(0L) + 75), 52 - Process.getGidForName(""), objArr2);
            getdispatcherokhttpAccess100.IAuthTabCallback(((String) objArr2[0]).intern());
            ((getSupportedHighSpeedResolutionsFor) getDispatcherokhttp.IAuthTabCallback(-1880973595, new Object[]{getdispatcherokhttpAccess100}, zzaq.onNavigationEvent(), 1880973596, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent())).IAuthTabCallback(setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()));
            getdispatcherokhttpAccess100.onExtraCallbackWithResult(1);
            int i16 = access100 + 123;
            getInterfaceDescriptor = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 3 / 4;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i18 = getInterfaceDescriptor + 93;
        access100 = i18 % 128;
        int i19 = i18 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(KcbSurveyNotificationTermAgreedActivity kcbSurveyNotificationTermAgreedActivity, TdsTopV2View tdsTopV2View) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            return (Unit) IAuthTabCallback(new Object[]{kcbSurveyNotificationTermAgreedActivity, tdsTopV2View}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1064750795, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, -1064750794);
        }
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ String onExtraCallback(KcbSurveyNotificationTermAgreedActivity kcbSurveyNotificationTermAgreedActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted(kcbSurveyNotificationTermAgreedActivity);
        int i4 = getInterfaceDescriptor + 25;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return strOnWarmupCompleted;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(KcbSurveyNotificationTermAgreedActivity kcbSurveyNotificationTermAgreedActivity) {
        int i = 2 % 2;
        int i2 = access100 + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(kcbSurveyNotificationTermAgreedActivity);
        int i4 = getInterfaceDescriptor + 117;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return zOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(KcbSurveyNotificationTermAgreedActivity kcbSurveyNotificationTermAgreedActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(kcbSurveyNotificationTermAgreedActivity, view);
        int i4 = getInterfaceDescriptor + 15;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(KcbSurveyNotificationTermAgreedActivity kcbSurveyNotificationTermAgreedActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(kcbSurveyNotificationTermAgreedActivity, onwarmupcompleted);
        int i4 = access100 + 111;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i4 = getInterfaceDescriptor + 113;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = access100 + 105;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        }
        super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        throw null;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        int i4 = getInterfaceDescriptor + 125;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.openJavaCrashMonitor*/.access200();
        }
        super/*o.openJavaCrashMonitor*/.access200();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = getInterfaceDescriptor + 107;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return viewAq_;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i4 = getInterfaceDescriptor + 123;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = access100 + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return findresandmsgAs_;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = getInterfaceDescriptor + 81;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return screenId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = access100 + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = access100 + 23;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return screenParams;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = access100 + 113;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = access100 + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = access100 + 29;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault;
        int i = 2 % 2;
        int i2 = access100 + 13;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
            int i3 = 12 / 0;
        } else {
            onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        }
        int i4 = access100 + 77;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
        int i4 = getInterfaceDescriptor + 109;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return hascrashwhenjavacrashICustomTabsServiceStub;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = access100 + 111;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.openJavaCrashMonitor*/.validateRelationship();
            obj.hashCode();
            throw null;
        }
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        int i3 = getInterfaceDescriptor + 93;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return setrubinValidateRelationship;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 107;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public hasCrashWhenJavaCrash ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            return hascrashwhenjavacrash;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(KcbSurveyNotificationTermAgreedActivity kcbSurveyNotificationTermAgreedActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object[] objArr = new Object[1];
        a(new char[]{3, 17, 3, 19, 13860, 13860, 17, 3}, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 61), 8 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        onwarmupcompleted.onExtraCallback(((String) objArr[0]).intern(), kcbSurveyNotificationTermAgreedActivity.onSessionEnded());
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 71;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final String onSessionEnded() {
        int i = 2 % 2;
        int i2 = access100 + 43;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onTransact.getValue();
        int i4 = getInterfaceDescriptor + 49;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onWarmupCompleted(KcbSurveyNotificationTermAgreedActivity kcbSurveyNotificationTermAgreedActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 97;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(kcbSurveyNotificationTermAgreedActivity.getIntent());
            throw null;
        }
        String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(kcbSurveyNotificationTermAgreedActivity.getIntent());
        int i3 = access100 + 91;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return strOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    private final boolean IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = access100 + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asInterface.getValue();
        if (i3 == 0) {
            return ((Boolean) value).booleanValue();
        }
        ((Boolean) value).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean onNavigationEvent(KcbSurveyNotificationTermAgreedActivity kcbSurveyNotificationTermAgreedActivity) {
        int i = 2 % 2;
        Intent intent = kcbSurveyNotificationTermAgreedActivity.getIntent();
        if (intent == null) {
            int i2 = getInterfaceDescriptor + 71;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = getInterfaceDescriptor + 105;
        access100 = i4 % 128;
        boolean booleanExtra = intent.getBooleanExtra("EXTRA_KCB_SURVEY_ROUTE_TO_HISTORY", i4 % 2 == 0);
        int i5 = access100 + 67;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return booleanExtra;
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(onVerticalScrollEvent());
        int i4 = getInterfaceDescriptor + 101;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.content.Context, im.toss.base.BaseActivity, im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermAgreedActivity] */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        ?? r5 = (KcbSurveyNotificationTermAgreedActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 87;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            r5.startActivity(KcbSurveyHistoryActivity.Companion.onWarmupCompleted(r5, r5.onSessionEnded()));
            r5.finish();
            int i3 = access100 + 7;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 88 / 0;
            }
            return null;
        }
        r5.startActivity(KcbSurveyHistoryActivity.Companion.onWarmupCompleted(r5, r5.onSessionEnded()));
        r5.finish();
        throw null;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onWarmupCompleted + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallbackWithResult + 37;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onExtraCallback + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                int i6 = 54 / 0;
            }
            return getspecialfeatureoptinstatus2;
        }
    }

    private static final Unit onExtraCallback(KcbSurveyNotificationTermAgreedActivity kcbSurveyNotificationTermAgreedActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (!(!kcbSurveyNotificationTermAgreedActivity.IEngagementSignalsCallbackDefault())) {
            IAuthTabCallback(new Object[]{kcbSurveyNotificationTermAgreedActivity}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1987590463, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1987590463);
        } else {
            kcbSurveyNotificationTermAgreedActivity.finish();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 121;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static short[] IAuthTabCallback;
        private static final byte[] $$a = {13, 38, -109, 117};
        private static final int $$b = 78;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int asInterface = 1;
        private static int onExtraCallbackWithResult = 565134038;
        private static int onExtraCallback = -1538795498;
        private static int onNavigationEvent = 1635609787;
        private static byte[] onWarmupCompleted = {-30, 5, -5, 8, 5, -9, 9, -5};

        private static String $$c(byte b, short s, short s2) {
            byte[] bArr = $$a;
            int i = (s2 * 3) + 4;
            int i2 = s * 2;
            int i3 = (b * 2) + 115;
            byte[] bArr2 = new byte[1 - i2];
            int i4 = 0 - i2;
            int i5 = -1;
            if (bArr == null) {
                i3 = (-i3) + i4;
                i++;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i3;
                if (i6 == i4) {
                    return new String(bArr2, 0);
                }
                i3 = (-bArr[i]) + i3;
                i++;
                i5 = i6;
            }
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull String str, boolean z) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) KcbSurveyNotificationTermAgreedActivity.class);
            Object[] objArr = new Object[1];
            a((short) Color.alpha(0), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2048353570 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getTrimmedLength("") + 986008511, (-31) - TextUtils.getCapsMode("", 0, 0), objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str).putExtra("EXTRA_KCB_SURVEY_ROUTE_TO_HISTORY", z);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = IAuthTabCallbackDefault + 71;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 93 / 0;
            }
            return intentPutExtra;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            long j;
            boolean z;
            int length;
            byte[] bArr;
            int i4;
            int i5 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 41 - Process.getGidForName(""), 22439 - (ViewConfiguration.getLongPressTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                int i6 = iIntValue == -1 ? 1 : 0;
                if (i6 == 0) {
                    j = -4629411779493505016L;
                } else {
                    byte[] bArr2 = onWarmupCompleted;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        int i7 = 0;
                        while (i7 < length2) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - ExpandableListView.getPackedPositionGroup(0L)), View.resolveSizeAndState(0, 0, 0) + 55, View.combineMeasuredStates(0, 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr3[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i7++;
                                int i8 = $10 + 35;
                                $11 = i8 % 128;
                                int i9 = i8 % 2;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        byte[] bArr4 = onWarmupCompleted;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.getOffsetAfter("", 0)), Color.blue(0) + 42, 22487 - AndroidCharacter.getMirror('0'), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ j)) + i6;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 86 - (ViewConfiguration.getTapTimeout() >> 16), Process.getGidForName("") + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = onWarmupCompleted;
                    if (bArr5 != null) {
                        int i10 = $10 + 13;
                        $11 = i10 % 128;
                        if (i10 % 2 == 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i4 = 1;
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i4 = 0;
                        }
                        while (i4 < length) {
                            bArr[i4] = (byte) (bArr5[i4] ^ (-4629411779493505016L));
                            i4++;
                        }
                        bArr5 = bArr;
                    }
                    if (bArr5 != null) {
                        int i11 = $10 + 65;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            int i13 = $11 + 13;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                            byte[] bArr6 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            int i15 = $10 + 61;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                        } else {
                            short[] sArr = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View onVerticalScrollEvent() {
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
        Object obj = null;
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
            supportActionBar.onNavigationEvent(true);
        }
        IPostMessageServiceStubProxy supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            int i2 = getInterfaceDescriptor + 67;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            supportActionBar2.IAuthTabCallbackStub(false);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(appBarLayout, toolbar);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, appBarLayout);
        getRouteDatabase.IAuthTabCallback(linearLayout, new KcbSurveyNotificationTermAgreedActivity$.ExternalSyntheticLambda0(this));
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
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new KcbSurveyNotificationTermAgreedActivity$.ExternalSyntheticLambda1(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        int i4 = access100 + 55;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return linearLayout;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallbackStub;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $11 + 15;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(j)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26, 23139 - View.MeasureSpec.getSize(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
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
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallback_Parcel)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), ((Process.getThreadPriority(0) + 20) >> 6) + 26, ((Process.getThreadPriority(0) + 20) >> 6) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i7 = $10 + 53;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    i2 = i + 16;
                    cArr4[i2] = (char) (cArr[i2] >>> b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 24825), 75 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i8 = $11 + 97;
                            $10 = i8 % 128;
                            int i9 = i8 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, View.MeasureSpec.makeMeasureSpec(0, 0) + 19488, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                            } else {
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                                int i15 = $10 + 81;
                                $11 = i15 % 128;
                                int i16 = i15 % 2;
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i17 = 0;
            while (i17 < i) {
                int i18 = $10 + 67;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr4[i17] = (char) (cArr4[i17] ^ 28345);
                    i17 += 78;
                } else {
                    cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                    i17++;
                }
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static final Unit onNavigationEvent(KcbSurveyNotificationTermAgreedActivity kcbSurveyNotificationTermAgreedActivity, TdsTopV2View tdsTopV2View) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) IAuthTabCallback(new Object[]{kcbSurveyNotificationTermAgreedActivity, tdsTopV2View}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1064750795, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, -1064750794);
    }

    private final void IEngagementSignalsCallbackStub() throws Throwable {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        IAuthTabCallback(new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1987590463, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, -1987590463);
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access100 + 103;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access100 + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = access100 + 37;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = getInterfaceDescriptor + 49;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access100 + 5;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access100 + 85;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ICustomTabsService_Parcel() {
        IAuthTabCallbackStub = new char[]{64988, 64989, 64961, 64924, 64981, 64960, 64925, 64967, 64963, 64983, 64991, 64979, 64926, 64987, 65065, 64977, 64905, 64986, 64982, 64978, 64990, 64985, 64976, 64980, 64984};
        IAuthTabCallback_Parcel = (char) 51244;
    }
}
